package k10;

import java.util.ArrayList;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0004\u0010\u0005JM\u0010\r\u001a\u00020\u000b\"\b\b\u0002\u0010\u0006*\u00028\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u00072$\u0010\f\u001a \u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\n\u0012\u0004\u0012\u00020\u000b0\tH\u0001¢\u0006\u0004\b\r\u0010\u000eR.\u0010\u0013\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R.\u0010\u0017\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00100\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lk10/v;", "", ip.a.f96137b, "A", "<init>", "()V", "SubState", "Lmr/c;", "subStateClass", "Lkotlin/Function1;", "Lk10/z;", "Loq/i0;", "block", "c", "(Lmr/c;Ler/l;)V", "", "Ll10/i;", "a", "Ljava/util/List;", "_sideEffectBuilders", "", "b", "()Ljava/util/List;", "sideEffectBuilders", "statemachine_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v<S, A> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<l10.i<? extends S, S, A>> _sideEffectBuilders = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(mr.c cVar, Object obj) {
        return cVar.A(obj);
    }

    public final List<l10.i<? extends S, S, A>> b() {
        return this._sideEffectBuilders;
    }

    public final <SubState extends S> void c(final mr.c<SubState> subStateClass, er.l<? super z<SubState, S, A>, i0> block) {
        List<l10.i<? extends S, S, A>> list = this._sideEffectBuilders;
        z zVar = new z(new l10.i.a() { // from class: k10.u
            @Override // l10.i.a
            public final boolean a(Object obj) {
                return v.d(subStateClass, obj);
            }
        });
        block.b(zVar);
        pq.v.D(list, zVar.t());
    }
}
