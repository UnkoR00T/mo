package eh0;

import bh0.RegisteredAddress;
import bh0.RegisteredAddressDetails;
import bh0.Timeline;
import bh0.TimelineEvent;
import fh0.GetRegisteredAddressDetailsResponse;
import fh0.RegisteredAddressDto;
import fh0.RegisteredAddressRegistrationEventDto;
import fh0.RegisteredAddressTimelineDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lfh0/a;", "Lbh0/c;", "b", "(Lfh0/a;)Lbh0/c;", "Lfh0/b;", "Lbh0/b;", "a", "(Lfh0/b;)Lbh0/b;", "Lfh0/d;", "Lbh0/d;", "c", "(Lfh0/d;)Lbh0/d;", "Lfh0/c;", "Lbh0/e;", "d", "(Lfh0/c;)Lbh0/e;", "addressservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    public static final RegisteredAddress a(RegisteredAddressDto registeredAddressDto) {
        return new RegisteredAddress(registeredAddressDto.getApartmentNumber(), registeredAddressDto.getBuildingNumber(), registeredAddressDto.getCity(), registeredAddressDto.getCommune(), registeredAddressDto.getCounty(), registeredAddressDto.getPostalCode(), registeredAddressDto.getRegistrationFrom(), registeredAddressDto.getRegistrationPeriod(), registeredAddressDto.getStreetName(), registeredAddressDto.getStreetPrefix(), registeredAddressDto.getVoivodeship());
    }

    public static final RegisteredAddressDetails b(GetRegisteredAddressDetailsResponse getRegisteredAddressDetailsResponse) {
        Timeline timelineC = c(getRegisteredAddressDetailsResponse.getTimeline());
        RegisteredAddressDto permanentAddress = getRegisteredAddressDetailsResponse.getPermanentAddress();
        RegisteredAddress registeredAddressA = permanentAddress != null ? a(permanentAddress) : null;
        RegisteredAddressDto temporaryAddress = getRegisteredAddressDetailsResponse.getTemporaryAddress();
        return new RegisteredAddressDetails(timelineC, registeredAddressA, temporaryAddress != null ? a(temporaryAddress) : null);
    }

    public static final Timeline c(RegisteredAddressTimelineDto registeredAddressTimelineDto) {
        boolean dataIncomplete = registeredAddressTimelineDto.getDataIncomplete();
        List<RegisteredAddressRegistrationEventDto> listB = registeredAddressTimelineDto.b();
        ArrayList arrayList = new ArrayList(v.y(listB, 10));
        Iterator<T> it = listB.iterator();
        while (it.hasNext()) {
            arrayList.add(d((RegisteredAddressRegistrationEventDto) it.next()));
        }
        return new Timeline(dataIncomplete, arrayList);
    }

    public static final TimelineEvent d(RegisteredAddressRegistrationEventDto registeredAddressRegistrationEventDto) {
        return new TimelineEvent(registeredAddressRegistrationEventDto.getAddress(), registeredAddressRegistrationEventDto.getPeriod(), registeredAddressRegistrationEventDto.getType());
    }
}
