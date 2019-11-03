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
	
	public Date(Date other){
		this.day = other.getDay();
		this.month = other.getMonth();
		this.year = other.getYear();
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
	
	public boolean isSameDay(Date other){
		if ( this.day == other.getDay() ) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean isSameMonth(Date other){
		if ( this.month == other.getMonth() ) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isSameYear(Date other){
		if ( this.year == other.getYear() ) {
			return true;
		} else {
			return false;
		}
	}

	public String getMonthName(){
		
		String name = null;
		switch (this.month){
		case 1:
			name = "January";
			break;
		case 2:
			name = "February";
			break;
		case 3:
			name = "March";
			break;
		case 4:
			name = "April";
			break;
		case 5:
			name = "May";
			break;
		case 6:
			name = "June";
			break;
		case 7:
			name = "July";
			break;
		case 8:
			name = "August";
			break;
		case 9:
			name = "September";
			break;
		case 10:
			name = "October";
			break;
		case 11:
			name = "November";
			break;
		case 12:
			name = "December";
			break;
		}
		return name;
	}
	
	public int daysOfMonth(int month){
		int number = 0;
		switch (this.month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				number = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				number = 30;
				break;
			case 2:
				number = 28;
				break;
			default:
				number = -1;
				break;
		}
		return number;
	}

	public int daysOfMonth(){
		return daysOfMonth(this.month);
	}

	public String getSeasonName(){
		String name = null;
		switch (this.month){
			case 12:
			case 1:
			case 2: 
				name = "Winter";
				break;
			case 3:
			case 4:
			case 5:
				name = "Spring";
				break;
			case 6:
			case 7:
			case 8:
				name = "Summer";
				break;
			case 9:
			case 10:
			case 11:
				name = "Autumn";
				break;
		}
		return name;
	}


}
