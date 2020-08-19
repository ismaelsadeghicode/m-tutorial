import java.util.List;

/**
 * @author Esmaeil Sadeghi, 7/24/20 12:20 PM
 */
@Path(value = "/user", type = "application/json")
public class UserController {
    public String name;
    private String lastName;
    protected String fathername;

    @GET
    public List<String> users(){
        return null;
    }

}
