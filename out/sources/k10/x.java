package k10;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0001*\u00028\u0001*\b\b\u0001\u0010\u0003*\u00020\u0002*\b\b\u0002\u0010\u0004*\u00020\u00022\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005B-\b\u0000\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\f\u001a\u00028\u0000H\u0010¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\t\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lk10/x;", "InputState", "", ip.a.f96137b, "A", "Lk10/k;", "Ll10/i$a;", "isInState", "Lkotlin/Function1;", "identity", "<init>", "(Ll10/i$a;Ler/l;)V", "initialState", "Ll10/h$a;", "J", "(Ljava/lang/Object;)Ll10/h$a;", "b", "Ll10/i$a;", "u", "()Ll10/i$a;", "c", "Ler/l;", "statemachine_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x<InputState extends S, S, A> extends k<InputState, S, A> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l10.i.a<S> isInState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final er.l<InputState, Object> identity;

    /* JADX WARN: Multi-variable type inference failed */
    public x(l10.i.a<S> aVar, er.l<? super InputState, ? extends Object> lVar) {
        this.isInState = aVar;
        this.identity = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean L(x xVar, Object obj, Object obj2) {
        return xVar.u().a(obj2) && fr.t.c(xVar.identity.b(obj), xVar.identity.b(obj2));
    }

    @Override // k10.k
    public l10.h.a<S> J(final InputState initialState) {
        return new l10.h.a() { // from class: k10.w
            @Override // l10.h.a
            public final boolean a(Object obj) {
                return x.L(this.f107410a, initialState, obj);
            }
        };
    }

    @Override // k10.k
    public l10.i.a<S> u() {
        return this.isInState;
    }
}
