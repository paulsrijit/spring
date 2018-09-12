package springremoteserviceweb.context;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class ApplicationContextProvider implements ApplicationContextAware {

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
