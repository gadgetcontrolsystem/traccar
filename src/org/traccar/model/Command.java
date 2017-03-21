/*
 * Copyright 2015 - 2017 Anton Tananaev (anton@traccar.org)
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
package org.traccar.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Command extends Message {

    public static final String TYPE_CUSTOM = "custom";
    public static final String TYPE_IDENTIFICATION = "deviceIdentification";
    public static final String TYPE_POSITION_SINGLE = "positionSingle";
    public static final String TYPE_POSITION_PERIODIC = "positionPeriodic";
    public static final String TYPE_POSITION_STOP = "positionStop";
    public static final String TYPE_ENGINE_STOP = "engineStop";
    public static final String TYPE_ENGINE_RESUME = "engineResume";
    public static final String TYPE_ALARM_ARM = "alarmArm";
    public static final String TYPE_ALARM_DISARM = "alarmDisarm";
    public static final String TYPE_SET_TIMEZONE = "setTimezone";
    public static final String TYPE_REQUEST_PHOTO = "requestPhoto";
    public static final String TYPE_REBOOT_DEVICE = "rebootDevice";
    public static final String TYPE_SEND_SMS = "sendSms";
    public static final String TYPE_SEND_USSD = "sendUssd";
    public static final String TYPE_SOS_NUMBER = "sosNumber";
    public static final String TYPE_SILENCE_TIME = "silenceTime";
    public static final String TYPE_SET_PHONEBOOK = "setPhonebook";
    public static final String TYPE_VOICE_MESSAGE = "voiceMessage";
    public static final String TYPE_OUTPUT_CONTROL = "outputControl";
    public static final String TYPE_VOICE_MONITORING = "voiceMonitoring";
    public static final String TYPE_SET_AGPS = "setAgps";
    public static final String TYPE_SET_INDICATOR = "setIndicator";

    public static final String TYPE_MODE_POWER_SAVING = "modePowerSaving";
    public static final String TYPE_MODE_DEEP_SLEEP = "modeDeepSleep";

    public static final String TYPE_ALARM_GEOFENCE = "movementAlarm";
    public static final String TYPE_ALARM_BATTERY = "alarmBattery";
    public static final String TYPE_ALARM_SOS = "alarmSos";
    public static final String TYPE_ALARM_REMOVE = "alarmRemove";
    public static final String TYPE_ALARM_CLOCK = "alarmClock";
    public static final String TYPE_ALARM_SPEED = "alarmSpeed";
    public static final String TYPE_ALARM_FALL = "alarmFall";
    public static final String TYPE_ALARM_VIBRATION = "alarmVibration";

    public static final String KEY_UNIQUE_ID = "uniqueId";
    public static final String KEY_FREQUENCY = "frequency";
    public static final String KEY_TIMEZONE = "timezone";
    public static final String KEY_DEVICE_PASSWORD = "devicePassword";
    public static final String KEY_RADIUS = "radius";
    public static final String KEY_MESSAGE = "message";
    public static final String KEY_ENABLE = "enable";
    public static final String KEY_DATA = "data";
    public static final String KEY_INDEX = "index";
    public static final String KEY_PHONE = "phone";

    /**New params*/
    public static final String KEY_PORT = "port";
    public static final String KEY_LANGUAGE = "language";
    public static final String KEY_URL = "url";
    public static final String KEY_PASSWORD = "password";
    public static final String KEY_WORKTIME = "worktime";
    public static final String KEY_APN_NAME = "apnName";
    public static final String KEY_APN_USER_NAME = "apnUserName";
    public static final String KEY_APN_CODE = "apnCode";
    public static final String KEY_APN_USER_DATA = "apnUserData";

    /**New commands*/
    public static final String TYPE_CENTER_NUMBER = "setCenterNumber";
    public static final String TYPE_ASSIST_NUMBER = "setAssistNumber";
    public static final String TYPE_CONTROL_PASSWORD = "setPassword";
    public static final String TYPE_MONITOR = "monitorDevice";
    public static final String TYPE_REMOTE_UPGRADE = "remoteUpgrade";
    public static final String TYPE_IP_PORT = "setIpPort";
    public static final String TYPE_FACTORY_RESET = "factoryReset";
    public static final String TYPE_LANG_TIME_AREA = "setLangTimeArea";
    public static final String TYPE_QUERY_GOOGLE_LINK = "queryGoogleLink";
    public static final String TYPE_APN_SETTINGS = "setApnSettings";
    public static final String TYPE_SMS_ACCESS_SETTINGS = "setSmsAccessSettings";
    public static final String TYPE_PARAMETER_QUERY = "parameterQuery";
    public static final String TYPE_VERSION_QUERY = "versionQuery";
    public static final String TYPE_LOCATION_ORDER = "locationOrder";
    public static final String TYPE_BLUETOOTH_CONTROL_ORDER = "bluetoothControlOrder";
    public static final String TYPE_WORKING_TIME_AREA_DIRECTIVE = "workingTimeAreaDirective";
    public static final String TYPE_WORKTIME = "setWorkTime";
    public static final String TYPE_SHUTDOWN = "shutDown";
    public static final String TYPE_PULSE_QUERY = "pulseQuery";
    public static final String TYPE_PEDOMETER = "setPedometer";
    public static final String TYPE_PEDOMETER_WALKTIME = "setPedometerWalkTime";
    public static final String TYPE_SLEEPTIME = "setSleepTime";
    public static final String TYPE_LOCATE = "locate";
    public static final String TYPE_SHOW_MESSAGE = "showMessage";
    public static final String TYPE_SMS_ON_OFF = "setSmsOnOrOff";
    public static final String TYPE_AUTOMATIC_PICKUP = "setAutomaticPickUp";
    public static final String TYPE_WHITELIST1 = "setWhiteList1";
    public static final String TYPE_WHITELIST2 = "setWhiteList2";
    public static final String TYPE_CALL_PHONE = "phoneCall";
    public static final String TYPE_SET_PHONEBOOK2 = "setPhonebook2";

    private boolean textChannel;

    public boolean getTextChannel() {
        return textChannel;
    }

    public void setTextChannel(boolean textChannel) {
        this.textChannel = textChannel;
    }

}
