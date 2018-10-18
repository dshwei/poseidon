package com.yoke.poseidon.web.serviceImpl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yoke.poseidon.web.dto.ItemCatDto;
import com.yoke.poseidon.web.entity.ItemCat;
import com.yoke.poseidon.web.mapper.ItemCatMapper;
import com.yoke.poseidon.web.service.ItemCatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author ehereal
 * @since 2018-09-20
 */
@Service
public class ItemCatServiceImpl extends ServiceImpl<ItemCatMapper, ItemCat> implements ItemCatService {
    @Autowired
    private ItemCatMapper itemCatMapper;

    @Override
    public List<ItemCat> listRootCat() {
        return itemCatMapper.listRootCat();
    }

    @Override
    public List<ItemCatDto> listCatBySortOrder(int limit) {
        return itemCatMapper.listCatBySortOrder(limit);
    }
}