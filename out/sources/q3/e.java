package q3;

import n3.i2;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\b\u001a\u00020\u0003*\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lp3/f;", "Lq3/c;", "graphicsLayer", "Loq/i0;", "a", "(Lp3/f;Lq3/c;)V", "Ln3/i2;", "outline", "b", "(Lq3/c;Ln3/i2;)V", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {
    public static final void a(p3.f fVar, c cVar) {
        cVar.h(fVar.getDrawContext().f(), fVar.getDrawContext().getGraphicsLayer());
    }

    public static final void b(c cVar, i2 i2Var) {
        if (i2Var instanceof i2.b) {
            i2.b bVar = (i2.b) i2Var;
            long jE = m3.e.e((((long) Float.floatToRawIntBits(bVar.b().getLeft())) << 32) | (((long) Float.floatToRawIntBits(bVar.b().getTop())) & BodyPartID.bodyIdMax));
            m3.g gVarB = bVar.b();
            float right = gVarB.getRight() - gVarB.getLeft();
            m3.g gVarB2 = bVar.b();
            cVar.U(jE, m3.k.d((((long) Float.floatToRawIntBits(gVarB2.getBottom() - gVarB2.getTop())) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(right) << 32)));
            return;
        }
        if (i2Var instanceof i2.a) {
            cVar.R(((i2.a) i2Var).getPath());
            return;
        }
        if (!(i2Var instanceof i2.c)) {
            throw new oq.p();
        }
        i2.c cVar2 = (i2.c) i2Var;
        if (cVar2.getRoundRectPath() != null) {
            cVar.R(cVar2.getRoundRectPath());
            return;
        }
        m3.i roundRect = cVar2.getRoundRect();
        long jE2 = m3.e.e((((long) Float.floatToRawIntBits(roundRect.getLeft())) << 32) | (((long) Float.floatToRawIntBits(roundRect.getTop())) & BodyPartID.bodyIdMax));
        float fL = roundRect.l();
        cVar.Z(jE2, m3.k.d((((long) Float.floatToRawIntBits(roundRect.f())) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fL) << 32)), Float.intBitsToFloat((int) (roundRect.getBottomLeftCornerRadius() >> 32)));
    }
}
