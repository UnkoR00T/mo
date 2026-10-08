package cs2;

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

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00032\u00020\u0005B)\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0015H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010)\u001a\b\u0012\u0004\u0012\u00020$0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R&\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030*8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u0010008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u00109\u001a\b\u0012\u0004\u0012\u000206058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lcs2/p;", "Ll00/g;", "Lcs2/d;", "", "Lcs2/e;", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Lds2/a;", "penaltyPointsInfoMapper", "La14/w;", "openUrlIntentUseCase", "snackBarManagerStateHolder", "<init>", "(Lyy/a;Lds2/a;La14/w;Li70/n;)V", "state", "Lcs2/e$a;", "o9", "(Lcs2/d;)Lcs2/e$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lds2/a;", "c", "La14/w;", "d", "Li70/n;", "e", "Lcs2/d;", "initialState", "Lxw/b;", "Lcs2/b;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "j", "()Lmu/g;", "snackBarVisibilityState", "penaltypoints_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<d, Object> implements e, zx.b, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ds2.a penaltyPointsInfoMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w openUrlIntentUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final d initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<cs2.b> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final t<d, Object> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<e.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f37562a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f37563b;

        /* JADX INFO: renamed from: cs2.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0790a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f37564a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f37565b;

            /* JADX INFO: renamed from: cs2.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0791a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f37566d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f37567e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f37568f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f37570h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f37571j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f37572k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f37573l;

                public C0791a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f37566d = obj;
                    this.f37567e |= PKIFailureInfo.systemUnavail;
                    return C0790a.this.F(null, this);
                }
            }

            public C0790a(mu.h hVar, p pVar) {
                this.f37564a = hVar;
                this.f37565b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0791a c0791a;
                if (eVar instanceof C0791a) {
                    c0791a = (C0791a) eVar;
                    int i15 = c0791a.f37567e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0791a.f37567e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0791a = new C0791a(eVar);
                    }
                } else {
                    c0791a = new C0791a(eVar);
                }
                Object obj2 = c0791a.f37566d;
                Object objE = uq.b.e();
                int i16 = c0791a.f37567e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f37564a;
                    e.Data dataO9 = this.f37565b.o9((d) obj);
                    c0791a.f37568f = vq.j.a(obj);
                    c0791a.f37570h = vq.j.a(c0791a);
                    c0791a.f37571j = vq.j.a(obj);
                    c0791a.f37572k = vq.j.a(hVar);
                    c0791a.f37573l = 0;
                    c0791a.f37567e = 1;
                    if (hVar.F(dataO9, c0791a) == objE) {
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
            this.f37562a = gVar;
            this.f37563b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.Data> hVar, tq.e eVar) {
            Object objA = this.f37562a.a(new C0790a(hVar, this.f37563b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcs2/a;", "<unused var>", "Lcs2/d;", "Loq/i0;", "<anonymous>", "(Lcs2/a;Lcs2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<cs2.a, d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f37574e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f37574e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<cs2.b> bVarY1 = p.this.Y1();
                cs2.b.a aVar = cs2.b.a.f37522a;
                this.f37574e = 1;
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
        public final Object w(cs2.a aVar, d dVar, tq.e<? super i0> eVar) {
            return p.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcs2/c;", "action", "Lcs2/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lcs2/c;Lcs2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<OpenUrl, d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f37576e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f37577f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenUrl openUrl = (OpenUrl) this.f37577f;
            Object objE = uq.b.e();
            int i15 = this.f37576e;
            if (i15 == 0) {
                u.b(obj);
                w wVar = p.this.openUrlIntentUseCase;
                w.Params params = new w.Params(openUrl.getUrl(), false, 2, null);
                this.f37577f = vq.j.a(openUrl);
                this.f37576e = 1;
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
        public final Object w(OpenUrl openUrl, d dVar, tq.e<? super i0> eVar) {
            c cVar = p.this.new c(eVar);
            cVar.f37577f = openUrl;
            return cVar.J(i0.f148189a);
        }
    }

    public p(yy.a aVar, ds2.a aVar2, w wVar, i70.n nVar) {
        this.penaltyPointsInfoMapper = aVar2;
        this.openUrlIntentUseCase = wVar;
        this.snackBarManagerStateHolder = nVar;
        d dVar = d.f37524a;
        this.initialState = dVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(dVar, new er.l() { // from class: cs2.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.m9(this.f37552a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), o9(dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final p pVar, v vVar) {
        vVar.c(q0.c(d.class), new er.l() { // from class: cs2.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.n9(this.f37554a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(p pVar, z zVar) {
        b bVar = pVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(cs2.a.class), oVar, bVar);
        zVar.x(q0.c(OpenUrl.class), oVar, pVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.Data o9(d state) {
        return this.penaltyPointsInfoMapper.b(new ds2.a.Params(state, b9(cs2.a.f37521a), new er.l() { // from class: cs2.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.p9(this.f37553a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(p pVar, String str) {
        pVar.d9(new OpenUrl(str));
        return i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    public xw.b<cs2.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<d, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<e.Data> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(e.Data data) {
        super.P5(data);
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
