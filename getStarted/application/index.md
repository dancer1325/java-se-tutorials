* goal
  * how does "Hello World!" application work?
* "Hello World!" application
  * == source code comments + HelloWorldApp class definition + `main()`

# Source code comments
* -- ignored by the -- compiler
* types
  * `/* textIgnoredByTheCompiler */`
  * `/** documentation */`
    * -- used by the -- `javadoc` -- to prepare -- automatically generated documentation
  * `// textIgnoredTillEndOfLineByTheCompiler `

# Class definition
* `class someclassName { classCode }`

# `public static void main(String[] args){}`
* | Java application,
  * ⚠️MANDATORY ⚠️
* `String[] args`
  * 👀valid ANY OTHER name 👀
  * allows
    * passing information -- to -- your application
      * _Example:_ `java MyApp arg1 arg2`
      * -> affect application's operation / WITHOUT recompiling it
      * if you pass & application does NOT use them -> ALL fine
* [System](https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/lang/System.html)
