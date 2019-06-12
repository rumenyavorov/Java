//package OOP.OOPBasics.Polimorphism.Lab.Shapes;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//import java.lang.reflect.Field;
//import java.lang.reflect.Method;
//import java.lang.reflect.Modifier;
//import java.util.Optional;
//import java.util.stream.Stream;
//
//public class Main {
//
//    private static final String SHAPE_CLASS_NAME = "Shape";
//    private static final String METHOD_GETPERIMETER_NAME = "getPerimeter";
//    private static final String METHOD_CALCULATEPERIMETER_NAME = "calculatePerimeter";
//    private static final String METHOD_GETAREA_NAME = "getArea";
//    private static final String METHOD_CALCULATEAREA_NAME = "calculateArea";
//    private static final String FIELD_PERIMETER_NAME = "perimeter";
//    private static final String FIELD_AREA_NAME = "area";
//
//    @Test
//    public void shape() throws NoSuchFieldException {
//
//        Assert.assertTrue("Class 'Shape' not found", Classes.allClasses.containsKey(SHAPE_CLASS_NAME));
//
//        Class shape = Classes.allClasses.get(SHAPE_CLASS_NAME);
//
//        Method[] shapeMethods = shape.getDeclaredMethods();
//        Assert.assertTrue(
//                String.format("Method %s not present", METHOD_GETPERIMETER_NAME),
//                isMethodPresent(shapeMethods, METHOD_GETPERIMETER_NAME));
//
//        Assert.assertTrue(
//                String.format("Method %s not present", METHOD_CALCULATEPERIMETER_NAME),
//                isMethodPresent(shapeMethods, METHOD_CALCULATEPERIMETER_NAME));
//
//        Assert.assertTrue(
//                String.format("Method %s not present", METHOD_GETAREA_NAME),
//                isMethodPresent(shapeMethods, METHOD_GETAREA_NAME));
//
//        Assert.assertTrue(
//                String.format("Method %s not present", METHOD_CALCULATEAREA_NAME),
//                isMethodPresent(shapeMethods, METHOD_CALCULATEAREA_NAME));
//
//        Field fieldPerimeter = shape.getDeclaredField(FIELD_PERIMETER_NAME);
//        Field fieldArea = shape.getDeclaredField(FIELD_AREA_NAME);
//
//        Assert.assertTrue("Field 'perimeter' was not of type 'Double'",
//                fieldPerimeter.getType().equals(Double.class) || fieldPerimeter.getType().equals(double.class));
//
//        Assert.assertTrue("Field 'perimeter' access level was not 'private'",
//                Modifier.isPrivate(fieldPerimeter.getModifiers()));
//
//        Assert.assertTrue("Field 'area' was not of type 'Double'",
//                fieldArea.getType().equals(Double.class) || fieldArea.getType().equals(double.class));
//
//        Assert.assertTrue("Field 'area' access level was not 'private'",
//                Modifier.isPrivate(fieldArea.getModifiers()));
//    }
//
//    private boolean isMethodPresent(Method[] methods, String name) {
//        Optional<Method> method =  Stream.of(methods)
//                .filter(m -> m.getName().equals(name))
//                .findFirst();
//
//        return method.isPresent();
//    }
//}
