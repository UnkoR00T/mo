package ob1;

import ec1.d0;
import fr.t;
import java.util.Map;
import oq.r;
import oq.u;
import oq.y;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v0;
import vq.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0001\u0011B!\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u000e\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lob1/g;", "Lgz/b;", "Lob1/g$a;", "", "Lec1/d0;", "Lhz/g;", "Lob1/b;", "isFullNameValidUseCase", "Lob1/f;", "isShortNameValidUseCase", "Lob1/d;", "isNumberOfEmployeesValidUseCase", "<init>", "(Lob1/b;Lob1/f;Lob1/d;)V", "params", "d", "(Lob1/g$a;Ltq/e;)Ljava/lang/Object;", "a", "Lob1/b;", "b", "Lob1/f;", "c", "Lob1/d;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements gz.b<Params, Map<d0, ? extends hz.g>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ob1.b isFullNameValidUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f isShortNameValidUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d isNumberOfEmployeesValidUseCase;

    /* JADX INFO: renamed from: ob1.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001a\u0010\fR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0018\u0010\f¨\u0006\u001d"}, d2 = {"Lob1/g$a;", "Lgz/b$a;", "", "fullName", "shortName", "numberOfEmployees", "applicantFirstName", "applicantSecondName", "applicantLastName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "h", "c", "f", "e", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fullName;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String shortName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String numberOfEmployees;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String applicantFirstName;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String applicantSecondName;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String applicantLastName;

        public Params(String str, String str2, String str3, String str4, String str5, String str6) {
            this.fullName = str;
            this.shortName = str2;
            this.numberOfEmployees = str3;
            this.applicantFirstName = str4;
            this.applicantSecondName = str5;
            this.applicantLastName = str6;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getApplicantFirstName() {
            return this.applicantFirstName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getApplicantLastName() {
            return this.applicantLastName;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getApplicantSecondName() {
            return this.applicantSecondName;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getFullName() {
            return this.fullName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.fullName, params.fullName) && t.c(this.shortName, params.shortName) && t.c(this.numberOfEmployees, params.numberOfEmployees) && t.c(this.applicantFirstName, params.applicantFirstName) && t.c(this.applicantSecondName, params.applicantSecondName) && t.c(this.applicantLastName, params.applicantLastName);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getNumberOfEmployees() {
            return this.numberOfEmployees;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getShortName() {
            return this.shortName;
        }

        public int hashCode() {
            int iHashCode = ((((((this.fullName.hashCode() * 31) + this.shortName.hashCode()) * 31) + this.numberOfEmployees.hashCode()) * 31) + this.applicantFirstName.hashCode()) * 31;
            String str = this.applicantSecondName;
            return ((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.applicantLastName.hashCode();
        }

        public String toString() {
            return "Params(fullName=" + this.fullName + ", shortName=" + this.shortName + ", numberOfEmployees=" + this.numberOfEmployees + ", applicantFirstName=" + this.applicantFirstName + ", applicantSecondName=" + this.applicantSecondName + ", applicantLastName=" + this.applicantLastName + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f144252d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f144253e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f144254f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f144255g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f144256h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f144257j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f144259l;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f144257j = obj;
            this.f144259l |= PKIFailureInfo.systemUnavail;
            return g.this.d(null, this);
        }
    }

    public g(ob1.b bVar, f fVar, d dVar) {
        this.isFullNameValidUseCase = bVar;
        this.isShortNameValidUseCase = fVar;
        this.isNumberOfEmployeesValidUseCase = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0102  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(Params params, tq.e<? super Map<d0, ? extends hz.g>> eVar) throws Throwable {
        b bVar;
        r[] rVarArr;
        d0 d0Var;
        Params params2;
        int i15;
        r[] rVarArr2;
        d0 d0Var2;
        r[] rVarArr3;
        Params params3;
        d0 d0Var3;
        r[] rVarArr4;
        r[] rVarArr5;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i16 = bVar.f144259l;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f144259l = i16 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objF = bVar.f144257j;
        Object objE = uq.b.e();
        int i17 = bVar.f144259l;
        int i18 = 2;
        int i19 = 1;
        if (i17 == 0) {
            u.b(objF);
            rVarArr = new r[3];
            d0Var = d0.FULL_NAME;
            ob1.b bVar2 = this.isFullNameValidUseCase;
            ob1.b.Params params4 = new ob1.b.Params(params.getFullName(), params.getApplicantFirstName(), params.getApplicantSecondName(), params.getApplicantLastName());
            bVar.f144252d = params;
            bVar.f144253e = rVarArr;
            bVar.f144254f = rVarArr;
            bVar.f144255g = d0Var;
            bVar.f144256h = 0;
            bVar.f144259l = 1;
            objF = bVar2.f(params4, bVar);
            if (objF != objE) {
                params2 = params;
                i15 = 0;
                rVarArr2 = rVarArr;
            }
            return objE;
        }
        if (i17 == 1) {
            i15 = bVar.f144256h;
            d0Var = (d0) bVar.f144255g;
            r[] rVarArr6 = (r[]) bVar.f144254f;
            r[] rVarArr7 = (r[]) bVar.f144253e;
            params2 = (Params) bVar.f144252d;
            u.b(objF);
            rVarArr2 = rVarArr6;
            rVarArr = rVarArr7;
        } else {
            if (i17 == 2) {
                i19 = bVar.f144256h;
                d0Var2 = (d0) bVar.f144255g;
                rVarArr3 = (r[]) bVar.f144254f;
                rVarArr = (r[]) bVar.f144253e;
                params3 = (Params) bVar.f144252d;
                u.b(objF);
                rVarArr3[i19] = y.a(d0Var2, objF);
                d0Var3 = d0.NUMBER_OF_EMPLOYEES;
                d dVar = this.isNumberOfEmployeesValidUseCase;
                d.Params params5 = new d.Params(params3.getNumberOfEmployees());
                bVar.f144252d = j.a(params3);
                bVar.f144253e = rVarArr;
                bVar.f144254f = rVarArr;
                bVar.f144255g = d0Var3;
                bVar.f144256h = 2;
                bVar.f144259l = 3;
                objF = dVar.f(params5, bVar);
                if (objF != objE) {
                    rVarArr4 = rVarArr;
                    rVarArr5 = rVarArr4;
                }
                return objE;
            }
            if (i17 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i18 = bVar.f144256h;
            d0Var3 = (d0) bVar.f144255g;
            rVarArr4 = (r[]) bVar.f144254f;
            rVarArr5 = (r[]) bVar.f144253e;
            u.b(objF);
        }
        rVarArr4[i18] = y.a(d0Var3, objF);
        return v0.l(rVarArr5);
        rVarArr2[i15] = y.a(d0Var, objF);
        d0Var2 = d0.SHORT_NAME;
        f fVar = this.isShortNameValidUseCase;
        f.Params params6 = new f.Params(params2.getShortName());
        bVar.f144252d = params2;
        bVar.f144253e = rVarArr;
        bVar.f144254f = rVarArr;
        bVar.f144255g = d0Var2;
        bVar.f144256h = 1;
        bVar.f144259l = 2;
        objF = fVar.f(params6, bVar);
        if (objF != objE) {
            rVarArr3 = rVarArr;
            params3 = params2;
            rVarArr3[i19] = y.a(d0Var2, objF);
            d0Var3 = d0.NUMBER_OF_EMPLOYEES;
            d dVar2 = this.isNumberOfEmployeesValidUseCase;
            d.Params params7 = new d.Params(params3.getNumberOfEmployees());
            bVar.f144252d = j.a(params3);
            bVar.f144253e = rVarArr;
            bVar.f144254f = rVarArr;
            bVar.f144255g = d0Var3;
            bVar.f144256h = 2;
            bVar.f144259l = 3;
            objF = dVar2.f(params7, bVar);
            if (objF != objE) {
                rVarArr4 = rVarArr;
                rVarArr5 = rVarArr4;
                rVarArr4[i18] = y.a(d0Var3, objF);
                return v0.l(rVarArr5);
            }
        }
        return objE;
    }
}
