jExt - Spring
================================================================================

This module is an extension to [jExt][1] that provides a new `ExtensionLoader` connected to
the Spring bean management. This way, every bean managed by Spring would be retrieved by the
**jExt** `ExtensionManager`.

Usage
-----------------------------------------------------------------------------------------
Simply include this library as a dependency. No further configuration is required.


### Maven dependency
Include the following within the `<dependencies>` section of your `pom.xml` file:
```xml
<dependency>
    <groupId>jext</groupId>
    <artifactId>jext-spring</artifactId>
    <version>1.0.0</version>
</dependency>
```

Use the following repository to obtain this artifact:

```xml
<repositories>
    <repository>
        <id>github</id>
        <url>https://luiinge.github.io/maven-repo</url>
    </repository>
</repositories>
```

License
-----------------------------------------------------------------------------------------

```
    MIT License

    Copyright (c) 2020 Luis Iñesta Gelabert - luiinge@gmail.com

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to deal
    in the Software without restriction, including without limitation the rights
    to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
    copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:

    The above copyright notice and this permission notice shall be included in all
    copies or substantial portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
    OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
    SOFTWARE.
```


Authors
-----------------------------------------------------------------------------------------

- Luis Iñesta Gelabert  |  luiinge@gmail.com


Contributions
-----------------------------------------------------------------------------------------
If you want to contribute to this project, visit the
[Github project](https://github.com/luiinge/jext-spring). You can open a new issue / feature
request, or make a pull request to consider. If your contribution is worthing, you will be added
as a contributor in this very page.




[1]: <https://github.com/luiinge/jext>



