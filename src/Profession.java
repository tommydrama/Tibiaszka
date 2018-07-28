public enum Profession {
    Knight("Knight"),
    Palladin("Palladin"),
    Sorcerrer ("Sorcerrer"),
    Druid ("Druid");

    private String professionName;

    private Profession(String professionName){
        this.professionName = professionName;
    }
    public String toString(){
        return professionName;
    }
}
