package kodlamaio.hrms.core.utilities.results;

public class SuccessDataResult<T> extends DataResult<T> {
	public SuccessDataResult(T data, String message) {
        super(data,true, message);
    }
    public SuccessDataResult(T data)
    {
        super(data,true);
    }


    public SuccessDataResult(String messge)
    {
        super(null,true,messge);
    }

    public SuccessDataResult()
    {
        super(null,true);
    }
	

}
