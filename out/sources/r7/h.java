package r7;

import androidx.p016lifecycle.t0;
import androidx.p016lifecycle.w0;
import androidx.p016lifecycle.x0;
import p071kotlin.Metadata;
import p7.CreationExtras;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0010\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019¨\u0006\u001b"}, d2 = {"Lr7/h;", "", "Landroidx/lifecycle/x0;", "store", "Landroidx/lifecycle/w0$c;", "factory", "Lp7/a;", "defaultExtras", "<init>", "(Landroidx/lifecycle/x0;Landroidx/lifecycle/w0$c;Lp7/a;)V", "Landroidx/lifecycle/t0;", "T", "Lmr/c;", "modelClass", "", "key", "d", "(Lmr/c;Ljava/lang/String;)Landroidx/lifecycle/t0;", "a", "Landroidx/lifecycle/x0;", "b", "Landroidx/lifecycle/w0$c;", "c", "Lp7/a;", "Lr7/f;", "Lr7/f;", "lock", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final x0 store;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w0.c factory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CreationExtras defaultExtras;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final f lock = new f();

    public h(x0 x0Var, w0.c cVar, CreationExtras creationExtras) {
        this.store = x0Var;
        this.factory = cVar;
        this.defaultExtras = creationExtras;
    }

    public static /* synthetic */ t0 e(h hVar, mr.c cVar, String str, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            str = j.f172257a.e(cVar);
        }
        return hVar.d(cVar, str);
    }

    public final <T extends t0> T d(mr.c<T> modelClass, String key) {
        T t15;
        synchronized (this.lock) {
            try {
                t15 = (T) this.store.b(key);
                if (!modelClass.A(t15)) {
                    p7.d dVar = new p7.d(this.defaultExtras);
                    dVar.c(w0.f12841c, key);
                    t15 = (T) i.a(this.factory, modelClass, dVar);
                    this.store.d(key, t15);
                } else if (this.factory instanceof w0.e) {
                    ((w0.e) this.factory).d(t15);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return t15;
    }
}
