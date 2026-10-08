package bo;

import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import yn.a0;
import yn.z;

/* JADX INFO: loaded from: classes4.dex */
public final class a<E> extends z<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a0 f20458c = new C0535a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<E> f20459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z<E> f20460b;

    /* JADX INFO: renamed from: bo.a$a, reason: collision with other inner class name */
    class C0535a implements a0 {
        C0535a() {
        }

        @Override // yn.a0
        public <T> z<T> b(yn.f fVar, go.a<T> aVar) {
            Type typeE = aVar.e();
            if (!(typeE instanceof GenericArrayType) && (!(typeE instanceof Class) || !((Class) typeE).isArray())) {
                return null;
            }
            Type typeG = ao.b.g(typeE);
            return new a(fVar, fVar.k(go.a.b(typeG)), ao.b.k(typeG));
        }
    }

    public a(yn.f fVar, z<E> zVar, Class<E> cls) {
        this.f20460b = new o(fVar, zVar, cls);
        this.f20459a = cls;
    }

    @Override // yn.z
    public Object b(ho.a aVar) throws IOException {
        if (aVar.a0() == ho.b.NULL) {
            aVar.O();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.h();
        while (aVar.I()) {
            arrayList.add(this.f20460b.b(aVar));
        }
        aVar.u();
        int size = arrayList.size();
        if (!this.f20459a.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.f20459a, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) this.f20459a, size);
        for (int i15 = 0; i15 < size; i15++) {
            Array.set(objNewInstance, i15, arrayList.get(i15));
        }
        return objNewInstance;
    }

    @Override // yn.z
    public void d(ho.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.M();
            return;
        }
        cVar.p();
        int length = Array.getLength(obj);
        for (int i15 = 0; i15 < length; i15++) {
            this.f20460b.d(cVar, (E) Array.get(obj, i15));
        }
        cVar.y();
    }
}
