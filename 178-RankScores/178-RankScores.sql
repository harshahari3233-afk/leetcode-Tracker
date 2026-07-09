-- Last updated: 7/9/2026, 3:10:09 PM
select score,
(
    select count(distinct score )
    from Scores
    where score>=s.score 
) as 'rank'
    from Scores s
    order by score desc;

