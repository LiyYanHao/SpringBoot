package com.wisely.highlight_spring4.ch2.conditional;

/**
 * Created by lyh on 17-5-18.
 */
public class LinuxListCmd implements ListService{
    @Override
    public String showListCmd() {
        return "ls";
    }
}
