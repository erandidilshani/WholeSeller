package controller;

import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modal.Item;


public class ItemFormController {

    public List<Item> getAllItems() throws ClassNotFoundException, SQLException {
       
        Connection connection=DBConnection.getInstance().getConnection();
        ResultSet rst = connection.prepareStatement("SELECT * FROM Item").executeQuery();
        List<Item> list= new ArrayList();
        
        while(rst.next()){
            list.add(new Item(
                    rst.getString(1),
                    rst.getString(2),
                    rst.getDouble(3),
                    rst.getInt(4)
            ));
        }
        return list;
        
    }
    
    
    public boolean saveItem(Item item) throws ClassNotFoundException, SQLException{
        
        //1
        Connection connection=DBConnection.getInstance().getConnection();
        //2
        PreparedStatement stm= connection.prepareStatement("INSERT INTO Item VALUES(?,?,?,?)");
        //3
        stm.setObject(1, item.getId());
        stm.setObject(2, item.getDesc());
        stm.setObject(3, item.getPrice());
        stm.setObject(4, item.getQty());
        //4
        return stm.executeUpdate()>0;
        
    }
    
    
    public boolean updateItem(Item item) throws ClassNotFoundException, SQLException{
        
        Connection connection=DBConnection.getInstance().getConnection();
        //2
        PreparedStatement stm= connection.prepareStatement("UPDATE Item SET description=?, unitPrice=? qtyOnHand=? where code=?");
        
        stm.setString(1,Item.getDesc());
        stm.setString(2,Item.getDesc());
        stm.setString(3,Item.getPrice());
        stm.setString(4,Item.getQty());
        
        return stm.executeUpdate()>0;
        
        
        
        
    }
    
    public boolean deleteItem(String id) throws ClassNotFoundException, SQLException{
        return DBConnection.getInstance().getConnection().prepareStatement("DELETE FROM Item WHERE id='"+id+"'").executeUpdate()>0;
                
    
    }
    



    public List<Item> filterItem(String txt) throws SQLException,ClassNotFoundException {

        String temp="%"+txt+"%";

        List<Item> list=new ArrayList();

        Connection connection=DBConnection.getInstance().getConnection();

  
        PreparedStatement stm= connection.prepareStatement("SELECT *FROM Item WHERE id Like ? || desc LIKE ? || price LIKE ?|| Qty LIKE?" );


            stm.setString(1,temp);
            stm.setString(2,temp);
            stm.setString(3,temp);
            stm.setString(4,temp);
        
            ResultSet set=stm.executeQuery();

            while(set.next()){
            list.add(new Item(
                set.getString(1),
                set.getString("desc"),
                set.getDouble(3),
                set.getInt(4)
            ));

            }
            return list;

    }
}