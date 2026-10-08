package xv2;

import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import mv2.CustomErrorData;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R&\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00178\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010)\u001a\b\u0012\u0004\u0012\u00020\r0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lxv2/n;", "Ll00/g;", "Lxv2/e;", "", "Lxv2/f;", "Lyy/a;", "stateMachineFactory", "Lyv2/b;", "mapper", "Lmv2/a;", "data", "<init>", "(Lyy/a;Lyv2/b;Lmv2/a;)V", "Lxv2/f$a;", "k9", "(Lxv2/e;)Lxv2/f$a;", "b", "Lyv2/b;", "c", "Lmv2/a;", "d", "Lxv2/e;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lxv2/c;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<State, Object> implements f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final yv2.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CustomErrorData data;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<c> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<f.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f221600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f221601b;

        /* JADX INFO: renamed from: xv2.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5928a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f221602a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f221603b;

            /* JADX INFO: renamed from: xv2.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5929a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f221604d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f221605e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f221606f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f221608h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f221609j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f221610k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f221611l;

                public C5929a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f221604d = obj;
                    this.f221605e |= PKIFailureInfo.systemUnavail;
                    return C5928a.this.F(null, this);
                }
            }

            public C5928a(mu.h hVar, n nVar) {
                this.f221602a = hVar;
                this.f221603b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5929a c5929a;
                if (eVar instanceof C5929a) {
                    c5929a = (C5929a) eVar;
                    int i15 = c5929a.f221605e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5929a.f221605e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5929a = new C5929a(eVar);
                    }
                } else {
                    c5929a = new C5929a(eVar);
                }
                Object obj2 = c5929a.f221604d;
                Object objE = uq.b.e();
                int i16 = c5929a.f221605e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f221602a;
                    f.Data dataK9 = this.f221603b.k9((State) obj);
                    c5929a.f221606f = vq.j.a(obj);
                    c5929a.f221608h = vq.j.a(c5929a);
                    c5929a.f221609j = vq.j.a(obj);
                    c5929a.f221610k = vq.j.a(hVar);
                    c5929a.f221611l = 0;
                    c5929a.f221605e = 1;
                    if (hVar.F(dataK9, c5929a) == objE) {
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
            this.f221600a = gVar;
            this.f221601b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.Data> hVar, tq.e eVar) {
            Object objA = this.f221600a.a(new C5928a(hVar, this.f221601b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxv2/d;", "<unused var>", "Lxv2/e;", "Loq/i0;", "<anonymous>", "(Lxv2/d;Lxv2/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f221612e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f221612e;
            if (i15 == 0) {
                u.b(obj);
                n nVar = n.this;
                c.a aVar = c.a.f221579a;
                this.f221612e = 1;
                if (nVar.F(aVar, this) == objE) {
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

    public n(yy.a aVar, yv2.b bVar, CustomErrorData customErrorData) {
        this.mapper = bVar;
        this.data = customErrorData;
        State state = new State(customErrorData);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: xv2.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.m9(this.f221592a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), k9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.Data k9(State state) {
        return this.mapper.b(new yv2.b.Params(state, b9(d.f221580a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final n nVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: xv2.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.n9(this.f221593a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(n nVar, z zVar) {
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
    /* JADX INFO: renamed from: j9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(c cVar, tq.e<? super i0> eVar) {
        return super.F(cVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(CustomErrorData customErrorData) {
        super.P5(customErrorData);
    }
}
