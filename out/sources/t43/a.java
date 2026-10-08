package t43;

import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.feature.services.data.model.TokenResponseDto;
import w43.TokenResponse;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpl/gov/coi/mobywatel/feature/services/data/model/TokenResponseDto;", "Lw43/e;", "a", "(Lpl/gov/coi/mobywatel/feature/services/data/model/TokenResponseDto;)Lw43/e;", "services_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    public static final TokenResponse a(TokenResponseDto tokenResponseDto) {
        return new TokenResponse(tokenResponseDto.getUuid(), tokenResponseDto.getStatus());
    }
}
