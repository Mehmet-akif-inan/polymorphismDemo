package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		
		
		/*
		BaseLogger[] loggers = new BaseLogger[] {new DatabaseLogger(), new FileLogger(), new EmailLogger(), new ConsoleLogger()};
		
		for(BaseLogger logger: loggers) {
			logger.Log("Log massage");
		}
		*/
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
			customerManager.add();
		/*
		EmailLogger emailLogger = new EmailLogger();
		emailLogger.Log("Log mesaj�");
		
		DatabaseLogger databaseLogger = new DatabaseLogger();
		databaseLogger.Log("Log mesaj�");
		
		FileLogger fileLogger = new FileLogger();
		fileLogger.Log("Log mesaj�");
		*/
	}

}
