package lj0;

import ge4.x;
import ie4.o;
import ie4.s;
import ie4.t;
import nj0.InternetAddressPointsResponse;
import nj0.InternetAvailableOperatorsResponse;
import nj0.InternetDemandRequest;
import nj0.InternetDemandResponse;
import nj0.InternetSpeedDictionaryResponse;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007JL\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\b2\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\bH§@¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00042\b\b\u0001\u0010\u0012\u001a\u00020\u00112\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0004H§@¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019À\u0006\u0003"}, d2 = {"Llj0/d;", "", "Lnj0/x;", "internetDemandRequest", "Lge4/x;", "Lnj0/y;", "d", "(Lnj0/x;Ltq/e;)Ljava/lang/Object;", "", "communityId", "cityId", "buildingNumber", "streetId", "apartmentNumber", "Lnj0/v;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "", "addressPointId", "Lnj0/w;", "c", "(JLjava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lnj0/a0;", "b", "(Ltq/e;)Ljava/lang/Object;", "citizenservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {
    @ie4.f("citizen/mobile/api/internet/address-points/{communityId}/{cityId}")
    Object a(@s("communityId") String str, @s("cityId") String str2, @t("buildingNumber") String str3, @t("streetId") String str4, @t("apartmentNumber") String str5, tq.e<? super x<InternetAddressPointsResponse>> eVar);

    @ie4.f("citizen/mobile/api/internet/dictionaries/internet-speed")
    Object b(tq.e<? super x<InternetSpeedDictionaryResponse>> eVar);

    @ie4.f("citizen/mobile/api/internet/available-operators/{addressPointId}/{communityId}")
    Object c(@s("addressPointId") long j15, @s("communityId") String str, tq.e<? super x<InternetAvailableOperatorsResponse>> eVar);

    @o("citizen/mobile/api/internet/demands")
    Object d(@ie4.a InternetDemandRequest internetDemandRequest, tq.e<? super x<InternetDemandResponse>> eVar);
}
