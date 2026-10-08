package p012a2;

import c5.w;
import fr.k;
import fr.t;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import q4.TextStyle;
import u4.FontWeight;
import u4.l;

/* JADX INFO: renamed from: a2.k5, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0007\u0018\u00002\u00020\u0001Bq\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011B\u0095\u0001\b\u0016\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b*\u0010\"R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010 \u001a\u0004\b,\u0010\"R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010 \u001a\u0004\b.\u0010\"R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010 \u001a\u0004\b0\u0010\"R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010 \u001a\u0004\b2\u0010\"R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010 \u001a\u0004\b\u001f\u0010\"R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010 \u001a\u0004\b6\u0010\"R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010 \u001a\u0004\b8\u0010\"¨\u00069"}, d2 = {"La2/k5;", "", "Lq4/b4;", "h1", "h2", "h3", "h4", "h5", "h6", "subtitle1", "subtitle2", "body1", "body2", "button", "caption", "overline", "<init>", "(Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;)V", "Lu4/l;", "defaultFontFamily", "(Lu4/l;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;Lq4/b4;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lq4/b4;", "getH1", "()Lq4/b4;", "b", "getH2", "c", "getH3", "d", "getH4", "e", "getH5", "f", "getH6", "g", "getSubtitle1", "h", "getSubtitle2", "i", "getBody1", "j", "k", "l", "getCaption", "m", "getOverline", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Typography {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle h1;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle h2;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle h3;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle h4;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle h5;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle h6;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle subtitle1;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle subtitle2;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle body1;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle body2;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle button;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle caption;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle overline;

    public Typography(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13) {
        this.h1 = textStyle;
        this.h2 = textStyle2;
        this.h3 = textStyle3;
        this.h4 = textStyle4;
        this.h5 = textStyle5;
        this.h6 = textStyle6;
        this.subtitle1 = textStyle7;
        this.subtitle2 = textStyle8;
        this.body1 = textStyle9;
        this.body2 = textStyle10;
        this.button = textStyle11;
        this.caption = textStyle12;
        this.overline = textStyle13;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final TextStyle getBody2() {
        return this.body2;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final TextStyle getButton() {
        return this.button;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Typography)) {
            return false;
        }
        Typography typography = (Typography) other;
        return t.c(this.h1, typography.h1) && t.c(this.h2, typography.h2) && t.c(this.h3, typography.h3) && t.c(this.h4, typography.h4) && t.c(this.h5, typography.h5) && t.c(this.h6, typography.h6) && t.c(this.subtitle1, typography.subtitle1) && t.c(this.subtitle2, typography.subtitle2) && t.c(this.body1, typography.body1) && t.c(this.body2, typography.body2) && t.c(this.button, typography.button) && t.c(this.caption, typography.caption) && t.c(this.overline, typography.overline);
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.h1.hashCode() * 31) + this.h2.hashCode()) * 31) + this.h3.hashCode()) * 31) + this.h4.hashCode()) * 31) + this.h5.hashCode()) * 31) + this.h6.hashCode()) * 31) + this.subtitle1.hashCode()) * 31) + this.subtitle2.hashCode()) * 31) + this.body1.hashCode()) * 31) + this.body2.hashCode()) * 31) + this.button.hashCode()) * 31) + this.caption.hashCode()) * 31) + this.overline.hashCode();
    }

    public String toString() {
        return "Typography(h1=" + this.h1 + ", h2=" + this.h2 + ", h3=" + this.h3 + ", h4=" + this.h4 + ", h5=" + this.h5 + ", h6=" + this.h6 + ", subtitle1=" + this.subtitle1 + ", subtitle2=" + this.subtitle2 + ", body1=" + this.body1 + ", body2=" + this.body2 + ", button=" + this.button + ", caption=" + this.caption + ", overline=" + this.overline + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Typography(l lVar, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, int i15, k kVar) {
        TextStyle textStyleE;
        TextStyle textStyleE2;
        TextStyle textStyleE3;
        TextStyle textStyleE4;
        TextStyle textStyleE5;
        TextStyle textStyleE6;
        TextStyle textStyleE7;
        TextStyle textStyleE8;
        TextStyle textStyleE9;
        TextStyle textStyleE10;
        TextStyle textStyleE11;
        TextStyle textStyleE12;
        TextStyle textStyleE13;
        l lVarA = (i15 & 1) != 0 ? l.INSTANCE.a() : lVar;
        if ((i15 & 2) != 0) {
            textStyleE = TextStyle.e(m5.d(), 0L, w.g(96), FontWeight.INSTANCE.b(), null, null, null, null, w.e(-1.5d), null, null, null, 0L, null, null, null, 0, 0, w.g(112), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleE = textStyle;
        }
        if ((i15 & 4) != 0) {
            textStyleE2 = TextStyle.e(m5.d(), 0L, w.g(60), FontWeight.INSTANCE.b(), null, null, null, null, w.e(-0.5d), null, null, null, 0L, null, null, null, 0, 0, w.g(72), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleE2 = textStyle2;
        }
        if ((i15 & 8) != 0) {
            textStyleE3 = TextStyle.e(m5.d(), 0L, w.g(48), FontWeight.INSTANCE.d(), null, null, null, null, w.g(0), null, null, null, 0L, null, null, null, 0, 0, w.g(56), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleE3 = textStyle3;
        }
        if ((i15 & 16) != 0) {
            textStyleE4 = TextStyle.e(m5.d(), 0L, w.g(34), FontWeight.INSTANCE.d(), null, null, null, null, w.e(0.25d), null, null, null, 0L, null, null, null, 0, 0, w.g(36), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleE4 = textStyle4;
        }
        if ((i15 & 32) != 0) {
            textStyleE5 = TextStyle.e(m5.d(), 0L, w.g(24), FontWeight.INSTANCE.d(), null, null, null, null, w.g(0), null, null, null, 0L, null, null, null, 0, 0, w.g(24), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleE5 = textStyle5;
        }
        if ((i15 & 64) != 0) {
            textStyleE6 = TextStyle.e(m5.d(), 0L, w.g(20), FontWeight.INSTANCE.c(), null, null, null, null, w.e(0.15d), null, null, null, 0L, null, null, null, 0, 0, w.g(24), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleE6 = textStyle6;
        }
        if ((i15 & 128) != 0) {
            textStyleE7 = TextStyle.e(m5.d(), 0L, w.g(16), FontWeight.INSTANCE.d(), null, null, null, null, w.e(0.15d), null, null, null, 0L, null, null, null, 0, 0, w.g(24), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleE7 = textStyle7;
        }
        if ((i15 & 256) != 0) {
            textStyleE8 = TextStyle.e(m5.d(), 0L, w.g(14), FontWeight.INSTANCE.c(), null, null, null, null, w.e(0.1d), null, null, null, 0L, null, null, null, 0, 0, w.g(24), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleE8 = textStyle8;
        }
        if ((i15 & 512) != 0) {
            textStyleE9 = TextStyle.e(m5.d(), 0L, w.g(16), FontWeight.INSTANCE.d(), null, null, null, null, w.e(0.5d), null, null, null, 0L, null, null, null, 0, 0, w.g(24), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleE9 = textStyle9;
        }
        if ((i15 & 1024) != 0) {
            textStyleE10 = TextStyle.e(m5.d(), 0L, w.g(14), FontWeight.INSTANCE.d(), null, null, null, null, w.e(0.25d), null, null, null, 0L, null, null, null, 0, 0, w.g(20), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleE10 = textStyle10;
        }
        if ((i15 & 2048) != 0) {
            textStyleE11 = TextStyle.e(m5.d(), 0L, w.g(14), FontWeight.INSTANCE.c(), null, null, null, null, w.e(1.25d), null, null, null, 0L, null, null, null, 0, 0, w.g(16), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleE11 = textStyle11;
        }
        if ((i15 & PKIFailureInfo.certConfirmed) != 0) {
            textStyleE12 = TextStyle.e(m5.d(), 0L, w.g(12), FontWeight.INSTANCE.d(), null, null, null, null, w.e(0.4d), null, null, null, 0L, null, null, null, 0, 0, w.g(16), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleE12 = textStyle12;
        }
        if ((i15 & PKIFailureInfo.certRevoked) != 0) {
            textStyleE13 = TextStyle.e(m5.d(), 0L, w.g(10), FontWeight.INSTANCE.d(), null, null, null, null, w.e(1.5d), null, null, null, 0L, null, null, null, 0, 0, w.g(16), null, null, null, 0, 0, null, 16646009, null);
        } else {
            textStyleE13 = textStyle13;
        }
        this(lVarA, textStyleE, textStyleE2, textStyleE3, textStyleE4, textStyleE5, textStyleE6, textStyleE7, textStyleE8, textStyleE9, textStyleE10, textStyleE11, textStyleE12, textStyleE13);
    }

    public Typography(l lVar, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13) {
        this(m5.f(textStyle, lVar), m5.f(textStyle2, lVar), m5.f(textStyle3, lVar), m5.f(textStyle4, lVar), m5.f(textStyle5, lVar), m5.f(textStyle6, lVar), m5.f(textStyle7, lVar), m5.f(textStyle8, lVar), m5.f(textStyle9, lVar), m5.f(textStyle10, lVar), m5.f(textStyle11, lVar), m5.f(textStyle12, lVar), m5.f(textStyle13, lVar));
    }
}
