/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geometric;

/**
 *
 * @author jose
 */
public class ResizableCircle extends Circle implements Resizable {
    
    public ResizableCircle(double radius)
    {
        super(radius);
    }
    
    public void resize(int percent)
    {
        radius = radius *(1+ (percent/100));
        
    }
    
}
