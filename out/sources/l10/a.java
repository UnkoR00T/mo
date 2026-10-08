package l10;

import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u0000*\b\b\u0000\u0010\u0001*\u00028\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00028\u0002H\u0096@¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00020\u000f8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Ll10/a;", "InputState", ip.a.f96137b, "A", "Ll10/h;", "<init>", "()V", "action", "Loq/i0;", "c", "(Ljava/lang/Object;Ltq/e;)Ljava/lang/Object;", "Llu/g;", "a", "Llu/g;", "actionChannel", "Lmu/g;", "e", "()Lmu/g;", "actions", "statemachine_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a<InputState extends S, S, A> extends h<InputState, S, A> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final lu.g<A> actionChannel = lu.j.b(0, null, null, 7, null);

    static /* synthetic */ <InputState extends S, S, A> Object f(a<InputState, S, A> aVar, A a15, tq.e<? super i0> eVar) {
        Object objL = ((a) aVar).actionChannel.l(a15, eVar);
        return objL == uq.b.e() ? objL : i0.f148189a;
    }

    @Override // l10.h
    public Object c(A a15, tq.e<? super i0> eVar) {
        return f(this, a15, eVar);
    }

    protected final mu.g<A> e() {
        return mu.i.W(this.actionChannel);
    }
}
