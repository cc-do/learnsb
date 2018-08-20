package com.bigdata.learnsb;

import com.bigdata.learnsb.property.UrlProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class LearnsbApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(LearnsbApplication.class, args);

        Binder binder = Binder.get(context.getEnvironment());

        // 绑定简单配置
//        UrlProperties url = binder.bind("spring2.my-example", Bindable.of(UrlProperties.class)).get();
//        System.out.println(url.getUrl());

//        // 绑定List配置
        List<String> post = binder.bind("spring2.my-example.url", Bindable.listOf(String.class)).get();
        System.out.println(post.get(0));
        System.out.println(post.get(1));
//
//        List<PostInfo> posts = binder.bind("com.didispace.posts", Bindable.listOf(PostInfo.class)).get();
//        System.out.println(posts);
//
//        // 读取配置
//        System.out.println(context.getEnvironment().containsProperty("com.didispace.database-platform"));
//        System.out.println(context.getEnvironment().containsProperty("com.didispace.databasePlatform"));
    }
}
