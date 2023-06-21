/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package icontrollers;

import java.util.List;
import models.Region;

/**
 *
 * @author Amin
 */
public interface IRegionController {

    public String insert(String id, String name);

    public List<Region> getAll();

    public List<Region> getById(String id);

    public List<Region> search(String key);

    public String update(String id, String name);

    public String delete(String id);
}
