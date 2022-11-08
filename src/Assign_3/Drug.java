package Assign_3;

public class Drug {

    private String   GenericName;
    private String   SMILES;
    private String   drugBankID;
    private String   url;
    private String   drugGroups;
    private double      score;

    public Drug(String GenericName,String SMILES,String drugBankID,String url,String drugGroups,double score){

        this.GenericName=GenericName;
        this.SMILES=SMILES;
        this.drugBankID=drugBankID;
        this.url=url;
        this.drugGroups=drugGroups;
        this.score=score;

    }


    public String getGenericName() {
        return GenericName;
    }

    public String getSMILES() {
        return SMILES;
    }

    public int getID(){
        int key;
        String temp="";

        for (int i=2; i<drugBankID.length();i++){

            temp+=drugBankID.charAt(i);

        }
        key= Integer.parseInt(temp);
        return key;
    }

    public String getUrl() {
        return url;
    }

    public String getDrugGroups() {
        return drugGroups;
    }

    public double getScore() {
        return score;
    }

    public void displayDrug(){
        System.out.println(GenericName+"\t"+SMILES+"\t"+drugBankID+"\t"+url+"\t"+drugGroups+"\t"+score);
    }

    public String returnDrug(){
        return (GenericName+"\t"+SMILES+"\t"+drugBankID+"\t"+url+"\t"+drugGroups+"\t"+score);
    }

}
