# ToastMessages

How to
To get a Git project into your build:

## gradle
Add it in your root build.gradle at the end of repositories:
Step 1. Add the JitPack repository to your build file
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
	
Step 2. Add the dependency
	dependencies {
	        implementation 'com.github.ediMariyanto:toastMessages:Tag'
	}
	
## maven
Step 1. Add the JitPack repository to your build file
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>	
	
Step 2. Add the dependency	
	<dependency>
	    <groupId>com.github.ediMariyanto</groupId>
	    <artifactId>toastMessages</artifactId>
	    <version>Tag</version>
	</dependency>
	
	
Step 1. Add the JitPack repository to your build file

## sbt
Add it in your build.sbt at the end of resolvers: 
    resolvers += "jitpack" at "https://jitpack.io"
        
Step 2. Add the dependency
	libraryDependencies += "com.github.ediMariyanto" % "toastMessages" % "Tag"		
	
	
Step 1. Add the JitPack repository to your build file

## leiningen
Add it in your project.clj at the end of repositories:
    :repositories [["jitpack" "https://jitpack.io"]]
           
Step 2. Add the dependency
	:dependencies [[com.github.ediMariyanto/toastMessages "Tag"]]		
	
	

## Example
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ToastMessages.setToast(this, "Show Toast", true)
    }
}
