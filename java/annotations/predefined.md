* built-in by Java SE API
* _Example:_
  * [`Override`](https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/lang/Override.html)
  * [`SuppressWarnings`](https://docs.oracle.com/en/java/javase/23/docs/api/java.base/java/lang/SuppressWarnings.html)

# annotation types / -- used by the -- Java Compiler

* _Example:_ | "java.lang"

## `@Deprecated`
* allows
  * indicating that marked element
    * is deprecated
    * should NOT be used
* 👀if a program use that element -> compiler -- generates a -- warning 👀
* recommendations
  * | that element, add `@deprecated` -- as -- commentary
    ```
    /**
    * @deprecated
    * explanation of why it was deprecated
    */
    <b>@Deprecated</b>
    static void deprecatedMethod() { }
    ```

## `@Override`
* allows
  * informing the compiler / element overrides an element / declared | superclass
  * preventing errors
    * == ⚠️if you override wrongly -> compiler -- generates an -- error ⚠️
```
@Override 
int overriddenMethod() { }
```

## `@SuppressWarnings` 
* allows
  * informing the compiler -- to suppress -- specific warnings
* 👀types of warnings 👀
  * `deprecation`
  * `unchecked`
    * uses
      * code / BEFORE appearing `generics`
* _Examples:_
  * _Example1:_ suppress a warning -- from -- using a deprecated method
    ```
    @SuppressWarnings("deprecation")
    void useDeprecatedMethod() {
      objectOne.deprecatedMethod();
    }
    ```
  * _Example2:_ suppress MULTIPLE categories
    ```
    @SuppressWarnings({"unchecked", "deprecation"})
    ```

## `@SafeVarargs`
* uses
  * 👀| method or constructor, -> code does NOT perform potentially unsafe operations | its `varargs` parameter 👀 
* -> `unchecked` warnings / related to `varargs` -- are -- suppressed

## `@FunctionalInterface` 
* requirements
  * | Java SE 8+
* [see Java Language Specification](https://docs.oracle.com/javase/specs/jls/se22/html/jls-9.html#jls-9.8)

# meta-annotations
* == annotations / apply | OTHER Annotations 
* _Example:_ | "java.lang.annotation"

## `@Retention`
* 👀== how to store the marked annotation 👀
* types
  * `RetentionPolicy.SOURCE`
    * | source level
      * -- ignored by the -- compiler
  * `RetentionPolicy.CLASS`
    * retained compiler | compile time
      * -- ignored by the -- JVM
  * `RetentionPolicy.RUNTIME`
    * retained by the JVM
      * -> can be used -- by the -- runtime environment

## `@Documented` 
* TODO:
<a class="APILink" target="_blank" href="https://docs.oracle.com/javase/8/docs/api/java/lang/annotation/Documented.html"><code>@Documented</code></a> annotation indicates that whenever the specified annotation is used those elements should be documented using the Javadoc tool. (By default, annotations are not included in Javadoc.) For more information, see the
<a class="OutsideLink" target="_blank" href="https://docs.oracle.com/javase/8/docs/technotes/guides/javadoc/index.html">Javadoc tools page</a>.</p>

## `@Target` 
<a class="APILink" target="_blank" href="https://docs.oracle.com/javase/8/docs/api/java/lang/annotation/Target.html"><code>@Target</code></a> annotation marks another annotation to restrict what kind of Java elements the annotation can be applied to. A target annotation specifies one of the following element types as its value:</p>
<ul>
<li><code>ElementType.ANNOTATION_TYPE</code> can be applied to an annotation type.</li>
<li><code>ElementType.CONSTRUCTOR</code> can be applied to a constructor.</li>
<li><code>ElementType.FIELD</code> can be applied to a field or property.</li>
<li><code>ElementType.LOCAL_VARIABLE</code> can be applied to a local variable.</li>
<li><code>ElementType.METHOD</code> can be applied to a method-level annotation.</li>
<li><code>ElementType.PACKAGE</code> can be applied to a package declaration.</li>
<li><code>ElementType.PARAMETER</code> can be applied to the parameters of a method.</li>
<li><code>ElementType.TYPE</code> can be applied to any element of a class.</li>
</ul>

## `@Inherited` 
<a class="APILink" target="_blank" href="https://docs.oracle.com/javase/8/docs/api/java/lang/annotation/Inherited.html"><code>@Inherited</code></a> annotation indicates that the annotation type can be inherited from the super class. (This is not true by default.) When the user queries the annotation type and the class has no annotation for this type, the class' superclass is queried for the annotation type. This annotation applies only to class declarations.</p>

## `@Repeatable` 
<a class="APILink" target="_blank" href="https://docs.oracle.com/javase/8/docs/api/java/lang/annotation/Repeatable.html"><code>@Repeatable</code></a> annotation, introduced in Java SE 8, indicates that the marked annotation can be applied more than once to the same declaration or type use. For more information, see
<a class="TutorialLink" target="_top" href="repeating.html">Repeating Annotations</a>.

