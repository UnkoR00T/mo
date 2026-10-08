package fp;

import bp.f;
import bp.h;
import bp.i;
import bp.j;
import bp.k;
import bp.l;
import bp.m;
import bp.o;
import bp.p;
import bp.q;
import bp.r;
import dp.e;
import dp.g;
import io.sentry.android.core.c2;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import jp.n;

/* JADX INFO: loaded from: classes4.dex */
public class b implements r, Closeable {
    public static final byte[] D;
    public static final byte[] E;
    public static final byte[] F;
    public static final byte[] G;
    public static final byte[] H;
    public static final byte[] I;
    public static final byte[] K;
    public static final byte[] L;
    public static final byte[] O;
    public static final byte[] P;
    public static final byte[] R;
    public static final byte[] T;
    public static final byte[] X;
    public static final byte[] Y;
    public static final byte[] Z;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final byte[] f65746h0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final byte[] f65747q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final byte[] f65748r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final byte[] f65749s0;
    private OutputStream A;
    private byte[] B;
    private bp.a C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final NumberFormat f65750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final NumberFormat f65751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private OutputStream f65752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f65753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f65754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f65755f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<bp.b, m> f65756g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map<m, bp.b> f65757h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List<c> f65758j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Set<bp.b> f65759k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Deque<bp.b> f65760l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Set<bp.b> f65761m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Set<bp.b> f65762n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private m f65763p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private gp.c f65764q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f65765r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f65766s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f65767t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f65768v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f65769w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f65770x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f65771y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private g f65772z;

    static {
        Charset charset = xp.a.f220412a;
        D = "<<".getBytes(charset);
        E = ">>".getBytes(charset);
        F = new byte[]{32};
        G = new byte[]{37};
        H = "PDF-1.4".getBytes(charset);
        I = new byte[]{-10, -28, -4, -33};
        K = "%%EOF".getBytes(charset);
        L = "R".getBytes(charset);
        O = "xref".getBytes(charset);
        P = "f".getBytes(charset);
        R = "n".getBytes(charset);
        T = "trailer".getBytes(charset);
        X = "startxref".getBytes(charset);
        Y = "obj".getBytes(charset);
        Z = "endobj".getBytes(charset);
        f65746h0 = "[".getBytes(charset);
        f65747q0 = "]".getBytes(charset);
        f65748r0 = "stream".getBytes(charset);
        f65749s0 = "endstream".getBytes(charset);
    }

    public b(OutputStream outputStream) {
        Locale locale = Locale.US;
        this.f65750a = new DecimalFormat("0000000000", DecimalFormatSymbols.getInstance(locale));
        this.f65751b = new DecimalFormat("00000", DecimalFormatSymbols.getInstance(locale));
        this.f65754e = 0L;
        this.f65755f = 0L;
        this.f65756g = new Hashtable();
        this.f65757h = new HashMap();
        this.f65758j = new ArrayList();
        this.f65759k = new HashSet();
        this.f65760l = new LinkedList();
        this.f65761m = new HashSet();
        this.f65762n = new HashSet();
        this.f65763p = null;
        this.f65764q = null;
        this.f65765r = false;
        this.f65766s = false;
        this.f65767t = false;
        d1(outputStream);
        i1(new a(this.f65752c));
    }

    public static void D1(p pVar, OutputStream outputStream) throws IOException {
        K1(pVar.i3(), pVar.A3(), outputStream);
    }

    public static void F1(byte[] bArr, OutputStream outputStream) throws IOException {
        K1(bArr, false, outputStream);
    }

    private void I(bp.b bVar) {
        m mVar;
        bp.b bVarX3 = bVar instanceof l ? ((l) bVar).X3() : bVar;
        if (this.f65761m.contains(bVar) || this.f65759k.contains(bVar) || this.f65762n.contains(bVarX3)) {
            return;
        }
        if (bVarX3 != null && (mVar = this.f65756g.get(bVarX3)) != null) {
            bp.b bVar2 = this.f65757h.get(mVar);
            if (!O0(bVar) && !O0(bVar2)) {
                return;
            }
        }
        this.f65760l.add(bVar);
        this.f65759k.add(bVar);
        if (bVarX3 != null) {
            this.f65762n.add(bVarX3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0024  */
    /* JADX WARN: Code duplicated, block: B:24:0x0032  */
    /* JADX WARN: Instruction removed from duplicated block: B:16:0x001a, please report this as an issue */
    private static void K1(byte[] bArr, boolean z15, OutputStream outputStream) throws IOException {
        if (!z15) {
            for (byte b15 : bArr) {
                if (b15 >= 0 && b15 != 13 && b15 != 10) {
                }
            }
            if (!z15) {
                outputStream.write(40);
                for (int i15 : bArr) {
                    if (i15 != 40 || i15 == 41 || i15 == 92) {
                        outputStream.write(92);
                        outputStream.write(i15);
                    } else {
                        outputStream.write(i15);
                    }
                }
                outputStream.write(41);
                return;
            }
        } else if (!z15) {
            outputStream.write(40);
            while (i < r1) {
                if (i15 != 40) {
                    outputStream.write(92);
                    outputStream.write(i15);
                } else {
                    outputStream.write(92);
                    outputStream.write(i15);
                }
            }
            outputStream.write(41);
            return;
        }
        outputStream.write(60);
        xp.c.f(bArr, outputStream);
        outputStream.write(62);
    }

    private void M() throws IOException {
        dp.a.c(new e(this.f65772z), this.A);
        this.A.write(((ByteArrayOutputStream) this.f65752c).toByteArray());
    }

    private void O() throws IOException {
        while (this.f65760l.size() > 0) {
            bp.b bVarRemoveFirst = this.f65760l.removeFirst();
            this.f65759k.remove(bVarRemoveFirst);
            N(bVarRemoveFirst);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean O0(bp.b bVar) {
        if (bVar instanceof q) {
            return ((q) bVar).O0();
        }
        return false;
    }

    private void P1(c cVar) throws IOException {
        String str = this.f65750a.format(cVar.j());
        String str2 = this.f65751b.format(cVar.e().e());
        a aVarT0 = t0();
        Charset charset = xp.a.f220415d;
        aVarT0.write(str.getBytes(charset));
        a aVarT1 = t0();
        byte[] bArr = F;
        aVarT1.write(bArr);
        t0().write(str2.getBytes(charset));
        t0().write(bArr);
        t0().write(cVar.k() ? P : R);
        t0().p();
    }

    private void Q1(long j15, long j16) throws IOException {
        a aVarT0 = t0();
        String strValueOf = String.valueOf(j15);
        Charset charset = xp.a.f220415d;
        aVarT0.write(strValueOf.getBytes(charset));
        t0().write(F);
        t0().write(String.valueOf(j16).getBytes(charset));
        t0().r();
    }

    private void T0(gp.c cVar) {
        if (cVar != null) {
            try {
                bp.e eVarH = cVar.H();
                Set<m> setKeySet = eVarH.m4().keySet();
                long jG4 = cVar.H().g4();
                for (m mVar : setKeySet) {
                    if (mVar != null) {
                        bp.b bVarX3 = eVarH.h4(mVar).X3();
                        if (bVarX3 != null && !(bVarX3 instanceof k)) {
                            this.f65756g.put(bVarX3, mVar);
                            this.f65757h.put(mVar, bVarX3);
                        }
                        long jG = mVar.g();
                        if (jG > jG4) {
                            jG4 = jG;
                        }
                    }
                }
                Y0(jG4);
            } catch (IOException e15) {
                c2.f("PdfBox-Android", e15.getMessage(), e15);
            }
        }
    }

    private void V() throws IOException {
        long length = this.f65772z.length();
        long j15 = this.f65768v;
        long j16 = this.f65769w + j15;
        long jB = (t0().b() - (this.f65769w + length)) - (this.f65768v - length);
        String str = "0 " + j15 + " " + j16 + " " + jB + "]";
        int i15 = 0;
        this.C.p4(0, h.f20678g);
        this.C.p4(1, h.g4(j15));
        this.C.p4(2, h.g4(j16));
        this.C.p4(3, h.g4(jB));
        if (str.length() > this.f65771y) {
            throw new IOException("Can't write new byteRange '" + str + "' not enough space: byteRange.length(): " + str.length() + ", byteRangeLength: " + this.f65771y);
        }
        ByteArrayOutputStream byteArrayOutputStream = (ByteArrayOutputStream) this.f65752c;
        byteArrayOutputStream.flush();
        this.B = byteArrayOutputStream.toByteArray();
        byte[] bytes = str.getBytes(xp.a.f220415d);
        while (true) {
            long j17 = i15;
            if (j17 >= this.f65771y) {
                return;
            }
            if (i15 >= bytes.length) {
                this.B[(int) ((this.f65770x + j17) - length)] = 32;
            } else {
                this.B[(int) ((this.f65770x + j17) - length)] = bytes[i15];
            }
            i15++;
        }
    }

    private void a0(bp.e eVar, long j15) throws IOException {
        if (eVar.o4() || j15 != -1) {
            ep.h hVar = new ep.h(eVar);
            Iterator<c> it = C0().iterator();
            while (it.hasNext()) {
                hVar.a(it.next());
            }
            bp.d dVarK4 = eVar.k4();
            if (this.f65766s) {
                dVarK4.c5(i.X6, eVar.j4());
            } else {
                dVarK4.P4(i.X6);
            }
            hVar.b(dVarK4);
            hVar.f(d0() + 2);
            o1(t0().b());
            N(hVar.d());
        }
        if (eVar.o4() && j15 == -1) {
            return;
        }
        bp.d dVarK5 = eVar.k4();
        dVarK5.c5(i.X6, eVar.j4());
        if (j15 != -1) {
            i iVar = i.P9;
            dVarK5.P4(iVar);
            dVarK5.c5(iVar, u0());
        }
        b0();
        Z(eVar);
    }

    private void b0() throws IOException {
        J(c.g());
        Collections.sort(C0());
        o1(t0().b());
        t0().write(O);
        t0().r();
        Long[] lArrH0 = H0(C0());
        int length = lArrH0.length;
        if (length % 2 == 0) {
            int i15 = 0;
            for (int i16 = 0; i16 < length; i16 += 2) {
                long jLongValue = lArrH0[i16 + 1].longValue();
                Q1(lArrH0[i16].longValue(), jLongValue);
                int i17 = 0;
                while (i17 < jLongValue) {
                    P1(this.f65758j.get(i15));
                    i17++;
                    i15++;
                }
            }
        }
    }

    private void d1(OutputStream outputStream) {
        this.f65752c = outputStream;
    }

    private void i1(a aVar) {
        this.f65753d = aVar;
    }

    private m n0(bp.b bVar) {
        bp.b bVarX3 = bVar instanceof l ? ((l) bVar).X3() : bVar;
        m mVar = this.f65756g.get(bVar);
        if (mVar == null && bVarX3 != null) {
            mVar = this.f65756g.get(bVarX3);
        }
        if (mVar == null) {
            Y0(d0() + 1);
            mVar = new m(d0(), 0);
            this.f65756g.put(bVar, mVar);
            if (bVarX3 != null) {
                this.f65756g.put(bVarX3, mVar);
            }
        }
        return mVar;
    }

    @Override // bp.r
    public Object C(i iVar) throws IOException {
        iVar.N3(t0());
        return null;
    }

    protected List<c> C0() {
        return this.f65758j;
    }

    public void C1(bp.b bVar) throws IOException {
        m mVarN0 = n0(bVar);
        a aVarT0 = t0();
        String strValueOf = String.valueOf(mVarN0.g());
        Charset charset = xp.a.f220415d;
        aVarT0.write(strValueOf.getBytes(charset));
        a aVarT1 = t0();
        byte[] bArr = F;
        aVarT1.write(bArr);
        t0().write(String.valueOf(mVarN0.e()).getBytes(charset));
        t0().write(bArr);
        t0().write(L);
    }

    @Override // bp.r
    public Object E(bp.e eVar) throws IOException {
        if (this.f65766s) {
            t0().p();
        } else {
            L(eVar);
        }
        K(eVar);
        bp.d dVarK4 = eVar.k4();
        long jF4 = dVarK4 != null ? dVarK4.F4(i.P9) : -1L;
        if (this.f65766s || eVar.o4()) {
            a0(eVar, jF4);
        } else {
            b0();
            Z(eVar);
        }
        t0().write(X);
        t0().r();
        t0().write(String.valueOf(u0()).getBytes(xp.a.f220415d));
        t0().r();
        t0().write(K);
        t0().r();
        if (!this.f65766s) {
            return null;
        }
        if (this.f65768v == 0 || this.f65770x == 0) {
            M();
            return null;
        }
        V();
        return null;
    }

    @Override // bp.r
    public Object H(o oVar) throws Throwable {
        Throwable th4;
        InputStream inputStreamP5;
        if (this.f65765r) {
            this.f65764q.K().k().n(oVar, this.f65763p.g(), this.f65763p.e());
        }
        try {
            b(oVar);
            t0().write(f65748r0);
            t0().p();
            inputStreamP5 = oVar.p5();
            try {
                dp.a.c(inputStreamP5, t0());
                t0().p();
                t0().write(f65749s0);
                t0().r();
                if (inputStreamP5 != null) {
                    inputStreamP5.close();
                }
                return null;
            } catch (Throwable th5) {
                th4 = th5;
                if (inputStreamP5 != null) {
                    inputStreamP5.close();
                }
                throw th4;
            }
        } catch (Throwable th6) {
            th4 = th6;
            inputStreamP5 = null;
        }
    }

    protected Long[] H0(List<c> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<c> it = list.iterator();
        long j15 = -2;
        long j16 = 1;
        while (it.hasNext()) {
            long jG = it.next().e().g();
            if (jG == j15 + 1) {
                j16++;
            } else if (j15 != -2) {
                arrayList.add(Long.valueOf((j15 - j16) + 1));
                arrayList.add(Long.valueOf(j16));
                j16 = 1;
            }
            j15 = jG;
        }
        if (list.size() > 0) {
            arrayList.add(Long.valueOf((j15 - j16) + 1));
            arrayList.add(Long.valueOf(j16));
        }
        return (Long[]) arrayList.toArray(new Long[arrayList.size()]);
    }

    protected void J(c cVar) {
        C0().add(cVar);
    }

    protected void K(bp.e eVar) throws IOException {
        bp.d dVarK4 = eVar.k4();
        bp.d dVarK5 = dVarK4.k4(i.D7);
        bp.d dVarK6 = dVarK4.k4(i.A4);
        bp.d dVarK7 = dVarK4.k4(i.f20766i3);
        if (dVarK5 != null) {
            I(dVarK5);
        }
        if (dVarK6 != null) {
            I(dVarK6);
        }
        O();
        this.f65765r = false;
        if (dVarK7 != null) {
            I(dVarK7);
        }
        O();
    }

    protected void L(bp.e eVar) throws IOException {
        t0().write(("%PDF-" + eVar.l4()).getBytes(xp.a.f220415d));
        t0().r();
        t0().write(G);
        t0().write(I);
        t0().r();
    }

    public void N(bp.b bVar) throws IOException {
        this.f65761m.add(bVar);
        this.f65763p = n0(bVar);
        J(new c(t0().b(), bVar, this.f65763p));
        a aVarT0 = t0();
        String strValueOf = String.valueOf(this.f65763p.g());
        Charset charset = xp.a.f220415d;
        aVarT0.write(strValueOf.getBytes(charset));
        a aVarT1 = t0();
        byte[] bArr = F;
        aVarT1.write(bArr);
        t0().write(String.valueOf(this.f65763p.e()).getBytes(charset));
        t0().write(bArr);
        t0().write(Y);
        t0().r();
        bVar.F1(this);
        t0().r();
        t0().write(Z);
        t0().r();
    }

    protected void Y0(long j15) {
        this.f65755f = j15;
    }

    protected void Z(bp.e eVar) throws IOException {
        t0().write(T);
        t0().r();
        bp.d dVarK4 = eVar.k4();
        Collections.sort(C0());
        dVarK4.c5(i.X7, C0().get(C0().size() - 1).e().g() + 1);
        if (!this.f65766s) {
            dVarK4.P4(i.X6);
        }
        if (!eVar.o4()) {
            dVarK4.P4(i.P9);
        }
        dVarK4.P4(i.H2);
        bp.a aVarJ4 = dVarK4.j4(i.f20826o4);
        if (aVarJ4 != null) {
            aVarJ4.A2(true);
        }
        dVarK4.F1(this);
    }

    @Override // bp.r
    public Object b(bp.d dVar) throws IOException {
        if (!this.f65767t) {
            bp.b bVarC4 = dVar.C4(i.f20732e9);
            if (i.U7.equals(bVarC4) || i.I2.equals(bVarC4)) {
                this.f65767t = true;
            }
        }
        t0().write(D);
        t0().r();
        for (Map.Entry<i, bp.b> entry : dVar.entrySet()) {
            bp.b value = entry.getValue();
            if (value != null) {
                entry.getKey().F1(this);
                t0().write(F);
                if (value instanceof bp.d) {
                    bp.d dVar2 = (bp.d) value;
                    if (!this.f65766s) {
                        i iVar = i.N9;
                        bp.b bVarC5 = dVar2.C4(iVar);
                        if (bVarC5 != null && !iVar.equals(entry.getKey())) {
                            bVarC5.A2(true);
                        }
                        i iVar2 = i.f20948z7;
                        bp.b bVarC6 = dVar2.C4(iVar2);
                        if (bVarC6 != null && !iVar2.equals(entry.getKey())) {
                            bVarC6.A2(true);
                        }
                    }
                    if (dVar2.v2()) {
                        b(dVar2);
                    } else {
                        I(dVar2);
                        C1(dVar2);
                    }
                } else if (value instanceof l) {
                    bp.b bVarX3 = ((l) value).X3();
                    if (this.f65765r || this.f65766s || (bVarX3 instanceof bp.d) || bVarX3 == null) {
                        I(value);
                        C1(value);
                    } else {
                        bVarX3.F1(this);
                    }
                } else if (this.f65767t && i.N1.equals(entry.getKey())) {
                    this.f65768v = t0().b();
                    value.F1(this);
                    this.f65769w = t0().b() - this.f65768v;
                } else if (this.f65767t && i.P0.equals(entry.getKey())) {
                    this.C = (bp.a) entry.getValue();
                    this.f65770x = t0().b() + 1;
                    value.F1(this);
                    this.f65771y = (t0().b() - 1) - this.f65770x;
                    this.f65767t = false;
                } else {
                    value.F1(this);
                }
                t0().r();
            }
        }
        t0().write(E);
        t0().r();
        return null;
    }

    public InputStream c0() {
        g gVar;
        if (this.B == null || (gVar = this.f65772z) == null) {
            throw new IllegalStateException("PDF not prepared for signing");
        }
        int length = (int) (this.f65768v - gVar.length());
        int i15 = ((int) this.f65769w) + length;
        return new SequenceInputStream(new e(this.f65772z), new up.a(this.B, new int[]{0, length, i15, this.B.length - i15}));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        if (t0() != null) {
            t0().close();
        }
        OutputStream outputStream = this.A;
        if (outputStream != null) {
            outputStream.close();
        }
    }

    protected long d0() {
        return this.f65755f;
    }

    @Override // bp.r
    public Object h(p pVar) throws IOException {
        if (this.f65765r) {
            this.f65764q.K().k().o(pVar, this.f65763p.g(), this.f65763p.e());
        }
        D1(pVar, t0());
        return null;
    }

    @Override // bp.r
    public Object m(j jVar) throws IOException {
        jVar.i3(t0());
        return null;
    }

    protected void o1(long j15) {
        this.f65754e = j15;
    }

    @Override // bp.r
    public Object p(h hVar) throws IOException {
        hVar.j4(t0());
        return null;
    }

    @Override // bp.r
    public Object r(f fVar) throws IOException {
        fVar.i4(t0());
        return null;
    }

    public void s1(gp.c cVar) throws IOException {
        x1(cVar, null);
    }

    protected a t0() {
        return this.f65753d;
    }

    @Override // bp.r
    public Object u(bp.a aVar) throws IOException {
        t0().write(f65746h0);
        Iterator<bp.b> it = aVar.iterator();
        int i15 = 0;
        while (it.hasNext()) {
            bp.b next = it.next();
            if (next instanceof bp.d) {
                if (next.v2()) {
                    b((bp.d) next);
                } else {
                    I(next);
                    C1(next);
                }
            } else if (next instanceof l) {
                bp.b bVarX3 = ((l) next).X3();
                if (this.f65765r || this.f65766s || (bVarX3 instanceof bp.d) || bVarX3 == null) {
                    I(next);
                    C1(next);
                } else {
                    bVarX3.F1(this);
                }
            } else if (next == null) {
                j.f20954c.F1(this);
            } else {
                next.F1(this);
            }
            i15++;
            if (it.hasNext()) {
                if (i15 % 10 == 0) {
                    t0().r();
                } else {
                    t0().write(F);
                }
            }
        }
        t0().write(f65747q0);
        t0().r();
        return null;
    }

    protected long u0() {
        return this.f65754e;
    }

    public void x1(gp.c cVar, up.d dVar) throws IOException {
        bp.a aVar;
        long jCurrentTimeMillis = cVar.J() == null ? System.currentTimeMillis() : cVar.J().longValue();
        this.f65764q = cVar;
        if (this.f65766s) {
            T0(cVar);
        }
        boolean z15 = true;
        if (cVar.b0()) {
            this.f65765r = false;
            cVar.H().k4().P4(i.f20766i3);
        } else if (this.f65764q.K() != null) {
            if (!this.f65766s) {
                n nVarK = this.f65764q.K().k();
                if (!nVarK.u()) {
                    throw new IllegalStateException("PDF contains an encryption dictionary, please remove it with setAllSecurityToBeRemoved() or set a protection policy with protect()");
                }
                nVarK.x(this.f65764q);
            }
            this.f65765r = true;
        } else {
            this.f65765r = false;
        }
        bp.e eVarH = this.f65764q.H();
        bp.d dVarK4 = eVarH.k4();
        bp.b bVarP4 = dVarK4.p4(i.f20826o4);
        if (bVarP4 instanceof bp.a) {
            aVar = (bp.a) bVarP4;
            if (aVar.size() == 2) {
                z15 = false;
            }
        } else {
            aVar = null;
        }
        if (aVar != null && aVar.size() == 2) {
            z15 = false;
        }
        if (z15 || this.f65766s) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                messageDigest.update(Long.toString(jCurrentTimeMillis).getBytes(xp.a.f220415d));
                bp.d dVarK5 = dVarK4.k4(i.A4);
                if (dVarK5 != null) {
                    Iterator<bp.b> it = dVarK5.N4().iterator();
                    while (it.hasNext()) {
                        messageDigest.update(it.next().toString().getBytes(xp.a.f220415d));
                    }
                }
                p pVar = z15 ? new p(messageDigest.digest()) : (p) aVar.g4(0);
                p pVar2 = z15 ? pVar : new p(messageDigest.digest());
                bp.a aVar2 = new bp.a();
                aVar2.A3(pVar);
                aVar2.A3(pVar2);
                dVarK4.Y4(i.f20826o4, aVar2);
            } catch (NoSuchAlgorithmException e15) {
                throw new RuntimeException(e15);
            }
        }
        eVarH.F1(this);
    }

    @Override // bp.r
    public Object y(bp.c cVar) throws IOException {
        cVar.J3(t0());
        return null;
    }

    public b(OutputStream outputStream, g gVar) {
        Locale locale = Locale.US;
        this.f65750a = new DecimalFormat("0000000000", DecimalFormatSymbols.getInstance(locale));
        this.f65751b = new DecimalFormat("00000", DecimalFormatSymbols.getInstance(locale));
        this.f65754e = 0L;
        this.f65755f = 0L;
        this.f65756g = new Hashtable();
        this.f65757h = new HashMap();
        this.f65758j = new ArrayList();
        this.f65759k = new HashSet();
        this.f65760l = new LinkedList();
        this.f65761m = new HashSet();
        this.f65762n = new HashSet();
        this.f65763p = null;
        this.f65764q = null;
        this.f65765r = false;
        this.f65766s = false;
        this.f65767t = false;
        d1(new ByteArrayOutputStream());
        i1(new a(this.f65752c, gVar.length()));
        this.f65772z = gVar;
        this.A = outputStream;
        this.f65766s = true;
    }
}
