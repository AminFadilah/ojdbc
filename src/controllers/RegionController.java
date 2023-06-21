/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import icontrollers.IRegionController;
import idaos.IRegionDAO;
import java.util.List;
import models.Region;

/**
 *
 * @author Amin
 */
public class RegionController implements IRegionController {

    private IRegionDAO irdao;

    public RegionController(IRegionDAO irdao) {
        this.irdao = irdao;
    }

    @Override
    public String insert(String id, String name) {
        String result = "";
        Region region = new Region(Integer.parseInt(id), name);
//        if (irdao.insert(region)) {
//            result = "Data saved";
//        } else {
//            result = "Failed";
//        }
//        return result;
    }

    @Override
    public List<Region> getAll() {
        return irdao.getAll();
    }

    @Override
    public List<Region> getById(String id) {
        return irdao.getById(Integer.parseInt(id));
    }

    @Override
    public List<Region> search(String key) {
        return irdao.search(key);
    }

    @Override
    public String update(String id, String name) {
        String result = "";
        Region region = new Region(Integer.parseInt(id), name);
        if (irdao.update(region)) {
            result = "Data update";
        } else {
            result = "Failed";
        }
        return result;
    }

    @Override
    public String delete(String id) {
        String result = "";
        if (irdao.delete(Integer.parseInt(id))) {
            result = "Data Deleted";
        } else {
            result = "Failed";
        }
        return result;
    }
}
