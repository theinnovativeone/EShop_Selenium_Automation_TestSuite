package utils;

public class FrameworkConstants {
    private static FrameworkConstants me = null;
    private String BASE_URL;
    private String VALID_USERNAME;
    private String VALID_PASSWORD;
    private String INVALID_USERNAME;
    private String INVALID_PASSWORD;
    private String DIRECTORY_PATH;
    private String CONFIG_FILE_PATH;
    private String TEST_DATA_FILE_PATH;

    private FrameworkConstants() {
        BASE_URL = PropertyFileReader.getConfigData("BASE_URL");
        VALID_USERNAME = PropertyFileReader.getTestData("VALID_USERNAME");
        VALID_PASSWORD = PropertyFileReader.getTestData("VALID_PASSWORD");
        INVALID_USERNAME = PropertyFileReader.getTestData("INVALID_USERNAME");
        INVALID_PASSWORD = PropertyFileReader.getTestData("INVALID_PASSWORD");
        DIRECTORY_PATH = PropertyFileReader.getConfigData("DIRECTORY_PATH");
        CONFIG_FILE_PATH = PropertyFileReader.getConfigData("CONFIG_FILE_PATH");
        TEST_DATA_FILE_PATH = PropertyFileReader.getConfigData("TEST_DATA_FILE_PATH");
    }

    public static String getVariable(String key) {

        if (me == null) {
            me = new FrameworkConstants();
        }
        return me.getProperties(key);
    }

    private String getProperties(String key) {
        return switch (key) {
            case "BASE_URL" -> this.BASE_URL;
            case "VALID_USERNAME" -> this.VALID_USERNAME;
            case "VALID_PASSWORD" -> this.VALID_PASSWORD;
            case "INVALID_USERNAME" -> this.INVALID_USERNAME;
            case "INVALID_PASSWORD" -> this.INVALID_PASSWORD;
            case "DIRECTORY_PATH" -> this.DIRECTORY_PATH;
            case "CONFIG_FILE_PATH" -> this.CONFIG_FILE_PATH;
            case "TEST_DATA_FILE_PATH" -> this.TEST_DATA_FILE_PATH;
            default -> "SOME_RANDOM_VALUE";
        };
    }
}
