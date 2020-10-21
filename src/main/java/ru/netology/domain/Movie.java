import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Movie {
    private int id;
    private String name;
    private String imageUrl;
    private String genre;


    public Movie(int i, String gentlemen, String s, String actionMovie) {
    }
}
