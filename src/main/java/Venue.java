public class Venue {

    private final String venue;
    private final String year;
    private final String stadium;
    private final int capacity;

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
