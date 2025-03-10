# Type annotations
* TODO:
Before the Java SE 8 release, annotations could only be applied to declarations. As of the Java SE 8 release, annotations can also be applied to any <em>type use</em>. This means that annotations can be used anywhere you use a type. A few examples of where types are used are class instance creation expressions (<code>new</code>), casts, <code>implements</code> clauses, and <code>throws</code> clauses. This form of annotation is called a <em>type annotation</em> and several examples are provided in
<a class="TutorialLink" target="_top" href="basics.html">Annotations Basics</a>.</p>
<p>
Type annotations were created to support improved analysis of Java programs way of ensuring stronger type checking. The Java SE 8 release does not provide a type checking framework, but it allows you to write (or download) a type checking framework that is implemented as one or more pluggable modules that are used in conjunction with the Java compiler.</p>
<p>
For example, you want to ensure that a particular variable in your program is never assigned to null; you want to avoid triggering a <code>NullPointerException</code>. You can write a custom plug-in to check for this. You would then modify your code to annotate that particular variable, indicating that it is never assigned to null. The variable declaration might look like this:</p>
<pre>
<strong>@NonNull</strong> String str;
</pre>
<p>
When you compile the code, including the <code>NonNull</code> module at the command line, the compiler prints a warning if it detects a potential problem, allowing you to modify the code to avoid the error. After you correct the code to remove all warnings, this particular error will not occur when the program runs.</p>
<p>
You can use multiple type-checking modules where each module checks for a different kind of error. In this way, you can build on top of the Java type system, adding specific checks when and where you want them.</p>
<p>

## \+ pluggable type checkers
* allows
  * writing code / stronger & less prone to error
<p>
In many cases, you do not have to write your own type checking modules. There are third parties who have done the work for you. For example, you might want to take advantage of the Checker Framework created by the University of Washington. This framework includes a <code>NonNull</code> module, as well as a regular expression module, and a mutex lock module. For more information, see the
<a class="OutsideLink" target="_blank" href="http://types.cs.washington.edu/checker-framework/">Checker Framework</a>.</p>

