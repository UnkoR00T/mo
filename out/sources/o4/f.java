package o4;

import c5.n;
import fr.k;
import fr.t;
import n3.g2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001BC\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0013H\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\"R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\"R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\"R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\"R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lo4/f;", "", "", "topLeft", "bottomRight", "Lc5/n;", "windowOffset", "screenOffset", "windowSize", "Ln3/g2;", "viewToWindowMatrix", "Lg4/g;", "node", "<init>", "(JJJJJ[FLg4/g;Lfr/k;)V", "viewport", "", "a", "(Lo4/f;)F", "", "left", "top", "right", "bottom", "b", "(IIII)F", "c", "()F", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "J", "d", "e", "f", "[F", "g", "Lg4/g;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long topLeft;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long bottomRight;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long windowOffset;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long screenOffset;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long windowSize;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float[] viewToWindowMatrix;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final g4.g node;

    public /* synthetic */ f(long j15, long j16, long j17, long j18, long j19, float[] fArr, g4.g gVar, k kVar) {
        this(j15, j16, j17, j18, j19, fArr, gVar);
    }

    public final float a(f viewport) {
        long j15 = viewport.topLeft;
        long j16 = viewport.bottomRight;
        return b((int) (j15 >> 32), (int) j15, (int) (j16 >> 32), (int) j16);
    }

    public final float b(int left, int top, int right, int bottom) {
        int i15 = (int) (this.topLeft >> 32);
        int iMin = Math.min(Math.max(i15, left), right);
        int i16 = (int) this.topLeft;
        int iMin2 = Math.min(Math.max(i16, top), bottom);
        int i17 = (int) (this.bottomRight >> 32);
        int iMax = Math.max(Math.min(i17, right), left);
        int i18 = (int) this.bottomRight;
        return Math.max((iMax - iMin) * (Math.max(Math.min(i18, bottom), top) - iMin2), 0) / Math.min((right - left) * (bottom - top), (i17 - i15) * (i18 - i16));
    }

    public final float c() {
        long j15 = this.windowSize;
        return b(0, 0, (int) (j15 >> 32), (int) j15);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    public boolean equals(Object other) {
        boolean zE;
        if (this == other) {
            return true;
        }
        if (other == null || f.class != other.getClass()) {
            return false;
        }
        f fVar = (f) other;
        if (this.topLeft != fVar.topLeft || this.bottomRight != fVar.bottomRight || this.windowSize != fVar.windowSize || !n.h(this.windowOffset, fVar.windowOffset) || !n.h(this.screenOffset, fVar.screenOffset)) {
            return false;
        }
        float[] fArr = this.viewToWindowMatrix;
        float[] fArr2 = fVar.viewToWindowMatrix;
        if (fArr == null) {
            if (fArr2 == null) {
                zE = true;
            } else {
                zE = false;
            }
        } else if (fArr2 == null) {
            zE = false;
        } else {
            zE = g2.e(fArr, fArr2);
        }
        return zE && t.c(this.node, fVar.node);
    }

    public int hashCode() {
        int iHashCode = ((((((((Long.hashCode(this.topLeft) * 31) + Long.hashCode(this.bottomRight)) * 31) + Long.hashCode(this.windowSize)) * 31) + n.k(this.windowOffset)) * 31) + n.k(this.screenOffset)) * 31;
        float[] fArr = this.viewToWindowMatrix;
        return ((iHashCode + (fArr != null ? g2.f(fArr) : 0)) * 31) + this.node.hashCode();
    }

    private f(long j15, long j16, long j17, long j18, long j19, float[] fArr, g4.g gVar) {
        this.topLeft = j15;
        this.bottomRight = j16;
        this.windowOffset = j17;
        this.screenOffset = j18;
        this.windowSize = j19;
        this.viewToWindowMatrix = fArr;
        this.node = gVar;
    }
}
