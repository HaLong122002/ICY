USE [ICY]
GO
/****** Object:  Table [dbo].[ChiTietHoaDon]    Script Date: 5/24/2022 6:20:12 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietHoaDon](
	[MaHD] [nvarchar](max) NULL,
	[MaSP] [nvarchar](max) NULL,
	[TenSP] [nvarchar](max) NULL,
	[SoLuong] [nvarchar](max) NULL,
	[GiaBan] [nvarchar](max) NULL,
	[ThanhTien] [nvarchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ChiTietPhieuNhap]    Script Date: 5/24/2022 6:20:13 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ChiTietPhieuNhap](
	[MaPN] [nvarchar](max) NULL,
	[MaSP] [nvarchar](max) NULL,
	[TenSP] [nvarchar](max) NULL,
	[SoLuong] [nvarchar](max) NULL,
	[DonGia] [nvarchar](max) NULL,
	[ThanhTien] [nvarchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[CTKhuyenMai]    Script Date: 5/24/2022 6:20:13 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CTKhuyenMai](
	[MACT] [nvarchar](50) NULL,
	[MAKM] [nvarchar](50) NULL,
	[MASP] [nvarchar](max) NULL,
	[NOIDUNG] [nvarchar](max) NULL,
	[NOIDUNGCT] [nvarchar](max) NULL,
	[GIAMGIA] [nvarchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 5/24/2022 6:20:13 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[MaHD] [nvarchar](max) NULL,
	[TenKH] [nvarchar](max) NULL,
	[TenNV] [nvarchar](max) NULL,
	[NgayLap] [nvarchar](max) NULL,
	[TongTien] [nvarchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhachHang]    Script Date: 5/24/2022 6:20:13 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhachHang](
	[MAKH] [nvarchar](50) NULL,
	[HoLot] [nvarchar](50) NULL,
	[Ten] [nvarchar](50) NULL,
	[SoDienThoai] [nvarchar](50) NULL,
	[SoNha] [nvarchar](max) NULL,
	[Duong] [nvarchar](max) NULL,
	[Phuong] [nvarchar](max) NULL,
	[Quan] [nvarchar](max) NULL,
	[ThanhPho] [nvarchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Khoa]    Script Date: 5/24/2022 6:20:13 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Khoa](
	[MSKhoa] [int] NOT NULL,
	[TenKhoa] [varchar](255) NULL,
 CONSTRAINT [PK_KHOA] PRIMARY KEY CLUSTERED 
(
	[MSKhoa] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[KhuyenMai]    Script Date: 5/24/2022 6:20:13 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[KhuyenMai](
	[MAKM] [nvarchar](max) NULL,
	[TEN] [nvarchar](max) NULL,
	[NGAYBD] [nvarchar](max) NULL,
	[THANGBD] [nvarchar](max) NULL,
	[NAMBD] [nvarchar](max) NULL,
	[NGAYKT] [nvarchar](max) NULL,
	[THANGKT] [nvarchar](max) NULL,
	[NAMKT] [nvarchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[LoaiSanPham]    Script Date: 5/24/2022 6:20:13 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiSanPham](
	[MaLoai] [nvarchar](max) NULL,
	[TenLoai] [nvarchar](max) NULL,
	[ThanhPhan] [nvarchar](max) NULL,
	[CongDung] [nvarchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Luong]    Script Date: 5/24/2022 6:20:13 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Luong](
	[MaNV] [nvarchar](max) NULL,
	[LuongCB] [nvarchar](max) NULL,
	[PhuCapAnUong] [nvarchar](max) NULL,
	[PhuCapXangXe] [nvarchar](max) NULL,
	[PhuCapDienThoai] [nvarchar](max) NULL,
	[Thuong] [nvarchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NguoiDung]    Script Date: 5/24/2022 6:20:13 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NguoiDung](
	[Ma] [nvarchar](max) NULL,
	[TaiKhoan] [nvarchar](max) NULL,
	[MatKhau] [nvarchar](max) NULL,
	[ChucVu] [nvarchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NhaCungCap]    Script Date: 5/24/2022 6:20:13 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NhaCungCap](
	[MaNCC] [nvarchar](max) NULL,
	[TenNCC] [nvarchar](max) NULL,
	[DiaChi] [nvarchar](max) NULL,
	[SDT] [nvarchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[NVIEN1]    Script Date: 5/24/2022 6:20:13 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[NVIEN1](
	[Ma] [nvarchar](max) NULL,
	[Ho] [nvarchar](max) NULL,
	[Ten] [nvarchar](max) NULL,
	[GioiTinh] [nvarchar](max) NULL,
	[ChucVu] [nvarchar](max) NULL,
	[NgaySinh] [nvarchar](max) NULL,
	[ThangSinh] [nvarchar](max) NULL,
	[NamSinh] [nvarchar](max) NULL,
	[DiaChi] [nvarchar](max) NULL,
	[SDT] [nvarchar](max) NULL,
	[Email] [nvarchar](max) NULL,
	[Luong] [nvarchar](max) NULL,
	[Anh] [nvarchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[PhieuNhap]    Script Date: 5/24/2022 6:20:13 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[PhieuNhap](
	[MaPN] [nvarchar](max) NULL,
	[MaNCC] [nvarchar](max) NULL,
	[MaNV] [nvarchar](max) NULL,
	[NgayLap] [nvarchar](max) NULL,
	[TongTien] [nvarchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[SanPham]    Script Date: 5/24/2022 6:20:13 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[SanPham](
	[MaSP] [nvarchar](max) NULL,
	[TenSP] [nvarchar](max) NULL,
	[MaLoaiSP] [nvarchar](max) NULL,
	[GiaBan] [nvarchar](max) NULL,
	[SoLuong] [nvarchar](max) NULL,
	[DonViTinh] [nvarchar](max) NULL,
	[HinhAnh] [nvarchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[ThamSoChung]    Script Date: 5/24/2022 6:20:13 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[ThamSoChung](
	[TenKhoHang] [nvarchar](max) NULL,
	[TenPhieuNhap] [nvarchar](max) NULL,
	[ThongTinSanPham] [nvarchar](max) NULL,
	[ThongTinPhieuNhap] [nvarchar](max) NULL,
	[Ma] [nvarchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
