package icy;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;


/**
 *
 * @author Cyka
 */
public class SQLConnect {
    String Host="";
    String UserName="";
    String Password="";
    String DataBase="";
    Connection connect=null;
    Statement statement=null;
    ResultSet result =null;

    public SQLConnect(String Host,String DataBase,String UserName,String Password){
        this.Host=Host;
        this.DataBase=DataBase;
        this.UserName=UserName;
        this.Password=Password;
    }
    protected void drivertest () throws Exception{
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        }
        catch(java.lang.ClassNotFoundException e){
            throw new Exception("SQLServer JDBC Driver not found");
        }
    }
    protected Connection getConnect() throws Exception{
        if(this.connect==null){
            drivertest();
            String url ="jdbc:sqlserver://DESKTOP-LGV4DA9\\MAYAO:1433;" +
                        "databaseName=ICY;integratedSecurity=true;" +
                        "encrypt=true;trustServerCertificate=true" ;
            try{
                this.connect=DriverManager.getConnection(url, this.UserName, this.Password);
            }
            catch(java.sql.SQLException e){
                throw new Exception("khong the ket noi den database");
            }
        }
        return this.connect;
    }
    protected Statement getStatement() throws Exception{
        if(this.statement ==null){
            this.statement=(Statement) this.getConnect().createStatement();
        
        }
        return this.statement;
    }
    public ResultSet executeQuery(String Query) throws Exception{
        try{
            this.result=getStatement().executeQuery(Query);
        }
        catch(Exception e){
            throw new Exception("error: "+e.getMessage()+"---");
        }
        return this.result;
    }
    public int executeUpdate(String Query) throws Exception{
        int res=Integer.MIN_VALUE;
        try{
            res=getStatement().executeUpdate(Query);
        }
        catch(Exception e){
            throw new Exception("error: "+e.getMessage());
           
        }
         finally{
                    this.Close();
                    }
        return res;
     }
    public void Close() throws SQLException{
        if(this.result!=null && !this.result.isClosed()){
            this.result.close();
            this.result=null;
        }
        if(this.statement!=null && !this.statement.isClosed()){
            this.statement.close();
            this.statement=null;
        }
        if(this.connect!=null && !this.connect.isClosed()){
            this.connect.close();
            this.connect=null;
        }
    }
    public String getHost() {
        return Host;
    }

    public void setHost(String Host) {
        this.Host = Host;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getDataBase() {
        return DataBase;
    }

    public void setDataBase(String DataBase) {
        this.DataBase = DataBase;
    }

    public void setConnect(Connection connect) {
        this.connect = connect;
    }

   

    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    public ResultSet getResult() {
        return result;
    }

    public void setResult(ResultSet result) {
        this.result = result;
    }  
}
