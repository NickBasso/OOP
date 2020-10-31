package base;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IllegalAccessException {
	    A a = new A("a");
	    B b = new B("a","b");
	    C c = new C("a", "b", "c");
	    D d = new D("a", "b", "c", "d");
	    E e = new E("a", "b", "c", "d", "e");
	    F f = new F("a", "b", "c", "d", "e", "f");
	    G g = new G("a", "b", "c", "d", "e", "f", "g");
	    H h = new H("a", "b", "c", "d", "e", "f", "g", "h");
	    I i = new I("a", "b", "c", "d", "e", "f", "g", "h", "i");
	    J j = new J("a", "b", "c", "d", "e", "f", "g", "h", "i", "j");

        ArrayList<Object> objects = new ArrayList<>();
        objects.add(a);
        objects.add(b);
        objects.add(c);
        objects.add(d);
        objects.add(e);
        objects.add(f);
        objects.add(g);
        objects.add(h);
        objects.add(i);
        objects.add(j);

        System.out.println("Instantiated objects' class name and all property fields (both inherited & declared):");
        for(Object obj: objects){
            /*Field[] fields = obj.getClass().getFields();

            System.out.print(obj.getClass().getName() + " class object fields: ");
            for(Field field: fields)
                System.out.print(field.getName() + " " + field.get(field));

            System.out.println();*/

            System.out.println(obj.toString());
        }

    }

    static class A {
        public String a;

        A(String a){
            this.a = a;
        }

        @Override
        public String toString(){
            StringBuilder result = new StringBuilder();
            String newLine = System.getProperty("line.separator");

            result.append( this.getClass().getName() );
            result.append( " Object {" );
            result.append(newLine);

            //determine fields declared in this class only (no fields of superclass)
            Field[] fields = this.getClass().getFields();

            //print field names paired with their values
            for ( Field field : fields  ) {
                result.append("  ");
                try {
                    result.append( field.getName() );
                    result.append(" = ");
                    //requires access to private field:
                    result.append( field.get(this) );
                } catch ( IllegalAccessException ex ) {
                    System.out.println(ex);
                }
                result.append(newLine);
            }
            result.append("}");

            return result.toString();
        }
    }

   static class B extends A {
        public String b;

        B(String a, String b){
            super(a);
            this.b = b;
        }
    }

   static class C extends B {
       public String c;

        C(String a, String b, String c){
            super(a, b);
            this.c = c;
        }
    }

   static class D extends C {
       public String d;

        D(String a, String b, String c, String d){
            super(a, b, c);
            this.d = d;
        }
    }

   static class E extends D {
       public String e;

        E(String a, String b, String c, String d, String e){
            super(a, b, c, d);
            this.e = e;
        }
    }

   static class F extends E {
       public String f;

        F(String a, String b, String c, String d, String e, String f){
            super(a, b, c, d, e);
            this.f = f;
        }
    }

   static class G extends F {
       public String g;

        G(String a, String b, String c, String d, String e, String f, String g){
            super(a, b, c, d, e, f);
            this.g = g;
        }
    }

   static class H extends G {
       public String h;

        H(String a, String b, String c, String d, String e, String f, String g, String h){
            super(a, b, c, d, e, f, g);
            this.h = h;
        }
    }

   static class I extends H {
       public String i;

        I(String a, String b, String c, String d, String e, String f, String g, String h, String i){
            super(a, b, c, d, e, f, g, h);
            this.i = i;
        }
    }

   static class J extends I {
       public String j;

        J(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j){
            super(a, b, c, d, e, f, g, h, i);
            this.j = j;
        }
    }
}
