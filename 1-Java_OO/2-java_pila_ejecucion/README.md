## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).


## topics
#### Exception
All exceptions are subclasses of the class Throwable. Then Exception and Error are subclasses of Throwable.

The class Error is a subclass of Throwable that indicates serious problems that a reasonable application should not try to catch. Most such errors are abnormal conditions. The ThreadDeath error, though a "normal" condition, is also a subclass of Error because most applications should not try to catch it.
The class Exception is a subclass of Throwable that indicates conditions that a reasonable application might want to catch. 

there are two types of exception:
- checked exception: the compiler forces you to handle the exception. when excends from Exception is an example of checked exception.
- unchecked exception: the compiler does not force you to handle the exception. when extends from RuntimeException is an example of unchecked exception.
