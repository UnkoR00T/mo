package uh1;

import java.util.List;
import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import q34.q1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B±\u0001\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u0010/\u001a\u00020\u0006¢\u0006\u0004\b0\u00101J\u0017\u00104\u001a\u0002032\u0006\u00102\u001a\u00020\u0002H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00107\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u0002062\u0006\u0010:\u001a\u000209H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u000206H\u0016¢\u0006\u0004\b=\u00108J\u0018\u0010@\u001a\u0002062\u0006\u0010?\u001a\u00020>H\u0096\u0001¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u000206H\u0096\u0001¢\u0006\u0004\bB\u00108R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010WR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0014\u0010j\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010iR \u0010q\u001a\b\u0012\u0004\u0012\u00020l0k8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bm\u0010n\u001a\u0004\bo\u0010pR&\u0010w\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030r8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bs\u0010t\u001a\u0004\bu\u0010vR \u00102\u001a\b\u0012\u0004\u0012\u0002030x8\u0016X\u0096\u0004¢\u0006\f\n\u0004\by\u0010z\u001a\u0004\b{\u0010|¨\u0006}"}, d2 = {"Luh1/d0;", "Ll00/g;", "Luh1/i;", "Luh1/f;", "Luh1/j;", "Luh1/h;", "Li70/e;", "Lyy/a;", "stateMachineFactory", "Lvh1/h;", "mapper", "Lib4/c;", "domainErrorMapper", "Lh64/q;", "loadRemoteSettingsUseCase", "Lq34/y;", "fetchDocumentsConfigsUseCase", "Lmz3/c;", "asyncRetryDownloadDocumentsUseCase", "Lch1/a0;", "getExpiredIdentityTypeUseCase", "Lq34/q1;", "loadCachedAddedDocumentsUC", "Lch1/k0;", "migrateToNewLocalNotificationsUseCase", "Lwz3/a;", "certAutoRenewIfShouldUC", "Lh64/o;", "isServicesNeedUpdateUseCase", "Lyg1/c;", "notificationsInteractor", "Lch1/j0;", "migrateOldUserServicesToFavouritesUserCase", "Ldh1/b;", "isGlobalSearchActiveUC", "Lh64/g;", "getGlobalSearchConfigurationUC", "Lac4/a;", "callActionWithLoaderUseCase", "Lmx/c;", "labelProvider", "Lpx/d;", "remoteLogger", "La14/l;", "getImeVisibleStateUseCase", "Lyg1/a;", "dashboardContainersInteractor", "globalSnackBarManager", "<init>", "(Lyy/a;Lvh1/h;Lib4/c;Lh64/q;Lq34/y;Lmz3/c;Lch1/a0;Lq34/q1;Lch1/k0;Lwz3/a;Lh64/o;Lyg1/c;Lch1/j0;Ldh1/b;Lh64/g;Lac4/a;Lmx/c;Lpx/d;La14/l;Lyg1/a;Li70/e;)V", "state", "Luh1/j$a;", "T9", "(Luh1/i;)Luh1/j$a;", "Loq/i0;", "n", "()V", "Luh1/g;", "dashboardTab", "c1", "(Luh1/g;)V", "U6", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "c", "Lvh1/h;", "d", "Lib4/c;", "e", "Lh64/q;", "f", "Lq34/y;", "g", "Lmz3/c;", "h", "Lch1/a0;", "j", "Lq34/q1;", "k", "Lch1/k0;", "l", "Lwz3/a;", "m", "Lh64/o;", "Lyg1/c;", "p", "Lch1/j0;", "q", "Ldh1/b;", "r", "Lh64/g;", "s", "Lac4/a;", "t", "Lmx/c;", "v", "Lpx/d;", "w", "La14/l;", "x", "Lyg1/a;", "Luh1/i$h;", "Luh1/i$h;", "initialState", "Lxw/b;", "Luh1/f$m;", "z", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "A", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "B", "Lmu/p0;", "getState", "()Lmu/p0;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d0 extends l00.g<uh1.i, uh1.f> implements uh1.j, uh1.h, i70.e {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final k10.t<uh1.i, uh1.f> stateMachine;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final mu.p0<uh1.j.Data> state;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ i70.e f198229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final vh1.h mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c domainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final h64.q loadRemoteSettingsUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final q34.y fetchDocumentsConfigsUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final mz3.c asyncRetryDownloadDocumentsUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ch1.a0 getExpiredIdentityTypeUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final q1 loadCachedAddedDocumentsUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ch1.k0 migrateToNewLocalNotificationsUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final wz3.a certAutoRenewIfShouldUC;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final h64.o isServicesNeedUpdateUseCase;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final yg1.c notificationsInteractor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final ch1.j0 migrateOldUserServicesToFavouritesUserCase;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final dh1.b isGlobalSearchActiveUC;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final h64.g getGlobalSearchConfigurationUC;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final a14.l getImeVisibleStateUseCase;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final yg1.a dashboardContainersInteractor;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final uh1.i.h initialState;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final xw.b<uh1.f.m> navAction;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<uh1.j.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f198251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0 f198252b;

        /* JADX INFO: renamed from: uh1.d0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5157a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f198253a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d0 f198254b;

            /* JADX INFO: renamed from: uh1.d0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5158a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f198255d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f198256e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f198257f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f198259h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f198260j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f198261k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f198262l;

                public C5158a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f198255d = obj;
                    this.f198256e |= PKIFailureInfo.systemUnavail;
                    return C5157a.this.F(null, this);
                }
            }

            public C5157a(mu.h hVar, d0 d0Var) {
                this.f198253a = hVar;
                this.f198254b = d0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5158a c5158a;
                if (eVar instanceof C5158a) {
                    c5158a = (C5158a) eVar;
                    int i15 = c5158a.f198256e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5158a.f198256e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5158a = new C5158a(eVar);
                    }
                } else {
                    c5158a = new C5158a(eVar);
                }
                Object obj2 = c5158a.f198255d;
                Object objE = uq.b.e();
                int i16 = c5158a.f198256e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f198253a;
                    uh1.j.Data dataT9 = this.f198254b.T9((uh1.i) obj);
                    c5158a.f198257f = vq.j.a(obj);
                    c5158a.f198259h = vq.j.a(c5158a);
                    c5158a.f198260j = vq.j.a(obj);
                    c5158a.f198261k = vq.j.a(hVar);
                    c5158a.f198262l = 0;
                    c5158a.f198256e = 1;
                    if (hVar.F(dataT9, c5158a) == objE) {
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

        public a(mu.g gVar, d0 d0Var) {
            this.f198251a = gVar;
            this.f198252b = d0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super uh1.j.Data> hVar, tq.e eVar) {
            Object objA = this.f198251a.a(new C5157a(hVar, this.f198252b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Luh1/f$b;", "action", "Lk10/c0;", "Luh1/i$j;", "state", "Lk10/l;", "Luh1/i;", "<anonymous>", "(Luh1/f$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class a0 extends vq.k implements er.q<uh1.f.ChangeSelectedTab, k10.c0<uh1.i.InitializedWithoutDocuments>, tq.e<? super k10.l<? extends uh1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198263e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198264f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f198265g;

        a0(tq.e<? super a0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uh1.i.InitializedWithoutDocuments O(uh1.f.ChangeSelectedTab changeSelectedTab, uh1.i.InitializedWithoutDocuments initializedWithoutDocuments) {
            return uh1.i.InitializedWithoutDocuments.b(initializedWithoutDocuments, changeSelectedTab.getSelectedTab(), false, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final uh1.f.ChangeSelectedTab changeSelectedTab = (uh1.f.ChangeSelectedTab) this.f198264f;
            k10.c0 c0Var = (k10.c0) this.f198265g;
            uq.b.e();
            if (this.f198263e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: uh1.v0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.a0.O(changeSelectedTab, (i.InitializedWithoutDocuments) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(uh1.f.ChangeSelectedTab changeSelectedTab, k10.c0<uh1.i.InitializedWithoutDocuments> c0Var, tq.e<? super k10.l<? extends uh1.i>> eVar) {
            a0 a0Var = new a0(eVar);
            a0Var.f198264f = changeSelectedTab;
            a0Var.f198265g = c0Var;
            return a0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Luh1/f$j;", "action", "Luh1/i;", "state", "Loq/i0;", "<anonymous>", "(Luh1/f$j;Luh1/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<uh1.f.j, uh1.i, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198266e;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f198268e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ d0 f198269f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d0 d0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f198269f = d0Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f198268e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    h64.q qVar = this.f198269f.loadRemoteSettingsUseCase;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f198268e = 1;
                    obj = qVar.c(c1792a, this);
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
                d0 d0Var = this.f198269f;
                if (iVar instanceof dx.i.Left) {
                    dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    if ((bVar instanceof dx.b.Deactivate) || (bVar instanceof dx.b.AppUpdateRequired)) {
                        d0Var.d9(new uh1.f.LoadRemoteSettingsError(bVar));
                    } else if ((bVar instanceof dx.b.g.SslCertificate) && ((dx.b.g.SslCertificate) bVar).getAppUpdateRequired()) {
                        d0Var.d9(new uh1.f.LoadRemoteSettingsError(bVar));
                    } else {
                        d0Var.d9(uh1.f.l.f198401a);
                    }
                } else {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    d0Var.d9(uh1.f.a.f198390a);
                }
                return oq.i0.f148189a;
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f198269f, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f198266e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = d0.this.callActionWithLoaderUseCase;
                a aVar2 = new a(d0.this, null);
                this.f198266e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
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
        public final Object w(uh1.f.j jVar, uh1.i iVar, tq.e<? super oq.i0> eVar) {
            return d0.this.new b(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Luh1/f$e;", "<unused var>", "Luh1/i$j;", "Loq/i0;", "<anonymous>", "(Luh1/f$e;Luh1/i$j;)V"}, k = 3, mv = {2, 2, 0})
    static final class b0 extends vq.k implements er.q<uh1.f.e, uh1.i.InitializedWithoutDocuments, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f198270e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f198271f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f198272g;

        b0(tq.e<? super b0> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
        
            if (r1.F(r2, r5) == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
        
            if (r6.F(r1, r5) == r0) goto L23;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r5.f198272g
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L26
                if (r1 == r4) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                goto L1e
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r0 = r5.f198270e
                k34.u r0 = (k34.u) r0
            L1e:
                oq.u.b(r6)
                goto L64
            L22:
                oq.u.b(r6)
                goto L3a
            L26:
                oq.u.b(r6)
                uh1.d0 r6 = uh1.d0.this
                ch1.a0 r6 = uh1.d0.G9(r6)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r5.f198272g = r4
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L3a
                goto L63
            L3a:
                k34.u r6 = (k34.u) r6
                if (r6 == 0) goto L54
                uh1.d0 r1 = uh1.d0.this
                uh1.f$m$b r2 = uh1.f.m.b.f198403a
                java.lang.Object r6 = vq.j.a(r6)
                r5.f198270e = r6
                r6 = 0
                r5.f198271f = r6
                r5.f198272g = r3
                java.lang.Object r6 = r1.F(r2, r5)
                if (r6 != r0) goto L64
                goto L63
            L54:
                uh1.d0 r6 = uh1.d0.this
                uh1.f$m$c r1 = uh1.f.m.c.f198404a
                r3 = 0
                r5.f198270e = r3
                r5.f198272g = r2
                java.lang.Object r6 = r6.F(r1, r5)
                if (r6 != r0) goto L64
            L63:
                return r0
            L64:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: uh1.d0.b0.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(uh1.f.e eVar, uh1.i.InitializedWithoutDocuments initializedWithoutDocuments, tq.e<? super oq.i0> eVar2) {
            return d0.this.new b0(eVar2).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Luh1/f$a;", "action", "Lk10/c0;", "Luh1/i;", "state", "Lk10/l;", "<anonymous>", "(Luh1/f$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<uh1.f.a, k10.c0<uh1.i>, tq.e<? super k10.l<? extends uh1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198274e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198275f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uh1.i.b O(uh1.i iVar) {
            return uh1.i.b.f198423a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f198275f;
            uq.b.e();
            if (this.f198274e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: uh1.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.c.O((i) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(uh1.f.a aVar, k10.c0<uh1.i> c0Var, tq.e<? super k10.l<? extends uh1.i>> eVar) {
            c cVar = new c(eVar);
            cVar.f198275f = c0Var;
            return cVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Luh1/f$g;", "<unused var>", "Luh1/i$j;", "Loq/i0;", "<anonymous>", "(Luh1/f$g;Luh1/i$j;)V"}, k = 3, mv = {2, 2, 0})
    static final class c0 extends vq.k implements er.q<uh1.f.g, uh1.i.InitializedWithoutDocuments, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198276e;

        c0(tq.e<? super c0> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f198276e;
            if (i15 == 0) {
                oq.u.b(obj);
                d0 d0Var = d0.this;
                uh1.f.m.e eVar = uh1.f.m.e.f198406a;
                this.f198276e = 1;
                if (d0Var.F(eVar, this) == objE) {
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
        public final Object w(uh1.f.g gVar, uh1.i.InitializedWithoutDocuments initializedWithoutDocuments, tq.e<? super oq.i0> eVar) {
            return d0.this.new c0(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Luh1/f$p;", "action", "Luh1/i;", "<unused var>", "Loq/i0;", "<anonymous>", "(Luh1/f$p;Luh1/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<uh1.f.ShowError, uh1.i, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f198278e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f198279f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f198280g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f198281h;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(ib4.c.b bVar) {
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uh1.f.ShowError showError = (uh1.f.ShowError) this.f198281h;
            Object objE = uq.b.e();
            int i15 = this.f198280g;
            if (i15 == 0) {
                oq.u.b(obj);
                jb4.b bVarB = d0.this.domainErrorMapper.b(new ib4.c.Params(showError.getDomainError(), false, new er.l() { // from class: uh1.f0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return d0.d.O((ib4.c.b) obj2);
                    }
                }, 2, null));
                d0 d0Var = d0.this;
                jb4.b bVar = bVarB;
                uh1.f.m.Error error = new uh1.f.m.Error(bVar);
                this.f198281h = vq.j.a(showError);
                this.f198278e = vq.j.a(bVar);
                this.f198279f = 0;
                this.f198280g = 1;
                if (d0Var.F(error, this) == objE) {
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
        public final Object w(uh1.f.ShowError showError, uh1.i iVar, tq.e<? super oq.i0> eVar) {
            d dVar = d0.this.new d(eVar);
            dVar.f198281h = showError;
            return dVar.J(oq.i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: uh1.d0$d0, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Luh1/f$n;", "<unused var>", "Lk10/c0;", "Luh1/i$h;", "state", "Lk10/l;", "Luh1/i;", "<anonymous>", "(Luh1/f$n;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class C5159d0 extends vq.k implements er.q<uh1.f.n, k10.c0<uh1.i.h>, tq.e<? super k10.l<? extends uh1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198283e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198284f;

        C5159d0(tq.e<? super C5159d0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uh1.i.d O(uh1.i.h hVar) {
            return uh1.i.d.f198425a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f198284f;
            uq.b.e();
            if (this.f198283e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: uh1.w0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.C5159d0.O((i.h) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(uh1.f.n nVar, k10.c0<uh1.i.h> c0Var, tq.e<? super k10.l<? extends uh1.i>> eVar) {
            C5159d0 c5159d0 = new C5159d0(eVar);
            c5159d0.f198284f = c0Var;
            return c5159d0.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Luh1/f$k;", "action", "Luh1/i;", "<unused var>", "Loq/i0;", "<anonymous>", "(Luh1/f$k;Luh1/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<uh1.f.LoadRemoteSettingsError, uh1.i, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f198285e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f198286f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f198287g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f198288h;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(d0 d0Var, ib4.c.b bVar) {
            if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                d0Var.d9(uh1.f.j.f198399a);
            } else if (!(bVar instanceof ib4.c.b.AbstractC2161b.a) && !(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                throw new oq.p();
            }
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uh1.f.LoadRemoteSettingsError loadRemoteSettingsError = (uh1.f.LoadRemoteSettingsError) this.f198288h;
            Object objE = uq.b.e();
            int i15 = this.f198287g;
            if (i15 == 0) {
                oq.u.b(obj);
                ib4.c cVar = d0.this.domainErrorMapper;
                dx.b domainError = loadRemoteSettingsError.getDomainError();
                final d0 d0Var = d0.this;
                jb4.b bVarB = cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: uh1.g0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return d0.e.O(d0Var, (ib4.c.b) obj2);
                    }
                }, 2, null));
                d0 d0Var2 = d0.this;
                jb4.b bVar = bVarB;
                uh1.f.m.Error error = new uh1.f.m.Error(bVar);
                this.f198288h = vq.j.a(loadRemoteSettingsError);
                this.f198285e = vq.j.a(bVar);
                this.f198286f = 0;
                this.f198287g = 1;
                if (d0Var2.F(error, this) == objE) {
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
        public final Object w(uh1.f.LoadRemoteSettingsError loadRemoteSettingsError, uh1.i iVar, tq.e<? super oq.i0> eVar) {
            e eVar2 = d0.this.new e(eVar);
            eVar2.f198288h = loadRemoteSettingsError;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Luh1/i$d;", "it", "Loq/i0;", "<anonymous>", "(Luh1/i$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class e0 extends vq.k implements er.p<uh1.i.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198290e;

        e0(tq.e<? super e0> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f198290e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            d0.this.d9(uh1.f.d.f198393a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(uh1.i.d dVar, tq.e<? super oq.i0> eVar) {
            return ((e0) v(dVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return d0.this.new e0(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Luh1/i$a;", "state", "Lk10/l;", "Luh1/i;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<k10.c0<uh1.i.a>, tq.e<? super k10.l<? extends uh1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198292e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198293f;

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uh1.i.q O(uh1.i.a aVar) {
            return uh1.i.q.f198442a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f198293f;
            Object objE = uq.b.e();
            int i15 = this.f198292e;
            if (i15 == 0) {
                oq.u.b(obj);
                mz3.c cVar = d0.this.asyncRetryDownloadDocumentsUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f198293f = c0Var;
                this.f198292e = 1;
                if (cVar.c(c1792a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.d(new er.l() { // from class: uh1.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.f.O((i.a) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<uh1.i.a> c0Var, tq.e<? super k10.l<? extends uh1.i>> eVar) {
            return ((f) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            f fVar = d0.this.new f(eVar);
            fVar.f198293f = obj;
            return fVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Luh1/f$d;", "<unused var>", "Lk10/c0;", "Luh1/i$d;", "state", "Lk10/l;", "Luh1/i;", "<anonymous>", "(Luh1/f$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f0 extends vq.k implements er.q<uh1.f.d, k10.c0<uh1.i.d>, tq.e<? super k10.l<? extends uh1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198295e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198296f;

        f0(tq.e<? super f0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uh1.i.l V(uh1.i.d dVar) {
            return uh1.i.l.f198436a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uh1.i.n X(uh1.i.d dVar) {
            return uh1.i.n.f198438a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f198296f;
            Object objE = uq.b.e();
            int i15 = this.f198295e;
            if (i15 == 0) {
                oq.u.b(obj);
                h64.o oVar = d0.this.isServicesNeedUpdateUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f198296f = c0Var;
                this.f198295e = 1;
                obj = oVar.c(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return ((Boolean) obj).booleanValue() ? c0Var.d(new er.l() { // from class: uh1.x0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.f0.V((i.d) obj2);
                }
            }) : c0Var.d(new er.l() { // from class: uh1.y0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.f0.X((i.d) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(uh1.f.d dVar, k10.c0<uh1.i.d> c0Var, tq.e<? super k10.l<? extends uh1.i>> eVar) {
            f0 f0Var = d0.this.new f0(eVar);
            f0Var.f198296f = c0Var;
            return f0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Luh1/i$q;", "state", "Lk10/l;", "Luh1/i;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<k10.c0<uh1.i.q>, tq.e<? super k10.l<? extends uh1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198298e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198299f;

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uh1.i.k O(uh1.i.q qVar) {
            return uh1.i.k.f198435a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f198299f;
            Object objE = uq.b.e();
            int i15 = this.f198298e;
            if (i15 == 0) {
                oq.u.b(obj);
                yg1.a aVar = d0.this.dashboardContainersInteractor;
                this.f198299f = c0Var;
                this.f198298e = 1;
                if (aVar.c(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.d(new er.l() { // from class: uh1.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.g.O((i.q) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<uh1.i.q> c0Var, tq.e<? super k10.l<? extends uh1.i>> eVar) {
            return ((g) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            g gVar = d0.this.new g(eVar);
            gVar.f198299f = obj;
            return gVar;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Luh1/i$l;", "state", "Loq/i0;", "<anonymous>", "(Luh1/i$l;)V"}, k = 3, mv = {2, 2, 0})
    static final class g0 extends vq.k implements er.p<uh1.i.l, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198301e;

        g0(tq.e<? super g0> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f198301e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            d0.this.d9(uh1.f.j.f198399a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(uh1.i.l lVar, tq.e<? super oq.i0> eVar) {
            return ((g0) v(lVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return d0.this.new g0(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Luh1/i$k;", "state", "Lk10/l;", "Luh1/i;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.p<k10.c0<uh1.i.k>, tq.e<? super k10.l<? extends uh1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198303e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198304f;

        h(tq.e<? super h> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uh1.i.MigrateToNewLocalNotifications O(List list, uh1.i.k kVar) {
            return new uh1.i.MigrateToNewLocalNotifications(list);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f198304f;
            Object objE = uq.b.e();
            int i15 = this.f198303e;
            if (i15 == 0) {
                oq.u.b(obj);
                q1 q1Var = d0.this.loadCachedAddedDocumentsUC;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f198304f = c0Var;
                this.f198303e = 1;
                obj = q1Var.c(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final List list = (List) obj;
            return c0Var.d(new er.l() { // from class: uh1.j0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.h.O(list, (i.k) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<uh1.i.k> c0Var, tq.e<? super k10.l<? extends uh1.i>> eVar) {
            return ((h) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            h hVar = d0.this.new h(eVar);
            hVar.f198304f = obj;
            return hVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Luh1/f$l;", "action", "Lk10/c0;", "Luh1/i$l;", "state", "Lk10/l;", "Luh1/i;", "<anonymous>", "(Luh1/f$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h0 extends vq.k implements er.q<uh1.f.l, k10.c0<uh1.i.l>, tq.e<? super k10.l<? extends uh1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198306e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198307f;

        h0(tq.e<? super h0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uh1.i.n O(uh1.i.l lVar) {
            return uh1.i.n.f198438a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f198307f;
            uq.b.e();
            if (this.f198306e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: uh1.z0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.h0.O((i.l) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(uh1.f.l lVar, k10.c0<uh1.i.l> c0Var, tq.e<? super k10.l<? extends uh1.i>> eVar) {
            h0 h0Var = new h0(eVar);
            h0Var.f198307f = c0Var;
            return h0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Luh1/i$p;", "state", "Lk10/l;", "Luh1/i;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.p<k10.c0<uh1.i.MigrateToNewLocalNotifications>, tq.e<? super k10.l<? extends uh1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198308e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198309f;

        i(tq.e<? super i> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uh1.i.CheckAndRegisterDeviceToNotifications O(uh1.i.MigrateToNewLocalNotifications migrateToNewLocalNotifications) {
            return new uh1.i.CheckAndRegisterDeviceToNotifications(migrateToNewLocalNotifications.a());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f198309f;
            Object objE = uq.b.e();
            int i15 = this.f198308e;
            if (i15 == 0) {
                oq.u.b(obj);
                ch1.k0 k0Var = d0.this.migrateToNewLocalNotificationsUseCase;
                ch1.k0.Params params = new ch1.k0.Params(((uh1.i.MigrateToNewLocalNotifications) c0Var.a()).a());
                this.f198309f = c0Var;
                this.f198308e = 1;
                if (k0Var.d(params, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.d(new er.l() { // from class: uh1.k0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.i.O((i.MigrateToNewLocalNotifications) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<uh1.i.MigrateToNewLocalNotifications> c0Var, tq.e<? super k10.l<? extends uh1.i>> eVar) {
            return ((i) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            i iVar = d0.this.new i(eVar);
            iVar.f198309f = obj;
            return iVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Luh1/f$k;", "action", "Lk10/c0;", "Luh1/i$l;", "state", "Lk10/l;", "Luh1/i;", "<anonymous>", "(Luh1/f$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i0 extends vq.k implements er.q<uh1.f.LoadRemoteSettingsError, k10.c0<uh1.i.l>, tq.e<? super k10.l<? extends uh1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198311e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198312f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f198313g;

        i0(tq.e<? super i0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uh1.i.LoadRemoteSettingsError O(uh1.f.LoadRemoteSettingsError loadRemoteSettingsError, uh1.i.l lVar) {
            return new uh1.i.LoadRemoteSettingsError(loadRemoteSettingsError.getDomainError());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final uh1.f.LoadRemoteSettingsError loadRemoteSettingsError = (uh1.f.LoadRemoteSettingsError) this.f198312f;
            k10.c0 c0Var = (k10.c0) this.f198313g;
            uq.b.e();
            if (this.f198311e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: uh1.a1
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.i0.O(loadRemoteSettingsError, (i.l) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(uh1.f.LoadRemoteSettingsError loadRemoteSettingsError, k10.c0<uh1.i.l> c0Var, tq.e<? super k10.l<? extends uh1.i>> eVar) {
            i0 i0Var = new i0(eVar);
            i0Var.f198312f = loadRemoteSettingsError;
            i0Var.f198313g = c0Var;
            return i0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Luh1/i$c;", "state", "Lk10/l;", "Luh1/i;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.p<k10.c0<uh1.i.CheckAndRegisterDeviceToNotifications>, tq.e<? super k10.l<? extends uh1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198314e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198315f;

        j(tq.e<? super j> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uh1.i.GetExpiredIdentityType O(uh1.i.CheckAndRegisterDeviceToNotifications checkAndRegisterDeviceToNotifications) {
            return new uh1.i.GetExpiredIdentityType(checkAndRegisterDeviceToNotifications.a());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f198315f;
            Object objE = uq.b.e();
            int i15 = this.f198314e;
            if (i15 == 0) {
                oq.u.b(obj);
                yg1.c cVar = d0.this.notificationsInteractor;
                this.f198315f = c0Var;
                this.f198314e = 1;
                if (cVar.a(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.d(new er.l() { // from class: uh1.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.j.O((i.CheckAndRegisterDeviceToNotifications) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<uh1.i.CheckAndRegisterDeviceToNotifications> c0Var, tq.e<? super k10.l<? extends uh1.i>> eVar) {
            return ((j) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            j jVar = d0.this.new j(eVar);
            jVar.f198315f = obj;
            return jVar;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Luh1/i$m;", "state", "Loq/i0;", "<anonymous>", "(Luh1/i$m;)V"}, k = 3, mv = {2, 2, 0})
    static final class j0 extends vq.k implements er.p<uh1.i.LoadRemoteSettingsError, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198317e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198318f;

        j0(tq.e<? super j0> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uh1.i.LoadRemoteSettingsError loadRemoteSettingsError = (uh1.i.LoadRemoteSettingsError) this.f198318f;
            uq.b.e();
            if (this.f198317e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            d0.this.d9(new uh1.f.LoadRemoteSettingsError(loadRemoteSettingsError.getDomainError()));
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(uh1.i.LoadRemoteSettingsError loadRemoteSettingsError, tq.e<? super oq.i0> eVar) {
            return ((j0) v(loadRemoteSettingsError, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            j0 j0Var = d0.this.new j0(eVar);
            j0Var.f198318f = obj;
            return j0Var;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Luh1/i$g;", "state", "Lk10/l;", "Luh1/i;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.p<k10.c0<uh1.i.GetExpiredIdentityType>, tq.e<? super k10.l<? extends uh1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198320e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198321f;

        k(tq.e<? super k> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uh1.i.MigrateOldUserServicesToFavouritesAndInitialize O(k34.u uVar, uh1.i.GetExpiredIdentityType getExpiredIdentityType) {
            return new uh1.i.MigrateOldUserServicesToFavouritesAndInitialize(getExpiredIdentityType.a(), uVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f198321f;
            Object objE = uq.b.e();
            int i15 = this.f198320e;
            if (i15 == 0) {
                oq.u.b(obj);
                ch1.a0 a0Var = d0.this.getExpiredIdentityTypeUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f198321f = c0Var;
                this.f198320e = 1;
                obj = a0Var.a(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final k34.u uVar = (k34.u) obj;
            return c0Var.d(new er.l() { // from class: uh1.m0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.k.O(uVar, (i.GetExpiredIdentityType) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<uh1.i.GetExpiredIdentityType> c0Var, tq.e<? super k10.l<? extends uh1.i>> eVar) {
            return ((k) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            k kVar = d0.this.new k(eVar);
            kVar.f198321f = obj;
            return kVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Luh1/i$b;", "state", "Lk10/l;", "Luh1/i;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k0 extends vq.k implements er.p<k10.c0<uh1.i.b>, tq.e<? super k10.l<? extends uh1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198323e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198324f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ k10.z<uh1.i.b, uh1.i, uh1.f> f198326h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ i70.e f198327j;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Luh1/i$n;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends uh1.i.n>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f198328e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f198329f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f198330g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f198331h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f198332j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f198333k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f198334l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f198335m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ d0 f198336n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ k10.z<uh1.i.b, uh1.i, uh1.f> f198337p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ k10.c0<uh1.i.b> f198338q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ i70.e f198339r;

            /* JADX INFO: renamed from: uh1.d0$k0$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final /* synthetic */ class C5160a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f198340a;

                static {
                    int[] iArr = new int[k34.u.values().length];
                    try {
                        iArr[k34.u.MOBYWATEL.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[k34.u.DIIA.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f198340a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d0 d0Var, k10.z<uh1.i.b, uh1.i, uh1.f> zVar, k10.c0<uh1.i.b> c0Var, i70.e eVar, tq.e<? super a> eVar2) {
                super(1, eVar2);
                this.f198336n = d0Var;
                this.f198337p = zVar;
                this.f198338q = c0Var;
                this.f198339r = eVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final uh1.i.n X(uh1.i.b bVar) {
                return uh1.i.n.f198438a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final uh1.i.n Y(uh1.i.b bVar) {
                return uh1.i.n.f198438a;
            }

            /* JADX WARN: Code duplicated, block: B:33:0x00d4  */
            /* JADX WARN: Code duplicated, block: B:34:0x00d6  */
            /* JADX WARN: Code duplicated, block: B:36:0x00e0 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:38:0x00e4  */
            /* JADX WARN: Code duplicated, block: B:39:0x00ef  */
            /* JADX WARN: Code duplicated, block: B:41:0x00fc  */
            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                d0 d0Var;
                k10.c0<uh1.i.b> c0Var;
                k10.c0<uh1.i.b> c0Var2;
                i70.e eVar;
                k34.u uVar;
                int i15;
                Label label;
                Object objE = uq.b.e();
                int i16 = this.f198335m;
                Label labelC = null;
                if (i16 == 0) {
                    oq.u.b(obj);
                    wz3.a aVar = this.f198336n.certAutoRenewIfShouldUC;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f198335m = 1;
                    obj = aVar.c(c1792a, this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i16 == 1) {
                    oq.u.b(obj);
                } else {
                    if (i16 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    eVar = (i70.e) this.f198331h;
                    c0Var2 = (k10.c0) this.f198330g;
                    d0Var = (d0) this.f198329f;
                    oq.u.b(obj);
                }
                uVar = (k34.u) ((dx.i) obj).a();
                if (uVar == null) {
                    i15 = -1;
                } else {
                    i15 = C5160a.f198340a[uVar.ordinal()];
                }
                if (i15 != 1) {
                    labelC = d0Var.labelProvider.c(sg1.a.f181488k0);
                } else if (i15 == 2) {
                    labelC = d0Var.labelProvider.c(sg1.a.f181496m0);
                }
                label = labelC;
                if (label != null) {
                    eVar.y(new p50.a.DefaultWithIcon(label, false, null, null, 14, null));
                }
                c0Var = c0Var2;
                return c0Var.d(new er.l() { // from class: uh1.c1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return d0.k0.a.Y((i.b) obj2);
                    }
                });
                dx.i iVar = (dx.i) obj;
                d0Var = this.f198336n;
                k10.z<uh1.i.b, uh1.i, uh1.f> zVar = this.f198337p;
                c0Var = this.f198338q;
                i70.e eVar2 = this.f198339r;
                if (iVar instanceof dx.i.Left) {
                    dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    px.d dVar = d0Var.remoteLogger;
                    dx.b.Generic generic = bVar instanceof dx.b.Generic ? (dx.b.Generic) bVar : null;
                    dVar.T6("StartStateMachine error: generateNewCert failure", generic != null ? generic.getE() : null, px.c.a(zVar));
                    return c0Var.d(new er.l() { // from class: uh1.b1
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return d0.k0.a.X((i.b) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                wz3.a.Result result = (wz3.a.Result) ((dx.i.Right) iVar).b();
                if (result.getWasRenewed()) {
                    d0Var.remoteLogger.u6("DashboardMainVM info: certificate auto renewed", px.c.a(zVar));
                    yg1.a aVar2 = d0Var.dashboardContainersInteractor;
                    this.f198328e = vq.j.a(iVar);
                    this.f198329f = d0Var;
                    this.f198330g = c0Var;
                    this.f198331h = eVar2;
                    this.f198332j = vq.j.a(result);
                    this.f198333k = 0;
                    this.f198334l = 0;
                    this.f198335m = 2;
                    obj = yg1.a.h(aVar2, false, this, 1, null);
                    if (obj != objE) {
                        c0Var2 = c0Var;
                        eVar = eVar2;
                        uVar = (k34.u) ((dx.i) obj).a();
                        if (uVar == null) {
                            i15 = -1;
                        } else {
                            i15 = C5160a.f198340a[uVar.ordinal()];
                        }
                        if (i15 != 1) {
                            labelC = d0Var.labelProvider.c(sg1.a.f181488k0);
                        } else if (i15 == 2) {
                            labelC = d0Var.labelProvider.c(sg1.a.f181496m0);
                        }
                        label = labelC;
                        if (label != null) {
                            eVar.y(new p50.a.DefaultWithIcon(label, false, null, null, 14, null));
                        }
                        c0Var = c0Var2;
                    }
                    return objE;
                }
                return c0Var.d(new er.l() { // from class: uh1.c1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return d0.k0.a.Y((i.b) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f198336n, this.f198337p, this.f198338q, this.f198339r, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<uh1.i.n>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k0(k10.z<uh1.i.b, uh1.i, uh1.f> zVar, i70.e eVar, tq.e<? super k0> eVar2) {
            super(2, eVar2);
            this.f198326h = zVar;
            this.f198327j = eVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f198324f;
            Object objE = uq.b.e();
            int i15 = this.f198323e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = d0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(d0.this, this.f198326h, c0Var, this.f198327j, null);
            this.f198324f = vq.j.a(c0Var);
            this.f198323e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<uh1.i.b> c0Var, tq.e<? super k10.l<? extends uh1.i>> eVar) {
            return ((k0) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            k0 k0Var = d0.this.new k0(this.f198326h, this.f198327j, eVar);
            k0Var.f198324f = obj;
            return k0Var;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Luh1/i$o;", "state", "Lk10/l;", "Luh1/i;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.p<k10.c0<uh1.i.MigrateOldUserServicesToFavouritesAndInitialize>, tq.e<? super k10.l<? extends uh1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198341e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198342f;

        l(tq.e<? super l> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uh1.i O(boolean z15, uh1.i.MigrateOldUserServicesToFavouritesAndInitialize migrateOldUserServicesToFavouritesAndInitialize) {
            if (migrateOldUserServicesToFavouritesAndInitialize.a().isEmpty() || migrateOldUserServicesToFavouritesAndInitialize.getExpiredIdentityType() != null) {
                return new uh1.i.InitializedWithoutDocuments(migrateOldUserServicesToFavouritesAndInitialize.getExpiredIdentityType() != null ? uh1.g.DOCUMENT_EXPIRED : uh1.g.DOCUMENTS, false);
            }
            return new uh1.i.Initialized(z15, uh1.g.DOCUMENTS, false);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
        
            if (r6 == r1) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f198342f
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r5.f198341e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L22
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                oq.u.b(r6)
                goto L4b
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
                uh1.d0 r6 = uh1.d0.this
                ch1.j0 r6 = uh1.d0.L9(r6)
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r5.f198342f = r0
                r5.f198341e = r4
                java.lang.Object r6 = r6.a(r2, r5)
                if (r6 != r1) goto L38
                goto L4a
            L38:
                uh1.d0 r6 = uh1.d0.this
                dh1.b r6 = uh1.d0.P9(r6)
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r5.f198342f = r0
                r5.f198341e = r3
                java.lang.Object r6 = r6.a(r2, r5)
                if (r6 != r1) goto L4b
            L4a:
                return r1
            L4b:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                uh1.n0 r1 = new uh1.n0
                r1.<init>()
                k10.l r6 = r0.d(r1)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: uh1.d0.l.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<uh1.i.MigrateOldUserServicesToFavouritesAndInitialize> c0Var, tq.e<? super k10.l<? extends uh1.i>> eVar) {
            return ((l) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            l lVar = d0.this.new l(eVar);
            lVar.f198342f = obj;
            return lVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Luh1/i$n;", "state", "Lk10/l;", "Luh1/i;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l0 extends vq.k implements er.p<k10.c0<uh1.i.n>, tq.e<? super k10.l<? extends uh1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198344e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198345f;

        l0(tq.e<? super l0> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uh1.i.e O(uh1.i.n nVar) {
            return uh1.i.e.f198426a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f198345f;
            uq.b.e();
            if (this.f198344e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: uh1.d1
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.l0.O((i.n) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<uh1.i.n> c0Var, tq.e<? super k10.l<? extends uh1.i>> eVar) {
            return ((l0) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            l0 l0Var = new l0(eVar);
            l0Var.f198345f = obj;
            return l0Var;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Luh1/f$f;", "<unused var>", "Luh1/i$i;", "Loq/i0;", "<anonymous>", "(Luh1/f$f;Luh1/i$i;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<uh1.f.C5161f, uh1.i.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198346e;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f198346e;
            if (i15 == 0) {
                oq.u.b(obj);
                d0 d0Var = d0.this;
                uh1.f.m.d dVar = uh1.f.m.d.f198405a;
                this.f198346e = 1;
                if (d0Var.F(dVar, this) == objE) {
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
        public final Object w(uh1.f.C5161f c5161f, uh1.i.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return d0.this.new m(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Luh1/i$e;", "state", "Lk10/l;", "Luh1/i;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m0 extends vq.k implements er.p<k10.c0<uh1.i.e>, tq.e<? super k10.l<? extends uh1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198348e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198349f;

        m0(tq.e<? super m0> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uh1.i.f O(uh1.i.e eVar) {
            return uh1.i.f.f198427a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f198349f;
            Object objE = uq.b.e();
            int i15 = this.f198348e;
            if (i15 == 0) {
                oq.u.b(obj);
                q34.y yVar = d0.this.fetchDocumentsConfigsUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f198349f = c0Var;
                this.f198348e = 1;
                if (yVar.c(c1792a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.d(new er.l() { // from class: uh1.e1
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.m0.O((i.e) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<uh1.i.e> c0Var, tq.e<? super k10.l<? extends uh1.i>> eVar) {
            return ((m0) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            m0 m0Var = d0.this.new m0(eVar);
            m0Var.f198349f = obj;
            return m0Var;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Luh1/f$g;", "<unused var>", "Luh1/i$i;", "Loq/i0;", "<anonymous>", "(Luh1/f$g;Luh1/i$i;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<uh1.f.g, uh1.i.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198351e;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f198351e;
            if (i15 == 0) {
                oq.u.b(obj);
                d0 d0Var = d0.this;
                uh1.f.m.e eVar = uh1.f.m.e.f198406a;
                this.f198351e = 1;
                if (d0Var.F(eVar, this) == objE) {
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
        public final Object w(uh1.f.g gVar, uh1.i.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return d0.this.new n(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Luh1/i$f;", "state", "Lk10/l;", "Luh1/i;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n0 extends vq.k implements er.p<k10.c0<uh1.i.f>, tq.e<? super k10.l<? extends uh1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f198353e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f198354f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f198355g;

        n0(tq.e<? super n0> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uh1.i.a O(uh1.i.f fVar) {
            return uh1.i.a.f198422a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
        
            if (r2.c(r4, r5) == r1) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f198355g
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r5.f198354f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L22
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                oq.u.b(r6)
                goto L55
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
                uh1.d0 r6 = uh1.d0.this
                dh1.b r6 = uh1.d0.P9(r6)
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r5.f198355g = r0
                r5.f198354f = r4
                java.lang.Object r6 = r6.a(r2, r5)
                if (r6 != r1) goto L38
                goto L54
            L38:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 == 0) goto L55
                uh1.d0 r2 = uh1.d0.this
                h64.g r2 = uh1.d0.H9(r2)
                gz.b$a$a r4 = gz.b.a.C1792a.f78542a
                r5.f198355g = r0
                r5.f198353e = r6
                r5.f198354f = r3
                java.lang.Object r6 = r2.c(r4, r5)
                if (r6 != r1) goto L55
            L54:
                return r1
            L55:
                uh1.f1 r6 = new uh1.f1
                r6.<init>()
                k10.l r6 = r0.d(r6)
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: uh1.d0.n0.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<uh1.i.f> c0Var, tq.e<? super k10.l<? extends uh1.i>> eVar) {
            return ((n0) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            n0 n0Var = d0.this.new n0(eVar);
            n0Var.f198355g = obj;
            return n0Var;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "isImeVisible", "Lk10/c0;", "Luh1/i$i;", "state", "Lk10/l;", "Luh1/i;", "<anonymous>", "(ZLk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<Boolean, k10.c0<uh1.i.Initialized>, tq.e<? super k10.l<? extends uh1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198357e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ boolean f198358f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f198359g;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uh1.i.Initialized O(boolean z15, uh1.i.Initialized initialized) {
            return uh1.i.Initialized.b(initialized, false, null, z15, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final boolean z15 = this.f198358f;
            k10.c0 c0Var = (k10.c0) this.f198359g;
            uq.b.e();
            if (this.f198357e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: uh1.o0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.o.O(z15, (i.Initialized) obj2);
                }
            });
        }

        public final Object N(boolean z15, k10.c0<uh1.i.Initialized> c0Var, tq.e<? super k10.l<? extends uh1.i>> eVar) {
            o oVar = new o(eVar);
            oVar.f198358f = z15;
            oVar.f198359g = c0Var;
            return oVar.J(oq.i0.f148189a);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ Object w(Boolean bool, k10.c0<uh1.i.Initialized> c0Var, tq.e<? super k10.l<? extends uh1.i>> eVar) {
            return N(bool.booleanValue(), c0Var, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Loq/i0;", "<unused var>", "Luh1/i$i;", "<anonymous>", "(VLpl/gov/coi/mobywatel/feature/dashboard/presentation/screens/main/DashboardMainVM$State$Initialized;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<oq.i0, uh1.i.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198360e;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f198360e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            d0.this.d9(uh1.f.c.f198392a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(oq.i0 i0Var, uh1.i.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return d0.this.new p(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Luh1/i$i;", "it", "Loq/i0;", "<anonymous>", "(Luh1/i$i;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.p<uh1.i.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198362e;

        q(tq.e<? super q> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f198362e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            d0.this.d9(uh1.f.e.f198394a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(uh1.i.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return ((q) v(initialized, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return d0.this.new q(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Luh1/f$c;", "<unused var>", "Lk10/c0;", "Luh1/i$i;", "state", "Lk10/l;", "Luh1/i;", "<anonymous>", "(Luh1/f$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<uh1.f.c, k10.c0<uh1.i.Initialized>, tq.e<? super k10.l<? extends uh1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198364e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198365f;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uh1.i.InitializedWithoutDocuments V(uh1.i.Initialized initialized) {
            return new uh1.i.InitializedWithoutDocuments(uh1.g.DOCUMENT_EXPIRED, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uh1.i.InitializedWithoutDocuments X(uh1.i.Initialized initialized) {
            return new uh1.i.InitializedWithoutDocuments(uh1.g.DOCUMENTS, false);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
        
            if (r6 == r1) goto L18;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f198365f
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r5.f198364e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L22
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                oq.u.b(r6)
                goto L57
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
                uh1.d0 r6 = uh1.d0.this
                ch1.a0 r6 = uh1.d0.G9(r6)
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r5.f198365f = r0
                r5.f198364e = r4
                java.lang.Object r6 = r6.a(r2, r5)
                if (r6 != r1) goto L38
                goto L56
            L38:
                if (r6 == 0) goto L44
                uh1.p0 r6 = new uh1.p0
                r6.<init>()
                k10.l r6 = r0.d(r6)
                return r6
            L44:
                uh1.d0 r6 = uh1.d0.this
                q34.q1 r6 = uh1.d0.J9(r6)
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r5.f198365f = r0
                r5.f198364e = r3
                java.lang.Object r6 = r6.c(r2, r5)
                if (r6 != r1) goto L57
            L56:
                return r1
            L57:
                java.util.List r6 = (java.util.List) r6
                boolean r6 = r6.isEmpty()
                if (r6 == 0) goto L69
                uh1.q0 r6 = new uh1.q0
                r6.<init>()
                k10.l r6 = r0.d(r6)
                return r6
            L69:
                k10.l r6 = r0.c()
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: uh1.d0.r.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(uh1.f.c cVar, k10.c0<uh1.i.Initialized> c0Var, tq.e<? super k10.l<? extends uh1.i>> eVar) {
            r rVar = d0.this.new r(eVar);
            rVar.f198365f = c0Var;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Luh1/f$b;", "action", "Lk10/c0;", "Luh1/i$i;", "state", "Lk10/l;", "Luh1/i;", "<anonymous>", "(Luh1/f$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<uh1.f.ChangeSelectedTab, k10.c0<uh1.i.Initialized>, tq.e<? super k10.l<? extends uh1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198367e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198368f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f198369g;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uh1.i.Initialized O(uh1.f.ChangeSelectedTab changeSelectedTab, uh1.i.Initialized initialized) {
            return uh1.i.Initialized.b(initialized, false, changeSelectedTab.getSelectedTab(), false, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final uh1.f.ChangeSelectedTab changeSelectedTab = (uh1.f.ChangeSelectedTab) this.f198368f;
            k10.c0 c0Var = (k10.c0) this.f198369g;
            uq.b.e();
            if (this.f198367e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: uh1.r0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.s.O(changeSelectedTab, (i.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(uh1.f.ChangeSelectedTab changeSelectedTab, k10.c0<uh1.i.Initialized> c0Var, tq.e<? super k10.l<? extends uh1.i>> eVar) {
            s sVar = new s(eVar);
            sVar.f198368f = changeSelectedTab;
            sVar.f198369g = c0Var;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Luh1/f$o;", "<unused var>", "Lk10/c0;", "Luh1/i$i;", "state", "Lk10/l;", "Luh1/i;", "<anonymous>", "(Luh1/f$o;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<uh1.f.o, k10.c0<uh1.i.Initialized>, tq.e<? super k10.l<? extends uh1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198370e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f198371f;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uh1.i.Initialized O(uh1.i.Initialized initialized) {
            return uh1.i.Initialized.b(initialized, true, null, false, 6, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f198371f;
            uq.b.e();
            if (this.f198370e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: uh1.s0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.t.O((i.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(uh1.f.o oVar, k10.c0<uh1.i.Initialized> c0Var, tq.e<? super k10.l<? extends uh1.i>> eVar) {
            t tVar = new t(eVar);
            tVar.f198371f = c0Var;
            return tVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Luh1/f$e;", "<unused var>", "Luh1/i$i;", "Loq/i0;", "<anonymous>", "(Luh1/f$e;Luh1/i$i;)V"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<uh1.f.e, uh1.i.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198372e;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f198372e;
            if (i15 == 0) {
                oq.u.b(obj);
                d0 d0Var = d0.this;
                uh1.f.m.c cVar = uh1.f.m.c.f198404a;
                this.f198372e = 1;
                if (d0Var.F(cVar, this) == objE) {
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
        public final Object w(uh1.f.e eVar, uh1.i.Initialized initialized, tq.e<? super oq.i0> eVar2) {
            return d0.this.new u(eVar2).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Luh1/f$i;", "<unused var>", "Luh1/i$i;", "Loq/i0;", "<anonymous>", "(Luh1/f$i;Luh1/i$i;)V"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<uh1.f.i, uh1.i.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198374e;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f198374e;
            if (i15 == 0) {
                oq.u.b(obj);
                d0 d0Var = d0.this;
                uh1.f.m.g gVar = uh1.f.m.g.f198408a;
                this.f198374e = 1;
                if (d0Var.F(gVar, this) == objE) {
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
        public final Object w(uh1.f.i iVar, uh1.i.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return d0.this.new v(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Luh1/f$h;", "<unused var>", "Luh1/i$i;", "Loq/i0;", "<anonymous>", "(Luh1/f$h;Luh1/i$i;)V"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<uh1.f.h, uh1.i.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198376e;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f198376e;
            if (i15 == 0) {
                oq.u.b(obj);
                d0 d0Var = d0.this;
                uh1.f.m.C5162f c5162f = uh1.f.m.C5162f.f198407a;
                this.f198376e = 1;
                if (d0Var.F(c5162f, this) == objE) {
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
        public final Object w(uh1.f.h hVar, uh1.i.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return d0.this.new w(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "isImeVisible", "Lk10/c0;", "Luh1/i$j;", "state", "Lk10/l;", "Luh1/i;", "<anonymous>", "(ZLk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.q<Boolean, k10.c0<uh1.i.InitializedWithoutDocuments>, tq.e<? super k10.l<? extends uh1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198378e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ boolean f198379f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f198380g;

        x(tq.e<? super x> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uh1.i.InitializedWithoutDocuments O(boolean z15, uh1.i.InitializedWithoutDocuments initializedWithoutDocuments) {
            return uh1.i.InitializedWithoutDocuments.b(initializedWithoutDocuments, null, z15, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final boolean z15 = this.f198379f;
            k10.c0 c0Var = (k10.c0) this.f198380g;
            uq.b.e();
            if (this.f198378e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: uh1.t0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.x.O(z15, (i.InitializedWithoutDocuments) obj2);
                }
            });
        }

        public final Object N(boolean z15, k10.c0<uh1.i.InitializedWithoutDocuments> c0Var, tq.e<? super k10.l<? extends uh1.i>> eVar) {
            x xVar = new x(eVar);
            xVar.f198379f = z15;
            xVar.f198380g = c0Var;
            return xVar.J(oq.i0.f148189a);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ Object w(Boolean bool, k10.c0<uh1.i.InitializedWithoutDocuments> c0Var, tq.e<? super k10.l<? extends uh1.i>> eVar) {
            return N(bool.booleanValue(), c0Var, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Luh1/i$j;", "<unused var>", "Loq/i0;", "<anonymous>", "(Luh1/i$j;)V"}, k = 3, mv = {2, 2, 0})
    static final class y extends vq.k implements er.p<uh1.i.InitializedWithoutDocuments, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f198381e;

        y(tq.e<? super y> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f198381e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            d0.this.d9(uh1.f.e.f198394a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(uh1.i.InitializedWithoutDocuments initializedWithoutDocuments, tq.e<? super oq.i0> eVar) {
            return ((y) v(initializedWithoutDocuments, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return d0.this.new y(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Luh1/f$n;", "<unused var>", "Lk10/c0;", "Luh1/i$j;", "state", "Lk10/l;", "Luh1/i;", "<anonymous>", "(Luh1/f$n;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class z extends vq.k implements er.q<uh1.f.n, k10.c0<uh1.i.InitializedWithoutDocuments>, tq.e<? super k10.l<? extends uh1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f198383e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f198384f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f198385g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f198386h;

        z(tq.e<? super z> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uh1.i.Initialized O(boolean z15, uh1.i.InitializedWithoutDocuments initializedWithoutDocuments) {
            return new uh1.i.Initialized(z15, uh1.g.DOCUMENTS, false);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x008c, code lost:
        
            if (r7 == r1) goto L24;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f198386h
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r6.f198385g
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L35
                if (r2 == r5) goto L31
                if (r2 == r4) goto L29
                if (r2 != r3) goto L21
                java.lang.Object r1 = r6.f198384f
                java.util.List r1 = (java.util.List) r1
                java.lang.Object r1 = r6.f198383e
                k34.u r1 = (k34.u) r1
                oq.u.b(r7)
                goto L8f
            L21:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L29:
                java.lang.Object r2 = r6.f198383e
                k34.u r2 = (k34.u) r2
                oq.u.b(r7)
                goto L63
            L31:
                oq.u.b(r7)
                goto L4b
            L35:
                oq.u.b(r7)
                uh1.d0 r7 = uh1.d0.this
                ch1.a0 r7 = uh1.d0.G9(r7)
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r6.f198386h = r0
                r6.f198385g = r5
                java.lang.Object r7 = r7.a(r2, r6)
                if (r7 != r1) goto L4b
                goto L8e
            L4b:
                r2 = r7
                k34.u r2 = (k34.u) r2
                uh1.d0 r7 = uh1.d0.this
                q34.q1 r7 = uh1.d0.J9(r7)
                gz.b$a$a r5 = gz.b.a.C1792a.f78542a
                r6.f198386h = r0
                r6.f198383e = r2
                r6.f198385g = r4
                java.lang.Object r7 = r7.c(r5, r6)
                if (r7 != r1) goto L63
                goto L8e
            L63:
                java.util.List r7 = (java.util.List) r7
                if (r2 != 0) goto L9f
                r4 = r7
                java.util.Collection r4 = (java.util.Collection) r4
                boolean r4 = r4.isEmpty()
                if (r4 != 0) goto L9f
                uh1.d0 r4 = uh1.d0.this
                dh1.b r4 = uh1.d0.P9(r4)
                gz.b$a$a r5 = gz.b.a.C1792a.f78542a
                r6.f198386h = r0
                java.lang.Object r2 = vq.j.a(r2)
                r6.f198383e = r2
                java.lang.Object r7 = vq.j.a(r7)
                r6.f198384f = r7
                r6.f198385g = r3
                java.lang.Object r7 = r4.a(r5, r6)
                if (r7 != r1) goto L8f
            L8e:
                return r1
            L8f:
                java.lang.Boolean r7 = (java.lang.Boolean) r7
                boolean r7 = r7.booleanValue()
                uh1.u0 r1 = new uh1.u0
                r1.<init>()
                k10.l r7 = r0.d(r1)
                return r7
            L9f:
                k10.l r7 = r0.c()
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: uh1.d0.z.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(uh1.f.n nVar, k10.c0<uh1.i.InitializedWithoutDocuments> c0Var, tq.e<? super k10.l<? extends uh1.i>> eVar) {
            z zVar = d0.this.new z(eVar);
            zVar.f198386h = c0Var;
            return zVar.J(oq.i0.f148189a);
        }
    }

    public d0(yy.a aVar, vh1.h hVar, ib4.c cVar, h64.q qVar, q34.y yVar, mz3.c cVar2, ch1.a0 a0Var, q1 q1Var, ch1.k0 k0Var, wz3.a aVar2, h64.o oVar, yg1.c cVar3, ch1.j0 j0Var, dh1.b bVar, h64.g gVar, ac4.a aVar3, mx.c cVar4, px.d dVar, a14.l lVar, yg1.a aVar4, final i70.e eVar) {
        this.f198229b = eVar;
        this.mapper = hVar;
        this.domainErrorMapper = cVar;
        this.loadRemoteSettingsUseCase = qVar;
        this.fetchDocumentsConfigsUseCase = yVar;
        this.asyncRetryDownloadDocumentsUseCase = cVar2;
        this.getExpiredIdentityTypeUseCase = a0Var;
        this.loadCachedAddedDocumentsUC = q1Var;
        this.migrateToNewLocalNotificationsUseCase = k0Var;
        this.certAutoRenewIfShouldUC = aVar2;
        this.isServicesNeedUpdateUseCase = oVar;
        this.notificationsInteractor = cVar3;
        this.migrateOldUserServicesToFavouritesUserCase = j0Var;
        this.isGlobalSearchActiveUC = bVar;
        this.getGlobalSearchConfigurationUC = gVar;
        this.callActionWithLoaderUseCase = aVar3;
        this.labelProvider = cVar4;
        this.remoteLogger = dVar;
        this.getImeVisibleStateUseCase = lVar;
        this.dashboardContainersInteractor = aVar4;
        uh1.i.h hVar2 = uh1.i.h.f198429a;
        this.initialState = hVar2;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(hVar2, new er.l() { // from class: uh1.k
            @Override // er.l
            public final Object b(Object obj) {
                return d0.V9(this.f198449a, eVar, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), T9(hVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final uh1.j.Data T9(uh1.i state) {
        return this.mapper.b(new vh1.h.Params(state, b9(uh1.f.e.f198394a), b9(uh1.f.i.f198398a), b9(uh1.f.h.f198397a), b9(uh1.f.C5161f.f198395a), b9(uh1.f.g.f198396a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V9(final d0 d0Var, final i70.e eVar, k10.v vVar) {
        vVar.c(fr.q0.c(uh1.i.class), new er.l() { // from class: uh1.u
            @Override // er.l
            public final Object b(Object obj) {
                return d0.W9(this.f198464a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(uh1.i.h.class), new er.l() { // from class: uh1.l
            @Override // er.l
            public final Object b(Object obj) {
                return d0.X9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(uh1.i.d.class), new er.l() { // from class: uh1.m
            @Override // er.l
            public final Object b(Object obj) {
                return d0.ga(this.f198451a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(uh1.i.l.class), new er.l() { // from class: uh1.n
            @Override // er.l
            public final Object b(Object obj) {
                return d0.ha(this.f198453a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(uh1.i.LoadRemoteSettingsError.class), new er.l() { // from class: uh1.o
            @Override // er.l
            public final Object b(Object obj) {
                return d0.ia(this.f198455a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(uh1.i.b.class), new er.l() { // from class: uh1.p
            @Override // er.l
            public final Object b(Object obj) {
                return d0.ja(this.f198457a, eVar, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(uh1.i.n.class), new er.l() { // from class: uh1.q
            @Override // er.l
            public final Object b(Object obj) {
                return d0.ka((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(uh1.i.e.class), new er.l() { // from class: uh1.r
            @Override // er.l
            public final Object b(Object obj) {
                return d0.la(this.f198459a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(uh1.i.f.class), new er.l() { // from class: uh1.s
            @Override // er.l
            public final Object b(Object obj) {
                return d0.ma(this.f198461a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(uh1.i.a.class), new er.l() { // from class: uh1.t
            @Override // er.l
            public final Object b(Object obj) {
                return d0.na(this.f198462a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(uh1.i.q.class), new er.l() { // from class: uh1.v
            @Override // er.l
            public final Object b(Object obj) {
                return d0.Y9(this.f198466a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(uh1.i.k.class), new er.l() { // from class: uh1.w
            @Override // er.l
            public final Object b(Object obj) {
                return d0.Z9(this.f198468a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(uh1.i.MigrateToNewLocalNotifications.class), new er.l() { // from class: uh1.x
            @Override // er.l
            public final Object b(Object obj) {
                return d0.aa(this.f198469a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(uh1.i.CheckAndRegisterDeviceToNotifications.class), new er.l() { // from class: uh1.y
            @Override // er.l
            public final Object b(Object obj) {
                return d0.ba(this.f198470a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(uh1.i.GetExpiredIdentityType.class), new er.l() { // from class: uh1.z
            @Override // er.l
            public final Object b(Object obj) {
                return d0.ca(this.f198471a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(uh1.i.MigrateOldUserServicesToFavouritesAndInitialize.class), new er.l() { // from class: uh1.a0
            @Override // er.l
            public final Object b(Object obj) {
                return d0.da(this.f198218a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(uh1.i.Initialized.class), new er.l() { // from class: uh1.b0
            @Override // er.l
            public final Object b(Object obj) {
                return d0.ea(this.f198222a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(uh1.i.InitializedWithoutDocuments.class), new er.l() { // from class: uh1.c0
            @Override // er.l
            public final Object b(Object obj) {
                return d0.fa(this.f198226a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W9(d0 d0Var, k10.z zVar) {
        b bVar = d0Var.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(uh1.f.j.class), oVar, bVar);
        zVar.v(fr.q0.c(uh1.f.a.class), oVar, new c(null));
        zVar.x(fr.q0.c(uh1.f.ShowError.class), oVar, d0Var.new d(null));
        zVar.x(fr.q0.c(uh1.f.LoadRemoteSettingsError.class), oVar, d0Var.new e(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X9(k10.z zVar) {
        C5159d0 c5159d0 = new C5159d0(null);
        zVar.v(fr.q0.c(uh1.f.n.class), k10.o.CANCEL_PREVIOUS, c5159d0);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y9(d0 d0Var, k10.z zVar) {
        zVar.A(d0Var.new g(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z9(d0 d0Var, k10.z zVar) {
        zVar.A(d0Var.new h(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 aa(d0 d0Var, k10.z zVar) {
        zVar.A(d0Var.new i(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ba(d0 d0Var, k10.z zVar) {
        zVar.A(d0Var.new j(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ca(d0 d0Var, k10.z zVar) {
        zVar.A(d0Var.new k(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 da(d0 d0Var, k10.z zVar) {
        zVar.A(d0Var.new l(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ea(d0 d0Var, k10.z zVar) {
        k10.k.m(zVar, (mu.g) d0Var.getImeVisibleStateUseCase.a(gz.b.a.C1792a.f78542a), null, new o(null), 2, null);
        k10.k.s(zVar, d0Var.dashboardContainersInteractor.i(), null, d0Var.new p(null), 2, null);
        zVar.C(d0Var.new q(null));
        r rVar = d0Var.new r(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(uh1.f.c.class), oVar, rVar);
        zVar.v(fr.q0.c(uh1.f.ChangeSelectedTab.class), oVar, new s(null));
        zVar.v(fr.q0.c(uh1.f.o.class), oVar, new t(null));
        zVar.x(fr.q0.c(uh1.f.e.class), oVar, d0Var.new u(null));
        zVar.x(fr.q0.c(uh1.f.i.class), oVar, d0Var.new v(null));
        zVar.x(fr.q0.c(uh1.f.h.class), oVar, d0Var.new w(null));
        zVar.x(fr.q0.c(uh1.f.C5161f.class), oVar, d0Var.new m(null));
        zVar.x(fr.q0.c(uh1.f.g.class), oVar, d0Var.new n(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 fa(d0 d0Var, k10.z zVar) {
        k10.k.m(zVar, (mu.g) d0Var.getImeVisibleStateUseCase.a(gz.b.a.C1792a.f78542a), null, new x(null), 2, null);
        zVar.C(d0Var.new y(null));
        z zVar2 = d0Var.new z(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(uh1.f.n.class), oVar, zVar2);
        zVar.v(fr.q0.c(uh1.f.ChangeSelectedTab.class), oVar, new a0(null));
        zVar.x(fr.q0.c(uh1.f.e.class), oVar, d0Var.new b0(null));
        zVar.x(fr.q0.c(uh1.f.g.class), oVar, d0Var.new c0(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ga(d0 d0Var, k10.z zVar) {
        zVar.C(d0Var.new e0(null));
        f0 f0Var = d0Var.new f0(null);
        zVar.v(fr.q0.c(uh1.f.d.class), k10.o.CANCEL_PREVIOUS, f0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ha(d0 d0Var, k10.z zVar) {
        zVar.C(d0Var.new g0(null));
        h0 h0Var = new h0(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(uh1.f.l.class), oVar, h0Var);
        zVar.v(fr.q0.c(uh1.f.LoadRemoteSettingsError.class), oVar, new i0(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ia(d0 d0Var, k10.z zVar) {
        zVar.C(d0Var.new j0(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ja(d0 d0Var, i70.e eVar, k10.z zVar) {
        zVar.A(d0Var.new k0(zVar, eVar, null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ka(k10.z zVar) {
        zVar.A(new l0(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 la(d0 d0Var, k10.z zVar) {
        zVar.A(d0Var.new m0(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ma(d0 d0Var, k10.z zVar) {
        zVar.A(d0Var.new n0(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 na(d0 d0Var, k10.z zVar) {
        zVar.A(d0Var.new f(null));
        return oq.i0.f148189a;
    }

    @Override // i70.e
    public void B0() {
        this.f198229b.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: S9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(uh1.f.m mVar, tq.e<? super oq.i0> eVar) {
        return super.F(mVar, eVar);
    }

    @Override // uh1.j
    public void U6() {
        d9(uh1.f.o.f198410a);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: U9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // zx.b
    public xw.b<uh1.f.m> Y1() {
        return this.navAction;
    }

    @Override // uh1.j
    public void c1(uh1.g dashboardTab) {
        d9(new uh1.f.ChangeSelectedTab(dashboardTab));
    }

    @Override // l00.g
    protected k10.t<uh1.i, uh1.f> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<uh1.j.Data> getState() {
        return this.state;
    }

    @Override // uh1.j
    public void n() {
        d9(uh1.f.n.f198409a);
    }

    @Override // i70.e
    public void y(p50.a snackBarData) {
        this.f198229b.y(snackBarData);
    }
}
