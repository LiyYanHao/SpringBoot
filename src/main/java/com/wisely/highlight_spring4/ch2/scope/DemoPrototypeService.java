package com.wisely.highlight_spring4.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by lyh on 17-5-18.
 */
@Service
@Scope("prototype")//prototype
public class DemoPrototypeService {
}
