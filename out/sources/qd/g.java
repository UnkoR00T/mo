package qd;

import android.util.Pair;
import io.sentry.instrumentation.file.l;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f166070a;

    public g(e eVar) {
        this.f166070a = eVar;
    }

    private static String b(String str, c cVar, boolean z15) {
        String strE = z15 ? cVar.e() : cVar.f166069a;
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strE.length();
        if (strReplaceAll.length() > length) {
            strReplaceAll = d(strReplaceAll, length);
        }
        return "lottie_cache_" + strReplaceAll + strE;
    }

    private File c(String str) {
        File file = new File(e(), b(str, c.JSON, false));
        if (file.exists()) {
            return file;
        }
        File file2 = new File(e(), b(str, c.ZIP, false));
        if (file2.exists()) {
            return file2;
        }
        File file3 = new File(e(), b(str, c.GZIP, false));
        if (file3.exists()) {
            return file3;
        }
        return null;
    }

    private static String d(String str, int i15) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuilder sb5 = new StringBuilder();
            for (byte b15 : bArrDigest) {
                sb5.append(String.format("%02x", Byte.valueOf(b15)));
            }
            return sb5.toString();
        } catch (NoSuchAlgorithmException unused) {
            return str.substring(0, i15);
        }
    }

    private File e() {
        File fileA = this.f166070a.a();
        if (fileA.isFile()) {
            fileA.delete();
        }
        if (!fileA.exists()) {
            fileA.mkdirs();
        }
        return fileA;
    }

    Pair<c, InputStream> a(String str) {
        c cVar;
        try {
            File fileC = c(str);
            if (fileC == null) {
                return null;
            }
            FileInputStream fileInputStreamA = io.sentry.instrumentation.file.h.b.a(new FileInputStream(fileC), fileC);
            if (fileC.getAbsolutePath().endsWith(".zip")) {
                cVar = c.ZIP;
            } else {
                cVar = fileC.getAbsolutePath().endsWith(".gz") ? c.GZIP : c.JSON;
            }
            td.e.a("Cache hit for " + str + " at " + fileC.getAbsolutePath());
            return new Pair<>(cVar, fileInputStreamA);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    void f(String str, c cVar) {
        File file = new File(e(), b(str, cVar, true));
        File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
        boolean zRenameTo = file.renameTo(file2);
        td.e.a("Copying temp file to real file (" + file2 + ")");
        if (zRenameTo) {
            return;
        }
        td.e.c("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
    }

    File g(String str, InputStream inputStream, c cVar) throws IOException {
        File file = new File(e(), b(str, cVar, true));
        try {
            FileOutputStream fileOutputStreamA = l.b.a(new FileOutputStream(file), file);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i15 = inputStream.read(bArr);
                    if (i15 == -1) {
                        fileOutputStreamA.flush();
                        fileOutputStreamA.close();
                        inputStream.close();
                        return file;
                    }
                    fileOutputStreamA.write(bArr, 0, i15);
                }
            } catch (Throwable th4) {
                fileOutputStreamA.close();
                throw th4;
            }
        } catch (Throwable th5) {
            inputStream.close();
            throw th5;
        }
    }
}
