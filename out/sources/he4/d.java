package he4;

import com.google.gson.a0;
import com.google.gson.f;
import fv.c0;
import fv.x;

/* JADX INFO: loaded from: classes2.dex */
final class d<T> extends c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f84066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a0<T> f84067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final T f84068d;

    public d(f fVar, a0<T> a0Var, T t15) {
        this.f84066b = fVar;
        this.f84067c = a0Var;
        this.f84068d = t15;
    }

    @Override // fv.c0
    /* JADX INFO: renamed from: b */
    public x getF67282b() {
        return b.f84060d;
    }

    @Override // fv.c0
    public void h(vv.f fVar) {
        b.c(fVar, this.f84066b, this.f84067c, this.f84068d);
    }
}
