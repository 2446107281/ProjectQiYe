package Runner_person.entity;
import javax.persistence.*;

@Entity
@Table(name="publisher_table")

public class Publisher {
    @Id    //主键
    @GeneratedValue(strategy = GenerationType.AUTO)  //自动递增
    private Integer Publisher_id;     //发布者id

    private String Username;     //发布者用户名

    private Integer Useraccount;     //发布者账号

    private String Password;     //发布者密码

    private String Contact;//发布者联系方式

    public Integer getPublisher_id() {
        return Publisher_id;
    }

    public void setPublisher_id(Integer publisher_id) {
        Publisher_id = publisher_id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public Integer getUseraccount() {
        return Useraccount;
    }

    public void setUseraccount(Integer useraccount) {
        Useraccount = useraccount;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }

    @Override
    public String toString() {
        return "Publisher{" +
                "Publisher_id=" + Publisher_id +
                ", Username='" + Username + '\'' +
                ", Useraccount=" + Useraccount +
                ", Password='" + Password + '\'' +
                ", Contact='" + Contact + '\'' +
                '}';
    }
}
