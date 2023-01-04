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

            String query = "SELECT * FROM EMPLOYEE ";
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

    public void getEmployeeBycode(String code) {

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT * FROM EMPLOYEE WHERE emp_code = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, code);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.print("[직원코드]: " + rs.getString(1));
                System.out.print(" | [이름]: " + rs.getString(2));
                System.out.print(" | [매니저코드]: " + rs.getString(3));
                System.out.print(" | [월급]: " + rs.getInt(4));
                System.out.println(" | [직책코드]: " + rs.getString(5));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            if (rs != null) {
                try { rs.close(); } catch (Exception e) { e.printStackTrace();}
            }

            if (pstmt != null) {
                try { pstmt.close(); } catch (Exception e) { e.printStackTrace();}
            }

            if (conn != null) {
                try { conn.close(); } catch (Exception e) { e.printStackTrace();}
            }
        }
    }

    public void getEmployeeByName(String name) {

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT * FROM EMPLOYEE WHERE emp_name = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, name);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.print("[직원코드]: " + rs.getString(1));
                System.out.print(" | [이름]: " + rs.getString(2));
                System.out.print(" | [매니저코드]: " + rs.getString(3));
                System.out.print(" | [월급]: " + rs.getInt(4));
                System.out.println(" | [직책코드]: " + rs.getString(5));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            if (rs != null) {
                try { rs.close(); } catch (Exception e) { e.printStackTrace();}
            }

            if (pstmt != null) {
                try { pstmt.close(); } catch (Exception e) { e.printStackTrace();}
            }

            if (conn != null) {
                try { conn.close(); } catch (Exception e) { e.printStackTrace();}
            }
        }
    }

    public void getEmployeeByMgt(String mgt) {

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT * FROM EMPLOYEE WHERE emp_mgt = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, mgt);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.print("[직원코드]: " + rs.getString(1));
                System.out.print(" | [이름]: " + rs.getString(2));
                System.out.print(" | [매니저코드]: " + rs.getString(3));
                System.out.print(" | [월급]: " + rs.getInt(4));
                System.out.println(" | [직책코드]: " + rs.getString(5));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            if (rs != null) {
                try { rs.close(); } catch (Exception e) { e.printStackTrace();}
            }

            if (pstmt != null) {
                try { pstmt.close(); } catch (Exception e) { e.printStackTrace();}
            }

            if (conn != null) {
                try { conn.close(); } catch (Exception e) { e.printStackTrace();}
            }
        }
    }

    public void getEmployeeByRcode(String rcode) {

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT * FROM EMPLOYEE WHERE emp_rcode = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, rcode);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.print("[직원코드]: " + rs.getString(1));
                System.out.print(" | [이름]: " + rs.getString(2));
                System.out.print(" | [매니저코드]: " + rs.getString(3));
                System.out.print(" | [월급]: " + rs.getInt(4));
                System.out.println(" | [직책코드]: " + rs.getString(5));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            if (rs != null) {
                try { rs.close(); } catch (Exception e) { e.printStackTrace();}
            }

            if (pstmt != null) {
                try { pstmt.close(); } catch (Exception e) { e.printStackTrace();}
            }

            if (conn != null) {
                try { conn.close(); } catch (Exception e) { e.printStackTrace();}
            }
        }
    }

    public void getEmployeeByRname() {

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT E.EMP_NAME, R.EMP_RNAME FROM EMPLOYEE E,EMP_ROLE R WHERE E.EMP_RCODE=R.EMP_RCODE";
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.print("[이름]: " + rs.getString(1));
                System.out.println(" | [직급]: " + rs.getString(2));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            if (rs != null) {
                try { rs.close(); } catch (Exception e) { e.printStackTrace();}
            }

            if (pstmt != null) {
                try { pstmt.close(); } catch (Exception e) { e.printStackTrace();}
            }

            if (conn != null) {
                try { conn.close(); } catch (Exception e) { e.printStackTrace();}
            }
        }
    }

}
