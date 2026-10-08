package je3;

import p071kotlin.Metadata;
import tv0.BEVehicleCollisionDescriptionConception;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lje3/a;", "", "<init>", "()V", "Ltv0/i$a;", "address", "", "a", "(Ltv0/i$a;)Ljava/lang/String;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {
    public final String a(BEVehicleCollisionDescriptionConception.LocationDetails address) {
        StringBuilder sb5 = new StringBuilder();
        if (address.getStreetNameAndNumber().l()) {
            sb5.append(address.getStreetNameAndNumber().getText());
            if (address.getPostalCode().l() || address.getCityName().l()) {
                sb5.append("\n");
            }
        }
        if (address.getPostalCode().l()) {
            sb5.append(address.getPostalCode().getText());
            sb5.append(" ");
        }
        if (address.getCityName().l()) {
            sb5.append(address.getCityName().getText());
        }
        return sb5.toString();
    }
}
