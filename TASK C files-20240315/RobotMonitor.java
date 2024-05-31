public class RobotMonitor
{
   	// constant (ensure you have at least MAX)
   	public static final int MAX = 6;
	   public static final int MIN=1;

	   private int row ;
	   private int column;

	   Move move;
	// attributes   
   	
	// invariant
	public boolean inv()
	{
		return
				(row >= MIN && row <= MAX) && (column >= MIN && column <= MAX) && ((row == MIN && column == MIN && move == null) || (move != null));


	}
   	
   	// initialisation
   	public RobotMonitor()
   	{

		  this.column=MIN;
		  this.row=MIN;
		  this.move=null;
		if(!inv()){
			throw new VDMException("Invariant Broken");
		}
   	}
   
   	//operations
   	public int GetCol()
	{
            return column;
	}
	
	public int GetRow()
	{
            return row;
	}
        
        public Move GetMove()
        {

            return move;
        }
	
   	public void MoveRight() 
   	{
           if(move!=Move.RIGHT && column<MAX){

			   move= Move.RIGHT;
			   column++;
		   }
		   else
		   {

			   throw  new VDMException ("Pre condition Broken");
		   }
		if(!inv()){
			throw new VDMException("Invariant Broken");
		}
	}
	
	
	public void MoveLeft() 
   	{
            if(move!=Move.LEFT && column>MIN)
			{
				move=Move.LEFT ;
				column--;

			} else {

				throw  new VDMException ("Pre condition Broken");
			}
		if(!inv()){
			throw new VDMException("Invariant Broken");
		}
	}
	
	public void MoveDown() 
   	{
        if (move != Move.DOWN && row<MAX)
        {
			move=Move.DOWN;
			row++;

        }else
        {

			throw  new VDMException ("Pre condition Broken");

        }
		if(!inv()){
			throw new VDMException("Invariant Broken");
		}

    }
	
	public void MoveUp()
   	{
            if(move!=Move.UP && row>MIN)
			{
				move=Move.UP;
				row--;

			}else
			{
				throw  new VDMException ("Pre condition Broken");
			}
			if(!inv()){
				throw new VDMException("Invariant Broken");
			}
	}
	
	public void Exit()
   	{
		   if(column==MAX&&row==MAX)
		   {
			   column = MIN;
			   row = MIN;
			   move = null;
		   }else {
			   throw  new VDMException ("Pre condition Broken");
		   }
		if(!inv()){
			throw new VDMException("Invariant Broken");
		}
   	}
        
        // toString method added
        public String toString()
        {
            // modify if you are using the text based tester
            return " ";
        }
}