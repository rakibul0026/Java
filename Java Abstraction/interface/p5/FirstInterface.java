package demoproject;

interface FirstInterface {
	  public void myMethod(); // interface method
	}

	interface SecondInterface {
	  public void myOtherMethod(); // interface method
	}

	class DemoClass implements FirstInterface, SecondInterface {
	  public void myMethod() {
	    System.out.println("Some text.. for me ");
	  }
	  public void myOtherMethod() {
	    System.out.println("Some other text... for me ");
	  }
}

