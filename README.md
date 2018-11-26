## Persistence
Install mongoDB following:
https://docs.mongodb.com/manual/tutorial/install-mongodb-on-ubuntu/

Run a mongodb in the standard port 27017
    mongod

## Compile & Deploy
    mvn clean install spring-boot:run

## Usage Example
Make a post petition to url localhost:8080/run with the input in the body:
Example:

curl -X POST \
  http://localhost:8080/run \
  -H 'Cache-Control: no-cache' \
  -H 'Content-Type: application/json' \
  -d '{
  "roomSize" : [5, 5],
  "coords" : [1, 2],
  "patches" : [
    [1, 0],
    [2, 2],
    [2, 3]
  ],
  "instructions" : "NNESEESWNWW"
}'

Respose:
{
    "coords": [
        1,
        3
    ],
    "patches": 1
}