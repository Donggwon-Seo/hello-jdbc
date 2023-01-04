package io.wisoft.homework.week3;

import io.wisoft.seminar.PostgresqlAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeSelectService {

    public void getEmployeeAll() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT * FROM EMPLOYEE";
            pstmt = conn.prepareStatement(query);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.print("[직원코드]: " + rs.getString(1));
                System.out.print(" | [이름]: " + rs.getString(2));
                System.out.print(" | [매니저코드]: " + rs.getString(3));
                System.out.print(" | [월급]: " + rs.getInt(4));
                System.out.println(" | [직책코드]: " + rs.getString(5));
            }
        } catch (SQLException sqex) {
            System.out.println("SQLException = " + sqex.getMessage());
            System.out.println("SQLState = " + sqex.getSQLState());
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (pstmt != null) {
                try {
                    rs.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (conn != null) {
                try {
                    rs.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
