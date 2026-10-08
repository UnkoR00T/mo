package mx0;

import fr.q0;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import lz3.DocumentDownloadSingleStatus;
import lz3.DocumentDownloadStatus;
import lz3.DownloadTaskData;
import lz3.TaskIncludedDocumentData;
import lz3.WorkerInfo;
import mu.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v0;
import th0.AppActivationChallengeWithBeKeys;
import zw0.EIdActivationData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B»\u0001\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\b\b\u0001\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u0002052\u0006\u00104\u001a\u00020\u0002H\u0002¢\u0006\u0004\b6\u00107J\u0018\u0010:\u001a\u0002092\u0006\u00104\u001a\u000208H\u0082@¢\u0006\u0004\b:\u0010;R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010eR\u0014\u0010i\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR&\u0010o\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030j8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bk\u0010l\u001a\u0004\bm\u0010nR \u0010v\u001a\b\u0012\u0004\u0012\u00020q0p8\u0016X\u0096\u0004¢\u0006\f\n\u0004\br\u0010s\u001a\u0004\bt\u0010uR \u00104\u001a\b\u0012\u0004\u0012\u0002050w8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{¨\u0006|"}, d2 = {"Lmx0/u;", "Ll00/g;", "Lmx0/d;", "Lmx0/a;", "Lmx0/e;", "", "Lyy/a;", "stateMachineFactory", "Lnx0/d;", "screenMapper", "Lib4/c;", "genericDomainErrorMapper", "Ldx0/d;", "asyncGenerateCertActivationChallengeUC", "Lmz3/x;", "startManageAsyncDownloadWorkerUseCase", "Lmz3/n;", "getAsyncDownloadWorkersMonitorUseCase", "Lmz3/q;", "getDocumentDownloadStatusUseCase", "Lax0/a;", "afterUserActivationProcessUseCase", "Lnx0/a;", "mainDocumentLoaderDialogMapper", "Lv64/l;", "deactivateAppUseCase", "Ldx0/k;", "getMainDocumentDownloadTaskUC", "Ldx0/b;", "asyncActivateMobileApplicationUC", "Ldx0/f;", "asyncProcessAndSaveNewCertUC", "Lmz3/s;", "monitorDocumentsDownloadStatusUC", "Luh0/b;", "asyncTerminateMainDocumentDownloadUC", "Lcx0/c;", "documentsContainerInteractor", "Lmz3/e;", "cancelAsyncDownloadUC", "Lmz3/v;", "removeDocumentDownloadStatusUseCase", "Lmz3/u;", "removeAsyncDownloadTaskUC", "Lmz3/a;", "addSingleDocumentDownloadStatusUC", "Lpx/d;", "remoteLogger", "Lmx0/c;", "setupData", "<init>", "(Lyy/a;Lnx0/d;Lib4/c;Ldx0/d;Lmz3/x;Lmz3/n;Lmz3/q;Lax0/a;Lnx0/a;Lv64/l;Ldx0/k;Ldx0/b;Ldx0/f;Lmz3/s;Luh0/b;Lcx0/c;Lmz3/e;Lmz3/v;Lmz3/u;Lmz3/a;Lpx/d;Lmx0/c;)V", "state", "Lmx0/e$a;", "J9", "(Lmx0/d;)Lmx0/e$a;", "Lmx0/d$a$b;", "Loq/i0;", "I9", "(Lmx0/d$a$b;Ltq/e;)Ljava/lang/Object;", "b", "Lnx0/d;", "c", "Lib4/c;", "d", "Ldx0/d;", "e", "Lmz3/x;", "f", "Lmz3/n;", "g", "Lmz3/q;", "h", "Lax0/a;", "j", "Lnx0/a;", "k", "Lv64/l;", "l", "Ldx0/k;", "m", "Ldx0/b;", "n", "Ldx0/f;", "p", "Lmz3/s;", "q", "Luh0/b;", "r", "Lcx0/c;", "s", "Lmz3/e;", "t", "Lmz3/v;", "v", "Lmz3/u;", "w", "Lmz3/a;", "x", "Lpx/d;", "y", "Lmx0/c;", "Lmx0/d$c;", "z", "Lmx0/d$c;", "initialState", "Lk10/t;", "A", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lmx0/a$h;", "B", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "C", "Lmu/p0;", "getState", "()Lmu/p0;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u extends l00.g<mx0.d, mx0.a> implements mx0.e, zx.d {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final k10.t<mx0.d, mx0.a> stateMachine;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final xw.b<mx0.a.h> navAction;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final p0<mx0.e.a> state;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final nx0.d screenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final dx0.d asyncGenerateCertActivationChallengeUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final mz3.x startManageAsyncDownloadWorkerUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final mz3.n getAsyncDownloadWorkersMonitorUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final mz3.q getDocumentDownloadStatusUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ax0.a afterUserActivationProcessUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final nx0.a mainDocumentLoaderDialogMapper;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final v64.l deactivateAppUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final dx0.k getMainDocumentDownloadTaskUC;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final dx0.b asyncActivateMobileApplicationUC;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final dx0.f asyncProcessAndSaveNewCertUC;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final mz3.s monitorDocumentsDownloadStatusUC;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final uh0.b asyncTerminateMainDocumentDownloadUC;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final cx0.c documentsContainerInteractor;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final mz3.e cancelAsyncDownloadUC;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final mz3.v removeDocumentDownloadStatusUseCase;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final mz3.u removeAsyncDownloadTaskUC;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final mz3.a addSingleDocumentDownloadStatusUC;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final mx0.c setupData;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final mx0.d.c initialState;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f129059d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f129060e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f129061f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f129062g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f129064j;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f129062g = obj;
            this.f129064j |= PKIFailureInfo.systemUnavail;
            return u.this.I9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<mx0.e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f129065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f129066b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f129067a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f129068b;

            /* JADX INFO: renamed from: mx0.u$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3205a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f129069d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f129070e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f129071f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f129073h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f129074j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f129075k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f129076l;

                public C3205a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f129069d = obj;
                    this.f129070e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, u uVar) {
                this.f129067a = hVar;
                this.f129068b = uVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3205a c3205a;
                if (eVar instanceof C3205a) {
                    c3205a = (C3205a) eVar;
                    int i15 = c3205a.f129070e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3205a.f129070e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3205a = new C3205a(eVar);
                    }
                } else {
                    c3205a = new C3205a(eVar);
                }
                Object obj2 = c3205a.f129069d;
                Object objE = uq.b.e();
                int i16 = c3205a.f129070e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f129067a;
                    mx0.e.a aVarJ9 = this.f129068b.J9((mx0.d) obj);
                    c3205a.f129071f = vq.j.a(obj);
                    c3205a.f129073h = vq.j.a(c3205a);
                    c3205a.f129074j = vq.j.a(obj);
                    c3205a.f129075k = vq.j.a(hVar);
                    c3205a.f129076l = 0;
                    c3205a.f129070e = 1;
                    if (hVar.F(aVarJ9, c3205a) == objE) {
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

        public b(mu.g gVar, u uVar) {
            this.f129065a = gVar;
            this.f129066b = uVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super mx0.e.a> hVar, tq.e eVar) {
            Object objA = this.f129065a.a(new a(hVar, this.f129066b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmx0/a$c;", "<unused var>", "Lmx0/d;", "Loq/i0;", "<anonymous>", "(Lmx0/a$c;Lmx0/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<mx0.a.c, mx0.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129077e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f129077e;
            if (i15 == 0) {
                oq.u.b(obj);
                u.this.remoteLogger.F8("MainDocumentLoaderVM: close process", px.d.a.GENERAL);
                u uVar = u.this;
                mx0.a.h.C3199a c3199a = mx0.a.h.C3199a.f128957a;
                this.f129077e = 1;
                if (uVar.F(c3199a, this) == objE) {
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
        public final Object w(mx0.a.c cVar, mx0.d dVar, tq.e<? super oq.i0> eVar) {
            return u.this.new c(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmx0/a$g;", "action", "Lmx0/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lmx0/a$g;Lmx0/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<mx0.a.HandleError, mx0.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129079e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f129080f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(mx0.a.HandleError handleError, u uVar, ib4.c.b bVar) {
            if ((bVar instanceof ib4.c.b.a.Primary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                mx0.b error = handleError.getError();
                if (error instanceof mx0.b.CertificateActivation) {
                    uVar.d9(new mx0.a.RetryActivationProcess(((mx0.b.CertificateActivation) handleError.getError()).getMainDocumentType(), ((mx0.b.CertificateActivation) handleError.getError()).getActivationContent()));
                } else {
                    if (!(error instanceof mx0.b.Default)) {
                        throw new oq.p();
                    }
                    uVar.d9(mx0.a.c.f128950a);
                }
            } else {
                if (!(bVar instanceof ib4.c.b.AbstractC2161b.a) && !(bVar instanceof ib4.c.b.a.Close) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                    throw new oq.p();
                }
                uVar.d9(mx0.a.c.f128950a);
            }
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final mx0.a.HandleError handleError = (mx0.a.HandleError) this.f129080f;
            Object objE = uq.b.e();
            int i15 = this.f129079e;
            if (i15 == 0) {
                oq.u.b(obj);
                dx.b domainError = handleError.getError().getDomainError();
                dx.b.Business business = domainError instanceof dx.b.Business ? (dx.b.Business) domainError : null;
                if ((business != null ? business.getType() : null) == n34.a.PESEL_NOT_VALID) {
                    u.this.remoteLogger.F8("MainDocumentLoaderVM: PESEL is not valid", px.d.a.ERROR);
                    u.this.d9(new mx0.a.ShowDialog(new nx0.a.InterfaceC3450a.NewUserActivation(u.this.b9(mx0.a.d.f128951a), u.this.b9(mx0.a.c.f128950a))));
                    return oq.i0.f148189a;
                }
                px.b.y5(u.this.remoteLogger, "MainDocumentLoaderVM: activation error", null, px.c.a(u.this), 2, null);
                u uVar = u.this;
                ib4.c cVar = u.this.genericDomainErrorMapper;
                dx.b domainError2 = handleError.getError().getDomainError();
                final u uVar2 = u.this;
                mx0.a.h.Error error = new mx0.a.h.Error(cVar.b(new ib4.c.Params(domainError2, false, new er.l() { // from class: mx0.v
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return u.d.O(handleError, uVar2, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f129080f = vq.j.a(handleError);
                this.f129079e = 1;
                if (uVar.F(error, this) == objE) {
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
        public final Object w(mx0.a.HandleError handleError, mx0.d dVar, tq.e<? super oq.i0> eVar) {
            d dVar2 = u.this.new d(eVar);
            dVar2.f129080f = handleError;
            return dVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lmx0/a$j;", "action", "Lk10/c0;", "Lmx0/d;", "state", "Lk10/l;", "<anonymous>", "(Lmx0/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<mx0.a.RetryActivationProcess, k10.c0<mx0.d>, tq.e<? super k10.l<? extends mx0.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129082e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f129083f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f129084g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mx0.d.a.GenerateActivationChallenge O(mx0.a.RetryActivationProcess retryActivationProcess, mx0.d dVar) {
            return new mx0.d.a.GenerateActivationChallenge(retryActivationProcess.getMainDocumentType(), retryActivationProcess.getActivationContent());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final mx0.a.RetryActivationProcess retryActivationProcess = (mx0.a.RetryActivationProcess) this.f129083f;
            k10.c0 c0Var = (k10.c0) this.f129084g;
            uq.b.e();
            if (this.f129082e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            u.this.remoteLogger.F8("MainDocumentLoaderVM: activation retry", px.d.a.GENERAL);
            return c0Var.d(new er.l() { // from class: mx0.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.e.O(retryActivationProcess, (d) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(mx0.a.RetryActivationProcess retryActivationProcess, k10.c0<mx0.d> c0Var, tq.e<? super k10.l<? extends mx0.d>> eVar) {
            e eVar2 = u.this.new e(eVar);
            eVar2.f129083f = retryActivationProcess;
            eVar2.f129084g = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmx0/a$l;", "action", "Lmx0/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lmx0/a$l;Lmx0/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<mx0.a.ShowDialog, mx0.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129086e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f129087f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            mx0.a.ShowDialog showDialog = (mx0.a.ShowDialog) this.f129087f;
            Object objE = uq.b.e();
            int i15 = this.f129086e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                mx0.a.h.ShowDialog showDialog2 = new mx0.a.h.ShowDialog(u.this.mainDocumentLoaderDialogMapper.b(new nx0.a.Params(showDialog.getDialogType())));
                this.f129087f = vq.j.a(showDialog);
                this.f129086e = 1;
                if (uVar.F(showDialog2, this) == objE) {
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
        public final Object w(mx0.a.ShowDialog showDialog, mx0.d dVar, tq.e<? super oq.i0> eVar) {
            f fVar = u.this.new f(eVar);
            fVar.f129087f = showDialog;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lmx0/d$c;", "state", "Lk10/l;", "Lmx0/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<k10.c0<mx0.d.c>, tq.e<? super k10.l<? extends mx0.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129089e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f129090f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ k10.z<mx0.d.c, mx0.d, mx0.a> f129092h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(k10.z<mx0.d.c, mx0.d, mx0.a> zVar, tq.e<? super g> eVar) {
            super(2, eVar);
            this.f129092h = zVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mx0.d.a.GenerateActivationChallenge X(u uVar, mx0.d.c cVar) {
            return new mx0.d.a.GenerateActivationChallenge(((mx0.c.FullActivation) uVar.setupData).getMainDocumentType(), ((mx0.c.FullActivation) uVar.setupData).getActivationContent());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mx0.d.a.StartCertActivation Y(u uVar, EIdActivationData eIdActivationData, mx0.d.c cVar) {
            return new mx0.d.a.StartCertActivation(((mx0.c.EIdActivation) uVar.setupData).getMainDocumentType(), new AppActivationChallengeWithBeKeys(iy.c0.g(eIdActivationData.getChallenge()), eIdActivationData.getActiveDeviceName()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mx0.d.a.AsyncDataDownload Z(DownloadTaskData downloadTaskData, mx0.d.c cVar) {
            return new mx0.d.a.AsyncDataDownload((rq0.b) pq.v.k0(downloadTaskData.d().keySet()), false, downloadTaskData.getTaskId(), downloadTaskData, downloadTaskData.d(), false, downloadTaskData.getMainDocumentAuthToken(), 34, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f129090f;
            Object objE = uq.b.e();
            int i15 = this.f129089e;
            if (i15 == 0) {
                oq.u.b(obj);
                u.this.remoteLogger.F8("MainDocumentLoaderVM: (" + u.this.setupData.getMainDocumentType() + ") loader initialization", px.d.a.GENERAL);
                mx0.c cVar = u.this.setupData;
                if (cVar instanceof mx0.c.FullActivation) {
                    final u uVar = u.this;
                    return c0Var.d(new er.l() { // from class: mx0.x
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return u.g.X(uVar, (d.c) obj2);
                        }
                    });
                }
                if (cVar instanceof mx0.c.EIdActivation) {
                    final EIdActivationData activationData = ((mx0.c.EIdActivation) u.this.setupData).getActivationData();
                    if (activationData != null) {
                        final u uVar2 = u.this;
                        k10.l lVarD = c0Var.d(new er.l() { // from class: mx0.y
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return u.g.Y(uVar2, activationData, (d.c) obj2);
                            }
                        });
                        if (lVarD != null) {
                            return lVarD;
                        }
                    }
                    u uVar3 = u.this;
                    uVar3.remoteLogger.F8("MainDocumentLoaderVM: EIdActivation initialization error", px.d.a.ERROR);
                    uVar3.d9(new mx0.a.HandleError(new mx0.b.Default(new dx.b.Generic(null, 1, null))));
                    return c0Var.c();
                }
                if (!(cVar instanceof mx0.c.C3201c)) {
                    throw new oq.p();
                }
                dx0.k kVar = u.this.getMainDocumentDownloadTaskUC;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f129090f = c0Var;
                this.f129089e = 1;
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
            u uVar4 = u.this;
            if (iVar instanceof dx.i.Left) {
                dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                uVar4.remoteLogger.F8("MainDocumentLoaderVM: Renew document download initialization error", px.d.a.ERROR);
                uVar4.d9(new mx0.a.HandleError(new mx0.b.Default(bVar)));
                return c0Var.c();
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final DownloadTaskData downloadTaskData = (DownloadTaskData) ((dx.i.Right) iVar).b();
            return c0Var.d(new er.l() { // from class: mx0.z
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.g.Z(downloadTaskData, (d.c) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<mx0.d.c> c0Var, tq.e<? super k10.l<? extends mx0.d>> eVar) {
            return ((g) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            g gVar = u.this.new g(this.f129092h, eVar);
            gVar.f129090f = obj;
            return gVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lmx0/d$a$c;", "state", "Lk10/l;", "Lmx0/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.p<k10.c0<mx0.d.a.GenerateActivationChallenge>, tq.e<? super k10.l<? extends mx0.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129093e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f129094f;

        h(tq.e<? super h> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mx0.d.a.StartCertActivation O(k10.c0 c0Var, AppActivationChallengeWithBeKeys appActivationChallengeWithBeKeys, mx0.d.a.GenerateActivationChallenge generateActivationChallenge) {
            return new mx0.d.a.StartCertActivation(((mx0.d.a.GenerateActivationChallenge) c0Var.a()).getMainDocumentType(), appActivationChallengeWithBeKeys);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f129094f;
            Object objE = uq.b.e();
            int i15 = this.f129093e;
            if (i15 == 0) {
                oq.u.b(obj);
                u.this.remoteLogger.F8("MainDocumentLoaderVM: start generating activation challenge", px.d.a.GENERAL);
                dx0.d dVar = u.this.asyncGenerateCertActivationChallengeUC;
                dx0.d.Params params = new dx0.d.Params(((mx0.d.a.GenerateActivationChallenge) c0Var.a()).getActivationContent());
                this.f129094f = c0Var;
                this.f129093e = 1;
                obj = dVar.c(params, this);
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
            u uVar = u.this;
            if (iVar instanceof dx.i.Left) {
                dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                uVar.remoteLogger.F8("MainDocumentLoaderVM: generating activation challenge error", px.d.a.ERROR);
                uVar.d9(new mx0.a.HandleError(new mx0.b.CertificateActivation(bVar, ((mx0.d.a.GenerateActivationChallenge) c0Var.a()).getMainDocumentType(), ((mx0.d.a.GenerateActivationChallenge) c0Var.a()).getActivationContent())));
                return c0Var.c();
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final AppActivationChallengeWithBeKeys appActivationChallengeWithBeKeys = (AppActivationChallengeWithBeKeys) ((dx.i.Right) iVar).b();
            uVar.remoteLogger.F8("MainDocumentLoaderVM: has got a challenge", px.d.a.GENERAL);
            return c0Var.d(new er.l() { // from class: mx0.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.h.O(c0Var, appActivationChallengeWithBeKeys, (d.a.GenerateActivationChallenge) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<mx0.d.a.GenerateActivationChallenge> c0Var, tq.e<? super k10.l<? extends mx0.d>> eVar) {
            return ((h) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            h hVar = u.this.new h(eVar);
            hVar.f129094f = obj;
            return hVar;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmx0/d$a$d;", "state", "Loq/i0;", "<anonymous>", "(Lmx0/d$a$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.p<mx0.d.a.StartCertActivation, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129096e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f129097f;

        i(tq.e<? super i> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(u uVar) {
            uVar.d9(mx0.a.k.f128966a);
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            mx0.d.a.StartCertActivation startCertActivation = (mx0.d.a.StartCertActivation) this.f129097f;
            uq.b.e();
            if (this.f129096e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            String activeDeviceName = startCertActivation.getActivationChallenge().getActiveDeviceName();
            if (activeDeviceName != null) {
                final u uVar = u.this;
                uVar.remoteLogger.F8("MainDocumentLoaderVM: show has already activated device dialog", px.d.a.GENERAL);
                uVar.d9(new mx0.a.ShowDialog(new nx0.a.InterfaceC3450a.SecondDeviceActivation(activeDeviceName, new er.a() { // from class: mx0.b0
                    @Override // er.a
                    public final Object a() {
                        return u.i.O(uVar);
                    }
                }, uVar.b9(mx0.a.c.f128950a))));
            } else {
                u.this.d9(mx0.a.k.f128966a);
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(mx0.d.a.StartCertActivation startCertActivation, tq.e<? super oq.i0> eVar) {
            return ((i) v(startCertActivation, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            i iVar = u.this.new i(eVar);
            iVar.f129097f = obj;
            return iVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmx0/a$k;", "<unused var>", "Lk10/c0;", "Lmx0/d$a$d;", "state", "Lk10/l;", "Lmx0/d;", "<anonymous>", "(Lmx0/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<mx0.a.k, k10.c0<mx0.d.a.StartCertActivation>, tq.e<? super k10.l<? extends mx0.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129099e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f129100f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mx0.d.a.ActivateApp O(k10.c0 c0Var, mx0.d.a.StartCertActivation startCertActivation) {
            return new mx0.d.a.ActivateApp(((mx0.d.a.StartCertActivation) c0Var.a()).getMainDocumentType(), ((mx0.d.a.StartCertActivation) c0Var.a()).getActivationChallenge().getChallenge());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f129100f;
            uq.b.e();
            if (this.f129099e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            u.this.remoteLogger.F8("MainDocumentLoaderVM: go to cert activation", px.d.a.GENERAL);
            return c0Var.d(new er.l() { // from class: mx0.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.j.O(c0Var, (d.a.StartCertActivation) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(mx0.a.k kVar, k10.c0<mx0.d.a.StartCertActivation> c0Var, tq.e<? super k10.l<? extends mx0.d>> eVar) {
            j jVar = u.this.new j(eVar);
            jVar.f129100f = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lmx0/d$a$a;", "state", "Lk10/l;", "Lmx0/d;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.p<k10.c0<mx0.d.a.ActivateApp>, tq.e<? super k10.l<? extends mx0.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f129102e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f129103f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f129104g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f129105h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f129106j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f129107k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f129108l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f129109m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f129110n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f129111p;

        k(tq.e<? super k> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mx0.d.a.AsyncDataDownload O(dx0.b.Result result, k10.c0 c0Var, String str, mx0.d.a.ActivateApp activateApp) {
            return new mx0.d.a.AsyncDataDownload(((mx0.d.a.ActivateApp) c0Var.a()).getMainDocumentType(), false, result.getResponse().getDocumentToGenerate().getTaskId(), null, v0.f(oq.y.a(((mx0.d.a.ActivateApp) c0Var.a()).getMainDocumentType(), new TaskIncludedDocumentData(result.getResponse().getDocumentToGenerate().getDocumentId(), result.getResponse().getDocumentToGenerate().getAsyncDownloadTerminationInterval(), str, null, 8, null))), false, result.getResponse().getSourceDocumentAccessToken(), 34, null);
        }

        /* JADX WARN: Code duplicated, block: B:31:0x012e  */
        /* JADX WARN: Code duplicated, block: B:33:0x014b  */
        /* JADX WARN: Code duplicated, block: B:34:0x0165  */
        /* JADX WARN: Code duplicated, block: B:37:0x0175  */
        /* JADX WARN: Code duplicated, block: B:39:0x0179  */
        /* JADX WARN: Code duplicated, block: B:42:0x01c2  */
        /* JADX WARN: Code duplicated, block: B:45:0x01cd  */
        /* JADX WARN: Code duplicated, block: B:46:0x01d4  */
        /* JADX WARN: Code duplicated, block: B:49:0x01df  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dx.i iVar;
            u uVar;
            dx0.b.Result result;
            int i15;
            int i16;
            dx.i iVar2;
            final dx0.b.Result result2;
            dx.b bVar;
            mx0.b certificateActivation;
            List list;
            final String str;
            final k10.c0 c0Var = (k10.c0) this.f129111p;
            Object objE = uq.b.e();
            int i17 = this.f129110n;
            if (i17 == 0) {
                oq.u.b(obj);
                u.this.remoteLogger.F8("MainDocumentLoaderVM: cert activation starting", px.d.a.GENERAL);
                dx0.b bVar2 = u.this.asyncActivateMobileApplicationUC;
                dx0.b.Params params = new dx0.b.Params(((mx0.d.a.ActivateApp) c0Var.a()).getChallenge(), ((mx0.d.a.ActivateApp) c0Var.a()).getMainDocumentType());
                this.f129111p = c0Var;
                this.f129110n = 1;
                obj = bVar2.c(params, this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i17 == 1) {
                oq.u.b(obj);
            } else {
                if (i17 == 2) {
                    i15 = this.f129107k;
                    i16 = this.f129106j;
                    result = (dx0.b.Result) this.f129104g;
                    uVar = (u) this.f129103f;
                    iVar = (dx.i) this.f129102e;
                    oq.u.b(obj);
                    iVar2 = (dx.i) obj;
                    if (iVar2 instanceof dx.i.Left) {
                        bVar = (dx.b) ((dx.i.Left) iVar2).b();
                        uVar.remoteLogger.F8("MainDocumentLoaderVM: new cert saving error", px.d.a.ERROR);
                        if (uVar.setupData instanceof mx0.c.FullActivation) {
                            certificateActivation = new mx0.b.CertificateActivation(bVar, ((mx0.d.a.ActivateApp) c0Var.a()).getMainDocumentType(), ((mx0.c.FullActivation) uVar.setupData).getActivationContent());
                        } else {
                            certificateActivation = new mx0.b.Default(bVar);
                        }
                        uVar.d9(new mx0.a.HandleError(certificateActivation));
                        return c0Var.c();
                    }
                    if (iVar2 instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    oq.i0 i0Var = (oq.i0) ((dx.i.Right) iVar2).b();
                    uVar.remoteLogger.F8("MainDocumentLoaderVM: new cert has saved successfully", px.d.a.GENERAL);
                    cx0.c cVar = uVar.documentsContainerInteractor;
                    rq0.b mainDocumentType = ((mx0.d.a.ActivateApp) c0Var.a()).getMainDocumentType();
                    this.f129111p = c0Var;
                    this.f129102e = vq.j.a(iVar);
                    this.f129103f = result;
                    this.f129104g = vq.j.a(iVar2);
                    this.f129105h = vq.j.a(i0Var);
                    this.f129106j = i16;
                    this.f129107k = i15;
                    this.f129108l = 0;
                    this.f129109m = 0;
                    this.f129110n = 3;
                    obj = cVar.e(mainDocumentType, this);
                    if (obj != objE) {
                        result2 = result;
                    }
                    return objE;
                }
                if (i17 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                result2 = (dx0.b.Result) this.f129103f;
                oq.u.b(obj);
            }
            list = (List) ((dx.i) obj).a();
            if (list != null) {
                str = (String) pq.v.n0(list);
            } else {
                str = null;
            }
            return c0Var.d(new er.l() { // from class: mx0.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.k.O(result2, c0Var, str, (d.a.ActivateApp) obj2);
                }
            });
            iVar = (dx.i) obj;
            uVar = u.this;
            if (iVar instanceof dx.i.Left) {
                dx.b bVar3 = (dx.b) ((dx.i.Left) iVar).b();
                uVar.remoteLogger.F8("MainDocumentLoaderVM: BE cert activation error", px.d.a.ERROR);
                uVar.d9(new mx0.a.HandleError(uVar.setupData instanceof mx0.c.FullActivation ? new mx0.b.CertificateActivation(bVar3, ((mx0.d.a.ActivateApp) c0Var.a()).getMainDocumentType(), ((mx0.c.FullActivation) uVar.setupData).getActivationContent()) : new mx0.b.Default(bVar3)));
                return c0Var.c();
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            dx0.b.Result result3 = (dx0.b.Result) ((dx.i.Right) iVar).b();
            uVar.remoteLogger.F8("MainDocumentLoaderVM: new cert saving started", px.d.a.GENERAL);
            dx0.f fVar = uVar.asyncProcessAndSaveNewCertUC;
            dx0.f.Params params2 = new dx0.f.Params(result3.getResponse(), ((mx0.d.a.ActivateApp) c0Var.a()).getMainDocumentType(), result3.getKeyPair());
            this.f129111p = c0Var;
            this.f129102e = vq.j.a(iVar);
            this.f129103f = uVar;
            this.f129104g = result3;
            this.f129106j = 0;
            this.f129107k = 0;
            this.f129110n = 2;
            Object objC = fVar.c(params2, this);
            if (objC != objE) {
                result = result3;
                obj = objC;
                i15 = 0;
                i16 = 0;
                iVar2 = (dx.i) obj;
                if (iVar2 instanceof dx.i.Left) {
                    bVar = (dx.b) ((dx.i.Left) iVar2).b();
                    uVar.remoteLogger.F8("MainDocumentLoaderVM: new cert saving error", px.d.a.ERROR);
                    if (uVar.setupData instanceof mx0.c.FullActivation) {
                        certificateActivation = new mx0.b.CertificateActivation(bVar, ((mx0.d.a.ActivateApp) c0Var.a()).getMainDocumentType(), ((mx0.c.FullActivation) uVar.setupData).getActivationContent());
                    } else {
                        certificateActivation = new mx0.b.Default(bVar);
                    }
                    uVar.d9(new mx0.a.HandleError(certificateActivation));
                    return c0Var.c();
                }
                if (iVar2 instanceof dx.i.Right) {
                    throw new oq.p();
                }
                oq.i0 i0Var2 = (oq.i0) ((dx.i.Right) iVar2).b();
                uVar.remoteLogger.F8("MainDocumentLoaderVM: new cert has saved successfully", px.d.a.GENERAL);
                cx0.c cVar2 = uVar.documentsContainerInteractor;
                rq0.b mainDocumentType2 = ((mx0.d.a.ActivateApp) c0Var.a()).getMainDocumentType();
                this.f129111p = c0Var;
                this.f129102e = vq.j.a(iVar);
                this.f129103f = result;
                this.f129104g = vq.j.a(iVar2);
                this.f129105h = vq.j.a(i0Var2);
                this.f129106j = i16;
                this.f129107k = i15;
                this.f129108l = 0;
                this.f129109m = 0;
                this.f129110n = 3;
                obj = cVar2.e(mainDocumentType2, this);
                if (obj != objE) {
                    result2 = result;
                    list = (List) ((dx.i) obj).a();
                    if (list != null) {
                        str = (String) pq.v.n0(list);
                    } else {
                        str = null;
                    }
                    return c0Var.d(new er.l() { // from class: mx0.d0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return u.k.O(result2, c0Var, str, (d.a.ActivateApp) obj2);
                        }
                    });
                }
            }
            return objE;
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<mx0.d.a.ActivateApp> c0Var, tq.e<? super k10.l<? extends mx0.d>> eVar) {
            return ((k) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            k kVar = u.this.new k(eVar);
            kVar.f129111p = obj;
            return kVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmx0/a$d;", "<unused var>", "Lmx0/d$a$a;", "Loq/i0;", "<anonymous>", "(Lmx0/a$d;Lmx0/d$a$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<mx0.a.d, mx0.d.a.ActivateApp, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129113e;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
        
            if (r6.F(r1, r5) == r0) goto L15;
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
                int r1 = r5.f129113e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r6)
                goto L5e
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                oq.u.b(r6)
                goto L44
            L1e:
                oq.u.b(r6)
                mx0.u r6 = mx0.u.this
                px.d r6 = mx0.u.C9(r6)
                java.lang.String r1 = "MainDocumentLoaderVM: deactivate app"
                px.d$a r4 = px.d.a.GENERAL
                r6.F8(r1, r4)
                mx0.u r6 = mx0.u.this
                v64.l r6 = mx0.u.w9(r6)
                v64.l$a r1 = new v64.l$a
                t64.a r4 = t64.a.ONLINE
                r1.<init>(r4)
                r5.f129113e = r3
                java.lang.Object r6 = r6.c(r1, r5)
                if (r6 != r0) goto L44
                goto L5d
            L44:
                mx0.u r6 = mx0.u.this
                px.d r6 = mx0.u.C9(r6)
                java.lang.String r1 = "MainDocumentLoaderVM: app deactivated, navigate to onboarding"
                px.d$a r3 = px.d.a.GENERAL
                r6.F8(r1, r3)
                mx0.u r6 = mx0.u.this
                mx0.a$h$f r1 = mx0.a.h.f.f128962a
                r5.f129113e = r2
                java.lang.Object r6 = r6.F(r1, r5)
                if (r6 != r0) goto L5e
            L5d:
                return r0
            L5e:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: mx0.u.l.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(mx0.a.d dVar, mx0.d.a.ActivateApp activateApp, tq.e<? super oq.i0> eVar) {
            return u.this.new l(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmx0/a$e;", "<unused var>", "Lk10/c0;", "Lmx0/d$a$b;", "state", "Lk10/l;", "Lmx0/d;", "<anonymous>", "(Lmx0/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<mx0.a.e, k10.c0<mx0.d.a.AsyncDataDownload>, tq.e<? super k10.l<? extends mx0.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129115e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f129116f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mx0.d.Failure O(k10.c0 c0Var, mx0.d.a.AsyncDataDownload asyncDataDownload) {
            return new mx0.d.Failure(((mx0.d.a.AsyncDataDownload) c0Var.a()).getMainDocumentType());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f129116f;
            Object objE = uq.b.e();
            int i15 = this.f129115e;
            if (i15 == 0) {
                oq.u.b(obj);
                px.b.y5(u.this.remoteLogger, "MainDocumentLoaderVM: main document download has failed", null, px.c.a(u.this), 2, null);
                u uVar = u.this;
                mx0.d.a.AsyncDataDownload asyncDataDownload = (mx0.d.a.AsyncDataDownload) c0Var.a();
                this.f129116f = c0Var;
                this.f129115e = 1;
                if (uVar.I9(asyncDataDownload, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.d(new er.l() { // from class: mx0.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.m.O(c0Var, (d.a.AsyncDataDownload) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(mx0.a.e eVar, k10.c0<mx0.d.a.AsyncDataDownload> c0Var, tq.e<? super k10.l<? extends mx0.d>> eVar2) {
            m mVar = u.this.new m(eVar2);
            mVar.f129116f = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmx0/d$a$b;", "state", "Loq/i0;", "<anonymous>", "(Lmx0/d$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.p<mx0.d.a.AsyncDataDownload, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129118e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f129119f;

        n(tq.e<? super n> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            mx0.d.a.AsyncDataDownload asyncDataDownload = (mx0.d.a.AsyncDataDownload) this.f129119f;
            uq.b.e();
            if (this.f129118e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            u.this.remoteLogger.F8("MainDocumentLoaderVM: new asyncDataDownload state", px.d.a.GENERAL);
            if (u.this.setupData instanceof mx0.c.C3201c) {
                DownloadTaskData downloadTaskData = asyncDataDownload.getDownloadTaskData();
                if (downloadTaskData == null) {
                    u.this.remoteLogger.F8("MainDocumentLoaderVM: missing downloadTaskData", px.d.a.ERROR);
                    u.this.d9(new mx0.a.HandleError(new mx0.b.Default(new dx.b.Generic(new NoSuchElementException("There is no matching download task")))));
                } else {
                    iy.b0 mainDocumentAuthToken = downloadTaskData.getMainDocumentAuthToken();
                    if (mainDocumentAuthToken == null) {
                        u.this.remoteLogger.F8("MainDocumentLoaderVM: missing mainDocumentAuthToken", px.d.a.ERROR);
                        u.this.d9(new mx0.a.HandleError(new mx0.b.Default(new dx.b.Generic(new NullPointerException("MainDocumentAuthToken cannot be null")))));
                    } else {
                        u.this.d9(new mx0.a.DownloadDocumentData(downloadTaskData.getTaskId(), downloadTaskData.d(), mainDocumentAuthToken));
                    }
                }
            } else {
                u.this.d9(new mx0.a.DownloadDocumentData(asyncDataDownload.getTaskId(), asyncDataDownload.e(), asyncDataDownload.getMainDocumentAuthToken()));
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(mx0.d.a.AsyncDataDownload asyncDataDownload, tq.e<? super oq.i0> eVar) {
            return ((n) v(asyncDataDownload, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            n nVar = u.this.new n(eVar);
            nVar.f129119f = obj;
            return nVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Llz3/l;", "value", "Lmx0/d$a$b;", "state", "Loq/i0;", "<anonymous>", "(Ljava/util/List;Lmx0/d$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<List<? extends WorkerInfo>, mx0.d.a.AsyncDataDownload, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f129121e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f129122f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f129123g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f129124h;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f129126a;

            static {
                int[] iArr = new int[lz3.h.values().length];
                try {
                    iArr[lz3.h.ALREADY_DOWNLOADED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f129126a = iArr;
            }
        }

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object next;
            lz3.j state;
            List<DocumentDownloadSingleStatus> listB;
            DocumentDownloadSingleStatus documentDownloadSingleStatus;
            List list = (List) this.f129123g;
            mx0.d.a.AsyncDataDownload asyncDataDownload = (mx0.d.a.AsyncDataDownload) this.f129124h;
            Object objE = uq.b.e();
            int i15 = this.f129122f;
            lz3.h status = null;
            if (i15 == 0) {
                oq.u.b(obj);
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!fr.t.c(((WorkerInfo) next).getId().toString(), asyncDataDownload.getTaskId()));
                WorkerInfo workerInfo = (WorkerInfo) next;
                if (workerInfo != null && (state = workerInfo.getState()) != null && state.e()) {
                    u.this.remoteLogger.F8("MainDocumentLoaderVM: " + asyncDataDownload.getTaskId() + " worker has finished", px.d.a.GENERAL);
                    mz3.q qVar = u.this.getDocumentDownloadStatusUseCase;
                    mz3.q.Params params = new mz3.q.Params(asyncDataDownload.getMainDocumentType());
                    this.f129123g = vq.j.a(list);
                    this.f129124h = asyncDataDownload;
                    this.f129121e = vq.j.a(workerInfo);
                    this.f129122f = 1;
                    obj = qVar.c(params, this);
                    if (obj == objE) {
                        return objE;
                    }
                }
                return oq.i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            DocumentDownloadStatus documentDownloadStatus = (DocumentDownloadStatus) obj;
            if (documentDownloadStatus != null && (listB = documentDownloadStatus.b()) != null && (documentDownloadSingleStatus = (DocumentDownloadSingleStatus) pq.v.n0(listB)) != null) {
                status = documentDownloadSingleStatus.getStatus();
            }
            u.this.remoteLogger.F8("MainDocumentLoaderVM: " + asyncDataDownload.getMainDocumentType() + " download status: " + status, px.d.a.GENERAL);
            if ((status == null ? -1 : a.f129126a[status.ordinal()]) == 1) {
                u.this.d9(mx0.a.C3198a.f128948a);
            } else {
                boolean terminated = asyncDataDownload.getTerminated();
                if (terminated) {
                    u.this.d9(new mx0.a.AfterProcessTerminated(asyncDataDownload.getTaskId()));
                } else {
                    if (terminated) {
                        throw new oq.p();
                    }
                    u.this.d9(mx0.a.e.f128952a);
                }
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(List<WorkerInfo> list, mx0.d.a.AsyncDataDownload asyncDataDownload, tq.e<? super oq.i0> eVar) {
            o oVar = u.this.new o(eVar);
            oVar.f129123g = list;
            oVar.f129124h = asyncDataDownload;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lrq0/b;", "<unused var>", "Lmx0/d$a$b;", "state", "Loq/i0;", "<anonymous>", "(Lrq0/b;Lmx0/d$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<rq0.b, mx0.d.a.AsyncDataDownload, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129127e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f129128f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            List<DocumentDownloadSingleStatus> listB;
            DocumentDownloadSingleStatus documentDownloadSingleStatus;
            mx0.d.a.AsyncDataDownload asyncDataDownload = (mx0.d.a.AsyncDataDownload) this.f129128f;
            Object objE = uq.b.e();
            int i15 = this.f129127e;
            if (i15 == 0) {
                oq.u.b(obj);
                mz3.q qVar = u.this.getDocumentDownloadStatusUseCase;
                mz3.q.Params params = new mz3.q.Params(asyncDataDownload.getMainDocumentType());
                this.f129128f = vq.j.a(asyncDataDownload);
                this.f129127e = 1;
                obj = qVar.c(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            DocumentDownloadStatus documentDownloadStatus = (DocumentDownloadStatus) obj;
            if (((documentDownloadStatus == null || (listB = documentDownloadStatus.b()) == null || (documentDownloadSingleStatus = (DocumentDownloadSingleStatus) pq.v.n0(listB)) == null) ? null : documentDownloadSingleStatus.getStatus()) == lz3.h.TAKES_TOO_LONG) {
                u.this.d9(mx0.a.m.f128968a);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(rq0.b bVar, mx0.d.a.AsyncDataDownload asyncDataDownload, tq.e<? super oq.i0> eVar) {
            p pVar = u.this.new p(eVar);
            pVar.f129128f = asyncDataDownload;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmx0/a$m;", "<unused var>", "Lk10/c0;", "Lmx0/d$a$b;", "state", "Lk10/l;", "Lmx0/d;", "<anonymous>", "(Lmx0/a$m;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<mx0.a.m, k10.c0<mx0.d.a.AsyncDataDownload>, tq.e<? super k10.l<? extends mx0.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129130e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f129131f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mx0.d.a.AsyncDataDownload O(mx0.d.a.AsyncDataDownload asyncDataDownload) {
            return mx0.d.a.AsyncDataDownload.d(asyncDataDownload, null, true, null, null, null, false, null, 125, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f129131f;
            uq.b.e();
            if (this.f129130e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            u.this.remoteLogger.F8("MainDocumentLoaderVM: document downloading takes too long...", px.d.a.GENERAL);
            return c0Var.b(new er.l() { // from class: mx0.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.q.O((d.a.AsyncDataDownload) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(mx0.a.m mVar, k10.c0<mx0.d.a.AsyncDataDownload> c0Var, tq.e<? super k10.l<? extends mx0.d>> eVar) {
            q qVar = u.this.new q(eVar);
            qVar.f129131f = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmx0/a$n;", "<unused var>", "Lmx0/d$a$b;", "Loq/i0;", "<anonymous>", "(Lmx0/a$n;Lmx0/d$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<mx0.a.n, mx0.d.a.AsyncDataDownload, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129133e;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f129133e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                mx0.a.h.e eVar = mx0.a.h.e.f128961a;
                this.f129133e = 1;
                if (uVar.F(eVar, this) == objE) {
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
        public final Object w(mx0.a.n nVar, mx0.d.a.AsyncDataDownload asyncDataDownload, tq.e<? super oq.i0> eVar) {
            return u.this.new r(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmx0/a$i;", "<unused var>", "Lk10/c0;", "Lmx0/d$a$b;", "state", "Lk10/l;", "Lmx0/d;", "<anonymous>", "(Lmx0/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<mx0.a.i, k10.c0<mx0.d.a.AsyncDataDownload>, tq.e<? super k10.l<? extends mx0.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f129135e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f129136f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f129137g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f129138h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f129139j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f129140k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f129141l;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mx0.d.a.AsyncDataDownload O(mx0.d.a.AsyncDataDownload asyncDataDownload) {
            return mx0.d.a.AsyncDataDownload.d(asyncDataDownload, null, false, null, null, null, true, null, 95, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x00e2, code lost:
        
            if (r4.c(r6, r9) == r1) goto L21;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r10) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 239
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: mx0.u.s.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(mx0.a.i iVar, k10.c0<mx0.d.a.AsyncDataDownload> c0Var, tq.e<? super k10.l<? extends mx0.d>> eVar) {
            s sVar = u.this.new s(eVar);
            sVar.f129141l = c0Var;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmx0/a$a;", "<unused var>", "Lmx0/d$a$b;", "state", "Loq/i0;", "<anonymous>", "(Lmx0/a$a;Lmx0/d$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<mx0.a.C3198a, mx0.d.a.AsyncDataDownload, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f129143e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f129144f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f129145g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f129146h;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x006f, code lost:
        
            if (r2.F(r4, r6) == r1) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f129146h
                mx0.d$a$b r0 = (mx0.d.a.AsyncDataDownload) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r6.f129145g
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L26
                if (r2 == r4) goto L22
                if (r2 != r3) goto L1a
                java.lang.Object r0 = r6.f129143e
                oq.i0 r0 = (oq.i0) r0
                oq.u.b(r7)
                goto L72
            L1a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L22:
                oq.u.b(r7)
                goto L54
            L26:
                oq.u.b(r7)
                mx0.u r7 = mx0.u.this
                px.d r7 = mx0.u.C9(r7)
                java.lang.String r2 = "MainDocumentLoaderVM: after activation process"
                px.d$a r5 = px.d.a.GENERAL
                r7.F8(r2, r5)
                mx0.u r7 = mx0.u.this
                ax0.a r7 = mx0.u.q9(r7)
                ax0.a$a r2 = new ax0.a$a
                rq0.b r5 = r0.getMainDocumentType()
                r2.<init>(r5)
                java.lang.Object r5 = vq.j.a(r0)
                r6.f129146h = r5
                r6.f129145g = r4
                java.lang.Object r7 = r7.c(r2, r6)
                if (r7 != r1) goto L54
                goto L71
            L54:
                oq.i0 r7 = oq.i0.f148189a
                mx0.u r2 = mx0.u.this
                mx0.a$h$d r4 = mx0.a.h.d.f128960a
                java.lang.Object r0 = vq.j.a(r0)
                r6.f129146h = r0
                java.lang.Object r7 = vq.j.a(r7)
                r6.f129143e = r7
                r7 = 0
                r6.f129144f = r7
                r6.f129145g = r3
                java.lang.Object r7 = r2.F(r4, r6)
                if (r7 != r1) goto L72
            L71:
                return r1
            L72:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: mx0.u.t.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(mx0.a.C3198a c3198a, mx0.d.a.AsyncDataDownload asyncDataDownload, tq.e<? super oq.i0> eVar) {
            t tVar = u.this.new t(eVar);
            tVar.f129146h = asyncDataDownload;
            return tVar.J(oq.i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: mx0.u$u, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmx0/a$b;", "<unused var>", "Lmx0/d$a$b;", "state", "Loq/i0;", "<anonymous>", "(Lmx0/a$b;Lmx0/d$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class C3206u extends vq.k implements er.q<mx0.a.AfterProcessTerminated, mx0.d.a.AsyncDataDownload, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f129148e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f129149f;

        C3206u(tq.e<? super C3206u> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            mx0.d.a.AsyncDataDownload asyncDataDownload = (mx0.d.a.AsyncDataDownload) this.f129149f;
            Object objE = uq.b.e();
            int i15 = this.f129148e;
            if (i15 == 0) {
                oq.u.b(obj);
                u.this.remoteLogger.F8("MainDocumentLoaderVM: process has finished after termination", px.d.a.GENERAL);
                u uVar = u.this;
                this.f129149f = vq.j.a(asyncDataDownload);
                this.f129148e = 1;
                if (uVar.I9(asyncDataDownload, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            u.this.d9(mx0.a.n.f128969a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(mx0.a.AfterProcessTerminated afterProcessTerminated, mx0.d.a.AsyncDataDownload asyncDataDownload, tq.e<? super oq.i0> eVar) {
            C3206u c3206u = u.this.new C3206u(eVar);
            c3206u.f129149f = asyncDataDownload;
            return c3206u.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmx0/a$f;", "action", "Lmx0/d$a$b;", "state", "Loq/i0;", "<anonymous>", "(Lmx0/a$f;Lmx0/d$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<mx0.a.DownloadDocumentData, mx0.d.a.AsyncDataDownload, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f129151e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f129152f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f129153g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f129154h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f129155j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f129156k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f129157l;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x00f2  */
        /* JADX WARN: Code duplicated, block: B:30:0x00fa  */
        /* JADX WARN: Code duplicated, block: B:37:0x0148  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            lz3.h status;
            List<DocumentDownloadSingleStatus> listB;
            DocumentDownloadSingleStatus documentDownloadSingleStatus;
            TaskIncludedDocumentData taskIncludedDocumentData;
            String mainDocumentId;
            u uVar;
            mz3.a aVar;
            mz3.a.Params params;
            u uVar2;
            mx0.a.DownloadDocumentData downloadDocumentData = (mx0.a.DownloadDocumentData) this.f129156k;
            mx0.d.a.AsyncDataDownload asyncDataDownload = (mx0.d.a.AsyncDataDownload) this.f129157l;
            Object objE = uq.b.e();
            int i15 = this.f129155j;
            if (i15 == 0) {
                oq.u.b(obj);
                u.this.remoteLogger.F8("MainDocumentLoaderVM: main document async data downloading starting task:" + downloadDocumentData.getTaskId(), px.d.a.GENERAL);
                mz3.q qVar = u.this.getDocumentDownloadStatusUseCase;
                mz3.q.Params params2 = new mz3.q.Params(asyncDataDownload.getMainDocumentType());
                this.f129156k = downloadDocumentData;
                this.f129157l = asyncDataDownload;
                this.f129155j = 1;
                obj = qVar.c(params2, this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i15 == 1) {
                oq.u.b(obj);
            } else {
                if (i15 == 2) {
                    status = (lz3.h) this.f129151e;
                    oq.u.b(obj);
                    u.this.remoteLogger.F8("MainDocumentLoaderVM: " + asyncDataDownload.getMainDocumentType() + " downloading has started in task:" + downloadDocumentData.getTaskId(), px.d.a.GENERAL);
                    if (status == lz3.h.TAKES_TOO_LONG) {
                        u.this.d9(mx0.a.m.f128968a);
                    } else {
                        taskIncludedDocumentData = asyncDataDownload.e().get(asyncDataDownload.getMainDocumentType());
                        if (taskIncludedDocumentData != null && (mainDocumentId = taskIncludedDocumentData.getMainDocumentId()) != null) {
                            uVar = u.this;
                            aVar = uVar.addSingleDocumentDownloadStatusUC;
                            params = new mz3.a.Params(new DocumentDownloadSingleStatus(asyncDataDownload.getMainDocumentType(), mainDocumentId, lz3.h.NOT_READY));
                            this.f129156k = vq.j.a(downloadDocumentData);
                            this.f129157l = asyncDataDownload;
                            this.f129151e = vq.j.a(status);
                            this.f129152f = uVar;
                            this.f129153g = vq.j.a(mainDocumentId);
                            this.f129154h = 0;
                            this.f129155j = 3;
                            if (aVar.c(params, this) != objE) {
                                uVar2 = uVar;
                            }
                            return objE;
                        }
                    }
                    return oq.i0.f148189a;
                }
                if (i15 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                uVar2 = (u) this.f129152f;
                oq.u.b(obj);
            }
            uVar2.remoteLogger.F8("MainDocumentLoaderVM: " + asyncDataDownload.getMainDocumentType() + " download status has changed into NOT_READY", px.d.a.GENERAL);
            return oq.i0.f148189a;
            DocumentDownloadStatus documentDownloadStatus = (DocumentDownloadStatus) obj;
            status = (documentDownloadStatus == null || (listB = documentDownloadStatus.b()) == null || (documentDownloadSingleStatus = (DocumentDownloadSingleStatus) pq.v.n0(listB)) == null) ? null : documentDownloadSingleStatus.getStatus();
            mz3.x xVar = u.this.startManageAsyncDownloadWorkerUseCase;
            mz3.x.Params params3 = new mz3.x.Params(downloadDocumentData.getTaskId(), lz3.d.FIRST_DOWNLOAD, downloadDocumentData.a(), downloadDocumentData.getMainDocumentAuthToken());
            this.f129156k = downloadDocumentData;
            this.f129157l = asyncDataDownload;
            this.f129151e = status;
            this.f129155j = 2;
            if (xVar.c(params3, this) != objE) {
                u.this.remoteLogger.F8("MainDocumentLoaderVM: " + asyncDataDownload.getMainDocumentType() + " downloading has started in task:" + downloadDocumentData.getTaskId(), px.d.a.GENERAL);
                if (status == lz3.h.TAKES_TOO_LONG) {
                    u.this.d9(mx0.a.m.f128968a);
                } else {
                    taskIncludedDocumentData = asyncDataDownload.e().get(asyncDataDownload.getMainDocumentType());
                    if (taskIncludedDocumentData != null) {
                        uVar = u.this;
                        aVar = uVar.addSingleDocumentDownloadStatusUC;
                        params = new mz3.a.Params(new DocumentDownloadSingleStatus(asyncDataDownload.getMainDocumentType(), mainDocumentId, lz3.h.NOT_READY));
                        this.f129156k = vq.j.a(downloadDocumentData);
                        this.f129157l = asyncDataDownload;
                        this.f129151e = vq.j.a(status);
                        this.f129152f = uVar;
                        this.f129153g = vq.j.a(mainDocumentId);
                        this.f129154h = 0;
                        this.f129155j = 3;
                        if (aVar.c(params, this) != objE) {
                            uVar2 = uVar;
                            uVar2.remoteLogger.F8("MainDocumentLoaderVM: " + asyncDataDownload.getMainDocumentType() + " download status has changed into NOT_READY", px.d.a.GENERAL);
                        }
                    }
                }
                return oq.i0.f148189a;
            }
            return objE;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(mx0.a.DownloadDocumentData downloadDocumentData, mx0.d.a.AsyncDataDownload asyncDataDownload, tq.e<? super oq.i0> eVar) {
            v vVar = u.this.new v(eVar);
            vVar.f129156k = downloadDocumentData;
            vVar.f129157l = asyncDataDownload;
            return vVar.J(oq.i0.f148189a);
        }
    }

    public u(yy.a aVar, nx0.d dVar, ib4.c cVar, dx0.d dVar2, mz3.x xVar, mz3.n nVar, mz3.q qVar, ax0.a aVar2, nx0.a aVar3, v64.l lVar, dx0.k kVar, dx0.b bVar, dx0.f fVar, mz3.s sVar, uh0.b bVar2, cx0.c cVar2, mz3.e eVar, mz3.v vVar, mz3.u uVar, mz3.a aVar4, px.d dVar3, mx0.c cVar3) {
        this.screenMapper = dVar;
        this.genericDomainErrorMapper = cVar;
        this.asyncGenerateCertActivationChallengeUC = dVar2;
        this.startManageAsyncDownloadWorkerUseCase = xVar;
        this.getAsyncDownloadWorkersMonitorUseCase = nVar;
        this.getDocumentDownloadStatusUseCase = qVar;
        this.afterUserActivationProcessUseCase = aVar2;
        this.mainDocumentLoaderDialogMapper = aVar3;
        this.deactivateAppUseCase = lVar;
        this.getMainDocumentDownloadTaskUC = kVar;
        this.asyncActivateMobileApplicationUC = bVar;
        this.asyncProcessAndSaveNewCertUC = fVar;
        this.monitorDocumentsDownloadStatusUC = sVar;
        this.asyncTerminateMainDocumentDownloadUC = bVar2;
        this.documentsContainerInteractor = cVar2;
        this.cancelAsyncDownloadUC = eVar;
        this.removeDocumentDownloadStatusUseCase = vVar;
        this.removeAsyncDownloadTaskUC = uVar;
        this.addSingleDocumentDownloadStatusUC = aVar4;
        this.remoteLogger = dVar3;
        this.setupData = cVar3;
        mx0.d.c cVar4 = mx0.d.c.f129002a;
        this.initialState = cVar4;
        this.stateMachine = aVar.a(cVar4, new er.l() { // from class: mx0.t
            @Override // er.l
            public final Object b(Object obj) {
                return u.L9(this.f129036a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), J9(cVar4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010c, code lost:
    
        if (r13.c(r2, r0) == r1) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I9(mx0.d.a.AsyncDataDownload r12, tq.e<? super oq.i0> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mx0.u.I9(mx0.d$a$b, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mx0.e.a J9(mx0.d state) {
        return this.screenMapper.b(new nx0.d.Params(state, b9(new mx0.a.ShowDialog(new nx0.a.InterfaceC3450a.Terminate(b9(mx0.a.i.f128963a)))), b9(mx0.a.c.f128950a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(final u uVar, k10.v vVar) {
        vVar.c(q0.c(mx0.d.class), new er.l() { // from class: mx0.n
            @Override // er.l
            public final Object b(Object obj) {
                return u.M9(this.f129030a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(mx0.d.c.class), new er.l() { // from class: mx0.o
            @Override // er.l
            public final Object b(Object obj) {
                return u.N9(this.f129031a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(mx0.d.a.GenerateActivationChallenge.class), new er.l() { // from class: mx0.p
            @Override // er.l
            public final Object b(Object obj) {
                return u.O9(this.f129032a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(mx0.d.a.StartCertActivation.class), new er.l() { // from class: mx0.q
            @Override // er.l
            public final Object b(Object obj) {
                return u.P9(this.f129033a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(mx0.d.a.ActivateApp.class), new er.l() { // from class: mx0.r
            @Override // er.l
            public final Object b(Object obj) {
                return u.Q9(this.f129034a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(mx0.d.a.AsyncDataDownload.class), new er.l() { // from class: mx0.s
            @Override // er.l
            public final Object b(Object obj) {
                return u.R9(this.f129035a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(u uVar, k10.z zVar) {
        c cVar = uVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(mx0.a.c.class), oVar, cVar);
        zVar.x(q0.c(mx0.a.HandleError.class), oVar, uVar.new d(null));
        zVar.v(q0.c(mx0.a.RetryActivationProcess.class), oVar, uVar.new e(null));
        zVar.x(q0.c(mx0.a.ShowDialog.class), oVar, uVar.new f(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(u uVar, k10.z zVar) {
        zVar.A(uVar.new g(zVar, null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(u uVar, k10.z zVar) {
        zVar.A(uVar.new h(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(u uVar, k10.z zVar) {
        zVar.C(uVar.new i(null));
        j jVar = uVar.new j(null);
        zVar.v(q0.c(mx0.a.k.class), k10.o.CANCEL_PREVIOUS, jVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(u uVar, k10.z zVar) {
        zVar.A(uVar.new k(null));
        l lVar = uVar.new l(null);
        zVar.x(q0.c(mx0.a.d.class), k10.o.CANCEL_PREVIOUS, lVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(u uVar, k10.z zVar) {
        zVar.C(uVar.new n(null));
        mz3.n nVar = uVar.getAsyncDownloadWorkersMonitorUseCase;
        gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
        k10.k.s(zVar, (mu.g) nVar.a(c1792a), null, uVar.new o(null), 2, null);
        k10.k.s(zVar, (mu.g) uVar.monitorDocumentsDownloadStatusUC.a(c1792a), null, uVar.new p(null), 2, null);
        q qVar = uVar.new q(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(mx0.a.m.class), oVar, qVar);
        zVar.x(q0.c(mx0.a.n.class), oVar, uVar.new r(null));
        zVar.v(q0.c(mx0.a.i.class), oVar, uVar.new s(null));
        zVar.x(q0.c(mx0.a.C3198a.class), oVar, uVar.new t(null));
        zVar.x(q0.c(mx0.a.AfterProcessTerminated.class), oVar, uVar.new C3206u(null));
        zVar.x(q0.c(mx0.a.DownloadDocumentData.class), oVar, uVar.new v(null));
        zVar.v(q0.c(mx0.a.e.class), oVar, uVar.new m(null));
        return oq.i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: H9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(mx0.a.h hVar, tq.e<? super oq.i0> eVar) {
        return super.F(hVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: K9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(mx0.c cVar) {
        super.P5(cVar);
    }

    @Override // zx.b
    public xw.b<mx0.a.h> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<mx0.d, mx0.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<mx0.e.a> getState() {
        return this.state;
    }
}
