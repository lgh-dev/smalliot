package org.lgh.common.domain.entity.devicemodel.prop;

import org.lgh.common.domain.entity.BaseEntity;

/**
 * @author liangguohui@iot-cas.com
 * @version V1.0
 * @Description 时序属性
 * @date 2019/12/22
 */
public class TimingPropertiesDefinition extends BaseEntity{
	//设备型号ID
	private long deviceModeId;
	//属性标识
	private String code;
	//属性名称
	private String name;
	//数据类型
	private String dataType;
	//单位
	private String unit;

}
