public class CabinCrewMember extends Person{

    CabinCrewMemberRank rank;
    public CabinCrewMember(String name, CabinCrewMemberRank rank) {
        super(name);
        this.rank = rank;
    }

    public CabinCrewMemberRank getRank(){
        return rank;
    }

    public String relayMessage(){
        return "The fasten seatbelt sign is on";
    }

}
