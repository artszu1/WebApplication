package com.artszu;

public class Members {
    
    private int ID;
    private String Imie;
    private String Nazwisko;
    private String Data_Urodzenia;
    private String Login;
    private String Haslo;
    private int ID_roli;
    private String Usuniety="NIE";
    
    public Members(){
        
    }
    
    public Members(String Imie, String Nazwisko, String Data_Urodzenia, String Login, String Haslo, int ID_roli){
        this.Imie=Imie;
        this.Nazwisko=Nazwisko;
        this.Data_Urodzenia=Data_Urodzenia;
        this.Login=Login;
        this.Haslo=Haslo;
        this.ID_roli=ID_roli;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getImie() {
        return Imie;
    }

    public void setImie(String Imie) {
        this.Imie = Imie;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public void setNazwisko(String Nazwisko) {
        this.Nazwisko = Nazwisko;
    }

    public String getData_Urodzenia() {
        return Data_Urodzenia;
    }

    public void setData_Urodzenia(String Data_Urodzenia) {
        this.Data_Urodzenia = Data_Urodzenia;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String Login) {
        this.Login = Login;
    }

    public String getHaslo() {
        return Haslo;
    }

    public void setHaslo(String Haslo) {
        this.Haslo = Haslo;
    }
    
    public int getID_roli() {
        return ID_roli;
    }

    public void setID_roli(int ID_roli) {
        this.ID_roli = ID_roli;
    }

    public String getUsuniety() {
        return Usuniety;
    }

    public void setUsuniety(String Usuniety) {
        this.Usuniety = Usuniety;
    }
    
    
}
