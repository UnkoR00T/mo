package so;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TimeZone;
import java.util.TreeMap;
import java.util.TreeSet;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class k0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte[] f182669h = {0, 0, 0};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n0 f182670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f182671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SortedMap<Integer, Integer> f182672c = new TreeMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<String> f182673d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SortedSet<Integer> f182674e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f182675f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f182676g;

    public k0(n0 n0Var, List<String> list) {
        this.f182670a = n0Var;
        this.f182673d = list;
        TreeSet treeSet = new TreeSet();
        this.f182674e = treeSet;
        this.f182671b = n0Var.Y0();
        treeSet.add(0);
    }

    private long A(DataOutputStream dataOutputStream, String str, long j15, byte[] bArr) throws IOException {
        int length = bArr.length;
        long j16 = 0;
        for (int i15 = 0; i15 < length; i15++) {
            j16 += (((long) bArr[i15]) & 255) << (24 - ((i15 % 4) * 8));
        }
        long j17 = j16 & BodyPartID.bodyIdMax;
        byte[] bytes = str.getBytes("US-ASCII");
        dataOutputStream.write(bytes, 0, 4);
        dataOutputStream.writeInt((int) j17);
        dataOutputStream.writeInt((int) j15);
        dataOutputStream.writeInt(bArr.length);
        return u(bytes) + j17 + j17 + j15 + ((long) bArr.length);
    }

    private void C(DataOutputStream dataOutputStream, int i15) throws IOException {
        dataOutputStream.writeShort(i15);
    }

    private void D(DataOutputStream dataOutputStream, long j15) throws IOException {
        dataOutputStream.writeInt((int) j15);
    }

    private void E(DataOutputStream dataOutputStream, int i15) throws IOException {
        dataOutputStream.writeByte(i15);
    }

    private void c() throws IOException {
        TreeSet treeSet;
        int i15;
        if (this.f182676g) {
            return;
        }
        this.f182676g = true;
        o oVarI = this.f182670a.I();
        long[] jArrJ = this.f182670a.N().j();
        do {
            InputStream inputStreamB0 = this.f182670a.b0();
            try {
                inputStreamB0.skip(oVarI.c());
                treeSet = null;
                long j15 = 0;
                for (Integer num : this.f182674e) {
                    long j16 = jArrJ[num.intValue()];
                    long j17 = jArrJ[num.intValue() + 1] - j16;
                    inputStreamB0.skip(j16 - j15);
                    int i16 = (int) j17;
                    byte[] bArr = new byte[i16];
                    inputStreamB0.read(bArr);
                    if (i16 >= 2 && bArr[0] == -1 && bArr[1] == -1) {
                        int i17 = 10;
                        do {
                            i15 = ((bArr[i17] & 255) << 8) | (bArr[i17 + 1] & 255);
                            int i18 = ((bArr[i17 + 2] & 255) << 8) | (bArr[i17 + 3] & 255);
                            if (!this.f182674e.contains(Integer.valueOf(i18))) {
                                if (treeSet == null) {
                                    treeSet = new TreeSet();
                                }
                                treeSet.add(Integer.valueOf(i18));
                            }
                            i17 = (i15 & 1) != 0 ? i17 + 8 : i17 + 6;
                            if ((i15 & 128) != 0) {
                                i17 += 8;
                            } else if ((i15 & 64) != 0) {
                                i17 += 4;
                            } else if ((i15 & 8) != 0) {
                                i17 += 2;
                            }
                        } while ((i15 & 32) != 0);
                    }
                    j15 = jArrJ[num.intValue() + 1];
                }
                inputStreamB0.close();
                if (treeSet != null) {
                    this.f182674e.addAll(treeSet);
                }
            } catch (Throwable th4) {
                inputStreamB0.close();
                throw th4;
            }
        } while (treeSet != null);
    }

    private byte[] d() throws IOException {
        if (this.f182670a.H() == null || this.f182672c.isEmpty()) {
            return null;
        }
        List<String> list = this.f182673d;
        if (list != null && !list.contains("cmap")) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        C(dataOutputStream, 0);
        int i15 = 1;
        C(dataOutputStream, 1);
        C(dataOutputStream, 3);
        C(dataOutputStream, 1);
        D(dataOutputStream, 12L);
        Iterator<Map.Entry<Integer, Integer>> it = this.f182672c.entrySet().iterator();
        Map.Entry<Integer, Integer> next = it.next();
        int iP = p(next.getValue());
        int size = this.f182672c.size() + 1;
        int[] iArr = new int[size];
        int[] iArr2 = new int[size];
        int[] iArr3 = new int[size];
        int i16 = 0;
        int i17 = iP;
        Map.Entry<Integer, Integer> entry = next;
        while (it.hasNext()) {
            Map.Entry<Integer, Integer> next2 = it.next();
            int iP2 = p(next2.getValue());
            int i18 = i15;
            if (next2.getKey().intValue() > 65535) {
                throw new UnsupportedOperationException("non-BMP Unicode character");
            }
            if (next2.getKey().intValue() != entry.getKey().intValue() + 1 || iP2 - i17 != next2.getKey().intValue() - next.getKey().intValue()) {
                if (i17 != 0) {
                    iArr[i16] = next.getKey().intValue();
                    iArr2[i16] = entry.getKey().intValue();
                    iArr3[i16] = i17 - next.getKey().intValue();
                } else {
                    if (!next.getKey().equals(entry.getKey())) {
                        iArr[i16] = next.getKey().intValue() + 1;
                        iArr2[i16] = entry.getKey().intValue();
                        iArr3[i16] = i17 - next.getKey().intValue();
                    }
                    next = next2;
                    i17 = iP2;
                }
                i16++;
                next = next2;
                i17 = iP2;
            }
            entry = next2;
            i15 = i18;
        }
        int i19 = i15;
        iArr[i16] = next.getKey().intValue();
        iArr2[i16] = entry.getKey().intValue();
        iArr3[i16] = i17 - next.getKey().intValue();
        int i25 = i16 + 1;
        iArr[i25] = 65535;
        iArr2[i25] = 65535;
        iArr3[i25] = i19;
        int i26 = i16 + 2;
        int iPow = ((int) Math.pow(2.0d, q(i26))) * 2;
        C(dataOutputStream, 4);
        C(dataOutputStream, (i26 * 8) + 16);
        C(dataOutputStream, 0);
        int i27 = i26 * 2;
        C(dataOutputStream, i27);
        C(dataOutputStream, iPow);
        C(dataOutputStream, q(iPow / 2));
        C(dataOutputStream, i27 - iPow);
        for (int i28 = 0; i28 < i26; i28++) {
            C(dataOutputStream, iArr2[i28]);
        }
        C(dataOutputStream, 0);
        for (int i29 = 0; i29 < i26; i29++) {
            C(dataOutputStream, iArr[i29]);
        }
        for (int i35 = 0; i35 < i26; i35++) {
            C(dataOutputStream, iArr3[i35]);
        }
        for (int i36 = 0; i36 < i26; i36++) {
            C(dataOutputStream, 0);
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0106 A[Catch: all -> 0x00e4, TryCatch #0 {all -> 0x00e4, blocks: (B:3:0x001d, B:4:0x0030, B:6:0x0036, B:8:0x0062, B:10:0x0067, B:13:0x006d, B:15:0x00af, B:17:0x00b4, B:19:0x00b8, B:26:0x00c8, B:28:0x00cc, B:30:0x00d2, B:34:0x00e6, B:35:0x00ea, B:40:0x00fe, B:42:0x0106, B:44:0x0115, B:20:0x00bb, B:22:0x00bf, B:23:0x00c2, B:25:0x00c6, B:16:0x00b2, B:39:0x00f8, B:45:0x011e), top: B:50:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0114  */
    private byte[] e(long[] jArr) throws IOException {
        Iterator<Integer> it;
        long[] jArr2;
        long j15;
        int i15;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        o oVarI = this.f182670a.I();
        long[] jArrJ = this.f182670a.N().j();
        InputStream inputStreamB0 = this.f182670a.b0();
        try {
            inputStreamB0.skip(oVarI.c());
            Iterator<Integer> it4 = this.f182674e.iterator();
            char c15 = 0;
            int i16 = 0;
            long j16 = 0;
            long j17 = 0;
            while (it4.hasNext()) {
                Integer next = it4.next();
                long j18 = jArrJ[next.intValue()];
                long j19 = jArrJ[next.intValue() + 1] - j18;
                int i17 = i16 + 1;
                jArr[i16] = j16;
                inputStreamB0.skip(j18 - j17);
                int i18 = (int) j19;
                byte[] bArr = new byte[i18];
                inputStreamB0.read(bArr);
                if (i18 >= 2 && bArr[c15] == -1 && bArr[1] == -1) {
                    int i19 = 10;
                    while (true) {
                        i15 = ((bArr[i19] & 255) << 8) | (bArr[i19 + 1] & 255);
                        int i25 = i19 + 2;
                        it = it4;
                        int i26 = i19 + 3;
                        int i27 = ((bArr[i25] & 255) << 8) | (bArr[i26] & 255);
                        jArr2 = jArrJ;
                        this.f182674e.add(Integer.valueOf(i27));
                        int iP = p(Integer.valueOf(i27));
                        bArr[i25] = (byte) (iP >>> 8);
                        bArr[i26] = (byte) iP;
                        i19 = (i15 & 1) != 0 ? i19 + 8 : i19 + 6;
                        if ((i15 & 128) != 0) {
                            i19 += 8;
                        } else if ((i15 & 64) != 0) {
                            i19 += 4;
                        } else if ((i15 & 8) != 0) {
                            i19 += 2;
                        }
                        if ((i15 & 32) == 0) {
                            break;
                        }
                        it4 = it;
                        jArrJ = jArr2;
                    }
                    if ((i15 & 256) == 256) {
                        i19 = i19 + 2 + (((bArr[i19] & 255) << 8) | (bArr[i19 + 1] & 255));
                    }
                    byteArrayOutputStream.write(bArr, 0, i19);
                    j15 = i19;
                } else {
                    it = it4;
                    jArr2 = jArrJ;
                    if (i18 > 0) {
                        byteArrayOutputStream.write(bArr, 0, i18);
                        j15 = i18;
                    }
                    if (j16 % 4 != 0) {
                        int i28 = 4 - ((int) (j16 % 4));
                        c15 = 0;
                        byteArrayOutputStream.write(f182669h, 0, i28);
                        j16 += (long) i28;
                    } else {
                        c15 = 0;
                    }
                    j17 = j18 + j19;
                    i16 = i17;
                    it4 = it;
                    jArrJ = jArr2;
                }
                j16 += j15;
                if (j16 % 4 != 0) {
                    int i29 = 4 - ((int) (j16 % 4));
                    c15 = 0;
                    byteArrayOutputStream.write(f182669h, 0, i29);
                    j16 += (long) i29;
                } else {
                    c15 = 0;
                }
                j17 = j18 + j19;
                i16 = i17;
                it4 = it;
                jArrJ = jArr2;
            }
            jArr[i16] = j16;
            return byteArrayOutputStream.toByteArray();
        } finally {
            inputStreamB0.close();
        }
    }

    private byte[] f() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        p pVarK = this.f182670a.K();
        w(dataOutputStream, pVarK.u());
        w(dataOutputStream, pVarK.m());
        D(dataOutputStream, 0L);
        D(dataOutputStream, pVarK.r());
        C(dataOutputStream, pVarK.k());
        C(dataOutputStream, pVarK.t());
        x(dataOutputStream, pVarK.j());
        x(dataOutputStream, pVarK.s());
        y(dataOutputStream, pVarK.w());
        y(dataOutputStream, pVarK.y());
        y(dataOutputStream, pVarK.v());
        y(dataOutputStream, pVarK.x());
        C(dataOutputStream, pVarK.q());
        C(dataOutputStream, pVarK.p());
        y(dataOutputStream, pVarK.l());
        y(dataOutputStream, (short) 1);
        y(dataOutputStream, pVarK.n());
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    private byte[] g() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        q qVarL = this.f182670a.L();
        w(dataOutputStream, qVarL.y());
        y(dataOutputStream, qVarL.k());
        y(dataOutputStream, qVarL.n());
        y(dataOutputStream, qVarL.o());
        C(dataOutputStream, qVarL.j());
        y(dataOutputStream, qVarL.q());
        y(dataOutputStream, qVarL.r());
        y(dataOutputStream, qVarL.z());
        y(dataOutputStream, qVarL.l());
        y(dataOutputStream, qVarL.m());
        y(dataOutputStream, qVarL.t());
        y(dataOutputStream, qVarL.u());
        y(dataOutputStream, qVarL.v());
        y(dataOutputStream, qVarL.w());
        y(dataOutputStream, qVarL.x());
        y(dataOutputStream, qVarL.p());
        int size = this.f182674e.subSet(0, Integer.valueOf(qVarL.s())).size();
        if (this.f182674e.last().intValue() >= qVarL.s() && !this.f182674e.contains(Integer.valueOf(qVarL.s() - 1))) {
            size++;
        }
        C(dataOutputStream, size);
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    private byte[] h() throws Throwable {
        InputStream inputStream;
        long jN;
        k0 k0Var = this;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        q qVarL = k0Var.f182670a.L();
        r rVarM = k0Var.f182670a.M();
        InputStream inputStreamB0 = k0Var.f182670a.b0();
        int iS = qVarL.s() - 1;
        boolean z15 = k0Var.f182674e.last().intValue() > iS && !k0Var.f182674e.contains(Integer.valueOf(iS));
        try {
            inputStreamB0.skip(rVarM.c());
            boolean z16 = z15;
            long jN2 = 0;
            for (Iterator<Integer> it = k0Var.f182674e.iterator(); it.hasNext(); it = it) {
                Integer next = it.next();
                if (next.intValue() <= iS) {
                    inputStream = inputStreamB0;
                    try {
                        jN = k0Var.n(inputStream, byteArrayOutputStream, ((long) next.intValue()) * 4, jN2, 4);
                    } catch (Throwable th4) {
                        th = th4;
                        inputStream.close();
                        throw th;
                    }
                } else {
                    inputStream = inputStreamB0;
                    if (z16) {
                        jN2 = n(inputStream, byteArrayOutputStream, ((long) iS) * 4, jN2, 2);
                        z16 = false;
                    }
                    jN = n(inputStream, byteArrayOutputStream, (((long) qVarL.s()) * 4) + (((long) (next.intValue() - qVarL.s())) * 2), jN2, 2);
                }
                jN2 = jN;
                k0Var = this;
                inputStreamB0 = inputStream;
            }
            inputStream = inputStreamB0;
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            inputStream.close();
            return byteArray;
        } catch (Throwable th5) {
            th = th5;
            inputStream = inputStreamB0;
        }
    }

    private byte[] i(long[] jArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        for (long j15 : jArr) {
            D(dataOutputStream, j15);
        }
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    private byte[] j() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        v vVarO = this.f182670a.O();
        w(dataOutputStream, 1.0d);
        C(dataOutputStream, this.f182674e.size());
        C(dataOutputStream, vVarO.q());
        C(dataOutputStream, vVarO.n());
        C(dataOutputStream, vVarO.m());
        C(dataOutputStream, vVarO.l());
        C(dataOutputStream, vVarO.v());
        C(dataOutputStream, vVarO.u());
        C(dataOutputStream, vVarO.t());
        C(dataOutputStream, vVarO.o());
        C(dataOutputStream, vVarO.p());
        C(dataOutputStream, vVarO.s());
        C(dataOutputStream, vVarO.r());
        C(dataOutputStream, vVarO.k());
        C(dataOutputStream, vVarO.j());
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0089  */
    private byte[] k() throws IOException {
        List<String> list;
        String str;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        y yVarV = this.f182670a.V();
        if (yVarV == null || !((list = this.f182673d) == null || list.contains("name"))) {
            return null;
        }
        List<x> listN = yVarV.n();
        Iterator<x> it = listN.iterator();
        int i15 = 0;
        while (it.hasNext()) {
            if (s(it.next())) {
                i15++;
            }
        }
        C(dataOutputStream, 0);
        C(dataOutputStream, i15);
        C(dataOutputStream, (i15 * 12) + 6);
        if (i15 == 0) {
            return null;
        }
        byte[][] bArr = new byte[i15][];
        int i16 = 0;
        for (x xVar : listN) {
            if (s(xVar)) {
                int iD = xVar.d();
                int iC = xVar.c();
                if (iD == 3 && iC == 1) {
                    str = "UTF-16BE";
                } else if (iD != 2) {
                    str = "ISO-8859-1";
                } else if (iC == 0) {
                    str = "US-ASCII";
                } else if (iC == 1) {
                    str = "UTF16-BE";
                } else {
                    str = "ISO-8859-1";
                }
                String strE = xVar.e();
                if (xVar.b() == 6 && this.f182675f != null) {
                    strE = this.f182675f + strE;
                }
                bArr[i16] = strE.getBytes(str);
                i16++;
            }
        }
        int i17 = 0;
        int length = 0;
        for (x xVar2 : listN) {
            if (s(xVar2)) {
                C(dataOutputStream, xVar2.d());
                C(dataOutputStream, xVar2.c());
                C(dataOutputStream, xVar2.a());
                C(dataOutputStream, xVar2.b());
                C(dataOutputStream, bArr[i17].length);
                C(dataOutputStream, length);
                length += bArr[i17].length;
                i17++;
            }
        }
        for (int i18 = 0; i18 < i15; i18++) {
            dataOutputStream.write(bArr[i18]);
        }
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    private byte[] l() throws IOException {
        z zVarA0 = this.f182670a.a0();
        if (zVarA0 == null || this.f182672c.isEmpty()) {
            return null;
        }
        List<String> list = this.f182673d;
        if (list != null && !list.contains("OS/2")) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        C(dataOutputStream, zVarA0.G());
        y(dataOutputStream, zVarA0.k());
        C(dataOutputStream, zVarA0.H());
        C(dataOutputStream, zVarA0.I());
        y(dataOutputStream, zVarA0.q());
        y(dataOutputStream, zVarA0.w());
        y(dataOutputStream, zVarA0.y());
        y(dataOutputStream, zVarA0.v());
        y(dataOutputStream, zVarA0.x());
        y(dataOutputStream, zVarA0.A());
        y(dataOutputStream, zVarA0.C());
        y(dataOutputStream, zVarA0.z());
        y(dataOutputStream, zVarA0.B());
        y(dataOutputStream, zVarA0.u());
        y(dataOutputStream, zVarA0.t());
        y(dataOutputStream, (short) zVarA0.o());
        dataOutputStream.write(zVarA0.s());
        D(dataOutputStream, 0L);
        D(dataOutputStream, 0L);
        D(dataOutputStream, 0L);
        D(dataOutputStream, 0L);
        dataOutputStream.write(zVarA0.j().getBytes("US-ASCII"));
        C(dataOutputStream, zVarA0.p());
        C(dataOutputStream, this.f182672c.firstKey().intValue());
        C(dataOutputStream, this.f182672c.lastKey().intValue());
        C(dataOutputStream, zVarA0.D());
        C(dataOutputStream, zVarA0.E());
        C(dataOutputStream, zVarA0.F());
        C(dataOutputStream, zVarA0.J());
        C(dataOutputStream, zVarA0.K());
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    private byte[] m() throws IOException {
        e0 e0VarD0 = this.f182670a.d0();
        if (e0VarD0 == null) {
            return null;
        }
        List<String> list = this.f182673d;
        if (list != null && !list.contains("post")) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        w(dataOutputStream, 2.0d);
        w(dataOutputStream, e0VarD0.l());
        y(dataOutputStream, e0VarD0.r());
        y(dataOutputStream, e0VarD0.s());
        D(dataOutputStream, e0VarD0.k());
        D(dataOutputStream, e0VarD0.p());
        D(dataOutputStream, e0VarD0.n());
        D(dataOutputStream, e0VarD0.o());
        D(dataOutputStream, e0VarD0.m());
        C(dataOutputStream, this.f182674e.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Integer> it = this.f182674e.iterator();
        while (it.hasNext()) {
            String strQ = e0VarD0.q(it.next().intValue());
            Integer num = r0.f182800b.get(strQ);
            if (num != null) {
                C(dataOutputStream, num.intValue());
            } else {
                Integer numValueOf = (Integer) linkedHashMap.get(strQ);
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(linkedHashMap.size());
                    linkedHashMap.put(strQ, numValueOf);
                }
                C(dataOutputStream, numValueOf.intValue() + 258);
            }
        }
        Iterator it4 = linkedHashMap.keySet().iterator();
        while (it4.hasNext()) {
            byte[] bytes = ((String) it4.next()).getBytes(Charset.forName("US-ASCII"));
            E(dataOutputStream, bytes.length);
            dataOutputStream.write(bytes);
        }
        dataOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    private long n(InputStream inputStream, OutputStream outputStream, long j15, long j16, int i15) throws IOException {
        long j17 = j15 - j16;
        if (j17 != inputStream.skip(j17)) {
            throw new EOFException("Unexpected EOF exception parsing glyphId of hmtx table.");
        }
        byte[] bArr = new byte[i15];
        if (i15 != inputStream.read(bArr, 0, i15)) {
            throw new EOFException("Unexpected EOF exception parsing glyphId of hmtx table.");
        }
        outputStream.write(bArr, 0, i15);
        return j15 + ((long) i15);
    }

    private int p(Integer num) {
        return this.f182674e.headSet(num).size();
    }

    private int q(int i15) {
        return (int) Math.floor(Math.log(i15) / Math.log(2.0d));
    }

    private boolean s(x xVar) {
        return xVar.d() == 3 && xVar.c() == 1 && xVar.a() == 1033 && xVar.b() >= 0 && xVar.b() < 7;
    }

    private long t(int i15, int i16) {
        return (((long) i16) & 65535) | ((((long) i15) & 65535) << 16);
    }

    private long u(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 24) | ((((long) bArr[1]) & 255) << 16) | ((((long) bArr[2]) & 255) << 8) | (255 & ((long) bArr[3]));
    }

    private long v(DataOutputStream dataOutputStream, int i15) throws IOException {
        dataOutputStream.writeInt(PKIFailureInfo.notAuthorized);
        dataOutputStream.writeShort(i15);
        int iHighestOneBit = Integer.highestOneBit(i15);
        int i16 = iHighestOneBit * 16;
        dataOutputStream.writeShort(i16);
        int iQ = q(iHighestOneBit);
        dataOutputStream.writeShort(iQ);
        int i17 = (i15 * 16) - i16;
        dataOutputStream.writeShort(i17);
        return t(i15, i16) + 65536 + t(iQ, i17);
    }

    private void w(DataOutputStream dataOutputStream, double d15) throws IOException {
        double dFloor = Math.floor(d15);
        dataOutputStream.writeShort((int) dFloor);
        dataOutputStream.writeShort((int) ((d15 - dFloor) * 65536.0d));
    }

    private void x(DataOutputStream dataOutputStream, Calendar calendar) throws IOException {
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        calendar2.set(1904, 0, 1, 0, 0, 0);
        calendar2.set(14, 0);
        dataOutputStream.writeLong((calendar.getTimeInMillis() - calendar2.getTimeInMillis()) / 1000);
    }

    private void y(DataOutputStream dataOutputStream, short s15) throws IOException {
        dataOutputStream.writeShort(s15);
    }

    private void z(OutputStream outputStream, byte[] bArr) throws IOException {
        int length = bArr.length;
        outputStream.write(bArr);
        int i15 = length % 4;
        if (i15 != 0) {
            outputStream.write(f182669h, 0, 4 - i15);
        }
    }

    public void B(OutputStream outputStream) throws Throwable {
        Throwable th4;
        List<String> list;
        if (!this.f182674e.isEmpty()) {
            this.f182672c.isEmpty();
        }
        c();
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        try {
            long[] jArr = new long[this.f182674e.size() + 1];
            byte[] bArrF = f();
            byte[] bArrG = g();
            byte[] bArrJ = j();
            byte[] bArrK = k();
            byte[] bArrL = l();
            byte[] bArrE = e(jArr);
            byte[] bArrI = i(jArr);
            byte[] bArrD = d();
            byte[] bArrH = h();
            byte[] bArrM = m();
            TreeMap treeMap = new TreeMap();
            if (bArrL != null) {
                try {
                    treeMap.put("OS/2", bArrL);
                } catch (Throwable th5) {
                    th4 = th5;
                    dataOutputStream.close();
                    throw th4;
                }
            }
            if (bArrD != null) {
                treeMap.put("cmap", bArrD);
            }
            treeMap.put("glyf", bArrE);
            treeMap.put("head", bArrF);
            treeMap.put("hhea", bArrG);
            treeMap.put("hmtx", bArrH);
            treeMap.put("loca", bArrI);
            treeMap.put("maxp", bArrJ);
            if (bArrK != null) {
                treeMap.put("name", bArrK);
            }
            if (bArrM != null) {
                treeMap.put("post", bArrM);
            }
            for (Map.Entry<String, l0> entry : this.f182670a.u0().entrySet()) {
                String key = entry.getKey();
                l0 value = entry.getValue();
                if (!treeMap.containsKey(key) && ((list = this.f182673d) == null || list.contains(key))) {
                    treeMap.put(key, this.f182670a.t0(value));
                }
            }
            long jV = v(dataOutputStream, treeMap.size());
            long size = (((long) treeMap.size()) * 16) + 12;
            long jA = jV;
            long length = size;
            for (Map.Entry entry2 : treeMap.entrySet()) {
                try {
                    jA += A(dataOutputStream, (String) entry2.getKey(), length, (byte[]) entry2.getValue());
                    length += (long) (((((byte[]) entry2.getValue()).length + 3) / 4) * 4);
                } catch (Throwable th6) {
                    th = th6;
                    th4 = th;
                    dataOutputStream.close();
                    throw th4;
                }
            }
            long j15 = 2981146554L - (BodyPartID.bodyIdMax & jA);
            bArrF[8] = (byte) (j15 >>> 24);
            bArrF[9] = (byte) (j15 >>> 16);
            bArrF[10] = (byte) (j15 >>> 8);
            bArrF[11] = (byte) j15;
            Iterator it = treeMap.values().iterator();
            while (it.hasNext()) {
                z(dataOutputStream, (byte[]) it.next());
            }
            dataOutputStream.close();
        } catch (Throwable th7) {
            th = th7;
        }
    }

    public void a(int i15) {
        int iB = this.f182671b.b(i15);
        if (iB != 0) {
            this.f182672c.put(Integer.valueOf(i15), Integer.valueOf(iB));
            this.f182674e.add(Integer.valueOf(iB));
        }
    }

    public void b(Set<Integer> set) {
        Iterator<Integer> it = set.iterator();
        while (it.hasNext()) {
            a(it.next().intValue());
        }
    }

    public Map<Integer, Integer> o() throws IOException {
        c();
        HashMap map = new HashMap();
        int i15 = 0;
        for (Integer num : this.f182674e) {
            num.intValue();
            map.put(Integer.valueOf(i15), num);
            i15++;
        }
        return map;
    }

    public void r(String str) {
        this.f182675f = str;
    }
}
