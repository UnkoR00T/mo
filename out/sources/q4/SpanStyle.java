package q4;

import androidx.compose.ui.graphics.Color;
import b5.TextGeometricTransform;
import n3.Shadow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import u4.FontWeight;
import x4.LocaleList;

/* JADX INFO: renamed from: q4.h3, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b7\b\u0007\u0018\u00002\u00020\u0001B¿\u0001\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"BÁ\u0001\b\u0016\u0012\b\b\u0002\u0010#\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010$BË\u0001\b\u0016\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\b\u0002\u0010(\u001a\u00020'\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010)J\u001b\u0010+\u001a\u00020\u00002\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b+\u0010,JÅ\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010#\u001a\u00020\u00172\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u0002002\b\u0010*\u001a\u0004\u0018\u00010/H\u0096\u0002¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u0002002\u0006\u0010*\u001a\u00020\u0000H\u0000¢\u0006\u0004\b3\u00104J\u0017\u00105\u001a\u0002002\u0006\u0010*\u001a\u00020\u0000H\u0000¢\u0006\u0004\b5\u00104J\u000f\u00107\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u000206H\u0000¢\u0006\u0004\b9\u00108J\u000f\u0010:\u001a\u00020\u000eH\u0016¢\u0006\u0004\b:\u0010;R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010;R\u0017\u0010\u0010\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bV\u0010@\u001a\u0004\bW\u0010BR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\bQ\u0010X\u001a\u0004\bK\u0010YR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\bU\u0010Z\u001a\u0004\b[\u0010\\R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bA\u0010]\u001a\u0004\b^\u0010_R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\bI\u0010@\u001a\u0004\bG\u0010BR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\bM\u0010`\u001a\u0004\ba\u0010bR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\bE\u0010c\u001a\u0004\bd\u0010eR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\bW\u0010f\u001a\u0004\bg\u0010hR\u0019\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\f\n\u0004\b^\u0010i\u001a\u0004\bV\u0010jR\u0011\u0010#\u001a\u00020\u00178F¢\u0006\u0006\u001a\u0004\bS\u0010BR\u0013\u0010&\u001a\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\bO\u0010kR\u0011\u0010(\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\bC\u0010l¨\u0006m"}, d2 = {"Lq4/h3;", "Lq4/e$a;", "Lb5/p;", "textForegroundStyle", "Lc5/v;", "fontSize", "Lu4/d0;", "fontWeight", "Lu4/y;", "fontStyle", "Lu4/z;", "fontSynthesis", "Lu4/l;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "Lb5/a;", "baselineShift", "Lb5/q;", "textGeometricTransform", "Lx4/d;", "localeList", "Landroidx/compose/ui/graphics/Color;", "background", "Lb5/k;", "textDecoration", "Ln3/w2;", "shadow", "Lq4/j0;", "platformStyle", "Lp3/g;", "drawStyle", "<init>", "(Lb5/p;JLu4/d0;Lu4/y;Lu4/z;Lu4/l;Ljava/lang/String;JLb5/a;Lb5/q;Lx4/d;JLb5/k;Ln3/w2;Lq4/j0;Lp3/g;Lfr/k;)V", "color", "(JJLu4/d0;Lu4/y;Lu4/z;Lu4/l;Ljava/lang/String;JLb5/a;Lb5/q;Lx4/d;JLb5/k;Ln3/w2;Lq4/j0;Lp3/g;Lfr/k;)V", "Landroidx/compose/ui/graphics/c;", "brush", "", "alpha", "(Landroidx/compose/ui/graphics/c;FJLu4/d0;Lu4/y;Lu4/z;Lu4/l;Ljava/lang/String;JLb5/a;Lb5/q;Lx4/d;JLb5/k;Ln3/w2;Lq4/j0;Lp3/g;Lfr/k;)V", "other", "y", "(Lq4/h3;)Lq4/h3;", "a", "(JJLu4/d0;Lu4/y;Lu4/z;Lu4/l;Ljava/lang/String;JLb5/a;Lb5/q;Lx4/d;JLb5/k;Ln3/w2;Lq4/j0;Lp3/g;)Lq4/h3;", "", "", "equals", "(Ljava/lang/Object;)Z", "v", "(Lq4/h3;)Z", "w", "", "hashCode", "()I", "x", "toString", "()Ljava/lang/String;", "Lb5/p;", "t", "()Lb5/p;", "b", "J", "k", "()J", "c", "Lu4/d0;", "n", "()Lu4/d0;", "d", "Lu4/y;", "l", "()Lu4/y;", "e", "Lu4/z;", "m", "()Lu4/z;", "f", "Lu4/l;", "i", "()Lu4/l;", "g", "Ljava/lang/String;", "j", "h", "o", "Lb5/a;", "()Lb5/a;", "Lb5/q;", "u", "()Lb5/q;", "Lx4/d;", "p", "()Lx4/d;", "Lb5/k;", "s", "()Lb5/k;", "Ln3/w2;", "r", "()Ln3/w2;", "Lq4/j0;", "q", "()Lq4/j0;", "Lp3/g;", "()Lp3/g;", "()Landroidx/compose/ui/graphics/c;", "()F", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SpanStyle implements e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b5.p textForegroundStyle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long fontSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final FontWeight fontWeight;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final u4.y fontStyle;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final u4.z fontSynthesis;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final u4.l fontFamily;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String fontFeatureSettings;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final long letterSpacing;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final b5.a baselineShift;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextGeometricTransform textGeometricTransform;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocaleList localeList;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final long background;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final b5.k textDecoration;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final Shadow shadow;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final j0 platformStyle;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final p3.g drawStyle;

    public /* synthetic */ SpanStyle(long j15, long j16, FontWeight fontWeight, u4.y yVar, u4.z zVar, u4.l lVar, String str, long j17, b5.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j18, b5.k kVar, Shadow shadow, j0 j0Var, p3.g gVar, fr.k kVar2) {
        this(j15, j16, fontWeight, yVar, zVar, lVar, str, j17, aVar, textGeometricTransform, localeList, j18, kVar, shadow, j0Var, gVar);
    }

    public static /* synthetic */ SpanStyle b(SpanStyle spanStyle, long j15, long j16, FontWeight fontWeight, u4.y yVar, u4.z zVar, u4.l lVar, String str, long j17, b5.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j18, b5.k kVar, Shadow shadow, j0 j0Var, p3.g gVar, int i15, Object obj) {
        long jG = (i15 & 1) != 0 ? spanStyle.g() : j15;
        return spanStyle.a(jG, (i15 & 2) != 0 ? spanStyle.fontSize : j16, (i15 & 4) != 0 ? spanStyle.fontWeight : fontWeight, (i15 & 8) != 0 ? spanStyle.fontStyle : yVar, (i15 & 16) != 0 ? spanStyle.fontSynthesis : zVar, (i15 & 32) != 0 ? spanStyle.fontFamily : lVar, (i15 & 64) != 0 ? spanStyle.fontFeatureSettings : str, (i15 & 128) != 0 ? spanStyle.letterSpacing : j17, (i15 & 256) != 0 ? spanStyle.baselineShift : aVar, (i15 & 512) != 0 ? spanStyle.textGeometricTransform : textGeometricTransform, (i15 & 1024) != 0 ? spanStyle.localeList : localeList, (i15 & 2048) != 0 ? spanStyle.background : j18, (i15 & PKIFailureInfo.certConfirmed) != 0 ? spanStyle.textDecoration : kVar, (i15 & PKIFailureInfo.certRevoked) != 0 ? spanStyle.shadow : shadow, (i15 & 16384) != 0 ? spanStyle.platformStyle : j0Var, (i15 & 32768) != 0 ? spanStyle.drawStyle : gVar);
    }

    public final SpanStyle a(long color, long fontSize, FontWeight fontWeight, u4.y fontStyle, u4.z fontSynthesis, u4.l fontFamily, String fontFeatureSettings, long letterSpacing, b5.a baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, b5.k textDecoration, Shadow shadow, j0 platformStyle, p3.g drawStyle) {
        return new SpanStyle(Color.m11equalsimpl0(color, g()) ? this.textForegroundStyle : b5.p.INSTANCE.b(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle, drawStyle, (fr.k) null);
    }

    public final float c() {
        return this.textForegroundStyle.a();
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final b5.a getBaselineShift() {
        return this.baselineShift;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpanStyle)) {
            return false;
        }
        SpanStyle spanStyle = (SpanStyle) other;
        return v(spanStyle) && w(spanStyle);
    }

    public final androidx.compose.ui.graphics.c f() {
        return this.textForegroundStyle.h();
    }

    public final long g() {
        return this.textForegroundStyle.b();
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final p3.g getDrawStyle() {
        return this.drawStyle;
    }

    public int hashCode() {
        int iM17hashCodeimpl = Color.m17hashCodeimpl(g()) * 31;
        androidx.compose.ui.graphics.c cVarF = f();
        int iHashCode = (((((iM17hashCodeimpl + (cVarF != null ? cVarF.hashCode() : 0)) * 31) + Float.hashCode(c())) * 31) + c5.v.i(this.fontSize)) * 31;
        FontWeight fontWeight = this.fontWeight;
        int weight = (iHashCode + (fontWeight != null ? fontWeight.getWeight() : 0)) * 31;
        u4.y yVar = this.fontStyle;
        int iG = (weight + (yVar != null ? u4.y.g(yVar.getValue()) : 0)) * 31;
        u4.z zVar = this.fontSynthesis;
        int i15 = (iG + (zVar != null ? u4.z.i(zVar.getValue()) : 0)) * 31;
        u4.l lVar = this.fontFamily;
        int iHashCode2 = (i15 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        String str = this.fontFeatureSettings;
        int iHashCode3 = (((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + c5.v.i(this.letterSpacing)) * 31;
        b5.a aVar = this.baselineShift;
        int iG2 = (iHashCode3 + (aVar != null ? b5.a.g(aVar.getMultiplier()) : 0)) * 31;
        TextGeometricTransform textGeometricTransform = this.textGeometricTransform;
        int iHashCode4 = (iG2 + (textGeometricTransform != null ? textGeometricTransform.hashCode() : 0)) * 31;
        LocaleList localeList = this.localeList;
        int iHashCode5 = (((iHashCode4 + (localeList != null ? localeList.hashCode() : 0)) * 31) + Color.m17hashCodeimpl(this.background)) * 31;
        b5.k kVar = this.textDecoration;
        int iHashCode6 = (iHashCode5 + (kVar != null ? kVar.hashCode() : 0)) * 31;
        Shadow shadow = this.shadow;
        int iHashCode7 = (iHashCode6 + (shadow != null ? shadow.hashCode() : 0)) * 31;
        j0 j0Var = this.platformStyle;
        int iHashCode8 = (iHashCode7 + (j0Var != null ? j0Var.hashCode() : 0)) * 31;
        p3.g gVar = this.drawStyle;
        return iHashCode8 + (gVar != null ? gVar.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final u4.l getFontFamily() {
        return this.fontFamily;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getFontFeatureSettings() {
        return this.fontFeatureSettings;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getFontSize() {
        return this.fontSize;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final u4.y getFontStyle() {
        return this.fontStyle;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final u4.z getFontSynthesis() {
        return this.fontSynthesis;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final long getLetterSpacing() {
        return this.letterSpacing;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final LocaleList getLocaleList() {
        return this.localeList;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final j0 getPlatformStyle() {
        return this.platformStyle;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final Shadow getShadow() {
        return this.shadow;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final b5.k getTextDecoration() {
        return this.textDecoration;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final b5.p getTextForegroundStyle() {
        return this.textForegroundStyle;
    }

    public String toString() {
        return "SpanStyle(color=" + ((Object) Color.m18toStringimpl(g())) + ", brush=" + f() + ", alpha=" + c() + ", fontSize=" + ((Object) c5.v.k(this.fontSize)) + ", fontWeight=" + this.fontWeight + ", fontStyle=" + this.fontStyle + ", fontSynthesis=" + this.fontSynthesis + ", fontFamily=" + this.fontFamily + ", fontFeatureSettings=" + this.fontFeatureSettings + ", letterSpacing=" + ((Object) c5.v.k(this.letterSpacing)) + ", baselineShift=" + this.baselineShift + ", textGeometricTransform=" + this.textGeometricTransform + ", localeList=" + this.localeList + ", background=" + ((Object) Color.m18toStringimpl(this.background)) + ", textDecoration=" + this.textDecoration + ", shadow=" + this.shadow + ", platformStyle=" + this.platformStyle + ", drawStyle=" + this.drawStyle + ')';
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final TextGeometricTransform getTextGeometricTransform() {
        return this.textGeometricTransform;
    }

    public final boolean v(SpanStyle other) {
        if (this == other) {
            return true;
        }
        return c5.v.e(this.fontSize, other.fontSize) && fr.t.c(this.fontWeight, other.fontWeight) && fr.t.c(this.fontStyle, other.fontStyle) && fr.t.c(this.fontSynthesis, other.fontSynthesis) && fr.t.c(this.fontFamily, other.fontFamily) && fr.t.c(this.fontFeatureSettings, other.fontFeatureSettings) && c5.v.e(this.letterSpacing, other.letterSpacing) && fr.t.c(this.baselineShift, other.baselineShift) && fr.t.c(this.textGeometricTransform, other.textGeometricTransform) && fr.t.c(this.localeList, other.localeList) && Color.m11equalsimpl0(this.background, other.background) && fr.t.c(this.platformStyle, other.platformStyle);
    }

    public final boolean w(SpanStyle other) {
        return fr.t.c(this.textForegroundStyle, other.textForegroundStyle) && fr.t.c(this.textDecoration, other.textDecoration) && fr.t.c(this.shadow, other.shadow) && fr.t.c(this.drawStyle, other.drawStyle);
    }

    public final int x() {
        int i15 = c5.v.i(this.fontSize) * 31;
        FontWeight fontWeight = this.fontWeight;
        int weight = (i15 + (fontWeight != null ? fontWeight.getWeight() : 0)) * 31;
        u4.y yVar = this.fontStyle;
        int iG = (weight + (yVar != null ? u4.y.g(yVar.getValue()) : 0)) * 31;
        u4.z zVar = this.fontSynthesis;
        int i16 = (iG + (zVar != null ? u4.z.i(zVar.getValue()) : 0)) * 31;
        u4.l lVar = this.fontFamily;
        int iHashCode = (i16 + (lVar != null ? lVar.hashCode() : 0)) * 31;
        String str = this.fontFeatureSettings;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + c5.v.i(this.letterSpacing)) * 31;
        b5.a aVar = this.baselineShift;
        int iG2 = (iHashCode2 + (aVar != null ? b5.a.g(aVar.getMultiplier()) : 0)) * 31;
        TextGeometricTransform textGeometricTransform = this.textGeometricTransform;
        int iHashCode3 = (iG2 + (textGeometricTransform != null ? textGeometricTransform.hashCode() : 0)) * 31;
        LocaleList localeList = this.localeList;
        int iHashCode4 = (((iHashCode3 + (localeList != null ? localeList.hashCode() : 0)) * 31) + Color.m17hashCodeimpl(this.background)) * 31;
        j0 j0Var = this.platformStyle;
        return iHashCode4 + (j0Var != null ? j0Var.hashCode() : 0);
    }

    public final SpanStyle y(SpanStyle other) {
        return other == null ? this : j3.c(this, other.textForegroundStyle.b(), other.textForegroundStyle.h(), other.textForegroundStyle.a(), other.fontSize, other.fontWeight, other.fontStyle, other.fontSynthesis, other.fontFamily, other.fontFeatureSettings, other.letterSpacing, other.baselineShift, other.textGeometricTransform, other.localeList, other.background, other.textDecoration, other.shadow, other.platformStyle, other.drawStyle);
    }

    public /* synthetic */ SpanStyle(androidx.compose.ui.graphics.c cVar, float f15, long j15, FontWeight fontWeight, u4.y yVar, u4.z zVar, u4.l lVar, String str, long j16, b5.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j17, b5.k kVar, Shadow shadow, j0 j0Var, p3.g gVar, fr.k kVar2) {
        this(cVar, f15, j15, fontWeight, yVar, zVar, lVar, str, j16, aVar, textGeometricTransform, localeList, j17, kVar, shadow, j0Var, gVar);
    }

    public /* synthetic */ SpanStyle(b5.p pVar, long j15, FontWeight fontWeight, u4.y yVar, u4.z zVar, u4.l lVar, String str, long j16, b5.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j17, b5.k kVar, Shadow shadow, j0 j0Var, p3.g gVar, fr.k kVar2) {
        this(pVar, j15, fontWeight, yVar, zVar, lVar, str, j16, aVar, textGeometricTransform, localeList, j17, kVar, shadow, j0Var, gVar);
    }

    private SpanStyle(b5.p pVar, long j15, FontWeight fontWeight, u4.y yVar, u4.z zVar, u4.l lVar, String str, long j16, b5.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j17, b5.k kVar, Shadow shadow, j0 j0Var, p3.g gVar) {
        this.textForegroundStyle = pVar;
        this.fontSize = j15;
        this.fontWeight = fontWeight;
        this.fontStyle = yVar;
        this.fontSynthesis = zVar;
        this.fontFamily = lVar;
        this.fontFeatureSettings = str;
        this.letterSpacing = j16;
        this.baselineShift = aVar;
        this.textGeometricTransform = textGeometricTransform;
        this.localeList = localeList;
        this.background = j17;
        this.textDecoration = kVar;
        this.shadow = shadow;
        this.platformStyle = j0Var;
        this.drawStyle = gVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ SpanStyle(long j15, long j16, FontWeight fontWeight, u4.y yVar, u4.z zVar, u4.l lVar, String str, long j17, b5.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j18, b5.k kVar, Shadow shadow, j0 j0Var, p3.g gVar, int i15, fr.k kVar2) {
        long jH = (i15 & 1) != 0 ? Color.INSTANCE.h() : j15;
        long jA = (i15 & 2) != 0 ? c5.v.INSTANCE.a() : j16;
        FontWeight fontWeight2 = (i15 & 4) != 0 ? null : fontWeight;
        u4.y yVar2 = (i15 & 8) != 0 ? null : yVar;
        u4.z zVar2 = (i15 & 16) != 0 ? null : zVar;
        u4.l lVar2 = (i15 & 32) != 0 ? null : lVar;
        String str2 = (i15 & 64) != 0 ? null : str;
        long jA2 = (i15 & 128) != 0 ? c5.v.INSTANCE.a() : j17;
        b5.a aVar2 = (i15 & 256) != 0 ? null : aVar;
        TextGeometricTransform textGeometricTransform2 = (i15 & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i15 & 1024) != 0 ? null : localeList;
        long jH2 = (i15 & 2048) != 0 ? Color.INSTANCE.h() : j18;
        b5.k kVar3 = (i15 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar;
        long j19 = jH;
        Shadow shadow2 = (i15 & PKIFailureInfo.certRevoked) != 0 ? null : shadow;
        j0 j0Var2 = (i15 & 16384) != 0 ? null : j0Var;
        long j25 = jA;
        FontWeight fontWeight3 = fontWeight2;
        b5.k kVar4 = kVar3;
        u4.y yVar3 = yVar2;
        u4.z zVar3 = zVar2;
        u4.l lVar3 = lVar2;
        String str3 = str2;
        long j26 = jA2;
        b5.a aVar3 = aVar2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j27 = jH2;
        this(j19, j25, fontWeight3, yVar3, zVar3, lVar3, str3, j26, aVar3, textGeometricTransform3, localeList3, j27, kVar4, shadow2, j0Var2, (i15 & 32768) != 0 ? null : gVar, (fr.k) null);
    }

    private SpanStyle(long j15, long j16, FontWeight fontWeight, u4.y yVar, u4.z zVar, u4.l lVar, String str, long j17, b5.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j18, b5.k kVar, Shadow shadow, j0 j0Var, p3.g gVar) {
        this(b5.p.INSTANCE.b(j15), j16, fontWeight, yVar, zVar, lVar, str, j17, aVar, textGeometricTransform, localeList, j18, kVar, shadow, j0Var, gVar, (fr.k) null);
    }

    private SpanStyle(androidx.compose.ui.graphics.c cVar, float f15, long j15, FontWeight fontWeight, u4.y yVar, u4.z zVar, u4.l lVar, String str, long j16, b5.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j17, b5.k kVar, Shadow shadow, j0 j0Var, p3.g gVar) {
        this(b5.p.INSTANCE.a(cVar, f15), j15, fontWeight, yVar, zVar, lVar, str, j16, aVar, textGeometricTransform, localeList, j17, kVar, shadow, j0Var, gVar, (fr.k) null);
    }
}
