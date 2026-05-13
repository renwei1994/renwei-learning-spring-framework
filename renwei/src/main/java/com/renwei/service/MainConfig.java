package com.renwei.service;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//@Configuration
// 关键点：在这里导入 YellowBean
@Import(YellowBean.class)
public class MainConfig {
}

