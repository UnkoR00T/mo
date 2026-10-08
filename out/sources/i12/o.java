package i12;

import a14.w;
import fr.q0;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B3\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR&\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030!8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010-\u001a\b\u0012\u0004\u0012\u00020(0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Li12/o;", "Ll00/g;", "Li12/d;", "", "Li12/e;", "Lyy/a;", "stateMachineFactory", "Lj12/a;", "inboxFaqMapper", "La14/w;", "openUrlIntentUseCase", "Li70/e;", "globalSnackBarManager", "", "faq", "<init>", "(Lyy/a;Lj12/a;La14/w;Li70/e;Ljava/lang/String;)V", "state", "Li12/e$a;", "p9", "(Li12/d;)Li12/e$a;", "b", "Lj12/a;", "c", "La14/w;", "d", "Li70/e;", "e", "Ljava/lang/String;", "Li12/d$a;", "f", "Li12/d$a;", "initialState", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Li12/b;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<i12.d, Object> implements e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j12.a inboxFaqMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w openUrlIntentUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String faq;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final i12.d.a initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final t<i12.d, Object> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<i12.b> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<e.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f88333a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f88334b;

        /* JADX INFO: renamed from: i12.o$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2081a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f88335a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f88336b;

            /* JADX INFO: renamed from: i12.o$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2082a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f88337d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f88338e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f88339f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f88341h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f88342j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f88343k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f88344l;

                public C2082a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f88337d = obj;
                    this.f88338e |= PKIFailureInfo.systemUnavail;
                    return C2081a.this.F(null, this);
                }
            }

            public C2081a(mu.h hVar, o oVar) {
                this.f88335a = hVar;
                this.f88336b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2082a c2082a;
                if (eVar instanceof C2082a) {
                    c2082a = (C2082a) eVar;
                    int i15 = c2082a.f88338e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2082a.f88338e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2082a = new C2082a(eVar);
                    }
                } else {
                    c2082a = new C2082a(eVar);
                }
                Object obj2 = c2082a.f88337d;
                Object objE = uq.b.e();
                int i16 = c2082a.f88338e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f88335a;
                    e.a aVarP9 = this.f88336b.p9((i12.d) obj);
                    c2082a.f88339f = vq.j.a(obj);
                    c2082a.f88341h = vq.j.a(c2082a);
                    c2082a.f88342j = vq.j.a(obj);
                    c2082a.f88343k = vq.j.a(hVar);
                    c2082a.f88344l = 0;
                    c2082a.f88338e = 1;
                    if (hVar.F(aVarP9, c2082a) == objE) {
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

        public a(mu.g gVar, o oVar) {
            this.f88333a = gVar;
            this.f88334b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.a> hVar, tq.e eVar) {
            Object objA = this.f88333a.a(new C2081a(hVar, this.f88334b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Li12/a;", "<unused var>", "Li12/d;", "Loq/i0;", "<anonymous>", "(Li12/a;Li12/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<i12.a, i12.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f88345e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f88345e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<i12.b> bVarY1 = o.this.Y1();
                i12.b.a aVar = i12.b.a.f88307a;
                this.f88345e = 1;
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
        public final Object w(i12.a aVar, i12.d dVar, tq.e<? super i0> eVar) {
            return o.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Li12/d$a;", "state", "Lk10/l;", "Li12/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<c0<i12.d.a>, tq.e<? super k10.l<? extends i12.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f88347e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f88348f;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i12.d.Initialized O(o oVar, i12.d.a aVar) {
            return new i12.d.Initialized(oVar.faq);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f88348f;
            uq.b.e();
            if (this.f88347e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            final o oVar = o.this;
            return c0Var.d(new er.l() { // from class: i12.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.c.O(oVar, (d.a) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<i12.d.a> c0Var, tq.e<? super k10.l<? extends i12.d>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = o.this.new c(eVar);
            cVar.f88348f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Li12/c;", "action", "Li12/d$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Li12/c;Li12/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<OpenUrl, i12.d.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f88350e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f88351f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenUrl openUrl = (OpenUrl) this.f88351f;
            Object objE = uq.b.e();
            int i15 = this.f88350e;
            if (i15 == 0) {
                u.b(obj);
                w wVar = o.this.openUrlIntentUseCase;
                w.Params params = new w.Params(openUrl.getUrl(), false, 2, null);
                this.f88351f = vq.j.a(openUrl);
                this.f88350e = 1;
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
            o oVar = o.this;
            if (iVar instanceof dx.i.Left) {
                oVar.globalSnackBarManager.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenUrl openUrl, i12.d.Initialized initialized, tq.e<? super i0> eVar) {
            d dVar = o.this.new d(eVar);
            dVar.f88351f = openUrl;
            return dVar.J(i0.f148189a);
        }
    }

    public o(yy.a aVar, j12.a aVar2, w wVar, i70.e eVar, String str) {
        this.inboxFaqMapper = aVar2;
        this.openUrlIntentUseCase = wVar;
        this.globalSnackBarManager = eVar;
        this.faq = str;
        i12.d.a aVar3 = i12.d.a.f88309a;
        this.initialState = aVar3;
        this.stateMachine = aVar.a(aVar3, new er.l() { // from class: i12.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.s9(this.f88324a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), e.a.C2080a.f88311a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.a p9(i12.d state) {
        return this.inboxFaqMapper.b(new j12.a.Params(state, new er.l() { // from class: i12.j
            @Override // er.l
            public final Object b(Object obj) {
                return o.q9(this.f88320a, (String) obj);
            }
        }, b9(i12.a.f88306a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(o oVar, String str) {
        oVar.d9(new OpenUrl(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(final o oVar, v vVar) {
        vVar.c(q0.c(i12.d.class), new er.l() { // from class: i12.k
            @Override // er.l
            public final Object b(Object obj) {
                return o.t9(this.f88321a, (z) obj);
            }
        });
        vVar.c(q0.c(i12.d.a.class), new er.l() { // from class: i12.l
            @Override // er.l
            public final Object b(Object obj) {
                return o.u9(this.f88322a, (z) obj);
            }
        });
        vVar.c(q0.c(i12.d.Initialized.class), new er.l() { // from class: i12.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.v9(this.f88323a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(o oVar, z zVar) {
        b bVar = oVar.new b(null);
        zVar.x(q0.c(i12.a.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(o oVar, z zVar) {
        zVar.A(oVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(o oVar, z zVar) {
        d dVar = oVar.new d(null);
        zVar.x(q0.c(OpenUrl.class), k10.o.CANCEL_PREVIOUS, dVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<i12.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<i12.d, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<e.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(String str) {
        super.P5(str);
    }
}
