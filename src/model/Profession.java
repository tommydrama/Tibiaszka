package model;

public enum Profession {
    Knight("Knight"),
    Palladin("model.Palladin"),
    Sorcerrer("Sorcerrer"),
    Druid("Druid");

    private String professionName;

    public Profession(String professionName) {
        this.professionName = professionName;
    }

    public String toString() {
        return professionName;
    }

    public void chooseProfession() {
        switch (professionName) {
            case "Knight":
                professionName = "Knight";
                break;

            case "Palladin":
                professionName = "Palladin";
                break;
            case "Sorcerrer":
                professionName = "Sorcerrer";
                break;
            case "Druid":
                professionName = "Druid";
        }
        System.out.println("Well, you are "+ professionName+ ". It's very dangerous profession.");
    }
}
