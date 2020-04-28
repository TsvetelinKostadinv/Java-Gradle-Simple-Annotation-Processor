# Java-Gradle-Simple-Annotation-Processor
---
This HAD to be done and I feel like no one should go through the same hell I did just to discover it. Please, if it helped, just share (and star) it

---
Some explanation:
1. The thing you see the root project. This is more or less the user of the annotation processor.
It has the inner project as a dependency and an ```annotationProcessor``` gradle provider.
2. Next up, in the folder ```Annotation-Processor``` is a subproject which defines - the annotation to be processsed and the actual annotation processor.
3. To see what the project is doing just clone the project with git
```
$ git clone https://github.com/TsvetelinKostadinv/Java-Gradle-Simple-Annotation-Processor.git
$ gradlew clean build # for Windows
$ ./gradlew clean build # for Unix
```

Furthermore the project could be split up more, but I think that abstractions are not an essential part of this foundational project

NOTE: This project is not for an in-depth guide on annotation processing. It is set up in order for a regular user to have the **foundation** to start learning and not struggle as I did in the last 2 days. :heart:
