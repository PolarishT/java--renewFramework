create table User
(
    id       int         not null comment '用户id',
    password varchar(20) not null comment '密码'
)
    comment '用户表' engine = innodb;