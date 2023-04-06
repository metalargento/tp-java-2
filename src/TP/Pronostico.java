/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TP;

public class Pronostico{
    private char resultado;
    private Equipo equipo;
    private Partido partido;

    public Pronostico( Equipo equipo, Partido partido, char resultado) {
        this.resultado = resultado;
        this.equipo = equipo;
        this.partido = partido;
    }
    
    public Pronostico() {
        this.resultado = 0;
        this.equipo = new Equipo();
        this.partido = new Partido();
    }

    public char getResultado() {
        return resultado;
    }

    public void setResultado(char resultado) {
        this.resultado = resultado;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    @Override
    public String toString() {
        return "Pronostico{" + "resultado=" + resultado + ", equipo=" + equipo + ", partido=" + partido + '}';
    }
    
      /* public int puntos(){
           if (resultado == 'G')
               return 2;
           else if(resultado == 'E')
               return 1;
           else return 0;
           
                }*/
}


    
    
 

    
            
      
