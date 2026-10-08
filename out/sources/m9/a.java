package m9;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l9.k;
import l9.q;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.asn1.eac.EACTags;
import org.bouncycastle.asn1.x509.DisplayText;
import org.bouncycastle.math.Primes;
import w7.c0;
import w7.t;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f124597i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f124598j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f124599k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final long f124600l;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List<v7.a> f124603o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<v7.a> f124604p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f124605q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f124606r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f124607s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f124608t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private byte f124609u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private byte f124610v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f124612x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f124613y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int[] f124595z = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] A = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] B = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};
    private static final int[] C = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    private static final int[] D = {174, 176, 189, 191, 8482, 162, 163, 9834, BERTags.FLAGS, 32, 232, 226, 234, 238, 244, 251};
    private static final int[] E = {193, 201, Primes.SMALL_FACTOR_LIMIT, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, 202, 203, 235, 206, 207, 239, 212, 217, 249, 219, 171, 187};
    private static final int[] F = {195, 227, 205, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] G = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c0 f124596h = new c0();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ArrayList<C3061a> f124601m = new ArrayList<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private C3061a f124602n = new C3061a(0, 4);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f124611w = 0;

    /* JADX INFO: renamed from: m9.a$a, reason: collision with other inner class name */
    private static final class C3061a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<C3062a> f124614a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List<SpannableString> f124615b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final StringBuilder f124616c = new StringBuilder();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f124617d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f124618e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f124619f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f124620g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f124621h;

        /* JADX INFO: renamed from: m9.a$a$a, reason: collision with other inner class name */
        private static class C3062a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f124622a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final boolean f124623b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f124624c;

            public C3062a(int i15, boolean z15, int i16) {
                this.f124622a = i15;
                this.f124623b = z15;
                this.f124624c = i16;
            }
        }

        public C3061a(int i15, int i16) {
            j(i15);
            this.f124621h = i16;
        }

        private SpannableString h() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f124616c);
            int length = spannableStringBuilder.length();
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = 0;
            int i25 = 0;
            boolean z15 = false;
            while (i19 < this.f124614a.size()) {
                C3062a c3062a = this.f124614a.get(i19);
                boolean z16 = c3062a.f124623b;
                int i26 = c3062a.f124622a;
                if (i26 != 8) {
                    boolean z17 = i26 == 7;
                    if (i26 != 7) {
                        i18 = a.B[i26];
                    }
                    z15 = z17;
                }
                int i27 = c3062a.f124624c;
                i19++;
                if (i27 != (i19 < this.f124614a.size() ? this.f124614a.get(i19).f124624c : length)) {
                    if (i15 != -1 && !z16) {
                        q(spannableStringBuilder, i15, i27);
                        i15 = -1;
                    } else if (i15 == -1 && z16) {
                        i15 = i27;
                    }
                    if (i16 != -1 && !z15) {
                        o(spannableStringBuilder, i16, i27);
                        i16 = -1;
                    } else if (i16 == -1 && z15) {
                        i16 = i27;
                    }
                    if (i18 != i17) {
                        n(spannableStringBuilder, i25, i27, i17);
                        i17 = i18;
                        i25 = i27;
                    }
                }
            }
            if (i15 != -1 && i15 != length) {
                q(spannableStringBuilder, i15, length);
            }
            if (i16 != -1 && i16 != length) {
                o(spannableStringBuilder, i16, length);
            }
            if (i25 != length) {
                n(spannableStringBuilder, i25, length, i17);
            }
            return new SpannableString(spannableStringBuilder);
        }

        private static void n(SpannableStringBuilder spannableStringBuilder, int i15, int i16, int i17) {
            if (i17 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i17), i15, i16, 33);
        }

        private static void o(SpannableStringBuilder spannableStringBuilder, int i15, int i16) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i15, i16, 33);
        }

        private static void q(SpannableStringBuilder spannableStringBuilder, int i15, int i16) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i15, i16, 33);
        }

        public void e(char c15) {
            if (this.f124616c.length() < 32) {
                this.f124616c.append(c15);
            }
        }

        public void f() {
            int length = this.f124616c.length();
            if (length > 0) {
                this.f124616c.delete(length - 1, length);
                for (int size = this.f124614a.size() - 1; size >= 0; size--) {
                    C3062a c3062a = this.f124614a.get(size);
                    int i15 = c3062a.f124624c;
                    if (i15 != length) {
                        return;
                    }
                    c3062a.f124624c = i15 - 1;
                }
            }
        }

        public v7.a g(int i15) {
            float f15;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i16 = 0; i16 < this.f124615b.size(); i16++) {
                spannableStringBuilder.append((CharSequence) this.f124615b.get(i16));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) h());
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int i17 = this.f124618e + this.f124619f;
            int length = (32 - i17) - spannableStringBuilder.length();
            int i18 = i17 - length;
            if (i15 == Integer.MIN_VALUE) {
                i15 = (this.f124620g != 2 || (Math.abs(i18) >= 3 && length >= 0)) ? (this.f124620g != 2 || i18 <= 0) ? 0 : 2 : 1;
            }
            if (i15 != 1) {
                if (i15 == 2) {
                    i17 = 32 - length;
                }
                f15 = ((i17 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f15 = 0.5f;
            }
            int i19 = this.f124617d;
            if (i19 > 7) {
                i19 -= 17;
            } else if (this.f124620g == 1) {
                i19 -= this.f124621h - 1;
            }
            return new v7.a.b().o(spannableStringBuilder).p(Layout.Alignment.ALIGN_NORMAL).h(i19, 1).k(f15).l(i15).a();
        }

        public boolean i() {
            return this.f124614a.isEmpty() && this.f124615b.isEmpty() && this.f124616c.length() == 0;
        }

        public void j(int i15) {
            this.f124620g = i15;
            this.f124614a.clear();
            this.f124615b.clear();
            this.f124616c.setLength(0);
            this.f124617d = 15;
            this.f124618e = 0;
            this.f124619f = 0;
        }

        public void k() {
            this.f124615b.add(h());
            this.f124616c.setLength(0);
            this.f124614a.clear();
            int iMin = Math.min(this.f124621h, this.f124617d);
            while (this.f124615b.size() >= iMin) {
                this.f124615b.remove(0);
            }
        }

        public void l(int i15) {
            this.f124620g = i15;
        }

        public void m(int i15) {
            this.f124621h = i15;
        }

        public void p(int i15, boolean z15) {
            this.f124614a.add(new C3062a(i15, z15, this.f124616c.length()));
        }
    }

    public a(String str, int i15, long j15) {
        if (j15 != -9223372036854775807L) {
            p.d(j15 >= 16000);
            this.f124600l = j15 * 1000;
        } else {
            this.f124600l = -9223372036854775807L;
        }
        this.f124597i = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i15 == 1) {
            this.f124599k = 0;
            this.f124598j = 0;
        } else if (i15 == 2) {
            this.f124599k = 1;
            this.f124598j = 0;
        } else if (i15 == 3) {
            this.f124599k = 0;
            this.f124598j = 1;
        } else if (i15 != 4) {
            t.h("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.f124599k = 0;
            this.f124598j = 0;
        } else {
            this.f124599k = 1;
            this.f124598j = 1;
        }
        P(0);
        O();
        this.f124612x = true;
        this.f124613y = -9223372036854775807L;
    }

    private void A(byte b15) {
        if (b15 == 32) {
            P(2);
            return;
        }
        if (b15 == 41) {
            P(3);
            return;
        }
        switch (b15) {
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                P(1);
                Q(2);
                break;
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                P(1);
                Q(3);
                break;
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
                P(1);
                Q(4);
                break;
            default:
                int i15 = this.f124605q;
                if (i15 != 0) {
                    if (b15 != 33) {
                        switch (b15) {
                            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                                this.f124603o = Collections.EMPTY_LIST;
                                if (i15 == 1 || i15 == 3) {
                                    O();
                                }
                                break;
                            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                                if (i15 == 1 && !this.f124602n.i()) {
                                    this.f124602n.k();
                                    break;
                                }
                                break;
                            case 46:
                                O();
                                break;
                            case 47:
                                this.f124603o = u();
                                O();
                                break;
                        }
                    } else {
                        this.f124602n.f();
                        break;
                    }
                }
                break;
        }
    }

    private void B(byte b15, byte b16) {
        int i15 = f124595z[b15 & 7];
        if ((b16 & 32) != 0) {
            i15++;
        }
        if (i15 != this.f124602n.f124617d) {
            if (this.f124605q != 1 && !this.f124602n.i()) {
                C3061a c3061a = new C3061a(this.f124605q, this.f124606r);
                this.f124602n = c3061a;
                this.f124601m.add(c3061a);
            }
            this.f124602n.f124617d = i15;
        }
        boolean z15 = (b16 & 16) == 16;
        boolean z16 = (b16 & 1) == 1;
        int i16 = (b16 >> 1) & 7;
        this.f124602n.p(z15 ? 8 : i16, z16);
        if (z15) {
            this.f124602n.f124618e = A[i16];
        }
    }

    private static boolean C(byte b15) {
        return (b15 & 224) == 0;
    }

    private static boolean D(byte b15, byte b16) {
        return (b15 & 246) == 18 && (b16 & 224) == 32;
    }

    private static boolean E(byte b15, byte b16) {
        return (b15 & 247) == 17 && (b16 & 240) == 32;
    }

    private static boolean F(byte b15, byte b16) {
        return (b15 & 246) == 20 && (b16 & 240) == 32;
    }

    private static boolean G(byte b15, byte b16) {
        return (b15 & 240) == 16 && (b16 & 192) == 64;
    }

    private static boolean H(byte b15) {
        return (b15 & 240) == 16;
    }

    private boolean I(boolean z15, byte b15, byte b16) {
        if (!z15 || !H(b15)) {
            this.f124608t = false;
        } else {
            if (this.f124608t && this.f124609u == b15 && this.f124610v == b16) {
                this.f124608t = false;
                return true;
            }
            this.f124608t = true;
            this.f124609u = b15;
            this.f124610v = b16;
        }
        return false;
    }

    private static boolean J(byte b15) {
        return (b15 & 246) == 20;
    }

    private static boolean K(byte b15, byte b16) {
        return (b15 & 247) == 17 && (b16 & 240) == 48;
    }

    private static boolean L(byte b15, byte b16) {
        return (b15 & 247) == 23 && b16 >= 33 && b16 <= 35;
    }

    private static boolean M(byte b15) {
        return 1 <= b15 && b15 <= 15;
    }

    private void N(byte b15, byte b16) {
        if (M(b15)) {
            this.f124612x = false;
            return;
        }
        if (J(b15)) {
            if (b16 != 32 && b16 != 47) {
                switch (b16) {
                    case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                    case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                    case EACTags.INTERCHANGE_CONTROL /* 39 */:
                        break;
                    default:
                        switch (b16) {
                            case EACTags.CURRENCY_CODE /* 42 */:
                            case EACTags.DATE_OF_BIRTH /* 43 */:
                                this.f124612x = false;
                                break;
                        }
                        return;
                }
            }
            this.f124612x = true;
        }
    }

    private void O() {
        this.f124602n.j(this.f124605q);
        this.f124601m.clear();
        this.f124601m.add(this.f124602n);
    }

    private void P(int i15) {
        int i16 = this.f124605q;
        if (i16 == i15) {
            return;
        }
        this.f124605q = i15;
        if (i15 == 3) {
            for (int i17 = 0; i17 < this.f124601m.size(); i17++) {
                this.f124601m.get(i17).l(i15);
            }
            return;
        }
        O();
        if (i16 == 3 || i15 == 1 || i15 == 0) {
            this.f124603o = Collections.EMPTY_LIST;
        }
    }

    private void Q(int i15) {
        this.f124606r = i15;
        this.f124602n.m(i15);
    }

    private boolean R() {
        return (this.f124600l == -9223372036854775807L || this.f124613y == -9223372036854775807L || m() - this.f124613y < this.f124600l) ? false : true;
    }

    private boolean S(byte b15) {
        if (C(b15)) {
            this.f124611w = t(b15);
        }
        return this.f124611w == this.f124599k;
    }

    private static char s(byte b15) {
        return (char) C[(b15 & 127) - 32];
    }

    private static int t(byte b15) {
        return (b15 >> 3) & 1;
    }

    private List<v7.a> u() {
        int size = this.f124601m.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i15 = 0; i15 < size; i15++) {
            v7.a aVarG = this.f124601m.get(i15).g(PKIFailureInfo.systemUnavail);
            arrayList.add(aVarG);
            if (aVarG != null) {
                iMin = Math.min(iMin, aVarG.f204176i);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i16 = 0; i16 < size; i16++) {
            v7.a aVar = (v7.a) arrayList.get(i16);
            if (aVar != null) {
                if (aVar.f204176i != iMin) {
                    aVar = (v7.a) p.q(this.f124601m.get(i16).g(iMin));
                }
                arrayList2.add(aVar);
            }
        }
        return arrayList2;
    }

    private static char v(byte b15) {
        return (char) E[b15 & 31];
    }

    private static char w(byte b15) {
        return (char) F[b15 & 31];
    }

    private static char x(byte b15, byte b16) {
        return (b15 & 1) == 0 ? v(b16) : w(b16);
    }

    private static char y(byte b15) {
        return (char) D[b15 & 15];
    }

    private void z(byte b15) {
        this.f124602n.e(' ');
        this.f124602n.p((b15 >> 1) & 7, (b15 & 1) == 1);
    }

    @Override // m9.e, z7.d
    public void b() {
    }

    @Override // m9.e, l9.l
    public /* bridge */ /* synthetic */ void c(long j15) {
        super.c(j15);
    }

    @Override // m9.e, z7.d
    public void flush() {
        super.flush();
        this.f124603o = null;
        this.f124604p = null;
        P(0);
        Q(4);
        O();
        this.f124607s = false;
        this.f124608t = false;
        this.f124609u = (byte) 0;
        this.f124610v = (byte) 0;
        this.f124611w = 0;
        this.f124612x = true;
        this.f124613y = -9223372036854775807L;
    }

    @Override // m9.e
    protected k h() {
        List<v7.a> list = this.f124603o;
        this.f124604p = list;
        return new f((List) p.q(list));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0063  */
    @Override // m9.e
    protected void i(l9.p pVar) {
        boolean z15;
        ByteBuffer byteBuffer = (ByteBuffer) p.q(pVar.f233228d);
        this.f124596h.d0(byteBuffer.array(), byteBuffer.limit());
        boolean z16 = false;
        while (true) {
            int iA = this.f124596h.a();
            int i15 = this.f124597i;
            if (iA < i15) {
                break;
            }
            int iQ = i15 == 2 ? -4 : this.f124596h.Q();
            int iQ2 = this.f124596h.Q();
            int iQ3 = this.f124596h.Q();
            if ((iQ & 2) == 0 && (iQ & 1) == this.f124598j) {
                byte b15 = (byte) (iQ2 & CertificateBody.profileType);
                byte b16 = (byte) (iQ3 & CertificateBody.profileType);
                if (b15 != 0 || b16 != 0) {
                    boolean z17 = this.f124607s;
                    if ((iQ & 4) == 4) {
                        boolean[] zArr = G;
                        if (zArr[iQ2] && zArr[iQ3]) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                    } else {
                        z15 = false;
                    }
                    this.f124607s = z15;
                    if (!I(z15, b15, b16)) {
                        if (this.f124607s) {
                            N(b15, b16);
                            if (this.f124612x && S(b15)) {
                                if (!C(b15)) {
                                    this.f124602n.e(s(b15));
                                    if ((b16 & 224) != 0) {
                                        this.f124602n.e(s(b16));
                                    }
                                } else if (K(b15, b16)) {
                                    this.f124602n.e(y(b16));
                                } else if (D(b15, b16)) {
                                    this.f124602n.f();
                                    this.f124602n.e(x(b15, b16));
                                } else if (E(b15, b16)) {
                                    z(b16);
                                } else if (G(b15, b16)) {
                                    B(b15, b16);
                                } else if (L(b15, b16)) {
                                    this.f124602n.f124619f = b16 - 32;
                                } else if (F(b15, b16)) {
                                    A(b16);
                                }
                                z16 = true;
                            }
                        } else if (z17) {
                            O();
                            z16 = true;
                        }
                    }
                }
            }
        }
        if (z16) {
            int i16 = this.f124605q;
            if (i16 == 1 || i16 == 3) {
                this.f124603o = u();
                this.f124613y = m();
            }
        }
    }

    @Override // m9.e
    /* JADX INFO: renamed from: j */
    public /* bridge */ /* synthetic */ l9.p g() {
        return super.g();
    }

    @Override // m9.e, z7.d, e8.b
    /* JADX INFO: renamed from: k */
    public q a() {
        q qVarL;
        q qVarA = super.a();
        if (qVarA != null) {
            return qVarA;
        }
        if (!R() || (qVarL = l()) == null) {
            return null;
        }
        this.f124603o = Collections.EMPTY_LIST;
        this.f124613y = -9223372036854775807L;
        qVarL.x(m(), h(), Long.MAX_VALUE);
        return qVarL;
    }

    @Override // m9.e
    protected boolean n() {
        return this.f124603o != this.f124604p;
    }

    @Override // m9.e
    /* JADX INFO: renamed from: o */
    public /* bridge */ /* synthetic */ void e(l9.p pVar) {
        super.e(pVar);
    }
}
