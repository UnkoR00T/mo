package sy3;

import al0.CommunityOffice;
import fr.q0;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import py3.OfficeSearchModel;
import py3.OfficeSelectionData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BS\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001c*\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R \u0010;\u001a\b\u0012\u0004\u0012\u000206058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R&\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030<8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0018\u0010K\u001a\u00020H*\u00020G8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bI\u0010J¨\u0006L"}, d2 = {"Lsy3/c0;", "Ll00/g;", "Lsy3/d;", "Lsy3/c;", "Lsy3/i;", "Lpy3/d;", "Lyy/a;", "stateMachineFactory", "Lty3/e;", "mapper", "Lml0/k;", "getCommunityOfficesUseCase", "Lib4/c;", "errorMapper", "Lyw/b;", "accessibilityTalkBackManager", "Lac4/a;", "callActionWithLoaderUC", "Lry3/a;", "getOfficeEdorAddressUC", "Lhb4/d;", "errorVMSFactory", "Lpy3/b;", "officeSelectionData", "<init>", "(Lyy/a;Lty3/e;Lml0/k;Lib4/c;Lyw/b;Lac4/a;Lry3/a;Lhb4/d;Lpy3/b;)V", "Lk10/c0;", "Lsy3/d$c;", "Lk10/l;", "H9", "(Lk10/c0;Ltq/e;)Ljava/lang/Object;", "state", "Lsy3/i$a;", "E9", "(Lsy3/d;)Lsy3/i$a;", "b", "Lty3/e;", "c", "Lml0/k;", "d", "Lib4/c;", "e", "Lyw/b;", "f", "Lac4/a;", "g", "Lry3/a;", "h", "Lhb4/d;", "Lsy3/f;", "j", "Lsy3/f;", "initialState", "Lxw/b;", "Lpy3/d$a;", "k", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "m", "Lmu/p0;", "getState", "()Lmu/p0;", "Ldx/b;", "Ljb4/b;", "D9", "(Ldx/b;)Ljb4/b;", "errorData", "officeselection_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c0 extends l00.g<sy3.d, sy3.c> implements sy3.i, py3.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ty3.e mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ml0.k getCommunityOfficesUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final yw.b accessibilityTalkBackManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ry3.a getOfficeEdorAddressUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Loading initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final xw.b<py3.d.a> navAction;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k10.t<sy3.d, sy3.c> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<sy3.i.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f185881d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f185882e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f185883f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f185884g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f185886j;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f185884g = obj;
            this.f185886j |= PKIFailureInfo.systemUnavail;
            return c0.this.H9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<sy3.i.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f185887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ c0 f185888b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f185889a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ c0 f185890b;

            /* JADX INFO: renamed from: sy3.c0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4803a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f185891d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f185892e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f185893f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f185895h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f185896j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f185897k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f185898l;

                public C4803a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f185891d = obj;
                    this.f185892e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, c0 c0Var) {
                this.f185889a = hVar;
                this.f185890b = c0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4803a c4803a;
                if (eVar instanceof C4803a) {
                    c4803a = (C4803a) eVar;
                    int i15 = c4803a.f185892e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4803a.f185892e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4803a = new C4803a(eVar);
                    }
                } else {
                    c4803a = new C4803a(eVar);
                }
                Object obj2 = c4803a.f185891d;
                Object objE = uq.b.e();
                int i16 = c4803a.f185892e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f185889a;
                    sy3.i.a aVarE9 = this.f185890b.E9((sy3.d) obj);
                    c4803a.f185893f = vq.j.a(obj);
                    c4803a.f185895h = vq.j.a(c4803a);
                    c4803a.f185896j = vq.j.a(obj);
                    c4803a.f185897k = vq.j.a(hVar);
                    c4803a.f185898l = 0;
                    c4803a.f185892e = 1;
                    if (hVar.F(aVarE9, c4803a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public b(mu.g gVar, c0 c0Var) {
            this.f185887a = gVar;
            this.f185888b = c0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super sy3.i.a> hVar, tq.e eVar) {
            Object objA = this.f185887a.a(new a(hVar, this.f185888b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsy3/c$a;", "<unused var>", "Lsy3/d;", "Loq/i0;", "<anonymous>", "(Lsy3/c$a;Lsy3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<sy3.c.a, sy3.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185899e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f185899e;
            if (i15 == 0) {
                oq.u.b(obj);
                c0 c0Var = c0.this;
                py3.d.a.C4046a c4046a = py3.d.a.C4046a.f163265a;
                this.f185899e = 1;
                if (c0Var.F(c4046a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(sy3.c.a aVar, sy3.d dVar, tq.e<? super oq.i0> eVar) {
            return c0.this.new c(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsy3/c$b;", "<unused var>", "Lsy3/d;", "Loq/i0;", "<anonymous>", "(Lsy3/c$b;Lsy3/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<sy3.c.b, sy3.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185901e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f185901e;
            if (i15 == 0) {
                oq.u.b(obj);
                c0 c0Var = c0.this;
                py3.d.a.b bVar = py3.d.a.b.f163266a;
                this.f185901e = 1;
                if (c0Var.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(sy3.c.b bVar, sy3.d dVar, tq.e<? super oq.i0> eVar) {
            return c0.this.new d(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lsy3/f;", "state", "Lk10/l;", "Lsy3/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<k10.c0<Loading>, tq.e<? super k10.l<? extends sy3.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185903e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185904f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lsy3/d;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends sy3.d>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f185906e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ c0 f185907f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<Loading> f185908g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c0 c0Var, k10.c0<Loading> c0Var2, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f185907f = c0Var;
                this.f185908g = c0Var2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error X(c0 c0Var, dx.b bVar, Loading loading) {
                return new Error(loading.getData(), c0Var.errorVMSFactory.a(c0Var.D9(bVar)));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final sy3.d.Initialized Y(List list, Loading loading) {
                sy3.d.InterfaceC4804d.SelectedOffice selectedOfficeA;
                OfficeSelectionData.Office initialOffice = loading.getData().getSetupData().getInitialOffice();
                return new sy3.d.Initialized(loading.getData(), list, (initialOffice == null || (selectedOfficeA = ty3.a.a(initialOffice)) == null || !list.contains(selectedOfficeA.getOffice())) ? null : selectedOfficeA, false, false, 24, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f185906e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ml0.k kVar = this.f185907f.getCommunityOfficesUseCase;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f185906e = 1;
                    obj = kVar.c(c1792a, this);
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
                k10.c0<Loading> c0Var = this.f185908g;
                final c0 c0Var2 = this.f185907f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: sy3.d0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return c0.e.a.X(c0Var2, bVar, (Loading) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final List list = (List) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: sy3.e0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return c0.e.a.Y(list, (Loading) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f185907f, this.f185908g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends sy3.d>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f185904f;
            Object objE = uq.b.e();
            int i15 = this.f185903e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = c0.this.callActionWithLoaderUC;
            a aVar2 = new a(c0.this, c0Var, null);
            this.f185904f = vq.j.a(c0Var);
            this.f185903e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<Loading> c0Var, tq.e<? super k10.l<? extends sy3.d>> eVar) {
            return ((e) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = c0.this.new e(eVar);
            eVar2.f185904f = obj;
            return eVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lsy3/a;", "<unused var>", "Lsy3/e;", "Loq/i0;", "<anonymous>", "(Lsy3/a;Lsy3/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<sy3.a, Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185909e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f185909e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            c0.this.d9(sy3.c.a.f185864a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(sy3.a aVar, Error error, tq.e<? super oq.i0> eVar) {
            return c0.this.new f(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsy3/b;", "<unused var>", "Lk10/c0;", "Lsy3/e;", "state", "Lk10/l;", "Lsy3/d;", "<anonymous>", "(Lsy3/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<sy3.b, k10.c0<Error>, tq.e<? super k10.l<? extends sy3.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185911e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185912f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Loading O(Error error) {
            return new Loading(error.getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f185912f;
            uq.b.e();
            if (this.f185911e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: sy3.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.g.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sy3.b bVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends sy3.d>> eVar) {
            g gVar = new g(eVar);
            gVar.f185912f = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsy3/c$d;", "action", "Lk10/c0;", "Lsy3/d$c;", "state", "Lk10/l;", "Lsy3/d;", "<anonymous>", "(Lsy3/c$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<sy3.c.OnOfficeSelected, k10.c0<sy3.d.Initialized>, tq.e<? super k10.l<? extends sy3.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185913e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185914f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f185915g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Loading O(sy3.c.OnOfficeSelected onOfficeSelected, sy3.d.Initialized initialized) {
            return new Loading(initialized.getData(), initialized.b(), initialized.getSelectedOffice(), initialized.getIsValid(), onOfficeSelected.getOffice());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final sy3.c.OnOfficeSelected onOfficeSelected = (sy3.c.OnOfficeSelected) this.f185914f;
            k10.c0 c0Var = (k10.c0) this.f185915g;
            uq.b.e();
            if (this.f185913e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            c0.this.accessibilityTalkBackManager.a(c70.a.f23835a.a().J().getText());
            CommunityOffice office = onOfficeSelected.getOffice();
            sy3.d.InterfaceC4804d.SelectedOffice selectedOffice = ((sy3.d.Initialized) c0Var.a()).getSelectedOffice();
            return fr.t.c(office, selectedOffice != null ? selectedOffice.getOffice() : null) ? c0Var.c() : c0Var.d(new er.l() { // from class: sy3.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.h.O(onOfficeSelected, (d.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sy3.c.OnOfficeSelected onOfficeSelected, k10.c0<sy3.d.Initialized> c0Var, tq.e<? super k10.l<? extends sy3.d>> eVar) {
            h hVar = c0.this.new h(eVar);
            hVar.f185914f = onOfficeSelected;
            hVar.f185915g = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsy3/c$f;", "action", "Lk10/c0;", "Lsy3/d$c;", "state", "Lk10/l;", "Lsy3/d;", "<anonymous>", "(Lsy3/c$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<sy3.c.OnSearch, k10.c0<sy3.d.Initialized>, tq.e<? super k10.l<? extends sy3.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185917e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185918f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f185919g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sy3.d.Initialized O(sy3.d.Initialized initialized) {
            return sy3.d.Initialized.d(initialized, sy3.d.Data.b(initialized.getData(), null, sy3.j.OfficeDropDown, 1, null), null, null, false, false, 30, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            sy3.c.OnSearch onSearch = (sy3.c.OnSearch) this.f185918f;
            k10.c0 c0Var = (k10.c0) this.f185919g;
            Object objE = uq.b.e();
            int i15 = this.f185917e;
            if (i15 == 0) {
                oq.u.b(obj);
                c0 c0Var2 = c0.this;
                py3.d.a.Search search = new py3.d.a.Search(onSearch.getModel());
                this.f185918f = vq.j.a(onSearch);
                this.f185919g = c0Var;
                this.f185917e = 1;
                if (c0Var2.F(search, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.b(new er.l() { // from class: sy3.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.i.O((d.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sy3.c.OnSearch onSearch, k10.c0<sy3.d.Initialized> c0Var, tq.e<? super k10.l<? extends sy3.d>> eVar) {
            i iVar = c0.this.new i(eVar);
            iVar.f185918f = onSearch;
            iVar.f185919g = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsy3/c$c;", "<unused var>", "Lk10/c0;", "Lsy3/d$c;", "state", "Lk10/l;", "Lsy3/d;", "<anonymous>", "(Lsy3/c$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<sy3.c.C4802c, k10.c0<sy3.d.Initialized>, tq.e<? super k10.l<? extends sy3.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185921e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185922f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f185922f;
            Object objE = uq.b.e();
            int i15 = this.f185921e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            c0 c0Var2 = c0.this;
            this.f185922f = vq.j.a(c0Var);
            this.f185921e = 1;
            Object objH9 = c0Var2.H9(c0Var, this);
            return objH9 == objE ? objE : objH9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(sy3.c.C4802c c4802c, k10.c0<sy3.d.Initialized> c0Var, tq.e<? super k10.l<? extends sy3.d>> eVar) {
            j jVar = c0.this.new j(eVar);
            jVar.f185922f = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsy3/c$e;", "<unused var>", "Lk10/c0;", "Lsy3/d$c;", "state", "Lk10/l;", "Lsy3/d;", "<anonymous>", "(Lsy3/c$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<sy3.c.e, k10.c0<sy3.d.Initialized>, tq.e<? super k10.l<? extends sy3.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185924e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185925f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sy3.d.Initialized O(sy3.d.Initialized initialized) {
            return sy3.d.Initialized.d(initialized, null, null, null, false, false, 15, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f185925f;
            uq.b.e();
            if (this.f185924e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: sy3.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.k.O((d.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sy3.c.e eVar, k10.c0<sy3.d.Initialized> c0Var, tq.e<? super k10.l<? extends sy3.d>> eVar2) {
            k kVar = new k(eVar2);
            kVar.f185925f = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lsy3/h;", "state", "Lk10/l;", "Lsy3/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.p<k10.c0<Loading>, tq.e<? super k10.l<? extends sy3.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185926e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185927f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lsy3/d;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends sy3.d>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f185929e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ c0 f185930f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<Loading> f185931g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c0 c0Var, k10.c0<Loading> c0Var2, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f185930f = c0Var;
                this.f185931g = c0Var2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error X(c0 c0Var, dx.b bVar, Loading loading) {
                return new Error(loading.getData(), c0Var.errorVMSFactory.a(c0Var.D9(bVar)), loading.b(), loading.getSelectedOffice(), loading.getOfficeToVerify(), loading.getIsValid());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final sy3.d.Initialized Y(String str, Loading loading) {
                return new sy3.d.Initialized(loading.getData(), loading.b(), new sy3.d.InterfaceC4804d.SelectedOffice(loading.getOfficeToVerify(), str), false, false, 24, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f185929e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ry3.a aVar = this.f185930f.getOfficeEdorAddressUC;
                    ry3.a.Params c4517a = new ry3.a.Params(this.f185931g.a().getOfficeToVerify());
                    this.f185929e = 1;
                    obj = aVar.e(c4517a, this);
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
                k10.c0<Loading> c0Var = this.f185931g;
                final c0 c0Var2 = this.f185930f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: sy3.j0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return c0.l.a.X(c0Var2, bVar, (Loading) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final String str = (String) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: sy3.k0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return c0.l.a.Y(str, (Loading) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f185930f, this.f185931g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends sy3.d>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        l(tq.e<? super l> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f185927f;
            Object objE = uq.b.e();
            int i15 = this.f185926e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = c0.this.callActionWithLoaderUC;
            a aVar2 = new a(c0.this, c0Var, null);
            this.f185927f = vq.j.a(c0Var);
            this.f185926e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<Loading> c0Var, tq.e<? super k10.l<? extends sy3.d>> eVar) {
            return ((l) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            l lVar = c0.this.new l(eVar);
            lVar.f185927f = obj;
            return lVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsy3/a;", "<unused var>", "Lk10/c0;", "Lsy3/g;", "state", "Lk10/l;", "Lsy3/d;", "<anonymous>", "(Lsy3/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<sy3.a, k10.c0<Error>, tq.e<? super k10.l<? extends sy3.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185932e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185933f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final sy3.d.Initialized O(Error error) {
            return new sy3.d.Initialized(error.getData(), error.b(), error.getSelectedOffice(), error.getIsValid(), false, 16, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f185933f;
            uq.b.e();
            if (this.f185932e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: sy3.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.m.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sy3.a aVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends sy3.d>> eVar) {
            m mVar = new m(eVar);
            mVar.f185933f = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lsy3/b;", "<unused var>", "Lk10/c0;", "Lsy3/g;", "state", "Lk10/l;", "Lsy3/d;", "<anonymous>", "(Lsy3/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<sy3.b, k10.c0<Error>, tq.e<? super k10.l<? extends sy3.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f185934e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f185935f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Loading O(Error error) {
            return new Loading(error.getData(), error.b(), error.getSelectedOffice(), error.getIsValid(), error.getOfficeToVerify());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f185935f;
            uq.b.e();
            if (this.f185934e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: sy3.m0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.n.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(sy3.b bVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends sy3.d>> eVar) {
            n nVar = new n(eVar);
            nVar.f185935f = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    public c0(yy.a aVar, ty3.e eVar, ml0.k kVar, ib4.c cVar, yw.b bVar, ac4.a aVar2, ry3.a aVar3, hb4.d dVar, OfficeSelectionData officeSelectionData) {
        this.mapper = eVar;
        this.getCommunityOfficesUseCase = kVar;
        this.errorMapper = cVar;
        this.accessibilityTalkBackManager = bVar;
        this.callActionWithLoaderUC = aVar2;
        this.getOfficeEdorAddressUC = aVar3;
        this.errorVMSFactory = dVar;
        Loading loading = new Loading(new sy3.d.Data(officeSelectionData, sy3.j.TopAppBar));
        this.initialState = loading;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(loading, new er.l() { // from class: sy3.s
            @Override // er.l
            public final Object b(Object obj) {
                return c0.L9(this.f185996a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), E9(loading));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b D9(dx.b bVar) {
        return this.errorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: sy3.r
            @Override // er.l
            public final Object b(Object obj) {
                return c0.s9(this.f185995a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final sy3.i.a E9(sy3.d state) {
        return this.mapper.b(new ty3.e.Params(state, new er.l() { // from class: sy3.q
            @Override // er.l
            public final Object b(Object obj) {
                return c0.F9(this.f185994a, (OfficeSearchModel) obj);
            }
        }, new er.l() { // from class: sy3.t
            @Override // er.l
            public final Object b(Object obj) {
                return c0.G9(this.f185997a, (CommunityOffice) obj);
            }
        }, b9(sy3.c.e.f185868a), b9(sy3.c.C4802c.f185866a), b9(sy3.c.a.f185864a), b9(sy3.c.b.f185865a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F9(c0 c0Var, OfficeSearchModel officeSearchModel) {
        c0Var.d9(new sy3.c.OnSearch(officeSearchModel));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G9(c0 c0Var, CommunityOffice communityOffice) {
        c0Var.d9(new sy3.c.OnOfficeSelected(communityOffice));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object H9(k10.c0<sy3.d.Initialized> c0Var, tq.e<? super k10.l<sy3.d.Initialized>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f185886j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f185886j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f185884g;
        Object objE = uq.b.e();
        int i16 = aVar.f185886j;
        if (i16 == 0) {
            oq.u.b(obj);
            sy3.d.InterfaceC4804d.SelectedOffice selectedOffice = c0Var.a().getSelectedOffice();
            if (selectedOffice != null) {
                Object officeSelected = new py3.d.a.OfficeSelected(new OfficeSelectionData.Office(selectedOffice.getOffice().getId(), selectedOffice.getOffice().getName(), selectedOffice.getEdorAddress()));
                aVar.f185881d = c0Var;
                aVar.f185882e = vq.j.a(selectedOffice);
                aVar.f185883f = 0;
                aVar.f185886j = 1;
                if (F(officeSelected, aVar) == objE) {
                    return objE;
                }
            }
            return c0Var.b(new er.l() { // from class: sy3.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return c0.J9((d.Initialized) obj2);
                }
            });
        }
        if (i16 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c0Var = (k10.c0) aVar.f185881d;
        oq.u.b(obj);
        k10.l<sy3.d.Initialized> lVarB = c0Var.b(new er.l() { // from class: sy3.a0
            @Override // er.l
            public final Object b(Object obj2) {
                return c0.I9((d.Initialized) obj2);
            }
        });
        if (lVarB != null) {
            return lVarB;
        }
        return c0Var.b(new er.l() { // from class: sy3.b0
            @Override // er.l
            public final Object b(Object obj2) {
                return c0.J9((d.Initialized) obj2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sy3.d.Initialized I9(sy3.d.Initialized initialized) {
        return sy3.d.Initialized.d(initialized, sy3.d.Data.b(initialized.getData(), null, sy3.j.TopAppBar, 1, null), null, null, false, false, 30, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final sy3.d.Initialized J9(sy3.d.Initialized initialized) {
        return sy3.d.Initialized.d(initialized, null, null, null, false, true, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(final c0 c0Var, k10.v vVar) {
        vVar.c(q0.c(sy3.d.class), new er.l() { // from class: sy3.u
            @Override // er.l
            public final Object b(Object obj) {
                return c0.M9(this.f185998a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(Loading.class), new er.l() { // from class: sy3.v
            @Override // er.l
            public final Object b(Object obj) {
                return c0.N9(this.f185999a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(Error.class), new er.l() { // from class: sy3.w
            @Override // er.l
            public final Object b(Object obj) {
                return c0.O9(this.f186000a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(sy3.d.Initialized.class), new er.l() { // from class: sy3.x
            @Override // er.l
            public final Object b(Object obj) {
                return c0.P9(this.f186001a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(Loading.class), new er.l() { // from class: sy3.y
            @Override // er.l
            public final Object b(Object obj) {
                return c0.Q9(this.f186002a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(Error.class), new er.l() { // from class: sy3.z
            @Override // er.l
            public final Object b(Object obj) {
                return c0.R9((k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(c0 c0Var, k10.z zVar) {
        c cVar = c0Var.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(sy3.c.a.class), oVar, cVar);
        zVar.x(q0.c(sy3.c.b.class), oVar, c0Var.new d(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(c0 c0Var, k10.z zVar) {
        zVar.A(c0Var.new e(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(c0 c0Var, k10.z zVar) {
        f fVar = c0Var.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(sy3.a.class), oVar, fVar);
        zVar.v(q0.c(sy3.b.class), oVar, new g(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(c0 c0Var, k10.z zVar) {
        h hVar = c0Var.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(sy3.c.OnOfficeSelected.class), oVar, hVar);
        zVar.v(q0.c(sy3.c.OnSearch.class), oVar, c0Var.new i(null));
        zVar.v(q0.c(sy3.c.C4802c.class), oVar, c0Var.new j(null));
        zVar.v(q0.c(sy3.c.e.class), oVar, new k(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(c0 c0Var, k10.z zVar) {
        zVar.A(c0Var.new l(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(k10.z zVar) {
        m mVar = new m(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(sy3.a.class), oVar, mVar);
        zVar.v(q0.c(sy3.b.class), oVar, new n(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s9(c0 c0Var, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary) || (bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            c0Var.d9(sy3.a.f185862a);
        } else {
            if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            c0Var.d9(sy3.b.f185863a);
        }
        return oq.i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: C9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(py3.d.a aVar, tq.e<? super oq.i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: K9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(OfficeSelectionData officeSelectionData) {
        super.P5(officeSelectionData);
    }

    @Override // zx.b
    public xw.b<py3.d.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<sy3.d, sy3.c> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<sy3.i.a> getState() {
        return this.state;
    }
}
