# NHS_ASSIGNMENT

#Skills REST API

The design is the following: 

Object USER that contains an ID and a list of SKILLS (which is another object)
Object SKILLS that contains a NAME and ENUM (EXPERT, PRACTITIONER, WORKING, AWARENESS)

A controller that manage all the API requests as follows: 

  GET /users/- It will bring all the users 
    curl -v localhost:8080/users/


  GET /users/{id}- It will bring an specific user selected by his ID
    curl -v localhost:8080/users/1


  POST /users/ - It will transfer Json data. 
    curl -X POST localhost:8080/users -H 'Content-type:application/json' -d '{"skills":[{name:"Java", level:"EXPERT"}]}'


  PUT /users/{id} - It will update the skill list with a new one given a user_id
    curl -X PUT localhost:8080/users -H 'Content-type:application/json' -d '{"skills":[{name:"Javascript", level:"WORKING"}]}'

  DELETE /users/{id} - It will delete a user and the list of skills given his ID. 
    curl -X DELETE localhost:8080/employees/3
  

I also started the frontend index.html with a form to add skills and its level of experience. 
