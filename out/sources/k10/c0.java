package k10;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00028\u0000¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\t\u0010\nJ1\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\b\b\u0001\u0010\u000b*\u00020\u00012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\f\u0010\nJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\b\b\u0001\u0010\u000b*\u00020\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lk10/c0;", "", "InputState", "snapshot", "<init>", "(Ljava/lang/Object;)V", "Lkotlin/Function1;", "reducer", "Lk10/l;", "b", "(Ler/l;)Lk10/l;", ip.a.f96137b, "d", "c", "()Lk10/l;", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "statemachine_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c0<InputState> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InputState snapshot;

    public c0(InputState inputstate) {
        this.snapshot = inputstate;
    }

    public final InputState a() {
        return this.snapshot;
    }

    public final l<InputState> b(er.l<? super InputState, ? extends InputState> reducer) {
        return new f0(reducer);
    }

    public final <S> l<S> c() {
        return a0.f107282a;
    }

    public final <S> l<S> d(er.l<? super InputState, ? extends S> reducer) {
        return new f0(reducer);
    }
}
