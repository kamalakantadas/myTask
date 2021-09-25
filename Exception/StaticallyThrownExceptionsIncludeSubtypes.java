import java.io.*;

class StaticallyThrownExceptionsIncludeSubtypes{
	public static void main(String[] args){
		try{
			throw new FileNotFoundException();
		}catch(IOException ioe){
			
		}
		
		try{
			throw new FileNotFoundException();
		}catch(FileNotFoundException fnfe){
			
		}catch(IOException ioe){
			
		}
		
		try{
			m();
		}
		catch(FileNotFoundException fnfe){
			
		}
		catch(IOException ioe){}
		catch(Throwable t){}
		
	}
	static void m() throws IOException{
		throw new FileNotFoundException();
	}
}