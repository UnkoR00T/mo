package mu;

import fr.w0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\u001a#\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001a=\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\b\u001aY\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u001c\u0010\u0006\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\f\u0010\r\"$\u0010\u0010\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"*\u0010\u0013\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0006\u0012\u0004\u0018\u00010\n\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"T", "Lmu/g;", "e", "(Lmu/g;)Lmu/g;", "Lkotlin/Function2;", "", "areEquivalent", "f", "(Lmu/g;Ler/p;)Lmu/g;", "Lkotlin/Function1;", "", "keySelector", "g", "(Lmu/g;Ler/l;Ler/p;)Lmu/g;", "a", "Ler/l;", "defaultKeySelector", "b", "Ler/p;", "defaultAreEquivalent", "kotlinx-coroutines-core"}, k = 5, mv = {2, 1, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
final /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final er.l<Object, Object> f128312a = new er.l() { // from class: mu.p
        @Override // er.l
        public final Object b(Object obj) {
            return r.d(obj);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final er.p<Object, Object, Boolean> f128313b = new er.p() { // from class: mu.q
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return Boolean.valueOf(r.c(obj, obj2));
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(Object obj, Object obj2) {
        return fr.t.c(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Object obj) {
        return obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> g<T> e(g<? extends T> gVar) {
        return gVar instanceof p0 ? gVar : g(gVar, f128312a, f128313b);
    }

    public static final <T> g<T> f(g<? extends T> gVar, er.p<? super T, ? super T, Boolean> pVar) {
        return g(gVar, f128312a, (er.p) w0.g(pVar, 2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> g<T> g(g<? extends T> gVar, er.l<? super T, ? extends Object> lVar, er.p<Object, Object, Boolean> pVar) {
        if (gVar instanceof e) {
            e eVar = (e) gVar;
            if (eVar.keySelector == lVar && eVar.areEquivalent == pVar) {
                return gVar;
            }
        }
        return new e(gVar, lVar, pVar);
    }
}
