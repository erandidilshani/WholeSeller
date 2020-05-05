package controller;

import db.DBConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DashBoardController {
    public int getCustomerCount() throws ClassNotFoundException , SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
        
        ResultSet set=connection.prepareStatement("SELECT COUNT(*) FROM Customer").executeQuery();
        
        if(set.next()){
            return set.getInt(1);
        }
        return 0;
        
   

    
    
    }
    
    
}
