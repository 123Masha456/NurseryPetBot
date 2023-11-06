-- liquibase formatted sql

-- changeset csa21472001:1
CREATE TABLE nurserycatdogbot1.photo
(
id bigint GENERATED BY DEFAULT AS IDENTITY NOT NULL,
file_path VARCHAR,
file_size bigint NOT NULL,
media_type VARCHAR,
data BYTEA,
report_id bigint REFERENCES nurserycatdogbot1.report (id),
PRIMARY KEY (id));