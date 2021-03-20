package mysql;

public class weekone {

	/*1) SELECT * FROM employees
	 * 	 WHERE birth_date < '1965-01-01';
	 */
	
	/*2) SELECT * FROM employees
	 *   WHERE gender = 'F' AND hire_date < '1995-01-01';
	 */
	
	/*3) SELECT first_name, last_name FROM employees
	 *   WHERE last_name LIKE 'F%'
	 *   LIMIT 50;
	 */
	
	/*4) INSERT INTO employees VALUES(100, '1987-09-20', 'Michael', 'Minor', 'M', '2021-03-19');
	 *   INSERT INTO employees VALUES(101, '1986-11-08', 'Pear', 'Ontida', 'F', '2021-03-19');
	 *   INSERT INTO employees VALUES(102, '1989-05-10', 'Cash', 'Man', 'M', '2021-03-19');
	 */
	
	/*5) UPDATE employees
	 *   SET first_name = 'Bob'
	 *   WHERE emp_no = 10023;
	 */
	
	/*6) UPDATE employees
	 *   SET hire_date = '2002-01-01'
	 *   WHERE first_name LIKE 'P%' OR last_name LIKE 'P%';
	 */
	
	/*7) DELETE FROM employees WHERE emp_no < 10000;
	 */
	
	/*8) DELETE FROM employees
	 *   WHERE emp_no = 10048 OR emp_no = 10099 OR emp_no = 10234 OR emp_no = 20089;
	 */
}
