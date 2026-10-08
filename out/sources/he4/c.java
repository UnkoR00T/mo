package he4;

import com.google.gson.a0;
import com.google.gson.f;
import com.google.gson.m;
import fv.e0;
import ge4.h;

/* JADX INFO: loaded from: classes2.dex */
final class c<T> implements h<e0, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f84064a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a0<T> f84065b;

    c(f fVar, a0<T> a0Var) {
        this.f84064a = fVar;
        this.f84065b = a0Var;
    }

    @Override // ge4.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T a(e0 e0Var) {
        zl.a aVarQ = this.f84064a.q(e0Var.m());
        try {
            T tB = this.f84065b.b(aVarQ);
            if (aVarQ.a0() != zl.b.END_DOCUMENT) {
                throw new m("JSON document was not fully consumed.");
            }
            e0Var.close();
            return tB;
        } catch (Throwable th4) {
            e0Var.close();
            throw th4;
        }
    }
}
