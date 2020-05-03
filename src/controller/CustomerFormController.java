package controller;

import db.DBConnection;
import java.sql.Connection;
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
    
}