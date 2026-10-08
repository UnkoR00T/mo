package xe2;

import bf2.SetupData;
import cb4.DialogData;
import fr.q0;
import java.util.List;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vy.Coordinates;
import zd2.ImageAttachments;
import zd2.NewIncidentData;
import zd2.Photo;
import zp0.BEReportIncidentTypes;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B\u008b\u0001\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010!\u001a\u00020\u0006\u0012\u0006\u0010#\u001a\u00020\"\u0012\b\b\u0001\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020(H\u0002¢\u0006\u0004\b+\u0010*J\u0017\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020\u0002H\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0002H\u0002¢\u0006\u0004\b0\u00101J\u0013\u00104\u001a\u000203*\u000202H\u0002¢\u0006\u0004\b4\u00105J\u0013\u00106\u001a\u000203*\u000202H\u0002¢\u0006\u0004\b6\u00105J\u0018\u0010:\u001a\u0002092\u0006\u00108\u001a\u000207H\u0096\u0001¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u000209H\u0096\u0001¢\u0006\u0004\b<\u0010=R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010!\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R \u0010b\u001a\b\u0012\u0004\u0012\u00020]0\\8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR\u0014\u0010e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR&\u0010k\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR \u0010,\u001a\b\u0012\u0004\u0012\u00020-0l8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p¨\u0006q"}, d2 = {"Lxe2/v;", "Ll00/g;", "Lxe2/c;", "Lxe2/a;", "Lxe2/d;", "", "Li70/e;", "Lyy/a;", "stateMachineFactory", "Lye2/b;", "mapper", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "errorMapper", "Lqe2/a;", "closeProcessDialogMapper", "Lcb4/j;", "dialogVMSFactory", "Lae2/g;", "reportNewIncidentUC", "Lac4/a;", "callActionWithLoaderUseCase", "Laq0/b;", "beGetReportIncidentTypesUC", "Lmx/c;", "labelProvider", "Lae2/i;", "requestAllPermissionsToGetLocationUseCase", "La14/m;", "goToApplicationDetailsSettingsUseCase", "La14/n;", "goToDeviceLocationSettingsUseCase", "globalSnackBarManager", "Le14/f;", "getLocationUpdatesUseCase", "Lxe2/e;", "setupContract", "<init>", "(Lyy/a;Lye2/b;Lhb4/d;Lib4/c;Lqe2/a;Lcb4/j;Lae2/g;Lac4/a;Laq0/b;Lmx/c;Lae2/i;La14/m;La14/n;Li70/e;Le14/f;Lxe2/e;)V", "Lcb4/d;", "K9", "()Lcb4/d;", "J9", "state", "Lxe2/d$a;", "M9", "(Lxe2/c;)Lxe2/d$a;", "S9", "()Lxe2/c;", "Ldx/b;", "Ljb4/b;", "Q9", "(Ldx/b;)Ljb4/b;", "O9", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lye2/b;", "c", "Lhb4/d;", "d", "Lib4/c;", "e", "Lqe2/a;", "f", "Lcb4/j;", "g", "Lae2/g;", "h", "Lac4/a;", "j", "Laq0/b;", "k", "Lmx/c;", "l", "Lae2/i;", "m", "La14/m;", "n", "La14/n;", "p", "Li70/e;", "q", "Le14/f;", "r", "Lxe2/e;", "Lxw/b;", "Lxe2/a$d;", "s", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "t", "Lxe2/c;", "initialState", "Lk10/t;", "v", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "w", "Lmu/p0;", "getState", "()Lmu/p0;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v extends l00.g<xe2.c, xe2.a> implements xe2.d, zx.d, i70.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ye2.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c errorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final qe2.a closeProcessDialogMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ae2.g reportNewIncidentUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final aq0.b beGetReportIncidentTypesUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final ae2.i requestAllPermissionsToGetLocationUseCase;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final a14.m goToApplicationDetailsSettingsUseCase;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final a14.n goToDeviceLocationSettingsUseCase;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final e14.f getLocationUpdatesUseCase;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final xe2.e setupContract;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final xw.b<xe2.a.d> navAction = new xw.b<>();

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final xe2.c initialState;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final k10.t<xe2.c, xe2.a> stateMachine;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final p0<xe2.d.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<xe2.d.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f218208a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v f218209b;

        /* JADX INFO: renamed from: xe2.v$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5832a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f218210a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ v f218211b;

            /* JADX INFO: renamed from: xe2.v$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5833a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f218212d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f218213e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f218214f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f218216h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f218217j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f218218k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f218219l;

                public C5833a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f218212d = obj;
                    this.f218213e |= PKIFailureInfo.systemUnavail;
                    return C5832a.this.F(null, this);
                }
            }

            public C5832a(mu.h hVar, v vVar) {
                this.f218210a = hVar;
                this.f218211b = vVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5833a c5833a;
                if (eVar instanceof C5833a) {
                    c5833a = (C5833a) eVar;
                    int i15 = c5833a.f218213e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5833a.f218213e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5833a = new C5833a(eVar);
                    }
                } else {
                    c5833a = new C5833a(eVar);
                }
                Object obj2 = c5833a.f218212d;
                Object objE = uq.b.e();
                int i16 = c5833a.f218213e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f218210a;
                    xe2.d.a aVarM9 = this.f218211b.M9((xe2.c) obj);
                    c5833a.f218214f = vq.j.a(obj);
                    c5833a.f218216h = vq.j.a(c5833a);
                    c5833a.f218217j = vq.j.a(obj);
                    c5833a.f218218k = vq.j.a(hVar);
                    c5833a.f218219l = 0;
                    c5833a.f218213e = 1;
                    if (hVar.F(aVarM9, c5833a) == objE) {
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

        public a(mu.g gVar, v vVar) {
            this.f218208a = gVar;
            this.f218209b = vVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super xe2.d.a> hVar, tq.e eVar) {
            Object objA = this.f218208a.a(new C5832a(hVar, this.f218209b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxe2/a$e;", "<unused var>", "Lxe2/c;", "Loq/i0;", "<anonymous>", "(Lxe2/a$e;Lxe2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<xe2.a.e, xe2.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218220e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f218220e;
            if (i15 == 0) {
                oq.u.b(obj);
                v vVar = v.this;
                xe2.a.d.C5827a c5827a = xe2.a.d.C5827a.f218125a;
                this.f218220e = 1;
                if (vVar.F(c5827a, this) == objE) {
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
        public final Object w(xe2.a.e eVar, xe2.c cVar, tq.e<? super i0> eVar2) {
            return v.this.new b(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxe2/a$g;", "<unused var>", "Lxe2/c;", "Loq/i0;", "<anonymous>", "(Lxe2/a$g;Lxe2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<xe2.a.g, xe2.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218222e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f218222e;
            if (i15 == 0) {
                oq.u.b(obj);
                ae2.i iVar = v.this.requestAllPermissionsToGetLocationUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f218222e = 1;
                obj = iVar.a(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            ae2.i.a aVar = (ae2.i.a) obj;
            if (aVar instanceof ae2.i.a.NoPermissions) {
                if (!((ae2.i.a.NoPermissions) aVar).getShouldShowRationale()) {
                    v.this.d9(new xe2.a.ShowLocalizationDialog(v.this.K9()));
                }
            } else if (aVar instanceof ae2.i.a.C0117a) {
                v.this.d9(new xe2.a.ShowLocalizationDialog(v.this.J9()));
            } else {
                if (!fr.t.c(aVar, ae2.i.a.c.f5591a)) {
                    throw new oq.p();
                }
                v.this.d9(xe2.a.j.f218137a);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xe2.a.g gVar, xe2.c cVar, tq.e<? super i0> eVar) {
            return v.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lxe2/a$m;", "action", "Lk10/c0;", "Lxe2/c$b;", "state", "Lk10/l;", "Lxe2/c;", "<anonymous>", "(Lxe2/a$m;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<xe2.a.ShowLocalizationDialog, k10.c0<xe2.c.b>, tq.e<? super k10.l<? extends xe2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218224e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f218225f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f218226g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final xe2.c.b.Dialog O(InitializedStateData initializedStateData, cb4.i iVar, xe2.c.b bVar) {
            return new xe2.c.b.Dialog(initializedStateData, iVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            xe2.a.ShowLocalizationDialog showLocalizationDialog = (xe2.a.ShowLocalizationDialog) this.f218225f;
            k10.c0 c0Var = (k10.c0) this.f218226g;
            uq.b.e();
            if (this.f218224e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final InitializedStateData initializedStateDataB = InitializedStateData.b(((xe2.c.b) c0Var.a()).getInitializedStateData(), null, true, 1, null);
            final cb4.i iVarA = v.this.dialogVMSFactory.a(showLocalizationDialog.getDialogData());
            return c0Var.d(new er.l() { // from class: xe2.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.d.O(initializedStateDataB, iVarA, (c.b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(xe2.a.ShowLocalizationDialog showLocalizationDialog, k10.c0<xe2.c.b> c0Var, tq.e<? super k10.l<? extends xe2.c>> eVar) {
            d dVar = v.this.new d(eVar);
            dVar.f218225f = showLocalizationDialog;
            dVar.f218226g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxe2/a$f;", "<unused var>", "Lxe2/c$b;", "Loq/i0;", "<anonymous>", "(Lxe2/a$f;Lxe2/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<xe2.a.f, xe2.c.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218228e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f218228e;
            if (i15 == 0) {
                oq.u.b(obj);
                v vVar = v.this;
                xe2.a.d.b bVar = xe2.a.d.b.f218126a;
                this.f218228e = 1;
                if (vVar.F(bVar, this) == objE) {
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
        public final Object w(xe2.a.f fVar, xe2.c.b bVar, tq.e<? super i0> eVar) {
            return v.this.new e(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxe2/a$c;", "<unused var>", "Lxe2/c$b$a;", "Loq/i0;", "<anonymous>", "(Lxe2/a$c;Lxe2/c$b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<xe2.a.c, xe2.c.b.Dialog, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218230e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f218230e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dx.i<? extends dx.b.Business, ? extends i0> iVarA = v.this.goToApplicationDetailsSettingsUseCase.a(gz.b.a.C1792a.f78542a);
            v vVar = v.this;
            if (iVarA instanceof dx.i.Left) {
                vVar.y(new p50.a.DefaultWithIcon(vVar.labelProvider.c(ud2.a.E0), false, null, null, 14, null));
            }
            v.this.d9(xe2.a.C5826a.f218122a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xe2.a.c cVar, xe2.c.b.Dialog dialog, tq.e<? super i0> eVar) {
            return v.this.new f(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxe2/a$b;", "<unused var>", "Lxe2/c$b$a;", "Loq/i0;", "<anonymous>", "(Lxe2/a$b;Lxe2/c$b$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<xe2.a.b, xe2.c.b.Dialog, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218232e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f218232e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.n nVar = v.this.goToDeviceLocationSettingsUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f218232e = 1;
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
            v vVar = v.this;
            if (iVar instanceof dx.i.Left) {
                vVar.y(new p50.a.DefaultWithIcon(vVar.labelProvider.c(ud2.a.E0), false, null, null, 14, null));
            }
            v.this.d9(xe2.a.C5826a.f218122a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(xe2.a.b bVar, xe2.c.b.Dialog dialog, tq.e<? super i0> eVar) {
            return v.this.new g(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lxe2/a$a;", "<unused var>", "Lk10/c0;", "Lxe2/c$b$a;", "state", "Lk10/l;", "Lxe2/c;", "<anonymous>", "(Lxe2/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<xe2.a.C5826a, k10.c0<xe2.c.b.Dialog>, tq.e<? super k10.l<? extends xe2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218234e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f218235f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final xe2.c.b.Summary O(k10.c0 c0Var, xe2.c.b.Dialog dialog) {
            return new xe2.c.b.Summary(((xe2.c.b.Dialog) c0Var.a()).getInitializedStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f218235f;
            uq.b.e();
            if (this.f218234e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: xe2.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.h.O(c0Var, (c.b.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(xe2.a.C5826a c5826a, k10.c0<xe2.c.b.Dialog> c0Var, tq.e<? super k10.l<? extends xe2.c>> eVar) {
            h hVar = new h(eVar);
            hVar.f218235f = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lxe2/a$j;", "<unused var>", "Lk10/c0;", "Lxe2/c$b$d;", "state", "Lk10/l;", "Lxe2/c;", "<anonymous>", "(Lxe2/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<xe2.a.j, k10.c0<xe2.c.b.Summary>, tq.e<? super k10.l<? extends xe2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218236e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f218237f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final xe2.c.b.SendIncidentReport O(k10.c0 c0Var, xe2.c.b.Summary summary) {
            return new xe2.c.b.SendIncidentReport(((xe2.c.b.Summary) c0Var.a()).getInitializedStateData(), pq.v.n());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f218237f;
            uq.b.e();
            if (this.f218236e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: xe2.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.i.O(c0Var, (c.b.Summary) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(xe2.a.j jVar, k10.c0<xe2.c.b.Summary> c0Var, tq.e<? super k10.l<? extends xe2.c>> eVar) {
            i iVar = new i(eVar);
            iVar.f218237f = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lxe2/a$k;", "<unused var>", "Lk10/c0;", "Lxe2/c$b$d;", "state", "Lk10/l;", "Lxe2/c;", "<anonymous>", "(Lxe2/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<xe2.a.k, k10.c0<xe2.c.b.Summary>, tq.e<? super k10.l<? extends xe2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218238e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f218239f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final xe2.c.b.Dialog O(k10.c0 c0Var, v vVar, xe2.c.b.Summary summary) {
            return new xe2.c.b.Dialog(((xe2.c.b.Summary) c0Var.a()).getInitializedStateData(), vVar.dialogVMSFactory.a(vVar.closeProcessDialogMapper.b(new qe2.a.Params(vVar.b9(xe2.a.f.f218132a), vVar.b9(xe2.a.C5826a.f218122a)))));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f218239f;
            uq.b.e();
            if (this.f218238e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final v vVar = v.this;
            return c0Var.d(new er.l() { // from class: xe2.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.j.O(c0Var, vVar, (c.b.Summary) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(xe2.a.k kVar, k10.c0<xe2.c.b.Summary> c0Var, tq.e<? super k10.l<? extends xe2.c>> eVar) {
            j jVar = v.this.new j(eVar);
            jVar.f218239f = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lxe2/a$h;", "action", "Lxe2/c$b$d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lxe2/a$h;Lxe2/c$b$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<xe2.a.OnShowLocalization, xe2.c.b.Summary, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218241e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f218242f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            xe2.a.OnShowLocalization onShowLocalization = (xe2.a.OnShowLocalization) this.f218242f;
            Object objE = uq.b.e();
            int i15 = this.f218241e;
            if (i15 == 0) {
                oq.u.b(obj);
                v vVar = v.this;
                xe2.a.d.ToLocalizationMap toLocalizationMap = new xe2.a.d.ToLocalizationMap(new SetupData(onShowLocalization.getCoordinates()));
                this.f218242f = vq.j.a(onShowLocalization);
                this.f218241e = 1;
                if (vVar.F(toLocalizationMap, this) == objE) {
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
        public final Object w(xe2.a.OnShowLocalization onShowLocalization, xe2.c.b.Summary summary, tq.e<? super i0> eVar) {
            k kVar = v.this.new k(eVar);
            kVar.f218242f = onShowLocalization;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxe2/a$i;", "<unused var>", "Lxe2/c$b$d;", "Loq/i0;", "<anonymous>", "(Lxe2/a$i;Lxe2/c$b$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<xe2.a.i, xe2.c.b.Summary, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218244e;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f218244e;
            if (i15 == 0) {
                oq.u.b(obj);
                v vVar = v.this;
                xe2.a.d.e eVar = xe2.a.d.e.f218130a;
                this.f218244e = 1;
                if (vVar.F(eVar, this) == objE) {
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
        public final Object w(xe2.a.i iVar, xe2.c.b.Summary summary, tq.e<? super i0> eVar) {
            return v.this.new l(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lxe2/c$b$c;", "state", "Lk10/l;", "Lxe2/c;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.p<k10.c0<xe2.c.b.SendIncidentReport>, tq.e<? super k10.l<? extends xe2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218246e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f218247f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lxe2/c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends xe2.c>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f218249e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f218250f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f218251g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f218252h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f218253j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f218254k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            boolean f218255l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f218256m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ v f218257n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ k10.c0<xe2.c.b.SendIncidentReport> f218258p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(v vVar, k10.c0<xe2.c.b.SendIncidentReport> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f218257n = vVar;
                this.f218258p = c0Var;
            }

            /* JADX WARN: Code duplicated, block: B:27:0x00ed  */
            /* JADX WARN: Code duplicated, block: B:29:0x00f1  */
            /* JADX WARN: Code duplicated, block: B:33:0x0143 A[PHI: r1 r11
              0x0143: PHI (r1v6 zp0.f) = (r1v4 zp0.f), (r1v10 zp0.f) binds: [B:25:0x00ea, B:32:0x013b] A[DONT_GENERATE, DONT_INLINE]
              0x0143: PHI (r11v18 java.lang.Object) = (r11v11 java.lang.Object), (r11v35 java.lang.Object) binds: [B:25:0x00ea, B:32:0x013b] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Code duplicated, block: B:35:0x0148  */
            /* JADX WARN: Code duplicated, block: B:36:0x015f  */
            /* JADX WARN: Code duplicated, block: B:38:0x0163  */
            /* JADX WARN: Code duplicated, block: B:41:0x0175  */
            /* JADX WARN: Code duplicated, block: B:42:0x018a  */
            /* JADX WARN: Code duplicated, block: B:44:0x018e  */
            /* JADX WARN: Code duplicated, block: B:49:0x01c5  */
            /* JADX WARN: Code duplicated, block: B:51:0x01cb  */
            /* JADX WARN: Code duplicated, block: B:53:0x01d1  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x00de, code lost:
            
                if (r11 == r0) goto L46;
             */
            /* JADX WARN: Code restructure failed: missing block: B:30:0x0137, code lost:
            
                if (r11 == r0) goto L46;
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x01bb, code lost:
            
                if (r3.F(r7, r10) == r0) goto L46;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r11) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 471
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: xe2.v.m.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f218257n, this.f218258p, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends xe2.c>> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        m(tq.e<? super m> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f218247f;
            Object objE = uq.b.e();
            int i15 = this.f218246e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = v.this.callActionWithLoaderUseCase;
            a aVar2 = new a(v.this, c0Var, null);
            this.f218247f = vq.j.a(c0Var);
            this.f218246e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<xe2.c.b.SendIncidentReport> c0Var, tq.e<? super k10.l<? extends xe2.c>> eVar) {
            return ((m) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            m mVar = v.this.new m(eVar);
            mVar.f218247f = obj;
            return mVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lxe2/a$l;", "action", "Lk10/c0;", "Lxe2/c$b$c;", "state", "Lk10/l;", "Lxe2/c;", "<anonymous>", "(Lxe2/a$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<xe2.a.ShowIncidentReportRequestError, k10.c0<xe2.c.b.SendIncidentReport>, tq.e<? super k10.l<? extends xe2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218259e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f218260f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f218261g;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final xe2.c.b.Error O(k10.c0 c0Var, v vVar, xe2.a.ShowIncidentReportRequestError showIncidentReportRequestError, xe2.c.b.SendIncidentReport sendIncidentReport) {
            return new xe2.c.b.Error(((xe2.c.b.SendIncidentReport) c0Var.a()).getInitializedStateData(), showIncidentReportRequestError.a(), vVar.errorVMSFactory.a(vVar.O9(showIncidentReportRequestError.getDomainError())));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final xe2.a.ShowIncidentReportRequestError showIncidentReportRequestError = (xe2.a.ShowIncidentReportRequestError) this.f218260f;
            final k10.c0 c0Var = (k10.c0) this.f218261g;
            uq.b.e();
            if (this.f218259e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final v vVar = v.this;
            return c0Var.d(new er.l() { // from class: xe2.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.n.O(c0Var, vVar, showIncidentReportRequestError, (c.b.SendIncidentReport) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(xe2.a.ShowIncidentReportRequestError showIncidentReportRequestError, k10.c0<xe2.c.b.SendIncidentReport> c0Var, tq.e<? super k10.l<? extends xe2.c>> eVar) {
            n nVar = v.this.new n(eVar);
            nVar.f218260f = showIncidentReportRequestError;
            nVar.f218261g = c0Var;
            return nVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lxe2/a$f;", "<unused var>", "Lk10/c0;", "Lxe2/c$b$b;", "state", "Lk10/l;", "Lxe2/c;", "<anonymous>", "(Lxe2/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<xe2.a.f, k10.c0<xe2.c.b.Error>, tq.e<? super k10.l<? extends xe2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218263e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f218264f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final xe2.c.b.Summary O(k10.c0 c0Var, xe2.c.b.Error error) {
            return new xe2.c.b.Summary(((xe2.c.b.Error) c0Var.a()).getInitializedStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f218264f;
            uq.b.e();
            if (this.f218263e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: xe2.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.o.O(c0Var, (c.b.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(xe2.a.f fVar, k10.c0<xe2.c.b.Error> c0Var, tq.e<? super k10.l<? extends xe2.c>> eVar) {
            o oVar = new o(eVar);
            oVar.f218264f = c0Var;
            return oVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lxe2/a$j;", "<unused var>", "Lk10/c0;", "Lxe2/c$b$b;", "state", "Lk10/l;", "Lxe2/c;", "<anonymous>", "(Lxe2/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<xe2.a.j, k10.c0<xe2.c.b.Error>, tq.e<? super k10.l<? extends xe2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f218265e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f218266f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f218267g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f218268h;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Lzp0/n;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends BEReportIncidentTypes>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f218270e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ v f218271f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(v vVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f218271f = vVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f218270e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                aq0.b bVar = this.f218271f.beGetReportIncidentTypesUC;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f218270e = 1;
                Object objC = bVar.c(c1792a, this);
                return objC == objE ? objE : objC;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f218271f, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super dx.i<? extends dx.b, BEReportIncidentTypes>> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final xe2.c.b.SendIncidentReport O(k10.c0 c0Var, List list, xe2.c.b.Error error) {
            return new xe2.c.b.SendIncidentReport(((xe2.c.b.Error) c0Var.a()).getInitializedStateData(), list);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            List<oq.r<Photo, ImageAttachments>> listB;
            v vVar;
            final k10.c0 c0Var = (k10.c0) this.f218268h;
            Object objE = uq.b.e();
            int i15 = this.f218267g;
            if (i15 == 0) {
                oq.u.b(obj);
                listB = ((xe2.c.b.Error) c0Var.a()).b();
                v vVar2 = v.this;
                if (listB.isEmpty()) {
                    ac4.a aVar = vVar2.callActionWithLoaderUseCase;
                    a aVar2 = new a(vVar2, null);
                    this.f218268h = c0Var;
                    this.f218265e = vVar2;
                    this.f218266f = 0;
                    this.f218267g = 1;
                    obj = ac4.a.a(aVar, null, aVar2, this, 1, null);
                    if (obj == objE) {
                        return objE;
                    }
                    vVar = vVar2;
                }
                final List<oq.r<Photo, ImageAttachments>> list = listB;
                return c0Var.d(new er.l() { // from class: xe2.c0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return v.p.O(c0Var, list, (c.b.Error) obj2);
                    }
                });
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vVar = (v) this.f218265e;
            oq.u.b(obj);
            dx.i iVar = (dx.i) obj;
            if (iVar instanceof dx.i.Left) {
                return c0Var.c();
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            vVar.setupContract.Q5(((BEReportIncidentTypes) ((dx.i.Right) iVar).b()).getImageConfig());
            listB = pq.v.n();
            final List list2 = listB;
            return c0Var.d(new er.l() { // from class: xe2.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.p.O(c0Var, list2, (c.b.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(xe2.a.j jVar, k10.c0<xe2.c.b.Error> c0Var, tq.e<? super k10.l<? extends xe2.c>> eVar) {
            p pVar = v.this.new p(eVar);
            pVar.f218268h = c0Var;
            return pVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lxe2/a$f;", "<unused var>", "Lxe2/c$a;", "Loq/i0;", "<anonymous>", "(Lxe2/a$f;Lxe2/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<xe2.a.f, xe2.c.ErrorInit, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f218272e;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f218272e;
            if (i15 == 0) {
                oq.u.b(obj);
                v vVar = v.this;
                xe2.a.d.b bVar = xe2.a.d.b.f218126a;
                this.f218272e = 1;
                if (vVar.F(bVar, this) == objE) {
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
        public final Object w(xe2.a.f fVar, xe2.c.ErrorInit errorInit, tq.e<? super i0> eVar) {
            return v.this.new q(eVar).J(i0.f148189a);
        }
    }

    public v(yy.a aVar, ye2.b bVar, hb4.d dVar, ib4.c cVar, qe2.a aVar2, cb4.j jVar, ae2.g gVar, ac4.a aVar3, aq0.b bVar2, mx.c cVar2, ae2.i iVar, a14.m mVar, a14.n nVar, i70.e eVar, e14.f fVar, xe2.e eVar2) {
        this.mapper = bVar;
        this.errorVMSFactory = dVar;
        this.errorMapper = cVar;
        this.closeProcessDialogMapper = aVar2;
        this.dialogVMSFactory = jVar;
        this.reportNewIncidentUC = gVar;
        this.callActionWithLoaderUseCase = aVar3;
        this.beGetReportIncidentTypesUC = bVar2;
        this.labelProvider = cVar2;
        this.requestAllPermissionsToGetLocationUseCase = iVar;
        this.goToApplicationDetailsSettingsUseCase = mVar;
        this.goToDeviceLocationSettingsUseCase = nVar;
        this.globalSnackBarManager = eVar;
        this.getLocationUpdatesUseCase = fVar;
        this.setupContract = eVar2;
        xe2.c cVarS9 = S9();
        this.initialState = cVarS9;
        this.stateMachine = aVar.a(cVarS9, new er.l() { // from class: xe2.l
            @Override // er.l
            public final Object b(Object obj) {
                return v.U9(this.f218179a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), M9(cVarS9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DialogData J9() {
        return wd2.b.f212472a.a(this.labelProvider, b9(xe2.a.b.f218123a), b9(xe2.a.C5826a.f218122a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DialogData K9() {
        return wd2.b.f212472a.b(this.labelProvider, b9(xe2.a.c.f218124a), b9(xe2.a.C5826a.f218122a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final xe2.d.a M9(xe2.c state) {
        return this.mapper.b(new ye2.b.Params(state, b9(xe2.a.e.f218131a), b9(xe2.a.k.f218138a), b9(xe2.a.g.f218133a), new er.l() { // from class: xe2.t
            @Override // er.l
            public final Object b(Object obj) {
                return v.N9(this.f218187a, (Coordinates) obj);
            }
        }, b9(xe2.a.i.f218136a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N9(v vVar, Coordinates coordinates) {
        vVar.d9(new xe2.a.OnShowLocalization(coordinates));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b O9(dx.b bVar) {
        return this.errorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: xe2.u
            @Override // er.l
            public final Object b(Object obj) {
                return v.P9(this.f218188a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P9(v vVar, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.a.Secondary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            vVar.d9(xe2.a.f.f218132a);
        } else {
            if (!(bVar instanceof ib4.c.b.a.Primary) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            vVar.d9(xe2.a.j.f218137a);
        }
        return i0.f148189a;
    }

    private final jb4.b Q9(dx.b bVar) {
        return this.errorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: xe2.k
            @Override // er.l
            public final Object b(Object obj) {
                return v.R9(this.f218178a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R9(v vVar, ib4.c.b bVar) {
        if (!(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.a.Secondary) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a) && !(bVar instanceof ib4.c.b.a.Primary) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
            throw new oq.p();
        }
        vVar.d9(xe2.a.f.f218132a);
        return i0.f148189a;
    }

    private final xe2.c S9() {
        NewIncidentData newIncidentDataQ4 = this.setupContract.Q4();
        return newIncidentDataQ4 == null ? new xe2.c.ErrorInit(this.errorVMSFactory.a(Q9(new dx.b.Generic(new NullPointerException("Summary data cannot be null"))))) : new xe2.c.b.Summary(new InitializedStateData(newIncidentDataQ4, false, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U9(final v vVar, k10.v vVar2) {
        vVar2.c(q0.c(xe2.c.class), new er.l() { // from class: xe2.m
            @Override // er.l
            public final Object b(Object obj) {
                return v.V9(this.f218180a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(xe2.c.b.class), new er.l() { // from class: xe2.n
            @Override // er.l
            public final Object b(Object obj) {
                return v.W9(this.f218181a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(xe2.c.b.Dialog.class), new er.l() { // from class: xe2.o
            @Override // er.l
            public final Object b(Object obj) {
                return v.X9(this.f218182a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(xe2.c.b.Summary.class), new er.l() { // from class: xe2.p
            @Override // er.l
            public final Object b(Object obj) {
                return v.Y9(this.f218183a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(xe2.c.b.SendIncidentReport.class), new er.l() { // from class: xe2.q
            @Override // er.l
            public final Object b(Object obj) {
                return v.Z9(this.f218184a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(xe2.c.b.Error.class), new er.l() { // from class: xe2.r
            @Override // er.l
            public final Object b(Object obj) {
                return v.aa(this.f218185a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(xe2.c.ErrorInit.class), new er.l() { // from class: xe2.s
            @Override // er.l
            public final Object b(Object obj) {
                return v.ba(this.f218186a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V9(v vVar, k10.z zVar) {
        b bVar = vVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(xe2.a.e.class), oVar, bVar);
        zVar.x(q0.c(xe2.a.g.class), oVar, vVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 W9(v vVar, k10.z zVar) {
        d dVar = vVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(xe2.a.ShowLocalizationDialog.class), oVar, dVar);
        zVar.x(q0.c(xe2.a.f.class), oVar, vVar.new e(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 X9(v vVar, k10.z zVar) {
        f fVar = vVar.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(xe2.a.c.class), oVar, fVar);
        zVar.x(q0.c(xe2.a.b.class), oVar, vVar.new g(null));
        zVar.v(q0.c(xe2.a.C5826a.class), oVar, new h(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Y9(v vVar, k10.z zVar) {
        i iVar = new i(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(xe2.a.j.class), oVar, iVar);
        zVar.v(q0.c(xe2.a.k.class), oVar, vVar.new j(null));
        zVar.x(q0.c(xe2.a.OnShowLocalization.class), oVar, vVar.new k(null));
        zVar.x(q0.c(xe2.a.i.class), oVar, vVar.new l(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Z9(v vVar, k10.z zVar) {
        zVar.A(vVar.new m(null));
        n nVar = vVar.new n(null);
        zVar.v(q0.c(xe2.a.ShowIncidentReportRequestError.class), k10.o.CANCEL_PREVIOUS, nVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 aa(v vVar, k10.z zVar) {
        o oVar = new o(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(xe2.a.f.class), oVar2, oVar);
        zVar.v(q0.c(xe2.a.j.class), oVar2, vVar.new p(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 ba(v vVar, k10.z zVar) {
        q qVar = vVar.new q(null);
        zVar.x(q0.c(xe2.a.f.class), k10.o.CANCEL_PREVIOUS, qVar);
        return i0.f148189a;
    }

    @Override // i70.e
    public void B0() {
        this.globalSnackBarManager.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: L9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(xe2.a.d dVar, tq.e<? super i0> eVar) {
        return super.F(dVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: T9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(xe2.e eVar) {
        super.P5(eVar);
    }

    @Override // zx.b
    public xw.b<xe2.a.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<xe2.c, xe2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<xe2.d.a> getState() {
        return this.state;
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.globalSnackBarManager.y(snackBarData);
    }
}
