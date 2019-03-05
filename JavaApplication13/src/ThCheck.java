
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alessandro
 */
public class ThCheck {

    private CcondividiDati ptrDati;

    public ThCheck(CcondividiDati ptrDati) {
        this.ptrDati = ptrDati;
    }

    public void run() {
        try {
            ptrDati.WaitCh();
            while (ptrDati.getContinua()) {
                
                if (ptrDati.getC1() == 50) {
                    ptrDati.setContinua(false);
                }
                if (ptrDati.getC2() == 50) {
                    ptrDati.setContinua(false);
                    
                }
                if (ptrDati.getC3() == 50) {
                    ptrDati.setContinua(false);
                    
                }
                if (ptrDati.getC4() == 50) {
                    ptrDati.setContinua(false);
                    
                }
                if (ptrDati.getC5() == 50) {
                    ptrDati.setContinua(false);
                    
                }
            }
            ptrDati.SignalCh();
        } catch (InterruptedException ex) {
            Logger.getLogger(ThCheck.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
