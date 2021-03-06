USE [QLCuTru]
GO
/****** Object:  Table [dbo].[CONGDAN]    Script Date: 12/13/2018 7:14:38 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[CONGDAN](
	[CmndID] [int] NOT NULL,
	[Ten] [nvarchar](50) NULL,
	[Ho] [nvarchar](50) NULL,
	[NgaySinh] [date] NULL,
	[GioiTinh] [nvarchar](50) NULL,
	[NoiSinh] [nvarchar](50) NULL,
	[TTHonNhan] [nvarchar](50) NULL,
	[NgheNghiep] [nvarchar](50) NULL,
 CONSTRAINT [PK_CONGDAN] PRIMARY KEY CLUSTERED 
(
	[CmndID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HOKHAU]    Script Date: 12/13/2018 7:14:39 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HOKHAU](
	[HoKhauId] [int] NOT NULL,
	[Tinh_TP] [nvarchar](50) NULL,
	[Quan_Huyen] [nvarchar](50) NULL,
	[Phuong_Xa] [nvarchar](50) NULL,
	[To_Thon] [nvarchar](50) NULL,
	[ChuHoID] [int] NULL,
 CONSTRAINT [PK_HOKHAU] PRIMARY KEY CLUSTERED 
(
	[HoKhauId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[LichSuLuuTru]    Script Date: 12/13/2018 7:14:39 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LichSuLuuTru](
	[CmndID] [int] NOT NULL,
	[HoKhauID] [int] NOT NULL,
	[LoaiLuuTruID] [int] NULL,
	[ThoiGianBatDauLT] [date] NOT NULL,
	[ThoiGianKetThucLT] [date] NULL,
	[QuanHeVoiChuHo] [nvarchar](50) NULL,
 CONSTRAINT [PK_LichSuLuuTru] PRIMARY KEY CLUSTERED 
(
	[CmndID] ASC,
	[HoKhauID] ASC,
	[ThoiGianBatDauLT] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[LoaiLuuTru]    Script Date: 12/13/2018 7:14:39 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LoaiLuuTru](
	[LoaiLuuTruID] [int] NOT NULL,
	[TenLoaiLuuTru] [nvarchar](50) NULL,
 CONSTRAINT [PK_LoaiLuuTru] PRIMARY KEY CLUSTERED 
(
	[LoaiLuuTruID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
ALTER TABLE [dbo].[HOKHAU]  WITH CHECK ADD  CONSTRAINT [FK_HOKHAU_CONGDAN] FOREIGN KEY([ChuHoID])
REFERENCES [dbo].[CONGDAN] ([CmndID])
GO
ALTER TABLE [dbo].[HOKHAU] CHECK CONSTRAINT [FK_HOKHAU_CONGDAN]
GO
ALTER TABLE [dbo].[LichSuLuuTru]  WITH CHECK ADD  CONSTRAINT [FK_LichSuLuuTru_CONGDAN] FOREIGN KEY([CmndID])
REFERENCES [dbo].[CONGDAN] ([CmndID])
GO
ALTER TABLE [dbo].[LichSuLuuTru] CHECK CONSTRAINT [FK_LichSuLuuTru_CONGDAN]
GO
ALTER TABLE [dbo].[LichSuLuuTru]  WITH CHECK ADD  CONSTRAINT [FK_LichSuLuuTru_HOKHAU] FOREIGN KEY([HoKhauID])
REFERENCES [dbo].[HOKHAU] ([HoKhauId])
GO
ALTER TABLE [dbo].[LichSuLuuTru] CHECK CONSTRAINT [FK_LichSuLuuTru_HOKHAU]
GO
ALTER TABLE [dbo].[LichSuLuuTru]  WITH CHECK ADD  CONSTRAINT [FK_LichSuLuuTru_LoaiLuuTru] FOREIGN KEY([LoaiLuuTruID])
REFERENCES [dbo].[LoaiLuuTru] ([LoaiLuuTruID])
GO
ALTER TABLE [dbo].[LichSuLuuTru] CHECK CONSTRAINT [FK_LichSuLuuTru_LoaiLuuTru]
GO
