package org.lgh.common.domain.entity.devicemodel.cmd;

import org.lgh.common.domain.entity.BaseEntity;

/**
 * @author liangguohui@iot-cas.com
 * @version V1.0
 * @Description 指令定义
 * @date 2019/12/23
 */
public class CmdDefinition extends BaseEntity{
	//设备型号ID
	private long deviceModelId;
	//指令标识
	private String code;
	//指令名称
	private String name;
	//指令类型
	private String eventType;
	//事件描述
	private String desc;

}
