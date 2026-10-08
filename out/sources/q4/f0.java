package q4;

import b5.LineHeightStyle;
import b5.TextIndent;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00072\b\u0010\u0002\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001f\u0010\r\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001ac\u0010 \u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0000¢\u0006\u0004\b \u0010!\u001a\u001f\u0010#\u001a\u0004\u0018\u00010\u0007*\u00020\u00002\b\u0010\"\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b#\u0010$\"\u0014\u0010&\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010%¨\u0006'"}, d2 = {"Lq4/e0;", "start", "stop", "", "fraction", "b", "(Lq4/e0;Lq4/e0;F)Lq4/e0;", "Lq4/i0;", "c", "(Lq4/i0;Lq4/i0;F)Lq4/i0;", "style", "Lc5/t;", "direction", "e", "(Lq4/e0;Lc5/t;)Lq4/e0;", "Lb5/j;", "textAlign", "Lb5/l;", "textDirection", "Lc5/v;", "lineHeight", "Lb5/s;", "textIndent", "platformStyle", "Lb5/h;", "lineHeightStyle", "Lb5/f;", "lineBreak", "Lb5/e;", "hyphens", "Lb5/u;", "textMotion", "a", "(Lq4/e0;IIJLb5/s;Lq4/i0;Lb5/h;IILb5/u;)Lq4/e0;", "other", "d", "(Lq4/e0;Lq4/i0;)Lq4/i0;", "J", "DefaultLineHeight", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f164482a = c5.v.INSTANCE.a();

    public static final ParagraphStyle a(ParagraphStyle paragraphStyle, int i15, int i16, long j15, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i17, int i18, b5.u uVar) {
        long j16;
        long j17;
        int textAlign = i15;
        TextIndent textIndent2 = textIndent;
        b5.j.Companion companion = b5.j.INSTANCE;
        if (b5.j.k(textAlign, companion.g()) || b5.j.k(textAlign, paragraphStyle.getTextAlign())) {
            if (c5.v.f(j15) == 0) {
                j16 = 0;
                j17 = j15;
            } else {
                j16 = 0;
                j17 = j15;
                if (c5.v.e(j17, paragraphStyle.getLineHeight())) {
                }
            }
            if ((textIndent2 == null || fr.t.c(textIndent2, paragraphStyle.getTextIndent())) && ((b5.l.j(i16, b5.l.INSTANCE.f()) || b5.l.j(i16, paragraphStyle.getTextDirection())) && ((platformParagraphStyle == null || fr.t.c(platformParagraphStyle, paragraphStyle.getPlatformStyle())) && ((lineHeightStyle == null || fr.t.c(lineHeightStyle, paragraphStyle.getLineHeightStyle())) && ((b5.f.f(i17, b5.f.INSTANCE.b()) || b5.f.f(i17, paragraphStyle.getLineBreak())) && ((b5.e.g(i18, b5.e.INSTANCE.c()) || b5.e.g(i18, paragraphStyle.getHyphens())) && (uVar == null || fr.t.c(uVar, paragraphStyle.getTextMotion())))))))) {
                return paragraphStyle;
            }
        } else {
            j16 = 0;
            j17 = j15;
        }
        long lineHeight = c5.v.f(j17) == j16 ? paragraphStyle.getLineHeight() : j17;
        if (textIndent2 == null) {
            textIndent2 = paragraphStyle.getTextIndent();
        }
        TextIndent textIndent3 = textIndent2;
        if (b5.j.k(textAlign, companion.g())) {
            textAlign = paragraphStyle.getTextAlign();
        }
        return new ParagraphStyle(textAlign, !b5.l.j(i16, b5.l.INSTANCE.f()) ? i16 : paragraphStyle.getTextDirection(), lineHeight, textIndent3, d(paragraphStyle, platformParagraphStyle), lineHeightStyle == null ? paragraphStyle.getLineHeightStyle() : lineHeightStyle, !b5.f.f(i17, b5.f.INSTANCE.b()) ? i17 : paragraphStyle.getLineBreak(), !b5.e.g(i18, b5.e.INSTANCE.c()) ? i18 : paragraphStyle.getHyphens(), uVar == null ? paragraphStyle.getTextMotion() : uVar, null);
    }

    public static final ParagraphStyle b(ParagraphStyle paragraphStyle, ParagraphStyle paragraphStyle2, float f15) {
        int value = ((b5.j) j3.e(b5.j.h(paragraphStyle.getTextAlign()), b5.j.h(paragraphStyle2.getTextAlign()), f15)).getValue();
        int value2 = ((b5.l) j3.e(b5.l.g(paragraphStyle.getTextDirection()), b5.l.g(paragraphStyle2.getTextDirection()), f15)).getValue();
        long jG = j3.g(paragraphStyle.getLineHeight(), paragraphStyle2.getLineHeight(), f15);
        TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.INSTANCE.a();
        }
        TextIndent textIndent2 = paragraphStyle2.getTextIndent();
        if (textIndent2 == null) {
            textIndent2 = TextIndent.INSTANCE.a();
        }
        return new ParagraphStyle(value, value2, jG, b5.t.a(textIndent, textIndent2, f15), c(paragraphStyle.getPlatformStyle(), paragraphStyle2.getPlatformStyle(), f15), (LineHeightStyle) j3.e(paragraphStyle.getLineHeightStyle(), paragraphStyle2.getLineHeightStyle(), f15), ((b5.f) j3.e(b5.f.c(paragraphStyle.getLineBreak()), b5.f.c(paragraphStyle2.getLineBreak()), f15)).getMask(), ((b5.e) j3.e(b5.e.d(paragraphStyle.getHyphens()), b5.e.d(paragraphStyle2.getHyphens()), f15)).getValue(), (b5.u) j3.e(paragraphStyle.getTextMotion(), paragraphStyle2.getTextMotion(), f15), null);
    }

    private static final PlatformParagraphStyle c(PlatformParagraphStyle platformParagraphStyle, PlatformParagraphStyle platformParagraphStyle2, float f15) {
        if (platformParagraphStyle == null && platformParagraphStyle2 == null) {
            return null;
        }
        if (platformParagraphStyle == null) {
            platformParagraphStyle = PlatformParagraphStyle.INSTANCE.a();
        }
        if (platformParagraphStyle2 == null) {
            platformParagraphStyle2 = PlatformParagraphStyle.INSTANCE.a();
        }
        return d.b(platformParagraphStyle, platformParagraphStyle2, f15);
    }

    private static final PlatformParagraphStyle d(ParagraphStyle paragraphStyle, PlatformParagraphStyle platformParagraphStyle) {
        if (paragraphStyle.getPlatformStyle() == null) {
            return platformParagraphStyle;
        }
        return platformParagraphStyle == null ? paragraphStyle.getPlatformStyle() : paragraphStyle.getPlatformStyle().d(platformParagraphStyle);
    }

    public static final ParagraphStyle e(ParagraphStyle paragraphStyle, c5.t tVar) {
        int textAlign = paragraphStyle.getTextAlign();
        b5.j.Companion companion = b5.j.INSTANCE;
        int iF = b5.j.k(textAlign, companion.g()) ? companion.f() : paragraphStyle.getTextAlign();
        int iE = c4.e(tVar, paragraphStyle.getTextDirection());
        long lineHeight = c5.v.f(paragraphStyle.getLineHeight()) == 0 ? f164482a : paragraphStyle.getLineHeight();
        TextIndent textIndent = paragraphStyle.getTextIndent();
        if (textIndent == null) {
            textIndent = TextIndent.INSTANCE.a();
        }
        TextIndent textIndent2 = textIndent;
        PlatformParagraphStyle platformStyle = paragraphStyle.getPlatformStyle();
        LineHeightStyle lineHeightStyle = paragraphStyle.getLineHeightStyle();
        int lineBreak = paragraphStyle.getLineBreak();
        b5.f.Companion companion2 = b5.f.INSTANCE;
        int iA = b5.f.f(lineBreak, companion2.b()) ? companion2.a() : paragraphStyle.getLineBreak();
        int hyphens = paragraphStyle.getHyphens();
        b5.e.Companion companion3 = b5.e.INSTANCE;
        int iB = b5.e.g(hyphens, companion3.c()) ? companion3.b() : paragraphStyle.getHyphens();
        b5.u textMotion = paragraphStyle.getTextMotion();
        if (textMotion == null) {
            textMotion = b5.u.INSTANCE.a();
        }
        return new ParagraphStyle(iF, iE, lineHeight, textIndent2, platformStyle, lineHeightStyle, iA, iB, textMotion, null);
    }
}
