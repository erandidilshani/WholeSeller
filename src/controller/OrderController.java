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

    public String getOrderId() throws ClassNotFoundException, SQLException {
        ResultSet rst=DBConnection.getInstance().getConnection().prepareStatement("SELECT id FROM Orders ORDER BY id DESC LIMIT 1").executeQuery();
        
        if(rst.next()){
            String tempId=rst.getString(1);
            String[] splitArray=tempId.split("D");
            int value=Integer.parseInt(splitArray[1]);
            value++;
                                                    
            if(value<10){
                return "D00"+value;
            }
            else if(value<100){
                return "D0"+value;
            }
            else if(value<1000){
                return "D"+value;
            }
            else{
                return ""+value;
            }
        
        }
        
        return "0";
        
        
    }
    
}