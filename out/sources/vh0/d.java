package vh0;

import ge4.x;
import ie4.o;
import p071kotlin.Metadata;
import xh0.AppActivationChallengeWithKeysResponseDto;
import xh0.GenerateActivationChallengeRequestDto;
import xh0.InitExternalAuthInputDto;
import xh0.InitExternalAuthnMobileResponseDto;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lvh0/d;", "", "Lxh0/m;", "generateActivationChallengeRequestDto", "Lge4/x;", "Lxh0/a;", "a", "(Lxh0/m;Ltq/e;)Ljava/lang/Object;", "Lxh0/p;", "initExternalAuthInputDto", "Lxh0/q;", "b", "(Lxh0/p;Ltq/e;)Ljava/lang/Object;", "authenticationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {
    @o("authentication/mobile/api/activation/wk/activation-challenge-with-keys")
    Object a(@ie4.a GenerateActivationChallengeRequestDto generateActivationChallengeRequestDto, tq.e<? super x<AppActivationChallengeWithKeysResponseDto>> eVar);

    @o("authentication/mobile/api/activation/wk/init-external-authentication")
    Object b(@ie4.a InitExternalAuthInputDto initExternalAuthInputDto, tq.e<? super x<InitExternalAuthnMobileResponseDto>> eVar);
}
