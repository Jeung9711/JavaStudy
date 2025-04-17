package practice_0417;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DeptDAO {
    public List<DEPTDTO> select() {
        // 결과를 담을 list 생성
        List list = new ArrayList();

        // DB와 연결할 객체 생성
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            // 예외 처리를 위해 try-catch문에서 실행
            Class.forName("org.mariadb.jdbc.Driver");
            String url = "jdbc:mariadb://localhost:3306/java";
            String id = "root";
            String pw = "1234";

            con = DriverManager.getConnection(url, id, pw);

            String sql = "select * from dept";
            stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            rs.next();

            while (rs.next()) {
                DEPTDTO dto = new DEPTDTO();

                dto.setDeptno(rs.getInt("deptno"));
                dto.setDname(rs.getString("dname"));
                dto.setLoc(rs.getString("loc"));

                list.add(dto);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(rs != null) rs.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                stmt.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
            try {
                con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

        return list;
    }
}
