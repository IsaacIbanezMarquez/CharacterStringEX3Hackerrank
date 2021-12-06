

import java.io.*;
import java.util.*;




// Totes les vocals:

/* Donada una cadena, determina si apareixen totes les vocals. Si hi apareixen totes imprimim TRUE, sinó FALSE.

Input Format

Introduïm cadena de text fins a final de línia.

Constraints

No n'hi ha.

Output Format

{TRUE | FALSE}

Sample Input 0

aeiou
Sample Output 0

TRUE
Sample Input 1

Em sembla que en aquesta frase hi apareixen totes les vocals.
Sample Output 1

TRUE
Sample Input 2

Pero en aquesta no!
Sample Output 2

FALSE

 */


public class Solution
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine().toLowerCase();


        int a = palabra.indexOf('a');
        int e = palabra.indexOf('e');
        int i = palabra.indexOf('i');
        int o = palabra.indexOf('o');
        int u = palabra.indexOf('u');

        if (a  > -1 && e > -1 && i > -1 && o > -1 && u > -1)
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("FALSE");
        }


    }
}
