/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.vinni.mb;

import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.RequestScoped;
import static org.primefaces.component.barchart.BarChartBase.PropertyKeys.model;
import static org.primefaces.component.barchart.BarChartBase.PropertyKeys.model;
import org.primefaces.model.menu.DefaultMenuItem;
import org.primefaces.model.menu.DefaultMenuModel;
import org.primefaces.model.menu.DefaultSubMenu;

/**
 *
 * @author Casacra4_301
 */
@Named(value = "daniel_tausaMB")
@RequestScoped
public class Daniel_tausaMB {
private String modelo;
    /**
     * Creates a new instance of Daniel_tausaMB
     */
    public Daniel_tausaMB() {
        
   
        DefaultSubMenu firstSubmenu = DefaultSubMenu.builder()
                .label("Dynamic Submenu")
                .build();
 
        DefaultMenuItem item = DefaultMenuItem.builder()
                .value("External")
                .url("http://www.primefaces.org")
                .icon("pi pi-home")
                .build();
        firstSubmenu.getElements().add(item);
 
        modelo.getElements().add(firstSubmenu);
        
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
