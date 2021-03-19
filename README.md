# API-UI-Technical-Assessment

# Technologies and Tools
```bash
- Java                           - eclipse
- Maven                          - excel
- Testng                         - monosnap for video recording
- Selenium
- Rest assured
```

# UI Testing

### Design Patterns Used for UI Testing:
```bash
Page Object Model (POM) Design
```

## Scenarios For UI Testing  
```bash
1 - User try to register 
2 - User try to login 
3 - User try to purchase a product
```
   
### How To Run UI testing:
```bash
Run UiTest.xml as TestNG suite.
```

# API Testing

## Scenarios For API Testing 
 Scenario 1: 
```bash
- Get all posts req using Get all API https://jsonplaceholder.typicode.com/posts
- Get response and assert on its status code to be 200 
- getting the first post title and save it in a globle variable
- assert on size of json array inside the response to be 100
```
Scenario 2: 
```bash
- Get a specfic post by id [first post] req using Get post by id API https://jsonplaceholder.typicode.com/posts/1
-  assert on response status code to be 200
- getting the title of the first post and 
- assert the title of the first post equal to the first post tilte from scenario 1
```

Scenario 3: 
```bash
- try to Get post by wrong id req using Get post by id API https://jsonplaceholder.typicode.com/posts/900
-  assert on response status code to 404
- assert on its response to be empty
```
Scenario 4: 
```bash
-  create a post req using post API https://jsonplaceholder.typicode.com/posts
-  assert on response status code to 201
-  assert on its post id response to be 101
```


### How To Run API testing:
```bash
Run ApiTest.xml as TestNG suite.
```

## Repo Contents

```bash
in the src folder
1 - src/main/java/pages contains 
    - 4 packages (HomePagePkg-LoginPagePkg-RegistrationPagePkg-CartCheckoutPagePkg) each one of the cotain 2 classes 
            • po class for the locators
            • helper class for actions on elements
    - commanUtilis package that contain 2 classes
            • CommonHelper class for common actions (clicking on elements- write text- etc..) 
            • RandomSource class for generation of random test data
            
     - Driver package that contains one class (DriverStup) for initializing the driver to chrome browser
  
2 - src/test/java/ contains 
    - apiAutomation.Tests that contains 2 classes 
        • ApisBody that contains bodies for any api
        • ApiTest that contains the test cases for the api's
        
    - automationPractice.Tests that contains one class (TestRegisterLoginCheckout) that conatins the test cases for UI
    
3 - Demo Videos folder that contains 2 videos for UI and API tests
4 - resources folder that contains chrome driver
5 - test cases folder that contain an excel sheet that cover all the positive and negative scenarios for the "Registration”, "Login" and “Cart Checkout” Modules
6 - POM.xml file contains maven dependencies.
7 - UiTest.xml file contains the UI scenarios.
8 - ApiTest.xml file contains the API scenarios.
```
