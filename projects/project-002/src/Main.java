import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author Esmaeil Sadeghi, 7/24/20 12:14 PM
 */
public class Main {

    public static void main(String[] args) {
        UserController userController = new UserController();
        Class aClass = UserController.class;
        Annotation[] annotations = aClass.getAnnotations();
        Method[] methods = aClass.getMethods(); // getMethod
        Field[] fields = aClass.getFields(); // getField
        Field[] fields2 = aClass.getDeclaredFields(); // getField
        Constructor[] constructors = aClass.getConstructors();
        for (Annotation annotation :annotations) {
            Path path = (Path)annotation;
            System.out.println(path.type());
            System.out.println(path.value());
            if(path.value().equals("/user")){
                userController.users();
            }
        }
    }
}
