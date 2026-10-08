package x81;

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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B#\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR&\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030 8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lx81/k;", "Ll00/g;", "Lx81/c;", "Lx81/a;", "Lx81/d;", "", "Lyy/a;", "stateMachineFactory", "Ly81/a;", "mapper", "Lx81/b;", "setupData", "<init>", "(Lyy/a;Ly81/a;Lx81/b;)V", "state", "Lx81/d$a;", "l9", "(Lx81/c;)Lx81/d$a;", "b", "Ly81/a;", "c", "Lx81/b;", "d", "Lx81/c;", "initialState", "Lxw/b;", "Lx81/a$b;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k extends l00.g<State, x81.a> implements d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final y81.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<x81.a.b> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<State, x81.a> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f217351a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f217352b;

        /* JADX INFO: renamed from: x81.k$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5800a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f217353a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ k f217354b;

            /* JADX INFO: renamed from: x81.k$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5801a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f217355d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f217356e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f217357f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f217359h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f217360j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f217361k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f217362l;

                public C5801a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f217355d = obj;
                    this.f217356e |= PKIFailureInfo.systemUnavail;
                    return C5800a.this.F(null, this);
                }
            }

            public C5800a(mu.h hVar, k kVar) {
                this.f217353a = hVar;
                this.f217354b = kVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5801a c5801a;
                if (eVar instanceof C5801a) {
                    c5801a = (C5801a) eVar;
                    int i15 = c5801a.f217356e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5801a.f217356e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5801a = new C5801a(eVar);
                    }
                } else {
                    c5801a = new C5801a(eVar);
                }
                Object obj2 = c5801a.f217355d;
                Object objE = uq.b.e();
                int i16 = c5801a.f217356e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f217353a;
                    d.Data dataL9 = this.f217354b.l9((State) obj);
                    c5801a.f217357f = vq.j.a(obj);
                    c5801a.f217359h = vq.j.a(c5801a);
                    c5801a.f217360j = vq.j.a(obj);
                    c5801a.f217361k = vq.j.a(hVar);
                    c5801a.f217362l = 0;
                    c5801a.f217356e = 1;
                    if (hVar.F(dataL9, c5801a) == objE) {
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
            this.f217351a = gVar;
            this.f217352b = kVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super d.Data> hVar, tq.e eVar) {
            Object objA = this.f217351a.a(new C5800a(hVar, this.f217352b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lx81/a$b;", "action", "Lx81/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lx81/a$b;Lx81/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<x81.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f217363e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f217364f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            x81.a.b bVar = (x81.a.b) this.f217364f;
            Object objE = uq.b.e();
            int i15 = this.f217363e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<x81.a.b> bVarY1 = k.this.Y1();
                this.f217364f = vq.j.a(bVar);
                this.f217363e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(x81.a.b bVar, State state, tq.e<? super i0> eVar) {
            b bVar2 = k.this.new b(eVar);
            bVar2.f217364f = bVar;
            return bVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lx81/a$a;", "<unused var>", "Lx81/c;", "Loq/i0;", "<anonymous>", "(Lx81/a$a;Lx81/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<x81.a.C5797a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f217366e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f217366e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            if (k.this.setupData.getIntroType() == z81.a.TEMPORARY_PASSPORT_ABROAD && k.this.setupData.getReason() == i61.h.WAITING_FOR_A_PASSPORT_PREPARED_IN_POLAND) {
                k.this.d9(x81.a.b.C5798a.f217325a);
            } else {
                k.this.d9(x81.a.b.C5799b.f217326a);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(x81.a.C5797a c5797a, State state, tq.e<? super i0> eVar) {
            return k.this.new c(eVar).J(i0.f148189a);
        }
    }

    public k(yy.a aVar, y81.a aVar2, SetupData setupData) {
        this.mapper = aVar2;
        this.setupData = setupData;
        State state = new State(setupData.getIntroType());
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: x81.j
            @Override // er.l
            public final Object b(Object obj) {
                return k.n9(this.f217344a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), l9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d.Data l9(State state) {
        return this.mapper.b(new y81.a.Params(state, b9(x81.a.b.d.f217328a), b9(x81.a.C5797a.f217324a), b9(x81.a.b.c.f217327a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(final k kVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: x81.i
            @Override // er.l
            public final Object b(Object obj) {
                return k.o9(this.f217343a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(k kVar, z zVar) {
        b bVar = kVar.new b(null);
        o oVar = o.CANCEL_PREVIOUS;
        zVar.x(q0.c(x81.a.b.class), oVar, bVar);
        zVar.x(q0.c(x81.a.C5797a.class), oVar, kVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<x81.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, x81.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<d.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}
