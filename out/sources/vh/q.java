package vh;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
final class q<T> implements r<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CountDownLatch f206840a = new CountDownLatch(1);

    /* synthetic */ q(byte[] bArr) {
    }

    @Override // vh.h
    public final void a(T t15) {
        this.f206840a.countDown();
    }

    @Override // vh.e
    public final void b() {
        this.f206840a.countDown();
    }

    @Override // vh.g
    public final void c(Exception exc) {
        this.f206840a.countDown();
    }

    public final void d() throws InterruptedException {
        this.f206840a.await();
    }

    public final boolean e(long j15, TimeUnit timeUnit) {
        return this.f206840a.await(j15, timeUnit);
    }
}
