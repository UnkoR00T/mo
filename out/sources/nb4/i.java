package nb4;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00188\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lnb4/i;", "Ll00/g;", "Lnb4/c;", "Loq/i0;", "Lnb4/d;", "Lyy/a;", "stateMachineFactory", "Lnb4/q0;", "errorMapper", "Lhb4/c;", "adapter", "<init>", "(Lyy/a;Lnb4/q0;Lhb4/c;)V", "state", "Lnb4/m;", "i9", "(Lnb4/c;)Lnb4/m;", "b", "Lnb4/q0;", "c", "Lhb4/c;", "d", "Lnb4/c;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "error_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i extends l00.g<State, oq.i0> implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q0 errorMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hb4.c adapter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, oq.i0> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<m> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f133867a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f133868b;

        /* JADX INFO: renamed from: nb4.i$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3322a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f133869a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ i f133870b;

            /* JADX INFO: renamed from: nb4.i$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3323a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f133871d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f133872e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f133873f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f133875h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f133876j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f133877k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f133878l;

                public C3323a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f133871d = obj;
                    this.f133872e |= PKIFailureInfo.systemUnavail;
                    return C3322a.this.F(null, this);
                }
            }

            public C3322a(mu.h hVar, i iVar) {
                this.f133869a = hVar;
                this.f133870b = iVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3323a c3323a;
                if (eVar instanceof C3323a) {
                    c3323a = (C3323a) eVar;
                    int i15 = c3323a.f133872e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3323a.f133872e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3323a = new C3323a(eVar);
                    }
                } else {
                    c3323a = new C3323a(eVar);
                }
                Object obj2 = c3323a.f133871d;
                Object objE = uq.b.e();
                int i16 = c3323a.f133872e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f133869a;
                    m mVarI9 = this.f133870b.i9((State) obj);
                    c3323a.f133873f = vq.j.a(obj);
                    c3323a.f133875h = vq.j.a(c3323a);
                    c3323a.f133876j = vq.j.a(obj);
                    c3323a.f133877k = vq.j.a(hVar);
                    c3323a.f133878l = 0;
                    c3323a.f133872e = 1;
                    if (hVar.F(mVarI9, c3323a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public a(mu.g gVar, i iVar) {
            this.f133867a = gVar;
            this.f133868b = iVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super m> hVar, tq.e eVar) {
            Object objA = this.f133867a.a(new C3322a(hVar, this.f133868b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    public i(yy.a aVar, q0 q0Var, hb4.c cVar) {
        this.errorMapper = q0Var;
        this.adapter = cVar;
        State state = new State(cVar.getInitialData());
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: nb4.h
            @Override // er.l
            public final Object b(Object obj) {
                return i.j9((k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), i9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m i9(State state) {
        return this.errorMapper.b(new q0.Params(state.getData()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j9(k10.v vVar) {
        return oq.i0.f148189a;
    }

    @Override // l00.g
    protected k10.t<State, oq.i0> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<m> getState() {
        return this.state;
    }
}
