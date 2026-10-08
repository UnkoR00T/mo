package r9;

import android.annotation.SuppressLint;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.Map;
import w7.o0;
import w7.t;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
final class f {
    @SuppressLint({"WrongConstant"})
    public static void a(Spannable spannable, int i15, int i16, g gVar, c cVar, Map<String, g> map, int i17) {
        c cVarE;
        g gVarF;
        int i18;
        if (gVar.n() != -1) {
            spannable.setSpan(new StyleSpan(gVar.n()), i15, i16, 33);
        }
        if (gVar.u()) {
            spannable.setSpan(new StrikethroughSpan(), i15, i16, 33);
        }
        if (gVar.v()) {
            spannable.setSpan(new UnderlineSpan(), i15, i16, 33);
        }
        if (gVar.s()) {
            v7.g.b(spannable, new ForegroundColorSpan(gVar.d()), i15, i16, 33);
        }
        if (gVar.r()) {
            v7.g.b(spannable, new BackgroundColorSpan(gVar.b()), i15, i16, 33);
        }
        if (gVar.e() != null) {
            v7.g.b(spannable, new TypefaceSpan(gVar.e()), i15, i16, 33);
        }
        if (gVar.q() != null) {
            b bVar = (b) p.q(gVar.q());
            int i19 = bVar.f172355a;
            if (i19 == -1) {
                i19 = (i17 == 2 || i17 == 1) ? 3 : 1;
                i18 = 1;
            } else {
                i18 = bVar.f172356b;
            }
            int i25 = bVar.f172357c;
            if (i25 == -2) {
                i25 = 1;
            }
            v7.g.b(spannable, new v7.h(i19, i18, i25), i15, i16, 33);
        }
        int iL = gVar.l();
        if (iL == 2) {
            c cVarD = d(cVar, map);
            if (cVarD != null && (cVarE = e(cVarD, map)) != null) {
                if (cVarE.g() != 1 || cVarE.f(0).f172359b == null) {
                    t.f("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                } else {
                    String str = (String) o0.h(cVarE.f(0).f172359b);
                    g gVarF2 = f(cVarE.f172363f, cVarE.l(), map);
                    int iK = gVarF2 != null ? gVarF2.k() : -1;
                    if (iK == -1 && (gVarF = f(cVarD.f172363f, cVarD.l(), map)) != null) {
                        iK = gVarF.k();
                    }
                    spannable.setSpan(new v7.f(str, iK), i15, i16, 33);
                }
            }
        } else if (iL == 3 || iL == 4) {
            spannable.setSpan(new a(), i15, i16, 33);
        }
        if (gVar.p()) {
            v7.g.b(spannable, new v7.e(), i15, i16, 33);
        }
        int iG = gVar.g();
        if (iG == 1) {
            v7.g.b(spannable, new AbsoluteSizeSpan((int) gVar.f(), true), i15, i16, 33);
        } else if (iG == 2) {
            v7.g.b(spannable, new RelativeSizeSpan(gVar.f()), i15, i16, 33);
        } else {
            if (iG != 3) {
                return;
            }
            v7.g.a(spannable, gVar.f() / 100.0f, i15, i16, 33);
        }
    }

    static String b(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    static void c(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length < 0 || spannableStringBuilder.charAt(length) == '\n') {
            return;
        }
        spannableStringBuilder.append('\n');
    }

    private static c d(c cVar, Map<String, g> map) {
        while (cVar != null) {
            g gVarF = f(cVar.f172363f, cVar.l(), map);
            if (gVarF != null && gVarF.l() == 1) {
                return cVar;
            }
            cVar = cVar.f172367j;
        }
        return null;
    }

    private static c e(c cVar, Map<String, g> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(cVar);
        while (!arrayDeque.isEmpty()) {
            c cVar2 = (c) arrayDeque.pop();
            g gVarF = f(cVar2.f172363f, cVar2.l(), map);
            if (gVarF != null && gVarF.l() == 3) {
                return cVar2;
            }
            for (int iG = cVar2.g() - 1; iG >= 0; iG--) {
                arrayDeque.push(cVar2.f(iG));
            }
        }
        return null;
    }

    public static g f(g gVar, String[] strArr, Map<String, g> map) {
        int i15 = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                g gVar2 = new g();
                int length = strArr.length;
                while (i15 < length) {
                    gVar2.a(map.get(strArr[i15]));
                    i15++;
                }
                return gVar2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return gVar.a(map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i15 < length2) {
                    gVar.a(map.get(strArr[i15]));
                    i15++;
                }
            }
        }
        return gVar;
    }
}
