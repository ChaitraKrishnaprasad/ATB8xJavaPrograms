package Java_Sept2024.ex_11092024_Datatype;
// Non primitive data type (user defined)
public class Lab007_datatype {
    public static void main(String[] args) {
        String name = "Chaitra"; // String is bunch of character and collection of characters
        System.out.println(name);
        String str = "Heelo world";
       // Array, Class - user defined type
        System.out.println("Length: "+str.length());

    }
}
//javap java.lang.String
//
//Windows PowerShell
//Copyright (C) Microsoft Corporation. All rights reserved.
//
//Install the latest PowerShell for new features and improvements! https://aka.ms/PSWindows
//
//PS C:\Users\Miles\IdeaProjects\ATB8xJavaPrograms> javap
//Usage: javap <options> <classes>
//where possible options include:
//        --help -help -h -?               Print this help message
//  -version                         Version information
//  -v  -verbose                     Print additional information
//  -l                               Print line number and local variable tables
//  -public                          Show only public classes and members
//  -protected                       Show protected/public classes and members
//  -package                         Show package/protected/public classes
//and members (default)
//  -p  -private                     Show all classes and members
//  -c                               Disassemble the code
//  -s                               Print internal type signatures
//  -sysinfo                         Show system info (path, size, date, SHA-256 hash)
//of class being processed
//  -constants                       Show final constants
//  --module <module>  -m <module>   Specify module containing classes to be disassembled
//        -J<vm-option>                    Specify a VM option
//        --module-path <path>             Specify where to find application modules
//        --system <jdk>                   Specify where to find system modules
//        --class-path <path>              Specify where to find user class files
//        -classpath <path>                Specify where to find user class files
//        -cp <path>                       Specify where to find user class files
//        -bootclasspath <path>            Override location of bootstrap class files
//        --multi-release <version>        Specify the version to use in multi-release JAR files
//
//        GNU-style options may use = instead of whitespace to separate the name of an option
//        from its value.
//
//        Each class to be shown may be specified by a filename, a URL, or by its fully
//        qualified class name. Examples:
//        path/to/MyClass.class
//        jar:file:///path/to/MyJar.jar!/mypkg/MyClass.class
//        java.lang.Object
//
//        PS C:\Users\Miles\IdeaProjects\ATB8xJavaPrograms> javap java lang
//        Error: class not found: java
//        Error: class not found: lang
//        PS C:\Users\Miles\IdeaProjects\ATB8xJavaPrograms> javap java.lang
//        Error: class not found: java.lang
//        PS C:\Users\Miles\IdeaProjects\ATB8xJavaPrograms> javap.java.lang.String
//        javap.java.lang.String : The term 'javap.java.lang.String' is not recognized as the name of a cmdlet, function, script file, or operable program. Check the spelling of the name,
//        or if a path was included, verify that the path is correct and try again.
//        At line:1 char:1
//        + javap.java.lang.String
//        + ~~~~~~~~~~~~~~~~~~~~~~
//        + CategoryInfo          : ObjectNotFound: (javap.java.lang.String:String) [], CommandNotFoundException
//        + FullyQualifiedErrorId : CommandNotFoundException
//
//        PS C:\Users\Miles\IdeaProjects\ATB8xJavaPrograms> javap.java.lang.String
//        javap.java.lang.String : The term 'javap.java.lang.String' is not recognized as the name of a cmdlet, function, script file, or operable program. Check the spelling of the name,
//        or if a path was included, verify that the path is correct and try again.
//        At line:1 char:1
//        + javap.java.lang.String
//        + ~~~~~~~~~~~~~~~~~~~~~~
//        + CategoryInfo          : ObjectNotFound: (javap.java.lang.String:String) [], CommandNotFoundException
//        + FullyQualifiedErrorId : CommandNotFoundException
//
//        PS C:\Users\Miles\IdeaProjects\ATB8xJavaPrograms> javap java.lang.String
//        Compiled from "String.java"
//        public final class java.lang.String implements java.io.Serializable, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, java.lang.constant.Constable, java.lang.constant.ConstantDesc {
//        static final boolean COMPACT_STRINGS;
//        public static final java.util.Comparator<java.lang.String> CASE_INSENSITIVE_ORDER;
//        static final byte LATIN1;
//        static final byte UTF16;
//        public java.lang.String();
//        public java.lang.String(java.lang.String);
//        public java.lang.String(char[]);
//        public java.lang.String(char[], int, int);
//        public java.lang.String(int[], int, int);
//        public java.lang.String(byte[], int, int, int);
//        public java.lang.String(byte[], int);
//        public java.lang.String(byte[], int, int, java.lang.String) throws java.io.UnsupportedEncodingException;
//        public java.lang.String(byte[], int, int, java.nio.charset.Charset);
//        static java.lang.String newStringUTF8NoRepl(byte[], int, int, boolean);
//        static java.lang.String newStringNoRepl(byte[], java.nio.charset.Charset) throws java.nio.charset.CharacterCodingException;
//        static byte[] getBytesUTF8NoRepl(java.lang.String);
//        static byte[] getBytesNoRepl(java.lang.String, java.nio.charset.Charset) throws java.nio.charset.CharacterCodingException;
//        static int decodeASCII(byte[], int, char[], int, int);
//        public java.lang.String(byte[], java.lang.String) throws java.io.UnsupportedEncodingException;
//        public java.lang.String(byte[], java.nio.charset.Charset);
//        public java.lang.String(byte[], int, int);
//        public java.lang.String(byte[]);
//        public java.lang.String(java.lang.StringBuffer);
//        public java.lang.String(java.lang.StringBuilder);
//        public int length();
//        public boolean isEmpty();
//        public char charAt(int);
//        public int codePointAt(int);
//        public int codePointBefore(int);
//        public int codePointCount(int, int);
//        public int offsetByCodePoints(int, int);
//        public void getChars(int, int, char[], int);
//        public void getBytes(int, int, byte[], int);
//        public byte[] getBytes(java.lang.String) throws java.io.UnsupportedEncodingException;
//        public byte[] getBytes(java.nio.charset.Charset);
//        public byte[] getBytes();
//        public boolean equals(java.lang.Object);
//        public boolean contentEquals(java.lang.StringBuffer);
//        public boolean contentEquals(java.lang.CharSequence);
//        public boolean equalsIgnoreCase(java.lang.String);
//        public int compareTo(java.lang.String);
//        public int compareToIgnoreCase(java.lang.String);
//        public boolean regionMatches(int, java.lang.String, int, int);
//        public boolean regionMatches(boolean, int, java.lang.String, int, int);
//        public boolean startsWith(java.lang.String, int);
//        public boolean startsWith(java.lang.String);
//        public boolean endsWith(java.lang.String);
//        public int hashCode();
//        public int indexOf(int);
//        public int indexOf(int, int);
//        public int indexOf(int, int, int);
//        public int lastIndexOf(int);
//        public int lastIndexOf(int, int);
//        public int indexOf(java.lang.String);
//        public int indexOf(java.lang.String, int);
//        public int indexOf(java.lang.String, int, int);
//        static int indexOf(byte[], byte, int, java.lang.String, int);
//        public int lastIndexOf(java.lang.String);
//        public int lastIndexOf(java.lang.String, int);
//        static int lastIndexOf(byte[], byte, int, java.lang.String, int);
//        public java.lang.String substring(int);
//        public java.lang.String substring(int, int);
//        public java.lang.CharSequence subSequence(int, int);
//        public java.lang.String concat(java.lang.String);
//        public java.lang.String replace(char, char);
//        public boolean matches(java.lang.String);
//        public boolean contains(java.lang.CharSequence);
//        public java.lang.String replaceFirst(java.lang.String, java.lang.String);
//        public java.lang.String replaceAll(java.lang.String, java.lang.String);
//        public java.lang.String replace(java.lang.CharSequence, java.lang.CharSequence);
//        public java.lang.String[] split(java.lang.String, int);
//        public java.lang.String[] splitWithDelimiters(java.lang.String, int);
//        public java.lang.String[] split(java.lang.String);
//        public static java.lang.String join(java.lang.CharSequence, java.lang.CharSequence...);
//        static java.lang.String join(java.lang.String, java.lang.String, java.lang.String, java.lang.String[], int);
//        public static java.lang.String join(java.lang.CharSequence, java.lang.Iterable<? extends java.lang.CharSequence>);
//        public java.lang.String toLowerCase(java.util.Locale);
//        public java.lang.String toLowerCase();
//        public java.lang.String toUpperCase(java.util.Locale);
//        public java.lang.String toUpperCase();
//        public java.lang.String trim();
//        public java.lang.String strip();
//        public java.lang.String stripLeading();
//        public java.lang.String stripTrailing();
//        public boolean isBlank();
//        public java.util.stream.Stream<java.lang.String> lines();
//        public java.lang.String indent(int);
//        public java.lang.String stripIndent();
//        public java.lang.String translateEscapes();
//        public <R> R transform(java.util.function.Function<? super java.lang.String, ? extends R>);
//        public java.lang.String toString();
//        public java.util.stream.IntStream chars();
//        public java.util.stream.IntStream codePoints();
//        public char[] toCharArray();
//        public static java.lang.String format(java.lang.String, java.lang.Object...);
//        public static java.lang.String format(java.util.Locale, java.lang.String, java.lang.Object...);
//        public java.lang.String formatted(java.lang.Object...);
//        public static java.lang.String valueOf(java.lang.Object);
//        public static java.lang.String valueOf(char[]);
//        public static java.lang.String valueOf(char[], int, int);
//        public static java.lang.String copyValueOf(char[], int, int);
//        public static java.lang.String copyValueOf(char[]);
//        public static java.lang.String valueOf(boolean);
//        public static java.lang.String valueOf(char);
//        public static java.lang.String valueOf(int);
//        public static java.lang.String valueOf(long);
//        public static java.lang.String valueOf(float);
//        public static java.lang.String valueOf(double);
//        public native java.lang.String intern();
//        public java.lang.String repeat(int);
//        static void repeatCopyRest(byte[], int, int, int);
//        void getBytes(byte[], int, byte);
//        void getBytes(byte[], int, int, byte, int);
//        java.lang.String(char[], int, int, java.lang.Void);
//        java.lang.String(java.lang.AbstractStringBuilder, java.lang.Void);
//        java.lang.String(byte[], byte);
//        byte coder();
//        byte[] value();
//        boolean isLatin1();
//        static void checkIndex(int, int);
//        static void checkOffset(int, int);
//        static int checkBoundsOffCount(int, int, int);
//        static void checkBoundsBeginEnd(int, int, int);
//        static java.lang.String valueOfCodePoint(int);
//        public java.util.Optional<java.lang.String> describeConstable();
//        public java.lang.String resolveConstantDesc(java.lang.invoke.MethodHandles$Lookup);
//        public int compareTo(java.lang.Object);
//        public java.lang.Object resolveConstantDesc(java.lang.invoke.MethodHandles$Lookup) throws java.lang.ReflectiveOperationException;
//        static {};
//        }
//        PS C:\Users\Miles\IdeaProjects\ATB8xJavaPrograms> javap.java.lang.String
//        javap.java.lang.String : The term 'javap.java.lang.String' is not recognized as the name of a cmdlet, function, script file, or operable program. Check the spelling of the name,
//        or if a path was included, verify that the path is correct and try again.
//        At line:1 char:1
//        + javap.java.lang.String
//        + ~~~~~~~~~~~~~~~~~~~~~~
//        + CategoryInfo          : ObjectNotFound: (javap.java.lang.String:String) [], CommandNotFoundException
//        + FullyQualifiedErrorId : CommandNotFoundException
//
//        PS C:\Users\Miles\IdeaProjects\ATB8xJavaPrograms> javap java.lang.String
//        Compiled from "String.java"
//        public final class java.lang.String implements java.io.Serializable, java.lang.Comparable<java.lang.String>, java.lang.CharSequence, java.lang.constant.Constable, java.lang.constant.ConstantDesc {
//        static final boolean COMPACT_STRINGS;
//        public static final java.util.Comparator<java.lang.String> CASE_INSENSITIVE_ORDER;
//        static final byte LATIN1;
//        static final byte UTF16;
//        public java.lang.String();
//        public java.lang.String(java.lang.String);
//        public java.lang.String(char[]);
//        public java.lang.String(char[], int, int);
//        public java.lang.String(int[], int, int);
//        public java.lang.String(byte[], int, int, int);
//        public java.lang.String(byte[], int);
//        public java.lang.String(byte[], int, int, java.lang.String) throws java.io.UnsupportedEncodingException;
//        public java.lang.String(byte[], int, int, java.nio.charset.Charset);
//        static java.lang.String newStringUTF8NoRepl(byte[], int, int, boolean);
//        static java.lang.String newStringNoRepl(byte[], java.nio.charset.Charset) throws java.nio.charset.CharacterCodingException;
//        static byte[] getBytesUTF8NoRepl(java.lang.String);
//        static byte[] getBytesNoRepl(java.lang.String, java.nio.charset.Charset) throws java.nio.charset.CharacterCodingException;
//        static int decodeASCII(byte[], int, char[], int, int);
//        public java.lang.String(byte[], java.lang.String) throws java.io.UnsupportedEncodingException;
//        public java.lang.String(byte[], java.nio.charset.Charset);
//        public java.lang.String(byte[], int, int);
//        public java.lang.String(byte[]);
//        public java.lang.String(java.lang.StringBuffer);
//        public java.lang.String(java.lang.StringBuilder);
//        public int length();
//        public boolean isEmpty();
//        public char charAt(int);
//        public int codePointAt(int);
//        public int codePointBefore(int);
//        public int codePointCount(int, int);
//        public int offsetByCodePoints(int, int);
//        public void getChars(int, int, char[], int);
//        public void getBytes(int, int, byte[], int);
//        public byte[] getBytes(java.lang.String) throws java.io.UnsupportedEncodingException;
//        public byte[] getBytes(java.nio.charset.Charset);
//        public byte[] getBytes();
//        public boolean equals(java.lang.Object);
//        public boolean contentEquals(java.lang.StringBuffer);
//        public boolean contentEquals(java.lang.CharSequence);
//        public boolean equalsIgnoreCase(java.lang.String);
//        public int compareTo(java.lang.String);
//        public int compareToIgnoreCase(java.lang.String);
//        public boolean regionMatches(int, java.lang.String, int, int);
//        public boolean regionMatches(boolean, int, java.lang.String, int, int);
//        public boolean startsWith(java.lang.String, int);
//        public boolean startsWith(java.lang.String);
//        public boolean endsWith(java.lang.String);
//        public int hashCode();
//        public int indexOf(int);
//        public int indexOf(int, int);
//        public int indexOf(int, int, int);
//        public int lastIndexOf(int);
//        public int lastIndexOf(int, int);
//        public int indexOf(java.lang.String);
//        public int indexOf(java.lang.String, int);
//        public int indexOf(java.lang.String, int, int);
//        static int indexOf(byte[], byte, int, java.lang.String, int);
//        public int lastIndexOf(java.lang.String);
//        public int lastIndexOf(java.lang.String, int);
//        static int lastIndexOf(byte[], byte, int, java.lang.String, int);
//        public java.lang.String substring(int);
//        public java.lang.String substring(int, int);
//        public java.lang.CharSequence subSequence(int, int);
//        public java.lang.String concat(java.lang.String);
//        public java.lang.String replace(char, char);
//        public boolean matches(java.lang.String);
//        public boolean contains(java.lang.CharSequence);
//        public java.lang.String replaceFirst(java.lang.String, java.lang.String);
//        public java.lang.String replaceAll(java.lang.String, java.lang.String);
//        public java.lang.String replace(java.lang.CharSequence, java.lang.CharSequence);
//        public java.lang.String[] split(java.lang.String, int);
//        public java.lang.String[] splitWithDelimiters(java.lang.String, int);
//        public java.lang.String[] split(java.lang.String);
//        public static java.lang.String join(java.lang.CharSequence, java.lang.CharSequence...);
//        static java.lang.String join(java.lang.String, java.lang.String, java.lang.String, java.lang.String[], int);
//        public static java.lang.String join(java.lang.CharSequence, java.lang.Iterable<? extends java.lang.CharSequence>);
//        public java.lang.String toLowerCase(java.util.Locale);
//        public java.lang.String toLowerCase();
//        public java.lang.String toUpperCase(java.util.Locale);
//        public java.lang.String toUpperCase();
//        public java.lang.String trim();
//        public java.lang.String strip();
//        public java.lang.String stripLeading();
//        public java.lang.String stripTrailing();
//        public boolean isBlank();
//        public java.util.stream.Stream<java.lang.String> lines();
//        public java.lang.String indent(int);
//        public java.lang.String stripIndent();
//        public java.lang.String translateEscapes();
//        public <R> R transform(java.util.function.Function<? super java.lang.String, ? extends R>);
//        public java.lang.String toString();
//        public java.util.stream.IntStream chars();
//        public java.util.stream.IntStream codePoints();
//        public char[] toCharArray();
//        public static java.lang.String format(java.lang.String, java.lang.Object...);
//        public static java.lang.String format(java.util.Locale, java.lang.String, java.lang.Object...);
//        public java.lang.String formatted(java.lang.Object...);
//        public static java.lang.String valueOf(java.lang.Object);
//        public static java.lang.String valueOf(char[]);
//        public static java.lang.String valueOf(char[], int, int);
//        public static java.lang.String copyValueOf(char[], int, int);
//        public static java.lang.String copyValueOf(char[]);
//        public static java.lang.String valueOf(boolean);
//        public static java.lang.String valueOf(char);
//        public static java.lang.String valueOf(int);
//        public static java.lang.String valueOf(long);
//        public static java.lang.String valueOf(float);
//        public static java.lang.String valueOf(double);
//        public native java.lang.String intern();
//        public java.lang.String repeat(int);
//        static void repeatCopyRest(byte[], int, int, int);
//        void getBytes(byte[], int, byte);
//        void getBytes(byte[], int, int, byte, int);
//        java.lang.String(char[], int, int, java.lang.Void);
//        java.lang.String(java.lang.AbstractStringBuilder, java.lang.Void);
//        java.lang.String(byte[], byte);
//        byte coder();
//        byte[] value();
//        boolean isLatin1();
//        static void checkIndex(int, int);
//        static void checkOffset(int, int);
//        static int checkBoundsOffCount(int, int, int);
//        static void checkBoundsBeginEnd(int, int, int);
//        static java.lang.String valueOfCodePoint(int);
//        public java.util.Optional<java.lang.String> describeConstable();
//        public java.lang.String resolveConstantDesc(java.lang.invoke.MethodHandles$Lookup);
//        public int compareTo(java.lang.Object);
//        public java.lang.Object resolveConstantDesc(java.lang.invoke.MethodHandles$Lookup) throws java.lang.ReflectiveOperationException;
//        static {};
//        }
