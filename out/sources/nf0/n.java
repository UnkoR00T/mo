package nf0;

import cf0.AsyncDocumentToGenerate;
import java.util.concurrent.CancellationException;
import kf0.DocumentUpdateResponse;
import oq.i0;
import oq.u;
import oq.y;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v0;
import x80.UpdateSchoolCardDocument;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJD\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001b0\u00142\u0006\u0010\u001a\u001a\u00020\u0019H\u0096B¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010$¨\u0006%"}, d2 = {"Lnf0/n;", "Ldf0/n;", "Ljf0/a;", "documentDownloadRepository", "Ldf0/f;", "initDownloadTaskWorkUC", "Ly80/d;", "updateSchoolCardUC", "Llf0/a;", "documentStorageInteractor", "<init>", "(Ljf0/a;Ldf0/f;Ly80/d;Llf0/a;)V", "", "asyncDownloadTerminationInterval", "", "documentId", "taskId", "previousDocumentId", "Lcf0/c;", "documentType", "Ldx/i;", "Ldx/b;", "Loq/i0;", "e", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcf0/c;Ltq/e;)Ljava/lang/Object;", "Ldf0/n$a;", "params", "Ldf0/n$b;", "d", "(Ldf0/n$a;Ltq/e;)Ljava/lang/Object;", "a", "Ljf0/a;", "b", "Ldf0/f;", "c", "Ly80/d;", "Llf0/a;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n implements df0.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final jf0.a documentDownloadRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final df0.f initDownloadTaskWorkUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final y80.d updateSchoolCardUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final lf0.a documentStorageInteractor;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f135667a;

        static {
            int[] iArr = new int[cf0.c.values().length];
            try {
                iArr[cf0.c.JUNIOR_STUDENT_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[cf0.c.DRIVING_LICENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[cf0.c.FAMILY_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[cf0.c.UUT_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[cf0.c.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f135667a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f135668d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f135669e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f135670f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f135671g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f135672h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f135673j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f135674k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f135675l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f135676m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f135677n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f135678p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f135679q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f135680r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f135681s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f135682t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f135683v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f135684w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        /* synthetic */ Object f135685x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f135687z;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f135685x = obj;
            this.f135687z |= PKIFailureInfo.systemUnavail;
            return n.this.c(null, this);
        }
    }

    public n(jf0.a aVar, df0.f fVar, y80.d dVar, lf0.a aVar2) {
        this.documentDownloadRepository = aVar;
        this.initDownloadTaskWorkUC = fVar;
        this.updateSchoolCardUC = dVar;
        this.documentStorageInteractor = aVar2;
    }

    private final Object e(long j15, String str, String str2, String str3, cf0.c cVar, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        df0.f fVar = this.initDownloadTaskWorkUC;
        cf0.e eVar2 = cf0.e.DOCUMENT_UPDATE;
        return fVar.c(new df0.f.Params(str2, eVar2, v0.f(y.a(cVar, new AsyncDocumentToGenerate(str, cVar, j15, false, null, null, str3, eVar2, 48, null))), null), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02a8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:101:0x02a9 A[Catch: Exception -> 0x0334, c -> 0x0337, CancellationException -> 0x033a, TryCatch #10 {c -> 0x0337, CancellationException -> 0x033a, Exception -> 0x0334, blocks: (B:98:0x02a0, B:101:0x02a9, B:103:0x02ad, B:115:0x033d, B:116:0x0342), top: B:140:0x02a0 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x02ad A[Catch: Exception -> 0x0334, c -> 0x0337, CancellationException -> 0x033a, TRY_LEAVE, TryCatch #10 {c -> 0x0337, CancellationException -> 0x033a, Exception -> 0x0334, blocks: (B:98:0x02a0, B:101:0x02a9, B:103:0x02ad, B:115:0x033d, B:116:0x0342), top: B:140:0x02a0 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x0327  */
    /* JADX WARN: Code duplicated, block: B:115:0x033d A[Catch: Exception -> 0x0334, c -> 0x0337, CancellationException -> 0x033a, TRY_ENTER, TryCatch #10 {c -> 0x0337, CancellationException -> 0x033a, Exception -> 0x0334, blocks: (B:98:0x02a0, B:101:0x02a9, B:103:0x02ad, B:115:0x033d, B:116:0x0342), top: B:140:0x02a0 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0343 A[Catch: Exception -> 0x0056, c -> 0x0059, CancellationException -> 0x005c, TRY_ENTER, TryCatch #4 {Exception -> 0x0056, blocks: (B:17:0x0051, B:81:0x01fd, B:119:0x0349, B:122:0x0357, B:37:0x00b2, B:107:0x0329, B:89:0x024a, B:92:0x0252, B:94:0x0256, B:117:0x0343, B:118:0x0348, B:58:0x0131, B:66:0x014e, B:67:0x0153, B:68:0x0154, B:85:0x0216), top: B:137:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:125:0x0360  */
    /* JADX WARN: Code duplicated, block: B:128:0x0371  */
    /* JADX WARN: Code duplicated, block: B:129:0x037f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0383  */
    /* JADX WARN: Code duplicated, block: B:134:0x0390  */
    /* JADX WARN: Code duplicated, block: B:74:0x018f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:75:0x0190 A[Catch: Exception -> 0x0086, c -> 0x008a, CancellationException -> 0x008e, TryCatch #9 {c -> 0x008a, CancellationException -> 0x008e, Exception -> 0x0086, blocks: (B:28:0x0081, B:72:0x0189, B:75:0x0190, B:77:0x0194, B:83:0x0210, B:84:0x0215), top: B:141:0x0081 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0194 A[Catch: Exception -> 0x0086, c -> 0x008a, CancellationException -> 0x008e, TRY_LEAVE, TryCatch #9 {c -> 0x008a, CancellationException -> 0x008e, Exception -> 0x0086, blocks: (B:28:0x0081, B:72:0x0189, B:75:0x0190, B:77:0x0194, B:83:0x0210, B:84:0x0215), top: B:141:0x0081 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:83:0x0210 A[Catch: Exception -> 0x0086, c -> 0x008a, CancellationException -> 0x008e, TRY_ENTER, TryCatch #9 {c -> 0x008a, CancellationException -> 0x008e, Exception -> 0x0086, blocks: (B:28:0x0081, B:72:0x0189, B:75:0x0190, B:77:0x0194, B:83:0x0210, B:84:0x0215), top: B:141:0x0081 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:91:0x0251 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:92:0x0252 A[Catch: Exception -> 0x0056, c -> 0x0059, CancellationException -> 0x005c, TryCatch #4 {Exception -> 0x0056, blocks: (B:17:0x0051, B:81:0x01fd, B:119:0x0349, B:122:0x0357, B:37:0x00b2, B:107:0x0329, B:89:0x024a, B:92:0x0252, B:94:0x0256, B:117:0x0343, B:118:0x0348, B:58:0x0131, B:66:0x014e, B:67:0x0153, B:68:0x0154, B:85:0x0216), top: B:137:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0256 A[Catch: Exception -> 0x0056, c -> 0x0059, CancellationException -> 0x005c, TRY_LEAVE, TryCatch #4 {Exception -> 0x0056, blocks: (B:17:0x0051, B:81:0x01fd, B:119:0x0349, B:122:0x0357, B:37:0x00b2, B:107:0x0329, B:89:0x024a, B:92:0x0252, B:94:0x0256, B:117:0x0343, B:118:0x0348, B:58:0x0131, B:66:0x014e, B:67:0x0153, B:68:0x0154, B:85:0x0216), top: B:137:0x002d }] */
    /* JADX WARN: Code duplicated, block: B:97:0x0298  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [nf0.n] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int] */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v4, types: [dx.j, java.lang.Object] */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(df0.n.Params params, tq.e<? super dx.i<? extends dx.b, df0.n.Response>> eVar) throws Throwable {
        b bVar;
        String message;
        dx.i iVarA;
        Object objB;
        dx.j<dx.b> jVarA;
        df0.n.Params params2;
        ex.b bVar2;
        ex.b bVar3;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        df0.n.Params params3;
        ex.b bVar4;
        ex.b bVar5;
        dx.j<dx.b> jVar;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        dx.i iVar;
        String str;
        Object objC;
        int i35;
        int i36;
        df0.n.Params params4;
        String str2;
        dx.j<dx.b> jVar2;
        int i37;
        int i38;
        dx.i iVar2;
        df0.n.Params params5;
        long asyncDownloadTerminationInterval;
        String documentId;
        String taskId;
        String updatedParentDocumentId;
        cf0.c cVar;
        String str3;
        dx.i iVar3;
        DocumentUpdateResponse documentUpdateResponse;
        long asyncDownloadTerminationInterval2;
        String documentId2;
        String taskId2;
        String updatedParentDocumentId2;
        cf0.c documentType;
        DocumentUpdateResponse documentUpdateResponse2;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i39 = bVar.f135687z;
            if ((i39 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f135687z = i39 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        b bVar6 = bVar;
        Object obj = bVar6.f135685x;
        Object objE = uq.b.e();
        ?? r15 = bVar6.f135687z;
        try {
            try {
                try {
                    if (r15 == 0) {
                        u.b(obj);
                        jVarA = xw.c.f221622a.a();
                        ex.a aVar = new ex.a();
                        int i45 = a.f135667a[params.getDocumentType().ordinal()];
                        if (i45 != 1) {
                            if (i45 != 2 && i45 != 3 && i45 != 4 && i45 != 5) {
                                throw new oq.p();
                            }
                            jf0.a aVar2 = this.documentDownloadRepository;
                            cf0.c documentType2 = params.getDocumentType();
                            bVar6.f135668d = params;
                            bVar6.f135669e = jVarA;
                            bVar6.f135670f = vq.j.a(aVar);
                            bVar6.f135671g = vq.j.a(aVar);
                            bVar6.f135676m = 0;
                            bVar6.f135677n = 0;
                            bVar6.f135678p = 0;
                            bVar6.f135679q = 0;
                            bVar6.f135680r = 0;
                            bVar6.f135687z = 4;
                            Object objE2 = aVar2.e(documentType2, bVar6);
                            if (objE2 != objE) {
                                params3 = params;
                                bVar4 = aVar;
                                bVar5 = bVar4;
                                jVar = jVarA;
                                obj = objE2;
                                i25 = 0;
                                i26 = 0;
                                i27 = 0;
                                i28 = 0;
                                i29 = 0;
                                iVar3 = (dx.i) obj;
                                if (iVar3 instanceof dx.i.Left) {
                                    return iVar3;
                                }
                                if (iVar3 instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                documentUpdateResponse = (DocumentUpdateResponse) ((dx.i.Right) iVar3).b();
                                asyncDownloadTerminationInterval2 = documentUpdateResponse.getDocumentToGenerate().getAsyncDownloadTerminationInterval();
                                documentId2 = documentUpdateResponse.getDocumentToGenerate().getDocumentId();
                                taskId2 = documentUpdateResponse.getTaskId();
                                updatedParentDocumentId2 = params3.getUpdatedParentDocumentId();
                                documentType = documentUpdateResponse.getDocumentToGenerate().getDocumentType();
                                bVar6.f135668d = vq.j.a(params3);
                                bVar6.f135669e = jVar;
                                bVar6.f135670f = vq.j.a(bVar5);
                                bVar6.f135671g = vq.j.a(bVar4);
                                bVar6.f135672h = vq.j.a(iVar3);
                                bVar6.f135673j = documentUpdateResponse;
                                bVar6.f135676m = i29;
                                bVar6.f135677n = i28;
                                bVar6.f135678p = i27;
                                bVar6.f135679q = i26;
                                bVar6.f135680r = i25;
                                bVar6.f135681s = 0;
                                bVar6.f135682t = 0;
                                bVar6.f135687z = 5;
                                if (e(asyncDownloadTerminationInterval2, documentId2, taskId2, updatedParentDocumentId2, documentType, bVar6) != objE) {
                                    documentUpdateResponse2 = documentUpdateResponse;
                                    return new dx.i.Right(new df0.n.Response(documentUpdateResponse2.getDocumentToGenerate().getDocumentId()));
                                }
                            }
                        } else {
                            lf0.a aVar3 = this.documentStorageInteractor;
                            String updatedParentDocumentId3 = params.getUpdatedParentDocumentId();
                            bVar6.f135668d = params;
                            bVar6.f135669e = jVarA;
                            bVar6.f135670f = vq.j.a(aVar);
                            bVar6.f135671g = vq.j.a(aVar);
                            bVar6.f135676m = 0;
                            bVar6.f135677n = 0;
                            bVar6.f135678p = 0;
                            bVar6.f135679q = 0;
                            bVar6.f135680r = 0;
                            bVar6.f135687z = 1;
                            Object objG = aVar3.g(updatedParentDocumentId3, bVar6);
                            if (objG != objE) {
                                params2 = params;
                                bVar2 = aVar;
                                bVar3 = bVar2;
                                obj = objG;
                                i15 = 0;
                                i16 = 0;
                                i17 = 0;
                                i18 = 0;
                                i19 = 0;
                                iVar = (dx.i) obj;
                                if (iVar instanceof dx.i.Left) {
                                    return iVar;
                                }
                                if (iVar instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                str = (String) ((dx.i.Right) iVar).b();
                                y80.d dVar = this.updateSchoolCardUC;
                                y80.d.Params params6 = new y80.d.Params(str);
                                bVar6.f135668d = params2;
                                bVar6.f135669e = jVarA;
                                bVar6.f135670f = vq.j.a(bVar2);
                                bVar6.f135671g = vq.j.a(bVar3);
                                bVar6.f135672h = vq.j.a(iVar);
                                bVar6.f135673j = str;
                                bVar6.f135676m = i19;
                                bVar6.f135677n = i18;
                                bVar6.f135678p = i15;
                                bVar6.f135679q = i17;
                                bVar6.f135680r = i16;
                                bVar6.f135681s = 0;
                                bVar6.f135682t = 0;
                                bVar6.f135687z = 2;
                                objC = dVar.c(params6, bVar6);
                                if (objC != objE) {
                                    i35 = i15;
                                    i36 = i18;
                                    params4 = params2;
                                    str2 = str;
                                    jVar2 = jVarA;
                                    i37 = 0;
                                    obj = objC;
                                    i38 = 0;
                                    iVar2 = (dx.i) obj;
                                    params5 = params4;
                                    if (iVar2 instanceof dx.i.Left) {
                                        return iVar2;
                                    }
                                    if (!(iVar2 instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    UpdateSchoolCardDocument updateSchoolCardDocument = (UpdateSchoolCardDocument) ((dx.i.Right) iVar2).b();
                                    asyncDownloadTerminationInterval = updateSchoolCardDocument.getSchoolCardDocumentToGenerate().getAsyncDownloadTerminationInterval();
                                    documentId = updateSchoolCardDocument.getSchoolCardDocumentToGenerate().getDocumentId();
                                    taskId = updateSchoolCardDocument.getSchoolCardDocumentToGenerate().getTaskId();
                                    updatedParentDocumentId = params5.getUpdatedParentDocumentId();
                                    cVar = cf0.c.JUNIOR_STUDENT_CARD;
                                    bVar6.f135668d = vq.j.a(params5);
                                    bVar6.f135669e = jVar2;
                                    bVar6.f135670f = vq.j.a(bVar2);
                                    bVar6.f135671g = vq.j.a(bVar3);
                                    bVar6.f135672h = vq.j.a(iVar);
                                    bVar6.f135673j = str2;
                                    bVar6.f135674k = vq.j.a(iVar2);
                                    bVar6.f135675l = vq.j.a(updateSchoolCardDocument);
                                    bVar6.f135676m = i19;
                                    bVar6.f135677n = i36;
                                    bVar6.f135678p = i35;
                                    bVar6.f135679q = i17;
                                    bVar6.f135680r = i16;
                                    bVar6.f135681s = i37;
                                    bVar6.f135682t = i38;
                                    bVar6.f135683v = 0;
                                    bVar6.f135684w = 0;
                                    bVar6.f135687z = 3;
                                    if (e(asyncDownloadTerminationInterval, documentId, taskId, updatedParentDocumentId, cVar, bVar6) != objE) {
                                        str3 = str2;
                                        return new dx.i.Right(new df0.n.Response(str3));
                                    }
                                }
                            }
                        }
                        return objE;
                    }
                    if (r15 == 1) {
                        int i46 = bVar6.f135680r;
                        int i47 = bVar6.f135679q;
                        int i48 = bVar6.f135678p;
                        int i49 = bVar6.f135677n;
                        int i55 = bVar6.f135676m;
                        ex.b bVar7 = (ex.b) bVar6.f135671g;
                        bVar2 = (ex.b) bVar6.f135670f;
                        dx.j<dx.b> jVar3 = (dx.j) bVar6.f135669e;
                        params2 = (df0.n.Params) bVar6.f135668d;
                        try {
                            u.b(obj);
                            i16 = i46;
                            i15 = i48;
                            bVar3 = bVar7;
                            i18 = i49;
                            i17 = i47;
                            jVarA = jVar3;
                            i19 = i55;
                            iVar = (dx.i) obj;
                            if (iVar instanceof dx.i.Left) {
                                return iVar;
                            }
                            if (iVar instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            str = (String) ((dx.i.Right) iVar).b();
                            y80.d dVar2 = this.updateSchoolCardUC;
                            y80.d.Params params7 = new y80.d.Params(str);
                            bVar6.f135668d = params2;
                            bVar6.f135669e = jVarA;
                            bVar6.f135670f = vq.j.a(bVar2);
                            bVar6.f135671g = vq.j.a(bVar3);
                            bVar6.f135672h = vq.j.a(iVar);
                            bVar6.f135673j = str;
                            bVar6.f135676m = i19;
                            bVar6.f135677n = i18;
                            bVar6.f135678p = i15;
                            bVar6.f135679q = i17;
                            bVar6.f135680r = i16;
                            bVar6.f135681s = 0;
                            bVar6.f135682t = 0;
                            bVar6.f135687z = 2;
                            objC = dVar2.c(params7, bVar6);
                            if (objC != objE) {
                                i35 = i15;
                                i36 = i18;
                                params4 = params2;
                                str2 = str;
                                jVar2 = jVarA;
                                i37 = 0;
                                obj = objC;
                                i38 = 0;
                                iVar2 = (dx.i) obj;
                                params5 = params4;
                                if (iVar2 instanceof dx.i.Left) {
                                    return iVar2;
                                }
                                if (!(iVar2 instanceof dx.i.Right)) {
                                    throw new oq.p();
                                }
                                UpdateSchoolCardDocument updateSchoolCardDocument2 = (UpdateSchoolCardDocument) ((dx.i.Right) iVar2).b();
                                asyncDownloadTerminationInterval = updateSchoolCardDocument2.getSchoolCardDocumentToGenerate().getAsyncDownloadTerminationInterval();
                                documentId = updateSchoolCardDocument2.getSchoolCardDocumentToGenerate().getDocumentId();
                                taskId = updateSchoolCardDocument2.getSchoolCardDocumentToGenerate().getTaskId();
                                updatedParentDocumentId = params5.getUpdatedParentDocumentId();
                                cVar = cf0.c.JUNIOR_STUDENT_CARD;
                                bVar6.f135668d = vq.j.a(params5);
                                bVar6.f135669e = jVar2;
                                bVar6.f135670f = vq.j.a(bVar2);
                                bVar6.f135671g = vq.j.a(bVar3);
                                bVar6.f135672h = vq.j.a(iVar);
                                bVar6.f135673j = str2;
                                bVar6.f135674k = vq.j.a(iVar2);
                                bVar6.f135675l = vq.j.a(updateSchoolCardDocument2);
                                bVar6.f135676m = i19;
                                bVar6.f135677n = i36;
                                bVar6.f135678p = i35;
                                bVar6.f135679q = i17;
                                bVar6.f135680r = i16;
                                bVar6.f135681s = i37;
                                bVar6.f135682t = i38;
                                bVar6.f135683v = 0;
                                bVar6.f135684w = 0;
                                bVar6.f135687z = 3;
                                if (e(asyncDownloadTerminationInterval, documentId, taskId, updatedParentDocumentId, cVar, bVar6) != objE) {
                                    str3 = str2;
                                    return new dx.i.Right(new df0.n.Response(str3));
                                }
                            }
                            return objE;
                        } catch (ex.c e15) {
                            e = e15;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            r15 = jVar3;
                            px.f fVar = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(r15));
                            iVarA = r15.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    }
                    if (r15 != 2) {
                        if (r15 == 3) {
                            str3 = (String) bVar6.f135673j;
                            u.b(obj);
                            return new dx.i.Right(new df0.n.Response(str3));
                        }
                        if (r15 == 4) {
                            i25 = bVar6.f135680r;
                            i26 = bVar6.f135679q;
                            i27 = bVar6.f135678p;
                            i28 = bVar6.f135677n;
                            i29 = bVar6.f135676m;
                            bVar4 = (ex.b) bVar6.f135671g;
                            bVar5 = (ex.b) bVar6.f135670f;
                            jVar = (dx.j) bVar6.f135669e;
                            params3 = (df0.n.Params) bVar6.f135668d;
                            try {
                                u.b(obj);
                                iVar3 = (dx.i) obj;
                                if (iVar3 instanceof dx.i.Left) {
                                    return iVar3;
                                }
                                if (iVar3 instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                documentUpdateResponse = (DocumentUpdateResponse) ((dx.i.Right) iVar3).b();
                                asyncDownloadTerminationInterval2 = documentUpdateResponse.getDocumentToGenerate().getAsyncDownloadTerminationInterval();
                                documentId2 = documentUpdateResponse.getDocumentToGenerate().getDocumentId();
                                taskId2 = documentUpdateResponse.getTaskId();
                                updatedParentDocumentId2 = params3.getUpdatedParentDocumentId();
                                documentType = documentUpdateResponse.getDocumentToGenerate().getDocumentType();
                                bVar6.f135668d = vq.j.a(params3);
                                bVar6.f135669e = jVar;
                                bVar6.f135670f = vq.j.a(bVar5);
                                bVar6.f135671g = vq.j.a(bVar4);
                                bVar6.f135672h = vq.j.a(iVar3);
                                bVar6.f135673j = documentUpdateResponse;
                                bVar6.f135676m = i29;
                                bVar6.f135677n = i28;
                                bVar6.f135678p = i27;
                                bVar6.f135679q = i26;
                                bVar6.f135680r = i25;
                                bVar6.f135681s = 0;
                                bVar6.f135682t = 0;
                                bVar6.f135687z = 5;
                                if (e(asyncDownloadTerminationInterval2, documentId2, taskId2, updatedParentDocumentId2, documentType, bVar6) != objE) {
                                    documentUpdateResponse2 = documentUpdateResponse;
                                }
                                return objE;
                            } catch (ex.c e18) {
                                e = e18;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e19) {
                                throw e19;
                            } catch (Exception e25) {
                                e = e25;
                                r15 = jVar;
                                px.f fVar2 = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar2.d(message, e, px.c.a(r15));
                                iVarA = r15.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (iVarA instanceof dx.i.Right) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        }
                        if (r15 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        documentUpdateResponse2 = (DocumentUpdateResponse) bVar6.f135673j;
                        u.b(obj);
                        return new dx.i.Right(new df0.n.Response(documentUpdateResponse2.getDocumentToGenerate().getDocumentId()));
                    }
                    int i56 = bVar6.f135682t;
                    i37 = bVar6.f135681s;
                    i16 = bVar6.f135680r;
                    i17 = bVar6.f135679q;
                    i35 = bVar6.f135678p;
                    int i57 = bVar6.f135677n;
                    i19 = bVar6.f135676m;
                    str2 = (String) bVar6.f135673j;
                    iVar = (dx.i) bVar6.f135672h;
                    bVar3 = (ex.b) bVar6.f135671g;
                    bVar2 = (ex.b) bVar6.f135670f;
                    dx.j<dx.b> jVar4 = (dx.j) bVar6.f135669e;
                    params4 = (df0.n.Params) bVar6.f135668d;
                    try {
                        u.b(obj);
                        jVar2 = jVar4;
                        i36 = i57;
                        i38 = i56;
                        try {
                            iVar2 = (dx.i) obj;
                            params5 = params4;
                            if (iVar2 instanceof dx.i.Left) {
                                return iVar2;
                            }
                            if (!(iVar2 instanceof dx.i.Right)) {
                                throw new oq.p();
                            }
                            UpdateSchoolCardDocument updateSchoolCardDocument3 = (UpdateSchoolCardDocument) ((dx.i.Right) iVar2).b();
                            asyncDownloadTerminationInterval = updateSchoolCardDocument3.getSchoolCardDocumentToGenerate().getAsyncDownloadTerminationInterval();
                            documentId = updateSchoolCardDocument3.getSchoolCardDocumentToGenerate().getDocumentId();
                            taskId = updateSchoolCardDocument3.getSchoolCardDocumentToGenerate().getTaskId();
                            updatedParentDocumentId = params5.getUpdatedParentDocumentId();
                            cVar = cf0.c.JUNIOR_STUDENT_CARD;
                            bVar6.f135668d = vq.j.a(params5);
                            bVar6.f135669e = jVar2;
                            bVar6.f135670f = vq.j.a(bVar2);
                            bVar6.f135671g = vq.j.a(bVar3);
                            bVar6.f135672h = vq.j.a(iVar);
                            bVar6.f135673j = str2;
                            bVar6.f135674k = vq.j.a(iVar2);
                            bVar6.f135675l = vq.j.a(updateSchoolCardDocument3);
                            bVar6.f135676m = i19;
                            bVar6.f135677n = i36;
                            bVar6.f135678p = i35;
                            bVar6.f135679q = i17;
                            bVar6.f135680r = i16;
                            bVar6.f135681s = i37;
                            bVar6.f135682t = i38;
                            bVar6.f135683v = 0;
                            bVar6.f135684w = 0;
                            bVar6.f135687z = 3;
                            if (e(asyncDownloadTerminationInterval, documentId, taskId, updatedParentDocumentId, cVar, bVar6) != objE) {
                                str3 = str2;
                                return new dx.i.Right(new df0.n.Response(str3));
                            }
                            return objE;
                        } catch (ex.c e26) {
                            e = e26;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e27) {
                            throw e27;
                        } catch (Exception e28) {
                            e = e28;
                            r15 = jVar2;
                            px.f fVar3 = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar3.d(message, e, px.c.a(r15));
                            iVarA = r15.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof dx.i.Right) {
                                    throw new oq.p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            return new dx.i.Left(objB);
                        }
                    } catch (ex.c e29) {
                        e = e29;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e35) {
                        throw e35;
                    } catch (Exception e36) {
                        e = e36;
                        r15 = jVar4;
                        px.f fVar4 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar4.d(message, e, px.c.a(r15));
                        iVarA = r15.a(e);
                        if (iVarA instanceof dx.i.Left) {
                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                        } else {
                            if (iVarA instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } catch (Exception e37) {
                    e = e37;
                }
            } catch (CancellationException e38) {
                throw e38;
            }
        } catch (ex.c e39) {
            e = e39;
        } catch (CancellationException e45) {
            throw e45;
        }
    }
}
