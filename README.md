# Topera's Hello World #026
## Conditional plugins
This hello world shows how to apply some plugins according to the specified task

## How to download this source code
* Install [Gradle](https://gradle.org/install)
* Use the `Clone or download` button above the get the url of this repository
* In IntelliJ IDEA: File → New → Project From Version Control → Git → put the url of this repository

## How to test

* Run `$ ./gradlew war`

Works because we apply the plugin in case of this task.

* Run `$ ./gradlew compileGroovy`

Doesn't work because this task is not on condition of build.gradle.

---
To take a look in other projects, please see https://github.com/topera/index



