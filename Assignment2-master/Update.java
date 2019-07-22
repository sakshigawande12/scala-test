
package com.group;

import java.sql.*;

import java.util.*;

public class Update
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter user id to update =");
        String newid=sc.next();

        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userinfo", "root", "rootpasswordgiven");
            Statement st=con.createStatement();
            System.out.println("Enter new user name =");
            String newname=sc.next();
            System.out.println("Enter new user age =");
            int newage=sc.nextInt();

            String querry=("update user set name='"+newname+"',age='"+newage+"' where id='" +newid+ "')";
            int x=st.executeUpdate(querry);

            if(x>0)
                System.out.println("Updated Successfully");
            else
                System.out.println("failed to Update");

            con.close();

        }
        catch(Exception e)
        {
            System.out.println("e");

        }

    }


}
