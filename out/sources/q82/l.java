package q82;

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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B!\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R,\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00158\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R \u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R&\u0010+\u001a\b\u0012\u0004\u0012\u00020%0$8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b&\u0010'\u0012\u0004\b*\u0010\u001b\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lq82/l;", "Ll00/g;", "Lq82/b;", "Lq82/a;", "Lq82/c;", "", "Lyy/a;", "stateMachineFactory", "Lr82/e;", "giosIntroMapper", "Lr82/b;", "giosIntroDialogMapper", "<init>", "(Lyy/a;Lr82/e;Lr82/b;)V", "b", "Lr82/e;", "c", "Lr82/b;", "d", "Lq82/b;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "()V", "stateMachine", "Lxw/b;", "Lq82/a$b;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "Lq82/c$a;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "state", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<q82.b, q82.a> implements q82.c, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r82.e giosIntroMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final r82.b giosIntroDialogMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q82.b initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<q82.b, q82.a> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<q82.a.b> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<q82.c.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<q82.c.a.Initialized> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f165326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f165327b;

        /* JADX INFO: renamed from: q82.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4121a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f165328a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f165329b;

            /* JADX INFO: renamed from: q82.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4122a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f165330d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f165331e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f165332f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f165334h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f165335j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f165336k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f165337l;

                public C4122a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f165330d = obj;
                    this.f165331e |= PKIFailureInfo.systemUnavail;
                    return C4121a.this.F(null, this);
                }
            }

            public C4121a(mu.h hVar, l lVar) {
                this.f165328a = hVar;
                this.f165329b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4122a c4122a;
                if (eVar instanceof C4122a) {
                    c4122a = (C4122a) eVar;
                    int i15 = c4122a.f165331e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4122a.f165331e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4122a = new C4122a(eVar);
                    }
                } else {
                    c4122a = new C4122a(eVar);
                }
                Object obj2 = c4122a.f165330d;
                Object objE = uq.b.e();
                int i16 = c4122a.f165331e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f165328a;
                    q82.c.a.Initialized initializedB = this.f165329b.giosIntroMapper.b(new r82.e.Params((q82.b) obj, this.f165329b.new b(), this.f165329b.b9(q82.a.C4117a.f165298a)));
                    c4122a.f165332f = vq.j.a(obj);
                    c4122a.f165334h = vq.j.a(c4122a);
                    c4122a.f165335j = vq.j.a(obj);
                    c4122a.f165336k = vq.j.a(hVar);
                    c4122a.f165337l = 0;
                    c4122a.f165331e = 1;
                    if (hVar.F(initializedB, c4122a) == objE) {
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
            this.f165326a = gVar;
            this.f165327b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super q82.c.a.Initialized> hVar, tq.e eVar) {
            Object objA = this.f165326a.a(new C4121a(hVar, this.f165327b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements er.l<fp0.k, i0> {

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f165339e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ l f165340f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ fp0.k f165341g;

            /* JADX INFO: renamed from: q82.l$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            static final class C4123a implements er.a<i0> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ l f165342a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ fp0.k f165343b;

                C4123a(l lVar, fp0.k kVar) {
                    this.f165342a = lVar;
                    this.f165343b = kVar;
                }

                @Override // er.a
                public /* bridge */ /* synthetic */ i0 a() {
                    c();
                    return i0.f148189a;
                }

                public final void c() {
                    this.f165342a.d9(new q82.a.ViolationTypeClick(new b92.e.SetupData(this.f165343b)));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l lVar, fp0.k kVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f165340f = lVar;
                this.f165341g = kVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f165339e;
                if (i15 == 0) {
                    u.b(obj);
                    xw.b<q82.a.b> bVarY1 = this.f165340f.Y1();
                    q82.a.b.ShowReportConfirmationDialog showReportConfirmationDialog = new q82.a.b.ShowReportConfirmationDialog(this.f165340f.giosIntroDialogMapper.b(new r82.b.Params(new C4123a(this.f165340f, this.f165341g))));
                    this.f165339e = 1;
                    if (bVarY1.F(showReportConfirmationDialog, this) == objE) {
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

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f165340f, this.f165341g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        b() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(fp0.k kVar) {
            c(kVar);
            return i0.f148189a;
        }

        public final void c(fp0.k kVar) {
            l lVar = l.this;
            i00.a.a(lVar, new a(lVar, kVar, null));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lq82/a$a;", "<unused var>", "Lq82/b;", "Loq/i0;", "<anonymous>", "(Lq82/a$a;Lq82/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<q82.a.C4117a, q82.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f165344e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f165344e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<q82.a.b> bVarY1 = l.this.Y1();
                q82.a.b.C4118a c4118a = q82.a.b.C4118a.f165299a;
                this.f165344e = 1;
                if (bVarY1.F(c4118a, this) == objE) {
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
        public final Object w(q82.a.C4117a c4117a, q82.b bVar, tq.e<? super i0> eVar) {
            return l.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lq82/a$c;", "action", "Lq82/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lq82/a$c;Lq82/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<q82.a.ViolationTypeClick, q82.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f165346e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f165347f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            q82.a.ViolationTypeClick violationTypeClick = (q82.a.ViolationTypeClick) this.f165347f;
            Object objE = uq.b.e();
            int i15 = this.f165346e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<q82.a.b> bVarY1 = l.this.Y1();
                q82.a.b.GoToWizard goToWizard = new q82.a.b.GoToWizard(violationTypeClick.getIntroData());
                this.f165347f = vq.j.a(violationTypeClick);
                this.f165346e = 1;
                if (bVarY1.F(goToWizard, this) == objE) {
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
        public final Object w(q82.a.ViolationTypeClick violationTypeClick, q82.b bVar, tq.e<? super i0> eVar) {
            d dVar = l.this.new d(eVar);
            dVar.f165347f = violationTypeClick;
            return dVar.J(i0.f148189a);
        }
    }

    public l(yy.a aVar, r82.e eVar, r82.b bVar) {
        this.giosIntroMapper = eVar;
        this.giosIntroDialogMapper = bVar;
        q82.b bVar2 = q82.b.f165303a;
        this.initialState = bVar2;
        this.stateMachine = aVar.a(bVar2, new er.l() { // from class: q82.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.n9(this.f165318a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), q82.c.a.C4120a.f165304a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(final l lVar, v vVar) {
        vVar.c(q0.c(q82.b.class), new er.l() { // from class: q82.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.o9(this.f165319a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(l lVar, z zVar) {
        c cVar = lVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(q82.a.C4117a.class), oVar, cVar);
        zVar.x(q0.c(q82.a.ViolationTypeClick.class), oVar, lVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<q82.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<q82.b, q82.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<q82.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
