package l10;

import k10.a0;
import k10.d0;
import k10.f0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aK\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0002\b\u00030\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007*\u001e\b\u0000\u0010\t\u001a\u0004\b\u0000\u0010\u0001\"\b\u0012\u0004\u0012\u00028\u00000\b2\b\u0012\u0004\u0012\u00028\u00000\b¨\u0006\n"}, d2 = {"InputState", ip.a.f96137b, "Lk10/l;", "changedState", "Ll10/h;", "sideEffect", "c", "(Lk10/l;Ll10/h;)Lk10/l;", "Lkotlin/Function0;", "GetState", "statemachine_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final <InputState extends S, S> k10.l<S> c(final k10.l<? extends S> lVar, final h<InputState, S, ?> hVar) {
        return lVar instanceof a0 ? lVar : new f0(new er.l() { // from class: l10.j
            @Override // er.l
            public final Object b(Object obj) {
                return k.d(hVar, lVar, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(h hVar, k10.l lVar, Object obj) {
        return hVar.a().a(obj) ? d0.a(lVar, obj) : obj;
    }
}
