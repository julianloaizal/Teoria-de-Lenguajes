/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dronafd;
import javax.swing.JOptionPane;
/**
 *
 * @author Julián Loaiza
 */
public class DronAFD  {

    private int[][] matriz_transicion = {{4,1},{2,10},{3,10},{11,10},{7,5},
                                        {6,10},{11,10},{9,8},{11,10},{10,11},
                                        {10,10},{12,13},{14,15},{15,14},{17,16},
                                        {16,17},{10,18},{18,10},{10,10}};
    

    public boolean Resultado(String instruccion){
        int estado =0;
        //boolean resul = false;
        for(char entrada_caracter: instruccion.toCharArray()) {
            if(entrada_caracter != '0' && entrada_caracter !='1'){
            return false;
            //break;
            }
            estado = matriz_transicion[estado][Integer.parseInt(String.valueOf(entrada_caracter))];
        }
            if(estado == 18) {
               // JOptionPane.showMessageDialog(null,"Valido");
                return  true;
                
            }else {
                //JOptionPane.showMessageDialog(null,"Invalido");
                return false;
         
                
                   }
    }

    
}