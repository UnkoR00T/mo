package p008Nul;

import CON.q0;
import ha.c;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000eR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000f¨\u0006\u0010"}, d2 = {"LNul/x;", "", "Lha/c;", "navigationEventDispatcher", "LCON/q0;", "onBackPressedDispatcher", "<init>", "(Lha/c;LCON/q0;)V", "LNul/w;", "handler", "Loq/i0;", "a", "(LNul/w;)V", "b", "Lha/c;", "LCON/q0;", "activity-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c navigationEventDispatcher;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q0 onBackPressedDispatcher;

    public x(c cVar, q0 q0Var) {
        this.navigationEventDispatcher = cVar;
        this.onBackPressedDispatcher = q0Var;
        if ((cVar == null ? q0Var : cVar) == null) {
            throw new IllegalArgumentException("At least one dispatcher (NavigationEventDispatcher or OnBackPressedDispatcher) must be non-null.");
        }
    }

    public final void a(w handler) {
        c cVar = this.navigationEventDispatcher;
        if (cVar != null) {
            c.b(cVar, handler.a(), 0, 2, null);
            return;
        }
        q0 q0Var = this.onBackPressedDispatcher;
        if (q0Var == null) {
            throw new IllegalStateException("Unreachable");
        }
        q0Var.e(handler.getOnBackPressedCallback());
    }

    public final void b(w handler) {
        if (this.navigationEventDispatcher != null) {
            handler.a().x();
        } else {
            if (this.onBackPressedDispatcher == null) {
                throw new IllegalStateException("Unreachable");
            }
            handler.getOnBackPressedCallback().h();
        }
    }
}
