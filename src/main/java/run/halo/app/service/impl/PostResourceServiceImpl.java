package run.halo.app.service.impl;

import org.springframework.stereotype.Service;
import run.halo.app.model.entity.PostResource;
import run.halo.app.repository.PostResourceRepository;
import run.halo.app.repository.base.BaseRepository;
import run.halo.app.service.PostResourceService;
import run.halo.app.service.base.AbstractCrudService;

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
}
