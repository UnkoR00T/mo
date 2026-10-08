package q4;

import androidx.compose.ui.graphics.Color;
import b5.TextGeometricTransform;
import n3.Shadow;
import p071kotlin.Metadata;
import u4.FontWeight;
import x4.LocaleList;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\u0001\u001a\u00028\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\t\u0010\n\u001a%\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a-\u0010\u0013\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00102\u0006\u0010\b\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0013\u0010\u0002\u001a\u00020\u0010*\u00020\u0010H\u0002¢\u0006\u0004\b\u0002\u0010\u0015\u001a-\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\f\u001a\u0004\u0018\u00010\u00162\b\u0010\r\u001a\u0004\u0018\u00010\u00162\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a½\u0001\u0010:\u001a\u00020\u000b*\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\"2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010)\u001a\u0004\u0018\u00010(2\b\u0010+\u001a\u0004\u0018\u00010*2\u0006\u0010,\u001a\u00020\u00002\b\u0010.\u001a\u0004\u0018\u00010-2\b\u00100\u001a\u0004\u0018\u00010/2\b\u00102\u001a\u0004\u0018\u0001012\u0006\u00103\u001a\u00020\u001c2\b\u00105\u001a\u0004\u0018\u0001042\b\u00106\u001a\u0004\u0018\u00010\u00102\b\u00107\u001a\u0004\u0018\u00010\u00162\b\u00109\u001a\u0004\u0018\u000108H\u0000¢\u0006\u0004\b:\u0010;\u001a\u001f\u0010=\u001a\u0004\u0018\u00010\u0016*\u00020\u000b2\b\u0010<\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b=\u0010>\"\u0014\u0010@\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010?\"\u0014\u0010A\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010?\"\u0014\u0010B\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010?\"\u0014\u0010C\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010?\"\u0014\u0010F\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010E¨\u0006G"}, d2 = {"Lc5/v;", "a", "b", "", "t", "g", "(JJF)J", "T", "fraction", "e", "(Ljava/lang/Object;Ljava/lang/Object;F)Ljava/lang/Object;", "Lq4/h3;", "start", "stop", "d", "(Lq4/h3;Lq4/h3;F)Lq4/h3;", "Ln3/w2;", "lhs", "rhs", "i", "(Ln3/w2;Ln3/w2;F)Ln3/w2;", "(Ln3/w2;)Ln3/w2;", "Lq4/j0;", "f", "(Lq4/j0;Lq4/j0;F)Lq4/j0;", "style", "j", "(Lq4/h3;)Lq4/h3;", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/graphics/c;", "brush", "alpha", "fontSize", "Lu4/d0;", "fontWeight", "Lu4/y;", "fontStyle", "Lu4/z;", "fontSynthesis", "Lu4/l;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "Lb5/a;", "baselineShift", "Lb5/q;", "textGeometricTransform", "Lx4/d;", "localeList", "background", "Lb5/k;", "textDecoration", "shadow", "platformStyle", "Lp3/g;", "drawStyle", "c", "(Lq4/h3;JLandroidx/compose/ui/graphics/c;FJLu4/d0;Lu4/y;Lu4/z;Lu4/l;Ljava/lang/String;JLb5/a;Lb5/q;Lx4/d;JLb5/k;Ln3/w2;Lq4/j0;Lp3/g;)Lq4/h3;", "other", "h", "(Lq4/h3;Lq4/j0;)Lq4/j0;", "J", "DefaultFontSize", "DefaultLetterSpacing", "DefaultBackgroundColor", "DefaultColor", "Lb5/p;", "Lb5/p;", "DefaultColorForegroundStyle", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f164533a = c5.w.g(14);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f164534b = c5.w.g(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f164535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f164536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final b5.p f164537e;

    static {
        Color.Companion companion = Color.INSTANCE;
        f164535c = companion.g();
        long jA = companion.a();
        f164536d = jA;
        f164537e = b5.p.INSTANCE.b(jA);
    }

    private static final Shadow b(Shadow shadow) {
        return Shadow.c(shadow, Color.m9copywmQWz5c$default(shadow.getColor(), 0.0f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0.0f, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0183  */
    /* JADX WARN: Code duplicated, block: B:102:0x0187  */
    /* JADX WARN: Code duplicated, block: B:105:0x0193  */
    /* JADX WARN: Code duplicated, block: B:106:0x0198  */
    /* JADX WARN: Code duplicated, block: B:108:0x019c  */
    /* JADX WARN: Code duplicated, block: B:110:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:112:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:113:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:117:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:119:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:11:0x003a A[PHI: r11
      0x003a: PHI (r11v7 long) = 
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v8 long)
     binds: [B:41:0x00ab, B:53:0x00dd, B:50:0x00d1, B:47:0x00c5, B:44:0x00b9, B:39:0x009d, B:34:0x008e, B:28:0x0076, B:25:0x006e, B:22:0x0062, B:19:0x0056, B:9:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:121:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:124:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:125:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:83:0x013e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0147  */
    /* JADX WARN: Code duplicated, block: B:87:0x0157  */
    /* JADX WARN: Code duplicated, block: B:88:0x015c  */
    /* JADX WARN: Code duplicated, block: B:91:0x0166  */
    /* JADX WARN: Code duplicated, block: B:93:0x016c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0171  */
    /* JADX WARN: Code duplicated, block: B:96:0x0175  */
    /* JADX WARN: Code duplicated, block: B:97:0x017a  */
    /* JADX WARN: Code duplicated, block: B:99:0x017e  */
    public static final SpanStyle c(SpanStyle spanStyle, long j15, androidx.compose.ui.graphics.c cVar, float f15, long j16, FontWeight fontWeight, u4.y yVar, u4.z zVar, u4.l lVar, String str, long j17, b5.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j18, b5.k kVar, Shadow shadow, j0 j0Var, p3.g gVar) {
        long fontSize;
        TextGeometricTransform textGeometricTransform2;
        long background;
        p3.g gVar2;
        b5.p pVarB;
        u4.l fontFamily;
        FontWeight fontWeight2;
        u4.y fontStyle;
        u4.z fontSynthesis;
        long letterSpacing;
        LocaleList localeList2;
        p3.g drawStyle;
        String fontFeatureSettings = str;
        b5.a baselineShift = aVar;
        b5.k textDecoration = kVar;
        Shadow shadow2 = shadow;
        if (!(c5.v.f(j16) == 0)) {
            fontSize = j16;
            if (!c5.v.e(fontSize, spanStyle.getFontSize())) {
                textGeometricTransform2 = textGeometricTransform;
                background = j18;
                gVar2 = gVar;
            }
            if (cVar != null) {
                pVarB = b5.p.INSTANCE.a(cVar, f15);
            } else {
                pVarB = b5.p.INSTANCE.b(j15);
            }
            b5.p pVarD = spanStyle.getTextForegroundStyle().d(pVarB);
            if (lVar == null) {
                fontFamily = spanStyle.getFontFamily();
            } else {
                fontFamily = lVar;
            }
            if (c5.v.f(fontSize) == 0) {
                fontSize = spanStyle.getFontSize();
            }
            if (fontWeight == null) {
                fontWeight2 = spanStyle.getFontWeight();
            } else {
                fontWeight2 = fontWeight;
            }
            if (yVar == null) {
                fontStyle = spanStyle.getFontStyle();
            } else {
                fontStyle = yVar;
            }
            if (zVar == null) {
                fontSynthesis = spanStyle.getFontSynthesis();
            } else {
                fontSynthesis = zVar;
            }
            if (fontFeatureSettings == null) {
                fontFeatureSettings = spanStyle.getFontFeatureSettings();
            }
            if (c5.v.f(j17) == 0) {
                letterSpacing = spanStyle.getLetterSpacing();
            } else {
                letterSpacing = j17;
            }
            if (baselineShift == null) {
                baselineShift = spanStyle.getBaselineShift();
            }
            if (textGeometricTransform2 == null) {
                textGeometricTransform2 = spanStyle.getTextGeometricTransform();
            }
            if (localeList == null) {
                localeList2 = spanStyle.getLocaleList();
            } else {
                localeList2 = localeList;
            }
            if (background == 16) {
                background = spanStyle.getBackground();
            }
            if (textDecoration == null) {
                textDecoration = spanStyle.getTextDecoration();
            }
            if (shadow2 == null) {
                shadow2 = spanStyle.getShadow();
            }
            Shadow shadow3 = shadow2;
            j0 j0VarH = h(spanStyle, j0Var);
            if (gVar2 == null) {
                drawStyle = spanStyle.getDrawStyle();
            } else {
                drawStyle = gVar2;
            }
            return new SpanStyle(pVarD, fontSize, fontWeight2, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform2, localeList2, background, textDecoration, shadow3, j0VarH, drawStyle, (fr.k) null);
        }
        fontSize = j16;
        if ((cVar != null || j15 == 16 || Color.m11equalsimpl0(j15, spanStyle.getTextForegroundStyle().getValue())) && ((yVar == null || fr.t.c(yVar, spanStyle.getFontStyle())) && ((fontWeight == null || fr.t.c(fontWeight, spanStyle.getFontWeight())) && (lVar == null || lVar == spanStyle.getFontFamily())))) {
            if ((c5.v.f(j17) == 0) || c5.v.e(j17, spanStyle.getLetterSpacing())) {
                if ((textDecoration == null || fr.t.c(textDecoration, spanStyle.getTextDecoration())) && fr.t.c(cVar, spanStyle.getTextForegroundStyle().h()) && ((cVar == null || f15 == spanStyle.getTextForegroundStyle().a()) && ((zVar == null || fr.t.c(zVar, spanStyle.getFontSynthesis())) && ((fontFeatureSettings == null || fr.t.c(fontFeatureSettings, spanStyle.getFontFeatureSettings())) && (baselineShift == null || fr.t.c(baselineShift, spanStyle.getBaselineShift())))))) {
                    if (textGeometricTransform != null) {
                        textGeometricTransform2 = textGeometricTransform;
                        if (fr.t.c(textGeometricTransform2, spanStyle.getTextGeometricTransform())) {
                        }
                    } else {
                        textGeometricTransform2 = textGeometricTransform;
                    }
                    if (localeList == null || fr.t.c(localeList, spanStyle.getLocaleList())) {
                        if (j18 != 16) {
                            background = j18;
                            if (Color.m11equalsimpl0(background, spanStyle.getBackground())) {
                            }
                        } else {
                            background = j18;
                        }
                        if ((shadow2 == null || fr.t.c(shadow2, spanStyle.getShadow())) && (j0Var == null || fr.t.c(j0Var, spanStyle.getPlatformStyle()))) {
                            gVar2 = gVar;
                            if (gVar2 == null || fr.t.c(gVar2, spanStyle.getDrawStyle())) {
                                return spanStyle;
                            }
                        }
                    }
                    gVar2 = gVar;
                } else {
                    textGeometricTransform2 = textGeometricTransform;
                }
                background = j18;
                gVar2 = gVar;
            } else {
                textGeometricTransform2 = textGeometricTransform;
                background = j18;
                gVar2 = gVar;
            }
        } else {
            textGeometricTransform2 = textGeometricTransform;
            background = j18;
            gVar2 = gVar;
        }
        if (cVar != null) {
            pVarB = b5.p.INSTANCE.a(cVar, f15);
        } else {
            pVarB = b5.p.INSTANCE.b(j15);
        }
        b5.p pVarD2 = spanStyle.getTextForegroundStyle().d(pVarB);
        if (lVar == null) {
            fontFamily = spanStyle.getFontFamily();
        } else {
            fontFamily = lVar;
        }
        if (c5.v.f(fontSize) == 0) {
            fontSize = spanStyle.getFontSize();
        }
        if (fontWeight == null) {
            fontWeight2 = spanStyle.getFontWeight();
        } else {
            fontWeight2 = fontWeight;
        }
        if (yVar == null) {
            fontStyle = spanStyle.getFontStyle();
        } else {
            fontStyle = yVar;
        }
        if (zVar == null) {
            fontSynthesis = spanStyle.getFontSynthesis();
        } else {
            fontSynthesis = zVar;
        }
        if (fontFeatureSettings == null) {
            fontFeatureSettings = spanStyle.getFontFeatureSettings();
        }
        if (c5.v.f(j17) == 0) {
            letterSpacing = spanStyle.getLetterSpacing();
        } else {
            letterSpacing = j17;
        }
        if (baselineShift == null) {
            baselineShift = spanStyle.getBaselineShift();
        }
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = spanStyle.getTextGeometricTransform();
        }
        if (localeList == null) {
            localeList2 = spanStyle.getLocaleList();
        } else {
            localeList2 = localeList;
        }
        if (background == 16) {
            background = spanStyle.getBackground();
        }
        if (textDecoration == null) {
            textDecoration = spanStyle.getTextDecoration();
        }
        if (shadow2 == null) {
            shadow2 = spanStyle.getShadow();
        }
        Shadow shadow4 = shadow2;
        j0 j0VarH2 = h(spanStyle, j0Var);
        if (gVar2 == null) {
            drawStyle = spanStyle.getDrawStyle();
        } else {
            drawStyle = gVar2;
        }
        return new SpanStyle(pVarD2, fontSize, fontWeight2, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform2, localeList2, background, textDecoration, shadow4, j0VarH2, drawStyle, (fr.k) null);
    }

    public static final SpanStyle d(SpanStyle spanStyle, SpanStyle spanStyle2, float f15) {
        b5.p pVarB = b5.m.b(spanStyle.getTextForegroundStyle(), spanStyle2.getTextForegroundStyle(), f15);
        u4.l lVar = (u4.l) e(spanStyle.getFontFamily(), spanStyle2.getFontFamily(), f15);
        long jG = g(spanStyle.getFontSize(), spanStyle2.getFontSize(), f15);
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.INSTANCE.d();
        }
        FontWeight fontWeight2 = spanStyle2.getFontWeight();
        if (fontWeight2 == null) {
            fontWeight2 = FontWeight.INSTANCE.d();
        }
        FontWeight fontWeightA = u4.g0.a(fontWeight, fontWeight2, f15);
        u4.y yVar = (u4.y) e(spanStyle.getFontStyle(), spanStyle2.getFontStyle(), f15);
        u4.z zVar = (u4.z) e(spanStyle.getFontSynthesis(), spanStyle2.getFontSynthesis(), f15);
        String str = (String) e(spanStyle.getFontFeatureSettings(), spanStyle2.getFontFeatureSettings(), f15);
        long jG2 = g(spanStyle.getLetterSpacing(), spanStyle2.getLetterSpacing(), f15);
        b5.a baselineShift = spanStyle.getBaselineShift();
        float multiplier = baselineShift != null ? baselineShift.getMultiplier() : b5.a.d(0.0f);
        b5.a baselineShift2 = spanStyle2.getBaselineShift();
        float fA = b5.b.a(multiplier, baselineShift2 != null ? baselineShift2.getMultiplier() : b5.a.d(0.0f), f15);
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.INSTANCE.a();
        }
        TextGeometricTransform textGeometricTransform2 = spanStyle2.getTextGeometricTransform();
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = TextGeometricTransform.INSTANCE.a();
        }
        return new SpanStyle(pVarB, jG, fontWeightA, yVar, zVar, lVar, str, jG2, b5.a.c(fA), b5.r.a(textGeometricTransform, textGeometricTransform2, f15), (LocaleList) e(spanStyle.getLocaleList(), spanStyle2.getLocaleList(), f15), n3.o1.h(spanStyle.getBackground(), spanStyle2.getBackground(), f15), (b5.k) e(spanStyle.getTextDecoration(), spanStyle2.getTextDecoration(), f15), i(spanStyle.getShadow(), spanStyle2.getShadow(), f15), f(spanStyle.getPlatformStyle(), spanStyle2.getPlatformStyle(), f15), (p3.g) e(spanStyle.getDrawStyle(), spanStyle2.getDrawStyle(), f15), (fr.k) null);
    }

    public static final <T> T e(T t15, T t16, float f15) {
        return ((double) f15) < 0.5d ? t15 : t16;
    }

    private static final j0 f(j0 j0Var, j0 j0Var2, float f15) {
        if (j0Var == null && j0Var2 == null) {
            return null;
        }
        if (j0Var == null) {
            j0Var = j0.INSTANCE.a();
        }
        if (j0Var2 == null) {
            j0Var2 = j0.INSTANCE.a();
        }
        return d.c(j0Var, j0Var2, f15);
    }

    public static final long g(long j15, long j16, float f15) {
        return (c5.v.f(j15) == 0 || c5.v.f(j16) == 0) ? ((c5.v) e(c5.v.b(j15), c5.v.b(j16), f15)).getPackedValue() : c5.w.h(j15, j16, f15);
    }

    private static final j0 h(SpanStyle spanStyle, j0 j0Var) {
        if (spanStyle.getPlatformStyle() == null) {
            return j0Var;
        }
        return j0Var == null ? spanStyle.getPlatformStyle() : spanStyle.getPlatformStyle().b(j0Var);
    }

    public static final Shadow i(Shadow shadow, Shadow shadow2, float f15) {
        if (!k.isCorrectShadowLerpWithNullsEnabled) {
            if (shadow == null) {
                shadow = new Shadow(0L, 0L, 0.0f, 7, null);
            }
            if (shadow2 == null) {
                shadow2 = new Shadow(0L, 0L, 0.0f, 7, null);
            }
            return n3.x2.a(shadow, shadow2, f15);
        }
        if (shadow == null && shadow2 == null) {
            return null;
        }
        if (shadow == null) {
            return n3.x2.a(b(shadow2), shadow2, f15);
        }
        return shadow2 == null ? n3.x2.a(shadow, b(shadow), f15) : n3.x2.a(shadow, shadow2, f15);
    }

    public static final SpanStyle j(SpanStyle spanStyle) {
        b5.p pVarF = spanStyle.getTextForegroundStyle().f(new er.a() { // from class: q4.i3
            @Override // er.a
            public final Object a() {
                return j3.k();
            }
        });
        long fontSize = c5.v.f(spanStyle.getFontSize()) == 0 ? f164533a : spanStyle.getFontSize();
        FontWeight fontWeight = spanStyle.getFontWeight();
        if (fontWeight == null) {
            fontWeight = FontWeight.INSTANCE.d();
        }
        FontWeight fontWeight2 = fontWeight;
        u4.y fontStyle = spanStyle.getFontStyle();
        u4.y yVarC = u4.y.c(fontStyle != null ? fontStyle.getValue() : u4.y.INSTANCE.b());
        u4.z fontSynthesis = spanStyle.getFontSynthesis();
        u4.z zVarE = u4.z.e(fontSynthesis != null ? fontSynthesis.getValue() : u4.z.INSTANCE.a());
        u4.l fontFamily = spanStyle.getFontFamily();
        if (fontFamily == null) {
            fontFamily = u4.l.INSTANCE.a();
        }
        u4.l lVar = fontFamily;
        String fontFeatureSettings = spanStyle.getFontFeatureSettings();
        if (fontFeatureSettings == null) {
            fontFeatureSettings = "";
        }
        String str = fontFeatureSettings;
        long letterSpacing = c5.v.f(spanStyle.getLetterSpacing()) == 0 ? f164534b : spanStyle.getLetterSpacing();
        b5.a baselineShift = spanStyle.getBaselineShift();
        float multiplier = baselineShift != null ? baselineShift.getMultiplier() : b5.a.INSTANCE.a();
        if (Float.isNaN(multiplier)) {
            multiplier = b5.a.INSTANCE.a();
        }
        b5.a aVarC = b5.a.c(multiplier);
        TextGeometricTransform textGeometricTransform = spanStyle.getTextGeometricTransform();
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.INSTANCE.a();
        }
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        LocaleList localeList = spanStyle.getLocaleList();
        if (localeList == null) {
            localeList = LocaleList.INSTANCE.a();
        }
        LocaleList localeList2 = localeList;
        long background = spanStyle.getBackground();
        if (background == 16) {
            background = f164535c;
        }
        long j15 = background;
        b5.k textDecoration = spanStyle.getTextDecoration();
        if (textDecoration == null) {
            textDecoration = b5.k.INSTANCE.c();
        }
        b5.k kVar = textDecoration;
        Shadow shadow = spanStyle.getShadow();
        if (shadow == null) {
            shadow = Shadow.INSTANCE.a();
        }
        Shadow shadow2 = shadow;
        j0 platformStyle = spanStyle.getPlatformStyle();
        p3.g drawStyle = spanStyle.getDrawStyle();
        if (drawStyle == null) {
            drawStyle = p3.j.f152592b;
        }
        return new SpanStyle(pVarF, fontSize, fontWeight2, yVarC, zVarE, lVar, str, letterSpacing, aVarC, textGeometricTransform2, localeList2, j15, kVar, shadow2, platformStyle, drawStyle, (fr.k) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b5.p k() {
        return f164537e;
    }
}
