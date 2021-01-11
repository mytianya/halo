package run.halo.app.model.params;

import lombok.Data;
import run.halo.app.model.dto.base.InputConverter;
import run.halo.app.model.entity.PostResource;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author dsyslove@163.com
 * @createtime 2020/12/30--15:55
 * @description 接收前端网盘参数
 **/
@Data
public class PostResourceParam implements InputConverter<PostResource> {
    @NotBlank(message = "资源描述不能为空")
    @Size(max=100,message = "资源描述信息不能超过100")
    private String name;
    @NotBlank(message = "资源链接不能为空")
    private String url;
    private String shareCode;
    private boolean status;
}
