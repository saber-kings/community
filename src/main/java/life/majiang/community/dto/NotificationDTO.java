package life.majiang.community.dto;

import lombok.Data;

/**
 * @Auther:luanzhaofei@outlook.com
 * @Date:2019/9/28
 * @Description:life.majiang.community.dto
 * @version:1.0
 */
@Data
public class NotificationDTO {
    private Long id;
    private Long gmtCreate;
    private Integer status;
    private Long notifier;
    private String notifierName;
    private String outerTitle;
    private Long outerid;
    private String typeName;
    private Integer type;
}
