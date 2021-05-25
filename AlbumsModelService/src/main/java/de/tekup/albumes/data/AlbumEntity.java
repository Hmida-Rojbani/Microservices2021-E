/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.tekup.albumes.data;

import lombok.Data;

@Data
public class AlbumEntity {
    private Long id;
    private String albumId;
    private String userId; 
    private String name;
    private String description; 

    
    
}
