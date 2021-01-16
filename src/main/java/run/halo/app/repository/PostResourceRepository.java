package run.halo.app.repository;

import org.springframework.lang.NonNull;
import run.halo.app.model.entity.PostResource;
import run.halo.app.repository.base.BaseRepository;

import java.util.List;

/**
 * @author dsyslove@163.com
 * @createtime 2020/12/30--16:14
 * @description
 **/
public interface PostResourceRepository  extends BaseRepository<PostResource, Integer> {
    @NonNull
    List<PostResource> findAllByPostId(@NonNull Integer postId);

    @NonNull
    List<PostResource> deleteByPostId(@NonNull Integer postId);

}
