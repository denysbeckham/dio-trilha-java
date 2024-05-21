public class BoletimEscolar {

    public static void main(String[] args) {
       int nota = 4;
        
       //exemplo usando condição ternária (if ?) (else :)
        // String resultado = nota >=7 ? "Aprovado" : "Reprovado";
        //     System.out.println(resultado);

        //exemplo mais avançado usando condição ternária
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";  
        System.out.println(resultado);

    }
    
}
