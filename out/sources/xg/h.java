package xg;

import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class h extends i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient int f218452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient int f218453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ i f218454f;

    h(i iVar, int i15, int i16) {
        Objects.requireNonNull(iVar);
        this.f218454f = iVar;
        this.f218452d = i15;
        this.f218453e = i16;
    }

    @Override // xg.d
    final Object[] e() {
        return this.f218454f.e();
    }

    @Override // xg.d
    final int f() {
        return this.f218454f.f() + this.f218452d;
    }

    @Override // xg.d
    final int g() {
        return this.f218454f.f() + this.f218452d + this.f218453e;
    }

    @Override // java.util.List
    public final Object get(int i15) {
        t.b(i15, this.f218453e, "index");
        return this.f218454f.get(i15 + this.f218452d);
    }

    @Override // xg.i
    /* JADX INFO: renamed from: j */
    public final i subList(int i15, int i16) {
        t.d(i15, i16, this.f218453e);
        int i17 = this.f218452d;
        return this.f218454f.subList(i15 + i17, i16 + i17);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f218453e;
    }

    @Override // xg.i, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i15, int i16) {
        return subList(i15, i16);
    }
}
