package j4;

import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import i3.j;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f99356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View f99357b;

    private static class a {
        static AutofillId a(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j15) {
            return contentCaptureSession.newAutofillId(autofillId, j15);
        }

        static ViewStructure b(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long j15) {
            return contentCaptureSession.newVirtualViewStructure(autofillId, j15);
        }

        static void c(ContentCaptureSession contentCaptureSession, ViewStructure viewStructure) {
            contentCaptureSession.notifyViewAppeared(viewStructure);
        }

        static void d(ContentCaptureSession contentCaptureSession, AutofillId autofillId) {
            contentCaptureSession.notifyViewDisappeared(autofillId);
        }

        public static void e(ContentCaptureSession contentCaptureSession, AutofillId autofillId, CharSequence charSequence) {
            contentCaptureSession.notifyViewTextChanged(autofillId, charSequence);
        }

        static void f(ContentCaptureSession contentCaptureSession, AutofillId autofillId, long[] jArr) {
            contentCaptureSession.notifyViewsDisappeared(autofillId, jArr);
        }
    }

    private c(ContentCaptureSession contentCaptureSession, View view) {
        this.f99356a = contentCaptureSession;
        this.f99357b = view;
    }

    public static c f(ContentCaptureSession contentCaptureSession, View view) {
        return new c(contentCaptureSession, view);
    }

    @Override // i3.j
    public e a(AutofillId autofillId, long j15) {
        if (Build.VERSION.SDK_INT >= 29) {
            return e.i(a.b(b.a(this.f99356a), autofillId, j15));
        }
        return null;
    }

    @Override // i3.j
    public void b(AutofillId autofillId) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.d(b.a(this.f99356a), autofillId);
        }
    }

    @Override // i3.j
    public void c(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.c(b.a(this.f99356a), viewStructure);
        }
    }

    @Override // i3.j
    public AutofillId d(long j15) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        ContentCaptureSession contentCaptureSessionA = b.a(this.f99356a);
        j4.a aVarA = d.a(this.f99357b);
        Objects.requireNonNull(aVarA);
        return a.a(contentCaptureSessionA, aVarA.a(), j15);
    }

    @Override // i3.j
    public void e(AutofillId autofillId, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.e(b.a(this.f99356a), autofillId, charSequence);
        }
    }

    @Override // i3.j
    public void flush() {
        if (Build.VERSION.SDK_INT >= 29) {
            ContentCaptureSession contentCaptureSessionA = b.a(this.f99356a);
            j4.a aVarA = d.a(this.f99357b);
            Objects.requireNonNull(aVarA);
            a.f(contentCaptureSessionA, aVarA.a(), new long[]{Long.MIN_VALUE});
        }
    }
}
