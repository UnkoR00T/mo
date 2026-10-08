package zt2;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000fB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lzt2/i;", "Lgz/b;", "Lzt2/i$a;", "Lzt2/u;", "Lj14/m;", "checkPeselNumberCorrectUseCase", "Lzt2/h;", "checkIdNumberCorrectUseCase", "Lzt2/j;", "checkVerificationReasonCorrectUseCase", "<init>", "(Lj14/m;Lzt2/h;Lzt2/j;)V", "params", "d", "(Lzt2/i$a;Ltq/e;)Ljava/lang/Object;", "a", "Lj14/m;", "b", "Lzt2/h;", "c", "Lzt2/j;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements gz.b<Params, VerificationCheckValidation> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j14.m checkPeselNumberCorrectUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h checkIdNumberCorrectUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final j checkVerificationReasonCorrectUseCase;

    /* JADX INFO: renamed from: zt2.i$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"Lzt2/i$a;", "Lgz/b$a;", "", "peselNumber", "idNumber", "reason", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String peselNumber;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String idNumber;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String reason;

        public Params(String str, String str2, String str3) {
            this.peselNumber = str;
            this.idNumber = str2;
            this.reason = str3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getIdNumber() {
            return this.idNumber;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPeselNumber() {
            return this.peselNumber;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getReason() {
            return this.reason;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.peselNumber, params.peselNumber) && fr.t.c(this.idNumber, params.idNumber) && fr.t.c(this.reason, params.reason);
        }

        public int hashCode() {
            return (((this.peselNumber.hashCode() * 31) + this.idNumber.hashCode()) * 31) + this.reason.hashCode();
        }

        public String toString() {
            return "Params(peselNumber=" + this.peselNumber + ", idNumber=" + this.idNumber + ", reason=" + this.reason + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f237353d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f237354e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f237355f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f237356g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f237358j;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f237356g = obj;
            this.f237358j |= PKIFailureInfo.systemUnavail;
            return i.this.d(null, this);
        }
    }

    public i(j14.m mVar, h hVar, j jVar) {
        this.checkPeselNumberCorrectUseCase = mVar;
        this.checkIdNumberCorrectUseCase = hVar;
        this.checkVerificationReasonCorrectUseCase = jVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(Params params, tq.e<? super VerificationCheckValidation> eVar) throws Throwable {
        b bVar;
        hz.g gVar;
        hz.g gVar2;
        hz.g gVar3;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f237358j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f237358j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object obj = bVar.f237356g;
        Object objE = uq.b.e();
        int i16 = bVar.f237358j;
        if (i16 == 0) {
            oq.u.b(obj);
            hz.g gVarA = this.checkPeselNumberCorrectUseCase.a(new j14.m.Params(params.getPeselNumber(), false, 2, null));
            h hVar = this.checkIdNumberCorrectUseCase;
            h.Params params2 = new h.Params(params.getIdNumber());
            bVar.f237353d = params;
            bVar.f237354e = gVarA;
            bVar.f237358j = 1;
            Object objH = hVar.h(params2, bVar);
            if (objH != objE) {
                gVar = gVarA;
                obj = objH;
            }
            return objE;
        }
        if (i16 == 1) {
            hz.g gVar4 = (hz.g) bVar.f237354e;
            Params params3 = (Params) bVar.f237353d;
            oq.u.b(obj);
            gVar = gVar4;
            params = params3;
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar2 = (hz.g) bVar.f237355f;
            gVar3 = (hz.g) bVar.f237354e;
            oq.u.b(obj);
        }
        return new VerificationCheckValidation(gVar3, gVar2, (hz.g) obj);
        hz.g gVar5 = (hz.g) obj;
        j jVar = this.checkVerificationReasonCorrectUseCase;
        j.Params params4 = new j.Params(params.getReason());
        bVar.f237353d = vq.j.a(params);
        bVar.f237354e = gVar;
        bVar.f237355f = gVar5;
        bVar.f237358j = 2;
        Object objD = jVar.d(params4, bVar);
        if (objD != objE) {
            obj = objD;
            gVar2 = gVar5;
            gVar3 = gVar;
            return new VerificationCheckValidation(gVar3, gVar2, (hz.g) obj);
        }
        return objE;
    }
}
