import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CompareDates {

    public static void main(String[] args) {
        try {
            List<Event> events = new ArrayList<Event>(3);
            events.add(new Event(toDate("01/08/2014"), toDate("01/09/2014")));
            events.add(new Event(toDate("02/09/2014"), toDate("30/09/2014")));

            Date start = toDate("18/08/2014");
            Date end = toDate("30/08/2014");

            for (Event evt : events) {
                System.out.println(evt.conflicts(start, end));
            }

        } catch (ParseException exp) {
            exp.printStackTrace();
        }
    }

    public static Date toDate(String value) throws ParseException {
        return new SimpleDateFormat("yyyy-MM-dd").parse(value);
    }

    public static class Event {
        private Date startDate;
        private Date endDate;

        public Event(Date startDate, Date endDate) {
            this.startDate = startDate;
            this.endDate = endDate;
        }

        public boolean conflicts(Date start, Date end) {

            return start.equals(startDate) ||
                            start.equals(endDate) ||
                            end.equals(startDate) ||
                            end.equals(endDate) ||
                            (start.after(startDate) && start.before(endDate)) || 
                            (end.after(startDate) && end.before(endDate));

        }

    }

}