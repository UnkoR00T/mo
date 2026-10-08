package yn;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class z<T> {

    private final class b extends z<T> {
        private b() {
        }

        @Override // yn.z
        public T b(ho.a aVar) throws IOException {
            if (aVar.a0() != ho.b.NULL) {
                return (T) z.this.b(aVar);
            }
            aVar.O();
            return null;
        }

        @Override // yn.z
        public void d(ho.c cVar, T t15) throws IOException {
            if (t15 == null) {
                cVar.M();
            } else {
                z.this.d(cVar, t15);
            }
        }

        public String toString() {
            return "NullSafeTypeAdapter[" + z.this + "]";
        }
    }

    public final z<T> a() {
        return !(this instanceof b) ? new b() : this;
    }

    public abstract T b(ho.a aVar);

    public final l c(T t15) {
        try {
            bo.h hVar = new bo.h();
            d(hVar, t15);
            return hVar.Y0();
        } catch (IOException e15) {
            throw new m(e15);
        }
    }

    public abstract void d(ho.c cVar, T t15);
}
