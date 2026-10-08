package bs;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class h0 extends e0 implements qs.c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WildcardType f21244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Collection<qs.a> f21245c = pq.v.n();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f21246d;

    public h0(WildcardType wildcardType) {
        this.f21244b = wildcardType;
    }

    @Override // qs.d
    public boolean F() {
        return this.f21246d;
    }

    @Override // qs.c0
    public boolean P() {
        return !fr.t.c(pq.n.p0(T().getUpperBounds()), Object.class);
    }

    @Override // qs.c0
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public e0 y() {
        Type[] upperBounds = T().getUpperBounds();
        Type[] lowerBounds = T().getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            throw new UnsupportedOperationException("Wildcard types with many bounds are not yet supported: " + T());
        }
        if (lowerBounds.length == 1) {
            return e0.f21231a.a((Type) pq.n.X0(lowerBounds));
        }
        if (upperBounds.length == 1) {
            Type type = (Type) pq.n.X0(upperBounds);
            if (!fr.t.c(type, Object.class)) {
                return e0.f21231a.a(type);
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // bs.e0
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public WildcardType T() {
        return this.f21244b;
    }

    @Override // qs.d
    public Collection<qs.a> getAnnotations() {
        return this.f21245c;
    }
}
