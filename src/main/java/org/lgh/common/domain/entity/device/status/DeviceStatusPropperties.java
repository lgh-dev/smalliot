package org.lgh.common.domain.entity.device.status;

import org.lgh.common.domain.entity.BaseEntity;

/**
 * @author liangguohui@iot-cas.com
 * @version V1.0
 * @Description 设备状态属性
 * @date 2019/12/22
 */
public class DeviceStatusPropperties extends BaseEntity{
	//设备的ID
	private String id;
	//设备在线状态
	private String onlineStatus;
	//设备故障状态
	private String faultStatus;

}
