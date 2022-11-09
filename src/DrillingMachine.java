import java.util.Random;
public class DrillingMachine {
    Random rand = new Random();
    private int watt = rand.nextInt(800,2000), age = rand.nextInt(0,10);
    private String name;
    private double price = rand.nextDouble(50,500);
    private boolean broken = false;

    public DrillingMachine(){}

    public void becomeBroken(){
        broken = true;
    }
    public void repair(){
        if(broken){
            broken = false;
            price /= 2;
        }
    }
    public void aging(){
        age += 1; if(age >= 10) {
            broken = true;
        }
    }
    public void reactOnHighDemand(){
        price *= 1.25;
    }
    public void setBroken(boolean isBroken){
        broken = isBroken;
    }
    public void increasePrice(double amount){
        price += amount;
    }
    public void changePower(int watt){
        this.watt += watt;
        if(watt > 100){
            price *= 1.05;
        }else if(watt < 0){
            price *= 0.9;
        }
    }
    public double getPrice(){
        return price;
    }
    public boolean isInexpensive(){
        if(watt > 500 && price < 80){
            return true;
        }
        return false;
    }
    public double getPricePerWatt(){
        return price/watt;
    }
    public boolean increasePriceByPercentage(double percentage){
        if(percentage > 0){
            price *= 1 + percentage;
        }
        if(price > 100){
            return true;
        }
        return false;
    }
    public boolean repair2(){
        if(broken){
            broken = false;
            return true;
        }
        return false;
    }
    public String getInfo(){
        return "JETZT NEU! DER NEUE " + name + " FÜR NUR " + (double)((int)(price*100)) / 100 + "€! " +
                "KEIN MODELL IST BESSER ALS UNSERER, WEIL DIESER EINE LEISTUNG VON " + watt + " WATT HAT UND NUR "
                + age + " JAHRE ALT IST! DIES IST EIN MUSS FÜR ALLE MENSCHEN MIT EINEM LEBEN! " +
                "*dieses Angebot gilt nur für leute mit wohnsitz oder gewöhnlichem aufenthaltsort in Mecklemburg-Vorpommern*";
    }
}
