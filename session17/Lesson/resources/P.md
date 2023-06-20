###  CompletableFuture
----------------------------- ------------
CompletableFuture is a class introduced in Java 8 that provides a powerful
way to work with asynchronous computations, 
handle results, 
and compose multiple asynchronous operations. 
It enhances the capabilities of traditional Future by allowing you 
to chain together multiple tasks 
and apply various transformations and combinations to the results.

Here are some key features and concepts related to CompletableFuture:

Asynchronous Execution: CompletableFuture supports asynchronous execution of tasks. It can represent the result of an asynchronous computation or be manually completed with a value or an exception.
Chaining Tasks: You can chain multiple CompletableFuture instances together using methods such as thenApply(), thenAccept(), and thenCompose(). These methods allow you to specify the next action to be performed when the previous task completes, allowing for a fluent and sequential flow of operations.
Exception Handling: CompletableFuture provides methods like exceptionally() and handle() to handle exceptions that occur during the execution of tasks. These methods allow you to recover from exceptions, provide default values, or perform alternate actions based on the exception.
Combining Results: CompletableFuture offers methods like thenCombine(), thenAcceptBoth(), and allOf() for combining the results of multiple CompletableFuture instances. These methods enable you to perform further computations or actions once multiple tasks have completed.
Asynchronous Composition: CompletableFuture supports composition of asynchronous operations through methods like thenCompose() and thenCombine(). These methods allow you to express complex asynchronous workflows and combine the results of multiple stages in a flexible manner.

