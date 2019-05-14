/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructural.bridge;

/**
 *
 * @author davidvargas
 */
public class EstructuralBridge {

    
    public static void main(String[] args)
    {
        // Crear un objeto de tipo 'AbstraccionRefinada' indicándole un 'ImplementadorConcreto'
        ElaborarAlimento lasagna = new ElaborarLasagna( new Carne() );
        lasagna.obtener();
        // Ahora le indicamos que use otra implementación para obtener la de verduras
        lasagna.setImplementador( new Verduras() );
        lasagna.obtener();
    }
}
    

