package k23;

import fr.t;
import p071kotlin.Metadata;
import st3.AddressData;

/* JADX INFO: renamed from: k23.d, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lk23/d;", "", "Lk23/l;", "locationDescription", "Lst3/b;", "address", "<init>", "(Lk23/l;Lst3/b;)V", "a", "(Lk23/l;Lst3/b;)Lk23/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lk23/l;", "d", "()Lk23/l;", "b", "Lst3/b;", "c", "()Lst3/b;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Place {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ReportLocationDescription locationDescription;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddressData address;

    public Place(ReportLocationDescription reportLocationDescription, AddressData addressData) {
        this.locationDescription = reportLocationDescription;
        this.address = addressData;
    }

    public static /* synthetic */ Place b(Place place, ReportLocationDescription reportLocationDescription, AddressData addressData, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            reportLocationDescription = place.locationDescription;
        }
        if ((i15 & 2) != 0) {
            addressData = place.address;
        }
        return place.a(reportLocationDescription, addressData);
    }

    public final Place a(ReportLocationDescription locationDescription, AddressData address) {
        return new Place(locationDescription, address);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AddressData getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ReportLocationDescription getLocationDescription() {
        return this.locationDescription;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Place)) {
            return false;
        }
        Place place = (Place) other;
        return t.c(this.locationDescription, place.locationDescription) && t.c(this.address, place.address);
    }

    public int hashCode() {
        ReportLocationDescription reportLocationDescription = this.locationDescription;
        int iHashCode = (reportLocationDescription == null ? 0 : reportLocationDescription.hashCode()) * 31;
        AddressData addressData = this.address;
        return iHashCode + (addressData != null ? addressData.hashCode() : 0);
    }

    public String toString() {
        return "Place(locationDescription=" + this.locationDescription + ", address=" + this.address + ')';
    }

    public /* synthetic */ Place(ReportLocationDescription reportLocationDescription, AddressData addressData, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : reportLocationDescription, (i15 & 2) != 0 ? null : addressData);
    }
}
