drop database DANGKYHOCPHAN;
create database if not exists DANGKYHOCPHAN;
USE DANGKYHOCPHAN;

-- create table giaoVu
create table if not exists giaoVu(
maGV char(5),
tenGV varchar(40) not null,
namSinh date,
diaChi varchar(50),
sdt varchar(11),
constraint pk_giaoVu primary key (maGV)
)engine= InnoDB;

-- create table sinhVien
create table if not exists sinhVien(
MSSV char(10) not null,
hoTenSV varchar(40) not null,
hoTenCha varchar(40),
hoTenMe varchar(40),
namSinh date,
queQuan varchar(50),
choOHienTai varchar(50),
sdt char(10),
constraint pk_sinhVien primary key (MSSV)
)engine= InnoDB;

-- create table quanLyGiaoVu
create table if not exists quanLyGiaoVu(
ID int(3) auto_increment,
userName char(10),
password char(20) not null,
lichSu datetime,
constraint pk_quanLyGiaoVu primary key (ID)
)engine= InnoDB;
alter table quanLyGiaoVu auto_increment= 100;
-- create table quanLySinhVien
create table if not exists quanLySinhVien(
ID int(3) auto_increment,
userName char(10),
password char(20),
lichSu datetime,
constraint pk_quanLySinhVien primary key (ID)
)engine= InnoDB;
alter table quanLySinhVien auto_increment= 100;

/*
SELECT userName, password, max(lichSu)
FROM quanLyUser
GROUP BY userName;
*/

-- create table monHoc
create table if not exists monHoc(
maMH char(10) not null,
tenMH varchar(40) not null,
soTinChi int,
constraint pk_monHoc primary key (maMH)
)engine= InnoDB;

-- create table hocKy
create table if not exists hocKy(
tenHK varchar(5),
namHoc varchar(12),
ngayBD date,
ngayKT date,
hocKyHienTai bool, -- bien nay de xac dinh day co phai hoc ky hien tai hay khong
constraint pk_hocKy primary key (tenHK, namHoc)
)engine= InnoDB;

-- create table hocPhan
create table if not exists hocPhan(
maHP char(10),
hocKy varchar(5),
namHoc varchar(12),
maMH char(10),
giaoVienLT varchar(40),
Ca varchar(10),
Thu varchar(10),
Phong varchar(10),
soLuongToiDa int,
constraint pk_hocPhan primary key (maHP, hocKy, namHoc)
)engine= InnoDB;
--
-- create table Lop
create table if not exists Lop(
maLop char(10),
tenLop varchar(40),
tongSV int,
sinhVienNam int,
sinhVienNu int,
maHP char(10),
constraint pk_Lop primary key (maLop)
)engine= InnoDB;

/*-- create table SV_Lop
create table if not exists SV_Lop(

constraint pk_SV_Lop primary key (MSSV)
)engine= InnoDB;
*/

-- create table dangKy
create table if not exists dangKy(
MSSV char(10),
maHP char(10),
hocKy varchar(5),
namHoc varchar(12),
lichSuDangKy datetime,
constraint pk_dangKy primary key (MSSV, maHP, hocKy, namHoc)
)engine= InnoDB;

-------- tao khoa ngoai --------
alter table quanLyGiaoVu
add constraint fk_qlgv_gv foreign key (userName)
references giaoVu(maGV);

alter table quanLySinhVien
add constraint fk_qlsv_sv foreign key (userName)
references sinhVien(MSSV);

alter table hocPhan
add constraint fk_hp_mh foreign key (maMH)
references monHoc(maMH);
alter table hocPhan
add constraint fk_hp_hk foreign key (hocKy, namHoc)
references hocKy(tenHK, namHoc);

alter table Lop
add constraint fk_l_hp foreign key (maHP)
references hocPhan(maHP);

alter table dangKy
add constraint fk_dk_sv foreign key (MSSV)
references sinhVien(MSSV);
alter table dangKy
add constraint fk_dk_hp foreign key (maHP, hocKy, namHoc)
references hocPhan(maHP, hocKy, namHoc);

-------- nhap lieu --------
-- bang giaoVu
insert into giaoVu(maGV, tenGV, namSinh, diaChi, sdt)
	values ('GV001', 'Nguy???n Th??? H???ng', '1985-05-13', '135b Tr??n H??ng ?????o, Q1', '0856768580');
insert into giaoVu(maGV, tenGV, namSinh, diaChi, sdt)
	values ('GV002', 'Ho??ng V??n T???n', '1989-06-19', '227 Nguy???n V??n C???, ph?????ng 4, Q5', '0367688812');
    
-- bang sinhVien
insert into sinhVien(MSSV, hoTenSV, hoTenCha, hoTenMe, namSinh, queQuan, choOHienTai, sdt)
	values ('1712460', 'V?? C??ng Lu???n', 'V?? T???n D?????ng', 'Tr???n Th??? Thanh', '1999-02-05', 'huy???n B??nh S??n, t???nh Qu???ng Ng??i', '135b Tr??n H??ng ?????o, Q1, HCM', '0399776800');
insert into sinhVien(MSSV, hoTenSV, hoTenCha, hoTenMe, namSinh, queQuan, choOHienTai, sdt)
	values ('1612760', 'H??? Th??? Lu???n V??n', 'H??? V??n Anh', 'H??? Th??? Lan', '1998-02-09', 'huy???n Th??ng B??nh, t???nh Qu???ng Nam', '1 Hai B?? tr??ng, Q1, HCM', '0367768200');
insert into sinhVien(MSSV, hoTenSV, hoTenCha, hoTenMe, namSinh, queQuan, choOHienTai, sdt)
	values ('1712476', 'Nguy???n C??ng Th??nh', 'Nuy???n T???n Lanh', 'Ho??ng Th??? Th???o', '1999-07-05', 'huy???n Tr???ng Bom, t???nh ?????ng Nai', '16 Linh Trung, Q Th??? ?????c, HCM', '0399546800');
insert into sinhVien(MSSV, hoTenSV, hoTenCha, hoTenMe, namSinh, queQuan, choOHienTai, sdt)
	values ('1711470', '????? V??n Hu???n', '????? T???n H??ng', 'L??? Th??? C??c', '1999-12-05', 'th??nh ph??? M??? Tho, t???nh Ti???n Giang', '120 V?? V??n Ng??n, Q Th??? ?????c, HCM', '0973776800');
insert into sinhVien(MSSV, hoTenSV, hoTenCha, hoTenMe, namSinh, queQuan, choOHienTai, sdt)
	values ('18120690', 'V?? Th??? Thanh Loan', 'V?? T???n D???c', 'H??? Th??? Mai', '2000-02-10', 'qu???n 7, th??nh ph??? H??? Ch?? Minh', '17 Tr???n Xu??n So???n, Q7, HCM', '085676800');

-- bang quanLyGiaoVu (nhap tu dong bang trigger)
insert into quanLyGiaoVu(userName, password, lichSu) values('GV001', 'GV001', now());
insert into quanLyGiaoVu(userName, password, lichSu) values('GV002', 'GV001', now());
insert into quanLyGiaoVu(userName, password, lichSu) values('GV001', '12356', now());

-- bang quanLySinhVien (nhap tu dong bang trigger)


-- bang monHoc
insert into monHoc(maMH, tenMH, soTinChi)
	values ('MH001', 'C???u tr??c d??? li???u v?? gi???i thu???t', 4);
insert into monHoc(maMH, tenMH, soTinChi)
	values ('MH002', '???????ng l???i ?????ng C???ng s???n Vi???t Nam', 3);
insert into monHoc(maMH, tenMH, soTinChi)
	values ('MH003', 'L???p tr??nh ???ng d???ng java', 4);
insert into monHoc(maMH, tenMH, soTinChi)
	values ('MH004', 'Khoa h???c tr??i ?????t', 2);
    
-- bang hocKy
insert into hocKy(tenHK, namHoc, ngayBD, ngayKT, hocKyHienTai)
	values ('HK1', '2019-2020', '2019-08-25', '2020-01-31', 0);
insert into hocKy(tenHK, namHoc, ngayBD, ngayKT, hocKyHienTai)
	values ('HK2', '2019-2020', '2020-03-01', '2020-06-30', 0);
insert into hocKy(tenHK, namHoc, ngayBD, ngayKT, hocKyHienTai)
	values ('HK2', '2020-2021', '2021-03-02', '2021-07-02', 1);

-- bang hocPhan
insert into hocPhan(maHP, hocKy, namHoc, maMH, giaoVienLT, Ca, Thu, Phong, soLuongToiDa)
	values ('HP001', 'HK2', '2020-2021', 'MH003', 'H??? Tu???n Thanh', 'Ca 3', 'Th??? 4', 'F202', 100);
insert into hocPhan(maHP, hocKy, namHoc, maMH, giaoVienLT, Ca, Thu, Phong, soLuongToiDa)
	values ('HP002', 'HK1', '2019-2020', 'MH001', 'V??n Ch?? Nam','Ca 1', 'Th??? 2', 'G202', 80);
insert into hocPhan(maHP, hocKy, namHoc, maMH, giaoVienLT, Ca, Thu, Phong, soLuongToiDa)
	values ('HP003', 'HK2', '2020-2021', 'MH002', 'V?? T???n H??ng', 'Ca 1', 'Th??? 3', 'G102', 120);
insert into hocPhan(maHP, hocKy, namHoc, maMH, giaoVienLT, Ca, Thu, Phong, soLuongToiDa)
	values ('HP004', 'HK2', '2020-2021', 'MH004', 'V?? Th??? Anh Th??','Ca 3', 'Th??? 3', 'E205', 100);

/*
-- bang dangKy
insert into dangKy(MSSV, maHP, hocKy, namHoc, lichSuDangKy)
	values ('', '', '', '', '');
insert into dangKy(MSSV, maHP, hocKy, namHoc, lichSuDangKy)
	values ('', '', '', '', '');
insert into dangKy(MSSV, maHP, hocKy, namHoc, lichSuDangKy)
	values ('', '', '', '', '');
insert into dangKy(MSSV, maHP, hocKy, namHoc, lichSuDangKy)
	values ('', '', '', '', '');
insert into dangKy(MSSV, maHP, hocKy, namHoc, lichSuDangKy)
	values ('', '', '', '', '');
insert into dangKy(MSSV, maHP, hocKy, namHoc, lichSuDangKy)
	values ('', '', '', '', '');
insert into dangKy(MSSV, maHP, hocKy, namHoc, lichSuDangKy)
	values ('', '', '', '', '');
    
-- bang Lop
insert into Lop(maLop, tenLop, tongSV, sinhVienNam, sinhVienNu, maHP)
	values ('L001', 'CQ_17_21', null, null, null, ''); -- TONG SINH VIEN, SV NAM, SV NU INSERT TU DONG BANG TRIGGER
insert into Lop(maLop, tenLop, tongSV, sinhVienNam, sinhVienNu, maHP)
	values ('L002', 'CQ_18_11', null, null, null, ''); -- TONG SINH VIEN, SV NAM, SV NU INSERT TU DONG BANG TRIGGER
insert into Lop(maLop, tenLop, tongSV, sinhVienNam, sinhVienNu, maHP)
	values ('L003', 'CQ_19_11',  null, null, null, ''); -- TONG SINH VIEN, SV NAM, SV NU INSERT TU DONG BANG TRIGGER
*/


-------- truy van --------
select* from giaoVu;
select* from sinhVien;
select* from quanLyGiaoVu;

-- select password moi nh???t c???a 1 username --
select username, password
from quanLyGiaoVu
where username= 'GV001'
and lichsu= (select max(lichsu) 
			from quanLyGiaoVu 
			where username= 'GV001');
