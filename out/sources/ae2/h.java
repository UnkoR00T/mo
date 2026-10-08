package ae2;

import fr.t;
import iy.b0;
import iy.c0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import jb4.PayloadErrorData;
import o04.UploadedFile;
import oq.i0;
import oq.p;
import oq.r;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import vy.Axis;
import vy.Coordinates;
import zd2.ImageAttachments;
import zd2.NewIncidentData;
import zd2.Photo;
import zp0.BEIncidentReportFileServiceConfiguration;
import zp0.BEReportIncidentAttachments;
import zp0.BEReportIncidentAttachmentsImage;
import zp0.BEReportIncidentRequest;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JO\u0010\u0010\u001a \u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\n0\u000f2\u0006\u0010\t\u001a\u00020\b2\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b0\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0012*\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0096B¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lae2/h;", "Lae2/g;", "Laq0/f;", "beReportIncidentUC", "Lae2/j;", "uploadIncidentPhotosUC", "<init>", "(Laq0/f;Lae2/j;)V", "Ldx/b;", "error", "", "Loq/r;", "Lzd2/d;", "Lzd2/b;", "uploadedPhotos", "Ldx/i;", "e", "(Ldx/b;Ljava/util/List;)Ldx/i;", "Ljb4/f;", "d", "(Ldx/b;)Ljb4/f;", "Lae2/g$a;", "params", "Lae2/g$b;", "f", "(Lae2/g$a;Ltq/e;)Ljava/lang/Object;", "a", "Laq0/f;", "b", "Lae2/j;", "incidentreport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final aq0.f beReportIncidentUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j uploadIncidentPhotosUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f5569d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f5570e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f5571f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f5572g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f5573h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f5574j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f5575k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f5576l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f5577m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f5578n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f5579p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f5580q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f5581r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f5582s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f5583t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f5584v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f5586x;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f5584v = obj;
            this.f5586x |= PKIFailureInfo.systemUnavail;
            return h.this.c(null, this);
        }
    }

    public h(aq0.f fVar, j jVar) {
        this.beReportIncidentUC = fVar;
        this.uploadIncidentPhotosUC = jVar;
    }

    private final PayloadErrorData d(dx.b bVar) {
        dx.b.g.Http http = bVar instanceof dx.b.g.Http ? (dx.b.g.Http) bVar : null;
        if (http != null) {
            return (PayloadErrorData) http.b();
        }
        return null;
    }

    private final dx.i<dx.b, List<r<Photo, ImageAttachments>>> e(dx.b error, List<r<Photo, ImageAttachments>> uploadedPhotos) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    PayloadErrorData payloadErrorDataD = d(error);
                    if (!t.c(payloadErrorDataD != null ? payloadErrorDataD.getCode() : null, "FILE_UPLOAD_MAX_FILES_NUMBER_EXCEEDED")) {
                        if (!t.c(payloadErrorDataD != null ? payloadErrorDataD.getCode() : null, "VEHICLE_COLLISION_PARTICIPANT_MISSING_STORAGE_IMAGE")) {
                            return new dx.i.Right(uploadedPhotos);
                        }
                    }
                    aVar.b(error);
                    throw new oq.g();
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:104:0x02e3 A[Catch: Exception -> 0x0059, c -> 0x005c, CancellationException -> 0x005f, TryCatch #8 {Exception -> 0x0059, blocks: (B:13:0x0054, B:110:0x0341, B:112:0x034e, B:115:0x035c, B:87:0x0238, B:90:0x0256, B:91:0x0263, B:93:0x0269, B:95:0x0281, B:98:0x02c3, B:100:0x02c9, B:102:0x02dd, B:104:0x02e3, B:106:0x02ec, B:47:0x013b, B:49:0x014b), top: B:131:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:109:0x0340  */
    /* JADX WARN: Code duplicated, block: B:118:0x0365  */
    /* JADX WARN: Code duplicated, block: B:121:0x0376  */
    /* JADX WARN: Code duplicated, block: B:122:0x0384  */
    /* JADX WARN: Code duplicated, block: B:124:0x0388  */
    /* JADX WARN: Code duplicated, block: B:128:0x039a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r17v11 */
    /* JADX WARN: Type inference failed for: r17v12 */
    /* JADX WARN: Type inference failed for: r17v13 */
    /* JADX WARN: Type inference failed for: r17v14 */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v36 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v48 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // gz.b
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Object c(g.Params params, tq.e<? super g.Result> eVar) throws Throwable {
        a aVar;
        String message;
        dx.i iVarA;
        Object objB;
        dx.i left;
        ?? r15;
        int i15;
        NewIncidentData newIncidentData;
        int i16;
        int i17;
        int i18;
        ex.b bVar;
        ex.b bVar2;
        b0 data;
        BEIncidentReportFileServiceConfiguration bEIncidentReportFileServiceConfiguration;
        int i19;
        Object obj;
        NewIncidentData newIncidentData2;
        g.Params params2;
        int i25;
        int i26;
        List list;
        ?? r16;
        ?? r17;
        BEIncidentReportFileServiceConfiguration bEIncidentReportFileServiceConfiguration2;
        b0 b0Var;
        BEReportIncidentAttachments bEReportIncidentAttachments;
        b0 description;
        b0 b0VarC;
        ex.b bVar3;
        BEReportIncidentAttachmentsImage bEReportIncidentAttachmentsImage;
        List list2;
        j.Result bVar4;
        dx.i<dx.b, ry.a> iVarA2;
        ?? r18;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i27 = aVar.f5586x;
            if ((i27 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f5586x = i27 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f5584v;
        Object objE = uq.b.e();
        ?? r19 = aVar.f5586x;
        ?? r25 = 2;
        r25 = 2;
        try {
            try {
                try {
                    try {
                        try {
                            if (r19 != 0) {
                                if (r19 == 1) {
                                    int i28 = aVar.f5583t;
                                    int i29 = aVar.f5582s;
                                    int i35 = aVar.f5581r;
                                    int i36 = aVar.f5580q;
                                    int i37 = aVar.f5579p;
                                    BEIncidentReportFileServiceConfiguration bEIncidentReportFileServiceConfiguration3 = (BEIncidentReportFileServiceConfiguration) aVar.f5576l;
                                    ex.b bVar5 = (ex.b) aVar.f5575k;
                                    ex.b bVar6 = (ex.b) aVar.f5574j;
                                    dx.j jVar = (dx.j) aVar.f5573h;
                                    List list3 = (List) aVar.f5572g;
                                    NewIncidentData newIncidentData3 = (NewIncidentData) aVar.f5571f;
                                    List list4 = (List) aVar.f5570e;
                                    obj = objC;
                                    params2 = (g.Params) aVar.f5569d;
                                    try {
                                        u.b(obj);
                                        i15 = i28;
                                        r19 = jVar;
                                        bVar2 = bVar6;
                                        bVar = bVar5;
                                        bEIncidentReportFileServiceConfiguration = bEIncidentReportFileServiceConfiguration3;
                                        i26 = i37;
                                        i25 = i36;
                                        i18 = i35;
                                        newIncidentData2 = newIncidentData3;
                                        r25 = list4;
                                        i17 = i29;
                                        list2 = list3;
                                    } catch (ex.c e15) {
                                        e = e15;
                                        r25 = list4;
                                        left = new dx.i.Left((dx.b) ex.d.a(e));
                                        r15 = r25;
                                        return new g.Result(r15, left);
                                    } catch (CancellationException e16) {
                                        throw e16;
                                    } catch (Exception e17) {
                                        e = e17;
                                        r25 = list4;
                                        r19 = jVar;
                                        px.f fVar = px.f.f163100a;
                                        message = e.getMessage();
                                        if (message == null) {
                                            message = "";
                                        }
                                        fVar.d(message, e, px.c.a(r19));
                                        iVarA = r19.a(e);
                                        if (iVarA instanceof dx.i.Left) {
                                            objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                        } else {
                                            if (iVarA instanceof dx.i.Right) {
                                                throw new p();
                                            }
                                            objB = ((dx.i.Right) iVarA).b();
                                        }
                                        left = new dx.i.Left(objB);
                                        r15 = r25;
                                        return new g.Result(r15, left);
                                    }
                                } else {
                                    if (r19 != 2) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    bVar3 = (ex.b) aVar.f5577m;
                                    List list5 = (List) aVar.f5570e;
                                    u.b(objC);
                                    r25 = list5;
                                }
                                bVar3.a((dx.i) objC);
                                left = new dx.i.Right(i0.f148189a);
                                r15 = r25;
                                return new g.Result(r15, left);
                            }
                            u.b(objC);
                            List listI1 = v.i1(params.a());
                            NewIncidentData newIncidentData4 = params.getNewIncidentData();
                            List<r<Photo, ImageAttachments>> listA = newIncidentData4.a();
                            ArrayList arrayList = new ArrayList();
                            for (Object obj2 : listA) {
                                r rVar = (r) obj2;
                                List<r<Photo, ImageAttachments>> listA2 = params.a();
                                ArrayList arrayList2 = new ArrayList(v.y(listA2, 10));
                                Iterator it = listA2.iterator();
                                while (it.hasNext()) {
                                    UploadedFile uploadedFile = ((Photo) ((r) it.next()).c()).getUploadedFile();
                                    arrayList2.add(uploadedFile != null ? uploadedFile.getFileName() : null);
                                }
                                if (!arrayList2.contains(((ImageAttachments) rVar.d()).getFileName())) {
                                    arrayList.add(obj2);
                                }
                            }
                            dx.j<dx.b> jVarA = xw.c.f221622a.a();
                            ex.a aVar2 = new ex.a();
                            BEIncidentReportFileServiceConfiguration fileServiceConfiguration = params.getFileServiceConfiguration();
                            i15 = 0;
                            if (arrayList.isEmpty()) {
                                newIncidentData = newIncidentData4;
                                i16 = 0;
                                i17 = 0;
                                i18 = 0;
                                bVar = aVar2;
                                bVar2 = bVar;
                                data = null;
                                bEIncidentReportFileServiceConfiguration = fileServiceConfiguration;
                                i19 = 0;
                                r17 = jVarA;
                                r16 = listI1;
                                list = arrayList;
                                aq0.f fVar2 = this.beReportIncidentUC;
                                String reportCode = newIncidentData.getReportCode();
                                Coordinates selectedIncidentLocalization = newIncidentData.getSelectedIncidentLocalization();
                                Coordinates lastLocalization = params.getLastLocalization();
                                fz.b.LocalDateTime incidentDate = newIncidentData.getIncidentDate();
                                if (!((Collection) r16).isEmpty() || data == null) {
                                    bEIncidentReportFileServiceConfiguration2 = bEIncidentReportFileServiceConfiguration;
                                    b0Var = null;
                                    bEReportIncidentAttachments = null;
                                } else {
                                    ArrayList arrayList3 = new ArrayList();
                                    for (r rVar2 : (Iterable) r16) {
                                        Photo photo = (Photo) rVar2.a();
                                        ImageAttachments imageAttachments = (ImageAttachments) rVar2.b();
                                        if (photo.getUploadedFile() != null) {
                                            b0 encryptionIV = photo.getUploadedFile().getEncryptionIV();
                                            String strA = photo.getUploadedFile().getFileName().a();
                                            Axis accelerometer = imageAttachments.getAccelerometer();
                                            fz.b.LocalDateTime date = imageAttachments.getDate();
                                            imageAttachments.c();
                                            bEReportIncidentAttachmentsImage = new BEReportIncidentAttachmentsImage(encryptionIV, strA, accelerometer, date, null, imageAttachments.getGyroscope(), imageAttachments.getHeading(), imageAttachments.getLocation(), imageAttachments.getTiltAngle(), null);
                                        } else {
                                            bEReportIncidentAttachmentsImage = null;
                                        }
                                        if (bEReportIncidentAttachmentsImage != null) {
                                            arrayList3.add(bEReportIncidentAttachmentsImage);
                                        }
                                        bEIncidentReportFileServiceConfiguration = bEIncidentReportFileServiceConfiguration;
                                    }
                                    bEIncidentReportFileServiceConfiguration2 = bEIncidentReportFileServiceConfiguration;
                                    b0Var = null;
                                    bEReportIncidentAttachments = new BEReportIncidentAttachments(data, arrayList3, null);
                                }
                                description = newIncidentData.getDescription();
                                if (description != null) {
                                    b0VarC = c0.c(description);
                                } else {
                                    b0VarC = b0Var;
                                }
                                aq0.f.Params params3 = new aq0.f.Params(new BEReportIncidentRequest(reportCode, incidentDate, selectedIncidentLocalization, lastLocalization, bEReportIncidentAttachments, b0VarC, newIncidentData.getPhoneNumber()));
                                aVar.f5569d = vq.j.a(params);
                                aVar.f5570e = r16;
                                aVar.f5571f = vq.j.a(newIncidentData);
                                aVar.f5572g = vq.j.a(list);
                                aVar.f5573h = r17;
                                aVar.f5574j = vq.j.a(bVar2);
                                aVar.f5575k = vq.j.a(bVar);
                                aVar.f5576l = vq.j.a(bEIncidentReportFileServiceConfiguration2);
                                aVar.f5577m = bVar;
                                aVar.f5578n = vq.j.a(data);
                                aVar.f5579p = i15;
                                aVar.f5580q = i16;
                                aVar.f5581r = i18;
                                aVar.f5582s = i17;
                                aVar.f5583t = i19;
                                aVar.f5586x = 2;
                                objC = fVar2.c(params3, aVar);
                                if (objC != objE) {
                                    bVar3 = bVar;
                                    r25 = r16;
                                    bVar3.a((dx.i) objC);
                                    left = new dx.i.Right(i0.f148189a);
                                    r15 = r25;
                                    return new g.Result(r15, left);
                                }
                            } else {
                                j jVar2 = this.uploadIncidentPhotosUC;
                                j.Params aVar3 = new j.Params(arrayList, fileServiceConfiguration);
                                aVar.f5569d = params;
                                aVar.f5570e = listI1;
                                aVar.f5571f = newIncidentData4;
                                aVar.f5572g = vq.j.a(arrayList);
                                aVar.f5573h = jVarA;
                                aVar.f5574j = vq.j.a(aVar2);
                                aVar.f5575k = aVar2;
                                aVar.f5576l = vq.j.a(fileServiceConfiguration);
                                aVar.f5579p = 0;
                                aVar.f5580q = 0;
                                aVar.f5581r = 0;
                                aVar.f5582s = 0;
                                aVar.f5583t = 0;
                                aVar.f5586x = 1;
                                Object objC2 = jVar2.c(aVar3, aVar);
                                if (objC2 != objE) {
                                    obj = objC2;
                                    i17 = 0;
                                    i18 = 0;
                                    bVar = aVar2;
                                    bVar2 = bVar;
                                    newIncidentData2 = newIncidentData4;
                                    params2 = params;
                                    bEIncidentReportFileServiceConfiguration = fileServiceConfiguration;
                                    i25 = 0;
                                    i26 = 0;
                                    r19 = jVarA;
                                    r25 = listI1;
                                    list2 = arrayList;
                                }
                            }
                            return objE;
                            if (iVarA2 instanceof dx.i.Left) {
                                newIncidentData = newIncidentData2;
                                dx.i<dx.b, List<r<Photo, ImageAttachments>>> iVarE = e((dx.b) ((dx.i.Left) iVarA2).b(), bVar4.b());
                                if (iVarE instanceof dx.i.Left) {
                                    r25.clear();
                                } else {
                                    if (!(iVarE instanceof dx.i.Right)) {
                                        throw new p();
                                    }
                                    r25.addAll((List) ((dx.i.Right) iVarE).b());
                                }
                            } else {
                                newIncidentData = newIncidentData2;
                            }
                            if (iVarA2 instanceof dx.i.Right) {
                                ((ry.a) ((dx.i.Right) iVarA2).b()).getData();
                                r25.addAll(bVar4.b());
                            }
                            ry.a aVar4 = (ry.a) bVar.a(iVarA2);
                            if (aVar4 != null) {
                                data = aVar4.getData();
                                int i38 = i26;
                                i19 = i15;
                                i15 = i38;
                                i16 = i25;
                                r17 = r18;
                                r16 = r25;
                                list = list2;
                            } else {
                                int i39 = i26;
                                i19 = i15;
                                i15 = i39;
                                i16 = i25;
                                r17 = r18;
                                data = null;
                                r16 = r25;
                                list = list2;
                            }
                            aq0.f fVar3 = this.beReportIncidentUC;
                            String reportCode2 = newIncidentData.getReportCode();
                            Coordinates selectedIncidentLocalization2 = newIncidentData.getSelectedIncidentLocalization();
                            Coordinates lastLocalization2 = params.getLastLocalization();
                            fz.b.LocalDateTime incidentDate2 = newIncidentData.getIncidentDate();
                            if (((Collection) r16).isEmpty()) {
                                bEIncidentReportFileServiceConfiguration2 = bEIncidentReportFileServiceConfiguration;
                                b0Var = null;
                                bEReportIncidentAttachments = null;
                            } else {
                                bEIncidentReportFileServiceConfiguration2 = bEIncidentReportFileServiceConfiguration;
                                b0Var = null;
                                bEReportIncidentAttachments = null;
                            }
                            description = newIncidentData.getDescription();
                            if (description != null) {
                                b0VarC = c0.c(description);
                            } else {
                                b0VarC = b0Var;
                            }
                            aq0.f.Params params4 = new aq0.f.Params(new BEReportIncidentRequest(reportCode2, incidentDate2, selectedIncidentLocalization2, lastLocalization2, bEReportIncidentAttachments, b0VarC, newIncidentData.getPhoneNumber()));
                            aVar.f5569d = vq.j.a(params);
                            aVar.f5570e = r16;
                            aVar.f5571f = vq.j.a(newIncidentData);
                            aVar.f5572g = vq.j.a(list);
                            aVar.f5573h = r17;
                            aVar.f5574j = vq.j.a(bVar2);
                            aVar.f5575k = vq.j.a(bVar);
                            aVar.f5576l = vq.j.a(bEIncidentReportFileServiceConfiguration2);
                            aVar.f5577m = bVar;
                            aVar.f5578n = vq.j.a(data);
                            aVar.f5579p = i15;
                            aVar.f5580q = i16;
                            aVar.f5581r = i18;
                            aVar.f5582s = i17;
                            aVar.f5583t = i19;
                            aVar.f5586x = 2;
                            objC = fVar3.c(params4, aVar);
                            if (objC != objE) {
                                bVar3 = bVar;
                                r25 = r16;
                                bVar3.a((dx.i) objC);
                                left = new dx.i.Right(i0.f148189a);
                                r15 = r25;
                                return new g.Result(r15, left);
                            }
                            return objE;
                        } catch (ex.c e18) {
                            e = e18;
                            left = new dx.i.Left((dx.b) ex.d.a(e));
                            r15 = r25;
                        } catch (CancellationException e19) {
                            throw e19;
                        } catch (Exception e25) {
                            e = e25;
                            r19 = r18;
                            px.f fVar4 = px.f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar4.d(message, e, px.c.a(r19));
                            iVarA = r19.a(e);
                            if (iVarA instanceof dx.i.Left) {
                                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof dx.i.Right) {
                                    throw new p();
                                }
                                objB = ((dx.i.Right) iVarA).b();
                            }
                            left = new dx.i.Left(objB);
                            r15 = r25;
                        }
                        bVar4 = (j.Result) obj;
                        params = params2;
                        iVarA2 = bVar4.a();
                        r18 = r19;
                    } catch (ex.c e26) {
                        e = e26;
                    } catch (CancellationException e27) {
                        throw e27;
                    } catch (Exception e28) {
                        e = e28;
                    }
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
