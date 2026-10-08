package com.bumptech.glide.load.data;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final e.a<?> f28829b = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, e.a<?>> f28830a = new HashMap();

    class a implements e.a<Object> {
        a() {
        }

        @Override // com.bumptech.glide.load.data.e.a
        public Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @Override // com.bumptech.glide.load.data.e.a
        public e<Object> b(Object obj) {
            return new b(obj);
        }
    }

    private static final class b implements e<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f28831a;

        b(Object obj) {
            this.f28831a = obj;
        }

        @Override // com.bumptech.glide.load.data.e
        public Object a() {
            return this.f28831a;
        }

        @Override // com.bumptech.glide.load.data.e
        public void b() {
        }
    }

    public synchronized <T> e<T> a(T t15) {
        e.a<?> aVar;
        try {
            ve.k.d(t15);
            aVar = this.f28830a.get(t15.getClass());
            if (aVar == null) {
                for (e.a<?> aVar2 : this.f28830a.values()) {
                    if (aVar2.a().isAssignableFrom(t15.getClass())) {
                        aVar = aVar2;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = f28829b;
            }
        } catch (Throwable th4) {
            throw th4;
        }
        return (e<T>) aVar.b(t15);
    }

    public synchronized void b(e.a<?> aVar) {
        this.f28830a.put(aVar.a(), aVar);
    }
}
