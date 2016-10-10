/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework5;

/**
 *
 * @author jose
 */
public class ResizableCircle extends GeometricCircle implements Resizable {
    
    public ResizableCircle(double radius)
    {
        super(radius);
    }
    
    @Override
    public void resize(int percent)
    {
     radius *= (percent *0.01);   
    }
}
