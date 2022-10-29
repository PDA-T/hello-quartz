package com.pda.hello.quartz;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author PDA
 * @Date 2022/10/29 23:51
 * @Description 任务调度
 * @since version-1.0
 */
@Component
public class PrintCurrentTimeTask {

	/**
	 * @author PDA
	 * @Date 2022/10/29 23:52
	 * @Description 每10秒打印当前时间
	 * @since version-1.0
	 */
	@Scheduled(cron = "0/10 * * * * ?")
	public void printCurrentTime(){
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
	}
}
