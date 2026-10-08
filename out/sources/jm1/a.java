package jm1;

import fr.k;
import fr.t;
import iy.b0;
import j14.f;
import j14.g;
import j14.j;
import java.util.Map;
import oq.y;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0001\u0015B1\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0012\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Ljm1/a;", "Lgz/a;", "Ljm1/a$a;", "", "Lim1/a;", "Lhz/b;", "Lj14/f;", "checkIsFirstNameCorrectUC", "Lj14/j;", "checkIsSecondNameCorrectUC", "Lj14/g;", "checkIsLastNameCorrectUC", "Ljm1/b;", "isPeselValidUC", "Lj14/b;", "checkIdCardSeriesAndNumberUC", "<init>", "(Lj14/f;Lj14/j;Lj14/g;Ljm1/b;Lj14/b;)V", "params", "b", "(Ljm1/a$a;)Ljava/util/Map;", "a", "Lj14/f;", "Lj14/j;", "c", "Lj14/g;", "d", "Ljm1/b;", "e", "Lj14/b;", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.a<Params, Map<im1.a, ? extends hz.b>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f checkIsFirstNameCorrectUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j checkIsSecondNameCorrectUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final g checkIsLastNameCorrectUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b isPeselValidUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final j14.b checkIdCardSeriesAndNumberUC;

    /* JADX INFO: renamed from: jm1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u0018\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006#"}, d2 = {"Ljm1/a$a;", "Lgz/b$a;", "Lmm1/a;", "type", "Liy/b0;", "firstName", "secondName", "surname", "Lxw/g;", "pesel", "idSeriesAndNumber", "<init>", "(Lmm1/a;Liy/b0;Liy/b0;Liy/b0;Liy/b0;Liy/b0;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmm1/a;", "h", "()Lmm1/a;", "b", "Liy/b0;", "()Liy/b0;", "c", "d", "f", "e", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f103743g = b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final mm1.a type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 firstName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 secondName;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 surname;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 pesel;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 idSeriesAndNumber;

        public /* synthetic */ Params(mm1.a aVar, b0 b0Var, b0 b0Var2, b0 b0Var3, b0 b0Var4, b0 b0Var5, k kVar) {
            this(aVar, b0Var, b0Var2, b0Var3, b0Var4, b0Var5);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getFirstName() {
            return this.firstName;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b0 getIdSeriesAndNumber() {
            return this.idSeriesAndNumber;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b0 getPesel() {
            return this.pesel;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final b0 getSecondName() {
            return this.secondName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.type == params.type && t.c(this.firstName, params.firstName) && t.c(this.secondName, params.secondName) && t.c(this.surname, params.surname) && xw.g.f(this.pesel, params.pesel) && t.c(this.idSeriesAndNumber, params.idSeriesAndNumber);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final b0 getSurname() {
            return this.surname;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final mm1.a getType() {
            return this.type;
        }

        public int hashCode() {
            return (((((((((this.type.hashCode() * 31) + this.firstName.hashCode()) * 31) + this.secondName.hashCode()) * 31) + this.surname.hashCode()) * 31) + xw.g.h(this.pesel)) * 31) + this.idSeriesAndNumber.hashCode();
        }

        public String toString() {
            return "Params(type=" + this.type + ", firstName=" + this.firstName + ", secondName=" + this.secondName + ", surname=" + this.surname + ", pesel=" + ((Object) xw.g.i(this.pesel)) + ", idSeriesAndNumber=" + this.idSeriesAndNumber + ')';
        }

        private Params(mm1.a aVar, b0 b0Var, b0 b0Var2, b0 b0Var3, b0 b0Var4, b0 b0Var5) {
            this.type = aVar;
            this.firstName = b0Var;
            this.secondName = b0Var2;
            this.surname = b0Var3;
            this.pesel = b0Var4;
            this.idSeriesAndNumber = b0Var5;
        }
    }

    public a(f fVar, j jVar, g gVar, b bVar, j14.b bVar2) {
        this.checkIsFirstNameCorrectUC = fVar;
        this.checkIsSecondNameCorrectUC = jVar;
        this.checkIsLastNameCorrectUC = gVar;
        this.isPeselValidUC = bVar;
        this.checkIdCardSeriesAndNumberUC = bVar2;
    }

    public Map<im1.a, hz.b> b(Params params) {
        im1.a aVar = im1.a.FIRST_NAME;
        hz.g gVarA = this.checkIsFirstNameCorrectUC.a(new f.Params(params.getFirstName()));
        hz.b.Companion companion = hz.b.INSTANCE;
        return v0.l(y.a(aVar, companion.a(gVarA)), y.a(im1.a.SECOND_NAME, companion.a(this.checkIsSecondNameCorrectUC.a(new j.Params(params.getSecondName())))), y.a(im1.a.SURNAME, companion.a(this.checkIsLastNameCorrectUC.a(new g.Params(params.getSurname())))), y.a(im1.a.PESEL, companion.a(this.isPeselValidUC.b(new b.Params(params.getType(), params.getPesel(), null)))), y.a(im1.a.ID_SERIES_AND_NUMBER, companion.a(this.checkIdCardSeriesAndNumberUC.a(new j14.b.Params(false, params.getIdSeriesAndNumber())))));
    }
}
