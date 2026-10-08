package ce;

import ce.l;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
abstract class c<T extends l> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Queue<T> f25498a = ve.l.f(20);

    c() {
    }

    abstract T a();

    T b() {
        T tPoll = this.f25498a.poll();
        return tPoll == null ? (T) a() : tPoll;
    }

    public void c(T t15) {
        if (this.f25498a.size() < 20) {
            this.f25498a.offer(t15);
        }
    }
}
