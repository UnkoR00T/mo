package z4;

import android.graphics.Typeface;
import android.text.Spannable;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.LeadingMarginSpan;
import android.text.style.MetricAffectingSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.ScaleXSpan;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.h;
import b5.LineHeightStyle;
import b5.TextGeometricTransform;
import b5.TextIndent;
import b5.k;
import c5.v;
import c5.w;
import c5.x;
import er.q;
import er.r;
import java.util.ArrayList;
import java.util.List;
import n3.Shadow;
import n3.o1;
import oq.i0;
import oq.p;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import q4.SpanStyle;
import q4.TextStyle;
import q4.g;
import q4.j0;
import t4.m;
import t4.n;
import t4.o;
import u4.FontWeight;
import u4.l;
import u4.y;
import u4.z;
import x4.LocaleList;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u001a+\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\u000f\u001a\u00020\u0006*\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001aC\u0010\u0015\u001a\u00020\u0006*\u00020\u00002\u0014\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00120\u00112\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a'\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a3\u0010\u001e\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001d\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001a+\u0010 \u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b \u0010!\u001a'\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\"\u0010\u001a\u001a\u0017\u0010$\u001a\u00020#2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b$\u0010%\u001aa\u0010/\u001a\u00020\u0006*\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0014\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00120\u00112\u0006\u0010\u000e\u001a\u00020\r2&\u0010.\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0(H\u0000¢\u0006\u0004\b/\u00100\u001a3\u00103\u001a\u00020\u0006*\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b3\u00104\u001aY\u00105\u001a\u00020\u0006*\u00020\u00002\u0006\u0010'\u001a\u00020&2\u0014\u0010\u0014\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00120\u00112&\u0010.\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0(H\u0002¢\u0006\u0004\b5\u00106\u001aM\u0010;\u001a\u00020\u00062\b\u00107\u001a\u0004\u0018\u0001012\u0012\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\u00120\u00112\u001e\u0010:\u001a\u001a\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000609H\u0000¢\u0006\u0004\b;\u0010<\u001a!\u0010?\u001a\u0004\u0018\u00010>2\u0006\u0010=\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b?\u0010@\u001a-\u0010C\u001a\u00020\u0006*\u00020\u00002\b\u0010B\u001a\u0004\u0018\u00010A2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bC\u0010D\u001a-\u0010G\u001a\u00020\u0006*\u00020\u00002\b\u0010F\u001a\u0004\u0018\u00010E2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bG\u0010H\u001a+\u0010K\u001a\u00020\u0006*\u00020\u00002\u0006\u0010J\u001a\u00020I2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\bK\u0010L\u001a-\u0010O\u001a\u00020\u0006*\u00020\u00002\b\u0010N\u001a\u0004\u0018\u00010M2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\bO\u0010P\u001a-\u0010S\u001a\u00020\u0006*\u00020\u00002\b\u0010R\u001a\u0004\u0018\u00010Q2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bS\u0010T\u001a-\u0010W\u001a\u00020\u0006*\u00020\u00002\b\u0010V\u001a\u0004\u0018\u00010U2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bW\u0010X\u001a3\u0010Z\u001a\u00020\u0006*\u00020\u00002\u0006\u0010Y\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\bZ\u0010[\u001a-\u0010^\u001a\u00020\u0006*\u00020\u00002\b\u0010]\u001a\u0004\u0018\u00010\\2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b^\u0010_\u001a+\u0010`\u001a\u00020\u0006*\u00020\u00002\u0006\u0010J\u001a\u00020I2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000¢\u0006\u0004\b`\u0010L\u001a-\u0010c\u001a\u00020\u0006*\u00020\u00002\b\u0010b\u001a\u0004\u0018\u00010a2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bc\u0010d\u001a5\u0010h\u001a\u00020\u0006*\u00020\u00002\b\u0010f\u001a\u0004\u0018\u00010e2\u0006\u0010g\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0002¢\u0006\u0004\bh\u0010i\u001a\u0013\u0010j\u001a\u00020#*\u00020&H\u0002¢\u0006\u0004\bj\u0010k\u001a\u001d\u0010m\u001a\u000201*\u0004\u0018\u0001012\u0006\u0010l\u001a\u000201H\u0002¢\u0006\u0004\bm\u0010n\"\u0018\u0010q\u001a\u00020#*\u0002018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bo\u0010p¨\u0006r"}, d2 = {"Landroid/text/Spannable;", "", "span", "", "start", "end", "Loq/i0;", "y", "(Landroid/text/Spannable;Ljava/lang/Object;II)V", "Lb5/s;", "textIndent", "", "contextFontSize", "Lc5/d;", "density", "C", "(Landroid/text/Spannable;Lb5/s;FLc5/d;)V", "", "Lq4/e$d;", "Lq4/e$a;", "annotations", "m", "(Landroid/text/Spannable;Ljava/util/List;FLc5/d;Lb5/s;)V", "Lc5/v;", "size", "h", "(JFLc5/d;)F", "lineHeight", "Lb5/h;", "lineHeightStyle", "u", "(Landroid/text/Spannable;JFLc5/d;Lb5/h;)V", "v", "(Landroid/text/Spannable;JFLc5/d;)V", "i", "", "f", "(Lc5/d;)Z", "Lq4/b4;", "contextTextStyle", "Lkotlin/Function4;", "Lu4/l;", "Lu4/d0;", "Lu4/y;", "Lu4/z;", "Landroid/graphics/Typeface;", "resolveTypeface", "A", "(Landroid/text/Spannable;Lq4/b4;Ljava/util/List;Lc5/d;Ler/r;)V", "Lq4/h3;", "style", "z", "(Landroid/text/Spannable;Lq4/h3;IILc5/d;)V", "p", "(Landroid/text/Spannable;Lq4/b4;Ljava/util/List;Ler/r;)V", "contextFontSpanStyle", "spanStyles", "Lkotlin/Function3;", "block", "c", "(Lq4/h3;Ljava/util/List;Ler/q;)V", "letterSpacing", "Landroid/text/style/MetricAffectingSpan;", "b", "(JLc5/d;)Landroid/text/style/MetricAffectingSpan;", "Ln3/w2;", "shadow", "x", "(Landroid/text/Spannable;Ln3/w2;II)V", "Lp3/g;", "drawStyle", "o", "(Landroid/text/Spannable;Lp3/g;II)V", "Landroidx/compose/ui/graphics/Color;", "color", "j", "(Landroid/text/Spannable;JII)V", "Lx4/d;", "localeList", "w", "(Landroid/text/Spannable;Lx4/d;II)V", "Lb5/q;", "textGeometricTransform", "t", "(Landroid/text/Spannable;Lb5/q;II)V", "", "fontFeatureSettings", "r", "(Landroid/text/Spannable;Ljava/lang/String;II)V", "fontSize", "s", "(Landroid/text/Spannable;JLc5/d;II)V", "Lb5/k;", "textDecoration", "B", "(Landroid/text/Spannable;Lb5/k;II)V", "n", "Lb5/a;", "baselineShift", "k", "(Landroid/text/Spannable;Lb5/a;II)V", "Landroidx/compose/ui/graphics/c;", "brush", "alpha", "l", "(Landroid/text/Spannable;Landroidx/compose/ui/graphics/c;FII)V", "e", "(Lq4/b4;)Z", "spanStyle", "g", "(Lq4/h3;Lq4/h3;)Lq4/h3;", "d", "(Lq4/h3;)Z", "needsLetterSpacingSpan", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d {
    public static final void A(Spannable spannable, TextStyle textStyle, List<? extends q4.e.Range<? extends q4.e.a>> list, c5.d dVar, r<? super l, ? super FontWeight, ? super y, ? super z, ? extends Typeface> rVar) {
        MetricAffectingSpan metricAffectingSpanB;
        p(spannable, textStyle, list, rVar);
        List<? extends q4.e.Range<? extends q4.e.a>> list2 = list;
        int size = list2.size();
        boolean z15 = false;
        for (int i15 = 0; i15 < size; i15++) {
            q4.e.Range<? extends q4.e.a> range = list.get(i15);
            if (range.g() instanceof SpanStyle) {
                int iH = range.h();
                int iF = range.f();
                if (iH >= 0 && iH < spannable.length() && iF > iH && iF <= spannable.length()) {
                    z(spannable, (SpanStyle) range.g(), iH, iF, dVar);
                    if (d((SpanStyle) range.g())) {
                        z15 = true;
                    }
                }
            }
        }
        if (z15) {
            int size2 = list2.size();
            for (int i16 = 0; i16 < size2; i16++) {
                q4.e.Range<? extends q4.e.a> range2 = list.get(i16);
                q4.e.a aVarG = range2.g();
                if (aVarG instanceof SpanStyle) {
                    int iH2 = range2.h();
                    int iF2 = range2.f();
                    if (iH2 >= 0 && iH2 < spannable.length() && iF2 > iH2 && iF2 <= spannable.length() && (metricAffectingSpanB = b(((SpanStyle) aVarG).getLetterSpacing(), dVar)) != null) {
                        y(spannable, metricAffectingSpanB, iH2, iF2);
                    }
                }
            }
        }
    }

    public static final void B(Spannable spannable, k kVar, int i15, int i16) {
        if (kVar != null) {
            k.Companion companion = k.INSTANCE;
            y(spannable, new n(kVar.d(companion.d()), kVar.d(companion.b())), i15, i16);
        }
    }

    public static final void C(Spannable spannable, TextIndent textIndent, float f15, c5.d dVar) {
        float fH;
        if (textIndent != null) {
            if ((v.e(textIndent.getFirstLine(), w.g(0)) && v.e(textIndent.getRestLine(), w.g(0))) || v.f(textIndent.getFirstLine()) == 0 || v.f(textIndent.getRestLine()) == 0) {
                return;
            }
            long jG = v.g(textIndent.getFirstLine());
            x.Companion companion = x.INSTANCE;
            float fH2 = 0.0f;
            if (x.g(jG, companion.b())) {
                fH = dVar.e1(textIndent.getFirstLine());
            } else {
                fH = x.g(jG, companion.a()) ? v.h(textIndent.getFirstLine()) * f15 : 0.0f;
            }
            long jG2 = v.g(textIndent.getRestLine());
            if (x.g(jG2, companion.b())) {
                fH2 = dVar.e1(textIndent.getRestLine());
            } else if (x.g(jG2, companion.a())) {
                fH2 = v.h(textIndent.getRestLine()) * f15;
            }
            y(spannable, new LeadingMarginSpan.Standard((int) Math.ceil(fH), (int) Math.ceil(fH2)), 0, spannable.length());
        }
    }

    private static final MetricAffectingSpan b(long j15, c5.d dVar) {
        long jG = v.g(j15);
        x.Companion companion = x.INSTANCE;
        if (x.g(jG, companion.b())) {
            return new t4.f(dVar.e1(j15));
        }
        if (x.g(jG, companion.a())) {
            return new t4.e(v.h(j15));
        }
        return null;
    }

    public static final void c(SpanStyle spanStyle, List<q4.e.Range<SpanStyle>> list, q<? super SpanStyle, ? super Integer, ? super Integer, i0> qVar) {
        if (list.size() <= 1) {
            if (list.isEmpty()) {
                return;
            }
            qVar.w(g(spanStyle, list.get(0).g()), Integer.valueOf(list.get(0).h()), Integer.valueOf(list.get(0).f()));
            return;
        }
        int size = list.size();
        int i15 = size * 2;
        int[] iArr = new int[i15];
        List<q4.e.Range<SpanStyle>> list2 = list;
        int size2 = list2.size();
        for (int i16 = 0; i16 < size2; i16++) {
            q4.e.Range<SpanStyle> range = list.get(i16);
            iArr[i16] = range.h();
            iArr[i16 + size] = range.f();
        }
        pq.n.P(iArr);
        int iM0 = pq.n.m0(iArr);
        for (int i17 = 0; i17 < i15; i17++) {
            int i18 = iArr[i17];
            if (i18 != iM0) {
                int size3 = list2.size();
                SpanStyle spanStyleG = spanStyle;
                for (int i19 = 0; i19 < size3; i19++) {
                    q4.e.Range<SpanStyle> range2 = list.get(i19);
                    if (range2.h() != range2.f() && g.j(iM0, i18, range2.h(), range2.f())) {
                        spanStyleG = g(spanStyleG, range2.g());
                    }
                }
                if (spanStyleG != null) {
                    qVar.w(spanStyleG, Integer.valueOf(iM0), Integer.valueOf(i18));
                }
                iM0 = i18;
            }
        }
    }

    private static final boolean d(SpanStyle spanStyle) {
        long jG = v.g(spanStyle.getLetterSpacing());
        x.Companion companion = x.INSTANCE;
        return x.g(jG, companion.b()) || x.g(v.g(spanStyle.getLetterSpacing()), companion.a());
    }

    private static final boolean e(TextStyle textStyle) {
        return e.d(textStyle.P()) || textStyle.p() != null;
    }

    private static final boolean f(c5.d dVar) {
        return ((double) dVar.getFontScale()) > 1.05d;
    }

    private static final SpanStyle g(SpanStyle spanStyle, SpanStyle spanStyle2) {
        return spanStyle == null ? spanStyle2 : spanStyle.y(spanStyle2);
    }

    private static final float h(long j15, float f15, c5.d dVar) {
        if (v.e(j15, v.INSTANCE.a())) {
            return f15;
        }
        long jG = v.g(j15);
        x.Companion companion = x.INSTANCE;
        if (x.g(jG, companion.b())) {
            return dVar.e1(j15);
        }
        if (x.g(jG, companion.a())) {
            return v.h(j15) * f15;
        }
        return Float.NaN;
    }

    private static final float i(long j15, float f15, c5.d dVar) {
        float fH;
        long jG = v.g(j15);
        x.Companion companion = x.INSTANCE;
        if (x.g(jG, companion.b())) {
            if (!f(dVar)) {
                return dVar.e1(j15);
            }
            fH = v.h(j15) / v.h(dVar.y0(f15));
        } else {
            if (!x.g(jG, companion.a())) {
                return Float.NaN;
            }
            fH = v.h(j15);
        }
        return fH * f15;
    }

    public static final void j(Spannable spannable, long j15, int i15, int i16) {
        if (j15 != 16) {
            y(spannable, new BackgroundColorSpan(o1.j(j15)), i15, i16);
        }
    }

    private static final void k(Spannable spannable, b5.a aVar, int i15, int i16) {
        if (aVar != null) {
            y(spannable, new t4.a(aVar.getMultiplier()), i15, i16);
        }
    }

    private static final void l(Spannable spannable, androidx.compose.ui.graphics.c cVar, float f15, int i15, int i16) {
        if (cVar != null) {
            if (cVar instanceof SolidColor) {
                n(spannable, ((SolidColor) cVar).getValue(), i15, i16);
            } else {
                if (!(cVar instanceof h)) {
                    throw new p();
                }
                y(spannable, new a5.g((h) cVar, f15), i15, i16);
            }
        }
    }

    public static final void m(Spannable spannable, List<? extends q4.e.Range<? extends q4.e.a>> list, float f15, c5.d dVar, TextIndent textIndent) {
        if (textIndent != null) {
            long jG = v.g(textIndent.getFirstLine());
            x.Companion companion = x.INSTANCE;
            if (x.g(jG, companion.b())) {
                dVar.e1(textIndent.getFirstLine());
            } else if (x.g(jG, companion.a())) {
                v.h(textIndent.getFirstLine());
            }
        }
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            list.get(i15).g();
        }
    }

    public static final void n(Spannable spannable, long j15, int i15, int i16) {
        if (j15 != 16) {
            y(spannable, new ForegroundColorSpan(o1.j(j15)), i15, i16);
        }
    }

    private static final void o(Spannable spannable, p3.g gVar, int i15, int i16) {
        if (gVar != null) {
            y(spannable, new a5.d(gVar), i15, i16);
        }
    }

    private static final void p(final Spannable spannable, TextStyle textStyle, List<? extends q4.e.Range<? extends q4.e.a>> list, final r<? super l, ? super FontWeight, ? super y, ? super z, ? extends Typeface> rVar) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i15 = 0; i15 < size; i15++) {
            q4.e.Range<? extends q4.e.a> range = list.get(i15);
            if ((range.g() instanceof SpanStyle) && (e.d((SpanStyle) range.g()) || ((SpanStyle) range.g()).getFontSynthesis() != null)) {
                arrayList.add(range);
            }
        }
        c(e(textStyle) ? new SpanStyle(0L, 0L, textStyle.q(), textStyle.o(), textStyle.p(), textStyle.l(), (String) null, 0L, (b5.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (k) null, (Shadow) null, (j0) null, (p3.g) null, 65475, (fr.k) null) : null, arrayList, new q() { // from class: z4.c
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return d.q(spannable, rVar, (SpanStyle) obj, ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(Spannable spannable, r rVar, SpanStyle spanStyle, int i15, int i16) {
        l fontFamily = spanStyle.getFontFamily();
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.INSTANCE.d();
        }
        y fontStyle = spanStyle.getFontStyle();
        y yVarC = y.c(fontStyle != null ? fontStyle.getValue() : y.INSTANCE.b());
        z fontSynthesis = spanStyle.getFontSynthesis();
        spannable.setSpan(new o((Typeface) rVar.g(fontFamily, fontWeight, yVarC, z.e(fontSynthesis != null ? fontSynthesis.getValue() : z.INSTANCE.a()))), i15, i16, 33);
        return i0.f148189a;
    }

    private static final void r(Spannable spannable, String str, int i15, int i16) {
        if (str != null) {
            y(spannable, new t4.b(str), i15, i16);
        }
    }

    public static final void s(Spannable spannable, long j15, c5.d dVar, int i15, int i16) {
        long jG = v.g(j15);
        x.Companion companion = x.INSTANCE;
        if (x.g(jG, companion.b())) {
            y(spannable, new AbsoluteSizeSpan(hr.a.d(dVar.e1(j15)), false), i15, i16);
        } else if (x.g(jG, companion.a())) {
            y(spannable, new RelativeSizeSpan(v.h(j15)), i15, i16);
        }
    }

    private static final void t(Spannable spannable, TextGeometricTransform textGeometricTransform, int i15, int i16) {
        if (textGeometricTransform != null) {
            y(spannable, new ScaleXSpan(textGeometricTransform.getScaleX()), i15, i16);
            y(spannable, new m(textGeometricTransform.getSkewX()), i15, i16);
        }
    }

    public static final void u(Spannable spannable, long j15, float f15, c5.d dVar, LineHeightStyle lineHeightStyle) {
        float fI = i(j15, f15, dVar);
        if (Float.isNaN(fI)) {
            return;
        }
        y(spannable, new t4.h(fI, 0, (spannable.length() == 0 || fu.r.F1(spannable) == '\n') ? spannable.length() + 1 : spannable.length(), LineHeightStyle.d.h(lineHeightStyle.getTrim()), LineHeightStyle.d.i(lineHeightStyle.getTrim()), lineHeightStyle.getAlignment(), lineHeightStyle.getMode(), null), 0, spannable.length());
    }

    public static final void v(Spannable spannable, long j15, float f15, c5.d dVar) {
        float fI = i(j15, f15, dVar);
        if (Float.isNaN(fI)) {
            return;
        }
        y(spannable, new t4.g(fI), 0, spannable.length());
    }

    public static final void w(Spannable spannable, LocaleList localeList, int i15, int i16) {
        if (localeList != null) {
            y(spannable, a.f232818a.a(localeList), i15, i16);
        }
    }

    private static final void x(Spannable spannable, Shadow shadow, int i15, int i16) {
        if (shadow != null) {
            y(spannable, new t4.l(o1.j(shadow.getColor()), Float.intBitsToFloat((int) (shadow.getOffset() >> 32)), Float.intBitsToFloat((int) (shadow.getOffset() & BodyPartID.bodyIdMax)), e.b(shadow.getBlurRadius())), i15, i16);
        }
    }

    public static final void y(Spannable spannable, Object obj, int i15, int i16) {
        spannable.setSpan(obj, i15, i16, 33);
    }

    private static final void z(Spannable spannable, SpanStyle spanStyle, int i15, int i16, c5.d dVar) {
        k(spannable, spanStyle.getBaselineShift(), i15, i16);
        n(spannable, spanStyle.g(), i15, i16);
        l(spannable, spanStyle.f(), spanStyle.c(), i15, i16);
        B(spannable, spanStyle.getTextDecoration(), i15, i16);
        s(spannable, spanStyle.getFontSize(), dVar, i15, i16);
        r(spannable, spanStyle.getFontFeatureSettings(), i15, i16);
        t(spannable, spanStyle.getTextGeometricTransform(), i15, i16);
        w(spannable, spanStyle.getLocaleList(), i15, i16);
        j(spannable, spanStyle.getBackground(), i15, i16);
        x(spannable, spanStyle.getShadow(), i15, i16);
        o(spannable, spanStyle.getDrawStyle(), i15, i16);
    }
}
