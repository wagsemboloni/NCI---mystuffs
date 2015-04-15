/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructors;

/**
 *
 * @author Wagner de Oliveira
 */
public class Assessment {
    private String name, type;
    int weighting;
    
    public Assessment(){
        name = new String();
        type = new String();
        weighting = 0;
        
    }
    //overload Constructor 
    public Assessment(String name, String type, int weighting){
        this.name = name;
        this.type = type;
        this.weighting = weighting;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setWeighting(int weighting) {
        this.weighting = weighting;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public int getWeighting() {
        return weighting;
    }
    
    
}
