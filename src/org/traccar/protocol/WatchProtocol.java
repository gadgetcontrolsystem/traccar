/*
 * Copyright 2015 - 2016 Anton Tananaev (anton@traccar.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.traccar.protocol;

import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.handler.codec.string.StringDecoder;
import org.jboss.netty.handler.codec.string.StringEncoder;
import org.traccar.BaseProtocol;
import org.traccar.CharacterDelimiterFrameDecoder;
import org.traccar.TrackerServer;
import org.traccar.model.Command;

import java.util.List;

public class WatchProtocol extends BaseProtocol {

    public WatchProtocol() {
        super("watch");
        setSupportedDataCommands(
                Command.TYPE_POSITION_SINGLE,
                Command.TYPE_POSITION_PERIODIC,
                Command.TYPE_SOS_NUMBER,
                Command.TYPE_ALARM_SOS,
                Command.TYPE_ALARM_BATTERY,
                Command.TYPE_REBOOT_DEVICE,
                Command.TYPE_ALARM_REMOVE,
                Command.TYPE_SILENCE_TIME,
                Command.TYPE_ALARM_CLOCK,
                Command.TYPE_SET_PHONEBOOK,
                Command.TYPE_VOICE_MESSAGE,
                Command.TYPE_SET_TIMEZONE,
                Command.TYPE_SET_INDICATOR,
                Command.TYPE_CALL_PHONE,
                Command.TYPE_CENTER_NUMBER,
                Command.TYPE_ASSIST_NUMBER,
                Command.TYPE_CONTROL_PASSWORD,
                Command.TYPE_MONITOR,
                Command.TYPE_REMOTE_UPGRADE,
                Command.TYPE_IP_PORT,
                Command.TYPE_FACTORY_RESET,
                Command.TYPE_LANG_TIME_AREA,
                Command.TYPE_QUERY_GOOGLE_LINK,
                Command.TYPE_APN_SETTINGS,
                Command.TYPE_SMS_ACCESS_SETTINGS,
                Command.TYPE_PARAMETER_QUERY,
                Command.TYPE_VERSION_QUERY,
                Command.TYPE_LOCATION_ORDER,
                Command.TYPE_BLUETOOTH_CONTROL_ORDER,
                Command.TYPE_WORKING_TIME_AREA_DIRECTIVE,
                Command.TYPE_WORKTIME,
                Command.TYPE_SHUTDOWN,
                Command.TYPE_PULSE_QUERY,
                Command.TYPE_PEDOMETER,
                Command.TYPE_PEDOMETER_WALKTIME,
                Command.TYPE_SLEEPTIME,
                Command.TYPE_LOCATE,
                Command.TYPE_SHOW_MESSAGE,
                Command.TYPE_SMS_ON_OFF,
                Command.TYPE_AUTOMATIC_PICKUP,
                Command.TYPE_WHITELIST1,
                Command.TYPE_WHITELIST2,
                Command.TYPE_CALL_PHONE,
                Command.TYPE_SET_PHONEBOOK2);
    }

    @Override
    public void initTrackerServers(List<TrackerServer> serverList) {
        serverList.add(new TrackerServer(new ServerBootstrap(), getName()) {
            @Override
            protected void addSpecificHandlers(ChannelPipeline pipeline) {
                pipeline.addLast("frameDecoder", new CharacterDelimiterFrameDecoder(1024, ']'));
                pipeline.addLast("stringEncoder", new StringEncoder());
                pipeline.addLast("stringDecoder", new StringDecoder());
                pipeline.addLast("objectEncoder", new WatchProtocolEncoder());
                pipeline.addLast("objectDecoder", new WatchProtocolDecoder(WatchProtocol.this));
            }
        });
    }

}
