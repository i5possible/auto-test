DROP TABLE IF EXISTS product_info;
CREATE TABLE product_info (
  id           INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  project_name VARCHAR(30) COMMENT '项目名称',
  project_id   INT(11) COMMENT '项目编号',
  area_id      INT(11)                      DEFAULT 1
  COMMENT '区域编号',
  mail_list    VARCHAR(200) COMMENT '邮件列表',
  created_time TIMESTAMP                    DEFAULT CURRENT_TIMESTAMP
  COMMENT '创建时间',
  last_updated TIMESTAMP                    DEFAULT CURRENT_TIMESTAMP
  COMMENT '更新时间'
);

DROP TABLE IF EXISTS test_case_detail;
CREATE TABLE test_case_detail (
  id               INT(11) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  product_id       INT(11) COMMENT '产品ID',
  api_name         VARCHAR(50) COMMENT '接口名称',
  method           CHAR(8) COMMENT '请求方法',
  json_schema_path VARCHAR(200) COMMENT 'JSON 格式路径',
  header           VARCHAR(200) COMMENT '请求的头',
  query_param      VARCHAR(500) COMMENT '请求参数',
  path_param       VARCHAR(200) COMMENT '路径参数',
  body             VARCHAR(500) COMMENT '请求体',
  url              VARCHAR(200) COMMENT 'URL前缀',
  port             INT(11) COMMENT '请求端口',
  api_path         VARCHAR(200) COMMENT 'API路径',
  cached_info      VARCHAR(100) COMMENT '需要缓存起来给其它测试用例使用的数据',
  created_time     TIMESTAMP                    DEFAULT CURRENT_TIMESTAMP
  COMMENT '创建时间',
  last_updated     TIMESTAMP                    DEFAULT CURRENT_TIMESTAMP
  COMMENT '更新时间'
);

DROP TABLE IF EXISTS test_case_triggered;
CREATE TABLE test_case_triggered (
  id                  BIGINT(21) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  test_case_id        INT(11),
  start_time          DATETIME COMMENT '用例开始执行时间',
  end_time            DATETIME COMMENT '用例执行完成时间',
  state               TINYINT(3) COMMENT '用例执行状态，0表示未开始，1表示失败，2表示成功',
  msg                 VARCHAR(200) COMMENT '用例执行的相关信息',
  test_case_group     INT(10) COMMENT '用例分组',
  parent_test_case_id INT(10) COMMENT '父用例编号，一般用来获取 TOKEN',
  child_test_case_id  INT(10) COMMENT '子用例编号，用来解决链式请求的问题',
  is_primary          TINYINT(1) COMMENT '是否为主用例，测试用例只从主用例开始跑，然后去找父用例或者子用例'
);

DROP TABLE IF EXISTS test_case_group;
CREATE TABLE test_case_group (
  id           INT(10) PRIMARY KEY NOT NULL AUTO_INCREMENT,
  group_name   VARCHAR(20) COMMENT '组名称',
  group_desc   VARCHAR(200) COMMENT '组描述',
  created_time TIMESTAMP                    DEFAULT CURRENT_TIMESTAMP
  COMMENT '创建时间',
  last_updated TIMESTAMP                    DEFAULT CURRENT_TIMESTAMP
  COMMENT '更新时间'
);
