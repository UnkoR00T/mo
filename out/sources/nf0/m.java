package nf0;

import cf0.AsyncDocumentToGenerate;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.CancellationException;
import kf0.DocumentGenerationResponse;
import kf0.DocumentToGenerate;
import oq.i0;
import oq.r;
import oq.u;
import oq.y;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;
import pq.v0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lnf0/m;", "Ldf0/m;", "Ljf0/a;", "documentDownloadRepository", "Ldf0/f;", "initDownloadTaskWorkUC", "<init>", "(Ljf0/a;Ldf0/f;)V", "Ldf0/m$a;", "params", "Ldx/i;", "Ldx/b;", "Loq/i0;", "d", "(Ldf0/m$a;Ltq/e;)Ljava/lang/Object;", "a", "Ljf0/a;", "b", "Ldf0/f;", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m implements df0.m {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final jf0.a documentDownloadRepository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final df0.f initDownloadTaskWorkUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f135650d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f135651e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f135652f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f135653g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f135654h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f135655j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f135656k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f135657l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f135658m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f135659n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f135660p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f135662r;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f135660p = obj;
            this.f135662r |= PKIFailureInfo.systemUnavail;
            return m.this.c(null, this);
        }
    }

    public m(jf0.a aVar, df0.f fVar) {
        this.documentDownloadRepository = aVar;
        this.initDownloadTaskWorkUC = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0102 A[Catch: Exception -> 0x0077, c -> 0x007b, CancellationException -> 0x007f, LOOP:0: B:38:0x00fc->B:40:0x0102, LOOP_END, TryCatch #7 {c -> 0x007b, CancellationException -> 0x007f, Exception -> 0x0077, blocks: (B:24:0x0073, B:37:0x00cb, B:38:0x00fc, B:40:0x0102, B:41:0x0143), top: B:72:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x017e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x019f  */
    /* JADX WARN: Code duplicated, block: B:60:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:61:0x01be  */
    /* JADX WARN: Code duplicated, block: B:63:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:66:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v5 */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(df0.m.Params params, tq.e<? super dx.i<? extends dx.b, i0>> eVar) throws Throwable {
        a aVar;
        String message;
        dx.i iVarA;
        Object objB;
        ex.b aVar2;
        int i15;
        df0.m.Params params2;
        dx.j<dx.b> jVar;
        int i16;
        int i17;
        int i18;
        int i19;
        ex.b bVar;
        ex.b bVar2;
        LinkedHashMap linkedHashMap;
        Iterator it;
        Object objC;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i25 = aVar.f135662r;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f135662r = i25 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objG = aVar.f135660p;
        ?? E = uq.b.e();
        int i26 = aVar.f135662r;
        try {
            try {
                if (i26 == 0) {
                    u.b(objG);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        aVar2 = new ex.a();
                        jf0.a aVar3 = this.documentDownloadRepository;
                        List<cf0.c> listA = params.a();
                        aVar.f135650d = vq.j.a(params);
                        aVar.f135651e = jVarA;
                        aVar.f135652f = vq.j.a(aVar2);
                        aVar.f135653g = vq.j.a(aVar2);
                        aVar.f135654h = aVar2;
                        i15 = 0;
                        aVar.f135655j = 0;
                        aVar.f135656k = 0;
                        aVar.f135657l = 0;
                        aVar.f135658m = 0;
                        aVar.f135659n = 0;
                        aVar.f135662r = 1;
                        objG = aVar3.g(listA, aVar);
                        if (objG != E) {
                            params2 = params;
                            jVar = jVarA;
                            i16 = 0;
                            i17 = 0;
                            i18 = 0;
                            i19 = 0;
                            bVar = aVar2;
                            bVar2 = bVar;
                            DocumentGenerationResponse documentGenerationResponse = (DocumentGenerationResponse) aVar2.a((dx.i) objG);
                            df0.f fVar = this.initDownloadTaskWorkUC;
                            String taskId = documentGenerationResponse.getTaskId();
                            cf0.e eVar2 = cf0.e.FIRST_DOWNLOAD;
                            List<DocumentToGenerate> listA2 = documentGenerationResponse.a();
                            linkedHashMap = new LinkedHashMap(lr.m.e(v0.e(v.y(listA2, 10)), 16));
                            it = listA2.iterator();
                            while (it.hasNext()) {
                                DocumentToGenerate documentToGenerate = (DocumentToGenerate) it.next();
                                Iterator it4 = it;
                                r rVarA = y.a(documentToGenerate.getDocumentType(), new AsyncDocumentToGenerate(documentToGenerate.getDocumentId(), documentToGenerate.getDocumentType(), documentToGenerate.getAsyncDownloadTerminationInterval(), documentToGenerate.getMultiDocument(), null, null, null, cf0.e.FIRST_DOWNLOAD, 112, null));
                                linkedHashMap.put(rVarA.c(), rVarA.d());
                                it = it4;
                            }
                            df0.f.Params params3 = new df0.f.Params(taskId, eVar2, linkedHashMap, null, 8, null);
                            aVar.f135650d = vq.j.a(params2);
                            aVar.f135651e = jVar;
                            aVar.f135652f = vq.j.a(bVar2);
                            aVar.f135653g = vq.j.a(bVar);
                            aVar.f135654h = vq.j.a(documentGenerationResponse);
                            aVar.f135655j = i19;
                            aVar.f135656k = i15;
                            aVar.f135657l = i18;
                            aVar.f135658m = i17;
                            aVar.f135659n = i16;
                            aVar.f135662r = 2;
                            objC = fVar.c(params3, aVar);
                            if (objC == E) {
                                return objC;
                            }
                        }
                    } catch (ex.c e15) {
                        e = e15;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        E = jVarA;
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
                            if (iVarA instanceof dx.i.Right) {
                                throw new oq.p();
                            }
                            objB = ((dx.i.Right) iVarA).b();
                        }
                        return new dx.i.Left(objB);
                    }
                } else {
                    if (i26 != 1) {
                        if (i26 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        try {
                            u.b(objG);
                            return objG;
                        } catch (ex.c e18) {
                            e = e18;
                            return new dx.i.Left((dx.b) ex.d.a(e));
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                    }
                    i16 = aVar.f135659n;
                    i17 = aVar.f135658m;
                    i18 = aVar.f135657l;
                    i15 = aVar.f135656k;
                    i19 = aVar.f135655j;
                    aVar2 = (ex.b) aVar.f135654h;
                    bVar = (ex.b) aVar.f135653g;
                    bVar2 = (ex.b) aVar.f135652f;
                    jVar = (dx.j) aVar.f135651e;
                    params2 = (df0.m.Params) aVar.f135650d;
                    try {
                        u.b(objG);
                        DocumentGenerationResponse documentGenerationResponse2 = (DocumentGenerationResponse) aVar2.a((dx.i) objG);
                        df0.f fVar3 = this.initDownloadTaskWorkUC;
                        String taskId2 = documentGenerationResponse2.getTaskId();
                        cf0.e eVar3 = cf0.e.FIRST_DOWNLOAD;
                        List<DocumentToGenerate> listA3 = documentGenerationResponse2.a();
                        linkedHashMap = new LinkedHashMap(lr.m.e(v0.e(v.y(listA3, 10)), 16));
                        it = listA3.iterator();
                        while (it.hasNext()) {
                            DocumentToGenerate documentToGenerate2 = (DocumentToGenerate) it.next();
                            Iterator it5 = it;
                            r rVarA2 = y.a(documentToGenerate2.getDocumentType(), new AsyncDocumentToGenerate(documentToGenerate2.getDocumentId(), documentToGenerate2.getDocumentType(), documentToGenerate2.getAsyncDownloadTerminationInterval(), documentToGenerate2.getMultiDocument(), null, null, null, cf0.e.FIRST_DOWNLOAD, 112, null));
                            linkedHashMap.put(rVarA2.c(), rVarA2.d());
                            it = it5;
                        }
                        df0.f.Params params4 = new df0.f.Params(taskId2, eVar3, linkedHashMap, null, 8, null);
                        aVar.f135650d = vq.j.a(params2);
                        aVar.f135651e = jVar;
                        aVar.f135652f = vq.j.a(bVar2);
                        aVar.f135653g = vq.j.a(bVar);
                        aVar.f135654h = vq.j.a(documentGenerationResponse2);
                        aVar.f135655j = i19;
                        aVar.f135656k = i15;
                        aVar.f135657l = i18;
                        aVar.f135658m = i17;
                        aVar.f135659n = i16;
                        aVar.f135662r = 2;
                        objC = fVar3.c(params4, aVar);
                        if (objC == E) {
                            return objC;
                        }
                    } catch (ex.c e25) {
                        e = e25;
                        return new dx.i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e26) {
                        throw e26;
                    } catch (Exception e27) {
                        e = e27;
                        E = jVar;
                        px.f fVar4 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar4.d(message, e, px.c.a(E));
                        iVarA = E.a(e);
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
                return E;
            } catch (Exception e28) {
                e = e28;
            }
        } catch (CancellationException e29) {
            throw e29;
        }
    }
}
