package controller;

import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modal.Orders;


public class OrderController {
    
    public List<Orders> getAllOrders() throws ClassNotFoundException, SQLException{
        Connection connection= DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("SELECT * FROM Orders");
        List<Orders> tempList= new ArrayList();
        
        ResultSet rst = stm.executeQuery();
        
        while(rst.next()){
            tempList.add(new Orders(rst.getString("id"), rst.getString(2), rst.getString(3), null));
        }
        return tempList;
    }
    
}