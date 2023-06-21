/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package idaos;

import java.util.List;
import models.Region;

/**
 *
 * @author Amin
 */
public interface IRegionDAO {
   public Region getById(int id);
   public List<Region> getAll();
   //SELECT * FROM REGIONS WHERE region_name like "%keyword%"
   public List<Region> search(String keyword);
   //return null jika gagal.
   public Region insert(Region region);
   //return null jika gagal.
   public Region update(Region region);
   public void delete(int id);
}
