package CO1;

class CPU {
	int price;
	public CPU(int price){
		this.price=price;
	}
	class Processor{
		int core;
		String manufacturer;
		private Processor(int core,String manufacturer)
		{
			this.core=core;
			this.manufacturer=manufacturer;
		}
		void display(){
			System.out.println("Core"+core);
			System.out.println("Manufacturer:"+manufacturer);
		}
	}
	public static class RAM{
		static int memory;
		static String manufacturer;
		static public void RAMDATA(int memory1,String manufacturer1){
			memory=memory1;
			manufacturer=manufacturer1;
		}
		static void display()
		{
			System.out.println("Memory"+memory);
			System.out.println("Manufacturer:"+manufacturer);
		}
		}
	public static void main(String[] args){
		CPU.Processor processor=new CPU(2000).new Processor(4,"INTEL");
		processor.display();
		CPU.RAM.RAMDATA(700, "DELL");
		CPU.RAM.display();
		
		
	}
}
