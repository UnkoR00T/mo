package wl0;

import ge4.x;
import gm0.CommunityOfficesResponse;
import gm0.ElectronicDeliveryAddressResponse;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lwl0/d;", "", "Lge4/x;", "Lgm0/s1;", "a", "(Ltq/e;)Ljava/lang/Object;", "", "communityOfficeId", "Lgm0/b2;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {
    @ie4.f("document-management/mobile/api/community-offices")
    Object a(tq.e<? super x<CommunityOfficesResponse>> eVar);

    @ie4.f("document-management/mobile/api/community-offices/edor/{communityOfficeId}")
    Object b(@ie4.s("communityOfficeId") String str, tq.e<? super x<ElectronicDeliveryAddressResponse>> eVar);
}
