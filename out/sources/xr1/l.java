package xr1;

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
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R&\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00178\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010)\u001a\b\u0012\u0004\u0012\u00020\r0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lxr1/l;", "Ll00/g;", "Lxr1/c;", "", "Lxr1/d;", "Lyy/a;", "stateMachineFactory", "Lyr1/a;", "mapper", "Lpx/d;", "remoteLogger", "<init>", "(Lyy/a;Lyr1/a;Lpx/d;)V", "Lxr1/d$a;", "k9", "(Lxr1/c;)Lxr1/d$a;", "b", "Lyr1/a;", "c", "Lpx/d;", "d", "Lxr1/c;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lxr1/a;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<xr1.c, Object> implements d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final yr1.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xr1.c initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<xr1.c, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<xr1.a> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f220582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f220583b;

        /* JADX INFO: renamed from: xr1.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5897a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f220584a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f220585b;

            /* JADX INFO: renamed from: xr1.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5898a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f220586d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f220587e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f220588f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f220590h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f220591j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f220592k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f220593l;

                public C5898a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f220586d = obj;
                    this.f220587e |= PKIFailureInfo.systemUnavail;
                    return C5897a.this.F(null, this);
                }
            }

            public C5897a(mu.h hVar, l lVar) {
                this.f220584a = hVar;
                this.f220585b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5898a c5898a;
                if (eVar instanceof C5898a) {
                    c5898a = (C5898a) eVar;
                    int i15 = c5898a.f220587e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5898a.f220587e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5898a = new C5898a(eVar);
                    }
                } else {
                    c5898a = new C5898a(eVar);
                }
                Object obj2 = c5898a.f220586d;
                Object objE = uq.b.e();
                int i16 = c5898a.f220587e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f220584a;
                    d.Data dataK9 = this.f220585b.k9((xr1.c) obj);
                    c5898a.f220588f = vq.j.a(obj);
                    c5898a.f220590h = vq.j.a(c5898a);
                    c5898a.f220591j = vq.j.a(obj);
                    c5898a.f220592k = vq.j.a(hVar);
                    c5898a.f220593l = 0;
                    c5898a.f220587e = 1;
                    if (hVar.F(dataK9, c5898a) == objE) {
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

        public a(mu.g gVar, l lVar) {
            this.f220582a = gVar;
            this.f220583b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super d.Data> hVar, tq.e eVar) {
            Object objA = this.f220582a.a(new C5897a(hVar, this.f220583b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxr1/a;", "action", "Lxr1/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lxr1/a;Lxr1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<xr1.a, xr1.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f220594e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f220595f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            xr1.a aVar = (xr1.a) this.f220595f;
            Object objE = uq.b.e();
            int i15 = this.f220594e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<xr1.a> bVarY1 = l.this.Y1();
                this.f220595f = vq.j.a(aVar);
                this.f220594e = 1;
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
        public final Object w(xr1.a aVar, xr1.c cVar, tq.e<? super i0> eVar) {
            b bVar = l.this.new b(eVar);
            bVar.f220595f = aVar;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxr1/b;", "<unused var>", "Lxr1/c;", "Loq/i0;", "<anonymous>", "(Lxr1/b;Lxr1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<xr1.b, xr1.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f220597e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f220597e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            l.this.remoteLogger.n7("This is test log sent from Developer Console.", px.c.a(l.this));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xr1.b bVar, xr1.c cVar, tq.e<? super i0> eVar) {
            return l.this.new c(eVar).J(i0.f148189a);
        }
    }

    public l(yy.a aVar, yr1.a aVar2, px.d dVar) {
        this.mapper = aVar2;
        this.remoteLogger = dVar;
        xr1.c cVar = xr1.c.f220563a;
        this.initialState = cVar;
        this.stateMachine = aVar.a(cVar, new er.l() { // from class: xr1.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.m9(this.f220574a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), k9(cVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d.Data k9(xr1.c cVar) {
        return this.mapper.b(new yr1.a.Params(cVar, b9(xr1.a.C5896a.f220561a), b9(xr1.b.f220562a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final l lVar, v vVar) {
        vVar.c(q0.c(xr1.c.class), new er.l() { // from class: xr1.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.n9(this.f220575a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(l lVar, z zVar) {
        b bVar = lVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(xr1.a.class), oVar, bVar);
        zVar.x(q0.c(xr1.b.class), oVar, lVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<xr1.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<xr1.c, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<d.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
