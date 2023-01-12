package io.wisoft.exercise;

import io.wisoft.seminar.PostgresqlAccess;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateExercise {

    public void getQuestionTwelve() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);
            String query = "UPDATE drama SET drm_opdate = '2013-05-01' WHERE drm_opdate IS NULL";
            pstmt = conn.prepareStatement(query);

            int value = pstmt.executeUpdate();
            conn.commit();

            System.out.println(value + "개가 수정되었습니다.");

        } catch (SQLException sqex) {
            System.out.println("SQLException = " + sqex.getMessage());
            System.out.println("SQLState = " + sqex.getSQLState());
        }
    }


    public void getQuestionThirteen(String roll, String name) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);
            SelectExercise selectExercise = new SelectExercise();
            selectExercise.getSelectName("김수현");

            String query = "UPDATE EMPLOYEE\n" +
                    "SET EMP_RCODE = (SELECT ER.EMP_RCODE\n FROM EMP_ROLE ER\n WHERE ER.EMP_RNAME = ? )," +
                    "EMP_SAL   = EMP_SAL * 1.2\n" +
                    "WHERE EMP_NAME = ?";
            pstmt = conn.prepareStatement(query);

            pstmt.setString(1, roll);
            pstmt.setString(2, name);

            int reValue = pstmt.executeUpdate();
            conn.commit();

            selectExercise.getSelectName("김수현");
            System.out.println(reValue + "건의 사항이 처리되었습니다.");
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
