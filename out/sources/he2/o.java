package he2;

import fr.q0;
import k10.c0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import zp0.BEReportIncidentTypesIncidentTypeConfig;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B3\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010(\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R&\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030)8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130/8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103¨\u00064"}, d2 = {"Lhe2/o;", "Ll00/g;", "Lhe2/c;", "Lhe2/a;", "Lhe2/d;", "", "Lyy/a;", "stateMachineFactory", "Lie2/b;", "mapper", "Lqe2/a;", "closeProcessDialogMapper", "Lcb4/j;", "dialogVMSFactory", "Lhe2/e;", "setupContract", "<init>", "(Lyy/a;Lie2/b;Lqe2/a;Lcb4/j;Lhe2/e;)V", "state", "Lhe2/d$a;", "r9", "(Lhe2/c;)Lhe2/d$a;", "b", "Lie2/b;", "c", "Lqe2/a;", "d", "Lcb4/j;", "e", "Lhe2/e;", "Lxw/b;", "Lhe2/a$b;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lhe2/c$b;", "g", "Lhe2/c$b;", "initialState", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<he2.c, he2.a> implements he2.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ie2.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final qe2.a closeProcessDialogMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final he2.e setupContract;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<he2.a.b> navAction = new xw.b<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final he2.c.Screen initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k10.t<he2.c, he2.a> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<he2.d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<he2.d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f84013a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f84014b;

        /* JADX INFO: renamed from: he2.o$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1936a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f84015a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f84016b;

            /* JADX INFO: renamed from: he2.o$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1937a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f84017d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f84018e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f84019f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f84021h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f84022j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f84023k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f84024l;

                public C1937a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f84017d = obj;
                    this.f84018e |= PKIFailureInfo.systemUnavail;
                    return C1936a.this.F(null, this);
                }
            }

            public C1936a(mu.h hVar, o oVar) {
                this.f84015a = hVar;
                this.f84016b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1937a c1937a;
                if (eVar instanceof C1937a) {
                    c1937a = (C1937a) eVar;
                    int i15 = c1937a.f84018e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1937a.f84018e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1937a = new C1937a(eVar);
                    }
                } else {
                    c1937a = new C1937a(eVar);
                }
                Object obj2 = c1937a.f84017d;
                Object objE = uq.b.e();
                int i16 = c1937a.f84018e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f84015a;
                    he2.d.Data dataR9 = this.f84016b.r9((he2.c) obj);
                    c1937a.f84019f = vq.j.a(obj);
                    c1937a.f84021h = vq.j.a(c1937a);
                    c1937a.f84022j = vq.j.a(obj);
                    c1937a.f84023k = vq.j.a(hVar);
                    c1937a.f84024l = 0;
                    c1937a.f84018e = 1;
                    if (hVar.F(dataR9, c1937a) == objE) {
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
            this.f84013a = gVar;
            this.f84014b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super he2.d.Data> hVar, tq.e eVar) {
            Object objA = this.f84013a.a(new C1936a(hVar, this.f84014b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lhe2/a$c;", "<unused var>", "Lhe2/c;", "Loq/i0;", "<anonymous>", "(Lhe2/a$c;Lhe2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<he2.a.c, he2.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84025e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f84025e;
            if (i15 == 0) {
                u.b(obj);
                o oVar = o.this;
                he2.a.b.C1934a c1934a = he2.a.b.C1934a.f83979a;
                this.f84025e = 1;
                if (oVar.F(c1934a, this) == objE) {
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
        public final Object w(he2.a.c cVar, he2.c cVar2, tq.e<? super i0> eVar) {
            return o.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lhe2/a$f;", "<unused var>", "Lk10/c0;", "Lhe2/c$b;", "state", "Lk10/l;", "Lhe2/c;", "<anonymous>", "(Lhe2/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<he2.a.f, c0<he2.c.Screen>, tq.e<? super k10.l<? extends he2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84027e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f84028f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final he2.c.Dialog O(c0 c0Var, o oVar, he2.c.Screen screen) {
            return new he2.c.Dialog(((he2.c.Screen) c0Var.a()).getInitializedStateData(), oVar.dialogVMSFactory.a(oVar.closeProcessDialogMapper.b(new qe2.a.Params(oVar.b9(he2.a.e.f83984a), oVar.b9(he2.a.C1933a.f83978a)))));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c0 c0Var = (c0) this.f84028f;
            uq.b.e();
            if (this.f84027e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            final o oVar = o.this;
            return c0Var.d(new er.l() { // from class: he2.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.c.O(c0Var, oVar, (c.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(he2.a.f fVar, c0<he2.c.Screen> c0Var, tq.e<? super k10.l<? extends he2.c>> eVar) {
            c cVar = o.this.new c(eVar);
            cVar.f84028f = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhe2/a$d;", "action", "Lhe2/c$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lhe2/a$d;Lhe2/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<he2.a.OnCategoryClick, he2.c.Screen, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84030e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f84031f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            he2.a.OnCategoryClick onCategoryClick = (he2.a.OnCategoryClick) this.f84031f;
            Object objE = uq.b.e();
            int i15 = this.f84030e;
            if (i15 == 0) {
                u.b(obj);
                o.this.setupContract.v4(onCategoryClick.getCategory());
                o oVar = o.this;
                he2.a.b.c cVar = he2.a.b.c.f83981a;
                this.f84031f = vq.j.a(onCategoryClick);
                this.f84030e = 1;
                if (oVar.F(cVar, this) == objE) {
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
        public final Object w(he2.a.OnCategoryClick onCategoryClick, he2.c.Screen screen, tq.e<? super i0> eVar) {
            d dVar = o.this.new d(eVar);
            dVar.f84031f = onCategoryClick;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lhe2/a$e;", "<unused var>", "Lhe2/c$a;", "Loq/i0;", "<anonymous>", "(Lhe2/a$e;Lhe2/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<he2.a.e, he2.c.Dialog, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84033e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f84033e;
            if (i15 == 0) {
                u.b(obj);
                o oVar = o.this;
                he2.a.b.C1935b c1935b = he2.a.b.C1935b.f83980a;
                this.f84033e = 1;
                if (oVar.F(c1935b, this) == objE) {
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
        public final Object w(he2.a.e eVar, he2.c.Dialog dialog, tq.e<? super i0> eVar2) {
            return o.this.new e(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lhe2/a$a;", "<unused var>", "Lk10/c0;", "Lhe2/c$a;", "state", "Lk10/l;", "Lhe2/c;", "<anonymous>", "(Lhe2/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<he2.a.C1933a, c0<he2.c.Dialog>, tq.e<? super k10.l<? extends he2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84035e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f84036f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final he2.c.Screen O(c0 c0Var, he2.c.Dialog dialog) {
            return new he2.c.Screen(((he2.c.Dialog) c0Var.a()).getInitializedStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c0 c0Var = (c0) this.f84036f;
            uq.b.e();
            if (this.f84035e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.d(new er.l() { // from class: he2.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return o.f.O(c0Var, (c.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(he2.a.C1933a c1933a, c0<he2.c.Dialog> c0Var, tq.e<? super k10.l<? extends he2.c>> eVar) {
            f fVar = new f(eVar);
            fVar.f84036f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    public o(yy.a aVar, ie2.b bVar, qe2.a aVar2, cb4.j jVar, he2.e eVar) {
        this.mapper = bVar;
        this.closeProcessDialogMapper = aVar2;
        this.dialogVMSFactory = jVar;
        this.setupContract = eVar;
        he2.c.Screen screen = new he2.c.Screen(new InitializedStateData(eVar.V6()));
        this.initialState = screen;
        this.stateMachine = aVar.a(screen, new er.l() { // from class: he2.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.u9(this.f84004a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), r9(screen));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final he2.d.Data r9(he2.c state) {
        return this.mapper.b(new ie2.b.Params(state, b9(he2.a.c.f83982a), b9(he2.a.f.f83985a), new er.l() { // from class: he2.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.s9(this.f84003a, (BEReportIncidentTypesIncidentTypeConfig) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(o oVar, BEReportIncidentTypesIncidentTypeConfig bEReportIncidentTypesIncidentTypeConfig) {
        oVar.d9(new he2.a.OnCategoryClick(bEReportIncidentTypesIncidentTypeConfig));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(final o oVar, v vVar) {
        vVar.c(q0.c(he2.c.class), new er.l() { // from class: he2.j
            @Override // er.l
            public final Object b(Object obj) {
                return o.v9(this.f84000a, (z) obj);
            }
        });
        vVar.c(q0.c(he2.c.Screen.class), new er.l() { // from class: he2.k
            @Override // er.l
            public final Object b(Object obj) {
                return o.w9(this.f84001a, (z) obj);
            }
        });
        vVar.c(q0.c(he2.c.Dialog.class), new er.l() { // from class: he2.l
            @Override // er.l
            public final Object b(Object obj) {
                return o.x9(this.f84002a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(o oVar, z zVar) {
        b bVar = oVar.new b(null);
        zVar.x(q0.c(he2.a.c.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(o oVar, z zVar) {
        c cVar = oVar.new c(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(he2.a.f.class), oVar2, cVar);
        zVar.x(q0.c(he2.a.OnCategoryClick.class), oVar2, oVar.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x9(o oVar, z zVar) {
        e eVar = oVar.new e(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(he2.a.e.class), oVar2, eVar);
        zVar.v(q0.c(he2.a.C1933a.class), oVar2, new f(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<he2.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<he2.c, he2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<he2.d.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: q9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(he2.a.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: t9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(he2.e eVar) {
        super.P5(eVar);
    }
}
