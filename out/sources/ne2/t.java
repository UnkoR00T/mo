package ne2;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import fr.q0;
import mu.p0;
import mx.Label;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.asn1.eac.CertificateBody;
import p071kotlin.Metadata;
import vy.Coordinates;
import w04.LocationData;
import w04.LocationDetails;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B{\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0001\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020$H\u0002¢\u0006\u0004\b'\u0010&J\u0018\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020(H\u0082@¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020\u0002H\u0002¢\u0006\u0004\b/\u00100J\u0019\u00102\u001a\u00020\u00022\b\u00101\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u0002052\u0006\u00104\u001a\u00020*H\u0002¢\u0006\u0004\b6\u00107R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR \u0010X\u001a\b\u0012\u0004\u0012\u00020S0R8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR \u0010^\u001a\b\u0012\u0004\u0012\u00020Z0Y8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\bF\u0010]R\u0014\u0010a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R&\u0010g\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR \u0010-\u001a\b\u0012\u0004\u0012\u00020.0h8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010l¨\u0006m"}, d2 = {"Lne2/t;", "Ll00/g;", "Lne2/c;", "Lne2/a;", "Lne2/e;", "", "Lyy/a;", "stateMachineFactory", "Lmx/c;", "labelProvider", "Li70/n;", "snackBarManagerStateHolder", "Loe2/c;", "mapper", "Lay/k;", "networkConnectionManager", "Le14/h;", "getPermissionsGPSUseCase", "Le14/d;", "getAddressUseCase", "Li14/c;", "getPreciseLocationUseCase", "Le14/a;", "checkAllConditionsToGetLocationUseCase", "La14/n;", "goToDeviceLocationSettingsUseCase", "La14/m;", "goToApplicationDetailsSettingsUseCase", "Lyw/b;", "accessibilityTalkBackManager", "Lcb4/j;", "dialogVMSFactory", "Lne2/f;", "setupContract", "<init>", "(Lyy/a;Lmx/c;Li70/n;Loe2/c;Lay/k;Le14/h;Le14/d;Li14/c;Le14/a;La14/n;La14/m;Lyw/b;Lcb4/j;Lne2/f;)V", "Lcb4/d;", "C9", "()Lcb4/d;", "B9", "Lvy/c;", "coordinates", "Lw04/c;", "E9", "(Lvy/c;Ltq/e;)Ljava/lang/Object;", "state", "Lne2/e$a;", "F9", "(Lne2/c;)Lne2/e$a;", "location", "I9", "(Lvy/c;)Lne2/c;", "locationDetails", "Loq/i0;", "A9", "(Lw04/c;)V", "b", "Lmx/c;", "c", "Li70/n;", "d", "Loe2/c;", "e", "Lay/k;", "f", "Le14/h;", "g", "Le14/d;", "h", "Li14/c;", "j", "Le14/a;", "k", "La14/n;", "l", "La14/m;", "m", "Lyw/b;", "n", "Lcb4/j;", "p", "Lne2/f;", "Lxw/b;", "Lne2/a$f;", "q", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/g;", "Li70/p;", "r", "Lmu/g;", "()Lmu/g;", "snackBarVisibilityState", "s", "Lne2/c;", "initialState", "Lk10/t;", "t", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "v", "Lmu/p0;", "getState", "()Lmu/p0;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends l00.g<ne2.c, ne2.a> implements ne2.e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final oe2.c mapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ay.k networkConnectionManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final e14.h getPermissionsGPSUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final e14.d getAddressUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final i14.c getPreciseLocationUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final e14.a checkAllConditionsToGetLocationUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final a14.n goToDeviceLocationSettingsUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final yw.b accessibilityTalkBackManager;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final ne2.f setupContract;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ne2.a.f> navAction = new xw.b<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final mu.g<i70.p> snackBarVisibilityState;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final ne2.c initialState;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final k10.t<ne2.c, ne2.a> stateMachine;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final p0<ne2.e.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<ne2.e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f135196a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f135197b;

        /* JADX INFO: renamed from: ne2.t$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3345a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f135198a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f135199b;

            /* JADX INFO: renamed from: ne2.t$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3346a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f135200d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f135201e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f135202f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f135204h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f135205j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f135206k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f135207l;

                public C3346a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f135200d = obj;
                    this.f135201e |= PKIFailureInfo.systemUnavail;
                    return C3345a.this.F(null, this);
                }
            }

            public C3345a(mu.h hVar, t tVar) {
                this.f135198a = hVar;
                this.f135199b = tVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3346a c3346a;
                if (eVar instanceof C3346a) {
                    c3346a = (C3346a) eVar;
                    int i15 = c3346a.f135201e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3346a.f135201e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3346a = new C3346a(eVar);
                    }
                } else {
                    c3346a = new C3346a(eVar);
                }
                Object obj2 = c3346a.f135200d;
                Object objE = uq.b.e();
                int i16 = c3346a.f135201e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f135198a;
                    ne2.e.Data dataF9 = this.f135199b.F9((ne2.c) obj);
                    c3346a.f135202f = vq.j.a(obj);
                    c3346a.f135204h = vq.j.a(c3346a);
                    c3346a.f135205j = vq.j.a(obj);
                    c3346a.f135206k = vq.j.a(hVar);
                    c3346a.f135207l = 0;
                    c3346a.f135201e = 1;
                    if (hVar.F(dataF9, c3346a) == objE) {
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

        public a(mu.g gVar, t tVar) {
            this.f135196a = gVar;
            this.f135197b = tVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ne2.e.Data> hVar, tq.e eVar) {
            Object objA = this.f135196a.a(new C3345a(hVar, this.f135197b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lne2/a$c;", "<unused var>", "Lk10/c0;", "Lne2/c$b;", "state", "Lk10/l;", "Lne2/c;", "<anonymous>", "(Lne2/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<ne2.a.GetLocation, k10.c0<ne2.c.Screen>, tq.e<? super k10.l<? extends ne2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135208e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f135209f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ne2.c.Screen O(k10.c0 c0Var, ne2.c.Screen screen) {
            return screen.b(MapScreenStateData.b(((ne2.c.Screen) c0Var.a()).getMapScreenStateData(), null, null, null, true, null, null, null, null, 247, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f135209f;
            Object objE = uq.b.e();
            int i15 = this.f135208e;
            if (i15 == 0) {
                oq.u.b(obj);
                e14.a aVar = t.this.checkAllConditionsToGetLocationUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f135209f = c0Var;
                this.f135208e = 1;
                obj = aVar.a(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            e14.a.InterfaceC1068a interfaceC1068a = (e14.a.InterfaceC1068a) obj;
            if (interfaceC1068a == e14.a.InterfaceC1068a.EnumC1069a.NO_PERMISSIONS) {
                t.this.d9(new ne2.a.ShowDialog(t.this.C9()));
                return c0Var.c();
            }
            if (interfaceC1068a == e14.a.InterfaceC1068a.EnumC1069a.NO_GPS_ENABLED) {
                t.this.d9(new ne2.a.ShowDialog(t.this.B9()));
                return c0Var.c();
            }
            if (!fr.t.c(interfaceC1068a, e14.a.InterfaceC1068a.b.f46876a)) {
                throw new oq.p();
            }
            t.this.d9(new ne2.a.SetStateMyPosition(ne2.d.c.f135136a));
            return c0Var.b(new er.l() { // from class: ne2.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.b.O(c0Var, (c.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ne2.a.GetLocation getLocation, k10.c0<ne2.c.Screen> c0Var, tq.e<? super k10.l<? extends ne2.c>> eVar) {
            b bVar = t.this.new b(eVar);
            bVar.f135209f = c0Var;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lne2/a$j;", "<unused var>", "Lne2/c$b;", "Loq/i0;", "<anonymous>", "(Lne2/a$j;Lne2/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ne2.a.j, ne2.c.Screen, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135211e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f135211e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            t.this.snackBarManagerStateHolder.B0();
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ne2.a.j jVar, ne2.c.Screen screen, tq.e<? super i0> eVar) {
            return t.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lne2/a$i;", "<unused var>", "Lne2/c$b;", "state", "Loq/i0;", "<anonymous>", "(Lne2/a$i;Lne2/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ne2.a.i, ne2.c.Screen, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135213e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f135214f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ne2.c.Screen screen = (ne2.c.Screen) this.f135214f;
            uq.b.e();
            if (this.f135213e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            t.this.setupContract.a1(screen.getMapScreenStateData().getIncidentLocation());
            t.this.d9(ne2.a.h.f135106a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ne2.a.i iVar, ne2.c.Screen screen, tq.e<? super i0> eVar) {
            d dVar = t.this.new d(eVar);
            dVar.f135214f = screen;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvy/c;", "action", "Lk10/c0;", "Lne2/c$b;", "state", "Lk10/l;", "Lne2/c;", "<anonymous>", "(Lvy/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<Coordinates, k10.c0<ne2.c.Screen>, tq.e<? super k10.l<? extends ne2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135216e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f135217f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f135218g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ne2.c.Screen O(k10.c0 c0Var, Coordinates coordinates, ne2.c.Screen screen) {
            return screen.b(MapScreenStateData.b(((ne2.c.Screen) c0Var.a()).getMapScreenStateData(), null, null, null, false, null, null, null, coordinates, CertificateBody.profileType, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final Coordinates coordinates = (Coordinates) this.f135217f;
            final k10.c0 c0Var = (k10.c0) this.f135218g;
            uq.b.e();
            if (this.f135216e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            t.this.d9(new ne2.a.UpdateMyPosition(coordinates));
            return c0Var.b(new er.l() { // from class: ne2.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.e.O(c0Var, coordinates, (c.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(Coordinates coordinates, k10.c0<ne2.c.Screen> c0Var, tq.e<? super k10.l<? extends ne2.c>> eVar) {
            e eVar2 = t.this.new e(eVar);
            eVar2.f135217f = coordinates;
            eVar2.f135218g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lne2/c$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lne2/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<ne2.c.Screen, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135220e;

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f135220e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            t.this.d9(ne2.a.b.f135100a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ne2.c.Screen screen, tq.e<? super i0> eVar) {
            return ((f) v(screen, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return t.this.new f(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lne2/a$m;", "action", "Lk10/c0;", "Lne2/c$b;", "state", "Lk10/l;", "Lne2/c;", "<anonymous>", "(Lne2/a$m;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ne2.a.ShowDialog, k10.c0<ne2.c.Screen>, tq.e<? super k10.l<? extends ne2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135222e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f135223f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f135224g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ne2.c.Dialog O(k10.c0 c0Var, t tVar, ne2.a.ShowDialog showDialog, ne2.c.Screen screen) {
            return new ne2.c.Dialog(((ne2.c.Screen) c0Var.a()).getMapScreenStateData(), tVar.dialogVMSFactory.a(showDialog.getDialogData()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ne2.a.ShowDialog showDialog = (ne2.a.ShowDialog) this.f135223f;
            final k10.c0 c0Var = (k10.c0) this.f135224g;
            uq.b.e();
            if (this.f135222e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final t tVar = t.this;
            return c0Var.d(new er.l() { // from class: ne2.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.g.O(c0Var, tVar, showDialog, (c.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ne2.a.ShowDialog showDialog, k10.c0<ne2.c.Screen> c0Var, tq.e<? super k10.l<? extends ne2.c>> eVar) {
            g gVar = t.this.new g(eVar);
            gVar.f135223f = showDialog;
            gVar.f135224g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lne2/a$h;", "<unused var>", "Lne2/c$b;", "Loq/i0;", "<anonymous>", "(Lne2/a$h;Lne2/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<ne2.a.h, ne2.c.Screen, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135226e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f135226e;
            if (i15 == 0) {
                oq.u.b(obj);
                t tVar = t.this;
                ne2.a.f.C3344a c3344a = ne2.a.f.C3344a.f135104a;
                this.f135226e = 1;
                if (tVar.F(c3344a, this) == objE) {
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
        public final Object w(ne2.a.h hVar, ne2.c.Screen screen, tq.e<? super i0> eVar) {
            return t.this.new h(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lne2/a$b;", "<unused var>", "Lk10/c0;", "Lne2/c$b;", "state", "Lk10/l;", "Lne2/c;", "<anonymous>", "(Lne2/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<ne2.a.b, k10.c0<ne2.c.Screen>, tq.e<? super k10.l<? extends ne2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135228e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f135229f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ne2.c.Screen O(k10.c0 c0Var, LocationData locationData, ne2.c.Screen screen) {
            return screen.b(MapScreenStateData.b(((ne2.c.Screen) c0Var.a()).getMapScreenStateData(), null, null, null, locationData.getIsMyLocationEnabled(), null, null, null, null, 247, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f135229f;
            Object objE = uq.b.e();
            int i15 = this.f135228e;
            if (i15 == 0) {
                oq.u.b(obj);
                e14.h hVar = t.this.getPermissionsGPSUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f135229f = c0Var;
                this.f135228e = 1;
                obj = hVar.c(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final LocationData locationData = (LocationData) obj;
            t.this.d9(new ne2.a.SetStateMyPosition(ne2.d.b.f135135a));
            return c0Var.b(new er.l() { // from class: ne2.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.i.O(c0Var, locationData, (c.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ne2.a.b bVar, k10.c0<ne2.c.Screen> c0Var, tq.e<? super k10.l<? extends ne2.c>> eVar) {
            i iVar = t.this.new i(eVar);
            iVar.f135229f = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lne2/a$k;", "action", "Lk10/c0;", "Lne2/c$b;", "state", "Lk10/l;", "Lne2/c;", "<anonymous>", "(Lne2/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<ne2.a.PinChosen, k10.c0<ne2.c.Screen>, tq.e<? super k10.l<? extends ne2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135231e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f135232f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f135233g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ne2.c.Screen O(k10.c0 c0Var, ne2.a.PinChosen pinChosen, ne2.c.Screen screen) {
            return screen.b(MapScreenStateData.b(((ne2.c.Screen) c0Var.a()).getMapScreenStateData(), pinChosen.getCoordinates(), null, null, false, pinChosen.getCoordinates(), pinChosen.getCoordinates(), null, null, 206, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ne2.a.PinChosen pinChosen = (ne2.a.PinChosen) this.f135232f;
            final k10.c0 c0Var = (k10.c0) this.f135233g;
            Object objE = uq.b.e();
            int i15 = this.f135231e;
            if (i15 == 0) {
                oq.u.b(obj);
                t tVar = t.this;
                Coordinates coordinates = pinChosen.getCoordinates();
                this.f135232f = pinChosen;
                this.f135233g = c0Var;
                this.f135231e = 1;
                obj = tVar.E9(coordinates, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            t.this.A9((LocationDetails) obj);
            return c0Var.b(new er.l() { // from class: ne2.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.j.O(c0Var, pinChosen, (c.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ne2.a.PinChosen pinChosen, k10.c0<ne2.c.Screen> c0Var, tq.e<? super k10.l<? extends ne2.c>> eVar) {
            j jVar = t.this.new j(eVar);
            jVar.f135232f = pinChosen;
            jVar.f135233g = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lne2/a$l;", "action", "Lk10/c0;", "Lne2/c$b;", "state", "Lk10/l;", "Lne2/c;", "<anonymous>", "(Lne2/a$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<ne2.a.SetStateMyPosition, k10.c0<ne2.c.Screen>, tq.e<? super k10.l<? extends ne2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135235e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f135236f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f135237g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ne2.c.Screen O(k10.c0 c0Var, ne2.a.SetStateMyPosition setStateMyPosition, Coordinates coordinates, ne2.c.Screen screen) {
            MapScreenStateData mapScreenStateData = ((ne2.c.Screen) c0Var.a()).getMapScreenStateData();
            ne2.d update = setStateMyPosition.getUpdate();
            if (coordinates == null) {
                coordinates = ((ne2.c.Screen) c0Var.a()).getMapScreenStateData().getMyLastPosition();
            }
            return screen.b(MapScreenStateData.b(mapScreenStateData, null, null, null, false, null, null, update, coordinates, 63, null));
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0068  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final Coordinates myLastPosition;
            final ne2.a.SetStateMyPosition setStateMyPosition = (ne2.a.SetStateMyPosition) this.f135236f;
            final k10.c0 c0Var = (k10.c0) this.f135237g;
            Object objE = uq.b.e();
            int i15 = this.f135235e;
            if (i15 == 0) {
                oq.u.b(obj);
                ne2.d update = setStateMyPosition.getUpdate();
                if (fr.t.c(update, ne2.d.a.f135134a)) {
                    myLastPosition = null;
                } else if (fr.t.c(update, ne2.d.b.f135135a)) {
                    myLastPosition = ((ne2.c.Screen) c0Var.a()).getMapScreenStateData().getMyLastPosition();
                } else {
                    if (!fr.t.c(update, ne2.d.c.f135136a)) {
                        throw new oq.p();
                    }
                    i14.c cVar = t.this.getPreciseLocationUseCase;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f135236f = setStateMyPosition;
                    this.f135237g = c0Var;
                    this.f135235e = 1;
                    obj = cVar.c(c1792a, this);
                    if (obj == objE) {
                        return objE;
                    }
                }
                if (myLastPosition != null) {
                    t.this.d9(new ne2.a.UpdateMyPosition(myLastPosition));
                }
                return c0Var.b(new er.l() { // from class: ne2.z
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return t.k.O(c0Var, setStateMyPosition, myLastPosition, (c.Screen) obj2);
                    }
                });
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            myLastPosition = (Coordinates) obj;
            if (myLastPosition != null) {
                t.this.d9(new ne2.a.UpdateMyPosition(myLastPosition));
            }
            return c0Var.b(new er.l() { // from class: ne2.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.k.O(c0Var, setStateMyPosition, myLastPosition, (c.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ne2.a.SetStateMyPosition setStateMyPosition, k10.c0<ne2.c.Screen> c0Var, tq.e<? super k10.l<? extends ne2.c>> eVar) {
            k kVar = t.this.new k(eVar);
            kVar.f135236f = setStateMyPosition;
            kVar.f135237g = c0Var;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lne2/a$g;", "<unused var>", "Lk10/c0;", "Lne2/c$b;", "state", "Lk10/l;", "Lne2/c;", "<anonymous>", "(Lne2/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<ne2.a.g, k10.c0<ne2.c.Screen>, tq.e<? super k10.l<? extends ne2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135239e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f135240f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ne2.c.Screen O(k10.c0 c0Var, ne2.c.Screen screen) {
            return screen.b(MapScreenStateData.b(((ne2.c.Screen) c0Var.a()).getMapScreenStateData(), null, null, null, false, null, null, ne2.d.a.f135134a, null, 159, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f135240f;
            uq.b.e();
            if (this.f135239e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ne2.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.l.O(c0Var, (c.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ne2.a.g gVar, k10.c0<ne2.c.Screen> c0Var, tq.e<? super k10.l<? extends ne2.c>> eVar) {
            l lVar = new l(eVar);
            lVar.f135240f = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lne2/a$n;", "action", "Lk10/c0;", "Lne2/c$b;", "state", "Lk10/l;", "Lne2/c;", "<anonymous>", "(Lne2/a$n;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<ne2.a.UpdateMyPosition, k10.c0<ne2.c.Screen>, tq.e<? super k10.l<? extends ne2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135241e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f135242f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f135243g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ne2.c.Screen V(k10.c0 c0Var, ne2.a.UpdateMyPosition updateMyPosition, ne2.c.Screen screen) {
            return screen.b(MapScreenStateData.b(((ne2.c.Screen) c0Var.a()).getMapScreenStateData(), null, null, null, false, null, updateMyPosition.getCoordinates(), null, null, 223, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ne2.c.Screen X(k10.c0 c0Var, ne2.a.UpdateMyPosition updateMyPosition, ne2.c.Screen screen) {
            return screen.b(MapScreenStateData.b(((ne2.c.Screen) c0Var.a()).getMapScreenStateData(), updateMyPosition.getCoordinates(), null, null, false, updateMyPosition.getCoordinates(), updateMyPosition.getCoordinates(), null, null, 206, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ne2.a.UpdateMyPosition updateMyPosition = (ne2.a.UpdateMyPosition) this.f135242f;
            final k10.c0 c0Var = (k10.c0) this.f135243g;
            Object objE = uq.b.e();
            int i15 = this.f135241e;
            if (i15 == 0) {
                oq.u.b(obj);
                ne2.d stateUpdateMyPosition = ((ne2.c.Screen) c0Var.a()).getMapScreenStateData().getStateUpdateMyPosition();
                if (fr.t.c(stateUpdateMyPosition, ne2.d.a.f135134a)) {
                    return c0Var.c();
                }
                if (fr.t.c(stateUpdateMyPosition, ne2.d.b.f135135a)) {
                    return c0Var.b(new er.l() { // from class: ne2.b0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return t.m.V(c0Var, updateMyPosition, (c.Screen) obj2);
                        }
                    });
                }
                if (!fr.t.c(stateUpdateMyPosition, ne2.d.c.f135136a)) {
                    throw new oq.p();
                }
                t tVar = t.this;
                Coordinates coordinates = updateMyPosition.getCoordinates();
                this.f135242f = updateMyPosition;
                this.f135243g = c0Var;
                this.f135241e = 1;
                obj = tVar.E9(coordinates, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            t.this.A9((LocationDetails) obj);
            return c0Var.b(new er.l() { // from class: ne2.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.m.X(c0Var, updateMyPosition, (c.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(ne2.a.UpdateMyPosition updateMyPosition, k10.c0<ne2.c.Screen> c0Var, tq.e<? super k10.l<? extends ne2.c>> eVar) {
            m mVar = t.this.new m(eVar);
            mVar.f135242f = updateMyPosition;
            mVar.f135243g = c0Var;
            return mVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lne2/a$e;", "<unused var>", "Lne2/c$a;", "Loq/i0;", "<anonymous>", "(Lne2/a$e;Lne2/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<ne2.a.e, ne2.c.Dialog, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135245e;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f135245e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dx.i<? extends dx.b.Business, ? extends i0> iVarA = t.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            t tVar = t.this;
            if (iVarA instanceof dx.i.Left) {
                tVar.snackBarManagerStateHolder.y(new p50.a.DefaultWithIcon(tVar.labelProvider.c(ud2.a.E0), false, null, null, 14, null));
            }
            t.this.d9(ne2.a.C3343a.f135099a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ne2.a.e eVar, ne2.c.Dialog dialog, tq.e<? super i0> eVar2) {
            return t.this.new n(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lne2/a$d;", "<unused var>", "Lne2/c$a;", "Loq/i0;", "<anonymous>", "(Lne2/a$d;Lne2/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<ne2.a.d, ne2.c.Dialog, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135247e;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f135247e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.n nVar = t.this.goToDeviceLocationSettingsUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f135247e = 1;
                obj = nVar.c(c1792a, this);
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
            t tVar = t.this;
            if (iVar instanceof dx.i.Left) {
                tVar.snackBarManagerStateHolder.y(new p50.a.DefaultWithIcon(tVar.labelProvider.c(ud2.a.E0), false, null, null, 14, null));
            }
            t.this.d9(ne2.a.C3343a.f135099a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ne2.a.d dVar, ne2.c.Dialog dialog, tq.e<? super i0> eVar) {
            return t.this.new o(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lne2/a$a;", "<unused var>", "Lk10/c0;", "Lne2/c$a;", "state", "Lk10/l;", "Lne2/c;", "<anonymous>", "(Lne2/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<ne2.a.C3343a, k10.c0<ne2.c.Dialog>, tq.e<? super k10.l<? extends ne2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f135249e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f135250f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ne2.c.Screen O(k10.c0 c0Var, ne2.c.Dialog dialog) {
            return new ne2.c.Screen(((ne2.c.Dialog) c0Var.a()).getMapScreenStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f135250f;
            uq.b.e();
            if (this.f135249e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: ne2.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.p.O(c0Var, (c.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ne2.a.C3343a c3343a, k10.c0<ne2.c.Dialog> c0Var, tq.e<? super k10.l<? extends ne2.c>> eVar) {
            p pVar = new p(eVar);
            pVar.f135250f = c0Var;
            return pVar.J(i0.f148189a);
        }
    }

    public t(yy.a aVar, mx.c cVar, i70.n nVar, oe2.c cVar2, ay.k kVar, e14.h hVar, e14.d dVar, i14.c cVar3, e14.a aVar2, a14.n nVar2, a14.m mVar, yw.b bVar, cb4.j jVar, ne2.f fVar) {
        this.labelProvider = cVar;
        this.snackBarManagerStateHolder = nVar;
        this.mapper = cVar2;
        this.networkConnectionManager = kVar;
        this.getPermissionsGPSUseCase = hVar;
        this.getAddressUseCase = dVar;
        this.getPreciseLocationUseCase = cVar3;
        this.checkAllConditionsToGetLocationUseCase = aVar2;
        this.goToDeviceLocationSettingsUseCase = nVar2;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.accessibilityTalkBackManager = bVar;
        this.dialogVMSFactory = jVar;
        this.setupContract = fVar;
        this.snackBarVisibilityState = a9(nVar.j(), i70.p.a.f89857a);
        ne2.c cVarI9 = I9(fVar.S0());
        this.initialState = cVarI9;
        this.stateMachine = aVar.a(cVarI9, new er.l() { // from class: ne2.s
            @Override // er.l
            public final Object b(Object obj) {
                return t.K9(this.f135177a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), F9(cVarI9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A9(LocationDetails locationDetails) {
        Label labelC = this.labelProvider.c(ud2.a.f197740i0);
        this.accessibilityTalkBackManager.a(labelC.getText() + Label.INSTANCE.d().getText() + locationDetails.i());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DialogData B9() {
        cb4.h.b bVar = cb4.h.b.f24985a;
        Label labelC = this.labelProvider.c(ud2.a.C0);
        Label labelC2 = this.labelProvider.c(ud2.a.A0);
        DialogButtonTextData dialogButtonTextData = new DialogButtonTextData(this.labelProvider.c(ud2.a.f197770x0), null, b9(ne2.a.d.f135102a), 2, null);
        Label labelC3 = this.labelProvider.c(ud2.a.D0);
        cb4.a.C0668a c0668a = cb4.a.C0668a.f24967a;
        ne2.a.C3343a c3343a = ne2.a.C3343a.f135099a;
        return new DialogData(bVar, labelC, labelC2, dialogButtonTextData, new DialogButtonTextData(labelC3, c0668a, b9(c3343a)), null, b9(c3343a), 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DialogData C9() {
        cb4.h.b bVar = cb4.h.b.f24985a;
        Label labelC = this.labelProvider.c(ud2.a.f197774z0);
        Label labelC2 = this.labelProvider.c(ud2.a.f197772y0);
        DialogButtonTextData dialogButtonTextData = new DialogButtonTextData(this.labelProvider.c(ud2.a.f197770x0), null, b9(ne2.a.e.f135103a), 2, null);
        Label labelC3 = this.labelProvider.c(ud2.a.D0);
        cb4.a.C0668a c0668a = cb4.a.C0668a.f24967a;
        ne2.a.C3343a c3343a = ne2.a.C3343a.f135099a;
        return new DialogData(bVar, labelC, labelC2, dialogButtonTextData, new DialogButtonTextData(labelC3, c0668a, b9(c3343a)), null, b9(c3343a), 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object E9(Coordinates coordinates, tq.e<? super LocationDetails> eVar) {
        boolean zE = this.networkConnectionManager.e();
        if (zE) {
            return this.getAddressUseCase.b(new e14.d.Params(coordinates, pq.v.n()), eVar);
        }
        if (zE) {
            throw new oq.p();
        }
        return new LocationDetails(null, null, null, null, null, null, null, coordinates, CertificateBody.profileType, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ne2.e.Data F9(ne2.c state) {
        return this.mapper.b(new oe2.c.Params(state, b9(ne2.a.h.f135106a), new er.l() { // from class: ne2.q
            @Override // er.l
            public final Object b(Object obj) {
                return t.G9(this.f135175a, (Coordinates) obj);
            }
        }, new er.p() { // from class: ne2.r
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return t.H9(this.f135176a, (Coordinates) obj, (String) obj2);
            }
        }, b9(new ne2.a.GetLocation(pq.v.n())), b9(ne2.a.j.f135108a), b9(ne2.a.i.f135107a), b9(ne2.a.g.f135105a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(t tVar, Coordinates coordinates) {
        tVar.d9(new ne2.a.PinChosen(coordinates, Label.INSTANCE.c()));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(t tVar, Coordinates coordinates, String str) {
        tVar.d9(new ne2.a.PinChosen(coordinates, mx.b.b(str, "name")));
        return i0.f148189a;
    }

    private final ne2.c I9(Coordinates location) {
        return location != null ? new ne2.c.Screen(new MapScreenStateData(location, null, null, false, location, location, ne2.d.b.f135135a, null, 6, null)) : new ne2.c.Screen(new MapScreenStateData(null, null, null, false, null, null, ne2.d.b.f135135a, null, 6, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K9(final t tVar, k10.v vVar) {
        vVar.c(q0.c(ne2.c.Screen.class), new er.l() { // from class: ne2.o
            @Override // er.l
            public final Object b(Object obj) {
                return t.L9(this.f135173a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(ne2.c.Dialog.class), new er.l() { // from class: ne2.p
            @Override // er.l
            public final Object b(Object obj) {
                return t.M9(this.f135174a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L9(t tVar, k10.z zVar) {
        k10.k.m(zVar, tVar.setupContract.m(), null, tVar.new e(null), 2, null);
        zVar.C(tVar.new f(null));
        g gVar = tVar.new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(ne2.a.ShowDialog.class), oVar, gVar);
        zVar.x(q0.c(ne2.a.h.class), oVar, tVar.new h(null));
        zVar.v(q0.c(ne2.a.b.class), oVar, tVar.new i(null));
        zVar.v(q0.c(ne2.a.PinChosen.class), oVar, tVar.new j(null));
        zVar.v(q0.c(ne2.a.SetStateMyPosition.class), oVar, tVar.new k(null));
        zVar.v(q0.c(ne2.a.g.class), oVar, new l(null));
        zVar.v(q0.c(ne2.a.UpdateMyPosition.class), oVar, tVar.new m(null));
        zVar.v(q0.c(ne2.a.GetLocation.class), oVar, tVar.new b(null));
        zVar.x(q0.c(ne2.a.j.class), oVar, tVar.new c(null));
        zVar.x(q0.c(ne2.a.i.class), oVar, tVar.new d(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M9(t tVar, k10.z zVar) {
        n nVar = tVar.new n(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ne2.a.e.class), oVar, nVar);
        zVar.x(q0.c(ne2.a.d.class), oVar, tVar.new o(null));
        zVar.v(q0.c(ne2.a.C3343a.class), oVar, new p(null));
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: D9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ne2.a.f fVar, tq.e<? super i0> eVar) {
        return super.F(fVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: J9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(ne2.f fVar) {
        super.P5(fVar);
    }

    @Override // zx.b
    public xw.b<ne2.a.f> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<ne2.c, ne2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<ne2.e.Data> getState() {
        return this.state;
    }

    @Override // ne2.e
    public mu.g<i70.p> j() {
        return this.snackBarVisibilityState;
    }
}
