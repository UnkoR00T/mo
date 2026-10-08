package so;

import android.graphics.Path;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class n0 implements mo.b, Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f182724a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final i0 f182728e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, Integer> f182729f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f182725b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f182726c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected Map<String, l0> f182727d = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final List<String> f182730g = new ArrayList();

    n0(i0 i0Var) {
        this.f182728e = i0Var;
    }

    private int C1(String str) {
        if (str.startsWith("uni") && str.length() == 7) {
            int length = str.length();
            StringBuilder sb5 = new StringBuilder();
            int i15 = 3;
            while (true) {
                int i16 = i15 + 4;
                if (i16 > length) {
                    break;
                }
                try {
                    int i17 = Integer.parseInt(str.substring(i15, i16), 16);
                    if (i17 <= 55295 || i17 >= 57344) {
                        sb5.append((char) i17);
                    }
                    i15 = i16;
                } catch (NumberFormatException unused) {
                }
            }
            String string = sb5.toString();
            if (string.length() == 0) {
                return -1;
            }
            return string.codePointAt(0);
        }
        return -1;
    }

    private synchronized void D1() {
        try {
            if (this.f182729f == null && d0() != null) {
                String[] strArrJ = d0().j();
                if (strArrJ != null) {
                    this.f182729f = new HashMap(strArrJ.length);
                    for (int i15 = 0; i15 < strArrJ.length; i15++) {
                        this.f182729f.put(strArrJ[i15], Integer.valueOf(i15));
                    }
                } else {
                    this.f182729f = new HashMap();
                }
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    private d T0(boolean z15) throws IOException {
        e eVarH = H();
        if (eVarH == null) {
            if (!z15) {
                return null;
            }
            throw new IOException("The TrueType font " + getName() + " does not contain a 'cmap' table");
        }
        d dVarK = eVarH.k(0, 4);
        if (dVarK == null) {
            dVarK = eVarH.k(3, 10);
        }
        if (dVarK == null) {
            dVarK = eVarH.k(0, 3);
        }
        if (dVarK == null) {
            dVarK = eVarH.k(3, 1);
        }
        if (dVarK == null) {
            dVarK = eVarH.k(3, 0);
        }
        if (dVarK == null) {
            if (z15) {
                throw new IOException("The TrueType font does not contain a Unicode cmap");
            }
            if (eVarH.j().length > 0) {
                return eVarH.j()[0];
            }
        }
        return dVarK;
    }

    public void C() {
        y("vrt2");
        y("vert");
    }

    public Collection<l0> C0() {
        return this.f182727d.values();
    }

    public int E(int i15) {
        r rVarM = M();
        if (rVarM != null) {
            return rVarM.j(i15);
        }
        return 250;
    }

    void F1(l0 l0Var) {
        synchronized (this.f182728e) {
            long jB = this.f182728e.b();
            this.f182728e.seek(l0Var.c());
            l0Var.e(this, this.f182728e);
            this.f182728e.seek(jB);
        }
    }

    public e H() {
        return (e) n0("cmap");
    }

    @Deprecated
    public d H0() {
        return O0(true);
    }

    public o I() {
        return (o) n0("glyf");
    }

    public n J() {
        return (n) n0("GSUB");
    }

    public p K() {
        return (p) n0("head");
    }

    void K1(float f15) {
        this.f182724a = f15;
    }

    public q L() {
        return (q) n0("hhea");
    }

    public r M() {
        return (r) n0("hmtx");
    }

    public s N() {
        return (s) n0("loca");
    }

    public v O() {
        return (v) n0("maxp");
    }

    @Deprecated
    public d O0(boolean z15) {
        return T0(z15);
    }

    public y V() {
        return (y) n0("name");
    }

    public c Y0() {
        return d1(true);
    }

    public int Z() {
        if (this.f182725b == -1) {
            v vVarO = O();
            if (vVarO != null) {
                this.f182725b = vVarO.w();
            } else {
                this.f182725b = 0;
            }
        }
        return this.f182725b;
    }

    public z a0() {
        return (z) n0("OS/2");
    }

    @Override // mo.b
    public List<Number> b() {
        float fI1 = (1000.0f / i1()) * 0.001f;
        return Arrays.asList(Float.valueOf(fI1), 0, 0, Float.valueOf(fI1), 0, 0);
    }

    public InputStream b0() {
        return this.f182728e.h();
    }

    public long c0() {
        return this.f182728e.m();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f182728e.close();
    }

    public e0 d0() {
        return (e0) n0("post");
    }

    public c d1(boolean z15) throws IOException {
        n nVarJ;
        d dVarT0 = T0(z15);
        return (this.f182730g.isEmpty() || (nVarJ = J()) == null) ? dVarT0 : new g0(dVarT0, nVarJ, Collections.unmodifiableList(this.f182730g));
    }

    protected void finalize() throws Throwable {
        super.finalize();
        close();
    }

    @Override // mo.b
    public String getName() {
        y yVarV = V();
        if (yVarV != null) {
            return yVarV.o();
        }
        return null;
    }

    @Override // mo.b
    public uo.a h() {
        p pVarK = K();
        short sW = pVarK.w();
        short sV = pVarK.v();
        short sY = pVarK.y();
        short sX = pVarK.x();
        float fI1 = 1000.0f / i1();
        return new uo.a(sW * fI1, sY * fI1, sV * fI1, sX * fI1);
    }

    public int i1() {
        if (this.f182726c == -1) {
            p pVarK = K();
            if (pVarK != null) {
                this.f182726c = pVarK.t();
            } else {
                this.f182726c = 0;
            }
        }
        return this.f182726c;
    }

    @Override // mo.b
    public boolean m(String str) {
        return x1(str) != 0;
    }

    protected synchronized l0 n0(String str) {
        l0 l0Var;
        l0Var = this.f182727d.get(str);
        if (l0Var != null && !l0Var.a()) {
            F1(l0Var);
        }
        return l0Var;
    }

    public o0 o1() {
        return (o0) n0("vhea");
    }

    @Override // mo.b
    public float p(String str) {
        return E(x1(str));
    }

    @Override // mo.b
    public Path r(String str) {
        k kVarJ = I().j(x1(str));
        return kVarJ == null ? new Path() : kVarJ.b();
    }

    public p0 s1() {
        return (p0) n0("vmtx");
    }

    public synchronized byte[] t0(l0 l0Var) {
        byte[] bArrP;
        long jB = this.f182728e.b();
        this.f182728e.seek(l0Var.c());
        bArrP = this.f182728e.p((int) l0Var.b());
        this.f182728e.seek(jB);
        return bArrP;
    }

    public String toString() {
        try {
            y yVarV = V();
            return yVarV != null ? yVarV.o() : "(null)";
        } catch (IOException e15) {
            return "(null - " + e15.getMessage() + ")";
        }
    }

    void u(l0 l0Var) {
        this.f182727d.put(l0Var.d(), l0Var);
    }

    public Map<String, l0> u0() {
        return this.f182727d;
    }

    public int x1(String str) {
        Integer num;
        D1();
        Map<String, Integer> map = this.f182729f;
        if (map != null && (num = map.get(str)) != null && num.intValue() > 0 && num.intValue() < O().w()) {
            return num.intValue();
        }
        int iC1 = C1(str);
        if (iC1 > -1) {
            return d1(false).b(iC1);
        }
        return 0;
    }

    public void y(String str) {
        this.f182730g.add(str);
    }
}
