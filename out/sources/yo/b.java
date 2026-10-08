package yo;

import android.content.Context;
import android.content.res.AssetManager;
import io.sentry.android.core.c2;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AssetManager f228299a;

    public static InputStream a(String str) {
        if (f228299a == null) {
            c2.e("PdfBox-Android", "PDFBoxResourceLoader is not initialized, call PDFBoxResourceLoader.init() before use");
        }
        return f228299a.open(str);
    }

    public static void b(Context context) {
        f228299a = context.getApplicationContext().getAssets();
    }

    public static boolean c() {
        return f228299a != null;
    }
}
