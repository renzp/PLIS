package item.dao;

import item.entity.ItemEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ItemDao {

    List<ItemEntity> getItemList(@Param("jobId") String jobId, @Param("drawCode") String drawCode, @Param("status") String status);
}
