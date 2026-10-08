package mb4;

import er.q;
import fr.q0;
import jb4.ErrorActionData;
import k10.o;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.p;
import oq.u;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B#\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR&\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001e8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010)\u001a\b\u0012\u0004\u0012\u00020\u00020$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R \u00100\u001a\b\u0012\u0004\u0012\u00020+0*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001c\u00104\u001a\b\u0012\u0004\u0012\u00020\u0014018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, d2 = {"Lmb4/k;", "Ll00/g;", "Lmb4/c;", "", "Lmb4/d;", "Lhb4/b;", "Lyy/a;", "stateMachineFactory", "Lhb4/d;", "errorVMSFactory", "Ljb4/b;", "errorData", "<init>", "(Lyy/a;Lhb4/d;Ljb4/b;)V", "m9", "(Ljb4/b;)Ljb4/b;", "Ljb4/a;", "l9", "(Ljb4/a;)Ljb4/a;", "data", "Loq/i0;", "n9", "(Ljb4/b;)V", "Y8", "()V", "b", "Ljb4/b;", "c", "Lmb4/c;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "e", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "Lxw/b;", "Lhb4/b$a;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lkotlin/Function0;", "g", "Ler/a;", "clearAction", "error_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k extends l00.g<State, Object> implements d, hb4.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final jb4.b errorData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p0<State> state;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<hb4.b.a> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private er.a<i0> clearAction;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmb4/a;", "action", "Lmb4/c;", "state", "Loq/i0;", "<anonymous>", "(Lmb4/a;Lmb4/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements q<Result, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f125326e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f125327f;

        a(tq.e<? super a> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Result result = (Result) this.f125327f;
            Object objE = uq.b.e();
            int i15 = this.f125326e;
            if (i15 == 0) {
                u.b(obj);
                k.this.clearAction = result.a();
                xw.b<hb4.b.a> bVarY1 = k.this.Y1();
                hb4.b.a.C1910a c1910a = hb4.b.a.C1910a.f83033a;
                this.f125327f = vq.j.a(result);
                this.f125326e = 1;
                if (bVarY1.F(c1910a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(Result result, State state, tq.e<? super i0> eVar) {
            a aVar = k.this.new a(eVar);
            aVar.f125327f = result;
            return aVar.J(i0.f148189a);
        }
    }

    public k(yy.a aVar, hb4.d dVar, jb4.b bVar) {
        this.errorData = bVar;
        State state = new State(dVar.a(m9(bVar)));
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: mb4.i
            @Override // er.l
            public final Object b(Object obj) {
                return k.o9(this.f125319a, (v) obj);
            }
        });
        this.state = a9(e9().getState(), state);
        this.navAction = new xw.b<>();
        this.clearAction = new er.a() { // from class: mb4.j
            @Override // er.a
            public final Object a() {
                return k.k9();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k9() {
        return i0.f148189a;
    }

    private final ErrorActionData l9(ErrorActionData errorActionData) {
        return ErrorActionData.b(errorActionData, null, b9(new Result(errorActionData.c())), 1, null);
    }

    private final jb4.b m9(jb4.b bVar) {
        jb4.b bVar2 = this.errorData;
        jb4.b.a aVar = jb4.b.a.f101356a;
        if (fr.t.c(bVar2, aVar)) {
            return aVar;
        }
        if (bVar2 instanceof jb4.b.Failure) {
            jb4.b bVar3 = this.errorData;
            jb4.b.Failure failure = (jb4.b.Failure) bVar3;
            ErrorActionData errorActionDataL9 = l9(((jb4.b.Failure) bVar3).getPrimaryButton());
            ErrorActionData secondaryButton = ((jb4.b.Failure) this.errorData).getSecondaryButton();
            ErrorActionData errorActionDataL10 = secondaryButton != null ? l9(secondaryButton) : null;
            ErrorActionData tertiaryButton = ((jb4.b.Failure) this.errorData).getTertiaryButton();
            return jb4.b.Failure.d(failure, null, null, null, errorActionDataL9, errorActionDataL10, tertiaryButton != null ? l9(tertiaryButton) : null, l9(((jb4.b.Failure) this.errorData).getCloseButton()), 7, null);
        }
        if (bVar2 instanceof jb4.b.Info) {
            jb4.b bVar4 = this.errorData;
            jb4.b.Info info = (jb4.b.Info) bVar4;
            ErrorActionData errorActionDataL11 = l9(((jb4.b.Info) bVar4).getPrimaryButton());
            ErrorActionData secondaryButton2 = ((jb4.b.Info) this.errorData).getSecondaryButton();
            ErrorActionData errorActionDataL12 = secondaryButton2 != null ? l9(secondaryButton2) : null;
            ErrorActionData tertiaryButton2 = ((jb4.b.Info) this.errorData).getTertiaryButton();
            return jb4.b.Info.d(info, null, null, null, errorActionDataL11, errorActionDataL12, tertiaryButton2 != null ? l9(tertiaryButton2) : null, l9(((jb4.b.Info) this.errorData).getCloseButton()), 7, null);
        }
        if (!(bVar2 instanceof jb4.b.Warning)) {
            throw new p();
        }
        jb4.b bVar5 = this.errorData;
        jb4.b.Warning warning = (jb4.b.Warning) bVar5;
        ErrorActionData errorActionDataL13 = l9(((jb4.b.Warning) bVar5).getPrimaryButton());
        ErrorActionData secondaryButton3 = ((jb4.b.Warning) this.errorData).getSecondaryButton();
        ErrorActionData errorActionDataL14 = secondaryButton3 != null ? l9(secondaryButton3) : null;
        ErrorActionData tertiaryButton3 = ((jb4.b.Warning) this.errorData).getTertiaryButton();
        return jb4.b.Warning.d(warning, null, null, null, errorActionDataL13, errorActionDataL14, tertiaryButton3 != null ? l9(tertiaryButton3) : null, l9(((jb4.b.Warning) this.errorData).getCloseButton()), 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(final k kVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: mb4.h
            @Override // er.l
            public final Object b(Object obj) {
                return k.p9(this.f125318a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(k kVar, z zVar) {
        a aVar = kVar.new a(null);
        zVar.x(q0.c(Result.class), o.CANCEL_PREVIOUS, aVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<hb4.b.a> Y1() {
        return this.navAction;
    }

    @Override // androidx.p016lifecycle.t0
    protected void Y8() {
        this.clearAction.a();
    }

    @Override // l00.g
    protected t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<State> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public void P5(jb4.b data) {
        d9(new Setup(data));
    }
}
