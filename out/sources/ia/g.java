package ia;

import p071kotlin.Metadata;
import p076m2.b4;
import p076m2.d0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u00058G¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lia/g;", "", "<init>", "()V", "Lm2/b4;", "Lha/d;", "b", "Lm2/b4;", "LocalNavigationEventDispatcherOwner", "c", "(Lm2/r;I)Lha/d;", "current", "navigationevent-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f90558a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final b4<ha.d> LocalNavigationEventDispatcherOwner = d0.h(null, new er.a() { // from class: ia.f
        @Override // er.a
        public final Object a() {
            return g.b();
        }
    }, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f90560c = 0;

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ha.d b() {
        return null;
    }

    public final ha.d c(p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-942026292, i15, -1, "androidx.navigationevent.compose.LocalNavigationEventDispatcherOwner.<get-current> (LocalNavigationEventDispatcherOwner.kt:38)");
        }
        ha.d dVarA = (ha.d) rVar.N(LocalNavigationEventDispatcherOwner);
        if (dVarA == null) {
            rVar.X(950836184);
            dVarA = h.a(rVar, 0);
            rVar.R();
        } else {
            rVar.X(950834231);
            rVar.R();
        }
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return dVarA;
    }
}
