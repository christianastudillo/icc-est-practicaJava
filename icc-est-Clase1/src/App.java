public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        String cadena = "Hola mundo";
        int edad = 10;
        System.out.println(cadena);
        System.out.print("Tamano de la cadena: ");
        System.out.println(cadena.length());
        
        System.out.println(cadena.split(" ")[0]);

        for (int i = 0; i < cadena.length() ; i++ ) {
            
            System.out.print(cadena.charAt(i));
            if (i < cadena.length() - 1) {
                System.out.print("-"); 
                
            }
        }
        System.out.println();
        //contar palabras
        System.out.println("Cantidad de palabras: ");
        int palabras = cadena.split(" ").length;
        System.out.println(palabras);

        //contar cuantas a hay en la cadena
        System.out.println("Cantidad de a: ");
        int letra = cadena.split("a",-1).length-1;
        System.out.println(letra);

    }
}
