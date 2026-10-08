package t02;

import eo0.CountryDictionary;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lt02/z;", "Lgz/a;", "Lt02/z$a;", "Lhz/g;", "Lj14/p;", "checkPostalCodeCorrectUC", "Lj14/o;", "checkPolishPostalCodeCorrectUC", "<init>", "(Lj14/p;Lj14/o;)V", "params", "b", "(Lt02/z$a;)Lhz/g;", "a", "Lj14/p;", "Lj14/o;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z implements gz.a<Params, hz.g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j14.p checkPostalCodeCorrectUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j14.o checkPolishPostalCodeCorrectUC;

    /* JADX INFO: renamed from: t02.z$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Lt02/z$a;", "Lgz/b$a;", "", "postalCode", "Leo0/l;", "countryDictionary", "<init>", "(Ljava/lang/String;Leo0/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Leo0/l;", "()Leo0/l;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String postalCode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final CountryDictionary countryDictionary;

        public Params(String str, CountryDictionary countryDictionary) {
            this.postalCode = str;
            this.countryDictionary = countryDictionary;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CountryDictionary getCountryDictionary() {
            return this.countryDictionary;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPostalCode() {
            return this.postalCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.postalCode, params.postalCode) && fr.t.c(this.countryDictionary, params.countryDictionary);
        }

        public int hashCode() {
            int iHashCode = this.postalCode.hashCode() * 31;
            CountryDictionary countryDictionary = this.countryDictionary;
            return iHashCode + (countryDictionary == null ? 0 : countryDictionary.hashCode());
        }

        public String toString() {
            return "Params(postalCode=" + this.postalCode + ", countryDictionary=" + this.countryDictionary + ')';
        }
    }

    public z(j14.p pVar, j14.o oVar) {
        this.checkPostalCodeCorrectUC = pVar;
        this.checkPolishPostalCodeCorrectUC = oVar;
    }

    public hz.g b(Params params) {
        CountryDictionary countryDictionary = params.getCountryDictionary();
        return fr.t.c(countryDictionary != null ? countryDictionary.getCountryCode() : null, "PL") ? this.checkPolishPostalCodeCorrectUC.a(new j14.o.Params(iy.c0.g(params.getPostalCode()), false)) : this.checkPostalCodeCorrectUC.a(new j14.p.Params(params.getPostalCode(), false));
    }
}
