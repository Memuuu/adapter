package adapter;

public class Adapter extends Sql{
    private Oracle oracle;
    private String ad;

    public Oracle getOracle() {
        return oracle;
    }

    public void setOracle(Oracle oracle) {
        this.oracle = oracle;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public Adapter(){
        oracle = new Oracle();
    }
   
    public void veritabaniSorgu(int TC){
        oracle.veritabaniSorgu(TC,ad);
    }
}
