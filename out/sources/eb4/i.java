package eb4;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import er.p;
import er.q;
import fr.q0;
import k10.o;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B3\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u000e*\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0014*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R&\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030#8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u00105\u001a\b\u0012\u0004\u0012\u0002000/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001c\u00109\u001a\b\u0012\u0004\u0012\u00020\u0017068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108¨\u0006:"}, d2 = {"Leb4/i;", "Ll00/g;", "Leb4/d;", "", "Leb4/e;", "Lcb4/f;", "Lyy/a;", "stateMachineFactory", "Lcb4/j;", "dialogVMSFactory", "Lyw/b;", "accessibilityTalkBackManager", "Lmx/c;", "labelProvider", "Lcb4/d;", "dialogData", "<init>", "(Lyy/a;Lcb4/j;Lyw/b;Lmx/c;Lcb4/d;)V", "o9", "(Lcb4/d;)Lcb4/d;", "Lcb4/b;", "n9", "(Lcb4/b;)Lcb4/b;", "Loq/i0;", "Y8", "()V", "b", "Lyw/b;", "c", "Lmx/c;", "d", "Lcb4/d;", "e", "Leb4/d;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "Lxw/b;", "Lcb4/f$a;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lkotlin/Function0;", "j", "Ler/a;", "clearAction", "dialog_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i extends l00.g<State, Object> implements e, cb4.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final yw.b accessibilityTalkBackManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final DialogData dialogData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<State> state;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<cb4.f.a> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private er.a<i0> clearAction;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Leb4/d;", "it", "Loq/i0;", "<anonymous>", "(Leb4/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements p<State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49294e;

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f49294e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            i.this.accessibilityTalkBackManager.a(i.this.labelProvider.c(bb4.a.f18075a).getText());
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(State state, tq.e<? super i0> eVar) {
            return ((a) v(state, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return i.this.new a(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Leb4/c;", "action", "Leb4/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Leb4/c;Leb4/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<Result, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49296e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f49297f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Result result = (Result) this.f49297f;
            Object objE = uq.b.e();
            int i15 = this.f49296e;
            if (i15 == 0) {
                u.b(obj);
                i.this.clearAction = result.a();
                xw.b<cb4.f.a> bVarY1 = i.this.Y1();
                cb4.f.a.C0669a c0669a = cb4.f.a.C0669a.f24980a;
                this.f49297f = vq.j.a(result);
                this.f49296e = 1;
                if (bVarY1.F(c0669a, this) == objE) {
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
            b bVar = i.this.new b(eVar);
            bVar.f49297f = result;
            return bVar.J(i0.f148189a);
        }
    }

    public i(yy.a aVar, cb4.j jVar, yw.b bVar, mx.c cVar, DialogData dialogData) {
        this.accessibilityTalkBackManager = bVar;
        this.labelProvider = cVar;
        this.dialogData = dialogData;
        State state = new State(jVar.a(o9(dialogData)));
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: eb4.g
            @Override // er.l
            public final Object b(Object obj) {
                return i.q9(this.f49285a, (v) obj);
            }
        });
        this.state = a9(e9().getState(), state);
        this.navAction = new xw.b<>();
        this.clearAction = new er.a() { // from class: eb4.h
            @Override // er.a
            public final Object a() {
                return i.m9();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9() {
        return i0.f148189a;
    }

    private final DialogButtonTextData n9(DialogButtonTextData dialogButtonTextData) {
        return DialogButtonTextData.b(dialogButtonTextData, null, null, b9(new Result(dialogButtonTextData.e())), 3, null);
    }

    private final DialogData o9(DialogData dialogData) {
        DialogData dialogData2 = this.dialogData;
        DialogButtonTextData dialogButtonTextDataN9 = n9(dialogData2.getPrimaryButtonData());
        DialogButtonTextData secondaryButtonData = this.dialogData.getSecondaryButtonData();
        DialogButtonTextData dialogButtonTextDataN10 = secondaryButtonData != null ? n9(secondaryButtonData) : null;
        DialogButtonTextData tertiaryButtonData = this.dialogData.getTertiaryButtonData();
        return DialogData.d(dialogData2, null, null, null, dialogButtonTextDataN9, dialogButtonTextDataN10, tertiaryButtonData != null ? n9(tertiaryButtonData) : null, b9(new Result(dialogData.f())), 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(final i iVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: eb4.f
            @Override // er.l
            public final Object b(Object obj) {
                return i.r9(this.f49284a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(i iVar, z zVar) {
        zVar.C(iVar.new a(null));
        b bVar = iVar.new b(null);
        zVar.x(q0.c(Result.class), o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<cb4.f.a> Y1() {
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
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(DialogData dialogData) {
        super.P5(dialogData);
    }
}
