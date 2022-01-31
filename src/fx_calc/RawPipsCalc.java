/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx_calc;

/**
 *
 * @author Emmynem
 */
public class RawPipsCalc {
    private int Pips;
    private double Price;
    
    public void setPips(int sPips){
        Pips = sPips;
    }
    
    public void setPrice(double sPrice){
        Price = sPrice;
    }
    
    public int getPips(){
        return Pips;
    }
    
    public double getPrice(){
        return Price;
    }
    
    public double PointFourDecimals_pipValue(){
        double pipValue = getPips() * 0.0001;
        double result = pipValue + Price;
        return result;
    }
    
    public double JPY_pipValue(){
        double pipValue = getPips() * 0.01;
        double result = pipValue + Price;
        return result;
    }
    
    public double Gold_Silver_pipValue(){
        double pipValue = getPips() * 0.1;
        double result = pipValue + Price;
        return result;
    }
    
}
