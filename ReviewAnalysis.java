import java.util.ArrayList;

public class ReviewAnalysis {
    private Review[] allReviews;

    public ReviewAnalysis() {}
    public ReviewAnalysis(Review[] rs) {
        allReviews = rs;
    }

    public double getAverageRating() {
        double total = 0.0;
        for (Review r : allReviews) { 
            total += r.getRating();
        }
        return total/allReviews.length;
    }
    
    public ArrayList<String> collectComments() {
        ArrayList<String> comments = new ArrayList<String>();
        int count = 0;
        for (Review r : allReviews) {
            if (r.getComment().contains("!")) {
                comments.add(count + "-" + r.getComment() + getEnd(r.getComment()));
            }
            count++;
        }
        return comments;
    }

    public char getEnd(String str) {
        if(str.charAt(str.length()-1)=='!' || str.charAt(str.length()-1)=='.') return 0;
        else return '.';

    }
}