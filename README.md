# 学习官方例子
## .proto文件编译转Java
创建Maven项目，下载gRPC相关包，添加配置到pom.xml：

``` xml
<properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <java.version>1.7</java.version>
    <grpc.version>1.12.0</grpc.version>
    <protoc.version>3.5.1</protoc.version>
</properties>

<dependencies>
    <dependency>
        <groupId>io.grpc</groupId>
        <artifactId>grpc-netty</artifactId>
        <version>${grpc.version}</version>
    </dependency>
    <dependency>
        <groupId>io.grpc</groupId>
        <artifactId>grpc-protobuf</artifactId>
        <version>${grpc.version}</version>
    </dependency>
    <dependency>
        <groupId>io.grpc</groupId>
        <artifactId>grpc-stub</artifactId>
        <version>${grpc.version}</version>
    </dependency>
</dependencies>
```
把基于protobuf的代码生成工具集成到maven，修改pom.xml：
``` xml
<build>
    <extensions>
        <extension>
            <groupId>kr.motd.maven</groupId>
            <artifactId>os-maven-plugin</artifactId>
            <version>1.5.0.Final</version>
        </extension>
    </extensions>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <version>3.1</version>
            <configuration>
                <source>${java.version}</source>
                <target>${java.version}</target>
                <encoding>${project.build.sourceEncoding}</encoding>
                <wtpapplicationxml>true</wtpapplicationxml>
            </configuration>
        </plugin>
        <plugin>
            <groupId>org.xolstice.maven.plugins</groupId>
            <artifactId>protobuf-maven-plugin</artifactId>
            <version>0.5.1</version>
            <configuration>
                <protocArtifact>com.google.protobuf:protoc:3.5.1-1:exe:${os.detected.classifier}</protocArtifact>
                <pluginId>grpc-java</pluginId>
                <pluginArtifact>io.grpc:protoc-gen-grpc-java:1.12.0:exe:${os.detected.classifier}</pluginArtifact>
            </configuration>
            <executions>
                <execution>
                    <goals>
                        <goal>compile</goal>
                        <goal>compile-custom</goal>
                    </goals>
                </execution>
            </executions>
        </plugin>
    </plugins>
</build>
```

在Maven项目中创建src/main/proto，并在下面放置下面3个.proto文件：
helloworld.proto <br>
hello_streaming.proto <br>
route_guide.proto <br>

执行Maven命令：
mvn clean generate-sources

target/generated-sources目录下可以找到生成的源码<br>
target/protoc-plugins目录下可以找到对应当前系统的代码生成工具<br>
我这里的用的win 10，生成工具如下：<br>
protoc-3.5.1-1-windows-x86_64.exe
protoc-gen-grpc-java-1.12.0-windows-x86_64.exe

另外，可以在win系统上通过上面工具编译.proto文件生成Java代码，如下所示：<br>
protoc-3.5.1-1-windows-x86_64.exe --java_out=./java ./proto/helloworld.proto<br>
protoc-3.5.1-1-windows-x86_64.exe --plugin=protoc-gen-grpc-java=D:/devenv/protoc-gen/protoc-gen-grpc-java-1.12.0-windows-x86_64.exe --grpc-java_out=java --proto_path=proto ./proto/helloworld.proto


