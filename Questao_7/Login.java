package Questao_7;

public class Login extends Sistema
{
    private int pos;

    //Construtor recebe o usuario e senha para efetuar o login, junto com um objeto sistema, que contem o sistema com os usuarios ja criados
    public Login(Sistema sis, String login, String senha){
        //Variavel de checagem
        boolean check = false;
        //Loop pelo vetor de usuarios no sistema. Caso algum desses usuarios seja igual ao passado como parametro para o construtor
        //Sai do laço.
        for(int i=0; i<sis.getLogin().length; i++){
            if (sis.getLogin()[i].equals(login) && sis.getSenha()[i].equals(senha)) {
                check = true;
                this.pos = i;
                break;
            }
        }
        //Caso a variavel de checagem ainda seja false, não encontraram o usuario, lança uma exceção de login.
        if(!check) throw new LoginFailedException("\nERRO: Usuário e/ou senha inválidos!\n");
    }

    public int getPos() {
        return pos;
    }
}
