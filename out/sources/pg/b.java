package pg;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import jg.s;

/* JADX INFO: loaded from: classes3.dex */
public class b implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f157303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ThreadFactory f157304b = Executors.defaultThreadFactory();

    public b(String str) {
        s.m(str, "Name must not be null");
        this.f157303a = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = this.f157304b.newThread(new c(runnable, 0));
        threadNewThread.setName(this.f157303a);
        return threadNewThread;
    }
}
