package so;

import io.sentry.android.core.c2;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f182660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f182661b;

    public j0() {
        this(false);
    }

    private void g(n0 n0Var) throws IOException {
        for (l0 l0Var : n0Var.C0()) {
            if (!l0Var.a()) {
                n0Var.F1(l0Var);
            }
        }
        boolean zContainsKey = n0Var.f182727d.containsKey("CFF ");
        boolean z15 = a() && zContainsKey;
        if (n0Var.K() == null) {
            throw new IOException("'head' table is mandatory");
        }
        if (n0Var.L() == null) {
            throw new IOException("'hhea' table is mandatory");
        }
        if (n0Var.O() == null) {
            throw new IOException("'maxp' table is mandatory");
        }
        if (n0Var.d0() == null && !this.f182660a) {
            throw new IOException("'post' table is mandatory");
        }
        if (!z15) {
            String str = zContainsKey ? "; this an OpenType CFF font, but we expected a TrueType font here" : "";
            if (n0Var.N() == null) {
                throw new IOException("'loca' table is mandatory" + str);
            }
            if (n0Var.I() == null) {
                throw new IOException("'glyf' table is mandatory" + str);
            }
        }
        if (n0Var.V() == null && !this.f182660a) {
            throw new IOException("'name' table is mandatory");
        }
        if (n0Var.M() == null) {
            throw new IOException("'hmtx' table is mandatory");
        }
        if (!this.f182660a && n0Var.H() == null) {
            throw new IOException("'cmap' table is mandatory");
        }
    }

    private l0 i(n0 n0Var, i0 i0Var) {
        l0 nVar;
        String strH = i0Var.H(4);
        if (strH.equals("cmap")) {
            nVar = new e(n0Var);
        } else if (strH.equals("glyf")) {
            nVar = new o(n0Var);
        } else if (strH.equals("head")) {
            nVar = new p(n0Var);
        } else if (strH.equals("hhea")) {
            nVar = new q(n0Var);
        } else if (strH.equals("hmtx")) {
            nVar = new r(n0Var);
        } else if (strH.equals("loca")) {
            nVar = new s(n0Var);
        } else if (strH.equals("maxp")) {
            nVar = new v(n0Var);
        } else if (strH.equals("name")) {
            nVar = new y(n0Var);
        } else if (strH.equals("OS/2")) {
            nVar = new z(n0Var);
        } else if (strH.equals("post")) {
            nVar = new e0(n0Var);
        } else if (strH.equals("DSIG")) {
            nVar = new f(n0Var);
        } else if (strH.equals("kern")) {
            nVar = new u(n0Var);
        } else if (strH.equals("vhea")) {
            nVar = new o0(n0Var);
        } else if (strH.equals("vmtx")) {
            nVar = new p0(n0Var);
        } else if (strH.equals("VORG")) {
            nVar = new q0(n0Var);
        } else {
            nVar = strH.equals("GSUB") ? new n(n0Var) : h(n0Var, strH);
        }
        nVar.i(strH);
        nVar.f(i0Var.M());
        nVar.h(i0Var.M());
        nVar.g(i0Var.M());
        if (nVar.b() != 0 || strH.equals("glyf")) {
            return nVar;
        }
        return null;
    }

    protected boolean a() {
        return false;
    }

    n0 b(i0 i0Var) {
        return new n0(i0Var);
    }

    public n0 c(File file) throws IOException {
        f0 f0Var = new f0(file, "r");
        try {
            return e(f0Var);
        } catch (IOException e15) {
            f0Var.close();
            throw e15;
        }
    }

    public n0 d(InputStream inputStream) {
        return e(new w(inputStream));
    }

    n0 e(i0 i0Var) throws IOException {
        n0 n0VarB = b(i0Var);
        n0VarB.K1(i0Var.r());
        int iN = i0Var.N();
        i0Var.N();
        i0Var.N();
        i0Var.N();
        for (int i15 = 0; i15 < iN; i15++) {
            l0 l0VarI = i(n0VarB, i0Var);
            if (l0VarI != null) {
                if (l0VarI.c() + l0VarI.b() > n0VarB.c0()) {
                    c2.g("PdfBox-Android", "Skip table '" + l0VarI.d() + "' which goes past the file size; offset: " + l0VarI.c() + ", size: " + l0VarI.b() + ", font size: " + n0VarB.c0());
                } else {
                    n0VarB.u(l0VarI);
                }
            }
        }
        if (!this.f182661b) {
            g(n0VarB);
        }
        return n0VarB;
    }

    public n0 f(InputStream inputStream) {
        this.f182660a = true;
        return e(new w(inputStream));
    }

    protected l0 h(n0 n0Var, String str) {
        return new l0(n0Var);
    }

    public j0(boolean z15) {
        this(z15, false);
    }

    public j0(boolean z15, boolean z16) {
        this.f182660a = z15;
        this.f182661b = z16;
    }
}
