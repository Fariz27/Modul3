/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modul3;

/**
 *
 * @author Fariz
 */
public class Gajah {
     public static void testClassMethod() {
        System.out.println("The Class Method in Hewan ... ");
    }

    public void testInstanceMethod() {
        System.out.println("The Instance Method in Gajah ... ");
    }

    public static void main(String[] args) {
        Gajah myGajah = new Gajah();
        Gajah myHewan = myGajah;
        Hewan.testClassMethod();
        myHewan.testInstanceMethod();
    }
    
}

