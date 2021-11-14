    DROP TABLE IF EXISTS room;

    CREATE TABLE room (
    id INT AUTO_INCREMENT  PRIMARY KEY,
    room_name VARCHAR(50) NOT NULL,
    room_price INT(8) NOT NULL,
    room_description VARCHAR(255)
    );

