package vo;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class h implements b {
    private String b(String str) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader((str.startsWith("Windows 9") ? runtime.exec("command.com /c echo %windir%") : runtime.exec("cmd.exe /c echo %windir%")).getInputStream(), uo.b.f199525a));
        String line = bufferedReader.readLine();
        bufferedReader.close();
        return line;
    }

    @Override // vo.b
    public List<File> a() {
        String strB;
        ArrayList arrayList = new ArrayList();
        try {
            strB = System.getProperty("env.windir");
        } catch (SecurityException unused) {
            strB = null;
        }
        String property = System.getProperty("os.name");
        if (strB == null) {
            try {
                strB = b(property);
            } catch (IOException | SecurityException unused2) {
            }
        }
        if (strB != null && strB.length() > 2) {
            if (strB.endsWith("/")) {
                strB = strB.substring(0, strB.length() - 1);
            }
            StringBuilder sb5 = new StringBuilder();
            sb5.append(strB);
            String str = File.separator;
            sb5.append(str);
            sb5.append("FONTS");
            File file = new File(sb5.toString());
            if (file.exists() && file.canRead()) {
                arrayList.add(file);
            }
            File file2 = new File(strB.substring(0, 2) + str + "PSFONTS");
            if (!file2.exists() || !file2.canRead()) {
                break;
                break;
            }
            arrayList.add(file2);
            break;
        }
        String str2 = property.endsWith("NT") ? "WINNT" : "WINDOWS";
        for (char c15 = 'C'; c15 <= 'E'; c15 = (char) (c15 + 1)) {
            StringBuilder sb6 = new StringBuilder();
            sb6.append(c15);
            sb6.append(":");
            String str3 = File.separator;
            sb6.append(str3);
            sb6.append(str2);
            sb6.append(str3);
            sb6.append("FONTS");
            File file3 = new File(sb6.toString());
            try {
                if (file3.exists() && file3.canRead()) {
                    arrayList.add(file3);
                    break;
                }
            } catch (SecurityException unused3) {
            }
        }
        for (char c16 = 'C'; c16 <= 'E'; c16 = (char) (c16 + 1)) {
            File file4 = new File(c16 + ":" + File.separator + "PSFONTS");
            try {
                if (file4.exists() && file4.canRead()) {
                    arrayList.add(file4);
                    break;
                }
            } catch (SecurityException unused4) {
            }
        }
        try {
            String str4 = System.getenv("LOCALAPPDATA");
            if (str4 != null && !str4.isEmpty()) {
                StringBuilder sb7 = new StringBuilder();
                sb7.append(str4);
                String str5 = File.separator;
                sb7.append(str5);
                sb7.append("Microsoft");
                sb7.append(str5);
                sb7.append("Windows");
                sb7.append(str5);
                sb7.append("Fonts");
                File file5 = new File(sb7.toString());
                if (file5.exists() && file5.canRead()) {
                    arrayList.add(file5);
                }
            }
        } catch (SecurityException unused5) {
        }
        return arrayList;
    }
}
