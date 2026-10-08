package j01;

import a14.q;
import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00032\u00020\u00042\u00020\u0005B)\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0014H\u0096\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R&\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030&8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R&\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f0,8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b1\u0010\u0018\u001a\u0004\b/\u00100¨\u00063"}, d2 = {"Lj01/l;", "Ll00/g;", "Lj01/e;", "", "Lj01/f;", "Li70/e;", "Lyy/a;", "stateMachineFactory", "La14/q;", "goToStoreIntentUseCase", "Lk01/a;", "appRatingMapper", "globalSnackBarManager", "<init>", "(Lyy/a;La14/q;Lk01/a;Li70/e;)V", "Lj01/f$a;", "k9", "()Lj01/f$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "La14/q;", "c", "Lk01/a;", "d", "Li70/e;", "Lxw/b;", "Lj01/d;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "state", "apprating_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<e, Object> implements zx.d, f, i70.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q goToStoreIntentUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k01.a appRatingMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<e, Object> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<j01.d> navAction = new xw.b<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<f.Data> state = a9(new a(e9().getState(), this), k9());

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f98460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f98461b;

        /* JADX INFO: renamed from: j01.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2308a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f98462a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f98463b;

            /* JADX INFO: renamed from: j01.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2309a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f98464d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f98465e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f98466f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f98468h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f98469j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f98470k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f98471l;

                public C2309a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f98464d = obj;
                    this.f98465e |= PKIFailureInfo.systemUnavail;
                    return C2308a.this.F(null, this);
                }
            }

            public C2308a(mu.h hVar, l lVar) {
                this.f98462a = hVar;
                this.f98463b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2309a c2309a;
                if (eVar instanceof C2309a) {
                    c2309a = (C2309a) eVar;
                    int i15 = c2309a.f98465e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2309a.f98465e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2309a = new C2309a(eVar);
                    }
                } else {
                    c2309a = new C2309a(eVar);
                }
                Object obj2 = c2309a.f98464d;
                Object objE = uq.b.e();
                int i16 = c2309a.f98465e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f98462a;
                    f.Data dataK9 = this.f98463b.k9();
                    c2309a.f98466f = vq.j.a(obj);
                    c2309a.f98468h = vq.j.a(c2309a);
                    c2309a.f98469j = vq.j.a(obj);
                    c2309a.f98470k = vq.j.a(hVar);
                    c2309a.f98471l = 0;
                    c2309a.f98465e = 1;
                    if (hVar.F(dataK9, c2309a) == objE) {
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
            this.f98460a = gVar;
            this.f98461b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.Data> hVar, tq.e eVar) {
            Object objA = this.f98460a.a(new C2308a(hVar, this.f98461b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lj01/a;", "<unused var>", "Lj01/e;", "Loq/i0;", "<anonymous>", "(Lj01/a;Lj01/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<j01.a, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98472e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f98472e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<j01.d> bVarY1 = l.this.Y1();
                j01.d.a aVar = j01.d.a.f98444a;
                this.f98472e = 1;
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
        public final Object w(j01.a aVar, e eVar, tq.e<? super i0> eVar2) {
            return l.this.new b(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lj01/b;", "<unused var>", "Lj01/e;", "Loq/i0;", "<anonymous>", "(Lj01/b;Lj01/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<j01.b, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98474e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f98474e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<j01.d> bVarY1 = l.this.Y1();
                j01.d.b bVar = j01.d.b.f98445a;
                this.f98474e = 1;
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
        public final Object w(j01.b bVar, e eVar, tq.e<? super i0> eVar2) {
            return l.this.new c(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lj01/c;", "<unused var>", "Lj01/e;", "Loq/i0;", "<anonymous>", "(Lj01/c;Lj01/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<j01.c, e, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98476e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f98476e;
            if (i15 == 0) {
                u.b(obj);
                q qVar = l.this.goToStoreIntentUseCase;
                q.Params params = new q.Params(null);
                this.f98476e = 1;
                obj = qVar.c(params, this);
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
        public final Object w(j01.c cVar, e eVar, tq.e<? super i0> eVar2) {
            return l.this.new d(eVar2).J(i0.f148189a);
        }
    }

    public l(yy.a aVar, q qVar, k01.a aVar2, i70.e eVar) {
        this.goToStoreIntentUseCase = qVar;
        this.appRatingMapper = aVar2;
        this.globalSnackBarManager = eVar;
        this.stateMachine = aVar.a(e.f98446a, new er.l() { // from class: j01.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.m9(this.f98452a, (v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.Data k9() {
        return this.appRatingMapper.b(new k01.a.Params(b9(j01.a.f98441a), b9(j01.c.f98443a), b9(j01.b.f98442a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final l lVar, v vVar) {
        vVar.c(q0.c(e.class), new er.l() { // from class: j01.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.n9(this.f98453a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(l lVar, z zVar) {
        b bVar = lVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(j01.a.class), oVar, bVar);
        zVar.x(q0.c(j01.b.class), oVar, lVar.new c(null));
        zVar.x(q0.c(j01.c.class), oVar, lVar.new d(null));
        return i0.f148189a;
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // zx.b
    public xw.b<j01.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<e, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<f.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }
}
