package i82;

import fp0.SummaryData;
import p071kotlin.Metadata;
import w04.LocationDetails;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw04/c;", "Lfp0/j$a;", "a", "(Lw04/c;)Lfp0/j$a;", "gios_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class x0 {
    public static final SummaryData.LocationDetails a(LocationDetails locationDetails) {
        return new SummaryData.LocationDetails(locationDetails.getStreetNameAndNumber().getText(), locationDetails.getCityName().getText(), locationDetails.getPostalCode().getText(), locationDetails.getVoivodeshipName().getText(), locationDetails.getCoordinates());
    }
}
