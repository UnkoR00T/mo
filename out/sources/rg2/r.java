package rg2;

import a14.w;
import fr.q0;
import k10.v;
import k10.z;
import mu.p0;
import mx.Label;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00032\u00020\u0005B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0096\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0019H\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000e\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R \u00102\u001a\b\u0012\u0004\u0012\u00020-0,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R&\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003038\u0014X\u0094\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020:098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020@0?8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b4\u0010A¨\u0006C"}, d2 = {"Lrg2/r;", "Ll00/g;", "Lrg2/g;", "", "Lrg2/h;", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Lsg2/b;", "mapper", "Lrg2/f;", "setupContract", "La14/w;", "openUrlIntentUseCase", "snackBarManagerStateHolder", "La14/d;", "copyToClipboardUseCase", "<init>", "(Lyy/a;Lsg2/b;Lrg2/f;La14/w;Li70/n;La14/d;)V", "state", "Lrg2/h$a$a;", "o9", "(Lrg2/g;)Lrg2/h$a$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lsg2/b;", "c", "Lrg2/f;", "d", "La14/w;", "e", "Li70/n;", "f", "La14/d;", "Lrg2/g$a;", "g", "Lrg2/g$a;", "initialState", "Lxw/b;", "Lrg2/c;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "Lrg2/h$a;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends l00.g<g, Object> implements h, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final sg2.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupContract;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final w openUrlIntentUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a14.d copyToClipboardUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final g.Initialized initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<rg2.c> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<g, Object> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<h.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<h.a.Initialized> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f173789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f173790b;

        /* JADX INFO: renamed from: rg2.r$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4437a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f173791a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f173792b;

            /* JADX INFO: renamed from: rg2.r$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4438a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f173793d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f173794e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f173795f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f173797h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f173798j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f173799k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f173800l;

                public C4438a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f173793d = obj;
                    this.f173794e |= PKIFailureInfo.systemUnavail;
                    return C4437a.this.F(null, this);
                }
            }

            public C4437a(mu.h hVar, r rVar) {
                this.f173791a = hVar;
                this.f173792b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4438a c4438a;
                if (eVar instanceof C4438a) {
                    c4438a = (C4438a) eVar;
                    int i15 = c4438a.f173794e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4438a.f173794e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4438a = new C4438a(eVar);
                    }
                } else {
                    c4438a = new C4438a(eVar);
                }
                Object obj2 = c4438a.f173793d;
                Object objE = uq.b.e();
                int i16 = c4438a.f173794e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f173791a;
                    h.a.Initialized initializedO9 = this.f173792b.o9((g) obj);
                    c4438a.f173795f = vq.j.a(obj);
                    c4438a.f173797h = vq.j.a(c4438a);
                    c4438a.f173798j = vq.j.a(obj);
                    c4438a.f173799k = vq.j.a(hVar);
                    c4438a.f173800l = 0;
                    c4438a.f173794e = 1;
                    if (hVar.F(initializedO9, c4438a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public a(mu.g gVar, r rVar) {
            this.f173789a = gVar;
            this.f173790b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super h.a.Initialized> hVar, tq.e eVar) {
            Object objA = this.f173789a.a(new C4437a(hVar, this.f173790b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrg2/a;", "<unused var>", "Lrg2/g;", "Loq/i0;", "<anonymous>", "(Lrg2/a;Lrg2/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<rg2.a, g, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f173801e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f173801e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                rg2.c.a aVar = rg2.c.a.f173757a;
                this.f173801e = 1;
                if (rVar.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(rg2.a aVar, g gVar, tq.e<? super i0> eVar) {
            return r.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrg2/d;", "<unused var>", "Lrg2/g;", "Loq/i0;", "<anonymous>", "(Lrg2/d;Lrg2/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<rg2.d, g, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f173803e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f173803e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                rg2.c.b bVar = rg2.c.b.f173758a;
                this.f173803e = 1;
                if (rVar.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(rg2.d dVar, g gVar, tq.e<? super i0> eVar) {
            return r.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lrg2/e;", "action", "Lrg2/g;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lrg2/e;Lrg2/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<OpenUrl, g, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f173805e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f173806f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenUrl openUrl = (OpenUrl) this.f173806f;
            Object objE = uq.b.e();
            int i15 = this.f173805e;
            if (i15 == 0) {
                oq.u.b(obj);
                w wVar = r.this.openUrlIntentUseCase;
                w.Params params = new w.Params(openUrl.getUrl(), false, 2, null);
                this.f173806f = vq.j.a(openUrl);
                this.f173805e = 1;
                obj = wVar.c(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            r rVar = r.this;
            if (iVar instanceof dx.i.Left) {
                rVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenUrl openUrl, g gVar, tq.e<? super i0> eVar) {
            d dVar = r.this.new d(eVar);
            dVar.f173806f = openUrl;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lrg2/b;", "action", "Lrg2/g;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lrg2/b;Lrg2/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<CopyToClipboard, g, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f173808e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f173809f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            CopyToClipboard copyToClipboard = (CopyToClipboard) this.f173809f;
            Object objE = uq.b.e();
            int i15 = this.f173808e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.d dVar = r.this.copyToClipboardUseCase;
                a14.d.Params params = new a14.d.Params(copyToClipboard.getValue(), copyToClipboard.getSnackBarLabel());
                this.f173809f = vq.j.a(copyToClipboard);
                this.f173808e = 1;
                if (dVar.c(params, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(CopyToClipboard copyToClipboard, g gVar, tq.e<? super i0> eVar) {
            e eVar2 = r.this.new e(eVar);
            eVar2.f173809f = copyToClipboard;
            return eVar2.J(i0.f148189a);
        }
    }

    public r(yy.a aVar, sg2.b bVar, SetupData setupData, w wVar, i70.n nVar, a14.d dVar) {
        this.mapper = bVar;
        this.setupContract = setupData;
        this.openUrlIntentUseCase = wVar;
        this.snackBarManagerStateHolder = nVar;
        this.copyToClipboardUseCase = dVar;
        g.Initialized initialized = new g.Initialized(setupData.getMyRegistry());
        this.initialState = initialized;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(initialized, new er.l() { // from class: rg2.q
            @Override // er.l
            public final Object b(Object obj) {
                return r.s9(this.f173779a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), o9(initialized));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h.a.Initialized o9(g state) {
        return this.mapper.b(new sg2.b.Params(state, b9(rg2.a.f173754a), b9(rg2.d.f173759a), new er.l() { // from class: rg2.o
            @Override // er.l
            public final Object b(Object obj) {
                return r.p9(this.f173777a, (String) obj);
            }
        }, new er.p() { // from class: rg2.p
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return r.q9(this.f173778a, (String) obj, (Label) obj2);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(r rVar, String str) {
        rVar.d9(new OpenUrl(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(r rVar, String str, Label label) {
        rVar.d9(new CopyToClipboard(str, label));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(final r rVar, v vVar) {
        vVar.c(q0.c(g.class), new er.l() { // from class: rg2.n
            @Override // er.l
            public final Object b(Object obj) {
                return r.t9(this.f173776a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(r rVar, z zVar) {
        b bVar = rVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(rg2.a.class), oVar, bVar);
        zVar.x(q0.c(rg2.d.class), oVar, rVar.new c(null));
        zVar.x(q0.c(OpenUrl.class), oVar, rVar.new d(null));
        zVar.x(q0.c(CopyToClipboard.class), oVar, rVar.new e(null));
        return i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    public xw.b<rg2.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<g, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<h.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(rg2.c cVar, tq.e<? super i0> eVar) {
        return super.F(cVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
