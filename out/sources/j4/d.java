package j4;

import android.os.Build;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import i3.j;

/* JADX INFO: loaded from: classes.dex */
public class d {

    static class a {
        public static AutofillId a(View view) {
            return view.getAutofillId();
        }
    }

    private static class b {
        static ContentCaptureSession a(View view) {
            return view.getContentCaptureSession();
        }
    }

    private static class c {
        static void a(View view, int i15) {
            view.setImportantForContentCapture(i15);
        }
    }

    public static j4.a a(View view) {
        return j4.a.b(a.a(view));
    }

    public static j b(View view) {
        ContentCaptureSession contentCaptureSessionA;
        if (Build.VERSION.SDK_INT < 29 || (contentCaptureSessionA = b.a(view)) == null) {
            return null;
        }
        return j4.c.f(contentCaptureSessionA, view);
    }

    public static void c(View view, int i15) {
        if (Build.VERSION.SDK_INT >= 30) {
            c.a(view, i15);
        }
    }
}
