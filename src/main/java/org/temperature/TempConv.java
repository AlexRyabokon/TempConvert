package org.temperature;

public class TempConv {
    private double chislo;

    // getters and setters

    public double getChislo() {
        return chislo;
    }

    public void setChislo(double chislo) {
        this.chislo = chislo;
    }

    // Constructor

    public TempConv(double chislo, char idTemp) {
        this.chislo = chislo;
        this.countOfTemperatures(idTemp);
    }


    // MAIN LOGIC
    public void countOfTemperatures(char idTemp){
        switch (idTemp){

            case 'c':
                double resultFaren = (this.chislo * 9/5) + 32;
                double resultKalv = this.chislo + 273.15;
                System.out.println("K:" + resultKalv +  "  F:" + resultFaren);
                break;

            case 'f':
                double resultCelc = (this.chislo - 32)*5/9;
                double resultKalv1 = resultCelc + 273.15;
                System.out.println("C:" + resultCelc +  "  K:" + resultKalv1);
                break;

            case 'k':
                double resultCelc1 = this.chislo - 273.15;
                double resultFaren1 = (resultCelc1* 9/5) + 32;
                System.out.println("C:" + resultCelc1 +  "  F:" + resultFaren1);
                break;

            default:
                System.out.println("ВВЕДИТЕ ТИП КОНВЕРТИРУЕМОЙ ЕДИНИЦЫ ТЕМПЕРАТУРЫ, например: 26 c, 299 k, или 79 f (нижний регистр)");
        }
    }

}

