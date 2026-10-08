package ho0;

import ge4.x;
import ie4.o;
import jo0.BaeSearchRequestDto;
import jo0.BaeSearchResponseDto;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lho0/k;", "", "", "externalAuthorizationToken", "Ljo0/r;", "baeSearchRequestDto", "Lge4/x;", "Ljo0/s;", "a", "(Ljava/lang/String;Ljo0/r;Ltq/e;)Ljava/lang/Object;", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface k {
    @o("electronic-delivery/mobile/api/search")
    Object a(@ie4.i("External-Authorization-Token") String str, @ie4.a BaeSearchRequestDto baeSearchRequestDto, tq.e<? super x<BaeSearchResponseDto>> eVar);
}
