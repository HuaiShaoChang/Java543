import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class UnnamedClass {

    public static Set<Class<?>> findAllInterfaces(Class<?> class_) {
        Set<Class<?>> set = new LinkedHashSet<>();
        if (class_ != null) {
            set.addAll(Arrays.asList(class_.getInterfaces()));
            if (class_.getSuperclass() != null)
                set.addAll(findAllInterfaces(class_.getSuperclass()));
        }
        return set;
    }

    public static Set<Class<?>> findAllClasses(Class<?> class_) {
        Set<Class<?>> set = new LinkedHashSet<>();
        if (class_ != null) {
            set.add(class_);
            if (class_.getSuperclass() != null)
                set.addAll(findAllClasses(class_.getSuperclass()));
        }
        return set;
    }
}
