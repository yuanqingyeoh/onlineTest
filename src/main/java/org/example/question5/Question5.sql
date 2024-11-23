SELECT p.name, s.sport, s.score
FROM scores as s
         LEFT JOIN players as p
                   ON p.player_no = s.player_no