package v;

import java.util.Collection;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class q1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Set<y> f202777a = Collections.unmodifiableSet(EnumSet.of(y.PASSIVE_FOCUSED, y.PASSIVE_NOT_FOCUSED, y.LOCKED_FOCUSED, y.LOCKED_NOT_FOCUSED));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<a0> f202778b = Collections.unmodifiableSet(EnumSet.of(a0.CONVERGED, a0.UNKNOWN));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set<w> f202779c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Set<w> f202780d;

    static {
        w wVar = w.CONVERGED;
        w wVar2 = w.FLASH_REQUIRED;
        w wVar3 = w.UNKNOWN;
        Set<w> setUnmodifiableSet = Collections.unmodifiableSet(EnumSet.of(wVar, wVar2, wVar3));
        f202779c = setUnmodifiableSet;
        EnumSet enumSetCopyOf = EnumSet.copyOf((Collection) setUnmodifiableSet);
        enumSetCopyOf.remove(wVar2);
        enumSetCopyOf.remove(wVar3);
        f202780d = Collections.unmodifiableSet(enumSetCopyOf);
    }

    public static boolean a(c0 c0Var, boolean z15) {
        boolean z16 = c0Var.l() == x.OFF || f202777a.contains(c0Var.j());
        boolean z17 = c0Var.i() == v.OFF;
        boolean z18 = !z15 ? !(z17 || f202779c.contains(c0Var.n())) : !(z17 || f202780d.contains(c0Var.n()));
        boolean z19 = c0Var.f() == z.OFF || f202778b.contains(c0Var.k());
        o.e1.a("ConvergenceUtils", "checkCaptureResult, AE=" + c0Var.n() + " AF =" + c0Var.j() + " AWB=" + c0Var.k());
        return z16 && z18 && z19;
    }
}
