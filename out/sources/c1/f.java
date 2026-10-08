package c1;

import androidx.compose.ui.graphics.Color;
import b5.TextGeometricTransform;
import b5.k;
import c5.v;
import n3.Shadow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import q4.SpanStyle;
import q4.j0;
import u4.FontWeight;
import u4.l;
import u4.y;
import u4.z;
import x4.LocaleList;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bA\b\u0002\u0018\u00002\u00020\u0001B§\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R$\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R$\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R$\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010?\u001a\u0004\b@\u0010A\"\u0004\b/\u0010BR\"\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\"\u001a\u0004\bC\u0010$\"\u0004\bD\u0010&R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\b'\u0010HR$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR\"\u0010\u0017\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010\"\u001a\u0004\bU\u0010$\"\u0004\b!\u0010&R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010V\u001a\u0004\bW\u0010X\"\u0004\bO\u0010YR$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\bI\u0010^¨\u0006_"}, d2 = {"Lc1/f;", "", "Landroidx/compose/ui/graphics/Color;", "color", "Lc5/v;", "fontSize", "Lu4/d0;", "fontWeight", "Lu4/y;", "fontStyle", "Lu4/z;", "fontSynthesis", "Lu4/l;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "Lb5/a;", "baselineShift", "Lb5/q;", "textGeometricTransform", "Lx4/d;", "localeList", "background", "Lb5/k;", "textDecoration", "Ln3/w2;", "shadow", "<init>", "(JJLu4/d0;Lu4/y;Lu4/z;Lu4/l;Ljava/lang/String;JLb5/a;Lb5/q;Lx4/d;JLb5/k;Ln3/w2;Lfr/k;)V", "Lq4/h3;", "m", "()Lq4/h3;", "a", "J", "getColor-0d7_KjU", "()J", "c", "(J)V", "b", "getFontSize-XSAIIZE", "e", "Lu4/d0;", "getFontWeight", "()Lu4/d0;", "h", "(Lu4/d0;)V", "d", "Lu4/y;", "getFontStyle-4Lr2A7w", "()Lu4/y;", "f", "(Lu4/y;)V", "Lu4/z;", "getFontSynthesis-ZQGJjVo", "()Lu4/z;", "g", "(Lu4/z;)V", "Lu4/l;", "getFontFamily", "()Lu4/l;", "setFontFamily", "(Lu4/l;)V", "Ljava/lang/String;", "getFontFeatureSettings", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "getLetterSpacing-XSAIIZE", "i", "Lb5/a;", "getBaselineShift-5SSeXJ0", "()Lb5/a;", "(Lb5/a;)V", "j", "Lb5/q;", "getTextGeometricTransform", "()Lb5/q;", "l", "(Lb5/q;)V", "k", "Lx4/d;", "getLocaleList", "()Lx4/d;", "setLocaleList", "(Lx4/d;)V", "getBackground-0d7_KjU", "Lb5/k;", "getTextDecoration", "()Lb5/k;", "(Lb5/k;)V", "n", "Ln3/w2;", "getShadow", "()Ln3/w2;", "(Ln3/w2;)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private long color;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long fontSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private FontWeight fontWeight;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private y fontStyle;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private z fontSynthesis;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private l fontFamily;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private String fontFeatureSettings;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long letterSpacing;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private b5.a baselineShift;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private TextGeometricTransform textGeometricTransform;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private LocaleList localeList;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long background;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private k textDecoration;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private Shadow shadow;

    public /* synthetic */ f(long j15, long j16, FontWeight fontWeight, y yVar, z zVar, l lVar, String str, long j17, b5.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j18, k kVar, Shadow shadow, fr.k kVar2) {
        this(j15, j16, fontWeight, yVar, zVar, lVar, str, j17, aVar, textGeometricTransform, localeList, j18, kVar, shadow);
    }

    public final void a(long j15) {
        this.background = j15;
    }

    public final void b(b5.a aVar) {
        this.baselineShift = aVar;
    }

    public final void c(long j15) {
        this.color = j15;
    }

    public final void d(String str) {
        this.fontFeatureSettings = str;
    }

    public final void e(long j15) {
        this.fontSize = j15;
    }

    public final void f(y yVar) {
        this.fontStyle = yVar;
    }

    public final void g(z zVar) {
        this.fontSynthesis = zVar;
    }

    public final void h(FontWeight fontWeight) {
        this.fontWeight = fontWeight;
    }

    public final void i(long j15) {
        this.letterSpacing = j15;
    }

    public final void j(Shadow shadow) {
        this.shadow = shadow;
    }

    public final void k(k kVar) {
        this.textDecoration = kVar;
    }

    public final void l(TextGeometricTransform textGeometricTransform) {
        this.textGeometricTransform = textGeometricTransform;
    }

    public final SpanStyle m() {
        return new SpanStyle(this.color, this.fontSize, this.fontWeight, this.fontStyle, this.fontSynthesis, this.fontFamily, this.fontFeatureSettings, this.letterSpacing, this.baselineShift, this.textGeometricTransform, this.localeList, this.background, this.textDecoration, this.shadow, (j0) null, (p3.g) null, 49152, (fr.k) null);
    }

    private f(long j15, long j16, FontWeight fontWeight, y yVar, z zVar, l lVar, String str, long j17, b5.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j18, k kVar, Shadow shadow) {
        this.color = j15;
        this.fontSize = j16;
        this.fontWeight = fontWeight;
        this.fontStyle = yVar;
        this.fontSynthesis = zVar;
        this.fontFamily = lVar;
        this.fontFeatureSettings = str;
        this.letterSpacing = j17;
        this.baselineShift = aVar;
        this.textGeometricTransform = textGeometricTransform;
        this.localeList = localeList;
        this.background = j18;
        this.textDecoration = kVar;
        this.shadow = shadow;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ f(long j15, long j16, FontWeight fontWeight, y yVar, z zVar, l lVar, String str, long j17, b5.a aVar, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j18, k kVar, Shadow shadow, int i15, fr.k kVar2) {
        long jH = (i15 & 1) != 0 ? Color.INSTANCE.h() : j15;
        long jA = (i15 & 2) != 0 ? v.INSTANCE.a() : j16;
        FontWeight fontWeight2 = (i15 & 4) != 0 ? null : fontWeight;
        y yVar2 = (i15 & 8) != 0 ? null : yVar;
        z zVar2 = (i15 & 16) != 0 ? null : zVar;
        l lVar2 = (i15 & 32) != 0 ? null : lVar;
        String str2 = (i15 & 64) != 0 ? null : str;
        long jA2 = (i15 & 128) != 0 ? v.INSTANCE.a() : j17;
        b5.a aVar2 = (i15 & 256) != 0 ? null : aVar;
        TextGeometricTransform textGeometricTransform2 = (i15 & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i15 & 1024) != 0 ? null : localeList;
        long jH2 = (i15 & 2048) != 0 ? Color.INSTANCE.h() : j18;
        y yVar3 = yVar2;
        z zVar3 = zVar2;
        l lVar3 = lVar2;
        String str3 = str2;
        long j19 = jA2;
        b5.a aVar3 = aVar2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j25 = jH2;
        this(jH, jA, fontWeight2, yVar3, zVar3, lVar3, str3, j19, aVar3, textGeometricTransform3, localeList3, j25, (i15 & PKIFailureInfo.certConfirmed) != 0 ? null : kVar, (i15 & PKIFailureInfo.certRevoked) != 0 ? null : shadow, null);
    }
}
