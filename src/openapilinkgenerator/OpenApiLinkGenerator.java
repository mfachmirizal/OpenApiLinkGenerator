/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package openapilinkgenerator;

import gui.OpenApiLinkGeneratorGui;

/**
 *
 * @author mfachmirizal
 */
public class OpenApiLinkGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        OpenApiLinkGeneratorGui openApiLinkGeneratorGui = new OpenApiLinkGeneratorGui();
        openApiLinkGeneratorGui.setLocationRelativeTo(null);
        openApiLinkGeneratorGui.setVisible(true);
    }
    
}
