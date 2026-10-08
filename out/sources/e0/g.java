package e0;

import android.media.MediaCodec;
import androidx.camera.core.internal.compat.quirk.SurfaceOrderQuirk;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import o.m1;
import v.j3;
import v.u1;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f46492a;

    public g() {
        this.f46492a = androidx.camera.core.internal.compat.quirk.a.b(SurfaceOrderQuirk.class) != null;
    }

    public static /* synthetic */ int a(g gVar, j3.f fVar, j3.f fVar2) {
        gVar.getClass();
        return gVar.b(fVar.f()) - gVar.b(fVar2.f());
    }

    private int b(u1 u1Var) {
        if (u1Var.g() == MediaCodec.class) {
            return 2;
        }
        return (u1Var.g() == m1.class || u1Var.g() == k0.g.class) ? 0 : 1;
    }

    public void c(List<j3.f> list) {
        if (this.f46492a) {
            Collections.sort(list, new Comparator() { // from class: e0.f
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return g.a(this.f46491a, (j3.f) obj, (j3.f) obj2);
                }
            });
        }
    }
}
