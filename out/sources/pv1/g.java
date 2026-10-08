package pv1;

import fr.t;
import java.util.Iterator;
import java.util.List;
import lz3.DocumentDownloadSingleStatus;
import lz3.DocumentDownloadStatus;
import mz3.q;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lpv1/g;", "Lpv1/f;", "Lkv1/a;", "dynamicDocumentContainersInteractor", "Lmz3/q;", "getDocumentDownloadStatusUseCase", "Lpx/d;", "remoteLogger", "<init>", "(Lkv1/a;Lmz3/q;Lpx/d;)V", "Lpv1/f$a;", "params", "Llz3/h;", "d", "(Lpv1/f$a;Ltq/e;)Ljava/lang/Object;", "a", "Lkv1/a;", "b", "Lmz3/q;", "c", "Lpx/d;", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final kv1.a dynamicDocumentContainersInteractor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q getDocumentDownloadStatusUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f162892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f162893b;

        static {
            int[] iArr = new int[lz3.h.values().length];
            try {
                iArr[lz3.h.NOT_READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[lz3.h.TAKES_TOO_LONG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[lz3.h.CREATING_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f162892a = iArr;
            int[] iArr2 = new int[mv1.b.values().length];
            try {
                iArr2[mv1.b.INACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[mv1.b.EXPIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[mv1.b.REVOKED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[mv1.b.ACTIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f162893b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f162894d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f162895e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f162896f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f162897g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f162898h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f162899j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f162901l;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f162899j = obj;
            this.f162901l |= PKIFailureInfo.systemUnavail;
            return g.this.c(null, this);
        }
    }

    public g(kv1.a aVar, q qVar, px.d dVar) {
        this.dynamicDocumentContainersInteractor = aVar;
        this.getDocumentDownloadStatusUseCase = qVar;
        this.remoteLogger = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:49:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:52:0x0101  */
    /* JADX WARN: Code duplicated, block: B:53:0x0106  */
    /* JADX WARN: Code duplicated, block: B:56:0x010f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:78:0x0178  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(f.Params params, tq.e<? super lz3.h> eVar) throws Throwable {
        b bVar;
        f.Params params2;
        mv1.b bVar2;
        f.Params params3;
        dx.b bVar3;
        DocumentDownloadStatus documentDownloadStatus;
        lz3.h status;
        int i15;
        dx.b.Generic generic;
        Throwable e15;
        List<DocumentDownloadSingleStatus> listB;
        Object next;
        DocumentDownloadStatus documentDownloadStatus2;
        lz3.h status2;
        int i16;
        int i17;
        List<DocumentDownloadSingleStatus> listB2;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i18 = bVar.f162901l;
            if ((i18 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f162901l = i18 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objK = bVar.f162899j;
        Object objE = uq.b.e();
        int i19 = bVar.f162901l;
        Object obj = null;
        if (i19 == 0) {
            u.b(objK);
            kv1.a aVar = this.dynamicDocumentContainersInteractor;
            rq0.b documentType = params.getDocumentType();
            String documentIID = params.getDocumentIID();
            bVar.f162894d = params;
            bVar.f162901l = 1;
            objK = aVar.k(null, documentType, documentIID, bVar);
            if (objK != objE) {
            }
            return objE;
        }
        if (i19 != 1) {
            if (i19 != 2) {
                if (i19 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar2 = (mv1.b) bVar.f162896f;
                params2 = (f.Params) bVar.f162894d;
                u.b(objK);
                documentDownloadStatus2 = (DocumentDownloadStatus) objK;
                if (documentDownloadStatus2 != null || (listB2 = documentDownloadStatus2.b()) == null) {
                    status2 = lz3.h.VALID;
                } else {
                    for (Object obj2 : listB2) {
                        if (t.c(((DocumentDownloadSingleStatus) obj2).getDocumentIID(), params2.getDocumentIID())) {
                            obj = obj2;
                            break;
                        }
                    }
                    DocumentDownloadSingleStatus documentDownloadSingleStatus = (DocumentDownloadSingleStatus) obj;
                    if (documentDownloadSingleStatus == null || (status2 = documentDownloadSingleStatus.getStatus()) == null) {
                        status2 = lz3.h.VALID;
                    }
                }
                i16 = a.f162892a[status2.ordinal()];
                if (i16 != 1 && i16 != 2 && i16 != 3) {
                    i17 = a.f162893b[bVar2.ordinal()];
                    if (i17 != 1 || i17 == 2 || i17 == 3) {
                        return lz3.h.REVOKED;
                    }
                    if (i17 != 4) {
                        throw new p();
                    }
                }
                return status2;
            }
            bVar3 = (dx.b) bVar.f162896f;
            params3 = (f.Params) bVar.f162894d;
            u.b(objK);
            documentDownloadStatus = (DocumentDownloadStatus) objK;
            if (documentDownloadStatus != null || (listB = documentDownloadStatus.b()) == null) {
                status = null;
            } else {
                Iterator<T> it = listB.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!t.c(((DocumentDownloadSingleStatus) next).getDocumentIID(), params3.getDocumentIID()));
                DocumentDownloadSingleStatus documentDownloadSingleStatus2 = (DocumentDownloadSingleStatus) next;
                if (documentDownloadSingleStatus2 != null) {
                    status = documentDownloadSingleStatus2.getStatus();
                } else {
                    status = null;
                }
            }
            if (status == null) {
                i15 = -1;
            } else {
                i15 = a.f162892a[status.ordinal()];
            }
            if (i15 == -1) {
                return status;
            }
            px.d dVar = this.remoteLogger;
            List<px.a.Class> listA = px.c.a(this);
            if (bVar3 instanceof dx.b.Generic) {
                generic = (dx.b.Generic) bVar3;
            } else {
                generic = null;
            }
            if (generic != null) {
                e15 = generic.getE();
            } else {
                e15 = null;
            }
            dVar.T6("GetDashboardSingleDocumentStatusUC error | getDocumentValidityStatus", e15, listA);
            i0 i0Var = i0.f148189a;
            return null;
        }
        params = (f.Params) bVar.f162894d;
        u.b(objK);
        dx.i iVar = (dx.i) objK;
        if (iVar instanceof dx.i.Left) {
            dx.b bVar4 = (dx.b) ((dx.i.Left) iVar).b();
            q qVar = this.getDocumentDownloadStatusUseCase;
            q.Params params4 = new q.Params(params.getDocumentType());
            bVar.f162894d = params;
            bVar.f162895e = j.a(iVar);
            bVar.f162896f = bVar4;
            bVar.f162897g = 0;
            bVar.f162898h = 0;
            bVar.f162901l = 2;
            objK = qVar.c(params4, bVar);
            if (objK != objE) {
                params3 = params;
                bVar3 = bVar4;
                documentDownloadStatus = (DocumentDownloadStatus) objK;
                if (documentDownloadStatus != null) {
                    status = null;
                } else {
                    status = null;
                }
                if (status == null) {
                    i15 = -1;
                } else {
                    i15 = a.f162892a[status.ordinal()];
                }
                if (i15 == -1) {
                    return status;
                }
                px.d dVar2 = this.remoteLogger;
                List<px.a.Class> listA2 = px.c.a(this);
                if (bVar3 instanceof dx.b.Generic) {
                    generic = (dx.b.Generic) bVar3;
                } else {
                    generic = null;
                }
                if (generic != null) {
                    e15 = generic.getE();
                } else {
                    e15 = null;
                }
                dVar2.T6("GetDashboardSingleDocumentStatusUC error | getDocumentValidityStatus", e15, listA2);
                i0 i0Var2 = i0.f148189a;
                return null;
            }
        } else {
            if (!(iVar instanceof dx.i.Right)) {
                throw new p();
            }
            mv1.b bVar5 = (mv1.b) ((dx.i.Right) iVar).b();
            q qVar2 = this.getDocumentDownloadStatusUseCase;
            q.Params params5 = new q.Params(params.getDocumentType());
            bVar.f162894d = params;
            bVar.f162895e = j.a(iVar);
            bVar.f162896f = bVar5;
            bVar.f162897g = 0;
            bVar.f162898h = 0;
            bVar.f162901l = 3;
            objK = qVar2.c(params5, bVar);
            if (objK != objE) {
                params2 = params;
                bVar2 = bVar5;
                documentDownloadStatus2 = (DocumentDownloadStatus) objK;
                if (documentDownloadStatus2 != null) {
                    status2 = lz3.h.VALID;
                } else {
                    status2 = lz3.h.VALID;
                }
                i16 = a.f162892a[status2.ordinal()];
                if (i16 != 1) {
                    i17 = a.f162893b[bVar2.ordinal()];
                    if (i17 != 1) {
                    }
                    return lz3.h.REVOKED;
                }
                return status2;
            }
        }
        return objE;
    }
}
