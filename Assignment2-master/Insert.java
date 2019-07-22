
package com.group;

import java.sql.*;

import java.util.*;

public class Insert
{
public static void main(String args[])
{
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter user id =");
    String id=sc.next();
    System.out.println("Enter user name =");
    String name=sc.next();
    System.out.println("Enter user age =");
    int age=sc.nextInt();
try
{
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/userinfo", "root", "rootpasswordgiven");
    Statement st=con.createStatement();

    String querry="insert into user values('"+id+"','"+name+"','"+age+"')";
    int x=st.executeUpdate(querry);

    if(x>0)
        System.out.println("Inserted Successfully");
    else
        System.out.println("failed to insert");

con.close();

}
catch(Exception e)
{
    System.out.println("e");

}

}


}
