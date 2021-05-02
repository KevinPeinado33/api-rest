INSERT INTO products (name, price, enabled, category_id) VALUE ('Lapicero Mongol', 2, 1, 5);
INSERT INTO products (name, price, enabled, category_id) VALUE ('Laptop Dell XPS 13', 2000, 1, 1);
INSERT INTO products (name, price, enabled, category_id) VALUE ('Monitor Lg Kbm27', 800, 1, 1);
INSERT INTO products (name, price, enabled, category_id) VALUE ('Teclado redragon', 270, 1,  1);
INSERT INTO products (name, price, enabled, category_id) VALUE ('Mouse redragon model XS', 150, 1, 1);
INSERT INTO products (name, price, enabled, category_id) VALUE ('Cocina maben', 650, 1, 4);
INSERT INTO products (name, price, enabled, category_id) VALUE ('Pantalon oversize marca gucci', 3000, 1, 2);


INSERT INTO users (username, password, name, last_name, email, enabled) VALUES ('kevin', '$2a$10$u4R8/3C8if5ZD7YbSyleQ.GZA.xkZ1oTIVCGIDhI4aEjO5z2wAfkC', 'Kevin Raul', 'Peinado Leiva', 'kevinpeinado@upeu.edu.pe', 1);
INSERT INTO users (username, password, name, last_name, email, enabled) VALUES ('pedrito', '$2a$10$b840v4DlUhs11c6Uh7JwKeNKRnO3cZDQcbJ3EPh1KHTzq3PrZ8vk2', 'Dayana Xiomara', 'Peinado Leiva', 'dayanapeinado@upeu.edu.pe', 1);

INSERT INTO roles (name) VALUES ('ROLE_USER');
INSERT INTO roles (name) VALUES ('ROLE_ADMIN');

INSERT INTO users_roles (user_id, role_id) VALUES (1,1);
INSERT INTO users_roles (user_id, role_id) VALUES (2,2);
INSERT INTO users_roles (user_id, role_id) VALUES (2,1);

INSERT INTO categorys (name, stock) VALUES ('Tecnologia', 4);
INSERT INTO categorys (name, stock) VALUES ('Ropa / Moda', 3);
INSERT INTO categorys (name, stock) VALUES ('Hogar', 0);
INSERT INTO categorys (name, stock) VALUES ('Cocina', 2);
INSERT INTO categorys (name, stock) VALUES ('Utiles', 5);

INSERT INTO products (name, price, enabled, category_id) VALUE ('Lapicero Mongol', 2, 1, 5);
INSERT INTO products (name, price, enabled, category_id) VALUE ('Laptop Dell XPS 13', 2000, 1, 1);

INSERT INTO publications (title, description, type, enabled, user_id, product_id) VALUES  ('Se intercambia laptop de 2 meses de uso.', 'Estoy intercambiando la laptop por problemas de que quiero encontrar algo mejor que la que tengo.', 'intercambio', 1, 2);
INSERT INTO publications (title, description, type, enabled, user_id, product_id) VALUES  ('Estoy comenzando en el mundo del cambio ayuden..!!!', 'Quiero cambiar este lapiz por un ecendedor o etc.', 'intercambio', 2, 1);