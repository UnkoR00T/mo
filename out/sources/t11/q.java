package t11;

import fr.q0;
import h30.ButtonData;
import k10.c0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import v11.ConfirmationScreenModel;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u000f*\u00020\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010+\u001a\b\u0012\u0004\u0012\u00020&0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lt11/q;", "Ll00/g;", "Lt11/f;", "", "Lt11/g;", "Lu11/a;", "confirmationScreenMapper", "Lyy/a;", "stateMachineFactory", "<init>", "(Lu11/a;Lyy/a;)V", "state", "Lt11/g$a;", "o9", "(Lt11/f;)Lt11/g$a;", "Lh30/a;", "Lkotlin/Function0;", "Loq/i0;", "onClickAction", "m9", "(Lh30/a;Ler/a;)Lh30/a;", "Lv11/a;", "model", "q9", "(Lv11/a;)V", "b", "Lu11/a;", "Lt11/f$b;", "c", "Lt11/f$b;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lt11/d;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<f, Object> implements g, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u11.a confirmationScreenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f.b initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k10.t<f, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<t11.d> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<g.a> state;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f186985e;

        a(tq.e<? super a> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f186985e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<t11.d> bVarY1 = q.this.Y1();
                t11.d.a aVar = t11.d.a.f186958a;
                this.f186985e = 1;
                if (bVarY1.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return q.this.new a(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f186987e;

        b(tq.e<? super b> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f186987e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<t11.d> bVarY1 = q.this.Y1();
                t11.d.a aVar = t11.d.a.f186958a;
                this.f186987e = 1;
                if (bVarY1.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return q.this.new b(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements mu.g<g.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f186989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f186990b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f186991a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f186992b;

            /* JADX INFO: renamed from: t11.q$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4857a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f186993d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f186994e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f186995f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f186997h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f186998j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f186999k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f187000l;

                public C4857a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f186993d = obj;
                    this.f186994e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, q qVar) {
                this.f186991a = hVar;
                this.f186992b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4857a c4857a;
                if (eVar instanceof C4857a) {
                    c4857a = (C4857a) eVar;
                    int i15 = c4857a.f186994e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4857a.f186994e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4857a = new C4857a(eVar);
                    }
                } else {
                    c4857a = new C4857a(eVar);
                }
                Object obj2 = c4857a.f186993d;
                Object objE = uq.b.e();
                int i16 = c4857a.f186994e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f186991a;
                    g.a aVarO9 = this.f186992b.o9((f) obj);
                    c4857a.f186995f = vq.j.a(obj);
                    c4857a.f186997h = vq.j.a(c4857a);
                    c4857a.f186998j = vq.j.a(obj);
                    c4857a.f186999k = vq.j.a(hVar);
                    c4857a.f187000l = 0;
                    c4857a.f186994e = 1;
                    if (hVar.F(aVarO9, c4857a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public c(mu.g gVar, q qVar) {
            this.f186989a = gVar;
            this.f186990b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super g.a> hVar, tq.e eVar) {
            Object objA = this.f186989a.a(new a(hVar, this.f186990b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lt11/d;", "action", "Lt11/f;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lt11/d;Lt11/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<t11.d, f, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f187001e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f187002f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            t11.d dVar = (t11.d) this.f187002f;
            Object objE = uq.b.e();
            int i15 = this.f187001e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<t11.d> bVarY1 = q.this.Y1();
                this.f187002f = vq.j.a(dVar);
                this.f187001e = 1;
                if (bVarY1.F(dVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(t11.d dVar, f fVar, tq.e<? super i0> eVar) {
            d dVar2 = q.this.new d(eVar);
            dVar2.f187002f = dVar;
            return dVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lt11/e;", "action", "Lk10/c0;", "Lt11/f;", "state", "Lk10/l;", "<anonymous>", "(Lt11/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<Setup, c0<f>, tq.e<? super k10.l<? extends f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f187004e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f187005f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f187006g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final f.Initialized O(Setup setup, f fVar) {
            return new f.Initialized(setup.getModel());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final Setup setup = (Setup) this.f187005f;
            c0 c0Var = (c0) this.f187006g;
            uq.b.e();
            if (this.f187004e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: t11.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.e.O(setup, (f) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(Setup setup, c0<f> c0Var, tq.e<? super k10.l<? extends f>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f187005f = setup;
            eVar2.f187006g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    public q(u11.a aVar, yy.a aVar2) {
        this.confirmationScreenMapper = aVar;
        f.b bVar = f.b.f186963a;
        this.initialState = bVar;
        this.stateMachine = aVar2.a(bVar, new er.l() { // from class: t11.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.t9(this.f186978a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new c(e9().getState(), this), g.a.C4856a.f186964a);
    }

    private final ButtonData m9(ButtonData buttonData, final er.a<i0> aVar) {
        return ButtonData.b(buttonData, null, null, null, null, null, null, new er.a() { // from class: t11.n
            @Override // er.a
            public final Object a() {
                return q.n9(this.f186976a, aVar);
            }
        }, 63, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(q qVar, er.a aVar) {
        i00.a.a(qVar, qVar.new a(null));
        aVar.a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g.a o9(f state) {
        return this.confirmationScreenMapper.b(new u11.a.Params(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(ConfirmationScreenModel confirmationScreenModel) {
        confirmationScreenModel.getPrimaryButton().h().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(q qVar, ConfirmationScreenModel confirmationScreenModel) {
        i00.a.a(qVar, qVar.new b(null));
        confirmationScreenModel.c().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(final q qVar, v vVar) {
        vVar.c(q0.c(f.class), new er.l() { // from class: t11.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.u9(this.f186979a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(q qVar, z zVar) {
        d dVar = qVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(t11.d.class), oVar, dVar);
        zVar.v(q0.c(Setup.class), oVar, new e(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<t11.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<f, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<g.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    public final void q9(final ConfirmationScreenModel model) {
        d9(new Setup(new ConfirmationScreenModel(model.getTitle(), model.getPrimaryKeyValue(), model.getSecondaryKeyValue(), m9(model.getPrimaryButton(), new er.a() { // from class: t11.l
            @Override // er.a
            public final Object a() {
                return q.r9(model);
            }
        }), new er.a() { // from class: t11.m
            @Override // er.a
            public final Object a() {
                return q.s9(this.f186974a, model);
            }
        })));
    }
}
