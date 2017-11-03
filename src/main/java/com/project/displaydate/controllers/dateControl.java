package com.project.displaydate.controllers;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.tomcat.jni.Time;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class dateControl{
	//Member variables go here

	public dateControl(){

    }
    public static String getDateFormat(){
        Date date = new Date();
        SimpleDateFormat dateFM = new SimpleDateFormat("yyyy-MM-DD");
        String strDate = dateFM.format(date);
        return strDate;
    }
    public static String getTimeFormat(){
        Date date = new Date();
        SimpleDateFormat dateFM = new SimpleDateFormat("HH:mm:ss");
        String strDate = dateFM.format(date);
        return strDate;
    }
	
	@RequestMapping("")
	public String index(){
		return "index";
    }
    @RequestMapping("date")
    public String me(Model model){
        model.addAttribute("date", getDateFormat());
        return "date";
    }	
    @RequestMapping("time")
    public String project(Model model){
        model.addAttribute("time", getTimeFormat());
        return "time";
    }
}