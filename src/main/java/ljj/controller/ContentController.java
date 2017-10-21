package ljj.controller;
import ljj.mapper.TShowcontent;
import ljj.mapper.TShowcontentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;
@Controller
public class ContentController {

    @Autowired
    private TShowcontentMapper tShowcontentMapper;

    @RequestMapping(value = "/getContent", method = RequestMethod.GET)
    @ResponseBody
    public List<TShowcontent> getFavorites() {
       List<TShowcontent> list = tShowcontentMapper.getRsList();
        return list;
    }
}
