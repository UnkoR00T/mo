package te3;

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
import ve3.PersonalDetailsData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R&\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00178\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010)\u001a\b\u0012\u0004\u0012\u00020\r0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lte3/j;", "Ll00/g;", "Lte3/b;", "", "Lte3/c;", "Lyy/a;", "stateMachineFactory", "Lue3/a;", "mapper", "Lve3/a;", "setupData", "<init>", "(Lyy/a;Lue3/a;Lve3/a;)V", "Lte3/c$a;", "j9", "(Lte3/b;)Lte3/c$a;", "b", "Lue3/a;", "c", "Lve3/a;", "d", "Lte3/b;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lte3/a;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j extends l00.g<State, Object> implements c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ue3.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final PersonalDetailsData setupData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<te3.a> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f190014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ j f190015b;

        /* JADX INFO: renamed from: te3.j$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4948a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f190016a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ j f190017b;

            /* JADX INFO: renamed from: te3.j$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4949a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f190018d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f190019e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f190020f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f190022h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f190023j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f190024k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f190025l;

                public C4949a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f190018d = obj;
                    this.f190019e |= PKIFailureInfo.systemUnavail;
                    return C4948a.this.F(null, this);
                }
            }

            public C4948a(mu.h hVar, j jVar) {
                this.f190016a = hVar;
                this.f190017b = jVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4949a c4949a;
                if (eVar instanceof C4949a) {
                    c4949a = (C4949a) eVar;
                    int i15 = c4949a.f190019e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4949a.f190019e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4949a = new C4949a(eVar);
                    }
                } else {
                    c4949a = new C4949a(eVar);
                }
                Object obj2 = c4949a.f190018d;
                Object objE = uq.b.e();
                int i16 = c4949a.f190019e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f190016a;
                    c.Data dataJ9 = this.f190017b.j9((State) obj);
                    c4949a.f190020f = vq.j.a(obj);
                    c4949a.f190022h = vq.j.a(c4949a);
                    c4949a.f190023j = vq.j.a(obj);
                    c4949a.f190024k = vq.j.a(hVar);
                    c4949a.f190025l = 0;
                    c4949a.f190019e = 1;
                    if (hVar.F(dataJ9, c4949a) == objE) {
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

        public a(mu.g gVar, j jVar) {
            this.f190014a = gVar;
            this.f190015b = jVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super c.Data> hVar, tq.e eVar) {
            Object objA = this.f190014a.a(new C4948a(hVar, this.f190015b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lte3/a;", "action", "Lte3/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lte3/a;Lte3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<te3.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f190026e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f190027f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            te3.a aVar = (te3.a) this.f190027f;
            Object objE = uq.b.e();
            int i15 = this.f190026e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<te3.a> bVarY1 = j.this.Y1();
                this.f190027f = vq.j.a(aVar);
                this.f190026e = 1;
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
        public final Object w(te3.a aVar, State state, tq.e<? super i0> eVar) {
            b bVar = j.this.new b(eVar);
            bVar.f190027f = aVar;
            return bVar.J(i0.f148189a);
        }
    }

    public j(yy.a aVar, ue3.a aVar2, PersonalDetailsData personalDetailsData) {
        this.mapper = aVar2;
        this.setupData = personalDetailsData;
        State state = new State(personalDetailsData);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: te3.i
            @Override // er.l
            public final Object b(Object obj) {
                return j.l9(this.f190007a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), j9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c.Data j9(State state) {
        return this.mapper.b(new ue3.a.Params(state, b9(te3.a.C4947a.f189991a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final j jVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: te3.h
            @Override // er.l
            public final Object b(Object obj) {
                return j.m9(this.f190006a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(j jVar, z zVar) {
        b bVar = jVar.new b(null);
        zVar.x(q0.c(te3.a.class), o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<te3.a> Y1() {
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
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(PersonalDetailsData personalDetailsData) {
        super.P5(personalDetailsData);
    }
}
