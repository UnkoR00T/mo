package z4;

import android.graphics.Typeface;
import androidx.compose.ui.graphics.Color;
import b5.TextGeometricTransform;
import b5.u;
import c5.v;
import c5.x;
import er.r;
import fr.t;
import m3.k;
import n3.Shadow;
import p071kotlin.Metadata;
import p3.g;
import q4.SpanStyle;
import q4.j0;
import u4.FontWeight;
import u4.l;
import u4.y;
import u4.z;
import x4.LocaleList;
import y4.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\u001aW\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012&\u0010\t\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00032\u0006\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a3\u0010\u0016\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001d\u0010\u001b\u001a\u00020\u001a*\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0013\u0010\u001d\u001a\u00020\f*\u00020\u0001H\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0017\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fH\u0000¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Ly4/i;", "Lq4/h3;", "style", "Lkotlin/Function4;", "Lu4/l;", "Lu4/d0;", "Lu4/y;", "Lu4/z;", "Landroid/graphics/Typeface;", "resolveTypeface", "Lc5/d;", "density", "", "requiresLetterSpacing", "a", "(Ly4/i;Lq4/h3;Ler/r;Lc5/d;Z)Lq4/h3;", "Lc5/v;", "letterSpacing", "Landroidx/compose/ui/graphics/Color;", "background", "Lb5/a;", "baselineShift", "c", "(JZJLb5/a;)Lq4/h3;", "Lb5/u;", "textMotion", "Loq/i0;", "e", "(Ly4/i;Lb5/u;)V", "d", "(Lq4/h3;)Z", "", "blurRadius", "b", "(F)F", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {
    public static final SpanStyle a(i iVar, SpanStyle spanStyle, r<? super l, ? super FontWeight, ? super y, ? super z, ? extends Typeface> rVar, c5.d dVar, boolean z15) {
        long jG = v.g(spanStyle.getFontSize());
        x.Companion companion = x.INSTANCE;
        if (x.g(jG, companion.b())) {
            iVar.setTextSize(dVar.e1(spanStyle.getFontSize()));
        } else if (x.g(jG, companion.a())) {
            iVar.setTextSize(iVar.getTextSize() * v.h(spanStyle.getFontSize()));
        }
        if (d(spanStyle)) {
            l fontFamily = spanStyle.getFontFamily();
            FontWeight fontWeight = spanStyle.getFontWeight();
            if (fontWeight == null) {
                fontWeight = FontWeight.INSTANCE.d();
            }
            y fontStyle = spanStyle.getFontStyle();
            y yVarC = y.c(fontStyle != null ? fontStyle.getValue() : y.INSTANCE.b());
            z fontSynthesis = spanStyle.getFontSynthesis();
            iVar.setTypeface(rVar.g(fontFamily, fontWeight, yVarC, z.e(fontSynthesis != null ? fontSynthesis.getValue() : z.INSTANCE.a())));
        }
        if (spanStyle.getLocaleList() != null && !t.c(spanStyle.getLocaleList(), LocaleList.INSTANCE.a())) {
            a.f232818a.b(iVar, spanStyle.getLocaleList());
        }
        if (spanStyle.getFontFeatureSettings() != null && !t.c(spanStyle.getFontFeatureSettings(), "")) {
            iVar.setFontFeatureSettings(spanStyle.getFontFeatureSettings());
        }
        if (spanStyle.getTextGeometricTransform() != null && !t.c(spanStyle.getTextGeometricTransform(), TextGeometricTransform.INSTANCE.a())) {
            iVar.setTextScaleX(iVar.getTextScaleX() * spanStyle.getTextGeometricTransform().getScaleX());
            iVar.setTextSkewX(iVar.getTextSkewX() + spanStyle.getTextGeometricTransform().getSkewX());
        }
        iVar.h(spanStyle.g());
        iVar.f(spanStyle.f(), k.INSTANCE.a(), spanStyle.c());
        iVar.j(spanStyle.getShadow());
        iVar.k(spanStyle.getTextDecoration());
        iVar.i(spanStyle.getDrawStyle());
        if (x.g(v.g(spanStyle.getLetterSpacing()), companion.b()) && v.h(spanStyle.getLetterSpacing()) != 0.0f) {
            float textSize = iVar.getTextSize() * iVar.getTextScaleX();
            float fE1 = dVar.e1(spanStyle.getLetterSpacing());
            if (textSize != 0.0f) {
                iVar.setLetterSpacing(fE1 / textSize);
            }
        } else if (x.g(v.g(spanStyle.getLetterSpacing()), companion.a())) {
            iVar.setLetterSpacing(v.h(spanStyle.getLetterSpacing()));
        }
        return c(spanStyle.getLetterSpacing(), z15, spanStyle.getBackground(), spanStyle.getBaselineShift());
    }

    public static final float b(float f15) {
        if (f15 == 0.0f) {
            return Float.MIN_VALUE;
        }
        return f15;
    }

    private static final SpanStyle c(long j15, boolean z15, long j16, b5.a aVar) {
        long jH = j16;
        boolean z16 = false;
        boolean z17 = z15 && x.g(v.g(j15), x.INSTANCE.b()) && v.h(j15) != 0.0f;
        Color.Companion companion = Color.INSTANCE;
        boolean z18 = (Color.m11equalsimpl0(jH, companion.h()) || Color.m11equalsimpl0(jH, companion.g())) ? false : true;
        if (aVar != null) {
            if (!b5.a.f(aVar.getMultiplier(), b5.a.INSTANCE.a())) {
                z16 = true;
            }
        }
        if (!z17 && !z18 && !z16) {
            return null;
        }
        long jA = z17 ? j15 : v.INSTANCE.a();
        if (!z18) {
            jH = companion.h();
        }
        return new SpanStyle(0L, 0L, (FontWeight) null, (y) null, (z) null, (l) null, (String) null, jA, z16 ? aVar : null, (TextGeometricTransform) null, (LocaleList) null, jH, (b5.k) null, (Shadow) null, (j0) null, (g) null, 63103, (fr.k) null);
    }

    public static final boolean d(SpanStyle spanStyle) {
        return (spanStyle.getFontFamily() == null && spanStyle.getFontStyle() == null && spanStyle.getFontWeight() == null) ? false : true;
    }

    public static final void e(i iVar, u uVar) {
        if (uVar == null) {
            uVar = u.INSTANCE.a();
        }
        iVar.setFlags(uVar.getSubpixelTextPositioning() ? iVar.getFlags() | 128 : iVar.getFlags() & (-129));
        int linearity = uVar.getLinearity();
        u.b.Companion companion = u.b.INSTANCE;
        if (u.b.g(linearity, companion.b())) {
            iVar.setFlags(iVar.getFlags() | 64);
            iVar.setHinting(0);
        } else if (u.b.g(linearity, companion.a())) {
            iVar.getFlags();
            iVar.setHinting(1);
        } else if (!u.b.g(linearity, companion.c())) {
            iVar.getFlags();
        } else {
            iVar.getFlags();
            iVar.setHinting(0);
        }
    }
}
