package ve;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> implements b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile T f206283a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f206284b;

        a(b bVar) {
            this.f206284b = bVar;
        }

        @Override // ve.f.b
        public T get() {
            if (this.f206283a == null) {
                synchronized (this) {
                    try {
                        if (this.f206283a == null) {
                            this.f206283a = (T) k.d(this.f206284b.get());
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            }
            return this.f206283a;
        }
    }

    public interface b<T> {
        T get();
    }

    public static <T> b<T> a(b<T> bVar) {
        return new a(bVar);
    }
}
