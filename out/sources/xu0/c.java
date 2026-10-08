package xu0;

import ge4.x;
import ie4.f;
import ie4.o;
import ie4.p;
import ie4.s;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;
import zu0.TravelInitResponse;
import zu0.TravelRequest;
import zu0.TravelsV2Response;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0005J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lxu0/c;", "", "Lge4/x;", "Lzu0/s;", "e", "(Ltq/e;)Ljava/lang/Object;", "Lzu0/b0;", "b", "", "uuid", "Loq/i0;", "d", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lzu0/v;", "travelRequest", "c", "(Lzu0/v;Ltq/e;)Ljava/lang/Object;", "a", "(Ljava/lang/String;Lzu0/v;Ltq/e;)Ljava/lang/Object;", "travelabroadservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {
    @p("abroad-travel/mobile/api/v2/travels/{uuid}")
    Object a(@s("uuid") String str, @ie4.a TravelRequest travelRequest, e<? super x<i0>> eVar);

    @f("abroad-travel/mobile/api/v2/travels")
    Object b(e<? super x<TravelsV2Response>> eVar);

    @o("abroad-travel/mobile/api/v2/travels")
    Object c(@ie4.a TravelRequest travelRequest, e<? super x<i0>> eVar);

    @ie4.b("abroad-travel/mobile/api/v2/travels/{uuid}")
    Object d(@s("uuid") String str, e<? super x<i0>> eVar);

    @f("abroad-travel/mobile/api/v2/travels/init-data")
    Object e(e<? super x<TravelInitResponse>> eVar);
}
