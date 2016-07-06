insert into app_role (role) values ('admin');
insert into app_role (role) values ('user');
insert into app_role (role) values ('guest');

select id from app_role where role = 'admin';
select id from app_role where role = 'user';
select id from app_role where role = 'guest';

insert into app_user (name, state, city, role) values ('Michael Boren', 'Memphis', 'Tennessee', 1);
insert into app_user (name, state, city, role) values ('Dillon Callis', 'Memphis', 'Tennessee', 2);
insert into app_user (name, state, city, role) values ('Dave Chris', 'Anchorage', 'Alaska', 3);

insert into app_group (name, owner) values ('CoolGroup', 2);
insert into group_users (groups_id, members_id) values (1, 2);
insert into group_users (groups_id, members_id) values (1, 3);


