package oz3;

import er.l;
import fr.t;
import fr0.BEAsyncDocumentGenerationResult;
import iy.b0;
import java.util.Map;
import lr0.f;
import lr0.g;
import lr0.h;
import lr0.i;
import lz3.DocumentDownloadSingleStatus;
import lz3.DocumentDownloadStatus;
import mu.a0;
import mu.h0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00190\u00180\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u001f\u0010 J,\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020!H\u0096@¢\u0006\u0004\b#\u0010$J,\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00140\u001c2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010%\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b&\u0010'J\u0015\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u0017H\u0016¢\u0006\u0004\b)\u0010\u001bJ\u0018\u0010,\u001a\u00020\u00142\u0006\u0010+\u001a\u00020*H\u0096@¢\u0006\u0004\b,\u0010-J*\u00101\u001a\u00020\u00142\u0006\u0010.\u001a\u00020(2\u0006\u0010+\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0012H\u0096@¢\u0006\u0004\b1\u00102J\u001a\u00104\u001a\u0004\u0018\u0001032\u0006\u0010.\u001a\u00020(H\u0096@¢\u0006\u0004\b4\u00105J\u001c\u00106\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u0002030\u0018H\u0096@¢\u0006\u0004\b6\u00107J\u0018\u00108\u001a\u00020\u00142\u0006\u0010+\u001a\u00020/H\u0096@¢\u0006\u0004\b8\u00109J*\u0010<\u001a\u00020\u00142\u0006\u0010.\u001a\u00020(2\u0006\u0010;\u001a\u00020:2\b\u00100\u001a\u0004\u0018\u00010\u0012H\u0096@¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b>\u00107J\u0018\u0010@\u001a\u00020\u00142\u0006\u0010?\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b@\u0010 R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010AR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010BR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010CR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010DR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010ER\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010FR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010GR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020(0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010I¨\u0006K"}, d2 = {"Loz3/c;", "Lsz3/a;", "Lpl/gov/coi/mobywatel/technical/async/data/storage/d;", "documentsDownloadStatusDataSource", "Llr0/b;", "bEDownloadDocumentsUC", "Llr0/c;", "bEDownloadMainDocumentsUC", "Llr0/f;", "bEInterruptDownloadDocumentsUC", "Llr0/g;", "bEMonitorDocumentsUC", "Llr0/i;", "bETerminateDocumentDownloadUC", "Llr0/h;", "bEOnTaskDownloadedUC", "<init>", "(Lpl/gov/coi/mobywatel/technical/async/data/storage/d;Llr0/b;Llr0/c;Llr0/f;Llr0/g;Llr0/i;Llr0/h;)V", "", "taskId", "Loq/i0;", "a", "(Ljava/lang/String;)V", "Lmu/g;", "", "Lfr0/d;", "c", "()Lmu/g;", "Ldx/i;", "Ldx/b;", "Lfr0/a;", "e", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Liy/b0;", "authToken", "f", "(Ljava/lang/String;Liy/b0;Ltq/e;)Ljava/lang/Object;", "documentId", "b", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lrq0/b;", "m", "Llz3/e;", "status", "h", "(Llz3/e;Ltq/e;)Ljava/lang/Object;", "documentType", "Llz3/h;", "documentIID", "k", "(Lrq0/b;Llz3/h;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Llz3/f;", "n", "(Lrq0/b;Ltq/e;)Ljava/lang/Object;", "i", "(Ltq/e;)Ljava/lang/Object;", "j", "(Llz3/h;Ltq/e;)Ljava/lang/Object;", "", "emitInfo", "l", "(Lrq0/b;ZLjava/lang/String;Ltq/e;)Ljava/lang/Object;", "g", "task", "d", "Lpl/gov/coi/mobywatel/technical/async/data/storage/d;", "Llr0/b;", "Llr0/c;", "Llr0/f;", "Llr0/g;", "Llr0/i;", "Llr0/h;", "Lmu/a0;", "Lmu/a0;", "downloadStatusChange", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements sz3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final pl.gov.coi.mobywatel.technical.async.data.storage.d documentsDownloadStatusDataSource;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final lr0.b bEDownloadDocumentsUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final lr0.c bEDownloadMainDocumentsUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final f bEInterruptDownloadDocumentsUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final g bEMonitorDocumentsUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final i bETerminateDocumentDownloadUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final h bEOnTaskDownloadedUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final a0<rq0.b> downloadStatusChange = h0.b(0, 0, null, 7, null);

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f150790d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f150791e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f150792f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f150793g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f150795j;

        a(e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f150793g = obj;
            this.f150795j |= PKIFailureInfo.systemUnavail;
            return c.this.h(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f150796d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f150797e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f150798f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f150799g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f150800h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f150801j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f150802k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f150803l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f150804m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f150805n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f150806p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f150807q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f150808r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f150809s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f150811v;

        b(e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f150809s = obj;
            this.f150811v |= PKIFailureInfo.systemUnavail;
            return c.this.j(null, this);
        }
    }

    /* JADX INFO: renamed from: oz3.c$c, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C3721c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f150812d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f150813e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f150814f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f150815g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f150816h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f150817j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f150818k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f150820m;

        C3721c(e<? super C3721c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f150818k = obj;
            this.f150820m |= PKIFailureInfo.systemUnavail;
            return c.this.l(null, false, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f150821d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f150822e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f150823f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f150824g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f150825h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f150826j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f150828l;

        d(e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f150826j = obj;
            this.f150828l |= PKIFailureInfo.systemUnavail;
            return c.this.k(null, null, null, this);
        }
    }

    public c(pl.gov.coi.mobywatel.technical.async.data.storage.d dVar, lr0.b bVar, lr0.c cVar, f fVar, g gVar, i iVar, h hVar) {
        this.documentsDownloadStatusDataSource = dVar;
        this.bEDownloadDocumentsUC = bVar;
        this.bEDownloadMainDocumentsUC = cVar;
        this.bEInterruptDownloadDocumentsUC = fVar;
        this.bEMonitorDocumentsUC = gVar;
        this.bETerminateDocumentDownloadUC = iVar;
        this.bEOnTaskDownloadedUC = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(String str, DocumentDownloadSingleStatus documentDownloadSingleStatus) {
        return t.c(documentDownloadSingleStatus.getDocumentIID(), str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean r(l lVar, Object obj) {
        return ((Boolean) lVar.b(obj)).booleanValue();
    }

    @Override // sz3.a
    public void a(String taskId) {
        this.bEInterruptDownloadDocumentsUC.a(new f.Params(taskId));
    }

    @Override // sz3.a
    public Object b(String str, String str2, e<? super dx.i<? extends dx.b, i0>> eVar) {
        return this.bETerminateDocumentDownloadUC.c(new i.Params(str, str2), eVar);
    }

    @Override // sz3.a
    public mu.g<Map<String, BEAsyncDocumentGenerationResult>> c() {
        return (mu.g) this.bEMonitorDocumentsUC.a(gz.b.a.C1792a.f78542a);
    }

    @Override // sz3.a
    public Object d(String str, e<? super i0> eVar) {
        Object objC = this.bEOnTaskDownloadedUC.c(new h.Params(str), eVar);
        return objC == uq.b.e() ? objC : i0.f148189a;
    }

    @Override // sz3.a
    public Object e(String str, e<? super dx.i<? extends dx.b, ? extends fr0.a>> eVar) {
        return this.bEDownloadDocumentsUC.c(new lr0.b.Params(str), eVar);
    }

    @Override // sz3.a
    public Object f(String str, b0 b0Var, e<? super dx.i<? extends dx.b, ? extends fr0.a>> eVar) {
        return this.bEDownloadMainDocumentsUC.c(new lr0.c.Params(str, b0Var), eVar);
    }

    @Override // sz3.a
    public Object g(e<? super i0> eVar) {
        Object objG = this.documentsDownloadStatusDataSource.g(eVar);
        return objG == uq.b.e() ? objG : i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cc, code lost:
    
        if (r11.F(r5, r0) == r1) goto L30;
     */
    @Override // sz3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(lz3.DocumentDownloadSingleStatus r10, tq.e<? super oq.i0> r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oz3.c.h(lz3.e, tq.e):java.lang.Object");
    }

    @Override // sz3.a
    public Object i(e<? super Map<rq0.b, DocumentDownloadStatus>> eVar) {
        return this.documentsDownloadStatusDataSource.j(eVar);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x008e  */
    /* JADX WARN: Code duplicated, block: B:25:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:27:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:30:0x0105  */
    /* JADX WARN: Code duplicated, block: B:32:0x0120  */
    /* JADX WARN: Code duplicated, block: B:34:0x012d  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008e -> B:23:0x00ab). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x0105 -> B:31:0x0111). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0120 -> B:33:0x0126). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // sz3.a
    public java.lang.Object j(lz3.h r19, tq.e<? super oq.i0> r20) {
        /*
            Method dump skipped, instruction units count: 310
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oz3.c.j(lz3.h, tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0126, code lost:
    
        if (r15.F(r4, r0) == r1) goto L43;
     */
    @Override // sz3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(rq0.b r12, lz3.h r13, java.lang.String r14, tq.e<? super oq.i0> r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oz3.c.k(rq0.b, lz3.h, java.lang.String, tq.e):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x009a  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:37:0x00da  */
    /* JADX WARN: Code duplicated, block: B:42:0x0122  */
    /* JADX WARN: Code duplicated, block: B:45:0x0140 A[DONT_INVERT, PHI: r9 r10 r11
      0x0140: PHI (r9v17 rq0.b) = (r9v11 rq0.b), (r9v21 rq0.b) binds: [B:34:0x00cd, B:41:0x011d] A[DONT_GENERATE, DONT_INLINE]
      0x0140: PHI (r10v9 boolean) = (r10v4 boolean), (r10v12 boolean) binds: [B:34:0x00cd, B:41:0x011d] A[DONT_GENERATE, DONT_INLINE]
      0x0140: PHI (r11v9 java.lang.String) = (r11v5 java.lang.String), (r11v13 java.lang.String) binds: [B:34:0x00cd, B:41:0x011d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:46:0x0142  */
    /* JADX WARN: Code duplicated, block: B:51:0x0164  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b1, code lost:
    
        if (r12.F(r9, r0) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0116, code lost:
    
        if (r3.i(r9, r5, r0) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0119, code lost:
    
        r7 = r11;
        r11 = r9;
        r9 = r10;
        r10 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x013d, code lost:
    
        if (r2.k(r9, r0) == r1) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x015e, code lost:
    
        if (r12.F(r9, r0) == r1) goto L48;
     */
    @Override // sz3.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object l(rq0.b r9, boolean r10, final java.lang.String r11, tq.e<? super oq.i0> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oz3.c.l(rq0.b, boolean, java.lang.String, tq.e):java.lang.Object");
    }

    @Override // sz3.a
    public mu.g<rq0.b> m() {
        return this.downloadStatusChange;
    }

    @Override // sz3.a
    public Object n(rq0.b bVar, e<? super DocumentDownloadStatus> eVar) {
        return this.documentsDownloadStatusDataSource.h(bVar, eVar);
    }
}
