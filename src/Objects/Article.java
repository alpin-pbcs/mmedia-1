package Objects;

/**
 * Created by Sebastian on 05.05.14.
 */
public class Article {

    private int iArtID;
    private String sBez;
    private int iDelStat;
    private float fPrice;



    public void Article(){
    }



    public String ToString(){
        String result;
        result = this.iArtID + " " + this.sBez + " " + this.iDelStat + " " + this.fPrice;

        return result;
    }



    public int getiArtID() {
        return iArtID;
    }

    public void setiArtID(int iArtID) {
        this.iArtID = iArtID;
    }

    public String getsBez() {
        return sBez;
    }

    public void setsBez(String sBez) {
        this.sBez = sBez;
    }

    public int getiDelStat() {
        return iDelStat;
    }

    public void setiDelStat(int iDelStat) {
        this.iDelStat = iDelStat;
    }

    public float getFprice() {
        return fprice;
    }

    public void setFprice(float fprice) {
        this.fprice = fprice;
    }
}
