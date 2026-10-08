package u;

import android.graphics.Bitmap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class l implements g0.a0<g0.b0<Bitmap>, g0.b0<Bitmap>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g0.y f193412a;

    l(g0.y yVar) {
        this.f193412a = yVar;
    }

    @Override // g0.a0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public g0.b0<Bitmap> apply(g0.b0<Bitmap> b0Var) {
        androidx.camera.core.o oVarA = this.f193412a.c(new g0.v(new b1(b0Var), 1)).a();
        Objects.requireNonNull(oVarA);
        Bitmap bitmapD = f0.b.d(oVarA.o2(), oVarA.l(), oVarA.getHeight());
        y.f fVarD = b0Var.d();
        Objects.requireNonNull(fVarD);
        return g0.b0.j(bitmapD, fVarD, b0Var.b(), b0Var.f(), b0Var.g(), b0Var.a());
    }
}
