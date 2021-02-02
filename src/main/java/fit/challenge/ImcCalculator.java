package fit.challenge;

public class ImcCalculator{
    public static String calculate(double peso,double altura){
        String result="";
        double imc =peso/(altura*altura);
        if (imc>=30) {
            result= "Obesidade";
        }
        else if  (imc>=25) {
            result= "Sobrepeso";
        }
        else if (imc>=18.5) {
            result= "Normal";
        }
            else if  (imc<25) {
            result= "Magreza";
        }
            return result;
        }
    }
