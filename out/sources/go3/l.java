package go3;

import eo3.DocumentSchemaAttribute;
import eo3.DocumentSchemaForwardAttribute;
import eo3.DynamicDocumentData;
import eo3.DynamicDocumentSchema;
import eo3.MultiDynamicDocumentData;
import eo3.TopAnnotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0018B\u0011\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0003H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lgo3/l;", "", "Lgo3/l$a;", "", "Lco3/q;", "Lbo3/a;", "verificationContainersInteractor", "<init>", "(Lbo3/a;)V", "Leo3/l;", "schema", "", "rawData", "d", "(Leo3/l;Ljava/lang/String;)Ljava/util/List;", "Leo3/g;", "forwardAttributes", "e", "(Ljava/util/List;)Ljava/util/List;", "params", "Ldx/i;", "Ldx/b;", "f", "(Lgo3/l$a;Ltq/e;)Ljava/lang/Object;", "a", "Lbo3/a;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final bo3.a verificationContainersInteractor;

    /* JADX INFO: renamed from: go3.l$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0014\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0018\u0010\u001c¨\u0006\u001d"}, d2 = {"Lgo3/l$a;", "Lgz/b$a;", "Lk34/a0;", "scope", "Lwn3/c;", "entryPoint", "", "hasPicture", "<init>", "(Lk34/a0;Lwn3/c;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lk34/a0;", "c", "()Lk34/a0;", "b", "Lwn3/c;", "()Lwn3/c;", "Z", "()Z", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final k34.a0 scope;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final wn3.c entryPoint;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean hasPicture;

        public Params(k34.a0 a0Var, wn3.c cVar, boolean z15) {
            this.scope = a0Var;
            this.entryPoint = cVar;
            this.hasPicture = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final wn3.c getEntryPoint() {
            return this.entryPoint;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getHasPicture() {
            return this.hasPicture;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final k34.a0 getScope() {
            return this.scope;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.scope, params.scope) && fr.t.c(this.entryPoint, params.entryPoint) && this.hasPicture == params.hasPicture;
        }

        public int hashCode() {
            int iHashCode = this.scope.hashCode() * 31;
            wn3.c cVar = this.entryPoint;
            return ((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + Boolean.hashCode(this.hasPicture);
        }

        public String toString() {
            return "Params(scope=" + this.scope + ", entryPoint=" + this.entryPoint + ", hasPicture=" + this.hasPicture + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f75563d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f75564e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f75565f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f75567h;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f75565f = obj;
            this.f75567h |= PKIFailureInfo.systemUnavail;
            return l.this.f(null, this);
        }
    }

    public l(bo3.a aVar) {
        this.verificationContainersInteractor = aVar;
    }

    private final List<co3.q> d(DynamicDocumentSchema schema, String rawData) {
        Collection collectionN;
        Collection collectionN2;
        List<DocumentSchemaAttribute> listB = schema.b();
        if (listB != null) {
            List<DocumentSchemaAttribute> listU = this.verificationContainersInteractor.u(listB, iy.c0.g(rawData));
            collectionN = new ArrayList();
            Iterator<T> it = listU.iterator();
            while (it.hasNext()) {
                String strZ = this.verificationContainersInteractor.z(((DocumentSchemaAttribute) it.next()).g());
                co3.q.a aVar = strZ != null ? new co3.q.a(strZ) : null;
                if (aVar != null) {
                    collectionN.add(aVar);
                }
            }
        } else {
            collectionN = pq.v.n();
        }
        List<DocumentSchemaAttribute> listA = schema.a();
        if (listA != null) {
            List<DocumentSchemaAttribute> listU2 = this.verificationContainersInteractor.u(listA, iy.c0.g(rawData));
            collectionN2 = new ArrayList();
            Iterator<T> it4 = listU2.iterator();
            while (it4.hasNext()) {
                String strZ2 = this.verificationContainersInteractor.z(((DocumentSchemaAttribute) it4.next()).g());
                co3.q.a aVar2 = strZ2 != null ? new co3.q.a(strZ2) : null;
                if (aVar2 != null) {
                    collectionN2.add(aVar2);
                }
            }
        } else {
            collectionN2 = pq.v.n();
        }
        List<DocumentSchemaAttribute> listU3 = this.verificationContainersInteractor.u(schema.getPicture().a(), iy.c0.g(rawData));
        ArrayList arrayList = new ArrayList();
        Iterator<T> it5 = listU3.iterator();
        while (it5.hasNext()) {
            String strZ3 = this.verificationContainersInteractor.z(((DocumentSchemaAttribute) it5.next()).g());
            co3.q.a aVar3 = strZ3 != null ? new co3.q.a(strZ3) : null;
            if (aVar3 != null) {
                arrayList.add(aVar3);
            }
        }
        co3.q.b bVar = new co3.q.b(co3.p.ANNOTATION);
        TopAnnotation topAnnotation = schema.getTopAnnotation();
        co3.q.b bVar2 = (topAnnotation != null ? topAnnotation.getDynamicSections() : null) != null ? bVar : null;
        List listC = pq.v.c();
        listC.addAll(arrayList);
        listC.addAll(collectionN);
        listC.addAll(collectionN2);
        if (bVar2 != null) {
            listC.add(bVar2);
        }
        return pq.v.a(listC);
    }

    private final List<co3.q> e(List<DocumentSchemaForwardAttribute> forwardAttributes) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = forwardAttributes.iterator();
        while (it.hasNext()) {
            String strZ = this.verificationContainersInteractor.z(((DocumentSchemaForwardAttribute) it.next()).a());
            co3.q.a aVar = strZ != null ? new co3.q.a(strZ) : null;
            if (aVar != null) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(Params params, tq.e<? super dx.i<? extends dx.b, ? extends List<? extends co3.q>>> eVar) throws Throwable {
        b bVar;
        DynamicDocumentData dynamicDocumentData;
        Object next;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f75567h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f75567h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objS = bVar.f75565f;
        Object objE = uq.b.e();
        int i16 = bVar.f75567h;
        if (i16 == 0) {
            oq.u.b(objS);
            if (!(params.getScope() instanceof k34.a0.DynamicMultiDocument)) {
                return new dx.i.Left(new dx.b.Generic(new Exception("Unknown type")));
            }
            rq0.b.c documentType = ((k34.a0.DynamicMultiDocument) params.getScope()).getDocumentType();
            bo3.a aVar = this.verificationContainersInteractor;
            bVar.f75563d = params;
            bVar.f75564e = vq.j.a(documentType);
            bVar.f75567h = 1;
            objS = aVar.s(documentType, bVar);
            if (objS == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            params = (Params) bVar.f75563d;
            oq.u.b(objS);
        }
        dx.i iVar = (dx.i) objS;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        MultiDynamicDocumentData multiDynamicDocumentData = (MultiDynamicDocumentData) ((dx.i.Right) iVar).b();
        if (params.getEntryPoint() instanceof wn3.c.b.DynamicMultiDocument) {
            Iterator<T> it = multiDynamicDocumentData.b().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!fr.t.c(((DynamicDocumentData) next).getDocumentId(), ((wn3.c.b.DynamicMultiDocument) params.getEntryPoint()).getDocumentId()));
            dynamicDocumentData = (DynamicDocumentData) next;
        } else {
            dynamicDocumentData = (DynamicDocumentData) pq.v.n0(multiDynamicDocumentData.b());
        }
        if (dynamicDocumentData == null) {
            return new dx.i.Left(new dx.b.Generic(new Exception("Document data not available")));
        }
        DynamicDocumentSchema schema = dynamicDocumentData.getSchema();
        co3.q.b bVar2 = new co3.q.b(co3.p.PICTURE);
        List<DocumentSchemaForwardAttribute> listD = schema.d();
        List<co3.q> listD2 = (listD == null || listD.isEmpty()) ? d(schema, dynamicDocumentData.getRawData()) : e(schema.d());
        List listC = pq.v.c();
        if (params.getHasPicture()) {
            listC.add(bVar2);
        }
        listC.addAll(listD2);
        return new dx.i.Right(pq.v.a(listC));
    }
}
