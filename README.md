# JFork NProperty
[![](https://jitpack.io/v/ddark008/nproperty.svg)](https://jitpack.io/#ddark008/nproperty)

## License
See LICENSE file.

## Authors
Nikita "Yurie" Sankov

## Examples
Most interesting parts: [EN](http://microfork.com/reading-configuration-files-in-java-nproperty/) | [RU](http://microfork.com/reading-configuration-files-with-java-nproperty/)

## Integration
### Maven
```Xml
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
	
	<dependency>
	    <groupId>com.github.ddark008</groupId>
	    <artifactId>nproperty</artifactId>
	    <version>1.4.2</version>
	</dependency>
```

### Gradle
```Groovy
	allprojects {
		repositories {
			maven { url 'https://jitpack.io' }
		}
	}
	
	dependencies {
	        implementation 'com.github.ddark008:nproperty:1.4.2'
	}
```
