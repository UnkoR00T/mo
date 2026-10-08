package p136y9;

import android.os.Bundle;
import er.l;
import fr.p0;
import fr.t;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import oq.r;
import oq.y;
import p071kotlin.Metadata;
import pq.v;
import pq.v0;
import ua.c;
import ua.k;

/* JADX INFO: loaded from: classes3.dex */
@s1.b("navigation")
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\b\b\u0017\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0014\u001a\u00020\r2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Ly9/f1;", "Ly9/s1;", "Ly9/b1;", "Ly9/t1;", "navigatorProvider", "<init>", "(Ly9/t1;)V", "Ly9/w;", "entry", "Ly9/i1;", "navOptions", "Ly9/s1$a;", "navigatorExtras", "Loq/i0;", "r", "(Ly9/w;Ly9/i1;Ly9/s1$a;)V", "q", "()Ly9/b1;", "", "entries", "g", "(Ljava/util/List;Ly9/i1;Ly9/s1$a;)V", "d", "Ly9/t1;", "e", "a", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class f1 extends s1<b1> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t1 navigatorProvider;

    public f1(t1 t1Var) {
        super("navigation");
        this.navigatorProvider = t1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v16, types: [T, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r8v1, types: [T, android.os.Bundle] */
    private final void r(w entry, i1 navOptions, s1.a navigatorExtras) {
        r[] rVarArr;
        b1 b1Var = (b1) entry.getDestination();
        final p0 p0Var = new p0();
        p0Var.f66410a = entry.c();
        int iU = b1Var.U();
        String strV = b1Var.V();
        if (iU == 0 && strV == null) {
            throw new IllegalStateException(("no start destination defined via app:startDestination for " + b1Var.n()).toString());
        }
        y0 y0VarQ = strV != null ? b1Var.Q(strV, false) : b1Var.S().i(iU);
        if (y0VarQ == null) {
            throw new IllegalArgumentException("navigation destination " + b1Var.T() + " is not a direct child of this NavGraph");
        }
        if (strV != null) {
            if (!t.c(strV, y0VarQ.u())) {
                y0.b bVarX = y0VarQ.x(strV);
                Bundle matchingArgs = bVarX != null ? bVarX.getMatchingArgs() : null;
                if (matchingArgs != null && !c.v(c.a(matchingArgs))) {
                    Map mapI = v0.i();
                    if (mapI.isEmpty()) {
                        rVarArr = new r[0];
                    } else {
                        ArrayList arrayList = new ArrayList(mapI.size());
                        for (Map.Entry entry2 : mapI.entrySet()) {
                            arrayList.add(y.a((String) entry2.getKey(), entry2.getValue()));
                        }
                        rVarArr = (r[]) arrayList.toArray(new r[0]);
                    }
                    ?? A = e6.c.a((r[]) Arrays.copyOf(rVarArr, rVarArr.length));
                    Bundle bundleA = k.a(A);
                    k.b(bundleA, matchingArgs);
                    Bundle bundle = (Bundle) p0Var.f66410a;
                    if (bundle != null) {
                        k.b(bundleA, bundle);
                    }
                    p0Var.f66410a = A;
                }
            }
            if (!y0VarQ.k().isEmpty()) {
                List<String> listA = u.a(y0VarQ.k(), new l() { // from class: y9.e1
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Boolean.valueOf(f1.s(p0Var, (String) obj));
                    }
                });
                if (!listA.isEmpty()) {
                    throw new IllegalArgumentException(("Cannot navigate to startDestination " + y0VarQ + ". Missing required arguments [" + listA + ']').toString());
                }
            }
        }
        this.navigatorProvider.e(y0VarQ.getNavigatorName()).g(v.e(d().b(y0VarQ, y0VarQ.g((Bundle) p0Var.f66410a))), navOptions, navigatorExtras);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean s(p0 p0Var, String str) {
        T t15 = p0Var.f66410a;
        return t15 == 0 || !c.b(c.a((Bundle) t15), str);
    }

    @Override // p136y9.s1
    public void g(List<w> entries, i1 navOptions, s1.a navigatorExtras) {
        Iterator<w> it = entries.iterator();
        while (it.hasNext()) {
            r(it.next(), navOptions, navigatorExtras);
        }
    }

    @Override // p136y9.s1
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public b1 c() {
        return new b1(this);
    }
}
