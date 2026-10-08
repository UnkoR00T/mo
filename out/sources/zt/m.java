package zt;

import java.util.Collection;
import java.util.List;
import vr.t1;

/* JADX INFO: loaded from: classes4.dex */
final class m implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f237232a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f237233b = "should not have varargs or parameters with default values";

    private m() {
    }

    @Override // zt.f
    public boolean a(vr.z zVar) {
        List<t1> listL = zVar.l();
        if ((listL instanceof Collection) && listL.isEmpty()) {
            return true;
        }
        for (t1 t1Var : listL) {
            if (ht.e.f(t1Var) || t1Var.y0() != null) {
                return false;
            }
        }
        return true;
    }

    @Override // zt.f
    public /* bridge */ String b(vr.z zVar) {
        return f.a.a(this, zVar);
    }

    @Override // zt.f
    public String getDescription() {
        return f237233b;
    }
}
