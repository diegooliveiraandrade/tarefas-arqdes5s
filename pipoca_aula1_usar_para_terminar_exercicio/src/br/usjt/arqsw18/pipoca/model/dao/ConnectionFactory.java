package br.usjt.arqsw18.pipoca.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	     
	    public static Connection getConnection() throws SQLException{
	    	try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        String url = "jdbc:mysql://localhost:3306/filmes_sin3an_bua?useTimezone=true&serverTimezone=UTC"; //Nome da base de dados
	        String user = "root"; //nome do usuário do MySQL
	        String password = "bank"; //senha do MySQL
	         
	        Connection conexao = null;
	        conexao = DriverManager.getConnection(url, user, password);
	         
	        return conexao;
	    }
	}