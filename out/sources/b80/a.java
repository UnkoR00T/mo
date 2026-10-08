package b80;

import et3.AppActivationChallengeWithKeysResponse;
import et3.AsyncAppActivationWithKeysResponse;
import et3.CertContainerDto;
import et3.ChallengeDto;
import et3.DocumentToGenerateDto;
import et3.GenerateCertResponse;
import et3.JwtDto;
import et3.JwtRequestDto;
import et3.TokenAppActivationRequest;
import iy.c0;
import p071kotlin.Metadata;
import z70.ActivationChallengeWithKeysResponse;
import z70.AppActivationWithKeysResponse;
import z70.CertContainer;
import z70.Challenge;
import z70.DocumentToGenerate;
import z70.Jwt;
import z70.JwtRequest;
import z70.TokenApplicationActivationRequest;
import z70.UpdatedCertificate;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0005*\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0011\u0010\n\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0011\u0010\u000e\u001a\u00020\r*\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0011\u0010\u0016\u001a\u00020\u0015*\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u001a\u001a\u00020\u0019*\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001e\u001a\u00020\u001d*\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0011\u0010\"\u001a\u00020!*\u00020 ¢\u0006\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Let3/a;", "Lz70/a;", "a", "(Let3/a;)Lz70/a;", "Let3/b;", "Lz70/b;", "b", "(Let3/b;)Lz70/b;", "Let3/f;", "Lz70/e;", "e", "(Let3/f;)Lz70/e;", "Let3/c;", "Lz70/c;", "c", "(Let3/c;)Lz70/c;", "Lz70/i;", "Let3/o;", "i", "(Lz70/i;)Let3/o;", "Let3/e;", "Lz70/d;", "d", "(Let3/e;)Lz70/d;", "Let3/j;", "Lz70/f;", "f", "(Let3/j;)Lz70/f;", "Lz70/g;", "Let3/k;", "h", "(Lz70/g;)Let3/k;", "Let3/h;", "Lz70/j;", "g", "(Let3/h;)Lz70/j;", "authenticationservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class a {
    public static final ActivationChallengeWithKeysResponse a(AppActivationChallengeWithKeysResponse appActivationChallengeWithKeysResponse) {
        return new ActivationChallengeWithKeysResponse(appActivationChallengeWithKeysResponse.getActivationChallenge(), appActivationChallengeWithKeysResponse.getActiveDeviceName());
    }

    public static final AppActivationWithKeysResponse b(AsyncAppActivationWithKeysResponse asyncAppActivationWithKeysResponse) {
        return new AppActivationWithKeysResponse(e(asyncAppActivationWithKeysResponse.getDocumentToGenerate()), asyncAppActivationWithKeysResponse.getPeselTicket(), asyncAppActivationWithKeysResponse.getSourceDocumentAccessToken(), c(asyncAppActivationWithKeysResponse.getUserCertificateWithKeys()));
    }

    public static final CertContainer c(CertContainerDto certContainerDto) {
        return new CertContainer(certContainerDto.getCertPKCS12AESSecretKeyBase64(), certContainerDto.getCertPKCS12Base64(), certContainerDto.getPasswordPKCS12Base64(), certContainerDto.getPublicCertBase64());
    }

    public static final Challenge d(ChallengeDto challengeDto) {
        return new Challenge(c0.g(challengeDto.getChallenge()));
    }

    public static final DocumentToGenerate e(DocumentToGenerateDto documentToGenerateDto) {
        return new DocumentToGenerate(documentToGenerateDto.getAsyncDownloadTerminationInterval(), documentToGenerateDto.getDocumentId(), documentToGenerateDto.getTaskId());
    }

    public static final Jwt f(JwtDto jwtDto) {
        return new Jwt(c0.g(jwtDto.getToken()), jwtDto.getValidityInSeconds(), jwtDto.getCertificateRenewalRequired(), jwtDto.getCertificateExpiryDate());
    }

    public static final UpdatedCertificate g(GenerateCertResponse generateCertResponse) {
        return new UpdatedCertificate(generateCertResponse.getUserCertificate().getPublicCertBase64(), generateCertResponse.getPeselTicket(), generateCertResponse.getUserCertificate().getCertPKCS12Base64(), generateCertResponse.getUserCertificate().getCertPKCS12AESSecretKeyBase64(), generateCertResponse.getUserCertificate().getPasswordPKCS12Base64());
    }

    public static final JwtRequestDto h(JwtRequest jwtRequest) {
        return new JwtRequestDto(c0.e(jwtRequest.getSignedChallenge()));
    }

    public static final TokenAppActivationRequest i(TokenApplicationActivationRequest tokenApplicationActivationRequest) {
        return new TokenAppActivationRequest(tokenApplicationActivationRequest.getActivationChallenge(), tokenApplicationActivationRequest.getDeviceName(), tokenApplicationActivationRequest.getPublicKey(), tokenApplicationActivationRequest.c());
    }
}
