package vr;

import java.util.List;
import java.util.Map;
import wt.j;

/* JADX INFO: loaded from: classes4.dex */
public final class j0<Type extends wt.j> extends r1<Type> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<oq.r<zs.f, Type>> f208055a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<zs.f, Type> f208056b;

    /* JADX WARN: Multi-variable type inference failed */
    public j0(List<? extends oq.r<zs.f, ? extends Type>> list) {
        super(null);
        this.f208055a = list;
        this.f208056b = pq.v0.s(c());
    }

    @Override // vr.r1
    public boolean a(zs.f fVar) {
        return this.f208056b.containsKey(fVar);
    }

    public List<oq.r<zs.f, Type>> c() {
        return this.f208055a;
    }

    public String toString() {
        return "MultiFieldValueClassRepresentation(underlyingPropertyNamesToTypes=" + c() + ')';
    }
}
