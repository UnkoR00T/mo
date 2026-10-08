package go3;

import do3.DrivingLicencesData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\nH\u0082@¢\u0006\u0004\b\f\u0010\rJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00030\n2\u0006\u0010\u000e\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lgo3/w0;", "", "Lgo3/w0$a;", "Loq/i0;", "Lbo3/a;", "verificationContainersInteractor", "Lmx/c;", "labelProvider", "<init>", "(Lbo3/a;Lmx/c;)V", "Ldx/i;", "Ldx/b;", "f", "(Ltq/e;)Ljava/lang/Object;", "params", "e", "(Lgo3/w0$a;Ltq/e;)Ljava/lang/Object;", "a", "Lbo3/a;", "Ldx/b$c;", "b", "Ldx/b$c;", "inactiveDocumentError", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w0 implements gz.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f75737c = dx.b.Business.f45029h;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final bo3.a verificationContainersInteractor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business inactiveDocumentError;

    /* JADX INFO: renamed from: go3.w0$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lgo3/w0$a;", "Lgz/b$a;", "Lrq0/b;", "selectedDocumentType", "<init>", "(Lrq0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrq0/b;", "()Lrq0/b;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.b selectedDocumentType;

        public Params(rq0.b bVar) {
            this.selectedDocumentType = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final rq0.b getSelectedDocumentType() {
            return this.selectedDocumentType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && fr.t.c(this.selectedDocumentType, ((Params) other).selectedDocumentType);
        }

        public int hashCode() {
            return this.selectedDocumentType.hashCode();
        }

        public String toString() {
            return "Params(selectedDocumentType=" + this.selectedDocumentType + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f75741d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f75743f;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f75741d = obj;
            this.f75743f |= PKIFailureInfo.systemUnavail;
            return w0.this.f(this);
        }
    }

    public w0(bo3.a aVar, mx.c cVar) {
        this.verificationContainersInteractor = aVar;
        this.inactiveDocumentError = new dx.b.Business(co3.a.DOCUMENT_NOT_FOUND, null, cVar.c(un3.b.M), cVar.c(un3.b.N), null, cVar.c(un3.b.f199406d), null, 82, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f75743f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f75743f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objW = bVar.f75741d;
        Object objE = uq.b.e();
        int i16 = bVar.f75743f;
        if (i16 == 0) {
            oq.u.b(objW);
            bo3.a aVar = this.verificationContainersInteractor;
            bVar.f75743f = 1;
            objW = aVar.w(bVar);
            if (objW == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objW);
        }
        dx.i iVar = (dx.i) objW;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return ((DrivingLicencesData) ((dx.i.Right) iVar).b()).getHasDrivingLicence() ? new dx.i.Right(oq.i0.f148189a) : new dx.i.Left(this.inactiveDocumentError);
        }
        throw new oq.p();
    }

    public Object e(Params params, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
        return params.getSelectedDocumentType() == rq0.b.d.DRIVING_LICENCE ? f(eVar) : new dx.i.Right(oq.i0.f148189a);
    }
}
