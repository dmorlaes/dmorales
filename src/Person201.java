public class Person201 {

    private String myName;
    private double myLatitude;
    private double myLongitude;
    private String myPhrase;

    /**
     * Default constructor for Owen@Duke
     */
    public Person201(){
//        myName = "Owen";
//        myLatitude = 35.9312;
//        myLongitude = -79.0058;
//        myPhrase = "woto";
        this("Owen", 35.9312, -79.0058,"woto");
    }

    /**
     * Construct Person201 object with information
     * @param name typically first name of person
     * @param lat latitude, negative for southern hemisphere
     * @param lon longitude, negative for western hemisphere
     * @param phrase for person
     */
    public Person201(String name,
                     double lat, double lon,
                     String phrase) {
        myName = name;
        myLatitude = lat;
        myLongitude = lon;
        myPhrase = phrase;
    }

    /**
     * Returns the latitude as double, negative for below equator
     * @return this person's latitude
     */
    public double getLatitude(){
        return myLatitude;
    }

    /**
     * Returns the longitude as double, negative for west of prime meridian
     * @return this person's longitude
     */
    public double getMyLongitude(){
        return myLongitude;
    }


    /**
     * Returns String using E/W for longitude, N/S for latitude
     */
    @Override
    public String toString(){
        String lats = ""+Math.abs(myLatitude);
        if (myLatitude < 0) {
            lats += "S";
        }
        else {
            lats += "N";
        }
        String lons = ""+Math.abs(myLongitude);
        if (myLongitude < 0) {
            lons += "W";
        }
        else {
            lons += "E";
        }
        return String.format("%s %s @ %s %s",myName,myPhrase,lats,lons);
    }

    public static void main(String[] args) {
        Person201 p = new Person201();
        Person201 q =
                new Person201("Ricardo",-34.6037, -58.3816,"harambee");
        Person201 r =
                new Person201("Gelareh",-33.89,151.2,"affective");
        System.out.println(p);
        System.out.println(q);
        System.out.println(r);
    }
}
