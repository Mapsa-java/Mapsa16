package next.impl;

import jdbc.DBUtils;
import next.RoleDao;
import next.dto.RoleDto;

import java.sql.SQLException;


public class MySqlJdbcRoleDao implements RoleDao {

    @Override
    public RoleDto getRoleById(int id) {
        try (var conn = DBUtils.getConnection();
             var ps = conn.prepareStatement("SELECT * FROM role WHERE id = ?")) {
            ps.setInt(1, id);

            try (var rs = ps.executeQuery()) {
                if (rs.next()) {
                    RoleDto role = new RoleDto();
                    role.setId(rs.getInt("id"));
                    role.setRoleNmae(rs.getString("rolenmae"));
                    return role;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean deleteById(int id) {
        try (var conn = DBUtils.getConnection();
             var ps = conn.prepareStatement("delete from role WHERE id = ?")) {
            ps.setInt(1, id);

            var rs = ps.executeUpdate();
			return rs > 0;

		} catch (SQLException e) {
            e.printStackTrace();
			return false ;
        }

    }

}
