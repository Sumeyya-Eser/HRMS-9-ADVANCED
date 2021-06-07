package kodlamaio.hrms.core.utilities.results;

public class SuccessResult extends Result {
	
	public SuccessResult(boolean success) {
		super(success);
		
	}

	public SuccessResult() {
		super(true);
	}

	public SuccessResult(String message) {
		super(true, message);
		// TODO Auto-generated constructor stub
	}

}
