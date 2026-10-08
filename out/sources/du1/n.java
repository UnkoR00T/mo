package du1;

import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pv0.DriverQualifications;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Ldu1/n;", "Ll00/g;", "Ldu1/c;", "", "Ldu1/d;", "Lyy/a;", "stateMachineFactory", "Leu1/b;", "mapper", "Lpv0/a;", "driverQualifications", "<init>", "(Lyy/a;Leu1/b;Lpv0/a;)V", "state", "Ldu1/d$a;", "j9", "(Ldu1/c;)Ldu1/d$a;", "b", "Leu1/b;", "c", "Lpv0/a;", "d", "Ldu1/c;", "initialState", "Lxw/b;", "Ldu1/a;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "driverqualifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<State, Object> implements d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final eu1.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final DriverQualifications driverQualifications;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<du1.a> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f44586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f44587b;

        /* JADX INFO: renamed from: du1.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1012a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f44588a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f44589b;

            /* JADX INFO: renamed from: du1.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1013a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f44590d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f44591e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f44592f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f44594h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f44595j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f44596k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f44597l;

                public C1013a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f44590d = obj;
                    this.f44591e |= PKIFailureInfo.systemUnavail;
                    return C1012a.this.F(null, this);
                }
            }

            public C1012a(mu.h hVar, n nVar) {
                this.f44588a = hVar;
                this.f44589b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1013a c1013a;
                if (eVar instanceof C1013a) {
                    c1013a = (C1013a) eVar;
                    int i15 = c1013a.f44591e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1013a.f44591e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1013a = new C1013a(eVar);
                    }
                } else {
                    c1013a = new C1013a(eVar);
                }
                Object obj2 = c1013a.f44590d;
                Object objE = uq.b.e();
                int i16 = c1013a.f44591e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f44588a;
                    d.Data dataJ9 = this.f44589b.j9((State) obj);
                    c1013a.f44592f = vq.j.a(obj);
                    c1013a.f44594h = vq.j.a(c1013a);
                    c1013a.f44595j = vq.j.a(obj);
                    c1013a.f44596k = vq.j.a(hVar);
                    c1013a.f44597l = 0;
                    c1013a.f44591e = 1;
                    if (hVar.F(dataJ9, c1013a) == objE) {
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

        public a(mu.g gVar, n nVar) {
            this.f44586a = gVar;
            this.f44587b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super d.Data> hVar, tq.e eVar) {
            Object objA = this.f44586a.a(new C1012a(hVar, this.f44587b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldu1/b;", "<unused var>", "Ldu1/c;", "Loq/i0;", "<anonymous>", "(Ldu1/b;Ldu1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<du1.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f44598e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f44598e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<du1.a> bVarY1 = n.this.Y1();
                du1.a.C1010a c1010a = du1.a.C1010a.f44555a;
                this.f44598e = 1;
                if (bVarY1.F(c1010a, this) == objE) {
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
        public final Object w(du1.b bVar, State state, tq.e<? super i0> eVar) {
            return n.this.new b(eVar).J(i0.f148189a);
        }
    }

    public n(yy.a aVar, eu1.b bVar, DriverQualifications driverQualifications) {
        this.mapper = bVar;
        this.driverQualifications = driverQualifications;
        State state = new State(driverQualifications);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: du1.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.l9(this.f44579a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), j9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d.Data j9(State state) {
        return this.mapper.b(new eu1.b.Params(state, b9(du1.b.f44556a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final n nVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: du1.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.m9(this.f44578a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        zVar.x(q0.c(du1.b.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<du1.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<d.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(DriverQualifications driverQualifications) {
        super.P5(driverQualifications);
    }
}
