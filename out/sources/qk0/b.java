package qk0;

import dx.i;
import jk0.ExternalQualifiedSignatureAuthenticateRequest;
import jk0.ExternalQualifiedSignatureAuthenticateResponse;
import jk0.ExternalQualifiedSignatureAuthorizationResponse;
import jk0.ExternalQualifiedSignatureAuthorizationStatusResponse;
import jk0.ExternalQualifiedSignatureCompleteAuthorizationRequest;
import jk0.ExternalQualifiedSignatureGenerateProviderEntryUrlRequest;
import jk0.ExternalQualifiedSignatureStartAuthenticationRequest;
import jk0.ExternalQualifiedSignatureStartResponse;
import jk0.QualifiedSignatureInfo;
import jk0.QualifiedSignatureProviderEntryResponse;
import jk0.c;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\b\u001a\u00020\fH¦@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u00022\u0006\u0010\b\u001a\u00020\u0010H¦@¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00170\u00022\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\b\u001a\u00020\u0016H¦@¢\u0006\u0004\b\u0018\u0010\u0019J,\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d0\u00022\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH¦@¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006 À\u0006\u0003"}, d2 = {"Lqk0/b;", "", "Ldx/i;", "Ldx/b;", "Ljk0/m;", "a", "(Ltq/e;)Ljava/lang/Object;", "Ljk0/h;", "request", "Ljk0/n;", "c", "(Ljk0/h;Ltq/e;)Ljava/lang/Object;", "Ljk0/j;", "Ljk0/k;", "b", "(Ljk0/j;Ltq/e;)Ljava/lang/Object;", "Ljk0/a;", "Ljk0/b;", "d", "(Ljk0/a;Ltq/e;)Ljava/lang/Object;", "Ljk0/c;", "action", "Ljk0/g;", "Ljk0/d;", "f", "(Ljk0/c;Ljk0/g;Ltq/e;)Ljava/lang/Object;", "", "processId", "authorizationId", "Ljk0/f;", "e", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "digitalservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    Object a(e<? super i<? extends dx.b, QualifiedSignatureInfo>> eVar);

    Object b(ExternalQualifiedSignatureStartAuthenticationRequest externalQualifiedSignatureStartAuthenticationRequest, e<? super i<? extends dx.b, ExternalQualifiedSignatureStartResponse>> eVar);

    Object c(ExternalQualifiedSignatureGenerateProviderEntryUrlRequest externalQualifiedSignatureGenerateProviderEntryUrlRequest, e<? super i<? extends dx.b, QualifiedSignatureProviderEntryResponse>> eVar);

    Object d(ExternalQualifiedSignatureAuthenticateRequest externalQualifiedSignatureAuthenticateRequest, e<? super i<? extends dx.b, ExternalQualifiedSignatureAuthenticateResponse>> eVar);

    Object e(String str, String str2, e<? super i<? extends dx.b, ExternalQualifiedSignatureAuthorizationStatusResponse>> eVar);

    Object f(c cVar, ExternalQualifiedSignatureCompleteAuthorizationRequest externalQualifiedSignatureCompleteAuthorizationRequest, e<? super i<? extends dx.b, ExternalQualifiedSignatureAuthorizationResponse>> eVar);
}
