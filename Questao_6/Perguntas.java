package Questao_6;

public class Perguntas extends QuizManager
{
    private StringBuilder [] perguntas, respostas;
    private char [] correto;

    //Construtor
    public Perguntas(int opcao){
        super(opcao);
    }

    //Função que vai gerar as perguntas, dependendo do tipo de quiz que escolher
    public void questionsGenerator(){
        switch (super.getOpcao()) {
            case 1 -> {
                //Inicializa o vetor estaticamente
                this.perguntas = new StringBuilder[2];
                //Instanciando cada stringBuilder do array
                for(int i=0; i<2; i++) perguntas[i] = new StringBuilder();

                this.perguntas[0].insert(0,"De acordo com o cantor crazy frog, em sua canção, o que ele quer?");
                this.perguntas[1].insert(0, "Quantos anos eu tenho?");

                //Inicializa o vetor estaticamente
                this.respostas = new StringBuilder[2];
                //Instanciando cada stringBuilder do array
                for(int i=0; i<2; i++) respostas[i] = new StringBuilder();

                this.respostas[0].insert(0, "A) ablinbligblingblign blong\nB) ASdasldlqlelqwelqw\nC) Ablogbgolbgoalbofolai\nD) BINBIN\n");
                this.respostas[1].insert(0, "A) 17\nB) 16\nC) 19\nD) 20\n");

                //Inicializa o vetor estaticamente
                this.correto = new char[2];
                this.correto[0] = 'D';
                this.correto[1] = 'D';
            }
            case 2 -> {
                //Inicializa o vetor estaticamente
                this.perguntas = new StringBuilder[3];
                //Instanciando cada stringBuilder do array
                for(int i=0; i<3; i++) perguntas[i] = new StringBuilder();

                perguntas[0].insert(0, "");
                perguntas[1].insert(0, "Um ser humano tem, em média, quantos fios de cabelos?");
                perguntas[2].insert(0, "Qual dos animais abaixo é mais rápido?");

                //Inicializa o vetor estaticamente
                this.respostas = new StringBuilder[3];
                //Instanciando cada stringBuilder do array
                for(int i=0; i<3; i++) respostas[i] = new StringBuilder();

                respostas[0].insert(0, "A) Terra\nB) Jupiter\nC) Saturno\nD) Urano\n");
                respostas[1].insert(0, "A) Cerca de 1000\nB) Cerca de 10.000\nC) Cerca de 100.000\nD) Cerca de 1.000.000\n");
                respostas[2].insert(0, "A) Gato Doméstico\nB) Elefante\nC) Cobra\nD) Girafa\n");

                //Inicializa o vetor estaticamente
                correto = new char[3];
                correto[0] = 'B';
                correto[1] = 'C';
                correto[2] = 'A';
            }
            case 3 -> {
                //Inicializa o vetor estaticamente
                this.perguntas = new StringBuilder[5];
                //Instanciando cada stringBuilder do array
                for(int i=0; i<5; i++) perguntas[i] = new StringBuilder();

                perguntas[0].insert(0, "Qual o animal mais pesado do mundo?");
                perguntas[1].insert(0, "Em que parte do corpo humano você encontra uma amostra completa do seu DNA?");
                perguntas[2].insert(0, "O japão é o país que possui a maior comunidade japonesa do mundo. Além do Japão, qual o país está em segundo lugar, com mais japoneses vivendo em seu território?");
                perguntas[3].insert(0, "Na sexta-feira da lua nova do mês de Moharram, no vigésimo ano da Hégira, o general Amr Ibn al-As, o emir dos agareus, conquistava Alexandria, no Egito. Em qual ano isso ocorreu (Calendário cristão)?");
                perguntas[4].insert(0, " A expansão do cristianismo foi marcada por uma série de adaptações em que as divindades, festas e mitos das religiões pagãs foram incorporados ao universo cristão. Inclusive: ");

                //Inicializa o vetor estaticamente
                this.respostas = new StringBuilder[5];
                //Instanciando cada stringBuilder do array
                for(int i=0; i<5; i++) respostas[i] = new StringBuilder();

                respostas[0].insert(0, "A) Baleia Branca\nB) Baleia azul\nC) Alce gigante\nD) Touro enorme\n");
                respostas[1].insert(0, "A) Nas unhas\nB) Nos dentes\nC) Nos cabelos\nD) Na saliva\n");
                respostas[2].insert(0, "A) Canadá\nB) Brasil\nC) Alemanha\nD) Estados Unidos\n");
                respostas[3].insert(0, "A) 22 de dezembro de 640\nB) 24 de novembro de 860\nC) 07 de maio de 901\nD) 31 de janeiro de 640\n");
                respostas[4].insert(0, "A) Torneio de bigas\nB) Ação de Graças\nC) Pascoa\nD) Papai Noel\n");

                //Inicializa o vetor estaticamente
                correto = new char[5];
                correto[0] = 'B';
                correto[1] = 'C';
                correto[2] = 'B';
                correto[3] = 'A';
                correto[4] = 'D';
            }
        }

    }

    //Gets
    /////////////////////////////////////////////////////////////
    public StringBuilder [] getPerguntas() { return perguntas; }

    public StringBuilder []getRespostas() { return respostas; }

    public char []getCorreto() { return correto; }
}
