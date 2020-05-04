INSERT INTO usuarios (id,username, password, estado) VALUES (usuarios_seq.NextVal,'estudiante','$2a$10$C3Uln5uqnzx/GswADURJGOIdBqYrly9731fnwKDaUdBkt/M3qvtLq',1);
INSERT INTO usuarios (id,username, password, estado) VALUES (usuarios_seq.NextVal,'admin','$2a$10$RmdEsvEfhI7Rcm9f/uZXPebZVCcPC7ZXZwV51efAvMAp1rIaRAfPK',1);

INSERT INTO roles (id, nombre) VALUES (roles_seq.NextVal,'ROLE_ADMIN');
INSERT INTO roles (id, nombre) VALUES (roles_seq.NextVal,'ROLE_DOCENTE');
INSERT INTO roles (id, nombre) VALUES (roles_seq.NextVal,'ROLE_ESTUDIANTE');

INSERT INTO usuarios_roles (usuario_id, rol_id) VALUES (1, 1);
INSERT INTO usuarios_roles (usuario_id, rol_id) VALUES (2, 2);
INSERT INTO usuarios_roles (usuario_id, rol_id) VALUES (2, 1);
INSERT INTO usuarios_roles (usuario_id, rol_id) VALUES (2, 3);

INSERT INTO cursos (id, nombre, descripcion) VALUES(cursos_seq.NextVal,'Java', 'Curso de Java desde cero.');
INSERT INTO cursos (id, nombre, descripcion) VALUES(cursos_seq.NextVal,'C++', 'Curso de C++ desde cero.');
INSERT INTO cursos (id, nombre, descripcion) VALUES(cursos_seq.NextVal,'C#', 'Curso de C# desde cero.');
INSERT INTO cursos (id, nombre, descripcion) VALUES(cursos_seq.NextVal,'Java Persistence', 'Curso de Java con persisetncia desce cero.');
INSERT INTO cursos (id, nombre, descripcion) VALUES(cursos_seq.NextVal,'SpringBoot', 'Curso de Spring desde cero.');
INSERT INTO cursos (id, nombre, descripcion) VALUES(cursos_seq.NextVal,'Angular', 'Curso de Angular desde cero.');
INSERT INTO cursos (id, nombre, descripcion) VALUES(cursos_seq.NextVal,'HTML', 'Curso de HTML desde cero.');
INSERT INTO cursos (id, nombre, descripcion) VALUES(cursos_seq.NextVal,'CSS', 'Curso de CSS desde cero.');
INSERT INTO cursos (id, nombre, descripcion) VALUES(cursos_seq.NextVal,'Bootstrap', 'Curso de Bootstrap desde cero.');
INSERT INTO cursos (id, nombre, descripcion) VALUES(cursos_seq.NextVal,'Semantic UI', 'Curso de Semantic UI desde cero.');
INSERT INTO cursos (id, nombre, descripcion) VALUES(cursos_seq.NextVal,'SQL', 'Curso de SQL desde cero.');
INSERT INTO cursos (id, nombre, descripcion) VALUES(cursos_seq.NextVal,'Redes', 'Curso de redes computacionales desde cero.');