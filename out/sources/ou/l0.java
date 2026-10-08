package ou;

import ju.a3;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a#\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e\"*\u0010\u0014\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013\"2\u0010\u0017\u001a \u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0002\b\u0003\u0018\u00010\u00150\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013\"&\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00180\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0013¨\u0006\u001b"}, d2 = {"Ltq/i;", "context", "", "g", "(Ltq/i;)Ljava/lang/Object;", "countOrElement", "i", "(Ltq/i;Ljava/lang/Object;)Ljava/lang/Object;", "oldState", "Loq/i0;", "f", "(Ltq/i;Ljava/lang/Object;)V", "Lou/e0;", "a", "Lou/e0;", "NO_THREAD_ELEMENTS", "Lkotlin/Function2;", "Ltq/i$b;", "b", "Ler/p;", "countAll", "Lju/a3;", "c", "findOne", "Lou/r0;", "d", "updateState", "kotlinx-coroutines-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f150053a = new e0("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final er.p<Object, tq.i.b, Object> f150054b = new er.p() { // from class: ou.i0
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return l0.d(obj, (tq.i.b) obj2);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final er.p<a3<?>, tq.i.b, a3<?>> f150055c = new er.p() { // from class: ou.j0
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return l0.e((a3) obj, (tq.i.b) obj2);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final er.p<r0, tq.i.b, r0> f150056d = new er.p() { // from class: ou.k0
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return l0.h((r0) obj, (tq.i.b) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Object obj, tq.i.b bVar) {
        if (!(bVar instanceof a3)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? bVar : Integer.valueOf(iIntValue + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a3<?> e(a3<?> a3Var, tq.i.b bVar) {
        if (a3Var != null) {
            return a3Var;
        }
        if (bVar instanceof a3) {
            return (a3) bVar;
        }
        return null;
    }

    public static final void f(tq.i iVar, Object obj) {
        if (obj == f150053a) {
            return;
        }
        if (obj instanceof r0) {
            ((r0) obj).b(iVar);
        } else {
            ((a3) iVar.s1(null, f150055c)).C1(iVar, obj);
        }
    }

    public static final Object g(tq.i iVar) {
        return iVar.s1(0, f150054b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 h(r0 r0Var, tq.i.b bVar) {
        if (bVar instanceof a3) {
            a3<?> a3Var = (a3) bVar;
            r0Var.a(a3Var, a3Var.M(r0Var.context));
        }
        return r0Var;
    }

    public static final Object i(tq.i iVar, Object obj) {
        if (obj == null) {
            obj = g(iVar);
        }
        if (obj == 0) {
            return f150053a;
        }
        return obj instanceof Integer ? iVar.s1(new r0(iVar, ((Number) obj).intValue()), f150056d) : ((a3) obj).M(iVar);
    }
}
