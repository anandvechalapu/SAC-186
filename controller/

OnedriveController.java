

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/onedrive")
public class OnedriveController {

    @GetMapping("/login")
    public void login() {
        //code to login to sacral.ai website
    }

    @GetMapping("/configure")
    public void configure() {
        //code to access “Expert Services to change Business” page
    }

    @PostMapping("/onedrivelogin")
    public boolean authenticate(@RequestBody OnedriveCredentials onedriveCredentials) {
        // code to validate the ONEDRIVE credentials and return a response indicating whether authentication was successful or not
        return true;
    }

    @PostMapping("/save")
    public void save(@RequestBody OnedriveCredentials onedriveCredentials) {
        //code to save ONEDRIVE configuration
    }

    @GetMapping("/list")
    public List<OnedriveCredentials> getList(@RequestParam int offset, @RequestParam int limit) {
        //code to get list with Title, User Name, URL, Action
        return new ArrayList<>();
    }

    @PostMapping("/edit")
    public void edit(@RequestBody OnedriveCredentials onedriveCredentials) {
        //code to edit Title, User Name, and URL
    }

    @PostMapping("/delete")
    public void delete(@RequestBody OnedriveCredentials onedriveCredentials) {
        //code to delete a particular title from the list
    }

}