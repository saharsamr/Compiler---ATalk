export CLASSPATH=".:/usr/local/lib/antlr-4.7-complete.jar:$CLASSPATH"
rm *.class
rm *.tokens
rm ATalkPass1*.java
rm ATalkPass2*.java
java -jar /usr/local/lib/antlr-4.7-complete.jar ATalkPass1.g4
javac *.java
java ATalk in.atk
