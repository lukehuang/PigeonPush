package com.liewmanchoi.api;

import com.liewmanchoi.domain.message.PushMessage;

/**
 * @author wangsheng
 * @date 2019/7/10
 */
@FunctionalInterface
public interface MessageProcessor {

  void process(PushMessage message);
}
