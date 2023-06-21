/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import idaos.IRegionDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import models.Region;

/**
 *
 * @author Amin
 */
public class RegionDAO implements IRegionDAO {

    private Connection connection;

    public RegionDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Region> getAll() {
        List<Region> listRegion = new ArrayList<Region>();
        String query = "SELECT * FROM HR.REGIONS";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Region r = new Region(resultSet.getInt(1), resultSet.getString(2));
                r.setId(resultSet.getInt(1));
                r.setName(resultSet.getString(2));
                listRegion.add(r);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listRegion;
    }

    @Override
    public Region getById(int id) {
        Region r = null;
        String query = "SELECT * FROM HR.REGIONS WHERE region_id = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                r = new Region(resultSet.getInt("region_id"), resultSet.getString("region_name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return r;
    }

    @Override
    public List<Region> search(String key) {
        List<Region> listRegion = new ArrayList<>();
        String query = "SELECT * FROM HR.REGIONS WHERE region_name LIKE initcap(?) OR region_name LIKE ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "%" + key + "%");
            preparedStatement.setString(2, "%" + key + "%");
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                Region r = new Region(resultSet.getInt(1), resultSet.getString(2));
                listRegion.add(r);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return listRegion;
    }

    @Override
   public Region insert(Region r) {
    String query = "INSERT INTO HR.REGIONS(region_id, region_name) VALUES (?,?)";
    try {
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setInt(1, r.getId());
        preparedStatement.setString(2, r.getName());
        int rowsAffected = preparedStatement.executeUpdate();
        
        if (rowsAffected == 0) {
            r = null; // Jika tidak ada baris yang terpengaruh, set r menjadi null
        }
    } catch (Exception e) {
        e.printStackTrace();
        r = null; // Jika terjadi kesalahan, set r menjadi null
    }
    return r;
}

    @Override
    public Region update(Region r) {
        String query = "UPDATE HR.REGIONS SET region_name = ? WHERE region_id = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, r.getName());
            preparedStatement.setInt(2, r.getId());
            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected == 0) {
                r = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return r;
    }

    @Override
    public void delete(int id) {
        String query = "DELETE FROM HR.REGIONS WHERE region_id = ?";

        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
