package androidx.p016lifecycle;

import ju.p0;
import p071kotlin.Metadata;
import r7.b;
import r7.c;
import r7.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0014\u0010\u0003\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0015\u0010\u0007\u001a\u00020\u0005*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0006¨\u0006\b"}, d2 = {"Lr7/f;", "a", "Lr7/f;", "VIEW_MODEL_SCOPE_LOCK", "Landroidx/lifecycle/t0;", "Lju/p0;", "(Landroidx/lifecycle/t0;)Lju/p0;", "viewModelScope", "lifecycle-viewmodel"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final f f12833a = new f();

    public static final p0 a(t0 t0Var) {
        b bVarA;
        synchronized (f12833a) {
            bVarA = (b) t0Var.X8("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY");
            if (bVarA == null) {
                bVarA = c.a();
                t0Var.V8("androidx.lifecycle.viewmodel.internal.ViewModelCoroutineScope.JOB_KEY", bVarA);
            }
        }
        return bVarA;
    }
}
