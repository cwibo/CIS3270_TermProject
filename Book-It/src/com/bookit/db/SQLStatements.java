package com.bookit.db;

public class SQLStatements {
		// Select Statements
		public static final String LOGIN = "SELECT l.Username, u.SSN, u.FirstName, u.LastName FROM cis3270bookit.LOGINS l inner join cis3270bookit.USERS u on l.Username = u.Username where l.Username = ? and l.Password = ?;";
		public static final String GETPASSWORD = "SELECT Password FROM cis3270bookit.LOGINS where Username = ? and SecurityAnswer = ?;";
		public static final String SEARCHFLIGHT = "SELECT * FROM cis3270bookit.FLIGHTS where Origination = ? and Destination = ? and DepartureDate = ?;";
		public static final String SEARCHGOINGTO = "SELECT DISTINCT(Destination) FROM `cis3270bookit`.`FLIGHTS`;";
		public static final String SEARCHLEAVINGFROM = "SELECT DISTINCT(Origination) FROM `cis3270bookit`.`FLIGHTS`;";
		
		// Insert Statements
		public static final String INSERTLOGIN = "INSERT INTO cis3270bookit.LOGINS(Username,Password,SecurityQuestion,SecurityAnswer,IsAdmin) VALUES (?,?,?,?,?);";
		public static final String INSERTUSER = "INSERT INTO cis3270bookit.USERS(SSN,FirstName,LastName,Address,City,State,Zip,Email,Username) VALUES (?,?,?,?,?,?,?,?,?);";
//<<<<<<< HEAD
		public static final String BOOKPAYFLIGHT= "INSERT INTO cis3270bookit.BOOKINGS(BookingID,SSN,FlightID,NameOnCard,CreditCardNumber,ExpirationDate,CVV) VALUES (?,?,?,?,?,?,?);	";	
//=======
		
		
		//************************ Ron Code **************************************
//>>>>>>> branch 'dev' of git@github.com:rramsey26/CIS3270_TermProject.git
		
		// Search Queries
		public static final String ISADMIN = "SELECT IsAdmin FROM LOGINS WHERE Username = '?' AND IsAdmin = TRUE;";
		
		public static final String PASSWORD = "SELECT Password FROM LOGINS WHERE Username = '?' AND SecurityAnswer = '?';";
		
		public static final String FLIGHT = "SELECT * FROM FLIGHTS WHERE Origination like '%?%' AND Destination like '%?%' AND DepartureDate = '?';";
		
		public static final String ALLFLIGHTS = "SELECT * FROM FLIGHTS;";
		
		public static final String USER = "SELECT REPLACE(SSN, ',', '') SSN,FirstName,LastName,Address,City,State,Zip,Email,Username FROM USERS WHERE SSN = ?;";
		
		public static final String BOOKINGS = "SELECT Airline,FlightNumber,Origination,Destination,DepartureDate,DepartureTime,ArrivalDate,ArrivalTime "
				+ "FROM FLIGHTS f JOIN BOOKINGS b ON f.FlightID = b.FlightID WHERE b.SSN = ?;";
		
		
		// Insert Statements
		public static final String NEWLOGIN = "INSERT INTO LOGINS (Username,Password,SecurityQuestion,SecurityAnswer,IsAdmin)"
				+ " VALUES ('?',\"?\",\"?\",\"?\",?);";
		
		public static final String NEWUSER = "INSERT INTO USERS (SSN,FirstName,LastName,Address,City,State,Zip,Email,Username)"
				+ " VALUES (?,\"?\",\"?\",'?','?','?',?,'?','?');";
		
		public static final String NEWFLIGHT = "INSERT INTO FLIGHTS (Airline,FlightNumber,Origination,Destination,DepartureDate,DepartureTime,ArrivalDate,ArrivalTime,Price,TotalSeats)"
				+ " VALUES ('%s','%s','%s','%s','%s','%s','%s','%s',%d,%d);";
		
		public static final String NEWBOOKING = "INSERT INTO BOOKINGS (SSN,FlightID,NameOnCard,CreditCardNumber,ExpirationDate,CVV)"
				+ " VALUES (?,?,'?',?,'?',?);";
		
		// Update Statement
		public static final String UPDATEFLIGHT = "UPDATE FLIGHTS \n"
				+ "SET Airline='%s',FlightNumber='%s',Origination='%s',Destination='%s',DepartureDate='%s',DepartureTime='%s',ArrivalDate='%s',ArrivalTime='%s',Price=%d,TotalSeats=%d \n"
				+ "WHERE FlightID=%d;";
		
		// Delete Statement
		public static final String DELETE = "DELETE FROM FLIGHTS \n"
				+ "WHERE FlightID=%d;";
		

}