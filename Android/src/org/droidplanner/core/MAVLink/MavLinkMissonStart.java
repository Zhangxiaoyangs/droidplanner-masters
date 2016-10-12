package org.droidplanner.core.MAVLink;

import com.MAVLink.common.msg_command_long;
import com.MAVLink.enums.MAV_CMD;

import org.droidplanner.core.model.Drone;

/**
 * Created by tq on 2016/10/10.
 */

public class MavLinkMissonStart {
    public static void sendMssionStartMessage(Drone drone) {
        msg_command_long msg = new msg_command_long();
        msg.target_system = drone.getSysid();
        msg.target_component = drone.getCompid();
        msg.command = MAV_CMD.MAV_CMD_MISSION_START;
        msg.param1 =0;
        msg.param2 = 0;
        msg.param3 = 1;
        msg.param4 = 0;
        msg.param5 = 0;
        msg.param6 = 0;
        msg.param7 = 0;
        msg.confirmation = 0;
        drone.getMavClient().sendMavPacket(msg.pack());
    }
}
