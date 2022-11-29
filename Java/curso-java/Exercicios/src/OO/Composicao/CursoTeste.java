package OO.Composicao;

public class CursoTeste {
    public static void main(String[] args) {
        
        Aluno aluno1 = new Aluno("Maria");
        Aluno aluno2 = new Aluno("José");
        Aluno aluno3 = new Aluno("Leandro");
        Aluno aluno4 = new Aluno("Juarez");

        Curso curso1 = new Curso("Artes");
        Curso curso2 = new Curso("SAP");
        Curso curso3 = new Curso("DevOps");
        Curso curso4 = new Curso("Literatura");


        curso1.addAluno(aluno1);
        curso1.addAluno(aluno2);

        curso4.addAluno(aluno3);
        curso2.addAluno(aluno4);

        aluno1.addCurso(curso3);
        aluno2.addCurso(curso3);
        aluno3.addCurso(curso3);
        aluno4.addCurso(curso3);


        for(Aluno aluno: curso1.alunos){
            System.out.println();
            System.out.println("Meu nome é " + aluno.nome);
            System.out.println("E eu estou matriculado(a) no curso " + curso3.nome);
            System.out.println();
        }

    }
}
