package item.service;

import item.entity.ItemEntity;

import java.util.List;

public interface ItemService {

    List<ItemEntity> getItemList(String jobId, String drawCode, String status);
}
