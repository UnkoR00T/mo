package s9;

import ak.n0;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import l9.e;
import l9.s;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import w7.c0;
import w7.l;
import w7.o0;
import w7.t;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c0 f179363a = new c0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f179364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f179365c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f179366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f179367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f179368f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f179369g;

    public a(List<byte[]> list) {
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f179365c = 0;
            this.f179366d = -1;
            this.f179367e = "sans-serif";
            this.f179364b = false;
            this.f179368f = 0.85f;
            this.f179369g = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f179365c = bArr[24];
        this.f179366d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f179367e = "Serif".equals(o0.H(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i15 = bArr[25] * 20;
        this.f179369g = i15;
        boolean z15 = (bArr[0] & 32) != 0;
        this.f179364b = z15;
        if (z15) {
            this.f179368f = o0.n(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i15, 0.0f, 0.95f);
        } else {
            this.f179368f = 0.85f;
        }
    }

    private void d(c0 c0Var, SpannableStringBuilder spannableStringBuilder) {
        p.d(c0Var.a() >= 12);
        int iY = c0Var.Y();
        int iY2 = c0Var.Y();
        c0Var.g0(2);
        int iQ = c0Var.Q();
        c0Var.g0(1);
        int iZ = c0Var.z();
        if (iY2 > spannableStringBuilder.length()) {
            t.h("Tx3gParser", "Truncating styl end (" + iY2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            iY2 = spannableStringBuilder.length();
        }
        int i15 = iY2;
        if (iY < i15) {
            f(spannableStringBuilder, iQ, this.f179365c, iY, i15, 0);
            e(spannableStringBuilder, iZ, this.f179366d, iY, i15, 0);
            return;
        }
        t.h("Tx3gParser", "Ignoring styl with start (" + iY + ") >= end (" + i15 + ").");
    }

    private static void e(SpannableStringBuilder spannableStringBuilder, int i15, int i16, int i17, int i18, int i19) {
        if (i15 != i16) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i15 >>> 8) | ((i15 & GF2Field.MASK) << 24)), i17, i18, i19 | 33);
        }
    }

    private static void f(SpannableStringBuilder spannableStringBuilder, int i15, int i16, int i17, int i18, int i19) {
        if (i15 != i16) {
            int i25 = i19 | 33;
            boolean z15 = (i15 & 1) != 0;
            boolean z16 = (i15 & 2) != 0;
            if (z15) {
                if (z16) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i17, i18, i25);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i17, i18, i25);
                }
            } else if (z16) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i17, i18, i25);
            }
            boolean z17 = (i15 & 4) != 0;
            if (z17) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i17, i18, i25);
            }
            if (z17 || z15 || z16) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i17, i18, i25);
        }
    }

    private static void g(SpannableStringBuilder spannableStringBuilder, String str, int i15, int i16) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i15, i16, 16711713);
        }
    }

    private static String h(c0 c0Var) {
        p.d(c0Var.a() >= 2);
        int iY = c0Var.Y();
        if (iY == 0) {
            return "";
        }
        int iG = c0Var.g();
        Charset charsetA0 = c0Var.a0();
        int iG2 = iY - (c0Var.g() - iG);
        if (charsetA0 == null) {
            charsetA0 = StandardCharsets.UTF_8;
        }
        return c0Var.O(iG2, charsetA0);
    }

    @Override // l9.s
    public void b(byte[] bArr, int i15, int i16, s.b bVar, l<e> lVar) {
        this.f179363a.d0(bArr, i16 + i15);
        this.f179363a.f0(i15);
        String strH = h(this.f179363a);
        if (strH.isEmpty()) {
            lVar.accept(new e(n0.C(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strH);
        f(spannableStringBuilder, this.f179365c, 0, 0, spannableStringBuilder.length(), 16711680);
        e(spannableStringBuilder, this.f179366d, -1, 0, spannableStringBuilder.length(), 16711680);
        g(spannableStringBuilder, this.f179367e, 0, spannableStringBuilder.length());
        float fN = this.f179368f;
        while (this.f179363a.a() >= 8) {
            int iG = this.f179363a.g();
            int iZ = this.f179363a.z();
            int iZ2 = this.f179363a.z();
            if (iZ2 == 1937013100) {
                p.d(this.f179363a.a() >= 2);
                int iY = this.f179363a.Y();
                for (int i17 = 0; i17 < iY; i17++) {
                    d(this.f179363a, spannableStringBuilder);
                }
            } else if (iZ2 == 1952608120 && this.f179364b) {
                p.d(this.f179363a.a() >= 2);
                fN = o0.n(this.f179363a.Y() / this.f179369g, 0.0f, 0.95f);
            }
            this.f179363a.f0(iG + iZ);
        }
        lVar.accept(new e(n0.E(new v7.a.b().o(spannableStringBuilder).h(fN, 0).i(0).a()), -9223372036854775807L, -9223372036854775807L));
    }

    @Override // l9.s
    public int c() {
        return 2;
    }
}
