package pl.gov.coi.mobywatel.technical.async.worker;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import er0.BEDocumentToDownload;
import fr.t;
import fr0.BEAsyncDocumentGenerationResult;
import fr0.BEAsyncErrorResponse;
import fr0.DocumentConfig;
import hr0.MultiDocumentSchema;
import ip.a;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import ju.g1;
import ju.p0;
import ju.q0;
import lz3.DocumentDownloadSingleStatus;
import lz3.DocumentDownloadStatus;
import lz3.DownloadTaskData;
import lz3.TaskIncludedDocumentData;
import mz3.a0;
import mz3.q;
import mz3.u;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tz3.b1;
import tz3.f0;
import tz3.h0;
import tz3.k0;
import tz3.n;
import tz3.n0;
import tz3.p;
import tz3.u0;
import tz3.v;
import tz3.w0;
import v64.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0084\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b3\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\t\b\u0007\u0018\u0000 Q2\u00020\u0001:\u0002\u009d\u0001BÕ\u0001\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J%\u0010;\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020:0807*\u000206H\u0002¢\u0006\u0004\b;\u0010<J\u0018\u0010?\u001a\u00020:2\u0006\u0010>\u001a\u00020=H\u0082@¢\u0006\u0004\b?\u0010@J\u0018\u0010A\u001a\u00020:2\u0006\u0010>\u001a\u00020=H\u0082@¢\u0006\u0004\bA\u0010@J\u0018\u0010B\u001a\u00020:2\u0006\u0010>\u001a\u00020=H\u0082@¢\u0006\u0004\bB\u0010@J\u0018\u0010C\u001a\u00020:2\u0006\u0010>\u001a\u00020=H\u0082@¢\u0006\u0004\bC\u0010@J\u0018\u0010E\u001a\u00020:2\u0006\u0010D\u001a\u000206H\u0082@¢\u0006\u0004\bE\u0010FJ\u0019\u0010G\u001a\b\u0012\u0004\u0012\u00020:07*\u000206H\u0002¢\u0006\u0004\bG\u0010<J\u001f\u0010M\u001a\u00020L2\u0006\u0010I\u001a\u00020H2\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bM\u0010NJ\u0019\u0010Q\u001a\u0004\u0018\u00010P2\u0006\u0010O\u001a\u00020JH\u0002¢\u0006\u0004\bQ\u0010RJ\u0017\u0010S\u001a\u00020:2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\bS\u0010TJ\u0010\u0010V\u001a\u00020UH\u0096@¢\u0006\u0004\bV\u0010WR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010`R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010jR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010vR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010zR\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0015\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0016\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0016\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0016\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0016\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001a\u0010\u008c\u0001\u001a\u00030\u0089\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R \u0010\u0090\u0001\u001a\t\u0012\u0004\u0012\u00020P0\u008d\u00018\u0002@\u0002X\u0082.¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R\u001e\u0010\u0094\u0001\u001a\t\u0012\u0004\u0012\u00020J0\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001e\u0010\u0097\u0001\u001a\t\u0012\u0004\u0012\u00020H0\u0095\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u008f\u0001R\u0016\u0010\u0099\u0001\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bS\u0010\u0098\u0001R\u0018\u0010\u009b\u0001\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b?\u0010\u009a\u0001R\u0018\u0010\u009c\u0001\u001a\u00020L8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b;\u0010\u009a\u0001¨\u0006\u009e\u0001"}, d2 = {"Lpl/gov/coi/mobywatel/technical/async/worker/AsyncDownloadDocumentsWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "Ltz3/b1;", "toDownloadDocumentEventUC", "Ltz3/k0;", "monitorDocumentsAsyncEventsUseCase", "Ltz3/h0;", "interruptDocumentsAsyncUseCase", "Lmz3/a0;", "updateDocumentDownloadStatusUseCase", "Ltz3/n;", "downloadDocumentsAsyncUseCase", "Lmz3/u;", "removeAsyncDownloadTaskUC", "Ltz3/p;", "finishMultiDocumentDownloadUC", "Lmz3/q;", "getDocumentDownloadStatusUseCase", "Ltz3/u0;", "saveDocumentAsyncDownloadErrorUC", "Lwy/b;", "networkSessionManager", "Lpx/d;", "remoteLogger", "Ltz3/f;", "changeDocumentsDownloadStatusFailureUseCase", "Ltz3/v;", "getAsyncDownloadTaskDataUC", "Lez/b;", "dateCalculator", "Lez/a;", "currentTimeProvider", "Lmz3/v;", "removeDocumentDownloadStatusUseCase", "Ltz3/n0;", "onTaskDownloadedUC", "Luh0/a;", "asyncMainDocumentTaskCompletedUC", "Ltz3/f0;", "hasAnyAsyncDownloadErrorUC", "Ltz3/w0;", "setAsyncDownloadTaskDataCompletedUC", "Lv64/o;", "isUserLoggedInUseCase", "Lc54/b;", "isFeatureEnabledUseCase", "Lqz3/b;", "asyncDownloadInteractor", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;Ltz3/b1;Ltz3/k0;Ltz3/h0;Lmz3/a0;Ltz3/n;Lmz3/u;Ltz3/p;Lmz3/q;Ltz3/u0;Lwy/b;Lpx/d;Ltz3/f;Ltz3/v;Lez/b;Lez/a;Lmz3/v;Ltz3/n0;Luh0/a;Ltz3/f0;Ltz3/w0;Lv64/o;Lc54/b;Lqz3/b;)V", "Lju/p0;", "Lju/w0;", "Ldx/i;", "Ldx/b;", "Loq/i0;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Lju/p0;)Lju/w0;", "Lfr0/d;", "result", "K", "(Lfr0/d;Ltq/e;)Ljava/lang/Object;", a.f96137b, "O", "Q", "scope", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "(Lju/p0;Ltq/e;)Ljava/lang/Object;", "R", "", "documentId", "Lrq0/b;", "documentType", "", "N", "(Ljava/lang/String;Lrq0/b;)Z", "type", "Lfr0/g;", "M", "(Lrq0/b;)Lfr0/g;", "J", "(Lfr0/d;)V", "Landroidx/work/c$a;", "k", "(Ltq/e;)Ljava/lang/Object;", "g", "Landroid/content/Context;", "h", "Landroidx/work/WorkerParameters;", "i", "Ltz3/b1;", "j", "Ltz3/k0;", "Ltz3/h0;", "l", "Lmz3/a0;", "m", "Ltz3/n;", "n", "Lmz3/u;", "o", "Ltz3/p;", "p", "Lmz3/q;", "q", "Ltz3/u0;", "r", "Lwy/b;", "s", "Lpx/d;", "t", "Ltz3/f;", "u", "Ltz3/v;", "v", "Lez/b;", "w", "Lez/a;", "x", "Lmz3/v;", "y", "Ltz3/n0;", "z", "Luh0/a;", "A", "Ltz3/f0;", "B", "Ltz3/w0;", "C", "Lv64/o;", a.f96138c, "Lc54/b;", "E", "Lqz3/b;", "Llz3/i;", "F", "Llz3/i;", "taskData", "", "G", "Ljava/util/List;", "documentsConfig", "", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "Ljava/util/Set;", "startedDocuments", "", "I", "workerEventsLog", "Ljava/lang/String;", "taskId", "Z", "retryWorker", "mainDocumentDownload", "a", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AsyncDownloadDocumentsWorker extends CoroutineWorker {
    private static final long N;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final f0 hasAnyAsyncDownloadErrorUC;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final w0 setAsyncDownloadTaskDataCompletedUC;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final o isUserLoggedInUseCase;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final c54.b isFeatureEnabledUseCase;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final qz3.b asyncDownloadInteractor;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private DownloadTaskData taskData;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private List<DocumentConfig> documentsConfig;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final Set<rq0.b> startedDocuments;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final List<String> workerEventsLog;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final String taskId;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private boolean retryWorker;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private boolean mainDocumentDownload;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final WorkerParameters params;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final b1 toDownloadDocumentEventUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k0 monitorDocumentsAsyncEventsUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final h0 interruptDocumentsAsyncUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final a0 updateDocumentDownloadStatusUseCase;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final n downloadDocumentsAsyncUseCase;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final u removeAsyncDownloadTaskUC;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final p finishMultiDocumentDownloadUC;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final q getDocumentDownloadStatusUseCase;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final u0 saveDocumentAsyncDownloadErrorUC;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final wy.b networkSessionManager;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final tz3.f changeDocumentsDownloadStatusFailureUseCase;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final v getAsyncDownloadTaskDataUC;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final ez.b dateCalculator;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final mz3.v removeDocumentDownloadStatusUseCase;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final n0 onTaskDownloadedUC;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final uh0.a asyncMainDocumentTaskCompletedUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f158945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f158946b;

        static {
            int[] iArr = new int[fr0.i.values().length];
            try {
                iArr[fr0.i.BY_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f158945a = iArr;
            int[] iArr2 = new int[lz3.d.values().length];
            try {
                iArr2[lz3.d.DOCUMENT_UPDATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[lz3.d.DOCUMENT_REDOWNLOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[lz3.d.FIRST_DOWNLOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            f158946b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f158947d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f158948e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f158949f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f158951h;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f158949f = obj;
            this.f158951h |= PKIFailureInfo.systemUnavail;
            return AsyncDownloadDocumentsWorker.this.K(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f158952d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f158953e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f158955g;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f158953e = obj;
            this.f158955g |= PKIFailureInfo.systemUnavail;
            return AsyncDownloadDocumentsWorker.this.k(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<p0, tq.e<? super dx.i<? extends dx.b, ? extends Object>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f158956e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f158957f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f158958g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f158959h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private /* synthetic */ Object f158960j;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Lfr0/a;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.p<p0, tq.e<? super dx.i<? extends dx.b, ? extends fr0.a>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f158962e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f158963f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f158964g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f158965h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f158966j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f158967k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f158968l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            Object f158969m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f158970n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f158971p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            int f158972q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            int f158973r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f158974s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f158975t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ AsyncDownloadDocumentsWorker f158976v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            final /* synthetic */ ju.w0<i0> f158977w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            final /* synthetic */ ju.w0<dx.i<dx.b, i0>> f158978x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(AsyncDownloadDocumentsWorker asyncDownloadDocumentsWorker, ju.w0<i0> w0Var, ju.w0<? extends dx.i<? extends dx.b, i0>> w0Var2, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f158976v = asyncDownloadDocumentsWorker;
                this.f158977w = w0Var;
                this.f158978x = w0Var2;
            }

            /* JADX WARN: Code duplicated, block: B:36:0x0102  */
            /* JADX WARN: Code duplicated, block: B:40:0x0163  */
            /* JADX WARN: Code duplicated, block: B:43:0x0195  */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x0098, code lost:
            
                if (r2 == r1) goto L42;
             */
            /* JADX WARN: Code restructure failed: missing block: B:37:0x015b, code lost:
            
                if (r3.c(r7, r18) == r1) goto L42;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x015b -> B:39:0x015e). Please report as a decompilation issue!!! */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r19) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 411
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: pl.gov.coi.mobywatel.technical.async.worker.AsyncDownloadDocumentsWorker.e.a.J(java.lang.Object):java.lang.Object");
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super dx.i<? extends dx.b, ? extends fr0.a>> eVar) {
                return ((a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new a(this.f158976v, this.f158977w, this.f158978x, eVar);
            }
        }

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            p0 p0Var = (p0) this.f158960j;
            Object objE = uq.b.e();
            int i15 = this.f158959h;
            try {
                if (i15 == 0) {
                    oq.u.b(obj);
                    ju.w0 w0VarR = AsyncDownloadDocumentsWorker.this.R(p0Var);
                    ju.w0 w0VarL = AsyncDownloadDocumentsWorker.this.L(p0Var);
                    ju.w0 w0VarB = ju.k.b(p0Var, null, null, new a(AsyncDownloadDocumentsWorker.this, w0VarR, w0VarL, null), 3, null);
                    this.f158960j = vq.j.a(p0Var);
                    this.f158956e = vq.j.a(w0VarR);
                    this.f158957f = vq.j.a(w0VarL);
                    this.f158958g = vq.j.a(w0VarB);
                    this.f158959h = 1;
                    obj = ju.f.b(new ju.w0[]{w0VarB, w0VarL}, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                return (dx.i) pq.v.l0((List) obj);
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
            e eVar2 = AsyncDownloadDocumentsWorker.this.new e(eVar);
            eVar2.f158960j = obj;
            return eVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<p0, tq.e<? super dx.i<? extends dx.b, ? extends i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f158979e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f158980f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final /* synthetic */ class a extends fr.a implements er.p<Map<String, ? extends BEAsyncDocumentGenerationResult>, tq.e<? super mu.g<? extends Map<String, ? extends BEAsyncDocumentGenerationResult>>>, Object> {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final a f158982h = new a();

            a() {
                super(2, mu.i.class, "flowOf", "flowOf(Ljava/lang/Object;)Lkotlinx/coroutines/flow/Flow;", 5);
            }

            @Override // er.p
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object B(Map<String, BEAsyncDocumentGenerationResult> map, tq.e<? super mu.g<? extends Map<String, BEAsyncDocumentGenerationResult>>> eVar) {
                return f.O(map, eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AsyncDownloadDocumentsWorker f158983a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p0 f158984b;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final /* synthetic */ class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f158985a;

                static {
                    int[] iArr = new int[BEAsyncDocumentGenerationResult.a.values().length];
                    try {
                        iArr[BEAsyncDocumentGenerationResult.a.TO_DOWNLOAD.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[BEAsyncDocumentGenerationResult.a.UNKNOWN.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[BEAsyncDocumentGenerationResult.a.CREATING_ERROR.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[BEAsyncDocumentGenerationResult.a.MULTI_DOCUMENT_GENERATION_FINISHED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[BEAsyncDocumentGenerationResult.a.ALL_DOWNLOADED.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[BEAsyncDocumentGenerationResult.a.ALREADY_DOWNLOADED.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[BEAsyncDocumentGenerationResult.a.RETRY_GLOBAL_ERROR.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[BEAsyncDocumentGenerationResult.a.TERMINAL_GLOBAL_ERROR.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    f158985a = iArr;
                }
            }

            /* JADX INFO: renamed from: pl.gov.coi.mobywatel.technical.async.worker.AsyncDownloadDocumentsWorker$f$b$b, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            static final class C3942b extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                Object f158986d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                Object f158987e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f158988f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                int f158989g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                /* synthetic */ Object f158990h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                final /* synthetic */ b<T> f158991j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                int f158992k;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C3942b(b<? super T> bVar, tq.e<? super C3942b> eVar) {
                    super(eVar);
                    this.f158991j = bVar;
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f158990h = obj;
                    this.f158992k |= PKIFailureInfo.systemUnavail;
                    return this.f158991j.F(null, this);
                }
            }

            b(AsyncDownloadDocumentsWorker asyncDownloadDocumentsWorker, p0 p0Var) {
                this.f158983a = asyncDownloadDocumentsWorker;
                this.f158984b = p0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x00db, code lost:
            
                if (r7.P(r8, r2) == r3) goto L49;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x016d, code lost:
            
                if (r7.K(r1, r2) == r3) goto L49;
             */
            /* JADX WARN: Code restructure failed: missing block: B:39:0x0185, code lost:
            
                if (r7.P(r8, r2) == r3) goto L49;
             */
            /* JADX WARN: Code restructure failed: missing block: B:42:0x019d, code lost:
            
                if (r7.O(r1, r2) == r3) goto L49;
             */
            /* JADX WARN: Code restructure failed: missing block: B:45:0x01b5, code lost:
            
                if (r7.Q(r1, r2) == r3) goto L49;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x01cc, code lost:
            
                if (r7.S(r1, r2) == r3) goto L49;
             */
            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object F(java.util.Map<java.lang.String, fr0.BEAsyncDocumentGenerationResult> r23, tq.e<? super oq.i0> r24) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 506
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: pl.gov.coi.mobywatel.technical.async.worker.AsyncDownloadDocumentsWorker.f.b.F(java.util.Map, tq.e):java.lang.Object");
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
            p0 p0Var = (p0) this.f158980f;
            Object objE = uq.b.e();
            int i15 = this.f158979e;
            if (i15 == 0) {
                oq.u.b(obj);
                mu.g gVarC = mu.v.c((mu.g) AsyncDownloadDocumentsWorker.this.monitorDocumentsAsyncEventsUseCase.a(gz.b.a.C1792a.f78542a), 0, a.f158982h, 1, null);
                b bVar = new b(AsyncDownloadDocumentsWorker.this, p0Var);
                this.f158980f = vq.j.a(p0Var);
                this.f158979e = 1;
                if (gVarC.a(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
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
            f fVar = AsyncDownloadDocumentsWorker.this.new f(eVar);
            fVar.f158980f = obj;
            return fVar;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f158993d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f158994e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f158995f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f158996g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f158998j;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f158996g = obj;
            this.f158998j |= PKIFailureInfo.systemUnavail;
            return AsyncDownloadDocumentsWorker.this.O(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class h extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f158999d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f159000e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f159001f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f159002g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f159003h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f159004j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f159005k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f159006l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f159007m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        boolean f159008n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f159009p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f159011r;

        h(tq.e<? super h> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f159009p = obj;
            this.f159011r |= PKIFailureInfo.systemUnavail;
            return AsyncDownloadDocumentsWorker.this.P(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class i extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f159012d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f159013e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f159014f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f159015g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f159016h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f159017j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f159019l;

        i(tq.e<? super i> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f159017j = obj;
            this.f159019l |= PKIFailureInfo.systemUnavail;
            return AsyncDownloadDocumentsWorker.this.Q(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f159020e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f159021f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f159022g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f159023h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f159024j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f159025k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f159026l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f159027m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f159028n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f159029p;

        j(tq.e<? super j> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x0097  */
        /* JADX WARN: Code duplicated, block: B:21:0x00b3  */
        /* JADX WARN: Code duplicated, block: B:27:0x00f9  */
        /* JADX WARN: Code duplicated, block: B:30:0x0104  */
        /* JADX WARN: Code duplicated, block: B:40:0x0130  */
        /* JADX WARN: Code duplicated, block: B:42:0x0133  */
        /* JADX WARN: Code duplicated, block: B:43:0x0138  */
        /* JADX WARN: Code duplicated, block: B:46:0x013d  */
        /* JADX WARN: Code duplicated, block: B:50:0x0187  */
        /* JADX WARN: Code duplicated, block: B:51:0x0189  */
        /* JADX WARN: Code duplicated, block: B:59:0x00ca A[SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x01ad -> B:56:0x01b0). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:27:0x00f9
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 438
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: pl.gov.coi.mobywatel.technical.async.worker.AsyncDownloadDocumentsWorker.j.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((j) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return AsyncDownloadDocumentsWorker.this.new j(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class k extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f159031d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f159032e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f159033f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f159034g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f159035h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f159036j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f159037k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f159038l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f159039m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f159040n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        Object f159041p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f159042q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f159043r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f159044s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f159045t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f159046v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f159047w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f159049y;

        k(tq.e<? super k> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f159047w = obj;
            this.f159049y |= PKIFailureInfo.systemUnavail;
            return AsyncDownloadDocumentsWorker.this.S(null, this);
        }
    }

    static {
        gu.b.Companion companion = gu.b.INSTANCE;
        N = gu.d.q(10, gu.e.SECONDS);
    }

    public AsyncDownloadDocumentsWorker(Context context, WorkerParameters workerParameters, b1 b1Var, k0 k0Var, h0 h0Var, a0 a0Var, n nVar, u uVar, p pVar, q qVar, u0 u0Var, wy.b bVar, px.d dVar, tz3.f fVar, v vVar, ez.b bVar2, ez.a aVar, mz3.v vVar2, n0 n0Var, uh0.a aVar2, f0 f0Var, w0 w0Var, o oVar, c54.b bVar3, qz3.b bVar4) {
        super(context, workerParameters);
        this.context = context;
        this.params = workerParameters;
        this.toDownloadDocumentEventUC = b1Var;
        this.monitorDocumentsAsyncEventsUseCase = k0Var;
        this.interruptDocumentsAsyncUseCase = h0Var;
        this.updateDocumentDownloadStatusUseCase = a0Var;
        this.downloadDocumentsAsyncUseCase = nVar;
        this.removeAsyncDownloadTaskUC = uVar;
        this.finishMultiDocumentDownloadUC = pVar;
        this.getDocumentDownloadStatusUseCase = qVar;
        this.saveDocumentAsyncDownloadErrorUC = u0Var;
        this.networkSessionManager = bVar;
        this.remoteLogger = dVar;
        this.changeDocumentsDownloadStatusFailureUseCase = fVar;
        this.getAsyncDownloadTaskDataUC = vVar;
        this.dateCalculator = bVar2;
        this.currentTimeProvider = aVar;
        this.removeDocumentDownloadStatusUseCase = vVar2;
        this.onTaskDownloadedUC = n0Var;
        this.asyncMainDocumentTaskCompletedUC = aVar2;
        this.hasAnyAsyncDownloadErrorUC = f0Var;
        this.setAsyncDownloadTaskDataCompletedUC = w0Var;
        this.isUserLoggedInUseCase = oVar;
        this.isFeatureEnabledUseCase = bVar3;
        this.asyncDownloadInteractor = bVar4;
        this.startedDocuments = new LinkedHashSet();
        this.workerEventsLog = new ArrayList();
        this.taskId = workerParameters.c().toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(BEAsyncDocumentGenerationResult result) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.currentTimeProvider.i());
        sb5.append(" | taskId: ");
        sb5.append(this.taskId);
        sb5.append(", status:");
        sb5.append(result.getStatus());
        sb5.append(", type:");
        BEDocumentToDownload documentToDownload = result.getDocumentToDownload();
        sb5.append(documentToDownload != null ? documentToDownload.getDocumentType() : null);
        sb5.append(", subtyp:");
        BEDocumentToDownload documentToDownload2 = result.getDocumentToDownload();
        sb5.append(documentToDownload2 != null ? documentToDownload2.getSubtype() : null);
        sb5.append(", iid:");
        BEDocumentToDownload documentToDownload3 = result.getDocumentToDownload();
        sb5.append(documentToDownload3 != null ? documentToDownload3.getDocumentId() : null);
        sb5.append(", traceId:");
        BEAsyncErrorResponse downloadingErrorMessage = result.getDownloadingErrorMessage();
        sb5.append(downloadingErrorMessage != null ? downloadingErrorMessage.getTraceId() : null);
        sb5.append('\n');
        String string = sb5.toString();
        this.remoteLogger.F8(string, px.d.a.GENERAL);
        this.workerEventsLog.add(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        if (S(r9, r0) == r1) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K(fr0.BEAsyncDocumentGenerationResult r9, tq.e<? super oq.i0> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof pl.gov.coi.mobywatel.technical.async.worker.AsyncDownloadDocumentsWorker.c
            if (r0 == 0) goto L13
            r0 = r10
            pl.gov.coi.mobywatel.technical.async.worker.AsyncDownloadDocumentsWorker$c r0 = (pl.gov.coi.mobywatel.technical.async.worker.AsyncDownloadDocumentsWorker.c) r0
            int r1 = r0.f158951h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f158951h = r1
            goto L18
        L13:
            pl.gov.coi.mobywatel.technical.async.worker.AsyncDownloadDocumentsWorker$c r0 = new pl.gov.coi.mobywatel.technical.async.worker.AsyncDownloadDocumentsWorker$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f158949f
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f158951h
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4d
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r9 = r0.f158948e
            er0.d r9 = (er0.BEDocumentToDownload) r9
            java.lang.Object r9 = r0.f158947d
            fr0.d r9 = (fr0.BEAsyncDocumentGenerationResult) r9
            oq.u.b(r10)
            goto Lad
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            java.lang.Object r9 = r0.f158948e
            er0.d r9 = (er0.BEDocumentToDownload) r9
            java.lang.Object r2 = r0.f158947d
            fr0.d r2 = (fr0.BEAsyncDocumentGenerationResult) r2
            oq.u.b(r10)
            r7 = r10
            r10 = r9
            r9 = r2
            r2 = r7
            goto L70
        L4d:
            oq.u.b(r10)
            er0.d r10 = r9.getDocumentToDownload()
            if (r10 != 0) goto L59
            oq.i0 r9 = oq.i0.f148189a
            return r9
        L59:
            qz3.b r2 = r8.asyncDownloadInteractor
            java.lang.String r5 = r10.getDocumentId()
            r0.f158947d = r9
            java.lang.Object r6 = vq.j.a(r10)
            r0.f158948e = r6
            r0.f158951h = r4
            java.lang.Object r2 = r2.m(r5, r0)
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
            r0.f158947d = r2
            java.lang.Object r10 = vq.j.a(r10)
            r0.f158948e = r10
            r0.f158951h = r3
            java.lang.Object r9 = r8.S(r9, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: pl.gov.coi.mobywatel.technical.async.worker.AsyncDownloadDocumentsWorker.K(fr0.d, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ju.w0<dx.i<dx.b, i0>> L(p0 p0Var) {
        return ju.k.b(p0Var, g1.d(), null, new f(null), 2, null);
    }

    private final DocumentConfig M(rq0.b type) {
        List<DocumentConfig> list = this.documentsConfig;
        Object obj = null;
        if (list == null) {
            list = null;
        }
        for (Object obj2 : list) {
            if (t.c(((DocumentConfig) obj2).getType(), type)) {
                obj = obj2;
                break;
            }
        }
        return (DocumentConfig) obj;
    }

    private final boolean N(String documentId, rq0.b documentType) {
        DownloadTaskData downloadTaskData = this.taskData;
        if (downloadTaskData == null) {
            downloadTaskData = null;
        }
        TaskIncludedDocumentData taskIncludedDocumentData = downloadTaskData.d().get(documentType);
        return t.c(documentId, taskIncludedDocumentData != null ? taskIncludedDocumentData.getMainDocumentId() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object O(BEAsyncDocumentGenerationResult bEAsyncDocumentGenerationResult, tq.e<? super i0> eVar) throws Throwable {
        g gVar;
        rq0.b documentType;
        rq0.b bVar;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f158998j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f158998j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object obj = gVar.f158996g;
        Object objE = uq.b.e();
        int i16 = gVar.f158998j;
        if (i16 == 0) {
            oq.u.b(obj);
            BEDocumentToDownload documentToDownload = bEAsyncDocumentGenerationResult.getDocumentToDownload();
            if (documentToDownload != null && (documentType = documentToDownload.getDocumentType()) != null) {
                p pVar = this.finishMultiDocumentDownloadUC;
                MultiDocumentSchema multiDocumentSchema = bEAsyncDocumentGenerationResult.getMultiDocumentSchema();
                DownloadTaskData downloadTaskData = this.taskData;
                if (downloadTaskData == null) {
                    downloadTaskData = null;
                }
                p.Params params = new p.Params(documentType, multiDocumentSchema, downloadTaskData.getDocumentDownloadMethod(), documentToDownload.getDocumentId());
                gVar.f158993d = vq.j.a(bEAsyncDocumentGenerationResult);
                gVar.f158994e = vq.j.a(documentToDownload);
                gVar.f158995f = documentType;
                gVar.f158998j = 1;
                if (pVar.c(params, gVar) == objE) {
                    return objE;
                }
                bVar = documentType;
            }
            return i0.f148189a;
        }
        if (i16 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bVar = (rq0.b) gVar.f158995f;
        oq.u.b(obj);
        this.startedDocuments.remove(bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:101:0x032f  */
    /* JADX WARN: Code duplicated, block: B:29:0x0117  */
    /* JADX WARN: Code duplicated, block: B:31:0x011b  */
    /* JADX WARN: Code duplicated, block: B:35:0x0150  */
    /* JADX WARN: Code duplicated, block: B:38:0x0159  */
    /* JADX WARN: Code duplicated, block: B:43:0x016c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0196  */
    /* JADX WARN: Code duplicated, block: B:50:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:51:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:53:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:56:0x01c4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:59:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:63:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:66:0x0206  */
    /* JADX WARN: Code duplicated, block: B:68:0x0217  */
    /* JADX WARN: Code duplicated, block: B:72:0x025d  */
    /* JADX WARN: Code duplicated, block: B:73:0x0260  */
    /* JADX WARN: Code duplicated, block: B:74:0x0263  */
    /* JADX WARN: Code duplicated, block: B:76:0x0269  */
    /* JADX WARN: Code duplicated, block: B:79:0x0287  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:84:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:87:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:90:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:93:0x02f6 A[PHI: r4 r6 r8
      0x02f6: PHI (r4v19 int) = (r4v17 int), (r4v17 int), (r4v20 int) binds: [B:91:0x02f3, B:88:0x02d5, B:14:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x02f6: PHI (r6v23 ju.p0) = (r6v20 ju.p0), (r6v20 ju.p0), (r6v25 ju.p0) binds: [B:91:0x02f3, B:88:0x02d5, B:14:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x02f6: PHI (r8v31 ju.p0) = (r8v28 ju.p0), (r8v28 ju.p0), (r8v33 ju.p0) binds: [B:91:0x02f3, B:88:0x02d5, B:14:0x004f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:98:0x0311 A[PHI: r4 r6 r8
      0x0311: PHI (r4v21 int) = (r4v19 int), (r4v19 int), (r4v23 int) binds: [B:94:0x02f8, B:96:0x030e, B:13:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x0311: PHI (r6v26 ju.p0) = (r6v23 ju.p0), (r6v23 ju.p0), (r6v28 ju.p0) binds: [B:94:0x02f8, B:96:0x030e, B:13:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x0311: PHI (r8v34 ju.p0) = (r8v31 ju.p0), (r8v31 ju.p0), (r8v37 ju.p0) binds: [B:94:0x02f8, B:96:0x030e, B:13:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    public final Object P(p0 p0Var, tq.e<? super i0> eVar) throws Throwable {
        h hVar;
        p0 p0Var2;
        int i15;
        p0 p0Var3;
        n0 n0Var;
        n0.Params params;
        p0 p0Var4;
        DownloadTaskData downloadTaskData;
        Map.Entry entry;
        Object objC;
        p0 p0Var5;
        p0 p0Var6;
        Map.Entry entry2;
        DocumentDownloadStatus documentDownloadStatus;
        lz3.h status;
        Object objM;
        lz3.h hVar2;
        Map.Entry entry3;
        p0 p0Var7;
        List<DocumentDownloadSingleStatus> listB;
        DocumentDownloadSingleStatus documentDownloadSingleStatus;
        dx.i iVar;
        Object objB;
        boolean zBooleanValue;
        DownloadTaskData downloadTaskData2;
        Object objC2;
        boolean z15;
        p0 p0Var8;
        p0 p0Var9;
        dx.i iVar2;
        a0 a0Var;
        a0.Params params2;
        DownloadTaskData downloadTaskData3;
        p0 p0Var10;
        p0 p0Var11;
        w0 w0Var;
        w0.Params params3;
        u uVar;
        u.Params params4;
        qz3.b bVar;
        h0 h0Var;
        h0.Params params5;
        p0 p0Var12;
        int i16;
        if (eVar instanceof h) {
            hVar = (h) eVar;
            int i17 = hVar.f159011r;
            if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                hVar.f159011r = i17 - PKIFailureInfo.systemUnavail;
            } else {
                hVar = new h(eVar);
            }
        } else {
            hVar = new h(eVar);
        }
        Object objC3 = hVar.f159009p;
        Object objE = uq.b.e();
        switch (hVar.f159011r) {
            case 0:
                oq.u.b(objC3);
                tz3.f fVar = this.changeDocumentsDownloadStatusFailureUseCase;
                tz3.f.Params params6 = new tz3.f.Params(this.taskId);
                hVar.f158999d = vq.j.a(p0Var);
                p0Var2 = p0Var;
                hVar.f159000e = p0Var2;
                hVar.f159005k = 0;
                hVar.f159011r = 1;
                if (fVar.c(params6, hVar) != objE) {
                    i15 = 0;
                    p0Var3 = p0Var2;
                    if (this.mainDocumentDownload) {
                        downloadTaskData = this.taskData;
                        if (downloadTaskData == null) {
                            downloadTaskData = null;
                        }
                        entry = (Map.Entry) pq.v.k0(downloadTaskData.d().entrySet());
                        q qVar = this.getDocumentDownloadStatusUseCase;
                        q.Params params7 = new q.Params((rq0.b) entry.getKey());
                        hVar.f158999d = vq.j.a(p0Var2);
                        hVar.f159000e = p0Var3;
                        hVar.f159001f = entry;
                        hVar.f159005k = i15;
                        hVar.f159011r = 2;
                        objC = qVar.c(params7, hVar);
                        if (objC != objE) {
                            p0Var5 = p0Var3;
                            objC3 = objC;
                            p0Var6 = p0Var2;
                            entry2 = entry;
                            documentDownloadStatus = (DocumentDownloadStatus) objC3;
                            if (documentDownloadStatus != null || (listB = documentDownloadStatus.b()) == null || (documentDownloadSingleStatus = (DocumentDownloadSingleStatus) pq.v.n0(listB)) == null) {
                                status = null;
                            } else {
                                status = documentDownloadSingleStatus.getStatus();
                            }
                            qz3.b bVar2 = this.asyncDownloadInteractor;
                            String mainDocumentId = ((TaskIncludedDocumentData) entry2.getValue()).getMainDocumentId();
                            hVar.f158999d = vq.j.a(p0Var6);
                            hVar.f159000e = p0Var5;
                            hVar.f159001f = status;
                            hVar.f159002g = vq.j.a(entry2);
                            hVar.f159005k = i15;
                            hVar.f159011r = 3;
                            objM = bVar2.m(mainDocumentId, hVar);
                            if (objM != objE) {
                                p0 p0Var13 = p0Var5;
                                hVar2 = status;
                                objC3 = objM;
                                entry3 = entry2;
                                p0Var7 = p0Var13;
                                iVar = (dx.i) objC3;
                                if (iVar instanceof dx.i.Left) {
                                    objB = vq.b.a(false);
                                } else {
                                    if (iVar instanceof dx.i.Right) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVar).b();
                                }
                                zBooleanValue = ((Boolean) objB).booleanValue();
                                if (hVar2 != lz3.h.ALREADY_DOWNLOADED || zBooleanValue) {
                                    uh0.a aVar = this.asyncMainDocumentTaskCompletedUC;
                                    downloadTaskData2 = this.taskData;
                                    if (downloadTaskData2 == null) {
                                        downloadTaskData2 = null;
                                    }
                                    uh0.a.Params params8 = new uh0.a.Params(downloadTaskData2.getMainDocumentAuthToken());
                                    hVar.f158999d = vq.j.a(p0Var6);
                                    hVar.f159000e = p0Var7;
                                    hVar.f159001f = vq.j.a(hVar2);
                                    hVar.f159002g = vq.j.a(entry3);
                                    hVar.f159005k = i15;
                                    hVar.f159008n = zBooleanValue;
                                    hVar.f159011r = 4;
                                    objC2 = aVar.c(params8, hVar);
                                    if (objC2 != objE) {
                                        p0 p0Var14 = p0Var7;
                                        z15 = zBooleanValue;
                                        objC3 = objC2;
                                        p0Var8 = p0Var6;
                                        p0Var9 = p0Var14;
                                        iVar2 = (dx.i) objC3;
                                        if (iVar2 instanceof dx.i.Left) {
                                            dx.b bVar3 = (dx.b) ((dx.i.Left) iVar2).b();
                                            a0Var = this.updateDocumentDownloadStatusUseCase;
                                            downloadTaskData3 = this.taskData;
                                            if (downloadTaskData3 == null) {
                                                downloadTaskData3 = null;
                                            }
                                            params2 = new a0.Params((rq0.b) pq.v.k0(downloadTaskData3.d().keySet()), lz3.h.CREATING_ERROR, null);
                                            hVar.f158999d = vq.j.a(p0Var8);
                                            hVar.f159000e = p0Var9;
                                            hVar.f159001f = vq.j.a(hVar2);
                                            hVar.f159002g = vq.j.a(entry3);
                                            hVar.f159003h = iVar2;
                                            hVar.f159004j = vq.j.a(bVar3);
                                            hVar.f159005k = i15;
                                            hVar.f159008n = z15;
                                            hVar.f159006l = 0;
                                            hVar.f159007m = 0;
                                            hVar.f159011r = 5;
                                            if (a0Var.c(params2, hVar) != objE) {
                                                p0Var4 = p0Var9;
                                                p0Var2 = p0Var8;
                                                p0Var6 = p0Var2;
                                                p0Var7 = p0Var4;
                                                f0 f0Var = this.hasAnyAsyncDownloadErrorUC;
                                                f0.Params params9 = new f0.Params(this.taskId);
                                                hVar.f158999d = vq.j.a(p0Var6);
                                                hVar.f159000e = p0Var7;
                                                hVar.f159001f = null;
                                                hVar.f159002g = null;
                                                hVar.f159003h = null;
                                                hVar.f159004j = null;
                                                hVar.f159005k = i15;
                                                hVar.f159011r = 7;
                                                objC3 = f0Var.c(params9, hVar);
                                                if (objC3 != objE) {
                                                    p0Var10 = p0Var7;
                                                    p0Var11 = p0Var6;
                                                    if (((Boolean) objC3).booleanValue()) {
                                                        w0Var = this.setAsyncDownloadTaskDataCompletedUC;
                                                        params3 = new w0.Params(this.taskId);
                                                        hVar.f158999d = vq.j.a(p0Var11);
                                                        hVar.f159000e = p0Var10;
                                                        hVar.f159005k = i15;
                                                        hVar.f159011r = 9;
                                                        if (w0Var.c(params3, hVar) != objE) {
                                                            if (this.mainDocumentDownload) {
                                                                h0Var = this.interruptDocumentsAsyncUseCase;
                                                                params5 = new h0.Params(this.taskId);
                                                                hVar.f158999d = vq.j.a(p0Var11);
                                                                hVar.f159000e = p0Var10;
                                                                hVar.f159005k = i15;
                                                                hVar.f159011r = 11;
                                                                if (h0Var.c(params5, hVar) != objE) {
                                                                    p0Var12 = p0Var10;
                                                                    i16 = 1;
                                                                    q0.d(p0Var12, null, i16, null);
                                                                    return i0.f148189a;
                                                                }
                                                            } else {
                                                                bVar = this.asyncDownloadInteractor;
                                                                hVar.f158999d = vq.j.a(p0Var11);
                                                                hVar.f159000e = p0Var10;
                                                                hVar.f159005k = i15;
                                                                hVar.f159011r = 10;
                                                                if (bVar.c(hVar) != objE) {
                                                                    h0Var = this.interruptDocumentsAsyncUseCase;
                                                                    params5 = new h0.Params(this.taskId);
                                                                    hVar.f158999d = vq.j.a(p0Var11);
                                                                    hVar.f159000e = p0Var10;
                                                                    hVar.f159005k = i15;
                                                                    hVar.f159011r = 11;
                                                                    if (h0Var.c(params5, hVar) != objE) {
                                                                        p0Var12 = p0Var10;
                                                                        i16 = 1;
                                                                        q0.d(p0Var12, null, i16, null);
                                                                        return i0.f148189a;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        uVar = this.removeAsyncDownloadTaskUC;
                                                        params4 = new u.Params(this.taskId);
                                                        hVar.f158999d = vq.j.a(p0Var11);
                                                        hVar.f159000e = p0Var10;
                                                        hVar.f159005k = i15;
                                                        hVar.f159011r = 8;
                                                        if (uVar.c(params4, hVar) != objE) {
                                                            if (this.mainDocumentDownload) {
                                                                bVar = this.asyncDownloadInteractor;
                                                                hVar.f158999d = vq.j.a(p0Var11);
                                                                hVar.f159000e = p0Var10;
                                                                hVar.f159005k = i15;
                                                                hVar.f159011r = 10;
                                                                if (bVar.c(hVar) != objE) {
                                                                    h0Var = this.interruptDocumentsAsyncUseCase;
                                                                    params5 = new h0.Params(this.taskId);
                                                                    hVar.f158999d = vq.j.a(p0Var11);
                                                                    hVar.f159000e = p0Var10;
                                                                    hVar.f159005k = i15;
                                                                    hVar.f159011r = 11;
                                                                    if (h0Var.c(params5, hVar) != objE) {
                                                                        p0Var12 = p0Var10;
                                                                        i16 = 1;
                                                                        q0.d(p0Var12, null, i16, null);
                                                                        return i0.f148189a;
                                                                    }
                                                                }
                                                            } else {
                                                                h0Var = this.interruptDocumentsAsyncUseCase;
                                                                params5 = new h0.Params(this.taskId);
                                                                hVar.f158999d = vq.j.a(p0Var11);
                                                                hVar.f159000e = p0Var10;
                                                                hVar.f159005k = i15;
                                                                hVar.f159011r = 11;
                                                                if (h0Var.c(params5, hVar) != objE) {
                                                                    p0Var12 = p0Var10;
                                                                    i16 = 1;
                                                                    q0.d(p0Var12, null, i16, null);
                                                                    return i0.f148189a;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            p0Var7 = p0Var9;
                                            p0Var6 = p0Var8;
                                            f0 f0Var2 = this.hasAnyAsyncDownloadErrorUC;
                                            f0.Params params10 = new f0.Params(this.taskId);
                                            hVar.f158999d = vq.j.a(p0Var6);
                                            hVar.f159000e = p0Var7;
                                            hVar.f159001f = null;
                                            hVar.f159002g = null;
                                            hVar.f159003h = null;
                                            hVar.f159004j = null;
                                            hVar.f159005k = i15;
                                            hVar.f159011r = 7;
                                            objC3 = f0Var2.c(params10, hVar);
                                            if (objC3 != objE) {
                                                p0Var10 = p0Var7;
                                                p0Var11 = p0Var6;
                                                if (((Boolean) objC3).booleanValue()) {
                                                    uVar = this.removeAsyncDownloadTaskUC;
                                                    params4 = new u.Params(this.taskId);
                                                    hVar.f158999d = vq.j.a(p0Var11);
                                                    hVar.f159000e = p0Var10;
                                                    hVar.f159005k = i15;
                                                    hVar.f159011r = 8;
                                                    if (uVar.c(params4, hVar) != objE) {
                                                        if (this.mainDocumentDownload) {
                                                            bVar = this.asyncDownloadInteractor;
                                                            hVar.f158999d = vq.j.a(p0Var11);
                                                            hVar.f159000e = p0Var10;
                                                            hVar.f159005k = i15;
                                                            hVar.f159011r = 10;
                                                            if (bVar.c(hVar) != objE) {
                                                                h0Var = this.interruptDocumentsAsyncUseCase;
                                                                params5 = new h0.Params(this.taskId);
                                                                hVar.f158999d = vq.j.a(p0Var11);
                                                                hVar.f159000e = p0Var10;
                                                                hVar.f159005k = i15;
                                                                hVar.f159011r = 11;
                                                                if (h0Var.c(params5, hVar) != objE) {
                                                                    p0Var12 = p0Var10;
                                                                    i16 = 1;
                                                                    q0.d(p0Var12, null, i16, null);
                                                                    return i0.f148189a;
                                                                }
                                                            }
                                                        } else {
                                                            h0Var = this.interruptDocumentsAsyncUseCase;
                                                            params5 = new h0.Params(this.taskId);
                                                            hVar.f158999d = vq.j.a(p0Var11);
                                                            hVar.f159000e = p0Var10;
                                                            hVar.f159005k = i15;
                                                            hVar.f159011r = 11;
                                                            if (h0Var.c(params5, hVar) != objE) {
                                                                p0Var12 = p0Var10;
                                                                i16 = 1;
                                                                q0.d(p0Var12, null, i16, null);
                                                                return i0.f148189a;
                                                            }
                                                        }
                                                    }
                                                } else {
                                                    w0Var = this.setAsyncDownloadTaskDataCompletedUC;
                                                    params3 = new w0.Params(this.taskId);
                                                    hVar.f158999d = vq.j.a(p0Var11);
                                                    hVar.f159000e = p0Var10;
                                                    hVar.f159005k = i15;
                                                    hVar.f159011r = 9;
                                                    if (w0Var.c(params3, hVar) != objE) {
                                                        if (this.mainDocumentDownload) {
                                                            bVar = this.asyncDownloadInteractor;
                                                            hVar.f158999d = vq.j.a(p0Var11);
                                                            hVar.f159000e = p0Var10;
                                                            hVar.f159005k = i15;
                                                            hVar.f159011r = 10;
                                                            if (bVar.c(hVar) != objE) {
                                                                h0Var = this.interruptDocumentsAsyncUseCase;
                                                                params5 = new h0.Params(this.taskId);
                                                                hVar.f158999d = vq.j.a(p0Var11);
                                                                hVar.f159000e = p0Var10;
                                                                hVar.f159005k = i15;
                                                                hVar.f159011r = 11;
                                                                if (h0Var.c(params5, hVar) != objE) {
                                                                    p0Var12 = p0Var10;
                                                                    i16 = 1;
                                                                    q0.d(p0Var12, null, i16, null);
                                                                    return i0.f148189a;
                                                                }
                                                            }
                                                        } else {
                                                            h0Var = this.interruptDocumentsAsyncUseCase;
                                                            params5 = new h0.Params(this.taskId);
                                                            hVar.f158999d = vq.j.a(p0Var11);
                                                            hVar.f159000e = p0Var10;
                                                            hVar.f159005k = i15;
                                                            hVar.f159011r = 11;
                                                            if (h0Var.c(params5, hVar) != objE) {
                                                                p0Var12 = p0Var10;
                                                                i16 = 1;
                                                                q0.d(p0Var12, null, i16, null);
                                                                return i0.f148189a;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    f0 f0Var3 = this.hasAnyAsyncDownloadErrorUC;
                                    f0.Params params11 = new f0.Params(this.taskId);
                                    hVar.f158999d = vq.j.a(p0Var6);
                                    hVar.f159000e = p0Var7;
                                    hVar.f159001f = null;
                                    hVar.f159002g = null;
                                    hVar.f159003h = null;
                                    hVar.f159004j = null;
                                    hVar.f159005k = i15;
                                    hVar.f159011r = 7;
                                    objC3 = f0Var3.c(params11, hVar);
                                    if (objC3 != objE) {
                                        p0Var10 = p0Var7;
                                        p0Var11 = p0Var6;
                                        if (((Boolean) objC3).booleanValue()) {
                                            uVar = this.removeAsyncDownloadTaskUC;
                                            params4 = new u.Params(this.taskId);
                                            hVar.f158999d = vq.j.a(p0Var11);
                                            hVar.f159000e = p0Var10;
                                            hVar.f159005k = i15;
                                            hVar.f159011r = 8;
                                            if (uVar.c(params4, hVar) != objE) {
                                                if (this.mainDocumentDownload) {
                                                    bVar = this.asyncDownloadInteractor;
                                                    hVar.f158999d = vq.j.a(p0Var11);
                                                    hVar.f159000e = p0Var10;
                                                    hVar.f159005k = i15;
                                                    hVar.f159011r = 10;
                                                    if (bVar.c(hVar) != objE) {
                                                        h0Var = this.interruptDocumentsAsyncUseCase;
                                                        params5 = new h0.Params(this.taskId);
                                                        hVar.f158999d = vq.j.a(p0Var11);
                                                        hVar.f159000e = p0Var10;
                                                        hVar.f159005k = i15;
                                                        hVar.f159011r = 11;
                                                        if (h0Var.c(params5, hVar) != objE) {
                                                            p0Var12 = p0Var10;
                                                            i16 = 1;
                                                            q0.d(p0Var12, null, i16, null);
                                                            return i0.f148189a;
                                                        }
                                                    }
                                                } else {
                                                    h0Var = this.interruptDocumentsAsyncUseCase;
                                                    params5 = new h0.Params(this.taskId);
                                                    hVar.f158999d = vq.j.a(p0Var11);
                                                    hVar.f159000e = p0Var10;
                                                    hVar.f159005k = i15;
                                                    hVar.f159011r = 11;
                                                    if (h0Var.c(params5, hVar) != objE) {
                                                        p0Var12 = p0Var10;
                                                        i16 = 1;
                                                        q0.d(p0Var12, null, i16, null);
                                                        return i0.f148189a;
                                                    }
                                                }
                                            }
                                        } else {
                                            w0Var = this.setAsyncDownloadTaskDataCompletedUC;
                                            params3 = new w0.Params(this.taskId);
                                            hVar.f158999d = vq.j.a(p0Var11);
                                            hVar.f159000e = p0Var10;
                                            hVar.f159005k = i15;
                                            hVar.f159011r = 9;
                                            if (w0Var.c(params3, hVar) != objE) {
                                                if (this.mainDocumentDownload) {
                                                    bVar = this.asyncDownloadInteractor;
                                                    hVar.f158999d = vq.j.a(p0Var11);
                                                    hVar.f159000e = p0Var10;
                                                    hVar.f159005k = i15;
                                                    hVar.f159011r = 10;
                                                    if (bVar.c(hVar) != objE) {
                                                        h0Var = this.interruptDocumentsAsyncUseCase;
                                                        params5 = new h0.Params(this.taskId);
                                                        hVar.f158999d = vq.j.a(p0Var11);
                                                        hVar.f159000e = p0Var10;
                                                        hVar.f159005k = i15;
                                                        hVar.f159011r = 11;
                                                        if (h0Var.c(params5, hVar) != objE) {
                                                            p0Var12 = p0Var10;
                                                            i16 = 1;
                                                            q0.d(p0Var12, null, i16, null);
                                                            return i0.f148189a;
                                                        }
                                                    }
                                                } else {
                                                    h0Var = this.interruptDocumentsAsyncUseCase;
                                                    params5 = new h0.Params(this.taskId);
                                                    hVar.f158999d = vq.j.a(p0Var11);
                                                    hVar.f159000e = p0Var10;
                                                    hVar.f159005k = i15;
                                                    hVar.f159011r = 11;
                                                    if (h0Var.c(params5, hVar) != objE) {
                                                        p0Var12 = p0Var10;
                                                        i16 = 1;
                                                        q0.d(p0Var12, null, i16, null);
                                                        return i0.f148189a;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        n0Var = this.onTaskDownloadedUC;
                        params = new n0.Params(this.taskId);
                        hVar.f158999d = vq.j.a(p0Var2);
                        hVar.f159000e = p0Var3;
                        hVar.f159005k = i15;
                        hVar.f159011r = 6;
                        if (n0Var.c(params, hVar) != objE) {
                            p0Var4 = p0Var3;
                            p0Var6 = p0Var2;
                            p0Var7 = p0Var4;
                            f0 f0Var4 = this.hasAnyAsyncDownloadErrorUC;
                            f0.Params params12 = new f0.Params(this.taskId);
                            hVar.f158999d = vq.j.a(p0Var6);
                            hVar.f159000e = p0Var7;
                            hVar.f159001f = null;
                            hVar.f159002g = null;
                            hVar.f159003h = null;
                            hVar.f159004j = null;
                            hVar.f159005k = i15;
                            hVar.f159011r = 7;
                            objC3 = f0Var4.c(params12, hVar);
                            if (objC3 != objE) {
                                p0Var10 = p0Var7;
                                p0Var11 = p0Var6;
                                if (((Boolean) objC3).booleanValue()) {
                                    uVar = this.removeAsyncDownloadTaskUC;
                                    params4 = new u.Params(this.taskId);
                                    hVar.f158999d = vq.j.a(p0Var11);
                                    hVar.f159000e = p0Var10;
                                    hVar.f159005k = i15;
                                    hVar.f159011r = 8;
                                    if (uVar.c(params4, hVar) != objE) {
                                        if (this.mainDocumentDownload) {
                                            bVar = this.asyncDownloadInteractor;
                                            hVar.f158999d = vq.j.a(p0Var11);
                                            hVar.f159000e = p0Var10;
                                            hVar.f159005k = i15;
                                            hVar.f159011r = 10;
                                            if (bVar.c(hVar) != objE) {
                                                h0Var = this.interruptDocumentsAsyncUseCase;
                                                params5 = new h0.Params(this.taskId);
                                                hVar.f158999d = vq.j.a(p0Var11);
                                                hVar.f159000e = p0Var10;
                                                hVar.f159005k = i15;
                                                hVar.f159011r = 11;
                                                if (h0Var.c(params5, hVar) != objE) {
                                                    p0Var12 = p0Var10;
                                                    i16 = 1;
                                                    q0.d(p0Var12, null, i16, null);
                                                    return i0.f148189a;
                                                }
                                            }
                                        } else {
                                            h0Var = this.interruptDocumentsAsyncUseCase;
                                            params5 = new h0.Params(this.taskId);
                                            hVar.f158999d = vq.j.a(p0Var11);
                                            hVar.f159000e = p0Var10;
                                            hVar.f159005k = i15;
                                            hVar.f159011r = 11;
                                            if (h0Var.c(params5, hVar) != objE) {
                                                p0Var12 = p0Var10;
                                                i16 = 1;
                                                q0.d(p0Var12, null, i16, null);
                                                return i0.f148189a;
                                            }
                                        }
                                    }
                                } else {
                                    w0Var = this.setAsyncDownloadTaskDataCompletedUC;
                                    params3 = new w0.Params(this.taskId);
                                    hVar.f158999d = vq.j.a(p0Var11);
                                    hVar.f159000e = p0Var10;
                                    hVar.f159005k = i15;
                                    hVar.f159011r = 9;
                                    if (w0Var.c(params3, hVar) != objE) {
                                        if (this.mainDocumentDownload) {
                                            bVar = this.asyncDownloadInteractor;
                                            hVar.f158999d = vq.j.a(p0Var11);
                                            hVar.f159000e = p0Var10;
                                            hVar.f159005k = i15;
                                            hVar.f159011r = 10;
                                            if (bVar.c(hVar) != objE) {
                                                h0Var = this.interruptDocumentsAsyncUseCase;
                                                params5 = new h0.Params(this.taskId);
                                                hVar.f158999d = vq.j.a(p0Var11);
                                                hVar.f159000e = p0Var10;
                                                hVar.f159005k = i15;
                                                hVar.f159011r = 11;
                                                if (h0Var.c(params5, hVar) != objE) {
                                                    p0Var12 = p0Var10;
                                                    i16 = 1;
                                                    q0.d(p0Var12, null, i16, null);
                                                    return i0.f148189a;
                                                }
                                            }
                                        } else {
                                            h0Var = this.interruptDocumentsAsyncUseCase;
                                            params5 = new h0.Params(this.taskId);
                                            hVar.f158999d = vq.j.a(p0Var11);
                                            hVar.f159000e = p0Var10;
                                            hVar.f159005k = i15;
                                            hVar.f159011r = 11;
                                            if (h0Var.c(params5, hVar) != objE) {
                                                p0Var12 = p0Var10;
                                                i16 = 1;
                                                q0.d(p0Var12, null, i16, null);
                                                return i0.f148189a;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return objE;
            case 1:
                i15 = hVar.f159005k;
                p0 p0Var15 = (p0) hVar.f159000e;
                p0 p0Var16 = (p0) hVar.f158999d;
                oq.u.b(objC3);
                p0Var3 = p0Var15;
                p0Var2 = p0Var16;
                if (this.mainDocumentDownload) {
                    downloadTaskData = this.taskData;
                    if (downloadTaskData == null) {
                        downloadTaskData = null;
                    }
                    entry = (Map.Entry) pq.v.k0(downloadTaskData.d().entrySet());
                    q qVar2 = this.getDocumentDownloadStatusUseCase;
                    q.Params params13 = new q.Params((rq0.b) entry.getKey());
                    hVar.f158999d = vq.j.a(p0Var2);
                    hVar.f159000e = p0Var3;
                    hVar.f159001f = entry;
                    hVar.f159005k = i15;
                    hVar.f159011r = 2;
                    objC = qVar2.c(params13, hVar);
                    if (objC != objE) {
                        p0Var5 = p0Var3;
                        objC3 = objC;
                        p0Var6 = p0Var2;
                        entry2 = entry;
                        documentDownloadStatus = (DocumentDownloadStatus) objC3;
                        if (documentDownloadStatus != null) {
                            status = null;
                        } else {
                            status = null;
                        }
                        qz3.b bVar4 = this.asyncDownloadInteractor;
                        String mainDocumentId2 = ((TaskIncludedDocumentData) entry2.getValue()).getMainDocumentId();
                        hVar.f158999d = vq.j.a(p0Var6);
                        hVar.f159000e = p0Var5;
                        hVar.f159001f = status;
                        hVar.f159002g = vq.j.a(entry2);
                        hVar.f159005k = i15;
                        hVar.f159011r = 3;
                        objM = bVar4.m(mainDocumentId2, hVar);
                        if (objM != objE) {
                            p0 p0Var17 = p0Var5;
                            hVar2 = status;
                            objC3 = objM;
                            entry3 = entry2;
                            p0Var7 = p0Var17;
                            iVar = (dx.i) objC3;
                            if (iVar instanceof dx.i.Left) {
                                objB = vq.b.a(false);
                            } else {
                                if (iVar instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVar).b();
                            }
                            zBooleanValue = ((Boolean) objB).booleanValue();
                            if (hVar2 != lz3.h.ALREADY_DOWNLOADED) {
                            }
                            uh0.a aVar2 = this.asyncMainDocumentTaskCompletedUC;
                            downloadTaskData2 = this.taskData;
                            if (downloadTaskData2 == null) {
                                downloadTaskData2 = null;
                            }
                            uh0.a.Params params14 = new uh0.a.Params(downloadTaskData2.getMainDocumentAuthToken());
                            hVar.f158999d = vq.j.a(p0Var6);
                            hVar.f159000e = p0Var7;
                            hVar.f159001f = vq.j.a(hVar2);
                            hVar.f159002g = vq.j.a(entry3);
                            hVar.f159005k = i15;
                            hVar.f159008n = zBooleanValue;
                            hVar.f159011r = 4;
                            objC2 = aVar2.c(params14, hVar);
                            if (objC2 != objE) {
                                p0 p0Var18 = p0Var7;
                                z15 = zBooleanValue;
                                objC3 = objC2;
                                p0Var8 = p0Var6;
                                p0Var9 = p0Var18;
                                iVar2 = (dx.i) objC3;
                                if (iVar2 instanceof dx.i.Left) {
                                    dx.b bVar5 = (dx.b) ((dx.i.Left) iVar2).b();
                                    a0Var = this.updateDocumentDownloadStatusUseCase;
                                    downloadTaskData3 = this.taskData;
                                    if (downloadTaskData3 == null) {
                                        downloadTaskData3 = null;
                                    }
                                    params2 = new a0.Params((rq0.b) pq.v.k0(downloadTaskData3.d().keySet()), lz3.h.CREATING_ERROR, null);
                                    hVar.f158999d = vq.j.a(p0Var8);
                                    hVar.f159000e = p0Var9;
                                    hVar.f159001f = vq.j.a(hVar2);
                                    hVar.f159002g = vq.j.a(entry3);
                                    hVar.f159003h = iVar2;
                                    hVar.f159004j = vq.j.a(bVar5);
                                    hVar.f159005k = i15;
                                    hVar.f159008n = z15;
                                    hVar.f159006l = 0;
                                    hVar.f159007m = 0;
                                    hVar.f159011r = 5;
                                    if (a0Var.c(params2, hVar) != objE) {
                                        p0Var4 = p0Var9;
                                        p0Var2 = p0Var8;
                                        p0Var6 = p0Var2;
                                        p0Var7 = p0Var4;
                                        f0 f0Var5 = this.hasAnyAsyncDownloadErrorUC;
                                        f0.Params params15 = new f0.Params(this.taskId);
                                        hVar.f158999d = vq.j.a(p0Var6);
                                        hVar.f159000e = p0Var7;
                                        hVar.f159001f = null;
                                        hVar.f159002g = null;
                                        hVar.f159003h = null;
                                        hVar.f159004j = null;
                                        hVar.f159005k = i15;
                                        hVar.f159011r = 7;
                                        objC3 = f0Var5.c(params15, hVar);
                                        if (objC3 != objE) {
                                            p0Var10 = p0Var7;
                                            p0Var11 = p0Var6;
                                            if (((Boolean) objC3).booleanValue()) {
                                                uVar = this.removeAsyncDownloadTaskUC;
                                                params4 = new u.Params(this.taskId);
                                                hVar.f158999d = vq.j.a(p0Var11);
                                                hVar.f159000e = p0Var10;
                                                hVar.f159005k = i15;
                                                hVar.f159011r = 8;
                                                if (uVar.c(params4, hVar) != objE) {
                                                    if (this.mainDocumentDownload) {
                                                        bVar = this.asyncDownloadInteractor;
                                                        hVar.f158999d = vq.j.a(p0Var11);
                                                        hVar.f159000e = p0Var10;
                                                        hVar.f159005k = i15;
                                                        hVar.f159011r = 10;
                                                        if (bVar.c(hVar) != objE) {
                                                            h0Var = this.interruptDocumentsAsyncUseCase;
                                                            params5 = new h0.Params(this.taskId);
                                                            hVar.f158999d = vq.j.a(p0Var11);
                                                            hVar.f159000e = p0Var10;
                                                            hVar.f159005k = i15;
                                                            hVar.f159011r = 11;
                                                            if (h0Var.c(params5, hVar) != objE) {
                                                                p0Var12 = p0Var10;
                                                                i16 = 1;
                                                                q0.d(p0Var12, null, i16, null);
                                                                return i0.f148189a;
                                                            }
                                                        }
                                                    } else {
                                                        h0Var = this.interruptDocumentsAsyncUseCase;
                                                        params5 = new h0.Params(this.taskId);
                                                        hVar.f158999d = vq.j.a(p0Var11);
                                                        hVar.f159000e = p0Var10;
                                                        hVar.f159005k = i15;
                                                        hVar.f159011r = 11;
                                                        if (h0Var.c(params5, hVar) != objE) {
                                                            p0Var12 = p0Var10;
                                                            i16 = 1;
                                                            q0.d(p0Var12, null, i16, null);
                                                            return i0.f148189a;
                                                        }
                                                    }
                                                }
                                            } else {
                                                w0Var = this.setAsyncDownloadTaskDataCompletedUC;
                                                params3 = new w0.Params(this.taskId);
                                                hVar.f158999d = vq.j.a(p0Var11);
                                                hVar.f159000e = p0Var10;
                                                hVar.f159005k = i15;
                                                hVar.f159011r = 9;
                                                if (w0Var.c(params3, hVar) != objE) {
                                                    if (this.mainDocumentDownload) {
                                                        bVar = this.asyncDownloadInteractor;
                                                        hVar.f158999d = vq.j.a(p0Var11);
                                                        hVar.f159000e = p0Var10;
                                                        hVar.f159005k = i15;
                                                        hVar.f159011r = 10;
                                                        if (bVar.c(hVar) != objE) {
                                                            h0Var = this.interruptDocumentsAsyncUseCase;
                                                            params5 = new h0.Params(this.taskId);
                                                            hVar.f158999d = vq.j.a(p0Var11);
                                                            hVar.f159000e = p0Var10;
                                                            hVar.f159005k = i15;
                                                            hVar.f159011r = 11;
                                                            if (h0Var.c(params5, hVar) != objE) {
                                                                p0Var12 = p0Var10;
                                                                i16 = 1;
                                                                q0.d(p0Var12, null, i16, null);
                                                                return i0.f148189a;
                                                            }
                                                        }
                                                    } else {
                                                        h0Var = this.interruptDocumentsAsyncUseCase;
                                                        params5 = new h0.Params(this.taskId);
                                                        hVar.f158999d = vq.j.a(p0Var11);
                                                        hVar.f159000e = p0Var10;
                                                        hVar.f159005k = i15;
                                                        hVar.f159011r = 11;
                                                        if (h0Var.c(params5, hVar) != objE) {
                                                            p0Var12 = p0Var10;
                                                            i16 = 1;
                                                            q0.d(p0Var12, null, i16, null);
                                                            return i0.f148189a;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    p0Var7 = p0Var9;
                                    p0Var6 = p0Var8;
                                    f0 f0Var6 = this.hasAnyAsyncDownloadErrorUC;
                                    f0.Params params16 = new f0.Params(this.taskId);
                                    hVar.f158999d = vq.j.a(p0Var6);
                                    hVar.f159000e = p0Var7;
                                    hVar.f159001f = null;
                                    hVar.f159002g = null;
                                    hVar.f159003h = null;
                                    hVar.f159004j = null;
                                    hVar.f159005k = i15;
                                    hVar.f159011r = 7;
                                    objC3 = f0Var6.c(params16, hVar);
                                    if (objC3 != objE) {
                                        p0Var10 = p0Var7;
                                        p0Var11 = p0Var6;
                                        if (((Boolean) objC3).booleanValue()) {
                                            uVar = this.removeAsyncDownloadTaskUC;
                                            params4 = new u.Params(this.taskId);
                                            hVar.f158999d = vq.j.a(p0Var11);
                                            hVar.f159000e = p0Var10;
                                            hVar.f159005k = i15;
                                            hVar.f159011r = 8;
                                            if (uVar.c(params4, hVar) != objE) {
                                                if (this.mainDocumentDownload) {
                                                    bVar = this.asyncDownloadInteractor;
                                                    hVar.f158999d = vq.j.a(p0Var11);
                                                    hVar.f159000e = p0Var10;
                                                    hVar.f159005k = i15;
                                                    hVar.f159011r = 10;
                                                    if (bVar.c(hVar) != objE) {
                                                        h0Var = this.interruptDocumentsAsyncUseCase;
                                                        params5 = new h0.Params(this.taskId);
                                                        hVar.f158999d = vq.j.a(p0Var11);
                                                        hVar.f159000e = p0Var10;
                                                        hVar.f159005k = i15;
                                                        hVar.f159011r = 11;
                                                        if (h0Var.c(params5, hVar) != objE) {
                                                            p0Var12 = p0Var10;
                                                            i16 = 1;
                                                            q0.d(p0Var12, null, i16, null);
                                                            return i0.f148189a;
                                                        }
                                                    }
                                                } else {
                                                    h0Var = this.interruptDocumentsAsyncUseCase;
                                                    params5 = new h0.Params(this.taskId);
                                                    hVar.f158999d = vq.j.a(p0Var11);
                                                    hVar.f159000e = p0Var10;
                                                    hVar.f159005k = i15;
                                                    hVar.f159011r = 11;
                                                    if (h0Var.c(params5, hVar) != objE) {
                                                        p0Var12 = p0Var10;
                                                        i16 = 1;
                                                        q0.d(p0Var12, null, i16, null);
                                                        return i0.f148189a;
                                                    }
                                                }
                                            }
                                        } else {
                                            w0Var = this.setAsyncDownloadTaskDataCompletedUC;
                                            params3 = new w0.Params(this.taskId);
                                            hVar.f158999d = vq.j.a(p0Var11);
                                            hVar.f159000e = p0Var10;
                                            hVar.f159005k = i15;
                                            hVar.f159011r = 9;
                                            if (w0Var.c(params3, hVar) != objE) {
                                                if (this.mainDocumentDownload) {
                                                    bVar = this.asyncDownloadInteractor;
                                                    hVar.f158999d = vq.j.a(p0Var11);
                                                    hVar.f159000e = p0Var10;
                                                    hVar.f159005k = i15;
                                                    hVar.f159011r = 10;
                                                    if (bVar.c(hVar) != objE) {
                                                        h0Var = this.interruptDocumentsAsyncUseCase;
                                                        params5 = new h0.Params(this.taskId);
                                                        hVar.f158999d = vq.j.a(p0Var11);
                                                        hVar.f159000e = p0Var10;
                                                        hVar.f159005k = i15;
                                                        hVar.f159011r = 11;
                                                        if (h0Var.c(params5, hVar) != objE) {
                                                            p0Var12 = p0Var10;
                                                            i16 = 1;
                                                            q0.d(p0Var12, null, i16, null);
                                                            return i0.f148189a;
                                                        }
                                                    }
                                                } else {
                                                    h0Var = this.interruptDocumentsAsyncUseCase;
                                                    params5 = new h0.Params(this.taskId);
                                                    hVar.f158999d = vq.j.a(p0Var11);
                                                    hVar.f159000e = p0Var10;
                                                    hVar.f159005k = i15;
                                                    hVar.f159011r = 11;
                                                    if (h0Var.c(params5, hVar) != objE) {
                                                        p0Var12 = p0Var10;
                                                        i16 = 1;
                                                        q0.d(p0Var12, null, i16, null);
                                                        return i0.f148189a;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    n0Var = this.onTaskDownloadedUC;
                    params = new n0.Params(this.taskId);
                    hVar.f158999d = vq.j.a(p0Var2);
                    hVar.f159000e = p0Var3;
                    hVar.f159005k = i15;
                    hVar.f159011r = 6;
                    if (n0Var.c(params, hVar) != objE) {
                        p0Var4 = p0Var3;
                        p0Var6 = p0Var2;
                        p0Var7 = p0Var4;
                        f0 f0Var7 = this.hasAnyAsyncDownloadErrorUC;
                        f0.Params params17 = new f0.Params(this.taskId);
                        hVar.f158999d = vq.j.a(p0Var6);
                        hVar.f159000e = p0Var7;
                        hVar.f159001f = null;
                        hVar.f159002g = null;
                        hVar.f159003h = null;
                        hVar.f159004j = null;
                        hVar.f159005k = i15;
                        hVar.f159011r = 7;
                        objC3 = f0Var7.c(params17, hVar);
                        if (objC3 != objE) {
                            p0Var10 = p0Var7;
                            p0Var11 = p0Var6;
                            if (((Boolean) objC3).booleanValue()) {
                                uVar = this.removeAsyncDownloadTaskUC;
                                params4 = new u.Params(this.taskId);
                                hVar.f158999d = vq.j.a(p0Var11);
                                hVar.f159000e = p0Var10;
                                hVar.f159005k = i15;
                                hVar.f159011r = 8;
                                if (uVar.c(params4, hVar) != objE) {
                                    if (this.mainDocumentDownload) {
                                        bVar = this.asyncDownloadInteractor;
                                        hVar.f158999d = vq.j.a(p0Var11);
                                        hVar.f159000e = p0Var10;
                                        hVar.f159005k = i15;
                                        hVar.f159011r = 10;
                                        if (bVar.c(hVar) != objE) {
                                            h0Var = this.interruptDocumentsAsyncUseCase;
                                            params5 = new h0.Params(this.taskId);
                                            hVar.f158999d = vq.j.a(p0Var11);
                                            hVar.f159000e = p0Var10;
                                            hVar.f159005k = i15;
                                            hVar.f159011r = 11;
                                            if (h0Var.c(params5, hVar) != objE) {
                                                p0Var12 = p0Var10;
                                                i16 = 1;
                                                q0.d(p0Var12, null, i16, null);
                                                return i0.f148189a;
                                            }
                                        }
                                    } else {
                                        h0Var = this.interruptDocumentsAsyncUseCase;
                                        params5 = new h0.Params(this.taskId);
                                        hVar.f158999d = vq.j.a(p0Var11);
                                        hVar.f159000e = p0Var10;
                                        hVar.f159005k = i15;
                                        hVar.f159011r = 11;
                                        if (h0Var.c(params5, hVar) != objE) {
                                            p0Var12 = p0Var10;
                                            i16 = 1;
                                            q0.d(p0Var12, null, i16, null);
                                            return i0.f148189a;
                                        }
                                    }
                                }
                            } else {
                                w0Var = this.setAsyncDownloadTaskDataCompletedUC;
                                params3 = new w0.Params(this.taskId);
                                hVar.f158999d = vq.j.a(p0Var11);
                                hVar.f159000e = p0Var10;
                                hVar.f159005k = i15;
                                hVar.f159011r = 9;
                                if (w0Var.c(params3, hVar) != objE) {
                                    if (this.mainDocumentDownload) {
                                        bVar = this.asyncDownloadInteractor;
                                        hVar.f158999d = vq.j.a(p0Var11);
                                        hVar.f159000e = p0Var10;
                                        hVar.f159005k = i15;
                                        hVar.f159011r = 10;
                                        if (bVar.c(hVar) != objE) {
                                            h0Var = this.interruptDocumentsAsyncUseCase;
                                            params5 = new h0.Params(this.taskId);
                                            hVar.f158999d = vq.j.a(p0Var11);
                                            hVar.f159000e = p0Var10;
                                            hVar.f159005k = i15;
                                            hVar.f159011r = 11;
                                            if (h0Var.c(params5, hVar) != objE) {
                                                p0Var12 = p0Var10;
                                                i16 = 1;
                                                q0.d(p0Var12, null, i16, null);
                                                return i0.f148189a;
                                            }
                                        }
                                    } else {
                                        h0Var = this.interruptDocumentsAsyncUseCase;
                                        params5 = new h0.Params(this.taskId);
                                        hVar.f158999d = vq.j.a(p0Var11);
                                        hVar.f159000e = p0Var10;
                                        hVar.f159005k = i15;
                                        hVar.f159011r = 11;
                                        if (h0Var.c(params5, hVar) != objE) {
                                            p0Var12 = p0Var10;
                                            i16 = 1;
                                            q0.d(p0Var12, null, i16, null);
                                            return i0.f148189a;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return objE;
            case 2:
                i15 = hVar.f159005k;
                entry2 = (Map.Entry) hVar.f159001f;
                p0 p0Var19 = (p0) hVar.f159000e;
                p0 p0Var20 = (p0) hVar.f158999d;
                oq.u.b(objC3);
                p0Var6 = p0Var20;
                p0Var5 = p0Var19;
                documentDownloadStatus = (DocumentDownloadStatus) objC3;
                if (documentDownloadStatus != null) {
                    status = null;
                } else {
                    status = null;
                }
                qz3.b bVar6 = this.asyncDownloadInteractor;
                String mainDocumentId3 = ((TaskIncludedDocumentData) entry2.getValue()).getMainDocumentId();
                hVar.f158999d = vq.j.a(p0Var6);
                hVar.f159000e = p0Var5;
                hVar.f159001f = status;
                hVar.f159002g = vq.j.a(entry2);
                hVar.f159005k = i15;
                hVar.f159011r = 3;
                objM = bVar6.m(mainDocumentId3, hVar);
                if (objM != objE) {
                    p0 p0Var110 = p0Var5;
                    hVar2 = status;
                    objC3 = objM;
                    entry3 = entry2;
                    p0Var7 = p0Var110;
                    iVar = (dx.i) objC3;
                    if (iVar instanceof dx.i.Left) {
                        objB = vq.b.a(false);
                    } else {
                        if (iVar instanceof dx.i.Right) {
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) iVar).b();
                    }
                    zBooleanValue = ((Boolean) objB).booleanValue();
                    if (hVar2 != lz3.h.ALREADY_DOWNLOADED) {
                    }
                    uh0.a aVar3 = this.asyncMainDocumentTaskCompletedUC;
                    downloadTaskData2 = this.taskData;
                    if (downloadTaskData2 == null) {
                        downloadTaskData2 = null;
                    }
                    uh0.a.Params params18 = new uh0.a.Params(downloadTaskData2.getMainDocumentAuthToken());
                    hVar.f158999d = vq.j.a(p0Var6);
                    hVar.f159000e = p0Var7;
                    hVar.f159001f = vq.j.a(hVar2);
                    hVar.f159002g = vq.j.a(entry3);
                    hVar.f159005k = i15;
                    hVar.f159008n = zBooleanValue;
                    hVar.f159011r = 4;
                    objC2 = aVar3.c(params18, hVar);
                    if (objC2 != objE) {
                        p0 p0Var111 = p0Var7;
                        z15 = zBooleanValue;
                        objC3 = objC2;
                        p0Var8 = p0Var6;
                        p0Var9 = p0Var111;
                        iVar2 = (dx.i) objC3;
                        if (iVar2 instanceof dx.i.Left) {
                            dx.b bVar7 = (dx.b) ((dx.i.Left) iVar2).b();
                            a0Var = this.updateDocumentDownloadStatusUseCase;
                            downloadTaskData3 = this.taskData;
                            if (downloadTaskData3 == null) {
                                downloadTaskData3 = null;
                            }
                            params2 = new a0.Params((rq0.b) pq.v.k0(downloadTaskData3.d().keySet()), lz3.h.CREATING_ERROR, null);
                            hVar.f158999d = vq.j.a(p0Var8);
                            hVar.f159000e = p0Var9;
                            hVar.f159001f = vq.j.a(hVar2);
                            hVar.f159002g = vq.j.a(entry3);
                            hVar.f159003h = iVar2;
                            hVar.f159004j = vq.j.a(bVar7);
                            hVar.f159005k = i15;
                            hVar.f159008n = z15;
                            hVar.f159006l = 0;
                            hVar.f159007m = 0;
                            hVar.f159011r = 5;
                            if (a0Var.c(params2, hVar) != objE) {
                                p0Var4 = p0Var9;
                                p0Var2 = p0Var8;
                                p0Var6 = p0Var2;
                                p0Var7 = p0Var4;
                                f0 f0Var8 = this.hasAnyAsyncDownloadErrorUC;
                                f0.Params params19 = new f0.Params(this.taskId);
                                hVar.f158999d = vq.j.a(p0Var6);
                                hVar.f159000e = p0Var7;
                                hVar.f159001f = null;
                                hVar.f159002g = null;
                                hVar.f159003h = null;
                                hVar.f159004j = null;
                                hVar.f159005k = i15;
                                hVar.f159011r = 7;
                                objC3 = f0Var8.c(params19, hVar);
                                if (objC3 != objE) {
                                    p0Var10 = p0Var7;
                                    p0Var11 = p0Var6;
                                    if (((Boolean) objC3).booleanValue()) {
                                        uVar = this.removeAsyncDownloadTaskUC;
                                        params4 = new u.Params(this.taskId);
                                        hVar.f158999d = vq.j.a(p0Var11);
                                        hVar.f159000e = p0Var10;
                                        hVar.f159005k = i15;
                                        hVar.f159011r = 8;
                                        if (uVar.c(params4, hVar) != objE) {
                                            if (this.mainDocumentDownload) {
                                                bVar = this.asyncDownloadInteractor;
                                                hVar.f158999d = vq.j.a(p0Var11);
                                                hVar.f159000e = p0Var10;
                                                hVar.f159005k = i15;
                                                hVar.f159011r = 10;
                                                if (bVar.c(hVar) != objE) {
                                                    h0Var = this.interruptDocumentsAsyncUseCase;
                                                    params5 = new h0.Params(this.taskId);
                                                    hVar.f158999d = vq.j.a(p0Var11);
                                                    hVar.f159000e = p0Var10;
                                                    hVar.f159005k = i15;
                                                    hVar.f159011r = 11;
                                                    if (h0Var.c(params5, hVar) != objE) {
                                                        p0Var12 = p0Var10;
                                                        i16 = 1;
                                                        q0.d(p0Var12, null, i16, null);
                                                        return i0.f148189a;
                                                    }
                                                }
                                            } else {
                                                h0Var = this.interruptDocumentsAsyncUseCase;
                                                params5 = new h0.Params(this.taskId);
                                                hVar.f158999d = vq.j.a(p0Var11);
                                                hVar.f159000e = p0Var10;
                                                hVar.f159005k = i15;
                                                hVar.f159011r = 11;
                                                if (h0Var.c(params5, hVar) != objE) {
                                                    p0Var12 = p0Var10;
                                                    i16 = 1;
                                                    q0.d(p0Var12, null, i16, null);
                                                    return i0.f148189a;
                                                }
                                            }
                                        }
                                    } else {
                                        w0Var = this.setAsyncDownloadTaskDataCompletedUC;
                                        params3 = new w0.Params(this.taskId);
                                        hVar.f158999d = vq.j.a(p0Var11);
                                        hVar.f159000e = p0Var10;
                                        hVar.f159005k = i15;
                                        hVar.f159011r = 9;
                                        if (w0Var.c(params3, hVar) != objE) {
                                            if (this.mainDocumentDownload) {
                                                bVar = this.asyncDownloadInteractor;
                                                hVar.f158999d = vq.j.a(p0Var11);
                                                hVar.f159000e = p0Var10;
                                                hVar.f159005k = i15;
                                                hVar.f159011r = 10;
                                                if (bVar.c(hVar) != objE) {
                                                    h0Var = this.interruptDocumentsAsyncUseCase;
                                                    params5 = new h0.Params(this.taskId);
                                                    hVar.f158999d = vq.j.a(p0Var11);
                                                    hVar.f159000e = p0Var10;
                                                    hVar.f159005k = i15;
                                                    hVar.f159011r = 11;
                                                    if (h0Var.c(params5, hVar) != objE) {
                                                        p0Var12 = p0Var10;
                                                        i16 = 1;
                                                        q0.d(p0Var12, null, i16, null);
                                                        return i0.f148189a;
                                                    }
                                                }
                                            } else {
                                                h0Var = this.interruptDocumentsAsyncUseCase;
                                                params5 = new h0.Params(this.taskId);
                                                hVar.f158999d = vq.j.a(p0Var11);
                                                hVar.f159000e = p0Var10;
                                                hVar.f159005k = i15;
                                                hVar.f159011r = 11;
                                                if (h0Var.c(params5, hVar) != objE) {
                                                    p0Var12 = p0Var10;
                                                    i16 = 1;
                                                    q0.d(p0Var12, null, i16, null);
                                                    return i0.f148189a;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            p0Var7 = p0Var9;
                            p0Var6 = p0Var8;
                            f0 f0Var9 = this.hasAnyAsyncDownloadErrorUC;
                            f0.Params params110 = new f0.Params(this.taskId);
                            hVar.f158999d = vq.j.a(p0Var6);
                            hVar.f159000e = p0Var7;
                            hVar.f159001f = null;
                            hVar.f159002g = null;
                            hVar.f159003h = null;
                            hVar.f159004j = null;
                            hVar.f159005k = i15;
                            hVar.f159011r = 7;
                            objC3 = f0Var9.c(params110, hVar);
                            if (objC3 != objE) {
                                p0Var10 = p0Var7;
                                p0Var11 = p0Var6;
                                if (((Boolean) objC3).booleanValue()) {
                                    uVar = this.removeAsyncDownloadTaskUC;
                                    params4 = new u.Params(this.taskId);
                                    hVar.f158999d = vq.j.a(p0Var11);
                                    hVar.f159000e = p0Var10;
                                    hVar.f159005k = i15;
                                    hVar.f159011r = 8;
                                    if (uVar.c(params4, hVar) != objE) {
                                        if (this.mainDocumentDownload) {
                                            bVar = this.asyncDownloadInteractor;
                                            hVar.f158999d = vq.j.a(p0Var11);
                                            hVar.f159000e = p0Var10;
                                            hVar.f159005k = i15;
                                            hVar.f159011r = 10;
                                            if (bVar.c(hVar) != objE) {
                                                h0Var = this.interruptDocumentsAsyncUseCase;
                                                params5 = new h0.Params(this.taskId);
                                                hVar.f158999d = vq.j.a(p0Var11);
                                                hVar.f159000e = p0Var10;
                                                hVar.f159005k = i15;
                                                hVar.f159011r = 11;
                                                if (h0Var.c(params5, hVar) != objE) {
                                                    p0Var12 = p0Var10;
                                                    i16 = 1;
                                                    q0.d(p0Var12, null, i16, null);
                                                    return i0.f148189a;
                                                }
                                            }
                                        } else {
                                            h0Var = this.interruptDocumentsAsyncUseCase;
                                            params5 = new h0.Params(this.taskId);
                                            hVar.f158999d = vq.j.a(p0Var11);
                                            hVar.f159000e = p0Var10;
                                            hVar.f159005k = i15;
                                            hVar.f159011r = 11;
                                            if (h0Var.c(params5, hVar) != objE) {
                                                p0Var12 = p0Var10;
                                                i16 = 1;
                                                q0.d(p0Var12, null, i16, null);
                                                return i0.f148189a;
                                            }
                                        }
                                    }
                                } else {
                                    w0Var = this.setAsyncDownloadTaskDataCompletedUC;
                                    params3 = new w0.Params(this.taskId);
                                    hVar.f158999d = vq.j.a(p0Var11);
                                    hVar.f159000e = p0Var10;
                                    hVar.f159005k = i15;
                                    hVar.f159011r = 9;
                                    if (w0Var.c(params3, hVar) != objE) {
                                        if (this.mainDocumentDownload) {
                                            bVar = this.asyncDownloadInteractor;
                                            hVar.f158999d = vq.j.a(p0Var11);
                                            hVar.f159000e = p0Var10;
                                            hVar.f159005k = i15;
                                            hVar.f159011r = 10;
                                            if (bVar.c(hVar) != objE) {
                                                h0Var = this.interruptDocumentsAsyncUseCase;
                                                params5 = new h0.Params(this.taskId);
                                                hVar.f158999d = vq.j.a(p0Var11);
                                                hVar.f159000e = p0Var10;
                                                hVar.f159005k = i15;
                                                hVar.f159011r = 11;
                                                if (h0Var.c(params5, hVar) != objE) {
                                                    p0Var12 = p0Var10;
                                                    i16 = 1;
                                                    q0.d(p0Var12, null, i16, null);
                                                    return i0.f148189a;
                                                }
                                            }
                                        } else {
                                            h0Var = this.interruptDocumentsAsyncUseCase;
                                            params5 = new h0.Params(this.taskId);
                                            hVar.f158999d = vq.j.a(p0Var11);
                                            hVar.f159000e = p0Var10;
                                            hVar.f159005k = i15;
                                            hVar.f159011r = 11;
                                            if (h0Var.c(params5, hVar) != objE) {
                                                p0Var12 = p0Var10;
                                                i16 = 1;
                                                q0.d(p0Var12, null, i16, null);
                                                return i0.f148189a;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return objE;
            case 3:
                i15 = hVar.f159005k;
                Map.Entry entry4 = (Map.Entry) hVar.f159002g;
                lz3.h hVar3 = (lz3.h) hVar.f159001f;
                p0 p0Var21 = (p0) hVar.f159000e;
                p0Var6 = (p0) hVar.f158999d;
                oq.u.b(objC3);
                entry3 = entry4;
                p0Var7 = p0Var21;
                hVar2 = hVar3;
                iVar = (dx.i) objC3;
                if (iVar instanceof dx.i.Left) {
                    objB = vq.b.a(false);
                } else {
                    if (iVar instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    objB = ((dx.i.Right) iVar).b();
                }
                zBooleanValue = ((Boolean) objB).booleanValue();
                if (hVar2 != lz3.h.ALREADY_DOWNLOADED) {
                }
                uh0.a aVar4 = this.asyncMainDocumentTaskCompletedUC;
                downloadTaskData2 = this.taskData;
                if (downloadTaskData2 == null) {
                    downloadTaskData2 = null;
                }
                uh0.a.Params params111 = new uh0.a.Params(downloadTaskData2.getMainDocumentAuthToken());
                hVar.f158999d = vq.j.a(p0Var6);
                hVar.f159000e = p0Var7;
                hVar.f159001f = vq.j.a(hVar2);
                hVar.f159002g = vq.j.a(entry3);
                hVar.f159005k = i15;
                hVar.f159008n = zBooleanValue;
                hVar.f159011r = 4;
                objC2 = aVar4.c(params111, hVar);
                if (objC2 != objE) {
                    p0 p0Var112 = p0Var7;
                    z15 = zBooleanValue;
                    objC3 = objC2;
                    p0Var8 = p0Var6;
                    p0Var9 = p0Var112;
                    iVar2 = (dx.i) objC3;
                    if (iVar2 instanceof dx.i.Left) {
                        dx.b bVar8 = (dx.b) ((dx.i.Left) iVar2).b();
                        a0Var = this.updateDocumentDownloadStatusUseCase;
                        downloadTaskData3 = this.taskData;
                        if (downloadTaskData3 == null) {
                            downloadTaskData3 = null;
                        }
                        params2 = new a0.Params((rq0.b) pq.v.k0(downloadTaskData3.d().keySet()), lz3.h.CREATING_ERROR, null);
                        hVar.f158999d = vq.j.a(p0Var8);
                        hVar.f159000e = p0Var9;
                        hVar.f159001f = vq.j.a(hVar2);
                        hVar.f159002g = vq.j.a(entry3);
                        hVar.f159003h = iVar2;
                        hVar.f159004j = vq.j.a(bVar8);
                        hVar.f159005k = i15;
                        hVar.f159008n = z15;
                        hVar.f159006l = 0;
                        hVar.f159007m = 0;
                        hVar.f159011r = 5;
                        if (a0Var.c(params2, hVar) != objE) {
                            p0Var4 = p0Var9;
                            p0Var2 = p0Var8;
                            p0Var6 = p0Var2;
                            p0Var7 = p0Var4;
                            f0 f0Var10 = this.hasAnyAsyncDownloadErrorUC;
                            f0.Params params112 = new f0.Params(this.taskId);
                            hVar.f158999d = vq.j.a(p0Var6);
                            hVar.f159000e = p0Var7;
                            hVar.f159001f = null;
                            hVar.f159002g = null;
                            hVar.f159003h = null;
                            hVar.f159004j = null;
                            hVar.f159005k = i15;
                            hVar.f159011r = 7;
                            objC3 = f0Var10.c(params112, hVar);
                            if (objC3 != objE) {
                                p0Var10 = p0Var7;
                                p0Var11 = p0Var6;
                                if (((Boolean) objC3).booleanValue()) {
                                    uVar = this.removeAsyncDownloadTaskUC;
                                    params4 = new u.Params(this.taskId);
                                    hVar.f158999d = vq.j.a(p0Var11);
                                    hVar.f159000e = p0Var10;
                                    hVar.f159005k = i15;
                                    hVar.f159011r = 8;
                                    if (uVar.c(params4, hVar) != objE) {
                                        if (this.mainDocumentDownload) {
                                            bVar = this.asyncDownloadInteractor;
                                            hVar.f158999d = vq.j.a(p0Var11);
                                            hVar.f159000e = p0Var10;
                                            hVar.f159005k = i15;
                                            hVar.f159011r = 10;
                                            if (bVar.c(hVar) != objE) {
                                                h0Var = this.interruptDocumentsAsyncUseCase;
                                                params5 = new h0.Params(this.taskId);
                                                hVar.f158999d = vq.j.a(p0Var11);
                                                hVar.f159000e = p0Var10;
                                                hVar.f159005k = i15;
                                                hVar.f159011r = 11;
                                                if (h0Var.c(params5, hVar) != objE) {
                                                    p0Var12 = p0Var10;
                                                    i16 = 1;
                                                    q0.d(p0Var12, null, i16, null);
                                                    return i0.f148189a;
                                                }
                                            }
                                        } else {
                                            h0Var = this.interruptDocumentsAsyncUseCase;
                                            params5 = new h0.Params(this.taskId);
                                            hVar.f158999d = vq.j.a(p0Var11);
                                            hVar.f159000e = p0Var10;
                                            hVar.f159005k = i15;
                                            hVar.f159011r = 11;
                                            if (h0Var.c(params5, hVar) != objE) {
                                                p0Var12 = p0Var10;
                                                i16 = 1;
                                                q0.d(p0Var12, null, i16, null);
                                                return i0.f148189a;
                                            }
                                        }
                                    }
                                } else {
                                    w0Var = this.setAsyncDownloadTaskDataCompletedUC;
                                    params3 = new w0.Params(this.taskId);
                                    hVar.f158999d = vq.j.a(p0Var11);
                                    hVar.f159000e = p0Var10;
                                    hVar.f159005k = i15;
                                    hVar.f159011r = 9;
                                    if (w0Var.c(params3, hVar) != objE) {
                                        if (this.mainDocumentDownload) {
                                            bVar = this.asyncDownloadInteractor;
                                            hVar.f158999d = vq.j.a(p0Var11);
                                            hVar.f159000e = p0Var10;
                                            hVar.f159005k = i15;
                                            hVar.f159011r = 10;
                                            if (bVar.c(hVar) != objE) {
                                                h0Var = this.interruptDocumentsAsyncUseCase;
                                                params5 = new h0.Params(this.taskId);
                                                hVar.f158999d = vq.j.a(p0Var11);
                                                hVar.f159000e = p0Var10;
                                                hVar.f159005k = i15;
                                                hVar.f159011r = 11;
                                                if (h0Var.c(params5, hVar) != objE) {
                                                    p0Var12 = p0Var10;
                                                    i16 = 1;
                                                    q0.d(p0Var12, null, i16, null);
                                                    return i0.f148189a;
                                                }
                                            }
                                        } else {
                                            h0Var = this.interruptDocumentsAsyncUseCase;
                                            params5 = new h0.Params(this.taskId);
                                            hVar.f158999d = vq.j.a(p0Var11);
                                            hVar.f159000e = p0Var10;
                                            hVar.f159005k = i15;
                                            hVar.f159011r = 11;
                                            if (h0Var.c(params5, hVar) != objE) {
                                                p0Var12 = p0Var10;
                                                i16 = 1;
                                                q0.d(p0Var12, null, i16, null);
                                                return i0.f148189a;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        p0Var7 = p0Var9;
                        p0Var6 = p0Var8;
                        f0 f0Var11 = this.hasAnyAsyncDownloadErrorUC;
                        f0.Params params113 = new f0.Params(this.taskId);
                        hVar.f158999d = vq.j.a(p0Var6);
                        hVar.f159000e = p0Var7;
                        hVar.f159001f = null;
                        hVar.f159002g = null;
                        hVar.f159003h = null;
                        hVar.f159004j = null;
                        hVar.f159005k = i15;
                        hVar.f159011r = 7;
                        objC3 = f0Var11.c(params113, hVar);
                        if (objC3 != objE) {
                            p0Var10 = p0Var7;
                            p0Var11 = p0Var6;
                            if (((Boolean) objC3).booleanValue()) {
                                uVar = this.removeAsyncDownloadTaskUC;
                                params4 = new u.Params(this.taskId);
                                hVar.f158999d = vq.j.a(p0Var11);
                                hVar.f159000e = p0Var10;
                                hVar.f159005k = i15;
                                hVar.f159011r = 8;
                                if (uVar.c(params4, hVar) != objE) {
                                    if (this.mainDocumentDownload) {
                                        bVar = this.asyncDownloadInteractor;
                                        hVar.f158999d = vq.j.a(p0Var11);
                                        hVar.f159000e = p0Var10;
                                        hVar.f159005k = i15;
                                        hVar.f159011r = 10;
                                        if (bVar.c(hVar) != objE) {
                                            h0Var = this.interruptDocumentsAsyncUseCase;
                                            params5 = new h0.Params(this.taskId);
                                            hVar.f158999d = vq.j.a(p0Var11);
                                            hVar.f159000e = p0Var10;
                                            hVar.f159005k = i15;
                                            hVar.f159011r = 11;
                                            if (h0Var.c(params5, hVar) != objE) {
                                                p0Var12 = p0Var10;
                                                i16 = 1;
                                                q0.d(p0Var12, null, i16, null);
                                                return i0.f148189a;
                                            }
                                        }
                                    } else {
                                        h0Var = this.interruptDocumentsAsyncUseCase;
                                        params5 = new h0.Params(this.taskId);
                                        hVar.f158999d = vq.j.a(p0Var11);
                                        hVar.f159000e = p0Var10;
                                        hVar.f159005k = i15;
                                        hVar.f159011r = 11;
                                        if (h0Var.c(params5, hVar) != objE) {
                                            p0Var12 = p0Var10;
                                            i16 = 1;
                                            q0.d(p0Var12, null, i16, null);
                                            return i0.f148189a;
                                        }
                                    }
                                }
                            } else {
                                w0Var = this.setAsyncDownloadTaskDataCompletedUC;
                                params3 = new w0.Params(this.taskId);
                                hVar.f158999d = vq.j.a(p0Var11);
                                hVar.f159000e = p0Var10;
                                hVar.f159005k = i15;
                                hVar.f159011r = 9;
                                if (w0Var.c(params3, hVar) != objE) {
                                    if (this.mainDocumentDownload) {
                                        bVar = this.asyncDownloadInteractor;
                                        hVar.f158999d = vq.j.a(p0Var11);
                                        hVar.f159000e = p0Var10;
                                        hVar.f159005k = i15;
                                        hVar.f159011r = 10;
                                        if (bVar.c(hVar) != objE) {
                                            h0Var = this.interruptDocumentsAsyncUseCase;
                                            params5 = new h0.Params(this.taskId);
                                            hVar.f158999d = vq.j.a(p0Var11);
                                            hVar.f159000e = p0Var10;
                                            hVar.f159005k = i15;
                                            hVar.f159011r = 11;
                                            if (h0Var.c(params5, hVar) != objE) {
                                                p0Var12 = p0Var10;
                                                i16 = 1;
                                                q0.d(p0Var12, null, i16, null);
                                                return i0.f148189a;
                                            }
                                        }
                                    } else {
                                        h0Var = this.interruptDocumentsAsyncUseCase;
                                        params5 = new h0.Params(this.taskId);
                                        hVar.f158999d = vq.j.a(p0Var11);
                                        hVar.f159000e = p0Var10;
                                        hVar.f159005k = i15;
                                        hVar.f159011r = 11;
                                        if (h0Var.c(params5, hVar) != objE) {
                                            p0Var12 = p0Var10;
                                            i16 = 1;
                                            q0.d(p0Var12, null, i16, null);
                                            return i0.f148189a;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return objE;
            case 4:
                boolean z16 = hVar.f159008n;
                int i18 = hVar.f159005k;
                entry3 = (Map.Entry) hVar.f159002g;
                hVar2 = (lz3.h) hVar.f159001f;
                p0Var9 = (p0) hVar.f159000e;
                p0Var8 = (p0) hVar.f158999d;
                oq.u.b(objC3);
                z15 = z16;
                i15 = i18;
                iVar2 = (dx.i) objC3;
                if (iVar2 instanceof dx.i.Left) {
                    dx.b bVar9 = (dx.b) ((dx.i.Left) iVar2).b();
                    a0Var = this.updateDocumentDownloadStatusUseCase;
                    downloadTaskData3 = this.taskData;
                    if (downloadTaskData3 == null) {
                        downloadTaskData3 = null;
                    }
                    params2 = new a0.Params((rq0.b) pq.v.k0(downloadTaskData3.d().keySet()), lz3.h.CREATING_ERROR, null);
                    hVar.f158999d = vq.j.a(p0Var8);
                    hVar.f159000e = p0Var9;
                    hVar.f159001f = vq.j.a(hVar2);
                    hVar.f159002g = vq.j.a(entry3);
                    hVar.f159003h = iVar2;
                    hVar.f159004j = vq.j.a(bVar9);
                    hVar.f159005k = i15;
                    hVar.f159008n = z15;
                    hVar.f159006l = 0;
                    hVar.f159007m = 0;
                    hVar.f159011r = 5;
                    if (a0Var.c(params2, hVar) != objE) {
                        p0Var4 = p0Var9;
                        p0Var2 = p0Var8;
                        p0Var6 = p0Var2;
                        p0Var7 = p0Var4;
                        f0 f0Var12 = this.hasAnyAsyncDownloadErrorUC;
                        f0.Params params114 = new f0.Params(this.taskId);
                        hVar.f158999d = vq.j.a(p0Var6);
                        hVar.f159000e = p0Var7;
                        hVar.f159001f = null;
                        hVar.f159002g = null;
                        hVar.f159003h = null;
                        hVar.f159004j = null;
                        hVar.f159005k = i15;
                        hVar.f159011r = 7;
                        objC3 = f0Var12.c(params114, hVar);
                        if (objC3 != objE) {
                            p0Var10 = p0Var7;
                            p0Var11 = p0Var6;
                            if (((Boolean) objC3).booleanValue()) {
                                uVar = this.removeAsyncDownloadTaskUC;
                                params4 = new u.Params(this.taskId);
                                hVar.f158999d = vq.j.a(p0Var11);
                                hVar.f159000e = p0Var10;
                                hVar.f159005k = i15;
                                hVar.f159011r = 8;
                                if (uVar.c(params4, hVar) != objE) {
                                    if (this.mainDocumentDownload) {
                                        bVar = this.asyncDownloadInteractor;
                                        hVar.f158999d = vq.j.a(p0Var11);
                                        hVar.f159000e = p0Var10;
                                        hVar.f159005k = i15;
                                        hVar.f159011r = 10;
                                        if (bVar.c(hVar) != objE) {
                                            h0Var = this.interruptDocumentsAsyncUseCase;
                                            params5 = new h0.Params(this.taskId);
                                            hVar.f158999d = vq.j.a(p0Var11);
                                            hVar.f159000e = p0Var10;
                                            hVar.f159005k = i15;
                                            hVar.f159011r = 11;
                                            if (h0Var.c(params5, hVar) != objE) {
                                                p0Var12 = p0Var10;
                                                i16 = 1;
                                                q0.d(p0Var12, null, i16, null);
                                                return i0.f148189a;
                                            }
                                        }
                                    } else {
                                        h0Var = this.interruptDocumentsAsyncUseCase;
                                        params5 = new h0.Params(this.taskId);
                                        hVar.f158999d = vq.j.a(p0Var11);
                                        hVar.f159000e = p0Var10;
                                        hVar.f159005k = i15;
                                        hVar.f159011r = 11;
                                        if (h0Var.c(params5, hVar) != objE) {
                                            p0Var12 = p0Var10;
                                            i16 = 1;
                                            q0.d(p0Var12, null, i16, null);
                                            return i0.f148189a;
                                        }
                                    }
                                }
                            } else {
                                w0Var = this.setAsyncDownloadTaskDataCompletedUC;
                                params3 = new w0.Params(this.taskId);
                                hVar.f158999d = vq.j.a(p0Var11);
                                hVar.f159000e = p0Var10;
                                hVar.f159005k = i15;
                                hVar.f159011r = 9;
                                if (w0Var.c(params3, hVar) != objE) {
                                    if (this.mainDocumentDownload) {
                                        bVar = this.asyncDownloadInteractor;
                                        hVar.f158999d = vq.j.a(p0Var11);
                                        hVar.f159000e = p0Var10;
                                        hVar.f159005k = i15;
                                        hVar.f159011r = 10;
                                        if (bVar.c(hVar) != objE) {
                                            h0Var = this.interruptDocumentsAsyncUseCase;
                                            params5 = new h0.Params(this.taskId);
                                            hVar.f158999d = vq.j.a(p0Var11);
                                            hVar.f159000e = p0Var10;
                                            hVar.f159005k = i15;
                                            hVar.f159011r = 11;
                                            if (h0Var.c(params5, hVar) != objE) {
                                                p0Var12 = p0Var10;
                                                i16 = 1;
                                                q0.d(p0Var12, null, i16, null);
                                                return i0.f148189a;
                                            }
                                        }
                                    } else {
                                        h0Var = this.interruptDocumentsAsyncUseCase;
                                        params5 = new h0.Params(this.taskId);
                                        hVar.f158999d = vq.j.a(p0Var11);
                                        hVar.f159000e = p0Var10;
                                        hVar.f159005k = i15;
                                        hVar.f159011r = 11;
                                        if (h0Var.c(params5, hVar) != objE) {
                                            p0Var12 = p0Var10;
                                            i16 = 1;
                                            q0.d(p0Var12, null, i16, null);
                                            return i0.f148189a;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    p0Var7 = p0Var9;
                    p0Var6 = p0Var8;
                    f0 f0Var13 = this.hasAnyAsyncDownloadErrorUC;
                    f0.Params params115 = new f0.Params(this.taskId);
                    hVar.f158999d = vq.j.a(p0Var6);
                    hVar.f159000e = p0Var7;
                    hVar.f159001f = null;
                    hVar.f159002g = null;
                    hVar.f159003h = null;
                    hVar.f159004j = null;
                    hVar.f159005k = i15;
                    hVar.f159011r = 7;
                    objC3 = f0Var13.c(params115, hVar);
                    if (objC3 != objE) {
                        p0Var10 = p0Var7;
                        p0Var11 = p0Var6;
                        if (((Boolean) objC3).booleanValue()) {
                            uVar = this.removeAsyncDownloadTaskUC;
                            params4 = new u.Params(this.taskId);
                            hVar.f158999d = vq.j.a(p0Var11);
                            hVar.f159000e = p0Var10;
                            hVar.f159005k = i15;
                            hVar.f159011r = 8;
                            if (uVar.c(params4, hVar) != objE) {
                                if (this.mainDocumentDownload) {
                                    bVar = this.asyncDownloadInteractor;
                                    hVar.f158999d = vq.j.a(p0Var11);
                                    hVar.f159000e = p0Var10;
                                    hVar.f159005k = i15;
                                    hVar.f159011r = 10;
                                    if (bVar.c(hVar) != objE) {
                                        h0Var = this.interruptDocumentsAsyncUseCase;
                                        params5 = new h0.Params(this.taskId);
                                        hVar.f158999d = vq.j.a(p0Var11);
                                        hVar.f159000e = p0Var10;
                                        hVar.f159005k = i15;
                                        hVar.f159011r = 11;
                                        if (h0Var.c(params5, hVar) != objE) {
                                            p0Var12 = p0Var10;
                                            i16 = 1;
                                            q0.d(p0Var12, null, i16, null);
                                            return i0.f148189a;
                                        }
                                    }
                                } else {
                                    h0Var = this.interruptDocumentsAsyncUseCase;
                                    params5 = new h0.Params(this.taskId);
                                    hVar.f158999d = vq.j.a(p0Var11);
                                    hVar.f159000e = p0Var10;
                                    hVar.f159005k = i15;
                                    hVar.f159011r = 11;
                                    if (h0Var.c(params5, hVar) != objE) {
                                        p0Var12 = p0Var10;
                                        i16 = 1;
                                        q0.d(p0Var12, null, i16, null);
                                        return i0.f148189a;
                                    }
                                }
                            }
                        } else {
                            w0Var = this.setAsyncDownloadTaskDataCompletedUC;
                            params3 = new w0.Params(this.taskId);
                            hVar.f158999d = vq.j.a(p0Var11);
                            hVar.f159000e = p0Var10;
                            hVar.f159005k = i15;
                            hVar.f159011r = 9;
                            if (w0Var.c(params3, hVar) != objE) {
                                if (this.mainDocumentDownload) {
                                    bVar = this.asyncDownloadInteractor;
                                    hVar.f158999d = vq.j.a(p0Var11);
                                    hVar.f159000e = p0Var10;
                                    hVar.f159005k = i15;
                                    hVar.f159011r = 10;
                                    if (bVar.c(hVar) != objE) {
                                        h0Var = this.interruptDocumentsAsyncUseCase;
                                        params5 = new h0.Params(this.taskId);
                                        hVar.f158999d = vq.j.a(p0Var11);
                                        hVar.f159000e = p0Var10;
                                        hVar.f159005k = i15;
                                        hVar.f159011r = 11;
                                        if (h0Var.c(params5, hVar) != objE) {
                                            p0Var12 = p0Var10;
                                            i16 = 1;
                                            q0.d(p0Var12, null, i16, null);
                                            return i0.f148189a;
                                        }
                                    }
                                } else {
                                    h0Var = this.interruptDocumentsAsyncUseCase;
                                    params5 = new h0.Params(this.taskId);
                                    hVar.f158999d = vq.j.a(p0Var11);
                                    hVar.f159000e = p0Var10;
                                    hVar.f159005k = i15;
                                    hVar.f159011r = 11;
                                    if (h0Var.c(params5, hVar) != objE) {
                                        p0Var12 = p0Var10;
                                        i16 = 1;
                                        q0.d(p0Var12, null, i16, null);
                                        return i0.f148189a;
                                    }
                                }
                            }
                        }
                    }
                }
                return objE;
            case 5:
                i15 = hVar.f159005k;
                p0Var4 = (p0) hVar.f159000e;
                p0Var2 = (p0) hVar.f158999d;
                oq.u.b(objC3);
                p0Var6 = p0Var2;
                p0Var7 = p0Var4;
                f0 f0Var14 = this.hasAnyAsyncDownloadErrorUC;
                f0.Params params116 = new f0.Params(this.taskId);
                hVar.f158999d = vq.j.a(p0Var6);
                hVar.f159000e = p0Var7;
                hVar.f159001f = null;
                hVar.f159002g = null;
                hVar.f159003h = null;
                hVar.f159004j = null;
                hVar.f159005k = i15;
                hVar.f159011r = 7;
                objC3 = f0Var14.c(params116, hVar);
                if (objC3 != objE) {
                    p0Var10 = p0Var7;
                    p0Var11 = p0Var6;
                    if (((Boolean) objC3).booleanValue()) {
                        uVar = this.removeAsyncDownloadTaskUC;
                        params4 = new u.Params(this.taskId);
                        hVar.f158999d = vq.j.a(p0Var11);
                        hVar.f159000e = p0Var10;
                        hVar.f159005k = i15;
                        hVar.f159011r = 8;
                        if (uVar.c(params4, hVar) != objE) {
                            if (this.mainDocumentDownload) {
                                bVar = this.asyncDownloadInteractor;
                                hVar.f158999d = vq.j.a(p0Var11);
                                hVar.f159000e = p0Var10;
                                hVar.f159005k = i15;
                                hVar.f159011r = 10;
                                if (bVar.c(hVar) != objE) {
                                    h0Var = this.interruptDocumentsAsyncUseCase;
                                    params5 = new h0.Params(this.taskId);
                                    hVar.f158999d = vq.j.a(p0Var11);
                                    hVar.f159000e = p0Var10;
                                    hVar.f159005k = i15;
                                    hVar.f159011r = 11;
                                    if (h0Var.c(params5, hVar) != objE) {
                                        p0Var12 = p0Var10;
                                        i16 = 1;
                                        q0.d(p0Var12, null, i16, null);
                                        return i0.f148189a;
                                    }
                                }
                            } else {
                                h0Var = this.interruptDocumentsAsyncUseCase;
                                params5 = new h0.Params(this.taskId);
                                hVar.f158999d = vq.j.a(p0Var11);
                                hVar.f159000e = p0Var10;
                                hVar.f159005k = i15;
                                hVar.f159011r = 11;
                                if (h0Var.c(params5, hVar) != objE) {
                                    p0Var12 = p0Var10;
                                    i16 = 1;
                                    q0.d(p0Var12, null, i16, null);
                                    return i0.f148189a;
                                }
                            }
                        }
                    } else {
                        w0Var = this.setAsyncDownloadTaskDataCompletedUC;
                        params3 = new w0.Params(this.taskId);
                        hVar.f158999d = vq.j.a(p0Var11);
                        hVar.f159000e = p0Var10;
                        hVar.f159005k = i15;
                        hVar.f159011r = 9;
                        if (w0Var.c(params3, hVar) != objE) {
                            if (this.mainDocumentDownload) {
                                bVar = this.asyncDownloadInteractor;
                                hVar.f158999d = vq.j.a(p0Var11);
                                hVar.f159000e = p0Var10;
                                hVar.f159005k = i15;
                                hVar.f159011r = 10;
                                if (bVar.c(hVar) != objE) {
                                    h0Var = this.interruptDocumentsAsyncUseCase;
                                    params5 = new h0.Params(this.taskId);
                                    hVar.f158999d = vq.j.a(p0Var11);
                                    hVar.f159000e = p0Var10;
                                    hVar.f159005k = i15;
                                    hVar.f159011r = 11;
                                    if (h0Var.c(params5, hVar) != objE) {
                                        p0Var12 = p0Var10;
                                        i16 = 1;
                                        q0.d(p0Var12, null, i16, null);
                                        return i0.f148189a;
                                    }
                                }
                            } else {
                                h0Var = this.interruptDocumentsAsyncUseCase;
                                params5 = new h0.Params(this.taskId);
                                hVar.f158999d = vq.j.a(p0Var11);
                                hVar.f159000e = p0Var10;
                                hVar.f159005k = i15;
                                hVar.f159011r = 11;
                                if (h0Var.c(params5, hVar) != objE) {
                                    p0Var12 = p0Var10;
                                    i16 = 1;
                                    q0.d(p0Var12, null, i16, null);
                                    return i0.f148189a;
                                }
                            }
                        }
                    }
                }
                return objE;
            case 6:
                i15 = hVar.f159005k;
                p0Var4 = (p0) hVar.f159000e;
                p0Var2 = (p0) hVar.f158999d;
                oq.u.b(objC3);
                p0Var6 = p0Var2;
                p0Var7 = p0Var4;
                f0 f0Var15 = this.hasAnyAsyncDownloadErrorUC;
                f0.Params params117 = new f0.Params(this.taskId);
                hVar.f158999d = vq.j.a(p0Var6);
                hVar.f159000e = p0Var7;
                hVar.f159001f = null;
                hVar.f159002g = null;
                hVar.f159003h = null;
                hVar.f159004j = null;
                hVar.f159005k = i15;
                hVar.f159011r = 7;
                objC3 = f0Var15.c(params117, hVar);
                if (objC3 != objE) {
                    p0Var10 = p0Var7;
                    p0Var11 = p0Var6;
                    if (((Boolean) objC3).booleanValue()) {
                        uVar = this.removeAsyncDownloadTaskUC;
                        params4 = new u.Params(this.taskId);
                        hVar.f158999d = vq.j.a(p0Var11);
                        hVar.f159000e = p0Var10;
                        hVar.f159005k = i15;
                        hVar.f159011r = 8;
                        if (uVar.c(params4, hVar) != objE) {
                            if (this.mainDocumentDownload) {
                                bVar = this.asyncDownloadInteractor;
                                hVar.f158999d = vq.j.a(p0Var11);
                                hVar.f159000e = p0Var10;
                                hVar.f159005k = i15;
                                hVar.f159011r = 10;
                                if (bVar.c(hVar) != objE) {
                                    h0Var = this.interruptDocumentsAsyncUseCase;
                                    params5 = new h0.Params(this.taskId);
                                    hVar.f158999d = vq.j.a(p0Var11);
                                    hVar.f159000e = p0Var10;
                                    hVar.f159005k = i15;
                                    hVar.f159011r = 11;
                                    if (h0Var.c(params5, hVar) != objE) {
                                        p0Var12 = p0Var10;
                                        i16 = 1;
                                        q0.d(p0Var12, null, i16, null);
                                        return i0.f148189a;
                                    }
                                }
                            } else {
                                h0Var = this.interruptDocumentsAsyncUseCase;
                                params5 = new h0.Params(this.taskId);
                                hVar.f158999d = vq.j.a(p0Var11);
                                hVar.f159000e = p0Var10;
                                hVar.f159005k = i15;
                                hVar.f159011r = 11;
                                if (h0Var.c(params5, hVar) != objE) {
                                    p0Var12 = p0Var10;
                                    i16 = 1;
                                    q0.d(p0Var12, null, i16, null);
                                    return i0.f148189a;
                                }
                            }
                        }
                    } else {
                        w0Var = this.setAsyncDownloadTaskDataCompletedUC;
                        params3 = new w0.Params(this.taskId);
                        hVar.f158999d = vq.j.a(p0Var11);
                        hVar.f159000e = p0Var10;
                        hVar.f159005k = i15;
                        hVar.f159011r = 9;
                        if (w0Var.c(params3, hVar) != objE) {
                            if (this.mainDocumentDownload) {
                                bVar = this.asyncDownloadInteractor;
                                hVar.f158999d = vq.j.a(p0Var11);
                                hVar.f159000e = p0Var10;
                                hVar.f159005k = i15;
                                hVar.f159011r = 10;
                                if (bVar.c(hVar) != objE) {
                                    h0Var = this.interruptDocumentsAsyncUseCase;
                                    params5 = new h0.Params(this.taskId);
                                    hVar.f158999d = vq.j.a(p0Var11);
                                    hVar.f159000e = p0Var10;
                                    hVar.f159005k = i15;
                                    hVar.f159011r = 11;
                                    if (h0Var.c(params5, hVar) != objE) {
                                        p0Var12 = p0Var10;
                                        i16 = 1;
                                        q0.d(p0Var12, null, i16, null);
                                        return i0.f148189a;
                                    }
                                }
                            } else {
                                h0Var = this.interruptDocumentsAsyncUseCase;
                                params5 = new h0.Params(this.taskId);
                                hVar.f158999d = vq.j.a(p0Var11);
                                hVar.f159000e = p0Var10;
                                hVar.f159005k = i15;
                                hVar.f159011r = 11;
                                if (h0Var.c(params5, hVar) != objE) {
                                    p0Var12 = p0Var10;
                                    i16 = 1;
                                    q0.d(p0Var12, null, i16, null);
                                    return i0.f148189a;
                                }
                            }
                        }
                    }
                }
                return objE;
            case 7:
                i15 = hVar.f159005k;
                p0Var10 = (p0) hVar.f159000e;
                p0Var11 = (p0) hVar.f158999d;
                oq.u.b(objC3);
                if (((Boolean) objC3).booleanValue()) {
                    uVar = this.removeAsyncDownloadTaskUC;
                    params4 = new u.Params(this.taskId);
                    hVar.f158999d = vq.j.a(p0Var11);
                    hVar.f159000e = p0Var10;
                    hVar.f159005k = i15;
                    hVar.f159011r = 8;
                    if (uVar.c(params4, hVar) != objE) {
                        if (this.mainDocumentDownload) {
                            bVar = this.asyncDownloadInteractor;
                            hVar.f158999d = vq.j.a(p0Var11);
                            hVar.f159000e = p0Var10;
                            hVar.f159005k = i15;
                            hVar.f159011r = 10;
                            if (bVar.c(hVar) != objE) {
                                h0Var = this.interruptDocumentsAsyncUseCase;
                                params5 = new h0.Params(this.taskId);
                                hVar.f158999d = vq.j.a(p0Var11);
                                hVar.f159000e = p0Var10;
                                hVar.f159005k = i15;
                                hVar.f159011r = 11;
                                if (h0Var.c(params5, hVar) != objE) {
                                    p0Var12 = p0Var10;
                                    i16 = 1;
                                    q0.d(p0Var12, null, i16, null);
                                    return i0.f148189a;
                                }
                            }
                        } else {
                            h0Var = this.interruptDocumentsAsyncUseCase;
                            params5 = new h0.Params(this.taskId);
                            hVar.f158999d = vq.j.a(p0Var11);
                            hVar.f159000e = p0Var10;
                            hVar.f159005k = i15;
                            hVar.f159011r = 11;
                            if (h0Var.c(params5, hVar) != objE) {
                                p0Var12 = p0Var10;
                                i16 = 1;
                                q0.d(p0Var12, null, i16, null);
                                return i0.f148189a;
                            }
                        }
                    }
                } else {
                    w0Var = this.setAsyncDownloadTaskDataCompletedUC;
                    params3 = new w0.Params(this.taskId);
                    hVar.f158999d = vq.j.a(p0Var11);
                    hVar.f159000e = p0Var10;
                    hVar.f159005k = i15;
                    hVar.f159011r = 9;
                    if (w0Var.c(params3, hVar) != objE) {
                        if (this.mainDocumentDownload) {
                            bVar = this.asyncDownloadInteractor;
                            hVar.f158999d = vq.j.a(p0Var11);
                            hVar.f159000e = p0Var10;
                            hVar.f159005k = i15;
                            hVar.f159011r = 10;
                            if (bVar.c(hVar) != objE) {
                                h0Var = this.interruptDocumentsAsyncUseCase;
                                params5 = new h0.Params(this.taskId);
                                hVar.f158999d = vq.j.a(p0Var11);
                                hVar.f159000e = p0Var10;
                                hVar.f159005k = i15;
                                hVar.f159011r = 11;
                                if (h0Var.c(params5, hVar) != objE) {
                                    p0Var12 = p0Var10;
                                    i16 = 1;
                                    q0.d(p0Var12, null, i16, null);
                                    return i0.f148189a;
                                }
                            }
                        } else {
                            h0Var = this.interruptDocumentsAsyncUseCase;
                            params5 = new h0.Params(this.taskId);
                            hVar.f158999d = vq.j.a(p0Var11);
                            hVar.f159000e = p0Var10;
                            hVar.f159005k = i15;
                            hVar.f159011r = 11;
                            if (h0Var.c(params5, hVar) != objE) {
                                p0Var12 = p0Var10;
                                i16 = 1;
                                q0.d(p0Var12, null, i16, null);
                                return i0.f148189a;
                            }
                        }
                    }
                }
                return objE;
            case 8:
            case 9:
                i15 = hVar.f159005k;
                p0Var10 = (p0) hVar.f159000e;
                p0Var11 = (p0) hVar.f158999d;
                oq.u.b(objC3);
                if (this.mainDocumentDownload) {
                    bVar = this.asyncDownloadInteractor;
                    hVar.f158999d = vq.j.a(p0Var11);
                    hVar.f159000e = p0Var10;
                    hVar.f159005k = i15;
                    hVar.f159011r = 10;
                    if (bVar.c(hVar) != objE) {
                        h0Var = this.interruptDocumentsAsyncUseCase;
                        params5 = new h0.Params(this.taskId);
                        hVar.f158999d = vq.j.a(p0Var11);
                        hVar.f159000e = p0Var10;
                        hVar.f159005k = i15;
                        hVar.f159011r = 11;
                        if (h0Var.c(params5, hVar) != objE) {
                            p0Var12 = p0Var10;
                            i16 = 1;
                            q0.d(p0Var12, null, i16, null);
                            return i0.f148189a;
                        }
                    }
                } else {
                    h0Var = this.interruptDocumentsAsyncUseCase;
                    params5 = new h0.Params(this.taskId);
                    hVar.f158999d = vq.j.a(p0Var11);
                    hVar.f159000e = p0Var10;
                    hVar.f159005k = i15;
                    hVar.f159011r = 11;
                    if (h0Var.c(params5, hVar) != objE) {
                        p0Var12 = p0Var10;
                        i16 = 1;
                        q0.d(p0Var12, null, i16, null);
                        return i0.f148189a;
                    }
                }
                return objE;
            case 10:
                i15 = hVar.f159005k;
                p0Var10 = (p0) hVar.f159000e;
                p0Var11 = (p0) hVar.f158999d;
                oq.u.b(objC3);
                h0Var = this.interruptDocumentsAsyncUseCase;
                params5 = new h0.Params(this.taskId);
                hVar.f158999d = vq.j.a(p0Var11);
                hVar.f159000e = p0Var10;
                hVar.f159005k = i15;
                hVar.f159011r = 11;
                if (h0Var.c(params5, hVar) != objE) {
                    p0Var12 = p0Var10;
                    i16 = 1;
                    q0.d(p0Var12, null, i16, null);
                    return i0.f148189a;
                }
                return objE;
            case 11:
                p0Var12 = (p0) hVar.f159000e;
                oq.u.b(objC3);
                i16 = 1;
                q0.d(p0Var12, null, i16, null);
                return i0.f148189a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:101:0x026c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:110:0x0285 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0287  */
    /* JADX WARN: Code duplicated, block: B:113:0x0291  */
    /* JADX WARN: Code duplicated, block: B:117:0x029c  */
    /* JADX WARN: Code duplicated, block: B:119:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:124:0x02be  */
    /* JADX WARN: Code duplicated, block: B:127:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:128:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:130:0x02d7  */
    /* JADX WARN: Code duplicated, block: B:133:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:138:0x030b  */
    /* JADX WARN: Code duplicated, block: B:143:0x0331  */
    /* JADX WARN: Code duplicated, block: B:44:0x012e  */
    /* JADX WARN: Code duplicated, block: B:45:0x013b  */
    /* JADX WARN: Code duplicated, block: B:47:0x013f  */
    /* JADX WARN: Code duplicated, block: B:50:0x014d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0167  */
    /* JADX WARN: Code duplicated, block: B:56:0x016d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0187  */
    /* JADX WARN: Code duplicated, block: B:62:0x018f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code duplicated, block: B:82:0x021a A[PHI: r3 r9 r10
      0x021a: PHI (r3v19 rq0.b) = (r3v14 rq0.b), (r3v23 rq0.b) binds: [B:80:0x0216, B:16:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x021a: PHI (r9v8 er0.d) = (r9v5 er0.d), (r9v10 er0.d) binds: [B:80:0x0216, B:16:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x021a: PHI (r10v7 fr0.d) = (r10v4 fr0.d), (r10v9 fr0.d) binds: [B:80:0x0216, B:16:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x021e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0224  */
    /* JADX WARN: Code duplicated, block: B:87:0x0229  */
    /* JADX WARN: Code duplicated, block: B:90:0x0232  */
    /* JADX WARN: Code duplicated, block: B:95:0x0258  */
    /* JADX WARN: Code duplicated, block: B:98:0x025d  */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0305, code lost:
    
        if (r0.j(r6, r1) == r2) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x032b, code lost:
    
        if (r0.b(r6, r3, r1) == r2) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01be, code lost:
    
        if (r3.c(r6, r1) == r2) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01f4, code lost:
    
        if (r10.c(r13, r1) == r2) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0251, code lost:
    
        if (r0.h(r4, r1) == r2) goto L140;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q(fr0.BEAsyncDocumentGenerationResult r15, tq.e<? super oq.i0> r16) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 852
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.gov.coi.mobywatel.technical.async.worker.AsyncDownloadDocumentsWorker.Q(fr0.d, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ju.w0<i0> R(p0 p0Var) {
        return ju.k.b(p0Var, g1.b(), null, new j(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:52:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:54:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:55:0x01de  */
    /* JADX WARN: Code duplicated, block: B:57:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:61:0x022e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0274  */
    /* JADX WARN: Code duplicated, block: B:67:0x0278  */
    /* JADX WARN: Code duplicated, block: B:69:0x0285  */
    /* JADX WARN: Code duplicated, block: B:72:0x0290  */
    /* JADX WARN: Code duplicated, block: B:75:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:78:0x030c A[LOOP:0: B:73:0x02a6->B:78:0x030c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0321  */
    /* JADX WARN: Code duplicated, block: B:83:0x032a  */
    /* JADX WARN: Code duplicated, block: B:86:0x0337  */
    /* JADX WARN: Code duplicated, block: B:94:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:97:0x03aa A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0147, code lost:
    
        if (Q(r29, r2) == r3) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0226, code lost:
    
        if (r1 == r3) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x026c, code lost:
    
        if (r1 == r3) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x03a8, code lost:
    
        if (r11.n(r10, r2) == r3) goto L91;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S(fr0.BEAsyncDocumentGenerationResult r29, tq.e<? super oq.i0> r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 966
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.gov.coi.mobywatel.technical.async.worker.AsyncDownloadDocumentsWorker.S(fr0.d, tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f1 A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:19:0x004b, B:89:0x01cb, B:22:0x0053, B:84:0x01b5, B:86:0x01bb, B:92:0x01d0, B:94:0x01d4, B:98:0x01e1, B:100:0x01f1, B:95:0x01d9, B:97:0x01dd, B:102:0x0220, B:103:0x0225, B:104:0x0226, B:105:0x022b, B:25:0x005c, B:45:0x00e8, B:47:0x00ee, B:49:0x0109, B:51:0x010d, B:54:0x011d, B:57:0x0124, B:59:0x0150, B:61:0x0155, B:64:0x015a, B:66:0x0160, B:68:0x0165, B:70:0x0169, B:72:0x0171, B:74:0x0181, B:77:0x0186, B:79:0x0190, B:81:0x01a0, B:106:0x022c, B:107:0x0231, B:28:0x0065, B:35:0x00aa, B:37:0x00b0, B:39:0x00cb, B:41:0x00cf, B:108:0x0232, B:109:0x0237, B:31:0x0094), top: B:117:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:102:0x0220 A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:19:0x004b, B:89:0x01cb, B:22:0x0053, B:84:0x01b5, B:86:0x01bb, B:92:0x01d0, B:94:0x01d4, B:98:0x01e1, B:100:0x01f1, B:95:0x01d9, B:97:0x01dd, B:102:0x0220, B:103:0x0225, B:104:0x0226, B:105:0x022b, B:25:0x005c, B:45:0x00e8, B:47:0x00ee, B:49:0x0109, B:51:0x010d, B:54:0x011d, B:57:0x0124, B:59:0x0150, B:61:0x0155, B:64:0x015a, B:66:0x0160, B:68:0x0165, B:70:0x0169, B:72:0x0171, B:74:0x0181, B:77:0x0186, B:79:0x0190, B:81:0x01a0, B:106:0x022c, B:107:0x0231, B:28:0x0065, B:35:0x00aa, B:37:0x00b0, B:39:0x00cb, B:41:0x00cf, B:108:0x0232, B:109:0x0237, B:31:0x0094), top: B:117:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0226 A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:19:0x004b, B:89:0x01cb, B:22:0x0053, B:84:0x01b5, B:86:0x01bb, B:92:0x01d0, B:94:0x01d4, B:98:0x01e1, B:100:0x01f1, B:95:0x01d9, B:97:0x01dd, B:102:0x0220, B:103:0x0225, B:104:0x0226, B:105:0x022b, B:25:0x005c, B:45:0x00e8, B:47:0x00ee, B:49:0x0109, B:51:0x010d, B:54:0x011d, B:57:0x0124, B:59:0x0150, B:61:0x0155, B:64:0x015a, B:66:0x0160, B:68:0x0165, B:70:0x0169, B:72:0x0171, B:74:0x0181, B:77:0x0186, B:79:0x0190, B:81:0x01a0, B:106:0x022c, B:107:0x0231, B:28:0x0065, B:35:0x00aa, B:37:0x00b0, B:39:0x00cb, B:41:0x00cf, B:108:0x0232, B:109:0x0237, B:31:0x0094), top: B:117:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:106:0x022c A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:19:0x004b, B:89:0x01cb, B:22:0x0053, B:84:0x01b5, B:86:0x01bb, B:92:0x01d0, B:94:0x01d4, B:98:0x01e1, B:100:0x01f1, B:95:0x01d9, B:97:0x01dd, B:102:0x0220, B:103:0x0225, B:104:0x0226, B:105:0x022b, B:25:0x005c, B:45:0x00e8, B:47:0x00ee, B:49:0x0109, B:51:0x010d, B:54:0x011d, B:57:0x0124, B:59:0x0150, B:61:0x0155, B:64:0x015a, B:66:0x0160, B:68:0x0165, B:70:0x0169, B:72:0x0171, B:74:0x0181, B:77:0x0186, B:79:0x0190, B:81:0x01a0, B:106:0x022c, B:107:0x0231, B:28:0x0065, B:35:0x00aa, B:37:0x00b0, B:39:0x00cb, B:41:0x00cf, B:108:0x0232, B:109:0x0237, B:31:0x0094), top: B:117:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00ee A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:19:0x004b, B:89:0x01cb, B:22:0x0053, B:84:0x01b5, B:86:0x01bb, B:92:0x01d0, B:94:0x01d4, B:98:0x01e1, B:100:0x01f1, B:95:0x01d9, B:97:0x01dd, B:102:0x0220, B:103:0x0225, B:104:0x0226, B:105:0x022b, B:25:0x005c, B:45:0x00e8, B:47:0x00ee, B:49:0x0109, B:51:0x010d, B:54:0x011d, B:57:0x0124, B:59:0x0150, B:61:0x0155, B:64:0x015a, B:66:0x0160, B:68:0x0165, B:70:0x0169, B:72:0x0171, B:74:0x0181, B:77:0x0186, B:79:0x0190, B:81:0x01a0, B:106:0x022c, B:107:0x0231, B:28:0x0065, B:35:0x00aa, B:37:0x00b0, B:39:0x00cb, B:41:0x00cf, B:108:0x0232, B:109:0x0237, B:31:0x0094), top: B:117:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0109 A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:19:0x004b, B:89:0x01cb, B:22:0x0053, B:84:0x01b5, B:86:0x01bb, B:92:0x01d0, B:94:0x01d4, B:98:0x01e1, B:100:0x01f1, B:95:0x01d9, B:97:0x01dd, B:102:0x0220, B:103:0x0225, B:104:0x0226, B:105:0x022b, B:25:0x005c, B:45:0x00e8, B:47:0x00ee, B:49:0x0109, B:51:0x010d, B:54:0x011d, B:57:0x0124, B:59:0x0150, B:61:0x0155, B:64:0x015a, B:66:0x0160, B:68:0x0165, B:70:0x0169, B:72:0x0171, B:74:0x0181, B:77:0x0186, B:79:0x0190, B:81:0x01a0, B:106:0x022c, B:107:0x0231, B:28:0x0065, B:35:0x00aa, B:37:0x00b0, B:39:0x00cb, B:41:0x00cf, B:108:0x0232, B:109:0x0237, B:31:0x0094), top: B:117:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:51:0x010d A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:19:0x004b, B:89:0x01cb, B:22:0x0053, B:84:0x01b5, B:86:0x01bb, B:92:0x01d0, B:94:0x01d4, B:98:0x01e1, B:100:0x01f1, B:95:0x01d9, B:97:0x01dd, B:102:0x0220, B:103:0x0225, B:104:0x0226, B:105:0x022b, B:25:0x005c, B:45:0x00e8, B:47:0x00ee, B:49:0x0109, B:51:0x010d, B:54:0x011d, B:57:0x0124, B:59:0x0150, B:61:0x0155, B:64:0x015a, B:66:0x0160, B:68:0x0165, B:70:0x0169, B:72:0x0171, B:74:0x0181, B:77:0x0186, B:79:0x0190, B:81:0x01a0, B:106:0x022c, B:107:0x0231, B:28:0x0065, B:35:0x00aa, B:37:0x00b0, B:39:0x00cb, B:41:0x00cf, B:108:0x0232, B:109:0x0237, B:31:0x0094), top: B:117:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:53:0x011c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0123  */
    /* JADX WARN: Code duplicated, block: B:59:0x0150 A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:19:0x004b, B:89:0x01cb, B:22:0x0053, B:84:0x01b5, B:86:0x01bb, B:92:0x01d0, B:94:0x01d4, B:98:0x01e1, B:100:0x01f1, B:95:0x01d9, B:97:0x01dd, B:102:0x0220, B:103:0x0225, B:104:0x0226, B:105:0x022b, B:25:0x005c, B:45:0x00e8, B:47:0x00ee, B:49:0x0109, B:51:0x010d, B:54:0x011d, B:57:0x0124, B:59:0x0150, B:61:0x0155, B:64:0x015a, B:66:0x0160, B:68:0x0165, B:70:0x0169, B:72:0x0171, B:74:0x0181, B:77:0x0186, B:79:0x0190, B:81:0x01a0, B:106:0x022c, B:107:0x0231, B:28:0x0065, B:35:0x00aa, B:37:0x00b0, B:39:0x00cb, B:41:0x00cf, B:108:0x0232, B:109:0x0237, B:31:0x0094), top: B:117:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0155 A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:19:0x004b, B:89:0x01cb, B:22:0x0053, B:84:0x01b5, B:86:0x01bb, B:92:0x01d0, B:94:0x01d4, B:98:0x01e1, B:100:0x01f1, B:95:0x01d9, B:97:0x01dd, B:102:0x0220, B:103:0x0225, B:104:0x0226, B:105:0x022b, B:25:0x005c, B:45:0x00e8, B:47:0x00ee, B:49:0x0109, B:51:0x010d, B:54:0x011d, B:57:0x0124, B:59:0x0150, B:61:0x0155, B:64:0x015a, B:66:0x0160, B:68:0x0165, B:70:0x0169, B:72:0x0171, B:74:0x0181, B:77:0x0186, B:79:0x0190, B:81:0x01a0, B:106:0x022c, B:107:0x0231, B:28:0x0065, B:35:0x00aa, B:37:0x00b0, B:39:0x00cb, B:41:0x00cf, B:108:0x0232, B:109:0x0237, B:31:0x0094), top: B:117:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0159  */
    /* JADX WARN: Code duplicated, block: B:66:0x0160 A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:19:0x004b, B:89:0x01cb, B:22:0x0053, B:84:0x01b5, B:86:0x01bb, B:92:0x01d0, B:94:0x01d4, B:98:0x01e1, B:100:0x01f1, B:95:0x01d9, B:97:0x01dd, B:102:0x0220, B:103:0x0225, B:104:0x0226, B:105:0x022b, B:25:0x005c, B:45:0x00e8, B:47:0x00ee, B:49:0x0109, B:51:0x010d, B:54:0x011d, B:57:0x0124, B:59:0x0150, B:61:0x0155, B:64:0x015a, B:66:0x0160, B:68:0x0165, B:70:0x0169, B:72:0x0171, B:74:0x0181, B:77:0x0186, B:79:0x0190, B:81:0x01a0, B:106:0x022c, B:107:0x0231, B:28:0x0065, B:35:0x00aa, B:37:0x00b0, B:39:0x00cb, B:41:0x00cf, B:108:0x0232, B:109:0x0237, B:31:0x0094), top: B:117:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0165 A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:19:0x004b, B:89:0x01cb, B:22:0x0053, B:84:0x01b5, B:86:0x01bb, B:92:0x01d0, B:94:0x01d4, B:98:0x01e1, B:100:0x01f1, B:95:0x01d9, B:97:0x01dd, B:102:0x0220, B:103:0x0225, B:104:0x0226, B:105:0x022b, B:25:0x005c, B:45:0x00e8, B:47:0x00ee, B:49:0x0109, B:51:0x010d, B:54:0x011d, B:57:0x0124, B:59:0x0150, B:61:0x0155, B:64:0x015a, B:66:0x0160, B:68:0x0165, B:70:0x0169, B:72:0x0171, B:74:0x0181, B:77:0x0186, B:79:0x0190, B:81:0x01a0, B:106:0x022c, B:107:0x0231, B:28:0x0065, B:35:0x00aa, B:37:0x00b0, B:39:0x00cb, B:41:0x00cf, B:108:0x0232, B:109:0x0237, B:31:0x0094), top: B:117:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0185  */
    /* JADX WARN: Code duplicated, block: B:79:0x0190 A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:19:0x004b, B:89:0x01cb, B:22:0x0053, B:84:0x01b5, B:86:0x01bb, B:92:0x01d0, B:94:0x01d4, B:98:0x01e1, B:100:0x01f1, B:95:0x01d9, B:97:0x01dd, B:102:0x0220, B:103:0x0225, B:104:0x0226, B:105:0x022b, B:25:0x005c, B:45:0x00e8, B:47:0x00ee, B:49:0x0109, B:51:0x010d, B:54:0x011d, B:57:0x0124, B:59:0x0150, B:61:0x0155, B:64:0x015a, B:66:0x0160, B:68:0x0165, B:70:0x0169, B:72:0x0171, B:74:0x0181, B:77:0x0186, B:79:0x0190, B:81:0x01a0, B:106:0x022c, B:107:0x0231, B:28:0x0065, B:35:0x00aa, B:37:0x00b0, B:39:0x00cb, B:41:0x00cf, B:108:0x0232, B:109:0x0237, B:31:0x0094), top: B:117:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x01a0 A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:19:0x004b, B:89:0x01cb, B:22:0x0053, B:84:0x01b5, B:86:0x01bb, B:92:0x01d0, B:94:0x01d4, B:98:0x01e1, B:100:0x01f1, B:95:0x01d9, B:97:0x01dd, B:102:0x0220, B:103:0x0225, B:104:0x0226, B:105:0x022b, B:25:0x005c, B:45:0x00e8, B:47:0x00ee, B:49:0x0109, B:51:0x010d, B:54:0x011d, B:57:0x0124, B:59:0x0150, B:61:0x0155, B:64:0x015a, B:66:0x0160, B:68:0x0165, B:70:0x0169, B:72:0x0171, B:74:0x0181, B:77:0x0186, B:79:0x0190, B:81:0x01a0, B:106:0x022c, B:107:0x0231, B:28:0x0065, B:35:0x00aa, B:37:0x00b0, B:39:0x00cb, B:41:0x00cf, B:108:0x0232, B:109:0x0237, B:31:0x0094), top: B:117:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:83:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b5 A[Catch: Exception -> 0x0050, PHI: r0
      0x01b5: PHI (r0v62 java.lang.Object) = (r0v46 java.lang.Object), (r0v1 java.lang.Object) binds: [B:82:0x01b1, B:22:0x0053] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0050, blocks: (B:19:0x004b, B:89:0x01cb, B:22:0x0053, B:84:0x01b5, B:86:0x01bb, B:92:0x01d0, B:94:0x01d4, B:98:0x01e1, B:100:0x01f1, B:95:0x01d9, B:97:0x01dd, B:102:0x0220, B:103:0x0225, B:104:0x0226, B:105:0x022b, B:25:0x005c, B:45:0x00e8, B:47:0x00ee, B:49:0x0109, B:51:0x010d, B:54:0x011d, B:57:0x0124, B:59:0x0150, B:61:0x0155, B:64:0x015a, B:66:0x0160, B:68:0x0165, B:70:0x0169, B:72:0x0171, B:74:0x0181, B:77:0x0186, B:79:0x0190, B:81:0x01a0, B:106:0x022c, B:107:0x0231, B:28:0x0065, B:35:0x00aa, B:37:0x00b0, B:39:0x00cb, B:41:0x00cf, B:108:0x0232, B:109:0x0237, B:31:0x0094), top: B:117:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:86:0x01bb A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:19:0x004b, B:89:0x01cb, B:22:0x0053, B:84:0x01b5, B:86:0x01bb, B:92:0x01d0, B:94:0x01d4, B:98:0x01e1, B:100:0x01f1, B:95:0x01d9, B:97:0x01dd, B:102:0x0220, B:103:0x0225, B:104:0x0226, B:105:0x022b, B:25:0x005c, B:45:0x00e8, B:47:0x00ee, B:49:0x0109, B:51:0x010d, B:54:0x011d, B:57:0x0124, B:59:0x0150, B:61:0x0155, B:64:0x015a, B:66:0x0160, B:68:0x0165, B:70:0x0169, B:72:0x0171, B:74:0x0181, B:77:0x0186, B:79:0x0190, B:81:0x01a0, B:106:0x022c, B:107:0x0231, B:28:0x0065, B:35:0x00aa, B:37:0x00b0, B:39:0x00cb, B:41:0x00cf, B:108:0x0232, B:109:0x0237, B:31:0x0094), top: B:117:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:88:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x01d0 A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:19:0x004b, B:89:0x01cb, B:22:0x0053, B:84:0x01b5, B:86:0x01bb, B:92:0x01d0, B:94:0x01d4, B:98:0x01e1, B:100:0x01f1, B:95:0x01d9, B:97:0x01dd, B:102:0x0220, B:103:0x0225, B:104:0x0226, B:105:0x022b, B:25:0x005c, B:45:0x00e8, B:47:0x00ee, B:49:0x0109, B:51:0x010d, B:54:0x011d, B:57:0x0124, B:59:0x0150, B:61:0x0155, B:64:0x015a, B:66:0x0160, B:68:0x0165, B:70:0x0169, B:72:0x0171, B:74:0x0181, B:77:0x0186, B:79:0x0190, B:81:0x01a0, B:106:0x022c, B:107:0x0231, B:28:0x0065, B:35:0x00aa, B:37:0x00b0, B:39:0x00cb, B:41:0x00cf, B:108:0x0232, B:109:0x0237, B:31:0x0094), top: B:117:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01d4 A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:19:0x004b, B:89:0x01cb, B:22:0x0053, B:84:0x01b5, B:86:0x01bb, B:92:0x01d0, B:94:0x01d4, B:98:0x01e1, B:100:0x01f1, B:95:0x01d9, B:97:0x01dd, B:102:0x0220, B:103:0x0225, B:104:0x0226, B:105:0x022b, B:25:0x005c, B:45:0x00e8, B:47:0x00ee, B:49:0x0109, B:51:0x010d, B:54:0x011d, B:57:0x0124, B:59:0x0150, B:61:0x0155, B:64:0x015a, B:66:0x0160, B:68:0x0165, B:70:0x0169, B:72:0x0171, B:74:0x0181, B:77:0x0186, B:79:0x0190, B:81:0x01a0, B:106:0x022c, B:107:0x0231, B:28:0x0065, B:35:0x00aa, B:37:0x00b0, B:39:0x00cb, B:41:0x00cf, B:108:0x0232, B:109:0x0237, B:31:0x0094), top: B:117:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:95:0x01d9 A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:19:0x004b, B:89:0x01cb, B:22:0x0053, B:84:0x01b5, B:86:0x01bb, B:92:0x01d0, B:94:0x01d4, B:98:0x01e1, B:100:0x01f1, B:95:0x01d9, B:97:0x01dd, B:102:0x0220, B:103:0x0225, B:104:0x0226, B:105:0x022b, B:25:0x005c, B:45:0x00e8, B:47:0x00ee, B:49:0x0109, B:51:0x010d, B:54:0x011d, B:57:0x0124, B:59:0x0150, B:61:0x0155, B:64:0x015a, B:66:0x0160, B:68:0x0165, B:70:0x0169, B:72:0x0171, B:74:0x0181, B:77:0x0186, B:79:0x0190, B:81:0x01a0, B:106:0x022c, B:107:0x0231, B:28:0x0065, B:35:0x00aa, B:37:0x00b0, B:39:0x00cb, B:41:0x00cf, B:108:0x0232, B:109:0x0237, B:31:0x0094), top: B:117:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:97:0x01dd A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:19:0x004b, B:89:0x01cb, B:22:0x0053, B:84:0x01b5, B:86:0x01bb, B:92:0x01d0, B:94:0x01d4, B:98:0x01e1, B:100:0x01f1, B:95:0x01d9, B:97:0x01dd, B:102:0x0220, B:103:0x0225, B:104:0x0226, B:105:0x022b, B:25:0x005c, B:45:0x00e8, B:47:0x00ee, B:49:0x0109, B:51:0x010d, B:54:0x011d, B:57:0x0124, B:59:0x0150, B:61:0x0155, B:64:0x015a, B:66:0x0160, B:68:0x0165, B:70:0x0169, B:72:0x0171, B:74:0x0181, B:77:0x0186, B:79:0x0190, B:81:0x01a0, B:106:0x022c, B:107:0x0231, B:28:0x0065, B:35:0x00aa, B:37:0x00b0, B:39:0x00cb, B:41:0x00cf, B:108:0x0232, B:109:0x0237, B:31:0x0094), top: B:117:0x002a }] */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x027f, code lost:
    
        if (r4.c(r5, r2) == r3) goto L114;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:100:0x01f1, please report this as an issue */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(tq.e<? super androidx.work.c.a> r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pl.gov.coi.mobywatel.technical.async.worker.AsyncDownloadDocumentsWorker.k(tq.e):java.lang.Object");
    }
}
