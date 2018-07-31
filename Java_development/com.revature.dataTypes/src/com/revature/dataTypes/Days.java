package com.revature.dataTypes;

public enum Days {
	MONDAY{
		public void live() {
			System.out.println("It is the first dya of work!");
		}
	}, 
	TUESDAY{
		public void live() {
			System.out.println("The second day of the hard work!");
		}
	}, 
	WEDNESDAY{

		@Override
		public void live() {
			// TODO Auto-generated method stub
			
		}
		
	}, 
	THURSDAY{

		@Override
		public void live() {
			// TODO Auto-generated method stub
			
		}
		
	}, 
	FRIDAY {
		@Override
		public void live() {
			// TODO Auto-generated method stub
			
		}
	}, 
	SATURDAY {
		@Override
		public void live() {
			// TODO Auto-generated method stub
			
		}
	}, 
	SUNDAY {
		@Override
		public void live() {
			// TODO Auto-generated method stub
			
		}
	};
	
	public abstract void live();
}
