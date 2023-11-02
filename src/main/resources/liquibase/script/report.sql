-- liquibase formatted sql

-- changeset Maria:5
CREATE TABLE nurserycatdogbot.report
(
id bigint GENERATED BY DEFAULT AS IDENTITY NOT NULL,
chat_id bigint,
food text NOT NULL,
feel text NOT NULL,
behavior text NOT NULL,
date_time timestamp without time zone not null,
user_id bigint REFERENCES nurserycatdogbot.users_contact_information (id)

);