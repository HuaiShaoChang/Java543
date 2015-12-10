## 在研究 clone 的時候寫的無用程式碼...
還沒學怎麼寫文件@@

# Classes Finder
## Usage
`findAllClasses(obj.getClass())`
### Example
```Java
LinkedHashSet h = new LinkedHashSet();
findAllClasses(h.getClass()).forEach(
        className -> System.out.println(className));
```
### Output:
class java.util.LinkedHashSet  
class java.util.HashSet  
class java.util.AbstractSet  
class java.util.AbstractCollection  
class java.lang.Object

# Interfaces Finder
## Usage
`findAllInterfaces(obj.getClass())`
### Example
```Java
LinkedHashSet h = new LinkedHashSet();
findAllInterfaces(h.getClass()).forEach(
        interfaceName -> System.out.println(interfaceName));
```
### Output:
interface java.util.Set  
interface java.lang.Cloneable  
interface java.io.Serializable  
interface java.util.Collection
