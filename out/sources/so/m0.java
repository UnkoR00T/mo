package so;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class m0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i0 f182688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f182689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long[] f182690c;

    public interface a {
        void a(n0 n0Var);
    }

    public m0(File file) {
        this(new f0(file, "r"));
    }

    private n0 b(int i15) {
        this.f182688a.seek(this.f182690c[i15]);
        j0 a0Var = this.f182688a.J().equals("OTTO") ? new a0(false, true) : new j0(false, true);
        this.f182688a.seek(this.f182690c[i15]);
        return a0Var.e(new h0(this.f182688a));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f182688a.close();
    }

    public n0 h(String str) {
        for (int i15 = 0; i15 < this.f182689b; i15++) {
            n0 n0VarB = b(i15);
            if (n0VarB.getName().equals(str)) {
                return n0VarB;
            }
        }
        return null;
    }

    public void m(a aVar) {
        for (int i15 = 0; i15 < this.f182689b; i15++) {
            aVar.a(b(i15));
        }
    }

    m0(i0 i0Var) throws IOException {
        this.f182688a = i0Var;
        if (!i0Var.J().equals("ttcf")) {
            throw new IOException("Missing TTC header");
        }
        float fR = i0Var.r();
        int iM = (int) i0Var.M();
        this.f182689b = iM;
        if (iM <= 0 || iM > 1024) {
            throw new IOException("Invalid number of fonts " + iM);
        }
        this.f182690c = new long[iM];
        for (int i15 = 0; i15 < this.f182689b; i15++) {
            this.f182690c[i15] = i0Var.M();
        }
        if (fR >= 2.0f) {
            i0Var.N();
            i0Var.N();
            i0Var.N();
        }
    }
}
