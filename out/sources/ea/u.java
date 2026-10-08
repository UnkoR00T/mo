package ea;

import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lea/u;", "", "T", "Lea/o;", "Lb3/i;", "saveableStateHolder", "<init>", "(Lb3/i;)V", "navigation3-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u<T> extends o<T> {
    public u(final b3.i iVar) {
        super(new er.l() { // from class: ea.r
            @Override // er.l
            public final Object b(Object obj) {
                return u.h(iVar, obj);
            }
        }, y2.m.b(-1320822745, true, new er.q() { // from class: ea.s
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return u.i(iVar, (NavEntry) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(b3.i iVar, Object obj) {
        iVar.a(obj);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(b3.i iVar, final NavEntry navEntry, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(navEntry) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1320822745, i15, -1, "androidx.navigation3.runtime.SaveableStateHolderNavEntryDecorator.<init>.<anonymous> (SaveableStateHolderNavEntryDecorator.kt:56)");
            }
            iVar.d(navEntry.getContentKey(), y2.m.d(121262920, true, new er.p() { // from class: ea.t
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return u.j(navEntry, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(NavEntry navEntry, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(121262920, i15, -1, "androidx.navigation3.runtime.SaveableStateHolderNavEntryDecorator.<init>.<anonymous>.<anonymous> (SaveableStateHolderNavEntryDecorator.kt:56)");
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
