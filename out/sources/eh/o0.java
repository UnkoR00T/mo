package eh;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class o0 extends p0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient int f50867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient int f50868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ p0 f50869e;

    o0(p0 p0Var, int i15, int i16) {
        this.f50869e = p0Var;
        this.f50867c = i15;
        this.f50868d = i16;
    }

    @Override // eh.k0
    final int f() {
        return this.f50869e.g() + this.f50867c + this.f50868d;
    }

    @Override // eh.k0
    final int g() {
        return this.f50869e.g() + this.f50867c;
    }

    @Override // java.util.List
    public final Object get(int i15) {
        c.a(i15, this.f50868d, "index");
        return this.f50869e.get(i15 + this.f50867c);
    }

    @Override // eh.k0
    final Object[] h() {
        return this.f50869e.h();
    }

    @Override // eh.p0
    /* JADX INFO: renamed from: i */
    public final p0 subList(int i15, int i16) {
        c.c(i15, i16, this.f50868d);
        p0 p0Var = this.f50869e;
        int i17 = this.f50867c;
        return p0Var.subList(i15 + i17, i16 + i17);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f50868d;
    }

    @Override // eh.p0, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i15, int i16) {
        return subList(i15, i16);
    }
}
