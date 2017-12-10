# Auto Test

## BackGround

This is a project based on rest-assured to execute interface auto test.

## Tech Stack
- SpringBoot: 1.5.9
- Mysql: 5.6
- JPA: 1.5.9
- RestAssured: 3.0.6
- JsonSchemaValidator: 3.0.6
    + Get the example json
    + Generate the json schema from [here](https://jsonschema.net/#/)
    + Add json schema file to resources/json.schema
    + Use json schema validator
- Junit: 4.12
- Lombok 1.16.18
    + Enable "Annotation Process"
    + Add "Lombok Plugin"
    + Restart IDEA
- Flyway: 4.2.0
    + Update the application-local.yml file
- Gson: 2.8.2
