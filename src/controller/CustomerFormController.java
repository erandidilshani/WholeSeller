package controller;

import db.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modal.Customer;


public class CustomerFormController {

    public List<Customer> getAllCustomers() throws ClassNotFoundException, SQLException {
       
        Connection connection=DBConnection.getInstance().getConnection();
        ResultSet set = connection.prepareStatement("SELECT * FROM Customer").executeQuery();
        List<Customer> list= new ArrayList();
        
        while(set.next()){
            list.add(new Customer(
                    set.getString(1),
                    set.getString(2),
                    set.getString(3),
                    set.getDouble(4)
            ));
        }
        return list;
        
    }
    
    
    public boolean saveCustomer(Customer customer) throws ClassNotFoundException, SQLException{
        
        //1
        Connection connection=DBConnection.getInstance().getConnection();
        //2
        PreparedStatement stm= connection.prepareStatement("INSERT INTO Customer VALUES(?,?,?,?)");
        //3
        stm.setObject(1, customer.getId());
        stm.setObject(2, customer.getName());
        stm.setObject(3, customer.getAddress());
        stm.setObject(4, customer.getSalary());
        //4
        return stm.executeUpdate()>0;
        
    }
    
    
    public boolean updateCustomer(Customer customer) throws ClassNotFoundException, SQLException{
        
        Connection connection=DBConnection.getInstance().getConnection();
        //2
        PreparedStatement stm= connection.prepareStatement("UPDATE Customer SET name=?, salary? where id=?");
        
        stm.setObject(1,customer.getName());
        stm.setObject(2,customer.getAddress());
        stm.setObject(3,customer.getSalary());
        stm.setObject(4,customer.getId());
        return stm.executeUpdate()>0;
        
        
        
        
    }
    
    public boolean deleteCustomer(String id) throws ClassNotFoundException, SQLException{
        return DBConnection.getInstance().getConnection().prepareStatement("DELETE FROM Customer WHERE id='"+id+"'").executeUpdate()>0;
                
    
    }
    



    public List<Customer> filterCustomer(String txt) throws SQLException,ClassNotFoundException {

        String temp="%"+txt+"%";

        List<Customer> list=new ArrayList();

        Connection connection=DBConnection.getInstance().getConnection();

  
        PreparedStatement stm= connection.prepareStatement("SELECT *FROM Customer WHERE id Like ? || name LIKE ? || address LIKE ?|| salary LIKE?" );


            stm.setString(1,temp);
            stm.setString(2,temp);
            stm.setString(3,temp);
            stm.setString(4,temp);
        
            ResultSet set=stm.executeQuery();

            while(set.next()){
            list.add(new Customer(
                set.getString(1),
                set.getString("name"),
                set.getString(3),
                set.getDouble(4)
            ));

            }
            return list;

    }
}