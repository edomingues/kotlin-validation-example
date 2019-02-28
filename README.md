# Kotlin Bean Validation Example 

This is an example project using Bean Validation 2.0 (JSR380) in Kotlin.


## Build & Run

To build and run the project do `gradle bootRun`.

Once running there is a web endpoint listening at http://localhost:8080/ with a link to a web form that has input validation.

There are also 2 REST endpoints listening at /rest/users and /rest/2/users. 
Both these endpoints validate the model sent by POST. The difference between them is the way they are implemented. 

You can call them like this:  
```
curl -i -X POST -H "Content-Type:application/json" -d '{"firstName":"Bob","lastName":"Smith","email":"bob@example.org","dateOfBirth":"1970-02-15","numberOfDependents":3, "aboutMe":"About Bob Smith.","address":{"street":"Streetname","city":"Leiria","postalCode":"1234-123","country":"Portugal"},"premium":false, "receiveNewsletter":true,"agreedToTermsAndConditions":true }' localhost:8080/rest/users
```

```

curl -i -X POST -H "Content-Type:application/json" -d '{"firstName":"Bob","lastName":"Smith","email":"bob@example.org","dateOfBirth":"1970-02-15","numberOfDependents":3, "aboutMe":"About Bob Smith.","address":{"street":"Streetname","city":"Leiria","postalCode":"1234-123","country":"Portugal"},"premium":false, "receiveNewsletter":true,"agreedToTermsAndConditions":true }' localhost:8080/rest/2/users
```
