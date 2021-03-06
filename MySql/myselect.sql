Select `course`.`name`, teacher.`last name`, `teacher`.`first name`, student.`last name`, student.`first name` From `student course`
INNER Join `student` on `student`.`id` = `student course`.`id_student`
inner join `course` on `course`.`id` = `student course`.`id_course`
inner join `teacher` on `course`.`assignated teacher` = teacher.`id`
order by `student`.`last name`

select teacher.`last name`, `teacher`.`first name`, `schedule time`.`day`, `schedule time`.`start time`, `schedule time`.`end time` from `teacher`
inner join `course` on `course`.`assignated teacher` = `teacher`.`id`
inner join `schedule time` on `schedule time`.`assigned course` = `course`.`id`
order by `teacher`.`last name`
