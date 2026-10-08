package bs;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends e0 implements qs.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Type f21249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final e0 f21250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Collection<qs.a> f21251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f21252e;

    public m(Type type) {
        e0 e0VarA;
        this.f21249b = type;
        Type typeT = T();
        if (!(typeT instanceof GenericArrayType)) {
            if (typeT instanceof Class) {
                Class cls = (Class) typeT;
                e0VarA = cls.isArray() ? e0.f21231a.a(cls.getComponentType()) : e0VarA;
            }
            throw new IllegalArgumentException("Not an array type (" + T().getClass() + "): " + T());
        }
        e0VarA = e0.f21231a.a(((GenericArrayType) typeT).getGenericComponentType());
        this.f21250c = e0VarA;
        this.f21251d = pq.v.n();
    }

    @Override // qs.d
    public boolean F() {
        return this.f21252e;
    }

    @Override // bs.e0
    protected Type T() {
        return this.f21249b;
    }

    @Override // qs.f
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public e0 m() {
        return this.f21250c;
    }

    @Override // qs.d
    public Collection<qs.a> getAnnotations() {
        return this.f21251d;
    }
}
