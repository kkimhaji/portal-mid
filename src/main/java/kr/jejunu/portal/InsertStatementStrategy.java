package kr.jejunu.portal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertStatementStrategy implements StatementStrategy {
    @Override
    public PreparedStatement makeStatement(Object object, Connection connection) throws SQLException {
           PreparedStatement preparedStatement = connection.prepareStatement
                   ("insert into userinfo (name, password) values (?, ?)", Statement.RETURN_GENERATED_KEYS);
           User user=(User) object;
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getPassword());
            return preparedStatement;
    }
}
