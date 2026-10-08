package gn0;

import dn0.StartVerificationSession;
import dn0.VerificationSession;
import hn0.GetVerificationSessionByCodeResponseDto;
import hn0.StartVerificationSessionResponseDto;
import java.security.KeyPair;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a!\u0010\n\u001a\u00020\t*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lhn0/e;", "Ldn0/e;", "b", "(Lhn0/e;)Ldn0/e;", "Lhn0/j;", "", "sessionId", "Ljava/security/KeyPair;", "keyPair", "Ldn0/b;", "a", "(Lhn0/j;Ljava/lang/String;Ljava/security/KeyPair;)Ldn0/b;", "documentverificationservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    public static final StartVerificationSession a(StartVerificationSessionResponseDto startVerificationSessionResponseDto, String str, KeyPair keyPair) {
        return new StartVerificationSession(str, startVerificationSessionResponseDto.getSecret(), startVerificationSessionResponseDto.getQrCode(), keyPair, startVerificationSessionResponseDto.getCode());
    }

    public static final VerificationSession b(GetVerificationSessionByCodeResponseDto getVerificationSessionByCodeResponseDto) {
        return new VerificationSession(getVerificationSessionByCodeResponseDto.getQrCode());
    }
}
