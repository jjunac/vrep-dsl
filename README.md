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
* Please make sure that your `LD_LIBRARY_PATH` (`PATH` on Windows) in your run configuration is set to `${workspace_loc:org.robot.k3project/vrepLibs/Linux/64Bit}`
* The modeling workbench should then be launched successfully

## Interpreting a model
* You can run one of the example model present in the `test` folder
* You can also import the run conditions with the `Shortcut.launch` and the `Skip block.launch` files
* Then you can run the models if you have VREP installed (or comment the robot control command and use the print statement)

## Example
Here is an example of program written with this DSL. The different types are described in the following sections

```
Robot robot{
	connect_to "127.0.0.1":19997
	scenarii{
		Scenario init {
			forward
			execute go_forward
		}
		Scenario go_forward {
			while true {
				forward
			}
			execute avoid_object
		}
		Scenario avoid_object {
			while object_ahead {
				right
			}
			execute go_forward
		}
	}
	global {
		if object_ahead {
			execute avoid_object
		}
	}
	initial init
}
```

## Scenarios and global (shorcuts)
A typical program is represented by multiple Scenario objects contained in a Robot.
However, there is a special type of Scenario called the global. The global is executed between every statement of a scenario. The goal is to react to event that are not exepected in the usual scenario (ie. hit a wall), and hence "shortcut" the scenario to go to another one, to handle this event

## Statements
| Statement | Description                                                           |
| --------- | --------------------------------------------------------------------- |
|`forward`  | Make the robot go forward                                             |
|`right`    | Make the robot turn right                                             |
|`left`     | Make the robot turn left                                              |
|`print`    | Print the specified string in the console of the language workbench   |
|`execute`  | Change the executed scenario                                          |

## Conditional statements
The conditional statements are composed with the keyword, a condition and the statements to execute between curly brackets.
There is a specificities compared to usual programming language: condition are evaluated even between statement, and hence the end of an if block can be skipped for instance.

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







