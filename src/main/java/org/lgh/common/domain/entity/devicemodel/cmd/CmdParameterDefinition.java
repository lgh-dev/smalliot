package org.lgh.common.domain.entity.devicemodel.cmd;

import org.lgh.common.domain.entity.BaseEntity;

/**
 * @author liangguohui@iot-cas.com
 * @version V1.0
 * @Description 指令定义
 * @date 2019/12/23
 */
public class CmdParameterDefinition extends BaseEntity{
	//指令ID
	private long cmdDefinitionId;
	//指令标识
	private String code;
	//指令名称
	private String name;
	//指令类型
	private String dataType;
	//默认值
	private String defaultValue;
	//事件描述
	private String desc;


}
