/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assessmentapplication;

/**
 * 5th Feb 2013
 * Assessment.java
 * @author fsheridan
 */
public class Assessment {
    private int weighting;
    private String name;
    private String type;
    
    public Assessment(){
        weighting = 0;
        name = new String();
        type = new String();
    }
    
    public Assessment(int weighting, String name, String type){
        this.weighting = weighting;
        this.name = name;
        this.type = type;
    }

    public int getWeighting() {
        return weighting;
    }

    public void setWeighting(int weighting) {
        this.weighting = weighting;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    
}
