package ch1;

import java.util.concurrent.CancellationException;
import lz3.DownloadTaskData;
import lz3.TaskIncludedDocumentData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019¨\u0006\u001a"}, d2 = {"Lch1/o0;", "Lch1/n0;", "Lmz3/j;", "generateDocumentsAsyncUseCase", "Lmz3/k;", "generateMainDocumentsAsyncUC", "Lmz3/g;", "cleanupDocumentDownloadDataUC", "Lmz3/p;", "getDocumentAsyncDownloadTaskDataUC", "<init>", "(Lmz3/j;Lmz3/k;Lmz3/g;Lmz3/p;)V", "Lch1/n0$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Lch1/n0$a;Ltq/e;)Ljava/lang/Object;", "a", "Lmz3/j;", "b", "Lmz3/k;", "c", "Lmz3/g;", "Lmz3/p;", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o0 implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mz3.j generateDocumentsAsyncUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mz3.k generateMainDocumentsAsyncUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mz3.g cleanupDocumentDownloadDataUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mz3.p getDocumentAsyncDownloadTaskDataUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26986a;

        static {
            int[] iArr = new int[lz3.d.values().length];
            try {
                iArr[lz3.d.DOCUMENT_REDOWNLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[lz3.d.DOCUMENT_UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[lz3.d.FIRST_DOWNLOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f26986a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f26987d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f26988e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f26989f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f26990g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f26991h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f26992j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f26993k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f26994l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f26995m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f26996n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f26997p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f26999r;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f26997p = obj;
            this.f26999r |= PKIFailureInfo.systemUnavail;
            return o0.this.c(null, this);
        }
    }

    public o0(mz3.j jVar, mz3.k kVar, mz3.g gVar, mz3.p pVar) {
        this.generateDocumentsAsyncUseCase = jVar;
        this.generateMainDocumentsAsyncUC = kVar;
        this.cleanupDocumentDownloadDataUC = gVar;
        this.getDocumentAsyncDownloadTaskDataUC = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0286  */
    /* JADX WARN: Code duplicated, block: B:104:0x0297  */
    /* JADX WARN: Code duplicated, block: B:105:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:107:0x02a9  */
    /* JADX WARN: Code duplicated, block: B:110:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:53:0x016b  */
    /* JADX WARN: Code duplicated, block: B:54:0x016d  */
    /* JADX WARN: Code duplicated, block: B:57:0x017a A[Catch: Exception -> 0x00d7, c -> 0x00db, CancellationException -> 0x00df, TryCatch #9 {c -> 0x00db, CancellationException -> 0x00df, Exception -> 0x00d7, blocks: (B:55:0x0170, B:57:0x017a, B:59:0x019a, B:61:0x01a0, B:68:0x01db, B:74:0x01f1, B:82:0x022d, B:75:0x0203, B:76:0x0208, B:77:0x0209, B:79:0x0221, B:81:0x0227, B:38:0x00c8, B:51:0x012e), top: B:115:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x019a A[Catch: Exception -> 0x00d7, c -> 0x00db, CancellationException -> 0x00df, TryCatch #9 {c -> 0x00db, CancellationException -> 0x00df, Exception -> 0x00d7, blocks: (B:55:0x0170, B:57:0x017a, B:59:0x019a, B:61:0x01a0, B:68:0x01db, B:74:0x01f1, B:82:0x022d, B:75:0x0203, B:76:0x0208, B:77:0x0209, B:79:0x0221, B:81:0x0227, B:38:0x00c8, B:51:0x012e), top: B:115:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x019f  */
    /* JADX WARN: Code duplicated, block: B:64:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:70:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:77:0x0209 A[Catch: Exception -> 0x00d7, c -> 0x00db, CancellationException -> 0x00df, TryCatch #9 {c -> 0x00db, CancellationException -> 0x00df, Exception -> 0x00d7, blocks: (B:55:0x0170, B:57:0x017a, B:59:0x019a, B:61:0x01a0, B:68:0x01db, B:74:0x01f1, B:82:0x022d, B:75:0x0203, B:76:0x0208, B:77:0x0209, B:79:0x0221, B:81:0x0227, B:38:0x00c8, B:51:0x012e), top: B:115:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x0221 A[Catch: Exception -> 0x00d7, c -> 0x00db, CancellationException -> 0x00df, TryCatch #9 {c -> 0x00db, CancellationException -> 0x00df, Exception -> 0x00d7, blocks: (B:55:0x0170, B:57:0x017a, B:59:0x019a, B:61:0x01a0, B:68:0x01db, B:74:0x01f1, B:82:0x022d, B:75:0x0203, B:76:0x0208, B:77:0x0209, B:79:0x0221, B:81:0x0227, B:38:0x00c8, B:51:0x012e), top: B:115:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0226  */
    /* JADX WARN: Code duplicated, block: B:85:0x025b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v7 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(n0.Params params, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        b bVar;
        String message;
        dx.i iVarA;
        Object objB;
        ex.b aVar;
        dx.j<dx.b> jVar;
        n0.Params params2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        ex.b bVar2;
        ex.b bVar3;
        DownloadTaskData downloadTaskData;
        mz3.g gVar;
        ex.b bVar4;
        mz3.g.Params params3;
        ex.b bVar5;
        ex.b bVar6;
        int i25;
        DownloadTaskData downloadTaskData2;
        int i26;
        TaskIncludedDocumentData taskIncludedDocumentData;
        String mainDocumentId;
        gz.b.a updateDocument;
        TaskIncludedDocumentData taskIncludedDocumentData2;
        String mainDocumentId2;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i27 = bVar.f26999r;
            if ((i27 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f26999r = i27 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f26997p;
        ?? E = uq.b.e();
        int i28 = bVar.f26999r;
        try {
            try {
                try {
                    if (i28 == 0) {
                        oq.u.b(objC);
                        dx.j<dx.b> jVarA = xw.c.f221622a.a();
                        try {
                            aVar = new ex.a();
                            mz3.p pVar = this.getDocumentAsyncDownloadTaskDataUC;
                            mz3.p.Params params4 = new mz3.p.Params(params.getDocumentType());
                            bVar.f26987d = params;
                            bVar.f26988e = jVarA;
                            bVar.f26989f = vq.j.a(aVar);
                            bVar.f26990g = vq.j.a(aVar);
                            bVar.f26991h = aVar;
                            bVar.f26992j = 0;
                            bVar.f26993k = 0;
                            bVar.f26994l = 0;
                            bVar.f26995m = 0;
                            bVar.f26996n = 0;
                            bVar.f26999r = 1;
                            objC = pVar.c(params4, bVar);
                            if (objC != E) {
                                jVar = jVarA;
                                params2 = params;
                                i15 = 0;
                                i16 = 0;
                                i17 = 0;
                                i18 = 0;
                                i19 = 0;
                                bVar2 = aVar;
                                bVar3 = bVar2;
                                downloadTaskData = (DownloadTaskData) aVar.a((dx.i) objC);
                                gVar = this.cleanupDocumentDownloadDataUC;
                                bVar4 = bVar2;
                                bVar5 = bVar3;
                                params3 = new mz3.g.Params(params2.getDocumentType(), null, true);
                                bVar.f26987d = params2;
                                bVar.f26988e = jVar;
                                bVar.f26989f = vq.j.a(bVar4);
                                bVar.f26990g = vq.j.a(bVar5);
                                bVar.f26991h = downloadTaskData;
                                bVar.f26992j = i19;
                                bVar.f26993k = i18;
                                bVar.f26994l = i16;
                                bVar.f26995m = i17;
                                bVar.f26996n = i15;
                                bVar.f26999r = 2;
                                if (gVar.c(params3, bVar) == E) {
                                    bVar6 = bVar4;
                                    i25 = i16;
                                    if (params2.getDocumentType().e()) {
                                        mz3.k kVar = this.generateMainDocumentsAsyncUC;
                                        rq0.b documentType = params2.getDocumentType();
                                        lz3.d documentDownloadMethod = downloadTaskData.getDocumentDownloadMethod();
                                        DownloadTaskData downloadTaskData3 = downloadTaskData;
                                        ex.b bVar7 = bVar6;
                                        taskIncludedDocumentData2 = downloadTaskData3.d().get(params2.getDocumentType());
                                        if (taskIncludedDocumentData2 != null) {
                                            mainDocumentId2 = taskIncludedDocumentData2.getMainDocumentId();
                                        } else {
                                            mainDocumentId2 = null;
                                        }
                                        mz3.k.Params params5 = new mz3.k.Params(documentType, documentDownloadMethod, mainDocumentId2);
                                        bVar.f26987d = vq.j.a(params2);
                                        bVar.f26988e = jVar;
                                        bVar.f26989f = vq.j.a(bVar7);
                                        bVar.f26990g = vq.j.a(bVar5);
                                        bVar.f26991h = vq.j.a(downloadTaskData3);
                                        bVar.f26992j = i19;
                                        bVar.f26993k = i18;
                                        bVar.f26994l = i25;
                                        bVar.f26995m = i17;
                                        bVar.f26996n = i15;
                                        bVar.f26999r = 3;
                                        objC = kVar.c(params5, bVar);
                                        if (objC != E) {
                                        }
                                    } else {
                                        downloadTaskData2 = downloadTaskData;
                                        ex.b bVar8 = bVar6;
                                        mz3.j jVar2 = this.generateDocumentsAsyncUseCase;
                                        i26 = a.f26986a[downloadTaskData2.getDocumentDownloadMethod().ordinal()];
                                        if (i26 != 1) {
                                            rq0.b documentType2 = params2.getDocumentType();
                                            lz3.d documentDownloadMethod2 = downloadTaskData2.getDocumentDownloadMethod();
                                            taskIncludedDocumentData = downloadTaskData2.d().get(params2.getDocumentType());
                                            if (taskIncludedDocumentData != null) {
                                                mainDocumentId = taskIncludedDocumentData.getMainDocumentId();
                                            } else {
                                                mainDocumentId = null;
                                            }
                                            updateDocument = new mz3.j.a.UpdateDocument(documentDownloadMethod2, documentType2, mainDocumentId);
                                        } else {
                                            rq0.b documentType3 = params2.getDocumentType();
                                            lz3.d documentDownloadMethod3 = downloadTaskData2.getDocumentDownloadMethod();
                                            taskIncludedDocumentData = downloadTaskData2.d().get(params2.getDocumentType());
                                            if (taskIncludedDocumentData != null) {
                                                mainDocumentId = taskIncludedDocumentData.getMainDocumentId();
                                            } else {
                                                mainDocumentId = null;
                                            }
                                            updateDocument = new mz3.j.a.UpdateDocument(documentDownloadMethod3, documentType3, mainDocumentId);
                                        }
                                        bVar.f26987d = vq.j.a(params2);
                                        bVar.f26988e = jVar;
                                        bVar.f26989f = vq.j.a(bVar8);
                                        bVar.f26990g = vq.j.a(bVar5);
                                        bVar.f26991h = vq.j.a(downloadTaskData2);
                                        bVar.f26992j = i19;
                                        bVar.f26993k = i18;
                                        bVar.f26994l = i25;
                                        bVar.f26995m = i17;
                                        bVar.f26996n = i15;
                                        bVar.f26999r = 4;
                                        objC = jVar2.c(updateDocument, bVar);
                                        if (objC != E) {
                                        }
                                    }
                                }
                            }
                            return E;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            E = jVarA;
                            px.f fVar = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(E));
                            iVarA = E.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    }
                    if (i28 == 1) {
                        i15 = bVar.f26996n;
                        int i29 = bVar.f26995m;
                        i16 = bVar.f26994l;
                        int i35 = bVar.f26993k;
                        int i36 = bVar.f26992j;
                        aVar = (ex.b) bVar.f26991h;
                        ex.b bVar9 = (ex.b) bVar.f26990g;
                        ex.b bVar10 = (ex.b) bVar.f26989f;
                        jVar = (dx.j) bVar.f26988e;
                        params2 = (n0.Params) bVar.f26987d;
                        try {
                            oq.u.b(objC);
                            i17 = i29;
                            bVar2 = bVar10;
                            i19 = i36;
                            i18 = i35;
                            bVar3 = bVar9;
                            downloadTaskData = (DownloadTaskData) aVar.a((dx.i) objC);
                            gVar = this.cleanupDocumentDownloadDataUC;
                            bVar4 = bVar2;
                            bVar5 = bVar3;
                            params3 = new mz3.g.Params(params2.getDocumentType(), null, true);
                            bVar.f26987d = params2;
                            bVar.f26988e = jVar;
                            bVar.f26989f = vq.j.a(bVar4);
                            bVar.f26990g = vq.j.a(bVar5);
                            bVar.f26991h = downloadTaskData;
                            bVar.f26992j = i19;
                            bVar.f26993k = i18;
                            bVar.f26994l = i16;
                            bVar.f26995m = i17;
                            bVar.f26996n = i15;
                            bVar.f26999r = 2;
                            if (gVar.c(params3, bVar) == E) {
                                bVar6 = bVar4;
                                i25 = i16;
                                if (params2.getDocumentType().e()) {
                                    mz3.k kVar2 = this.generateMainDocumentsAsyncUC;
                                    rq0.b documentType4 = params2.getDocumentType();
                                    lz3.d documentDownloadMethod4 = downloadTaskData.getDocumentDownloadMethod();
                                    DownloadTaskData downloadTaskData4 = downloadTaskData;
                                    ex.b bVar11 = bVar6;
                                    taskIncludedDocumentData2 = downloadTaskData4.d().get(params2.getDocumentType());
                                    if (taskIncludedDocumentData2 != null) {
                                        mainDocumentId2 = taskIncludedDocumentData2.getMainDocumentId();
                                    } else {
                                        mainDocumentId2 = null;
                                    }
                                    mz3.k.Params params6 = new mz3.k.Params(documentType4, documentDownloadMethod4, mainDocumentId2);
                                    bVar.f26987d = vq.j.a(params2);
                                    bVar.f26988e = jVar;
                                    bVar.f26989f = vq.j.a(bVar11);
                                    bVar.f26990g = vq.j.a(bVar5);
                                    bVar.f26991h = vq.j.a(downloadTaskData4);
                                    bVar.f26992j = i19;
                                    bVar.f26993k = i18;
                                    bVar.f26994l = i25;
                                    bVar.f26995m = i17;
                                    bVar.f26996n = i15;
                                    bVar.f26999r = 3;
                                    objC = kVar2.c(params6, bVar);
                                    if (objC != E) {
                                    }
                                } else {
                                    downloadTaskData2 = downloadTaskData;
                                    ex.b bVar12 = bVar6;
                                    mz3.j jVar3 = this.generateDocumentsAsyncUseCase;
                                    i26 = a.f26986a[downloadTaskData2.getDocumentDownloadMethod().ordinal()];
                                    if (i26 != 1) {
                                        rq0.b documentType5 = params2.getDocumentType();
                                        lz3.d documentDownloadMethod5 = downloadTaskData2.getDocumentDownloadMethod();
                                        taskIncludedDocumentData = downloadTaskData2.d().get(params2.getDocumentType());
                                        if (taskIncludedDocumentData != null) {
                                            mainDocumentId = taskIncludedDocumentData.getMainDocumentId();
                                        } else {
                                            mainDocumentId = null;
                                        }
                                        updateDocument = new mz3.j.a.UpdateDocument(documentDownloadMethod5, documentType5, mainDocumentId);
                                    } else {
                                        rq0.b documentType6 = params2.getDocumentType();
                                        lz3.d documentDownloadMethod6 = downloadTaskData2.getDocumentDownloadMethod();
                                        taskIncludedDocumentData = downloadTaskData2.d().get(params2.getDocumentType());
                                        if (taskIncludedDocumentData != null) {
                                            mainDocumentId = taskIncludedDocumentData.getMainDocumentId();
                                        } else {
                                            mainDocumentId = null;
                                        }
                                        updateDocument = new mz3.j.a.UpdateDocument(documentDownloadMethod6, documentType6, mainDocumentId);
                                    }
                                    bVar.f26987d = vq.j.a(params2);
                                    bVar.f26988e = jVar;
                                    bVar.f26989f = vq.j.a(bVar12);
                                    bVar.f26990g = vq.j.a(bVar5);
                                    bVar.f26991h = vq.j.a(downloadTaskData2);
                                    bVar.f26992j = i19;
                                    bVar.f26993k = i18;
                                    bVar.f26994l = i25;
                                    bVar.f26995m = i17;
                                    bVar.f26996n = i15;
                                    bVar.f26999r = 4;
                                    objC = jVar3.c(updateDocument, bVar);
                                    if (objC != E) {
                                    }
                                }
                            }
                            return E;
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        } catch (Exception e25) {
                            e = e25;
                            E = jVar;
                            px.f fVar2 = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar2.d(message, e, px.c.a(E));
                            iVarA = E.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    }
                    if (i28 == 2) {
                        i15 = bVar.f26996n;
                        i17 = bVar.f26995m;
                        i25 = bVar.f26994l;
                        i18 = bVar.f26993k;
                        i19 = bVar.f26992j;
                        DownloadTaskData downloadTaskData5 = (DownloadTaskData) bVar.f26991h;
                        ex.b bVar13 = (ex.b) bVar.f26990g;
                        bVar6 = (ex.b) bVar.f26989f;
                        dx.j<dx.b> jVar4 = (dx.j) bVar.f26988e;
                        n0.Params params7 = (n0.Params) bVar.f26987d;
                        try {
                            oq.u.b(objC);
                            downloadTaskData = downloadTaskData5;
                            bVar5 = bVar13;
                            jVar = jVar4;
                            params2 = params7;
                            if (params2.getDocumentType().e()) {
                                mz3.k kVar3 = this.generateMainDocumentsAsyncUC;
                                rq0.b documentType7 = params2.getDocumentType();
                                lz3.d documentDownloadMethod7 = downloadTaskData.getDocumentDownloadMethod();
                                DownloadTaskData downloadTaskData6 = downloadTaskData;
                                ex.b bVar14 = bVar6;
                                taskIncludedDocumentData2 = downloadTaskData6.d().get(params2.getDocumentType());
                                if (taskIncludedDocumentData2 != null) {
                                    mainDocumentId2 = taskIncludedDocumentData2.getMainDocumentId();
                                } else {
                                    mainDocumentId2 = null;
                                }
                                mz3.k.Params params8 = new mz3.k.Params(documentType7, documentDownloadMethod7, mainDocumentId2);
                                bVar.f26987d = vq.j.a(params2);
                                bVar.f26988e = jVar;
                                bVar.f26989f = vq.j.a(bVar14);
                                bVar.f26990g = vq.j.a(bVar5);
                                bVar.f26991h = vq.j.a(downloadTaskData6);
                                bVar.f26992j = i19;
                                bVar.f26993k = i18;
                                bVar.f26994l = i25;
                                bVar.f26995m = i17;
                                bVar.f26996n = i15;
                                bVar.f26999r = 3;
                                objC = kVar3.c(params8, bVar);
                                if (objC != E) {
                                }
                            } else {
                                downloadTaskData2 = downloadTaskData;
                                ex.b bVar15 = bVar6;
                                mz3.j jVar5 = this.generateDocumentsAsyncUseCase;
                                i26 = a.f26986a[downloadTaskData2.getDocumentDownloadMethod().ordinal()];
                                if (i26 != 1 || i26 == 2) {
                                    rq0.b documentType8 = params2.getDocumentType();
                                    lz3.d documentDownloadMethod8 = downloadTaskData2.getDocumentDownloadMethod();
                                    taskIncludedDocumentData = downloadTaskData2.d().get(params2.getDocumentType());
                                    if (taskIncludedDocumentData != null) {
                                        mainDocumentId = taskIncludedDocumentData.getMainDocumentId();
                                    } else {
                                        mainDocumentId = null;
                                    }
                                    updateDocument = new mz3.j.a.UpdateDocument(documentDownloadMethod8, documentType8, mainDocumentId);
                                } else {
                                    if (i26 != 3) {
                                        throw new oq.p();
                                    }
                                    updateDocument = new mz3.j.a.DownloadDocuments(downloadTaskData2.getDocumentDownloadMethod(), pq.v.e(params2.getDocumentType()));
                                }
                                bVar.f26987d = vq.j.a(params2);
                                bVar.f26988e = jVar;
                                bVar.f26989f = vq.j.a(bVar15);
                                bVar.f26990g = vq.j.a(bVar5);
                                bVar.f26991h = vq.j.a(downloadTaskData2);
                                bVar.f26992j = i19;
                                bVar.f26993k = i18;
                                bVar.f26994l = i25;
                                bVar.f26995m = i17;
                                bVar.f26996n = i15;
                                bVar.f26999r = 4;
                                objC = jVar5.c(updateDocument, bVar);
                                if (objC != E) {
                                }
                            }
                            return E;
                        } catch (ex.c e26) {
                            e = e26;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e27) {
                            throw e27;
                        } catch (Exception e28) {
                            e = e28;
                            E = jVar4;
                            px.f fVar3 = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar3.d(message, e, px.c.a(E));
                            iVarA = E.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (!(iVarA instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    }
                    if (i28 == 3) {
                        oq.u.b(objC);
                    } else {
                        if (i28 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        oq.u.b(objC);
                    }
                    return new dx.i.Right(oq.i0.f148189a);
                } catch (CancellationException e29) {
                    throw e29;
                }
            } catch (Exception e35) {
                e = e35;
            }
        } catch (ex.c e36) {
            e = e36;
        } catch (CancellationException e37) {
            throw e37;
        }
    }
}
