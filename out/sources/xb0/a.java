package xb0;

import bc0.DocumentPhotoData;
import dx.i;
import fr.t;
import gz.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import vb0.FamilyCardDocument;
import vb0.FamilyCardScope;
import vb0.FamilyCards;
import vb0.FamilyDataContainer;
import vq.d;
import vq.j;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0014\u0012B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lxb0/a;", "", "Lxb0/a$b;", "Lxb0/a$a;", "Lwb0/a;", "documentStorageInteractor", "Lmx/c;", "labelProvider", "<init>", "(Lwb0/a;Lmx/c;)V", "params", "Ldx/i;", "Ldx/b;", "e", "(Lxb0/a$b;Ltq/e;)Ljava/lang/Object;", "Ldx/b$c;", "d", "()Ldx/b$c;", "a", "Lwb0/a;", "b", "Lmx/c;", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wb0.a documentStorageInteractor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: xb0.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lxb0/a$a;", "", "Lbc0/b;", "photoData", "Lvb0/e;", "familyCards", "<init>", "(Lbc0/b;Lvb0/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbc0/b;", "b", "()Lbc0/b;", "Lvb0/e;", "()Lvb0/e;", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FamilyCardData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final DocumentPhotoData photoData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final FamilyCards familyCards;

        public FamilyCardData(DocumentPhotoData documentPhotoData, FamilyCards familyCards) {
            this.photoData = documentPhotoData;
            this.familyCards = familyCards;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final FamilyCards getFamilyCards() {
            return this.familyCards;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final DocumentPhotoData getPhotoData() {
            return this.photoData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FamilyCardData)) {
                return false;
            }
            FamilyCardData familyCardData = (FamilyCardData) other;
            return t.c(this.photoData, familyCardData.photoData) && t.c(this.familyCards, familyCardData.familyCards);
        }

        public int hashCode() {
            return (this.photoData.hashCode() * 31) + this.familyCards.hashCode();
        }

        public String toString() {
            return "FamilyCardData(photoData=" + this.photoData + ", familyCards=" + this.familyCards + ')';
        }
    }

    /* JADX INFO: renamed from: xb0.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lxb0/a$b;", "Lgz/b$a;", "", "documentId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "familycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentId;

        public Params(String str) {
            this.documentId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDocumentId() {
            return this.documentId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.documentId, ((Params) other).documentId);
        }

        public int hashCode() {
            return this.documentId.hashCode();
        }

        public String toString() {
            return "Params(documentId=" + this.documentId + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f217877d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f217878e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f217879f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f217880g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f217881h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f217882j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f217884l;

        c(e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f217882j = obj;
            this.f217884l |= PKIFailureInfo.systemUnavail;
            return a.this.e(null, this);
        }
    }

    public a(wb0.a aVar, mx.c cVar) {
        this.documentStorageInteractor = aVar;
        this.labelProvider = cVar;
    }

    public final dx.b.Business d() {
        return new dx.b.Business(bc0.d.READ_DATA_ERROR, null, this.labelProvider.c(tb0.b.I), this.labelProvider.c(tb0.b.H), null, this.labelProvider.c(tb0.b.f189391b), null, 82, null);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:49:0x0106  */
    /* JADX WARN: Code duplicated, block: B:57:0x0125  */
    /* JADX WARN: Code duplicated, block: B:59:0x0135  */
    /* JADX WARN: Code duplicated, block: B:61:0x013f  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ee A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(Params params, e<? super i<? extends dx.b, FamilyCardData>> eVar) throws Throwable {
        c cVar;
        DocumentPhotoData documentPhotoData;
        i iVar;
        Iterator<T> it;
        Object next;
        FamilyCardScope scopeData;
        FamilyDataContainer data;
        FamilyCardScope scopeData2;
        FamilyDataContainer data2;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f217884l;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f217884l = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objA = cVar.f217882j;
        Object objE = uq.b.e();
        int i16 = cVar.f217884l;
        if (i16 == 0) {
            u.b(objA);
            wb0.a aVar = this.documentStorageInteractor;
            cVar.f217877d = params;
            cVar.f217884l = 1;
            objA = aVar.a(cVar);
            if (objA != objE) {
            }
            return objE;
        }
        if (i16 == 1) {
            params = (Params) cVar.f217877d;
            u.b(objA);
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            documentPhotoData = (DocumentPhotoData) cVar.f217879f;
            u.b(objA);
        }
        iVar = (i) objA;
        if (iVar instanceof i.Left) {
            return new i.Left(d());
        }
        if (iVar instanceof i.Right) {
            throw new p();
        }
        vb0.c cVar2 = (vb0.c) ((i.Right) iVar).b();
        it = cVar2.a().iterator();
        while (true) {
            if (it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            scopeData2 = ((FamilyCardDocument) next).getScopeData();
            if (scopeData2 == null && (data2 = scopeData2.getData()) != null && data2.g()) {
                break;
            }
        }
        FamilyCardDocument familyCardDocument = (FamilyCardDocument) next;
        List<FamilyCardDocument> listA = cVar2.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            scopeData = ((FamilyCardDocument) obj).getScopeData();
            if (scopeData == null && (data = scopeData.getData()) != null && !data.g()) {
                arrayList.add(obj);
            }
        }
        return familyCardDocument != null ? new i.Right(new FamilyCardData(documentPhotoData, new FamilyCards(familyCardDocument, arrayList))) : new i.Left(d());
        i iVar2 = (i) objA;
        if (iVar2 instanceof i.Left) {
            return new i.Left(d());
        }
        if (!(iVar2 instanceof i.Right)) {
            throw new p();
        }
        DocumentPhotoData documentPhotoData2 = (DocumentPhotoData) ((i.Right) iVar2).b();
        wb0.a aVar2 = this.documentStorageInteractor;
        String documentId = params.getDocumentId();
        cVar.f217877d = j.a(params);
        cVar.f217878e = j.a(iVar2);
        cVar.f217879f = documentPhotoData2;
        cVar.f217880g = 0;
        cVar.f217881h = 0;
        cVar.f217884l = 2;
        objA = aVar2.f(documentId, cVar);
        if (objA != objE) {
            documentPhotoData = documentPhotoData2;
            iVar = (i) objA;
            if (iVar instanceof i.Left) {
                return new i.Left(d());
            }
            if (iVar instanceof i.Right) {
                throw new p();
            }
            vb0.c cVar3 = (vb0.c) ((i.Right) iVar).b();
            it = cVar3.a().iterator();
            while (true) {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                scopeData2 = ((FamilyCardDocument) next).getScopeData();
                if (scopeData2 == null) {
                }
            }
            FamilyCardDocument familyCardDocument2 = (FamilyCardDocument) next;
            List<FamilyCardDocument> listA2 = cVar3.a();
            ArrayList arrayList2 = new ArrayList();
            while (r9.hasNext()) {
                scopeData = ((FamilyCardDocument) obj).getScopeData();
                if (scopeData == null) {
                }
            }
            if (familyCardDocument2 != null) {
            }
        }
        return objE;
    }
}
