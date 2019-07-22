
package com.group;

import java.sql.*;

import java.util.*;

public class Delete
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter user id to delete =");
        String id=sc.next();

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userinfo", "root", "rootpasswordgiven");
            Statement st=con.createStatement();

            String querry="delete from user where id ='" + id + "' ";
            int x=st.executeUpdate(querry);

            if(x>0)
                System.out.println("Deleted Successfully");
            else
                System.out.println("failed to Delete");

            con.close();

        }
        catch(Exception e)
        {
            System.out.println("e");

        }

    }


}
