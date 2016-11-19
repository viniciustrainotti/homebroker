package br.up.controller;



import java.util.ArrayList;

import br.up.connection.Pool;
import br.up.dao.StockOptions_Dao;
import br.up.dao.StockOptions_User_Dao;
import br.up.entities.StockOption;
import br.up.entities.User;

public class ControllerStockOption {
	
	
	
	public StockOption getById(StockOption stockoption) {
		Pool pool = new Pool();
		StockOptions_Dao stockOptionsUser = new StockOptions_Dao(pool);
		return stockOptionsUser.getById(stockoption);
	}
	
	
	public ArrayList<StockOption> listarTodos() throws Exception {
		Pool pool = new Pool();
		StockOptions_Dao stockOptionsUser = new StockOptions_Dao(pool);
		return stockOptionsUser.listar();
	
	}
	
	public void buy(StockOption stockoption, User user, int quantity){
		
		
		Pool pool = new Pool();
		StockOptions_User_Dao stockOptionsUserDao = new StockOptions_User_Dao(pool);
		stockOptionsUserDao.buy(stockoption, user, quantity);
	}

}
