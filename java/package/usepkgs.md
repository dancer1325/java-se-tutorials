# Package members
* package members
  * := package's types
  * if you want to use a public one | outside its package -> you MUST do
    * refer -- via -- member's fully qualified name 
      * use cases
        * infrequent qualified names
    * import the package member
      * use cases
        * package member is used FREQUENTLY  & FEW package's members are imported
    * import the ENTIRE package
      * `import packageName.*;`
        * ⚠️NOT allowed patterns ⚠️ == ALL is imported
      * use cases
        * use ALL package's members
  * if you want to use a nested class | outside its package -> `import packageName.*;`
    * the key is `*`

# Hierarchies of Packages
* ❌NOT exist ❌ 
  * _Example:_ Java API's "java.awt.color" & "java.awt.font" are NOT included | "java.awt"
    * if you `import java.awt.*` -> NOT import "java.awt.color" NOR "java.awt.font"

# Name Ambiguities
* if package1's member's name == package2's member's name & BOTH packages are imported -> use it's qualified name

# `import static ...`
* allows
  * importing constants & static methods
* ALTERNATIVE to use member's fully qualified name
* use cases
  * FREQUENT access -- to -- constant & static methods
* recommendations
  * use VERY sparingly
