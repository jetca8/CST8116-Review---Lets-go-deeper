# What is inside a compiled class file
We are going to install a decompile tool jadx (https://github.com/skylot/jadx)
and do some reverse engineering things.

# Preparation
1. install decompile tool
- Windows: just download the compiled tool here: https://github.com/skylot/jadx/releases  as all of you must have jre, so just download the filename like jadx-gui-x.x.x-no-jre-win version.
- Macos: you just download source code and compile it. simple, around 5 min.
	open your terminal in application (command + space, type "terminal")
	
		cd Desktop 
		git clone https://github.com/skylot/jadx.git
		cd jadx
		./gradlew dist
	
	Compiling take around 3 min. and after compiling, you will find	jadx-gui in the the following folder
		/Users/YOUR_MACOS_USER_NAME/Desktop/jadx/jadx/build/jadx/bin
2. compile your HelloWorld.java to HelloWorld.class
	in eclipse, each time you run the program, it compile it to HelloWorld.class and place it in a bin folder under your HelloWorld project folder. 

# Decompiling HelloWorld.class
This is my source code before compiling:

	public class HelloWorld {
	
		public static void main(String[] myArgsArray) { // I changed the args to myArgsArray
			System.out.println("Hello World!");
		}
	
	}
	
Double click you decompile tool, and it will ask you to locate a class file. Dind your HelloWorld.class in the bin folder mentioned above, and open it. At the left panel, expand Source code --> defpackage -->HelloWorld
and that is the decompile java code. something like this:

	package defpackage;
	
	/* renamed from: HelloWorld  reason: default package */
	/* loaded from: HelloWorld.class */
	public class HelloWorld {
	    public static void main(String[] myArgsArray) {
	        System.out.println("Hello World!");
	    }
	}

It seems the eclipse compile added default package named defpackage, and it keeps my customized name for the main() argument array.

# Ending
I don't think all the java.class file can be decompiled. and not sure what kind of class file can be decompiled.

Not so many surprise, ha. Well, we just write one line of code.

We will explore more interesting thing in the future.
