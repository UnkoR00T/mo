package qb;

import android.content.Context;
import java.util.concurrent.Executor;
import ob.u;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lqb/c;", "Lpb/a;", "<init>", "()V", "Landroid/content/Context;", "context", "Ljava/util/concurrent/Executor;", "executor", "Li6/a;", "Lob/u;", "callback", "Loq/i0;", "b", "(Landroid/content/Context;Ljava/util/concurrent/Executor;Li6/a;)V", "a", "(Li6/a;)V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class c implements pb.a {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(i6.a aVar) {
        aVar.accept(new u(v.n()));
    }

    @Override // pb.a
    public void a(i6.a<u> callback) {
    }

    @Override // pb.a
    public void b(Context context, Executor executor, final i6.a<u> callback) {
        executor.execute(new Runnable() { // from class: qb.b
            @Override // java.lang.Runnable
            public final void run() {
                c.d(callback);
            }
        });
    }
}
