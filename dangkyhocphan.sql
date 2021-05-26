create database if not exists DANGKYHOCPHAN;
USE DANGKYHOCPHAN;

-- create table giaoVu
create table if not exists giaoVu(
maGV char,
tenGV varchar(40) not null,
namSinh date,
diaChi varchar(50),
sdt varchar(11),
constraint pk_giaoVu primary key (maGV)
);

-- create table sinhVien
create table if not exists sinhVien(
MSSV char not null,
hoTenSV varchar(40) not null,
hoTenCha varchar(40),
hoTenMe varchar(40),
namSinh date,
queQuan varchar(50),
choOHienTai varchar(50),
constraint pk_sinhVien primary key (MSSV)
);

-- create table monHoc
create table if not exists monHoc(
maMH char not null,
tenMH varchar(40) not null,
soTinChi int,
constraint pk_monHoc primary key (maMH)
);

-- create table hocKy
create table if not exists hocKy(

constraint pk_hocKy primary key (MSSV)
);

-- create table Lop
create table if not exists Lop(

constraint pk_Lop primary key (MSSV)
);

-- create table SV_Lop
create table if not exists SV_Lop(

constraint pk_SV_Lop primary key (MSSV)
);

-- create table dangKy
create table if not exists dangKy(

constraint pk_dangKy primary key (MSSV)
);

-- create table hocPhan
create table if not exists hocPhan(

constraint pk_hocPhan primary key (MSSV)
);

