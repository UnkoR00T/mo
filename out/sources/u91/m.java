package u91;

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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lu91/m;", "Ll00/g;", "Lu91/b;", "", "Lu91/c;", "Lyy/a;", "stateMachineFactory", "Lu91/e;", "mapper", "Lt91/a;", "contractData", "<init>", "(Lyy/a;Lu91/e;Lt91/a;)V", "state", "Lu91/c$a;", "m9", "(Lu91/b;)Lu91/c$a;", "b", "Lu91/e;", "c", "Lt91/a;", "d", "Lu91/b;", "initialState", "Lxw/b;", "Lu91/a;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<State, Object> implements c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t91.a contractData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<u91.a> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f196606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f196607b;

        /* JADX INFO: renamed from: u91.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5112a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f196608a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f196609b;

            /* JADX INFO: renamed from: u91.m$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5113a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f196610d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f196611e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f196612f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f196614h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f196615j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f196616k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f196617l;

                public C5113a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f196610d = obj;
                    this.f196611e |= PKIFailureInfo.systemUnavail;
                    return C5112a.this.F(null, this);
                }
            }

            public C5112a(mu.h hVar, m mVar) {
                this.f196608a = hVar;
                this.f196609b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5113a c5113a;
                if (eVar instanceof C5113a) {
                    c5113a = (C5113a) eVar;
                    int i15 = c5113a.f196611e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5113a.f196611e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5113a = new C5113a(eVar);
                    }
                } else {
                    c5113a = new C5113a(eVar);
                }
                Object obj2 = c5113a.f196610d;
                Object objE = uq.b.e();
                int i16 = c5113a.f196611e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f196608a;
                    c.Data dataM9 = this.f196609b.m9((State) obj);
                    c5113a.f196612f = vq.j.a(obj);
                    c5113a.f196614h = vq.j.a(c5113a);
                    c5113a.f196615j = vq.j.a(obj);
                    c5113a.f196616k = vq.j.a(hVar);
                    c5113a.f196617l = 0;
                    c5113a.f196611e = 1;
                    if (hVar.F(dataM9, c5113a) == objE) {
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
            this.f196606a = gVar;
            this.f196607b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super c.Data> hVar, tq.e eVar) {
            Object objA = this.f196606a.a(new C5112a(hVar, this.f196607b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lu91/a;", "action", "Lu91/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lu91/a;Lu91/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<u91.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f196618e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f196619f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            u91.a aVar = (u91.a) this.f196619f;
            Object objE = uq.b.e();
            int i15 = this.f196618e;
            if (i15 == 0) {
                u.b(obj);
                if (aVar instanceof u91.a.GoBackWithResult) {
                    m.this.contractData.Y2(new t91.a.ChildPassportApplicationReasonData(((u91.a.GoBackWithResult) aVar).getSelectedReason()));
                }
                m mVar = m.this;
                this.f196619f = vq.j.a(aVar);
                this.f196618e = 1;
                if (mVar.F(aVar, this) == objE) {
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
        public final Object w(u91.a aVar, State state, tq.e<? super i0> eVar) {
            b bVar = m.this.new b(eVar);
            bVar.f196619f = aVar;
            return bVar.J(i0.f148189a);
        }
    }

    public m(yy.a aVar, e eVar, t91.a aVar2) {
        this.mapper = eVar;
        this.contractData = aVar2;
        t91.a.ChildPassportApplicationReasonData childPassportApplicationReasonDataQ7 = aVar2.q7();
        State state = new State(childPassportApplicationReasonDataQ7 != null ? childPassportApplicationReasonDataQ7.getReason() : null);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: u91.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.p9(this.f196599a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), m9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c.Data m9(State state) {
        return this.mapper.b(new e.Params(state, b9(u91.a.C5111a.f196578a), new er.l() { // from class: u91.j
            @Override // er.l
            public final Object b(Object obj) {
                return m.n9(this.f196597a, (i61.h) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(m mVar, i61.h hVar) {
        mVar.d9(new u91.a.GoBackWithResult(hVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final m mVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: u91.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.q9(this.f196598a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(m mVar, z zVar) {
        b bVar = mVar.new b(null);
        zVar.x(q0.c(u91.a.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<u91.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(u91.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(t91.a aVar) {
        super.P5(aVar);
    }
}
