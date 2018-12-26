package springremote.context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextProvider implements ApplicationContextAware { //testing new repo in Win 7 // start over after test

	private static ApplicationContext context;

	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
		if (this.context == null) {
			this.context = context;
		}
	}

	public static ApplicationContext getApplicationContext() {
		return context;
	}

}
