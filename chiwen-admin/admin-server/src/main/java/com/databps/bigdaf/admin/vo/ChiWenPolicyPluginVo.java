package com.databps.bigdaf.admin.vo;

import com.databps.bigdaf.admin.domain.model.ChiWenPrivilege;
import com.google.common.base.Objects;
import java.util.ArrayList;
import java.util.List;

/**
 * @author merlin
 * @create 2017-10-31 下午2:35
 */
public class ChiWenPolicyPluginVo implements java.io.Serializable{

  private static final long serialVersionUID = -1180364838931330277L;
  private String serviceType;
  private String serviceId;
  private Long lastVersion=1L;
  private String updateTime;
  private Boolean isEnabled;
  private Boolean isAudited;

  private List<ChiWenPrivilege> privileges=new ArrayList<>();

  public Boolean getAudited() {
    return isAudited;
  }

  public void setAudited(Boolean audited) {
    isAudited = audited;
  }

  public Long getLastVersion() {
    return lastVersion;
  }

  public void setLastVersion(Long lastVersion) {
    this.lastVersion = lastVersion;
  }

  public String getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }


  public Boolean getEnabled() {
    return isEnabled;
  }

  public void setEnabled(Boolean enabled) {
    isEnabled = enabled;
  }

  public List<ChiWenPrivilege> getPrivileges() {
    return privileges;
  }

  public void setPrivileges(List<ChiWenPrivilege> privileges) {
    this.privileges = privileges;
  }

  public String getServiceType() {
    return serviceType;
  }

  public void setServiceType(String serviceType) {
    this.serviceType = serviceType;
  }

  public String getServiceId() {
    return serviceId;
  }

  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }

  @Override
  public String toString() {
    return Objects.toStringHelper(this.getClass())
        .add("lastVersion", lastVersion)
        .add("updateTime", updateTime)
        .add("isEnabled", isEnabled)
        .add("privileges", privileges)
        .toString();
  }

}
