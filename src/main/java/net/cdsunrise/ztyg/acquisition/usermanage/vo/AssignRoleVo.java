package net.cdsunrise.ztyg.acquisition.usermanage.vo;

import lombok.Data;

/**
 * @author Binke Zhang
 * @date 2019/12/24 17:59
 */
@Data
public class AssignRoleVo {
    private Long userId;
    private Long[] roleIds ;
}
