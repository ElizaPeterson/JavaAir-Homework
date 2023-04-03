public class Pilot extends Person{

    CabinCrewMemberRank rank;
    private String pilotLicence;

    public Pilot(String name, CabinCrewMemberRank rank, String pilotLicence) {
        super(name);
        this.rank = rank;
        this.pilotLicence = pilotLicence;
    }

    public CabinCrewMemberRank getRank(){
        return rank;
    }

    public String fly(){
        return "Plane go brrrr";
    }

    public String getPilotLicence() {
        return pilotLicence;
    }
}
