package com.zzxlab.input.topic;


import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 
 * @Comment
 * @Class Name UserPara
 * @Author kongxs
 * @Create In 2015年6月25日
 */
public class BasePara implements Serializable {
	
	@NotNull(message = "{fromSystem.isNotNull}")
	private String fromSystem;

	/**
	 * @Return the String fromSystem
	 */
	public String getFromSystem() {
		return fromSystem;
	}

	/**
	 * @Param String fromSystem to set
	 */
	public void setFromSystem(String fromSystem) {
		this.fromSystem = fromSystem;
	}
	
}
