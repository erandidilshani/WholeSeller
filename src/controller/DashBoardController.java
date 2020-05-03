package controller;
 import db.DBConnection;
 import java.sql.
         
         
public class DashBoardController {
    public int getCustomerCount() throws ClassNotFoundException , SQLException {
        Connection connection=DBConnection.getInstance().getConnection();
        
        ResultSet set=connection.preparedStatement("SELECT COUNT(*) FROM Customer").executeQuery
    
    
    }
    
    
}
