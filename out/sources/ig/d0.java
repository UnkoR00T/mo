package ig;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class d0 implements jg.c.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ e0 f92153a;

    d0(e0 e0Var) {
        Objects.requireNonNull(e0Var);
        this.f92153a = e0Var;
    }

    @Override // jg.c.e
    public final void a() {
        this.f92153a.f92187p.f().post(new c0(this));
    }
}
