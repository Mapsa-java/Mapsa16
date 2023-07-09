
session methods
--------------------------------------------------

Hibernate provides several commonly used methods on the Session interface, which is the main interface for interacting with the database and performing persistence operations. Here are explanations of some of the most frequently used methods in Hibernate's Session interface:

* save(Object entity): This method is used to persist a new entity to the database. It assigns a primary key to the entity if it's not already assigned and inserts the entity as a new row in the corresponding database table. It returns the generated identifier value.

* update(Object entity): This method is used to update an existing entity in the database. It synchronizes the state of the given entity with the database by issuing an SQL UPDATE statement. If the entity is not already associated with the session, it reattaches it.

* saveOrUpdate(Object entity): This method is used to either persist a new entity or update an existing entity based on its state. It checks if the entity is already persistent by checking its identifier. If the identifier is assigned, it updates the entity; otherwise, it saves it as a new entity.

* get(Class<T> entityClass, Serializable id): This method is used to retrieve an entity from the database based on its class and identifier. It loads the entity directly from the database using the specified identifier value. If the entity is not found, it returns null.

* load(Class<T> entityClass, Serializable id): This method is similar to get(), but it lazily loads the entity. It returns a proxy object that is initialized on-demand when one of its properties is accessed. If the entity is not found, it throws an exception.

* delete(Object entity): This method is used to delete an entity from the database. It removes the entity from the database table corresponding to its class. If the entity is associated with the session, it becomes transient after deletion.

* createQuery(String hql): This method is used to create a Hibernate query language (HQL) query. HQL is similar to SQL but operates on entity objects instead of database tables. It allows you to perform complex queries, joins, and aggregations. The createQuery() method returns a Query object that can be further customized and executed.

* createCriteria(Class<T> entityClass): This method is used to create a criteria query. Criteria queries provide a programmatic and type-safe way to define queries using a set of criteria expressions. The createCriteria() method returns a Criteria object that can be used to define query conditions, projections, and ordering.

* flush(): This method is used to flush the changes made within the current session to the database. It synchronizes the session's state with the database, issuing SQL statements if necessary. Any pending changes in the session are written to the database, but the transaction is not committed.

* beginTransaction(): This method is used to begin a new transaction for the current session. It marks the start of a unit of work and associates the session with a database transaction. All subsequent persistence operations are performed within the transaction until it is committed or rolled back.