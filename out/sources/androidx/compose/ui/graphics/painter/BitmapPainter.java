package androidx.compose.ui.graphics.painter;

import c5.n;
import c5.r;
import c5.s;
import fr.k;
import fr.t;
import n3.b2;
import n3.n1;
import n3.v1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import p3.f;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0017\u001a\u00020\u00122\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\"\u0010.\u001a\u00020(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u001f\"\u0004\b,\u0010-R\u0014\u00100\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010&R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u00101R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u00102R\u0014\u00105\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u00104¨\u00066"}, d2 = {"Landroidx/compose/ui/graphics/painter/BitmapPainter;", "Landroidx/compose/ui/graphics/painter/a;", "Ln3/b2;", "image", "Lc5/n;", "srcOffset", "Lc5/r;", "srcSize", "<init>", "(Ln3/b2;JJLfr/k;)V", "p", "(JJ)J", "Lp3/f;", "Loq/i0;", "n", "(Lp3/f;)V", "", "alpha", "", "a", "(F)Z", "Ln3/n1;", "colorFilter", "b", "(Ln3/n1;)Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "h", "Ln3/b2;", "j", "J", "k", "Ln3/v1;", "l", "I", "getFilterQuality-f-v9h1I$ui_graphics", "o", "(I)V", "filterQuality", "m", "size", "F", "Ln3/n1;", "Lm3/k;", "()J", "intrinsicSize", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BitmapPainter extends a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f9948q = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final b2 image;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final long srcOffset;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final long srcSize;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private int filterQuality;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final long size;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float alpha;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private n1 colorFilter;

    public /* synthetic */ BitmapPainter(b2 b2Var, long j15, long j16, k kVar) {
        this(b2Var, j15, j16);
    }

    private final long p(long srcOffset, long srcSize) {
        int i15;
        int i16;
        if (n.i(srcOffset) < 0 || n.j(srcOffset) < 0 || (i15 = (int) (srcSize >> 32)) < 0 || (i16 = (int) (BodyPartID.bodyIdMax & srcSize)) < 0 || i15 > this.image.l() || i16 > this.image.getHeight()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        return srcSize;
    }

    @Override // androidx.compose.ui.graphics.painter.a
    protected boolean a(float alpha) {
        this.alpha = alpha;
        return true;
    }

    @Override // androidx.compose.ui.graphics.painter.a
    protected boolean b(n1 colorFilter) {
        this.colorFilter = colorFilter;
        return true;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BitmapPainter)) {
            return false;
        }
        BitmapPainter bitmapPainter = (BitmapPainter) other;
        return t.c(this.image, bitmapPainter.image) && n.h(this.srcOffset, bitmapPainter.srcOffset) && r.e(this.srcSize, bitmapPainter.srcSize) && v1.d(this.filterQuality, bitmapPainter.filterQuality);
    }

    public int hashCode() {
        return (((((this.image.hashCode() * 31) + n.k(this.srcOffset)) * 31) + r.h(this.srcSize)) * 31) + v1.e(this.filterQuality);
    }

    @Override // androidx.compose.ui.graphics.painter.a
    public long l() {
        return s.e(this.size);
    }

    @Override // androidx.compose.ui.graphics.painter.a
    protected void n(f fVar) {
        f.f0(fVar, this.image, this.srcOffset, this.srcSize, 0L, r.c((((long) Math.round(Float.intBitsToFloat((int) (fVar.a() & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax) | (((long) Math.round(Float.intBitsToFloat((int) (fVar.a() >> 32)))) << 32)), this.alpha, null, this.colorFilter, 0, this.filterQuality, 328, null);
    }

    public final void o(int i15) {
        this.filterQuality = i15;
    }

    public String toString() {
        return "BitmapPainter(image=" + this.image + ", srcOffset=" + ((Object) n.n(this.srcOffset)) + ", srcSize=" + ((Object) r.i(this.srcSize)) + ", filterQuality=" + ((Object) v1.f(this.filterQuality)) + ')';
    }

    private BitmapPainter(b2 b2Var, long j15, long j16) {
        this.image = b2Var;
        this.srcOffset = j15;
        this.srcSize = j16;
        this.filterQuality = v1.INSTANCE.a();
        this.size = p(j15, j16);
        this.alpha = 1.0f;
    }

    public /* synthetic */ BitmapPainter(b2 b2Var, long j15, long j16, int i15, k kVar) {
        this(b2Var, (i15 & 2) != 0 ? n.INSTANCE.b() : j15, (i15 & 4) != 0 ? r.c((((long) b2Var.getHeight()) & BodyPartID.bodyIdMax) | (((long) b2Var.l()) << 32)) : j16, null);
    }
}
