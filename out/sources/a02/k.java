package a02;

import er.q;
import fr.q0;
import k10.o;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00188\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"La02/k;", "Ll00/g;", "La02/c;", "", "La02/d;", "Lb02/a;", "mapper", "La02/b;", "setupData", "Lyy/a;", "stateMachineFactory", "<init>", "(Lb02/a;La02/b;Lyy/a;)V", "state", "La02/d$a;", "k9", "(La02/c;)La02/d$a;", "b", "Lb02/a;", "c", "La02/b;", "d", "La02/c;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "La02/a;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "electoralsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k extends l00.g<State, Object> implements d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b02.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<a02.a> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f1134a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f1135b;

        /* JADX INFO: renamed from: a02.k$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0007a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f1136a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ k f1137b;

            /* JADX INFO: renamed from: a02.k$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0008a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f1138d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f1139e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f1140f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f1142h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f1143j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f1144k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f1145l;

                public C0008a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f1138d = obj;
                    this.f1139e |= PKIFailureInfo.systemUnavail;
                    return C0007a.this.F(null, this);
                }
            }

            public C0007a(mu.h hVar, k kVar) {
                this.f1136a = hVar;
                this.f1137b = kVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0008a c0008a;
                if (eVar instanceof C0008a) {
                    c0008a = (C0008a) eVar;
                    int i15 = c0008a.f1139e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0008a.f1139e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0008a = new C0008a(eVar);
                    }
                } else {
                    c0008a = new C0008a(eVar);
                }
                Object obj2 = c0008a.f1138d;
                Object objE = uq.b.e();
                int i16 = c0008a.f1139e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f1136a;
                    d.Data dataK9 = this.f1137b.k9((State) obj);
                    c0008a.f1140f = vq.j.a(obj);
                    c0008a.f1142h = vq.j.a(c0008a);
                    c0008a.f1143j = vq.j.a(obj);
                    c0008a.f1144k = vq.j.a(hVar);
                    c0008a.f1145l = 0;
                    c0008a.f1139e = 1;
                    if (hVar.F(dataK9, c0008a) == objE) {
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

        public a(mu.g gVar, k kVar) {
            this.f1134a = gVar;
            this.f1135b = kVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super d.Data> hVar, tq.e eVar) {
            Object objA = this.f1134a.a(new C0007a(hVar, this.f1135b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"La02/a;", "action", "La02/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(La02/a;La02/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<a02.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1146e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f1147f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a02.a aVar = (a02.a) this.f1147f;
            Object objE = uq.b.e();
            int i15 = this.f1146e;
            if (i15 == 0) {
                u.b(obj);
                k kVar = k.this;
                this.f1147f = vq.j.a(aVar);
                this.f1146e = 1;
                if (kVar.F(aVar, this) == objE) {
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
        public final Object w(a02.a aVar, State state, tq.e<? super i0> eVar) {
            b bVar = k.this.new b(eVar);
            bVar.f1147f = aVar;
            return bVar.J(i0.f148189a);
        }
    }

    public k(b02.a aVar, SetupData setupData, yy.a aVar2) {
        this.mapper = aVar;
        this.setupData = setupData;
        State state = new State(setupData.getActionName(), setupData.getGrantedSupport());
        this.initialState = state;
        this.stateMachine = aVar2.a(state, new er.l() { // from class: a02.j
            @Override // er.l
            public final Object b(Object obj) {
                return k.m9(this.f1127a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), k9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d.Data k9(State state) {
        return this.mapper.b(new b02.a.Params(state, b9(a02.a.C0006a.f1112a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final k kVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: a02.i
            @Override // er.l
            public final Object b(Object obj) {
                return k.n9(this.f1126a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(k kVar, z zVar) {
        b bVar = kVar.new b(null);
        zVar.x(q0.c(a02.a.class), o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<a02.a> Y1() {
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
    /* JADX INFO: renamed from: j9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(a02.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}
