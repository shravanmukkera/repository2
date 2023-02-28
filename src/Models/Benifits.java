package Models;

public class Benifits
{

    //shravan
    private int benifitId;
    private String benifitName;
    private String benifitDesc;

    public Benifits(int benifitId, String benifitName, String benifitDesc) {
        this.benifitId = benifitId;
        this.benifitName = benifitName;
        this.benifitDesc = benifitDesc;
    }

    public int getBenifitId() {
        return benifitId;
    }

    public void setBenifitId(int benifitId) {
        this.benifitId = benifitId;
    }

    public String getBenifitName() {
        return benifitName;
    }

    public void setBenifitName(String benifitName) {
        this.benifitName = benifitName;
    }

    public String getBenifitDesc() {
        return benifitDesc;
    }

    public void setBenifitDesc(String benifitDesc) {
        this.benifitDesc = benifitDesc;
    }
}
