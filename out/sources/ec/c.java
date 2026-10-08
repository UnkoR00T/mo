package ec;

import android.os.Handler;
import android.os.Looper;
import dc.u;
import java.util.concurrent.Executor;
import ju.l0;
import ju.v1;

/* JADX INFO: loaded from: classes3.dex */
public class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f49301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l0 f49302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Handler f49303c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Executor f49304d = new a();

    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            c.this.f49303c.post(runnable);
        }
    }

    public c(Executor executor) {
        u uVar = new u(executor);
        this.f49301a = uVar;
        this.f49302b = v1.b(uVar);
    }

    @Override // ec.b
    public Executor a() {
        return this.f49304d;
    }

    @Override // ec.b
    public l0 b() {
        return this.f49302b;
    }

    @Override // ec.b
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public u c() {
        return this.f49301a;
    }
}
