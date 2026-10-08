package c13;

import f13.SafeBusPayloadData;
import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B+\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010+\u001a\b\u0012\u0004\u0012\u00020&0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lc13/o;", "Ll00/g;", "Lc13/f;", "", "Lc13/g;", "Lyy/a;", "stateMachineFactory", "Le13/a;", "safeBusVerifiedMapper", "Lf01/b;", "launchNativeRatingUC", "Lf13/a;", "safeBusPayloadData", "<init>", "(Lyy/a;Le13/a;Lf01/b;Lf13/a;)V", "state", "Lc13/g$a;", "m9", "(Lc13/f;)Lc13/g$a;", "Loq/i0;", "l9", "()V", "b", "Le13/a;", "c", "Lf01/b;", "d", "Lf13/a;", "e", "Lc13/f;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lc13/d;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "safebus_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<State, Object> implements g, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e13.a safeBusVerifiedMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final f01.b launchNativeRatingUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final SafeBusPayloadData safeBusPayloadData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<c13.d> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<g.Data> state;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f22620e;

        a(tq.e<? super a> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f22620e;
            if (i15 == 0) {
                u.b(obj);
                f01.b bVar = o.this.launchNativeRatingUC;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f22620e = 1;
                if (bVar.c(c1792a, this) == objE) {
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

        public final tq.e<i0> M(tq.e<?> eVar) {
            return o.this.new a(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<g.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f22622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f22623b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f22624a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f22625b;

            /* JADX INFO: renamed from: c13.o$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0600a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f22626d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f22627e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f22628f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f22630h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f22631j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f22632k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f22633l;

                public C0600a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f22626d = obj;
                    this.f22627e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, o oVar) {
                this.f22624a = hVar;
                this.f22625b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0600a c0600a;
                if (eVar instanceof C0600a) {
                    c0600a = (C0600a) eVar;
                    int i15 = c0600a.f22627e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0600a.f22627e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0600a = new C0600a(eVar);
                    }
                } else {
                    c0600a = new C0600a(eVar);
                }
                Object obj2 = c0600a.f22626d;
                Object objE = uq.b.e();
                int i16 = c0600a.f22627e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f22624a;
                    g.Data dataM9 = this.f22625b.m9((State) obj);
                    c0600a.f22628f = vq.j.a(obj);
                    c0600a.f22630h = vq.j.a(c0600a);
                    c0600a.f22631j = vq.j.a(obj);
                    c0600a.f22632k = vq.j.a(hVar);
                    c0600a.f22633l = 0;
                    c0600a.f22627e = 1;
                    if (hVar.F(dataM9, c0600a) == objE) {
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

        public b(mu.g gVar, o oVar) {
            this.f22622a = gVar;
            this.f22623b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super g.Data> hVar, tq.e eVar) {
            Object objA = this.f22622a.a(new a(hVar, this.f22623b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc13/c;", "<unused var>", "Lc13/f;", "Loq/i0;", "<anonymous>", "(Lc13/c;Lc13/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<c13.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f22634e;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final /* synthetic */ class a extends fr.q implements er.a<i0> {
            a(Object obj) {
                super(0, obj, o.class, "launchAppRating", "launchAppRating()V", 0);
            }

            public final void E() {
                ((o) this.f66391b).l9();
            }

            @Override // er.a
            public /* bridge */ /* synthetic */ i0 a() {
                E();
                return i0.f148189a;
            }
        }

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f22634e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<c13.d> bVarY1 = o.this.Y1();
                c13.d.Back back = new c13.d.Back(new a(o.this));
                this.f22634e = 1;
                if (bVarY1.F(back, this) == objE) {
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
        public final Object w(c13.c cVar, State state, tq.e<? super i0> eVar) {
            return o.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lc13/e;", "<unused var>", "Lc13/f;", "Loq/i0;", "<anonymous>", "(Lc13/e;Lc13/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<e, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f22636e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f22636e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<c13.d> bVarY1 = o.this.Y1();
                c13.d.b bVar = c13.d.b.f22588a;
                this.f22636e = 1;
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
        public final Object w(e eVar, State state, tq.e<? super i0> eVar2) {
            return o.this.new d(eVar2).J(i0.f148189a);
        }
    }

    public o(yy.a aVar, e13.a aVar2, f01.b bVar, SafeBusPayloadData safeBusPayloadData) {
        this.safeBusVerifiedMapper = aVar2;
        this.launchNativeRatingUC = bVar;
        this.safeBusPayloadData = safeBusPayloadData;
        State state = new State(safeBusPayloadData.getVehicle());
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: c13.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.o9(this.f22612a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), m9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l9() {
        i00.a.a(this, new a(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g.Data m9(State state) {
        return this.safeBusVerifiedMapper.b(new e13.a.Params(state, b9(e.f22589a), b9(c13.c.f22586a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(final o oVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: c13.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.p9(this.f22611a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(o oVar, z zVar) {
        c cVar = oVar.new c(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(c13.c.class), oVar2, cVar);
        zVar.x(q0.c(e.class), oVar2, oVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<c13.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<g.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SafeBusPayloadData safeBusPayloadData) {
        super.P5(safeBusPayloadData);
    }
}
