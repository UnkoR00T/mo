package tz3;

import er0.BEDocumentToGenerate;
import fr0.BEAsyncDocumentGenerationResponse;
import java.util.ArrayList;
import java.util.List;
import lz3.TaskIncludedDocumentData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Ltz3/b;", "Lmz3/b;", "Llr0/a;", "bEAsyncGenerateRefugeeKidsPersonalInfoUC", "Lmz3/x;", "startManageAsyncDownloadWorkerUseCase", "<init>", "(Llr0/a;Lmz3/x;)V", "Lmz3/b$a;", "params", "Ldx/i;", "Ldx/b;", "", "d", "(Lmz3/b$a;Ltq/e;)Ljava/lang/Object;", "a", "Llr0/a;", "b", "Lmz3/x;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements mz3.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final lr0.a bEAsyncGenerateRefugeeKidsPersonalInfoUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mz3.x startManageAsyncDownloadWorkerUseCase;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f192911d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f192912e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f192913f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f192914g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f192915h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f192916j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f192918l;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f192916j = obj;
            this.f192918l |= PKIFailureInfo.systemUnavail;
            return b.this.c(null, this);
        }
    }

    public b(lr0.a aVar, mz3.x xVar) {
        this.bEAsyncGenerateRefugeeKidsPersonalInfoUC = aVar;
        this.startManageAsyncDownloadWorkerUseCase = xVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(mz3.b.Params params, tq.e<? super dx.i<? extends dx.b, String>> eVar) throws Throwable {
        a aVar;
        mz3.b.Params params2;
        BEAsyncDocumentGenerationResponse bEAsyncDocumentGenerationResponse;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f192918l;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f192918l = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f192916j;
        Object objE = uq.b.e();
        int i16 = aVar.f192918l;
        if (i16 == 0) {
            oq.u.b(objC);
            lr0.a aVar2 = this.bEAsyncGenerateRefugeeKidsPersonalInfoUC;
            lr0.a.Params params3 = new lr0.a.Params(params.a());
            aVar.f192911d = vq.j.a(params);
            aVar.f192918l = 1;
            objC = aVar2.c(params3, aVar);
            if (objC != objE) {
                params2 = params;
            }
            return objE;
        }
        if (i16 == 1) {
            params2 = (mz3.b.Params) aVar.f192911d;
            oq.u.b(objC);
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bEAsyncDocumentGenerationResponse = (BEAsyncDocumentGenerationResponse) aVar.f192913f;
            oq.u.b(objC);
        }
        return new dx.i.Right(bEAsyncDocumentGenerationResponse.getTaskId());
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        BEAsyncDocumentGenerationResponse bEAsyncDocumentGenerationResponse2 = (BEAsyncDocumentGenerationResponse) ((dx.i.Right) iVar).b();
        mz3.x xVar = this.startManageAsyncDownloadWorkerUseCase;
        String taskId = bEAsyncDocumentGenerationResponse2.getTaskId();
        List<BEDocumentToGenerate> listA = bEAsyncDocumentGenerationResponse2.a();
        ArrayList arrayList = new ArrayList();
        for (BEDocumentToGenerate bEDocumentToGenerate : listA) {
            rq0.b documentType = bEDocumentToGenerate.getDocumentType();
            oq.r rVarA = documentType == null ? null : oq.y.a(documentType, new TaskIncludedDocumentData(bEDocumentToGenerate.getDocumentId(), bEDocumentToGenerate.getAsyncDownloadTerminationInterval(), null, null, 8, null));
            if (rVarA != null) {
                arrayList.add(rVarA);
            }
        }
        mz3.x.Params params4 = new mz3.x.Params(taskId, lz3.d.FIRST_DOWNLOAD, pq.v0.s(arrayList), null, 8, null);
        aVar.f192911d = vq.j.a(params2);
        aVar.f192912e = vq.j.a(iVar);
        aVar.f192913f = bEAsyncDocumentGenerationResponse2;
        aVar.f192914g = 0;
        aVar.f192915h = 0;
        aVar.f192918l = 2;
        if (xVar.c(params4, aVar) != objE) {
            bEAsyncDocumentGenerationResponse = bEAsyncDocumentGenerationResponse2;
            return new dx.i.Right(bEAsyncDocumentGenerationResponse.getTaskId());
        }
        return objE;
    }
}
