create sequence test_seq;

INSERT INTO club (club_id, name, creation_date) VALUES (1, 'CMD Baddy & Dinner', '2022-10-28');
INSERT INTO club (club_id, name, creation_date) VALUES (2, 'Hugo''s Badminton Club', '2020-05-12');
INSERT INTO club (club_id, name, creation_date) VALUES (3, 'NHC Drop-in', '2018-03-06');

INSERT INTO player (player_id, name, gender, main_hand) VALUES (1, 'Derek', 'Male', 'Right');
INSERT INTO player (player_id, name, gender, main_hand) VALUES (2, 'Lily', 'Female', 'Right');
INSERT INTO player (player_id, name, gender, main_hand) VALUES (3, 'Nick', 'Male', 'Right');
INSERT INTO player (player_id, name, gender, main_hand) VALUES (4, 'Aaron', 'Male', 'Left');
INSERT INTO player (player_id, name, gender, main_hand) VALUES (5, 'Desmond', 'Male', 'Right');
INSERT INTO player (player_id, name, gender, main_hand) VALUES (6, 'Benton', 'Male', 'Left');
INSERT INTO player (player_id, name, gender, main_hand) VALUES (7, 'Joy', 'Female', 'Left');
INSERT INTO player (player_id, name, gender, main_hand) VALUES (8, 'Martin', 'Male', 'Right');
INSERT INTO player (player_id, name, gender, main_hand) VALUES (9, 'Ashlee', 'Male', 'Left');
INSERT INTO player (player_id, name, gender, main_hand) VALUES (10, 'Taylor', 'Male', 'Right');

INSERT INTO roster (club_id, player_id, join_date) VALUES (1, 1, '2022-10-29');
INSERT INTO roster (club_id, player_id, join_date) VALUES (2, 5, '2021-07-16');
INSERT INTO roster (club_id, player_id, join_date) VALUES (3, 8, '2022-03-01');
INSERT INTO roster (club_id, player_id, join_date) VALUES (3, 10, '2019-04-09');