package Activities;
import java.io.File;

import org.apache.commons.io.FileUtils;

public class IOTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File tempdir = FileUtils.getTempDirectory();
		System.out.println(tempdir.getName());

	}

}
