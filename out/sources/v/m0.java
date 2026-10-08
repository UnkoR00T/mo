package v;

import android.graphics.Rect;
import android.util.Size;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import r.ResolvedFeatureGroup;

/* JADX INFO: loaded from: classes.dex */
public interface m0 extends o.q {
    void B(Executor executor, s sVar);

    void F(s sVar);

    boolean P();

    Set<Integer> a();

    Set<o.i0> c();

    String i();

    default void j(o.v vVar) {
        v3.b(vVar);
    }

    Rect k();

    default boolean l(ResolvedFeatureGroup bVar, o.u1 u1Var) {
        for (q.b bVar2 : bVar.a()) {
            if (!bVar2.d(this, u1Var)) {
                o.e1.a("CameraInfoInternal", bVar2 + " is not supported.");
                return false;
            }
        }
        try {
            v3.c(this, u1Var, false, bVar);
            return true;
        } catch (b0.f.a | IllegalArgumentException e15) {
            o.e1.b("CameraInfoInternal", "CameraInfoInternal.isResolvedFeatureGroupSupported failed", e15);
            return false;
        }
    }

    List<Size> o(int i15);

    Object q();

    g3 s();

    List<Size> t(int i15);

    default Set<Integer> v() {
        return Collections.EMPTY_SET;
    }

    boolean w();

    default m0 x() {
        return this;
    }
}
