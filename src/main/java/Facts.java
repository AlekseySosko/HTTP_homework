import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class Facts {
    private final String id;
    private final String text;
    private final String type;
    private final String user;
    private final int upVotes;

    public Facts(
            @JsonProperty("id") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") int upVotes
            ) {
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upVotes = upVotes;
    }

    public int getUpVotes() {
        return upVotes;
    }

    @Override
    public String toString() {
        return "Facts{" +
                "\nid='" + id + '\'' +
                ",\n text='" + text + '\'' +
                ",\n type='" + type + '\'' +
                ",\n user='" + user + '\'' +
                ",\n upVotes=" + upVotes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Facts facts = (Facts) o;
        return upVotes == facts.upVotes && Objects.equals(id, facts.id) && Objects.equals(text, facts.text) && Objects.equals(type, facts.type) && Objects.equals(user, facts.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, text, type, user, upVotes);
    }
}
