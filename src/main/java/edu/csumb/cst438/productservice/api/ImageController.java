/*package edu.csumb.cst438.productservice.api;

import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
public class ImageController {

    @GetMapping("/get-text")
    public @ResponseBody String getText() {
        return "Hello world";
    }
    
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/get-image")
    public @ResponseBody byte[] getImage() throws IOException {
        final InputStream in = getClass().getResourceAsStream("cpu.jpg");
        return IOUtils.toByteArray(in);
    }
}*/