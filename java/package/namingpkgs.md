* 👀if className1 == className2 -> MUST be | DIFFERENT packages 👀 
* FULLY qualified name
  * 👀== "packageName.className" 👀
  * _Example:_ "Rectangle.java" -- `graphics.Rectangle`

# Package naming conventions
* ALL lower case / -- avoid conflict with the -- classNames or interfaceName
* companies' internet domain names 
  * == reversed package name == "className.packageName" 
    * _Example:_ "com.example.mypackage" ==
      * packageName "mypackage"
      * className "example.com"
    * ⚠️exceptions ⚠️
      * domain name / contains a `-` OR OTHER special character
      * package name / 
        * -- begins with a -- digit OR other character
        * -- contains a -- reserved Java keyword 
  * if there are name collisions -> include 
    * region or
      * _Example:_ "com.example.region.mypackage"
    * project name 
      * _Example:_ "com.example.projectName.mypackage"
* built-in Java language's packages
  * "java."
  * "javax."
* add an `_`
  * _Example:_
    * `hyphenated-name.example.org` 
      * _Example:_ org.example.hyphenated_name  
    * `example.int` 
      * _Example:_ int_.example 
    * `123name.example.com`
      * _Example:_ com.example._123name
