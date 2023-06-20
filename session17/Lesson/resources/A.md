### thread , process 

-----------------------------------------
Process: 
A process is an instance of a running program. 
It can be thought of as a container that holds all the resources needed to execute a program, 
including memory, files, and system resources. 
Each process has its own address space and runs independently of other processes.

Thread: 
A thread is the smallest unit of execution within a process.
It represents a sequential flow of control within a program. 
A process can have multiple threads, and each thread executes a different part of the program concurrently.
Threads within the same process share the same memory space and can communicate with each other more efficiently than separate processes.


Core:
A core refers to the physical processing unit of a CPU (Central Processing Unit).
A CPU can have one or more cores, and each core can execute multiple threads concurrently. 
Having multiple cores allows for parallel processing and improves the overall performance of the system.

CPU: 
The CPU is the hardware component responsible for executing instructions of a computer program. 
It fetches instructions from memory, decodes them, and performs the necessary calculations or operations.
The CPU consists of an arithmetic logic unit (ALU) for performing calculations and a control unit for coordinating the execution of instructions.



### Threads VS Process 
---------------------------------------------

Processes:

Processes represent running programs and have their own memory space and resources.
Each process runs independently of other processes and communicates with them through inter-process communication mechanisms.
Processes provide a higher level of isolation and security as each process has its own memory space.
Context switching between processes is generally more expensive compared to threads.
Threads:

Threads are the units of execution within a process.
Multiple threads within the same process share the same memory space, allowing for efficient communication and data sharing.
Threads are lightweight compared to processes, as they share resources such as memory and file handles.
Context switching between threads within the same process is generally less expensive compared to processes.