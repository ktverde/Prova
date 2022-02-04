package Questao_7;

//Classe para armazenar os vetores dos usuarios.
public class Sistema
{
    private String []login;
    private String []senha;

    //Cria os usuarios.
    public void cadastraUsuarios(){
        login = new String[3];
        senha = new String[3];

        login[0] = "Antonio";
        login[1] = "Jorge";
        login[2] = "Paulo";

        senha[0] = "123";
        senha[1] = "123";
        senha[2] = "123";
    }

//Gets
////////////////////////////////////////////////////////////////////////////////
    public String[] getLogin() { return login; }
    public String[] getSenha() { return senha; }

//Sets
////////////////////////////////////////////////////////////////////////////////
    public void setLogin(String[] login) { this.login = login; }
    public void setSenha(String[] senha) { this.senha = senha; }
}
