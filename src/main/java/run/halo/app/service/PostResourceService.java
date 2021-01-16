package run.halo.app.service;

import org.springframework.lang.NonNull;
import run.halo.app.model.entity.PostResource;
import run.halo.app.service.base.CrudService;

import java.util.List;
import java.util.Set;

/**
 * @author dsyslove@163.com
 * @createtime 2020/12/30--16:17
 * @description
 **/
public interface PostResourceService extends CrudService<PostResource, Integer> {
    List<PostResource> createOrUpdateByPostId(@NonNull Integer postId, Set<PostResource> resources);
    List<PostResource> removeByPostId(@NonNull Integer postId);
    @NonNull
    List<PostResource> listBy(@NonNull Integer postId);
}
