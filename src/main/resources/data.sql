INSERT INTO wspolnota(id, name)
VALUES
(1, 'wspolnota1' ),
(2, 'wspolnota2' );

INSERT INTO budynek(street, number, wspolnota_id)
VALUES
('Mickiewicza', '3', 1),
('Mickiewicza', '2', 1),
('Wroclawska', '14', 2);