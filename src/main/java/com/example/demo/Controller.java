package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.aspectj.lang.JoinPoint;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@RequiredArgsConstructor
public class Controller implements HandlerInterceptor {
//    private final UserRepository userRepository;
    @GetMapping("/test")
    public String test(HttpServletRequest request, HttpServletResponse response, Object handler, ServletRequest reques){
//        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
String a=request.getPathInfo();
        // Lấy thông tin về handler (controller method)
        String className = reques.getParameter("class");  // Đây chỉ là một ví dụ, bạn có thể lấy thông tin từ request hoặc header
        String methodName = reques.getParameter("method");
        Object handlerds = RequestContextHolder.currentRequestAttributes().getAttribute("org.springframework.web.servlet.HandlerMapping.bestMatchingHandler", 0);
        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;

            Class<?> clazz = handlerMethod.getBeanType();
//            String className = clazz.getName();
//            String methodName = handlerMethod.getMethod().getName();

            System.out.println("Class Name: " + className);
            System.out.println("Method Name: " + methodName);
        }

//        UserDTO userDTO= new UserDTO();
//        userDTO.setId(1l);
//        userDTO.setUserName("Duc");
//        userDTO.setPass("123456");
//        userRepository.save(userDTO);
        return "dsdsadsadsa";
    }
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        // Chưa cần làm gì sau khi xử lý xong request
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        // Chưa cần làm gì sau khi hoàn thành việc xử lý request
    }
}
