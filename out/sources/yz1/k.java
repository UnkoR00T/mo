package yz1;

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
import un0.ElectionSupportsHistoryGrantedSupport;
import un0.ElectionSupportsHistoryGrantedSupportsByAction;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B#\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R&\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00198\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lyz1/k;", "Ll00/g;", "Lyz1/b;", "Lyz1/a;", "Lyz1/c;", "", "Lzz1/b;", "mapper", "Lun0/m;", "grantedSupportByAction", "Lyy/a;", "stateMachineFactory", "<init>", "(Lzz1/b;Lun0/m;Lyy/a;)V", "state", "Lyz1/c$a;", "m9", "(Lyz1/b;)Lyz1/c$a;", "b", "Lzz1/b;", "c", "Lun0/m;", "d", "Lyz1/b;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lyz1/a$b;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "electoralsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k extends l00.g<State, yz1.a> implements yz1.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final zz1.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ElectionSupportsHistoryGrantedSupportsByAction grantedSupportByAction;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<State, yz1.a> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<yz1.a.b> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<yz1.c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<yz1.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f230947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f230948b;

        /* JADX INFO: renamed from: yz1.k$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C6212a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f230949a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ k f230950b;

            /* JADX INFO: renamed from: yz1.k$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6213a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f230951d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f230952e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f230953f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f230955h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f230956j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f230957k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f230958l;

                public C6213a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f230951d = obj;
                    this.f230952e |= PKIFailureInfo.systemUnavail;
                    return C6212a.this.F(null, this);
                }
            }

            public C6212a(mu.h hVar, k kVar) {
                this.f230949a = hVar;
                this.f230950b = kVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6213a c6213a;
                if (eVar instanceof C6213a) {
                    c6213a = (C6213a) eVar;
                    int i15 = c6213a.f230952e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6213a.f230952e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6213a = new C6213a(eVar);
                    }
                } else {
                    c6213a = new C6213a(eVar);
                }
                Object obj2 = c6213a.f230951d;
                Object objE = uq.b.e();
                int i16 = c6213a.f230952e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f230949a;
                    yz1.c.Data dataM9 = this.f230950b.m9((State) obj);
                    c6213a.f230953f = vq.j.a(obj);
                    c6213a.f230955h = vq.j.a(c6213a);
                    c6213a.f230956j = vq.j.a(obj);
                    c6213a.f230957k = vq.j.a(hVar);
                    c6213a.f230958l = 0;
                    c6213a.f230952e = 1;
                    if (hVar.F(dataM9, c6213a) == objE) {
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
            this.f230947a = gVar;
            this.f230948b = kVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super yz1.c.Data> hVar, tq.e eVar) {
            Object objA = this.f230947a.a(new C6212a(hVar, this.f230948b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyz1/a$b;", "action", "Lyz1/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lyz1/a$b;Lyz1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<yz1.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230959e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230960f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            yz1.a.b bVar = (yz1.a.b) this.f230960f;
            Object objE = uq.b.e();
            int i15 = this.f230959e;
            if (i15 == 0) {
                u.b(obj);
                k kVar = k.this;
                this.f230960f = vq.j.a(bVar);
                this.f230959e = 1;
                if (kVar.F(bVar, this) == objE) {
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
        public final Object w(yz1.a.b bVar, State state, tq.e<? super i0> eVar) {
            b bVar2 = k.this.new b(eVar);
            bVar2.f230960f = bVar;
            return bVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyz1/a$a;", "action", "Lyz1/b;", "state", "Loq/i0;", "<anonymous>", "(Lyz1/a$a;Lyz1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<yz1.a.ActionSelect, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230962e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230963f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f230964g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            yz1.a.ActionSelect actionSelect = (yz1.a.ActionSelect) this.f230963f;
            State state = (State) this.f230964g;
            uq.b.e();
            if (this.f230962e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            k.this.d9(new yz1.a.b.Next(state.getGrantedSupportsByAction().getActionName(), actionSelect.getGrantedSupport()));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(yz1.a.ActionSelect actionSelect, State state, tq.e<? super i0> eVar) {
            c cVar = k.this.new c(eVar);
            cVar.f230963f = actionSelect;
            cVar.f230964g = state;
            return cVar.J(i0.f148189a);
        }
    }

    public k(zz1.b bVar, ElectionSupportsHistoryGrantedSupportsByAction electionSupportsHistoryGrantedSupportsByAction, yy.a aVar) {
        this.mapper = bVar;
        this.grantedSupportByAction = electionSupportsHistoryGrantedSupportsByAction;
        State state = new State(electionSupportsHistoryGrantedSupportsByAction);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: yz1.j
            @Override // er.l
            public final Object b(Object obj) {
                return k.p9(this.f230940a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), m9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yz1.c.Data m9(State state) {
        return this.mapper.b(new zz1.b.Params(state, b9(yz1.a.b.C6210a.f230924a), new er.l() { // from class: yz1.h
            @Override // er.l
            public final Object b(Object obj) {
                return k.n9(this.f230938a, (ElectionSupportsHistoryGrantedSupport) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(k kVar, ElectionSupportsHistoryGrantedSupport electionSupportsHistoryGrantedSupport) {
        kVar.d9(new yz1.a.ActionSelect(electionSupportsHistoryGrantedSupport));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final k kVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: yz1.i
            @Override // er.l
            public final Object b(Object obj) {
                return k.q9(this.f230939a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(k kVar, z zVar) {
        b bVar = kVar.new b(null);
        o oVar = o.CANCEL_PREVIOUS;
        zVar.x(q0.c(yz1.a.b.class), oVar, bVar);
        zVar.x(q0.c(yz1.a.ActionSelect.class), oVar, kVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<yz1.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, yz1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<yz1.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(yz1.a.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(ElectionSupportsHistoryGrantedSupportsByAction electionSupportsHistoryGrantedSupportsByAction) {
        super.P5(electionSupportsHistoryGrantedSupportsByAction);
    }
}
