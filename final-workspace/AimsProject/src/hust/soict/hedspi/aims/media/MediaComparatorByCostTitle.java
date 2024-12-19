package hust.soict.hedspi.aims.media;

import java.util.Comparator;

public class MediaComparatorByCostTitle implements Comparator<Media> {
    @Override
    public int compare(Media m1, Media m2) {
        // So sánh theo cost trước (giảm dần)
        int costComparison = Float.compare(m2.getCost(), m1.getCost());
        if (costComparison != 0) {
            return costComparison;
        }
        // Nếu cost giống nhau, so sánh theo title (alphabetical)
        return m1.getTitle().compareToIgnoreCase(m2.getTitle());
    }
}
