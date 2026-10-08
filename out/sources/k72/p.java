package k72;

import a14.w;
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
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00032\u00020\u0005B)\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0015H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010)\u001a\b\u0012\u0004\u0012\u00020$0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R&\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030*8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u0010008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u00109\u001a\b\u0012\u0004\u0012\u000206058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lk72/p;", "Ll00/g;", "Lk72/g;", "", "Lk72/h;", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Ll72/a;", "mapper", "La14/w;", "openUrlIntentUseCase", "snackBarManagerStateHolder", "<init>", "(Lyy/a;Ll72/a;La14/w;Li70/n;)V", "state", "Lk72/h$a;", "l9", "(Lk72/g;)Lk72/h$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Ll72/a;", "c", "La14/w;", "d", "Li70/n;", "e", "Lk72/g;", "initialState", "Lxw/b;", "Lk72/b;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "j", "()Lmu/g;", "snackBarVisibilityState", "floodalert_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<g, Object> implements h, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l72.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w openUrlIntentUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final g initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<k72.b> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final t<g, Object> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<h.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<h.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f108969a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f108970b;

        /* JADX INFO: renamed from: k72.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2595a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f108971a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f108972b;

            /* JADX INFO: renamed from: k72.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2596a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f108973d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f108974e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f108975f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f108977h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f108978j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f108979k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f108980l;

                public C2596a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f108973d = obj;
                    this.f108974e |= PKIFailureInfo.systemUnavail;
                    return C2595a.this.F(null, this);
                }
            }

            public C2595a(mu.h hVar, p pVar) {
                this.f108971a = hVar;
                this.f108972b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2596a c2596a;
                if (eVar instanceof C2596a) {
                    c2596a = (C2596a) eVar;
                    int i15 = c2596a.f108974e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2596a.f108974e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2596a = new C2596a(eVar);
                    }
                } else {
                    c2596a = new C2596a(eVar);
                }
                Object obj2 = c2596a.f108973d;
                Object objE = uq.b.e();
                int i16 = c2596a.f108974e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f108971a;
                    h.Data dataL9 = this.f108972b.l9((g) obj);
                    c2596a.f108975f = vq.j.a(obj);
                    c2596a.f108977h = vq.j.a(c2596a);
                    c2596a.f108978j = vq.j.a(obj);
                    c2596a.f108979k = vq.j.a(hVar);
                    c2596a.f108980l = 0;
                    c2596a.f108974e = 1;
                    if (hVar.F(dataL9, c2596a) == objE) {
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

        public a(mu.g gVar, p pVar) {
            this.f108969a = gVar;
            this.f108970b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super h.Data> hVar, tq.e eVar) {
            Object objA = this.f108969a.a(new C2595a(hVar, this.f108970b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk72/a;", "<unused var>", "Lk72/g;", "Loq/i0;", "<anonymous>", "(Lk72/a;Lk72/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<k72.a, g, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f108981e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f108981e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<k72.b> bVarY1 = p.this.Y1();
                k72.b.a aVar = k72.b.a.f108938a;
                this.f108981e = 1;
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
        public final Object w(k72.a aVar, g gVar, tq.e<? super i0> eVar) {
            return p.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk72/d;", "<unused var>", "Lk72/g;", "Loq/i0;", "<anonymous>", "(Lk72/d;Lk72/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<k72.d, g, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f108983e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f108983e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<k72.b> bVarY1 = p.this.Y1();
                k72.b.C2594b c2594b = k72.b.C2594b.f108939a;
                this.f108983e = 1;
                if (bVarY1.F(c2594b, this) == objE) {
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
        public final Object w(k72.d dVar, g gVar, tq.e<? super i0> eVar) {
            return p.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk72/e;", "<unused var>", "Lk72/g;", "Loq/i0;", "<anonymous>", "(Lk72/e;Lk72/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<k72.e, g, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f108985e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f108985e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<k72.b> bVarY1 = p.this.Y1();
                k72.b.c cVar = k72.b.c.f108940a;
                this.f108985e = 1;
                if (bVarY1.F(cVar, this) == objE) {
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
        public final Object w(k72.e eVar, g gVar, tq.e<? super i0> eVar2) {
            return p.this.new d(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk72/f;", "<unused var>", "Lk72/g;", "Loq/i0;", "<anonymous>", "(Lk72/f;Lk72/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<k72.f, g, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f108987e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f108987e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<k72.b> bVarY1 = p.this.Y1();
                k72.b.d dVar = k72.b.d.f108941a;
                this.f108987e = 1;
                if (bVarY1.F(dVar, this) == objE) {
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
        public final Object w(k72.f fVar, g gVar, tq.e<? super i0> eVar) {
            return p.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk72/c;", "action", "Lk72/g;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lk72/c;Lk72/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<OpenUrlIntent, g, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f108989e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f108990f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenUrlIntent openUrlIntent = (OpenUrlIntent) this.f108990f;
            Object objE = uq.b.e();
            int i15 = this.f108989e;
            if (i15 == 0) {
                u.b(obj);
                w wVar = p.this.openUrlIntentUseCase;
                w.Params params = new w.Params(openUrlIntent.getUrl(), false, 2, null);
                this.f108990f = vq.j.a(openUrlIntent);
                this.f108989e = 1;
                obj = wVar.c(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            p pVar = p.this;
            if (iVar instanceof dx.i.Left) {
                pVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenUrlIntent openUrlIntent, g gVar, tq.e<? super i0> eVar) {
            f fVar = p.this.new f(eVar);
            fVar.f108990f = openUrlIntent;
            return fVar.J(i0.f148189a);
        }
    }

    public p(yy.a aVar, l72.a aVar2, w wVar, i70.n nVar) {
        this.mapper = aVar2;
        this.openUrlIntentUseCase = wVar;
        this.snackBarManagerStateHolder = nVar;
        g gVar = g.f108946a;
        this.initialState = gVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(gVar, new er.l() { // from class: k72.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.o9(this.f108959a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), l9(gVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h.Data l9(g state) {
        return this.mapper.b(new l72.a.Params(state, b9(k72.a.f108937a), b9(k72.d.f108943a), b9(k72.e.f108944a), b9(k72.f.f108945a), new er.l() { // from class: k72.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.m9(this.f108960a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(p pVar, String str) {
        pVar.d9(new OpenUrlIntent(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(final p pVar, v vVar) {
        vVar.c(q0.c(g.class), new er.l() { // from class: k72.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.p9(this.f108961a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(p pVar, z zVar) {
        b bVar = pVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(k72.a.class), oVar, bVar);
        zVar.x(q0.c(k72.d.class), oVar, pVar.new c(null));
        zVar.x(q0.c(k72.e.class), oVar, pVar.new d(null));
        zVar.x(q0.c(k72.f.class), oVar, pVar.new e(null));
        zVar.x(q0.c(OpenUrlIntent.class), oVar, pVar.new f(null));
        return i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    public xw.b<k72.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<g, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<h.Data> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
