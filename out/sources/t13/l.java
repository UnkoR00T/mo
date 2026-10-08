package t13;

import a14.w;
import er.q;
import fr.q0;
import i70.p;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00032\u00020\u0005B)\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0015H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010)\u001a\b\u0012\u0004\u0012\u00020$0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R&\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030*8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u0010008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u00109\u001a\b\u0012\u0004\u0012\u000206058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lt13/l;", "Ll00/g;", "Lt13/c;", "", "Lt13/d;", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Lu13/a;", "mapper", "La14/w;", "openUrlIntentUseCase", "snackBarManagerStateHolder", "<init>", "(Lyy/a;Lu13/a;La14/w;Li70/n;)V", "state", "Lt13/d$a;", "l9", "(Lt13/c;)Lt13/d$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lu13/a;", "c", "La14/w;", "d", "Li70/n;", "e", "Lt13/c;", "initialState", "Lxw/b;", "Lt13/a;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "j", "()Lmu/g;", "snackBarVisibilityState", "safetyguide_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<t13.c, Object> implements d, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u13.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w openUrlIntentUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t13.c initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<t13.a> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final t<t13.c, Object> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f187040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f187041b;

        /* JADX INFO: renamed from: t13.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4859a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f187042a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f187043b;

            /* JADX INFO: renamed from: t13.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4860a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f187044d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f187045e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f187046f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f187048h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f187049j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f187050k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f187051l;

                public C4860a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f187044d = obj;
                    this.f187045e |= PKIFailureInfo.systemUnavail;
                    return C4859a.this.F(null, this);
                }
            }

            public C4859a(mu.h hVar, l lVar) {
                this.f187042a = hVar;
                this.f187043b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4860a c4860a;
                if (eVar instanceof C4860a) {
                    c4860a = (C4860a) eVar;
                    int i15 = c4860a.f187045e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4860a.f187045e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4860a = new C4860a(eVar);
                    }
                } else {
                    c4860a = new C4860a(eVar);
                }
                Object obj2 = c4860a.f187044d;
                Object objE = uq.b.e();
                int i16 = c4860a.f187045e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f187042a;
                    d.Data dataL9 = this.f187043b.l9((t13.c) obj);
                    c4860a.f187046f = vq.j.a(obj);
                    c4860a.f187048h = vq.j.a(c4860a);
                    c4860a.f187049j = vq.j.a(obj);
                    c4860a.f187050k = vq.j.a(hVar);
                    c4860a.f187051l = 0;
                    c4860a.f187045e = 1;
                    if (hVar.F(dataL9, c4860a) == objE) {
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
            this.f187040a = gVar;
            this.f187041b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super d.Data> hVar, tq.e eVar) {
            Object objA = this.f187040a.a(new C4859a(hVar, this.f187041b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lt13/a;", "action", "Lt13/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lt13/a;Lt13/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<t13.a, t13.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f187052e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f187053f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            t13.a aVar = (t13.a) this.f187053f;
            Object objE = uq.b.e();
            int i15 = this.f187052e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<t13.a> bVarY1 = l.this.Y1();
                this.f187053f = vq.j.a(aVar);
                this.f187052e = 1;
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
        public final Object w(t13.a aVar, t13.c cVar, tq.e<? super i0> eVar) {
            b bVar = l.this.new b(eVar);
            bVar.f187053f = aVar;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lt13/b;", "action", "Lt13/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lt13/b;Lt13/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<OpenUrl, t13.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f187055e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f187056f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenUrl openUrl = (OpenUrl) this.f187056f;
            Object objE = uq.b.e();
            int i15 = this.f187055e;
            if (i15 == 0) {
                u.b(obj);
                w wVar = l.this.openUrlIntentUseCase;
                w.Params params = new w.Params(openUrl.getUrl(), false, 2, null);
                this.f187056f = vq.j.a(openUrl);
                this.f187055e = 1;
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
            l lVar = l.this;
            if (iVar instanceof dx.i.Left) {
                lVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(OpenUrl openUrl, t13.c cVar, tq.e<? super i0> eVar) {
            c cVar2 = l.this.new c(eVar);
            cVar2.f187056f = openUrl;
            return cVar2.J(i0.f148189a);
        }
    }

    public l(yy.a aVar, u13.a aVar2, w wVar, i70.n nVar) {
        this.mapper = aVar2;
        this.openUrlIntentUseCase = wVar;
        this.snackBarManagerStateHolder = nVar;
        t13.c cVar = t13.c.f187020a;
        this.initialState = cVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(cVar, new er.l() { // from class: t13.i
            @Override // er.l
            public final Object b(Object obj) {
                return l.o9(this.f187030a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), l9(cVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d.Data l9(t13.c state) {
        return this.mapper.b(new u13.a.Params(state, b9(t13.a.C4858a.f187013a), b9(t13.a.e.f187017a), b9(t13.a.c.f187015a), b9(t13.a.b.f187014a), b9(t13.a.d.f187016a), b9(t13.a.f.f187018a), new er.l() { // from class: t13.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.m9(this.f187032a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(l lVar, String str) {
        lVar.d9(new OpenUrl(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(final l lVar, v vVar) {
        vVar.c(q0.c(t13.c.class), new er.l() { // from class: t13.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.p9(this.f187031a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(l lVar, z zVar) {
        b bVar = lVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(t13.a.class), oVar, bVar);
        zVar.x(q0.c(OpenUrl.class), oVar, lVar.new c(null));
        return i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    public xw.b<t13.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<t13.c, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<d.Data> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<p> j() {
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
