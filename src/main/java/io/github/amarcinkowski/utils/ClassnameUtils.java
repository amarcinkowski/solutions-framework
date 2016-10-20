package io.github.amarcinkowski.utils;

public class ClassnameUtils {

	private static final String SYS_PATH = "%s/%s/%s.%s";

	public final static String TEST_DATA_FILEPATH = "src/test/resources";

	public final static String getFilename(String canonical) {
		return canonical.substring(canonical.lastIndexOf('.') + 1);
	}

	public final static String getFilepath(String subdir, String filename, String extension) {
		return String.format(SYS_PATH, ClassnameUtils.TEST_DATA_FILEPATH, subdir, filename, extension);
	}

	public final static String getPackage(String canonical) {
		return canonical.substring(0, canonical.lastIndexOf('.'));
	}

	public final static String getSubdir(String packageName) {
		return packageName.substring(packageName.lastIndexOf('.') + 1);
	}

}
