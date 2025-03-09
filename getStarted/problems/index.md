# Compiler Problems
## COMMON Error Messages | Microsoft Windows Systems
* TODO:
<p><code><strong>&#39;javac&#39; is not recognized as an internal or external command, operable program or batch file</strong></code></p>
<p>If you receive this error, Windows cannot find the compiler (<code>javac</code>).</p>
<p>Here&#39;s one way to tell Windows where to find <code>javac</code>. Suppose you installed the JDK in <code>C:\jdk1.8.0</code>. At the prompt you would type the following command and press  Enter:</p>
<div class="codeblock"><pre>
C:\jdk1.8.0\bin\javac HelloWorldApp.java
</pre></div>
<p>If you choose this option, you&#39;ll have to precede your <code>javac</code> and <code>java</code> commands with <code>C:\jdk1.8.0\bin\</code> each time you compile or run a program. To avoid this extra typing, consult the section 
<a class="OutsideLink" target="_blank" href="https://docs.oracle.com/javase/8/docs/technotes/guides/install/windows_jdk_install.html#BABGDJFH">Updating the PATH variable</a> in the JDK 8 installation instructions.</p>
<p><code><strong>Class names, &#39;HelloWorldApp&#39;, are only accepted if annotation processing is explicitly requested</strong></code></p>
<p>If you receive this error, you forgot to include the <code>.java</code> suffix when compiling the program. Remember, the command is <code>javac HelloWorldApp.java</code> not <code>javac HelloWorldApp</code>.</p>

## COMMON Error Messages | UNIX Systems
<p style="font-weight: bold"><code>javac: Command not found</code></p>
<p>If you receive this error, UNIX cannot find the compiler, <code>javac</code>.</p>
<p>Here&#39;s one way to tell UNIX where to find <code>javac</code>. Suppose you installed the JDK in <code>/usr/local/jdk1.8.0</code>. At the prompt you would type the following command and press  Return:</p>
<div class="codeblock"><pre>
/usr/local/jdk1.8.0/javac HelloWorldApp.java
</pre></div>
<p><b>Note:</b> If you choose this option, each time you compile or run a program, you&#39;ll have to precede your <code>javac</code> and <code>java</code> commands with <code>/usr/local/jdk1.8.0/</code>. To avoid this extra typing, you could add this information to your PATH variable. The steps for doing so will vary depending on which shell you are currently running.</p>
<p><code><strong>Class names, &#39;HelloWorldApp&#39;, are only accepted if annotation processing is explicitly requested</strong></code></p>
<p>If you receive this error, you forgot to include the <code>.java</code> suffix when compiling the program. Remember, the command is <code>javac HelloWorldApp.java</code> not <code>javac HelloWorldApp</code>.</p>

## Syntax Errors (== | ALL Platforms)
<p>If you mistype part of a program, the compiler may issue a <em>syntax</em> error. The message usually displays the type of the error, the line number where the error was detected, the code on that line, and the position of the error within the code. Here&#39;s an error caused by omitting a semicolon (<code>;</code>) at the end of a statement:</p>
<div class="codeblock"><pre>
Testing.java:8: error: ';' expected
            count++
                   ^
1 error
</pre></div>
<p>If you see any compiler errors, then your program did not successfully compile, and the compiler did not create a <code>.class</code> file. Carefully verify the program, fix any errors that you detect, and try again.</p>

## Semantic Errors
<p>In addition to verifying that your program is syntactically correct, the compiler checks for other basic correctness. For example, the compiler warns you each time you use a variable that has not been initialized:</p>
<div class="codeblock"><pre>
Testing.java:8: error: variable count might not have been initialized
            count++;
            ^
Testing.java:9: error: variable count might not have been initialized
        System.out.println("Input has " + count + " chars.");
                                          ^
2 errors
</pre></div>
<p>Again, your program did not successfully compile, and the compiler did not create a <code>.class</code> file. Fix the error and try again.</p>

# Runtime Problems
## ERROR Messages | Microsoft Windows Systems
<p style="font-weight: bold"><code>Exception in thread &quot;main&quot; java.lang.NoClassDefFoundError: HelloWorldApp</code></p>
<p>If you receive this error, <code>java</code> cannot find your bytecode file, <code>HelloWorldApp.class</code>.</p>
<p>One of the places <code>java</code> tries to find your <code>.class</code> file is your current directory. So if your <code>.class</code> file is in <code>C:\java</code>, you should change your current directory to that. To change your directory, type the following command at the prompt and press  Enter:</p>
<div class="codeblock"><pre>
cd c:\java
</pre></div>
<p>The prompt should change to <code>C:\java&gt;</code>. If you enter <code>dir</code> at the prompt, you should see your <code>.java</code> and <code>.class</code> files. Now enter <code>java HelloWorldApp</code> again.</p>
<p>If you still have problems, you might have to change your CLASSPATH variable. To see if this is necessary, try clobbering the classpath with the following command.</p>
<div class="codeblock"><pre>
set CLASSPATH=
</pre></div>
<p>Now enter <code>java HelloWorldApp</code> again. If the program works now, you&#39;ll have to change your CLASSPATH variable. To set this variable, consult the 
<a class="OutsideLink" target="_blank" href="https://docs.oracle.com/javase/8/docs/technotes/guides/install/windows_jdk_install.html#BABGDJFH">Updating the PATH variable</a> section in the JDK 8 installation instructions. The CLASSPATH variable is set in the same manner.</p>
<p><code><strong> Could not find or load main class HelloWorldApp.class</strong></code></p>
<p>A common mistake made by beginner programmers is to try and run the <code>java</code> launcher on the <code>.class</code> file that was created by the compiler. For example, you&#39;ll get this error if you try to run your program with <code>java HelloWorldApp.class</code> instead of <code>java HelloWorldApp</code>. Remember, the argument is the <em>name of the class</em> that you want to use, <em>not</em> the filename.</p>
<p><strong><code>Exception in thread &quot;main&quot; java.lang.NoSuchMethodError: main</code></strong></p>
<p>The Java VM requires that the class you execute with it have a <code>main</code> method at which to begin execution of your application. 
<a class="TutorialLink" target="_top" href="../application/index.html">A Closer Look at the "Hello World!" Application</a> discusses the <code>main</code> method in detail.</p>

## Error Messages | UNIX Systems
<p style="font-weight: bold"><code>Exception in thread &quot;main&quot; java.lang.NoClassDefFoundError: HelloWorldApp</code></p>
<p>If you receive this error, <code>java</code> cannot find your bytecode file, <code>HelloWorldApp.class</code>.</p>
<p>One of the places <code>java</code> tries to find your bytecode file is your current directory. So, for example, if your bytecode file is in <code>/home/jdoe/java</code>, you should change your current directory to that. To change your directory, type the following command at the prompt and press  Return:</p>
<div class="codeblock"><pre>
cd /home/jdoe/java
</pre></div>
<p>If you enter <code>pwd</code> at the prompt, you should see <code>/home/jdoe/java</code>. If you enter <code>ls</code> at the prompt, you should see your <code>.java</code> and <code>.class</code> files. Now enter <code>java HelloWorldApp</code> again.</p>
<p>If you still have problems, you might have to change your CLASSPATH environment variable. To see if this is necessary, try clobbering the classpath with the following command.</p>
<div class="codeblock"><pre>
unset CLASSPATH
</pre></div>
<p>Now enter <code>java HelloWorldApp</code> again. If the program works now, you&#39;ll have to change your CLASSPATH variable in the same manner as the PATH variable above.</p>
<p><code><strong>Exception in thread &quot;main&quot; java.lang.NoClassDefFoundError: HelloWorldApp/class</strong></code></p>
<p>A common mistake made by beginner programmers is to try and run the <code>java</code> launcher on the <code>.class</code> file that was created by the compiler. For example, you&#39;ll get this error if you try to run your program with <code>java HelloWorldApp.class</code> instead of <code>java HelloWorldApp</code>. Remember, the argument is the <em>name of the class</em> that you want to use, <em>not</em> the filename.</p>
<p><strong><code>Exception in thread &quot;main&quot; java.lang.NoSuchMethodError: main</code></strong></p>
<p>The Java VM requires that the class you execute with it have a <code>main</code> method at which to begin execution of your application. 
<a class="TutorialLink" target="_top" href="../application/index.html">A Closer Look at the "Hello World!" Application</a> discusses the <code>main</code> method in detail.</p>
 
## Applet or Java Web Start Application Is Blocked
<p>If you are running an application through a browser and get security warnings that say the application is blocked, check the following items:</p>
<ul>
<li><p>Verify that the attributes in the JAR file manifest are set correctly for the environment in which the application is running. The Permissions attribute is required. In a NetBeans project, you can open the manifest file from the Files tab of the NetBeans IDE by expanding the project folder and double-clicking <tt>manifest.mf</tt>.</p></li>
<li><p>Verify that the application is signed by a valid certificate and that the certificate is located in the Signer CA keystore.</p></li>
<li><p>If you are running a local applet, set up a web server to use for testing. You can also add your application to the exception site list, which is managed in the Security tab of the Java Control Panel. </p></li>
</ul>

