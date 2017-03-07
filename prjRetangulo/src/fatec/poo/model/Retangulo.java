package fatec.poo.model;

/**
 *
 * @author 0030481521018
 */
public class Retangulo {
    //sinal de - no diagrama de classe significa privado
    //SAO ATIBUTOS PRIVADO (RESTRITO)  DA CLASSE
    private double Altura;
    private double Base;
    
    //sinal de + no diagrama de classe significa public. OS METODOS GERALMENTE SAO PUBLICOS
    //OS METODOS ACESSAM DIRETAMENTE OS ATRIBUTOS E NAO A APLICAÇÃO
    public void setAltura (double a){
        Altura = a;
    }
    
    public void setBase (double b){
        Base = b;
    }
    
    public double CalcArea(){
        double Area;
        Area = Altura * Base;
        return (Area);
    }
    
    public double CalcPerimetro(){
        double Perimetro;
        Perimetro = 2*(Base + Altura);
        return (Perimetro);
    }
}
