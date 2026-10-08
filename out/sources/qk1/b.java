package qk1;

import fr.t;
import hz.g;
import iy.b0;
import j14.c;
import j14.d;
import j14.f;
import j14.j;
import java.util.Map;
import oq.y;
import p071kotlin.Metadata;
import pq.v0;
import tq.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0001\u0019BA\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0016\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lqk1/b;", "Lgz/b;", "Lqk1/b$a;", "", "Llk1/a;", "Lhz/g;", "Lj14/f;", "isFirstNameValidUseCase", "Lj14/j;", "isSecondNameValidUseCase", "Lj14/g;", "isLastNameValidUseCase", "Lj14/d;", "checkIsFamilyNameCorrectUC", "Lj14/c;", "checkIsBirthPlaceCorrectUC", "Lqk1/a;", "checkIsBirthDateCorrectUC", "Lj14/b;", "checkIdCardSeriesAndNumberUC", "<init>", "(Lj14/f;Lj14/j;Lj14/g;Lj14/d;Lj14/c;Lqk1/a;Lj14/b;)V", "params", "d", "(Lqk1/b$a;Ltq/e;)Ljava/lang/Object;", "a", "Lj14/f;", "b", "Lj14/j;", "c", "Lj14/g;", "Lj14/d;", "e", "Lj14/c;", "f", "Lqk1/a;", "g", "Lj14/b;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b<Params, Map<lk1.a, ? extends g>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f isFirstNameValidUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j isSecondNameValidUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final j14.g isLastNameValidUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d checkIsFamilyNameCorrectUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final c checkIsBirthPlaceCorrectUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final a checkIsBirthDateCorrectUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final j14.b checkIdCardSeriesAndNumberUC;

    /* JADX INFO: renamed from: qk1.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b$\u0010!R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001e\u0010\u0011R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\u001a\u0010*R\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b&\u0010!¨\u0006+"}, d2 = {"Lqk1/b$a;", "Lgz/b$a;", "Lkk1/a;", "type", "Liy/b0;", "firstName", "secondName", "lastName", "familyName", "", "birthPlace", "Lfz/b$c;", "birthDate", "idSeriesAndNumber", "<init>", "(Lkk1/a;Liy/b0;Liy/b0;Liy/b0;Liy/b0;Ljava/lang/String;Lfz/b$c;Liy/b0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lkk1/a;", "l", "()Lkk1/a;", "b", "Liy/b0;", "d", "()Liy/b0;", "c", "i", "h", "e", "f", "Ljava/lang/String;", "g", "Lfz/b$c;", "()Lfz/b$c;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f167041j;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final kk1.a type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 firstName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 secondName;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 lastName;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 familyName;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String birthPlace;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final fz.b.LocalDate birthDate;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 idSeriesAndNumber;

        static {
            int i15 = b0.f97726c;
            f167041j = i15 | fz.b.LocalDate.f68860b | i15 | i15 | i15 | i15;
        }

        public Params(kk1.a aVar, b0 b0Var, b0 b0Var2, b0 b0Var3, b0 b0Var4, String str, fz.b.LocalDate localDate, b0 b0Var5) {
            this.type = aVar;
            this.firstName = b0Var;
            this.secondName = b0Var2;
            this.lastName = b0Var3;
            this.familyName = b0Var4;
            this.birthPlace = str;
            this.birthDate = localDate;
            this.idSeriesAndNumber = b0Var5;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final fz.b.LocalDate getBirthDate() {
            return this.birthDate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getBirthPlace() {
            return this.birthPlace;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b0 getFamilyName() {
            return this.familyName;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final b0 getFirstName() {
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
            return this.type == params.type && t.c(this.firstName, params.firstName) && t.c(this.secondName, params.secondName) && t.c(this.lastName, params.lastName) && t.c(this.familyName, params.familyName) && t.c(this.birthPlace, params.birthPlace) && t.c(this.birthDate, params.birthDate) && t.c(this.idSeriesAndNumber, params.idSeriesAndNumber);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final b0 getIdSeriesAndNumber() {
            return this.idSeriesAndNumber;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final b0 getLastName() {
            return this.lastName;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.type.hashCode() * 31) + this.firstName.hashCode()) * 31) + this.secondName.hashCode()) * 31) + this.lastName.hashCode()) * 31) + this.familyName.hashCode()) * 31) + this.birthPlace.hashCode()) * 31;
            fz.b.LocalDate localDate = this.birthDate;
            return ((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31) + this.idSeriesAndNumber.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final b0 getSecondName() {
            return this.secondName;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final kk1.a getType() {
            return this.type;
        }

        public String toString() {
            return "Params(type=" + this.type + ", firstName=" + this.firstName + ", secondName=" + this.secondName + ", lastName=" + this.lastName + ", familyName=" + this.familyName + ", birthPlace=" + this.birthPlace + ", birthDate=" + this.birthDate + ", idSeriesAndNumber=" + this.idSeriesAndNumber + ')';
        }
    }

    public b(f fVar, j jVar, j14.g gVar, d dVar, c cVar, a aVar, j14.b bVar) {
        this.isFirstNameValidUseCase = fVar;
        this.isSecondNameValidUseCase = jVar;
        this.isLastNameValidUseCase = gVar;
        this.checkIsFamilyNameCorrectUC = dVar;
        this.checkIsBirthPlaceCorrectUC = cVar;
        this.checkIsBirthDateCorrectUC = aVar;
        this.checkIdCardSeriesAndNumberUC = bVar;
    }

    public Object d(Params params, e<? super Map<lk1.a, ? extends g>> eVar) {
        return v0.l(y.a(lk1.a.FIRST_NAME, this.isFirstNameValidUseCase.a(new f.Params(params.getFirstName()))), y.a(lk1.a.SECOND_NAME, this.isSecondNameValidUseCase.a(new j.Params(params.getSecondName()))), y.a(lk1.a.LAST_NAME, this.isLastNameValidUseCase.a(new j14.g.Params(params.getLastName()))), y.a(lk1.a.FAMILY_NAME, this.checkIsFamilyNameCorrectUC.a(new d.Params(params.getFamilyName()))), y.a(lk1.a.BIRTH_PLACE, this.checkIsBirthPlaceCorrectUC.a(new c.Params(params.getBirthPlace()))), y.a(lk1.a.BIRTH_DATE, this.checkIsBirthDateCorrectUC.c(new a.Params(params.getType(), params.getBirthDate()))), y.a(lk1.a.ID_SERIES_AND_NUMBER, this.checkIdCardSeriesAndNumberUC.a(new j14.b.Params(false, params.getIdSeriesAndNumber()))));
    }
}
