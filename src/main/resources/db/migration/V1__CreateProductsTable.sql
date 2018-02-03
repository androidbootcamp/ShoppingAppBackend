/* Single line comment */
create table products
(
    id SERIAL NOT NULL PRIMARY KEY,
    name VARCHAR(254) NOT NULL,
    description VARCHAR(1000) NOT NULL,
    image_url VARCHAR(254) NOT NULL,
    image_thumbnail_url VARCHAR(254) NOT NULL
);
