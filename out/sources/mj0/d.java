package mj0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nj0.InternetAddressPointDto;
import nj0.InternetAddressPointsResponse;
import nj0.InternetAvailableOperatorsResponse;
import nj0.InternetDemandRequest;
import nj0.InternetOperatorDto;
import nj0.InternetSpeedDictionaryResponse;
import nj0.InternetSpeedDto;
import p071kotlin.Metadata;
import pq.v;
import zi0.InternetAddressPoint;
import zi0.InternetAddressPoints;
import zi0.InternetAvailableOperators;
import zi0.InternetDemandResponse;
import zi0.InternetOperator;
import zi0.InternetSpeed;
import zi0.InternetSpeedDictionary;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lnj0/a0;", "Lzi0/h;", "g", "(Lnj0/a0;)Lzi0/h;", "Lnj0/b0;", "Lzi0/g;", "f", "(Lnj0/b0;)Lzi0/g;", "Lnj0/v;", "Lzi0/b;", "b", "(Lnj0/v;)Lzi0/b;", "Lnj0/u;", "Lzi0/a;", "a", "(Lnj0/u;)Lzi0/a;", "Lnj0/w;", "Lzi0/c;", "c", "(Lnj0/w;)Lzi0/c;", "Lnj0/z;", "Lzi0/f;", "e", "(Lnj0/z;)Lzi0/f;", "Lzi0/d;", "Lnj0/x;", "h", "(Lzi0/d;)Lnj0/x;", "Lnj0/y;", "Lzi0/e;", "d", "(Lnj0/y;)Lzi0/e;", "citizenservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d {
    public static final InternetAddressPoint a(InternetAddressPointDto internetAddressPointDto) {
        return new InternetAddressPoint(internetAddressPointDto.getCommunityId(), internetAddressPointDto.getDisplayAddress(), internetAddressPointDto.getId());
    }

    public static final InternetAddressPoints b(InternetAddressPointsResponse internetAddressPointsResponse) {
        List<InternetAddressPointDto> listA = internetAddressPointsResponse.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(a((InternetAddressPointDto) it.next()));
        }
        return new InternetAddressPoints(arrayList, internetAddressPointsResponse.getExactMatch());
    }

    public static final InternetAvailableOperators c(InternetAvailableOperatorsResponse internetAvailableOperatorsResponse) {
        List<InternetOperatorDto> listA = internetAvailableOperatorsResponse.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(e((InternetOperatorDto) it.next()));
        }
        return new InternetAvailableOperators(arrayList);
    }

    public static final InternetDemandResponse d(nj0.InternetDemandResponse internetDemandResponse) {
        return new InternetDemandResponse(internetDemandResponse.getDemandId());
    }

    public static final InternetOperator e(InternetOperatorDto internetOperatorDto) {
        return new InternetOperator(internetOperatorDto.getId(), internetOperatorDto.getName());
    }

    public static final InternetSpeed f(InternetSpeedDto internetSpeedDto) {
        return new InternetSpeed(internetSpeedDto.getUnit(), internetSpeedDto.getValue());
    }

    public static final InternetSpeedDictionary g(InternetSpeedDictionaryResponse internetSpeedDictionaryResponse) {
        List<InternetSpeedDto> listA = internetSpeedDictionaryResponse.a();
        ArrayList arrayList = new ArrayList(v.y(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(f((InternetSpeedDto) it.next()));
        }
        List<InternetSpeedDto> listB = internetSpeedDictionaryResponse.b();
        ArrayList arrayList2 = new ArrayList(v.y(listB, 10));
        Iterator<T> it4 = listB.iterator();
        while (it4.hasNext()) {
            arrayList2.add(f((InternetSpeedDto) it4.next()));
        }
        return new InternetSpeedDictionary(arrayList, arrayList2);
    }

    public static final InternetDemandRequest h(zi0.InternetDemandRequest internetDemandRequest) {
        return new InternetDemandRequest(internetDemandRequest.getAddressPointId(), internetDemandRequest.getCommunityId(), internetDemandRequest.getDataShareConsent(), internetDemandRequest.g(), internetDemandRequest.getUpgrade(), internetDemandRequest.getApartmentNumber(), internetDemandRequest.getDownlink(), internetDemandRequest.getEmail(), internetDemandRequest.getPhoneNumber(), internetDemandRequest.getUplink());
    }
}
