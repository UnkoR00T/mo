package pl.gov.coi.mobywatel.technical.async.data.storage;

import ay.j;
import dx.i;
import fr.q0;
import iy.b0;
import iy.c0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import lz3.AsyncErrorResponse;
import lz3.DownloadTaskData;
import lz3.TaskIncludedDocumentData;
import nz3.AsyncErrorResponseDto;
import nz3.TaskIncludedDocumentDataDto;
import oq.i0;
import oq.k;
import oq.l;
import oq.p;
import oq.r;
import oq.u;
import oq.y;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \"2\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\b*\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u000e*\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0014H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\t0\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\tH\u0096@¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010\"\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\"\u0010\u001cJ\u0018\u0010#\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b#\u0010\u001cJ\u0010\u0010$\u001a\u00020\u001eH\u0096@¢\u0006\u0004\b$\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010%R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lpl/gov/coi/mobywatel/technical/async/data/storage/h;", "Lpl/gov/coi/mobywatel/technical/async/data/storage/a;", "Lcz/c;", "storageFactory", "Lay/j;", "jsonSerializer", "<init>", "(Lcz/c;Lay/j;)V", "Lnz3/b;", "Llz3/i;", "k", "(Lnz3/b;)Llz3/i;", "m", "(Llz3/i;)Lnz3/b;", "Lnz3/a;", "Llz3/b;", "j", "(Lnz3/a;)Llz3/b;", "l", "(Llz3/b;)Lnz3/a;", "", "a", "(Ltq/e;)Ljava/lang/Object;", "", "id", "Ldx/i;", "Ldx/b;", "e", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "taskData", "Loq/i0;", "b", "(Llz3/i;Ltq/e;)Ljava/lang/Object;", "", "c", "g", "f", "Lay/j;", "Lcz/b;", "Loq/k;", "h", "()Lcz/b;", "storage", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j jsonSerializer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final k storage;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f158910d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f158912f;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f158910d = obj;
            this.f158912f |= PKIFailureInfo.systemUnavail;
            return h.this.a(this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f158913d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f158914e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f158915f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f158916g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f158917h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f158918j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f158919k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f158920l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f158921m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f158922n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f158924q;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f158922n = obj;
            this.f158924q |= PKIFailureInfo.systemUnavail;
            return h.this.e(null, this);
        }
    }

    public h(final cz.c cVar, j jVar) {
        this.jsonSerializer = jVar;
        this.storage = l.a(new er.a() { // from class: pl.gov.coi.mobywatel.technical.async.data.storage.g
            @Override // er.a
            public final Object a() {
                return h.i(cVar);
            }
        });
    }

    private final cz.b h() {
        return (cz.b) this.storage.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cz.b i(cz.c cVar) {
        return cVar.a("shared_prefs_async_tasks", cz.d.ENCRYPTED);
    }

    private final AsyncErrorResponse j(AsyncErrorResponseDto asyncErrorResponseDto) {
        return new AsyncErrorResponse(asyncErrorResponseDto.getBusinessCode(), asyncErrorResponseDto.getTechnicalCode(), asyncErrorResponseDto.getMessage(), asyncErrorResponseDto.getTitle(), asyncErrorResponseDto.getTraceId());
    }

    private final DownloadTaskData k(nz3.b bVar) throws Exception {
        r rVarA;
        String taskId = bVar.getTaskId();
        long startTimestamp = bVar.getStartTimestamp();
        boolean taskCompleted = bVar.getTaskCompleted();
        char[] mainDocumentAuthToken = bVar.getMainDocumentAuthToken();
        b0 b0VarH = mainDocumentAuthToken != null ? c0.h(mainDocumentAuthToken) : null;
        lz3.d dVarA = lz3.d.INSTANCE.a(bVar.getDocumentDownloadMethod());
        if (dVarA == null) {
            throw new Exception("Wrong downloadType entry");
        }
        Map<String, TaskIncludedDocumentDataDto> mapB = bVar.b();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, TaskIncludedDocumentDataDto> entry : mapB.entrySet()) {
            String key = entry.getKey();
            TaskIncludedDocumentDataDto value = entry.getValue();
            rq0.b bVarA = rq0.b.INSTANCE.a(key);
            if (bVarA == null) {
                rVarA = null;
            } else {
                String mainDocumentId = value.getMainDocumentId();
                AsyncErrorResponseDto asyncErrorResponse = value.getAsyncErrorResponse();
                AsyncErrorResponse asyncErrorResponseJ = asyncErrorResponse != null ? j(asyncErrorResponse) : null;
                Long asyncDownloadTerminationInterval = value.getAsyncDownloadTerminationInterval();
                rVarA = y.a(bVarA, new TaskIncludedDocumentData(mainDocumentId, asyncDownloadTerminationInterval != null ? asyncDownloadTerminationInterval.longValue() : 300L, value.getPreviousMainDocumentId(), asyncErrorResponseJ));
            }
            if (rVarA != null) {
                arrayList.add(rVarA);
            }
        }
        return new DownloadTaskData(taskId, startTimestamp, dVarA, taskCompleted, b0VarH, v0.s(arrayList));
    }

    private final AsyncErrorResponseDto l(AsyncErrorResponse asyncErrorResponse) {
        return new AsyncErrorResponseDto(asyncErrorResponse.getBusinessCode(), asyncErrorResponse.getMessage(), asyncErrorResponse.getTechnicalCode(), asyncErrorResponse.getTitle(), asyncErrorResponse.getTraceId());
    }

    private final nz3.b m(DownloadTaskData downloadTaskData) {
        String taskId = downloadTaskData.getTaskId();
        long startTimestamp = downloadTaskData.getStartTimestamp();
        String referenceName = downloadTaskData.getDocumentDownloadMethod().getReferenceName();
        boolean taskCompleted = downloadTaskData.getTaskCompleted();
        b0 mainDocumentAuthToken = downloadTaskData.getMainDocumentAuthToken();
        char[] data = mainDocumentAuthToken != null ? mainDocumentAuthToken.getData() : null;
        Map<rq0.b, TaskIncludedDocumentData> mapD = downloadTaskData.d();
        ArrayList arrayList = new ArrayList(mapD.size());
        for (Map.Entry<rq0.b, TaskIncludedDocumentData> entry : mapD.entrySet()) {
            rq0.b key = entry.getKey();
            TaskIncludedDocumentData value = entry.getValue();
            String referenceName2 = key.getReferenceName();
            String mainDocumentId = value.getMainDocumentId();
            AsyncErrorResponse asyncErrorResponse = value.getAsyncErrorResponse();
            AsyncErrorResponseDto asyncErrorResponseDtoL = asyncErrorResponse != null ? l(asyncErrorResponse) : null;
            arrayList.add(y.a(referenceName2, new TaskIncludedDocumentDataDto(Long.valueOf(value.getAsyncDownloadTerminationInterval()), mainDocumentId, asyncErrorResponseDtoL, value.getPreviousMainDocumentId())));
        }
        return new nz3.b(taskId, referenceName, startTimestamp, taskCompleted, data, v0.s(arrayList));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // pl.gov.coi.mobywatel.technical.async.data.storage.a
    public Object a(tq.e<? super List<DownloadTaskData>> eVar) throws Throwable {
        b bVar;
        i left;
        Object objB;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f158912f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f158912f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objB2 = bVar.f158910d;
        Object objE = uq.b.e();
        int i16 = bVar.f158912f;
        if (i16 == 0) {
            u.b(objB2);
            cz.b bVarH = h();
            bVar.f158912f = 1;
            objB2 = bVarH.b(bVar);
            if (objB2 == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB2);
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) objB2).entrySet()) {
            dx.j<dx.b> jVarA = xw.c.f221622a.a();
            try {
                try {
                    new ex.a();
                    Object value = entry.getValue();
                    String str = value instanceof String ? (String) value : null;
                    left = new i.Right(str != null ? k((nz3.b) this.jsonSerializer.a(str, q0.n(nz3.b.class))) : null);
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
                    } else {
                        if (!(objA instanceof i.Right)) {
                            throw new p();
                        }
                        objB = ((i.Right) objA).b();
                    }
                    left = new i.Left(objB);
                }
            } catch (ex.c e16) {
                try {
                    left = new i.Left((dx.b) ex.d.a(e16));
                } catch (CancellationException e17) {
                    throw e17;
                }
            } catch (CancellationException e18) {
                throw e18;
            }
            DownloadTaskData downloadTaskData = (DownloadTaskData) left.a();
            if (downloadTaskData != null) {
                arrayList.add(downloadTaskData);
            }
        }
        return arrayList;
    }

    @Override // pl.gov.coi.mobywatel.technical.async.data.storage.a
    public Object b(DownloadTaskData downloadTaskData, tq.e<? super i0> eVar) {
        Object objE = h().e(cz.b.a.b(downloadTaskData.getTaskId()), this.jsonSerializer.b(m(downloadTaskData), q0.n(nz3.b.class)), eVar);
        return objE == uq.b.e() ? objE : i0.f148189a;
    }

    @Override // pl.gov.coi.mobywatel.technical.async.data.storage.a
    public Object c(String str, tq.e<? super Boolean> eVar) {
        return h().d(cz.b.a.b(str), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v2, types: [dx.j, java.lang.Object] */
    @Override // pl.gov.coi.mobywatel.technical.async.data.storage.a
    public Object e(String str, tq.e<? super i<? extends dx.b, DownloadTaskData>> eVar) throws Throwable {
        c cVar;
        Object objB;
        ex.c e15;
        String str2;
        DownloadTaskData downloadTaskDataK;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f158924q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f158924q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object obj = cVar.f158922n;
        Object objE = uq.b.e();
        int i16 = cVar.f158924q;
        try {
            try {
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        u.b(obj);
                        str2 = (String) obj;
                        if (str2 != null || (downloadTaskDataK = k((nz3.b) this.jsonSerializer.a(str2, q0.n(nz3.b.class)))) == null) {
                            throw new Exception("TaskData not exist");
                        }
                        return new i.Right(downloadTaskDataK);
                    } catch (ex.c e16) {
                        e15 = e16;
                        return new i.Left((dx.b) ex.d.a(e15));
                    } catch (CancellationException e17) {
                        throw e17;
                    }
                }
                u.b(obj);
                dx.j<dx.b> jVarA = xw.c.f221622a.a();
                try {
                    ex.a aVar = new ex.a();
                    cz.b bVarH = h();
                    String strB = cz.b.a.b(str);
                    cVar.f158913d = vq.j.a(str);
                    cVar.f158914e = jVarA;
                    cVar.f158915f = vq.j.a(aVar);
                    cVar.f158916g = vq.j.a(aVar);
                    cVar.f158917h = 0;
                    cVar.f158918j = 0;
                    cVar.f158919k = 0;
                    cVar.f158920l = 0;
                    cVar.f158921m = 0;
                    cVar.f158924q = 1;
                    Object objJ = bVarH.j(strB, cVar);
                    if (objJ == objE) {
                        return objE;
                    }
                    obj = objJ;
                    str2 = (String) obj;
                    if (str2 != null) {
                    }
                    throw new Exception("TaskData not exist");
                } catch (ex.c e18) {
                    e15 = e18;
                    return new i.Left((dx.b) ex.d.a(e15));
                } catch (CancellationException e19) {
                    throw e19;
                } catch (Exception e25) {
                    e = e25;
                    str = jVarA;
                    px.f fVar = px.f.f163100a;
                    String message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e, px.c.a(str));
                    i iVarA = str.a(e);
                    if (iVarA instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                    } else {
                        if (!(iVarA instanceof i.Right)) {
                            throw new p();
                        }
                        objB = ((i.Right) iVarA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (CancellationException e26) {
                throw e26;
            }
        } catch (Exception e27) {
            e = e27;
        }
    }

    @Override // pl.gov.coi.mobywatel.technical.async.data.storage.a
    public Object f(tq.e<? super i0> eVar) {
        Object objA = h().a(eVar);
        return objA == uq.b.e() ? objA : i0.f148189a;
    }

    @Override // pl.gov.coi.mobywatel.technical.async.data.storage.a
    public Object g(String str, tq.e<? super i0> eVar) {
        Object objK = h().k(cz.b.a.b(str), eVar);
        return objK == uq.b.e() ? objK : i0.f148189a;
    }
}
