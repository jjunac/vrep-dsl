Robot robot{
	connect_to "127.0.0.1":19997
	scenarii{
		Scenario init {
			forward
			print "in s1"
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
				print "in s2 left"
				right
			}
			execute go_forward
		}
	}
	global {
		print "global"
		if object_ahead {
			execute avoid_object
		}
	}
	initial init
}