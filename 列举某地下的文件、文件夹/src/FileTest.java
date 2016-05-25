import java.io.File;
import java.io.FileFilter;

public class FileTest {
	public static final byte TYPE_ALL = 0; // 所有的文件和文件夹
	public static final byte TYPE_FILE = 1; // 文件
	public static final byte TYPE_DIR = 2; // 文件夹

	public static void main(String args[]) {
		File[] flist = listFile("F:\\", FileTest.TYPE_ALL);
		for (File file : flist) {
			System.out.println(file.getPath());
		}
	}

	/**
	 * 列举文件或者目录
	 * 
	 * @param path
	 *            操作目录
	 * @param type
	 *            列举的类型
	 * @return 所列举的文件或文件夹列表
	 */
	public static File[] listFile(String path, byte type) {
		File[] result = null;
		File f = new File(path);
		switch (type) {
			case TYPE_ALL :
				result = f.listFiles();
				break;
			case TYPE_FILE :
				result = f.listFiles(new MyFileFilter(true));
				break;
			case TYPE_DIR :
				result = f.listFiles(new MyFileFilter(false));
				break;
			default :
				result = f.listFiles();
		}
		return result;
	}
}

/**
 * 文件过滤器
 */
class MyFileFilter implements FileFilter {
	// 过滤所要保留的类型是否是文件
	private boolean isFile = true;

	MyFileFilter(boolean isFile) {
		this.isFile = isFile;
	}

	public boolean accept(File pathname) {
		if (isFile) {
			if (pathname.isFile())
				return true;
			return false;
		} else {
			if (pathname.isDirectory())
				return true;
			return false;
		}
	}
}
