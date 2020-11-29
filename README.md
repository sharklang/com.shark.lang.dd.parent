# dd language

This is an xtext simple language that allows to describe data in a consize way, more so than sql ddl, with ability to no only describe data structure but also validation rules.

It also enforces a lot more validation in the ide, with mandatory descriptions, data type consistencies...

It then can be used in other languages of the sharklang software factory to be the base of business rules and behaviours, be used as service interfaces, or any other aspect of the software that requires data structure.

As such it can already generate a series of output:

- a simple flutter front end for crud operations, as well as lists and searches
- a series of crud APIs on the entities, implemented on a vertx / cassandra optimized stack
- all validation rules are used in both the crud MVC layer and also at the API level unless the service call is trusted (ie. coming from a signed proxy)
- this relies on optimized flatbuffer objects
