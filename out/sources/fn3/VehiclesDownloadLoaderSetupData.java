package fn3;

import fr.k;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fn3.a, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0007¨\u0006\u0011"}, d2 = {"Lfn3/a;", "", "", "registrationNumber", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "vehicles_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehiclesDownloadLoaderSetupData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String registrationNumber;

    /* JADX WARN: Multi-variable type inference failed */
    public VehiclesDownloadLoaderSetupData() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getRegistrationNumber() {
        return this.registrationNumber;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof VehiclesDownloadLoaderSetupData) && t.c(this.registrationNumber, ((VehiclesDownloadLoaderSetupData) other).registrationNumber);
    }

    public int hashCode() {
        String str = this.registrationNumber;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "VehiclesDownloadLoaderSetupData(registrationNumber=" + this.registrationNumber + ')';
    }

    public VehiclesDownloadLoaderSetupData(String str) {
        this.registrationNumber = str;
    }

    public /* synthetic */ VehiclesDownloadLoaderSetupData(String str, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : str);
    }
}
