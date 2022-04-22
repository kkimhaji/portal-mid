package kr.jejunu.portal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteStatementStrategy implements StatementStrategy {
    @Override
    public PreparedStatement makeStatement(Object object, Connection connection) throws SQLException {
           PreparedStatement preparedStatement = connection.prepareStatement("delete from userinfo where id=?");
           Integer id = (Integer)object;
            preparedStatement.setInt(1, id);
            return preparedStatement;
    }
}
