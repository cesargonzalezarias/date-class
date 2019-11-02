package es.unileon.prg1.date;

public class Date {

	private int day;
	private int month;
	private int year;
	
	
	public Date(){
		this.day = 1;
		this.month = 1;
		this.year = 2019;
	}
	
	public Date(int day, int month, int year) throws DateException{
		
		StringBuffer message = new StringBuffer();

		if ( day <= 0){
			message.append("Negative days are not allowed\n");
		}
		if ( month <= 0 ){
			message.append("Negative months are not allowed\n");			
		} 
		else {
			if ( month > 12 ){
				message.append("The month number can't be more than 12.\n");							
			} 
		}
		if ( year < 0 ){
			message.append("Negative years are not allowed\n");			
		}
		
		if ( message.length() != 0){
			throw new DateException(message.toString());
		} 
		else {
			this.day = day;
			this.month = month;
			this.year = year;
		}
	}
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) throws DateException{
		if ( day <= 0) {
			throw new DateException("Negative days are not allowed.\n");			
		} else {
			if ( day > 31 ){
				throw new DateException("There are only 31 days.\n");
			} else {
				this.day = day;
			}
		}
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) throws DateException{
		if ( month <= 0) {
			throw new DateException("Negative months are not allowed.\n");			
		} else {
			if ( month > 12 ){
				throw new DateException("There are only 12 months.\n");
			} else {
				this.month = month;
			}
		}
	}
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) throws DateException{
		if ( year < 0) {
			throw new DateException("Negative years are not allowed.\n");			
		} else {
			this.year = year;
		}
	}




}
