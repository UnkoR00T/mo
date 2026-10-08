package cp;

import io.sentry.android.core.c2;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l {
    protected l() {
    }

    public static int e() {
        int i15;
        try {
            i15 = Integer.parseInt(System.getProperty("com.tom_roush.pdfbox.filter.deflatelevel", "-1"));
        } catch (NumberFormatException e15) {
            c2.h("PdfBox-Android", e15.getMessage(), e15);
            i15 = -1;
        }
        return Math.max(-1, Math.min(9, i15));
    }

    public abstract k a(InputStream inputStream, OutputStream outputStream, bp.d dVar, int i15);

    public k b(InputStream inputStream, OutputStream outputStream, bp.d dVar, int i15, j jVar) {
        return a(inputStream, outputStream, dVar, i15);
    }

    protected abstract void c(InputStream inputStream, OutputStream outputStream, bp.d dVar);

    public final void d(InputStream inputStream, OutputStream outputStream, bp.d dVar, int i15) {
        c(inputStream, outputStream, dVar.A3());
    }

    protected bp.d f(bp.d dVar, int i15) {
        bp.b bVarQ4 = dVar.q4(bp.i.f20846q3, bp.i.f20933y3);
        bp.b bVarQ5 = dVar.q4(bp.i.N2, bp.i.f20715d2);
        if ((bVarQ4 instanceof bp.i) && (bVarQ5 instanceof bp.d)) {
            return (bp.d) bVarQ5;
        }
        boolean z15 = bVarQ4 instanceof bp.a;
        if (z15 && (bVarQ5 instanceof bp.a)) {
            bp.a aVar = (bp.a) bVarQ5;
            if (i15 < aVar.size()) {
                bp.b bVarK4 = aVar.k4(i15);
                if (bVarK4 instanceof bp.d) {
                    return (bp.d) bVarK4;
                }
            }
        } else if (bVarQ5 != null && !z15 && !(bVarQ5 instanceof bp.a)) {
            c2.e("PdfBox-Android", "Expected DecodeParams to be an Array or Dictionary but found " + bVarQ5.getClass().getName());
        }
        return new bp.d();
    }
}
