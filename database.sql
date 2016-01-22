CREATE TABLE posts (
    id INT(11) AUTO_INCREMENT,
    title VARCHAR(50),
    content VARCHAR(255),
    author_id INT(11),
    PRIMARY KEY(id)
);

CREATE TABLE comments (
	id INT(11) AUTO_INCREMENT,
	post_id INT(11),
	author_id INT(11),
	content VARCHAR(255),
	PRIMARY KEY(id)
);

CREATE TABLE authors (
    id INT(11) AUTO_INCREMENT,
    name VARCHAR(150),
    role_id INT(11),
    PRIMARY KEY(id)
);

CREATE TABLE roles (
    id INT(11) AUTO_INCREMENT,
    role_name VARCHAR(50),
    PRIMARY KEY(id)
);

CREATE TABLE categories (
    id INT(11) AUTO_INCREMENT,
    category_name VARCHAR(50),
    PRIMARY KEY(id)
);

CREATE TABLE category_post (
	id_category INT(11),
	id_post INT (11)
);