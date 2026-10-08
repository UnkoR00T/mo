package bo;

import ao.h0;
import java.io.IOException;
import yn.a0;
import yn.r;
import yn.s;
import yn.z;

/* JADX INFO: loaded from: classes4.dex */
public final class n<T> extends m<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s<T> f20524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final yn.k<T> f20525b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final yn.f f20526c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final go.a<T> f20527d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a0 f20528e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n<T>.b f20529f = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f20530g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile z<T> f20531h;

    private final class b implements r, yn.j {
        private b() {
        }
    }

    public n(s<T> sVar, yn.k<T> kVar, yn.f fVar, go.a<T> aVar, a0 a0Var, boolean z15) {
        this.f20524a = sVar;
        this.f20525b = kVar;
        this.f20526c = fVar;
        this.f20527d = aVar;
        this.f20528e = a0Var;
        this.f20530g = z15;
    }

    private z<T> f() {
        z<T> zVar = this.f20531h;
        if (zVar != null) {
            return zVar;
        }
        z<T> zVarM = this.f20526c.m(this.f20528e, this.f20527d);
        this.f20531h = zVarM;
        return zVarM;
    }

    @Override // yn.z
    public T b(ho.a aVar) {
        if (this.f20525b == null) {
            return f().b(aVar);
        }
        yn.l lVarA = h0.a(aVar);
        if (this.f20530g && lVarA.i()) {
            return null;
        }
        return this.f20525b.a(lVarA, this.f20527d.e(), this.f20529f);
    }

    @Override // yn.z
    public void d(ho.c cVar, T t15) throws IOException {
        s<T> sVar = this.f20524a;
        if (sVar == null) {
            f().d(cVar, t15);
        } else if (this.f20530g && t15 == null) {
            cVar.M();
        } else {
            h0.b(sVar.a(t15, this.f20527d.e(), this.f20529f), cVar);
        }
    }

    @Override // bo.m
    public z<T> e() {
        return this.f20524a != null ? this : f();
    }
}
