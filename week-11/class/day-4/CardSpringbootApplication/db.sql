CREATE DATABASE CardGame;

USE CardGame;

-- Create the Card table

CREATE TABLE Card (
                      id INT AUTO_INCREMENT PRIMARY KEY,
                      name VARCHAR(50),
                      suit VARCHAR(50),
                      value INT
);

-- Insert a full deck of cards
-- Hearts
INSERT INTO Card (name, suit, value) VALUES ('Ace', 'Hearts', 11);
INSERT INTO Card (name, suit, value) VALUES ('2', 'Hearts', 2);
INSERT INTO Card (name, suit, value) VALUES ('3', 'Hearts', 3);
INSERT INTO Card (name, suit, value) VALUES ('4', 'Hearts', 4);
INSERT INTO Card (name, suit, value) VALUES ('5', 'Hearts', 5);
INSERT INTO Card (name, suit, value) VALUES ('6', 'Hearts', 6);
INSERT INTO Card (name, suit, value) VALUES ('7', 'Hearts', 7);
INSERT INTO Card (name, suit, value) VALUES ('8', 'Hearts', 8);
INSERT INTO Card (name, suit, value) VALUES ('9', 'Hearts', 9);
INSERT INTO Card (name, suit, value) VALUES ('10', 'Hearts', 10);
INSERT INTO Card (name, suit, value) VALUES ('Jack', 'Hearts', 10);
INSERT INTO Card (name, suit, value) VALUES ('Queen', 'Hearts', 10);
INSERT INTO Card (name, suit, value) VALUES ('King', 'Hearts', 10);

-- Diamonds
INSERT INTO Card (name, suit, value) VALUES ('Ace', 'Diamonds', 11);
INSERT INTO Card (name, suit, value) VALUES ('2', 'Diamonds', 2);
INSERT INTO Card (name, suit, value) VALUES ('3', 'Diamonds', 3);
INSERT INTO Card (name, suit, value) VALUES ('4', 'Diamonds', 4);
INSERT INTO Card (name, suit, value) VALUES ('5', 'Diamonds', 5);
INSERT INTO Card (name, suit, value) VALUES ('6', 'Diamonds', 6);
INSERT INTO Card (name, suit, value) VALUES ('7', 'Diamonds', 7);
INSERT INTO Card (name, suit, value) VALUES ('8', 'Diamonds', 8);
INSERT INTO Card (name, suit, value) VALUES ('9', 'Diamonds', 9);
INSERT INTO Card (name, suit, value) VALUES ('10', 'Diamonds', 10);
INSERT INTO Card (name, suit, value) VALUES ('Jack', 'Diamonds', 10);
INSERT INTO Card (name, suit, value) VALUES ('Queen', 'Diamonds', 10);
INSERT INTO Card (name, suit, value) VALUES ('King', 'Diamonds', 10);

-- Clubs
INSERT INTO Card (name, suit, value) VALUES ('Ace', 'Clubs', 11);
INSERT INTO Card (name, suit, value) VALUES ('2', 'Clubs', 2);
INSERT INTO Card (name, suit, value) VALUES ('3', 'Clubs', 3);
INSERT INTO Card (name, suit, value) VALUES ('4', 'Clubs', 4);
INSERT INTO Card (name, suit, value) VALUES ('5', 'Clubs', 5);
INSERT INTO Card (name, suit, value) VALUES ('6', 'Clubs', 6);
INSERT INTO Card (name, suit, value) VALUES ('7', 'Clubs', 7);
INSERT INTO Card (name, suit, value) VALUES ('8', 'Clubs', 8);
INSERT INTO Card (name, suit, value) VALUES ('9', 'Clubs', 9);
INSERT INTO Card (name, suit, value) VALUES ('10', 'Clubs', 10);
INSERT INTO Card (name, suit, value) VALUES ('Jack', 'Clubs', 10);
INSERT INTO Card (name, suit, value) VALUES ('Queen', 'Clubs', 10);
INSERT INTO Card (name, suit, value) VALUES ('King', 'Clubs', 10);

-- Spades
INSERT INTO Card (name, suit, value) VALUES ('Ace', 'Spades', 11);
INSERT INTO Card (name, suit, value) VALUES ('2', 'Spades', 2);
INSERT INTO Card (name, suit, value) VALUES ('3', 'Spades', 3);
INSERT INTO Card (name, suit, value) VALUES ('4', 'Spades', 4);
INSERT INTO Card (name, suit, value) VALUES ('5', 'Spades', 5);
INSERT INTO Card (name, suit, value) VALUES ('6', 'Spades', 6);
INSERT INTO Card (name, suit, value) VALUES ('7', 'Spades', 7);
INSERT INTO Card (name, suit, value) VALUES ('8', 'Spades', 8);
INSERT INTO Card (name, suit, value) VALUES ('9', 'Spades', 9);
INSERT INTO Card (name, suit, value) VALUES ('10', 'Spades', 10);
INSERT INTO Card (name, suit, value) VALUES ('Jack', 'Spades', 10);
INSERT INTO Card (name, suit, value) VALUES ('Queen', 'Spades', 10);
INSERT INTO Card (name, suit, value) VALUES ('King', 'Spades', 10);
