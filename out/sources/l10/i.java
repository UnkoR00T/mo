package l10;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u00028\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u00020\u0004:\u0001\rB;\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012$\u0010\t\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b2\u0006\u0010\f\u001a\u00028\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R2\u0010\t\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Ll10/i;", "InputState", ip.a.f96137b, "A", "", "Ll10/i$a;", "isInState", "Lkotlin/Function1;", "Ll10/h;", "builder", "<init>", "(Ll10/i$a;Ler/l;)V", "state", "a", "(Ljava/lang/Object;)Ll10/h;", "Ll10/i$a;", "b", "()Ll10/i$a;", "Ler/l;", "statemachine_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i<InputState extends S, S, A> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a<S> isInState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final er.l<InputState, h<InputState, S, A>> builder;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u0000*\u0004\b\u0003\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007À\u0006\u0003"}, d2 = {"Ll10/i$a;", ip.a.f96137b, "", "state", "", "a", "(Ljava/lang/Object;)Z", "statemachine_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a<S> {
        boolean a(S state);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i(a<S> aVar, er.l<? super InputState, ? extends h<InputState, S, A>> lVar) {
        this.isInState = aVar;
        this.builder = lVar;
    }

    public final h<InputState, S, A> a(S state) {
        return this.builder.b(state);
    }

    public final a<S> b() {
        return this.isInState;
    }
}
