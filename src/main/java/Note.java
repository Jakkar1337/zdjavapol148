import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Note { private static int nextId = 1;

    private int id;
    private String text;
    private List<String> tags;
    private Date creationDate;

    public Note(String text, List<String> tags) {
        this.id = nextId++;
        this.text = text;
        this.tags = tags;
        this.creationDate = new Date();
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public List<String> getTags() {
        return tags;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public boolean match(String filter) {
        if (text.contains(filter)) {
            return true;
        }

        for (String tag : tags) {
            if (tag.contains(filter)) {
                return true;
            }
        }

        return false;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", tags=" + tags +
                ", creationDate=" + creationDate +
                '}';
    }

    public static void main(String[] args) {
        List<String> tags = new ArrayList<>();
        tags.add("java");
        tags.add("programming");

        Note note = new Note("This is a Java programming note.", tags);
        System.out.println(note);

        System.out.println("Match 'Java': " + note.match("Java"));
        System.out.println("Match 'Python': " + note.match("Python"));
        System.out.println("Match 'programming': " + note.match("programming"));
    }

}
