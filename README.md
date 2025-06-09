# New features of Java 21  

Repo: https://github.com/daveculledgelendscape/java21.git

Following course: https://lendscape.udemy.com/course/java-21-new-features/learn/lecture/42328658

New features documented here: https://openjdk.org/projects/jdk/21/

## Oracle Release Process
Currently, Oracle has 6 month release cadence. Java 25 is next LTS (Long-Term Support) version due September.

Release is made up of:
1. JEPs - Java Enhancement Proposals - major features
2. JDK-EPSs - smaller enhancements
3. Bug fixes/performance improvements

## Preview features
Functioning features that may change.
Enable in IntelliJ with Project Settings -> Project -> Language Level -> 21 (Preview)

### [JEP 445](https://openjdk.org/jeps/445) Unnamed Classes and Instance Main Methods
- [UnnamedClass.java](src/preview/UnnamedClass.java)

## Final features

### [JEP 441](https://openjdk.org/jeps/441) Pattern matching for switch
Clearer code instead of using instanceof in if else statement
- [PatternMatchingForSwitch.java](src/finalfeature/PatternMatchingForSwitch.java)

### [JEP 431](https://openjdk.org/jeps/431) Sequenced Collections
Easier to work with ordered collections
- [SequencedCollections.java](src/finalfeature/SequencedCollections.java)

### [JEP 440](https://openjdk.org/jeps/440) Record Patterns
Easier way of extracting data from Java records
- [RecordPatterns.java](src/finalfeature/RecordPatterns.java)

### [JEP 439](https://openjdk.org/jeps/439)
Optimised ZGC garbage collection performance across all scales of Java applications (from small to large heaps).
- Split into Young Generation (new objects) and Old Generation (longer living objects moved over from Young after being scanned x times)
- Young Generation heap is scanned more often during GC
- ``` java -XX:+UseZGC -XX:+ZGenerational ... ```
- Eventually will become default GC

### [JEP 444](https://openjdk.org/jeps/444) Virtual Threads
Address the complexity and scalability challenges of concurrent programming with traditional platform threads.
- Platform threads - managed by OS, resource-intensive, blocking I/O
- Virtual threads - managed by JVM, lightweight, non-blocking I/O
- [VirtualThreads.java](src/finalfeature/VirtualThreads.java)

### [JEP 452](https://openjdk.org/jeps/452) Key Encapsulation Mechanism API
- Introduce an API for key encapsulation mechanisms (KEMs), an encryption technique for securing symmetric keys using public key cryptography.
 
### [JEP 449](https://openjdk.org/jeps/449) Deprecate the Windows 32-bit x86 Port for Removal
- Deprecate the Windows 32-bit x86 port, with the intent to remove it in a future release.

### [JEP 451](https://openjdk.org/jeps/451) Prepare to Disallow the Dynamic Loading of Agents
- An agent is a component that can alter the code of an application while the application is running.
- Issue warnings when agents are loaded dynamically into a running JVM. These warnings aim to prepare users for a future release which disallows the dynamic loading of agents by default in order to improve integrity by default. 





	
	
	
 
	
