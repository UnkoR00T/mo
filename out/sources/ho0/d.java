package ho0;

import ge4.x;
import ie4.o;
import jo0.TokenCentralRequestDto;
import jo0.TokenCentralResponseDto;
import jo0.TokenOwRefreshRequestDto;
import jo0.TokenOwRequestDto;
import jo0.TokenOwResponseDto;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lho0/d;", "", "Ljo0/v1;", "tokenCentralRequestDto", "Lge4/x;", "Ljo0/w1;", "a", "(Ljo0/v1;Ltq/e;)Ljava/lang/Object;", "Ljo0/y1;", "tokenOwRequestDto", "Ljo0/z1;", "c", "(Ljo0/y1;Ltq/e;)Ljava/lang/Object;", "Ljo0/x1;", "tokenOwRefreshRequestDto", "b", "(Ljo0/x1;Ltq/e;)Ljava/lang/Object;", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {
    @o("electronic-delivery/mobile/api/external-access-token/token-central")
    Object a(@ie4.a TokenCentralRequestDto tokenCentralRequestDto, tq.e<? super x<TokenCentralResponseDto>> eVar);

    @o("electronic-delivery/mobile/api/external-access-token/token-ow/refresh")
    Object b(@ie4.a TokenOwRefreshRequestDto tokenOwRefreshRequestDto, tq.e<? super x<TokenOwResponseDto>> eVar);

    @o("electronic-delivery/mobile/api/external-access-token/token-ow")
    Object c(@ie4.a TokenOwRequestDto tokenOwRequestDto, tq.e<? super x<TokenOwResponseDto>> eVar);
}
