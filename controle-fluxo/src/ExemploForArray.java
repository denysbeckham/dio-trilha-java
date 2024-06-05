public class ExemploForArray {
    
    public static void main(String[] args) {

        //em arrays o indice de elementos começa com zero 0
        String alunos [] = {"FELIPE", "DENYS", "LAURA", "JOÃO"};

        //forma de interagir com array
        for(String aluno : alunos){
            System.out.println("Nome do Aluno: " + aluno);
        }

        // for (int x=0; x<alunos.length; x++){
        //     System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
        // }
    }
}
