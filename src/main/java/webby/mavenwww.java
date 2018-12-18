/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webby;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.ejb.Stateless;

/**
 *
 * @author cyclops
 */
@WebService(serviceName = "mavenwww")
@Stateless()
public class mavenwww {
	
		private static final String USERNAME = "phlogiston";
	private static final String PASSWORD = "pTbontb$2n";
	private static final String CONN_STRING = "jdbc:mysql://localhost/km";
	
	

	/**
	 * This is a sample web service operation
	 */
	@WebMethod(operationName = "hello")
	public String hello(@WebParam(name = "name") String txt) {
		return "Hello " + txt + " !";
	}
	
	

	
	@WebMethod(operationName = "nothing")
	public int nothing() {
	
		Connection conn = null;
	//	conn.close();
		

	

		try {
			conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
			System.out.println("Connected!");
		} catch (SQLException e) {
			System.err.println(e);
		} finally {
			if (conn != null) {
				// conn.close();
			}
		}
					return 45;


		
		
	}

	
	
}
