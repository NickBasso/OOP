package base;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    @Override
    public String toString() {
        return "Main{}";
    }

    public static void main(String[] args) throws IllegalAccessException {
	    A a = new A("a", new X("X"));
	    B b = new B("a","b");
	    C c = new C("a", "b", "c");
	    D d = new D("a", "b", "c", "d");
	    E e = new E("a", "b", "c", "d", "e");
	    F f = new F("a", "b", "c", "d", "e", "f");
	    G g = new G("a", "b", "c", "d", "e", "f", "g");
	    H h = new H("a", "b", "c", "d", "e", "f", "g", "h");
	    I i = new I("a", "b", "c", "d", "e", "f", "g", "h", "i");
	    J j = new J("a", "b", "c", "d", "e", "f", "g", "h", "i", "j");
        //System.out.println(j.funct());

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
        for(Object obj: objects)
            System.out.println(obj.toString());
    }

    static class A {
        protected String a;
        protected X x = new X("x A");

        A(String a, X x){
            this.a = a;
        }

        /*
        // get all public & protected fields of a given class and its superclasses
        List<Field> getAllFields(Class obj) {
            if (obj == null)
                return Collections.emptyList();

            List<Field> res = new ArrayList<>(getAllFields(obj.getSuperclass()));
            List<Field> filteredFields = Arrays.stream(obj.getDeclaredFields())
                    .filter(f -> Modifier.isPublic(f.getModifiers()) || Modifier.isProtected(f.getModifiers()))
                    .collect(Collectors.toList());

            res.addAll(filteredFields);

            return res;
        }

        @Override
        // return all public & protected fields of a given class and its superclasses as a String
        public String toString(){
            StringBuilder result = new StringBuilder();
            String newLine = System.getProperty("line.separator");

            result.append( this.getClass().getName() );
            result.append( " Object {" );
            result.append(newLine);

            //determine fields declared in this class only (no fields of superclass)
            Field[] fields = this.getClass().getFields();
            List<Field> fieldss = getAllFields(this.getClass());

            //print field names paired with their values
            for ( Field field : fieldss  ) {
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
        */

        @Override
        public String toString() {
            return "A{" +
                    "a='" + a + '\'' +
                    ", x=" + x +
                    '}';
        }
    }

   static class B extends A {
        protected String b;

        B(String a, String b){
            super(a, new X(new String("X")));
            this.b = b;
        }

       @Override
       public String toString() {
           return "B{" +
                   "b='" + b + '\'' +
                   "} " + super.toString();
       }
   }

   static class C extends B {
       protected String c;

        C(String a, String b, String c){
            super(a, b);
            this.c = c;
        }

       @Override
       public String toString() {
           return "C{" +
                   "c='" + c + '\'' +
                   "} " + super.toString();
       }
   }

   static class D extends C {
       protected String d;
       protected X x = new X("x D");

       D(String a, String b, String c, String d){
            super(a, b, c);
            this.d = d;
       }

       @Override
       public String toString() {
           return "D{" +
                   "d='" + d + '\'' +
                   ", x=" + x +
                   "} " + super.toString();
       }
   }

   static class E extends D {
       protected String e;

       E(String a, String b, String c, String d, String e){
            super(a, b, c, d);
            this.e = e;
        }

       @Override
       public String toString() {
           return "E{" +
                   "e='" + e + '\'' +
                   "} " + super.toString();
       }
   }

   static class F extends E {
       protected String f;

        F(String a, String b, String c, String d, String e, String f){
            super(a, b, c, d, e);
            this.f = f;
        }

       @Override
       public String toString() {
           return "F{" +
                   "f='" + f + '\'' +
                   "} " + super.toString();
       }
   }

   static class G extends F {
       protected String g;

        G(String a, String b, String c, String d, String e, String f, String g){
            super(a, b, c, d, e, f);
            this.g = g;
        }

       @Override
       public String toString() {
           return "G{" +
                   "g='" + g + '\'' +
                   "} " + super.toString();
       }
   }

   static class H extends G {
       protected String h;
       private X x = new X(new String("x H"));

        H(String a, String b, String c, String d, String e, String f, String g, String h){
            super(a, b, c, d, e, f, g);
            this.h = h;
        }

       @Override
       public String toString() {
           return "H{" +
                   "h='" + h + '\'' +
                   ", x=" + x +
                   "} " + super.toString();
       }
   }

   static class I extends H {
       protected String i;

        I(String a, String b, String c, String d, String e, String f, String g, String h, String i){
            super(a, b, c, d, e, f, g, h);
            this.i = i;
        }

       @Override
       public String toString() {
           return "I{" +
                   "i='" + i + '\'' +
                   "} " + super.toString();
       }
   }

   static class J extends I {
       protected String j;

       J(String a, String b, String c, String d, String e, String f, String g, String h, String i, String j) {
           super(a, b, c, d, e, f, g, h, i);
           this.j = j;
       }

       @Override
       public String toString() {
           return "J{" +
                   "j='" + j + '\'' +
                   "} " + super.toString();
       }

       /*public String funct(){
           return this.x + " " + this.b + " " + this.d + " " + this.h + " " +  this.j;
       }*/
   }

   static class X {
       private String name;

       X(String name){
           this.name = name;
       }

       protected String getName(){
           return this.name;
       }

       @Override
       public String toString() {
           return "X{" +
                   "name='" + name + '\'' +
                   '}';
       }
   }
}
