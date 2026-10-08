package coil3.compose;

import kc.n;
import lc.g;
import m3.e;
import m3.k;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import p3.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\u0007*\u00020\u0006H\u0014¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcoil3/compose/ImagePainter;", "Landroidx/compose/ui/graphics/painter/a;", "Lkc/n;", "image", "<init>", "(Lkc/n;)V", "Lp3/f;", "Loq/i0;", "n", "(Lp3/f;)V", "h", "Lkc/n;", "getImage", "()Lkc/n;", "Lm3/k;", "l", "()J", "intrinsicSize", "coil-compose-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ImagePainter extends androidx.compose.ui.graphics.painter.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final n image;

    public ImagePainter(n nVar) {
        this.image = nVar;
    }

    @Override // androidx.compose.ui.graphics.painter.a
    public long l() {
        int iL = this.image.l();
        float f15 = iL > 0 ? iL : Float.NaN;
        int height = this.image.getHeight();
        return k.d((((long) Float.floatToRawIntBits(height > 0 ? height : Float.NaN)) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(f15)) << 32));
    }

    @Override // androidx.compose.ui.graphics.painter.a
    protected void n(f fVar) {
        int iL = this.image.l();
        float fIntBitsToFloat = iL > 0 ? Float.intBitsToFloat((int) (fVar.a() >> 32)) / iL : 1.0f;
        int height = this.image.getHeight();
        float fIntBitsToFloat2 = height > 0 ? Float.intBitsToFloat((int) (fVar.a() & BodyPartID.bodyIdMax)) / height : 1.0f;
        long jC = e.INSTANCE.c();
        p3.d drawContext = fVar.getDrawContext();
        long jA = drawContext.a();
        drawContext.f().q();
        try {
            drawContext.getTransform().h(fIntBitsToFloat, fIntBitsToFloat2, jC);
            this.image.b(g.c(fVar.getDrawContext().f()));
        } finally {
            drawContext.f().j();
            drawContext.g(jA);
        }
    }
}
