package level01.exercise05.Utils;

import java.io.File;
import java.util.Date;

public class DirectoryUtils {

    public static String formatLineShow(String initLine, boolean isInit, boolean isLast, File file) {

        return StringUtils.formatToChars(
                String.format("%s%s%s %s",
                        initLine,
                        (isInit ? "" : (isLast ? "└── " : "├── ")),
                        (file.isDirectory() ? "[D]" : "[F]"),
                        (isInit ? file.getAbsoluteFile() : file.getName())
                ), 100)
                + StringUtils.getDateFormatUSA(new Date(file.lastModified()));
    }
}
