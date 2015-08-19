/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package za.co.jozijugdojo.gui.jozijugdojowhitekata2.resources;

import com.github.gwtbootstrap.client.ui.config.Configurator;
import com.github.gwtbootstrap.client.ui.resources.Resources;
import com.google.gwt.core.client.GWT;

public class ExampleConfigurator implements Configurator {
  public Resources getResources() {
    return GWT.create(ExampleResources.class);
  }

  public boolean hasResponsiveDesign() {
    return false;
  }
}
