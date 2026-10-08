package zg;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class o implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ o f235098a = new o();

    private /* synthetic */ o() {
    }

    @Override // java.util.concurrent.Executor
    public final /* synthetic */ void execute(Runnable runnable) {
        runnable.run();
    }
}
