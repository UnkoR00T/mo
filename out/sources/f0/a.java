package f0;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f54483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayDeque<T> f54484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f54485c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final c<T> f54486d;

    public a(int i15, c<T> cVar) {
        this.f54483a = i15;
        this.f54484b = new ArrayDeque<>(i15);
        this.f54486d = cVar;
    }

    public T a() {
        T tRemoveLast;
        synchronized (this.f54485c) {
            tRemoveLast = this.f54484b.removeLast();
        }
        return tRemoveLast;
    }

    public void b(T t15) {
        T tA;
        synchronized (this.f54485c) {
            try {
                tA = this.f54484b.size() >= this.f54483a ? a() : null;
                this.f54484b.addFirst(t15);
            } catch (Throwable th4) {
                throw th4;
            }
        }
        c<T> cVar = this.f54486d;
        if (cVar == null || tA == null) {
            return;
        }
        cVar.a(tA);
    }

    public boolean c() {
        boolean zIsEmpty;
        synchronized (this.f54485c) {
            zIsEmpty = this.f54484b.isEmpty();
        }
        return zIsEmpty;
    }
}
