INSERT INTO profesor (nombre) VALUES
('Ligia Marcela Majano'),
('Bladimir Campos'),
 ('Alexander  Campos'),
 ('Nelson  Belloso '),
  ('Leonardo Alfonso ');


INSERT INTO materia (nombre, id_profesor) VALUES
('Programación Orientada a Objetos', 1),
('Administración de Bases de Datos', 2),
('Redes de Comunicación', 3), ('Algebra', 4),
('Servidores en Plataformas Propietarias', 5);


INSERT INTO alumno (nombre, apellido) VALUES
('Christopher ', 'Jovel'),
('Odaly', 'Cruz'),
('Manuel', 'Luna'),
('Sofia', 'Menjivar'),
('Diego', 'Torre');

INSERT INTO alumno_materia (id_alumno, id_materia) VALUES
(1, 1), (2, 2), (3, 3), (4, 4), (5, 5);