# Hello There! 👋

For today my task is Connect VoltDB instance that you have created in the VOLTDB -EX-03 exercise from DBeaver. In order to connect VoltDB from DBeaver, you should create a new database driver ( Database → Driver Manager menu ) and download VoltDB client jar from maven repo. Create sample table and insert some rows as shown below. Please also connect VoltDB UI from 55004 port ( you can inspect port mappings via docker ps command. )
Note: If you did not get a cloud machine previously, you may simply run it on your local machine.

Sample Table Creation, and Row Insertion:
create table mth3902 (
id bigint not null,
start_date_epoch bigint,
create_user varchar(32),
constraint mth3902_pk primary key(id)
);
partition table mth3902 on column id;
--- dr table mth3902;
insert into mth3902 ( id, start_date_epoch, create_user ) values ( 1, 1698295044, 'MENNAN');
insert into mth3902 ( id, start_date_epoch, create_user ) values ( 2, 1698295088, 'ERKUT');
select * from mth3902 limit 1;


## ScreenShots
![Screenshot_43](https://github.com/user-attachments/assets/2c9a977e-4c0d-49d6-af99-585649f1537a)


![Screenshot_39](https://github.com/user-attachments/assets/474593f1-1167-453f-ba6c-30fcded8af5a)


![Screenshot_41](https://github.com/user-attachments/assets/9329f322-6ac9-408a-81b2-e78ee3933fe2)


![Screenshot_42](https://github.com/user-attachments/assets/b7cf6fc5-9fae-4258-a0f0-866d2e23e520)


![Screenshot_40](https://github.com/user-attachments/assets/37937e64-8773-43ea-927c-3079d5ddf836)
