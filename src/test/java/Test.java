import ljj.mapper.TContent;
import ljj.mapper.TContentMapper;
import ljj.mapper.TShowcontent;
import ljj.mapper.TShowcontentMapper;
import org.junit.Before;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/9/29.
 */
public class Test {

    private TShowcontentMapper tContentMapper;

    @Before
    public void init(){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:/spring-mybatis.xml");//这里路径之前没有配对于是一直出错
        tContentMapper = context.getBean(TShowcontentMapper.class);
    }

    @org.junit.Test
    public void test(){
        System.out.println(tContentMapper);
        TShowcontent t = new TShowcontent();
        t.setcId("1");
        t.setcMy("汉2");
        t.setcMz("汉字2");
        t.setcPerson("ljj2");
        t.setdShowtime(new Date());
        TShowcontent t1 = new TShowcontent();
        t1.setcId("2");
        t1.setcMy("汉4");
        t1.setcMz("汉字4");
        t1.setcPerson("ljj4");
        t1.setdShowtime(new Date());
        List<TShowcontent> list = new ArrayList<TShowcontent>();
        list.add(t);
        list.add(t1);
        tContentMapper.saveOrUpdate(list);
    }
    @org.junit.Test
    public void test1(){

    }


}
