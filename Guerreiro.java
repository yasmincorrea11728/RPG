public class Guerreiro{

    String nome;
    int força;
    int vida;
    int carisma;
    int agilidade;
    int destreza;
    int inteligencia;
    int estamina;
    int sorte;
    int resistencia;
    int mana;

    int atacar(int valorDado){
        int valorAtaque = 0;
        if(valorDado <  2){
            System.out.println("O Ataque falhou!!!");
        }else{
            valorAtaque = this.força+valorDado;
        }
        return valorAtaque;
 }
    void defender(int valorAtaque){
        if(valorAtaque <= this.resistencia){
            System.out.println("O Ataque foi defendido!!!");
        }else{
            int danoCausado = valorAtaque - this.resistencia;
            System.out.println("O dano causado foi de: " + danoCausado);
            this.vida -= danoCausado;
    }
  }
}