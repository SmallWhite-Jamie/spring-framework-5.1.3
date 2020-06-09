package com.logback;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.pattern.color.ANSIConstants;
import ch.qos.logback.core.pattern.color.ForegroundCompositeConverterBase;

import static ch.qos.logback.core.pattern.color.ANSIConstants.BLUE_FG;
import static ch.qos.logback.core.pattern.color.ANSIConstants.BOLD;
import static ch.qos.logback.core.pattern.color.ANSIConstants.DEFAULT_FG;
import static ch.qos.logback.core.pattern.color.ANSIConstants.RED_FG;
import static ch.qos.logback.core.pattern.color.ANSIConstants.YELLOW_FG;

/**
 * ConsumerHighlightingCompositeConverter
 *
 * @author lizheng 日撸代码三千行，不识加班累，只缘bug狂。
 * @version 1.0
 * @date 2020/6/9 9:13
 */
public class ConsumerHighlightingCompositeConverter extends ForegroundCompositeConverterBase<ILoggingEvent>  {
	@Override
	protected String getForegroundColorCode(ILoggingEvent event) {
		Level level = event.getLevel();
		switch (level.toInt()) {
			case Level.ERROR_INT:
				return BOLD + RED_FG;
			case Level.WARN_INT:
				return YELLOW_FG;
			case Level.INFO_INT:
				return BLUE_FG;
			default:
				return DEFAULT_FG;
		}
	}
}
