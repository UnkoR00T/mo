package ng0;

import ag0.DynamicParentDocument;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vf0.MainDocumentPhotoData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lng0/j;", "Leg0/g;", "Lmg0/b;", "repository", "Leg0/j;", "getPhotoFromMainDocumentUC", "<init>", "(Lmg0/b;Leg0/j;)V", "Leg0/g$a;", "params", "Ldx/i;", "Ldx/b;", "Lag0/b;", "d", "(Leg0/g$a;Ltq/e;)Ljava/lang/Object;", "a", "Lmg0/b;", "b", "Leg0/j;", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements eg0.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mg0.b repository;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final eg0.j getPhotoFromMainDocumentUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f136052d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f136053e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f136054f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f136055g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f136056h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f136057j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f136059l;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f136057j = obj;
            this.f136059l |= PKIFailureInfo.systemUnavail;
            return j.this.c(null, this);
        }
    }

    public j(mg0.b bVar, eg0.j jVar) {
        this.repository = bVar;
        this.getPhotoFromMainDocumentUC = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x009c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(eg0.g.Params params, tq.e<? super dx.i<? extends dx.b, DynamicParentDocument>> eVar) throws Throwable {
        a aVar;
        DynamicParentDocument dynamicParentDocument;
        dx.i iVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f136059l;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f136059l = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objD = aVar.f136057j;
        Object objE = uq.b.e();
        int i16 = aVar.f136059l;
        if (i16 == 0) {
            oq.u.b(objD);
            mg0.b bVar = this.repository;
            String documentId = params.getDocumentId();
            aVar.f136052d = vq.j.a(params);
            aVar.f136059l = 1;
            objD = bVar.d(documentId, aVar);
            if (objD != objE) {
            }
            return objE;
        }
        if (i16 == 1) {
            params = (eg0.g.Params) aVar.f136052d;
            oq.u.b(objD);
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            DynamicParentDocument dynamicParentDocument2 = (DynamicParentDocument) aVar.f136054f;
            oq.u.b(objD);
            dynamicParentDocument = dynamicParentDocument2;
        }
        iVar = (dx.i) objD;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(DynamicParentDocument.b(dynamicParentDocument, null, null, (MainDocumentPhotoData) ((dx.i.Right) iVar).b(), null, null, 27, null));
        }
        throw new oq.p();
        dx.i iVar2 = (dx.i) objD;
        if (iVar2 instanceof dx.i.Left) {
            return iVar2;
        }
        if (!(iVar2 instanceof dx.i.Right)) {
            throw new oq.p();
        }
        DynamicParentDocument dynamicParentDocument3 = (DynamicParentDocument) ((dx.i.Right) iVar2).b();
        eg0.j jVar = this.getPhotoFromMainDocumentUC;
        gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
        aVar.f136052d = vq.j.a(params);
        aVar.f136053e = vq.j.a(iVar2);
        aVar.f136054f = dynamicParentDocument3;
        aVar.f136055g = 0;
        aVar.f136056h = 0;
        aVar.f136059l = 2;
        objD = jVar.c(c1792a, aVar);
        if (objD != objE) {
            dynamicParentDocument = dynamicParentDocument3;
            iVar = (dx.i) objD;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (iVar instanceof dx.i.Right) {
                return new dx.i.Right(DynamicParentDocument.b(dynamicParentDocument, null, null, (MainDocumentPhotoData) ((dx.i.Right) iVar).b(), null, null, 27, null));
            }
            throw new oq.p();
        }
        return objE;
    }
}
