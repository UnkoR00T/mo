package qv2;

import fr.k;
import fr.t;
import hz.g;
import iy.b0;
import iy.c0;
import j14.c;
import j14.d;
import j14.f;
import j14.j;
import j14.m;
import java.util.Map;
import oq.r;
import oq.u;
import oq.y;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v0;
import sw2.e;
import sw2.e0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0001!BA\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J(\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ$\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u001e\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010'R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010(R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lqv2/b;", "Lgz/b;", "Lqv2/b$a;", "", "Lsw2/e0;", "Lhz/g;", "Lj14/f;", "isFirstNameValidUseCase", "Lj14/j;", "isSecondNameValidUseCase", "Lj14/g;", "isLastNameValidUseCase", "Lj14/d;", "checkIsFamilyNameCorrectUC", "Lj14/m;", "checkPeselNumberCorrectUC", "Lqv2/a;", "isPeselInfoResultValidUseCase", "Lj14/c;", "checkIsBirthPlaceCorrectUC", "<init>", "(Lj14/f;Lj14/j;Lj14/g;Lj14/d;Lj14/m;Lqv2/a;Lj14/c;)V", "Lsw2/e;", "dataRequester", "Lxw/g;", "pesel", "Lg14/a$b;", "peselInfoResult", "e", "(Lsw2/e;Liy/b0;Lg14/a$b;Ltq/e;)Ljava/lang/Object;", "params", "d", "(Lqv2/b$a;Ltq/e;)Ljava/lang/Object;", "a", "Lj14/f;", "b", "Lj14/j;", "c", "Lj14/g;", "Lj14/d;", "Lj14/m;", "f", "Lqv2/a;", "g", "Lj14/c;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b<Params, Map<e0, ? extends g>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f isFirstNameValidUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j isSecondNameValidUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final j14.g isLastNameValidUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d checkIsFamilyNameCorrectUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final m checkPeselNumberCorrectUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a isPeselInfoResultValidUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final c checkIsBirthPlaceCorrectUC;

    /* JADX INFO: renamed from: qv2.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\"\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b \u0010\u0011R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b\u001a\u0010\u0011¨\u0006+"}, d2 = {"Lqv2/b$a;", "Lgz/b$a;", "Lsw2/e;", "dataRequester", "", "firstName", "secondName", "lastName", "familyName", "Lxw/g;", "pesel", "Lg14/a$b;", "peselInfoResult", "birthPlace", "<init>", "(Lsw2/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Liy/b0;Lg14/a$b;Ljava/lang/String;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lsw2/e;", "b", "()Lsw2/e;", "Ljava/lang/String;", "d", "c", "l", "f", "e", "Liy/b0;", "h", "()Liy/b0;", "g", "Lg14/a$b;", "i", "()Lg14/a$b;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final e dataRequester;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String firstName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String secondName;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String lastName;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String familyName;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 pesel;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final g14.a.b peselInfoResult;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String birthPlace;

        public /* synthetic */ Params(e eVar, String str, String str2, String str3, String str4, b0 b0Var, g14.a.b bVar, String str5, k kVar) {
            this(eVar, str, str2, str3, str4, b0Var, bVar, str5);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getBirthPlace() {
            return this.birthPlace;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final e getDataRequester() {
            return this.dataRequester;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getFamilyName() {
            return this.familyName;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getFirstName() {
            return this.firstName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.dataRequester == params.dataRequester && t.c(this.firstName, params.firstName) && t.c(this.secondName, params.secondName) && t.c(this.lastName, params.lastName) && t.c(this.familyName, params.familyName) && xw.g.f(this.pesel, params.pesel) && t.c(this.peselInfoResult, params.peselInfoResult) && t.c(this.birthPlace, params.birthPlace);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getLastName() {
            return this.lastName;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final b0 getPesel() {
            return this.pesel;
        }

        public int hashCode() {
            return (((((((((((((this.dataRequester.hashCode() * 31) + this.firstName.hashCode()) * 31) + this.secondName.hashCode()) * 31) + this.lastName.hashCode()) * 31) + this.familyName.hashCode()) * 31) + xw.g.h(this.pesel)) * 31) + this.peselInfoResult.hashCode()) * 31) + this.birthPlace.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final g14.a.b getPeselInfoResult() {
            return this.peselInfoResult;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final String getSecondName() {
            return this.secondName;
        }

        public String toString() {
            return "Params(dataRequester=" + this.dataRequester + ", firstName=" + this.firstName + ", secondName=" + this.secondName + ", lastName=" + this.lastName + ", familyName=" + this.familyName + ", pesel=" + ((Object) xw.g.i(this.pesel)) + ", peselInfoResult=" + this.peselInfoResult + ", birthPlace=" + this.birthPlace + ')';
        }

        private Params(e eVar, String str, String str2, String str3, String str4, b0 b0Var, g14.a.b bVar, String str5) {
            this.dataRequester = eVar;
            this.firstName = str;
            this.secondName = str2;
            this.lastName = str3;
            this.familyName = str4;
            this.pesel = b0Var;
            this.peselInfoResult = bVar;
            this.birthPlace = str5;
        }
    }

    /* JADX INFO: renamed from: qv2.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C4271b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f169103d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f169104e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f169105f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f169106g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f169107h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f169108j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f169110l;

        C4271b(tq.e<? super C4271b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f169108j = obj;
            this.f169110l |= PKIFailureInfo.systemUnavail;
            return b.this.d(null, this);
        }
    }

    public b(f fVar, j jVar, j14.g gVar, d dVar, m mVar, a aVar, c cVar) {
        this.isFirstNameValidUseCase = fVar;
        this.isSecondNameValidUseCase = jVar;
        this.isLastNameValidUseCase = gVar;
        this.checkIsFamilyNameCorrectUC = dVar;
        this.checkPeselNumberCorrectUC = mVar;
        this.isPeselInfoResultValidUseCase = aVar;
        this.checkIsBirthPlaceCorrectUC = cVar;
    }

    private final Object e(e eVar, b0 b0Var, g14.a.b bVar, tq.e<? super g> eVar2) {
        g gVarA = this.checkPeselNumberCorrectUC.a(new m.Params(c0.e(b0Var), false, 2, null));
        if (gVarA instanceof g.Invalid) {
            return gVarA;
        }
        Object objD = this.isPeselInfoResultValidUseCase.d(new a.Params(eVar, bVar), eVar2);
        return objD == uq.b.e() ? objD : (g) objD;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(Params params, tq.e<? super Map<e0, ? extends g>> eVar) throws Throwable {
        C4271b c4271b;
        r[] rVarArr;
        e0 e0Var;
        r[] rVarArr2;
        Params params2;
        int i15;
        if (eVar instanceof C4271b) {
            c4271b = (C4271b) eVar;
            int i16 = c4271b.f169110l;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                c4271b.f169110l = i16 - PKIFailureInfo.systemUnavail;
            } else {
                c4271b = new C4271b(eVar);
            }
        } else {
            c4271b = new C4271b(eVar);
        }
        Object obj = c4271b.f169108j;
        Object objE = uq.b.e();
        int i17 = c4271b.f169110l;
        if (i17 == 0) {
            u.b(obj);
            rVarArr = new r[6];
            rVarArr[0] = y.a(e0.FIRST_NAME, this.isFirstNameValidUseCase.a(new f.Params(c0.g(params.getFirstName()))));
            rVarArr[1] = y.a(e0.SECOND_NAME, this.isSecondNameValidUseCase.a(new j.Params(c0.g(params.getSecondName()))));
            rVarArr[2] = y.a(e0.LAST_NAME, this.isLastNameValidUseCase.a(new j14.g.Params(c0.g(params.getLastName()))));
            rVarArr[3] = y.a(e0.FAMILY_NAME, this.checkIsFamilyNameCorrectUC.a(new d.Params(c0.g(params.getFamilyName()))));
            e0 e0Var2 = e0.PESEL;
            e dataRequester = params.getDataRequester();
            b0 pesel = params.getPesel();
            g14.a.b peselInfoResult = params.getPeselInfoResult();
            c4271b.f169103d = params;
            c4271b.f169104e = rVarArr;
            c4271b.f169105f = rVarArr;
            c4271b.f169106g = e0Var2;
            c4271b.f169107h = 4;
            c4271b.f169110l = 1;
            Object objE2 = e(dataRequester, pesel, peselInfoResult, c4271b);
            if (objE2 == objE) {
                return objE;
            }
            e0Var = e0Var2;
            obj = objE2;
            rVarArr2 = rVarArr;
            params2 = params;
            i15 = 4;
        } else {
            if (i17 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i15 = c4271b.f169107h;
            e0Var = (e0) c4271b.f169106g;
            rVarArr = (r[]) c4271b.f169105f;
            rVarArr2 = (r[]) c4271b.f169104e;
            params2 = (Params) c4271b.f169103d;
            u.b(obj);
        }
        rVarArr[i15] = y.a(e0Var, obj);
        rVarArr2[5] = y.a(e0.BIRTH_PLACE, this.checkIsBirthPlaceCorrectUC.a(new c.Params(params2.getBirthPlace())));
        return v0.l(rVarArr2);
    }
}
