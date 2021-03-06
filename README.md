# dd language

This is an xtext simple language that allows to describe data in a concise way, more so than SQL DDL, with ability to, not only describe data structure (Entities), but also validation rules and relationships.

It also enforces a lot more validation in the ide, with mandatory descriptions, data type consistencies...than what is today available in SQL editors or other data structure definition languages/platforms.

It can be refered to from other languages of the Sharklang software factory to be the base for business rules and behaviours, service interfaces, or any other aspect of the software that requires data structure.

As such it can already generate a series of output that are highly performant, CO2 optimized, ready for security, microservice architecture and high availability:

- a simple Flutter front end for CRUD (Create, Read, Update, Delete) operations, as well as lists and searches, which allows deployments as native apps on all platforms (desktop, mobile...)
- a series of CRUD APIs on the entities, implemented on a Vertx / RocksDB optimized stack
- all validation rules are used in both the CRUD MVC Front End layer (within the proxies, coded in dart) and also in the microservices/Back-End APIs. If the service call is trusted (ie. coming from a signed proxy) the back end validation rules are not called
- this relies on optimized Flatbuffer objects in the front End and in the Back-End, and in the Database for optimal performance and CO2 footprint 

This language can be used in combination with the rest of the Sharklang factory or it can be used on its own to build pure data oriented applications such as MDM (Master Data Management) Microservices.
