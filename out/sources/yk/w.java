package yk;

/* JADX INFO: loaded from: classes4.dex */
public class w<T> implements kl.b<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f227520c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Object f227521a = f227520c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile kl.b<T> f227522b;

    public w(kl.b<T> bVar) {
        this.f227522b = bVar;
    }

    @Override // kl.b
    public T get() {
        T t15;
        T t16 = (T) this.f227521a;
        Object obj = f227520c;
        if (t16 != obj) {
            return t16;
        }
        synchronized (this) {
            try {
                t15 = (T) this.f227521a;
                if (t15 == obj) {
                    t15 = this.f227522b.get();
                    this.f227521a = t15;
                    this.f227522b = null;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return t15;
    }
}
