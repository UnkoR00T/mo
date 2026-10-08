package ep;

import io.sentry.android.core.c2;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class f extends b {
    public f(dp.g gVar) {
        this(gVar, "", dp.i.p());
    }

    private void T0(dp.i iVar) {
        String property = System.getProperty("com.tom_roush.pdfbox.pdfparser.nonSequentialPDFParser.eofLookupRange");
        if (property != null) {
            try {
                P0(Integer.parseInt(property));
            } catch (NumberFormatException unused) {
                c2.g("PdfBox-Android", "System property com.tom_roush.pdfbox.pdfparser.nonSequentialPDFParser.eofLookupRange does not contain an integer value, but: '" + property + "'");
            }
        }
        this.f52582c = new bp.e(iVar);
    }

    public gp.c S0() {
        gp.c cVar = new gp.c(e0(), this.f52586f, d0());
        cVar.d1(f0());
        return cVar;
    }

    protected void U0() throws Throwable {
        bp.d dVarM0 = M0();
        bp.b bVarB0 = B0(dVarM0);
        if (!(bVarB0 instanceof bp.d)) {
            throw new IOException("Expected root dictionary, but got this: " + bVarB0);
        }
        bp.d dVar = (bp.d) bVarB0;
        if (l0()) {
            bp.i iVar = bp.i.f20732e9;
            if (!dVar.J3(iVar)) {
                dVar.Y4(iVar, bp.i.Z0);
            }
        }
        q0(dVar, null);
        bp.b bVarP4 = dVarM0.p4(bp.i.A4);
        if (bVarP4 instanceof bp.d) {
            q0((bp.d) bVarP4, null);
        }
        W(dVar);
        if (!(dVar.p4(bp.i.F6) instanceof bp.d)) {
            throw new IOException("Page tree root must be a dictionary");
        }
        this.f52582c.p4();
        this.f52594n = true;
    }

    public void V0() {
        try {
            if (!y0() && !s0()) {
                throw new IOException("Error: Header doesn't contain versioninfo");
            }
            if (this.f52594n) {
                return;
            }
            U0();
        } catch (Throwable th4) {
            bp.e eVar = this.f52582c;
            if (eVar != null) {
                dp.a.b(eVar);
                this.f52582c = null;
            }
            throw th4;
        }
    }

    public f(dp.g gVar, String str, dp.i iVar) {
        this(gVar, str, null, null, iVar);
    }

    public f(dp.g gVar, String str, InputStream inputStream, String str2, dp.i iVar) {
        super(gVar, str, inputStream, str2);
        this.f52592l = gVar.length();
        T0(iVar);
    }
}
