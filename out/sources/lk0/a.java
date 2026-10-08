package lk0;

import ge4.x;
import ie4.f;
import ie4.o;
import ie4.s;
import nk0.ExternalQualifiedSignatureAuthenticateRequestDto;
import nk0.ExternalQualifiedSignatureAuthenticateResponseDto;
import nk0.ExternalQualifiedSignatureAuthorizationResponseDto;
import nk0.ExternalQualifiedSignatureAuthorizationStatusResponseDto;
import nk0.ExternalQualifiedSignatureCompleteAuthorizationRequestDto;
import nk0.ExternalQualifiedSignatureGenerateProviderEntryUrlRequestDto;
import nk0.ExternalQualifiedSignatureGenerateProviderEntryUrlResponseDto;
import nk0.ExternalQualifiedSignatureProvidersMobileInfoDto;
import nk0.ExternalQualifiedSignatureStartAuthenticationRequestDto;
import nk0.ExternalQualifiedSignatureStartResponseDto;
import nk0.c;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\bH§@¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\b\b\u0001\u0010\u000f\u001a\u00020\u000e2\b\b\u0001\u0010\u0011\u001a\u00020\u0010H§@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00042\b\b\u0001\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004H§@¢\u0006\u0004\b\u001b\u0010\u001cJ \u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\b\b\u0001\u0010\u001e\u001a\u00020\u001dH§@¢\u0006\u0004\b \u0010!¨\u0006\"À\u0006\u0003"}, d2 = {"Llk0/a;", "", "Lnk0/a;", "externalQualifiedSignatureAuthenticateRequestDto", "Lge4/x;", "Lnk0/b;", "f", "(Lnk0/a;Ltq/e;)Ljava/lang/Object;", "", "processId", "authorizationId", "Lnk0/f;", "c", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lnk0/c;", "action", "Lnk0/g;", "externalQualifiedSignatureCompleteAuthorizationRequestDto", "Lnk0/d;", "b", "(Lnk0/c;Lnk0/g;Ltq/e;)Ljava/lang/Object;", "Lnk0/h;", "externalQualifiedSignatureGenerateProviderEntryUrlRequestDto", "Lnk0/i;", "e", "(Lnk0/h;Ltq/e;)Ljava/lang/Object;", "Lnk0/l;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lnk0/n;", "externalQualifiedSignatureStartAuthenticationRequestDto", "Lnk0/o;", "d", "(Lnk0/n;Ltq/e;)Ljava/lang/Object;", "digitalservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    @f("digital-signature/mobile/api/qualified-signature-process/providers")
    Object a(e<? super x<ExternalQualifiedSignatureProvidersMobileInfoDto>> eVar);

    @o("digital-signature/mobile/api/qualified-signature-process/complete-authorization/{action}")
    Object b(@s("action") c cVar, @ie4.a ExternalQualifiedSignatureCompleteAuthorizationRequestDto externalQualifiedSignatureCompleteAuthorizationRequestDto, e<? super x<ExternalQualifiedSignatureAuthorizationResponseDto>> eVar);

    @f("digital-signature/mobile/api/qualified-signature-process/{processId}/authorization/{authorizationId}/status")
    Object c(@s("processId") String str, @s("authorizationId") String str2, e<? super x<ExternalQualifiedSignatureAuthorizationStatusResponseDto>> eVar);

    @o("digital-signature/mobile/api/qualified-signature-process/start-authentication")
    Object d(@ie4.a ExternalQualifiedSignatureStartAuthenticationRequestDto externalQualifiedSignatureStartAuthenticationRequestDto, e<? super x<ExternalQualifiedSignatureStartResponseDto>> eVar);

    @o("digital-signature/mobile/api/qualified-signature-process/generate-provider-entry-url")
    Object e(@ie4.a ExternalQualifiedSignatureGenerateProviderEntryUrlRequestDto externalQualifiedSignatureGenerateProviderEntryUrlRequestDto, e<? super x<ExternalQualifiedSignatureGenerateProviderEntryUrlResponseDto>> eVar);

    @o("digital-signature/mobile/api/qualified-signature-process/authenticate")
    Object f(@ie4.a ExternalQualifiedSignatureAuthenticateRequestDto externalQualifiedSignatureAuthenticateRequestDto, e<? super x<ExternalQualifiedSignatureAuthenticateResponseDto>> eVar);
}
