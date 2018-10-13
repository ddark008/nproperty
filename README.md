# JFork NProperty
[![](https://jitpack.io/v/zcxv/nproperty.svg)](https://jitpack.io/#zcxv/nproperty)

## License
See LICENSE file.

## Authors
Nikita "Yurie" Sankov

## Examples
Most interesting parts: [EN](http://microfork.com/reading-configuration-files-in-java-nproperty/) | [RU](http://microfork.com/reading-configuration-files-with-java-nproperty/)

## Integration
### Maven
```Java
	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
	
	<dependency>
	    <groupId>com.github.zcxv</groupId>
	    <artifactId>nproperty</artifactId>
	    <version>1.4.1</version>
	</dependency>
```

### Gradle
```Java
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
	
	dependencies {
	        implementation 'com.github.zcxv:nproperty:1.4.1'
	}
```