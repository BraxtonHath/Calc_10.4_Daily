package io.braxton.calc.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(@RequestParam(value = "numOne", required = false, defaultValue = "0") double numOne,
                        @RequestParam(value = "numTwo", required = false, defaultValue = "0") double numTwo,
                        @RequestParam(value = "operators", required = false, defaultValue = "+") String operators,
                        ModelMap model){
        String choice = operators;
        double answer = 0;
        switch (choice){
            case "+":
            answer = numOne + numTwo;
            System.out.println(answer);
            break;

            case "-":
                answer = numOne - numTwo;
                System.out.println(answer);
                break;

            case "/":
                answer = numOne / numTwo;
                System.out.println(answer);
                break;

            case "*":
                answer = numOne * numTwo;
                System.out.println(answer);
                break;
        }

        model.addAttribute("pageData",  numOne + " " + operators + " "+ numTwo + " = " + answer);
        return "index";
    }

}
