package rj;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f174608a;

    u(Context context) {
        this.f174608a = context;
    }

    private static long b(File file) {
        if (!file.isDirectory()) {
            return file.length();
        }
        File[] fileArrListFiles = file.listFiles();
        long jB = 0;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                jB += b(file2);
            }
        }
        return jB;
    }

    final long a() {
        return b(new File(this.f174608a.getFilesDir(), "assetpacks"));
    }
}
