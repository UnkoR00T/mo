package com.google.gson.internal.bind;

import com.google.gson.a0;
import com.google.gson.b0;
import com.google.gson.f;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import wl.w;

/* JADX INFO: loaded from: classes4.dex */
public final class ArrayTypeAdapter<E> extends a0<Object> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b0 f36713c = new b0() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // com.google.gson.b0
        public <T> a0<T> b(f fVar, com.google.gson.reflect.a<T> aVar) {
            Type typeD = aVar.d();
            if (!(typeD instanceof GenericArrayType) && (!(typeD instanceof Class) || !((Class) typeD).isArray())) {
                return null;
            }
            Type typeG = w.g(typeD);
            return new ArrayTypeAdapter(fVar, fVar.l(com.google.gson.reflect.a.b(typeG)), w.k(typeG));
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<E> f36714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a0<E> f36715b;

    public ArrayTypeAdapter(f fVar, a0<E> a0Var, Class<E> cls) {
        this.f36715b = new e(fVar, a0Var, cls);
        this.f36714a = cls;
    }

    @Override // com.google.gson.a0
    public Object b(zl.a aVar) throws IOException {
        if (aVar.a0() == zl.b.NULL) {
            aVar.O();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        aVar.h();
        while (aVar.I()) {
            arrayList.add(this.f36715b.b(aVar));
        }
        aVar.u();
        int size = arrayList.size();
        if (!this.f36714a.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) this.f36714a, size));
        }
        Object objNewInstance = Array.newInstance((Class<?>) this.f36714a, size);
        for (int i15 = 0; i15 < size; i15++) {
            Array.set(objNewInstance, i15, arrayList.get(i15));
        }
        return objNewInstance;
    }

    @Override // com.google.gson.a0
    public void d(zl.c cVar, Object obj) throws IOException {
        if (obj == null) {
            cVar.M();
            return;
        }
        cVar.p();
        int length = Array.getLength(obj);
        for (int i15 = 0; i15 < length; i15++) {
            this.f36715b.d(cVar, (E) Array.get(obj, i15));
        }
        cVar.y();
    }
}
