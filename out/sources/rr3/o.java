package rr3;

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

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00032\u00020\u0005B)\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0014H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R&\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\"8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010.\u001a\b\u0012\u0004\u0012\u00020)0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u00104\u001a\b\u0012\u0004\u0012\u00020\u000f0/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u001a\u00109\u001a\b\u0012\u0004\u0012\u000206058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006:"}, d2 = {"Lrr3/o;", "Ll00/g;", "Lrr3/d;", "", "Lrr3/e;", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Lsr3/a;", "mapper", "La14/w;", "openUrlIntentUseCase", "snackBarManagerStateHolder", "<init>", "(Lyy/a;Lsr3/a;La14/w;Li70/n;)V", "Lrr3/e$a;", "l9", "()Lrr3/e$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lsr3/a;", "c", "La14/w;", "d", "Li70/n;", "e", "Lrr3/d;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lrr3/b;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "Lmu/g;", "Li70/p;", "j", "()Lmu/g;", "snackBarVisibilityState", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<d, Object> implements e, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final sr3.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w openUrlIntentUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final d initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<d, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<rr3.b> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<e.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f175592a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f175593b;

        /* JADX INFO: renamed from: rr3.o$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4482a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f175594a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f175595b;

            /* JADX INFO: renamed from: rr3.o$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4483a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f175596d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f175597e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f175598f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f175600h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f175601j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f175602k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f175603l;

                public C4483a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f175596d = obj;
                    this.f175597e |= PKIFailureInfo.systemUnavail;
                    return C4482a.this.F(null, this);
                }
            }

            public C4482a(mu.h hVar, o oVar) {
                this.f175594a = hVar;
                this.f175595b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4483a c4483a;
                if (eVar instanceof C4483a) {
                    c4483a = (C4483a) eVar;
                    int i15 = c4483a.f175597e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4483a.f175597e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4483a = new C4483a(eVar);
                    }
                } else {
                    c4483a = new C4483a(eVar);
                }
                Object obj2 = c4483a.f175596d;
                Object objE = uq.b.e();
                int i16 = c4483a.f175597e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f175594a;
                    e.Data dataL9 = this.f175595b.l9();
                    c4483a.f175598f = vq.j.a(obj);
                    c4483a.f175600h = vq.j.a(c4483a);
                    c4483a.f175601j = vq.j.a(obj);
                    c4483a.f175602k = vq.j.a(hVar);
                    c4483a.f175603l = 0;
                    c4483a.f175597e = 1;
                    if (hVar.F(dataL9, c4483a) == objE) {
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
            this.f175592a = gVar;
            this.f175593b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.Data> hVar, tq.e eVar) {
            Object objA = this.f175592a.a(new C4482a(hVar, this.f175593b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lrr3/a;", "<unused var>", "Lrr3/d;", "Loq/i0;", "<anonymous>", "(Lrr3/a;Lrr3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<rr3.a, d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f175604e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f175604e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<rr3.b> bVarY1 = o.this.Y1();
                rr3.b.a aVar = rr3.b.a.f175566a;
                this.f175604e = 1;
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
        public final Object w(rr3.a aVar, d dVar, tq.e<? super i0> eVar) {
            return o.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lrr3/c;", "action", "Lrr3/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lrr3/c;Lrr3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<OpenUrl, d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f175606e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f175607f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OpenUrl openUrl = (OpenUrl) this.f175607f;
            Object objE = uq.b.e();
            int i15 = this.f175606e;
            if (i15 == 0) {
                u.b(obj);
                w wVar = o.this.openUrlIntentUseCase;
                w.Params params = new w.Params(openUrl.getUrl(), false, 2, null);
                this.f175607f = vq.j.a(openUrl);
                this.f175606e = 1;
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
        public final Object w(OpenUrl openUrl, d dVar, tq.e<? super i0> eVar) {
            c cVar = o.this.new c(eVar);
            cVar.f175607f = openUrl;
            return cVar.J(i0.f148189a);
        }
    }

    public o(yy.a aVar, sr3.a aVar2, w wVar, i70.n nVar) {
        this.mapper = aVar2;
        this.openUrlIntentUseCase = wVar;
        this.snackBarManagerStateHolder = nVar;
        d dVar = d.f175568a;
        this.initialState = dVar;
        this.stateMachine = aVar.a(dVar, new er.l() { // from class: rr3.l
            @Override // er.l
            public final Object b(Object obj) {
                return o.o9(this.f175582a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), l9());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.Data l9() {
        return this.mapper.b(new sr3.a.Params(b9(rr3.a.f175565a), new er.l() { // from class: rr3.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.m9(this.f175584a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(o oVar, String str) {
        oVar.d9(new OpenUrl(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(final o oVar, v vVar) {
        vVar.c(q0.c(d.class), new er.l() { // from class: rr3.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.p9(this.f175583a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(o oVar, z zVar) {
        b bVar = oVar.new b(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(rr3.a.class), oVar2, bVar);
        zVar.x(q0.c(OpenUrl.class), oVar2, oVar.new c(null));
        return i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    public xw.b<rr3.b> Y1() {
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
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
