/*
 * Copyright 2002-2010 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.amqp.core;

import org.springframework.amqp.AmqpException;

/**
 * To be used with the send method of Amqp template classes (such as RabbitTemplate) 
 * that convert an object to a message.
 * It allows for further modification of the message after it has been processed
 * by the converter. This is useful for setting of Header and Properties.
 *
 * <p>This often as an anonymous class within a method implementation. 
 * @author Mark Pollack
 */
public interface MessagePostProcessor {

	Message postProcessMessage(Message message) throws AmqpException;

}
