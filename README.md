# iBatis-Oracle

MyBatis framework is used to connect Oracle database.
MyBatis began life as iBATIS back in 2001 moving to Apache some years later. While at Apache it gathered quite the following until competing DAO solutions emerged, despite this, the project kept going now outside of Apache and renamed to MyBatis. However the legacy of iBATIS continues on, you may find it in some package names. Given the history is no surprise there are organizations still running MyBatis to this day. Let's go through a quick introduction and demonstration, shall we?

MyBatis offers a couple of options for mapping SQL statements to Java types. Due to its origins during the dot-com bubble you can expect XML heavy configuration, like many tools of the time. As time passed by more Java oriented options were added thus you'll find naming conventions and an annotation-based API that may be familiar to many; and it's due to this familiarity that I'll stick with the annotation API though the documentation states there are use cases where the XML configuration is less verbose than the alternative.



iBATIS is a persistence framework that helps developers map objects to SQL statements. It was created to simplify the interaction between Java objects and a relational database. One of its key strengths lies in its simplicity and flexibility, making it a popular choice for database access in Java applications.

Here are some key aspects and features of the iBATIS framework:

**Mapping:**
iBATIS uses XML or annotations to map Java objects to SQL statements and vice versa. This mapping allows developers to specify how data should be loaded or stored in the database without writing complex SQL queries manually.

SQL Control:
It provides fine-grained control over SQL queries. Developers can write SQL statements directly and harness the power of SQL when needed. This level of control is particularly useful for optimizing complex queries or handling specific database functionalities.

Lightweight:
Compared to some other ORM (Object-Relational Mapping) frameworks, iBATIS is relatively lightweight. It doesn’t hide SQL from developers, allowing them to optimize queries according to their specific needs.

Flexibility:
iBATIS doesn’t enforce a strict object-oriented approach like some other ORM frameworks. This flexibility allows developers to work seamlessly with existing database schemas or SQL code.

Support for Stored Procedures:
It has robust support for calling and working with stored procedures, which can be beneficial in scenarios where complex database operations are required.

Integration:
iBATIS can be easily integrated with different Java EE (Enterprise Edition) frameworks and application servers. It's compatible with various databases, making it versatile for different project requirements.

Evolution to MyBatis:
In 2010, iBATIS was merged with Google's own persistence framework, and together they became MyBatis. MyBatis continues to build upon iBATIS's principles while incorporating new features and enhancements.

Overall, iBATIS (now part of MyBatis) was appreciated for its simplicity, SQL control, and flexibility in mapping Java objects to relational databases. Its successor, MyBatis, retains these qualities while evolving with new features and improvements.




iBATIS Framework
iBATIS is a persistence framework designed to simplify the interaction between Java objects and relational databases. It offers a straightforward approach to mapping objects to SQL statements, providing developers with a flexible and efficient way to manage database access in Java applications.

Key Features:
Mapping: iBATIS uses XML or annotations to map Java objects to SQL statements and vice versa, streamlining data retrieval and storage without the need for complex manual SQL queries.

SQL Control: Developers retain fine-grained control over SQL queries, enabling direct SQL statement writing and optimization for specific database functionalities.

Lightweight: Compared to some other ORM frameworks, iBATIS is lightweight and doesn’t abstract SQL entirely, allowing developers to optimize queries according to their requirements.

Flexibility: It doesn’t enforce a strict object-oriented approach, providing the flexibility to seamlessly work with existing database schemas and SQL code.

Stored Procedures Support: Robust support for calling and working with stored procedures, particularly beneficial for complex database operations.

Integration: iBATIS integrates smoothly with various Java EE frameworks and application servers and is compatible with different databases, making it adaptable to diverse project needs.

Evolution to MyBatis:
In 2010, iBATIS merged with Google's persistence framework, evolving into MyBatis. MyBatis continues the foundational principles of iBATIS while introducing new features and enhancements.

The iBATIS framework, known for its simplicity, SQL control, and flexibility in mapping Java objects to relational databases, has evolved into MyBatis, retaining these qualities while incorporating advancements.
