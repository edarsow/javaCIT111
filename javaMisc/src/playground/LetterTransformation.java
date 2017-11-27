/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playground;

import java.util.LinkedList;
/**
 *
 * @author calmp
 */
/*public class Alphabot {
    int ABC[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17,
            18, 19, 20, 21, 22, 23, 24, 25};
            Alphabet Alphabot = new Alphabet;
            Alphabot extends Alphabet;
} */
public class LetterTransformation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList change = new LinkedList();
        LinkedList change2 = new LinkedList();
        LinkedList change3 = new LinkedList();
        LinkedList change4 = new LinkedList();
        LinkedList change5 = new LinkedList();
        LinkedList change6 = new LinkedList();
        LinkedList change7 = new LinkedList();
        LinkedList change8 = new LinkedList();
        LinkedList change9 = new LinkedList();
            
            int XGB[] = {23, 6, 1, 21, 19, 24, 10, 11, 13, 14, 15, 17, 4, 18, 
                3, 5, 2, 9, 0, 25, 7, 8, 22, 20, 12, 16};
            
            int AZB[] = {0, 25, 1, 24, 2, 23, 3, 22, 4, 21, 5, 20, 6, 19, 7, 
                18, 8, 17, 9, 16, 10, 15, 11, 14, 12, 13};
            int ZYX[] = {25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12,
                11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
            int NMO[] = {13, 12, 14, 11, 15, 10, 16, 9, 17, 8, 18, 7, 19, 6, 20,
                5, 21, 4, 22, 3, 23, 2, 24, 1, 25, 0};
            int ACE[] = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 23, 21, 
                19, 17, 15, 13, 11, 9, 7, 5, 3, 1};
            int NIG[] = {13, 8, 6, 4, 17, 5, 0, 16, 14, 19, 21, 20, 2, 10, 18,
                7, 24, 3, 1, 9, 11, 12, 15, 18, 22, 23, 25};
            int ILO[] = {8, 11, 14, 21, 4, 24, 20, 0, 1, 2, 3, 5, 6, 7, 9, 10,
                12, 13, 15, 16, 17, 18, 19, 22, 23, 25};
            int ABC[] = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15,
                16, 17, 18, 19, 20, 21, 22, 23, 24, 25};
            
           
            System.out.println(ABC.length);
            System.out.println(AZB.length);
            
            for(int i = 65;i<91;i++){
                change.add ((char)i);
            }  
                System.out.println(change);
          
               
           
                
            for(int j=0; j<26; j++){
                change2.add((char)(XGB[j] +65));}
                System.out.println(change2);     
            for(int k=0; k<26; k++){
                change3.add((char)(AZB[k] +65));}
                System.out.println(change3);     
            for(int l=0; l<26; l++){
                change4.add((char)(ZYX[l] +65));}
                System.out.println(change4);     
            for(int m=0; m<26; m++){
                change5.add((char)(NMO[m] +65));}
                System.out.println(change5);     
            for(int n=0; n<26; n++){
                change6.add((char)(ACE[n] +65));}
                System.out.println(change6);     
            for(int o=0; o<26; o++){
                change7.add((char)(NIG[o] +65));}
                System.out.println(change7);     
            for(int p=0; p<26; p++){
                change8.add((char)(ILO[p] +65));}
                System.out.println(change8);   
                
            for(int q=0; q<26; q++){
                change9.add((char)(ABC[q] +65));}
                System.out.println(change8);   
                
                System.out.println(XGB.length + AZB.length +ZYX.length +
                        NMO.length + ACE.length + NIG.length +ILO.length + ABC.length);
                
    }//close main
}//close class