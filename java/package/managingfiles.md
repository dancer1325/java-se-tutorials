* ⚠️MANY implementations of the Java platform -- rely on -- hierarchical file systems ⚠️
  * Reason: 🧠 manage source & class files 🧠
  * 👀requirements 👀
    * type name (class, interface, enumeration, or annotation type) == source file name
      * _Example:_ 
        ```title=Rectangle.java
        package graphics;
        public class Rectangle {
           ... 
        }
        ```
    * source file | directory / 's name -- reflects the -- package name
      * _Example:_ PREVIOUS "Rectangle.java" | "/graphics/Rectangle.java"
      * Reason: 🧠`javac` -- generate the -- "class" / -- reflects the -- package name
        * _Example:_ PREVIOUS "Rectangle.java", `javac Rectangle.java` -- generates -- | "graphics.Rectangle.class"  
* ❌Java programming Language Specification -- do NOT require -- hierarchical file ❌
* 👀".class"' path OR 👀class path 👀 
  * -- can be != -- ".java"'s path 👀
    * _Example:_ 
      * "\sources\com\example\graphics\Rectangle.java"
      * "\classes\com\example\graphics\Rectangle.class"
    * allows
      * giving "classes\" WITHOUT revealing your sources
      * compiler & JVM -- can find -- ALL types / used by your program
  * if you want to modify -> set `CLASSPATH` system variable / 
    * -- used by -- `javac` & JVM
    * class path ==  "`CLASSPATH`.packageName"
      * _Example:_ 
        * `export CLASSPATH=$HOME/Projects/java-se-tutorials/java/package/examples/classes`
