package i61;

import cl0.BEPassportChildApplicationParentData;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: i61.p, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001d\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001f\u001a\u0004\b\u001a\u0010 ¨\u0006!"}, d2 = {"Li61/p;", "", "Lcl0/r;", "parentData", "Liy/b0;", "birthPlaceFieldValue", "idCardSeriesAndNumberFieldValue", "idCardNameFieldValue", "Lcl0/d;", "documentType", "<init>", "(Lcl0/r;Liy/b0;Liy/b0;Liy/b0;Lcl0/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcl0/r;", "e", "()Lcl0/r;", "b", "Liy/b0;", "()Liy/b0;", "c", "d", "Lcl0/d;", "()Lcl0/d;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ParentFormData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final BEPassportChildApplicationParentData parentData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 birthPlaceFieldValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 idCardSeriesAndNumberFieldValue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 idCardNameFieldValue;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final cl0.d documentType;

    public ParentFormData(BEPassportChildApplicationParentData rVar, b0 b0Var, b0 b0Var2, b0 b0Var3, cl0.d dVar) {
        this.parentData = rVar;
        this.birthPlaceFieldValue = b0Var;
        this.idCardSeriesAndNumberFieldValue = b0Var2;
        this.idCardNameFieldValue = b0Var3;
        this.documentType = dVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b0 getBirthPlaceFieldValue() {
        return this.birthPlaceFieldValue;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final cl0.d getDocumentType() {
        return this.documentType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getIdCardNameFieldValue() {
        return this.idCardNameFieldValue;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final b0 getIdCardSeriesAndNumberFieldValue() {
        return this.idCardSeriesAndNumberFieldValue;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final BEPassportChildApplicationParentData getParentData() {
        return this.parentData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParentFormData)) {
            return false;
        }
        ParentFormData parentFormData = (ParentFormData) other;
        return fr.t.c(this.parentData, parentFormData.parentData) && fr.t.c(this.birthPlaceFieldValue, parentFormData.birthPlaceFieldValue) && fr.t.c(this.idCardSeriesAndNumberFieldValue, parentFormData.idCardSeriesAndNumberFieldValue) && fr.t.c(this.idCardNameFieldValue, parentFormData.idCardNameFieldValue) && this.documentType == parentFormData.documentType;
    }

    public int hashCode() {
        int iHashCode = ((((((this.parentData.hashCode() * 31) + this.birthPlaceFieldValue.hashCode()) * 31) + this.idCardSeriesAndNumberFieldValue.hashCode()) * 31) + this.idCardNameFieldValue.hashCode()) * 31;
        cl0.d dVar = this.documentType;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }

    public String toString() {
        return "ParentFormData(parentData=" + this.parentData + ", birthPlaceFieldValue=" + this.birthPlaceFieldValue + ", idCardSeriesAndNumberFieldValue=" + this.idCardSeriesAndNumberFieldValue + ", idCardNameFieldValue=" + this.idCardNameFieldValue + ", documentType=" + this.documentType + ')';
    }
}
