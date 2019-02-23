CREATE TABLE `ml_user` (
  `id` bigint(20) unsigned not null auto_increment comment '主键，自增',
  `name` varchar(64) not null comment '姓名',
  `nick` varchar(64) default null comment '昵称',
  `avatar` bigint(20) default null comment '头像',
  `phone` varchar(32) default null comment '电话',
  `desc` varchar(1024) default null comment '简介',
  `email` varchar(128) default null comment '邮箱',
  `password` varchar(128) not null comment '',
  `gmt_create` datetime not null comment '创建时间',
  `gmt_modified` datetime not null comment '最后修改时间',
  `creator` varchar(64) not null comment '创建人',
  `state` varchar(32) not null comment '状态',

  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_name` (`name`),
  KEY `idx_name` (`name`),
  KEY `idx_nick` (`nick`),
  KEY `idx_phone` (`phone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 comment='用户表'
;

CREATE TABLE `ml_img` (
  `id` bigint(20) unsigned not null auto_increment comment '主键，自增',
  `type` int(4) not null comment '类型，1:本地，2:网络',
  `url` varchar(256) not null comment '地址',
  `gmt_create` datetime not null comment '创建时间',
  `gmt_modified` datetime not null comment '最后修改时间',
  `creator` varchar(64) not null comment '创建人',
  `state` varchar(32) not null comment '状态',

  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 comment='三方登陆信息表'
;

CREATE TABLE `ml_third_platform_info` (
  `id` bigint(20) unsigned not null auto_increment comment '主键，自增',
  `type` varchar(32) not null comment '类型，可取值：qq、wx',
  `open_id` varchar(256) not null comment '第三方唯一标示',
  `user_id` bigint(20) unsigned not null comment '用户id',
  `gmt_create` datetime not null comment '创建时间',
  `gmt_modified` datetime not null comment '最后修改时间',
  `creator` varchar(64) not null comment '创建人',
  `state` varchar(32) not null comment '状态',

  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_type_openid` (`type`, `open_id`),
  KEY `idx_userid` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 comment='三方登陆信息表'
;

CREATE TABLE `ml_category` (
  `id` bigint(20) unsigned not null auto_increment comment '主键，自增',
  `name` varchar(128) not null comment '类目名称',
  `gmt_create` datetime not null comment '创建时间',
  `gmt_modified` datetime not null comment '最后修改时间',
  `creator` varchar(64) not null comment '创建人',
  `state` varchar(32) not null comment '状态',

  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 comment='类目'
;

CREATE TABLE `ml_tag` (
  `id` bigint(20) unsigned not null auto_increment comment '主键，自增',
  `name` varchar(128) not null comment '标签名称',
  `gmt_create` datetime not null comment '创建时间',
  `gmt_modified` datetime not null comment '最后修改时间',
  `creator` varchar(64) not null comment '创建人',
  `state` varchar(32) not null comment '状态',

  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 comment='标签'
;

CREATE TABLE `ml_article` (
  `id` bigint(20) unsigned not null auto_increment comment '主键，自增',
  `name` varchar(256) not null comment '标题',
  `desc` varchar(1024) default null comment '简介',
  `content` text default null comment '文章内容',
  `tag_ids` varchar(256) default null comment '标签id，逗号分割',
  `category_id` bigint(20) unsigned null comment '分类id',
  `user_id` bigint(20) unsigned not null comment '用户id',
  `is_private` int(8) default 1 comment '是否私有，1:私有，2:公开',
  `gmt_create` datetime not null comment '创建时间',
  `gmt_modified` datetime not null comment '最后修改时间',
  `creator` varchar(64) not null comment '创建人',
  `state` varchar(32) not null comment '状态',

  PRIMARY KEY (`id`),
  KEY `idx_name` (`name`),
  KEY `idx_userid` (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 comment='文章'
;

CREATE TABLE `ml_hall` (
  `id` bigint(20) unsigned not null auto_increment comment '主键，自增',
  `name` varchar(256) not null comment '标题',
  `type` int(4) default null comment '类型，1:大厅',
  `article_id` bigint(20) unsigned not null comment '文章id',
  `user_id` bigint(20) unsigned not null comment '用户id',
  `is_private` int(8) default 1 comment '是否私有，1:私有，2:公开',
  `gmt_create` datetime not null comment '创建时间',
  `gmt_modified` datetime not null comment '最后修改时间',
  `creator` varchar(64) not null comment '创建人',
  `state` varchar(32) not null comment '状态',

  PRIMARY KEY (`id`),
  KEY `idx_name` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 comment='大厅'
;

CREATE TABLE `ml_share_hist` (
  `id` bigint(20) unsigned not null auto_increment comment '主键，自增',
  `from` bigint(20) unsigned not null comment '分享人',
  `to` bigint(20) unsigned not null comment '接受人',
  `article_id` bigint(20) unsigned not null comment '文章id',
  `gmt_create` datetime not null comment '创建时间',
  `gmt_modified` datetime not null comment '最后修改时间',
  `creator` varchar(64) not null comment '创建人',
  `state` varchar(32) not null comment '状态',

  PRIMARY KEY (`id`),
  KEY `idx_from` (`from`),
  KEY `idx_to` (`to`),
  KEY `idx_articleid` (`article_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 comment='分享历史'
;
