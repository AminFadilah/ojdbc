///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package JUnitTestRegion;
//
//import controllers.RegionController;
//import icontrollers.IRegionController;
//import idaos.IRegionDAO;
//import java.util.List;
//import javafx.scene.layout.Region;
//import junit.framework.Assert;
//import ojdbc.DBConnection;
//import org.junit.Test;
//
///**
// *
// * @author Amin
// */
//public class JUnitTestRegion {
//    DBConnection connection = new DBConnection();
//    IRegionController irc = new RegionController((IRegionDAO) connection.getConnection());
//
//    public JUnitTestRegion() {
//    }
//    @Test
//    public void testInsert() {
//        irc.insert("111", "Amin Fadilah");
//        List<models.Region> m = irc.getById("111");
//        Assert.assertEquals("111", m.get(0).getId());
//        Assert.assertEquals("Amin Fadilah", m.get(0).getName());
//    }
//
//    public void testGetAll() {
//        List<models.Region> act3 = irc.getAll();
//        Assert.assertNotNull(act3);
//    }
//
//    public void testGetById() {
//        List<models.Region> act = irc.getById("1");
//        Assert.assertNotNull(act);
//    }
//
//    public void testSearch() {
//        List<models.Region> act2 = irc.search("1");
//        Assert.assertNotNull(act2);
//    }
//
//    public void testUpdate() {
//        irc.update("111", "Amin Fadilah");
//        List<models.Region> m = irc.getById("111");
//        Assert.assertEquals("111", m.get(0).getId());
//        Assert.assertEquals("Amin Fadilah", m.get(0).getName());
//    }
//
//    public void testDelete() {
//        irc.delete("111");
//        Assert.assertNull(irc.getById("111"));
//    }
//    
//}
