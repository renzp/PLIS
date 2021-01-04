package WE.service.impl;

import WE.dao.entity.sample_test;
import WE.dao.mapper.sample_testMapper;
import WE.service.sample_testService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class sample_testServiceImpl implements sample_testService {

    @Resource
    private sample_testMapper collectMapper;

    @Override
    public List<sample_test> getAllCollect() {
        return collectMapper.getAllCollect();
    }
}
