package io.wisoft.seminar;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class StudentDeleteService {
    public void deleteStudentNoMultiBatch(Student[] students) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "DELETE FROM STUDENT WHERE NO = ?";
            pstmt = conn.prepareStatement(query);

            for (int i = 0; i < students.length; i++) {
                if (students[i].getNo() == null)
                    break;

                pstmt.setString(1, students[i].getNo());
                pstmt.addBatch();
                pstmt.clearParameters();
            }

            int[] retValue = pstmt.executeBatch();
            conn.commit();

            System.out.println(retValue.length + "건의 사항이 처리되었습니다.");
        } catch (SQLException sqex) {
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("SQLException = " + sqex.getMessage());
            System.out.println("SQLState = " + sqex.getSQLState());
        } finally {
            if (pstmt != null) try {
                pstmt.close();
            } catch (Exception e) {
            }

            if (conn != null) try {
                conn.close();
            } catch (Exception e) {
            }
        }
    }

    public void deleteStudentNo(String studentNo) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);
            String query = "DELETE FROM STUDENT WHERE NO = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, studentNo);
            int retValue = pstmt.executeUpdate();
            conn.commit();
            System.out.println(retValue + "건의 사항이 처리되었습니다.");
        } catch (SQLException sqex) {
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println("SQLException = " + sqex.getMessage());
            System.out.println("SQLState = " + sqex.getSQLState());
        } finally {
            if (pstmt != null) try {
                pstmt.close();
            } catch (Exception e) {
            }

            if (conn != null) try {
                conn.close();
            } catch (Exception e) {
            }
        }
    }
}
