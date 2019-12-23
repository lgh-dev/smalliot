package org.lgh.common.domain.entity.devicemodel.prop;

import org.lgh.common.domain.entity.BaseEntity;

/**
 * @author liangguohui@iot-cas.com
 * @version V1.0
 * @Description 时序属性
 * @date 2019/12/22
 */
public class SensorData extends BaseEntity{

	private long deviceId;

	private String name;

	private String code;

	private String value;

	private String unit;

}