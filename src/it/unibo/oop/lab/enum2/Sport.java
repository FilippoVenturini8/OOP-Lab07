/**
 * 
 */
package it.unibo.oop.lab.enum2;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {

    /*
     * TODO
     * 
     * Declare the following sports:
     * 
     * - basket
     * 
     * - volley
     * 
     * - tennis
     * 
     * - bike
     * 
     * - F1
     * 
     * - motogp
     * 
     * - soccer
     * 
     */
     BASKET(Place.INDOOR, 5, "BASKET"),
     VOLLEY(Place.INDOOR, 5, "BASKET"),
     TENNIS(Place.OUTDOOR, 2, "BASKET"),
     BIKE(Place.OUTDOOR, 1, "BASKET"),
     F1(Place.OUTDOOR, 1, "BASKET"),
     MOTOGP(Place.OUTDOOR, 1, "BASKET"),
     SOCCER(Place.OUTDOOR, 11, "BASKET");
    /*
     * TODO
     * 
     * [FIELDS]
     * 
     * Declare required fields
     */
     private final int nMembers;
     private String name;
     private final Place place;
    /*
     * TODO
     * 
     * [CONSTRUCTOR]
     * 
     * Define a constructor like this:
     * 
     * - Sport(final Place place, final int noTeamMembers, final String actualName)
     */
     private Sport(final Place place, final int noTeamMembers, final String actualName){
    	 this.place = place;
    	 this.nMembers = noTeamMembers;
    	 this.name = actualName;
     }
    /*
     * TODO
     * 
     * [METHODS] To be defined
     * 
     * 
     * 1) public boolean isIndividualSport()
     * 
     * Must return true only if called on individual sports
     * 
     * 
     * 2) public boolean isIndoorSport()
     * 
     * Must return true in case the sport is practices indoor
     * 
     * 
     * 3) public Place getPlace()
     * 
     * Must return the place where this sport is practiced
     * 
     * 
     * 4) public String toString()
     * 
     * Returns the string representation of a sport
     */
     public boolean isIndividualSport() {
    	 if(this.nMembers == 1) {
    		 return true;
    	 }
    	 return false;
     }
     
     public boolean isIndoorSport() {
    	 if(this.place == Place.INDOOR) {
    		 return true;
    	 }
    	 return false;
     }
     
     public Place getPlace() {
    	 return this.place;
     }
     
     public String toString() {
    	 return "Name :" + this.name + " Members: " + this.nMembers + " Place: " + this.place;
     }
}
