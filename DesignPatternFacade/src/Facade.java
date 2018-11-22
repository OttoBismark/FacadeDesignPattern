
public class Facade
{
	private CPU processor;
	private Memory ram;
	private HardDrive hd;
	
	public Facade()
	{
		this.processor = new CPU();
		this.ram = new Memory();
		this.hd = new HardDrive();
	}
	
	public void start()
	{
		processor.freeze();
		ram.load();
		hd.read();
		processor.jump();
		processor.execute();
	}
}
