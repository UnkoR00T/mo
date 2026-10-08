package ea;

import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B7\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\b\u0010\tR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00040\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR,\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u0004\u0012\u00020\u00040\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lea/o;", "", "T", "Lkotlin/Function1;", "Loq/i0;", "onPop", "Lea/m;", "decorate", "<init>", "(Ler/l;Ler/q;)V", "a", "Ler/l;", "d", "()Ler/l;", "b", "Ler/q;", "c", "()Ler/q;", "navigation3-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class o<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final er.l<Object, i0> onPop;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final er.q<NavEntry<T>, p076m2.r, Integer, i0> decorate;

    /* JADX WARN: Multi-variable type inference failed */
    public o(er.l<Object, i0> lVar, er.q<? super NavEntry<T>, ? super p076m2.r, ? super Integer, i0> qVar) {
        this.onPop = lVar;
        this.decorate = qVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 b(Object obj) {
        return i0.f148189a;
    }

    public final er.q<NavEntry<T>, p076m2.r, Integer, i0> c() {
        return this.decorate;
    }

    public final er.l<Object, i0> d() {
        return this.onPop;
    }

    public /* synthetic */ o(er.l lVar, er.q qVar, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? new er.l() { // from class: ea.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.b(obj);
            }
        } : lVar, qVar);
    }
}
