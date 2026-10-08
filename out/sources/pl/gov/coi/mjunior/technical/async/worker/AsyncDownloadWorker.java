package pl.gov.coi.mjunior.technical.async.worker;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import cf0.AsyncDocumentToGenerate;
import cf0.AsyncErrorResponse;
import cf0.DownloadTaskData;
import er.p;
import ez.a;
import fr.t;
import iy.a0;
import iy.b0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import ju.d2;
import ju.g1;
import ju.l0;
import ju.p0;
import ju.q0;
import ju.w0;
import kf0.AsyncDocumentGenerationResult;
import kf0.DocumentToDownload;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 X2\u00020\u0001:\u0001YB_\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u001a0\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010!\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0082@¢\u0006\u0004\b!\u0010\"J\u0018\u0010$\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b$\u0010%J\u0018\u0010&\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0082@¢\u0006\u0004\b&\u0010\"J\u0018\u0010'\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0082@¢\u0006\u0004\b'\u0010\"J\u0018\u0010(\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0082@¢\u0006\u0004\b(\u0010\"J\u0019\u0010)\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b)\u0010\u001eJ\u0017\u0010*\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0002¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u001cH\u0082@¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.H\u0082@¢\u0006\u0004\b/\u0010-J\u0010\u00101\u001a\u000200H\u0096@¢\u0006\u0004\b1\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010:R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010L\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010N\u001a\u00020I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010KR\u0014\u0010R\u001a\u00020O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020T0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010V¨\u0006Z"}, d2 = {"Lpl/gov/coi/mjunior/technical/async/worker/AsyncDownloadWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Lez/b;", "dateCalculator", "Lez/a;", "currentTimeProvider", "Lmf0/a;", "downloadTaskDataRepository", "Lwy/b;", "networkSessionManager", "Lwy/a;", "masterKeyProvider", "Ljf0/a;", "documentDownloadRepository", "Llf0/a;", "documentStorageInteractor", "La80/b;", "asyncMainDocumentTaskCompletedUC", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Lez/b;Lez/a;Lmf0/a;Lwy/b;Lwy/a;Ljf0/a;Llf0/a;La80/b;)V", "Lju/p0;", "Lju/w0;", "Ldx/i;", "Ldx/b;", "Loq/i0;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Lju/p0;)Lju/w0;", "Lkf0/b;", "result", "M", "(Lkf0/b;Ltq/e;)Ljava/lang/Object;", "scope", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Lju/p0;Ltq/e;)Ljava/lang/Object;", "G", "K", "O", "N", "F", "(Lkf0/b;)V", "J", "(Ltq/e;)Ljava/lang/Object;", "Lcf0/f;", "I", "Landroidx/work/c$a;", "k", "g", "Landroid/content/Context;", "h", "Landroidx/work/WorkerParameters;", "i", "Lez/b;", "j", "Lez/a;", "Lmf0/a;", "l", "Lwy/b;", "m", "Lwy/a;", "n", "Ljf0/a;", "o", "Llf0/a;", "p", "La80/b;", "", "q", "Ljava/lang/String;", "taskId", "", "r", "Z", "retryWorker", "s", "mainDocumentDownload", "Lsu/a;", "t", "Lsu/a;", "monitorMutex", "", "Lcf0/c;", "u", "Ljava/util/Set;", "startedDocuments", "v", "a", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AsyncDownloadWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final long f158443w;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final WorkerParameters params;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final ez.b dateCalculator;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final a currentTimeProvider;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final mf0.a downloadTaskDataRepository;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final wy.b networkSessionManager;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final wy.a masterKeyProvider;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final jf0.a documentDownloadRepository;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final lf0.a documentStorageInteractor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final a80.b asyncMainDocumentTaskCompletedUC;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final String taskId;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean retryWorker;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean mainDocumentDownload;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final su.a monitorMutex;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final Set<cf0.c> startedDocuments;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f158459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f158460b;

        static {
            int[] iArr = new int[cf0.e.values().length];
            try {
                iArr[cf0.e.DOCUMENT_UPDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[cf0.e.DOCUMENT_REDOWNLOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[cf0.e.FIRST_DOWNLOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f158459a = iArr;
            int[] iArr2 = new int[cf0.c.values().length];
            try {
                iArr2[cf0.c.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[cf0.c.JUNIOR_STUDENT_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[cf0.c.FAMILY_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[cf0.c.DRIVING_LICENCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[cf0.c.UUT_CARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            f158460b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f158461d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f158462e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f158463f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f158465h;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f158463f = obj;
            this.f158465h |= PKIFailureInfo.systemUnavail;
            return AsyncDownloadWorker.this.G(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f158466d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f158467e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f158468f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f158470h;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f158468f = obj;
            this.f158470h |= PKIFailureInfo.systemUnavail;
            return AsyncDownloadWorker.this.k(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements p<p0, tq.e<? super dx.i<? extends dx.b, ? extends Object>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f158471e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f158472f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f158473g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f158474h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f158475j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ fr.p0<DownloadTaskData> f158477l;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Lkf0/a;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements p<p0, tq.e<? super dx.i<? extends dx.b, ? extends kf0.a>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f158478e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ AsyncDownloadWorker f158479f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ fr.p0<DownloadTaskData> f158480g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ w0<i0> f158481h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ w0<dx.i<dx.b, i0>> f158482j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(AsyncDownloadWorker asyncDownloadWorker, fr.p0<DownloadTaskData> p0Var, w0<i0> w0Var, w0<? extends dx.i<? extends dx.b, i0>> w0Var2, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f158479f = asyncDownloadWorker;
                this.f158480g = p0Var;
                this.f158481h = w0Var;
                this.f158482j = w0Var2;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f158478e;
                if (i15 == 0) {
                    u.b(obj);
                    jf0.a aVar = this.f158479f.documentDownloadRepository;
                    String str = this.f158479f.taskId;
                    DownloadTaskData downloadTaskData = this.f158480g.f66410a;
                    b0 mainDocumentAuthToken = (downloadTaskData == null ? null : downloadTaskData).getMainDocumentAuthToken();
                    this.f158478e = 1;
                    obj = aVar.f(str, mainDocumentAuthToken, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                d2.a.a(this.f158481h, null, 1, null);
                AsyncDownloadWorker asyncDownloadWorker = this.f158479f;
                w0<dx.i<dx.b, i0>> w0Var = this.f158482j;
                if (iVar instanceof dx.i.Right) {
                    kf0.a aVar2 = (kf0.a) ((dx.i.Right) iVar).b();
                    if (t.c(aVar2, kf0.a.C2646a.f110423a)) {
                        asyncDownloadWorker.retryWorker = true;
                        d2.a.a(w0Var, null, 1, null);
                    } else if (!t.c(aVar2, kf0.a.b.f110424a)) {
                        throw new oq.p();
                    }
                }
                w0<dx.i<dx.b, i0>> w0Var2 = this.f158482j;
                if (iVar instanceof dx.i.Left) {
                    d2.a.a(w0Var2, null, 1, null);
                }
                return iVar;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super dx.i<? extends dx.b, ? extends kf0.a>> eVar) {
                return ((a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new a(this.f158479f, this.f158480g, this.f158481h, this.f158482j, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(fr.p0<DownloadTaskData> p0Var, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f158477l = p0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            p0 p0Var = (p0) this.f158475j;
            Object objE = uq.b.e();
            int i15 = this.f158474h;
            try {
                if (i15 == 0) {
                    u.b(obj);
                    px.f.f163100a.b("Starting collecting", px.c.a(p0Var));
                    w0 w0VarN = AsyncDownloadWorker.this.N(p0Var);
                    w0 w0VarH = AsyncDownloadWorker.this.H(p0Var);
                    w0 w0VarB = ju.k.b(p0Var, null, null, new a(AsyncDownloadWorker.this, this.f158477l, w0VarN, w0VarH, null), 3, null);
                    this.f158475j = vq.j.a(p0Var);
                    this.f158471e = vq.j.a(w0VarN);
                    this.f158472f = vq.j.a(w0VarH);
                    this.f158473g = vq.j.a(w0VarB);
                    this.f158474h = 1;
                    obj = ju.f.b(new w0[]{w0VarB, w0VarH}, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                return (dx.i) v.l0((List) obj);
            } catch (CancellationException unused) {
                return new dx.i.Right(i0.f148189a);
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<? extends dx.b, ? extends Object>> eVar) {
            return ((e) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = AsyncDownloadWorker.this.new e(this.f158477l, eVar);
            eVar2.f158475j = obj;
            return eVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements p<p0, tq.e<? super dx.i<? extends dx.b, ? extends i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f158483e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f158484f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final /* synthetic */ class a extends fr.a implements p<Map<String, ? extends AsyncDocumentGenerationResult>, tq.e<? super mu.g<? extends Map<String, ? extends AsyncDocumentGenerationResult>>>, Object> {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final a f158486h = new a();

            a() {
                super(2, mu.i.class, "flowOf", "flowOf(Ljava/lang/Object;)Lkotlinx/coroutines/flow/Flow;", 5);
            }

            @Override // er.p
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object B(Map<String, AsyncDocumentGenerationResult> map, tq.e<? super mu.g<? extends Map<String, AsyncDocumentGenerationResult>>> eVar) {
                return f.O(map, eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AsyncDownloadWorker f158487a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p0 f158488b;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final /* synthetic */ class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f158489a;

                static {
                    int[] iArr = new int[AsyncDocumentGenerationResult.a.values().length];
                    try {
                        iArr[AsyncDocumentGenerationResult.a.TO_DOWNLOAD.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[AsyncDocumentGenerationResult.a.UNKNOWN.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[AsyncDocumentGenerationResult.a.CREATING_ERROR.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[AsyncDocumentGenerationResult.a.MULTI_DOCUMENT_GENERATION_FINISHED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[AsyncDocumentGenerationResult.a.ALL_DOWNLOADED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[AsyncDocumentGenerationResult.a.ALREADY_DOWNLOADED.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[AsyncDocumentGenerationResult.a.RETRY_GLOBAL_ERROR.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[AsyncDocumentGenerationResult.a.TERMINAL_GLOBAL_ERROR.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    f158489a = iArr;
                }
            }

            /* JADX INFO: renamed from: pl.gov.coi.mjunior.technical.async.worker.AsyncDownloadWorker$f$b$b, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            static final class C3929b extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                Object f158490d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                Object f158491e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f158492f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                Object f158493g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f158494h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f158495j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                int f158496k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f158497l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                int f158498m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                /* synthetic */ Object f158499n;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                final /* synthetic */ b<T> f158500p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                int f158501q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C3929b(b<? super T> bVar, tq.e<? super C3929b> eVar) {
                    super(eVar);
                    this.f158500p = bVar;
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f158499n = obj;
                    this.f158501q |= PKIFailureInfo.systemUnavail;
                    return this.f158500p.F(null, this);
                }
            }

            b(AsyncDownloadWorker asyncDownloadWorker, p0 p0Var) {
                this.f158487a = asyncDownloadWorker;
                this.f158488b = p0Var;
            }

            /* JADX WARN: Code duplicated, block: B:27:0x00ca A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:14:0x004b, B:49:0x01d8, B:25:0x00bb, B:26:0x00c7, B:27:0x00ca, B:28:0x00cf, B:29:0x00d0, B:32:0x00f9, B:34:0x010d, B:37:0x0136, B:40:0x015f, B:43:0x0188, B:46:0x01b0), top: B:58:0x0027 }] */
            /* JADX WARN: Code duplicated, block: B:29:0x00d0 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:14:0x004b, B:49:0x01d8, B:25:0x00bb, B:26:0x00c7, B:27:0x00ca, B:28:0x00cf, B:29:0x00d0, B:32:0x00f9, B:34:0x010d, B:37:0x0136, B:40:0x015f, B:43:0x0188, B:46:0x01b0), top: B:58:0x0027 }] */
            /* JADX WARN: Code duplicated, block: B:31:0x00f7  */
            /* JADX WARN: Code duplicated, block: B:32:0x00f9 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:14:0x004b, B:49:0x01d8, B:25:0x00bb, B:26:0x00c7, B:27:0x00ca, B:28:0x00cf, B:29:0x00d0, B:32:0x00f9, B:34:0x010d, B:37:0x0136, B:40:0x015f, B:43:0x0188, B:46:0x01b0), top: B:58:0x0027 }] */
            /* JADX WARN: Code duplicated, block: B:33:0x010a  */
            /* JADX WARN: Code duplicated, block: B:34:0x010d A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:14:0x004b, B:49:0x01d8, B:25:0x00bb, B:26:0x00c7, B:27:0x00ca, B:28:0x00cf, B:29:0x00d0, B:32:0x00f9, B:34:0x010d, B:37:0x0136, B:40:0x015f, B:43:0x0188, B:46:0x01b0), top: B:58:0x0027 }] */
            /* JADX WARN: Code duplicated, block: B:36:0x0134  */
            /* JADX WARN: Code duplicated, block: B:37:0x0136 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:14:0x004b, B:49:0x01d8, B:25:0x00bb, B:26:0x00c7, B:27:0x00ca, B:28:0x00cf, B:29:0x00d0, B:32:0x00f9, B:34:0x010d, B:37:0x0136, B:40:0x015f, B:43:0x0188, B:46:0x01b0), top: B:58:0x0027 }] */
            /* JADX WARN: Code duplicated, block: B:39:0x015d  */
            /* JADX WARN: Code duplicated, block: B:40:0x015f A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:14:0x004b, B:49:0x01d8, B:25:0x00bb, B:26:0x00c7, B:27:0x00ca, B:28:0x00cf, B:29:0x00d0, B:32:0x00f9, B:34:0x010d, B:37:0x0136, B:40:0x015f, B:43:0x0188, B:46:0x01b0), top: B:58:0x0027 }] */
            /* JADX WARN: Code duplicated, block: B:42:0x0186  */
            /* JADX WARN: Code duplicated, block: B:43:0x0188 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:14:0x004b, B:49:0x01d8, B:25:0x00bb, B:26:0x00c7, B:27:0x00ca, B:28:0x00cf, B:29:0x00d0, B:32:0x00f9, B:34:0x010d, B:37:0x0136, B:40:0x015f, B:43:0x0188, B:46:0x01b0), top: B:58:0x0027 }] */
            /* JADX WARN: Code duplicated, block: B:45:0x01af  */
            /* JADX WARN: Code duplicated, block: B:46:0x01b0 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:14:0x004b, B:49:0x01d8, B:25:0x00bb, B:26:0x00c7, B:27:0x00ca, B:28:0x00cf, B:29:0x00d0, B:32:0x00f9, B:34:0x010d, B:37:0x0136, B:40:0x015f, B:43:0x0188, B:46:0x01b0), top: B:58:0x0027 }] */
            /* JADX WARN: Code duplicated, block: B:48:0x01d7  */
            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x01fb, code lost:
            
                if (ju.m3.a(r2) == r3) goto L55;
             */
            /* JADX WARN: Type inference failed for: r4v0, types: [int, su.a] */
            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object F(java.util.Map<java.lang.String, kf0.AsyncDocumentGenerationResult> r17, tq.e<? super oq.i0> r18) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 556
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: pl.gov.coi.mjunior.technical.async.worker.AsyncDownloadWorker.f.b.F(java.util.Map, tq.e):java.lang.Object");
            }
        }

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object O(Map map, tq.e eVar) {
            return mu.i.K(map);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            p0 p0Var = (p0) this.f158484f;
            Object objE = uq.b.e();
            int i15 = this.f158483e;
            if (i15 == 0) {
                u.b(obj);
                mu.g gVarB = mu.m.b(mu.v.c(AsyncDownloadWorker.this.documentDownloadRepository.c(), 0, a.f158486h, 1, null), 0, null, 3, null);
                b bVar = new b(AsyncDownloadWorker.this, p0Var);
                this.f158484f = vq.j.a(p0Var);
                this.f158483e = 1;
                if (gVarB.a(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return new dx.i.Right(i0.f148189a);
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
            return ((f) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            f fVar = AsyncDownloadWorker.this.new f(eVar);
            fVar.f158484f = obj;
            return fVar;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f158502d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f158504f;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f158502d = obj;
            this.f158504f |= PKIFailureInfo.systemUnavail;
            return AsyncDownloadWorker.this.I(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class h extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f158505d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f158506e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f158507f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f158508g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f158509h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f158510j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f158511k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f158512l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f158514n;

        h(tq.e<? super h> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f158512l = obj;
            this.f158514n |= PKIFailureInfo.systemUnavail;
            return AsyncDownloadWorker.this.J(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class i extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f158515d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f158516e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f158517f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f158518g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f158519h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f158520j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f158521k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f158522l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f158523m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f158524n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f158525p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f158526q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f158528s;

        i(tq.e<? super i> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f158526q = obj;
            this.f158528s |= PKIFailureInfo.systemUnavail;
            return AsyncDownloadWorker.this.K(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class j extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f158529d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f158530e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f158531f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f158532g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f158533h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f158534j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f158535k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f158536l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f158537m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f158538n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f158540q;

        j(tq.e<? super j> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f158538n = obj;
            this.f158540q |= PKIFailureInfo.systemUnavail;
            return AsyncDownloadWorker.this.L(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class k extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f158541d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f158542e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f158543f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f158544g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f158545h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f158546j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f158548l;

        k(tq.e<? super k> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f158546j = obj;
            this.f158548l |= PKIFailureInfo.systemUnavail;
            return AsyncDownloadWorker.this.M(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f158549e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f158550f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f158551g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f158552h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f158553j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f158554k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f158555l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f158556m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f158557n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private /* synthetic */ Object f158558p;

        l(tq.e<? super l> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0091  */
        /* JADX WARN: Code duplicated, block: B:23:0x00b9  */
        /* JADX WARN: Code duplicated, block: B:35:0x0136 A[PHI: r3 r7 r8 r10
          0x0136: PHI (r3v1 cf0.f) = (r3v6 cf0.f), (r3v16 cf0.f) binds: [B:33:0x0133, B:11:0x0031] A[DONT_GENERATE, DONT_INLINE]
          0x0136: PHI (r7v1 java.lang.Object) = (r7v7 java.lang.Object), (r7v15 java.lang.Object) binds: [B:33:0x0133, B:11:0x0031] A[DONT_GENERATE, DONT_INLINE]
          0x0136: PHI (r8v1 char) = (r8v4 char), (r8v11 char) binds: [B:33:0x0133, B:11:0x0031] A[DONT_GENERATE, DONT_INLINE]
          0x0136: PHI (r10v0 char) = (r10v5 char), (r10v19 char) binds: [B:33:0x0133, B:11:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:40:0x0114 A[SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
        
            if (r3 == r2) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x0145, code lost:
        
            if (ju.m3.a(r17) == r2) goto L37;
         */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0145 -> B:38:0x0148). Please report as a decompilation issue!!! */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r18) throws java.lang.Exception {
            /*
                Method dump skipped, instruction units count: 335
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pl.gov.coi.mjunior.technical.async.worker.AsyncDownloadWorker.l.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((l) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            l lVar = AsyncDownloadWorker.this.new l(eVar);
            lVar.f158558p = obj;
            return lVar;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class m extends vq.d {
        int A;
        /* synthetic */ Object B;
        int D;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f158560d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f158561e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f158562f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f158563g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f158564h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f158565j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f158566k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f158567l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f158568m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f158569n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f158570p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        Object f158571q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f158572r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f158573s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f158574t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f158575v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f158576w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f158577x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f158578y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f158579z;

        m(tq.e<? super m> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.B = obj;
            this.D |= PKIFailureInfo.systemUnavail;
            return AsyncDownloadWorker.this.O(null, this);
        }
    }

    static {
        gu.b.Companion companion = gu.b.INSTANCE;
        f158443w = gu.d.q(10, gu.e.SECONDS);
    }

    public AsyncDownloadWorker(Context context, WorkerParameters workerParameters, ez.b bVar, a aVar, mf0.a aVar2, wy.b bVar2, wy.a aVar3, jf0.a aVar4, lf0.a aVar5, a80.b bVar3) {
        super(context, workerParameters);
        this.context = context;
        this.params = workerParameters;
        this.dateCalculator = bVar;
        this.currentTimeProvider = aVar;
        this.downloadTaskDataRepository = aVar2;
        this.networkSessionManager = bVar2;
        this.masterKeyProvider = aVar3;
        this.documentDownloadRepository = aVar4;
        this.documentStorageInteractor = aVar5;
        this.asyncMainDocumentTaskCompletedUC = bVar3;
        this.taskId = workerParameters.c().toString();
        this.monitorMutex = su.g.b(false, 1, null);
        this.startedDocuments = new LinkedHashSet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(AsyncDocumentGenerationResult result) {
        px.f fVar = px.f.f163100a;
        StringBuilder sb5 = new StringBuilder();
        sb5.append("LOGGER_TAG ");
        sb5.append(this.currentTimeProvider.i());
        sb5.append(" | taskId: ");
        sb5.append(this.taskId);
        sb5.append(", status:");
        sb5.append(result.getStatus());
        sb5.append(", type:");
        DocumentToDownload documentToDownload = result.getDocumentToDownload();
        sb5.append(documentToDownload != null ? documentToDownload.getDocumentType() : null);
        sb5.append(", subtyp:");
        DocumentToDownload documentToDownload2 = result.getDocumentToDownload();
        sb5.append(documentToDownload2 != null ? documentToDownload2.getSubtype() : null);
        sb5.append(", iid:");
        DocumentToDownload documentToDownload3 = result.getDocumentToDownload();
        sb5.append(documentToDownload3 != null ? documentToDownload3.getDocumentId() : null);
        sb5.append(", traceId:");
        AsyncErrorResponse downloadingErrorMessage = result.getDownloadingErrorMessage();
        sb5.append(downloadingErrorMessage != null ? downloadingErrorMessage.getTraceId() : null);
        sb5.append('\n');
        fVar.b(sb5.toString(), px.c.a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        if (O(r9, r0) == r1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(kf0.AsyncDocumentGenerationResult r9, tq.e<? super oq.i0> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof pl.gov.coi.mjunior.technical.async.worker.AsyncDownloadWorker.c
            if (r0 == 0) goto L13
            r0 = r10
            pl.gov.coi.mjunior.technical.async.worker.AsyncDownloadWorker$c r0 = (pl.gov.coi.mjunior.technical.async.worker.AsyncDownloadWorker.c) r0
            int r1 = r0.f158465h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f158465h = r1
            goto L18
        L13:
            pl.gov.coi.mjunior.technical.async.worker.AsyncDownloadWorker$c r0 = new pl.gov.coi.mjunior.technical.async.worker.AsyncDownloadWorker$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f158463f
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f158465h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4d
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r9 = r0.f158462e
            kf0.e r9 = (kf0.DocumentToDownload) r9
            java.lang.Object r9 = r0.f158461d
            kf0.b r9 = (kf0.AsyncDocumentGenerationResult) r9
            oq.u.b(r10)
            goto Lad
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            java.lang.Object r9 = r0.f158462e
            kf0.e r9 = (kf0.DocumentToDownload) r9
            java.lang.Object r2 = r0.f158461d
            kf0.b r2 = (kf0.AsyncDocumentGenerationResult) r2
            oq.u.b(r10)
            r7 = r10
            r10 = r9
            r9 = r2
            r2 = r7
            goto L70
        L4d:
            oq.u.b(r10)
            kf0.e r10 = r9.getDocumentToDownload()
            if (r10 != 0) goto L59
            oq.i0 r9 = oq.i0.f148189a
            return r9
        L59:
            lf0.a r2 = r8.documentStorageInteractor
            java.lang.String r5 = r10.getDocumentId()
            r0.f158461d = r9
            java.lang.Object r6 = vq.j.a(r10)
            r0.f158462e = r6
            r0.f158465h = r4
            java.lang.Object r2 = r2.f(r5, r0)
            if (r2 != r1) goto L70
            goto Lac
        L70:
            dx.i r2 = (dx.i) r2
            boolean r5 = r2 instanceof dx.i.Left
            if (r5 == 0) goto L84
            dx.i$b r2 = (dx.i.Left) r2
            java.lang.Object r2 = r2.b()
            dx.b r2 = (dx.b) r2
            r2 = 0
            java.lang.Boolean r2 = vq.b.a(r2)
            goto L8e
        L84:
            boolean r5 = r2 instanceof dx.i.Right
            if (r5 == 0) goto Lb9
            dx.i$c r2 = (dx.i.Right) r2
            java.lang.Object r2 = r2.b()
        L8e:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == r4) goto Lb6
            if (r2 != 0) goto Lb0
            java.lang.Object r2 = vq.j.a(r9)
            r0.f158461d = r2
            java.lang.Object r10 = vq.j.a(r10)
            r0.f158462e = r10
            r0.f158465h = r3
            java.lang.Object r9 = r8.O(r9, r0)
            if (r9 != r1) goto Lad
        Lac:
            return r1
        Lad:
            oq.i0 r9 = oq.i0.f148189a
            return r9
        Lb0:
            oq.p r9 = new oq.p
            r9.<init>()
            throw r9
        Lb6:
            oq.i0 r9 = oq.i0.f148189a
            return r9
        Lb9:
            oq.p r9 = new oq.p
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.gov.coi.mjunior.technical.async.worker.AsyncDownloadWorker.G(kf0.b, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final w0<dx.i<dx.b, i0>> H(p0 p0Var) {
        return ju.k.b(p0Var, g1.b(), null, new f(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object I(tq.e<? super DownloadTaskData> eVar) throws Exception {
        g gVar;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f158504f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f158504f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object objE = gVar.f158502d;
        Object objE2 = uq.b.e();
        int i16 = gVar.f158504f;
        if (i16 == 0) {
            u.b(objE);
            mf0.a aVar = this.downloadTaskDataRepository;
            String str = this.taskId;
            gVar.f158504f = 1;
            objE = aVar.e(str, gVar);
            if (objE == objE2) {
                return objE2;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objE);
        }
        dx.i iVar = (dx.i) objE;
        if (iVar instanceof dx.i.Left) {
            throw new Exception("DownloadTaskData not found.");
        }
        if (iVar instanceof dx.i.Right) {
            return ((dx.i.Right) iVar).b();
        }
        throw new oq.p();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x009b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0102  */
    /* JADX WARN: Code duplicated, block: B:33:0x0132  */
    /* JADX WARN: Code duplicated, block: B:38:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:? A[LOOP:0: B:22:0x0095->B:40:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0132 -> B:34:0x0133). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object J(tq.e<? super oq.i0> r17) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.gov.coi.mjunior.technical.async.worker.AsyncDownloadWorker.J(tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:57:0x0140 A[Catch: Exception -> 0x0066, c -> 0x0069, CancellationException -> 0x006c, TRY_LEAVE, TryCatch #5 {Exception -> 0x0066, blocks: (B:17:0x0061, B:55:0x013a, B:57:0x0140, B:69:0x019b, B:71:0x01a1, B:74:0x01b1), top: B:97:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ec  */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x023f, code lost:
    
        if (r2.m(r8, r4, r9, r0) == r1) goto L89;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:57:0x0140, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:87:0x01ec, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [mf0.a] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [cf0.c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K(kf0.AsyncDocumentGenerationResult r14, tq.e<? super oq.i0> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.gov.coi.mjunior.technical.async.worker.AsyncDownloadWorker.K(kf0.b, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:100:0x030c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0145  */
    /* JADX WARN: Code duplicated, block: B:33:0x0150  */
    /* JADX WARN: Code duplicated, block: B:35:0x016e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0193  */
    /* JADX WARN: Code duplicated, block: B:41:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:42:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:44:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:47:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:50:0x01e7 A[PHI: r1 r4 r8 r9 r10 r11
      0x01e7: PHI (r1v26 java.lang.Object) = (r1v21 java.lang.Object), (r1v1 java.lang.Object) binds: [B:48:0x01e3, B:19:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x01e7: PHI (r4v10 int) = (r4v8 int), (r4v11 int) binds: [B:48:0x01e3, B:19:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x01e7: PHI (r8v13 java.util.Map$Entry) = (r8v9 java.util.Map$Entry), (r8v17 java.util.Map$Entry) binds: [B:48:0x01e3, B:19:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x01e7: PHI (r9v13 cf0.f) = (r9v10 cf0.f), (r9v16 cf0.f) binds: [B:48:0x01e3, B:19:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x01e7: PHI (r10v10 ju.p0) = (r10v7 ju.p0), (r10v13 ju.p0) binds: [B:48:0x01e3, B:19:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x01e7: PHI (r11v9 ju.p0) = (r11v6 ju.p0), (r11v12 ju.p0) binds: [B:48:0x01e3, B:19:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:55:0x022d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0269  */
    /* JADX WARN: Code duplicated, block: B:61:0x0270  */
    /* JADX WARN: Code duplicated, block: B:64:0x0276  */
    /* JADX WARN: Code duplicated, block: B:67:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:68:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:69:0x02af  */
    /* JADX WARN: Code duplicated, block: B:71:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:73:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:76:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:78:0x02d9 A[PHI: r1 r4 r8 r9
      0x02d9: PHI (r1v40 cf0.f) = (r1v9 cf0.f), (r1v33 cf0.f), (r1v49 cf0.f) binds: [B:34:0x016c, B:70:0x02b1, B:77:0x02d8] A[DONT_GENERATE, DONT_INLINE]
      0x02d9: PHI (r4v20 int) = (r4v6 int), (r4v15 int), (r4v21 int) binds: [B:34:0x016c, B:70:0x02b1, B:77:0x02d8] A[DONT_GENERATE, DONT_INLINE]
      0x02d9: PHI (r8v29 ju.p0) = (r8v5 ju.p0), (r8v21 ju.p0), (r8v30 ju.p0) binds: [B:34:0x016c, B:70:0x02b1, B:77:0x02d8] A[DONT_GENERATE, DONT_INLINE]
      0x02d9: PHI (r9v27 ju.p0) = (r9v6 ju.p0), (r9v20 ju.p0), (r9v28 ju.p0) binds: [B:34:0x016c, B:70:0x02b1, B:77:0x02d8] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:84:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:86:0x0304  */
    /* JADX WARN: Code duplicated, block: B:91:0x0332  */
    /* JADX WARN: Code duplicated, block: B:96:0x0372  */
    /* JADX WARN: Code duplicated, block: B:99:0x0341 A[SYNTHETIC] */
    public final Object L(p0 p0Var, tq.e<? super i0> eVar) throws Exception {
        j jVar;
        p0 p0Var2;
        p0 p0Var3;
        int i15;
        Object objI;
        p0 p0Var4;
        DownloadTaskData downloadTaskData;
        jf0.a aVar;
        String taskId;
        DownloadTaskData downloadTaskData2;
        Map.Entry entry;
        Object objF;
        DownloadTaskData downloadTaskData3;
        p0 p0Var5;
        p0 p0Var6;
        Map.Entry entry2;
        dx.i iVar;
        Object objB;
        dx.i iVar2;
        Map.Entry entry3;
        dx.b bVar;
        mf0.a aVar2;
        String taskId2;
        cf0.c documentType;
        cf0.a aVar3;
        int i16;
        p0 p0Var7;
        p0 p0Var8;
        DownloadTaskData downloadTaskData4;
        Map.Entry entry4;
        dx.i iVar3;
        int i17;
        lf0.a aVar4;
        String documentId;
        p0 p0Var9;
        lf0.a aVar5;
        Map<cf0.c, AsyncDocumentToGenerate> mapB;
        mf0.a aVar6;
        String str;
        p0 p0Var10;
        Iterator<Map.Entry<cf0.c, AsyncDocumentToGenerate>> it;
        AsyncDocumentToGenerate value;
        mf0.a aVar7;
        String str2;
        if (eVar instanceof j) {
            jVar = (j) eVar;
            int i18 = jVar.f158540q;
            if ((i18 & PKIFailureInfo.systemUnavail) != 0) {
                jVar.f158540q = i18 - PKIFailureInfo.systemUnavail;
            } else {
                jVar = new j(eVar);
            }
        } else {
            jVar = new j(eVar);
        }
        Object objC = jVar.f158538n;
        Object objE = uq.b.e();
        switch (jVar.f158540q) {
            case 0:
                u.b(objC);
                px.f.f163100a.b("Starting onAllDownloaded method...", px.c.a(p0Var));
                jVar.f158529d = vq.j.a(p0Var);
                p0Var2 = p0Var;
                jVar.f158530e = p0Var2;
                jVar.f158535k = 0;
                jVar.f158540q = 1;
                if (J(jVar) != objE) {
                    p0Var3 = p0Var2;
                    i15 = 0;
                    jVar.f158529d = vq.j.a(p0Var2);
                    jVar.f158530e = p0Var3;
                    jVar.f158535k = i15;
                    jVar.f158540q = 2;
                    objI = I(jVar);
                    if (objI != objE) {
                        p0Var4 = p0Var2;
                        objC = objI;
                        downloadTaskData = (DownloadTaskData) objC;
                        if (this.mainDocumentDownload) {
                            entry = (Map.Entry) v.k0(downloadTaskData.b().entrySet());
                            if (((AsyncDocumentToGenerate) entry.getValue()).getStatus() == cf0.a.ALREADY_DOWNLOADED) {
                                lf0.a aVar8 = this.documentStorageInteractor;
                                String documentId2 = ((AsyncDocumentToGenerate) entry.getValue()).getDocumentId();
                                jVar.f158529d = vq.j.a(p0Var4);
                                jVar.f158530e = p0Var3;
                                jVar.f158531f = downloadTaskData;
                                jVar.f158532g = entry;
                                jVar.f158535k = i15;
                                jVar.f158540q = 3;
                                objF = aVar8.f(documentId2, jVar);
                                if (objF != objE) {
                                    p0 p0Var11 = p0Var4;
                                    downloadTaskData3 = downloadTaskData;
                                    objC = objF;
                                    p0Var5 = p0Var11;
                                    p0Var6 = p0Var3;
                                    entry2 = entry;
                                    iVar = (dx.i) objC;
                                    if (iVar instanceof dx.i.Left) {
                                        objB = vq.b.a(false);
                                    } else {
                                        if (iVar instanceof dx.i.Right) {
                                            throw new oq.p();
                                        }
                                        objB = ((dx.i.Right) iVar).b();
                                    }
                                    if (((Boolean) objB).booleanValue()) {
                                        a80.b bVar2 = this.asyncMainDocumentTaskCompletedUC;
                                        a80.b.Params params = new a80.b.Params(downloadTaskData3.getMainDocumentAuthToken());
                                        jVar.f158529d = vq.j.a(p0Var5);
                                        jVar.f158530e = p0Var6;
                                        jVar.f158531f = downloadTaskData3;
                                        jVar.f158532g = entry2;
                                        jVar.f158535k = i15;
                                        jVar.f158540q = 4;
                                        objC = bVar2.c(params, jVar);
                                        if (objC != objE) {
                                            iVar2 = (dx.i) objC;
                                            if (iVar2 instanceof dx.i.Left) {
                                                bVar = (dx.b) ((dx.i.Left) iVar2).b();
                                                aVar2 = this.downloadTaskDataRepository;
                                                taskId2 = downloadTaskData3.getTaskId();
                                                documentType = ((AsyncDocumentToGenerate) entry2.getValue()).getDocumentType();
                                                aVar3 = cf0.a.CREATING_ERROR;
                                                jVar.f158529d = vq.j.a(p0Var5);
                                                jVar.f158530e = p0Var6;
                                                jVar.f158531f = downloadTaskData3;
                                                jVar.f158532g = entry2;
                                                jVar.f158533h = iVar2;
                                                jVar.f158534j = vq.j.a(bVar);
                                                jVar.f158535k = i15;
                                                jVar.f158536l = 0;
                                                jVar.f158537m = 0;
                                                jVar.f158540q = 5;
                                                if (aVar2.m(taskId2, documentType, aVar3, jVar) != objE) {
                                                    i16 = 0;
                                                    p0Var7 = p0Var5;
                                                    p0Var8 = p0Var6;
                                                    downloadTaskData4 = downloadTaskData3;
                                                    entry4 = entry2;
                                                    iVar3 = iVar2;
                                                    i17 = 0;
                                                    aVar4 = this.documentStorageInteractor;
                                                    documentId = ((AsyncDocumentToGenerate) entry4.getValue()).getDocumentId();
                                                    jVar.f158529d = vq.j.a(p0Var7);
                                                    jVar.f158530e = p0Var8;
                                                    jVar.f158531f = downloadTaskData4;
                                                    jVar.f158532g = vq.j.a(entry4);
                                                    jVar.f158533h = iVar3;
                                                    jVar.f158534j = vq.j.a(bVar);
                                                    jVar.f158535k = i15;
                                                    jVar.f158536l = i16;
                                                    jVar.f158537m = i17;
                                                    jVar.f158540q = 6;
                                                    if (aVar4.b(documentId, jVar) != objE) {
                                                        p0Var9 = p0Var7;
                                                        iVar2 = iVar3;
                                                        entry3 = entry4;
                                                        downloadTaskData3 = downloadTaskData4;
                                                        p0Var3 = p0Var8;
                                                        p0Var5 = p0Var9;
                                                        if (iVar2 instanceof dx.i.Right) {
                                                            i0 i0Var = (i0) ((dx.i.Right) iVar2).b();
                                                            aVar5 = this.documentStorageInteractor;
                                                            jVar.f158529d = vq.j.a(p0Var5);
                                                            jVar.f158530e = p0Var3;
                                                            jVar.f158531f = downloadTaskData3;
                                                            jVar.f158532g = vq.j.a(entry3);
                                                            jVar.f158533h = iVar2;
                                                            jVar.f158534j = vq.j.a(i0Var);
                                                            jVar.f158535k = i15;
                                                            jVar.f158536l = 0;
                                                            jVar.f158537m = 0;
                                                            jVar.f158540q = 7;
                                                            if (aVar5.h(jVar) != objE) {
                                                                downloadTaskData2 = downloadTaskData3;
                                                                p0Var4 = p0Var5;
                                                                downloadTaskData = downloadTaskData2;
                                                                mapB = downloadTaskData.b();
                                                                if (!mapB.isEmpty()) {
                                                                    it = mapB.entrySet().iterator();
                                                                    while (true) {
                                                                        if (it.hasNext()) {
                                                                            value = it.next().getValue();
                                                                            if (value.getAsyncErrorResponse() == null || value.getStatus() == cf0.a.CREATING_ERROR) {
                                                                                aVar7 = this.downloadTaskDataRepository;
                                                                                str2 = this.taskId;
                                                                                jVar.f158529d = vq.j.a(p0Var4);
                                                                                jVar.f158530e = p0Var3;
                                                                                jVar.f158531f = vq.j.a(downloadTaskData);
                                                                                jVar.f158532g = null;
                                                                                jVar.f158533h = null;
                                                                                jVar.f158534j = null;
                                                                                jVar.f158535k = i15;
                                                                                jVar.f158540q = 9;
                                                                                if (aVar7.l(str2, jVar) != objE) {
                                                                                    p0Var10 = p0Var3;
                                                                                    px.f.f163100a.b("Marking task as completed (errors were present)", px.c.a(p0Var10));
                                                                                    i0 i0Var2 = i0.f148189a;
                                                                                    this.documentDownloadRepository.a(this.taskId);
                                                                                    q0.d(p0Var10, null, 1, null);
                                                                                    return i0.f148189a;
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                px.f.f163100a.b("Marking task as completed", px.c.a(p0Var3));
                                                                aVar6 = this.downloadTaskDataRepository;
                                                                str = this.taskId;
                                                                jVar.f158529d = vq.j.a(p0Var4);
                                                                jVar.f158530e = p0Var3;
                                                                jVar.f158531f = vq.j.a(downloadTaskData);
                                                                jVar.f158532g = null;
                                                                jVar.f158533h = null;
                                                                jVar.f158534j = null;
                                                                jVar.f158535k = i15;
                                                                jVar.f158540q = 10;
                                                                if (aVar6.l(str, jVar) != objE) {
                                                                    p0Var10 = p0Var3;
                                                                    this.documentDownloadRepository.a(this.taskId);
                                                                    q0.d(p0Var10, null, 1, null);
                                                                    return i0.f148189a;
                                                                }
                                                            }
                                                        } else {
                                                            downloadTaskData = downloadTaskData3;
                                                            p0Var4 = p0Var5;
                                                            mapB = downloadTaskData.b();
                                                            if (!mapB.isEmpty()) {
                                                                it = mapB.entrySet().iterator();
                                                                while (true) {
                                                                    if (it.hasNext()) {
                                                                        value = it.next().getValue();
                                                                        if (value.getAsyncErrorResponse() == null) {
                                                                        }
                                                                        aVar7 = this.downloadTaskDataRepository;
                                                                        str2 = this.taskId;
                                                                        jVar.f158529d = vq.j.a(p0Var4);
                                                                        jVar.f158530e = p0Var3;
                                                                        jVar.f158531f = vq.j.a(downloadTaskData);
                                                                        jVar.f158532g = null;
                                                                        jVar.f158533h = null;
                                                                        jVar.f158534j = null;
                                                                        jVar.f158535k = i15;
                                                                        jVar.f158540q = 9;
                                                                        if (aVar7.l(str2, jVar) != objE) {
                                                                            p0Var10 = p0Var3;
                                                                            px.f.f163100a.b("Marking task as completed (errors were present)", px.c.a(p0Var10));
                                                                            i0 i0Var3 = i0.f148189a;
                                                                            this.documentDownloadRepository.a(this.taskId);
                                                                            q0.d(p0Var10, null, 1, null);
                                                                            return i0.f148189a;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            px.f.f163100a.b("Marking task as completed", px.c.a(p0Var3));
                                                            aVar6 = this.downloadTaskDataRepository;
                                                            str = this.taskId;
                                                            jVar.f158529d = vq.j.a(p0Var4);
                                                            jVar.f158530e = p0Var3;
                                                            jVar.f158531f = vq.j.a(downloadTaskData);
                                                            jVar.f158532g = null;
                                                            jVar.f158533h = null;
                                                            jVar.f158534j = null;
                                                            jVar.f158535k = i15;
                                                            jVar.f158540q = 10;
                                                            if (aVar6.l(str, jVar) != objE) {
                                                                p0Var10 = p0Var3;
                                                                this.documentDownloadRepository.a(this.taskId);
                                                                q0.d(p0Var10, null, 1, null);
                                                                return i0.f148189a;
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                entry3 = entry2;
                                                p0Var3 = p0Var6;
                                                if (iVar2 instanceof dx.i.Right) {
                                                    i0 i0Var4 = (i0) ((dx.i.Right) iVar2).b();
                                                    aVar5 = this.documentStorageInteractor;
                                                    jVar.f158529d = vq.j.a(p0Var5);
                                                    jVar.f158530e = p0Var3;
                                                    jVar.f158531f = downloadTaskData3;
                                                    jVar.f158532g = vq.j.a(entry3);
                                                    jVar.f158533h = iVar2;
                                                    jVar.f158534j = vq.j.a(i0Var4);
                                                    jVar.f158535k = i15;
                                                    jVar.f158536l = 0;
                                                    jVar.f158537m = 0;
                                                    jVar.f158540q = 7;
                                                    if (aVar5.h(jVar) != objE) {
                                                        downloadTaskData2 = downloadTaskData3;
                                                        p0Var4 = p0Var5;
                                                        downloadTaskData = downloadTaskData2;
                                                        mapB = downloadTaskData.b();
                                                        if (!mapB.isEmpty()) {
                                                            it = mapB.entrySet().iterator();
                                                            while (true) {
                                                                if (it.hasNext()) {
                                                                    value = it.next().getValue();
                                                                    if (value.getAsyncErrorResponse() == null) {
                                                                    }
                                                                    aVar7 = this.downloadTaskDataRepository;
                                                                    str2 = this.taskId;
                                                                    jVar.f158529d = vq.j.a(p0Var4);
                                                                    jVar.f158530e = p0Var3;
                                                                    jVar.f158531f = vq.j.a(downloadTaskData);
                                                                    jVar.f158532g = null;
                                                                    jVar.f158533h = null;
                                                                    jVar.f158534j = null;
                                                                    jVar.f158535k = i15;
                                                                    jVar.f158540q = 9;
                                                                    if (aVar7.l(str2, jVar) != objE) {
                                                                        p0Var10 = p0Var3;
                                                                        px.f.f163100a.b("Marking task as completed (errors were present)", px.c.a(p0Var10));
                                                                        i0 i0Var5 = i0.f148189a;
                                                                        this.documentDownloadRepository.a(this.taskId);
                                                                        q0.d(p0Var10, null, 1, null);
                                                                        return i0.f148189a;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        px.f.f163100a.b("Marking task as completed", px.c.a(p0Var3));
                                                        aVar6 = this.downloadTaskDataRepository;
                                                        str = this.taskId;
                                                        jVar.f158529d = vq.j.a(p0Var4);
                                                        jVar.f158530e = p0Var3;
                                                        jVar.f158531f = vq.j.a(downloadTaskData);
                                                        jVar.f158532g = null;
                                                        jVar.f158533h = null;
                                                        jVar.f158534j = null;
                                                        jVar.f158535k = i15;
                                                        jVar.f158540q = 10;
                                                        if (aVar6.l(str, jVar) != objE) {
                                                            p0Var10 = p0Var3;
                                                            this.documentDownloadRepository.a(this.taskId);
                                                            q0.d(p0Var10, null, 1, null);
                                                            return i0.f148189a;
                                                        }
                                                    }
                                                } else {
                                                    downloadTaskData = downloadTaskData3;
                                                    p0Var4 = p0Var5;
                                                    mapB = downloadTaskData.b();
                                                    if (!mapB.isEmpty()) {
                                                        it = mapB.entrySet().iterator();
                                                        while (true) {
                                                            if (it.hasNext()) {
                                                                value = it.next().getValue();
                                                                if (value.getAsyncErrorResponse() == null) {
                                                                }
                                                                aVar7 = this.downloadTaskDataRepository;
                                                                str2 = this.taskId;
                                                                jVar.f158529d = vq.j.a(p0Var4);
                                                                jVar.f158530e = p0Var3;
                                                                jVar.f158531f = vq.j.a(downloadTaskData);
                                                                jVar.f158532g = null;
                                                                jVar.f158533h = null;
                                                                jVar.f158534j = null;
                                                                jVar.f158535k = i15;
                                                                jVar.f158540q = 9;
                                                                if (aVar7.l(str2, jVar) != objE) {
                                                                    p0Var10 = p0Var3;
                                                                    px.f.f163100a.b("Marking task as completed (errors were present)", px.c.a(p0Var10));
                                                                    i0 i0Var6 = i0.f148189a;
                                                                    this.documentDownloadRepository.a(this.taskId);
                                                                    q0.d(p0Var10, null, 1, null);
                                                                    return i0.f148189a;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    px.f.f163100a.b("Marking task as completed", px.c.a(p0Var3));
                                                    aVar6 = this.downloadTaskDataRepository;
                                                    str = this.taskId;
                                                    jVar.f158529d = vq.j.a(p0Var4);
                                                    jVar.f158530e = p0Var3;
                                                    jVar.f158531f = vq.j.a(downloadTaskData);
                                                    jVar.f158532g = null;
                                                    jVar.f158533h = null;
                                                    jVar.f158534j = null;
                                                    jVar.f158535k = i15;
                                                    jVar.f158540q = 10;
                                                    if (aVar6.l(str, jVar) != objE) {
                                                        p0Var10 = p0Var3;
                                                        this.documentDownloadRepository.a(this.taskId);
                                                        q0.d(p0Var10, null, 1, null);
                                                        return i0.f148189a;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        downloadTaskData = downloadTaskData3;
                                        p0Var3 = p0Var6;
                                        p0Var4 = p0Var5;
                                        mapB = downloadTaskData.b();
                                        if (!mapB.isEmpty()) {
                                            it = mapB.entrySet().iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    value = it.next().getValue();
                                                    if (value.getAsyncErrorResponse() == null) {
                                                    }
                                                    aVar7 = this.downloadTaskDataRepository;
                                                    str2 = this.taskId;
                                                    jVar.f158529d = vq.j.a(p0Var4);
                                                    jVar.f158530e = p0Var3;
                                                    jVar.f158531f = vq.j.a(downloadTaskData);
                                                    jVar.f158532g = null;
                                                    jVar.f158533h = null;
                                                    jVar.f158534j = null;
                                                    jVar.f158535k = i15;
                                                    jVar.f158540q = 9;
                                                    if (aVar7.l(str2, jVar) != objE) {
                                                        p0Var10 = p0Var3;
                                                        px.f.f163100a.b("Marking task as completed (errors were present)", px.c.a(p0Var10));
                                                        i0 i0Var7 = i0.f148189a;
                                                        this.documentDownloadRepository.a(this.taskId);
                                                        q0.d(p0Var10, null, 1, null);
                                                        return i0.f148189a;
                                                    }
                                                }
                                            }
                                        }
                                        px.f.f163100a.b("Marking task as completed", px.c.a(p0Var3));
                                        aVar6 = this.downloadTaskDataRepository;
                                        str = this.taskId;
                                        jVar.f158529d = vq.j.a(p0Var4);
                                        jVar.f158530e = p0Var3;
                                        jVar.f158531f = vq.j.a(downloadTaskData);
                                        jVar.f158532g = null;
                                        jVar.f158533h = null;
                                        jVar.f158534j = null;
                                        jVar.f158535k = i15;
                                        jVar.f158540q = 10;
                                        if (aVar6.l(str, jVar) != objE) {
                                            p0Var10 = p0Var3;
                                            this.documentDownloadRepository.a(this.taskId);
                                            q0.d(p0Var10, null, 1, null);
                                            return i0.f148189a;
                                        }
                                    }
                                }
                            } else {
                                mapB = downloadTaskData.b();
                                if (!mapB.isEmpty()) {
                                    it = mapB.entrySet().iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            value = it.next().getValue();
                                            if (value.getAsyncErrorResponse() == null) {
                                            }
                                            aVar7 = this.downloadTaskDataRepository;
                                            str2 = this.taskId;
                                            jVar.f158529d = vq.j.a(p0Var4);
                                            jVar.f158530e = p0Var3;
                                            jVar.f158531f = vq.j.a(downloadTaskData);
                                            jVar.f158532g = null;
                                            jVar.f158533h = null;
                                            jVar.f158534j = null;
                                            jVar.f158535k = i15;
                                            jVar.f158540q = 9;
                                            if (aVar7.l(str2, jVar) != objE) {
                                                p0Var10 = p0Var3;
                                                px.f.f163100a.b("Marking task as completed (errors were present)", px.c.a(p0Var10));
                                                i0 i0Var8 = i0.f148189a;
                                                this.documentDownloadRepository.a(this.taskId);
                                                q0.d(p0Var10, null, 1, null);
                                                return i0.f148189a;
                                            }
                                        }
                                    }
                                }
                                px.f.f163100a.b("Marking task as completed", px.c.a(p0Var3));
                                aVar6 = this.downloadTaskDataRepository;
                                str = this.taskId;
                                jVar.f158529d = vq.j.a(p0Var4);
                                jVar.f158530e = p0Var3;
                                jVar.f158531f = vq.j.a(downloadTaskData);
                                jVar.f158532g = null;
                                jVar.f158533h = null;
                                jVar.f158534j = null;
                                jVar.f158535k = i15;
                                jVar.f158540q = 10;
                                if (aVar6.l(str, jVar) != objE) {
                                    p0Var10 = p0Var3;
                                    this.documentDownloadRepository.a(this.taskId);
                                    q0.d(p0Var10, null, 1, null);
                                    return i0.f148189a;
                                }
                            }
                        } else {
                            aVar = this.documentDownloadRepository;
                            taskId = downloadTaskData.getTaskId();
                            jVar.f158529d = vq.j.a(p0Var4);
                            jVar.f158530e = p0Var3;
                            jVar.f158531f = downloadTaskData;
                            jVar.f158535k = i15;
                            jVar.f158540q = 8;
                            if (aVar.d(taskId, jVar) != objE) {
                                downloadTaskData2 = downloadTaskData;
                                downloadTaskData = downloadTaskData2;
                                mapB = downloadTaskData.b();
                                if (!mapB.isEmpty()) {
                                    it = mapB.entrySet().iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            value = it.next().getValue();
                                            if (value.getAsyncErrorResponse() == null) {
                                            }
                                            aVar7 = this.downloadTaskDataRepository;
                                            str2 = this.taskId;
                                            jVar.f158529d = vq.j.a(p0Var4);
                                            jVar.f158530e = p0Var3;
                                            jVar.f158531f = vq.j.a(downloadTaskData);
                                            jVar.f158532g = null;
                                            jVar.f158533h = null;
                                            jVar.f158534j = null;
                                            jVar.f158535k = i15;
                                            jVar.f158540q = 9;
                                            if (aVar7.l(str2, jVar) != objE) {
                                                p0Var10 = p0Var3;
                                                px.f.f163100a.b("Marking task as completed (errors were present)", px.c.a(p0Var10));
                                                i0 i0Var9 = i0.f148189a;
                                                this.documentDownloadRepository.a(this.taskId);
                                                q0.d(p0Var10, null, 1, null);
                                                return i0.f148189a;
                                            }
                                        }
                                    }
                                }
                                px.f.f163100a.b("Marking task as completed", px.c.a(p0Var3));
                                aVar6 = this.downloadTaskDataRepository;
                                str = this.taskId;
                                jVar.f158529d = vq.j.a(p0Var4);
                                jVar.f158530e = p0Var3;
                                jVar.f158531f = vq.j.a(downloadTaskData);
                                jVar.f158532g = null;
                                jVar.f158533h = null;
                                jVar.f158534j = null;
                                jVar.f158535k = i15;
                                jVar.f158540q = 10;
                                if (aVar6.l(str, jVar) != objE) {
                                    p0Var10 = p0Var3;
                                    this.documentDownloadRepository.a(this.taskId);
                                    q0.d(p0Var10, null, 1, null);
                                    return i0.f148189a;
                                }
                            }
                        }
                    }
                }
                return objE;
            case 1:
                i15 = jVar.f158535k;
                p0Var3 = (p0) jVar.f158530e;
                p0 p0Var12 = (p0) jVar.f158529d;
                u.b(objC);
                p0Var2 = p0Var12;
                jVar.f158529d = vq.j.a(p0Var2);
                jVar.f158530e = p0Var3;
                jVar.f158535k = i15;
                jVar.f158540q = 2;
                objI = I(jVar);
                if (objI != objE) {
                    p0Var4 = p0Var2;
                    objC = objI;
                    downloadTaskData = (DownloadTaskData) objC;
                    if (this.mainDocumentDownload) {
                        entry = (Map.Entry) v.k0(downloadTaskData.b().entrySet());
                        if (((AsyncDocumentToGenerate) entry.getValue()).getStatus() == cf0.a.ALREADY_DOWNLOADED) {
                            lf0.a aVar9 = this.documentStorageInteractor;
                            String documentId3 = ((AsyncDocumentToGenerate) entry.getValue()).getDocumentId();
                            jVar.f158529d = vq.j.a(p0Var4);
                            jVar.f158530e = p0Var3;
                            jVar.f158531f = downloadTaskData;
                            jVar.f158532g = entry;
                            jVar.f158535k = i15;
                            jVar.f158540q = 3;
                            objF = aVar9.f(documentId3, jVar);
                            if (objF != objE) {
                                p0 p0Var13 = p0Var4;
                                downloadTaskData3 = downloadTaskData;
                                objC = objF;
                                p0Var5 = p0Var13;
                                p0Var6 = p0Var3;
                                entry2 = entry;
                                iVar = (dx.i) objC;
                                if (iVar instanceof dx.i.Left) {
                                    objB = vq.b.a(false);
                                } else {
                                    if (iVar instanceof dx.i.Right) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVar).b();
                                }
                                if (((Boolean) objB).booleanValue()) {
                                    a80.b bVar3 = this.asyncMainDocumentTaskCompletedUC;
                                    a80.b.Params params2 = new a80.b.Params(downloadTaskData3.getMainDocumentAuthToken());
                                    jVar.f158529d = vq.j.a(p0Var5);
                                    jVar.f158530e = p0Var6;
                                    jVar.f158531f = downloadTaskData3;
                                    jVar.f158532g = entry2;
                                    jVar.f158535k = i15;
                                    jVar.f158540q = 4;
                                    objC = bVar3.c(params2, jVar);
                                    if (objC != objE) {
                                        iVar2 = (dx.i) objC;
                                        if (iVar2 instanceof dx.i.Left) {
                                            bVar = (dx.b) ((dx.i.Left) iVar2).b();
                                            aVar2 = this.downloadTaskDataRepository;
                                            taskId2 = downloadTaskData3.getTaskId();
                                            documentType = ((AsyncDocumentToGenerate) entry2.getValue()).getDocumentType();
                                            aVar3 = cf0.a.CREATING_ERROR;
                                            jVar.f158529d = vq.j.a(p0Var5);
                                            jVar.f158530e = p0Var6;
                                            jVar.f158531f = downloadTaskData3;
                                            jVar.f158532g = entry2;
                                            jVar.f158533h = iVar2;
                                            jVar.f158534j = vq.j.a(bVar);
                                            jVar.f158535k = i15;
                                            jVar.f158536l = 0;
                                            jVar.f158537m = 0;
                                            jVar.f158540q = 5;
                                            if (aVar2.m(taskId2, documentType, aVar3, jVar) != objE) {
                                                i16 = 0;
                                                p0Var7 = p0Var5;
                                                p0Var8 = p0Var6;
                                                downloadTaskData4 = downloadTaskData3;
                                                entry4 = entry2;
                                                iVar3 = iVar2;
                                                i17 = 0;
                                                aVar4 = this.documentStorageInteractor;
                                                documentId = ((AsyncDocumentToGenerate) entry4.getValue()).getDocumentId();
                                                jVar.f158529d = vq.j.a(p0Var7);
                                                jVar.f158530e = p0Var8;
                                                jVar.f158531f = downloadTaskData4;
                                                jVar.f158532g = vq.j.a(entry4);
                                                jVar.f158533h = iVar3;
                                                jVar.f158534j = vq.j.a(bVar);
                                                jVar.f158535k = i15;
                                                jVar.f158536l = i16;
                                                jVar.f158537m = i17;
                                                jVar.f158540q = 6;
                                                if (aVar4.b(documentId, jVar) != objE) {
                                                    p0Var9 = p0Var7;
                                                    iVar2 = iVar3;
                                                    entry3 = entry4;
                                                    downloadTaskData3 = downloadTaskData4;
                                                    p0Var3 = p0Var8;
                                                    p0Var5 = p0Var9;
                                                    if (iVar2 instanceof dx.i.Right) {
                                                        i0 i0Var10 = (i0) ((dx.i.Right) iVar2).b();
                                                        aVar5 = this.documentStorageInteractor;
                                                        jVar.f158529d = vq.j.a(p0Var5);
                                                        jVar.f158530e = p0Var3;
                                                        jVar.f158531f = downloadTaskData3;
                                                        jVar.f158532g = vq.j.a(entry3);
                                                        jVar.f158533h = iVar2;
                                                        jVar.f158534j = vq.j.a(i0Var10);
                                                        jVar.f158535k = i15;
                                                        jVar.f158536l = 0;
                                                        jVar.f158537m = 0;
                                                        jVar.f158540q = 7;
                                                        if (aVar5.h(jVar) != objE) {
                                                            downloadTaskData2 = downloadTaskData3;
                                                            p0Var4 = p0Var5;
                                                            downloadTaskData = downloadTaskData2;
                                                            mapB = downloadTaskData.b();
                                                            if (!mapB.isEmpty()) {
                                                                it = mapB.entrySet().iterator();
                                                                while (true) {
                                                                    if (it.hasNext()) {
                                                                        value = it.next().getValue();
                                                                        if (value.getAsyncErrorResponse() == null) {
                                                                        }
                                                                        aVar7 = this.downloadTaskDataRepository;
                                                                        str2 = this.taskId;
                                                                        jVar.f158529d = vq.j.a(p0Var4);
                                                                        jVar.f158530e = p0Var3;
                                                                        jVar.f158531f = vq.j.a(downloadTaskData);
                                                                        jVar.f158532g = null;
                                                                        jVar.f158533h = null;
                                                                        jVar.f158534j = null;
                                                                        jVar.f158535k = i15;
                                                                        jVar.f158540q = 9;
                                                                        if (aVar7.l(str2, jVar) != objE) {
                                                                            p0Var10 = p0Var3;
                                                                            px.f.f163100a.b("Marking task as completed (errors were present)", px.c.a(p0Var10));
                                                                            i0 i0Var11 = i0.f148189a;
                                                                            this.documentDownloadRepository.a(this.taskId);
                                                                            q0.d(p0Var10, null, 1, null);
                                                                            return i0.f148189a;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            px.f.f163100a.b("Marking task as completed", px.c.a(p0Var3));
                                                            aVar6 = this.downloadTaskDataRepository;
                                                            str = this.taskId;
                                                            jVar.f158529d = vq.j.a(p0Var4);
                                                            jVar.f158530e = p0Var3;
                                                            jVar.f158531f = vq.j.a(downloadTaskData);
                                                            jVar.f158532g = null;
                                                            jVar.f158533h = null;
                                                            jVar.f158534j = null;
                                                            jVar.f158535k = i15;
                                                            jVar.f158540q = 10;
                                                            if (aVar6.l(str, jVar) != objE) {
                                                                p0Var10 = p0Var3;
                                                                this.documentDownloadRepository.a(this.taskId);
                                                                q0.d(p0Var10, null, 1, null);
                                                                return i0.f148189a;
                                                            }
                                                        }
                                                    } else {
                                                        downloadTaskData = downloadTaskData3;
                                                        p0Var4 = p0Var5;
                                                        mapB = downloadTaskData.b();
                                                        if (!mapB.isEmpty()) {
                                                            it = mapB.entrySet().iterator();
                                                            while (true) {
                                                                if (it.hasNext()) {
                                                                    value = it.next().getValue();
                                                                    if (value.getAsyncErrorResponse() == null) {
                                                                    }
                                                                    aVar7 = this.downloadTaskDataRepository;
                                                                    str2 = this.taskId;
                                                                    jVar.f158529d = vq.j.a(p0Var4);
                                                                    jVar.f158530e = p0Var3;
                                                                    jVar.f158531f = vq.j.a(downloadTaskData);
                                                                    jVar.f158532g = null;
                                                                    jVar.f158533h = null;
                                                                    jVar.f158534j = null;
                                                                    jVar.f158535k = i15;
                                                                    jVar.f158540q = 9;
                                                                    if (aVar7.l(str2, jVar) != objE) {
                                                                        p0Var10 = p0Var3;
                                                                        px.f.f163100a.b("Marking task as completed (errors were present)", px.c.a(p0Var10));
                                                                        i0 i0Var12 = i0.f148189a;
                                                                        this.documentDownloadRepository.a(this.taskId);
                                                                        q0.d(p0Var10, null, 1, null);
                                                                        return i0.f148189a;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        px.f.f163100a.b("Marking task as completed", px.c.a(p0Var3));
                                                        aVar6 = this.downloadTaskDataRepository;
                                                        str = this.taskId;
                                                        jVar.f158529d = vq.j.a(p0Var4);
                                                        jVar.f158530e = p0Var3;
                                                        jVar.f158531f = vq.j.a(downloadTaskData);
                                                        jVar.f158532g = null;
                                                        jVar.f158533h = null;
                                                        jVar.f158534j = null;
                                                        jVar.f158535k = i15;
                                                        jVar.f158540q = 10;
                                                        if (aVar6.l(str, jVar) != objE) {
                                                            p0Var10 = p0Var3;
                                                            this.documentDownloadRepository.a(this.taskId);
                                                            q0.d(p0Var10, null, 1, null);
                                                            return i0.f148189a;
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            entry3 = entry2;
                                            p0Var3 = p0Var6;
                                            if (iVar2 instanceof dx.i.Right) {
                                                i0 i0Var13 = (i0) ((dx.i.Right) iVar2).b();
                                                aVar5 = this.documentStorageInteractor;
                                                jVar.f158529d = vq.j.a(p0Var5);
                                                jVar.f158530e = p0Var3;
                                                jVar.f158531f = downloadTaskData3;
                                                jVar.f158532g = vq.j.a(entry3);
                                                jVar.f158533h = iVar2;
                                                jVar.f158534j = vq.j.a(i0Var13);
                                                jVar.f158535k = i15;
                                                jVar.f158536l = 0;
                                                jVar.f158537m = 0;
                                                jVar.f158540q = 7;
                                                if (aVar5.h(jVar) != objE) {
                                                    downloadTaskData2 = downloadTaskData3;
                                                    p0Var4 = p0Var5;
                                                    downloadTaskData = downloadTaskData2;
                                                    mapB = downloadTaskData.b();
                                                    if (!mapB.isEmpty()) {
                                                        it = mapB.entrySet().iterator();
                                                        while (true) {
                                                            if (it.hasNext()) {
                                                                value = it.next().getValue();
                                                                if (value.getAsyncErrorResponse() == null) {
                                                                }
                                                                aVar7 = this.downloadTaskDataRepository;
                                                                str2 = this.taskId;
                                                                jVar.f158529d = vq.j.a(p0Var4);
                                                                jVar.f158530e = p0Var3;
                                                                jVar.f158531f = vq.j.a(downloadTaskData);
                                                                jVar.f158532g = null;
                                                                jVar.f158533h = null;
                                                                jVar.f158534j = null;
                                                                jVar.f158535k = i15;
                                                                jVar.f158540q = 9;
                                                                if (aVar7.l(str2, jVar) != objE) {
                                                                    p0Var10 = p0Var3;
                                                                    px.f.f163100a.b("Marking task as completed (errors were present)", px.c.a(p0Var10));
                                                                    i0 i0Var14 = i0.f148189a;
                                                                    this.documentDownloadRepository.a(this.taskId);
                                                                    q0.d(p0Var10, null, 1, null);
                                                                    return i0.f148189a;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    px.f.f163100a.b("Marking task as completed", px.c.a(p0Var3));
                                                    aVar6 = this.downloadTaskDataRepository;
                                                    str = this.taskId;
                                                    jVar.f158529d = vq.j.a(p0Var4);
                                                    jVar.f158530e = p0Var3;
                                                    jVar.f158531f = vq.j.a(downloadTaskData);
                                                    jVar.f158532g = null;
                                                    jVar.f158533h = null;
                                                    jVar.f158534j = null;
                                                    jVar.f158535k = i15;
                                                    jVar.f158540q = 10;
                                                    if (aVar6.l(str, jVar) != objE) {
                                                        p0Var10 = p0Var3;
                                                        this.documentDownloadRepository.a(this.taskId);
                                                        q0.d(p0Var10, null, 1, null);
                                                        return i0.f148189a;
                                                    }
                                                }
                                            } else {
                                                downloadTaskData = downloadTaskData3;
                                                p0Var4 = p0Var5;
                                                mapB = downloadTaskData.b();
                                                if (!mapB.isEmpty()) {
                                                    it = mapB.entrySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            value = it.next().getValue();
                                                            if (value.getAsyncErrorResponse() == null) {
                                                            }
                                                            aVar7 = this.downloadTaskDataRepository;
                                                            str2 = this.taskId;
                                                            jVar.f158529d = vq.j.a(p0Var4);
                                                            jVar.f158530e = p0Var3;
                                                            jVar.f158531f = vq.j.a(downloadTaskData);
                                                            jVar.f158532g = null;
                                                            jVar.f158533h = null;
                                                            jVar.f158534j = null;
                                                            jVar.f158535k = i15;
                                                            jVar.f158540q = 9;
                                                            if (aVar7.l(str2, jVar) != objE) {
                                                                p0Var10 = p0Var3;
                                                                px.f.f163100a.b("Marking task as completed (errors were present)", px.c.a(p0Var10));
                                                                i0 i0Var15 = i0.f148189a;
                                                                this.documentDownloadRepository.a(this.taskId);
                                                                q0.d(p0Var10, null, 1, null);
                                                                return i0.f148189a;
                                                            }
                                                        }
                                                    }
                                                }
                                                px.f.f163100a.b("Marking task as completed", px.c.a(p0Var3));
                                                aVar6 = this.downloadTaskDataRepository;
                                                str = this.taskId;
                                                jVar.f158529d = vq.j.a(p0Var4);
                                                jVar.f158530e = p0Var3;
                                                jVar.f158531f = vq.j.a(downloadTaskData);
                                                jVar.f158532g = null;
                                                jVar.f158533h = null;
                                                jVar.f158534j = null;
                                                jVar.f158535k = i15;
                                                jVar.f158540q = 10;
                                                if (aVar6.l(str, jVar) != objE) {
                                                    p0Var10 = p0Var3;
                                                    this.documentDownloadRepository.a(this.taskId);
                                                    q0.d(p0Var10, null, 1, null);
                                                    return i0.f148189a;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    downloadTaskData = downloadTaskData3;
                                    p0Var3 = p0Var6;
                                    p0Var4 = p0Var5;
                                    mapB = downloadTaskData.b();
                                    if (!mapB.isEmpty()) {
                                        it = mapB.entrySet().iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                value = it.next().getValue();
                                                if (value.getAsyncErrorResponse() == null) {
                                                }
                                                aVar7 = this.downloadTaskDataRepository;
                                                str2 = this.taskId;
                                                jVar.f158529d = vq.j.a(p0Var4);
                                                jVar.f158530e = p0Var3;
                                                jVar.f158531f = vq.j.a(downloadTaskData);
                                                jVar.f158532g = null;
                                                jVar.f158533h = null;
                                                jVar.f158534j = null;
                                                jVar.f158535k = i15;
                                                jVar.f158540q = 9;
                                                if (aVar7.l(str2, jVar) != objE) {
                                                    p0Var10 = p0Var3;
                                                    px.f.f163100a.b("Marking task as completed (errors were present)", px.c.a(p0Var10));
                                                    i0 i0Var16 = i0.f148189a;
                                                    this.documentDownloadRepository.a(this.taskId);
                                                    q0.d(p0Var10, null, 1, null);
                                                    return i0.f148189a;
                                                }
                                            }
                                        }
                                    }
                                    px.f.f163100a.b("Marking task as completed", px.c.a(p0Var3));
                                    aVar6 = this.downloadTaskDataRepository;
                                    str = this.taskId;
                                    jVar.f158529d = vq.j.a(p0Var4);
                                    jVar.f158530e = p0Var3;
                                    jVar.f158531f = vq.j.a(downloadTaskData);
                                    jVar.f158532g = null;
                                    jVar.f158533h = null;
                                    jVar.f158534j = null;
                                    jVar.f158535k = i15;
                                    jVar.f158540q = 10;
                                    if (aVar6.l(str, jVar) != objE) {
                                        p0Var10 = p0Var3;
                                        this.documentDownloadRepository.a(this.taskId);
                                        q0.d(p0Var10, null, 1, null);
                                        return i0.f148189a;
                                    }
                                }
                            }
                        } else {
                            mapB = downloadTaskData.b();
                            if (!mapB.isEmpty()) {
                                it = mapB.entrySet().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        value = it.next().getValue();
                                        if (value.getAsyncErrorResponse() == null) {
                                        }
                                        aVar7 = this.downloadTaskDataRepository;
                                        str2 = this.taskId;
                                        jVar.f158529d = vq.j.a(p0Var4);
                                        jVar.f158530e = p0Var3;
                                        jVar.f158531f = vq.j.a(downloadTaskData);
                                        jVar.f158532g = null;
                                        jVar.f158533h = null;
                                        jVar.f158534j = null;
                                        jVar.f158535k = i15;
                                        jVar.f158540q = 9;
                                        if (aVar7.l(str2, jVar) != objE) {
                                            p0Var10 = p0Var3;
                                            px.f.f163100a.b("Marking task as completed (errors were present)", px.c.a(p0Var10));
                                            i0 i0Var17 = i0.f148189a;
                                            this.documentDownloadRepository.a(this.taskId);
                                            q0.d(p0Var10, null, 1, null);
                                            return i0.f148189a;
                                        }
                                    }
                                }
                            }
                            px.f.f163100a.b("Marking task as completed", px.c.a(p0Var3));
                            aVar6 = this.downloadTaskDataRepository;
                            str = this.taskId;
                            jVar.f158529d = vq.j.a(p0Var4);
                            jVar.f158530e = p0Var3;
                            jVar.f158531f = vq.j.a(downloadTaskData);
                            jVar.f158532g = null;
                            jVar.f158533h = null;
                            jVar.f158534j = null;
                            jVar.f158535k = i15;
                            jVar.f158540q = 10;
                            if (aVar6.l(str, jVar) != objE) {
                                p0Var10 = p0Var3;
                                this.documentDownloadRepository.a(this.taskId);
                                q0.d(p0Var10, null, 1, null);
                                return i0.f148189a;
                            }
                        }
                    } else {
                        aVar = this.documentDownloadRepository;
                        taskId = downloadTaskData.getTaskId();
                        jVar.f158529d = vq.j.a(p0Var4);
                        jVar.f158530e = p0Var3;
                        jVar.f158531f = downloadTaskData;
                        jVar.f158535k = i15;
                        jVar.f158540q = 8;
                        if (aVar.d(taskId, jVar) != objE) {
                            downloadTaskData2 = downloadTaskData;
                            downloadTaskData = downloadTaskData2;
                            mapB = downloadTaskData.b();
                            if (!mapB.isEmpty()) {
                                it = mapB.entrySet().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        value = it.next().getValue();
                                        if (value.getAsyncErrorResponse() == null) {
                                        }
                                        aVar7 = this.downloadTaskDataRepository;
                                        str2 = this.taskId;
                                        jVar.f158529d = vq.j.a(p0Var4);
                                        jVar.f158530e = p0Var3;
                                        jVar.f158531f = vq.j.a(downloadTaskData);
                                        jVar.f158532g = null;
                                        jVar.f158533h = null;
                                        jVar.f158534j = null;
                                        jVar.f158535k = i15;
                                        jVar.f158540q = 9;
                                        if (aVar7.l(str2, jVar) != objE) {
                                            p0Var10 = p0Var3;
                                            px.f.f163100a.b("Marking task as completed (errors were present)", px.c.a(p0Var10));
                                            i0 i0Var18 = i0.f148189a;
                                            this.documentDownloadRepository.a(this.taskId);
                                            q0.d(p0Var10, null, 1, null);
                                            return i0.f148189a;
                                        }
                                    }
                                }
                            }
                            px.f.f163100a.b("Marking task as completed", px.c.a(p0Var3));
                            aVar6 = this.downloadTaskDataRepository;
                            str = this.taskId;
                            jVar.f158529d = vq.j.a(p0Var4);
                            jVar.f158530e = p0Var3;
                            jVar.f158531f = vq.j.a(downloadTaskData);
                            jVar.f158532g = null;
                            jVar.f158533h = null;
                            jVar.f158534j = null;
                            jVar.f158535k = i15;
                            jVar.f158540q = 10;
                            if (aVar6.l(str, jVar) != objE) {
                                p0Var10 = p0Var3;
                                this.documentDownloadRepository.a(this.taskId);
                                q0.d(p0Var10, null, 1, null);
                                return i0.f148189a;
                            }
                        }
                    }
                }
                return objE;
            case 2:
                i15 = jVar.f158535k;
                p0Var3 = (p0) jVar.f158530e;
                p0Var4 = (p0) jVar.f158529d;
                u.b(objC);
                downloadTaskData = (DownloadTaskData) objC;
                if (this.mainDocumentDownload) {
                    entry = (Map.Entry) v.k0(downloadTaskData.b().entrySet());
                    if (((AsyncDocumentToGenerate) entry.getValue()).getStatus() == cf0.a.ALREADY_DOWNLOADED) {
                        lf0.a aVar10 = this.documentStorageInteractor;
                        String documentId4 = ((AsyncDocumentToGenerate) entry.getValue()).getDocumentId();
                        jVar.f158529d = vq.j.a(p0Var4);
                        jVar.f158530e = p0Var3;
                        jVar.f158531f = downloadTaskData;
                        jVar.f158532g = entry;
                        jVar.f158535k = i15;
                        jVar.f158540q = 3;
                        objF = aVar10.f(documentId4, jVar);
                        if (objF != objE) {
                            p0 p0Var14 = p0Var4;
                            downloadTaskData3 = downloadTaskData;
                            objC = objF;
                            p0Var5 = p0Var14;
                            p0Var6 = p0Var3;
                            entry2 = entry;
                            iVar = (dx.i) objC;
                            if (iVar instanceof dx.i.Left) {
                                objB = vq.b.a(false);
                            } else {
                                if (iVar instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVar).b();
                            }
                            if (((Boolean) objB).booleanValue()) {
                                a80.b bVar4 = this.asyncMainDocumentTaskCompletedUC;
                                a80.b.Params params3 = new a80.b.Params(downloadTaskData3.getMainDocumentAuthToken());
                                jVar.f158529d = vq.j.a(p0Var5);
                                jVar.f158530e = p0Var6;
                                jVar.f158531f = downloadTaskData3;
                                jVar.f158532g = entry2;
                                jVar.f158535k = i15;
                                jVar.f158540q = 4;
                                objC = bVar4.c(params3, jVar);
                                if (objC != objE) {
                                    iVar2 = (dx.i) objC;
                                    if (iVar2 instanceof dx.i.Left) {
                                        bVar = (dx.b) ((dx.i.Left) iVar2).b();
                                        aVar2 = this.downloadTaskDataRepository;
                                        taskId2 = downloadTaskData3.getTaskId();
                                        documentType = ((AsyncDocumentToGenerate) entry2.getValue()).getDocumentType();
                                        aVar3 = cf0.a.CREATING_ERROR;
                                        jVar.f158529d = vq.j.a(p0Var5);
                                        jVar.f158530e = p0Var6;
                                        jVar.f158531f = downloadTaskData3;
                                        jVar.f158532g = entry2;
                                        jVar.f158533h = iVar2;
                                        jVar.f158534j = vq.j.a(bVar);
                                        jVar.f158535k = i15;
                                        jVar.f158536l = 0;
                                        jVar.f158537m = 0;
                                        jVar.f158540q = 5;
                                        if (aVar2.m(taskId2, documentType, aVar3, jVar) != objE) {
                                            i16 = 0;
                                            p0Var7 = p0Var5;
                                            p0Var8 = p0Var6;
                                            downloadTaskData4 = downloadTaskData3;
                                            entry4 = entry2;
                                            iVar3 = iVar2;
                                            i17 = 0;
                                            aVar4 = this.documentStorageInteractor;
                                            documentId = ((AsyncDocumentToGenerate) entry4.getValue()).getDocumentId();
                                            jVar.f158529d = vq.j.a(p0Var7);
                                            jVar.f158530e = p0Var8;
                                            jVar.f158531f = downloadTaskData4;
                                            jVar.f158532g = vq.j.a(entry4);
                                            jVar.f158533h = iVar3;
                                            jVar.f158534j = vq.j.a(bVar);
                                            jVar.f158535k = i15;
                                            jVar.f158536l = i16;
                                            jVar.f158537m = i17;
                                            jVar.f158540q = 6;
                                            if (aVar4.b(documentId, jVar) != objE) {
                                                p0Var9 = p0Var7;
                                                iVar2 = iVar3;
                                                entry3 = entry4;
                                                downloadTaskData3 = downloadTaskData4;
                                                p0Var3 = p0Var8;
                                                p0Var5 = p0Var9;
                                                if (iVar2 instanceof dx.i.Right) {
                                                    i0 i0Var19 = (i0) ((dx.i.Right) iVar2).b();
                                                    aVar5 = this.documentStorageInteractor;
                                                    jVar.f158529d = vq.j.a(p0Var5);
                                                    jVar.f158530e = p0Var3;
                                                    jVar.f158531f = downloadTaskData3;
                                                    jVar.f158532g = vq.j.a(entry3);
                                                    jVar.f158533h = iVar2;
                                                    jVar.f158534j = vq.j.a(i0Var19);
                                                    jVar.f158535k = i15;
                                                    jVar.f158536l = 0;
                                                    jVar.f158537m = 0;
                                                    jVar.f158540q = 7;
                                                    if (aVar5.h(jVar) != objE) {
                                                        downloadTaskData2 = downloadTaskData3;
                                                        p0Var4 = p0Var5;
                                                        downloadTaskData = downloadTaskData2;
                                                        mapB = downloadTaskData.b();
                                                        if (!mapB.isEmpty()) {
                                                            it = mapB.entrySet().iterator();
                                                            while (true) {
                                                                if (it.hasNext()) {
                                                                    value = it.next().getValue();
                                                                    if (value.getAsyncErrorResponse() == null) {
                                                                    }
                                                                    aVar7 = this.downloadTaskDataRepository;
                                                                    str2 = this.taskId;
                                                                    jVar.f158529d = vq.j.a(p0Var4);
                                                                    jVar.f158530e = p0Var3;
                                                                    jVar.f158531f = vq.j.a(downloadTaskData);
                                                                    jVar.f158532g = null;
                                                                    jVar.f158533h = null;
                                                                    jVar.f158534j = null;
                                                                    jVar.f158535k = i15;
                                                                    jVar.f158540q = 9;
                                                                    if (aVar7.l(str2, jVar) != objE) {
                                                                        p0Var10 = p0Var3;
                                                                        px.f.f163100a.b("Marking task as completed (errors were present)", px.c.a(p0Var10));
                                                                        i0 i0Var110 = i0.f148189a;
                                                                        this.documentDownloadRepository.a(this.taskId);
                                                                        q0.d(p0Var10, null, 1, null);
                                                                        return i0.f148189a;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        px.f.f163100a.b("Marking task as completed", px.c.a(p0Var3));
                                                        aVar6 = this.downloadTaskDataRepository;
                                                        str = this.taskId;
                                                        jVar.f158529d = vq.j.a(p0Var4);
                                                        jVar.f158530e = p0Var3;
                                                        jVar.f158531f = vq.j.a(downloadTaskData);
                                                        jVar.f158532g = null;
                                                        jVar.f158533h = null;
                                                        jVar.f158534j = null;
                                                        jVar.f158535k = i15;
                                                        jVar.f158540q = 10;
                                                        if (aVar6.l(str, jVar) != objE) {
                                                            p0Var10 = p0Var3;
                                                            this.documentDownloadRepository.a(this.taskId);
                                                            q0.d(p0Var10, null, 1, null);
                                                            return i0.f148189a;
                                                        }
                                                    }
                                                } else {
                                                    downloadTaskData = downloadTaskData3;
                                                    p0Var4 = p0Var5;
                                                    mapB = downloadTaskData.b();
                                                    if (!mapB.isEmpty()) {
                                                        it = mapB.entrySet().iterator();
                                                        while (true) {
                                                            if (it.hasNext()) {
                                                                value = it.next().getValue();
                                                                if (value.getAsyncErrorResponse() == null) {
                                                                }
                                                                aVar7 = this.downloadTaskDataRepository;
                                                                str2 = this.taskId;
                                                                jVar.f158529d = vq.j.a(p0Var4);
                                                                jVar.f158530e = p0Var3;
                                                                jVar.f158531f = vq.j.a(downloadTaskData);
                                                                jVar.f158532g = null;
                                                                jVar.f158533h = null;
                                                                jVar.f158534j = null;
                                                                jVar.f158535k = i15;
                                                                jVar.f158540q = 9;
                                                                if (aVar7.l(str2, jVar) != objE) {
                                                                    p0Var10 = p0Var3;
                                                                    px.f.f163100a.b("Marking task as completed (errors were present)", px.c.a(p0Var10));
                                                                    i0 i0Var111 = i0.f148189a;
                                                                    this.documentDownloadRepository.a(this.taskId);
                                                                    q0.d(p0Var10, null, 1, null);
                                                                    return i0.f148189a;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    px.f.f163100a.b("Marking task as completed", px.c.a(p0Var3));
                                                    aVar6 = this.downloadTaskDataRepository;
                                                    str = this.taskId;
                                                    jVar.f158529d = vq.j.a(p0Var4);
                                                    jVar.f158530e = p0Var3;
                                                    jVar.f158531f = vq.j.a(downloadTaskData);
                                                    jVar.f158532g = null;
                                                    jVar.f158533h = null;
                                                    jVar.f158534j = null;
                                                    jVar.f158535k = i15;
                                                    jVar.f158540q = 10;
                                                    if (aVar6.l(str, jVar) != objE) {
                                                        p0Var10 = p0Var3;
                                                        this.documentDownloadRepository.a(this.taskId);
                                                        q0.d(p0Var10, null, 1, null);
                                                        return i0.f148189a;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        entry3 = entry2;
                                        p0Var3 = p0Var6;
                                        if (iVar2 instanceof dx.i.Right) {
                                            i0 i0Var112 = (i0) ((dx.i.Right) iVar2).b();
                                            aVar5 = this.documentStorageInteractor;
                                            jVar.f158529d = vq.j.a(p0Var5);
                                            jVar.f158530e = p0Var3;
                                            jVar.f158531f = downloadTaskData3;
                                            jVar.f158532g = vq.j.a(entry3);
                                            jVar.f158533h = iVar2;
                                            jVar.f158534j = vq.j.a(i0Var112);
                                            jVar.f158535k = i15;
                                            jVar.f158536l = 0;
                                            jVar.f158537m = 0;
                                            jVar.f158540q = 7;
                                            if (aVar5.h(jVar) != objE) {
                                                downloadTaskData2 = downloadTaskData3;
                                                p0Var4 = p0Var5;
                                                downloadTaskData = downloadTaskData2;
                                                mapB = downloadTaskData.b();
                                                if (!mapB.isEmpty()) {
                                                    it = mapB.entrySet().iterator();
                                                    while (true) {
                                                        if (it.hasNext()) {
                                                            value = it.next().getValue();
                                                            if (value.getAsyncErrorResponse() == null) {
                                                            }
                                                            aVar7 = this.downloadTaskDataRepository;
                                                            str2 = this.taskId;
                                                            jVar.f158529d = vq.j.a(p0Var4);
                                                            jVar.f158530e = p0Var3;
                                                            jVar.f158531f = vq.j.a(downloadTaskData);
                                                            jVar.f158532g = null;
                                                            jVar.f158533h = null;
                                                            jVar.f158534j = null;
                                                            jVar.f158535k = i15;
                                                            jVar.f158540q = 9;
                                                            if (aVar7.l(str2, jVar) != objE) {
                                                                p0Var10 = p0Var3;
                                                                px.f.f163100a.b("Marking task as completed (errors were present)", px.c.a(p0Var10));
                                                                i0 i0Var113 = i0.f148189a;
                                                                this.documentDownloadRepository.a(this.taskId);
                                                                q0.d(p0Var10, null, 1, null);
                                                                return i0.f148189a;
                                                            }
                                                        }
                                                    }
                                                }
                                                px.f.f163100a.b("Marking task as completed", px.c.a(p0Var3));
                                                aVar6 = this.downloadTaskDataRepository;
                                                str = this.taskId;
                                                jVar.f158529d = vq.j.a(p0Var4);
                                                jVar.f158530e = p0Var3;
                                                jVar.f158531f = vq.j.a(downloadTaskData);
                                                jVar.f158532g = null;
                                                jVar.f158533h = null;
                                                jVar.f158534j = null;
                                                jVar.f158535k = i15;
                                                jVar.f158540q = 10;
                                                if (aVar6.l(str, jVar) != objE) {
                                                    p0Var10 = p0Var3;
                                                    this.documentDownloadRepository.a(this.taskId);
                                                    q0.d(p0Var10, null, 1, null);
                                                    return i0.f148189a;
                                                }
                                            }
                                        } else {
                                            downloadTaskData = downloadTaskData3;
                                            p0Var4 = p0Var5;
                                            mapB = downloadTaskData.b();
                                            if (!mapB.isEmpty()) {
                                                it = mapB.entrySet().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        value = it.next().getValue();
                                                        if (value.getAsyncErrorResponse() == null) {
                                                        }
                                                        aVar7 = this.downloadTaskDataRepository;
                                                        str2 = this.taskId;
                                                        jVar.f158529d = vq.j.a(p0Var4);
                                                        jVar.f158530e = p0Var3;
                                                        jVar.f158531f = vq.j.a(downloadTaskData);
                                                        jVar.f158532g = null;
                                                        jVar.f158533h = null;
                                                        jVar.f158534j = null;
                                                        jVar.f158535k = i15;
                                                        jVar.f158540q = 9;
                                                        if (aVar7.l(str2, jVar) != objE) {
                                                            p0Var10 = p0Var3;
                                                            px.f.f163100a.b("Marking task as completed (errors were present)", px.c.a(p0Var10));
                                                            i0 i0Var114 = i0.f148189a;
                                                            this.documentDownloadRepository.a(this.taskId);
                                                            q0.d(p0Var10, null, 1, null);
                                                            return i0.f148189a;
                                                        }
                                                    }
                                                }
                                            }
                                            px.f.f163100a.b("Marking task as completed", px.c.a(p0Var3));
                                            aVar6 = this.downloadTaskDataRepository;
                                            str = this.taskId;
                                            jVar.f158529d = vq.j.a(p0Var4);
                                            jVar.f158530e = p0Var3;
                                            jVar.f158531f = vq.j.a(downloadTaskData);
                                            jVar.f158532g = null;
                                            jVar.f158533h = null;
                                            jVar.f158534j = null;
                                            jVar.f158535k = i15;
                                            jVar.f158540q = 10;
                                            if (aVar6.l(str, jVar) != objE) {
                                                p0Var10 = p0Var3;
                                                this.documentDownloadRepository.a(this.taskId);
                                                q0.d(p0Var10, null, 1, null);
                                                return i0.f148189a;
                                            }
                                        }
                                    }
                                }
                            } else {
                                downloadTaskData = downloadTaskData3;
                                p0Var3 = p0Var6;
                                p0Var4 = p0Var5;
                                mapB = downloadTaskData.b();
                                if (!mapB.isEmpty()) {
                                    it = mapB.entrySet().iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            value = it.next().getValue();
                                            if (value.getAsyncErrorResponse() == null) {
                                            }
                                            aVar7 = this.downloadTaskDataRepository;
                                            str2 = this.taskId;
                                            jVar.f158529d = vq.j.a(p0Var4);
                                            jVar.f158530e = p0Var3;
                                            jVar.f158531f = vq.j.a(downloadTaskData);
                                            jVar.f158532g = null;
                                            jVar.f158533h = null;
                                            jVar.f158534j = null;
                                            jVar.f158535k = i15;
                                            jVar.f158540q = 9;
                                            if (aVar7.l(str2, jVar) != objE) {
                                                p0Var10 = p0Var3;
                                                px.f.f163100a.b("Marking task as completed (errors were present)", px.c.a(p0Var10));
                                                i0 i0Var115 = i0.f148189a;
                                                this.documentDownloadRepository.a(this.taskId);
                                                q0.d(p0Var10, null, 1, null);
                                                return i0.f148189a;
                                            }
                                        }
                                    }
                                }
                                px.f.f163100a.b("Marking task as completed", px.c.a(p0Var3));
                                aVar6 = this.downloadTaskDataRepository;
                                str = this.taskId;
                                jVar.f158529d = vq.j.a(p0Var4);
                                jVar.f158530e = p0Var3;
                                jVar.f158531f = vq.j.a(downloadTaskData);
                                jVar.f158532g = null;
                                jVar.f158533h = null;
                                jVar.f158534j = null;
                                jVar.f158535k = i15;
                                jVar.f158540q = 10;
                                if (aVar6.l(str, jVar) != objE) {
                                    p0Var10 = p0Var3;
                                    this.documentDownloadRepository.a(this.taskId);
                                    q0.d(p0Var10, null, 1, null);
                                    return i0.f148189a;
                                }
                            }
                        }
                    } else {
                        mapB = downloadTaskData.b();
                        if (!mapB.isEmpty()) {
                            it = mapB.entrySet().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    value = it.next().getValue();
                                    if (value.getAsyncErrorResponse() == null) {
                                    }
                                    aVar7 = this.downloadTaskDataRepository;
                                    str2 = this.taskId;
                                    jVar.f158529d = vq.j.a(p0Var4);
                                    jVar.f158530e = p0Var3;
                                    jVar.f158531f = vq.j.a(downloadTaskData);
                                    jVar.f158532g = null;
                                    jVar.f158533h = null;
                                    jVar.f158534j = null;
                                    jVar.f158535k = i15;
                                    jVar.f158540q = 9;
                                    if (aVar7.l(str2, jVar) != objE) {
                                        p0Var10 = p0Var3;
                                        px.f.f163100a.b("Marking task as completed (errors were present)", px.c.a(p0Var10));
                                        i0 i0Var116 = i0.f148189a;
                                        this.documentDownloadRepository.a(this.taskId);
                                        q0.d(p0Var10, null, 1, null);
                                        return i0.f148189a;
                                    }
                                }
                            }
                        }
                        px.f.f163100a.b("Marking task as completed", px.c.a(p0Var3));
                        aVar6 = this.downloadTaskDataRepository;
                        str = this.taskId;
                        jVar.f158529d = vq.j.a(p0Var4);
                        jVar.f158530e = p0Var3;
                        jVar.f158531f = vq.j.a(downloadTaskData);
                        jVar.f158532g = null;
                        jVar.f158533h = null;
                        jVar.f158534j = null;
                        jVar.f158535k = i15;
                        jVar.f158540q = 10;
                        if (aVar6.l(str, jVar) != objE) {
                            p0Var10 = p0Var3;
                            this.documentDownloadRepository.a(this.taskId);
                            q0.d(p0Var10, null, 1, null);
                            return i0.f148189a;
                        }
                    }
                } else {
                    aVar = this.documentDownloadRepository;
                    taskId = downloadTaskData.getTaskId();
                    jVar.f158529d = vq.j.a(p0Var4);
                    jVar.f158530e = p0Var3;
                    jVar.f158531f = downloadTaskData;
                    jVar.f158535k = i15;
                    jVar.f158540q = 8;
                    if (aVar.d(taskId, jVar) != objE) {
                        downloadTaskData2 = downloadTaskData;
                        downloadTaskData = downloadTaskData2;
                        mapB = downloadTaskData.b();
                        if (!mapB.isEmpty()) {
                            it = mapB.entrySet().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    value = it.next().getValue();
                                    if (value.getAsyncErrorResponse() == null) {
                                    }
                                    aVar7 = this.downloadTaskDataRepository;
                                    str2 = this.taskId;
                                    jVar.f158529d = vq.j.a(p0Var4);
                                    jVar.f158530e = p0Var3;
                                    jVar.f158531f = vq.j.a(downloadTaskData);
                                    jVar.f158532g = null;
                                    jVar.f158533h = null;
                                    jVar.f158534j = null;
                                    jVar.f158535k = i15;
                                    jVar.f158540q = 9;
                                    if (aVar7.l(str2, jVar) != objE) {
                                        p0Var10 = p0Var3;
                                        px.f.f163100a.b("Marking task as completed (errors were present)", px.c.a(p0Var10));
                                        i0 i0Var117 = i0.f148189a;
                                        this.documentDownloadRepository.a(this.taskId);
                                        q0.d(p0Var10, null, 1, null);
                                        return i0.f148189a;
                                    }
                                }
                            }
                        }
                        px.f.f163100a.b("Marking task as completed", px.c.a(p0Var3));
                        aVar6 = this.downloadTaskDataRepository;
                        str = this.taskId;
                        jVar.f158529d = vq.j.a(p0Var4);
                        jVar.f158530e = p0Var3;
                        jVar.f158531f = vq.j.a(downloadTaskData);
                        jVar.f158532g = null;
                        jVar.f158533h = null;
                        jVar.f158534j = null;
                        jVar.f158535k = i15;
                        jVar.f158540q = 10;
                        if (aVar6.l(str, jVar) != objE) {
                            p0Var10 = p0Var3;
                            this.documentDownloadRepository.a(this.taskId);
                            q0.d(p0Var10, null, 1, null);
                            return i0.f148189a;
                        }
                    }
                }
                return objE;
            case 3:
                i15 = jVar.f158535k;
                entry2 = (Map.Entry) jVar.f158532g;
                downloadTaskData3 = (DownloadTaskData) jVar.f158531f;
                p0Var6 = (p0) jVar.f158530e;
                p0Var5 = (p0) jVar.f158529d;
                u.b(objC);
                iVar = (dx.i) objC;
                if (iVar instanceof dx.i.Left) {
                    objB = vq.b.a(false);
                } else {
                    if (iVar instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    objB = ((dx.i.Right) iVar).b();
                }
                if (((Boolean) objB).booleanValue()) {
                    a80.b bVar5 = this.asyncMainDocumentTaskCompletedUC;
                    a80.b.Params params4 = new a80.b.Params(downloadTaskData3.getMainDocumentAuthToken());
                    jVar.f158529d = vq.j.a(p0Var5);
                    jVar.f158530e = p0Var6;
                    jVar.f158531f = downloadTaskData3;
                    jVar.f158532g = entry2;
                    jVar.f158535k = i15;
                    jVar.f158540q = 4;
                    objC = bVar5.c(params4, jVar);
                    if (objC != objE) {
                        iVar2 = (dx.i) objC;
                        if (iVar2 instanceof dx.i.Left) {
                            bVar = (dx.b) ((dx.i.Left) iVar2).b();
                            aVar2 = this.downloadTaskDataRepository;
                            taskId2 = downloadTaskData3.getTaskId();
                            documentType = ((AsyncDocumentToGenerate) entry2.getValue()).getDocumentType();
                            aVar3 = cf0.a.CREATING_ERROR;
                            jVar.f158529d = vq.j.a(p0Var5);
                            jVar.f158530e = p0Var6;
                            jVar.f158531f = downloadTaskData3;
                            jVar.f158532g = entry2;
                            jVar.f158533h = iVar2;
                            jVar.f158534j = vq.j.a(bVar);
                            jVar.f158535k = i15;
                            jVar.f158536l = 0;
                            jVar.f158537m = 0;
                            jVar.f158540q = 5;
                            if (aVar2.m(taskId2, documentType, aVar3, jVar) != objE) {
                                i16 = 0;
                                p0Var7 = p0Var5;
                                p0Var8 = p0Var6;
                                downloadTaskData4 = downloadTaskData3;
                                entry4 = entry2;
                                iVar3 = iVar2;
                                i17 = 0;
                                aVar4 = this.documentStorageInteractor;
                                documentId = ((AsyncDocumentToGenerate) entry4.getValue()).getDocumentId();
                                jVar.f158529d = vq.j.a(p0Var7);
                                jVar.f158530e = p0Var8;
                                jVar.f158531f = downloadTaskData4;
                                jVar.f158532g = vq.j.a(entry4);
                                jVar.f158533h = iVar3;
                                jVar.f158534j = vq.j.a(bVar);
                                jVar.f158535k = i15;
                                jVar.f158536l = i16;
                                jVar.f158537m = i17;
                                jVar.f158540q = 6;
                                if (aVar4.b(documentId, jVar) != objE) {
                                    p0Var9 = p0Var7;
                                    iVar2 = iVar3;
                                    entry3 = entry4;
                                    downloadTaskData3 = downloadTaskData4;
                                    p0Var3 = p0Var8;
                                    p0Var5 = p0Var9;
                                    if (iVar2 instanceof dx.i.Right) {
                                        i0 i0Var118 = (i0) ((dx.i.Right) iVar2).b();
                                        aVar5 = this.documentStorageInteractor;
                                        jVar.f158529d = vq.j.a(p0Var5);
                                        jVar.f158530e = p0Var3;
                                        jVar.f158531f = downloadTaskData3;
                                        jVar.f158532g = vq.j.a(entry3);
                                        jVar.f158533h = iVar2;
                                        jVar.f158534j = vq.j.a(i0Var118);
                                        jVar.f158535k = i15;
                                        jVar.f158536l = 0;
                                        jVar.f158537m = 0;
                                        jVar.f158540q = 7;
                                        if (aVar5.h(jVar) != objE) {
                                            downloadTaskData2 = downloadTaskData3;
                                            p0Var4 = p0Var5;
                                            downloadTaskData = downloadTaskData2;
                                            mapB = downloadTaskData.b();
                                            if (!mapB.isEmpty()) {
                                                it = mapB.entrySet().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        value = it.next().getValue();
                                                        if (value.getAsyncErrorResponse() == null) {
                                                        }
                                                        aVar7 = this.downloadTaskDataRepository;
                                                        str2 = this.taskId;
                                                        jVar.f158529d = vq.j.a(p0Var4);
                                                        jVar.f158530e = p0Var3;
                                                        jVar.f158531f = vq.j.a(downloadTaskData);
                                                        jVar.f158532g = null;
                                                        jVar.f158533h = null;
                                                        jVar.f158534j = null;
                                                        jVar.f158535k = i15;
                                                        jVar.f158540q = 9;
                                                        if (aVar7.l(str2, jVar) != objE) {
                                                            p0Var10 = p0Var3;
                                                            px.f.f163100a.b("Marking task as completed (errors were present)", px.c.a(p0Var10));
                                                            i0 i0Var119 = i0.f148189a;
                                                            this.documentDownloadRepository.a(this.taskId);
                                                            q0.d(p0Var10, null, 1, null);
                                                            return i0.f148189a;
                                                        }
                                                    }
                                                }
                                            }
                                            px.f.f163100a.b("Marking task as completed", px.c.a(p0Var3));
                                            aVar6 = this.downloadTaskDataRepository;
                                            str = this.taskId;
                                            jVar.f158529d = vq.j.a(p0Var4);
                                            jVar.f158530e = p0Var3;
                                            jVar.f158531f = vq.j.a(downloadTaskData);
                                            jVar.f158532g = null;
                                            jVar.f158533h = null;
                                            jVar.f158534j = null;
                                            jVar.f158535k = i15;
                                            jVar.f158540q = 10;
                                            if (aVar6.l(str, jVar) != objE) {
                                                p0Var10 = p0Var3;
                                                this.documentDownloadRepository.a(this.taskId);
                                                q0.d(p0Var10, null, 1, null);
                                                return i0.f148189a;
                                            }
                                        }
                                    } else {
                                        downloadTaskData = downloadTaskData3;
                                        p0Var4 = p0Var5;
                                        mapB = downloadTaskData.b();
                                        if (!mapB.isEmpty()) {
                                            it = mapB.entrySet().iterator();
                                            while (true) {
                                                if (it.hasNext()) {
                                                    value = it.next().getValue();
                                                    if (value.getAsyncErrorResponse() == null) {
                                                    }
                                                    aVar7 = this.downloadTaskDataRepository;
                                                    str2 = this.taskId;
                                                    jVar.f158529d = vq.j.a(p0Var4);
                                                    jVar.f158530e = p0Var3;
                                                    jVar.f158531f = vq.j.a(downloadTaskData);
                                                    jVar.f158532g = null;
                                                    jVar.f158533h = null;
                                                    jVar.f158534j = null;
                                                    jVar.f158535k = i15;
                                                    jVar.f158540q = 9;
                                                    if (aVar7.l(str2, jVar) != objE) {
                                                        p0Var10 = p0Var3;
                                                        px.f.f163100a.b("Marking task as completed (errors were present)", px.c.a(p0Var10));
                                                        i0 i0Var1110 = i0.f148189a;
                                                        this.documentDownloadRepository.a(this.taskId);
                                                        q0.d(p0Var10, null, 1, null);
                                                        return i0.f148189a;
                                                    }
                                                }
                                            }
                                        }
                                        px.f.f163100a.b("Marking task as completed", px.c.a(p0Var3));
                                        aVar6 = this.downloadTaskDataRepository;
                                        str = this.taskId;
                                        jVar.f158529d = vq.j.a(p0Var4);
                                        jVar.f158530e = p0Var3;
                                        jVar.f158531f = vq.j.a(downloadTaskData);
                                        jVar.f158532g = null;
                                        jVar.f158533h = null;
                                        jVar.f158534j = null;
                                        jVar.f158535k = i15;
                                        jVar.f158540q = 10;
                                        if (aVar6.l(str, jVar) != objE) {
                                            p0Var10 = p0Var3;
                                            this.documentDownloadRepository.a(this.taskId);
                                            q0.d(p0Var10, null, 1, null);
                                            return i0.f148189a;
                                        }
                                    }
                                }
                            }
                        } else {
                            entry3 = entry2;
                            p0Var3 = p0Var6;
                            if (iVar2 instanceof dx.i.Right) {
                                i0 i0Var1111 = (i0) ((dx.i.Right) iVar2).b();
                                aVar5 = this.documentStorageInteractor;
                                jVar.f158529d = vq.j.a(p0Var5);
                                jVar.f158530e = p0Var3;
                                jVar.f158531f = downloadTaskData3;
                                jVar.f158532g = vq.j.a(entry3);
                                jVar.f158533h = iVar2;
                                jVar.f158534j = vq.j.a(i0Var1111);
                                jVar.f158535k = i15;
                                jVar.f158536l = 0;
                                jVar.f158537m = 0;
                                jVar.f158540q = 7;
                                if (aVar5.h(jVar) != objE) {
                                    downloadTaskData2 = downloadTaskData3;
                                    p0Var4 = p0Var5;
                                    downloadTaskData = downloadTaskData2;
                                    mapB = downloadTaskData.b();
                                    if (!mapB.isEmpty()) {
                                        it = mapB.entrySet().iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                value = it.next().getValue();
                                                if (value.getAsyncErrorResponse() == null) {
                                                }
                                                aVar7 = this.downloadTaskDataRepository;
                                                str2 = this.taskId;
                                                jVar.f158529d = vq.j.a(p0Var4);
                                                jVar.f158530e = p0Var3;
                                                jVar.f158531f = vq.j.a(downloadTaskData);
                                                jVar.f158532g = null;
                                                jVar.f158533h = null;
                                                jVar.f158534j = null;
                                                jVar.f158535k = i15;
                                                jVar.f158540q = 9;
                                                if (aVar7.l(str2, jVar) != objE) {
                                                    p0Var10 = p0Var3;
                                                    px.f.f163100a.b("Marking task as completed (errors were present)", px.c.a(p0Var10));
                                                    i0 i0Var1112 = i0.f148189a;
                                                    this.documentDownloadRepository.a(this.taskId);
                                                    q0.d(p0Var10, null, 1, null);
                                                    return i0.f148189a;
                                                }
                                            }
                                        }
                                    }
                                    px.f.f163100a.b("Marking task as completed", px.c.a(p0Var3));
                                    aVar6 = this.downloadTaskDataRepository;
                                    str = this.taskId;
                                    jVar.f158529d = vq.j.a(p0Var4);
                                    jVar.f158530e = p0Var3;
                                    jVar.f158531f = vq.j.a(downloadTaskData);
                                    jVar.f158532g = null;
                                    jVar.f158533h = null;
                                    jVar.f158534j = null;
                                    jVar.f158535k = i15;
                                    jVar.f158540q = 10;
                                    if (aVar6.l(str, jVar) != objE) {
                                        p0Var10 = p0Var3;
                                        this.documentDownloadRepository.a(this.taskId);
                                        q0.d(p0Var10, null, 1, null);
                                        return i0.f148189a;
                                    }
                                }
                            } else {
                                downloadTaskData = downloadTaskData3;
                                p0Var4 = p0Var5;
                                mapB = downloadTaskData.b();
                                if (!mapB.isEmpty()) {
                                    it = mapB.entrySet().iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            value = it.next().getValue();
                                            if (value.getAsyncErrorResponse() == null) {
                                            }
                                            aVar7 = this.downloadTaskDataRepository;
                                            str2 = this.taskId;
                                            jVar.f158529d = vq.j.a(p0Var4);
                                            jVar.f158530e = p0Var3;
                                            jVar.f158531f = vq.j.a(downloadTaskData);
                                            jVar.f158532g = null;
                                            jVar.f158533h = null;
                                            jVar.f158534j = null;
                                            jVar.f158535k = i15;
                                            jVar.f158540q = 9;
                                            if (aVar7.l(str2, jVar) != objE) {
                                                p0Var10 = p0Var3;
                                                px.f.f163100a.b("Marking task as completed (errors were present)", px.c.a(p0Var10));
                                                i0 i0Var1113 = i0.f148189a;
                                                this.documentDownloadRepository.a(this.taskId);
                                                q0.d(p0Var10, null, 1, null);
                                                return i0.f148189a;
                                            }
                                        }
                                    }
                                }
                                px.f.f163100a.b("Marking task as completed", px.c.a(p0Var3));
                                aVar6 = this.downloadTaskDataRepository;
                                str = this.taskId;
                                jVar.f158529d = vq.j.a(p0Var4);
                                jVar.f158530e = p0Var3;
                                jVar.f158531f = vq.j.a(downloadTaskData);
                                jVar.f158532g = null;
                                jVar.f158533h = null;
                                jVar.f158534j = null;
                                jVar.f158535k = i15;
                                jVar.f158540q = 10;
                                if (aVar6.l(str, jVar) != objE) {
                                    p0Var10 = p0Var3;
                                    this.documentDownloadRepository.a(this.taskId);
                                    q0.d(p0Var10, null, 1, null);
                                    return i0.f148189a;
                                }
                            }
                        }
                    }
                } else {
                    downloadTaskData = downloadTaskData3;
                    p0Var3 = p0Var6;
                    p0Var4 = p0Var5;
                    mapB = downloadTaskData.b();
                    if (!mapB.isEmpty()) {
                        it = mapB.entrySet().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                value = it.next().getValue();
                                if (value.getAsyncErrorResponse() == null) {
                                }
                                aVar7 = this.downloadTaskDataRepository;
                                str2 = this.taskId;
                                jVar.f158529d = vq.j.a(p0Var4);
                                jVar.f158530e = p0Var3;
                                jVar.f158531f = vq.j.a(downloadTaskData);
                                jVar.f158532g = null;
                                jVar.f158533h = null;
                                jVar.f158534j = null;
                                jVar.f158535k = i15;
                                jVar.f158540q = 9;
                                if (aVar7.l(str2, jVar) != objE) {
                                    p0Var10 = p0Var3;
                                    px.f.f163100a.b("Marking task as completed (errors were present)", px.c.a(p0Var10));
                                    i0 i0Var1114 = i0.f148189a;
                                    this.documentDownloadRepository.a(this.taskId);
                                    q0.d(p0Var10, null, 1, null);
                                    return i0.f148189a;
                                }
                            }
                        }
                    }
                    px.f.f163100a.b("Marking task as completed", px.c.a(p0Var3));
                    aVar6 = this.downloadTaskDataRepository;
                    str = this.taskId;
                    jVar.f158529d = vq.j.a(p0Var4);
                    jVar.f158530e = p0Var3;
                    jVar.f158531f = vq.j.a(downloadTaskData);
                    jVar.f158532g = null;
                    jVar.f158533h = null;
                    jVar.f158534j = null;
                    jVar.f158535k = i15;
                    jVar.f158540q = 10;
                    if (aVar6.l(str, jVar) != objE) {
                        p0Var10 = p0Var3;
                        this.documentDownloadRepository.a(this.taskId);
                        q0.d(p0Var10, null, 1, null);
                        return i0.f148189a;
                    }
                }
                return objE;
            case 4:
                i15 = jVar.f158535k;
                entry2 = (Map.Entry) jVar.f158532g;
                downloadTaskData3 = (DownloadTaskData) jVar.f158531f;
                p0Var6 = (p0) jVar.f158530e;
                p0Var5 = (p0) jVar.f158529d;
                u.b(objC);
                iVar2 = (dx.i) objC;
                if (iVar2 instanceof dx.i.Left) {
                    bVar = (dx.b) ((dx.i.Left) iVar2).b();
                    aVar2 = this.downloadTaskDataRepository;
                    taskId2 = downloadTaskData3.getTaskId();
                    documentType = ((AsyncDocumentToGenerate) entry2.getValue()).getDocumentType();
                    aVar3 = cf0.a.CREATING_ERROR;
                    jVar.f158529d = vq.j.a(p0Var5);
                    jVar.f158530e = p0Var6;
                    jVar.f158531f = downloadTaskData3;
                    jVar.f158532g = entry2;
                    jVar.f158533h = iVar2;
                    jVar.f158534j = vq.j.a(bVar);
                    jVar.f158535k = i15;
                    jVar.f158536l = 0;
                    jVar.f158537m = 0;
                    jVar.f158540q = 5;
                    if (aVar2.m(taskId2, documentType, aVar3, jVar) != objE) {
                        i16 = 0;
                        p0Var7 = p0Var5;
                        p0Var8 = p0Var6;
                        downloadTaskData4 = downloadTaskData3;
                        entry4 = entry2;
                        iVar3 = iVar2;
                        i17 = 0;
                        aVar4 = this.documentStorageInteractor;
                        documentId = ((AsyncDocumentToGenerate) entry4.getValue()).getDocumentId();
                        jVar.f158529d = vq.j.a(p0Var7);
                        jVar.f158530e = p0Var8;
                        jVar.f158531f = downloadTaskData4;
                        jVar.f158532g = vq.j.a(entry4);
                        jVar.f158533h = iVar3;
                        jVar.f158534j = vq.j.a(bVar);
                        jVar.f158535k = i15;
                        jVar.f158536l = i16;
                        jVar.f158537m = i17;
                        jVar.f158540q = 6;
                        if (aVar4.b(documentId, jVar) != objE) {
                            p0Var9 = p0Var7;
                            iVar2 = iVar3;
                            entry3 = entry4;
                            downloadTaskData3 = downloadTaskData4;
                            p0Var3 = p0Var8;
                            p0Var5 = p0Var9;
                            if (iVar2 instanceof dx.i.Right) {
                                i0 i0Var1115 = (i0) ((dx.i.Right) iVar2).b();
                                aVar5 = this.documentStorageInteractor;
                                jVar.f158529d = vq.j.a(p0Var5);
                                jVar.f158530e = p0Var3;
                                jVar.f158531f = downloadTaskData3;
                                jVar.f158532g = vq.j.a(entry3);
                                jVar.f158533h = iVar2;
                                jVar.f158534j = vq.j.a(i0Var1115);
                                jVar.f158535k = i15;
                                jVar.f158536l = 0;
                                jVar.f158537m = 0;
                                jVar.f158540q = 7;
                                if (aVar5.h(jVar) != objE) {
                                    downloadTaskData2 = downloadTaskData3;
                                    p0Var4 = p0Var5;
                                    downloadTaskData = downloadTaskData2;
                                    mapB = downloadTaskData.b();
                                    if (!mapB.isEmpty()) {
                                        it = mapB.entrySet().iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                value = it.next().getValue();
                                                if (value.getAsyncErrorResponse() == null) {
                                                }
                                                aVar7 = this.downloadTaskDataRepository;
                                                str2 = this.taskId;
                                                jVar.f158529d = vq.j.a(p0Var4);
                                                jVar.f158530e = p0Var3;
                                                jVar.f158531f = vq.j.a(downloadTaskData);
                                                jVar.f158532g = null;
                                                jVar.f158533h = null;
                                                jVar.f158534j = null;
                                                jVar.f158535k = i15;
                                                jVar.f158540q = 9;
                                                if (aVar7.l(str2, jVar) != objE) {
                                                    p0Var10 = p0Var3;
                                                    px.f.f163100a.b("Marking task as completed (errors were present)", px.c.a(p0Var10));
                                                    i0 i0Var1116 = i0.f148189a;
                                                    this.documentDownloadRepository.a(this.taskId);
                                                    q0.d(p0Var10, null, 1, null);
                                                    return i0.f148189a;
                                                }
                                            }
                                        }
                                    }
                                    px.f.f163100a.b("Marking task as completed", px.c.a(p0Var3));
                                    aVar6 = this.downloadTaskDataRepository;
                                    str = this.taskId;
                                    jVar.f158529d = vq.j.a(p0Var4);
                                    jVar.f158530e = p0Var3;
                                    jVar.f158531f = vq.j.a(downloadTaskData);
                                    jVar.f158532g = null;
                                    jVar.f158533h = null;
                                    jVar.f158534j = null;
                                    jVar.f158535k = i15;
                                    jVar.f158540q = 10;
                                    if (aVar6.l(str, jVar) != objE) {
                                        p0Var10 = p0Var3;
                                        this.documentDownloadRepository.a(this.taskId);
                                        q0.d(p0Var10, null, 1, null);
                                        return i0.f148189a;
                                    }
                                }
                            } else {
                                downloadTaskData = downloadTaskData3;
                                p0Var4 = p0Var5;
                                mapB = downloadTaskData.b();
                                if (!mapB.isEmpty()) {
                                    it = mapB.entrySet().iterator();
                                    while (true) {
                                        if (it.hasNext()) {
                                            value = it.next().getValue();
                                            if (value.getAsyncErrorResponse() == null) {
                                            }
                                            aVar7 = this.downloadTaskDataRepository;
                                            str2 = this.taskId;
                                            jVar.f158529d = vq.j.a(p0Var4);
                                            jVar.f158530e = p0Var3;
                                            jVar.f158531f = vq.j.a(downloadTaskData);
                                            jVar.f158532g = null;
                                            jVar.f158533h = null;
                                            jVar.f158534j = null;
                                            jVar.f158535k = i15;
                                            jVar.f158540q = 9;
                                            if (aVar7.l(str2, jVar) != objE) {
                                                p0Var10 = p0Var3;
                                                px.f.f163100a.b("Marking task as completed (errors were present)", px.c.a(p0Var10));
                                                i0 i0Var1117 = i0.f148189a;
                                                this.documentDownloadRepository.a(this.taskId);
                                                q0.d(p0Var10, null, 1, null);
                                                return i0.f148189a;
                                            }
                                        }
                                    }
                                }
                                px.f.f163100a.b("Marking task as completed", px.c.a(p0Var3));
                                aVar6 = this.downloadTaskDataRepository;
                                str = this.taskId;
                                jVar.f158529d = vq.j.a(p0Var4);
                                jVar.f158530e = p0Var3;
                                jVar.f158531f = vq.j.a(downloadTaskData);
                                jVar.f158532g = null;
                                jVar.f158533h = null;
                                jVar.f158534j = null;
                                jVar.f158535k = i15;
                                jVar.f158540q = 10;
                                if (aVar6.l(str, jVar) != objE) {
                                    p0Var10 = p0Var3;
                                    this.documentDownloadRepository.a(this.taskId);
                                    q0.d(p0Var10, null, 1, null);
                                    return i0.f148189a;
                                }
                            }
                        }
                    }
                } else {
                    entry3 = entry2;
                    p0Var3 = p0Var6;
                    if (iVar2 instanceof dx.i.Right) {
                        i0 i0Var1118 = (i0) ((dx.i.Right) iVar2).b();
                        aVar5 = this.documentStorageInteractor;
                        jVar.f158529d = vq.j.a(p0Var5);
                        jVar.f158530e = p0Var3;
                        jVar.f158531f = downloadTaskData3;
                        jVar.f158532g = vq.j.a(entry3);
                        jVar.f158533h = iVar2;
                        jVar.f158534j = vq.j.a(i0Var1118);
                        jVar.f158535k = i15;
                        jVar.f158536l = 0;
                        jVar.f158537m = 0;
                        jVar.f158540q = 7;
                        if (aVar5.h(jVar) != objE) {
                            downloadTaskData2 = downloadTaskData3;
                            p0Var4 = p0Var5;
                            downloadTaskData = downloadTaskData2;
                            mapB = downloadTaskData.b();
                            if (!mapB.isEmpty()) {
                                it = mapB.entrySet().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        value = it.next().getValue();
                                        if (value.getAsyncErrorResponse() == null) {
                                        }
                                        aVar7 = this.downloadTaskDataRepository;
                                        str2 = this.taskId;
                                        jVar.f158529d = vq.j.a(p0Var4);
                                        jVar.f158530e = p0Var3;
                                        jVar.f158531f = vq.j.a(downloadTaskData);
                                        jVar.f158532g = null;
                                        jVar.f158533h = null;
                                        jVar.f158534j = null;
                                        jVar.f158535k = i15;
                                        jVar.f158540q = 9;
                                        if (aVar7.l(str2, jVar) != objE) {
                                            p0Var10 = p0Var3;
                                            px.f.f163100a.b("Marking task as completed (errors were present)", px.c.a(p0Var10));
                                            i0 i0Var1119 = i0.f148189a;
                                            this.documentDownloadRepository.a(this.taskId);
                                            q0.d(p0Var10, null, 1, null);
                                            return i0.f148189a;
                                        }
                                    }
                                }
                            }
                            px.f.f163100a.b("Marking task as completed", px.c.a(p0Var3));
                            aVar6 = this.downloadTaskDataRepository;
                            str = this.taskId;
                            jVar.f158529d = vq.j.a(p0Var4);
                            jVar.f158530e = p0Var3;
                            jVar.f158531f = vq.j.a(downloadTaskData);
                            jVar.f158532g = null;
                            jVar.f158533h = null;
                            jVar.f158534j = null;
                            jVar.f158535k = i15;
                            jVar.f158540q = 10;
                            if (aVar6.l(str, jVar) != objE) {
                                p0Var10 = p0Var3;
                                this.documentDownloadRepository.a(this.taskId);
                                q0.d(p0Var10, null, 1, null);
                                return i0.f148189a;
                            }
                        }
                    } else {
                        downloadTaskData = downloadTaskData3;
                        p0Var4 = p0Var5;
                        mapB = downloadTaskData.b();
                        if (!mapB.isEmpty()) {
                            it = mapB.entrySet().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    value = it.next().getValue();
                                    if (value.getAsyncErrorResponse() == null) {
                                    }
                                    aVar7 = this.downloadTaskDataRepository;
                                    str2 = this.taskId;
                                    jVar.f158529d = vq.j.a(p0Var4);
                                    jVar.f158530e = p0Var3;
                                    jVar.f158531f = vq.j.a(downloadTaskData);
                                    jVar.f158532g = null;
                                    jVar.f158533h = null;
                                    jVar.f158534j = null;
                                    jVar.f158535k = i15;
                                    jVar.f158540q = 9;
                                    if (aVar7.l(str2, jVar) != objE) {
                                        p0Var10 = p0Var3;
                                        px.f.f163100a.b("Marking task as completed (errors were present)", px.c.a(p0Var10));
                                        i0 i0Var11110 = i0.f148189a;
                                        this.documentDownloadRepository.a(this.taskId);
                                        q0.d(p0Var10, null, 1, null);
                                        return i0.f148189a;
                                    }
                                }
                            }
                        }
                        px.f.f163100a.b("Marking task as completed", px.c.a(p0Var3));
                        aVar6 = this.downloadTaskDataRepository;
                        str = this.taskId;
                        jVar.f158529d = vq.j.a(p0Var4);
                        jVar.f158530e = p0Var3;
                        jVar.f158531f = vq.j.a(downloadTaskData);
                        jVar.f158532g = null;
                        jVar.f158533h = null;
                        jVar.f158534j = null;
                        jVar.f158535k = i15;
                        jVar.f158540q = 10;
                        if (aVar6.l(str, jVar) != objE) {
                            p0Var10 = p0Var3;
                            this.documentDownloadRepository.a(this.taskId);
                            q0.d(p0Var10, null, 1, null);
                            return i0.f148189a;
                        }
                    }
                }
                return objE;
            case 5:
                int i19 = jVar.f158537m;
                int i25 = jVar.f158536l;
                int i26 = jVar.f158535k;
                dx.b bVar6 = (dx.b) jVar.f158534j;
                dx.i iVar4 = (dx.i) jVar.f158533h;
                Map.Entry entry5 = (Map.Entry) jVar.f158532g;
                DownloadTaskData downloadTaskData5 = (DownloadTaskData) jVar.f158531f;
                p0 p0Var15 = (p0) jVar.f158530e;
                p0Var7 = (p0) jVar.f158529d;
                u.b(objC);
                i17 = i19;
                i16 = i25;
                i15 = i26;
                iVar3 = iVar4;
                entry4 = entry5;
                p0Var8 = p0Var15;
                bVar = bVar6;
                downloadTaskData4 = downloadTaskData5;
                aVar4 = this.documentStorageInteractor;
                documentId = ((AsyncDocumentToGenerate) entry4.getValue()).getDocumentId();
                jVar.f158529d = vq.j.a(p0Var7);
                jVar.f158530e = p0Var8;
                jVar.f158531f = downloadTaskData4;
                jVar.f158532g = vq.j.a(entry4);
                jVar.f158533h = iVar3;
                jVar.f158534j = vq.j.a(bVar);
                jVar.f158535k = i15;
                jVar.f158536l = i16;
                jVar.f158537m = i17;
                jVar.f158540q = 6;
                if (aVar4.b(documentId, jVar) != objE) {
                    p0Var9 = p0Var7;
                    iVar2 = iVar3;
                    entry3 = entry4;
                    downloadTaskData3 = downloadTaskData4;
                    p0Var3 = p0Var8;
                    p0Var5 = p0Var9;
                    if (iVar2 instanceof dx.i.Right) {
                        i0 i0Var11111 = (i0) ((dx.i.Right) iVar2).b();
                        aVar5 = this.documentStorageInteractor;
                        jVar.f158529d = vq.j.a(p0Var5);
                        jVar.f158530e = p0Var3;
                        jVar.f158531f = downloadTaskData3;
                        jVar.f158532g = vq.j.a(entry3);
                        jVar.f158533h = iVar2;
                        jVar.f158534j = vq.j.a(i0Var11111);
                        jVar.f158535k = i15;
                        jVar.f158536l = 0;
                        jVar.f158537m = 0;
                        jVar.f158540q = 7;
                        if (aVar5.h(jVar) != objE) {
                            downloadTaskData2 = downloadTaskData3;
                            p0Var4 = p0Var5;
                            downloadTaskData = downloadTaskData2;
                            mapB = downloadTaskData.b();
                            if (!mapB.isEmpty()) {
                                it = mapB.entrySet().iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        value = it.next().getValue();
                                        if (value.getAsyncErrorResponse() == null) {
                                        }
                                        aVar7 = this.downloadTaskDataRepository;
                                        str2 = this.taskId;
                                        jVar.f158529d = vq.j.a(p0Var4);
                                        jVar.f158530e = p0Var3;
                                        jVar.f158531f = vq.j.a(downloadTaskData);
                                        jVar.f158532g = null;
                                        jVar.f158533h = null;
                                        jVar.f158534j = null;
                                        jVar.f158535k = i15;
                                        jVar.f158540q = 9;
                                        if (aVar7.l(str2, jVar) != objE) {
                                            p0Var10 = p0Var3;
                                            px.f.f163100a.b("Marking task as completed (errors were present)", px.c.a(p0Var10));
                                            i0 i0Var11112 = i0.f148189a;
                                            this.documentDownloadRepository.a(this.taskId);
                                            q0.d(p0Var10, null, 1, null);
                                            return i0.f148189a;
                                        }
                                    }
                                }
                            }
                            px.f.f163100a.b("Marking task as completed", px.c.a(p0Var3));
                            aVar6 = this.downloadTaskDataRepository;
                            str = this.taskId;
                            jVar.f158529d = vq.j.a(p0Var4);
                            jVar.f158530e = p0Var3;
                            jVar.f158531f = vq.j.a(downloadTaskData);
                            jVar.f158532g = null;
                            jVar.f158533h = null;
                            jVar.f158534j = null;
                            jVar.f158535k = i15;
                            jVar.f158540q = 10;
                            if (aVar6.l(str, jVar) != objE) {
                                p0Var10 = p0Var3;
                                this.documentDownloadRepository.a(this.taskId);
                                q0.d(p0Var10, null, 1, null);
                                return i0.f148189a;
                            }
                        }
                    } else {
                        downloadTaskData = downloadTaskData3;
                        p0Var4 = p0Var5;
                        mapB = downloadTaskData.b();
                        if (!mapB.isEmpty()) {
                            it = mapB.entrySet().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    value = it.next().getValue();
                                    if (value.getAsyncErrorResponse() == null) {
                                    }
                                    aVar7 = this.downloadTaskDataRepository;
                                    str2 = this.taskId;
                                    jVar.f158529d = vq.j.a(p0Var4);
                                    jVar.f158530e = p0Var3;
                                    jVar.f158531f = vq.j.a(downloadTaskData);
                                    jVar.f158532g = null;
                                    jVar.f158533h = null;
                                    jVar.f158534j = null;
                                    jVar.f158535k = i15;
                                    jVar.f158540q = 9;
                                    if (aVar7.l(str2, jVar) != objE) {
                                        p0Var10 = p0Var3;
                                        px.f.f163100a.b("Marking task as completed (errors were present)", px.c.a(p0Var10));
                                        i0 i0Var11113 = i0.f148189a;
                                        this.documentDownloadRepository.a(this.taskId);
                                        q0.d(p0Var10, null, 1, null);
                                        return i0.f148189a;
                                    }
                                }
                            }
                        }
                        px.f.f163100a.b("Marking task as completed", px.c.a(p0Var3));
                        aVar6 = this.downloadTaskDataRepository;
                        str = this.taskId;
                        jVar.f158529d = vq.j.a(p0Var4);
                        jVar.f158530e = p0Var3;
                        jVar.f158531f = vq.j.a(downloadTaskData);
                        jVar.f158532g = null;
                        jVar.f158533h = null;
                        jVar.f158534j = null;
                        jVar.f158535k = i15;
                        jVar.f158540q = 10;
                        if (aVar6.l(str, jVar) != objE) {
                            p0Var10 = p0Var3;
                            this.documentDownloadRepository.a(this.taskId);
                            q0.d(p0Var10, null, 1, null);
                            return i0.f148189a;
                        }
                    }
                }
                return objE;
            case 6:
                i15 = jVar.f158535k;
                iVar3 = (dx.i) jVar.f158533h;
                entry4 = (Map.Entry) jVar.f158532g;
                downloadTaskData4 = (DownloadTaskData) jVar.f158531f;
                p0Var8 = (p0) jVar.f158530e;
                p0Var9 = (p0) jVar.f158529d;
                u.b(objC);
                iVar2 = iVar3;
                entry3 = entry4;
                downloadTaskData3 = downloadTaskData4;
                p0Var3 = p0Var8;
                p0Var5 = p0Var9;
                if (iVar2 instanceof dx.i.Right) {
                    i0 i0Var11114 = (i0) ((dx.i.Right) iVar2).b();
                    aVar5 = this.documentStorageInteractor;
                    jVar.f158529d = vq.j.a(p0Var5);
                    jVar.f158530e = p0Var3;
                    jVar.f158531f = downloadTaskData3;
                    jVar.f158532g = vq.j.a(entry3);
                    jVar.f158533h = iVar2;
                    jVar.f158534j = vq.j.a(i0Var11114);
                    jVar.f158535k = i15;
                    jVar.f158536l = 0;
                    jVar.f158537m = 0;
                    jVar.f158540q = 7;
                    if (aVar5.h(jVar) != objE) {
                        downloadTaskData2 = downloadTaskData3;
                        p0Var4 = p0Var5;
                        downloadTaskData = downloadTaskData2;
                        mapB = downloadTaskData.b();
                        if (!mapB.isEmpty()) {
                            it = mapB.entrySet().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    value = it.next().getValue();
                                    if (value.getAsyncErrorResponse() == null) {
                                    }
                                    aVar7 = this.downloadTaskDataRepository;
                                    str2 = this.taskId;
                                    jVar.f158529d = vq.j.a(p0Var4);
                                    jVar.f158530e = p0Var3;
                                    jVar.f158531f = vq.j.a(downloadTaskData);
                                    jVar.f158532g = null;
                                    jVar.f158533h = null;
                                    jVar.f158534j = null;
                                    jVar.f158535k = i15;
                                    jVar.f158540q = 9;
                                    if (aVar7.l(str2, jVar) != objE) {
                                        p0Var10 = p0Var3;
                                        px.f.f163100a.b("Marking task as completed (errors were present)", px.c.a(p0Var10));
                                        i0 i0Var11115 = i0.f148189a;
                                        this.documentDownloadRepository.a(this.taskId);
                                        q0.d(p0Var10, null, 1, null);
                                        return i0.f148189a;
                                    }
                                }
                            }
                        }
                        px.f.f163100a.b("Marking task as completed", px.c.a(p0Var3));
                        aVar6 = this.downloadTaskDataRepository;
                        str = this.taskId;
                        jVar.f158529d = vq.j.a(p0Var4);
                        jVar.f158530e = p0Var3;
                        jVar.f158531f = vq.j.a(downloadTaskData);
                        jVar.f158532g = null;
                        jVar.f158533h = null;
                        jVar.f158534j = null;
                        jVar.f158535k = i15;
                        jVar.f158540q = 10;
                        if (aVar6.l(str, jVar) != objE) {
                            p0Var10 = p0Var3;
                            this.documentDownloadRepository.a(this.taskId);
                            q0.d(p0Var10, null, 1, null);
                            return i0.f148189a;
                        }
                    }
                } else {
                    downloadTaskData = downloadTaskData3;
                    p0Var4 = p0Var5;
                    mapB = downloadTaskData.b();
                    if (!mapB.isEmpty()) {
                        it = mapB.entrySet().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                value = it.next().getValue();
                                if (value.getAsyncErrorResponse() == null) {
                                }
                                aVar7 = this.downloadTaskDataRepository;
                                str2 = this.taskId;
                                jVar.f158529d = vq.j.a(p0Var4);
                                jVar.f158530e = p0Var3;
                                jVar.f158531f = vq.j.a(downloadTaskData);
                                jVar.f158532g = null;
                                jVar.f158533h = null;
                                jVar.f158534j = null;
                                jVar.f158535k = i15;
                                jVar.f158540q = 9;
                                if (aVar7.l(str2, jVar) != objE) {
                                    p0Var10 = p0Var3;
                                    px.f.f163100a.b("Marking task as completed (errors were present)", px.c.a(p0Var10));
                                    i0 i0Var11116 = i0.f148189a;
                                    this.documentDownloadRepository.a(this.taskId);
                                    q0.d(p0Var10, null, 1, null);
                                    return i0.f148189a;
                                }
                            }
                        }
                    }
                    px.f.f163100a.b("Marking task as completed", px.c.a(p0Var3));
                    aVar6 = this.downloadTaskDataRepository;
                    str = this.taskId;
                    jVar.f158529d = vq.j.a(p0Var4);
                    jVar.f158530e = p0Var3;
                    jVar.f158531f = vq.j.a(downloadTaskData);
                    jVar.f158532g = null;
                    jVar.f158533h = null;
                    jVar.f158534j = null;
                    jVar.f158535k = i15;
                    jVar.f158540q = 10;
                    if (aVar6.l(str, jVar) != objE) {
                        p0Var10 = p0Var3;
                        this.documentDownloadRepository.a(this.taskId);
                        q0.d(p0Var10, null, 1, null);
                        return i0.f148189a;
                    }
                }
                return objE;
            case 7:
                i15 = jVar.f158535k;
                downloadTaskData2 = (DownloadTaskData) jVar.f158531f;
                p0Var3 = (p0) jVar.f158530e;
                p0Var4 = (p0) jVar.f158529d;
                u.b(objC);
                downloadTaskData = downloadTaskData2;
                mapB = downloadTaskData.b();
                if (!mapB.isEmpty()) {
                    it = mapB.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            value = it.next().getValue();
                            if (value.getAsyncErrorResponse() == null) {
                            }
                            aVar7 = this.downloadTaskDataRepository;
                            str2 = this.taskId;
                            jVar.f158529d = vq.j.a(p0Var4);
                            jVar.f158530e = p0Var3;
                            jVar.f158531f = vq.j.a(downloadTaskData);
                            jVar.f158532g = null;
                            jVar.f158533h = null;
                            jVar.f158534j = null;
                            jVar.f158535k = i15;
                            jVar.f158540q = 9;
                            if (aVar7.l(str2, jVar) != objE) {
                                p0Var10 = p0Var3;
                                px.f.f163100a.b("Marking task as completed (errors were present)", px.c.a(p0Var10));
                                i0 i0Var11117 = i0.f148189a;
                                this.documentDownloadRepository.a(this.taskId);
                                q0.d(p0Var10, null, 1, null);
                                return i0.f148189a;
                            }
                        }
                        return objE;
                    }
                }
                px.f.f163100a.b("Marking task as completed", px.c.a(p0Var3));
                aVar6 = this.downloadTaskDataRepository;
                str = this.taskId;
                jVar.f158529d = vq.j.a(p0Var4);
                jVar.f158530e = p0Var3;
                jVar.f158531f = vq.j.a(downloadTaskData);
                jVar.f158532g = null;
                jVar.f158533h = null;
                jVar.f158534j = null;
                jVar.f158535k = i15;
                jVar.f158540q = 10;
                if (aVar6.l(str, jVar) != objE) {
                    p0Var10 = p0Var3;
                    this.documentDownloadRepository.a(this.taskId);
                    q0.d(p0Var10, null, 1, null);
                    return i0.f148189a;
                }
                return objE;
            case 8:
                i15 = jVar.f158535k;
                downloadTaskData2 = (DownloadTaskData) jVar.f158531f;
                p0Var3 = (p0) jVar.f158530e;
                p0Var4 = (p0) jVar.f158529d;
                u.b(objC);
                downloadTaskData = downloadTaskData2;
                mapB = downloadTaskData.b();
                if (!mapB.isEmpty()) {
                    it = mapB.entrySet().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            value = it.next().getValue();
                            if (value.getAsyncErrorResponse() == null) {
                            }
                            aVar7 = this.downloadTaskDataRepository;
                            str2 = this.taskId;
                            jVar.f158529d = vq.j.a(p0Var4);
                            jVar.f158530e = p0Var3;
                            jVar.f158531f = vq.j.a(downloadTaskData);
                            jVar.f158532g = null;
                            jVar.f158533h = null;
                            jVar.f158534j = null;
                            jVar.f158535k = i15;
                            jVar.f158540q = 9;
                            if (aVar7.l(str2, jVar) != objE) {
                                p0Var10 = p0Var3;
                                px.f.f163100a.b("Marking task as completed (errors were present)", px.c.a(p0Var10));
                                i0 i0Var11118 = i0.f148189a;
                                this.documentDownloadRepository.a(this.taskId);
                                q0.d(p0Var10, null, 1, null);
                                return i0.f148189a;
                            }
                        }
                        return objE;
                    }
                }
                px.f.f163100a.b("Marking task as completed", px.c.a(p0Var3));
                aVar6 = this.downloadTaskDataRepository;
                str = this.taskId;
                jVar.f158529d = vq.j.a(p0Var4);
                jVar.f158530e = p0Var3;
                jVar.f158531f = vq.j.a(downloadTaskData);
                jVar.f158532g = null;
                jVar.f158533h = null;
                jVar.f158534j = null;
                jVar.f158535k = i15;
                jVar.f158540q = 10;
                if (aVar6.l(str, jVar) != objE) {
                    p0Var10 = p0Var3;
                    this.documentDownloadRepository.a(this.taskId);
                    q0.d(p0Var10, null, 1, null);
                    return i0.f148189a;
                }
                return objE;
            case 9:
                p0Var10 = (p0) jVar.f158530e;
                u.b(objC);
                px.f.f163100a.b("Marking task as completed (errors were present)", px.c.a(p0Var10));
                i0 i0Var11119 = i0.f148189a;
                this.documentDownloadRepository.a(this.taskId);
                q0.d(p0Var10, null, 1, null);
                return i0.f148189a;
            case 10:
                p0Var10 = (p0) jVar.f158530e;
                u.b(objC);
                this.documentDownloadRepository.a(this.taskId);
                q0.d(p0Var10, null, 1, null);
                return i0.f148189a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:56:0x0162  */
    /* JADX WARN: Code duplicated, block: B:59:0x0173 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:61:0x0177  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:70:0x01aa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f5, code lost:
    
        if (r1.b(r5, r2) == r3) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x019b, code lost:
    
        if (r8.b(r9, r2) == r3) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M(kf0.AsyncDocumentGenerationResult r17, tq.e<? super oq.i0> r18) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 429
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.gov.coi.mjunior.technical.async.worker.AsyncDownloadWorker.M(kf0.b, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final w0<i0> N(p0 p0Var) {
        return ju.k.b(p0Var, g1.b(), null, new l(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:187:0x083c  */
    /* JADX WARN: Code duplicated, block: B:190:0x08a3  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v7, types: [cf0.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v87 */
    /* JADX WARN: Type inference failed for: r10v90 */
    /* JADX WARN: Type inference failed for: r10v91 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [cf0.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v17, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v89 */
    /* JADX WARN: Type inference failed for: r5v90 */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v83 */
    /* JADX WARN: Type inference failed for: r7v90 */
    /* JADX WARN: Type inference failed for: r7v91 */
    /* JADX WARN: Type inference failed for: r7v92 */
    /* JADX WARN: Type inference failed for: r7v93 */
    /* JADX WARN: Type inference failed for: r7v94 */
    /* JADX WARN: Type inference failed for: r7v95 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:190:0x08a3 -> B:191:0x08ae). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:94:0x0513 -> B:95:0x051f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object O(kf0.AsyncDocumentGenerationResult r26, tq.e<? super oq.i0> r27) {
        /*
            Method dump skipped, instruction units count: 2812
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.gov.coi.mjunior.technical.async.worker.AsyncDownloadWorker.O(kf0.b, tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:81:0x0135 A[Catch: Exception -> 0x0053, TryCatch #1 {Exception -> 0x0053, blocks: (B:19:0x004e, B:84:0x014a, B:24:0x005a, B:79:0x012f, B:81:0x0135, B:87:0x014f, B:89:0x0153, B:91:0x0158, B:93:0x015d, B:94:0x0162, B:32:0x007e), top: B:107:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x0149  */
    /* JADX WARN: Code duplicated, block: B:86:0x014d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x014f A[Catch: Exception -> 0x0053, TryCatch #1 {Exception -> 0x0053, blocks: (B:19:0x004e, B:84:0x014a, B:24:0x005a, B:79:0x012f, B:81:0x0135, B:87:0x014f, B:89:0x0153, B:91:0x0158, B:93:0x015d, B:94:0x0162, B:32:0x007e), top: B:107:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x0153 A[Catch: Exception -> 0x0053, TryCatch #1 {Exception -> 0x0053, blocks: (B:19:0x004e, B:84:0x014a, B:24:0x005a, B:79:0x012f, B:81:0x0135, B:87:0x014f, B:89:0x0153, B:91:0x0158, B:93:0x015d, B:94:0x0162, B:32:0x007e), top: B:107:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code duplicated, block: B:91:0x0158 A[Catch: Exception -> 0x0053, TryCatch #1 {Exception -> 0x0053, blocks: (B:19:0x004e, B:84:0x014a, B:24:0x005a, B:79:0x012f, B:81:0x0135, B:87:0x014f, B:89:0x0153, B:91:0x0158, B:93:0x015d, B:94:0x0162, B:32:0x007e), top: B:107:0x0027 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x015d A[Catch: Exception -> 0x0053, TryCatch #1 {Exception -> 0x0053, blocks: (B:19:0x004e, B:84:0x014a, B:24:0x005a, B:79:0x012f, B:81:0x0135, B:87:0x014f, B:89:0x0153, B:91:0x0158, B:93:0x015d, B:94:0x0162, B:32:0x007e), top: B:107:0x0027 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v12 */
    @Override // androidx.work.CoroutineWorker
    public Object k(tq.e<? super androidx.work.c.a> eVar) throws Throwable {
        d dVar;
        Exception exc;
        fr.p0 p0Var;
        fr.p0 p0Var2;
        fr.p0 p0Var3;
        dx.i iVar;
        boolean z15;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f158470h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f158470h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        d dVar2 = dVar;
        Object objE = dVar2.f158468f;
        Object objE2 = uq.b.e();
        Object obj = dVar2.f158470h;
        try {
            if (obj == 0) {
                u.b(objE);
                this.retryWorker = false;
                p0Var = new fr.p0();
                this.startedDocuments.clear();
                mf0.a aVar = this.downloadTaskDataRepository;
                String str = this.taskId;
                dVar2.f158466d = p0Var;
                dVar2.f158467e = p0Var;
                dVar2.f158470h = 1;
                objE = aVar.e(str, dVar2);
                if (objE != objE2) {
                    p0Var2 = p0Var;
                }
                return objE2;
            }
            if (obj == 1) {
                p0Var = (fr.p0) dVar2.f158467e;
                p0Var2 = (fr.p0) dVar2.f158466d;
                try {
                    u.b(objE);
                } catch (Exception e15) {
                    e = e15;
                    obj = p0Var2;
                    if (!(e instanceof CancellationException)) {
                        dVar2.f158466d = vq.j.a(obj);
                        dVar2.f158467e = e;
                        dVar2.f158470h = 4;
                        if (J(dVar2) != objE2) {
                            exc = e;
                            e = exc;
                        }
                    }
                    px.f.e(px.f.f163100a, "Catch exception: " + e, null, px.c.a(this), 2, null);
                    return androidx.work.c.a.a();
                }
            } else if (obj == 2) {
                p0Var3 = (fr.p0) dVar2.f158466d;
                u.b(objE);
                iVar = (dx.i) objE;
                z15 = this.retryWorker;
                if (z15) {
                    if (z15) {
                        throw new oq.p();
                    }
                    return iVar instanceof dx.i.Right ? androidx.work.c.a.b() : androidx.work.c.a.a();
                }
                dVar2.f158466d = vq.j.a(p0Var3);
                dVar2.f158467e = vq.j.a(iVar);
                dVar2.f158470h = 3;
                objE = k(dVar2);
                if (objE == objE2) {
                    return objE2;
                }
            } else {
                if (obj != 3) {
                    if (obj != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    exc = (Exception) dVar2.f158467e;
                    u.b(objE);
                    e = exc;
                    px.f.e(px.f.f163100a, "Catch exception: " + e, null, px.c.a(this), 2, null);
                    return androidx.work.c.a.a();
                }
                u.b(objE);
            }
            return (androidx.work.c.a) objE;
            dx.i iVar2 = (dx.i) objE;
            if (iVar2 instanceof dx.i.Left) {
                return androidx.work.c.a.a();
            }
            if (!(iVar2 instanceof dx.i.Right)) {
                throw new oq.p();
            }
            p0Var.f66410a = ((dx.i.Right) iVar2).b();
            T t15 = p0Var2.f66410a;
            this.mainDocumentDownload = (t15 == 0 ? null : (DownloadTaskData) t15).getMainDocumentAuthToken() != null;
            if (this.masterKeyProvider.c().b(a0.INSTANCE.a())) {
                return androidx.work.c.a.a();
            }
            T t16 = p0Var2.f66410a;
            if ((t16 == 0 ? null : (DownloadTaskData) t16).getTaskCompleted()) {
                return androidx.work.c.a.a();
            }
            if (!this.mainDocumentDownload && this.networkSessionManager.L() == null) {
                return androidx.work.c.a.a();
            }
            T t17 = p0Var2.f66410a;
            if ((t17 == 0 ? null : (DownloadTaskData) t17).b().isEmpty()) {
                return androidx.work.c.a.a();
            }
            l0 l0VarB = g1.b();
            e eVar2 = new e(p0Var2, null);
            dVar2.f158466d = vq.j.a(p0Var2);
            dVar2.f158467e = null;
            dVar2.f158470h = 2;
            objE = ju.i.g(l0VarB, eVar2, dVar2);
            if (objE != objE2) {
                p0Var3 = p0Var2;
                iVar = (dx.i) objE;
                z15 = this.retryWorker;
                if (z15) {
                    if (z15) {
                        if (iVar instanceof dx.i.Right) {
                        }
                    }
                    throw new oq.p();
                }
                dVar2.f158466d = vq.j.a(p0Var3);
                dVar2.f158467e = vq.j.a(iVar);
                dVar2.f158470h = 3;
                objE = k(dVar2);
                if (objE == objE2) {
                }
                return (androidx.work.c.a) objE;
            }
            return objE2;
        } catch (Exception e16) {
            e = e16;
        }
    }
}
