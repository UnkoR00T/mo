package o4;

import androidx.compose.ui.node.NodeCoordinator;
import c5.n;
import c5.o;
import g4.s0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lg4/g;", "node", "", "topLeft", "bottomRight", "Lc5/n;", "windowOffset", "screenOffset", "windowSize", "Ln3/g2;", "viewToWindowMatrix", "Lo4/f;", "a", "(Lg4/g;JJJJJ[F)Lo4/f;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class h {
    public static final f a(g4.g gVar, long j15, long j16, long j17, long j18, long j19, float[] fArr) {
        NodeCoordinator nodeCoordinatorN = g4.h.n(gVar, s0.a(2));
        androidx.compose.ui.node.g gVarS = g4.h.s(gVar);
        if (!gVarS.p()) {
            return null;
        }
        if (gVarS.y0() == nodeCoordinatorN) {
            return new f(j15, j16, j17, j18, j19, fArr, gVar, null);
        }
        long jD = n.d(j15);
        long jE = m3.e.e((((long) Float.floatToRawIntBits(n.i(jD))) << 32) | (((long) Float.floatToRawIntBits(n.j(jD))) & BodyPartID.bodyIdMax));
        long jB = nodeCoordinatorN.m().b();
        long jD2 = o.d(gVarS.y0().m().r(nodeCoordinatorN, jE));
        return new f(jD2, n.d((((long) (n.i(jD2) + ((int) (jB >> 32)))) << 32) | (((long) (n.j(jD2) + ((int) (jB & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax)), j17, j18, j19, fArr, gVar, null);
    }
}
