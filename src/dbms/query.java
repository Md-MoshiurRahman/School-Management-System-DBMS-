/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import oracle.jdbc.OracleConnection;

/**
 *
 * @author Nayeem
 */
public class query
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException
    {
        // TODO code application logic here
        String sql = "SELECT * FROM STUDENT";

        try
        {
            //Connection con = new OracleDBUtil().getConnection();
            Connection con = new OracleDBMS().getConnection();
            PreparedStatement pst = con.prepareStatement(sql);
            //pst.setString(1, "1505001");
            ResultSet rs = pst.executeQuery();
            while (rs.next())
            {
                System.out.print(rs.getString(1) + " , " + rs.getString(2) + " , " + rs.getString(3)+" , ");
                System.out.print(rs.getString(4) + " , " + rs.getString(5) + " , " + rs.getString(6)+" , ");
                System.out.println(rs.getString(7));
            }
            pst.close();
            con.close();
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
//        try
//        {
//            Connection con = new OracleDBUtil().getConnection();
//            PreparedStatement pst = con.prepareStatement(sql);
//            pst.setString(1, "1505002");
//            ResultSet rs = pst.executeQuery();
//            while (rs.next())
//            {
//                System.out.println(rs.getString(1) + " , " + rs.getString(2) + " , " + rs.getString(3));
//            }
//            pst.close();
//            con.close();
//        } catch (SQLException e)
//        {
//            e.printStackTrace();
//        }
    }

}
