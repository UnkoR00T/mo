package bo;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import yn.z;

/* JADX INFO: loaded from: classes4.dex */
final class o<T> extends z<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final yn.f f20533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z<T> f20534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Type f20535c;

    o(yn.f fVar, z<T> zVar, Type type) {
        this.f20533a = fVar;
        this.f20534b = zVar;
        this.f20535c = type;
    }

    private static Type e(Type type, Object obj) {
        if (obj != null) {
            return ((type instanceof Class) || (type instanceof TypeVariable)) ? obj.getClass() : type;
        }
        return type;
    }

    private static boolean f(z<?> zVar) {
        z<?> zVarE;
        while ((zVar instanceof m) && (zVarE = ((m) zVar).e()) != zVar) {
            zVar = zVarE;
        }
        return zVar instanceof l.c;
    }

    @Override // yn.z
    public T b(ho.a aVar) {
        return this.f20534b.b(aVar);
    }

    @Override // yn.z
    public void d(ho.c cVar, T t15) {
        z<T> zVarK = this.f20534b;
        Type typeE = e(this.f20535c, t15);
        if (typeE != this.f20535c) {
            zVarK = this.f20533a.k(go.a.b(typeE));
            if ((zVarK instanceof l.c) && !f(this.f20534b)) {
                zVarK = this.f20534b;
            }
        }
        zVarK.d(cVar, t15);
    }
}
