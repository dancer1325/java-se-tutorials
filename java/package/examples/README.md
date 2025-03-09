# Goal
* comprehend [package's ideas](../packages.md)

# How has it been created?
* [source file | directory / 's name -- reflects the -- package name](../managingfiles.md)
  * _Example:_ "Main.java"
    * FULL package name "example.Main" -> place | "example/"
* test `CLASSPATH`
  * `export CLASSPATH=$HOME/Projects/java-se-tutorials/java/package/examples/classes`
    * Problems:
      * Problem1: Why does it NOT generate files | classes?
        * Attempt1: `export CLASSPATH=./classes`
        * Solution: TODO:

# How to run locally?
* `javac Main.java`
  * Problems:
    * Problem1: "package graphics does not exist"
      * Solution: `javac graphics/*.java humanBeing/*.java spotshape/*.java example/Main.java`
* `java example.Main`
