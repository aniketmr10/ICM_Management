# ICM_Management

http://localhost:8080/add

Sample JSON:
{
   "description":"test",
   "role":"tester",
   "assignee":"A",
   "assigned":"B",
   "cases":[
      {
         "description":"error",
         "status":"open"
      },
      {
         "description":"Joint not working",
         "status":"close"
      }
   ]
}

http://localhost:8080/get/{id}

