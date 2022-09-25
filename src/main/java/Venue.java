public class Venue {

    private String venue;
    private String year;
    private String stadium;
    private int capacity;

    // Qatar 2022, Qatar Foundation Stadium, capacity: 40,000,

    public Venue(String venue, String year, String stadium, int capacity) {
        this.venue = venue;
        this.year = year;
        this.stadium = stadium;
        this.capacity = capacity;
    }

    Venue tournamentVenue = new Venue("Qatar", "2022", "Qatar Foundation Stadium", 400000);

    @Override
    public String toString() {
        return "Venue{" +
                "venue='" + venue + '\'' +
                ", year='" + year + '\'' +
                ", stadium='" + stadium + '\'' +
                ", capacity=" + capacity +
                ", tournamentVenue=" + tournamentVenue +
                '}';
    }
}
