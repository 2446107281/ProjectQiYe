package Runner_person.dao;

import Runner_person.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PublisherDAO extends JpaRepository<Publisher,Integer>
{

    public List<Publisher> findByUserAccountAndPassword(Integer Useraccount,String Password);
}
