package bf2;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import fr.q0;
import k10.c0;
import k10.z;
import mu.p0;
import mx.Label;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vy.Coordinates;
import w04.LocationCoordinates;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B[\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0002H\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R \u0010;\u001a\b\u0012\u0004\u0012\u000207068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b2\u0010:R \u0010B\u001a\b\u0012\u0004\u0012\u00020=0<8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER,\u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030G8\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\bH\u0010I\u0012\u0004\bL\u0010M\u001a\u0004\bJ\u0010KR&\u0010 \u001a\b\u0012\u0004\u0012\u00020!0O8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bP\u0010Q\u0012\u0004\bT\u0010M\u001a\u0004\bR\u0010S¨\u0006U"}, d2 = {"Lbf2/q;", "Ll00/g;", "Lbf2/d;", "Lbf2/a;", "Lbf2/e;", "", "Lyy/a;", "stateMachineFactory", "Lmx/c;", "labelProvider", "Lcf2/a;", "mapper", "Li70/n;", "snackBarManagerStateHolder", "Le14/a;", "checkAllConditionsToGetLocationUseCase", "La14/n;", "goToDeviceLocationSettingsUseCase", "Le14/g;", "getLocationUseCase", "La14/m;", "goToApplicationDetailsSettingsUseCase", "Lcb4/j;", "dialogVMSFactory", "Lbf2/b;", "setupData", "<init>", "(Lyy/a;Lmx/c;Lcf2/a;Li70/n;Le14/a;La14/n;Le14/g;La14/m;Lcb4/j;Lbf2/b;)V", "Lcb4/d;", "v9", "()Lcb4/d;", "u9", "state", "Lbf2/e$a;", "x9", "(Lbf2/d;)Lbf2/e$a;", "b", "Lmx/c;", "c", "Lcf2/a;", "d", "Li70/n;", "e", "Le14/a;", "f", "La14/n;", "g", "Le14/g;", "h", "La14/m;", "j", "Lcb4/j;", "k", "Lbf2/b;", "Lmu/g;", "Li70/p;", "l", "Lmu/g;", "()Lmu/g;", "snackBarVisibilityState", "Lxw/b;", "Lbf2/a$e;", "m", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lbf2/d$b;", "n", "Lbf2/d$b;", "initialState", "Lk10/t;", "p", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "()V", "stateMachine", "Lmu/p0;", "q", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<bf2.d, bf2.a> implements bf2.e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final cf2.a mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final e14.a checkAllConditionsToGetLocationUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a14.n goToDeviceLocationSettingsUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final e14.g getLocationUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final mu.g<i70.p> snackBarVisibilityState;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final xw.b<bf2.a.e> navAction = new xw.b<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final bf2.d.Screen initialState;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final k10.t<bf2.d, bf2.a> stateMachine;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final p0<bf2.e.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<bf2.e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f19191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f19192b;

        /* JADX INFO: renamed from: bf2.q$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0486a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f19193a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f19194b;

            /* JADX INFO: renamed from: bf2.q$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0487a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f19195d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f19196e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f19197f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f19199h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f19200j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f19201k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f19202l;

                public C0487a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f19195d = obj;
                    this.f19196e |= PKIFailureInfo.systemUnavail;
                    return C0486a.this.F(null, this);
                }
            }

            public C0486a(mu.h hVar, q qVar) {
                this.f19193a = hVar;
                this.f19194b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0487a c0487a;
                if (eVar instanceof C0487a) {
                    c0487a = (C0487a) eVar;
                    int i15 = c0487a.f19196e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0487a.f19196e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0487a = new C0487a(eVar);
                    }
                } else {
                    c0487a = new C0487a(eVar);
                }
                Object obj2 = c0487a.f19195d;
                Object objE = uq.b.e();
                int i16 = c0487a.f19196e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f19193a;
                    bf2.e.Data dataX9 = this.f19194b.x9((bf2.d) obj);
                    c0487a.f19197f = vq.j.a(obj);
                    c0487a.f19199h = vq.j.a(c0487a);
                    c0487a.f19200j = vq.j.a(obj);
                    c0487a.f19201k = vq.j.a(hVar);
                    c0487a.f19202l = 0;
                    c0487a.f19196e = 1;
                    if (hVar.F(dataX9, c0487a) == objE) {
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

        public a(mu.g gVar, q qVar) {
            this.f19191a = gVar;
            this.f19192b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super bf2.e.Data> hVar, tq.e eVar) {
            Object objA = this.f19191a.a(new C0486a(hVar, this.f19192b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lbf2/d$b;", "state", "Lk10/l;", "Lbf2/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<c0<bf2.d.Screen>, tq.e<? super k10.l<? extends bf2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19203e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f19204f;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final bf2.d.Screen O(c0 c0Var, boolean z15, bf2.d.Screen screen) {
            return screen.b(ShowMapScreenStateData.b(((bf2.d.Screen) c0Var.a()).getShowMapScreenStateData(), z15, null, null, null, null, null, 62, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c0 c0Var = (c0) this.f19204f;
            Object objE = uq.b.e();
            int i15 = this.f19203e;
            if (i15 == 0) {
                oq.u.b(obj);
                e14.g gVar = q.this.getLocationUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f19204f = c0Var;
                this.f19203e = 1;
                obj = gVar.a(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final boolean isMyLocationEnabled = ((LocationCoordinates) obj).getIsMyLocationEnabled();
            return c0Var.b(new er.l() { // from class: bf2.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.b.O(c0Var, isMyLocationEnabled, (d.Screen) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<bf2.d.Screen> c0Var, tq.e<? super k10.l<? extends bf2.d>> eVar) {
            return ((b) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = q.this.new b(eVar);
            bVar.f19204f = obj;
            return bVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lbf2/a$f;", "<unused var>", "Lbf2/d$b;", "Loq/i0;", "<anonymous>", "(Lbf2/a$f;Lbf2/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<bf2.a.f, bf2.d.Screen, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19206e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f19206e;
            if (i15 == 0) {
                oq.u.b(obj);
                q qVar = q.this;
                bf2.a.e.C0485a c0485a = bf2.a.e.C0485a.f19129a;
                this.f19206e = 1;
                if (qVar.F(c0485a, this) == objE) {
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
        public final Object w(bf2.a.f fVar, bf2.d.Screen screen, tq.e<? super i0> eVar) {
            return q.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lbf2/a$h;", "action", "Lk10/c0;", "Lbf2/d$b;", "state", "Lk10/l;", "Lbf2/d;", "<anonymous>", "(Lbf2/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<bf2.a.ShowDialog, c0<bf2.d.Screen>, tq.e<? super k10.l<? extends bf2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19208e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f19209f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f19210g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final bf2.d.Dialog O(c0 c0Var, q qVar, bf2.a.ShowDialog showDialog, bf2.d.Screen screen) {
            return new bf2.d.Dialog(((bf2.d.Screen) c0Var.a()).getShowMapScreenStateData(), qVar.dialogVMSFactory.a(showDialog.getDialogData()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final bf2.a.ShowDialog showDialog = (bf2.a.ShowDialog) this.f19209f;
            final c0 c0Var = (c0) this.f19210g;
            uq.b.e();
            if (this.f19208e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final q qVar = q.this;
            return c0Var.d(new er.l() { // from class: bf2.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.d.O(c0Var, qVar, showDialog, (d.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(bf2.a.ShowDialog showDialog, c0<bf2.d.Screen> c0Var, tq.e<? super k10.l<? extends bf2.d>> eVar) {
            d dVar = q.this.new d(eVar);
            dVar.f19209f = showDialog;
            dVar.f19210g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lbf2/a$b;", "<unused var>", "Lk10/c0;", "Lbf2/d$b;", "state", "Lk10/l;", "Lbf2/d;", "<anonymous>", "(Lbf2/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<bf2.a.b, c0<bf2.d.Screen>, tq.e<? super k10.l<? extends bf2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19212e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f19213f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final bf2.d.Screen O(c0 c0Var, LocationCoordinates locationCoordinates, Coordinates coordinates, bf2.d.Screen screen) {
            return screen.b(ShowMapScreenStateData.b(((bf2.d.Screen) c0Var.a()).getShowMapScreenStateData(), locationCoordinates.getIsMyLocationEnabled(), null, null, null, null, coordinates, 30, null));
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0084, code lost:
        
            if (r6 == r1) goto L25;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f19213f
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r5.f19212e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L22
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                oq.u.b(r6)
                goto L87
            L16:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1e:
                oq.u.b(r6)
                goto L38
            L22:
                oq.u.b(r6)
                bf2.q r6 = bf2.q.this
                e14.a r6 = bf2.q.m9(r6)
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r5.f19213f = r0
                r5.f19212e = r4
                java.lang.Object r6 = r6.a(r2, r5)
                if (r6 != r1) goto L38
                goto L86
            L38:
                e14.a$a r6 = (e14.a.InterfaceC1068a) r6
                e14.a$a$a r2 = e14.a.InterfaceC1068a.EnumC1069a.NO_PERMISSIONS
                if (r6 != r2) goto L53
                bf2.q r6 = bf2.q.this
                bf2.a$h r1 = new bf2.a$h
                bf2.q r2 = bf2.q.this
                cb4.d r2 = bf2.q.k9(r2)
                r1.<init>(r2)
                bf2.q.l9(r6, r1)
                k10.l r6 = r0.c()
                return r6
            L53:
                e14.a$a$a r2 = e14.a.InterfaceC1068a.EnumC1069a.NO_GPS_ENABLED
                if (r6 != r2) goto L6c
                bf2.q r6 = bf2.q.this
                bf2.a$h r1 = new bf2.a$h
                bf2.q r2 = bf2.q.this
                cb4.d r2 = bf2.q.j9(r2)
                r1.<init>(r2)
                bf2.q.l9(r6, r1)
                k10.l r6 = r0.c()
                return r6
            L6c:
                e14.a$a$b r2 = e14.a.InterfaceC1068a.b.f46876a
                boolean r6 = fr.t.c(r6, r2)
                if (r6 == 0) goto Lac
                bf2.q r6 = bf2.q.this
                e14.g r6 = bf2.q.o9(r6)
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r5.f19213f = r0
                r5.f19212e = r3
                java.lang.Object r6 = r6.a(r2, r5)
                if (r6 != r1) goto L87
            L86:
                return r1
            L87:
                w04.a r6 = (w04.LocationCoordinates) r6
                boolean r1 = r6.getIsMyLocationEnabled()
                if (r1 == 0) goto L94
                vy.c r1 = r6.getCoordinates()
                goto La2
            L94:
                java.lang.Object r1 = r0.a()
                bf2.d$b r1 = (bf2.d.Screen) r1
                bf2.c r1 = r1.getShowMapScreenStateData()
                vy.c r1 = r1.getCameraPosition()
            La2:
                bf2.t r2 = new bf2.t
                r2.<init>()
                k10.l r6 = r0.b(r2)
                return r6
            Lac:
                oq.p r6 = new oq.p
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: bf2.q.e.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(bf2.a.b bVar, c0<bf2.d.Screen> c0Var, tq.e<? super k10.l<? extends bf2.d>> eVar) {
            e eVar2 = q.this.new e(eVar);
            eVar2.f19213f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lbf2/a$g;", "<unused var>", "Lbf2/d$b;", "Loq/i0;", "<anonymous>", "(Lbf2/a$g;Lbf2/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<bf2.a.g, bf2.d.Screen, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19215e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f19215e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            q.this.snackBarManagerStateHolder.B0();
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(bf2.a.g gVar, bf2.d.Screen screen, tq.e<? super i0> eVar) {
            return q.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lbf2/a$d;", "<unused var>", "Lbf2/d$a;", "Loq/i0;", "<anonymous>", "(Lbf2/a$d;Lbf2/d$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<bf2.a.d, bf2.d.Dialog, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19217e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f19217e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dx.i<? extends dx.b.Business, ? extends i0> iVarA = q.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            q qVar = q.this;
            if (iVarA instanceof dx.i.Left) {
                qVar.snackBarManagerStateHolder.y(new p50.a.DefaultWithIcon(qVar.labelProvider.c(ud2.a.E0), false, null, null, 14, null));
            }
            q.this.d9(bf2.a.C0484a.f19125a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(bf2.a.d dVar, bf2.d.Dialog dialog, tq.e<? super i0> eVar) {
            return q.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lbf2/a$c;", "<unused var>", "Lbf2/d$a;", "Loq/i0;", "<anonymous>", "(Lbf2/a$c;Lbf2/d$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<bf2.a.c, bf2.d.Dialog, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19219e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f19219e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.n nVar = q.this.goToDeviceLocationSettingsUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f19219e = 1;
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
            q qVar = q.this;
            if (iVar instanceof dx.i.Left) {
                qVar.snackBarManagerStateHolder.y(new p50.a.DefaultWithIcon(qVar.labelProvider.c(ud2.a.E0), false, null, null, 14, null));
            }
            q.this.d9(bf2.a.C0484a.f19125a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(bf2.a.c cVar, bf2.d.Dialog dialog, tq.e<? super i0> eVar) {
            return q.this.new h(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lbf2/a$a;", "<unused var>", "Lk10/c0;", "Lbf2/d$a;", "state", "Lk10/l;", "Lbf2/d;", "<anonymous>", "(Lbf2/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<bf2.a.C0484a, c0<bf2.d.Dialog>, tq.e<? super k10.l<? extends bf2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19221e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f19222f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final bf2.d.Screen O(c0 c0Var, bf2.d.Dialog dialog) {
            return new bf2.d.Screen(((bf2.d.Dialog) c0Var.a()).getShowMapScreenStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c0 c0Var = (c0) this.f19222f;
            uq.b.e();
            if (this.f19221e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: bf2.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.i.O(c0Var, (d.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(bf2.a.C0484a c0484a, c0<bf2.d.Dialog> c0Var, tq.e<? super k10.l<? extends bf2.d>> eVar) {
            i iVar = new i(eVar);
            iVar.f19222f = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    public q(yy.a aVar, mx.c cVar, cf2.a aVar2, i70.n nVar, e14.a aVar3, a14.n nVar2, e14.g gVar, a14.m mVar, cb4.j jVar, SetupData setupData) {
        this.labelProvider = cVar;
        this.mapper = aVar2;
        this.snackBarManagerStateHolder = nVar;
        this.checkAllConditionsToGetLocationUseCase = aVar3;
        this.goToDeviceLocationSettingsUseCase = nVar2;
        this.getLocationUseCase = gVar;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.dialogVMSFactory = jVar;
        this.setupData = setupData;
        this.snackBarVisibilityState = a9(nVar.j(), i70.p.a.f89857a);
        bf2.d.Screen screen = new bf2.d.Screen(new ShowMapScreenStateData(false, setupData.getCoordinates(), null, null, setupData.getCoordinates(), setupData.getCoordinates(), 12, null));
        this.initialState = screen;
        this.stateMachine = aVar.a(screen, new er.l() { // from class: bf2.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.z9(this.f19176a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), x9(screen));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(q qVar, z zVar) {
        zVar.A(qVar.new b(null));
        c cVar = qVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(bf2.a.f.class), oVar, cVar);
        zVar.v(q0.c(bf2.a.ShowDialog.class), oVar, qVar.new d(null));
        zVar.v(q0.c(bf2.a.b.class), oVar, qVar.new e(null));
        zVar.x(q0.c(bf2.a.g.class), oVar, qVar.new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(q qVar, z zVar) {
        g gVar = qVar.new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(bf2.a.d.class), oVar, gVar);
        zVar.x(q0.c(bf2.a.c.class), oVar, qVar.new h(null));
        zVar.v(q0.c(bf2.a.C0484a.class), oVar, new i(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DialogData u9() {
        cb4.h.b bVar = cb4.h.b.f24985a;
        Label labelC = this.labelProvider.c(ud2.a.C0);
        Label labelC2 = this.labelProvider.c(ud2.a.A0);
        DialogButtonTextData dialogButtonTextData = new DialogButtonTextData(this.labelProvider.c(ud2.a.f197770x0), null, b9(bf2.a.c.f19127a), 2, null);
        Label labelC3 = this.labelProvider.c(ud2.a.D0);
        cb4.a.C0668a c0668a = cb4.a.C0668a.f24967a;
        bf2.a.C0484a c0484a = bf2.a.C0484a.f19125a;
        return new DialogData(bVar, labelC, labelC2, dialogButtonTextData, new DialogButtonTextData(labelC3, c0668a, b9(c0484a)), null, b9(c0484a), 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DialogData v9() {
        cb4.h.b bVar = cb4.h.b.f24985a;
        Label labelC = this.labelProvider.c(ud2.a.f197774z0);
        Label labelC2 = this.labelProvider.c(ud2.a.f197772y0);
        DialogButtonTextData dialogButtonTextData = new DialogButtonTextData(this.labelProvider.c(ud2.a.f197770x0), null, b9(bf2.a.d.f19128a), 2, null);
        Label labelC3 = this.labelProvider.c(ud2.a.D0);
        cb4.a.C0668a c0668a = cb4.a.C0668a.f24967a;
        bf2.a.C0484a c0484a = bf2.a.C0484a.f19125a;
        return new DialogData(bVar, labelC, labelC2, dialogButtonTextData, new DialogButtonTextData(labelC3, c0668a, b9(c0484a)), null, b9(c0484a), 32, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bf2.e.Data x9(bf2.d state) {
        return this.mapper.b(new cf2.a.Params(state, b9(bf2.a.b.f19126a), b9(bf2.a.g.f19131a), b9(bf2.a.f.f19130a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(final q qVar, k10.v vVar) {
        vVar.c(q0.c(bf2.d.Screen.class), new er.l() { // from class: bf2.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.A9(this.f19174a, (z) obj);
            }
        });
        vVar.c(q0.c(bf2.d.Dialog.class), new er.l() { // from class: bf2.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.B9(this.f19175a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<bf2.a.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<bf2.d, bf2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<bf2.e.Data> getState() {
        return this.state;
    }

    @Override // bf2.e
    public mu.g<i70.p> j() {
        return this.snackBarVisibilityState;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: w9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(bf2.a.e eVar, tq.e<? super i0> eVar2) {
        return super.F(eVar, eVar2);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: y9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}
