package m9;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import l9.k;
import l9.q;
import org.bouncycastle.asn1.eac.CertificateBody;
import org.bouncycastle.asn1.eac.EACTags;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.conscrypt.metrics.ConscryptStatsLog;
import w7.b0;
import w7.c0;
import w7.i;
import w7.t;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c0 f124625h = new c0();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final b0 f124626i = new b0();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f124627j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f124628k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f124629l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final b[] f124630m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private b f124631n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List<v7.a> f124632o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<v7.a> f124633p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private C3063c f124634q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f124635r;

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Comparator<a> f124636c = new Comparator() { // from class: m9.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return Integer.compare(((c.a) obj2).f124638b, ((c.a) obj).f124638b);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v7.a f124637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f124638b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f15, int i15, int i16, float f16, int i17, float f17, boolean z15, int i18, int i19) {
            v7.a.b bVarN = new v7.a.b().o(charSequence).p(alignment).h(f15, i15).i(i16).k(f16).l(i17).n(f17);
            if (z15) {
                bVarN.s(i18);
            }
            this.f124637a = bVarN.a();
            this.f124638b = i19;
        }
    }

    private static final class b {
        private static final int[] A;
        private static final boolean[] B;
        private static final int[] C;
        private static final int[] D;
        private static final int[] E;
        private static final int[] F;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final int f124639v = h(2, 2, 2, 0);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final int f124640w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final int f124641x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final int[] f124642y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final int[] f124643z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List<SpannableString> f124644a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SpannableStringBuilder f124645b = new SpannableStringBuilder();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f124646c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f124647d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f124648e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f124649f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f124650g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f124651h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f124652i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f124653j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f124654k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f124655l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f124656m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f124657n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f124658o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private int f124659p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private int f124660q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f124661r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private int f124662s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f124663t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        private int f124664u;

        static {
            int iH = h(0, 0, 0, 0);
            f124640w = iH;
            int iH2 = h(0, 0, 0, 3);
            f124641x = iH2;
            f124642y = new int[]{0, 0, 0, 0, 0, 2, 0};
            f124643z = new int[]{0, 0, 0, 0, 0, 0, 2};
            A = new int[]{3, 3, 3, 3, 3, 3, 1};
            B = new boolean[]{false, false, false, true, true, true, false};
            C = new int[]{iH, iH2, iH, iH, iH2, iH, iH};
            D = new int[]{0, 1, 2, 3, 4, 3, 4};
            E = new int[]{0, 0, 0, 0, 0, 3, 3};
            F = new int[]{iH, iH, iH, iH, iH, iH2, iH2};
        }

        public b() {
            l();
        }

        public static int g(int i15, int i16, int i17) {
            return h(i15, i16, i17, 0);
        }

        /* JADX WARN: Code duplicated, block: B:9:0x001b  */
        public static int h(int i15, int i16, int i17, int i18) {
            int i19;
            p.o(i15, 4);
            p.o(i16, 4);
            p.o(i17, 4);
            p.o(i18, 4);
            if (i18 == 0 || i18 == 1) {
                i19 = 255;
            } else if (i18 == 2) {
                i19 = CertificateBody.profileType;
            } else if (i18 != 3) {
                i19 = 255;
            } else {
                i19 = 0;
            }
            return Color.argb(i19, i15 > 1 ? 255 : 0, i16 > 1 ? 255 : 0, i17 > 1 ? 255 : 0);
        }

        public void a(char c15) {
            if (c15 != '\n') {
                this.f124645b.append(c15);
                return;
            }
            this.f124644a.add(d());
            this.f124645b.clear();
            if (this.f124658o != -1) {
                this.f124658o = 0;
            }
            if (this.f124659p != -1) {
                this.f124659p = 0;
            }
            if (this.f124660q != -1) {
                this.f124660q = 0;
            }
            if (this.f124662s != -1) {
                this.f124662s = 0;
            }
            while (true) {
                if (this.f124644a.size() < this.f124653j && this.f124644a.size() < 15) {
                    this.f124664u = this.f124644a.size();
                    return;
                }
                this.f124644a.remove(0);
            }
        }

        public void b() {
            int length = this.f124645b.length();
            if (length > 0) {
                this.f124645b.delete(length - 1, length);
            }
        }

        public a c() {
            Layout.Alignment alignment;
            float f15;
            float f16;
            if (j()) {
                return null;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i15 = 0; i15 < this.f124644a.size(); i15++) {
                spannableStringBuilder.append((CharSequence) this.f124644a.get(i15));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append((CharSequence) d());
            int i16 = this.f124654k;
            int i17 = 2;
            if (i16 == 0) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else if (i16 == 1) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (i16 != 2) {
                if (i16 != 3) {
                    throw new IllegalArgumentException("Unexpected justification value: " + this.f124654k);
                }
                alignment = Layout.Alignment.ALIGN_NORMAL;
            } else {
                alignment = Layout.Alignment.ALIGN_CENTER;
            }
            if (this.f124649f) {
                f15 = this.f124651h / 99.0f;
                f16 = this.f124650g / 99.0f;
            } else {
                f15 = this.f124651h / 209.0f;
                f16 = this.f124650g / 74.0f;
            }
            float f17 = (f15 * 0.9f) + 0.05f;
            float f18 = (f16 * 0.9f) + 0.05f;
            int i18 = this.f124652i;
            int i19 = i18 / 3 == 0 ? 0 : i18 / 3 == 1 ? 1 : 2;
            if (i18 % 3 == 0) {
                i17 = 0;
            } else if (i18 % 3 == 1) {
                i17 = 1;
            }
            return new a(spannableStringBuilder, alignment, f18, 0, i19, f17, i17, -3.4028235E38f, this.f124657n != f124640w, this.f124657n, this.f124648e);
        }

        public SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f124645b);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.f124658o != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.f124658o, length, 33);
                }
                if (this.f124659p != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.f124659p, length, 33);
                }
                if (this.f124660q != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f124661r), this.f124660q, length, 33);
                }
                if (this.f124662s != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.f124663t), this.f124662s, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void e() {
            this.f124644a.clear();
            this.f124645b.clear();
            this.f124658o = -1;
            this.f124659p = -1;
            this.f124660q = -1;
            this.f124662s = -1;
            this.f124664u = 0;
        }

        public void f(boolean z15, int i15, boolean z16, int i16, int i17, int i18, int i19, int i25, int i26) {
            this.f124646c = true;
            this.f124647d = z15;
            this.f124648e = i15;
            this.f124649f = z16;
            this.f124650g = i16;
            this.f124651h = i17;
            this.f124652i = i19;
            int i27 = i18 + 1;
            if (this.f124653j != i27) {
                this.f124653j = i27;
                while (true) {
                    if (this.f124644a.size() < this.f124653j && this.f124644a.size() < 15) {
                        break;
                    } else {
                        this.f124644a.remove(0);
                    }
                }
            }
            if (i25 != 0 && this.f124655l != i25) {
                this.f124655l = i25;
                int i28 = i25 - 1;
                q(C[i28], f124641x, B[i28], 0, f124643z[i28], A[i28], f124642y[i28]);
            }
            if (i26 == 0 || this.f124656m == i26) {
                return;
            }
            this.f124656m = i26;
            int i29 = i26 - 1;
            m(0, 1, 1, false, false, E[i29], D[i29]);
            n(f124639v, F[i29], f124640w);
        }

        public boolean i() {
            return this.f124646c;
        }

        public boolean j() {
            if (i()) {
                return this.f124644a.isEmpty() && this.f124645b.length() == 0;
            }
            return true;
        }

        public boolean k() {
            return this.f124647d;
        }

        public void l() {
            e();
            this.f124646c = false;
            this.f124647d = false;
            this.f124648e = 4;
            this.f124649f = false;
            this.f124650g = 0;
            this.f124651h = 0;
            this.f124652i = 0;
            this.f124653j = 15;
            this.f124654k = 0;
            this.f124655l = 0;
            this.f124656m = 0;
            int i15 = f124640w;
            this.f124657n = i15;
            this.f124661r = f124639v;
            this.f124663t = i15;
        }

        public void m(int i15, int i16, int i17, boolean z15, boolean z16, int i18, int i19) {
            if (this.f124658o != -1) {
                if (!z15) {
                    this.f124645b.setSpan(new StyleSpan(2), this.f124658o, this.f124645b.length(), 33);
                    this.f124658o = -1;
                }
            } else if (z15) {
                this.f124658o = this.f124645b.length();
            }
            if (this.f124659p == -1) {
                if (z16) {
                    this.f124659p = this.f124645b.length();
                }
            } else {
                if (z16) {
                    return;
                }
                this.f124645b.setSpan(new UnderlineSpan(), this.f124659p, this.f124645b.length(), 33);
                this.f124659p = -1;
            }
        }

        public void n(int i15, int i16, int i17) {
            if (this.f124660q != -1 && this.f124661r != i15) {
                this.f124645b.setSpan(new ForegroundColorSpan(this.f124661r), this.f124660q, this.f124645b.length(), 33);
            }
            if (i15 != f124639v) {
                this.f124660q = this.f124645b.length();
                this.f124661r = i15;
            }
            if (this.f124662s != -1 && this.f124663t != i16) {
                this.f124645b.setSpan(new BackgroundColorSpan(this.f124663t), this.f124662s, this.f124645b.length(), 33);
            }
            if (i16 != f124640w) {
                this.f124662s = this.f124645b.length();
                this.f124663t = i16;
            }
        }

        public void o(int i15, int i16) {
            if (this.f124664u != i15) {
                a('\n');
            }
            this.f124664u = i15;
        }

        public void p(boolean z15) {
            this.f124647d = z15;
        }

        public void q(int i15, int i16, boolean z15, int i17, int i18, int i19, int i25) {
            this.f124657n = i15;
            this.f124654k = i25;
        }
    }

    /* JADX INFO: renamed from: m9.c$c, reason: collision with other inner class name */
    private static final class C3063c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f124665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f124666b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f124667c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f124668d = 0;

        public C3063c(int i15, int i16) {
            this.f124665a = i15;
            this.f124666b = i16;
            this.f124667c = new byte[(i16 * 2) - 1];
        }
    }

    public c(int i15, List<byte[]> list) {
        this.f124629l = i15 == -1 ? 1 : i15;
        this.f124628k = list != null && i.D(list);
        this.f124630m = new b[8];
        for (int i16 = 0; i16 < 8; i16++) {
            this.f124630m[i16] = new b();
        }
        this.f124631n = this.f124630m[0];
    }

    private void A(int i15) {
        if (i15 == 32) {
            this.f124631n.a(' ');
            return;
        }
        if (i15 == 33) {
            this.f124631n.a((char) 160);
            return;
        }
        if (i15 == 37) {
            this.f124631n.a((char) 8230);
            return;
        }
        if (i15 == 42) {
            this.f124631n.a((char) 352);
            return;
        }
        if (i15 == 44) {
            this.f124631n.a((char) 338);
            return;
        }
        if (i15 == 63) {
            this.f124631n.a((char) 376);
            return;
        }
        if (i15 == 57) {
            this.f124631n.a((char) 8482);
            return;
        }
        if (i15 == 58) {
            this.f124631n.a((char) 353);
            return;
        }
        if (i15 == 60) {
            this.f124631n.a((char) 339);
            return;
        }
        if (i15 == 61) {
            this.f124631n.a((char) 8480);
            return;
        }
        switch (i15) {
            case 48:
                this.f124631n.a((char) 9608);
                break;
            case 49:
                this.f124631n.a((char) 8216);
                break;
            case 50:
                this.f124631n.a((char) 8217);
                break;
            case EACTags.TRANSACTION_DATE /* 51 */:
                this.f124631n.a((char) 8220);
                break;
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                this.f124631n.a((char) 8221);
                break;
            case 53:
                this.f124631n.a((char) 8226);
                break;
            default:
                switch (i15) {
                    case 118:
                        this.f124631n.a((char) 8539);
                        break;
                    case 119:
                        this.f124631n.a((char) 8540);
                        break;
                    case 120:
                        this.f124631n.a((char) 8541);
                        break;
                    case 121:
                        this.f124631n.a((char) 8542);
                        break;
                    case 122:
                        this.f124631n.a((char) 9474);
                        break;
                    case 123:
                        this.f124631n.a((char) 9488);
                        break;
                    case 124:
                        this.f124631n.a((char) 9492);
                        break;
                    case 125:
                        this.f124631n.a((char) 9472);
                        break;
                    case 126:
                        this.f124631n.a((char) 9496);
                        break;
                    case CertificateBody.profileType /* 127 */:
                        this.f124631n.a((char) 9484);
                        break;
                    default:
                        t.h("Cea708Decoder", "Invalid G2 character: " + i15);
                        break;
                }
                break;
        }
    }

    private void B(int i15) {
        if (i15 == 160) {
            this.f124631n.a((char) 13252);
            return;
        }
        t.h("Cea708Decoder", "Invalid G3 character: " + i15);
        this.f124631n.a('_');
    }

    private void C() {
        this.f124631n.m(this.f124626i.h(4), this.f124626i.h(2), this.f124626i.h(2), this.f124626i.g(), this.f124626i.g(), this.f124626i.h(3), this.f124626i.h(3));
    }

    private void D() {
        int iH = b.h(this.f124626i.h(2), this.f124626i.h(2), this.f124626i.h(2), this.f124626i.h(2));
        int iH2 = b.h(this.f124626i.h(2), this.f124626i.h(2), this.f124626i.h(2), this.f124626i.h(2));
        this.f124626i.r(2);
        this.f124631n.n(iH, iH2, b.g(this.f124626i.h(2), this.f124626i.h(2), this.f124626i.h(2)));
    }

    private void E() {
        this.f124626i.r(4);
        int iH = this.f124626i.h(4);
        this.f124626i.r(2);
        this.f124631n.o(iH, this.f124626i.h(6));
    }

    private void F() {
        int iH = b.h(this.f124626i.h(2), this.f124626i.h(2), this.f124626i.h(2), this.f124626i.h(2));
        int iH2 = this.f124626i.h(2);
        int iG = b.g(this.f124626i.h(2), this.f124626i.h(2), this.f124626i.h(2));
        if (this.f124626i.g()) {
            iH2 |= 4;
        }
        boolean zG = this.f124626i.g();
        int iH3 = this.f124626i.h(2);
        int iH4 = this.f124626i.h(2);
        int iH5 = this.f124626i.h(2);
        this.f124626i.r(8);
        this.f124631n.q(iH, iG, zG, iH2, iH3, iH4, iH5);
    }

    private void G() {
        C3063c c3063c = this.f124634q;
        if (c3063c.f124668d != (c3063c.f124666b * 2) - 1) {
            t.b("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.f124634q.f124666b * 2) - 1) + ", but current index is " + this.f124634q.f124668d + " (sequence number " + this.f124634q.f124665a + ");");
        }
        b0 b0Var = this.f124626i;
        C3063c c3063c2 = this.f124634q;
        b0Var.o(c3063c2.f124667c, c3063c2.f124668d);
        boolean z15 = false;
        while (this.f124626i.b() > 0) {
            int iH = this.f124626i.h(3);
            int iH2 = this.f124626i.h(5);
            if (iH == 7) {
                this.f124626i.r(2);
                iH = this.f124626i.h(6);
                if (iH < 7) {
                    t.h("Cea708Decoder", "Invalid extended service number: " + iH);
                }
            }
            if (iH2 == 0) {
                if (iH == 0) {
                    break;
                }
                t.h("Cea708Decoder", "serviceNumber is non-zero (" + iH + ") when blockSize is 0");
                break;
            }
            if (iH != this.f124629l) {
                this.f124626i.s(iH2);
            } else {
                int iE = this.f124626i.e() + (iH2 * 8);
                while (this.f124626i.e() < iE) {
                    int iH3 = this.f124626i.h(8);
                    if (iH3 == 16) {
                        int iH4 = this.f124626i.h(8);
                        if (iH4 <= 31) {
                            v(iH4);
                        } else {
                            if (iH4 <= 127) {
                                A(iH4);
                            } else if (iH4 <= 159) {
                                w(iH4);
                            } else if (iH4 <= 255) {
                                B(iH4);
                            } else {
                                t.h("Cea708Decoder", "Invalid extended command: " + iH4);
                            }
                            z15 = true;
                        }
                    } else if (iH3 <= 31) {
                        t(iH3);
                    } else {
                        if (iH3 <= 127) {
                            y(iH3);
                        } else if (iH3 <= 159) {
                            u(iH3);
                        } else if (iH3 <= 255) {
                            z(iH3);
                        } else {
                            t.h("Cea708Decoder", "Invalid base command: " + iH3);
                        }
                        z15 = true;
                    }
                }
            }
        }
        if (z15) {
            this.f124632o = s();
        }
    }

    private void H() {
        for (int i15 = 0; i15 < 8; i15++) {
            this.f124630m[i15].l();
        }
    }

    private void r() {
        if (this.f124634q == null) {
            return;
        }
        G();
        this.f124634q = null;
    }

    private List<v7.a> s() {
        a aVarC;
        ArrayList arrayList = new ArrayList();
        for (int i15 = 0; i15 < 8; i15++) {
            if (!this.f124630m[i15].j() && this.f124630m[i15].k() && (aVarC = this.f124630m[i15].c()) != null) {
                arrayList.add(aVarC);
            }
        }
        Collections.sort(arrayList, a.f124636c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            arrayList2.add(((a) arrayList.get(i16)).f124637a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void t(int i15) {
        if (i15 != 0) {
            if (i15 == 3) {
                this.f124632o = s();
                return;
            }
            if (i15 == 8) {
                this.f124631n.b();
                return;
            }
            switch (i15) {
                case 12:
                    H();
                    break;
                case 13:
                    this.f124631n.a('\n');
                    break;
                case 14:
                    break;
                default:
                    if (i15 >= 17 && i15 <= 23) {
                        t.h("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i15);
                        this.f124626i.r(8);
                    } else if (i15 >= 24 && i15 <= 31) {
                        t.h("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i15);
                        this.f124626i.r(16);
                    } else {
                        t.h("Cea708Decoder", "Invalid C0 command: " + i15);
                    }
                    break;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void u(int i15) {
        int i16 = 1;
        switch (i15) {
            case 128:
            case 129:
            case 130:
            case 131:
            case 132:
            case 133:
            case 134:
            case 135:
                int i17 = i15 - 128;
                if (this.f124635r != i17) {
                    this.f124635r = i17;
                    this.f124631n = this.f124630m[i17];
                }
                break;
            case 136:
                while (i16 <= 8) {
                    if (this.f124626i.g()) {
                        this.f124630m[8 - i16].e();
                    }
                    i16++;
                }
                break;
            case 137:
                for (int i18 = 1; i18 <= 8; i18++) {
                    if (this.f124626i.g()) {
                        this.f124630m[8 - i18].p(true);
                    }
                }
                break;
            case 138:
                while (i16 <= 8) {
                    if (this.f124626i.g()) {
                        this.f124630m[8 - i16].p(false);
                    }
                    i16++;
                }
                break;
            case 139:
                for (int i19 = 1; i19 <= 8; i19++) {
                    if (this.f124626i.g()) {
                        b bVar = this.f124630m[8 - i19];
                        bVar.p(!bVar.k());
                    }
                }
                break;
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_128_CBC_SHA /* 140 */:
                while (i16 <= 8) {
                    if (this.f124626i.g()) {
                        this.f124630m[8 - i16].l();
                    }
                    i16++;
                }
                break;
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_PSK_WITH_AES_256_CBC_SHA /* 141 */:
                this.f124626i.r(8);
                break;
            case 142:
                break;
            case 143:
                H();
                break;
            case 144:
                if (this.f124631n.i()) {
                    C();
                } else {
                    this.f124626i.r(16);
                }
                break;
            case 145:
                if (this.f124631n.i()) {
                    D();
                } else {
                    this.f124626i.r(24);
                }
                break;
            case 146:
                if (this.f124631n.i()) {
                    E();
                } else {
                    this.f124626i.r(16);
                }
                break;
            case 147:
            case 148:
            case 149:
            case 150:
            default:
                t.h("Cea708Decoder", "Invalid C1 command: " + i15);
                break;
            case 151:
                if (this.f124631n.i()) {
                    F();
                } else {
                    this.f124626i.r(32);
                }
                break;
            case 152:
            case 153:
            case 154:
            case 155:
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_128_GCM_SHA256 /* 156 */:
            case ConscryptStatsLog.TLS_HANDSHAKE_REPORTED__CIPHER_SUITE__TLS_RSA_WITH_AES_256_GCM_SHA384 /* 157 */:
            case 158:
            case 159:
                int i25 = i15 - 152;
                x(i25);
                if (this.f124635r != i25) {
                    this.f124635r = i25;
                    this.f124631n = this.f124630m[i25];
                }
                break;
        }
    }

    private void v(int i15) {
        if (i15 <= 7) {
            return;
        }
        if (i15 <= 15) {
            this.f124626i.r(8);
        } else if (i15 <= 23) {
            this.f124626i.r(16);
        } else if (i15 <= 31) {
            this.f124626i.r(24);
        }
    }

    private void w(int i15) {
        if (i15 <= 135) {
            this.f124626i.r(32);
            return;
        }
        if (i15 <= 143) {
            this.f124626i.r(40);
        } else if (i15 <= 159) {
            this.f124626i.r(2);
            this.f124626i.r(this.f124626i.h(6) * 8);
        }
    }

    private void x(int i15) {
        b bVar = this.f124630m[i15];
        this.f124626i.r(2);
        boolean zG = this.f124626i.g();
        this.f124626i.r(2);
        int iH = this.f124626i.h(3);
        boolean zG2 = this.f124626i.g();
        int iH2 = this.f124626i.h(7);
        int iH3 = this.f124626i.h(8);
        int iH4 = this.f124626i.h(4);
        int iH5 = this.f124626i.h(4);
        this.f124626i.r(2);
        this.f124626i.r(6);
        this.f124626i.r(2);
        bVar.f(zG, iH, zG2, iH2, iH3, iH5, iH4, this.f124626i.h(3), this.f124626i.h(3));
    }

    private void y(int i15) {
        if (i15 == 127) {
            this.f124631n.a((char) 9835);
        } else {
            this.f124631n.a((char) (i15 & GF2Field.MASK));
        }
    }

    private void z(int i15) {
        this.f124631n.a((char) (i15 & GF2Field.MASK));
    }

    @Override // m9.e, z7.d
    public /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // m9.e, l9.l
    public /* bridge */ /* synthetic */ void c(long j15) {
        super.c(j15);
    }

    @Override // m9.e, z7.d
    public void flush() {
        super.flush();
        this.f124632o = null;
        this.f124633p = null;
        this.f124635r = 0;
        this.f124631n = this.f124630m[0];
        H();
        this.f124634q = null;
    }

    @Override // m9.e
    protected k h() {
        List<v7.a> list = this.f124632o;
        this.f124633p = list;
        return new f((List) p.q(list));
    }

    @Override // m9.e
    protected void i(l9.p pVar) {
        ByteBuffer byteBuffer = (ByteBuffer) p.q(pVar.f233228d);
        this.f124625h.d0(byteBuffer.array(), byteBuffer.limit());
        while (this.f124625h.a() >= 3) {
            int iQ = this.f124625h.Q();
            int i15 = iQ & 3;
            boolean z15 = (iQ & 4) == 4;
            byte bQ = (byte) this.f124625h.Q();
            byte bQ2 = (byte) this.f124625h.Q();
            if (i15 == 2 || i15 == 3) {
                if (z15) {
                    if (i15 == 3) {
                        r();
                        int i16 = (bQ & 192) >> 6;
                        int i17 = this.f124627j;
                        if (i17 != -1 && i16 != (i17 + 1) % 4) {
                            H();
                            t.h("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f124627j + " current=" + i16);
                        }
                        this.f124627j = i16;
                        int i18 = bQ & 63;
                        if (i18 == 0) {
                            i18 = 64;
                        }
                        C3063c c3063c = new C3063c(i16, i18);
                        this.f124634q = c3063c;
                        byte[] bArr = c3063c.f124667c;
                        int i19 = c3063c.f124668d;
                        c3063c.f124668d = i19 + 1;
                        bArr[i19] = bQ2;
                    } else {
                        p.d(i15 == 2);
                        C3063c c3063c2 = this.f124634q;
                        if (c3063c2 == null) {
                            t.c("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = c3063c2.f124667c;
                            int i25 = c3063c2.f124668d;
                            int i26 = i25 + 1;
                            c3063c2.f124668d = i26;
                            bArr2[i25] = bQ;
                            c3063c2.f124668d = i25 + 2;
                            bArr2[i26] = bQ2;
                        }
                    }
                    C3063c c3063c3 = this.f124634q;
                    if (c3063c3.f124668d == (c3063c3.f124666b * 2) - 1) {
                        r();
                    }
                }
            }
        }
    }

    @Override // m9.e
    /* JADX INFO: renamed from: j */
    public /* bridge */ /* synthetic */ l9.p g() {
        return super.g();
    }

    @Override // m9.e
    /* JADX INFO: renamed from: k */
    public /* bridge */ /* synthetic */ q a() {
        return super.a();
    }

    @Override // m9.e
    protected boolean n() {
        return this.f124632o != this.f124633p;
    }

    @Override // m9.e
    /* JADX INFO: renamed from: o */
    public /* bridge */ /* synthetic */ void e(l9.p pVar) {
        super.e(pVar);
    }
}
