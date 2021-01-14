package run.halo.app.model.entity;

import lombok.*;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

/**
 * @author dsyslove@163.com
 * @createtime 2020/12/30--15:32
 * @description 文章相关的网盘资源
 **/
@Setter
@Getter
@ToString(callSuper = true)
@RequiredArgsConstructor
@Entity
@Table(name="post_resource")
@EqualsAndHashCode(callSuper = true)
public class PostResource extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "custom-id")
    @GenericGenerator(name = "custom-id", strategy = "run.halo.app.model.entity.support.CustomIdGenerator")
    private Integer id;

    /**
     * 资源关联id
     */
    @Column(name = "post_id")
    private Integer postId;
    /**
     * 资源名称
     */
    @Column(name="name",nullable = false)
    private String name;

    /**
     * 资源链接
     */
    @Lob
    @Column(name="url",nullable = false)
    private String url;
    /**
     * 提取码
     */
    @Column(name="share_code")
    private String shareCode;

    /**
     * 加密码
     */
    @Column(name="secret_code")
    private String secretCode;
    /***
     * 资源类型
     */
    @Column(name="type")
    private String type;
    /***
     * 状态
     */
    @Column(name="status")
    private boolean status;
}
