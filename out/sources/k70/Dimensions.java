package k70;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: k70.c, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b\u001c\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001d\u001a\u0004\b\"\u0010\u001fR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b&\u0010\u001fR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001d\u001a\u0004\b'\u0010\u001fR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001d\u001a\u0004\b(\u0010\u001fR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b)\u0010\u001fR\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b*\u0010\u001f¨\u0006+"}, d2 = {"Lk70/c;", "", "Lc5/h;", "zero", "strokeWidth", "spacing25", "spacing50", "spacing100", "spacing150", "spacing200", "spacing250", "spacing300", "spacing400", "spacing500", "spacing600", "spacing700", "<init>", "(FFFFFFFFFFFFFLfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "F", "m", "()F", "b", "l", "c", "d", "h", "e", "f", "g", "i", "j", "k", "theme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Dimensions {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final float zero;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float strokeWidth;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final float spacing25;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final float spacing50;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final float spacing100;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final float spacing150;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final float spacing200;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final float spacing250;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final float spacing300;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final float spacing400;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final float spacing500;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final float spacing600;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final float spacing700;

    public /* synthetic */ Dimensions(float f15, float f16, float f17, float f18, float f19, float f25, float f26, float f27, float f28, float f29, float f35, float f36, float f37, fr.k kVar) {
        this(f15, f16, f17, f18, f19, f25, f26, f27, f28, f29, f35, f36, f37);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getSpacing100() {
        return this.spacing100;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final float getSpacing150() {
        return this.spacing150;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getSpacing200() {
        return this.spacing200;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getSpacing25() {
        return this.spacing25;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getSpacing250() {
        return this.spacing250;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Dimensions)) {
            return false;
        }
        Dimensions dimensions = (Dimensions) other;
        return c5.h.p(this.zero, dimensions.zero) && c5.h.p(this.strokeWidth, dimensions.strokeWidth) && c5.h.p(this.spacing25, dimensions.spacing25) && c5.h.p(this.spacing50, dimensions.spacing50) && c5.h.p(this.spacing100, dimensions.spacing100) && c5.h.p(this.spacing150, dimensions.spacing150) && c5.h.p(this.spacing200, dimensions.spacing200) && c5.h.p(this.spacing250, dimensions.spacing250) && c5.h.p(this.spacing300, dimensions.spacing300) && c5.h.p(this.spacing400, dimensions.spacing400) && c5.h.p(this.spacing500, dimensions.spacing500) && c5.h.p(this.spacing600, dimensions.spacing600) && c5.h.p(this.spacing700, dimensions.spacing700);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getSpacing300() {
        return this.spacing300;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final float getSpacing400() {
        return this.spacing400;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final float getSpacing50() {
        return this.spacing50;
    }

    public int hashCode() {
        return (((((((((((((((((((((((c5.h.q(this.zero) * 31) + c5.h.q(this.strokeWidth)) * 31) + c5.h.q(this.spacing25)) * 31) + c5.h.q(this.spacing50)) * 31) + c5.h.q(this.spacing100)) * 31) + c5.h.q(this.spacing150)) * 31) + c5.h.q(this.spacing200)) * 31) + c5.h.q(this.spacing250)) * 31) + c5.h.q(this.spacing300)) * 31) + c5.h.q(this.spacing400)) * 31) + c5.h.q(this.spacing500)) * 31) + c5.h.q(this.spacing600)) * 31) + c5.h.q(this.spacing700);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final float getSpacing500() {
        return this.spacing500;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final float getSpacing600() {
        return this.spacing600;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final float getSpacing700() {
        return this.spacing700;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final float getStrokeWidth() {
        return this.strokeWidth;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final float getZero() {
        return this.zero;
    }

    public String toString() {
        return "Dimensions(zero=" + ((Object) c5.h.r(this.zero)) + ", strokeWidth=" + ((Object) c5.h.r(this.strokeWidth)) + ", spacing25=" + ((Object) c5.h.r(this.spacing25)) + ", spacing50=" + ((Object) c5.h.r(this.spacing50)) + ", spacing100=" + ((Object) c5.h.r(this.spacing100)) + ", spacing150=" + ((Object) c5.h.r(this.spacing150)) + ", spacing200=" + ((Object) c5.h.r(this.spacing200)) + ", spacing250=" + ((Object) c5.h.r(this.spacing250)) + ", spacing300=" + ((Object) c5.h.r(this.spacing300)) + ", spacing400=" + ((Object) c5.h.r(this.spacing400)) + ", spacing500=" + ((Object) c5.h.r(this.spacing500)) + ", spacing600=" + ((Object) c5.h.r(this.spacing600)) + ", spacing700=" + ((Object) c5.h.r(this.spacing700)) + ')';
    }

    private Dimensions(float f15, float f16, float f17, float f18, float f19, float f25, float f26, float f27, float f28, float f29, float f35, float f36, float f37) {
        this.zero = f15;
        this.strokeWidth = f16;
        this.spacing25 = f17;
        this.spacing50 = f18;
        this.spacing100 = f19;
        this.spacing150 = f25;
        this.spacing200 = f26;
        this.spacing250 = f27;
        this.spacing300 = f28;
        this.spacing400 = f29;
        this.spacing500 = f35;
        this.spacing600 = f36;
        this.spacing700 = f37;
    }

    public /* synthetic */ Dimensions(float f15, float f16, float f17, float f18, float f19, float f25, float f26, float f27, float f28, float f29, float f35, float f36, float f37, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? c5.h.n(0) : f15, (i15 & 2) != 0 ? c5.h.n(1) : f16, (i15 & 4) != 0 ? c5.h.n(2) : f17, (i15 & 8) != 0 ? c5.h.n(4) : f18, (i15 & 16) != 0 ? c5.h.n(8) : f19, (i15 & 32) != 0 ? c5.h.n(12) : f25, (i15 & 64) != 0 ? c5.h.n(16) : f26, (i15 & 128) != 0 ? c5.h.n(20) : f27, (i15 & 256) != 0 ? c5.h.n(24) : f28, (i15 & 512) != 0 ? c5.h.n(32) : f29, (i15 & 1024) != 0 ? c5.h.n(40) : f35, (i15 & 2048) != 0 ? c5.h.n(48) : f36, (i15 & PKIFailureInfo.certConfirmed) != 0 ? c5.h.n(56) : f37, null);
    }
}
