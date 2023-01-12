package io.wisoft.exercise;

import io.wisoft.seminar.PostgresqlAccess;

import java.sql.*;

public class SelectExercise {
    public void getQuestionOne() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);
            String query = "SELECT * FROM DEPARTMENT";
            pstmt = conn.prepareStatement(query);

            rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.print("[부서코드] " + rs.getString(1));
                System.out.print(" [부서이름] " + rs.getString(2));
                System.out.println(" [부서위치] " + rs.getString(3));
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

    public void getQuestionTwo() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);
            String query = "SELECT EMP_CODE,EMP_NAME,EMP_MGT,EMP_SAL FROM EMPLOYEE";
            pstmt = conn.prepareStatement(query);

            rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.print("[연예관계자 코드] " + rs.getString(1));
                System.out.print(" [이름] " + rs.getString(2));
                System.out.print(" [관리자] " + rs.getString(3));
                System.out.println(" [급여] " + rs.getString(4));
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

    public void getQuestionThree(String prd) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);
            String query = "SELECT DRM_CODE, DRM_NAME FROM DRAMA WHERE DRM_PRD = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, prd);
            rs = pstmt.executeQuery();

            rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.print("[드라마 코드] " + rs.getString(1));
                System.out.println(" [이름] " + rs.getString(2));
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

    public void getQuestionFour() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);
            String query = "SELECT drm_name, drm_brd FROM DRAMA WHERE drm_brd IN ('KBC', 'SBC')";
            pstmt = conn.prepareStatement(query);

            rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.print("[드라마 이름]: " + rs.getString("drm_name"));
                System.out.println("\t\t [방영사]: " + rs.getString("drm_brd"));
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

    public void getQuestionSeven() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);
            String query = "SELECT DRM_NAME FROM DRAMA WHERE DRM_opdate IS NULL";
            pstmt = conn.prepareStatement(query);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.print("[드라마 이름] " + rs.getString(1));
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

    public void getQuestionEight() {
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
                try {
                    rs.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if (pstmt != null) {
                try {
                    pstmt.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void getQuestionNine() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT EMP_NAME, EMP_SAL FROM EMPLOYEE ORDER BY EMP_SAL DESC, EMP_NAME ASC;";
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.print("[이름]: " + rs.getString(1));
                System.out.println(" | [급여]: " + rs.getString(2));
            }

        } catch (SQLException e) {
            e.printStackTrace();
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
                    pstmt.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void getQuestionTen() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT R.EMP_RNAME, AVG(E.EMP_SAL), MIN(E.EMP_SAL), MAX(E.EMP_SAL) " +
                    "FROM EMPLOYEE E, EMP_ROLE R " +
                    "WHERE E.EMP_RCODE = R.EMP_RCODE " +
                    "GROUP BY R.EMP_RNAME " +
                    "HAVING AVG(E.EMP_SAL) >= 5000";

            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.print("[직급]: " + rs.getString(1));
                System.out.print(" | [평균 급여액]: " + rs.getDouble(2));
                System.out.print(" | [최소 급여액]: " + rs.getDouble(3));
                System.out.println(" | [최대 급여액]: " + rs.getDouble(4));


            }

        } catch (SQLException e) {
            e.printStackTrace();
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
                    pstmt.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void getQuestionEleven() {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT EMP_NAME, EMP_SAL FROM EMPLOYEE WHERE EMP_SAL >= (SELECT AVG(EMP_SAL) FROM EMPLOYEE)";
            pstmt = conn.prepareStatement(query);
            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.print("[이름]: " + rs.getString(1));
                System.out.println(" | [급여]: " + rs.getString(2));
            }

        } catch (SQLException e) {
            e.printStackTrace();
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
                    pstmt.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void getSelectName(String name) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);
            String query = "SELECT EMP_NAME, EMP_SAL FROM EMPLOYEE WHERE EMP_NAME = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, name);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.print("[이름] " + rs.getString(1));
                System.out.println(" [급여] " + rs.getString(2));
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

    public void getQuestionFourteen(String code, String name, String mgt, int sal, String rcode) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "INSERT INTO EMPLOYEE VALUES (?, ?, ?, ?, ?)";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, code);
            pstmt.setString(2, name);
            pstmt.setString(3, mgt);
            pstmt.setInt(4, sal);
            pstmt.setString(5, rcode);

            int retValue = pstmt.executeUpdate();
            conn.commit();
            System.out.println(retValue + "건의 사항이 처리되었습니다.");
        } catch (SQLException e) {
            e.printStackTrace();
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
                    pstmt.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void getQuestionFifteen(){
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT E.EMP_NAME FROM EMPLOYEE E, REL_DEPARTMENT R, DEPARTMENT D " +
                    "WHERE (E.EMP_CODE = R.RD_EMP_CODE) AND (D.DEPT_CODE = R.RD_DEPT_CODE) AND (D.DEPT_NAME LIKE '%배우') " +
                    "INTERSECT " +
                    "SELECT E.EMP_NAME FROM EMPLOYEE E, REL_DEPARTMENT R, DEPARTMENT D " +
                    "WHERE (E.EMP_CODE = R.RD_EMP_CODE) AND (D.DEPT_CODE = R.RD_DEPT_CODE) AND (D.DEPT_NAME LIKE '가수%') ";

            pstmt = conn.prepareStatement(query);

            rs = pstmt.executeQuery();

            while (rs.next()) {
                System.out.println("[이름] " + rs.getString(1));
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


    public void getQuestionSixteen(String rname) {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            conn = PostgresqlAccess.setConnection();
            conn.setAutoCommit(false);

            String query = "SELECT E.EMP_NAME AS 이름 FROM EMPLOYEE E WHERE NOT EXISTS " +
                    "(SELECT * FROM EMP_ROLE R WHERE E.EMP_RCODE = R.EMP_RCODE AND R.EMP_RNAME = ?)";

            pstmt = conn.prepareStatement(query);
            pstmt.setString(1,rname);

            rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.println("[이름] " + rs.getString(1));
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

