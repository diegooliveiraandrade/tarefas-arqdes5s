package br.usjt.arqsw18.pipoca.model.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sun.istack.internal.logging.Logger;

@Repository
public class UsuarioDAO {

	private Connection conn;

	@Autowired
	public UsuarioDAO(DataSource dataSource) throws IOException {
		try {
			this.conn = dataSource.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public boolean checkLogin(String usuario, String senha) throws SQLException {

		PreparedStatement stm = null;
		ResultSet rs = null;
		boolean check = false;

		try {
			stm = conn.prepareStatement("SELECT * FROM usuario WHERE usuario = ? AND senha = ?");
			stm.setString(1, usuario);
			stm.setString(2, senha);
			rs = stm.executeQuery();

			if (rs.next()) {

				check = true;

				System.out.println("logado");

			} else {
				System.out.println("Invalido");
			}
		} catch (SQLException e) {
			Logger.getLogger(UsuarioDAO.class.getName(), null).log(Level.SEVERE, null, e);

		} finally {
			conn.close();
			stm.close();
			rs.close();

		}
		return check;

	}
}
