package u;

import androidx.camera.core.ImageProcessingUtil;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class h0 implements g0.a0<g0.b0<byte[]>, g0.b0<androidx.camera.core.o>> {
    @Override // g0.a0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public g0.b0<androidx.camera.core.o> apply(g0.b0<byte[]> b0Var) {
        androidx.camera.core.r rVar = new androidx.camera.core.r(androidx.camera.core.p.a(b0Var.h().getWidth(), b0Var.h().getHeight(), 256, 2));
        androidx.camera.core.o oVarE = ImageProcessingUtil.e(rVar, b0Var.c());
        rVar.j();
        Objects.requireNonNull(oVarE);
        y.f fVarD = b0Var.d();
        Objects.requireNonNull(fVarD);
        return g0.b0.k(oVarE, fVarD, b0Var.b(), b0Var.f(), b0Var.g(), b0Var.a());
    }
}
