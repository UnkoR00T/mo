package k10;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00028\u0001*\b\b\u0001\u0010\u0003*\u00020\u0002*\b\b\u0002\u0010\u0004*\u00020\u00022\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B\u0017\b\u0000\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\tR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lk10/m;", "InputState", "", ip.a.f96137b, "A", "Lk10/k;", "Ll10/i$a;", "isInState", "<init>", "(Ll10/i$a;)V", "b", "Ll10/i$a;", "u", "()Ll10/i$a;", "statemachine_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m<InputState extends S, S, A> extends k<InputState, S, A> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l10.i.a<S> isInState;

    public m(l10.i.a<S> aVar) {
        this.isInState = aVar;
    }

    @Override // k10.k
    public l10.i.a<S> u() {
        return this.isInState;
    }
}
