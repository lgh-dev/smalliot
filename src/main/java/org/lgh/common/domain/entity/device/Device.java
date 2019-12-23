package org.lgh.common.domain.entity.device;

import org.lgh.common.domain.entity.BaseEntity;

/**
 * @author liangguohui@iot-cas.com
 * @version V1.0
 * @Description 物联网设备
 * @date 2019/12/22
 */
public class Device extends BaseEntity{

	//设备型号ID
	private long deviceModelId;
	//设备uid
	private String uid;
	//设备名称
	private String name;
	//经度
	private String longitude;
	//纬度
	private String latitude;

}
