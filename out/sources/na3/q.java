package na3;

import fr.q0;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005Bs\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u0002H\u0002¢\u0006\u0004\b$\u0010%J\u0013\u0010(\u001a\u00020'*\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u0018\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020*H\u0082@¢\u0006\u0004\b-\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR \u0010Q\u001a\b\u0012\u0004\u0012\u00020L0K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR&\u0010W\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030R8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR \u0010\"\u001a\b\u0012\u0004\u0012\u00020#0X8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\¨\u0006]"}, d2 = {"Lna3/q;", "Ll00/g;", "Lna3/e;", "Lna3/c;", "Lna3/f;", "", "Lyy/a;", "stateMachineFactory", "Loa3/a;", "mapper", "Lcb4/j;", "dialogVMSFactory", "Loa3/b;", "downloadInterruptionDialogMapper", "Li70/e;", "globalSnackBarManager", "Lmx/c;", "labelProvider", "Lib4/c;", "genericDomainErrorMapper", "Lhb4/d;", "errorVMSFactory", "Lac4/n;", "openUriIntentUseCase", "Laa3/b;", "downloadAndSaveConfirmationUC", "La14/f;", "deleteFileFromDeviceUC", "Laa3/a;", "convertFilePathToUriUC", "Lna3/d;", "setupData", "<init>", "(Lyy/a;Loa3/a;Lcb4/j;Loa3/b;Li70/e;Lmx/c;Lib4/c;Lhb4/d;Lac4/n;Laa3/b;La14/f;Laa3/a;Lna3/d;)V", "state", "Lna3/f$a;", "w9", "(Lna3/e;)Lna3/f$a;", "Ldx/b;", "Ljb4/b;", "y9", "(Ldx/b;)Ljb4/b;", "", "filePath", "Loq/i0;", "x9", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "b", "Loa3/a;", "c", "Lcb4/j;", "d", "Loa3/b;", "e", "Li70/e;", "f", "Lmx/c;", "g", "Lib4/c;", "h", "Lhb4/d;", "j", "Lac4/n;", "k", "Laa3/b;", "l", "La14/f;", "m", "Laa3/a;", "n", "Lna3/d;", "Lna3/e$b;", "p", "Lna3/e$b;", "initialState", "Lxw/b;", "Lna3/c$a;", "q", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "r", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "s", "Lmu/p0;", "getState", "()Lmu/p0;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<na3.e, na3.c> implements na3.f, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oa3.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final oa3.b downloadInterruptionDialogMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final ac4.n openUriIntentUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final aa3.b downloadAndSaveConfirmationUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final a14.f deleteFileFromDeviceUC;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final aa3.a convertFilePathToUriUC;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final na3.e.DownloadingConfirmation initialState;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final xw.b<na3.c.a> navAction;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final k10.t<na3.e, na3.c> stateMachine;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final p0<na3.f.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f133770d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f133771e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f133772f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f133774h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f133772f = obj;
            this.f133774h |= PKIFailureInfo.systemUnavail;
            return q.this.x9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<na3.f.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f133775a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f133776b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f133777a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f133778b;

            /* JADX INFO: renamed from: na3.q$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3319a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f133779d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f133780e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f133781f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f133783h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f133784j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f133785k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f133786l;

                public C3319a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f133779d = obj;
                    this.f133780e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, q qVar) {
                this.f133777a = hVar;
                this.f133778b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3319a c3319a;
                if (eVar instanceof C3319a) {
                    c3319a = (C3319a) eVar;
                    int i15 = c3319a.f133780e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3319a.f133780e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3319a = new C3319a(eVar);
                    }
                } else {
                    c3319a = new C3319a(eVar);
                }
                Object obj2 = c3319a.f133779d;
                Object objE = uq.b.e();
                int i16 = c3319a.f133780e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f133777a;
                    na3.f.a aVarW9 = this.f133778b.w9((na3.e) obj);
                    c3319a.f133781f = vq.j.a(obj);
                    c3319a.f133783h = vq.j.a(c3319a);
                    c3319a.f133784j = vq.j.a(obj);
                    c3319a.f133785k = vq.j.a(hVar);
                    c3319a.f133786l = 0;
                    c3319a.f133780e = 1;
                    if (hVar.F(aVarW9, c3319a) == objE) {
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

        public b(mu.g gVar, q qVar) {
            this.f133775a = gVar;
            this.f133776b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super na3.f.a> hVar, tq.e eVar) {
            Object objA = this.f133775a.a(new a(hVar, this.f133776b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lna3/e$b;", "state", "Lk10/l;", "Lna3/e;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<c0<na3.e.DownloadingConfirmation>, tq.e<? super k10.l<? extends na3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f133787e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f133788f;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final na3.e.Error V(q qVar, dx.b bVar, na3.e.DownloadingConfirmation downloadingConfirmation) {
            return new na3.e.Error(downloadingConfirmation.getTripUuid(), qVar.errorVMSFactory.a(qVar.y9(bVar)), null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final na3.e.DownloadingConfirmation X(String str, na3.e.DownloadingConfirmation downloadingConfirmation) {
            return na3.e.DownloadingConfirmation.b(downloadingConfirmation, null, null, str, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f133788f;
            Object objE = uq.b.e();
            int i15 = this.f133787e;
            if (i15 == 0) {
                oq.u.b(obj);
                aa3.b bVar = q.this.downloadAndSaveConfirmationUC;
                aa3.b.Params params = new aa3.b.Params(((na3.e.DownloadingConfirmation) c0Var.a()).getTripUuid(), null);
                this.f133788f = c0Var;
                this.f133787e = 1;
                obj = bVar.e(params, this);
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
            final q qVar = q.this;
            if (iVar instanceof dx.i.Left) {
                final dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                return c0Var.d(new er.l() { // from class: na3.r
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q.c.V(qVar, bVar2, (e.DownloadingConfirmation) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final String str = (String) ((dx.i.Right) iVar).b();
            k10.l lVarB = c0Var.b(new er.l() { // from class: na3.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.c.X(str, (e.DownloadingConfirmation) obj2);
                }
            });
            qVar.d9(new na3.c.OnDownloadFinish(str));
            return lVarB;
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<na3.e.DownloadingConfirmation> c0Var, tq.e<? super k10.l<? extends na3.e>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = q.this.new c(eVar);
            cVar.f133788f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lna3/c$c;", "action", "Lna3/e$b;", "state", "Loq/i0;", "<anonymous>", "(Lna3/c$c;Lna3/e$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<na3.c.OnDownloadFinish, na3.e.DownloadingConfirmation, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f133790e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f133791f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f133792g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            na3.c.OnDownloadFinish onDownloadFinish = (na3.c.OnDownloadFinish) this.f133791f;
            na3.e.DownloadingConfirmation downloadingConfirmation = (na3.e.DownloadingConfirmation) this.f133792g;
            Object objE = uq.b.e();
            int i15 = this.f133790e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (downloadingConfirmation.getDialogVmsAdapter() == null) {
                    q qVar = q.this;
                    String filePath = onDownloadFinish.getFilePath();
                    this.f133791f = vq.j.a(onDownloadFinish);
                    this.f133792g = vq.j.a(downloadingConfirmation);
                    this.f133790e = 1;
                    if (qVar.x9(filePath, this) == objE) {
                        return objE;
                    }
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
        public final Object w(na3.c.OnDownloadFinish onDownloadFinish, na3.e.DownloadingConfirmation downloadingConfirmation, tq.e<? super i0> eVar) {
            d dVar = q.this.new d(eVar);
            dVar.f133791f = onDownloadFinish;
            dVar.f133792g = downloadingConfirmation;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lna3/c$b;", "<unused var>", "Lk10/c0;", "Lna3/e$b;", "state", "Lk10/l;", "Lna3/e;", "<anonymous>", "(Lna3/c$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<na3.c.b, c0<na3.e.DownloadingConfirmation>, tq.e<? super k10.l<? extends na3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f133794e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f133795f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final na3.e.DownloadingConfirmation O(q qVar, na3.e.DownloadingConfirmation downloadingConfirmation) {
            return na3.e.DownloadingConfirmation.b(downloadingConfirmation, null, qVar.dialogVMSFactory.a(qVar.downloadInterruptionDialogMapper.b(new oa3.b.Params(qVar.b9(na3.a.f133724a), qVar.b9(na3.b.f133725a)))), null, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f133795f;
            uq.b.e();
            if (this.f133794e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final q qVar = q.this;
            return c0Var.b(new er.l() { // from class: na3.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.e.O(qVar, (e.DownloadingConfirmation) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(na3.c.b bVar, c0<na3.e.DownloadingConfirmation> c0Var, tq.e<? super k10.l<? extends na3.e>> eVar) {
            e eVar2 = q.this.new e(eVar);
            eVar2.f133795f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lna3/a;", "<unused var>", "Lk10/c0;", "Lna3/e$b;", "state", "Lk10/l;", "Lna3/e;", "<anonymous>", "(Lna3/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<na3.a, c0<na3.e.DownloadingConfirmation>, tq.e<? super k10.l<? extends na3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f133797e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f133798f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f133799g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f133800h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f133801j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f133802k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f133803l;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final na3.e.DownloadingConfirmation O(na3.e.DownloadingConfirmation downloadingConfirmation) {
            return na3.e.DownloadingConfirmation.b(downloadingConfirmation, null, null, null, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f133803l;
            Object objE = uq.b.e();
            int i15 = this.f133802k;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                k10.l lVar = (k10.l) this.f133797e;
                oq.u.b(obj);
                return lVar;
            }
            oq.u.b(obj);
            k10.l lVarB = c0Var.b(new er.l() { // from class: na3.u
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.f.O((e.DownloadingConfirmation) obj2);
                }
            });
            q qVar = q.this;
            String filePath = ((na3.e.DownloadingConfirmation) c0Var.a()).getFilePath();
            if (filePath != null) {
                this.f133803l = vq.j.a(c0Var);
                this.f133797e = lVarB;
                this.f133798f = vq.j.a(lVarB);
                this.f133799g = vq.j.a(filePath);
                this.f133800h = 0;
                this.f133801j = 0;
                this.f133802k = 1;
                if (qVar.x9(filePath, this) == objE) {
                    return objE;
                }
            }
            return lVarB;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(na3.a aVar, c0<na3.e.DownloadingConfirmation> c0Var, tq.e<? super k10.l<? extends na3.e>> eVar) {
            f fVar = q.this.new f(eVar);
            fVar.f133803l = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lna3/b;", "<unused var>", "Lk10/c0;", "Lna3/e$b;", "state", "Lk10/l;", "Lna3/e;", "<anonymous>", "(Lna3/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<na3.b, c0<na3.e.DownloadingConfirmation>, tq.e<? super k10.l<? extends na3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f133805e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f133806f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final na3.e.DownloadInterrupted O(na3.e.DownloadingConfirmation downloadingConfirmation) {
            return new na3.e.DownloadInterrupted(downloadingConfirmation.getFilePath());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f133806f;
            uq.b.e();
            if (this.f133805e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: na3.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.g.O((e.DownloadingConfirmation) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(na3.b bVar, c0<na3.e.DownloadingConfirmation> c0Var, tq.e<? super k10.l<? extends na3.e>> eVar) {
            g gVar = new g(eVar);
            gVar.f133806f = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lna3/e$a;", "state", "Loq/i0;", "<anonymous>", "(Lna3/e$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.p<na3.e.DownloadInterrupted, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f133807e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f133808f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f133809g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f133810h;

        h(tq.e<? super h> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x004f, code lost:
        
            if (r8 == r1) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
        
            if (r8.F(r2, r7) == r1) goto L18;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f133810h
                na3.e$a r0 = (na3.e.DownloadInterrupted) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r7.f133809g
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L26
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                oq.u.b(r8)
                goto L6a
            L16:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1e:
                java.lang.Object r2 = r7.f133807e
                java.lang.String r2 = (java.lang.String) r2
                oq.u.b(r8)
                goto L52
            L26:
                oq.u.b(r8)
                java.lang.String r8 = r0.getFilePath()
                if (r8 == 0) goto L54
                na3.q r2 = na3.q.this
                a14.f r2 = na3.q.n9(r2)
                a14.f$a r5 = new a14.f$a
                r5.<init>(r8)
                java.lang.Object r6 = vq.j.a(r0)
                r7.f133810h = r6
                java.lang.Object r8 = vq.j.a(r8)
                r7.f133807e = r8
                r8 = 0
                r7.f133808f = r8
                r7.f133809g = r4
                java.lang.Object r8 = r2.c(r5, r7)
                if (r8 != r1) goto L52
                goto L69
            L52:
                dx.i r8 = (dx.i) r8
            L54:
                na3.q r8 = na3.q.this
                na3.c$a$a r2 = na3.c.a.C3316a.f133726a
                java.lang.Object r0 = vq.j.a(r0)
                r7.f133810h = r0
                r0 = 0
                r7.f133807e = r0
                r7.f133809g = r3
                java.lang.Object r8 = r8.F(r2, r7)
                if (r8 != r1) goto L6a
            L69:
                return r1
            L6a:
                oq.i0 r8 = oq.i0.f148189a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: na3.q.h.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(na3.e.DownloadInterrupted downloadInterrupted, tq.e<? super i0> eVar) {
            return ((h) v(downloadInterrupted, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            h hVar = q.this.new h(eVar);
            hVar.f133810h = obj;
            return hVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lna3/c$d;", "<unused var>", "Lk10/c0;", "Lna3/e$c;", "state", "Lk10/l;", "Lna3/e;", "<anonymous>", "(Lna3/c$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<na3.c.d, c0<na3.e.Error>, tq.e<? super k10.l<? extends na3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f133812e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f133813f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final na3.e.DownloadingConfirmation O(na3.e.Error error) {
            return new na3.e.DownloadingConfirmation(error.getTripUuid(), null, null, 6, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f133813f;
            uq.b.e();
            if (this.f133812e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: na3.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.i.O((e.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(na3.c.d dVar, c0<na3.e.Error> c0Var, tq.e<? super k10.l<? extends na3.e>> eVar) {
            i iVar = new i(eVar);
            iVar.f133813f = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lna3/c$b;", "<unused var>", "Lna3/e$c;", "Loq/i0;", "<anonymous>", "(Lna3/c$b;Lna3/e$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<na3.c.b, na3.e.Error, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f133814e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f133814e;
            if (i15 == 0) {
                oq.u.b(obj);
                q qVar = q.this;
                na3.c.a.C3316a c3316a = na3.c.a.C3316a.f133726a;
                this.f133814e = 1;
                if (qVar.F(c3316a, this) == objE) {
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
        public final Object w(na3.c.b bVar, na3.e.Error error, tq.e<? super i0> eVar) {
            return q.this.new j(eVar).J(i0.f148189a);
        }
    }

    public q(yy.a aVar, oa3.a aVar2, cb4.j jVar, oa3.b bVar, i70.e eVar, mx.c cVar, ib4.c cVar2, hb4.d dVar, ac4.n nVar, aa3.b bVar2, a14.f fVar, aa3.a aVar3, SetupData setupData) {
        this.mapper = aVar2;
        this.dialogVMSFactory = jVar;
        this.downloadInterruptionDialogMapper = bVar;
        this.globalSnackBarManager = eVar;
        this.labelProvider = cVar;
        this.genericDomainErrorMapper = cVar2;
        this.errorVMSFactory = dVar;
        this.openUriIntentUseCase = nVar;
        this.downloadAndSaveConfirmationUC = bVar2;
        this.deleteFileFromDeviceUC = fVar;
        this.convertFilePathToUriUC = aVar3;
        this.setupData = setupData;
        na3.e.DownloadingConfirmation downloadingConfirmation = new na3.e.DownloadingConfirmation(setupData.getTripUuid(), null, null, 6, null);
        this.initialState = downloadingConfirmation;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(downloadingConfirmation, new er.l() { // from class: na3.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.B9(this.f133753a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), w9(downloadingConfirmation));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(final q qVar, k10.v vVar) {
        vVar.c(q0.c(na3.e.DownloadingConfirmation.class), new er.l() { // from class: na3.l
            @Override // er.l
            public final Object b(Object obj) {
                return q.C9(this.f133749a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(na3.e.DownloadInterrupted.class), new er.l() { // from class: na3.m
            @Override // er.l
            public final Object b(Object obj) {
                return q.D9(this.f133750a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(na3.e.Error.class), new er.l() { // from class: na3.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.E9(this.f133751a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(q qVar, k10.z zVar) {
        zVar.A(qVar.new c(null));
        d dVar = qVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(na3.c.OnDownloadFinish.class), oVar, dVar);
        zVar.v(q0.c(na3.c.b.class), oVar, qVar.new e(null));
        zVar.v(q0.c(na3.a.class), oVar, qVar.new f(null));
        zVar.v(q0.c(na3.b.class), oVar, new g(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(q qVar, k10.z zVar) {
        zVar.C(qVar.new h(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(q qVar, k10.z zVar) {
        i iVar = new i(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(na3.c.d.class), oVar, iVar);
        zVar.x(q0.c(na3.c.b.class), oVar, qVar.new j(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final na3.f.a w9(na3.e state) {
        return this.mapper.b(new oa3.a.Params(state, b9(na3.c.b.f133728a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:28:0x0091  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bd, code lost:
    
        if (F(r13, r0) == r1) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x9(java.lang.String r12, tq.e<? super oq.i0> r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof na3.q.a
            if (r0 == 0) goto L13
            r0 = r13
            na3.q$a r0 = (na3.q.a) r0
            int r1 = r0.f133774h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f133774h = r1
            goto L18
        L13:
            na3.q$a r0 = new na3.q$a
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f133772f
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f133774h
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L50
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r12 = r0.f133770d
            java.lang.String r12 = (java.lang.String) r12
            oq.u.b(r13)
            goto Lc0
        L34:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L3c:
            java.lang.Object r12 = r0.f133770d
            java.lang.String r12 = (java.lang.String) r12
            oq.u.b(r13)
            goto L8b
        L44:
            java.lang.Object r12 = r0.f133771e
            ac4.n r12 = (ac4.n) r12
            java.lang.Object r2 = r0.f133770d
            java.lang.String r2 = (java.lang.String) r2
            oq.u.b(r13)
            goto L71
        L50:
            oq.u.b(r13)
            ac4.n r13 = r11.openUriIntentUseCase
            aa3.a r2 = r11.convertFilePathToUriUC
            aa3.a$a r6 = new aa3.a$a
            r6.<init>(r12)
            java.lang.Object r7 = vq.j.a(r12)
            r0.f133770d = r7
            r0.f133771e = r13
            r0.f133774h = r5
            java.lang.Object r2 = r2.d(r6, r0)
            if (r2 != r1) goto L6d
            goto Lbf
        L6d:
            r10 = r2
            r2 = r12
            r12 = r13
            r13 = r10
        L71:
            java.lang.String r13 = (java.lang.String) r13
            ac4.n$a r5 = new ac4.n$a
            r5.<init>(r13)
            java.lang.Object r13 = vq.j.a(r2)
            r0.f133770d = r13
            r13 = 0
            r0.f133771e = r13
            r0.f133774h = r4
            java.lang.Object r13 = r12.c(r5, r0)
            if (r13 != r1) goto L8a
            goto Lbf
        L8a:
            r12 = r2
        L8b:
            dx.i r13 = (dx.i) r13
            boolean r2 = r13 instanceof dx.i.Left
            if (r2 == 0) goto Laf
            dx.i$b r13 = (dx.i.Left) r13
            java.lang.Object r13 = r13.b()
            dx.b$c r13 = (dx.b.Business) r13
            i70.e r13 = r11.globalSnackBarManager
            p50.a$a r4 = new p50.a$a
            mx.c r2 = r11.labelProvider
            int r5 = r93.a.f172509r
            mx.a r5 = r2.c(r5)
            r8 = 6
            r9 = 0
            r6 = 0
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r13.y(r4)
        Laf:
            na3.c$a$b r13 = na3.c.a.b.f133727a
            java.lang.Object r12 = vq.j.a(r12)
            r0.f133770d = r12
            r0.f133774h = r3
            java.lang.Object r12 = r11.F(r13, r0)
            if (r12 != r1) goto Lc0
        Lbf:
            return r1
        Lc0:
            oq.i0 r12 = oq.i0.f148189a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: na3.q.x9(java.lang.String, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b y9(dx.b bVar) {
        return this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: na3.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.z9(this.f133752a, (ib4.c.b) obj);
            }
        }, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z9(q qVar, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.a.Secondary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            qVar.d9(na3.c.b.f133728a);
        } else {
            if (!(bVar instanceof ib4.c.b.a.Primary) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            qVar.d9(na3.c.d.f133730a);
        }
        return i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: A9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    @Override // zx.b
    public xw.b<na3.c.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<na3.e, na3.c> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<na3.f.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: v9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(na3.c.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }
}
