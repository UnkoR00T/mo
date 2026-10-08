package t1;

import g4.q1;
import g4.r1;
import oq.i0;
import p071kotlin.Metadata;
import q1.TextContextMenuData;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aS\u0010\b\u001a\u00020\u0004*\u00020\u00002\u001e\u0010\u0005\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u0012\u0004\u0012\u00020\u00040\u00012\u001e\u0010\u0007\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0001\u0012\u0004\u0012\u00020\u00040\u0001H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0013\u0010\u000b\u001a\u00020\n*\u00020\u0000H\u0000¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lg4/g;", "Lkotlin/Function1;", "Lq1/b;", "", "Loq/i0;", "filterBlock", "Lp1/a;", "builderBlock", "e", "(Lg4/g;Ler/l;Ler/l;)V", "Lq1/c;", "c", "(Lg4/g;)Lq1/c;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.l<er.l<? super q1.b, ? extends Boolean>, i0> {
        a(Object obj) {
            super(1, obj, p1.a.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0);
        }

        public final void E(er.l<? super q1.b, Boolean> lVar) {
            ((p1.a) this.f66391b).b(lVar);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(er.l<? super q1.b, ? extends Boolean> lVar) {
            E(lVar);
            return i0.f148189a;
        }
    }

    public static final TextContextMenuData c(g4.g gVar) {
        final p1.a aVar = new p1.a();
        e(gVar, new a(aVar), new er.l() { // from class: t1.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.d(aVar, (er.l) obj);
            }
        });
        return aVar.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(p1.a aVar, er.l lVar) {
        lVar.b(aVar);
        return i0.f148189a;
    }

    private static final void e(g4.g gVar, final er.l<? super er.l<? super q1.b, Boolean>, i0> lVar, final er.l<? super er.l<? super p1.a, i0>, i0> lVar2) {
        r1.c(gVar, f.f186829a, new er.l() { // from class: t1.k
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(l.f(lVar2, lVar, (q1) obj));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(er.l lVar, er.l lVar2, q1 q1Var) {
        if (q1Var instanceof t1.a) {
            lVar.b(((t1.a) q1Var).n3());
            return true;
        }
        if (!(q1Var instanceof e)) {
            throw new IllegalStateException("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
        }
        lVar2.b(((e) q1Var).n3());
        return true;
    }
}
