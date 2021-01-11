package run.halo.app.service.impl;

import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import org.springframework.util.CollectionUtils;
import run.halo.app.model.entity.PostResource;
import run.halo.app.model.enums.NetworkDiskShareType;
import run.halo.app.repository.PostResourceRepository;
import run.halo.app.service.PostResourceService;
import run.halo.app.service.base.AbstractCrudService;
import run.halo.app.utils.NetworkDiskUtil;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * @author dsyslove@163.com
 * @createtime 2020/12/30--16:19
 * @description
 **/
@Service
public class PostResourceServiceImpl extends AbstractCrudService<PostResource,Integer> implements PostResourceService {
    private final PostResourceRepository postResourceRepository;
    protected PostResourceServiceImpl(PostResourceRepository postResourceRepository) {
        super(postResourceRepository);
        this.postResourceRepository=postResourceRepository;
    }

    @Override
    @Transactional
    public List<PostResource> createOrUpdateByPostId(Integer postId, Set<PostResource> resources) {
        Assert.notNull(postId, "Post id must not be null");
        //firstly remove post resource by post id
        removeByPostId(postId);
        if(CollectionUtils.isEmpty(resources)){
            return Collections.emptyList();
        }
        //save post resource
        resources.forEach(resource->{
            if(StringUtils.isNotEmpty(resource.getUrl())&&StringUtils.isNotEmpty(resource.getName())){
                resource.setPostId(postId);
                resource.setSecretCode(NetworkDiskUtil.geneteSceretCode(6));
                resource.setStatus(NetworkDiskShareType.ABLE.getValue());
                postResourceRepository.save(resource);
            }
        });
        return new ArrayList<>(resources);
    }

    @Override
    public List<PostResource> removeByPostId(Integer postId) {
        Assert.notNull(postId, "Post id must not be null of removeByPostId");
        return postResourceRepository.deleteByPostId(postId);
    }

    @Override
    public List<PostResource> listBy(Integer postId) {
        Assert.notNull(postId, "Post id must not be null");
        return postResourceRepository.findAllByPostId(postId);
    }
}
