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
public class RawSLTPCalc extends RawPipsCalc {

    @Override
    public void setPrice(double sPrice) {
        super.setPrice(sPrice); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double getPrice() {
        return super.getPrice(); //To change body of generated methods, choose Tools | Templates.
    }
    
    private int SL_Pips;
    private int TP_Pips;

    public void setSL_Pips(int slPips){
        SL_Pips = slPips;
    }
    
    public void setTP_Pips(int tpPips){
        TP_Pips = tpPips;
    }
    
    public int getSL_Pips(){
        return SL_Pips;
    }
    
    public int getTP_Pips(){
        return TP_Pips;
    }

    public double PointFourDecimals_Buy_SL_pips_Value(){
        double pipValue = getSL_Pips() * 0.0001;
        double Sl_Pip = getPrice() - pipValue;
        return Sl_Pip;
    }
    
    public double PointFourDecimals_Buy_TP_pips_Value(){
        double pipValue = getTP_Pips() * 0.0001;
        double Sl_Pip = getPrice() + pipValue;
        return Sl_Pip;
    }
    
    public double PointFourDecimals_Sell_SL_pips_Value(){
        double pipValue = getSL_Pips() * 0.0001;
        double TP_Pip = getPrice() + pipValue;
        return TP_Pip;
    }
    
    public double PointFourDecimals_Sell_TP_pips_Value(){
        double pipValue = getTP_Pips() * 0.0001;
        double TP_Pip = getPrice() - pipValue;
        return TP_Pip;
    }
    
    public double JPY_Buy_SL_pips_Value(){
        double pipValue = getSL_Pips() * 0.01;
        double Sl_Pip = getPrice() - pipValue;
        return Sl_Pip;
    }
    
    public double JPY_Buy_TP_pips_Value(){
        double pipValue = getTP_Pips() * 0.01;
        double Sl_Pip = getPrice() + pipValue;
        return Sl_Pip;
    }
    
    public double JPY_Sell_SL_pips_Value(){
        double pipValue = getSL_Pips() * 0.01;
        double TP_Pip = getPrice() + pipValue;
        return TP_Pip;
    }
    
    public double JPY_Sell_TP_pips_Value(){
        double pipValue = getTP_Pips() * 0.01;
        double TP_Pip = getPrice() - pipValue;
        return TP_Pip;
    }
    
    public double Gold_Silver_Buy_SL_pips_Value(){
        double pipValue = getSL_Pips() * 0.1;
        double Sl_Pip = getPrice() - pipValue;
        return Sl_Pip;
    }
    
    public double Gold_Silver_Buy_TP_pips_Value(){
        double pipValue = getTP_Pips() * 0.1;
        double Sl_Pip = getPrice() + pipValue;
        return Sl_Pip;
    }
    
    public double Gold_Silver_Sell_SL_pips_Value(){
        double pipValue = getSL_Pips() * 0.1;
        double TP_Pip = getPrice() + pipValue;
        return TP_Pip;
    }
    
    public double Gold_Silver_Sell_TP_pips_Value(){
        double pipValue = getTP_Pips() * 0.1;
        double TP_Pip = getPrice() - pipValue;
        return TP_Pip;
    }
    
}
