package br.up.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import br.up.connection.InterfacePool;
import br.up.connection.Pool;
import br.up.entities.StockOption;

public class StockOptions_Dao {
	
	
	private InterfacePool pool;
	
	public StockOptions_Dao(InterfacePool pool) {
		this.pool = pool;
	}

	public StockOption getById(StockOption stockoption) {
		
		Connection con = pool.getConnection();
				try {
					PreparedStatement ps = null;
			
					String sqlSelect = "";
					
					sqlSelect = "SELECT * FROM homebrooker.stockoptions where idstockoptions = ?;";
					
					ps = con.prepareStatement(sqlSelect);
					ps.setInt(1, stockoption.getId());	
					
					ResultSet rs = ps.executeQuery();
					
					while (rs.next()) {
						stockoption.setCompany(rs.getString("company"));
						stockoption.setTicker_simbol(rs.getString("ticker_simbol"));
						stockoption.setQuantity(rs.getInt("quantity"));
						stockoption.setValue(rs.getDouble("value"));
				
						break;
					}
				} catch (Exception e) {
					System.out.println("stockoptionDAO -  getById - " + e.getMessage());
					return null;
				} finally {
					pool.liberarConnection(con);
					return stockoption;
				}
	}

	public ArrayList<StockOption> listar() {
		ArrayList<StockOption> stockoptions = new ArrayList<StockOption>();
		
		Connection con = pool.getConnection();
		try {
			PreparedStatement ps = null;
	
			String sqlSelect = "";
			
			sqlSelect = "SELECT * FROM homebrooker.stockoptions;";
			ps = con.prepareStatement(sqlSelect);
					
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				
				StockOption stock = new StockOption();
			
				stock.setId(rs.getInt("idstockoptions"));
				stock.setCompany(rs.getString("company"));
				stock.setTicker_simbol("ticker_simbol");
				stock.setQuantity(rs.getInt("quantity"));
				stock.setValue(rs.getDouble("value"));
				stockoptions.add(stock);
			}
		} catch (Exception e) {
			System.out.println("stockoptionDAO -  listar - " + e.getMessage());
		} finally {
			pool.liberarConnection(con);
			return stockoptions;
		}
	}

}
