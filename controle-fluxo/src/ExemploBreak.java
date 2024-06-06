public class ExemploBreak {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 5; numero ++){
            if(numero == 3)
            //  break; //para o processamento
            continue; //continua o processamento sem imprimir o 3 do if

             System.out.println(numero);
        }
       
    }
      
}
