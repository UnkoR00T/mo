package bn1;

import al0.c0;
import er.q;
import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B+\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R&\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030#8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lbn1/m;", "Ll00/g;", "Lbn1/d;", "", "Lbn1/e;", "Lyy/a;", "stateMachineFactory", "Ldn1/b;", "mapper", "Lom1/a;", "createOfficeSelectionDataUC", "Lcn1/a;", "contract", "<init>", "(Lyy/a;Ldn1/b;Lom1/a;Lcn1/a;)V", "state", "Lbn1/e$a;", "n9", "(Lbn1/d;)Lbn1/e$a;", "b", "Ldn1/b;", "c", "Lom1/a;", "d", "Lcn1/a;", "e", "Lbn1/d;", "initialState", "Lxw/b;", "Lbn1/a;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<State, Object> implements e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final dn1.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final om1.a createOfficeSelectionDataUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final cn1.a contract;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<bn1.a> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<e.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f20348a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f20349b;

        /* JADX INFO: renamed from: bn1.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0533a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f20350a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f20351b;

            /* JADX INFO: renamed from: bn1.m$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0534a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f20352d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f20353e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f20354f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f20356h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f20357j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f20358k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f20359l;

                public C0534a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f20352d = obj;
                    this.f20353e |= PKIFailureInfo.systemUnavail;
                    return C0533a.this.F(null, this);
                }
            }

            public C0533a(mu.h hVar, m mVar) {
                this.f20350a = hVar;
                this.f20351b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0534a c0534a;
                if (eVar instanceof C0534a) {
                    c0534a = (C0534a) eVar;
                    int i15 = c0534a.f20353e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0534a.f20353e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0534a = new C0534a(eVar);
                    }
                } else {
                    c0534a = new C0534a(eVar);
                }
                Object obj2 = c0534a.f20352d;
                Object objE = uq.b.e();
                int i16 = c0534a.f20353e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f20350a;
                    e.Data dataN9 = this.f20351b.n9((State) obj);
                    c0534a.f20354f = vq.j.a(obj);
                    c0534a.f20356h = vq.j.a(c0534a);
                    c0534a.f20357j = vq.j.a(obj);
                    c0534a.f20358k = vq.j.a(hVar);
                    c0534a.f20359l = 0;
                    c0534a.f20353e = 1;
                    if (hVar.F(dataN9, c0534a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public a(mu.g gVar, m mVar) {
            this.f20348a = gVar;
            this.f20349b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.Data> hVar, tq.e eVar) {
            Object objA = this.f20348a.a(new C0533a(hVar, this.f20349b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lbn1/b;", "<unused var>", "Lbn1/d;", "Loq/i0;", "<anonymous>", "(Lbn1/b;Lbn1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<bn1.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f20360e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f20360e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                bn1.a.C0532a c0532a = bn1.a.C0532a.f20325a;
                this.f20360e = 1;
                if (mVar.F(c0532a, this) == objE) {
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
        public final Object w(bn1.b bVar, State state, tq.e<? super i0> eVar) {
            return m.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lbn1/c;", "action", "Lbn1/d;", "state", "Loq/i0;", "<anonymous>", "(Lbn1/c;Lbn1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<OnNext, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f20362e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f20363f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OnNext onNext = (OnNext) this.f20363f;
            Object objE = uq.b.e();
            int i15 = this.f20362e;
            if (i15 == 0) {
                u.b(obj);
                m.this.contract.k(onNext.getAction());
                m mVar = m.this;
                bn1.a.Next next = new bn1.a.Next(m.this.createOfficeSelectionDataUC.b(new om1.a.Params(m.this.contract.l())));
                this.f20363f = vq.j.a(onNext);
                this.f20362e = 1;
                if (mVar.F(next, this) == objE) {
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
        public final Object w(OnNext onNext, State state, tq.e<? super i0> eVar) {
            c cVar = m.this.new c(eVar);
            cVar.f20363f = onNext;
            return cVar.J(i0.f148189a);
        }
    }

    public m(yy.a aVar, dn1.b bVar, om1.a aVar2, cn1.a aVar3) {
        this.mapper = bVar;
        this.createOfficeSelectionDataUC = aVar2;
        this.contract = aVar3;
        State state = new State(aVar3.getType());
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: bn1.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.q9(this.f20340a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), n9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.Data n9(State state) {
        return this.mapper.b(new dn1.b.Params(state, b9(bn1.b.f20327a), new er.l() { // from class: bn1.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.o9(this.f20339a, (c0) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(m mVar, c0 c0Var) {
        mVar.d9(new OnNext(c0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(final m mVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: bn1.j
            @Override // er.l
            public final Object b(Object obj) {
                return m.r9(this.f20338a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(m mVar, z zVar) {
        b bVar = mVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(bn1.b.class), oVar, bVar);
        zVar.x(q0.c(OnNext.class), oVar, mVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<bn1.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<e.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(bn1.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(cn1.a aVar) {
        super.P5(aVar);
    }
}
