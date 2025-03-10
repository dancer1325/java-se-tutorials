# annotation's use
```
// if annotation has NO element
@annotationName

// if annotation has elementS
@annotationName(element1="value1", element2="value2", ...)

// if there is 1! element / 's name == value  -> elementName can be omitted
@annotationName("valueForUniqueElementNamedValue")
```
* `@`
  * indicates to the compiler / it's an annotation

## WHERE to use annotations?
* declarations of
  * classes,
  * fields,
  * methods,
* | Java SE v8+, type annotations
  * class instance
  * Type cast
  * `implements`
  * `throws`
* TODO: 
<ul>
<li>Class instance creation expression:
<pre>
    new @Interned MyObject();
</pre>
</li>
<li>Type cast:
<pre>
    myString = (@NonNull String) str;
</pre>
</li>
<li><code>implements</code> clause:
<pre>
    class UnmodifiableList&lt;T&gt; implements
        @Readonly List&lt;@Readonly T&gt; { ... }
</pre>
</li>
<li>Thrown exception declaration:
<pre>
    void monitorTemperature() throws
        @Critical TemperatureException { ... }
</pre>
</li>
</ul>
