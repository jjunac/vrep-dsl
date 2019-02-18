# Language Behavioral Semantics
### Robot control language
### By Jeremy Junac (SI5)

## Installation

* `git clone https://github.com/jjunac/vrep-dsl`
* Launch Gemoc Studio
* Then Import -> Projects from Folder or Archive -> select the vrep-dsl repositories
* Make sure that the nested project are enabled then validate
* The project should be imported successfully

## Launching the Modeling Workbench
* You can import the launch configuration of the modeling workbench with the `modelingWB.launch`
* Please make sure that your `LD_LIBRARY_PATH` (`PATH` on Windows) in your run configuration is set to `${workspace_loc}/.metadata/.plugins/org.eclipse.pde.core/ModelingWB`
* The modeling workbench should then be launched successfully

## Interpreting a model
* You can run one of the example model present in the `test` folder
* You can also import the run conditions with the `Shortcut.launch` and the `Skip block.launch` files
* Then you can run the models if you have VREP installed (or comment the robot control command and use the print statement)

## Statements
| Statement | Description                                                           |
| --------- | --------------------------------------------------------------------- |
|`forward`  | Make the robot go forward                                             |
|`right`    | Make the robot turn right                                             |
|`left`     | Make the robot turn left                                              |
|`print`    | Print the specified string in the console of the language workbench   |
|`execute`  | Change the executed scenario                                          |

## Conditional statements
The conditional statements are composed with the keyword, a condition and the statements to execute between curly brackets

| Keyword   | Description                                                           |
| --------- | --------------------------------------------------------------------- |
|`if`       | If the condition is true                                              |
|`while`    | While the condition is true                                           |
|`until`    | While the condition is false                                          |

## Conditions

| Condition     | Description                                                       |
| ------------- | ----------------------------------------------------------------- |
|`true`         | Always true                                                       |
|`object_ahead` | If an object (ball or wall) is detected by the sensor             |







