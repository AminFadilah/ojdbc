/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ojdbc;

import daos.RegionDAO;
import idaos.IRegionDAO;
import java.util.ArrayList;
import java.util.List;
import models.Region;

/**
 *
 * @author Amin
 */
public class OJDBC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DBConnection connection = new DBConnection();
//        System.out.println(connection);

//        Region region = new Region();
//        region.setId(0);
//        region.setName("region");
//        System.out.println(region.getId() + " "+ region.getName());
//        
//        Region r = new Region(1, "Region New");
//        System.out.println(r.getId()+" "+r.getName());
        RegionDAO irdao = new RegionDAO(connection.getConnection());

//        testing insert
        Region region = new Region(32,"My Region");
        System.out.println(irdao.insert(region));
//      testing getAll
//        for (Region region : irdao.getAll()) {
//            System.out.println(region.getId());
//            System.out.println(region.getName());
//        }
//        irdao.getAll().forEach(r->System.out.print(r.getId()+r.getName()));
//      testing getById
//        irdao.getById(1);
//        for (Region region : regions) {
//            System.out.println(region.getId());
//            System.out.println(region.getName());
//        }
//      testing search
//        String key = "Asia";
//        List<Region> regions = irdao.search(key);
//        for (Region region : regions) {
//            System.out.println("ID: " + region.getId());
//            System.out.println("Name: " + region.getName());
//        }
//      testing update
//        Region region = new Region(32, "My Region");
//        System.out.println(irdao.update(region));

//      testing delete
//        int idToDelete = 32;
//        irdao.delete(idToDelete);
//        System.out.println(irdao.getAll());
    }
}
