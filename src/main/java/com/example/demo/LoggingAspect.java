//package com.example.demo;
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.springframework.stereotype.Component;
//
//@Aspect
//@Component
//public class LoggingAspect {
//
////    @Before("execution(* com.example.demo.*(..))")
//    public void logBefore(JoinPoint joinPoint) {
//        String className = joinPoint.getSignature().getDeclaringTypeName();
//        String methodName = joinPoint.getSignature().getName();
//
//        System.out.println("Before " + className + "." + methodName + "()");
//    }
//
//    @AfterReturning(pointcut = "execution(* com.example.demo.Controller*.*(..))", returning = "result")
//    public void logAfterReturning(JoinPoint joinPoint, Object result) {
//        String className = joinPoint.getSignature().getDeclaringTypeName();
//        String methodName = joinPoint.getSignature().getName();
//
//        System.out.println("After " + className + "." + methodName + "()");
//    }
//}
