package com.google.gson;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a0<T> {

    private final class b extends a0<T> {
        private b() {
        }

        @Override // com.google.gson.a0
        public T b(zl.a aVar) throws IOException {
            if (aVar.a0() != zl.b.NULL) {
                return (T) a0.this.b(aVar);
            }
            aVar.O();
            return null;
        }

        @Override // com.google.gson.a0
        public void d(zl.c cVar, T t15) throws IOException {
            if (t15 == null) {
                cVar.M();
            } else {
                a0.this.d(cVar, t15);
            }
        }

        public String toString() {
            return "NullSafeTypeAdapter[" + a0.this + "]";
        }
    }

    public final a0<T> a() {
        return !(this instanceof b) ? new b() : this;
    }

    public abstract T b(zl.a aVar);

    public final l c(T t15) {
        try {
            com.google.gson.internal.bind.c cVar = new com.google.gson.internal.bind.c();
            d(cVar, t15);
            return cVar.Y0();
        } catch (IOException e15) {
            throw new m(e15);
        }
    }

    public abstract void d(zl.c cVar, T t15);
}
