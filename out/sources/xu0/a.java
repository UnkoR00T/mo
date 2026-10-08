package xu0;

import ge4.x;
import ie4.f;
import ie4.p;
import ie4.s;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;
import zu0.CountryDetailsResponse;
import zu0.CountryResponse;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\f\u0010\nJ \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\r\u0010\n¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lxu0/a;", "", "Lge4/x;", "Lzu0/j;", "a", "(Ltq/e;)Ljava/lang/Object;", "", "countryIso", "Lzu0/h;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Loq/i0;", "d", "c", "travelabroadservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    @f("abroad-travel/mobile/api/countries")
    Object a(e<? super x<CountryResponse>> eVar);

    @f("abroad-travel/mobile/api/countries/{countryIso}")
    Object b(@s("countryIso") String str, e<? super x<CountryDetailsResponse>> eVar);

    @ie4.b("abroad-travel/mobile/api/countries/{countryIso}/subscription")
    Object c(@s("countryIso") String str, e<? super x<i0>> eVar);

    @p("abroad-travel/mobile/api/countries/{countryIso}/subscription")
    Object d(@s("countryIso") String str, e<? super x<i0>> eVar);
}
