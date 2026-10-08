package ep;

import bp.m;
import bp.o;
import io.sentry.android.core.c2;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import jp.n;
import jp.q;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
public class b extends a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f52585e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final dp.g f52586f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private jp.a f52587g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private InputStream f52588h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f52589i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f52590j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f52591k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected long f52592l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f52593m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected boolean f52594n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f52595o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Map<m, Long> f52596p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private Long f52597q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private List<Long> f52598r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private List<Long> f52599s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private jp.f f52600t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected n f52601u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f52602v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected l f52603w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final byte[] f52604x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final char[] f52583y = {'x', 'r', 'e', 'f'};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final char[] f52584z = {'/', 'X', 'R', 'e', 'f'};
    private static final char[] A = {'s', 't', 'a', 'r', 't', 'x', 'r', 'e', 'f'};
    private static final byte[] B = {101, 110, 100, 115, 116, 114, 101, 97, 109};
    private static final byte[] C = {101, 110, 100, 111, 98, 106};
    protected static final char[] D = {'%', '%', 'E', 'O', 'F'};
    protected static final char[] E = {'o', 'b', 'j'};
    private static final char[] F = {'t', 'r', 'a', 'i', 'l', 'e', 'r'};
    private static final char[] G = {'/', 'O', 'b', 'j', 'S', 't', 'm'};

    public b(dp.g gVar, String str, InputStream inputStream, String str2) {
        super(new j(gVar));
        this.f52585e = new byte[2048];
        this.f52588h = null;
        this.f52589i = "";
        this.f52590j = null;
        this.f52593m = true;
        this.f52594n = false;
        this.f52595o = false;
        this.f52596p = null;
        this.f52597q = null;
        this.f52598r = null;
        this.f52599s = null;
        this.f52600t = null;
        this.f52601u = null;
        this.f52602v = 2048;
        this.f52603w = new l();
        this.f52604x = new byte[PKIFailureInfo.certRevoked];
        this.f52586f = gVar;
        this.f52589i = str;
        this.f52590j = str2;
        this.f52588h = inputStream;
    }

    private boolean A0() throws IOException {
        this.f52591k = this.f52586f.getPosition();
        if (this.f52593m) {
            int iPeek = this.f52586f.peek();
            while (iPeek != 116 && a.f(iPeek)) {
                if (this.f52586f.getPosition() == this.f52591k) {
                    c2.g("PdfBox-Android", "Expected trailer object at offset " + this.f52591k + ", keep trying");
                }
                D();
                iPeek = this.f52586f.peek();
            }
        }
        if (this.f52586f.peek() != 116) {
            return false;
        }
        long position = this.f52586f.getPosition();
        String strD = D();
        if (!strD.trim().equals("trailer")) {
            if (!strD.startsWith("trailer")) {
                return false;
            }
            this.f52586f.seek(position + ((long) 7));
        }
        J();
        this.f52603w.h(q());
        J();
        return true;
    }

    private long D0(long j15, boolean z15) throws IOException {
        long jF = F();
        this.f52582c.s4(Math.max(this.f52582c.g4(), jF));
        B();
        A(E, true);
        bp.d dVarQ = q();
        o oVarP0 = p0(dVarQ);
        E0(oVarP0, j15, z15);
        oVarP0.close();
        return dVarQ.F4(bp.i.X6);
    }

    private void E0(o oVar, long j15, boolean z15) {
        if (z15) {
            this.f52603w.e(j15, l.b.STREAM);
            this.f52603w.h(oVar);
        }
        new i(oVar, this.f52582c, this.f52603w).N();
    }

    private void G0() throws IOException {
        bp.b bVarC4;
        jp.b qVar;
        if (this.f52600t != null || (bVarC4 = this.f52582c.k4().C4(bp.i.f20766i3)) == null || (bVarC4 instanceof bp.j)) {
            return;
        }
        if (bVarC4 instanceof bp.l) {
            r0((bp.l) bVarC4);
        }
        try {
            try {
                this.f52600t = new jp.f(this.f52582c.X3());
                if (this.f52588h != null) {
                    KeyStore keyStore = KeyStore.getInstance("PKCS12");
                    keyStore.load(this.f52588h, this.f52589i.toCharArray());
                    qVar = new jp.h(keyStore, this.f52590j, this.f52589i);
                } else {
                    qVar = new q(this.f52589i);
                }
                n nVarK = this.f52600t.k();
                this.f52601u = nVarK;
                nVarK.y(this.f52600t, this.f52582c.N3(), qVar);
                this.f52587g = this.f52601u.p();
                InputStream inputStream = this.f52588h;
                if (inputStream != null) {
                    dp.a.b(inputStream);
                }
            } catch (IOException e15) {
                throw e15;
            } catch (Exception e16) {
                throw new IOException("Error (" + e16.getClass().getSimpleName() + ") while creating security handler for decryption", e16);
            }
        } catch (Throwable th4) {
            InputStream inputStream2 = this.f52588h;
            if (inputStream2 != null) {
                dp.a.b(inputStream2);
            }
            throw th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0056  */
    private void H0(OutputStream outputStream) throws IOException {
        int i15;
        byte b15;
        byte[] bArr = B;
        int i16 = 0;
        while (true) {
            int i17 = this.f52586f.read(this.f52585e, i16, 2048 - i16);
            if (i17 <= 0) {
                break;
            }
            int i18 = i17 + i16;
            int i19 = i18 - 5;
            int i25 = i16;
            while (i16 < i18) {
                int i26 = i16 + 5;
                if (i25 != 0 || i26 >= i19 || ((b15 = this.f52585e[i26]) <= 116 && b15 >= 97)) {
                    byte b16 = this.f52585e[i16];
                    if (b16 == bArr[i25]) {
                        i25++;
                        if (i25 == bArr.length) {
                            i16++;
                            break;
                        }
                    } else if (i25 == 3) {
                        bArr = C;
                        if (b16 == bArr[i25]) {
                            i25++;
                        } else {
                            if (b16 == 101) {
                                i15 = 1;
                            } else if (b16 == 110 || i25 != 7) {
                                i15 = 0;
                            } else {
                                i15 = 2;
                            }
                            i25 = i15;
                            bArr = B;
                        }
                    } else {
                        if (b16 == 101) {
                            i15 = 1;
                        } else if (b16 == 110) {
                            i15 = 0;
                        } else {
                            i15 = 0;
                        }
                        i25 = i15;
                        bArr = B;
                    }
                } else {
                    i16 = i26;
                }
                i16++;
            }
            int iMax = Math.max(0, i16 - i25);
            if (iMax > 0) {
                outputStream.write(this.f52585e, 0, iMax);
            }
            if (i25 == bArr.length) {
                this.f52586f.b3(i18 - iMax);
                break;
            } else {
                System.arraycopy(bArr, 0, this.f52585e, 0, i25);
                i16 = i25;
            }
        }
        outputStream.flush();
    }

    private void I0(OutputStream outputStream, bp.k kVar) throws IOException {
        long jX3 = kVar.X3();
        while (jX3 > 0) {
            int i15 = jX3 > 8192 ? PKIFailureInfo.certRevoked : (int) jX3;
            int i16 = this.f52586f.read(this.f52604x, 0, i15);
            if (i16 <= 0) {
                throw new IOException("read error at offset " + this.f52586f.getPosition() + ": expected " + i15 + " bytes, but read() returns " + i16);
            }
            outputStream.write(this.f52604x, 0, i16);
            jX3 -= (long) i16;
        }
    }

    private bp.d K0(bp.l lVar) throws IOException {
        m mVar = new m(lVar);
        Long l15 = this.f52596p.get(mVar);
        if (l15 == null) {
            return null;
        }
        long position = this.f52586f.getPosition();
        bp.d dVarL0 = L0(mVar, l15.longValue());
        this.f52586f.seek(position);
        return dVarL0;
    }

    private void L(bp.i[] iVarArr, bp.d dVar, Set<Long> set) {
        if (iVarArr != null) {
            for (bp.i iVar : iVarArr) {
                bp.b bVarC4 = dVar.C4(iVar);
                if (bVarC4 instanceof bp.l) {
                    set.add(Long.valueOf(h0((bp.l) bVarC4)));
                }
            }
        }
    }

    private bp.d L0(m mVar, long j15) throws IOException {
        if (j15 < 0) {
            bp.l lVarH4 = this.f52582c.h4(mVar);
            if (lVarH4.X3() == null) {
                x0((int) (-j15));
            }
            bp.b bVarX3 = lVarH4.X3();
            if (bVarX3 instanceof bp.d) {
                return (bp.d) bVarX3;
            }
            return null;
        }
        this.f52586f.seek(j15);
        F();
        B();
        A(E, true);
        if (this.f52586f.peek() != 60) {
            return null;
        }
        try {
            return q();
        } catch (IOException unused) {
            Objects.toString(mVar);
            return null;
        }
    }

    private void M(Queue<bp.b> queue, bp.b bVar, Set<Long> set) {
        if (bVar instanceof bp.l) {
            if (set.add(Long.valueOf(h0((bp.l) bVar)))) {
                queue.add(bVar);
            }
        } else if ((bVar instanceof bp.d) || (bVar instanceof bp.a)) {
            queue.add(bVar);
        }
    }

    private void N(Queue<bp.b> queue, Collection<bp.b> collection, Set<Long> set) {
        Iterator<bp.b> it = collection.iterator();
        while (it.hasNext()) {
            M(queue, it.next(), set);
        }
    }

    private boolean N0(bp.d dVar) throws IOException {
        bp.l lVarH4;
        bp.l lVarB0 = null;
        bp.l lVarB1 = null;
        Long value = null;
        Long value2 = null;
        for (Map.Entry<m, Long> entry : this.f52596p.entrySet()) {
            bp.d dVarL0 = L0(entry.getKey(), entry.getValue().longValue());
            if (dVarL0 != null) {
                if (j0(dVarL0)) {
                    bp.l lVarH5 = this.f52582c.h4(entry.getKey());
                    lVarB0 = b0(lVarH5, entry.getValue(), lVarB0, value);
                    if (lVarB0 == lVarH5) {
                        value = entry.getValue();
                    }
                } else if (k0(dVarL0) && (lVarB1 = b0((lVarH4 = this.f52582c.h4(entry.getKey())), entry.getValue(), lVarB1, value2)) == lVarH4) {
                    value2 = entry.getValue();
                }
            }
        }
        if (lVarB0 != null) {
            dVar.Y4(bp.i.D7, lVarB0);
        }
        if (lVarB1 != null) {
            dVar.Y4(bp.i.A4, lVarB1);
        }
        return lVarB0 != null;
    }

    private void O() {
        if (this.f52597q == null) {
            long position = this.f52586f.getPosition();
            this.f52586f.seek(6L);
            while (!this.f52586f.k0()) {
                if (n0(D)) {
                    long position2 = this.f52586f.getPosition();
                    this.f52586f.seek(5 + position2);
                    try {
                        J();
                        if (!n0(f52583y)) {
                            F();
                            B();
                        }
                    } catch (IOException unused) {
                        this.f52597q = Long.valueOf(position2);
                    }
                }
                this.f52586f.read();
            }
            this.f52586f.seek(position);
            if (this.f52597q == null) {
                this.f52597q = Long.MAX_VALUE;
            }
        }
    }

    private long O0(List<Long> list, long j15) {
        int size = list.size();
        Long lValueOf = null;
        int i15 = -1;
        for (int i16 = 0; i16 < size; i16++) {
            long jLongValue = j15 - list.get(i16).longValue();
            if (lValueOf == null || Math.abs(lValueOf.longValue()) > Math.abs(jLongValue)) {
                lValueOf = Long.valueOf(jLongValue);
                i15 = i16;
            }
        }
        if (i15 > -1) {
            return list.get(i15).longValue();
        }
        return -1L;
    }

    private void P() throws Throwable {
        long j15;
        long j16;
        HashMap map = new HashMap();
        long position = this.f52586f.getPosition();
        long j17 = 6;
        this.f52586f.seek(6L);
        char[] charArray = " obj".toCharArray();
        while (true) {
            long j18 = 0;
            if (this.f52586f.k0()) {
                break;
            }
            if (n0(G)) {
                long position2 = this.f52586f.getPosition();
                boolean z15 = false;
                int i15 = 1;
                while (i15 < 40 && !z15) {
                    long j19 = j17;
                    long j25 = position2 - ((long) (i15 * 10));
                    if (j25 > j18) {
                        this.f52586f.seek(j25);
                        j16 = j18;
                        for (int i16 = 0; i16 < 10; i16++) {
                            if (n0(charArray)) {
                                this.f52586f.seek(j25 - 1);
                                if (a.f(this.f52586f.peek())) {
                                    this.f52586f.seek(j25 - 2);
                                    if (k()) {
                                        long j26 = j25 - 3;
                                        this.f52586f.seek(j26);
                                        int i17 = 0;
                                        while (j26 > j19 && e()) {
                                            j26--;
                                            this.f52586f.seek(j26);
                                            i17++;
                                        }
                                        if (i17 > 0) {
                                            this.f52586f.read();
                                            map.put(Long.valueOf(this.f52586f.getPosition()), new m(F(), B()));
                                        }
                                    }
                                }
                                z15 = true;
                                break;
                            }
                            j25++;
                            this.f52586f.read();
                        }
                    } else {
                        j16 = j18;
                    }
                    i15++;
                    j17 = j19;
                    j18 = j16;
                }
                j15 = j17;
                this.f52586f.seek(position2 + ((long) G.length));
            } else {
                j15 = j17;
            }
            this.f52586f.read();
            j17 = j15;
        }
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            Long l15 = (Long) it.next();
            Long l16 = this.f52596p.get(map.get(l15));
            if (l16 == null) {
                c2.g("PdfBox-Android", "Skipped incomplete object stream:" + map.get(l15) + " at " + l15);
            } else {
                if (l15.equals(l16)) {
                    this.f52586f.seek(l15.longValue());
                    long jF = F();
                    int iB = B();
                    A(E, true);
                    o oVar = null;
                    try {
                        bp.d dVarQ = q();
                        int iX4 = dVarQ.x4(bp.i.f20944z3);
                        int iX5 = dVarQ.x4(bp.i.L5);
                        if (iX4 != -1 && iX5 != -1) {
                            o oVarP0 = p0(dVarQ);
                            try {
                                n nVar = this.f52601u;
                                if (nVar != null) {
                                    nVar.g(oVarP0, jF, iB);
                                }
                                e eVar = new e(oVarP0, this.f52582c);
                                ArrayList arrayList = new ArrayList(iX5);
                                for (int i18 = 0; i18 < iX5; i18++) {
                                    arrayList.add(Long.valueOf(eVar.F()));
                                    eVar.E();
                                }
                                if (oVarP0 != null) {
                                    oVarP0.close();
                                }
                                if (arrayList.size() >= iX5) {
                                    Map<m, Long> mapC = this.f52603w.c();
                                    Iterator it4 = arrayList.iterator();
                                    while (it4.hasNext()) {
                                        m mVar = new m(((Long) it4.next()).longValue(), 0);
                                        Long l17 = this.f52596p.get(mVar);
                                        if (l17 != null && l17.longValue() < 0) {
                                            l17 = this.f52596p.get(new m(Math.abs(l17.longValue()), 0));
                                        }
                                        if (l17 == null || l15.longValue() > l17.longValue()) {
                                            long j27 = -jF;
                                            this.f52596p.put(mVar, Long.valueOf(j27));
                                            mapC.put(mVar, Long.valueOf(j27));
                                        }
                                        it = it;
                                        l15 = l15;
                                    }
                                }
                            } catch (IOException unused) {
                                oVar = oVarP0;
                                if (oVar != null) {
                                    oVar.close();
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                oVar = oVarP0;
                                if (oVar != null) {
                                    oVar.close();
                                }
                                throw th;
                            }
                        }
                    } catch (IOException unused2) {
                    } catch (Throwable th5) {
                        th = th5;
                    }
                }
                it = it;
                it = it;
            }
        }
        this.f52586f.seek(position);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0100  */
    /* JADX WARN: Code duplicated, block: B:54:0x0108 A[EDGE_INSN: B:54:0x0108->B:46:0x0108 BREAK  A[LOOP:0: B:5:0x002b->B:56:?], SYNTHETIC] */
    private void Q() throws IOException {
        if (this.f52596p == null) {
            O();
            this.f52596p = new HashMap();
            long position = this.f52586f.getPosition();
            char[] charArray = "ndo".toCharArray();
            char[] charArray2 = "bj".toCharArray();
            long j15 = Long.MIN_VALUE;
            int i15 = Integer.MIN_VALUE;
            long j16 = 6;
            boolean z15 = false;
            long j17 = Long.MIN_VALUE;
            do {
                this.f52586f.seek(j16);
                int i16 = this.f52586f.read();
                long length = j16 + 1;
                if (!o(i16) || !n0(E)) {
                    if (i16 == 101 && n0(charArray)) {
                        long length2 = length + ((long) charArray.length);
                        this.f52586f.seek(length2);
                        if (this.f52586f.k0()) {
                            j16 = length2;
                            z15 = true;
                        } else if (n0(charArray2)) {
                            length2 += (long) charArray2.length;
                            j16 = length2;
                            z15 = true;
                        } else {
                            j16 = length2;
                        }
                    }
                    if (j16 < this.f52597q.longValue()) {
                        break;
                    }
                } else {
                    this.f52586f.seek((-1) + j16);
                    int iPeek = this.f52586f.peek();
                    if (a.f(iPeek)) {
                        int i17 = iPeek - 48;
                        long j18 = j16 - 2;
                        this.f52586f.seek(j18);
                        if (n()) {
                            while (j18 > 6 && n()) {
                                j18--;
                                this.f52586f.seek(j18);
                            }
                            boolean z16 = false;
                            while (j18 > 6 && e()) {
                                j18--;
                                this.f52586f.seek(j18);
                                z16 = true;
                            }
                            if (z16) {
                                this.f52586f.read();
                                long jF = F();
                                if (j17 > 0) {
                                    this.f52596p.put(new m(j15, i15), Long.valueOf(j17));
                                }
                                j17 = j18 + 1;
                                length += (long) (E.length - 1);
                                j15 = jF;
                                i15 = i17;
                                z15 = false;
                            }
                        }
                    }
                }
                j16 = length;
                if (j16 < this.f52597q.longValue()) {
                    break;
                    break;
                }
            } while (!this.f52586f.k0());
            if ((this.f52597q.longValue() < Long.MAX_VALUE || z15) && j17 > 0) {
                this.f52596p.put(new m(j15, i15), Long.valueOf(j17));
            }
            this.f52586f.seek(position);
        }
    }

    private boolean Q0(long j15) {
        long position = this.f52586f.getPosition();
        long j16 = position + j15;
        boolean z15 = false;
        if (j16 > this.f52592l) {
            c2.g("PdfBox-Android", "The end of the stream is out of range, using workaround to read the stream, stream start position: " + position + ", length: " + j15 + ", expected end position: " + j16);
            return false;
        }
        this.f52586f.seek(j16);
        J();
        if (m0(B)) {
            z15 = true;
        } else {
            c2.g("PdfBox-Android", "The end of the stream doesn't point to the correct offset, using workaround to read the stream, stream start position: " + position + ", length: " + j15 + ", expected end position: " + j16);
        }
        this.f52586f.seek(position);
        return z15;
    }

    private boolean R(bp.d dVar) {
        bp.l lVarN4;
        bp.d dVarK0;
        bp.d dVarK1;
        long position = this.f52586f.getPosition();
        this.f52586f.seek(6L);
        while (true) {
            boolean z15 = false;
            if (this.f52586f.k0()) {
                this.f52586f.seek(position);
                return false;
            }
            char[] cArr = F;
            if (n0(cArr)) {
                dp.g gVar = this.f52586f;
                gVar.seek(gVar.getPosition() + ((long) cArr.length));
                try {
                    J();
                    bp.d dVarQ = q();
                    bp.i iVar = bp.i.D7;
                    bp.l lVarN5 = dVarQ.n4(iVar);
                    boolean z16 = (lVarN5 == null || (dVarK1 = K0(lVarN5)) == null || !j0(dVarK1)) ? false : true;
                    bp.i iVar2 = bp.i.A4;
                    bp.l lVarN6 = dVarQ.n4(iVar2);
                    if (lVarN6 != null && (dVarK0 = K0(lVarN6)) != null && k0(dVarK0)) {
                        z15 = true;
                    }
                    if (z16 && z15) {
                        dVar.Y4(iVar, lVarN5);
                        dVar.Y4(iVar2, lVarN6);
                        bp.i iVar3 = bp.i.f20766i3;
                        if (dVarQ.J3(iVar3) && (lVarN4 = dVarQ.n4(iVar3)) != null && K0(lVarN4) != null) {
                            dVar.Y4(iVar3, lVarN4);
                        }
                        bp.i iVar4 = bp.i.f20826o4;
                        if (dVarQ.J3(iVar4)) {
                            bp.b bVarC4 = dVarQ.C4(iVar4);
                            if (bVarC4 instanceof bp.a) {
                                dVar.Y4(iVar4, bVarC4);
                            }
                        }
                        return true;
                    }
                } catch (IOException unused) {
                    continue;
                }
            }
            this.f52586f.read();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean R0(Map<m, Long> map) {
        if (map == 0) {
            return true;
        }
        HashMap map2 = new HashMap();
        HashSet hashSet = new HashSet();
        for (Map.Entry entry : map.entrySet()) {
            m mVar = (m) entry.getKey();
            Long l15 = (Long) entry.getValue();
            if (l15 != null && l15.longValue() >= 0) {
                m mVarC0 = c0(mVar, l15.longValue(), map);
                if (mVarC0 == null) {
                    Objects.toString(mVar);
                    return false;
                }
                if (mVarC0 != mVar) {
                    map2.put(mVar, mVarC0);
                } else {
                    hashSet.add(mVar);
                }
            }
        }
        HashMap map3 = new HashMap();
        for (Map.Entry entry2 : map2.entrySet()) {
            if (!hashSet.contains(entry2.getValue())) {
                map3.put(entry2.getValue(), map.get(entry2.getKey()));
            }
        }
        Iterator it = map2.entrySet().iterator();
        while (it.hasNext()) {
            map.remove(((Map.Entry) it.next()).getKey());
        }
        for (Map.Entry entry3 : map3.entrySet()) {
            map.put(entry3.getKey(), entry3.getValue());
        }
        return true;
    }

    private long S(long j15, boolean z15) {
        List<Long> list;
        if (!z15) {
            U();
        }
        T();
        long jO0 = (z15 || (list = this.f52598r) == null) ? -1L : O0(list, j15);
        List<Long> list2 = this.f52599s;
        long jO1 = list2 != null ? O0(list2, j15) : -1L;
        if (jO0 > -1 && jO1 > -1) {
            if (Math.abs(j15 - jO0) > Math.abs(j15 - jO1)) {
                this.f52599s.remove(Long.valueOf(jO1));
                return jO1;
            }
            this.f52598r.remove(Long.valueOf(jO0));
            return jO0;
        }
        if (jO0 > -1) {
            this.f52598r.remove(Long.valueOf(jO0));
            return jO0;
        }
        if (jO1 <= -1) {
            return -1L;
        }
        this.f52599s.remove(Long.valueOf(jO1));
        return jO1;
    }

    private void T() {
        long j15;
        if (this.f52599s == null) {
            this.f52599s = new ArrayList();
            long position = this.f52586f.getPosition();
            long j16 = 6;
            this.f52586f.seek(6L);
            char[] charArray = " obj".toCharArray();
            while (!this.f52586f.k0()) {
                if (n0(f52584z)) {
                    long position2 = this.f52586f.getPosition();
                    j15 = j16;
                    boolean z15 = false;
                    long position3 = -1;
                    for (int i15 = 1; i15 < 40 && !z15; i15++) {
                        long j17 = position2 - ((long) (i15 * 10));
                        if (j17 > 0) {
                            this.f52586f.seek(j17);
                            for (int i16 = 0; i16 < 10; i16++) {
                                if (n0(charArray)) {
                                    this.f52586f.seek(j17 - 1);
                                    if (a.f(this.f52586f.peek())) {
                                        this.f52586f.seek(j17 - 2);
                                        if (k()) {
                                            long j18 = j17 - 3;
                                            this.f52586f.seek(j18);
                                            int i17 = 0;
                                            while (j18 > j15 && e()) {
                                                j18--;
                                                this.f52586f.seek(j18);
                                                i17++;
                                            }
                                            if (i17 > 0) {
                                                this.f52586f.read();
                                                position3 = this.f52586f.getPosition();
                                            }
                                        }
                                    }
                                    z15 = true;
                                    break;
                                }
                                j17++;
                                this.f52586f.read();
                            }
                        }
                    }
                    if (position3 > -1) {
                        this.f52599s.add(Long.valueOf(position3));
                    }
                    this.f52586f.seek(position2 + 5);
                } else {
                    j15 = j16;
                }
                this.f52586f.read();
                j16 = j15;
            }
            this.f52586f.seek(position);
        }
    }

    private void U() {
        if (this.f52598r == null) {
            this.f52598r = new ArrayList();
            long position = this.f52586f.getPosition();
            this.f52586f.seek(6L);
            while (!this.f52586f.k0()) {
                if (n0(f52583y)) {
                    long position2 = this.f52586f.getPosition();
                    this.f52586f.seek(position2 - 1);
                    if (n()) {
                        this.f52598r.add(Long.valueOf(position2));
                    }
                    this.f52586f.seek(position2 + 4);
                }
                this.f52586f.read();
            }
            this.f52586f.seek(position);
        }
    }

    private long V(long j15, boolean z15) {
        if (j15 < 0) {
            c2.e("PdfBox-Android", "Invalid object offset " + j15 + " when searching for a xref table/stream");
            return 0L;
        }
        long jS = S(j15, z15);
        if (jS > -1) {
            return jS;
        }
        c2.e("PdfBox-Android", "Can't find the object xref table/stream at offset " + j15);
        return 0L;
    }

    private int X(bp.d dVar, Set<bp.l> set) {
        bp.b bVarP4 = dVar.p4(bp.i.Q4);
        int iX = 0;
        if (bVarP4 instanceof bp.a) {
            bp.a aVar = (bp.a) bVarP4;
            for (bp.b bVar : aVar.toList()) {
                if (bVar instanceof bp.l) {
                    bp.l lVar = (bp.l) bVar;
                    if (!set.contains(lVar)) {
                        bp.b bVarX3 = lVar.X3();
                        if (bVarX3 == null || bVarX3.equals(bp.j.f20954c)) {
                            c2.g("PdfBox-Android", "Removed null object " + bVar + " from pages dictionary");
                            aVar.n4(bVar);
                        } else if (bVarX3 instanceof bp.d) {
                            bp.d dVar2 = (bp.d) bVarX3;
                            bp.i iVarL4 = dVar2.l4(bp.i.f20732e9);
                            if (bp.i.F6.equals(iVarL4)) {
                                set.add(lVar);
                                iX += X(dVar2, set);
                            } else if (bp.i.B6.equals(iVarL4)) {
                                iX++;
                            }
                        }
                    }
                }
                aVar.n4(bVar);
            }
        }
        dVar.W4(bp.i.P1, iX);
        return iX;
    }

    private long Y(long j15) {
        if (this.f52593m) {
            this.f52586f.seek(j15);
            J();
            if (this.f52586f.peek() != 120 || !n0(f52583y)) {
                if (j15 <= 0) {
                    return -1L;
                }
                if (!Z(j15)) {
                    return V(j15, false);
                }
            }
        }
        return j15;
    }

    private boolean Z(long j15) {
        if (!this.f52593m || j15 == 0) {
            return true;
        }
        this.f52586f.seek(j15 - 1);
        if (!o(this.f52586f.read())) {
            return false;
        }
        J();
        if (!e()) {
            return false;
        }
        try {
            F();
            B();
            A(E, true);
            bp.d dVarQ = q();
            this.f52586f.seek(j15);
            return "XRef".equals(dVarQ.H4(bp.i.f20732e9));
        } catch (IOException unused) {
            this.f52586f.seek(j15);
            return false;
        }
    }

    private void a0() throws IOException {
        if (this.f52593m) {
            Map<m, Long> mapC = this.f52603w.c();
            if (R0(mapC)) {
                return;
            }
            Q();
            if (this.f52596p.isEmpty()) {
                return;
            }
            mapC.clear();
            mapC.putAll(this.f52596p);
        }
    }

    private bp.l b0(bp.l lVar, Long l15, bp.l lVar2, Long l16) {
        if (lVar2 != null) {
            return (lVar2.g4() != lVar.g4() ? l16 == null || l15.longValue() <= l16.longValue() : lVar2.N3() >= lVar.N3()) ? lVar2 : lVar;
        }
        return lVar;
    }

    private m c0(m mVar, long j15, Map<m, Long> map) {
        if (j15 < 6) {
            return null;
        }
        try {
            this.f52586f.seek(j15);
            K();
            if (this.f52586f.getPosition() == j15) {
                this.f52586f.seek(j15 - 1);
                if (this.f52586f.getPosition() < j15) {
                    if (e()) {
                        long position = this.f52586f.getPosition() - 1;
                        this.f52586f.seek(position);
                        while (e()) {
                            position--;
                            this.f52586f.seek(position);
                        }
                        m mVar2 = new m(F(), B());
                        Long l15 = map.get(mVar2);
                        if (l15 != null && l15.longValue() > 0 && Math.abs(j15 - l15.longValue()) < 10) {
                            mVar2.toString();
                            Objects.toString(mVar);
                            return null;
                        }
                        this.f52586f.seek(j15);
                    } else {
                        this.f52586f.read();
                    }
                }
            }
            long jF = F();
            if (mVar.g() != jF) {
                c2.g("PdfBox-Android", "found wrong object number. expected [" + mVar.g() + "] found [" + jF + "]");
                if (!this.f52593m) {
                    return null;
                }
                mVar = new m(jF, mVar.e());
            }
            int iB = B();
            A(E, true);
            if (iB == mVar.e()) {
                return mVar;
            }
            if (this.f52593m && iB > mVar.e()) {
                return new m(mVar.g(), iB);
            }
            return null;
        } catch (IOException unused) {
        }
    }

    private bp.k g0(bp.b bVar, bp.i iVar) throws IOException {
        if (bVar == null) {
            return null;
        }
        if (bVar instanceof bp.k) {
            return (bp.k) bVar;
        }
        if (!(bVar instanceof bp.l)) {
            throw new IOException("Wrong type of length object: " + bVar.getClass().getSimpleName());
        }
        bp.l lVar = (bp.l) bVar;
        bp.b bVarX3 = lVar.X3();
        if (bVarX3 == null) {
            long position = this.f52586f.getPosition();
            w0(lVar, bp.i.f20691a6.equals(iVar));
            this.f52586f.seek(position);
            bVarX3 = lVar.X3();
        }
        if (bVarX3 == null) {
            throw new IOException("Length object content was not read.");
        }
        if (bp.j.f20954c == bVarX3) {
            c2.g("PdfBox-Android", "Length object (" + lVar.g4() + " " + lVar.N3() + ") not found");
            return null;
        }
        if (bVarX3 instanceof bp.k) {
            return (bp.k) bVarX3;
        }
        throw new IOException("Wrong type of referenced length object " + lVar + ": " + bVarX3.getClass().getSimpleName());
    }

    private long h0(bp.l lVar) {
        return (lVar.g4() << 32) | ((long) lVar.N3());
    }

    private boolean k0(bp.d dVar) {
        if (dVar.J3(bp.i.J6) || dVar.J3(bp.i.f20733f) || dVar.J3(bp.i.f20805m2)) {
            return false;
        }
        return dVar.J3(bp.i.J5) || dVar.J3(bp.i.N8) || dVar.J3(bp.i.f20843q0) || dVar.J3(bp.i.f20916w8) || dVar.J3(bp.i.O4) || dVar.J3(bp.i.S1) || dVar.J3(bp.i.f20730e7) || dVar.J3(bp.i.R1);
    }

    private boolean m0(byte[] bArr) {
        if (this.f52586f.peek() != bArr[0]) {
            return false;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        int i15 = this.f52586f.read(bArr2, 0, length);
        while (i15 < length) {
            int i16 = this.f52586f.read(bArr2, i15, length - i15);
            if (i16 < 0) {
                break;
            }
            i15 += i16;
        }
        boolean zEquals = Arrays.equals(bArr, bArr2);
        this.f52586f.b3(i15);
        return zEquals;
    }

    private boolean n0(char[] cArr) {
        long position = this.f52586f.getPosition();
        boolean z15 = false;
        for (char c15 : cArr) {
            if (this.f52586f.read() != c15) {
                this.f52586f.seek(position);
                return z15;
            }
        }
        z15 = true;
        this.f52586f.seek(position);
        return z15;
    }

    private void r0(bp.l lVar) throws IOException {
        w0(lVar, true);
        if (!(lVar.X3() instanceof bp.d)) {
            throw new IOException("Dictionary object expected at offset " + this.f52586f.getPosition());
        }
        for (bp.b bVar : ((bp.d) lVar.X3()).N4()) {
            if (bVar instanceof bp.l) {
                bp.l lVar2 = (bp.l) bVar;
                if (lVar2.X3() == null) {
                    r0(lVar2);
                }
            }
        }
    }

    private void t0(Long l15, m mVar, bp.l lVar) throws IOException {
        this.f52586f.seek(l15.longValue());
        long jF = F();
        int iB = B();
        A(E, true);
        if (jF != mVar.g() || iB != mVar.e()) {
            throw new IOException("XREF for " + mVar.g() + ":" + mVar.e() + " points to wrong object: " + jF + ":" + iB + " at offset " + l15);
        }
        J();
        bp.b bVarX = x();
        String strG = G();
        if (strG.equals("stream")) {
            this.f52586f.b3(strG.getBytes(xp.a.f220415d).length);
            if (!(bVarX instanceof bp.d)) {
                throw new IOException("Stream not preceded by dictionary (offset: " + l15 + ").");
            }
            o oVarP0 = p0((bp.d) bVarX);
            n nVar = this.f52601u;
            if (nVar != null) {
                nVar.g(oVarP0, mVar.g(), mVar.e());
            }
            J();
            strG = D();
            if (!strG.startsWith("endobj") && strG.startsWith("endstream")) {
                strG = strG.substring(9).trim();
                if (strG.length() == 0) {
                    strG = D();
                }
            }
            bVarX = oVarP0;
        } else {
            n nVar2 = this.f52601u;
            if (nVar2 != null) {
                nVar2.d(bVarX, mVar.g(), mVar.e());
            }
        }
        lVar.i4(bVarX);
        if (strG.startsWith("endobj")) {
            return;
        }
        if (!this.f52593m) {
            throw new IOException("Object (" + jF + ":" + iB + ") at offset " + l15 + " does not end with 'endobj' but with '" + strG + "'");
        }
        c2.g("PdfBox-Android", "Object (" + jF + ":" + iB + ") at offset " + l15 + " does not end with 'endobj' but with '" + strG + "'");
    }

    private boolean u0(String str, String str2) throws IOException {
        String strD = D();
        if (!strD.contains(str)) {
            strD = D();
            while (!strD.contains(str) && (strD.length() <= 0 || !Character.isDigit(strD.charAt(0)))) {
                strD = D();
            }
        }
        if (!strD.contains(str)) {
            this.f52586f.seek(0L);
            return false;
        }
        int iIndexOf = strD.indexOf(str);
        if (iIndexOf > 0) {
            strD = strD.substring(iIndexOf);
        }
        if (strD.startsWith(str)) {
            if (!strD.matches(str + "\\d.\\d")) {
                if (strD.length() < str.length() + 3) {
                    strD = str + str2;
                } else {
                    String str3 = strD.substring(str.length() + 3, strD.length()) + "\n";
                    strD = strD.substring(0, str.length() + 3);
                    this.f52586f.b3(str3.getBytes(xp.a.f220415d).length);
                }
            }
        }
        float f15 = -1.0f;
        try {
            String[] strArrSplit = strD.split("-");
            if (strArrSplit.length == 2) {
                f15 = Float.parseFloat(strArrSplit[1]);
            }
        } catch (NumberFormatException unused) {
        }
        if (f15 < 0.0f) {
            if (!this.f52593m) {
                throw new IOException("Error getting header version: " + strD);
            }
            f15 = 1.7f;
        }
        this.f52582c.w4(f15);
        this.f52586f.seek(0L);
        return true;
    }

    private void x0(int i15) throws IOException {
        bp.b bVarV0 = v0(i15, 0, true);
        if (bVarV0 instanceof o) {
            try {
                e eVar = new e((o) bVarV0, this.f52582c);
                try {
                    eVar.M();
                    for (bp.l lVar : eVar.L()) {
                        m mVar = new m(lVar);
                        Long l15 = this.f52603w.c().get(mVar);
                        if (l15 != null && l15.longValue() == (-i15)) {
                            this.f52582c.h4(mVar).i4(lVar.X3());
                        }
                    }
                } catch (IOException e15) {
                    if (!this.f52593m) {
                        throw e15;
                    }
                }
            } catch (IOException e16) {
                if (!this.f52593m) {
                    throw e16;
                }
                c2.f("PdfBox-Android", "object stream " + i15 + " could not be parsed due to an exception", e16);
            }
        }
    }

    private long z0() {
        if (!n0(A)) {
            return -1L;
        }
        G();
        J();
        return E();
    }

    protected bp.b B0(bp.d dVar) throws IOException {
        for (bp.b bVar : dVar.N4()) {
            if (bVar instanceof bp.l) {
                w0((bp.l) bVar, false);
            }
        }
        bp.l lVarN4 = dVar.n4(bp.i.D7);
        if (lVarN4 != null) {
            return lVarN4.X3();
        }
        throw new IOException("Missing root object specification in trailer.");
    }

    /* JADX WARN: Code duplicated, block: B:47:0x014b  */
    protected bp.d C0(long j15) throws IOException {
        long j16;
        long j17;
        long jD0;
        bp.d dVarA;
        this.f52586f.seek(j15);
        long j18 = 0;
        long jMax = Math.max(0L, z0());
        long jY = Y(jMax);
        long j19 = -1;
        if (jY > -1) {
            jMax = jY;
        }
        this.f52582c.u4(jMax);
        HashSet hashSet = new HashSet();
        long j25 = jMax;
        while (true) {
            if (j25 <= j18) {
                this.f52603w.g(jMax);
                bp.d dVarB = this.f52603w.b();
                this.f52582c.v4(dVarB);
                this.f52582c.t4(l.b.STREAM == this.f52603w.d());
                a0();
                this.f52582c.i3(this.f52603w.c());
                return dVarB;
            }
            hashSet.add(Long.valueOf(j25));
            this.f52586f.seek(j25);
            J();
            hashSet.add(Long.valueOf(this.f52586f.getPosition()));
            if (this.f52586f.peek() != 120) {
                j16 = j18;
                j17 = j19;
                jD0 = D0(j25, true);
                dVarA = this.f52603w.a();
            } else {
                if (!F0(j25) || !A0()) {
                    throw new IOException("Expected trailer object at offset " + this.f52586f.getPosition());
                }
                dVarA = this.f52603w.a();
                bp.i iVar = bp.i.P9;
                if (dVarA.J3(iVar)) {
                    int iX4 = dVarA.x4(iVar);
                    long j26 = iX4;
                    j16 = j18;
                    long jY2 = Y(j26);
                    j17 = j19;
                    if (jY2 > j19 && jY2 != j26) {
                        c2.g("PdfBox-Android", "/XRefStm offset " + iX4 + " is incorrect, corrected to " + jY2);
                        iX4 = (int) jY2;
                        dVarA.W4(iVar, iX4);
                    }
                    if (iX4 > 0) {
                        this.f52586f.seek(iX4);
                        J();
                        try {
                            D0(j25, false);
                        } catch (IOException e15) {
                            if (!this.f52593m) {
                                throw e15;
                            }
                            c2.f("PdfBox-Android", "Failed to parse /XRefStm at offset " + iX4, e15);
                        }
                    } else {
                        if (!this.f52593m) {
                            throw new IOException("Skipped XRef stream due to a corrupt offset:" + iX4);
                        }
                        c2.e("PdfBox-Android", "Skipped XRef stream due to a corrupt offset:" + iX4);
                    }
                } else {
                    j16 = j18;
                    j17 = j19;
                }
                jD0 = dVarA.F4(bp.i.X6);
            }
            if (jD0 > j16) {
                long jY3 = Y(jD0);
                if (jY3 <= j17 || jY3 == jD0) {
                    j25 = jD0;
                } else {
                    dVarA.c5(bp.i.X6, jY3);
                    j25 = jY3;
                }
            } else {
                j25 = jD0;
            }
            if (hashSet.contains(Long.valueOf(j25))) {
                throw new IOException("/Prev loop at offset " + j25);
            }
            j18 = j16;
            j19 = j17;
        }
    }

    protected boolean F0(long j15) throws IOException {
        if (this.f52586f.peek() != 120 || !G().trim().equals("xref")) {
            return false;
        }
        String strG = G();
        this.f52586f.b3(strG.getBytes(xp.a.f220415d).length);
        this.f52603w.e(j15, l.b.TABLE);
        if (strG.startsWith("trailer")) {
            c2.g("PdfBox-Android", "skipping empty xref table");
            return false;
        }
        do {
            String strD = D();
            String[] strArrSplit = strD.split("\\s");
            if (strArrSplit.length != 2) {
                c2.g("PdfBox-Android", "Unexpected XRefTable Entry: " + strD);
                return false;
            }
            try {
                long j16 = Long.parseLong(strArrSplit[0]);
                try {
                    int i15 = Integer.parseInt(strArrSplit[1]);
                    J();
                    for (int i16 = 0; i16 < i15 && !this.f52586f.k0() && !h((char) this.f52586f.peek()) && this.f52586f.peek() != 116; i16++) {
                        String strD2 = D();
                        String[] strArrSplit2 = strD2.split("\\s");
                        if (strArrSplit2.length < 3) {
                            c2.g("PdfBox-Android", "invalid xref line: " + strD2);
                            break;
                        }
                        if (strArrSplit2[strArrSplit2.length - 1].equals("n")) {
                            try {
                                long j17 = Long.parseLong(strArrSplit2[0]);
                                if (j17 > 0) {
                                    this.f52603w.i(new m(j16, Integer.parseInt(strArrSplit2[1])), j17);
                                } else {
                                    continue;
                                }
                            } catch (NumberFormatException e15) {
                                throw new IOException(e15);
                            }
                        } else if (!strArrSplit2[2].equals("f")) {
                            throw new IOException("Corrupt XRefTable Entry - ObjID:" + j16);
                        }
                        j16++;
                        J();
                    }
                    J();
                } catch (NumberFormatException unused) {
                    c2.g("PdfBox-Android", "XRefTable: invalid number of objects: " + strD);
                    return false;
                }
            } catch (NumberFormatException unused2) {
                c2.g("PdfBox-Android", "XRefTable: invalid ID for the first object: " + strD);
                return false;
            }
        } while (e());
        return true;
    }

    protected final bp.d J0() throws Throwable {
        bp.d dVarB;
        boolean z15;
        Q();
        if (this.f52596p != null) {
            this.f52603w.f();
            this.f52603w.e(0L, l.b.TABLE);
            for (Map.Entry<m, Long> entry : this.f52596p.entrySet()) {
                this.f52603w.i(entry.getKey(), entry.getValue().longValue());
            }
            this.f52603w.g(0L);
            dVarB = this.f52603w.b();
            e0().v4(dVarB);
            if (R(dVarB) || N0(dVarB)) {
                z15 = false;
            } else {
                P();
                N0(dVarB);
                z15 = true;
            }
            G0();
            if (!z15) {
                P();
            }
        } else {
            dVarB = null;
        }
        this.f52595o = true;
        return dVarB;
    }

    protected bp.d M0() throws Throwable {
        boolean zL0;
        bp.d dVarC0 = null;
        try {
            long jI0 = i0();
            if (jI0 > -1) {
                dVarC0 = C0(jI0);
                zL0 = false;
            } else {
                zL0 = l0();
            }
        } catch (IOException e15) {
            if (!l0()) {
                throw e15;
            }
            zL0 = true;
        }
        if (dVarC0 != null && dVarC0.C4(bp.i.D7) == null) {
            zL0 = l0();
        }
        if (zL0) {
            return J0();
        }
        G0();
        Map<m, Long> map = this.f52596p;
        if (map == null || map.isEmpty()) {
            return dVarC0;
        }
        P();
        return dVarC0;
    }

    public void P0(int i15) {
        if (i15 > 15) {
            this.f52602v = i15;
        }
    }

    protected void W(bp.d dVar) {
        if (!this.f52595o || dVar == null) {
            return;
        }
        bp.b bVarP4 = dVar.p4(bp.i.F6);
        if (bVarP4 instanceof bp.d) {
            X((bp.d) bVarP4, new HashSet());
        }
    }

    public jp.a d0() throws IOException {
        if (this.f52582c != null) {
            return this.f52587g;
        }
        throw new IOException("You must parse the document first before calling getAccessPermission()");
    }

    public bp.e e0() throws IOException {
        bp.e eVar = this.f52582c;
        if (eVar != null) {
            return eVar;
        }
        throw new IOException("You must parse the document first before calling getDocument()");
    }

    public jp.f f0() throws IOException {
        if (this.f52582c != null) {
            return this.f52600t;
        }
        throw new IOException("You must parse the document first before calling getEncryption()");
    }

    protected final long i0() throws IOException {
        try {
            long j15 = this.f52592l;
            int i15 = this.f52602v;
            if (j15 < i15) {
                i15 = (int) j15;
            }
            byte[] bArr = new byte[i15];
            long j16 = j15 - ((long) i15);
            this.f52586f.seek(j16);
            int i16 = 0;
            while (i16 < i15) {
                int i17 = i15 - i16;
                int i18 = this.f52586f.read(bArr, i16, i17);
                if (i18 < 1) {
                    throw new IOException("No more bytes to read for trailing buffer, but expected: " + i17);
                }
                i16 += i18;
            }
            this.f52586f.seek(0L);
            char[] cArr = D;
            int iO0 = o0(cArr, bArr, i15);
            if (iO0 >= 0) {
                i15 = iO0;
            } else {
                if (!this.f52593m) {
                    throw new IOException("Missing end of file marker '" + new String(cArr) + "'");
                }
                new String(cArr);
            }
            int iO1 = o0(A, bArr, i15);
            if (iO1 >= 0) {
                return j16 + ((long) iO1);
            }
            throw new IOException("Missing 'startxref' marker.");
        } catch (Throwable th4) {
            this.f52586f.seek(0L);
            throw th4;
        }
    }

    protected boolean j0(bp.d dVar) {
        return bp.i.Z0.equals(dVar.l4(bp.i.f20732e9));
    }

    public boolean l0() {
        return this.f52593m;
    }

    protected int o0(char[] cArr, byte[] bArr, int i15) {
        int length = cArr.length - 1;
        char c15 = cArr[length];
        while (true) {
            int i16 = length;
            while (true) {
                i15--;
                if (i15 < 0) {
                    return -1;
                }
                if (bArr[i15] == c15) {
                    i16--;
                    if (i16 < 0) {
                        return i15;
                    }
                    c15 = cArr[i16];
                } else if (i16 < length) {
                    break;
                }
            }
            c15 = cArr[length];
        }
    }

    protected o p0(bp.d dVar) throws IOException {
        o oVarJ3 = this.f52582c.J3(dVar);
        G();
        K();
        bp.i iVar = bp.i.f20699b5;
        bp.k kVarG0 = g0(dVar.C4(iVar), dVar.l4(bp.i.f20732e9));
        if (kVarG0 == null) {
            if (!this.f52593m) {
                throw new IOException("Missing length for stream.");
            }
            c2.g("PdfBox-Android", "The stream doesn't provide any stream length, using fallback readUntilEnd, at offset " + this.f52586f.getPosition());
        }
        if (kVarG0 == null || !Q0(kVarG0.X3())) {
            OutputStream outputStreamQ5 = oVarJ3.q5();
            try {
                H0(new c(outputStreamQ5));
                outputStreamQ5.close();
                if (kVarG0 != null) {
                    oVarJ3.Y4(iVar, kVarG0);
                }
            } catch (Throwable th4) {
                outputStreamQ5.close();
                if (kVarG0 != null) {
                    oVarJ3.Y4(bp.i.f20699b5, kVarG0);
                }
                throw th4;
            }
        } else {
            OutputStream outputStreamQ6 = oVarJ3.q5();
            try {
                I0(outputStreamQ6, kVarG0);
                outputStreamQ6.close();
                oVarJ3.Y4(iVar, kVarG0);
            } catch (Throwable th5) {
                outputStreamQ6.close();
                oVarJ3.Y4(bp.i.f20699b5, kVarG0);
                throw th5;
            }
        }
        String strG = G();
        if (strG.equals("endobj") && this.f52593m) {
            c2.g("PdfBox-Android", "stream ends with 'endobj' instead of 'endstream' at offset " + this.f52586f.getPosition());
            this.f52586f.b3(C.length);
            return oVarJ3;
        }
        if (strG.length() > 9 && this.f52593m && strG.startsWith("endstream")) {
            c2.g("PdfBox-Android", "stream ends with '" + strG + "' instead of 'endstream' at offset " + this.f52586f.getPosition());
            this.f52586f.b3(strG.substring(9).getBytes(xp.a.f220415d).length);
            return oVarJ3;
        }
        if (strG.equals("endstream")) {
            return oVarJ3;
        }
        throw new IOException("Error reading stream, expected='endstream' actual='" + strG + "' at offset " + this.f52586f.getPosition());
    }

    protected void q0(bp.d dVar, bp.i... iVarArr) throws IOException {
        LinkedList linkedList = new LinkedList();
        TreeMap treeMap = new TreeMap();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        L(iVarArr, dVar, hashSet);
        N(linkedList, dVar.N4(), hashSet2);
        while (true) {
            if (linkedList.isEmpty() && treeMap.isEmpty()) {
                return;
            }
            while (true) {
                bp.b bVarPoll = linkedList.poll();
                if (bVarPoll != null) {
                    if (bVarPoll instanceof bp.d) {
                        N(linkedList, ((bp.d) bVarPoll).N4(), hashSet2);
                    } else if (bVarPoll instanceof bp.a) {
                        Iterator<bp.b> it = ((bp.a) bVarPoll).iterator();
                        while (it.hasNext()) {
                            M(linkedList, it.next(), hashSet2);
                        }
                    } else if (bVarPoll instanceof bp.l) {
                        bp.l lVar = (bp.l) bVarPoll;
                        long jH0 = h0(lVar);
                        m mVar = new m(lVar.g4(), lVar.N3());
                        if (hashSet.contains(Long.valueOf(jH0))) {
                            continue;
                        } else {
                            Long l15 = this.f52582c.m4().get(mVar);
                            if (l15 == null && this.f52593m) {
                                Q();
                                l15 = this.f52596p.get(mVar);
                                if (l15 != null) {
                                    mVar.toString();
                                    this.f52582c.m4().put(mVar, l15);
                                }
                            }
                            if (l15 == null || l15.longValue() == 0) {
                                this.f52582c.h4(mVar).i4(bp.j.f20954c);
                            } else if (l15.longValue() > 0) {
                                treeMap.put(l15, Collections.singletonList(lVar));
                            } else {
                                m mVar2 = new m((int) (-l15.longValue()), 0);
                                Long l16 = this.f52582c.m4().get(mVar2);
                                if (l16 == null || l16.longValue() <= 0) {
                                    if (this.f52593m) {
                                        Q();
                                        l16 = this.f52596p.get(mVar2);
                                        if (l16 != null) {
                                            mVar2.toString();
                                            this.f52582c.m4().put(mVar2, l16);
                                        } else {
                                            c2.g("PdfBox-Android", "Invalid object stream xref object reference for key '" + mVar + "': " + l16);
                                        }
                                    } else {
                                        String str = "Invalid object stream xref object reference for key '" + mVar + "': " + l16;
                                        if (!this.f52593m || l16 != null) {
                                            throw new IOException(str);
                                        }
                                        c2.g("PdfBox-Android", str);
                                    }
                                }
                                List arrayList = (List) treeMap.get(l16);
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                    treeMap.put(l16, arrayList);
                                } else if (!(arrayList instanceof ArrayList)) {
                                    throw new IOException(lVar + " cannot be assigned to offset " + l16 + ", this belongs to " + arrayList.get(0));
                                }
                                arrayList.add(lVar);
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
            if (treeMap.isEmpty()) {
                return;
            }
            for (bp.l lVar2 : (List) treeMap.remove(treeMap.firstKey())) {
                bp.b bVarW0 = w0(lVar2, false);
                if (bVarW0 != null) {
                    lVar2.i4(bVarW0);
                    M(linkedList, bVarW0, hashSet2);
                    hashSet.add(Long.valueOf(h0(lVar2)));
                }
            }
        }
    }

    protected boolean s0() {
        return u0("%FDF-", "1.0");
    }

    protected bp.b v0(long j15, int i15, boolean z15) throws IOException {
        m mVar = new m(j15, i15);
        bp.l lVarH4 = this.f52582c.h4(mVar);
        if (lVarH4.X3() == null) {
            Long l15 = this.f52582c.m4().get(mVar);
            if (l15 == null && this.f52593m) {
                Q();
                l15 = this.f52596p.get(mVar);
                if (l15 != null) {
                    mVar.toString();
                    this.f52582c.m4().put(mVar, l15);
                }
            }
            if (z15 && (l15 == null || l15.longValue() <= 0)) {
                throw new IOException("Object must be defined and must not be compressed object: " + mVar.g() + ":" + mVar.e());
            }
            if (lVarH4.i3()) {
                throw new IOException("Possible recursion detected when dereferencing object " + j15 + " " + i15);
            }
            lVarH4.J3();
            if (l15 == null && this.f52593m && this.f52596p == null) {
                Q();
                if (!this.f52596p.isEmpty()) {
                    Map<m, Long> mapM4 = this.f52582c.m4();
                    for (Map.Entry<m, Long> entry : this.f52596p.entrySet()) {
                        m key = entry.getKey();
                        if (!mapM4.containsKey(key)) {
                            mapM4.put(key, entry.getValue());
                        }
                    }
                    l15 = mapM4.get(mVar);
                }
            }
            if (l15 == null) {
                lVarH4.i4(bp.j.f20954c);
            } else if (l15.longValue() > 0) {
                t0(l15, mVar, lVarH4);
            } else {
                x0((int) (-l15.longValue()));
            }
            lVarH4.A3();
        }
        return lVarH4.X3();
    }

    protected final bp.b w0(bp.l lVar, boolean z15) {
        return v0(lVar.g4(), lVar.N3(), z15);
    }

    protected boolean y0() {
        return u0("%PDF-", "1.4");
    }
}
