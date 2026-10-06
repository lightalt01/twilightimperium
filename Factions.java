public class Faction{
    private String faction;
    private String description;
    private ArrayList<String> technology;
    private ArrayList<String> faction_tech;
    // "faction_tech" is a list of unique faction techs but "technology"technology is the list that has the unlocked techs
    private ArrayList<String> abilities;
    private int commodities;
    private int flagship, war_sun, dreadnaught, carrier, cruiser, destroyer, fighter, pds, infantry, space_dock;

    public Faction(String faction_name, String faction_description, ArrayList<String> tech_input, ArrayList<String> faction_tech_input, ArrayList<String> faction_abilities, int num_commodities, ArrayList<int> ships){

    }



    @Override
    public String toString(){
        String output = "";
        output += "Faction: " + faction +"\n";
        output += "Abilities: " + abilities +"\n";
        output += "Technologies: " + technology +"\n";
        return output;
    }
}
