package v23;

import fr.q0;
import java.util.List;
import k10.c0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B3\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0011*\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u00020\u0013*\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\u00020\u0013*\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\u00020\u001d*\u00020\u0002H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010*\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R&\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030+8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R \u00107\u001a\b\u0012\u0004\u0012\u000202018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R \u0010=\u001a\b\u0012\u0004\u0012\u00020\u001d088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006>"}, d2 = {"Lv23/n;", "Ll00/g;", "Lv23/c;", "", "Lv23/d;", "Lyy/a;", "stateMachineFactory", "Lac4/n;", "openUriIntentUseCase", "Lw23/a;", "mapper", "La00/b;", "pickedFileToAndroidMapper", "Lv23/e;", "contract", "<init>", "(Lyy/a;Lac4/n;Lw23/a;La00/b;Lv23/e;)V", "", "Lwx/i;", "Lv23/d$a;", "t9", "(Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "", "index", "u9", "(Lwx/i;I)Lv23/d$a;", "Lzz/h;", "s9", "(Lzz/h;I)Lv23/d$a;", "Lv23/d$b;", "n9", "(Lv23/c;)Lv23/d$b;", "b", "Lac4/n;", "c", "Lw23/a;", "d", "La00/b;", "e", "Lv23/e;", "f", "Lv23/c;", "initialState", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lv23/a;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<v23.c, Object> implements v23.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ac4.n openUriIntentUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w23.a mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a00.b pickedFileToAndroidMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final v23.e contract;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final v23.c initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<v23.c, Object> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<v23.a> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<v23.d.b> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<v23.d.b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f203365a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f203366b;

        /* JADX INFO: renamed from: v23.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5294a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f203367a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f203368b;

            /* JADX INFO: renamed from: v23.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5295a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f203369d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f203370e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f203371f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f203373h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f203374j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f203375k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f203376l;

                public C5295a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f203369d = obj;
                    this.f203370e |= PKIFailureInfo.systemUnavail;
                    return C5294a.this.F(null, this);
                }
            }

            public C5294a(mu.h hVar, n nVar) {
                this.f203367a = hVar;
                this.f203368b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5295a c5295a;
                if (eVar instanceof C5295a) {
                    c5295a = (C5295a) eVar;
                    int i15 = c5295a.f203370e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5295a.f203370e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5295a = new C5295a(eVar);
                    }
                } else {
                    c5295a = new C5295a(eVar);
                }
                Object obj2 = c5295a.f203369d;
                Object objE = uq.b.e();
                int i16 = c5295a.f203370e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f203367a;
                    v23.d.b bVarN9 = this.f203368b.n9((v23.c) obj);
                    c5295a.f203371f = vq.j.a(obj);
                    c5295a.f203373h = vq.j.a(c5295a);
                    c5295a.f203374j = vq.j.a(obj);
                    c5295a.f203375k = vq.j.a(hVar);
                    c5295a.f203376l = 0;
                    c5295a.f203370e = 1;
                    if (hVar.F(bVarN9, c5295a) == objE) {
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
            this.f203365a = gVar;
            this.f203366b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super v23.d.b> hVar, tq.e eVar) {
            Object objA = this.f203365a.a(new C5294a(hVar, this.f203366b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lv23/a;", "action", "Lv23/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lv23/a;Lv23/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<v23.a, v23.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203377e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f203378f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            v23.a aVar = (v23.a) this.f203378f;
            Object objE = uq.b.e();
            int i15 = this.f203377e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<v23.a> bVarY1 = n.this.Y1();
                this.f203378f = vq.j.a(aVar);
                this.f203377e = 1;
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
        public final Object w(v23.a aVar, v23.c cVar, tq.e<? super i0> eVar) {
            b bVar = n.this.new b(eVar);
            bVar.f203378f = aVar;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lv23/b;", "action", "Lv23/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lv23/b;Lv23/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<OpenUri, v23.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203380e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f203381f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenUri openUri = (OpenUri) this.f203381f;
            Object objE = uq.b.e();
            int i15 = this.f203380e;
            if (i15 == 0) {
                u.b(obj);
                ac4.n nVar = n.this.openUriIntentUseCase;
                ac4.n.Params params = new ac4.n.Params(openUri.getUri());
                this.f203381f = vq.j.a(openUri);
                this.f203380e = 1;
                if (nVar.c(params, this) == objE) {
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
        public final Object w(OpenUri openUri, v23.c cVar, tq.e<? super i0> eVar) {
            c cVar2 = n.this.new c(eVar);
            cVar2.f203381f = openUri;
            return cVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lv23/c$b;", "state", "Lk10/l;", "Lv23/c;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<c0<v23.c.b>, tq.e<? super k10.l<? extends v23.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203383e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f203384f;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v23.c.Displayed O(List list, v23.c.b bVar) {
            return new v23.c.Displayed(list);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f203384f;
            Object objE = uq.b.e();
            int i15 = this.f203383e;
            if (i15 == 0) {
                u.b(obj);
                n nVar = n.this;
                List<wx.i> listH = nVar.contract.h();
                this.f203384f = c0Var;
                this.f203383e = 1;
                obj = nVar.t9(listH, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            final List list = (List) obj;
            return c0Var.d(new er.l() { // from class: v23.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.d.O(list, (c.b) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<v23.c.b> c0Var, tq.e<? super k10.l<? extends v23.c>> eVar) {
            return ((d) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            d dVar = n.this.new d(eVar);
            dVar.f203384f = obj;
            return dVar;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f203386d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f203387e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f203388f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f203389g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f203390h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f203391j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f203392k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f203393l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f203394m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f203395n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f203396p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f203397q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f203398r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f203399s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f203401v;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f203399s = obj;
            this.f203401v |= PKIFailureInfo.systemUnavail;
            return n.this.t9(null, this);
        }
    }

    public n(yy.a aVar, ac4.n nVar, w23.a aVar2, a00.b bVar, v23.e eVar) {
        this.openUriIntentUseCase = nVar;
        this.mapper = aVar2;
        this.pickedFileToAndroidMapper = bVar;
        this.contract = eVar;
        v23.c.b bVar2 = v23.c.b.f203339a;
        this.initialState = bVar2;
        this.stateMachine = aVar.a(bVar2, new er.l() { // from class: v23.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.p9(this.f203356a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), n9(bVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v23.d.b n9(v23.c cVar) {
        return this.mapper.b(new w23.a.Params(cVar, b9(v23.a.C5292a.f203335a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final n nVar, v vVar) {
        vVar.c(q0.c(v23.c.class), new er.l() { // from class: v23.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.q9(this.f203354a, (z) obj);
            }
        });
        vVar.c(q0.c(v23.c.b.class), new er.l() { // from class: v23.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.r9(this.f203355a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(v23.a.class), oVar, bVar);
        zVar.x(q0.c(OpenUri.class), oVar, nVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(n nVar, z zVar) {
        zVar.A(nVar.new d(null));
        return i0.f148189a;
    }

    private final v23.d.CardModel s9(zz.h hVar, int i15) {
        if (hVar instanceof zz.h.Regular) {
            return u9(((zz.h.Regular) hVar).a(), i15);
        }
        if (!(hVar instanceof zz.h.Image)) {
            throw new oq.p();
        }
        zz.h.Image image = (zz.h.Image) hVar;
        return new v23.d.CardModel(mx.b.b(wx.j.a(image.a()), "File" + i15), image.getThumbnail(), b9(new v23.a.ShowImagePreview(new dx3.a.Content(mx.b.b(wx.j.a(image.a()), "File" + i15), image.a().getFileContent()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x008e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0096  */
    /* JADX WARN: Code duplicated, block: B:22:0x00d9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:23:0x00da  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:27:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:31:0x011a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x00da -> B:24:0x00e8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object t9(java.util.List<? extends wx.i> r18, tq.e<? super java.util.List<v23.d.CardModel>> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v23.n.t9(java.util.List, tq.e):java.lang.Object");
    }

    private final v23.d.CardModel u9(wx.i iVar, int i15) {
        return new v23.d.CardModel(mx.b.b(wx.j.a(iVar), "File" + i15), null, b9(new OpenUri(iVar.getMetadata().getUri())));
    }

    @Override // zx.b
    public xw.b<v23.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<v23.c, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<v23.d.b> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(v23.e eVar) {
        super.P5(eVar);
    }
}
