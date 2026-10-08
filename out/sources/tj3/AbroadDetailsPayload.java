package tj3;

import fr.t;
import java.util.List;
import p071kotlin.Metadata;
import uv0.AbroadBasicData;
import uv0.Risk;
import uv0.j;

/* JADX INFO: renamed from: tj3.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\"\u001a\u0004\b\u001e\u0010#R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b\u0018\u0010#¨\u0006$"}, d2 = {"Ltj3/a;", "", "", "serviceName", "Ltj3/b$d;", "error", "Luv0/a;", "technicalData", "", "Luv0/j;", "odometers", "Luv0/k;", "details", "<init>", "(Ljava/lang/String;Ltj3/b$d;Luv0/a;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "Ltj3/b$d;", "()Ltj3/b$d;", "c", "Luv0/a;", "e", "()Luv0/a;", "Ljava/util/List;", "()Ljava/util/List;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AbroadDetailsPayload {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String serviceName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b.ServiceNoData error;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbroadBasicData technicalData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<j> odometers;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Risk> details;

    public AbroadDetailsPayload(String str, b.ServiceNoData serviceNoData, AbroadBasicData abroadBasicData, List<j> list, List<Risk> list2) {
        this.serviceName = str;
        this.error = serviceNoData;
        this.technicalData = abroadBasicData;
        this.odometers = list;
        this.details = list2;
    }

    public final List<Risk> a() {
        return this.details;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b.ServiceNoData getError() {
        return this.error;
    }

    public final List<j> c() {
        return this.odometers;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getServiceName() {
        return this.serviceName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final AbroadBasicData getTechnicalData() {
        return this.technicalData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AbroadDetailsPayload)) {
            return false;
        }
        AbroadDetailsPayload abroadDetailsPayload = (AbroadDetailsPayload) other;
        return t.c(this.serviceName, abroadDetailsPayload.serviceName) && t.c(this.error, abroadDetailsPayload.error) && t.c(this.technicalData, abroadDetailsPayload.technicalData) && t.c(this.odometers, abroadDetailsPayload.odometers) && t.c(this.details, abroadDetailsPayload.details);
    }

    public int hashCode() {
        int iHashCode = this.serviceName.hashCode() * 31;
        b.ServiceNoData serviceNoData = this.error;
        int iHashCode2 = (iHashCode + (serviceNoData == null ? 0 : serviceNoData.hashCode())) * 31;
        AbroadBasicData abroadBasicData = this.technicalData;
        int iHashCode3 = (iHashCode2 + (abroadBasicData == null ? 0 : abroadBasicData.hashCode())) * 31;
        List<j> list = this.odometers;
        return ((iHashCode3 + (list != null ? list.hashCode() : 0)) * 31) + this.details.hashCode();
    }

    public String toString() {
        return "AbroadDetailsPayload(serviceName=" + this.serviceName + ", error=" + this.error + ", technicalData=" + this.technicalData + ", odometers=" + this.odometers + ", details=" + this.details + ')';
    }
}
