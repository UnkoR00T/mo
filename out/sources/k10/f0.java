package k10;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00028\u00012\u0006\u0010\b\u001a\u00028\u0001H\u0000¢\u0006\u0004\b\t\u0010\nR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lk10/f0;", "InputState", ip.a.f96137b, "Lk10/l;", "Lkotlin/Function1;", "reducer", "<init>", "(Ler/l;)V", "state", "a", "(Ljava/lang/Object;)Ljava/lang/Object;", "Ler/l;", "getReducer$statemachine_release", "()Ler/l;", "statemachine_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f0<InputState, S> extends l<S> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final er.l<InputState, S> reducer;

    /* JADX WARN: Multi-variable type inference failed */
    public f0(er.l<? super InputState, ? extends S> lVar) {
        super(null);
        this.reducer = lVar;
    }

    public final S a(S state) {
        return this.reducer.b(state);
    }
}
