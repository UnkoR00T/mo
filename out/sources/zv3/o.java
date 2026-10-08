package zv3;

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
import wv3.FaqScreenData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B3\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0018H\u0096\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R&\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030+8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R \u00107\u001a\b\u0012\u0004\u0012\u000202018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u0013088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010@\u001a\b\u0012\u0004\u0012\u00020>0=8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b9\u0010?¨\u0006A"}, d2 = {"Lzv3/o;", "Ll00/g;", "Lzv3/c;", "", "Lzv3/d;", "Lwv3/b;", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Lyv3/a;", "mapper", "La14/w;", "openUrlIntentUseCase", "snackBarManagerStateHolder", "Lwv3/d;", "data", "<init>", "(Lyy/a;Lyv3/a;La14/w;Li70/n;Lwv3/d;)V", "state", "Lzv3/d$a;", "m9", "(Lzv3/c;)Lzv3/d$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lyv3/a;", "c", "La14/w;", "d", "Li70/n;", "e", "Lwv3/d;", "getData", "()Lwv3/d;", "Lzv3/c$a;", "f", "Lzv3/c$a;", "initialState", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lwv3/b$a;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "faq_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<zv3.c, Object> implements d, wv3.b, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final yv3.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w openUrlIntentUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final FaqScreenData data;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final zv3.c.DataSet initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final t<zv3.c, Object> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<wv3.b.a> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<d.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f238077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f238078b;

        /* JADX INFO: renamed from: zv3.o$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C6427a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f238079a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f238080b;

            /* JADX INFO: renamed from: zv3.o$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6428a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f238081d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f238082e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f238083f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f238085h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f238086j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f238087k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f238088l;

                public C6428a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f238081d = obj;
                    this.f238082e |= PKIFailureInfo.systemUnavail;
                    return C6427a.this.F(null, this);
                }
            }

            public C6427a(mu.h hVar, o oVar) {
                this.f238079a = hVar;
                this.f238080b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6428a c6428a;
                if (eVar instanceof C6428a) {
                    c6428a = (C6428a) eVar;
                    int i15 = c6428a.f238082e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6428a.f238082e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6428a = new C6428a(eVar);
                    }
                } else {
                    c6428a = new C6428a(eVar);
                }
                Object obj2 = c6428a.f238081d;
                Object objE = uq.b.e();
                int i16 = c6428a.f238082e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f238079a;
                    d.a aVarM9 = this.f238080b.m9((zv3.c) obj);
                    c6428a.f238083f = vq.j.a(obj);
                    c6428a.f238085h = vq.j.a(c6428a);
                    c6428a.f238086j = vq.j.a(obj);
                    c6428a.f238087k = vq.j.a(hVar);
                    c6428a.f238088l = 0;
                    c6428a.f238082e = 1;
                    if (hVar.F(aVarM9, c6428a) == objE) {
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
            this.f238077a = gVar;
            this.f238078b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super d.a> hVar, tq.e eVar) {
            Object objA = this.f238077a.a(new C6427a(hVar, this.f238078b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzv3/a;", "<unused var>", "Lzv3/c;", "Loq/i0;", "<anonymous>", "(Lzv3/a;Lzv3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<zv3.a, zv3.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f238089e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f238089e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<wv3.b.a> bVarY1 = o.this.Y1();
                wv3.b.a.C5724a c5724a = wv3.b.a.C5724a.f215471a;
                this.f238089e = 1;
                if (bVarY1.F(c5724a, this) == objE) {
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
        public final Object w(zv3.a aVar, zv3.c cVar, tq.e<? super i0> eVar) {
            return o.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lzv3/b;", "action", "Lzv3/c$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lzv3/b;Lzv3/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<OpenUrl, zv3.c.DataSet, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f238091e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f238092f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenUrl openUrl = (OpenUrl) this.f238092f;
            Object objE = uq.b.e();
            int i15 = this.f238091e;
            if (i15 == 0) {
                u.b(obj);
                w wVar = o.this.openUrlIntentUseCase;
                w.Params params = new w.Params(openUrl.getUrl(), false, 2, null);
                this.f238092f = vq.j.a(openUrl);
                this.f238091e = 1;
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
                oVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenUrl openUrl, zv3.c.DataSet dataSet, tq.e<? super i0> eVar) {
            c cVar = o.this.new c(eVar);
            cVar.f238092f = openUrl;
            return cVar.J(i0.f148189a);
        }
    }

    public o(yy.a aVar, yv3.a aVar2, w wVar, i70.n nVar, FaqScreenData faqScreenData) {
        this.mapper = aVar2;
        this.openUrlIntentUseCase = wVar;
        this.snackBarManagerStateHolder = nVar;
        this.data = faqScreenData;
        zv3.c.DataSet dataSet = new zv3.c.DataSet(faqScreenData);
        this.initialState = dataSet;
        this.stateMachine = aVar.a(dataSet, new er.l() { // from class: zv3.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.p9(this.f238068a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), m9(dataSet));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d.a m9(zv3.c state) {
        return this.mapper.b(new yv3.a.Params(state, b9(zv3.a.f238043a), new er.l() { // from class: zv3.k
            @Override // er.l
            public final Object b(Object obj) {
                return o.n9(this.f238065a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(o oVar, String str) {
        oVar.d9(new OpenUrl(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final o oVar, v vVar) {
        vVar.c(q0.c(zv3.c.class), new er.l() { // from class: zv3.l
            @Override // er.l
            public final Object b(Object obj) {
                return o.q9(this.f238066a, (z) obj);
            }
        });
        vVar.c(q0.c(zv3.c.DataSet.class), new er.l() { // from class: zv3.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.r9(this.f238067a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(o oVar, z zVar) {
        b bVar = oVar.new b(null);
        zVar.x(q0.c(zv3.a.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(o oVar, z zVar) {
        c cVar = oVar.new c(null);
        zVar.x(q0.c(OpenUrl.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    public xw.b<wv3.b.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<zv3.c, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<d.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(FaqScreenData faqScreenData) {
        super.P5(faqScreenData);
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
