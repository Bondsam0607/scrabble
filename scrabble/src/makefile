JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java
CLASSES = \
        edu/duke/cs201/core/parseText.java \
        edu/duke/cs201/core/drawBoard.java 

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) edu/duke/cs201/core/*.class
