package fa;

import ea.NavEntry;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d0;
import p076m2.f6;
import p076m2.x5;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a3\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t²\u0006\"\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\b\b\u0000\u0010\u0001*\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"", "T", "", "Lea/m;", "entries", "Lea/o;", "d", "(Ljava/util/List;Lm2/r;I)Lea/o;", "updatedEntries", "navigation3-ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class d {
    public static final <T> ea.o<T> d(List<NavEntry<T>> list, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1761201315, i15, -1, "androidx.navigation3.scene.rememberBackStackAwareLifecycleNavEntryDecorator (BackStackAwareLifecycleNavEntryDecorator.kt:40)");
        }
        final f6 f6VarP = x5.p(list, rVar, i15 & 14);
        ea.o<T> oVar = new ea.o<>(null, y2.m.d(1077673004, true, new er.q() { // from class: fa.a
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return d.f(f6VarP, (NavEntry) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }, rVar, 54), 1, null);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oVar;
    }

    private static final <T> List<NavEntry<T>> e(f6<? extends List<NavEntry<T>>> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(f6 f6Var, final NavEntry navEntry, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(navEntry) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1077673004, i15, -1, "androidx.navigation3.scene.rememberBackStackAwareLifecycleNavEntryDecorator.<anonymous> (BackStackAwareLifecycleNavEntryDecorator.kt:43)");
            }
            List listE = e(f6Var);
            boolean z15 = (i15 & 14) == 4;
            Object objE = rVar.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: fa.b
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Boolean.valueOf(d.g(navEntry, (NavEntry) obj));
                    }
                };
                rVar.v(objE);
            }
            d0.c(m7.n.c().d(m7.q.c(da.a.a(listE, (er.l) objE) ? androidx.lifecycle.j.b.RESUMED : androidx.lifecycle.j.b.CREATED, null, rVar, 0, 2)), y2.m.d(-1713684244, true, new er.p() { // from class: fa.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d.h(navEntry, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, c4.f122821i | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(NavEntry navEntry, NavEntry navEntry2) {
        return fr.t.c(navEntry2.getContentKey(), navEntry.getContentKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(NavEntry navEntry, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1713684244, i15, -1, "androidx.navigation3.scene.rememberBackStackAwareLifecycleNavEntryDecorator.<anonymous>.<anonymous> (BackStackAwareLifecycleNavEntryDecorator.kt:46)");
            }
            navEntry.b(rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }
}
