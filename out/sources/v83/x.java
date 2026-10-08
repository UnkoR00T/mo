package v83;

import c93.TopicListSetupData;
import j40.DropDownButtonData;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import oo0.BEReportIssueReason;
import oo0.CategoryTopics;
import oo0.Topic;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.e1;
import pq.v0;
import x83.CommonInitializedData;
import x83.FieldData;
import x83.VehicleCardInitializedData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000æ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010%\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B\u0093\u0001\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\b\b\u0001\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020%H\u0016¢\u0006\u0004\b+\u0010,J$\u00101\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020*0/2\u0006\u0010.\u001a\u00020-H\u0082@¢\u0006\u0004\b1\u00102J3\u00109\u001a\u0002082\u0006\u00104\u001a\u0002032\f\u00106\u001a\b\u0012\u0004\u0012\u00020*052\f\u00107\u001a\b\u0012\u0004\u0012\u00020*05H\u0002¢\u0006\u0004\b9\u0010:J?\u0010B\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020=0A2\u0006\u0010<\u001a\u00020;2\u0006\u0010>\u001a\u00020=2\u0012\u0010@\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020=0?H\u0002¢\u0006\u0004\bB\u0010CJ\u0019\u0010D\u001a\u00020=2\b\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\bD\u0010ER\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010GR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R,\u0010d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030]8\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\b^\u0010_\u0012\u0004\bb\u0010c\u001a\u0004\b`\u0010aR&\u0010l\u001a\b\u0012\u0004\u0012\u00020f0e8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bg\u0010h\u0012\u0004\bk\u0010c\u001a\u0004\bi\u0010jR \u0010s\u001a\b\u0012\u0004\u0012\u00020n0m8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r¨\u0006t"}, d2 = {"Lv83/x;", "Ll00/g;", "Lv83/d;", "Lv83/a;", "Lv83/e;", "", "Lib4/c;", "genericDomainErrorMapper", "Lw83/d;", "reportErrorNavigationDialogMapper", "La14/w;", "openUrlIntentUseCase", "errorMapper", "Lw83/c;", "reasonListSetupDataMapper", "Lpo0/h;", "getReportIssueReasonsUC", "Ln83/e;", "validateVehicleCardReportFormUC", "Ln83/b;", "validateReportDescriptionUC", "Lmx/c;", "labelProvider", "Lu04/a;", "commonEndpoints", "Lw83/a;", "openDrivingLicenceReportLinkMapper", "Lyy/a;", "stateMachineFactory", "Lw83/q;", "reportErrorScreenMapper", "Ln83/a;", "sendReportErrorEmailUseCase", "Lpo0/i;", "loadReportIssueCategoriesUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Loo0/u;", "topic", "<init>", "(Lib4/c;Lw83/d;La14/w;Lib4/c;Lw83/c;Lpo0/h;Ln83/e;Ln83/b;Lmx/c;Lu04/a;Lw83/a;Lyy/a;Lw83/q;Ln83/a;Lpo0/i;Lac4/a;Loo0/u;)V", "data", "Loq/i0;", "F9", "(Loo0/u;)V", "", "url", "Ldx/i;", "Ldx/b$c;", "D9", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Ldx/b;", "error", "Lkotlin/Function0;", "retryAction", "closeAction", "Ljb4/b;", "B9", "(Ldx/b;Ler/a;Ler/a;)Ljb4/b;", "Lv83/c;", "field", "Lhz/b;", "validationState", "", "validationMap", "", "A9", "(Lv83/c;Lhz/b;Ljava/util/Map;)Ljava/util/Map;", "K9", "(Loo0/u;)Lhz/b;", "b", "Lib4/c;", "c", "Lw83/d;", "d", "La14/w;", "e", "f", "Lw83/c;", "g", "Lpo0/h;", "h", "Ln83/e;", "j", "Ln83/b;", "k", "Lmx/c;", "l", "Lu04/a;", "m", "Lw83/a;", "n", "Loo0/u;", "Lk10/t;", "p", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "()V", "stateMachine", "Lmu/p0;", "Lv83/e$a;", "q", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "state", "Lxw/b;", "Lv83/a$g;", "r", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class x extends l00.g<v83.d, v83.a> implements v83.e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w83.d reportErrorNavigationDialogMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final w83.c reasonListSetupDataMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final po0.h getReportIssueReasonsUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final n83.e validateVehicleCardReportFormUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final n83.b validateReportDescriptionUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final w83.a openDrivingLicenceReportLinkMapper;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Topic topic;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final k10.t<v83.d, v83.a> stateMachine;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<v83.e.a> state;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final xw.b<v83.a.g> navAction = new xw.b<>();

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f204633d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f204634e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f204636g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f204634e = obj;
            this.f204636g |= PKIFailureInfo.systemUnavail;
            return x.this.D9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lv83/a$t;", "action", "Lk10/c0;", "Lv83/d$b;", "state", "Lk10/l;", "Lv83/d;", "<anonymous>", "(Lv83/a$t;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class a0 extends vq.k implements er.q<v83.a.VehicleOwnerNamesInputChanged, k10.c0<v83.d.Initialized>, tq.e<? super k10.l<? extends v83.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f204637e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f204638f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f204639g;

        a0(tq.e<? super a0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v83.d.Initialized O(v83.a.VehicleOwnerNamesInputChanged vehicleOwnerNamesInputChanged, v83.d.Initialized initialized) {
            return v83.d.Initialized.b(initialized, null, VehicleCardInitializedData.b(initialized.getVehicleCardData(), null, null, Field.b(initialized.getVehicleCardData().h(), vehicleOwnerNamesInputChanged.getNames(), null, 2, null), null, null, null, 59, null), null, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final v83.a.VehicleOwnerNamesInputChanged vehicleOwnerNamesInputChanged = (v83.a.VehicleOwnerNamesInputChanged) this.f204638f;
            k10.c0 c0Var = (k10.c0) this.f204639g;
            uq.b.e();
            if (this.f204637e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: v83.n0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.a0.O(vehicleOwnerNamesInputChanged, (d.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(v83.a.VehicleOwnerNamesInputChanged vehicleOwnerNamesInputChanged, k10.c0<v83.d.Initialized> c0Var, tq.e<? super k10.l<? extends v83.d>> eVar) {
            a0 a0Var = new a0(eVar);
            a0Var.f204638f = vehicleOwnerNamesInputChanged;
            a0Var.f204639g = c0Var;
            return a0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<v83.e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f204640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ w83.q f204641b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ x f204642c;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f204643a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ w83.q f204644b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ x f204645c;

            /* JADX INFO: renamed from: v83.x$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5343a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f204646d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f204647e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f204648f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f204650h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f204651j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f204652k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f204653l;

                public C5343a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f204646d = obj;
                    this.f204647e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, w83.q qVar, x xVar) {
                this.f204643a = hVar;
                this.f204644b = qVar;
                this.f204645c = xVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5343a c5343a;
                if (eVar instanceof C5343a) {
                    c5343a = (C5343a) eVar;
                    int i15 = c5343a.f204647e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5343a.f204647e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5343a = new C5343a(eVar);
                    }
                } else {
                    c5343a = new C5343a(eVar);
                }
                Object obj2 = c5343a.f204646d;
                Object objE = uq.b.e();
                int i16 = c5343a.f204647e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f204643a;
                    v83.e.a aVarB = this.f204644b.b(new w83.q.Params((v83.d) obj, this.f204645c.b9(new v83.a.Close(false)), this.f204645c.b9(v83.a.h.f204507a), this.f204645c.new c(), this.f204645c.b9(v83.a.j.f204509a), this.f204645c.b9(v83.a.e.f204499a), this.f204645c.new d(), this.f204645c.new e(), this.f204645c.new f(), this.f204645c.new g(), this.f204645c.new h(), this.f204645c.new i(), this.f204645c.new j()));
                    c5343a.f204648f = vq.j.a(obj);
                    c5343a.f204650h = vq.j.a(c5343a);
                    c5343a.f204651j = vq.j.a(obj);
                    c5343a.f204652k = vq.j.a(hVar);
                    c5343a.f204653l = 0;
                    c5343a.f204647e = 1;
                    if (hVar.F(aVarB, c5343a) == objE) {
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

        public b(mu.g gVar, w83.q qVar, x xVar) {
            this.f204640a = gVar;
            this.f204641b = qVar;
            this.f204642c = xVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super v83.e.a> hVar, tq.e eVar) {
            Object objA = this.f204640a.a(new a(hVar, this.f204641b, this.f204642c), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lv83/a$u;", "action", "Lk10/c0;", "Lv83/d$b;", "state", "Lk10/l;", "Lv83/d;", "<anonymous>", "(Lv83/a$u;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b0 extends vq.k implements er.q<v83.a.VehicleOwnerStatusChanged, k10.c0<v83.d.Initialized>, tq.e<? super k10.l<? extends v83.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f204654e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f204655f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f204656g;

        b0(tq.e<? super b0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v83.d.Initialized O(x xVar, hz.b bVar, k10.c0 c0Var, v83.a.VehicleOwnerStatusChanged vehicleOwnerStatusChanged, v83.d.Initialized initialized) {
            return v83.d.Initialized.b(initialized, null, VehicleCardInitializedData.b(initialized.getVehicleCardData(), xVar.A9(v83.c.OWNERSHIP_STATUS, bVar, ((v83.d.Initialized) c0Var.a()).getVehicleCardData().c()), null, null, Field.b(initialized.getVehicleCardData().e(), vehicleOwnerStatusChanged.getStatus(), null, 2, null), null, null, 54, null), null, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final hz.b value;
            final v83.a.VehicleOwnerStatusChanged vehicleOwnerStatusChanged = (v83.a.VehicleOwnerStatusChanged) this.f204655f;
            final k10.c0 c0Var = (k10.c0) this.f204656g;
            Object objE = uq.b.e();
            int i15 = this.f204654e;
            if (i15 == 0) {
                oq.u.b(obj);
                n83.e eVar = x.this.validateVehicleCardReportFormUC;
                n83.e.Params params = new n83.e.Params(e1.d(new n83.e.Params.a.b(vehicleOwnerStatusChanged.getStatus())));
                this.f204655f = vehicleOwnerStatusChanged;
                this.f204656g = c0Var;
                this.f204654e = 1;
                obj = eVar.j(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            n83.e.Results.a aVar = (n83.e.Results.a) pq.v.m0(((n83.e.Results) obj).a());
            if (aVar == null || (value = aVar.getValue()) == null) {
                value = hz.b.C2039b.f86846c;
            }
            final x xVar = x.this;
            return c0Var.b(new er.l() { // from class: v83.o0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.b0.O(xVar, value, c0Var, vehicleOwnerStatusChanged, (d.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(v83.a.VehicleOwnerStatusChanged vehicleOwnerStatusChanged, k10.c0<v83.d.Initialized> c0Var, tq.e<? super k10.l<? extends v83.d>> eVar) {
            b0 b0Var = x.this.new b0(eVar);
            b0Var.f204655f = vehicleOwnerStatusChanged;
            b0Var.f204656g = c0Var;
            return b0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements er.l<String, oq.i0> {
        c() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(String str) {
            c(str);
            return oq.i0.f148189a;
        }

        public final void c(String str) {
            x.this.d9(new v83.a.DescriptionInputChange(str));
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lv83/a$d;", "action", "Lk10/c0;", "Lv83/d$b;", "state", "Lk10/l;", "Lv83/d;", "<anonymous>", "(Lv83/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c0 extends vq.k implements er.q<v83.a.DrivingLicenceIssueTypeChange, k10.c0<v83.d.Initialized>, tq.e<? super k10.l<? extends v83.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f204659e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f204660f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f204661g;

        c0(tq.e<? super c0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v83.d.Initialized O(v83.a.DrivingLicenceIssueTypeChange drivingLicenceIssueTypeChange, v83.d.Initialized initialized) {
            return v83.d.Initialized.b(initialized, null, null, drivingLicenceIssueTypeChange.getType(), 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final v83.a.DrivingLicenceIssueTypeChange drivingLicenceIssueTypeChange = (v83.a.DrivingLicenceIssueTypeChange) this.f204660f;
            k10.c0 c0Var = (k10.c0) this.f204661g;
            uq.b.e();
            if (this.f204659e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: v83.p0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.c0.O(drivingLicenceIssueTypeChange, (d.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(v83.a.DrivingLicenceIssueTypeChange drivingLicenceIssueTypeChange, k10.c0<v83.d.Initialized> c0Var, tq.e<? super k10.l<? extends v83.d>> eVar) {
            c0 c0Var2 = new c0(eVar);
            c0Var2.f204660f = drivingLicenceIssueTypeChange;
            c0Var2.f204661g = c0Var;
            return c0Var2.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d implements er.l<String, oq.i0> {
        d() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(String str) {
            c(str);
            return oq.i0.f148189a;
        }

        public final void c(String str) {
            x.this.d9(new v83.a.VehicleNumberInputChange(str));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv83/a$i;", "<unused var>", "Lv83/d$b;", "Loq/i0;", "<anonymous>", "(Lv83/a$i;Lv83/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d0 extends vq.k implements er.q<v83.a.i, v83.d.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f204663e;

        d0(tq.e<? super d0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f204663e;
            if (i15 == 0) {
                oq.u.b(obj);
                x xVar = x.this;
                String strE = xVar.commonEndpoints.E();
                this.f204663e = 1;
                if (xVar.D9(strE, this) == objE) {
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
        public final Object w(v83.a.i iVar, v83.d.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return x.this.new d0(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e implements er.l<x83.c, oq.i0> {
        e() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(x83.c cVar) {
            c(cVar);
            return oq.i0.f148189a;
        }

        public final void c(x83.c cVar) {
            x.this.d9(new v83.a.DrivingLicenceIssueTypeChange(cVar));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lv83/a$b;", "action", "Lv83/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lv83/a$b;Lv83/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class e0 extends vq.k implements er.q<v83.a.Close, v83.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f204666e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f204667f;

        e0(tq.e<? super e0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 V(x xVar) {
            xVar.d9(new v83.a.Close(false, 1, null));
            return oq.i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 X() {
            return oq.i0.f148189a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            if (r9.F(r2, r8) == r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
        
            if (r9.F(r2, r8) == r1) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
        
            return r1;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f204667f
                v83.a$b r0 = (v83.a.Close) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r8.f204666e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L1f
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L13
                goto L1b
            L13:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1b:
                oq.u.b(r9)
                goto L74
            L1f:
                oq.u.b(r9)
                boolean r9 = r0.getSkipDialog()
                if (r9 == 0) goto L3f
                v83.x r9 = v83.x.this
                xw.b r9 = r9.Y1()
                v83.a$g$a r2 = v83.a.g.C5337a.f204501a
                java.lang.Object r0 = vq.j.a(r0)
                r8.f204667f = r0
                r8.f204666e = r4
                java.lang.Object r9 = r9.F(r2, r8)
                if (r9 != r1) goto L74
                goto L73
            L3f:
                v83.x r9 = v83.x.this
                xw.b r9 = r9.Y1()
                v83.a$g$d r2 = new v83.a$g$d
                v83.x r4 = v83.x.this
                w83.d r4 = v83.x.s9(r4)
                w83.d$a r5 = new w83.d$a
                v83.x r6 = v83.x.this
                v83.q0 r7 = new v83.q0
                r7.<init>()
                v83.r0 r6 = new v83.r0
                r6.<init>()
                r5.<init>(r7, r6)
                cb4.d r4 = r4.b(r5)
                r2.<init>(r4)
                java.lang.Object r0 = vq.j.a(r0)
                r8.f204667f = r0
                r8.f204666e = r3
                java.lang.Object r9 = r9.F(r2, r8)
                if (r9 != r1) goto L74
            L73:
                return r1
            L74:
                oq.i0 r9 = oq.i0.f148189a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: v83.x.e0.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(v83.a.Close close, v83.d dVar, tq.e<? super oq.i0> eVar) {
            e0 e0Var = x.this.new e0(eVar);
            e0Var.f204667f = close;
            return e0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f implements er.l<DropDownButtonData, oq.i0> {
        f() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(DropDownButtonData dropDownButtonData) {
            c(dropDownButtonData);
            return oq.i0.f148189a;
        }

        public final void c(DropDownButtonData dropDownButtonData) {
            x.this.d9(v83.a.n.f204513a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g implements er.l<x83.f, oq.i0> {
        g() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(x83.f fVar) {
            c(fVar);
            return oq.i0.f148189a;
        }

        public final void c(x83.f fVar) {
            x.this.d9(new v83.a.VehicleOwnerStatusChanged(fVar));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class h implements er.l<String, oq.i0> {
        h() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(String str) {
            c(str);
            return oq.i0.f148189a;
        }

        public final void c(String str) {
            x.this.d9(new v83.a.VehicleOwnerNamesInputChanged(str));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class i implements er.l<v83.c, oq.i0> {
        i() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(v83.c cVar) {
            c(cVar);
            return oq.i0.f148189a;
        }

        public final void c(v83.c cVar) {
            x.this.d9(new v83.a.ValidateField(cVar));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class j implements er.l<v83.c, oq.i0> {
        j() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(v83.c cVar) {
            c(cVar);
            return oq.i0.f148189a;
        }

        public final void c(v83.c cVar) {
            x.this.d9(new v83.a.ClearValidation(cVar));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lv83/d$a;", "state", "Loq/i0;", "<anonymous>", "(Lv83/d$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.p<v83.d.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f204674e;

        k(tq.e<? super k> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f204674e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            x.this.d9(v83.a.f.f204500a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(v83.d.a aVar, tq.e<? super oq.i0> eVar) {
            return ((k) v(aVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return x.this.new k(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lv83/a$f;", "<unused var>", "Lk10/c0;", "Lv83/d$a;", "state", "Lk10/l;", "Lv83/d;", "<anonymous>", "(Lv83/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<v83.a.f, k10.c0<v83.d.a>, tq.e<? super k10.l<? extends v83.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f204676e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f204677f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ ac4.a f204678g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ po0.i f204679h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ x f204680j;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lv83/d;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends v83.d>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f204681e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f204682f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f204683g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f204684h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f204685j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f204686k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ po0.i f204687l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ x f204688m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ k10.c0<v83.d.a> f204689n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(po0.i iVar, x xVar, k10.c0<v83.d.a> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f204687l = iVar;
                this.f204688m = xVar;
                this.f204689n = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final v83.d.Initialized V(List list, v83.d.a aVar) {
                return new v83.d.Initialized(new CommonInitializedData(list, null, null, 6, null), null, null, 6, null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                k10.c0<v83.d.a> c0Var;
                Object objE = uq.b.e();
                int i15 = this.f204686k;
                if (i15 == 0) {
                    oq.u.b(obj);
                    po0.i iVar = this.f204687l;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f204686k = 1;
                    obj = iVar.c(c1792a, this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i15 == 1) {
                    oq.u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0Var = (k10.c0) this.f204682f;
                    oq.u.b(obj);
                }
                return c0Var.c();
                dx.i iVar2 = (dx.i) obj;
                x xVar = this.f204688m;
                k10.c0<v83.d.a> c0Var2 = this.f204689n;
                if (!(iVar2 instanceof dx.i.Left)) {
                    if (!(iVar2 instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    final List list = (List) ((dx.i.Right) iVar2).b();
                    return c0Var2.d(new er.l() { // from class: v83.y
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return x.l.a.V(list, (d.a) obj2);
                        }
                    });
                }
                dx.b bVar = (dx.b) ((dx.i.Left) iVar2).b();
                xw.b<v83.a.g> bVarY1 = xVar.Y1();
                v83.a.g.Error error = new v83.a.g.Error(xVar.B9(bVar, xVar.b9(v83.a.f.f204500a), xVar.b9(new v83.a.Close(false, 1, null))));
                this.f204681e = vq.j.a(iVar2);
                this.f204682f = c0Var2;
                this.f204683g = vq.j.a(bVar);
                this.f204684h = 0;
                this.f204685j = 0;
                this.f204686k = 2;
                if (bVarY1.F(error, this) != objE) {
                    c0Var = c0Var2;
                    return c0Var.c();
                }
                return objE;
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f204687l, this.f204688m, this.f204689n, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends v83.d>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(ac4.a aVar, po0.i iVar, x xVar, tq.e<? super l> eVar) {
            super(3, eVar);
            this.f204678g = aVar;
            this.f204679h = iVar;
            this.f204680j = xVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f204677f;
            Object objE = uq.b.e();
            int i15 = this.f204676e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = this.f204678g;
            a aVar2 = new a(this.f204679h, this.f204680j, c0Var, null);
            this.f204677f = vq.j.a(c0Var);
            this.f204676e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(v83.a.f fVar, k10.c0<v83.d.a> c0Var, tq.e<? super k10.l<? extends v83.d>> eVar) {
            l lVar = new l(this.f204678g, this.f204679h, this.f204680j, eVar);
            lVar.f204677f = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv83/a$l;", "<unused var>", "Lv83/d$b;", "Loq/i0;", "<anonymous>", "(Lv83/a$l;Lv83/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<v83.a.l, v83.d.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f204690e;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O() {
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f204690e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<v83.a.g> bVarY1 = x.this.Y1();
                v83.a.g.ShowNavigationDialog showNavigationDialog = new v83.a.g.ShowNavigationDialog(x.this.openDrivingLicenceReportLinkMapper.b(new w83.a.Params(x.this.b9(v83.a.i.f204508a), new er.a() { // from class: v83.b0
                    @Override // er.a
                    public final Object a() {
                        return x.m.O();
                    }
                })));
                this.f204690e = 1;
                if (bVarY1.F(showNavigationDialog, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(v83.a.l lVar, v83.d.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return x.this.new m(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lv83/a$h;", "<unused var>", "Lv83/d$b;", "state", "Loq/i0;", "<anonymous>", "(Lv83/a$h;Lv83/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<v83.a.h, v83.d.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f204692e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f204693f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        private static final boolean N(v83.d.Initialized initialized) {
            Topic topicD = initialized.getCommonFormData().e().d();
            return (topicD != null ? topicD.getType() : null) == Topic.b.DRIVING_LICENCE && initialized.getDrivingLicenceIssueType() == x83.c.DATA_DISCREPANCY;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            v83.d.Initialized initialized = (v83.d.Initialized) this.f204693f;
            uq.b.e();
            if (this.f204692e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (N(initialized)) {
                x.this.d9(v83.a.l.f204511a);
            } else {
                x.this.d9(v83.a.q.f204516a);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(v83.a.h hVar, v83.d.Initialized initialized, tq.e<? super oq.i0> eVar) {
            n nVar = x.this.new n(eVar);
            nVar.f204693f = initialized;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lv83/a$k;", "action", "Lv83/d$b;", "state", "Loq/i0;", "<anonymous>", "(Lv83/a$k;Lv83/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<v83.a.SendForm, v83.d.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f204695e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f204696f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f204697g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f204698h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f204699j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f204700k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f204701l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ n83.a f204702m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ x f204703n;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f204704a;

            static {
                int[] iArr = new int[Topic.b.values().length];
                try {
                    iArr[Topic.b.VEHICLE_CARD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f204704a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(n83.a aVar, x xVar, tq.e<? super o> eVar) {
            super(3, eVar);
            this.f204702m = aVar;
            this.f204703n = xVar;
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0093  */
        /* JADX WARN: Code duplicated, block: B:21:0x00e2  */
        /* JADX WARN: Code duplicated, block: B:23:0x00e6  */
        /* JADX WARN: Code duplicated, block: B:26:0x011c  */
        /* JADX WARN: Code duplicated, block: B:33:0x0166  */
        /* JADX WARN: Code duplicated, block: B:36:0x01b4  */
        /* JADX WARN: Code duplicated, block: B:38:0x01b8  */
        /* JADX WARN: Code duplicated, block: B:43:0x01f0  */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x00de, code lost:
        
            if (r8.F(r9, r12) == r2) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0118, code lost:
        
            if (r3.F(r5, r12) == r2) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x01b1, code lost:
        
            if (r8.F(r9, r12) == r2) goto L40;
         */
        /* JADX WARN: Code restructure failed: missing block: B:39:0x01ea, code lost:
        
            if (r3.F(r5, r12) == r2) goto L40;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r13) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 520
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: v83.x.o.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(v83.a.SendForm sendForm, v83.d.Initialized initialized, tq.e<? super oq.i0> eVar) {
            o oVar = new o(this.f204702m, this.f204703n, eVar);
            oVar.f204700k = sendForm;
            oVar.f204701l = initialized;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lv83/a$r;", "<unused var>", "Lk10/c0;", "Lv83/d$b;", "state", "Lk10/l;", "Lv83/d;", "<anonymous>", "(Lv83/a$r;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<v83.a.r, k10.c0<v83.d.Initialized>, tq.e<? super k10.l<? extends v83.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f204705e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f204706f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f204707g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f204708h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f204709j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f204710k;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v83.d.Initialized O(hz.b bVar, hz.b bVar2, Map map, v83.d.Initialized initialized) {
            return v83.d.Initialized.b(initialized, CommonInitializedData.b(initialized.getCommonFormData(), null, FieldData.b(initialized.getCommonFormData().e(), null, bVar, 1, null), FieldData.b(initialized.getCommonFormData().d(), null, bVar2, 1, null), 1, null), VehicleCardInitializedData.b(initialized.getVehicleCardData(), map, null, null, null, null, null, 62, null), null, 4, null);
        }

        /* JADX WARN: Code duplicated, block: B:30:0x0136  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final hz.b bVarA;
            final hz.b bVar;
            oq.r rVarA;
            Topic topicD;
            k10.c0 c0Var = (k10.c0) this.f204710k;
            Object objE = uq.b.e();
            int i15 = this.f204709j;
            if (i15 == 0) {
                oq.u.b(obj);
                bVarA = x.this.validateReportDescriptionUC.b(new n83.b.Params(((v83.d.Initialized) c0Var.a()).getCommonFormData().d().d())).a();
                hz.b bVarK9 = x.this.K9(((v83.d.Initialized) c0Var.a()).getCommonFormData().e().d());
                VehicleCardInitializedData vehicleCardData = ((v83.d.Initialized) c0Var.a()).getVehicleCardData();
                n83.e eVar = x.this.validateVehicleCardReportFormUC;
                n83.e.Params params = new n83.e.Params(e1.i(new n83.e.Params.a.C3307d(vehicleCardData.f().c()), new n83.e.Params.a.C3306a(vehicleCardData.h().c()), new n83.e.Params.a.b(vehicleCardData.e().c()), new n83.e.Params.a.c(vehicleCardData.d().c())));
                this.f204710k = c0Var;
                this.f204705e = bVarA;
                this.f204706f = bVarK9;
                this.f204707g = vq.j.a(vehicleCardData);
                this.f204708h = 0;
                this.f204709j = 1;
                Object objJ = eVar.j(params, this);
                if (objJ == objE) {
                    return objE;
                }
                bVar = bVarK9;
                obj = objJ;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar = (hz.b) this.f204706f;
                bVarA = (hz.b) this.f204705e;
                oq.u.b(obj);
            }
            n83.e.Results results = (n83.e.Results) obj;
            Set<n83.e.Results.a> setA = results.a();
            if (!(setA instanceof Collection) || !setA.isEmpty()) {
                Iterator<T> it = setA.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((n83.e.Results.a) it.next()).getValue() instanceof hz.b.Invalid) {
                        }
                    } else if (!(bVar instanceof hz.b.Invalid) && !(bVarA instanceof hz.b.Invalid)) {
                        topicD = ((v83.d.Initialized) c0Var.a()).getCommonFormData().e().d();
                        if (topicD != null) {
                            x.this.d9(new v83.a.SendForm(topicD));
                        }
                        return c0Var.c();
                    }
                }
            } else if (!(bVar instanceof hz.b.Invalid)) {
                topicD = ((v83.d.Initialized) c0Var.a()).getCommonFormData().e().d();
                if (topicD != null) {
                    x.this.d9(new v83.a.SendForm(topicD));
                }
                return c0Var.c();
            }
            Set<n83.e.Results.a> setA2 = results.a();
            final LinkedHashMap linkedHashMap = new LinkedHashMap(lr.m.e(v0.e(pq.v.y(setA2, 10)), 16));
            for (n83.e.Results.a aVar : setA2) {
                if (aVar instanceof n83.e.Results.a.d) {
                    rVarA = oq.y.a(v83.c.VEHICLE_NUMBER, ((n83.e.Results.a.d) aVar).getValue());
                } else if (aVar instanceof n83.e.Results.a.C3309a) {
                    rVarA = oq.y.a(v83.c.OWNER_NAMES, ((n83.e.Results.a.C3309a) aVar).getValue());
                } else if (aVar instanceof n83.e.Results.a.b) {
                    rVarA = oq.y.a(v83.c.OWNERSHIP_STATUS, ((n83.e.Results.a.b) aVar).getValue());
                } else {
                    if (!(aVar instanceof n83.e.Results.a.c)) {
                        throw new oq.p();
                    }
                    rVarA = oq.y.a(v83.c.REPORT_REASON, ((n83.e.Results.a.c) aVar).getValue());
                }
                linkedHashMap.put(rVarA.c(), rVarA.d());
            }
            return c0Var.b(new er.l() { // from class: v83.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.p.O(bVar, bVarA, linkedHashMap, (d.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(v83.a.r rVar, k10.c0<v83.d.Initialized> c0Var, tq.e<? super k10.l<? extends v83.d>> eVar) {
            p pVar = x.this.new p(eVar);
            pVar.f204710k = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lv83/a$q;", "<unused var>", "Lk10/c0;", "Lv83/d$b;", "state", "Lk10/l;", "Lv83/d;", "<anonymous>", "(Lv83/a$q;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<v83.a.q, k10.c0<v83.d.Initialized>, tq.e<? super k10.l<? extends v83.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f204712e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f204713f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f204715a;

            static {
                int[] iArr = new int[Topic.b.values().length];
                try {
                    iArr[Topic.b.VEHICLE_CARD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f204715a = iArr;
            }
        }

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v83.d.Initialized O(hz.b bVar, hz.b bVar2, v83.d.Initialized initialized) {
            return v83.d.Initialized.b(initialized, CommonInitializedData.b(initialized.getCommonFormData(), null, FieldData.b(initialized.getCommonFormData().e(), null, bVar, 1, null), FieldData.b(initialized.getCommonFormData().d(), null, bVar2, 1, null), 1, null), null, null, 6, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Topic topicD;
            k10.c0 c0Var = (k10.c0) this.f204713f;
            uq.b.e();
            if (this.f204712e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            Topic topicD2 = ((v83.d.Initialized) c0Var.a()).getCommonFormData().e().d();
            Topic.b type = topicD2 != null ? topicD2.getType() : null;
            if ((type == null ? -1 : a.f204715a[type.ordinal()]) == 1) {
                x.this.d9(v83.a.r.f204517a);
                return c0Var.c();
            }
            final hz.b bVarA = x.this.validateReportDescriptionUC.b(new n83.b.Params(((v83.d.Initialized) c0Var.a()).getCommonFormData().d().d())).a();
            final hz.b bVarK9 = x.this.K9(((v83.d.Initialized) c0Var.a()).getCommonFormData().e().d());
            if ((bVarK9 instanceof hz.b.d) && (bVarA instanceof hz.b.d) && (topicD = ((v83.d.Initialized) c0Var.a()).getCommonFormData().e().d()) != null) {
                x.this.d9(new v83.a.SendForm(topicD));
            }
            return c0Var.b(new er.l() { // from class: v83.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.q.O(bVarK9, bVarA, (d.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(v83.a.q qVar, k10.c0<v83.d.Initialized> c0Var, tq.e<? super k10.l<? extends v83.d>> eVar) {
            q qVar2 = x.this.new q(eVar);
            qVar2.f204713f = c0Var;
            return qVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lv83/a$o;", "action", "Lk10/c0;", "Lv83/d$b;", "state", "Lk10/l;", "Lv83/d;", "<anonymous>", "(Lv83/a$o;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<v83.a.TopicSelected, k10.c0<v83.d.Initialized>, tq.e<? super k10.l<? extends v83.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f204716e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f204717f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f204718g;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v83.d.Initialized O(v83.a.TopicSelected topicSelected, v83.d.Initialized initialized) {
            return v83.d.Initialized.b(initialized, CommonInitializedData.b(initialized.getCommonFormData(), null, FieldData.b(initialized.getCommonFormData().e(), topicSelected.getTopic(), null, 2, null), new FieldData("", hz.b.C2039b.f86846c), 1, null), new VehicleCardInitializedData(null, null, null, null, null, null, 63, null), null, 4, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final v83.a.TopicSelected topicSelected = (v83.a.TopicSelected) this.f204717f;
            k10.c0 c0Var = (k10.c0) this.f204718g;
            uq.b.e();
            if (this.f204716e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return !fr.t.c(topicSelected.getTopic(), Topic.INSTANCE.a()) ? c0Var.b(new er.l() { // from class: v83.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.r.O(topicSelected, (d.Initialized) obj2);
                }
            }) : c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(v83.a.TopicSelected topicSelected, k10.c0<v83.d.Initialized> c0Var, tq.e<? super k10.l<? extends v83.d>> eVar) {
            r rVar = new r(eVar);
            rVar.f204717f = topicSelected;
            rVar.f204718g = c0Var;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lv83/a$c;", "action", "Lk10/c0;", "Lv83/d$b;", "state", "Lk10/l;", "Lv83/d;", "<anonymous>", "(Lv83/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<v83.a.DescriptionInputChange, k10.c0<v83.d.Initialized>, tq.e<? super k10.l<? extends v83.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f204719e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f204720f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f204721g;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v83.d.Initialized O(v83.a.DescriptionInputChange descriptionInputChange, v83.d.Initialized initialized) {
            return v83.d.Initialized.b(initialized, CommonInitializedData.b(initialized.getCommonFormData(), null, null, FieldData.b(initialized.getCommonFormData().d(), descriptionInputChange.getDescription(), null, 2, null), 3, null), null, null, 6, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final v83.a.DescriptionInputChange descriptionInputChange = (v83.a.DescriptionInputChange) this.f204720f;
            k10.c0 c0Var = (k10.c0) this.f204721g;
            uq.b.e();
            if (this.f204719e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: v83.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.s.O(descriptionInputChange, (d.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(v83.a.DescriptionInputChange descriptionInputChange, k10.c0<v83.d.Initialized> c0Var, tq.e<? super k10.l<? extends v83.d>> eVar) {
            s sVar = new s(eVar);
            sVar.f204720f = descriptionInputChange;
            sVar.f204721g = c0Var;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lv83/a$e;", "<unused var>", "Lv83/d$b;", "state", "Loq/i0;", "<anonymous>", "(Lv83/a$e;Lv83/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<v83.a.e, v83.d.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f204722e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f204723f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f204724g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f204725h;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            v83.d.Initialized initialized = (v83.d.Initialized) this.f204725h;
            Object objE = uq.b.e();
            int i15 = this.f204724g;
            if (i15 == 0) {
                oq.u.b(obj);
                Topic topicD = initialized.getCommonFormData().e().d();
                if (topicD != null) {
                    x xVar = x.this;
                    v83.a.g.GoToInfoPage goToInfoPage = new v83.a.g.GoToInfoPage(topicD);
                    this.f204725h = vq.j.a(initialized);
                    this.f204722e = vq.j.a(topicD);
                    this.f204723f = 0;
                    this.f204724g = 1;
                    if (xVar.F(goToInfoPage, this) == objE) {
                        return objE;
                    }
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
        public final Object w(v83.a.e eVar, v83.d.Initialized initialized, tq.e<? super oq.i0> eVar2) {
            t tVar = x.this.new t(eVar2);
            tVar.f204725h = initialized;
            return tVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lv83/a$j;", "<unused var>", "Lv83/d$b;", "state", "Loq/i0;", "<anonymous>", "(Lv83/a$j;Lv83/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<v83.a.j, v83.d.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f204727e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f204728f;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            v83.d.Initialized initialized = (v83.d.Initialized) this.f204728f;
            Object objE = uq.b.e();
            int i15 = this.f204727e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<v83.a.g> bVarY1 = x.this.Y1();
                List<CategoryTopics> listC = initialized.getCommonFormData().c();
                Topic topicD = initialized.getCommonFormData().e().d();
                v83.a.g.ShowTopicList showTopicList = new v83.a.g.ShowTopicList(new TopicListSetupData(listC, topicD != null ? topicD.getType() : null));
                this.f204728f = vq.j.a(initialized);
                this.f204727e = 1;
                if (bVarY1.F(showTopicList, this) == objE) {
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
        public final Object w(v83.a.j jVar, v83.d.Initialized initialized, tq.e<? super oq.i0> eVar) {
            u uVar = x.this.new u(eVar);
            uVar.f204728f = initialized;
            return uVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lv83/a$n;", "<unused var>", "Lk10/c0;", "Lv83/d$b;", "state", "Lk10/l;", "Lv83/d;", "<anonymous>", "(Lv83/a$n;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<v83.a.n, k10.c0<v83.d.Initialized>, tq.e<? super k10.l<? extends v83.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f204730e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f204731f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f204732g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f204733h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f204734j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f204735k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f204736l;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 V(x xVar, BEReportIssueReason bEReportIssueReason) {
            xVar.d9(new v83.a.VehicleReportReasonSelected(bEReportIssueReason));
            return oq.i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v83.d.Initialized X(List list, v83.d.Initialized initialized) {
            return v83.d.Initialized.b(initialized, null, VehicleCardInitializedData.b(initialized.getVehicleCardData(), null, null, null, null, null, list, 31, null), null, 5, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x00a1, code lost:
        
            if (r6.F(r8, r11) == r1) goto L26;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 257
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: v83.x.v.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(v83.a.n nVar, k10.c0<v83.d.Initialized> c0Var, tq.e<? super k10.l<? extends v83.d>> eVar) {
            v vVar = x.this.new v(eVar);
            vVar.f204736l = c0Var;
            return vVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lv83/a$v;", "action", "Lk10/c0;", "Lv83/d$b;", "state", "Lk10/l;", "Lv83/d;", "<anonymous>", "(Lv83/a$v;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<v83.a.VehicleReportReasonSelected, k10.c0<v83.d.Initialized>, tq.e<? super k10.l<? extends v83.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f204738e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f204739f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f204740g;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v83.d.Initialized O(x xVar, hz.b bVar, k10.c0 c0Var, v83.a.VehicleReportReasonSelected vehicleReportReasonSelected, v83.d.Initialized initialized) {
            return v83.d.Initialized.b(initialized, null, VehicleCardInitializedData.b(initialized.getVehicleCardData(), xVar.A9(v83.c.REPORT_REASON, bVar, ((v83.d.Initialized) c0Var.a()).getVehicleCardData().c()), null, null, null, Field.b(initialized.getVehicleCardData().d(), vehicleReportReasonSelected.getIssueReason(), null, 2, null), null, 46, null), null, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final hz.b value;
            final v83.a.VehicleReportReasonSelected vehicleReportReasonSelected = (v83.a.VehicleReportReasonSelected) this.f204739f;
            final k10.c0 c0Var = (k10.c0) this.f204740g;
            Object objE = uq.b.e();
            int i15 = this.f204738e;
            if (i15 == 0) {
                oq.u.b(obj);
                n83.e eVar = x.this.validateVehicleCardReportFormUC;
                n83.e.Params params = new n83.e.Params(e1.d(new n83.e.Params.a.c(vehicleReportReasonSelected.getIssueReason())));
                this.f204739f = vehicleReportReasonSelected;
                this.f204740g = c0Var;
                this.f204738e = 1;
                obj = eVar.j(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            n83.e.Results.a aVar = (n83.e.Results.a) pq.v.m0(((n83.e.Results) obj).a());
            if (aVar == null || (value = aVar.getValue()) == null) {
                value = hz.b.C2039b.f86846c;
            }
            final x xVar = x.this;
            return c0Var.b(new er.l() { // from class: v83.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.w.O(xVar, value, c0Var, vehicleReportReasonSelected, (d.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(v83.a.VehicleReportReasonSelected vehicleReportReasonSelected, k10.c0<v83.d.Initialized> c0Var, tq.e<? super k10.l<? extends v83.d>> eVar) {
            w wVar = x.this.new w(eVar);
            wVar.f204739f = vehicleReportReasonSelected;
            wVar.f204740g = c0Var;
            return wVar.J(oq.i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: v83.x$x, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lv83/a$s;", "action", "Lk10/c0;", "Lv83/d$b;", "state", "Lk10/l;", "Lv83/d;", "<anonymous>", "(Lv83/a$s;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class C5344x extends vq.k implements er.q<v83.a.VehicleNumberInputChange, k10.c0<v83.d.Initialized>, tq.e<? super k10.l<? extends v83.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f204742e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f204743f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f204744g;

        C5344x(tq.e<? super C5344x> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v83.d.Initialized O(v83.a.VehicleNumberInputChange vehicleNumberInputChange, v83.d.Initialized initialized) {
            return v83.d.Initialized.b(initialized, null, VehicleCardInitializedData.b(initialized.getVehicleCardData(), null, Field.b(initialized.getVehicleCardData().f(), vehicleNumberInputChange.getNumber(), null, 2, null), null, null, null, null, 61, null), null, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final v83.a.VehicleNumberInputChange vehicleNumberInputChange = (v83.a.VehicleNumberInputChange) this.f204743f;
            k10.c0 c0Var = (k10.c0) this.f204744g;
            uq.b.e();
            if (this.f204742e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: v83.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.C5344x.O(vehicleNumberInputChange, (d.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(v83.a.VehicleNumberInputChange vehicleNumberInputChange, k10.c0<v83.d.Initialized> c0Var, tq.e<? super k10.l<? extends v83.d>> eVar) {
            C5344x c5344x = new C5344x(eVar);
            c5344x.f204743f = vehicleNumberInputChange;
            c5344x.f204744g = c0Var;
            return c5344x.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lv83/a$p;", "action", "Lk10/c0;", "Lv83/d$b;", "state", "Lk10/l;", "Lv83/d;", "<anonymous>", "(Lv83/a$p;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class y extends vq.k implements er.q<v83.a.ValidateField, k10.c0<v83.d.Initialized>, tq.e<? super k10.l<? extends v83.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f204745e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f204746f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f204747g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f204749a;

            static {
                int[] iArr = new int[v83.c.values().length];
                try {
                    iArr[v83.c.DESCRIPTION.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[v83.c.OWNER_NAMES.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[v83.c.VEHICLE_NUMBER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f204749a = iArr;
            }
        }

        y(tq.e<? super y> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v83.d.Initialized X(hz.b bVar, v83.d.Initialized initialized) {
            return v83.d.Initialized.b(initialized, CommonInitializedData.b(initialized.getCommonFormData(), null, null, FieldData.b(initialized.getCommonFormData().d(), null, bVar, 1, null), 3, null), null, null, 6, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v83.d.Initialized Y(x xVar, hz.b bVar, k10.c0 c0Var, v83.d.Initialized initialized) {
            return v83.d.Initialized.b(initialized, null, VehicleCardInitializedData.b(initialized.getVehicleCardData(), xVar.A9(v83.c.OWNER_NAMES, bVar, ((v83.d.Initialized) c0Var.a()).getVehicleCardData().c()), null, null, null, null, null, 62, null), null, 5, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v83.d.Initialized Z(x xVar, hz.b bVar, k10.c0 c0Var, v83.d.Initialized initialized) {
            return v83.d.Initialized.b(initialized, null, VehicleCardInitializedData.b(initialized.getVehicleCardData(), xVar.A9(v83.c.VEHICLE_NUMBER, bVar, ((v83.d.Initialized) c0Var.a()).getVehicleCardData().c()), null, null, null, null, null, 62, null), null, 5, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
        
            if (r8 == r2) goto L30;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00d6, code lost:
        
            if (r8 == r2) goto L30;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 303
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: v83.x.y.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object w(v83.a.ValidateField validateField, k10.c0<v83.d.Initialized> c0Var, tq.e<? super k10.l<? extends v83.d>> eVar) {
            y yVar = x.this.new y(eVar);
            yVar.f204746f = validateField;
            yVar.f204747g = c0Var;
            return yVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lv83/a$a;", "action", "Lk10/c0;", "Lv83/d$b;", "state", "Lk10/l;", "Lv83/d;", "<anonymous>", "(Lv83/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class z extends vq.k implements er.q<v83.a.ClearValidation, k10.c0<v83.d.Initialized>, tq.e<? super k10.l<? extends v83.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f204750e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f204751f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f204752g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f204754a;

            static {
                int[] iArr = new int[v83.c.values().length];
                try {
                    iArr[v83.c.DESCRIPTION.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[v83.c.OWNER_NAMES.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[v83.c.VEHICLE_NUMBER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[v83.c.OWNERSHIP_STATUS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[v83.c.REPORT_REASON.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                f204754a = iArr;
            }
        }

        z(tq.e<? super z> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v83.d.Initialized V(v83.d.Initialized initialized) {
            return v83.d.Initialized.b(initialized, CommonInitializedData.b(initialized.getCommonFormData(), null, null, FieldData.b(initialized.getCommonFormData().d(), null, hz.b.C2039b.f86846c, 1, null), 3, null), null, null, 6, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v83.d.Initialized X(x xVar, v83.a.ClearValidation clearValidation, k10.c0 c0Var, v83.d.Initialized initialized) {
            return v83.d.Initialized.b(initialized, null, VehicleCardInitializedData.b(initialized.getVehicleCardData(), xVar.A9(clearValidation.getFieldType(), hz.b.C2039b.f86846c, ((v83.d.Initialized) c0Var.a()).getVehicleCardData().c()), null, null, null, null, null, 62, null), null, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final v83.a.ClearValidation clearValidation = (v83.a.ClearValidation) this.f204751f;
            final k10.c0 c0Var = (k10.c0) this.f204752g;
            uq.b.e();
            if (this.f204750e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            int i15 = a.f204754a[clearValidation.getFieldType().ordinal()];
            if (i15 == 1) {
                return c0Var.b(new er.l() { // from class: v83.l0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return x.z.V((d.Initialized) obj2);
                    }
                });
            }
            if (i15 != 2 && i15 != 3 && i15 != 4 && i15 != 5) {
                throw new oq.p();
            }
            final x xVar = x.this;
            return c0Var.b(new er.l() { // from class: v83.m0
                @Override // er.l
                public final Object b(Object obj2) {
                    return x.z.X(xVar, clearValidation, c0Var, (d.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(v83.a.ClearValidation clearValidation, k10.c0<v83.d.Initialized> c0Var, tq.e<? super k10.l<? extends v83.d>> eVar) {
            z zVar = x.this.new z(eVar);
            zVar.f204751f = clearValidation;
            zVar.f204752g = c0Var;
            return zVar.J(oq.i0.f148189a);
        }
    }

    public x(ib4.c cVar, w83.d dVar, a14.w wVar, ib4.c cVar2, w83.c cVar3, po0.h hVar, n83.e eVar, n83.b bVar, mx.c cVar4, u04.a aVar, w83.a aVar2, yy.a aVar3, w83.q qVar, final n83.a aVar4, final po0.i iVar, final ac4.a aVar5, Topic topic) {
        this.genericDomainErrorMapper = cVar;
        this.reportErrorNavigationDialogMapper = dVar;
        this.openUrlIntentUseCase = wVar;
        this.errorMapper = cVar2;
        this.reasonListSetupDataMapper = cVar3;
        this.getReportIssueReasonsUC = hVar;
        this.validateVehicleCardReportFormUC = eVar;
        this.validateReportDescriptionUC = bVar;
        this.labelProvider = cVar4;
        this.commonEndpoints = aVar;
        this.openDrivingLicenceReportLinkMapper = aVar2;
        this.topic = topic;
        this.stateMachine = aVar3.a(v83.d.a.f204535a, new er.l() { // from class: v83.w
            @Override // er.l
            public final Object b(Object obj) {
                return x.G9(this.f204614a, aVar5, iVar, aVar4, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), qVar, this), v83.e.a.C5338a.f204541a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<v83.c, hz.b> A9(v83.c field, hz.b validationState, Map<v83.c, ? extends hz.b> validationMap) {
        Map<v83.c, hz.b> mapW = v0.w(validationMap);
        mapW.put(field, validationState);
        return mapW;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b B9(dx.b error, final er.a<oq.i0> retryAction, final er.a<oq.i0> closeAction) {
        return this.genericDomainErrorMapper.b(new ib4.c.Params(error, false, new er.l() { // from class: v83.v
            @Override // er.l
            public final Object b(Object obj) {
                return x.C9(closeAction, retryAction, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C9(er.a aVar, er.a aVar2, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary) || (bVar instanceof ib4.c.b.AbstractC2161b.a)) {
            aVar.a();
        } else {
            if (!(bVar instanceof ib4.c.b.AbstractC2161b.C2162b)) {
                throw new oq.p();
            }
            aVar2.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object D9(String str, tq.e<? super dx.i<dx.b.Business, oq.i0>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f204636g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f204636g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f204634e;
        Object objE = uq.b.e();
        int i16 = aVar.f204636g;
        if (i16 == 0) {
            oq.u.b(objC);
            a14.w wVar = this.openUrlIntentUseCase;
            a14.w.Params params = new a14.w.Params(str, false, 2, null);
            aVar.f204633d = vq.j.a(str);
            aVar.f204636g = 1;
            objC = wVar.c(params, aVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            d9(new v83.a.ShowRedirectError(this.errorMapper.b(new ib4.c.Params((dx.b.Business) ((dx.i.Left) iVar).b(), false, new er.l() { // from class: v83.u
                @Override // er.l
                public final Object b(Object obj) {
                    return x.E9((ib4.c.b) obj);
                }
            }, 2, null))));
        }
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E9(ib4.c.b bVar) {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G9(final x xVar, final ac4.a aVar, final po0.i iVar, final n83.a aVar2, k10.v vVar) {
        vVar.c(fr.q0.c(v83.d.a.class), new er.l() { // from class: v83.r
            @Override // er.l
            public final Object b(Object obj) {
                return x.H9(this.f204604a, aVar, iVar, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(v83.d.Initialized.class), new er.l() { // from class: v83.s
            @Override // er.l
            public final Object b(Object obj) {
                return x.I9(this.f204607a, aVar2, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(v83.d.class), new er.l() { // from class: v83.t
            @Override // er.l
            public final Object b(Object obj) {
                return x.J9(this.f204609a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(x xVar, ac4.a aVar, po0.i iVar, k10.z zVar) {
        zVar.C(xVar.new k(null));
        l lVar = new l(aVar, iVar, xVar, null);
        zVar.v(fr.q0.c(v83.a.f.class), k10.o.CANCEL_PREVIOUS, lVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I9(x xVar, n83.a aVar, k10.z zVar) {
        v vVar = xVar.new v(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(v83.a.n.class), oVar, vVar);
        zVar.v(fr.q0.c(v83.a.VehicleReportReasonSelected.class), oVar, xVar.new w(null));
        zVar.v(fr.q0.c(v83.a.VehicleNumberInputChange.class), oVar, new C5344x(null));
        zVar.v(fr.q0.c(v83.a.ValidateField.class), oVar, xVar.new y(null));
        zVar.v(fr.q0.c(v83.a.ClearValidation.class), oVar, xVar.new z(null));
        zVar.v(fr.q0.c(v83.a.VehicleOwnerNamesInputChanged.class), oVar, new a0(null));
        zVar.v(fr.q0.c(v83.a.VehicleOwnerStatusChanged.class), oVar, xVar.new b0(null));
        zVar.v(fr.q0.c(v83.a.DrivingLicenceIssueTypeChange.class), oVar, new c0(null));
        zVar.x(fr.q0.c(v83.a.i.class), oVar, xVar.new d0(null));
        zVar.x(fr.q0.c(v83.a.l.class), oVar, xVar.new m(null));
        zVar.x(fr.q0.c(v83.a.h.class), oVar, xVar.new n(null));
        zVar.x(fr.q0.c(v83.a.SendForm.class), oVar, new o(aVar, xVar, null));
        zVar.v(fr.q0.c(v83.a.r.class), oVar, xVar.new p(null));
        zVar.v(fr.q0.c(v83.a.q.class), oVar, xVar.new q(null));
        zVar.v(fr.q0.c(v83.a.TopicSelected.class), oVar, new r(null));
        zVar.v(fr.q0.c(v83.a.DescriptionInputChange.class), oVar, new s(null));
        zVar.x(fr.q0.c(v83.a.e.class), oVar, xVar.new t(null));
        zVar.x(fr.q0.c(v83.a.j.class), oVar, xVar.new u(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J9(x xVar, k10.z zVar) {
        e0 e0Var = xVar.new e0(null);
        zVar.x(fr.q0.c(v83.a.Close.class), k10.o.CANCEL_PREVIOUS, e0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hz.b K9(Topic topic) {
        return topic != null ? hz.b.d.f86848c : new hz.b.Invalid(this.labelProvider.c(l83.a.B0));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: F9, reason: merged with bridge method [inline-methods] */
    public void P5(Topic data) {
        d9(new v83.a.TopicSelected(data));
    }

    @Override // zx.b
    public xw.b<v83.a.g> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<v83.d, v83.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<v83.e.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(v83.a.g gVar, tq.e<? super oq.i0> eVar) {
        return super.F(gVar, eVar);
    }
}
