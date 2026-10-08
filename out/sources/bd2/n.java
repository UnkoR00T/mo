package bd2;

import al0.e0;
import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR&\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030!8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lbd2/n;", "Ll00/g;", "Lbd2/e;", "", "Lbd2/f;", "Lyy/a;", "stateMachineFactory", "Lcd2/a;", "mapper", "Lal0/e0;", "idCardSuspensionResult", "<init>", "(Lyy/a;Lcd2/a;Lal0/e0;)V", "state", "Lbd2/f$a;", "j9", "(Lbd2/e;)Lbd2/f$a;", "b", "Lcd2/a;", "c", "Lal0/e0;", "getIdCardSuspensionResult", "()Lal0/e0;", "d", "Lbd2/e;", "initialState", "Lxw/b;", "Lbd2/c;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "identitycardsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<State, Object> implements f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final cd2.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e0 idCardSuspensionResult;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<c> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<f.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f18405a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f18406b;

        /* JADX INFO: renamed from: bd2.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0463a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f18407a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f18408b;

            /* JADX INFO: renamed from: bd2.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0464a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f18409d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f18410e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f18411f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f18413h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f18414j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f18415k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f18416l;

                public C0464a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f18409d = obj;
                    this.f18410e |= PKIFailureInfo.systemUnavail;
                    return C0463a.this.F(null, this);
                }
            }

            public C0463a(mu.h hVar, n nVar) {
                this.f18407a = hVar;
                this.f18408b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0464a c0464a;
                if (eVar instanceof C0464a) {
                    c0464a = (C0464a) eVar;
                    int i15 = c0464a.f18410e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0464a.f18410e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0464a = new C0464a(eVar);
                    }
                } else {
                    c0464a = new C0464a(eVar);
                }
                Object obj2 = c0464a.f18409d;
                Object objE = uq.b.e();
                int i16 = c0464a.f18410e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f18407a;
                    f.Data dataJ9 = this.f18408b.j9((State) obj);
                    c0464a.f18411f = vq.j.a(obj);
                    c0464a.f18413h = vq.j.a(c0464a);
                    c0464a.f18414j = vq.j.a(obj);
                    c0464a.f18415k = vq.j.a(hVar);
                    c0464a.f18416l = 0;
                    c0464a.f18410e = 1;
                    if (hVar.F(dataJ9, c0464a) == objE) {
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
            this.f18405a = gVar;
            this.f18406b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.Data> hVar, tq.e eVar) {
            Object objA = this.f18405a.a(new C0463a(hVar, this.f18406b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lbd2/d;", "<unused var>", "Lbd2/e;", "Loq/i0;", "<anonymous>", "(Lbd2/d;Lbd2/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f18417e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f18417e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<c> bVarY1 = n.this.Y1();
                c.a aVar = c.a.f18386a;
                this.f18417e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(d dVar, State state, tq.e<? super i0> eVar) {
            return n.this.new b(eVar).J(i0.f148189a);
        }
    }

    public n(yy.a aVar, cd2.a aVar2, e0 e0Var) {
        this.mapper = aVar2;
        this.idCardSuspensionResult = e0Var;
        State state = new State(e0Var);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: bd2.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.l9(this.f18398a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), j9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.Data j9(State state) {
        return this.mapper.b(new cd2.a.Params(state, b9(d.f18387a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final n nVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: bd2.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.m9(this.f18397a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        zVar.x(q0.c(d.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<f.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(e0 e0Var) {
        super.P5(e0Var);
    }
}
