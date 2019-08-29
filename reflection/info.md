# Reflection

### Reflection is an API which is used to examine or modify the behavior of methods, classes, interfaces at runtime.

### For example, say you have an object of an unknown type in Java, and you would like to call a 'doSomething' method on it if one exists. Java's static typing system isn't really designed to support this unless the object conforms to a known interface, but using reflection, your code can look at the object and find out if it has a method called 'doSomething' and then call it if you want to.

- The required classes for reflection are provided under java.lang.reflect package.

- Reflection gives us information about the class to which an object belongs and also the methods of that class which can be executed by using the object.

- Through reflection we can invoke methods at runtime irrespective of the access specifier used with them.

---
## Reflection can be used to get information about:

1. **Class** : The getClass() method is used to get the name of the class to which an object belongs.

2. **Constructors** : The getConstructors() method is used to get the public constructors of the class to which an object belongs.

3. **Methods** : The getMethods() method is used to get the public methods of the class to which an objects belongs.