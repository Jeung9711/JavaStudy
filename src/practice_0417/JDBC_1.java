package practice_0417;

import java.util.List;

public class JDBC_1 {
    public static void main(String[] args) {
        DeptDAO dao = new DeptDAO();

        List result = dao.select();

        System.out.println(result);
    }
}
