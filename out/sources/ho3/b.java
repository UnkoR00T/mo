package ho3;

import co3.n;
import dx.i;
import eo3.DocumentSchemaAttribute;
import eo3.DynamicDocumentData;
import eo3.k;
import fr.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u001b\u001c\u0019B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\r\u001a\u0004\u0018\u00010\f*\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u0004\u0018\u00010\f*\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00152\u0006\u0010\u0014\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lho3/b;", "", "Lho3/b$b;", "Lho3/b$c;", "Lbo3/a;", "verificationContainersInteractor", "<init>", "(Lbo3/a;)V", "", "Leo3/j;", "Lwn3/c;", "entryPoint", "Lco3/n;", "e", "(Ljava/util/List;Lwn3/c;)Lco3/n;", "g", "(Leo3/j;)Lco3/n;", "", "d", "(Leo3/j;)Ljava/lang/String;", "params", "Ldx/i;", "Ldx/b;", "f", "(Lho3/b$b;Ltq/e;)Ljava/lang/Object;", "a", "Lbo3/a;", "b", "c", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f86007c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final bo3.a verificationContainersInteractor;

    /* JADX INFO: renamed from: ho3.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lho3/b$b;", "Lgz/b$a;", "Lwn3/c;", "entryPoint", "Lrq0/b$b;", "dynamicDocumentType", "<init>", "(Lwn3/c;Lrq0/b$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwn3/c;", "b", "()Lwn3/c;", "Lrq0/b$b;", "()Lrq0/b$b;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final wn3.c entryPoint;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.b.EnumC4479b dynamicDocumentType;

        public Params(wn3.c cVar, rq0.b.EnumC4479b enumC4479b) {
            this.entryPoint = cVar;
            this.dynamicDocumentType = enumC4479b;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final rq0.b.EnumC4479b getDynamicDocumentType() {
            return this.dynamicDocumentType;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final wn3.c getEntryPoint() {
            return this.entryPoint;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.entryPoint, params.entryPoint) && this.dynamicDocumentType == params.dynamicDocumentType;
        }

        public int hashCode() {
            wn3.c cVar = this.entryPoint;
            return ((cVar == null ? 0 : cVar.hashCode()) * 31) + this.dynamicDocumentType.hashCode();
        }

        public String toString() {
            return "Params(entryPoint=" + this.entryPoint + ", dynamicDocumentType=" + this.dynamicDocumentType + ')';
        }
    }

    /* JADX INFO: renamed from: ho3.b$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lho3/b$c;", "", "Lco3/n;", "selectedDocument", "", "documentList", "<init>", "(Lco3/n;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lco3/n;", "b", "()Lco3/n;", "Ljava/util/List;", "()Ljava/util/List;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final n selectedDocument;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<n> documentList;

        /* JADX WARN: Multi-variable type inference failed */
        public Result(n nVar, List<? extends n> list) {
            this.selectedDocument = nVar;
            this.documentList = list;
        }

        public final List<n> a() {
            return this.documentList;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final n getSelectedDocument() {
            return this.selectedDocument;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return t.c(this.selectedDocument, result.selectedDocument) && t.c(this.documentList, result.documentList);
        }

        public int hashCode() {
            return (this.selectedDocument.hashCode() * 31) + this.documentList.hashCode();
        }

        public String toString() {
            return "Result(selectedDocument=" + this.selectedDocument + ", documentList=" + this.documentList + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f86013d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f86014e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f86016g;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f86014e = obj;
            this.f86016g |= PKIFailureInfo.systemUnavail;
            return b.this.f(null, this);
        }
    }

    public b(bo3.a aVar) {
        this.verificationContainersInteractor = aVar;
    }

    private final String d(DynamicDocumentData dynamicDocumentData) {
        Object next;
        Object next2;
        Iterator<T> it = dynamicDocumentData.getSchema().getPicture().a().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((DocumentSchemaAttribute) next).getDataType() != k.NAME);
        DocumentSchemaAttribute documentSchemaAttribute = (DocumentSchemaAttribute) next;
        String strQ = documentSchemaAttribute != null ? this.verificationContainersInteractor.q(documentSchemaAttribute, dynamicDocumentData.getRawData()) : null;
        Iterator<T> it4 = dynamicDocumentData.getSchema().getPicture().a().iterator();
        do {
            if (!it4.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it4.next();
        } while (!t.c(((DocumentSchemaAttribute) next2).getFieldReference(), "container.lastName"));
        DocumentSchemaAttribute documentSchemaAttribute2 = (DocumentSchemaAttribute) next2;
        return strQ + ' ' + (documentSchemaAttribute2 != null ? this.verificationContainersInteractor.q(documentSchemaAttribute2, dynamicDocumentData.getRawData()) : null);
    }

    private final n e(List<DynamicDocumentData> list, wn3.c cVar) {
        DynamicDocumentData dynamicDocumentData;
        Object next;
        if (cVar instanceof wn3.c.b.DynamicDocument) {
            Iterator<T> it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!t.c(((DynamicDocumentData) next).getDocumentId(), ((wn3.c.b.DynamicDocument) cVar).getDocumentIID()));
            dynamicDocumentData = (DynamicDocumentData) next;
        } else {
            dynamicDocumentData = (DynamicDocumentData) v.n0(list);
        }
        if (dynamicDocumentData != null) {
            return g(dynamicDocumentData);
        }
        return null;
    }

    private final n g(DynamicDocumentData dynamicDocumentData) {
        return new n.DynamicDocument(dynamicDocumentData.getDocumentId(), dynamicDocumentData.getSchema().getPicture().getSourceContainerRef() != null, d(dynamicDocumentData), false, 8, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(Params params, tq.e<? super i<? extends dx.b, Result>> eVar) throws Throwable {
        d dVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f86016g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f86016g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objT = dVar.f86014e;
        Object objE = uq.b.e();
        int i16 = dVar.f86016g;
        if (i16 == 0) {
            u.b(objT);
            bo3.a aVar = this.verificationContainersInteractor;
            rq0.b.EnumC4479b dynamicDocumentType = params.getDynamicDocumentType();
            dVar.f86013d = params;
            dVar.f86016g = 1;
            objT = aVar.t(dynamicDocumentType, dVar);
            if (objT == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            params = (Params) dVar.f86013d;
            u.b(objT);
        }
        i iVar = (i) objT;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (!(iVar instanceof i.Right)) {
            throw new p();
        }
        List<DynamicDocumentData> list = (List) ((i.Right) iVar).b();
        n nVarE = e(list, params.getEntryPoint());
        if (nVarE == null) {
            return new i.Left(new dx.b.Generic(new Exception("Selected document data not available")));
        }
        List<DynamicDocumentData> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            n nVarG = g((DynamicDocumentData) it.next());
            if (nVarG == null) {
                return new i.Left(new dx.b.Generic(new Exception("Selected subdocument data not available")));
            }
            arrayList.add(nVarG);
        }
        return new i.Right(new Result(nVarE, arrayList));
    }
}
