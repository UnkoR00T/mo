package g9;

import ak.n0;
import android.util.Pair;
import android.util.SparseArray;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import l9.s;
import o8.f0;
import o8.k0;
import o8.l0;
import o8.m0;
import o8.o;
import o8.p;
import o8.q;
import o8.r;
import o8.s0;
import o8.t0;
import o8.u;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.x509.DisplayText;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import t7.l;
import t7.v;
import t7.w;
import t7.x;
import w7.c0;
import w7.o0;
import w7.t;

/* JADX INFO: loaded from: classes3.dex */
public class e implements p {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    @Deprecated
    public static final u f71282k0 = new u() { // from class: g9.d
        @Override // o8.u
        public final p[] f() {
            return e.h();
        }
    };

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private static final byte[] f71283l0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private static final byte[] f71284m0 = o0.p0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private static final byte[] f71285n0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private static final byte[] f71286o0 = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final UUID f71287p0 = new UUID(72057594037932032L, -9223371306706625679L);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private static final Map<String, Integer> f71288q0;
    private int A;
    private long B;
    private final SparseArray<List<c.a>> C;
    private boolean D;
    private long E;
    private int F;
    private long G;
    private long H;
    private int I;
    private boolean J;
    private long K;
    private long L;
    private long M;
    private boolean N;
    private int O;
    private long P;
    private long Q;
    private int R;
    private int S;
    private int[] T;
    private int U;
    private int V;
    private int W;
    private int X;
    private boolean Y;
    private long Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g9.c f71289a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private int f71290a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f71291b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f71292b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseArray<d> f71293c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private int f71294c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f71295d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private boolean f71296d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f71297e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private boolean f71298e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final s.a f71299f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private boolean f71300f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c0 f71301g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private int f71302g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c0 f71303h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private byte f71304h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final c0 f71305i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private boolean f71306i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final c0 f71307j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private r f71308j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final c0 f71309k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final c0 f71310l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final c0 f71311m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final c0 f71312n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final c0 f71313o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final c0 f71314p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ByteBuffer f71315q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f71316r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f71317s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f71318t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f71319u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f71320v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f71321w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f71322x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private d f71323y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f71324z;

    private final class b implements g9.b {
        private b() {
        }

        @Override // g9.b
        public void a(int i15) throws x {
            e.this.q(i15);
        }

        @Override // g9.b
        public void b(int i15, double d15) {
            e.this.t(i15, d15);
        }

        @Override // g9.b
        public void c(int i15, int i16, q qVar) throws x {
            e.this.o(i15, i16, qVar);
        }

        @Override // g9.b
        public void d(int i15, long j15) throws x {
            e.this.z(i15, j15);
        }

        @Override // g9.b
        public int e(int i15) {
            return e.this.w(i15);
        }

        @Override // g9.b
        public boolean f(int i15) {
            return e.this.B(i15);
        }

        @Override // g9.b
        public void g(int i15, String str) throws x {
            e.this.J(i15, str);
        }

        @Override // g9.b
        public void h(int i15, long j15, long j16) throws x {
            e.this.I(i15, j15, j16);
        }
    }

    private static final class c implements l0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o8.g f71326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SparseArray<List<a>> f71327b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long f71328c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f71329d;

        private static final class a implements Comparable<a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f71330a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final long f71331b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final long f71332c;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f71330a == aVar.f71330a && this.f71331b == aVar.f71331b && this.f71332c == aVar.f71332c;
            }

            public int hashCode() {
                return Objects.hash(Long.valueOf(this.f71330a), Long.valueOf(this.f71331b), Long.valueOf(this.f71332c));
            }

            @Override // java.lang.Comparable
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public int compareTo(a aVar) {
                return Long.compare(this.f71330a, aVar.f71330a);
            }

            private a(long j15, long j16, long j17) {
                this.f71330a = j15;
                this.f71331b = j16;
                this.f71332c = j17;
            }
        }

        public c(SparseArray<List<a>> sparseArray, long j15, int i15, long j16, long j17) {
            this.f71327b = sparseArray;
            this.f71328c = j15;
            this.f71329d = i15;
            this.f71326a = i(sparseArray, j15, i15, j16, j17);
        }

        private static o8.g i(SparseArray<List<a>> sparseArray, long j15, int i15, long j16, long j17) {
            int i16;
            List<a> list = sparseArray.get(i15);
            if (list == null || list.isEmpty()) {
                return null;
            }
            int size = list.size();
            int[] iArrCopyOf = new int[size];
            long[] jArrCopyOf = new long[size];
            long[] jArrCopyOf2 = new long[size];
            long[] jArrCopyOf3 = new long[size];
            int i17 = 0;
            for (int i18 = 0; i18 < size; i18++) {
                a aVar = list.get(i18);
                jArrCopyOf3[i18] = aVar.f71330a;
                jArrCopyOf[i18] = aVar.f71331b;
            }
            while (true) {
                i16 = size - 1;
                if (i17 >= i16) {
                    break;
                }
                int i19 = i17 + 1;
                iArrCopyOf[i17] = (int) (jArrCopyOf[i19] - jArrCopyOf[i17]);
                jArrCopyOf2[i17] = jArrCopyOf3[i19] - jArrCopyOf3[i17];
                i17 = i19;
            }
            int i25 = i16;
            while (i25 > 0 && jArrCopyOf3[i25] >= j15) {
                i25--;
            }
            iArrCopyOf[i25] = (int) ((j16 + j17) - jArrCopyOf[i25]);
            jArrCopyOf2[i25] = j15 - jArrCopyOf3[i25];
            if (i25 < i16) {
                t.h("MatroskaExtractor", "Discarding trailing cue points with timestamps greater than total duration.");
                int i26 = i25 + 1;
                iArrCopyOf = Arrays.copyOf(iArrCopyOf, i26);
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i26);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i26);
                jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i26);
            }
            return new o8.g(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
        }

        @Override // o8.l0
        public l0.a c(long j15) {
            o8.g gVar = this.f71326a;
            return gVar != null ? gVar.c(j15) : new l0.a(m0.f143157c);
        }

        @Override // o8.l0
        public boolean e() {
            return j(this.f71329d);
        }

        @Override // o8.l0
        public long h() {
            return this.f71328c;
        }

        public boolean j(int i15) {
            List<a> list = this.f71327b.get(i15);
            return (list == null || list.isEmpty()) ? false : true;
        }
    }

    protected static final class d {
        public byte[] P;
        public t0 V;
        public boolean X;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f71333a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public s0 f71334a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f71335b;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public t7.p f71336b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f71337c;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public int f71338c0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f71339d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f71340e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f71341f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f71342g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f71343h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f71344i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public byte[] f71345j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public s0.a f71346k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public byte[] f71347l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public l f71348m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f71349n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f71350o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f71351p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f71352q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f71353r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f71354s = 0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f71355t = -1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public float f71356u = 0.0f;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public float f71357v = 0.0f;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public float f71358w = 0.0f;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public byte[] f71359x = null;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f71360y = -1;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public boolean f71361z = false;
        public int A = -1;
        public int B = -1;
        public int C = -1;
        public int D = 1000;
        public int E = DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE;
        public float F = -1.0f;
        public float G = -1.0f;
        public float H = -1.0f;
        public float I = -1.0f;
        public float J = -1.0f;
        public float K = -1.0f;
        public float L = -1.0f;
        public float M = -1.0f;
        public float N = -1.0f;
        public float O = -1.0f;
        public int Q = 1;
        public int R = -1;
        public int S = 8000;
        public long T = 0;
        public long U = 0;
        public boolean W = false;
        public boolean Y = true;
        private String Z = "eng";

        protected d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g() {
            zj.p.q(this.f71334a0);
        }

        private static long h(List<c.a> list, long j15, long j16, long j17) {
            long j18;
            long j19;
            if (list.isEmpty()) {
                return -9223372036854775807L;
            }
            int iMin = Math.min(list.size(), 20);
            double d15 = 0.0d;
            int i15 = -1;
            for (int i16 = 0; i16 < iMin; i16++) {
                c.a aVar = list.get(i16);
                if (aVar.f71330a > 10000000) {
                    break;
                }
                if (i16 < list.size() - 1) {
                    c.a aVar2 = list.get(i16 + 1);
                    j18 = (aVar2.f71331b + aVar2.f71332c) - (aVar.f71331b + aVar.f71332c);
                    j19 = aVar2.f71330a - aVar.f71330a;
                } else {
                    j18 = (j16 + j17) - (aVar.f71331b + aVar.f71332c);
                    j19 = j15 - aVar.f71330a;
                }
                if (j19 > 0) {
                    double d16 = j18 / j19;
                    if (d16 > d15) {
                        i15 = i16;
                        d15 = d16;
                    }
                }
            }
            if (i15 == -1) {
                return -9223372036854775807L;
            }
            return list.get(i15).f71330a;
        }

        private byte[] i(String str) throws x {
            byte[] bArr = this.f71347l;
            if (bArr != null) {
                return bArr;
            }
            throw x.a("Missing CodecPrivate for codec " + str, null);
        }

        private byte[] j() {
            if (this.F == -1.0f || this.G == -1.0f || this.H == -1.0f || this.I == -1.0f || this.J == -1.0f || this.K == -1.0f || this.L == -1.0f || this.M == -1.0f || this.N == -1.0f || this.O == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.F * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.G * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.H * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.I * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.J * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.K * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.L * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.M * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.N + 0.5f));
            byteBufferOrder.putShort((short) (this.O + 0.5f));
            byteBufferOrder.putShort((short) this.D);
            byteBufferOrder.putShort((short) this.E);
            return bArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void l(SparseArray<List<c.a>> sparseArray, long j15, long j16, long j17) {
            List<c.a> list;
            if (this.f71340e != 2 || (list = sparseArray.get(this.f71339d)) == null || list.isEmpty()) {
                return;
            }
            long jH = h(list, j15, j16, j17);
            if (jH != -9223372036854775807L) {
                v vVar = ((t7.p) zj.p.q(this.f71336b0)).f188377l;
                x8.e eVar = new x8.e(jH);
                this.f71336b0 = this.f71336b0.b().s0(vVar == null ? new v(eVar) : vVar.a(eVar)).Q();
            }
        }

        private static Pair<String, List<byte[]>> n(c0 c0Var) throws x {
            try {
                c0Var.g0(16);
                long jG = c0Var.G();
                if (jG == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (jG == 859189832) {
                    return new Pair<>("video/3gpp", null);
                }
                if (jG != 826496599) {
                    t.h("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair<>("video/x-unknown", null);
                }
                byte[] bArrF = c0Var.f();
                for (int iG = c0Var.g() + 20; iG < bArrF.length - 4; iG++) {
                    if (bArrF[iG] == 0 && bArrF[iG + 1] == 0 && bArrF[iG + 2] == 1 && bArrF[iG + 3] == 15) {
                        return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrF, iG, bArrF.length)));
                    }
                }
                throw x.a("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw x.a("Error parsing FourCC private data", null);
            }
        }

        private static boolean o(c0 c0Var) throws x {
            try {
                int I = c0Var.I();
                if (I == 1) {
                    return true;
                }
                if (I == 65534) {
                    c0Var.f0(24);
                    if (c0Var.J() == e.f71287p0.getMostSignificantBits() && c0Var.J() == e.f71287p0.getLeastSignificantBits()) {
                        return true;
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw x.a("Error parsing MS/ACM codec private", null);
            }
        }

        private static List<byte[]> p(byte[] bArr) throws x {
            int i15;
            int i16;
            try {
                if (bArr[0] != 2) {
                    throw x.a("Error parsing vorbis codec private", null);
                }
                int i17 = 0;
                int i18 = 1;
                while (true) {
                    i15 = bArr[i18];
                    if ((i15 & GF2Field.MASK) != 255) {
                        break;
                    }
                    i17 += GF2Field.MASK;
                    i18++;
                }
                int i19 = i18 + 1;
                int i25 = i17 + (i15 & GF2Field.MASK);
                int i26 = 0;
                while (true) {
                    i16 = bArr[i19];
                    if ((i16 & GF2Field.MASK) != 255) {
                        break;
                    }
                    i26 += GF2Field.MASK;
                    i19++;
                }
                int i27 = i19 + 1;
                int i28 = i26 + (i16 & GF2Field.MASK);
                if (bArr[i27] != 1) {
                    throw x.a("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i25];
                System.arraycopy(bArr, i27, bArr2, 0, i25);
                int i29 = i27 + i25;
                if (bArr[i29] != 3) {
                    throw x.a("Error parsing vorbis codec private", null);
                }
                int i35 = i29 + i28;
                if (bArr[i35] != 5) {
                    throw x.a("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i35];
                System.arraycopy(bArr, i35, bArr3, 0, bArr.length - i35);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw x.a("Error parsing vorbis codec private", null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean r(boolean z15) {
            if ("A_OPUS".equals(this.f71337c)) {
                return z15;
            }
            return this.f71342g > 0;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:224:0x0455  */
        /* JADX WARN: Code duplicated, block: B:229:0x046e  */
        /* JADX WARN: Code duplicated, block: B:230:0x0471  */
        /* JADX WARN: Code duplicated, block: B:233:0x0480  */
        /* JADX WARN: Code duplicated, block: B:234:0x0491  */
        /* JADX WARN: Code duplicated, block: B:236:0x0497  */
        /* JADX WARN: Code duplicated, block: B:238:0x049b  */
        /* JADX WARN: Code duplicated, block: B:240:0x04a0  */
        /* JADX WARN: Code duplicated, block: B:243:0x04a8  */
        /* JADX WARN: Code duplicated, block: B:245:0x04ad  */
        /* JADX WARN: Code duplicated, block: B:248:0x04b2  */
        /* JADX WARN: Code duplicated, block: B:251:0x04c0  */
        /* JADX WARN: Code duplicated, block: B:254:0x04c6  */
        /* JADX WARN: Code duplicated, block: B:257:0x04f9  */
        /* JADX WARN: Code duplicated, block: B:260:0x0516  */
        /* JADX WARN: Code duplicated, block: B:263:0x051b  */
        /* JADX WARN: Code duplicated, block: B:282:0x0568  */
        /* JADX WARN: Code duplicated, block: B:284:0x058d  */
        /* JADX WARN: Code duplicated, block: B:286:0x0593  */
        /* JADX WARN: Code duplicated, block: B:301:0x05bd  */
        /* JADX WARN: Code duplicated, block: B:306:0x05d8  */
        /* JADX WARN: Code duplicated, block: B:307:0x05db  */
        /* JADX WARN: Code duplicated, block: B:4:0x0015  */
        public void k(int i15) throws x {
            byte b15;
            int i16;
            List<byte[]> listSingletonList;
            int i17;
            String str;
            int i18;
            List<byte[]> list;
            String str2;
            String str3;
            int i19;
            t7.p.b bVar;
            int i25;
            int i26;
            float f15;
            int iIntValue;
            int i27;
            int i28;
            int i29;
            int i35;
            String str4;
            x7.a aVarA;
            String str5 = this.f71337c;
            str5.getClass();
            int iD0 = 3;
            switch (str5) {
                case "V_MPEG4/ISO/AP":
                    b15 = 0;
                    break;
                case "V_MPEG4/ISO/SP":
                    b15 = 1;
                    break;
                case "A_MS/ACM":
                    b15 = 2;
                    break;
                case "A_TRUEHD":
                    b15 = 3;
                    break;
                case "A_VORBIS":
                    b15 = 4;
                    break;
                case "A_MPEG/L2":
                    b15 = 5;
                    break;
                case "A_MPEG/L3":
                    b15 = 6;
                    break;
                case "V_MS/VFW/FOURCC":
                    b15 = 7;
                    break;
                case "S_DVBSUB":
                    b15 = 8;
                    break;
                case "V_MPEG4/ISO/ASP":
                    b15 = 9;
                    break;
                case "V_MPEG4/ISO/AVC":
                    b15 = 10;
                    break;
                case "S_VOBSUB":
                    b15 = 11;
                    break;
                case "A_DTS/LOSSLESS":
                    b15 = 12;
                    break;
                case "A_AAC":
                    b15 = 13;
                    break;
                case "A_AC3":
                    b15 = 14;
                    break;
                case "A_DTS":
                    b15 = 15;
                    break;
                case "V_AV1":
                    b15 = 16;
                    break;
                case "V_VP8":
                    b15 = 17;
                    break;
                case "V_VP9":
                    b15 = 18;
                    break;
                case "S_HDMV/PGS":
                    b15 = 19;
                    break;
                case "V_THEORA":
                    b15 = 20;
                    break;
                case "A_DTS/EXPRESS":
                    b15 = 21;
                    break;
                case "A_PCM/FLOAT/IEEE":
                    b15 = 22;
                    break;
                case "A_PCM/INT/BIG":
                    b15 = 23;
                    break;
                case "A_PCM/INT/LIT":
                    b15 = 24;
                    break;
                case "S_TEXT/ASS":
                    b15 = 25;
                    break;
                case "S_TEXT/SSA":
                    b15 = 26;
                    break;
                case "V_MPEGH/ISO/HEVC":
                    b15 = 27;
                    break;
                case "S_TEXT/WEBVTT":
                    b15 = 28;
                    break;
                case "S_TEXT/UTF8":
                    b15 = 29;
                    break;
                case "V_MPEG2":
                    b15 = 30;
                    break;
                case "A_EAC3":
                    b15 = 31;
                    break;
                case "A_FLAC":
                    b15 = 32;
                    break;
                case "A_OPUS":
                    b15 = 33;
                    break;
                default:
                    b15 = -1;
                    break;
            }
            String str6 = "audio/raw";
            switch (b15) {
                case 0:
                case 1:
                case 9:
                    i16 = 0;
                    byte[] bArr = this.f71347l;
                    listSingletonList = bArr == null ? null : Collections.singletonList(bArr);
                    str6 = "video/mp4v-es";
                    str = null;
                    i18 = -1;
                    i17 = -1;
                    if (this.P != null && (aVarA = x7.a.a(new c0(this.P))) != null) {
                        str = aVarA.f217144c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z15 = this.Y;
                    if (this.X) {
                        i19 = 2;
                    } else {
                        i19 = i16;
                    }
                    int i36 = (z15 ? 1 : 0) | i19;
                    bVar = new t7.p.b();
                    if (w.h(str3)) {
                        bVar.U(this.Q).B0(this.S).t0(i17);
                    } else if (w.k(str3)) {
                        if (this.f71354s == 0) {
                            i29 = this.f71352q;
                            i25 = -1;
                            if (i29 == -1) {
                                i29 = this.f71349n;
                            }
                            this.f71352q = i29;
                            i35 = this.f71353r;
                            if (i35 == -1) {
                                i35 = this.f71350o;
                            }
                            this.f71353r = i35;
                        } else {
                            i25 = -1;
                        }
                        i26 = this.f71352q;
                        if (i26 != i25 || (i28 = this.f71353r) == i25) {
                            f15 = -1.0f;
                        } else {
                            f15 = (this.f71350o * i26) / (this.f71349n * i28);
                        }
                        t7.g gVarA = this.f71361z ? new t7.g.b().d(this.A).c(this.C).e(this.B).f(j()).g(this.f71351p).b(this.f71351p).a() : null;
                        if (this.f71335b == null && e.f71288q0.containsKey(this.f71335b)) {
                            iIntValue = ((Integer) e.f71288q0.get(this.f71335b)).intValue();
                        } else {
                            iIntValue = i25;
                        }
                        if (this.f71355t == 0 || Float.compare(this.f71356u, 0.0f) != 0 || Float.compare(this.f71357v, 0.0f) != 0) {
                            i27 = iIntValue;
                        } else if (Float.compare(this.f71358w, 0.0f) == 0) {
                            i27 = i16;
                        } else if (Float.compare(this.f71358w, 90.0f) == 0) {
                            i27 = 90;
                        } else if (Float.compare(this.f71358w, -180.0f) == 0 || Float.compare(this.f71358w, 180.0f) == 0) {
                            i27 = 180;
                        } else if (Float.compare(this.f71358w, -90.0f) == 0) {
                            i27 = 270;
                        } else {
                            i27 = iIntValue;
                        }
                        bVar.F0(this.f71349n).i0(this.f71350o).v0(f15).z0(i27).x0(this.f71359x).D0(this.f71360y).W(gVarA);
                    } else if (!"application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !"text/vtt".equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                        throw x.a("Unexpected MIME type.", null);
                    }
                    if (this.f71335b != null && !e.f71288q0.containsKey(this.f71335b)) {
                        bVar.m0(this.f71335b);
                    }
                    t7.p.b bVarJ0 = bVar.j0(i15);
                    if (this.f71333a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    this.f71336b0 = bVarJ0.X(str4).A0(str3).p0(i18).o0(this.Z).C0(i36).l0(listSingletonList).V(str).d0(this.f71348m).Q();
                    return;
                case 2:
                    i16 = 0;
                    if (o(new c0(i(this.f71337c)))) {
                        int iD1 = o0.d0(this.R);
                        if (iD1 == 0) {
                            t.h("MatroskaExtractor", "Unsupported PCM bit depth: " + this.R + ". Setting mimeType to audio/x-unknown");
                        } else {
                            i17 = iD1;
                            listSingletonList = null;
                            str = null;
                            i18 = -1;
                        }
                        if (this.P != null) {
                            str = aVarA.f217144c;
                            str6 = "video/dolby-vision";
                        }
                        str3 = str6;
                        boolean z16 = this.Y;
                        if (this.X) {
                            i19 = 2;
                        } else {
                            i19 = i16;
                        }
                        int i37 = (z16 ? 1 : 0) | i19;
                        bVar = new t7.p.b();
                        if (w.h(str3)) {
                            bVar.U(this.Q).B0(this.S).t0(i17);
                        } else if (w.k(str3)) {
                            if (this.f71354s == 0) {
                                i29 = this.f71352q;
                                i25 = -1;
                                if (i29 == -1) {
                                    i29 = this.f71349n;
                                }
                                this.f71352q = i29;
                                i35 = this.f71353r;
                                if (i35 == -1) {
                                    i35 = this.f71350o;
                                }
                                this.f71353r = i35;
                            } else {
                                i25 = -1;
                            }
                            i26 = this.f71352q;
                            if (i26 != i25) {
                                f15 = -1.0f;
                            } else {
                                f15 = -1.0f;
                            }
                            if (this.f71361z) {
                            }
                            if (this.f71335b == null) {
                                iIntValue = i25;
                            } else {
                                iIntValue = i25;
                            }
                            if (this.f71355t == 0) {
                                i27 = iIntValue;
                            } else {
                                i27 = iIntValue;
                            }
                            bVar.F0(this.f71349n).i0(this.f71350o).v0(f15).z0(i27).x0(this.f71359x).D0(this.f71360y).W(gVarA);
                        } else if (!"application/x-subrip".equals(str3)) {
                            throw x.a("Unexpected MIME type.", null);
                        }
                        if (this.f71335b != null) {
                            bVar.m0(this.f71335b);
                        }
                        t7.p.b bVarJ1 = bVar.j0(i15);
                        if (this.f71333a) {
                            str4 = "video/webm";
                        } else {
                            str4 = "video/x-matroska";
                        }
                        this.f71336b0 = bVarJ1.X(str4).A0(str3).p0(i18).o0(this.Z).C0(i37).l0(listSingletonList).V(str).d0(this.f71348m).Q();
                        return;
                    }
                    t.h("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                    str6 = "audio/x-unknown";
                    listSingletonList = null;
                    str = null;
                    i18 = -1;
                    i17 = -1;
                    if (this.P != null) {
                        str = aVarA.f217144c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z17 = this.Y;
                    if (this.X) {
                        i19 = 2;
                    } else {
                        i19 = i16;
                    }
                    int i38 = (z17 ? 1 : 0) | i19;
                    bVar = new t7.p.b();
                    if (w.h(str3)) {
                        bVar.U(this.Q).B0(this.S).t0(i17);
                    } else if (w.k(str3)) {
                        if (this.f71354s == 0) {
                            i29 = this.f71352q;
                            i25 = -1;
                            if (i29 == -1) {
                                i29 = this.f71349n;
                            }
                            this.f71352q = i29;
                            i35 = this.f71353r;
                            if (i35 == -1) {
                                i35 = this.f71350o;
                            }
                            this.f71353r = i35;
                        } else {
                            i25 = -1;
                        }
                        i26 = this.f71352q;
                        if (i26 != i25) {
                            f15 = -1.0f;
                        } else {
                            f15 = -1.0f;
                        }
                        if (this.f71361z) {
                        }
                        if (this.f71335b == null) {
                            iIntValue = i25;
                        } else {
                            iIntValue = i25;
                        }
                        if (this.f71355t == 0) {
                            i27 = iIntValue;
                        } else {
                            i27 = iIntValue;
                        }
                        bVar.F0(this.f71349n).i0(this.f71350o).v0(f15).z0(i27).x0(this.f71359x).D0(this.f71360y).W(gVarA);
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw x.a("Unexpected MIME type.", null);
                    }
                    if (this.f71335b != null) {
                        bVar.m0(this.f71335b);
                    }
                    t7.p.b bVarJ2 = bVar.j0(i15);
                    if (this.f71333a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    this.f71336b0 = bVarJ2.X(str4).A0(str3).p0(i18).o0(this.Z).C0(i38).l0(listSingletonList).V(str).d0(this.f71348m).Q();
                    return;
                case 3:
                    i16 = 0;
                    this.V = new t0();
                    str6 = "audio/true-hd";
                    listSingletonList = null;
                    str = null;
                    i18 = -1;
                    i17 = -1;
                    if (this.P != null) {
                        str = aVarA.f217144c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z18 = this.Y;
                    if (this.X) {
                        i19 = 2;
                    } else {
                        i19 = i16;
                    }
                    int i39 = (z18 ? 1 : 0) | i19;
                    bVar = new t7.p.b();
                    if (w.h(str3)) {
                        bVar.U(this.Q).B0(this.S).t0(i17);
                    } else if (w.k(str3)) {
                        if (this.f71354s == 0) {
                            i29 = this.f71352q;
                            i25 = -1;
                            if (i29 == -1) {
                                i29 = this.f71349n;
                            }
                            this.f71352q = i29;
                            i35 = this.f71353r;
                            if (i35 == -1) {
                                i35 = this.f71350o;
                            }
                            this.f71353r = i35;
                        } else {
                            i25 = -1;
                        }
                        i26 = this.f71352q;
                        if (i26 != i25) {
                            f15 = -1.0f;
                        } else {
                            f15 = -1.0f;
                        }
                        if (this.f71361z) {
                        }
                        if (this.f71335b == null) {
                            iIntValue = i25;
                        } else {
                            iIntValue = i25;
                        }
                        if (this.f71355t == 0) {
                            i27 = iIntValue;
                        } else {
                            i27 = iIntValue;
                        }
                        bVar.F0(this.f71349n).i0(this.f71350o).v0(f15).z0(i27).x0(this.f71359x).D0(this.f71360y).W(gVarA);
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw x.a("Unexpected MIME type.", null);
                    }
                    if (this.f71335b != null) {
                        bVar.m0(this.f71335b);
                    }
                    t7.p.b bVarJ3 = bVar.j0(i15);
                    if (this.f71333a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    this.f71336b0 = bVarJ3.X(str4).A0(str3).p0(i18).o0(this.Z).C0(i39).l0(listSingletonList).V(str).d0(this.f71348m).Q();
                    return;
                case 4:
                    i16 = 0;
                    listSingletonList = p(i(this.f71337c));
                    str6 = "audio/vorbis";
                    i18 = 8192;
                    str = null;
                    i17 = -1;
                    if (this.P != null) {
                        str = aVarA.f217144c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z19 = this.Y;
                    if (this.X) {
                        i19 = 2;
                    } else {
                        i19 = i16;
                    }
                    int i310 = (z19 ? 1 : 0) | i19;
                    bVar = new t7.p.b();
                    if (w.h(str3)) {
                        bVar.U(this.Q).B0(this.S).t0(i17);
                    } else if (w.k(str3)) {
                        if (this.f71354s == 0) {
                            i29 = this.f71352q;
                            i25 = -1;
                            if (i29 == -1) {
                                i29 = this.f71349n;
                            }
                            this.f71352q = i29;
                            i35 = this.f71353r;
                            if (i35 == -1) {
                                i35 = this.f71350o;
                            }
                            this.f71353r = i35;
                        } else {
                            i25 = -1;
                        }
                        i26 = this.f71352q;
                        if (i26 != i25) {
                            f15 = -1.0f;
                        } else {
                            f15 = -1.0f;
                        }
                        if (this.f71361z) {
                        }
                        if (this.f71335b == null) {
                            iIntValue = i25;
                        } else {
                            iIntValue = i25;
                        }
                        if (this.f71355t == 0) {
                            i27 = iIntValue;
                        } else {
                            i27 = iIntValue;
                        }
                        bVar.F0(this.f71349n).i0(this.f71350o).v0(f15).z0(i27).x0(this.f71359x).D0(this.f71360y).W(gVarA);
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw x.a("Unexpected MIME type.", null);
                    }
                    if (this.f71335b != null) {
                        bVar.m0(this.f71335b);
                    }
                    t7.p.b bVarJ4 = bVar.j0(i15);
                    if (this.f71333a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    this.f71336b0 = bVarJ4.X(str4).A0(str3).p0(i18).o0(this.Z).C0(i310).l0(listSingletonList).V(str).d0(this.f71348m).Q();
                    return;
                case 5:
                    i16 = 0;
                    str6 = "audio/mpeg-L2";
                    listSingletonList = null;
                    str = null;
                    i18 = PKIFailureInfo.certConfirmed;
                    i17 = -1;
                    if (this.P != null) {
                        str = aVarA.f217144c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z110 = this.Y;
                    if (this.X) {
                        i19 = 2;
                    } else {
                        i19 = i16;
                    }
                    int i311 = (z110 ? 1 : 0) | i19;
                    bVar = new t7.p.b();
                    if (w.h(str3)) {
                        bVar.U(this.Q).B0(this.S).t0(i17);
                    } else if (w.k(str3)) {
                        if (this.f71354s == 0) {
                            i29 = this.f71352q;
                            i25 = -1;
                            if (i29 == -1) {
                                i29 = this.f71349n;
                            }
                            this.f71352q = i29;
                            i35 = this.f71353r;
                            if (i35 == -1) {
                                i35 = this.f71350o;
                            }
                            this.f71353r = i35;
                        } else {
                            i25 = -1;
                        }
                        i26 = this.f71352q;
                        if (i26 != i25) {
                            f15 = -1.0f;
                        } else {
                            f15 = -1.0f;
                        }
                        if (this.f71361z) {
                        }
                        if (this.f71335b == null) {
                            iIntValue = i25;
                        } else {
                            iIntValue = i25;
                        }
                        if (this.f71355t == 0) {
                            i27 = iIntValue;
                        } else {
                            i27 = iIntValue;
                        }
                        bVar.F0(this.f71349n).i0(this.f71350o).v0(f15).z0(i27).x0(this.f71359x).D0(this.f71360y).W(gVarA);
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw x.a("Unexpected MIME type.", null);
                    }
                    if (this.f71335b != null) {
                        bVar.m0(this.f71335b);
                    }
                    t7.p.b bVarJ5 = bVar.j0(i15);
                    if (this.f71333a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    this.f71336b0 = bVarJ5.X(str4).A0(str3).p0(i18).o0(this.Z).C0(i311).l0(listSingletonList).V(str).d0(this.f71348m).Q();
                    return;
                case 6:
                    i16 = 0;
                    str6 = "audio/mpeg";
                    listSingletonList = null;
                    str = null;
                    i18 = PKIFailureInfo.certConfirmed;
                    i17 = -1;
                    if (this.P != null) {
                        str = aVarA.f217144c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z111 = this.Y;
                    if (this.X) {
                        i19 = 2;
                    } else {
                        i19 = i16;
                    }
                    int i312 = (z111 ? 1 : 0) | i19;
                    bVar = new t7.p.b();
                    if (w.h(str3)) {
                        bVar.U(this.Q).B0(this.S).t0(i17);
                    } else if (w.k(str3)) {
                        if (this.f71354s == 0) {
                            i29 = this.f71352q;
                            i25 = -1;
                            if (i29 == -1) {
                                i29 = this.f71349n;
                            }
                            this.f71352q = i29;
                            i35 = this.f71353r;
                            if (i35 == -1) {
                                i35 = this.f71350o;
                            }
                            this.f71353r = i35;
                        } else {
                            i25 = -1;
                        }
                        i26 = this.f71352q;
                        if (i26 != i25) {
                            f15 = -1.0f;
                        } else {
                            f15 = -1.0f;
                        }
                        if (this.f71361z) {
                        }
                        if (this.f71335b == null) {
                            iIntValue = i25;
                        } else {
                            iIntValue = i25;
                        }
                        if (this.f71355t == 0) {
                            i27 = iIntValue;
                        } else {
                            i27 = iIntValue;
                        }
                        bVar.F0(this.f71349n).i0(this.f71350o).v0(f15).z0(i27).x0(this.f71359x).D0(this.f71360y).W(gVarA);
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw x.a("Unexpected MIME type.", null);
                    }
                    if (this.f71335b != null) {
                        bVar.m0(this.f71335b);
                    }
                    t7.p.b bVarJ6 = bVar.j0(i15);
                    if (this.f71333a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    this.f71336b0 = bVarJ6.X(str4).A0(str3).p0(i18).o0(this.Z).C0(i312).l0(listSingletonList).V(str).d0(this.f71348m).Q();
                    return;
                case 7:
                    i16 = 0;
                    Pair<String, List<byte[]>> pairN = n(new c0(i(this.f71337c)));
                    str6 = (String) pairN.first;
                    listSingletonList = (List) pairN.second;
                    str = null;
                    i18 = -1;
                    i17 = -1;
                    if (this.P != null) {
                        str = aVarA.f217144c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z112 = this.Y;
                    if (this.X) {
                        i19 = 2;
                    } else {
                        i19 = i16;
                    }
                    int i313 = (z112 ? 1 : 0) | i19;
                    bVar = new t7.p.b();
                    if (w.h(str3)) {
                        bVar.U(this.Q).B0(this.S).t0(i17);
                    } else if (w.k(str3)) {
                        if (this.f71354s == 0) {
                            i29 = this.f71352q;
                            i25 = -1;
                            if (i29 == -1) {
                                i29 = this.f71349n;
                            }
                            this.f71352q = i29;
                            i35 = this.f71353r;
                            if (i35 == -1) {
                                i35 = this.f71350o;
                            }
                            this.f71353r = i35;
                        } else {
                            i25 = -1;
                        }
                        i26 = this.f71352q;
                        if (i26 != i25) {
                            f15 = -1.0f;
                        } else {
                            f15 = -1.0f;
                        }
                        if (this.f71361z) {
                        }
                        if (this.f71335b == null) {
                            iIntValue = i25;
                        } else {
                            iIntValue = i25;
                        }
                        if (this.f71355t == 0) {
                            i27 = iIntValue;
                        } else {
                            i27 = iIntValue;
                        }
                        bVar.F0(this.f71349n).i0(this.f71350o).v0(f15).z0(i27).x0(this.f71359x).D0(this.f71360y).W(gVarA);
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw x.a("Unexpected MIME type.", null);
                    }
                    if (this.f71335b != null) {
                        bVar.m0(this.f71335b);
                    }
                    t7.p.b bVarJ7 = bVar.j0(i15);
                    if (this.f71333a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    this.f71336b0 = bVarJ7.X(str4).A0(str3).p0(i18).o0(this.Z).C0(i313).l0(listSingletonList).V(str).d0(this.f71348m).Q();
                    return;
                case 8:
                    byte[] bArr2 = new byte[4];
                    i16 = 0;
                    System.arraycopy(i(this.f71337c), 0, bArr2, 0, 4);
                    listSingletonList = n0.E(bArr2);
                    str = null;
                    str6 = "application/dvbsubs";
                    i18 = -1;
                    i17 = -1;
                    if (this.P != null) {
                        str = aVarA.f217144c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z113 = this.Y;
                    if (this.X) {
                        i19 = 2;
                    } else {
                        i19 = i16;
                    }
                    int i314 = (z113 ? 1 : 0) | i19;
                    bVar = new t7.p.b();
                    if (w.h(str3)) {
                        bVar.U(this.Q).B0(this.S).t0(i17);
                    } else if (w.k(str3)) {
                        if (this.f71354s == 0) {
                            i29 = this.f71352q;
                            i25 = -1;
                            if (i29 == -1) {
                                i29 = this.f71349n;
                            }
                            this.f71352q = i29;
                            i35 = this.f71353r;
                            if (i35 == -1) {
                                i35 = this.f71350o;
                            }
                            this.f71353r = i35;
                        } else {
                            i25 = -1;
                        }
                        i26 = this.f71352q;
                        if (i26 != i25) {
                            f15 = -1.0f;
                        } else {
                            f15 = -1.0f;
                        }
                        if (this.f71361z) {
                        }
                        if (this.f71335b == null) {
                            iIntValue = i25;
                        } else {
                            iIntValue = i25;
                        }
                        if (this.f71355t == 0) {
                            i27 = iIntValue;
                        } else {
                            i27 = iIntValue;
                        }
                        bVar.F0(this.f71349n).i0(this.f71350o).v0(f15).z0(i27).x0(this.f71359x).D0(this.f71360y).W(gVarA);
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw x.a("Unexpected MIME type.", null);
                    }
                    if (this.f71335b != null) {
                        bVar.m0(this.f71335b);
                    }
                    t7.p.b bVarJ8 = bVar.j0(i15);
                    if (this.f71333a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    this.f71336b0 = bVarJ8.X(str4).A0(str3).p0(i18).o0(this.Z).C0(i314).l0(listSingletonList).V(str).d0(this.f71348m).Q();
                    return;
                case 10:
                    o8.d dVarB = o8.d.b(new c0(i(this.f71337c)));
                    list = dVarB.f143033a;
                    this.f71338c0 = dVarB.f143034b;
                    str2 = dVarB.f143044l;
                    str6 = "video/avc";
                    List<byte[]> list2 = list;
                    str = str2;
                    listSingletonList = list2;
                    i18 = -1;
                    i17 = -1;
                    i16 = 0;
                    if (this.P != null) {
                        str = aVarA.f217144c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z114 = this.Y;
                    if (this.X) {
                        i19 = 2;
                    } else {
                        i19 = i16;
                    }
                    int i315 = (z114 ? 1 : 0) | i19;
                    bVar = new t7.p.b();
                    if (w.h(str3)) {
                        bVar.U(this.Q).B0(this.S).t0(i17);
                    } else if (w.k(str3)) {
                        if (this.f71354s == 0) {
                            i29 = this.f71352q;
                            i25 = -1;
                            if (i29 == -1) {
                                i29 = this.f71349n;
                            }
                            this.f71352q = i29;
                            i35 = this.f71353r;
                            if (i35 == -1) {
                                i35 = this.f71350o;
                            }
                            this.f71353r = i35;
                        } else {
                            i25 = -1;
                        }
                        i26 = this.f71352q;
                        if (i26 != i25) {
                            f15 = -1.0f;
                        } else {
                            f15 = -1.0f;
                        }
                        if (this.f71361z) {
                        }
                        if (this.f71335b == null) {
                            iIntValue = i25;
                        } else {
                            iIntValue = i25;
                        }
                        if (this.f71355t == 0) {
                            i27 = iIntValue;
                        } else {
                            i27 = iIntValue;
                        }
                        bVar.F0(this.f71349n).i0(this.f71350o).v0(f15).z0(i27).x0(this.f71359x).D0(this.f71360y).W(gVarA);
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw x.a("Unexpected MIME type.", null);
                    }
                    if (this.f71335b != null) {
                        bVar.m0(this.f71335b);
                    }
                    t7.p.b bVarJ9 = bVar.j0(i15);
                    if (this.f71333a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    this.f71336b0 = bVarJ9.X(str4).A0(str3).p0(i18).o0(this.Z).C0(i315).l0(listSingletonList).V(str).d0(this.f71348m).Q();
                    return;
                case 11:
                    listSingletonList = n0.E(i(this.f71337c));
                    str = null;
                    str6 = "application/vobsub";
                    i18 = -1;
                    i17 = -1;
                    i16 = 0;
                    if (this.P != null) {
                        str = aVarA.f217144c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z115 = this.Y;
                    if (this.X) {
                        i19 = 2;
                    } else {
                        i19 = i16;
                    }
                    int i316 = (z115 ? 1 : 0) | i19;
                    bVar = new t7.p.b();
                    if (w.h(str3)) {
                        bVar.U(this.Q).B0(this.S).t0(i17);
                    } else if (w.k(str3)) {
                        if (this.f71354s == 0) {
                            i29 = this.f71352q;
                            i25 = -1;
                            if (i29 == -1) {
                                i29 = this.f71349n;
                            }
                            this.f71352q = i29;
                            i35 = this.f71353r;
                            if (i35 == -1) {
                                i35 = this.f71350o;
                            }
                            this.f71353r = i35;
                        } else {
                            i25 = -1;
                        }
                        i26 = this.f71352q;
                        if (i26 != i25) {
                            f15 = -1.0f;
                        } else {
                            f15 = -1.0f;
                        }
                        if (this.f71361z) {
                        }
                        if (this.f71335b == null) {
                            iIntValue = i25;
                        } else {
                            iIntValue = i25;
                        }
                        if (this.f71355t == 0) {
                            i27 = iIntValue;
                        } else {
                            i27 = iIntValue;
                        }
                        bVar.F0(this.f71349n).i0(this.f71350o).v0(f15).z0(i27).x0(this.f71359x).D0(this.f71360y).W(gVarA);
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw x.a("Unexpected MIME type.", null);
                    }
                    if (this.f71335b != null) {
                        bVar.m0(this.f71335b);
                    }
                    t7.p.b bVarJ10 = bVar.j0(i15);
                    if (this.f71333a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    this.f71336b0 = bVarJ10.X(str4).A0(str3).p0(i18).o0(this.Z).C0(i316).l0(listSingletonList).V(str).d0(this.f71348m).Q();
                    return;
                case 12:
                    str6 = "audio/vnd.dts.hd";
                    listSingletonList = null;
                    str = null;
                    i18 = -1;
                    i17 = -1;
                    i16 = 0;
                    if (this.P != null) {
                        str = aVarA.f217144c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z116 = this.Y;
                    if (this.X) {
                        i19 = 2;
                    } else {
                        i19 = i16;
                    }
                    int i317 = (z116 ? 1 : 0) | i19;
                    bVar = new t7.p.b();
                    if (w.h(str3)) {
                        bVar.U(this.Q).B0(this.S).t0(i17);
                    } else if (w.k(str3)) {
                        if (this.f71354s == 0) {
                            i29 = this.f71352q;
                            i25 = -1;
                            if (i29 == -1) {
                                i29 = this.f71349n;
                            }
                            this.f71352q = i29;
                            i35 = this.f71353r;
                            if (i35 == -1) {
                                i35 = this.f71350o;
                            }
                            this.f71353r = i35;
                        } else {
                            i25 = -1;
                        }
                        i26 = this.f71352q;
                        if (i26 != i25) {
                            f15 = -1.0f;
                        } else {
                            f15 = -1.0f;
                        }
                        if (this.f71361z) {
                        }
                        if (this.f71335b == null) {
                            iIntValue = i25;
                        } else {
                            iIntValue = i25;
                        }
                        if (this.f71355t == 0) {
                            i27 = iIntValue;
                        } else {
                            i27 = iIntValue;
                        }
                        bVar.F0(this.f71349n).i0(this.f71350o).v0(f15).z0(i27).x0(this.f71359x).D0(this.f71360y).W(gVarA);
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw x.a("Unexpected MIME type.", null);
                    }
                    if (this.f71335b != null) {
                        bVar.m0(this.f71335b);
                    }
                    t7.p.b bVarJ11 = bVar.j0(i15);
                    if (this.f71333a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    this.f71336b0 = bVarJ11.X(str4).A0(str3).p0(i18).o0(this.Z).C0(i317).l0(listSingletonList).V(str).d0(this.f71348m).Q();
                    return;
                case 13:
                    listSingletonList = Collections.singletonList(i(this.f71337c));
                    o8.a.b bVarE = o8.a.e(this.f71347l);
                    this.S = bVarE.f143002a;
                    this.Q = bVarE.f143003b;
                    str = bVarE.f143004c;
                    str6 = "audio/mp4a-latm";
                    i18 = -1;
                    i17 = -1;
                    i16 = 0;
                    if (this.P != null) {
                        str = aVarA.f217144c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z117 = this.Y;
                    if (this.X) {
                        i19 = 2;
                    } else {
                        i19 = i16;
                    }
                    int i318 = (z117 ? 1 : 0) | i19;
                    bVar = new t7.p.b();
                    if (w.h(str3)) {
                        bVar.U(this.Q).B0(this.S).t0(i17);
                    } else if (w.k(str3)) {
                        if (this.f71354s == 0) {
                            i29 = this.f71352q;
                            i25 = -1;
                            if (i29 == -1) {
                                i29 = this.f71349n;
                            }
                            this.f71352q = i29;
                            i35 = this.f71353r;
                            if (i35 == -1) {
                                i35 = this.f71350o;
                            }
                            this.f71353r = i35;
                        } else {
                            i25 = -1;
                        }
                        i26 = this.f71352q;
                        if (i26 != i25) {
                            f15 = -1.0f;
                        } else {
                            f15 = -1.0f;
                        }
                        if (this.f71361z) {
                        }
                        if (this.f71335b == null) {
                            iIntValue = i25;
                        } else {
                            iIntValue = i25;
                        }
                        if (this.f71355t == 0) {
                            i27 = iIntValue;
                        } else {
                            i27 = iIntValue;
                        }
                        bVar.F0(this.f71349n).i0(this.f71350o).v0(f15).z0(i27).x0(this.f71359x).D0(this.f71360y).W(gVarA);
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw x.a("Unexpected MIME type.", null);
                    }
                    if (this.f71335b != null) {
                        bVar.m0(this.f71335b);
                    }
                    t7.p.b bVarJ12 = bVar.j0(i15);
                    if (this.f71333a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    this.f71336b0 = bVarJ12.X(str4).A0(str3).p0(i18).o0(this.Z).C0(i318).l0(listSingletonList).V(str).d0(this.f71348m).Q();
                    return;
                case 14:
                    str6 = "audio/ac3";
                    listSingletonList = null;
                    str = null;
                    i18 = -1;
                    i17 = -1;
                    i16 = 0;
                    if (this.P != null) {
                        str = aVarA.f217144c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z118 = this.Y;
                    if (this.X) {
                        i19 = 2;
                    } else {
                        i19 = i16;
                    }
                    int i319 = (z118 ? 1 : 0) | i19;
                    bVar = new t7.p.b();
                    if (w.h(str3)) {
                        bVar.U(this.Q).B0(this.S).t0(i17);
                    } else if (w.k(str3)) {
                        if (this.f71354s == 0) {
                            i29 = this.f71352q;
                            i25 = -1;
                            if (i29 == -1) {
                                i29 = this.f71349n;
                            }
                            this.f71352q = i29;
                            i35 = this.f71353r;
                            if (i35 == -1) {
                                i35 = this.f71350o;
                            }
                            this.f71353r = i35;
                        } else {
                            i25 = -1;
                        }
                        i26 = this.f71352q;
                        if (i26 != i25) {
                            f15 = -1.0f;
                        } else {
                            f15 = -1.0f;
                        }
                        if (this.f71361z) {
                        }
                        if (this.f71335b == null) {
                            iIntValue = i25;
                        } else {
                            iIntValue = i25;
                        }
                        if (this.f71355t == 0) {
                            i27 = iIntValue;
                        } else {
                            i27 = iIntValue;
                        }
                        bVar.F0(this.f71349n).i0(this.f71350o).v0(f15).z0(i27).x0(this.f71359x).D0(this.f71360y).W(gVarA);
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw x.a("Unexpected MIME type.", null);
                    }
                    if (this.f71335b != null) {
                        bVar.m0(this.f71335b);
                    }
                    t7.p.b bVarJ13 = bVar.j0(i15);
                    if (this.f71333a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    this.f71336b0 = bVarJ13.X(str4).A0(str3).p0(i18).o0(this.Z).C0(i319).l0(listSingletonList).V(str).d0(this.f71348m).Q();
                    return;
                case 15:
                case 21:
                    this.W = true;
                    str6 = "audio/vnd.dts";
                    listSingletonList = null;
                    str = null;
                    i18 = -1;
                    i17 = -1;
                    i16 = 0;
                    if (this.P != null) {
                        str = aVarA.f217144c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z119 = this.Y;
                    if (this.X) {
                        i19 = 2;
                    } else {
                        i19 = i16;
                    }
                    int i3110 = (z119 ? 1 : 0) | i19;
                    bVar = new t7.p.b();
                    if (w.h(str3)) {
                        bVar.U(this.Q).B0(this.S).t0(i17);
                    } else if (w.k(str3)) {
                        if (this.f71354s == 0) {
                            i29 = this.f71352q;
                            i25 = -1;
                            if (i29 == -1) {
                                i29 = this.f71349n;
                            }
                            this.f71352q = i29;
                            i35 = this.f71353r;
                            if (i35 == -1) {
                                i35 = this.f71350o;
                            }
                            this.f71353r = i35;
                        } else {
                            i25 = -1;
                        }
                        i26 = this.f71352q;
                        if (i26 != i25) {
                            f15 = -1.0f;
                        } else {
                            f15 = -1.0f;
                        }
                        if (this.f71361z) {
                        }
                        if (this.f71335b == null) {
                            iIntValue = i25;
                        } else {
                            iIntValue = i25;
                        }
                        if (this.f71355t == 0) {
                            i27 = iIntValue;
                        } else {
                            i27 = iIntValue;
                        }
                        bVar.F0(this.f71349n).i0(this.f71350o).v0(f15).z0(i27).x0(this.f71359x).D0(this.f71360y).W(gVarA);
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw x.a("Unexpected MIME type.", null);
                    }
                    if (this.f71335b != null) {
                        bVar.m0(this.f71335b);
                    }
                    t7.p.b bVarJ14 = bVar.j0(i15);
                    if (this.f71333a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    this.f71336b0 = bVarJ14.X(str4).A0(str3).p0(i18).o0(this.Z).C0(i3110).l0(listSingletonList).V(str).d0(this.f71348m).Q();
                    return;
                case 16:
                    byte[] bArr3 = this.f71347l;
                    listSingletonList = bArr3 == null ? null : n0.E(bArr3);
                    str6 = "video/av01";
                    str = null;
                    i18 = -1;
                    i17 = -1;
                    i16 = 0;
                    if (this.P != null) {
                        str = aVarA.f217144c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z1110 = this.Y;
                    if (this.X) {
                        i19 = 2;
                    } else {
                        i19 = i16;
                    }
                    int i3111 = (z1110 ? 1 : 0) | i19;
                    bVar = new t7.p.b();
                    if (w.h(str3)) {
                        bVar.U(this.Q).B0(this.S).t0(i17);
                    } else if (w.k(str3)) {
                        if (this.f71354s == 0) {
                            i29 = this.f71352q;
                            i25 = -1;
                            if (i29 == -1) {
                                i29 = this.f71349n;
                            }
                            this.f71352q = i29;
                            i35 = this.f71353r;
                            if (i35 == -1) {
                                i35 = this.f71350o;
                            }
                            this.f71353r = i35;
                        } else {
                            i25 = -1;
                        }
                        i26 = this.f71352q;
                        if (i26 != i25) {
                            f15 = -1.0f;
                        } else {
                            f15 = -1.0f;
                        }
                        if (this.f71361z) {
                        }
                        if (this.f71335b == null) {
                            iIntValue = i25;
                        } else {
                            iIntValue = i25;
                        }
                        if (this.f71355t == 0) {
                            i27 = iIntValue;
                        } else {
                            i27 = iIntValue;
                        }
                        bVar.F0(this.f71349n).i0(this.f71350o).v0(f15).z0(i27).x0(this.f71359x).D0(this.f71360y).W(gVarA);
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw x.a("Unexpected MIME type.", null);
                    }
                    if (this.f71335b != null) {
                        bVar.m0(this.f71335b);
                    }
                    t7.p.b bVarJ15 = bVar.j0(i15);
                    if (this.f71333a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    this.f71336b0 = bVarJ15.X(str4).A0(str3).p0(i18).o0(this.Z).C0(i3111).l0(listSingletonList).V(str).d0(this.f71348m).Q();
                    return;
                case 17:
                    str6 = "video/x-vnd.on2.vp8";
                    listSingletonList = null;
                    str = null;
                    i18 = -1;
                    i17 = -1;
                    i16 = 0;
                    if (this.P != null) {
                        str = aVarA.f217144c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z1111 = this.Y;
                    if (this.X) {
                        i19 = 2;
                    } else {
                        i19 = i16;
                    }
                    int i3112 = (z1111 ? 1 : 0) | i19;
                    bVar = new t7.p.b();
                    if (w.h(str3)) {
                        bVar.U(this.Q).B0(this.S).t0(i17);
                    } else if (w.k(str3)) {
                        if (this.f71354s == 0) {
                            i29 = this.f71352q;
                            i25 = -1;
                            if (i29 == -1) {
                                i29 = this.f71349n;
                            }
                            this.f71352q = i29;
                            i35 = this.f71353r;
                            if (i35 == -1) {
                                i35 = this.f71350o;
                            }
                            this.f71353r = i35;
                        } else {
                            i25 = -1;
                        }
                        i26 = this.f71352q;
                        if (i26 != i25) {
                            f15 = -1.0f;
                        } else {
                            f15 = -1.0f;
                        }
                        if (this.f71361z) {
                        }
                        if (this.f71335b == null) {
                            iIntValue = i25;
                        } else {
                            iIntValue = i25;
                        }
                        if (this.f71355t == 0) {
                            i27 = iIntValue;
                        } else {
                            i27 = iIntValue;
                        }
                        bVar.F0(this.f71349n).i0(this.f71350o).v0(f15).z0(i27).x0(this.f71359x).D0(this.f71360y).W(gVarA);
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw x.a("Unexpected MIME type.", null);
                    }
                    if (this.f71335b != null) {
                        bVar.m0(this.f71335b);
                    }
                    t7.p.b bVarJ16 = bVar.j0(i15);
                    if (this.f71333a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    this.f71336b0 = bVarJ16.X(str4).A0(str3).p0(i18).o0(this.Z).C0(i3112).l0(listSingletonList).V(str).d0(this.f71348m).Q();
                    return;
                case 18:
                    byte[] bArr4 = this.f71347l;
                    listSingletonList = bArr4 == null ? null : n0.E(bArr4);
                    str6 = "video/x-vnd.on2.vp9";
                    str = null;
                    i18 = -1;
                    i17 = -1;
                    i16 = 0;
                    if (this.P != null) {
                        str = aVarA.f217144c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z1112 = this.Y;
                    if (this.X) {
                        i19 = 2;
                    } else {
                        i19 = i16;
                    }
                    int i3113 = (z1112 ? 1 : 0) | i19;
                    bVar = new t7.p.b();
                    if (w.h(str3)) {
                        bVar.U(this.Q).B0(this.S).t0(i17);
                    } else if (w.k(str3)) {
                        if (this.f71354s == 0) {
                            i29 = this.f71352q;
                            i25 = -1;
                            if (i29 == -1) {
                                i29 = this.f71349n;
                            }
                            this.f71352q = i29;
                            i35 = this.f71353r;
                            if (i35 == -1) {
                                i35 = this.f71350o;
                            }
                            this.f71353r = i35;
                        } else {
                            i25 = -1;
                        }
                        i26 = this.f71352q;
                        if (i26 != i25) {
                            f15 = -1.0f;
                        } else {
                            f15 = -1.0f;
                        }
                        if (this.f71361z) {
                        }
                        if (this.f71335b == null) {
                            iIntValue = i25;
                        } else {
                            iIntValue = i25;
                        }
                        if (this.f71355t == 0) {
                            i27 = iIntValue;
                        } else {
                            i27 = iIntValue;
                        }
                        bVar.F0(this.f71349n).i0(this.f71350o).v0(f15).z0(i27).x0(this.f71359x).D0(this.f71360y).W(gVarA);
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw x.a("Unexpected MIME type.", null);
                    }
                    if (this.f71335b != null) {
                        bVar.m0(this.f71335b);
                    }
                    t7.p.b bVarJ17 = bVar.j0(i15);
                    if (this.f71333a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    this.f71336b0 = bVarJ17.X(str4).A0(str3).p0(i18).o0(this.Z).C0(i3113).l0(listSingletonList).V(str).d0(this.f71348m).Q();
                    return;
                case 19:
                    listSingletonList = null;
                    str = null;
                    str6 = "application/pgs";
                    i18 = -1;
                    i17 = -1;
                    i16 = 0;
                    if (this.P != null) {
                        str = aVarA.f217144c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z1113 = this.Y;
                    if (this.X) {
                        i19 = 2;
                    } else {
                        i19 = i16;
                    }
                    int i3114 = (z1113 ? 1 : 0) | i19;
                    bVar = new t7.p.b();
                    if (w.h(str3)) {
                        bVar.U(this.Q).B0(this.S).t0(i17);
                    } else if (w.k(str3)) {
                        if (this.f71354s == 0) {
                            i29 = this.f71352q;
                            i25 = -1;
                            if (i29 == -1) {
                                i29 = this.f71349n;
                            }
                            this.f71352q = i29;
                            i35 = this.f71353r;
                            if (i35 == -1) {
                                i35 = this.f71350o;
                            }
                            this.f71353r = i35;
                        } else {
                            i25 = -1;
                        }
                        i26 = this.f71352q;
                        if (i26 != i25) {
                            f15 = -1.0f;
                        } else {
                            f15 = -1.0f;
                        }
                        if (this.f71361z) {
                        }
                        if (this.f71335b == null) {
                            iIntValue = i25;
                        } else {
                            iIntValue = i25;
                        }
                        if (this.f71355t == 0) {
                            i27 = iIntValue;
                        } else {
                            i27 = iIntValue;
                        }
                        bVar.F0(this.f71349n).i0(this.f71350o).v0(f15).z0(i27).x0(this.f71359x).D0(this.f71360y).W(gVarA);
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw x.a("Unexpected MIME type.", null);
                    }
                    if (this.f71335b != null) {
                        bVar.m0(this.f71335b);
                    }
                    t7.p.b bVarJ18 = bVar.j0(i15);
                    if (this.f71333a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    this.f71336b0 = bVarJ18.X(str4).A0(str3).p0(i18).o0(this.Z).C0(i3114).l0(listSingletonList).V(str).d0(this.f71348m).Q();
                    return;
                case 20:
                    str6 = "video/x-unknown";
                    listSingletonList = null;
                    str = null;
                    i18 = -1;
                    i17 = -1;
                    i16 = 0;
                    if (this.P != null) {
                        str = aVarA.f217144c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z1114 = this.Y;
                    if (this.X) {
                        i19 = 2;
                    } else {
                        i19 = i16;
                    }
                    int i3115 = (z1114 ? 1 : 0) | i19;
                    bVar = new t7.p.b();
                    if (w.h(str3)) {
                        bVar.U(this.Q).B0(this.S).t0(i17);
                    } else if (w.k(str3)) {
                        if (this.f71354s == 0) {
                            i29 = this.f71352q;
                            i25 = -1;
                            if (i29 == -1) {
                                i29 = this.f71349n;
                            }
                            this.f71352q = i29;
                            i35 = this.f71353r;
                            if (i35 == -1) {
                                i35 = this.f71350o;
                            }
                            this.f71353r = i35;
                        } else {
                            i25 = -1;
                        }
                        i26 = this.f71352q;
                        if (i26 != i25) {
                            f15 = -1.0f;
                        } else {
                            f15 = -1.0f;
                        }
                        if (this.f71361z) {
                        }
                        if (this.f71335b == null) {
                            iIntValue = i25;
                        } else {
                            iIntValue = i25;
                        }
                        if (this.f71355t == 0) {
                            i27 = iIntValue;
                        } else {
                            i27 = iIntValue;
                        }
                        bVar.F0(this.f71349n).i0(this.f71350o).v0(f15).z0(i27).x0(this.f71359x).D0(this.f71360y).W(gVarA);
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw x.a("Unexpected MIME type.", null);
                    }
                    if (this.f71335b != null) {
                        bVar.m0(this.f71335b);
                    }
                    t7.p.b bVarJ19 = bVar.j0(i15);
                    if (this.f71333a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    this.f71336b0 = bVarJ19.X(str4).A0(str3).p0(i18).o0(this.Z).C0(i3115).l0(listSingletonList).V(str).d0(this.f71348m).Q();
                    return;
                case 22:
                    if (this.R == 32) {
                        listSingletonList = null;
                        str = null;
                        i18 = -1;
                        i17 = 4;
                    } else {
                        t.h("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + this.R + ". Setting mimeType to audio/x-unknown");
                        str6 = "audio/x-unknown";
                        listSingletonList = null;
                        str = null;
                        i18 = -1;
                        i17 = -1;
                    }
                    i16 = 0;
                    if (this.P != null) {
                        str = aVarA.f217144c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z1115 = this.Y;
                    if (this.X) {
                        i19 = 2;
                    } else {
                        i19 = i16;
                    }
                    int i3116 = (z1115 ? 1 : 0) | i19;
                    bVar = new t7.p.b();
                    if (w.h(str3)) {
                        bVar.U(this.Q).B0(this.S).t0(i17);
                    } else if (w.k(str3)) {
                        if (this.f71354s == 0) {
                            i29 = this.f71352q;
                            i25 = -1;
                            if (i29 == -1) {
                                i29 = this.f71349n;
                            }
                            this.f71352q = i29;
                            i35 = this.f71353r;
                            if (i35 == -1) {
                                i35 = this.f71350o;
                            }
                            this.f71353r = i35;
                        } else {
                            i25 = -1;
                        }
                        i26 = this.f71352q;
                        if (i26 != i25) {
                            f15 = -1.0f;
                        } else {
                            f15 = -1.0f;
                        }
                        if (this.f71361z) {
                        }
                        if (this.f71335b == null) {
                            iIntValue = i25;
                        } else {
                            iIntValue = i25;
                        }
                        if (this.f71355t == 0) {
                            i27 = iIntValue;
                        } else {
                            i27 = iIntValue;
                        }
                        bVar.F0(this.f71349n).i0(this.f71350o).v0(f15).z0(i27).x0(this.f71359x).D0(this.f71360y).W(gVarA);
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw x.a("Unexpected MIME type.", null);
                    }
                    if (this.f71335b != null) {
                        bVar.m0(this.f71335b);
                    }
                    t7.p.b bVarJ110 = bVar.j0(i15);
                    if (this.f71333a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    this.f71336b0 = bVarJ110.X(str4).A0(str3).p0(i18).o0(this.Z).C0(i3116).l0(listSingletonList).V(str).d0(this.f71348m).Q();
                    return;
                case 23:
                    int i45 = this.R;
                    if (i45 != 8) {
                        if (i45 == 16) {
                            iD0 = 268435456;
                        } else if (i45 == 24) {
                            iD0 = 1342177280;
                        } else {
                            if (i45 != 32) {
                                t.h("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + this.R + ". Setting mimeType to audio/x-unknown");
                                str6 = "audio/x-unknown";
                                listSingletonList = null;
                                str = null;
                                i18 = -1;
                                i17 = -1;
                                i16 = 0;
                                if (this.P != null) {
                                    str = aVarA.f217144c;
                                    str6 = "video/dolby-vision";
                                }
                                str3 = str6;
                                boolean z1116 = this.Y;
                                if (this.X) {
                                    i19 = 2;
                                } else {
                                    i19 = i16;
                                }
                                int i3117 = (z1116 ? 1 : 0) | i19;
                                bVar = new t7.p.b();
                                if (w.h(str3)) {
                                    bVar.U(this.Q).B0(this.S).t0(i17);
                                } else if (w.k(str3)) {
                                    if (this.f71354s == 0) {
                                        i29 = this.f71352q;
                                        i25 = -1;
                                        if (i29 == -1) {
                                            i29 = this.f71349n;
                                        }
                                        this.f71352q = i29;
                                        i35 = this.f71353r;
                                        if (i35 == -1) {
                                            i35 = this.f71350o;
                                        }
                                        this.f71353r = i35;
                                    } else {
                                        i25 = -1;
                                    }
                                    i26 = this.f71352q;
                                    if (i26 != i25) {
                                        f15 = -1.0f;
                                    } else {
                                        f15 = -1.0f;
                                    }
                                    if (this.f71361z) {
                                    }
                                    if (this.f71335b == null) {
                                        iIntValue = i25;
                                    } else {
                                        iIntValue = i25;
                                    }
                                    if (this.f71355t == 0) {
                                        i27 = iIntValue;
                                    } else {
                                        i27 = iIntValue;
                                    }
                                    bVar.F0(this.f71349n).i0(this.f71350o).v0(f15).z0(i27).x0(this.f71359x).D0(this.f71360y).W(gVarA);
                                } else if (!"application/x-subrip".equals(str3)) {
                                    throw x.a("Unexpected MIME type.", null);
                                }
                                if (this.f71335b != null) {
                                    bVar.m0(this.f71335b);
                                }
                                t7.p.b bVarJ111 = bVar.j0(i15);
                                if (this.f71333a) {
                                    str4 = "video/webm";
                                } else {
                                    str4 = "video/x-matroska";
                                }
                                this.f71336b0 = bVarJ111.X(str4).A0(str3).p0(i18).o0(this.Z).C0(i3117).l0(listSingletonList).V(str).d0(this.f71348m).Q();
                                return;
                            }
                            iD0 = 1610612736;
                        }
                    }
                    listSingletonList = null;
                    str = null;
                    i17 = iD0;
                    i18 = -1;
                    i16 = 0;
                    if (this.P != null) {
                        str = aVarA.f217144c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z1117 = this.Y;
                    if (this.X) {
                        i19 = 2;
                    } else {
                        i19 = i16;
                    }
                    int i3118 = (z1117 ? 1 : 0) | i19;
                    bVar = new t7.p.b();
                    if (w.h(str3)) {
                        bVar.U(this.Q).B0(this.S).t0(i17);
                    } else if (w.k(str3)) {
                        if (this.f71354s == 0) {
                            i29 = this.f71352q;
                            i25 = -1;
                            if (i29 == -1) {
                                i29 = this.f71349n;
                            }
                            this.f71352q = i29;
                            i35 = this.f71353r;
                            if (i35 == -1) {
                                i35 = this.f71350o;
                            }
                            this.f71353r = i35;
                        } else {
                            i25 = -1;
                        }
                        i26 = this.f71352q;
                        if (i26 != i25) {
                            f15 = -1.0f;
                        } else {
                            f15 = -1.0f;
                        }
                        if (this.f71361z) {
                        }
                        if (this.f71335b == null) {
                            iIntValue = i25;
                        } else {
                            iIntValue = i25;
                        }
                        if (this.f71355t == 0) {
                            i27 = iIntValue;
                        } else {
                            i27 = iIntValue;
                        }
                        bVar.F0(this.f71349n).i0(this.f71350o).v0(f15).z0(i27).x0(this.f71359x).D0(this.f71360y).W(gVarA);
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw x.a("Unexpected MIME type.", null);
                    }
                    if (this.f71335b != null) {
                        bVar.m0(this.f71335b);
                    }
                    t7.p.b bVarJ112 = bVar.j0(i15);
                    if (this.f71333a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    this.f71336b0 = bVarJ112.X(str4).A0(str3).p0(i18).o0(this.Z).C0(i3118).l0(listSingletonList).V(str).d0(this.f71348m).Q();
                    return;
                case 24:
                    iD0 = o0.d0(this.R);
                    if (iD0 == 0) {
                        t.h("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.R + ". Setting mimeType to audio/x-unknown");
                        str6 = "audio/x-unknown";
                        listSingletonList = null;
                        str = null;
                        i18 = -1;
                        i17 = -1;
                    } else {
                        listSingletonList = null;
                        str = null;
                        i17 = iD0;
                        i18 = -1;
                    }
                    i16 = 0;
                    if (this.P != null) {
                        str = aVarA.f217144c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z1118 = this.Y;
                    if (this.X) {
                        i19 = 2;
                    } else {
                        i19 = i16;
                    }
                    int i3119 = (z1118 ? 1 : 0) | i19;
                    bVar = new t7.p.b();
                    if (w.h(str3)) {
                        bVar.U(this.Q).B0(this.S).t0(i17);
                    } else if (w.k(str3)) {
                        if (this.f71354s == 0) {
                            i29 = this.f71352q;
                            i25 = -1;
                            if (i29 == -1) {
                                i29 = this.f71349n;
                            }
                            this.f71352q = i29;
                            i35 = this.f71353r;
                            if (i35 == -1) {
                                i35 = this.f71350o;
                            }
                            this.f71353r = i35;
                        } else {
                            i25 = -1;
                        }
                        i26 = this.f71352q;
                        if (i26 != i25) {
                            f15 = -1.0f;
                        } else {
                            f15 = -1.0f;
                        }
                        if (this.f71361z) {
                        }
                        if (this.f71335b == null) {
                            iIntValue = i25;
                        } else {
                            iIntValue = i25;
                        }
                        if (this.f71355t == 0) {
                            i27 = iIntValue;
                        } else {
                            i27 = iIntValue;
                        }
                        bVar.F0(this.f71349n).i0(this.f71350o).v0(f15).z0(i27).x0(this.f71359x).D0(this.f71360y).W(gVarA);
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw x.a("Unexpected MIME type.", null);
                    }
                    if (this.f71335b != null) {
                        bVar.m0(this.f71335b);
                    }
                    t7.p.b bVarJ113 = bVar.j0(i15);
                    if (this.f71333a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    this.f71336b0 = bVarJ113.X(str4).A0(str3).p0(i18).o0(this.Z).C0(i3119).l0(listSingletonList).V(str).d0(this.f71348m).Q();
                    return;
                case 25:
                case 26:
                    listSingletonList = n0.F(e.f71284m0, i(this.f71337c));
                    str6 = "text/x-ssa";
                    str = null;
                    i18 = -1;
                    i17 = -1;
                    i16 = 0;
                    if (this.P != null) {
                        str = aVarA.f217144c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z1119 = this.Y;
                    if (this.X) {
                        i19 = 2;
                    } else {
                        i19 = i16;
                    }
                    int i31110 = (z1119 ? 1 : 0) | i19;
                    bVar = new t7.p.b();
                    if (w.h(str3)) {
                        bVar.U(this.Q).B0(this.S).t0(i17);
                    } else if (w.k(str3)) {
                        if (this.f71354s == 0) {
                            i29 = this.f71352q;
                            i25 = -1;
                            if (i29 == -1) {
                                i29 = this.f71349n;
                            }
                            this.f71352q = i29;
                            i35 = this.f71353r;
                            if (i35 == -1) {
                                i35 = this.f71350o;
                            }
                            this.f71353r = i35;
                        } else {
                            i25 = -1;
                        }
                        i26 = this.f71352q;
                        if (i26 != i25) {
                            f15 = -1.0f;
                        } else {
                            f15 = -1.0f;
                        }
                        if (this.f71361z) {
                        }
                        if (this.f71335b == null) {
                            iIntValue = i25;
                        } else {
                            iIntValue = i25;
                        }
                        if (this.f71355t == 0) {
                            i27 = iIntValue;
                        } else {
                            i27 = iIntValue;
                        }
                        bVar.F0(this.f71349n).i0(this.f71350o).v0(f15).z0(i27).x0(this.f71359x).D0(this.f71360y).W(gVarA);
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw x.a("Unexpected MIME type.", null);
                    }
                    if (this.f71335b != null) {
                        bVar.m0(this.f71335b);
                    }
                    t7.p.b bVarJ114 = bVar.j0(i15);
                    if (this.f71333a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    this.f71336b0 = bVarJ114.X(str4).A0(str3).p0(i18).o0(this.Z).C0(i31110).l0(listSingletonList).V(str).d0(this.f71348m).Q();
                    return;
                case 27:
                    f0 f0VarA = f0.a(new c0(i(this.f71337c)));
                    list = f0VarA.f143071a;
                    this.f71338c0 = f0VarA.f143072b;
                    str2 = f0VarA.f143086p;
                    str6 = "video/hevc";
                    List<byte[]> list3 = list;
                    str = str2;
                    listSingletonList = list3;
                    i18 = -1;
                    i17 = -1;
                    i16 = 0;
                    if (this.P != null) {
                        str = aVarA.f217144c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z11110 = this.Y;
                    if (this.X) {
                        i19 = 2;
                    } else {
                        i19 = i16;
                    }
                    int i31111 = (z11110 ? 1 : 0) | i19;
                    bVar = new t7.p.b();
                    if (w.h(str3)) {
                        bVar.U(this.Q).B0(this.S).t0(i17);
                    } else if (w.k(str3)) {
                        if (this.f71354s == 0) {
                            i29 = this.f71352q;
                            i25 = -1;
                            if (i29 == -1) {
                                i29 = this.f71349n;
                            }
                            this.f71352q = i29;
                            i35 = this.f71353r;
                            if (i35 == -1) {
                                i35 = this.f71350o;
                            }
                            this.f71353r = i35;
                        } else {
                            i25 = -1;
                        }
                        i26 = this.f71352q;
                        if (i26 != i25) {
                            f15 = -1.0f;
                        } else {
                            f15 = -1.0f;
                        }
                        if (this.f71361z) {
                        }
                        if (this.f71335b == null) {
                            iIntValue = i25;
                        } else {
                            iIntValue = i25;
                        }
                        if (this.f71355t == 0) {
                            i27 = iIntValue;
                        } else {
                            i27 = iIntValue;
                        }
                        bVar.F0(this.f71349n).i0(this.f71350o).v0(f15).z0(i27).x0(this.f71359x).D0(this.f71360y).W(gVarA);
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw x.a("Unexpected MIME type.", null);
                    }
                    if (this.f71335b != null) {
                        bVar.m0(this.f71335b);
                    }
                    t7.p.b bVarJ115 = bVar.j0(i15);
                    if (this.f71333a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    this.f71336b0 = bVarJ115.X(str4).A0(str3).p0(i18).o0(this.Z).C0(i31111).l0(listSingletonList).V(str).d0(this.f71348m).Q();
                    return;
                case 28:
                    str6 = "text/vtt";
                    listSingletonList = null;
                    str = null;
                    i18 = -1;
                    i17 = -1;
                    i16 = 0;
                    if (this.P != null) {
                        str = aVarA.f217144c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z11111 = this.Y;
                    if (this.X) {
                        i19 = 2;
                    } else {
                        i19 = i16;
                    }
                    int i31112 = (z11111 ? 1 : 0) | i19;
                    bVar = new t7.p.b();
                    if (w.h(str3)) {
                        bVar.U(this.Q).B0(this.S).t0(i17);
                    } else if (w.k(str3)) {
                        if (this.f71354s == 0) {
                            i29 = this.f71352q;
                            i25 = -1;
                            if (i29 == -1) {
                                i29 = this.f71349n;
                            }
                            this.f71352q = i29;
                            i35 = this.f71353r;
                            if (i35 == -1) {
                                i35 = this.f71350o;
                            }
                            this.f71353r = i35;
                        } else {
                            i25 = -1;
                        }
                        i26 = this.f71352q;
                        if (i26 != i25) {
                            f15 = -1.0f;
                        } else {
                            f15 = -1.0f;
                        }
                        if (this.f71361z) {
                        }
                        if (this.f71335b == null) {
                            iIntValue = i25;
                        } else {
                            iIntValue = i25;
                        }
                        if (this.f71355t == 0) {
                            i27 = iIntValue;
                        } else {
                            i27 = iIntValue;
                        }
                        bVar.F0(this.f71349n).i0(this.f71350o).v0(f15).z0(i27).x0(this.f71359x).D0(this.f71360y).W(gVarA);
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw x.a("Unexpected MIME type.", null);
                    }
                    if (this.f71335b != null) {
                        bVar.m0(this.f71335b);
                    }
                    t7.p.b bVarJ116 = bVar.j0(i15);
                    if (this.f71333a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    this.f71336b0 = bVarJ116.X(str4).A0(str3).p0(i18).o0(this.Z).C0(i31112).l0(listSingletonList).V(str).d0(this.f71348m).Q();
                    return;
                case 29:
                    listSingletonList = null;
                    str = null;
                    str6 = "application/x-subrip";
                    i18 = -1;
                    i17 = -1;
                    i16 = 0;
                    if (this.P != null) {
                        str = aVarA.f217144c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z11112 = this.Y;
                    if (this.X) {
                        i19 = 2;
                    } else {
                        i19 = i16;
                    }
                    int i31113 = (z11112 ? 1 : 0) | i19;
                    bVar = new t7.p.b();
                    if (w.h(str3)) {
                        bVar.U(this.Q).B0(this.S).t0(i17);
                    } else if (w.k(str3)) {
                        if (this.f71354s == 0) {
                            i29 = this.f71352q;
                            i25 = -1;
                            if (i29 == -1) {
                                i29 = this.f71349n;
                            }
                            this.f71352q = i29;
                            i35 = this.f71353r;
                            if (i35 == -1) {
                                i35 = this.f71350o;
                            }
                            this.f71353r = i35;
                        } else {
                            i25 = -1;
                        }
                        i26 = this.f71352q;
                        if (i26 != i25) {
                            f15 = -1.0f;
                        } else {
                            f15 = -1.0f;
                        }
                        if (this.f71361z) {
                        }
                        if (this.f71335b == null) {
                            iIntValue = i25;
                        } else {
                            iIntValue = i25;
                        }
                        if (this.f71355t == 0) {
                            i27 = iIntValue;
                        } else {
                            i27 = iIntValue;
                        }
                        bVar.F0(this.f71349n).i0(this.f71350o).v0(f15).z0(i27).x0(this.f71359x).D0(this.f71360y).W(gVarA);
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw x.a("Unexpected MIME type.", null);
                    }
                    if (this.f71335b != null) {
                        bVar.m0(this.f71335b);
                    }
                    t7.p.b bVarJ117 = bVar.j0(i15);
                    if (this.f71333a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    this.f71336b0 = bVarJ117.X(str4).A0(str3).p0(i18).o0(this.Z).C0(i31113).l0(listSingletonList).V(str).d0(this.f71348m).Q();
                    return;
                case 30:
                    str6 = "video/mpeg2";
                    listSingletonList = null;
                    str = null;
                    i18 = -1;
                    i17 = -1;
                    i16 = 0;
                    if (this.P != null) {
                        str = aVarA.f217144c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z11113 = this.Y;
                    if (this.X) {
                        i19 = 2;
                    } else {
                        i19 = i16;
                    }
                    int i31114 = (z11113 ? 1 : 0) | i19;
                    bVar = new t7.p.b();
                    if (w.h(str3)) {
                        bVar.U(this.Q).B0(this.S).t0(i17);
                    } else if (w.k(str3)) {
                        if (this.f71354s == 0) {
                            i29 = this.f71352q;
                            i25 = -1;
                            if (i29 == -1) {
                                i29 = this.f71349n;
                            }
                            this.f71352q = i29;
                            i35 = this.f71353r;
                            if (i35 == -1) {
                                i35 = this.f71350o;
                            }
                            this.f71353r = i35;
                        } else {
                            i25 = -1;
                        }
                        i26 = this.f71352q;
                        if (i26 != i25) {
                            f15 = -1.0f;
                        } else {
                            f15 = -1.0f;
                        }
                        if (this.f71361z) {
                        }
                        if (this.f71335b == null) {
                            iIntValue = i25;
                        } else {
                            iIntValue = i25;
                        }
                        if (this.f71355t == 0) {
                            i27 = iIntValue;
                        } else {
                            i27 = iIntValue;
                        }
                        bVar.F0(this.f71349n).i0(this.f71350o).v0(f15).z0(i27).x0(this.f71359x).D0(this.f71360y).W(gVarA);
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw x.a("Unexpected MIME type.", null);
                    }
                    if (this.f71335b != null) {
                        bVar.m0(this.f71335b);
                    }
                    t7.p.b bVarJ118 = bVar.j0(i15);
                    if (this.f71333a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    this.f71336b0 = bVarJ118.X(str4).A0(str3).p0(i18).o0(this.Z).C0(i31114).l0(listSingletonList).V(str).d0(this.f71348m).Q();
                    return;
                case BERTags.DATE /* 31 */:
                    str6 = "audio/eac3";
                    listSingletonList = null;
                    str = null;
                    i18 = -1;
                    i17 = -1;
                    i16 = 0;
                    if (this.P != null) {
                        str = aVarA.f217144c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z11114 = this.Y;
                    if (this.X) {
                        i19 = 2;
                    } else {
                        i19 = i16;
                    }
                    int i31115 = (z11114 ? 1 : 0) | i19;
                    bVar = new t7.p.b();
                    if (w.h(str3)) {
                        bVar.U(this.Q).B0(this.S).t0(i17);
                    } else if (w.k(str3)) {
                        if (this.f71354s == 0) {
                            i29 = this.f71352q;
                            i25 = -1;
                            if (i29 == -1) {
                                i29 = this.f71349n;
                            }
                            this.f71352q = i29;
                            i35 = this.f71353r;
                            if (i35 == -1) {
                                i35 = this.f71350o;
                            }
                            this.f71353r = i35;
                        } else {
                            i25 = -1;
                        }
                        i26 = this.f71352q;
                        if (i26 != i25) {
                            f15 = -1.0f;
                        } else {
                            f15 = -1.0f;
                        }
                        if (this.f71361z) {
                        }
                        if (this.f71335b == null) {
                            iIntValue = i25;
                        } else {
                            iIntValue = i25;
                        }
                        if (this.f71355t == 0) {
                            i27 = iIntValue;
                        } else {
                            i27 = iIntValue;
                        }
                        bVar.F0(this.f71349n).i0(this.f71350o).v0(f15).z0(i27).x0(this.f71359x).D0(this.f71360y).W(gVarA);
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw x.a("Unexpected MIME type.", null);
                    }
                    if (this.f71335b != null) {
                        bVar.m0(this.f71335b);
                    }
                    t7.p.b bVarJ119 = bVar.j0(i15);
                    if (this.f71333a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    this.f71336b0 = bVarJ119.X(str4).A0(str3).p0(i18).o0(this.Z).C0(i31115).l0(listSingletonList).V(str).d0(this.f71348m).Q();
                    return;
                case 32:
                    listSingletonList = Collections.singletonList(i(this.f71337c));
                    str6 = "audio/flac";
                    str = null;
                    i18 = -1;
                    i17 = -1;
                    i16 = 0;
                    if (this.P != null) {
                        str = aVarA.f217144c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z11115 = this.Y;
                    if (this.X) {
                        i19 = 2;
                    } else {
                        i19 = i16;
                    }
                    int i31116 = (z11115 ? 1 : 0) | i19;
                    bVar = new t7.p.b();
                    if (w.h(str3)) {
                        bVar.U(this.Q).B0(this.S).t0(i17);
                    } else if (w.k(str3)) {
                        if (this.f71354s == 0) {
                            i29 = this.f71352q;
                            i25 = -1;
                            if (i29 == -1) {
                                i29 = this.f71349n;
                            }
                            this.f71352q = i29;
                            i35 = this.f71353r;
                            if (i35 == -1) {
                                i35 = this.f71350o;
                            }
                            this.f71353r = i35;
                        } else {
                            i25 = -1;
                        }
                        i26 = this.f71352q;
                        if (i26 != i25) {
                            f15 = -1.0f;
                        } else {
                            f15 = -1.0f;
                        }
                        if (this.f71361z) {
                        }
                        if (this.f71335b == null) {
                            iIntValue = i25;
                        } else {
                            iIntValue = i25;
                        }
                        if (this.f71355t == 0) {
                            i27 = iIntValue;
                        } else {
                            i27 = iIntValue;
                        }
                        bVar.F0(this.f71349n).i0(this.f71350o).v0(f15).z0(i27).x0(this.f71359x).D0(this.f71360y).W(gVarA);
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw x.a("Unexpected MIME type.", null);
                    }
                    if (this.f71335b != null) {
                        bVar.m0(this.f71335b);
                    }
                    t7.p.b bVarJ1110 = bVar.j0(i15);
                    if (this.f71333a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    this.f71336b0 = bVarJ1110.X(str4).A0(str3).p0(i18).o0(this.Z).C0(i31116).l0(listSingletonList).V(str).d0(this.f71348m).Q();
                    return;
                case 33:
                    listSingletonList = new ArrayList<>(3);
                    listSingletonList.add(i(this.f71337c));
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    listSingletonList.add(byteBufferAllocate.order(byteOrder).putLong(this.T).array());
                    listSingletonList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.U).array());
                    str6 = "audio/opus";
                    i18 = 5760;
                    str = null;
                    i17 = -1;
                    i16 = 0;
                    if (this.P != null) {
                        str = aVarA.f217144c;
                        str6 = "video/dolby-vision";
                    }
                    str3 = str6;
                    boolean z11116 = this.Y;
                    if (this.X) {
                        i19 = 2;
                    } else {
                        i19 = i16;
                    }
                    int i31117 = (z11116 ? 1 : 0) | i19;
                    bVar = new t7.p.b();
                    if (w.h(str3)) {
                        bVar.U(this.Q).B0(this.S).t0(i17);
                    } else if (w.k(str3)) {
                        if (this.f71354s == 0) {
                            i29 = this.f71352q;
                            i25 = -1;
                            if (i29 == -1) {
                                i29 = this.f71349n;
                            }
                            this.f71352q = i29;
                            i35 = this.f71353r;
                            if (i35 == -1) {
                                i35 = this.f71350o;
                            }
                            this.f71353r = i35;
                        } else {
                            i25 = -1;
                        }
                        i26 = this.f71352q;
                        if (i26 != i25) {
                            f15 = -1.0f;
                        } else {
                            f15 = -1.0f;
                        }
                        if (this.f71361z) {
                        }
                        if (this.f71335b == null) {
                            iIntValue = i25;
                        } else {
                            iIntValue = i25;
                        }
                        if (this.f71355t == 0) {
                            i27 = iIntValue;
                        } else {
                            i27 = iIntValue;
                        }
                        bVar.F0(this.f71349n).i0(this.f71350o).v0(f15).z0(i27).x0(this.f71359x).D0(this.f71360y).W(gVarA);
                    } else if (!"application/x-subrip".equals(str3)) {
                        throw x.a("Unexpected MIME type.", null);
                    }
                    if (this.f71335b != null) {
                        bVar.m0(this.f71335b);
                    }
                    t7.p.b bVarJ1111 = bVar.j0(i15);
                    if (this.f71333a) {
                        str4 = "video/webm";
                    } else {
                        str4 = "video/x-matroska";
                    }
                    this.f71336b0 = bVarJ1111.X(str4).A0(str3).p0(i18).o0(this.Z).C0(i31117).l0(listSingletonList).V(str).d0(this.f71348m).Q();
                    return;
                default:
                    throw x.a("Unrecognized codec identifier.", null);
            }
        }

        public void m() {
            t0 t0Var = this.V;
            if (t0Var != null) {
                t0Var.a(this.f71334a0, this.f71346k);
            }
        }

        public void q() {
            t0 t0Var = this.V;
            if (t0Var != null) {
                t0Var.b();
            }
        }
    }

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        f71288q0 = Collections.unmodifiableMap(map);
    }

    public e(s.a aVar, int i15) {
        this(new g9.a(), i15, aVar);
    }

    private static boolean A(String str) {
        str.getClass();
        switch (str) {
            case "V_MPEG4/ISO/AP":
            case "V_MPEG4/ISO/SP":
            case "A_MS/ACM":
            case "A_TRUEHD":
            case "A_VORBIS":
            case "A_MPEG/L2":
            case "A_MPEG/L3":
            case "V_MS/VFW/FOURCC":
            case "S_DVBSUB":
            case "V_MPEG4/ISO/ASP":
            case "V_MPEG4/ISO/AVC":
            case "S_VOBSUB":
            case "A_DTS/LOSSLESS":
            case "A_AAC":
            case "A_AC3":
            case "A_DTS":
            case "V_AV1":
            case "V_VP8":
            case "V_VP9":
            case "S_HDMV/PGS":
            case "V_THEORA":
            case "A_DTS/EXPRESS":
            case "A_PCM/FLOAT/IEEE":
            case "A_PCM/INT/BIG":
            case "A_PCM/INT/LIT":
            case "S_TEXT/ASS":
            case "S_TEXT/SSA":
            case "V_MPEGH/ISO/HEVC":
            case "S_TEXT/WEBVTT":
            case "S_TEXT/UTF8":
            case "V_MPEG2":
            case "A_EAC3":
            case "A_FLAC":
            case "A_OPUS":
                return true;
            default:
                return false;
        }
    }

    private void C() {
        if (this.f71322x) {
            for (int i15 = 0; i15 < this.f71293c.size(); i15++) {
                if (this.f71293c.valueAt(i15).W) {
                    return;
                }
            }
            ((r) zj.p.q(this.f71308j0)).s();
            this.f71322x = false;
        }
    }

    private boolean D(k0 k0Var, long j15) {
        if (this.J) {
            this.L = j15;
            k0Var.f143128a = this.K;
            this.J = false;
            return true;
        }
        if (this.f71324z) {
            long j16 = this.L;
            if (j16 != -1) {
                k0Var.f143128a = j16;
                this.L = -1L;
                return true;
            }
        }
        return false;
    }

    private void E(q qVar, int i15) {
        if (this.f71305i.j() >= i15) {
            return;
        }
        if (this.f71305i.b() < i15) {
            c0 c0Var = this.f71305i;
            c0Var.d(Math.max(c0Var.b() * 2, i15));
        }
        qVar.readFully(this.f71305i.f(), this.f71305i.j(), i15 - this.f71305i.j());
        this.f71305i.e0(i15);
    }

    private void F() {
        this.f71290a0 = 0;
        this.f71292b0 = 0;
        this.f71294c0 = 0;
        this.f71296d0 = false;
        this.f71298e0 = false;
        this.f71300f0 = false;
        this.f71302g0 = 0;
        this.f71304h0 = (byte) 0;
        this.f71306i0 = false;
        this.f71310l.b0(0);
    }

    private long G(long j15) throws x {
        long j16 = this.f71318t;
        if (j16 != -9223372036854775807L) {
            return o0.U0(j15, j16, 1000L);
        }
        throw x.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private static void H(String str, long j15, byte[] bArr) {
        byte[] bArrU;
        int i15;
        str.getClass();
        switch (str) {
            case "S_TEXT/ASS":
            case "S_TEXT/SSA":
                bArrU = u(j15, "%01d:%02d:%02d:%02d", 10000L);
                i15 = 21;
                break;
            case "S_TEXT/WEBVTT":
                bArrU = u(j15, "%02d:%02d:%02d.%03d", 1000L);
                i15 = 25;
                break;
            case "S_TEXT/UTF8":
                bArrU = u(j15, "%02d:%02d:%02d,%03d", 1000L);
                i15 = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(bArrU, 0, bArr, i15, bArrU.length);
    }

    private int K(q qVar, d dVar, int i15, boolean z15) throws x {
        int i16;
        if ("S_TEXT/UTF8".equals(dVar.f71337c)) {
            L(qVar, f71283l0, i15);
            return s();
        }
        if ("S_TEXT/ASS".equals(dVar.f71337c) || "S_TEXT/SSA".equals(dVar.f71337c)) {
            L(qVar, f71285n0, i15);
            return s();
        }
        if ("S_TEXT/WEBVTT".equals(dVar.f71337c)) {
            L(qVar, f71286o0, i15);
            return s();
        }
        if (dVar.W) {
            zj.p.q(dVar.f71336b0);
            if (o.f(qVar, i15)) {
                dVar.f71336b0 = dVar.f71336b0.b().A0("audio/vnd.dts.hd").Q();
            }
            dVar.f71334a0.e(dVar.f71336b0);
            dVar.W = false;
            C();
        }
        s0 s0Var = dVar.f71334a0;
        if (!this.f71296d0) {
            if (dVar.f71344i) {
                this.W &= -1073741825;
                if (!this.f71298e0) {
                    qVar.readFully(this.f71305i.f(), 0, 1);
                    this.f71290a0++;
                    if ((this.f71305i.f()[0] & 128) == 128) {
                        throw x.a("Extension bit is set in signal byte", null);
                    }
                    this.f71304h0 = this.f71305i.f()[0];
                    this.f71298e0 = true;
                }
                byte b15 = this.f71304h0;
                if ((b15 & 1) == 1) {
                    boolean z16 = (b15 & 2) == 2;
                    this.W |= 1073741824;
                    if (!this.f71306i0) {
                        qVar.readFully(this.f71312n.f(), 0, 8);
                        this.f71290a0 += 8;
                        this.f71306i0 = true;
                        this.f71305i.f()[0] = (byte) ((z16 ? 128 : 0) | 8);
                        this.f71305i.f0(0);
                        s0Var.b(this.f71305i, 1, 1);
                        this.f71292b0++;
                        this.f71312n.f0(0);
                        s0Var.b(this.f71312n, 8, 1);
                        this.f71292b0 += 8;
                    }
                    if (z16) {
                        if (!this.f71300f0) {
                            qVar.readFully(this.f71305i.f(), 0, 1);
                            this.f71290a0++;
                            this.f71305i.f0(0);
                            this.f71302g0 = this.f71305i.Q();
                            this.f71300f0 = true;
                        }
                        int i17 = this.f71302g0 * 4;
                        this.f71305i.b0(i17);
                        qVar.readFully(this.f71305i.f(), 0, i17);
                        this.f71290a0 += i17;
                        short s15 = (short) ((this.f71302g0 / 2) + 1);
                        int i18 = (s15 * 6) + 2;
                        ByteBuffer byteBuffer = this.f71315q;
                        if (byteBuffer == null || byteBuffer.capacity() < i18) {
                            this.f71315q = ByteBuffer.allocate(i18);
                        }
                        this.f71315q.position(0);
                        this.f71315q.putShort(s15);
                        int i19 = 0;
                        int i25 = 0;
                        while (true) {
                            i16 = this.f71302g0;
                            if (i19 >= i16) {
                                break;
                            }
                            int iU = this.f71305i.U();
                            if (i19 % 2 == 0) {
                                this.f71315q.putShort((short) (iU - i25));
                            } else {
                                this.f71315q.putInt(iU - i25);
                            }
                            i19++;
                            i25 = iU;
                        }
                        int i26 = (i15 - this.f71290a0) - i25;
                        if (i16 % 2 == 1) {
                            this.f71315q.putInt(i26);
                        } else {
                            this.f71315q.putShort((short) i26);
                            this.f71315q.putInt(0);
                        }
                        this.f71313o.d0(this.f71315q.array(), i18);
                        s0Var.b(this.f71313o, i18, 1);
                        this.f71292b0 += i18;
                    }
                }
            } else {
                byte[] bArr = dVar.f71345j;
                if (bArr != null) {
                    this.f71310l.d0(bArr, bArr.length);
                }
            }
            if (dVar.r(z15)) {
                this.W |= 268435456;
                this.f71314p.b0(0);
                int iJ = (this.f71310l.j() + i15) - this.f71290a0;
                this.f71305i.b0(4);
                this.f71305i.f()[0] = (byte) ((iJ >> 24) & GF2Field.MASK);
                this.f71305i.f()[1] = (byte) ((iJ >> 16) & GF2Field.MASK);
                this.f71305i.f()[2] = (byte) ((iJ >> 8) & GF2Field.MASK);
                this.f71305i.f()[3] = (byte) (iJ & GF2Field.MASK);
                s0Var.b(this.f71305i, 4, 2);
                this.f71292b0 += 4;
            }
            this.f71296d0 = true;
        }
        int iJ2 = i15 + this.f71310l.j();
        if (!"V_MPEG4/ISO/AVC".equals(dVar.f71337c) && !"V_MPEGH/ISO/HEVC".equals(dVar.f71337c)) {
            if (dVar.V != null) {
                zj.p.w(this.f71310l.j() == 0);
                dVar.V.d(qVar);
            }
            while (true) {
                int i27 = this.f71290a0;
                if (i27 >= iJ2) {
                    break;
                }
                int iM = M(qVar, s0Var, iJ2 - i27);
                this.f71290a0 += iM;
                this.f71292b0 += iM;
            }
        } else {
            byte[] bArrF = this.f71303h.f();
            bArrF[0] = 0;
            bArrF[1] = 0;
            bArrF[2] = 0;
            int i28 = dVar.f71338c0;
            int i29 = 4 - i28;
            while (this.f71290a0 < iJ2) {
                int i35 = this.f71294c0;
                if (i35 == 0) {
                    N(qVar, bArrF, i29, i28);
                    this.f71290a0 += i28;
                    this.f71303h.f0(0);
                    this.f71294c0 = this.f71303h.U();
                    this.f71301g.f0(0);
                    s0Var.a(this.f71301g, 4);
                    this.f71292b0 += 4;
                } else {
                    int iM2 = M(qVar, s0Var, i35);
                    this.f71290a0 += iM2;
                    this.f71292b0 += iM2;
                    this.f71294c0 -= iM2;
                }
            }
        }
        if ("A_VORBIS".equals(dVar.f71337c)) {
            this.f71307j.f0(0);
            s0Var.a(this.f71307j, 4);
            this.f71292b0 += 4;
        }
        return s();
    }

    private void L(q qVar, byte[] bArr, int i15) {
        int length = bArr.length + i15;
        if (this.f71311m.b() < length) {
            this.f71311m.c0(Arrays.copyOf(bArr, length + i15));
        } else {
            System.arraycopy(bArr, 0, this.f71311m.f(), 0, bArr.length);
        }
        qVar.readFully(this.f71311m.f(), bArr.length, i15);
        this.f71311m.f0(0);
        this.f71311m.e0(length);
    }

    private int M(q qVar, s0 s0Var, int i15) {
        int iA = this.f71310l.a();
        if (iA <= 0) {
            return s0Var.f(qVar, i15, false);
        }
        int iMin = Math.min(i15, iA);
        s0Var.a(this.f71310l, iMin);
        return iMin;
    }

    private void N(q qVar, byte[] bArr, int i15, int i16) {
        int iMin = Math.min(i16, this.f71310l.a());
        qVar.readFully(bArr, i15 + iMin, i16 - iMin);
        if (iMin > 0) {
            this.f71310l.u(bArr, i15, iMin);
        }
    }

    public static /* synthetic */ p[] h() {
        return new p[]{new e(s.a.f117245a, 2)};
    }

    private void l(int i15) throws x {
        if (this.D) {
            return;
        }
        throw x.a("Element " + i15 + " must be in a Cues", null);
    }

    private void m(int i15) throws x {
        if (this.f71323y != null) {
            return;
        }
        throw x.a("Element " + i15 + " must be in a TrackEntry", null);
    }

    private void n() {
        zj.p.q(this.f71308j0);
    }

    private void p(d dVar, long j15, int i15, int i16, int i17) {
        int iJ;
        t0 t0Var = dVar.V;
        if (t0Var != null) {
            t0Var.c(dVar.f71334a0, j15, i15, i16, i17, dVar.f71346k);
        } else {
            if ("S_TEXT/UTF8".equals(dVar.f71337c) || "S_TEXT/ASS".equals(dVar.f71337c) || "S_TEXT/SSA".equals(dVar.f71337c) || "S_TEXT/WEBVTT".equals(dVar.f71337c)) {
                if (this.S > 1) {
                    t.h("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j16 = this.Q;
                    if (j16 == -9223372036854775807L) {
                        t.h("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        H(dVar.f71337c, j16, this.f71311m.f());
                        for (int iG = this.f71311m.g(); iG < this.f71311m.j(); iG++) {
                            if (this.f71311m.f()[iG] == 0) {
                                this.f71311m.e0(iG);
                                break;
                            }
                        }
                        s0 s0Var = dVar.f71334a0;
                        c0 c0Var = this.f71311m;
                        s0Var.a(c0Var, c0Var.j());
                        iJ = i16 + this.f71311m.j();
                    }
                }
                iJ = i16;
            } else {
                iJ = i16;
            }
            if ((i15 & 268435456) != 0) {
                if (this.S > 1) {
                    this.f71314p.b0(0);
                } else {
                    int iJ2 = this.f71314p.j();
                    dVar.f71334a0.b(this.f71314p, iJ2, 2);
                    iJ += iJ2;
                }
            }
            dVar.f71334a0.c(j15, i15, iJ, i17, dVar.f71346k);
        }
        this.N = true;
    }

    private static int[] r(int[] iArr, int i15) {
        if (iArr == null) {
            return new int[i15];
        }
        return iArr.length >= i15 ? iArr : new int[Math.max(iArr.length * 2, i15)];
    }

    private int s() {
        int i15 = this.f71292b0;
        F();
        return i15;
    }

    private static byte[] u(long j15, String str, long j16) {
        zj.p.d(j15 != -9223372036854775807L);
        int i15 = (int) (j15 / 3600000000L);
        long j17 = j15 - (((long) i15) * 3600000000L);
        int i16 = (int) (j17 / 60000000);
        long j18 = j17 - (((long) i16) * 60000000);
        int i17 = (int) (j18 / 1000000);
        return o0.p0(String.format(Locale.US, str, Integer.valueOf(i15), Integer.valueOf(i16), Integer.valueOf(i17), Integer.valueOf((int) ((j18 - (((long) i17) * 1000000)) / j16))));
    }

    protected boolean B(int i15) {
        return i15 == 357149030 || i15 == 524531317 || i15 == 475249515 || i15 == 374648427;
    }

    protected void I(int i15, long j15, long j16) throws x {
        n();
        if (i15 == 160) {
            this.Y = false;
            this.Z = 0L;
            return;
        }
        if (i15 == 174) {
            d dVar = new d();
            this.f71323y = dVar;
            dVar.f71333a = this.f71321w;
            return;
        }
        if (i15 == 183) {
            if (this.f71324z) {
                return;
            }
            l(i15);
            this.F = -1;
            this.G = -1L;
            this.H = -1L;
            return;
        }
        if (i15 == 187) {
            if (this.f71324z) {
                return;
            }
            l(i15);
            this.E = -9223372036854775807L;
            return;
        }
        if (i15 == 19899) {
            this.A = -1;
            this.B = -1L;
            return;
        }
        if (i15 == 20533) {
            v(i15).f71344i = true;
            return;
        }
        if (i15 == 21968) {
            v(i15).f71361z = true;
            return;
        }
        if (i15 == 408125543) {
            long j17 = this.f71317s;
            if (j17 != -1 && j17 != j15) {
                throw x.a("Multiple Segment elements not supported", null);
            }
            this.f71317s = j15;
            this.f71316r = j16;
            return;
        }
        if (i15 == 475249515) {
            if (this.f71324z) {
                return;
            }
            this.D = true;
        } else if (i15 == 524531317 && !this.f71324z) {
            if (this.f71295d && this.K != -1) {
                this.J = true;
            } else {
                this.f71308j0.f(new l0.b(this.f71320v));
                this.f71324z = true;
            }
        }
    }

    protected void J(int i15, String str) throws x {
        if (i15 == 134) {
            v(i15).f71337c = str;
            return;
        }
        if (i15 != 17026) {
            if (i15 == 21358) {
                v(i15).f71335b = str;
                return;
            } else {
                if (i15 != 2274716) {
                    return;
                }
                v(i15).Z = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            this.f71321w = Objects.equals(str, "webm");
            return;
        }
        throw x.a("DocType " + str + " not supported", null);
    }

    @Override // o8.p
    public void a(long j15, long j16) {
        this.M = -9223372036854775807L;
        this.O = 0;
        this.f71289a.reset();
        this.f71291b.e();
        F();
        this.D = false;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        if (!this.f71324z) {
            this.C.clear();
        }
        for (int i15 = 0; i15 < this.f71293c.size(); i15++) {
            this.f71293c.valueAt(i15).q();
        }
    }

    @Override // o8.p
    public final void b() {
    }

    @Override // o8.p
    public final boolean c(q qVar) {
        return new f().b(qVar);
    }

    @Override // o8.p
    public final void d(r rVar) {
        if (this.f71297e) {
            rVar = new l9.t(rVar, this.f71299f);
        }
        this.f71308j0 = rVar;
    }

    @Override // o8.p
    public final int g(q qVar, k0 k0Var) {
        this.N = false;
        boolean zA = true;
        while (zA && !this.N) {
            zA = this.f71289a.a(qVar);
            if (zA && D(k0Var, qVar.getPosition())) {
                return 1;
            }
        }
        if (zA) {
            return 0;
        }
        for (int i15 = 0; i15 < this.f71293c.size(); i15++) {
            d dVarValueAt = this.f71293c.valueAt(i15);
            dVarValueAt.g();
            dVarValueAt.m();
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0299  */
    protected void o(int i15, int i16, q qVar) throws x {
        int i17;
        int i18;
        int i19;
        int i25;
        int i26;
        int i27;
        long j15;
        int i28;
        int i29;
        int i35;
        int i36;
        int i37 = 2;
        int i38 = 0;
        int i39 = 1;
        if (i15 != 161 && i15 != 163) {
            if (i15 == 165) {
                if (this.O != 2) {
                    return;
                }
                y(this.f71293c.get(this.U), this.X, qVar, i16);
                return;
            }
            if (i15 == 16877) {
                x(v(i15), qVar, i16);
                return;
            }
            if (i15 == 16981) {
                m(i15);
                byte[] bArr = new byte[i16];
                this.f71323y.f71345j = bArr;
                qVar.readFully(bArr, 0, i16);
                return;
            }
            if (i15 == 18402) {
                byte[] bArr2 = new byte[i16];
                qVar.readFully(bArr2, 0, i16);
                v(i15).f71346k = new s0.a(1, bArr2, 0, 0);
                return;
            }
            if (i15 == 21419) {
                Arrays.fill(this.f71309k.f(), (byte) 0);
                qVar.readFully(this.f71309k.f(), 4 - i16, i16);
                this.f71309k.f0(0);
                this.A = (int) this.f71309k.S();
                return;
            }
            if (i15 == 25506) {
                m(i15);
                byte[] bArr3 = new byte[i16];
                this.f71323y.f71347l = bArr3;
                qVar.readFully(bArr3, 0, i16);
                return;
            }
            if (i15 != 30322) {
                throw x.a("Unexpected id: " + i15, null);
            }
            m(i15);
            byte[] bArr4 = new byte[i16];
            this.f71323y.f71359x = bArr4;
            qVar.readFully(bArr4, 0, i16);
            return;
        }
        int i45 = 8;
        if (this.O == 0) {
            this.U = (int) this.f71291b.d(qVar, false, true, 8);
            this.V = this.f71291b.b();
            this.Q = -9223372036854775807L;
            this.O = 1;
            this.f71305i.b0(0);
        }
        d dVar = this.f71293c.get(this.U);
        if (dVar == null) {
            qVar.n(i16 - this.V);
            this.O = 0;
            return;
        }
        dVar.g();
        if (this.O == 1) {
            E(qVar, 3);
            int i46 = (this.f71305i.f()[2] & 6) >> 1;
            byte b15 = 255;
            if (i46 == 0) {
                this.S = 1;
                int[] iArrR = r(this.T, 1);
                this.T = iArrR;
                iArrR[0] = (i16 - this.V) - 3;
            } else {
                E(qVar, 4);
                int i47 = (this.f71305i.f()[3] & 255) + 1;
                this.S = i47;
                int[] iArrR2 = r(this.T, i47);
                this.T = iArrR2;
                if (i46 == 2) {
                    int i48 = (i16 - this.V) - 4;
                    int i49 = this.S;
                    Arrays.fill(iArrR2, 0, i49, i48 / i49);
                } else {
                    if (i46 == 1) {
                        int i55 = 0;
                        int i56 = 0;
                        int i57 = 4;
                        while (true) {
                            i28 = this.S;
                            if (i55 >= i28 - 1) {
                                break;
                            }
                            this.T[i55] = 0;
                            while (true) {
                                i29 = i57 + 1;
                                E(qVar, i29);
                                int i58 = this.f71305i.f()[i57] & 255;
                                int[] iArr = this.T;
                                i35 = iArr[i55] + i58;
                                iArr[i55] = i35;
                                if (i58 != 255) {
                                    break;
                                } else {
                                    i57 = i29;
                                }
                            }
                            i56 += i35;
                            i55++;
                            i57 = i29;
                        }
                        this.T[i28 - 1] = ((i16 - this.V) - i57) - i56;
                    } else {
                        if (i46 != 3) {
                            throw x.a("Unexpected lacing value: " + i46, null);
                        }
                        int i59 = 0;
                        int i65 = 0;
                        int i66 = 4;
                        while (true) {
                            int i67 = this.S;
                            i17 = i38;
                            if (i59 >= i67 - 1) {
                                i18 = i37;
                                i19 = i39;
                                this.T[i67 - 1] = ((i16 - this.V) - i66) - i65;
                                break;
                            }
                            this.T[i59] = i17;
                            int i68 = i66 + 1;
                            E(qVar, i68);
                            if (this.f71305i.f()[i66] == 0) {
                                throw x.a("No valid varint length mask found", null);
                            }
                            int i69 = i17;
                            while (true) {
                                if (i69 >= i45) {
                                    i25 = i37;
                                    i26 = i39;
                                    i27 = i45;
                                    j15 = 0;
                                    break;
                                }
                                i27 = i45;
                                int i75 = i39 << (7 - i69);
                                i25 = i37;
                                if ((this.f71305i.f()[i66] & i75) != 0) {
                                    i68 += i69;
                                    E(qVar, i68);
                                    int i76 = i66 + 1;
                                    i26 = i39;
                                    j15 = this.f71305i.f()[i66] & b15 & (~i75);
                                    while (true) {
                                        int i77 = i76;
                                        if (i77 >= i68) {
                                            break;
                                        }
                                        i76 = i77 + 1;
                                        j15 = (j15 << i27) | ((long) (this.f71305i.f()[i77] & b15));
                                        b15 = 255;
                                    }
                                    if (i59 <= 0) {
                                        break;
                                    }
                                    j15 -= (1 << ((i69 * 7) + 6)) - 1;
                                    break;
                                }
                                i69++;
                                i37 = i25;
                                i45 = i27;
                                b15 = 255;
                            }
                            i66 = i68;
                            if (j15 < -2147483648L || j15 > 2147483647L) {
                                throw x.a("EBML lacing sample size out of range.", null);
                            }
                            int i78 = (int) j15;
                            int[] iArr2 = this.T;
                            if (i59 != 0) {
                                i78 += iArr2[i59 - 1];
                            }
                            iArr2[i59] = i78;
                            i65 += i78;
                            i59++;
                            i38 = i17;
                            i37 = i25;
                            i45 = i27;
                            i39 = i26;
                            b15 = 255;
                        }
                    }
                    this.P = this.M + G((this.f71305i.f()[i17] << 8) | (this.f71305i.f()[i19] & 255));
                    if (dVar.f71340e != i19 || (i15 == 163 && (this.f71305i.f()[i18] & 128) == 128)) {
                        i36 = 1;
                    } else {
                        i36 = i17;
                    }
                    this.W = i36;
                    this.O = i18;
                    this.R = i17;
                }
            }
            i18 = 2;
            i17 = 0;
            i19 = 1;
            this.P = this.M + G((this.f71305i.f()[i17] << 8) | (this.f71305i.f()[i19] & 255));
            if (dVar.f71340e != i19) {
                i36 = 1;
            } else {
                i36 = 1;
            }
            this.W = i36;
            this.O = i18;
            this.R = i17;
        }
        if (i15 == 163) {
            while (true) {
                int i79 = this.R;
                if (i79 >= this.S) {
                    this.O = 0;
                    return;
                }
                int iK = K(qVar, dVar, this.T[i79], false);
                d dVar2 = dVar;
                p(dVar2, this.P + ((long) ((this.R * dVar.f71341f) / 1000)), this.W, iK, 0);
                this.R++;
                dVar = dVar2;
            }
        } else {
            while (true) {
                int i85 = this.R;
                if (i85 >= this.S) {
                    return;
                }
                int[] iArr3 = this.T;
                iArr3[i85] = K(qVar, dVar, iArr3[i85], true);
                this.R++;
            }
        }
    }

    protected void q(int i15) throws x {
        int i16;
        n();
        if (i15 == 160) {
            if (this.O != 2) {
                return;
            }
            d dVar = this.f71293c.get(this.U);
            dVar.g();
            if (this.Z > 0 && "A_OPUS".equals(dVar.f71337c)) {
                this.f71314p.c0(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.Z).array());
            }
            int i17 = 0;
            for (int i18 = 0; i18 < this.S; i18++) {
                i17 += this.T[i18];
            }
            int i19 = 0;
            while (i19 < this.S) {
                long j15 = this.P + ((long) ((dVar.f71341f * i19) / 1000));
                int i25 = this.W;
                if (i19 == 0 && !this.Y) {
                    i25 |= 1;
                }
                int i26 = this.T[i19];
                int i27 = i17 - i26;
                p(dVar, j15, i25, i26, i27);
                i19++;
                i17 = i27;
            }
            this.O = 0;
            return;
        }
        if (i15 == 174) {
            d dVar2 = (d) zj.p.q(this.f71323y);
            String str = dVar2.f71337c;
            if (str == null) {
                throw x.a("CodecId is missing in TrackEntry element", null);
            }
            if (A(str)) {
                dVar2.k(dVar2.f71339d);
                dVar2.f71334a0 = this.f71308j0.v(dVar2.f71339d, dVar2.f71340e);
                this.f71293c.put(dVar2.f71339d, dVar2);
            }
            this.f71323y = null;
            return;
        }
        if (i15 == 183) {
            if (this.f71324z) {
                return;
            }
            l(i15);
            if (this.E == -9223372036854775807L || (i16 = this.F) == -1 || this.G == -1) {
                return;
            }
            List<c.a> arrayList = this.C.get(i16);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.C.put(this.F, arrayList);
            }
            arrayList.add(new c.a(this.E, this.f71317s + this.G, this.H));
            return;
        }
        if (i15 == 19899) {
            int i28 = this.A;
            if (i28 != -1) {
                long j16 = this.B;
                if (j16 != -1) {
                    if (i28 == 475249515) {
                        this.K = j16;
                        return;
                    }
                    return;
                }
            }
            throw x.a("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i15 == 25152) {
            m(i15);
            d dVar3 = this.f71323y;
            if (dVar3.f71344i) {
                if (dVar3.f71346k == null) {
                    throw x.a("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                dVar3.f71348m = new l(new l.b(t7.f.f188170b, "video/webm", this.f71323y.f71346k.f143192b));
                return;
            }
            return;
        }
        if (i15 == 28032) {
            m(i15);
            d dVar4 = this.f71323y;
            if (dVar4.f71344i && dVar4.f71345j != null) {
                throw x.a("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i15 == 357149030) {
            if (this.f71318t == -9223372036854775807L) {
                this.f71318t = 1000000L;
            }
            long j17 = this.f71319u;
            if (j17 != -9223372036854775807L) {
                this.f71320v = G(j17);
                return;
            }
            return;
        }
        if (i15 != 374648427) {
            if (i15 == 475249515 && !this.f71324z) {
                int i29 = 0;
                while (true) {
                    if (i29 < this.C.size()) {
                        if (!this.C.valueAt(i29).isEmpty()) {
                            if (this.f71320v != -9223372036854775807L) {
                                for (int i35 = 0; i35 < this.C.size(); i35++) {
                                    Collections.sort(this.C.valueAt(i35));
                                }
                                this.f71308j0.f(new c(this.C, this.f71320v, this.I, this.f71317s, this.f71316r));
                                break;
                            }
                            break;
                        }
                        i29++;
                    }
                    this.f71308j0.f(new l0.b(this.f71320v));
                    break;
                }
                this.f71324z = true;
                this.D = false;
                for (int i36 = 0; i36 < this.f71293c.size(); i36++) {
                    d dVarValueAt = this.f71293c.valueAt(i36);
                    dVarValueAt.l(this.C, this.f71320v, this.f71317s, this.f71316r);
                    if (!dVarValueAt.W) {
                        dVarValueAt.g();
                        dVarValueAt.f71334a0.e((t7.p) zj.p.q(dVarValueAt.f71336b0));
                    }
                }
                C();
                return;
            }
            return;
        }
        if (this.f71293c.size() == 0) {
            throw x.a("No valid tracks were found", null);
        }
        boolean z15 = !this.f71295d || this.K == -1;
        int i37 = -1;
        int i38 = -1;
        int i39 = -1;
        int i45 = -1;
        for (int i46 = 0; i46 < this.f71293c.size(); i46++) {
            d dVarValueAt2 = this.f71293c.valueAt(i46);
            int i47 = dVarValueAt2.f71340e;
            if (i47 == 2) {
                if (dVarValueAt2.Y) {
                    i37 = dVarValueAt2.f71339d;
                }
                if (i38 == -1) {
                    i38 = dVarValueAt2.f71339d;
                }
            } else if (i47 == 1) {
                if (dVarValueAt2.Y) {
                    i39 = dVarValueAt2.f71339d;
                }
                if (i45 == -1) {
                    i45 = dVarValueAt2.f71339d;
                }
            }
            if (z15) {
                dVarValueAt2.g();
                if (!dVarValueAt2.W) {
                    dVarValueAt2.f71334a0.e((t7.p) zj.p.q(dVarValueAt2.f71336b0));
                }
            }
        }
        if (i37 != -1) {
            this.I = i37;
        } else if (i38 != -1) {
            this.I = i38;
        } else if (i39 != -1) {
            this.I = i39;
        } else if (i45 != -1) {
            this.I = i45;
        } else {
            this.I = this.f71293c.size() > 0 ? this.f71293c.valueAt(0).f71339d : -1;
        }
        if (z15) {
            C();
        }
    }

    protected void t(int i15, double d15) {
        if (i15 == 181) {
            v(i15).S = (int) d15;
            return;
        }
        if (i15 == 17545) {
            this.f71319u = (long) d15;
            return;
        }
        switch (i15) {
            case 21969:
                v(i15).F = (float) d15;
                break;
            case 21970:
                v(i15).G = (float) d15;
                break;
            case 21971:
                v(i15).H = (float) d15;
                break;
            case 21972:
                v(i15).I = (float) d15;
                break;
            case 21973:
                v(i15).J = (float) d15;
                break;
            case 21974:
                v(i15).K = (float) d15;
                break;
            case 21975:
                v(i15).L = (float) d15;
                break;
            case 21976:
                v(i15).M = (float) d15;
                break;
            case 21977:
                v(i15).N = (float) d15;
                break;
            case 21978:
                v(i15).O = (float) d15;
                break;
            default:
                switch (i15) {
                    case 30323:
                        v(i15).f71356u = (float) d15;
                        break;
                    case 30324:
                        v(i15).f71357v = (float) d15;
                        break;
                    case 30325:
                        v(i15).f71358w = (float) d15;
                        break;
                }
                break;
        }
    }

    protected d v(int i15) throws x {
        m(i15);
        return this.f71323y;
    }

    protected int w(int i15) {
        switch (i15) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 240:
            case 241:
            case 247:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21938:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30114:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case BERTags.FLAGS /* 224 */:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    protected void x(d dVar, q qVar, int i15) {
        if (dVar.f71343h != 1685485123 && dVar.f71343h != 1685480259) {
            qVar.n(i15);
            return;
        }
        byte[] bArr = new byte[i15];
        dVar.P = bArr;
        qVar.readFully(bArr, 0, i15);
    }

    protected void y(d dVar, int i15, q qVar, int i16) {
        if (i15 != 4 || !"V_VP9".equals(dVar.f71337c)) {
            qVar.n(i16);
        } else {
            this.f71314p.b0(i16);
            qVar.readFully(this.f71314p.f(), 0, i16);
        }
    }

    protected void z(int i15, long j15) throws x {
        if (i15 == 240) {
            if (this.f71324z) {
                return;
            }
            l(i15);
            if (this.H == -1) {
                this.H = j15;
                return;
            }
            return;
        }
        if (i15 == 241) {
            if (this.f71324z) {
                return;
            }
            l(i15);
            if (this.G == -1) {
                this.G = j15;
                return;
            }
            return;
        }
        if (i15 == 20529) {
            if (j15 == 0) {
                return;
            }
            throw x.a("ContentEncodingOrder " + j15 + " not supported", null);
        }
        if (i15 == 20530) {
            if (j15 == 1) {
                return;
            }
            throw x.a("ContentEncodingScope " + j15 + " not supported", null);
        }
        switch (i15) {
            case 131:
                int i16 = (int) j15;
                if (i16 == 1) {
                    v(i15).f71340e = 2;
                    return;
                }
                if (i16 == 2) {
                    v(i15).f71340e = 1;
                    return;
                }
                if (i16 == 17) {
                    v(i15).f71340e = 3;
                    return;
                } else if (i16 != 33) {
                    v(i15).f71340e = -1;
                    return;
                } else {
                    v(i15).f71340e = 5;
                    return;
                }
            case 136:
                v(i15).Y = j15 == 1;
                return;
            case 155:
                this.Q = G(j15);
                return;
            case 159:
                v(i15).Q = (int) j15;
                return;
            case 176:
                v(i15).f71349n = (int) j15;
                return;
            case 179:
                if (this.f71324z) {
                    return;
                }
                l(i15);
                this.E = G(j15);
                return;
            case 186:
                v(i15).f71350o = (int) j15;
                return;
            case 215:
                v(i15).f71339d = (int) j15;
                return;
            case 231:
                this.M = G(j15);
                return;
            case 238:
                this.X = (int) j15;
                return;
            case 247:
                if (this.f71324z) {
                    return;
                }
                l(i15);
                this.F = (int) j15;
                return;
            case 251:
                this.Y = true;
                return;
            case 16871:
                v(i15).f71343h = (int) j15;
                return;
            case 16980:
                if (j15 == 3) {
                    return;
                }
                throw x.a("ContentCompAlgo " + j15 + " not supported", null);
            case 17029:
                if (j15 < 1 || j15 > 2) {
                    throw x.a("DocTypeReadVersion " + j15 + " not supported", null);
                }
                return;
            case 17143:
                if (j15 == 1) {
                    return;
                }
                throw x.a("EBMLReadVersion " + j15 + " not supported", null);
            case 18401:
                if (j15 == 5) {
                    return;
                }
                throw x.a("ContentEncAlgo " + j15 + " not supported", null);
            case 18408:
                if (j15 == 1) {
                    return;
                }
                throw x.a("AESSettingsCipherMode " + j15 + " not supported", null);
            case 21420:
                this.B = j15 + this.f71317s;
                return;
            case 21432:
                int i17 = (int) j15;
                m(i15);
                if (i17 == 0) {
                    this.f71323y.f71360y = 0;
                    return;
                }
                if (i17 == 1) {
                    this.f71323y.f71360y = 2;
                    return;
                } else if (i17 == 3) {
                    this.f71323y.f71360y = 1;
                    return;
                } else {
                    if (i17 != 15) {
                        return;
                    }
                    this.f71323y.f71360y = 3;
                    return;
                }
            case 21680:
                v(i15).f71352q = (int) j15;
                return;
            case 21682:
                v(i15).f71354s = (int) j15;
                return;
            case 21690:
                v(i15).f71353r = (int) j15;
                return;
            case 21930:
                v(i15).X = j15 == 1;
                return;
            case 21938:
                m(i15);
                d dVar = this.f71323y;
                dVar.f71361z = true;
                dVar.f71351p = (int) j15;
                return;
            case 21998:
                v(i15).f71342g = (int) j15;
                return;
            case 22186:
                v(i15).T = j15;
                return;
            case 22203:
                v(i15).U = j15;
                return;
            case 25188:
                v(i15).R = (int) j15;
                return;
            case 30114:
                this.Z = j15;
                return;
            case 30321:
                m(i15);
                int i18 = (int) j15;
                if (i18 == 0) {
                    this.f71323y.f71355t = 0;
                    return;
                }
                if (i18 == 1) {
                    this.f71323y.f71355t = 1;
                    return;
                } else if (i18 == 2) {
                    this.f71323y.f71355t = 2;
                    return;
                } else {
                    if (i18 != 3) {
                        return;
                    }
                    this.f71323y.f71355t = 3;
                    return;
                }
            case 2352003:
                v(i15).f71341f = (int) j15;
                return;
            case 2807729:
                this.f71318t = j15;
                return;
            default:
                switch (i15) {
                    case 21945:
                        m(i15);
                        int i19 = (int) j15;
                        if (i19 == 1) {
                            this.f71323y.C = 2;
                            return;
                        } else {
                            if (i19 != 2) {
                                return;
                            }
                            this.f71323y.C = 1;
                            return;
                        }
                    case 21946:
                        m(i15);
                        int iK = t7.g.k((int) j15);
                        if (iK != -1) {
                            this.f71323y.B = iK;
                            return;
                        }
                        return;
                    case 21947:
                        m(i15);
                        this.f71323y.f71361z = true;
                        int iJ = t7.g.j((int) j15);
                        if (iJ != -1) {
                            this.f71323y.A = iJ;
                            return;
                        }
                        return;
                    case 21948:
                        v(i15).D = (int) j15;
                        return;
                    case 21949:
                        v(i15).E = (int) j15;
                        return;
                    default:
                        return;
                }
        }
    }

    e(g9.c cVar, int i15, s.a aVar) {
        this.f71317s = -1L;
        this.f71318t = -9223372036854775807L;
        this.f71319u = -9223372036854775807L;
        this.f71320v = -9223372036854775807L;
        this.E = -9223372036854775807L;
        this.F = -1;
        this.G = -1L;
        this.H = -1L;
        this.I = -1;
        this.K = -1L;
        this.L = -1L;
        this.M = -9223372036854775807L;
        this.f71289a = cVar;
        cVar.b(new b());
        this.f71299f = aVar;
        this.C = new SparseArray<>();
        this.f71295d = (i15 & 1) == 0;
        this.f71297e = (i15 & 2) == 0;
        this.f71291b = new g();
        this.f71293c = new SparseArray<>();
        this.f71305i = new c0(4);
        this.f71307j = new c0(ByteBuffer.allocate(4).putInt(-1).array());
        this.f71309k = new c0(4);
        this.f71301g = new c0(x7.g.f217160a);
        this.f71303h = new c0(4);
        this.f71310l = new c0();
        this.f71311m = new c0();
        this.f71312n = new c0(8);
        this.f71313o = new c0();
        this.f71314p = new c0();
        this.T = new int[1];
        this.f71322x = true;
    }
}
