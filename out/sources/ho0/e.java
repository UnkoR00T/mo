package ho0;

import ge4.x;
import ie4.t;
import jo0.CountriesDictionaryDtoDto;
import jo0.OrganizationsResponseDto;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\b\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lho0/e;", "", "", "externalAuthorizationToken", "Lge4/x;", "Ljo0/u;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "phrase", "Ljo0/h1;", "a", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e {
    @ie4.f("electronic-delivery/mobile/api/organizations")
    Object a(@t("phrase") String str, @ie4.i("External-Authorization-Token") String str2, tq.e<? super x<OrganizationsResponseDto>> eVar);

    @ie4.f("electronic-delivery/mobile/api/countries")
    Object b(@ie4.i("External-Authorization-Token") String str, tq.e<? super x<CountriesDictionaryDtoDto>> eVar);
}
