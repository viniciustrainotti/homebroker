package br.up.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import br.up.connection.InterfacePool;
import br.up.entities.StockOption;
import br.up.entities.User;

public class StockOptions_User_Dao {
	
private InterfacePool pool;
	
	public StockOptions_User_Dao(InterfacePool pool) {
		this.pool = pool;
	}

	public void buy(StockOption stockoption, User user, int quantity) {
		
		Connection con = pool.getConnection();
		PreparedStatement ps;

			
		String sqlInsert = 	"INSERT INTO homebrooker.stockoptions_users (stockoptions_idstockoptions, users_idusers, quantity, paid_value) " +
					"VALUES (?, ?, ?, ?);";

		try {
			ps = con.prepareStatement(sqlInsert);
			ps.setInt(1, stockoption.getId());
			ps.setInt(2, user.getId());
			ps.setInt(3, quantity);
			ps.setInt(4, stockoption.getQuantity());

			ps.executeUpdate();
			ps.close();
		}catch (Exception e) {
			System.out.println("StockOption_User_DAO -  inserir - " + e.getMessage());

		}finally {
			pool.liberarConnection(con);
		}

		
	}
	
	

}
