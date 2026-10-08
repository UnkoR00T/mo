package bs;

import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class c0 extends e0 implements qs.v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class<?> f21225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Collection<qs.a> f21226c = pq.v.n();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f21227d;

    public c0(Class<?> cls) {
        this.f21225b = cls;
    }

    @Override // qs.d
    public boolean F() {
        return this.f21227d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bs.e0
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public Class<?> T() {
        return this.f21225b;
    }

    @Override // qs.d
    public Collection<qs.a> getAnnotations() {
        return this.f21226c;
    }

    @Override // qs.v
    public sr.m getType() {
        if (fr.t.c(T(), Void.TYPE)) {
            return null;
        }
        return jt.e.e(T().getName()).n();
    }
}
