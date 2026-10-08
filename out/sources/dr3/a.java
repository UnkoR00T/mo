package dr3;

import cr3.WruDocumentData;
import dx.i;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import tq.e;
import vq.d;
import vq.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00030\t2\u0006\u0010\b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ldr3/a;", "", "Ldr3/a$a;", "Lcr3/e;", "Lar3/a;", "wruContainersInteractor", "<init>", "(Lar3/a;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Ldr3/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lar3/a;", "wru_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ar3.a wruContainersInteractor;

    /* JADX INFO: renamed from: dr3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Ldr3/a$a;", "Lgz/b$a;", "", "licenceCode", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "wru_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int licenceCode;

        public Params(int i15) {
            this.licenceCode = i15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getLicenceCode() {
            return this.licenceCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && this.licenceCode == ((Params) other).licenceCode;
        }

        public int hashCode() {
            return Integer.hashCode(this.licenceCode);
        }

        public String toString() {
            return "Params(licenceCode=" + this.licenceCode + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f44255d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f44256e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f44258g;

        b(e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f44256e = obj;
            this.f44258g |= PKIFailureInfo.systemUnavail;
            return a.this.d(null, this);
        }
    }

    public a(ar3.a aVar) {
        this.wruContainersInteractor = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(Params params, e<? super i<? extends dx.b, WruDocumentData>> eVar) throws Throwable {
        b bVar;
        Object objB;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f44258g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f44258g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objJ = bVar.f44256e;
        Object objE = uq.b.e();
        int i16 = bVar.f44258g;
        if (i16 == 0) {
            u.b(objJ);
            ar3.a aVar = this.wruContainersInteractor;
            int licenceCode = params.getLicenceCode();
            bVar.f44255d = params;
            bVar.f44258g = 1;
            objJ = aVar.j(licenceCode, bVar);
            if (objJ != objE) {
            }
        }
        if (i16 != 1) {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objJ);
            return objJ;
        }
        params = (Params) bVar.f44255d;
        u.b(objJ);
        i iVar = (i) objJ;
        if (iVar instanceof i.Left) {
            objB = vq.b.a(false);
        } else {
            if (!(iVar instanceof i.Right)) {
                throw new p();
            }
            objB = ((i.Right) iVar).b();
        }
        if (!((Boolean) objB).booleanValue()) {
            return new i.Left(new dx.b.Generic(new Exception("CheckAndGetPwzCardDataUseCase " + params.getLicenceCode() + " is not added")));
        }
        ar3.a aVar2 = this.wruContainersInteractor;
        int licenceCode2 = params.getLicenceCode();
        bVar.f44255d = j.a(params);
        bVar.f44258g = 2;
        Object objK = aVar2.k(licenceCode2, bVar);
        return objK == objE ? objE : objK;
    }
}
