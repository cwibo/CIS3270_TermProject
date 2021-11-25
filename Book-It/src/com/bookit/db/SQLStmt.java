package com.bookit.db;

public class SQLStmt {
	
	// Query Statements
	public static final String LOGIN = "SELECT COUNT(*) Cnt FROM LOGINS WHERE Username = '?' AND Password = '?';";
	
	public static final String ISADMIN = "SELECT IsAdmin FROM LOGINS WHERE Username = '?' AND IsAdmin = TRUE;";
	
	public static final String PASSWORD = "SELECT Password FROM LOGINS WHERE Username = '?' AND SecurityAnswer = '?';";
	
	public static final String FLIGHT = "SELECT * FROM FLIGHTS WHERE Origination = '?' AND Destination = '?' AND DepartureDate = '?';";
	
	public static final String USER = "SELECT REPLACE(SSN, ',', '') SSN,FirstName,LastName,Address,City,State,Zip,Email,Username FROM USERS WHERE SSN = ?;";
	
	public static final String BOOKINGS = "SELECT Airline,FlightNumber,Origination,Destination,DepartureDate,DepartureTime,ArrivalDate,ArrivalTime "
			+ "FROM FLIGHTS f JOIN BOOKINGS b ON f.FlightID = b.FlightID WHERE b.SSN = ?;";
	
	
	// Insert Statements
	public static final String NEWLOGIN = "INSERT INTO LOGINS (Username,Password,SecurityQuestion,SecurityAnswer,IsAdmin)"
			+ " VALUES ('?',\"?\",\"?\",\"?\",?);";
	
	public static final String NEWUSER = "INSERT INTO USERS (SSN,FirstName,LastName,Address,City,State,Zip,Email,Username)"
			+ " VALUES (?,\"?\",\"?\",'?','?','?',?,'?','?');";
	
	public static final String NEWFLIGHT = "INSERT INTO FLIGHTS (Airline,FlightNumber,Origination,Destination,DepartureDate,DepartureTime,ArrivalDate,ArrivalTime,Price,TotalSeats)"
			+ " VALUES ('?',?,'?','?','?','?','?','?',?,?);";
	
	public static final String NEWBOOKING = "INSERT INTO BOOKINGS (SSN,FlightID,NameOnCard,CreditCardNumber,ExpirationDate,CVV)"
			+ " VALUES (?,?,'?',?,'?',?);";
	



}