# testng-gradle-demo

A sample Gradle project to run TestNG tests with different command line args

### Usage

**Using the default gradle test task (limited options)**
* Run a single group
    ```
    gradle testGroups -Pgroups=uat
    ```
* Run multiple groups
    ```
    gradle testGroups -Pgroups=uat,prod
    ```

**Using the java exec task (more options)**
* Run all tests
    ```
    gradle testNG
    ```
* Run a single group
    ```
    gradle testNG -Pgroups=uat
    ```
* Run multiple groups
    ```
    gradle testNG -Pgroups=uat,prod
    ```
* Run a single test suite (relative to src/test/resources/test-suites)
    ```
    gradle testNG -Psuites=Smoke.xml
    gradle testNG -Psuites=Regression.xml
    ```
* Run multiple test suites
    ```
    gradle testNG -Psuites=Regression.xml,Smoke.xml
    ```
* Run test suites along with group filter
    ```
    gradle testNG -Psuites=Regression.xml -Pgroups=uat
    ```
* Run test methods in parallel with multiple threads
    ```
    gradle testNG -Psuites=Regression.xml -Pthreads=3
    ```
