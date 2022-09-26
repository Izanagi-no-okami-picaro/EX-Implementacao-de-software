package conecto;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;


public class conectaBD {
    public Connection Connection(){
        Connection con = null;
        try{
         String url = "jdbc:mysql//localhost:3306//crud?user=root&password=123";
            con = DriverManager.getConnection(url);
            
        }catch (SQLException erro){
            JOptionPane.showMessageDialog(null,"Connetion" + erro.getMessage());
        }
        return con;
        
        
    }
}
