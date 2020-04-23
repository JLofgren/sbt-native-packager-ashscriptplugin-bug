# sbt-native-packager-ashscriptplugin-bug

This example demonstrates a bug in the AshScriptPlugin with DockerPlugin in sbt-native-packager.

https://github.com/sbt/sbt-native-packager/issues/1332

## To reproduce

Build:

    sbt docker:publishLocal

In this example, the expected argsLength should be 0, but...

    $ docker run sbt-native-packager-ashscriptplugin-bug:0.1.0-SNAPSHOT
    argsLength=1, args=List('')
    
In this example, the expected argsLength should be 2, but...

    $ docker run sbt-native-packager-ashscriptplugin-bug:0.1.0-SNAPSHOT --foo bar
    argsLength=1, args=List(' --foo bar')
