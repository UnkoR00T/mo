package wx3;

import p071kotlin.Metadata;
import qx3.MakePaymentInitialData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B\u001b\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R&\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010-\u001a\b\u0012\u0004\u0012\u00020\u00020(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lwx3/z0;", "Ll00/g;", "Lwx3/u;", "", "Lwx3/v;", "Lqx3/c;", "Lyy/a;", "stateMachineFactory", "Lqx3/d;", "makePaymentInitialData", "<init>", "(Lyy/a;Lqx3/d;)V", "Loq/i0;", "c4", "()V", "I2", "", "isPaymentBeingProcessed", "m7", "(Z)V", "b", "Lqx3/d;", "W", "()Lqx3/d;", "c", "Lwx3/u;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lqx3/c$a;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z0 extends l00.g<u, Object> implements v, qx3.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final MakePaymentInitialData makePaymentInitialData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final u initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k10.t<u, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<qx3.c.a> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<u> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lwx3/s;", "<unused var>", "Lwx3/u;", "Loq/i0;", "<anonymous>", "(Lwx3/s;Lwx3/u;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.q<s, u, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f215874e;

        a(tq.e<? super a> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f215874e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<qx3.c.a> bVarY1 = z0.this.Y1();
                qx3.c.a.C4279a c4279a = qx3.c.a.C4279a.f169322a;
                this.f215874e = 1;
                if (bVarY1.F(c4279a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(s sVar, u uVar, tq.e<? super oq.i0> eVar) {
            return z0.this.new a(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lwx3/r;", "<unused var>", "Lwx3/u;", "Loq/i0;", "<anonymous>", "(Lwx3/r;Lwx3/u;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<r, u, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f215876e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f215876e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<qx3.c.a> bVarY1 = z0.this.Y1();
                qx3.c.a.b bVar = qx3.c.a.b.f169323a;
                this.f215876e = 1;
                if (bVarY1.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(r rVar, u uVar, tq.e<? super oq.i0> eVar) {
            return z0.this.new b(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lwx3/t;", "action", "Lwx3/u;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lwx3/t;Lwx3/u;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<CompleteProcess, u, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f215878e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f215879f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            CompleteProcess completeProcess = (CompleteProcess) this.f215879f;
            Object objE = uq.b.e();
            int i15 = this.f215878e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<qx3.c.a> bVarY1 = z0.this.Y1();
                qx3.c.a.ProcessCompleted processCompleted = new qx3.c.a.ProcessCompleted(completeProcess.getIsPaymentBeingProcessed(), z0.this.getMakePaymentInitialData().getData());
                this.f215879f = vq.j.a(completeProcess);
                this.f215878e = 1;
                if (bVarY1.F(processCompleted, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(CompleteProcess completeProcess, u uVar, tq.e<? super oq.i0> eVar) {
            c cVar = z0.this.new c(eVar);
            cVar.f215879f = completeProcess;
            return cVar.J(oq.i0.f148189a);
        }
    }

    public z0(yy.a aVar, MakePaymentInitialData makePaymentInitialData) {
        this.makePaymentInitialData = makePaymentInitialData;
        u uVar = u.f215855a;
        this.initialState = uVar;
        this.stateMachine = aVar.a(uVar, new er.l() { // from class: wx3.x0
            @Override // er.l
            public final Object b(Object obj) {
                return z0.j9(this.f215863a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(e9().getState(), uVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j9(final z0 z0Var, k10.v vVar) {
        vVar.c(fr.q0.c(u.class), new er.l() { // from class: wx3.y0
            @Override // er.l
            public final Object b(Object obj) {
                return z0.k9(this.f215866a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k9(z0 z0Var, k10.z zVar) {
        a aVar = z0Var.new a(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(s.class), oVar, aVar);
        zVar.x(fr.q0.c(r.class), oVar, z0Var.new b(null));
        zVar.x(fr.q0.c(CompleteProcess.class), oVar, z0Var.new c(null));
        return oq.i0.f148189a;
    }

    @Override // wx3.v
    public void I2() {
        d9(r.f215847a);
    }

    @Override // wx3.v
    /* JADX INFO: renamed from: W, reason: from getter */
    public MakePaymentInitialData getMakePaymentInitialData() {
        return this.makePaymentInitialData;
    }

    @Override // zx.b
    public xw.b<qx3.c.a> Y1() {
        return this.navAction;
    }

    @Override // wx3.v
    public void c4() {
        d9(s.f215850a);
    }

    @Override // l00.g
    protected k10.t<u, Object> e9() {
        return this.stateMachine;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: i9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(MakePaymentInitialData makePaymentInitialData) {
        super.P5(makePaymentInitialData);
    }

    @Override // wx3.v
    public void m7(boolean isPaymentBeingProcessed) {
        d9(new CompleteProcess(isPaymentBeingProcessed));
    }
}
