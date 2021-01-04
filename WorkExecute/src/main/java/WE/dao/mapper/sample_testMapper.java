package WE.dao.mapper;


import WE.dao.entity.sample_test;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface sample_testMapper {
    List<sample_test> getAllCollect();
}
