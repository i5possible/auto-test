SELECT concat('drop table ', table_name, ';')
FROM information_schema.tables
WHERE TABLE_SCHEMA = 'auto-test';

DROP TABLE product_info;
DROP TABLE schema_version;
DROP TABLE test_case_detail;
DROP TABLE test_case_group;
DROP TABLE test_case_triggered;