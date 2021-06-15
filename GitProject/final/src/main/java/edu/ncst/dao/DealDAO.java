package edu.ncst.dao;
import edu.ncst.entity.Deal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping
public interface DealDAO extends JpaRepository<Deal,Integer>{
    //通过任务id找到小哥id
    @Query(value = "" +
            "select distinct runner_id " +
            "from deal_table " +
            "where task_id=?" ,
            nativeQuery = true)
    public Integer findRunner_idBytask_id(Integer task_id);

    @Query(value = "" +
            "select distinct deal_id " +
            "from deal_table " +
            "where task_id=?" ,
            nativeQuery = true)
    public Integer findDeal_idBytask_id(Integer task_id);

}
