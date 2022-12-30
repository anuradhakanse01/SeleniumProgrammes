package week3.day1;

public class Automation extends MultipleLangauge {

	public static void main(String[] args) {
		Automation au = new Automation();
		au.Java();
		au.Selenium();
		au.ruby();
		au.python();
	}

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("This is java in Interface Language");
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("This is selenium in Interface TestTool");
	}

	@Override
	void ruby() {
		// TODO Auto-generated method stub
		System.out.println("This is ruby in MultipleLanguage abstract class method");
	}

}
