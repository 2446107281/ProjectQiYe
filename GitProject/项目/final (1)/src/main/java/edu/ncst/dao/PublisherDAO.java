package edu.ncst.dao;

import edu.ncst.entity.Publishers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PublisherDAO extends JpaRepository<Publishers,Integer>
{

    public List<Publishers> findByUserNameAndPassword(Integer userName, String password);
}
