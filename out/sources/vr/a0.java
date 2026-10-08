package vr;

import wt.j;

/* JADX INFO: loaded from: classes4.dex */
public final class a0<Type extends wt.j> extends r1<Type> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zs.f f208015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Type f208016b;

    public a0(zs.f fVar, Type type) {
        super(null);
        this.f208015a = fVar;
        this.f208016b = type;
    }

    @Override // vr.r1
    public boolean a(zs.f fVar) {
        return fr.t.c(this.f208015a, fVar);
    }

    public final zs.f c() {
        return this.f208015a;
    }

    public final Type d() {
        return this.f208016b;
    }

    public String toString() {
        return "InlineClassRepresentation(underlyingPropertyName=" + this.f208015a + ", underlyingType=" + this.f208016b + ')';
    }
}
