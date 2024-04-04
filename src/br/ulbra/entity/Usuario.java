
package br.ulbra.entity;


public class Usuario {
    private int pkIdUsu;
    private String nomeUsu;
    private String emailUsu;
    private String senhaUsu;
    
    public Usuario(){
        this.pkIdUsu=1;
        this.nomeUsu="betina nunes";
        this.emailUsu="borepeerere@a.com";
        this.senhaUsu="123";
    }

    public void setPkIdUsu(int pkIdUsu) {
        this.pkIdUsu = pkIdUsu;
    }

    public void setNomeUsu(String nomeUsu) {
        this.nomeUsu = nomeUsu;
    }

    public void setEmailUsu(String emailUsu) {
        this.emailUsu = emailUsu;
    }

    public void setSenhaUsu(String senhaUsu) {
        this.senhaUsu = senhaUsu;
    }

    public int getPkIdUsu() {
        return pkIdUsu;
    }

    public String getNomeUsu() {
        return nomeUsu;
    }

    public String getEmailUsu() {
        return emailUsu;
    }

    public String getSenhaUsu() {
        return senhaUsu;
    }

    @Override
    public String toString() {
        return "Usuario{" + "pkIdUsu=" + pkIdUsu + ", nomeUsu=" + nomeUsu + ", emailUsu=" + emailUsu + ", senhaUsu=" + senhaUsu + '}';
    }
    
}
