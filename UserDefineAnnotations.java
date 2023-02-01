import java.lang.annotation.Annotation;

@interface MyAnno
{
String name();

/*String project();
String date();
String version() default "13"*/
}

//@MyAnno(name="Muskan",project="Bank",date="2/04/2002")
@MyAnno(name="Muskan")
public class UserDefineAnnotations
{

@MyAnno(name="Muskan")
int data;

@MyAnno(name="Muskan")
public static void main(@MyAnno(name="Muskan") String[]args)
{
@MyAnno(name="Muskan")
int x=10;
System.out.println(x);
}
}