package top.zoowayss.paypalcallback.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;

@RestController
@Slf4j
public class CallbackController {
    @PostMapping("/callback/paypal")
    public String processRequestBody(HttpServletRequest request) {
        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader reader = request.getReader()) {
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Error processing request";
        }
        log.info("call back : \n{}",stringBuilder);
        return stringBuilder.toString();
    }
}
