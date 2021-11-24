INSERT INTO tb_user (name, email, password) VALUES ('Carlos Souza', 'csoza@gmail.com', '$2a$10$f3ebr6N0qYUmywj48r10h.B/l.E5PQ5HBfhnSBEI5/NtJMahIWLEe');
INSERT INTO tb_user (name, email, password) VALUES ('Paulo lima', 'lima@gmail.com', '$2a$10$6rYKIhG1ShIA5Z.6sxntJ.dIhj3E9gCc9mrb8c4QeFCBLj1n/ezOW');

INSERT INTO tb_role (role_name) VALUES ('ROLE_GERENTE');
INSERT INTO tb_role (role_name) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);