package io2;

import ge4.x;
import ie4.f;
import ie4.o;
import ie4.s;
import jo2.AuthorizationStatusResponseDto;
import jo2.CompleteAuthorizationSignedRequestDto;
import jo2.c;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lio2/a;", "", "", "authorizationId", "Lge4/x;", "Ljo2/b;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Ljo2/c;", "action", "Ljo2/d;", "completeAuthorizationSignedRequestDto", "Loq/i0;", "a", "(Ljo2/c;Ljo2/d;Ltq/e;)Ljava/lang/Object;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    @o("trusted-profile/mobile/api/complete-authorization/{action}")
    Object a(@s("action") c cVar, @ie4.a CompleteAuthorizationSignedRequestDto completeAuthorizationSignedRequestDto, e<? super x<i0>> eVar);

    @f("trusted-profile/mobile/api/authorization/{authorizationId}/status")
    Object b(@s("authorizationId") String str, e<? super x<AuthorizationStatusResponseDto>> eVar);
}
