package l10;

import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u0000*\b\b\u0000\u0010\u0001*\u00028\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u00020\u0004:\u0001\u0013B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000b0\n2\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0007j\b\u0012\u0004\u0012\u00028\u0001`\bH&¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0002H\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00010\u00128&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Ll10/h;", "InputState", ip.a.f96137b, "A", "", "<init>", "()V", "Lkotlin/Function0;", "Lpl/gov/coi/common/statemachine/sideeffects/GetState;", "getState", "Lmu/g;", "Lk10/l;", "b", "(Ler/a;)Lmu/g;", "action", "Loq/i0;", "c", "(Ljava/lang/Object;Ltq/e;)Ljava/lang/Object;", "Ll10/h$a;", "a", "()Ll10/h$a;", "isInState", "statemachine_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class h<InputState extends S, S, A> {

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0003\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Ll10/h$a;", ip.a.f96137b, "", "state", "", "a", "(Ljava/lang/Object;)Z", "statemachine_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a<S> {
        boolean a(S state);
    }

    static /* synthetic */ <InputState extends S, S, A> Object d(h<InputState, S, A> hVar, A a15, tq.e<? super i0> eVar) {
        return i0.f148189a;
    }

    public abstract a<S> a();

    public abstract mu.g<k10.l<S>> b(er.a<? extends S> getState);

    public Object c(A a15, tq.e<? super i0> eVar) {
        return d(this, a15, eVar);
    }
}
