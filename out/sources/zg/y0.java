package zg;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class y0 extends z0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient int f235125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient int f235126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ z0 f235127e;

    y0(z0 z0Var, int i15, int i16) {
        this.f235127e = z0Var;
        this.f235125c = i15;
        this.f235126d = i16;
    }

    @Override // zg.w0
    final Object[] e() {
        return this.f235127e.e();
    }

    @Override // zg.w0
    final int f() {
        return this.f235127e.f() + this.f235125c;
    }

    @Override // zg.w0
    final int g() {
        return this.f235127e.f() + this.f235125c + this.f235126d;
    }

    @Override // java.util.List
    public final Object get(int i15) {
        t0.a(i15, this.f235126d, "index");
        return this.f235127e.get(i15 + this.f235125c);
    }

    @Override // zg.w0
    final boolean i() {
        return true;
    }

    @Override // zg.z0
    /* JADX INFO: renamed from: k */
    public final z0 subList(int i15, int i16) {
        t0.c(i15, i16, this.f235126d);
        int i17 = this.f235125c;
        return this.f235127e.subList(i15 + i17, i16 + i17);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f235126d;
    }

    @Override // zg.z0, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i15, int i16) {
        return subList(i15, i16);
    }
}
