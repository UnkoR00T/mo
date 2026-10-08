package zt2;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: renamed from: zt2.l, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0019\u001a\u0004\b \u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u0018\u0010\u001bR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b\u001f\u0010\u001b¨\u0006!"}, d2 = {"Lzt2/l;", "", "Lhz/g;", "companyNameValidation", "companyCityValidation", "companyPostalCodeValidation", "companyStreetValidation", "companyBuildingNumberValidation", "companyApartmentNumberValidation", "companyIdNumberValidation", "<init>", "(Lhz/g;Lhz/g;Lhz/g;Lhz/g;Lhz/g;Lhz/g;Lhz/g;)V", "", "h", "()Z", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lhz/g;", "e", "()Lhz/g;", "b", "c", "f", "d", "g", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CompanyDataValidation {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f237364h = hz.g.f86851a;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.g companyNameValidation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.g companyCityValidation;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.g companyPostalCodeValidation;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.g companyStreetValidation;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.g companyBuildingNumberValidation;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.g companyApartmentNumberValidation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.g companyIdNumberValidation;

    public CompanyDataValidation(hz.g gVar, hz.g gVar2, hz.g gVar3, hz.g gVar4, hz.g gVar5, hz.g gVar6, hz.g gVar7) {
        this.companyNameValidation = gVar;
        this.companyCityValidation = gVar2;
        this.companyPostalCodeValidation = gVar3;
        this.companyStreetValidation = gVar4;
        this.companyBuildingNumberValidation = gVar5;
        this.companyApartmentNumberValidation = gVar6;
        this.companyIdNumberValidation = gVar7;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final hz.g getCompanyApartmentNumberValidation() {
        return this.companyApartmentNumberValidation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final hz.g getCompanyBuildingNumberValidation() {
        return this.companyBuildingNumberValidation;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final hz.g getCompanyCityValidation() {
        return this.companyCityValidation;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final hz.g getCompanyIdNumberValidation() {
        return this.companyIdNumberValidation;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final hz.g getCompanyNameValidation() {
        return this.companyNameValidation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompanyDataValidation)) {
            return false;
        }
        CompanyDataValidation companyDataValidation = (CompanyDataValidation) other;
        return fr.t.c(this.companyNameValidation, companyDataValidation.companyNameValidation) && fr.t.c(this.companyCityValidation, companyDataValidation.companyCityValidation) && fr.t.c(this.companyPostalCodeValidation, companyDataValidation.companyPostalCodeValidation) && fr.t.c(this.companyStreetValidation, companyDataValidation.companyStreetValidation) && fr.t.c(this.companyBuildingNumberValidation, companyDataValidation.companyBuildingNumberValidation) && fr.t.c(this.companyApartmentNumberValidation, companyDataValidation.companyApartmentNumberValidation) && fr.t.c(this.companyIdNumberValidation, companyDataValidation.companyIdNumberValidation);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final hz.g getCompanyPostalCodeValidation() {
        return this.companyPostalCodeValidation;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final hz.g getCompanyStreetValidation() {
        return this.companyStreetValidation;
    }

    public final boolean h() {
        List listQ = v.q(this.companyNameValidation, this.companyCityValidation, this.companyStreetValidation, this.companyPostalCodeValidation, this.companyApartmentNumberValidation, this.companyBuildingNumberValidation, this.companyIdNumberValidation);
        if ((listQ instanceof Collection) && listQ.isEmpty()) {
            return true;
        }
        Iterator it = listQ.iterator();
        while (it.hasNext()) {
            if (((hz.g) it.next()) instanceof hz.g.Invalid) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (((((((((((this.companyNameValidation.hashCode() * 31) + this.companyCityValidation.hashCode()) * 31) + this.companyPostalCodeValidation.hashCode()) * 31) + this.companyStreetValidation.hashCode()) * 31) + this.companyBuildingNumberValidation.hashCode()) * 31) + this.companyApartmentNumberValidation.hashCode()) * 31) + this.companyIdNumberValidation.hashCode();
    }

    public String toString() {
        return "CompanyDataValidation(companyNameValidation=" + this.companyNameValidation + ", companyCityValidation=" + this.companyCityValidation + ", companyPostalCodeValidation=" + this.companyPostalCodeValidation + ", companyStreetValidation=" + this.companyStreetValidation + ", companyBuildingNumberValidation=" + this.companyBuildingNumberValidation + ", companyApartmentNumberValidation=" + this.companyApartmentNumberValidation + ", companyIdNumberValidation=" + this.companyIdNumberValidation + ')';
    }
}
