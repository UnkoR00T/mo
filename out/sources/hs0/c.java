package hs0;

import ge4.x;
import ie4.o;
import ie4.s;
import js0.CardRegistrationResponse;
import js0.StartCardRegistrationRequest;
import js0.StartCardRegistrationResponse;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\u0007J \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lhs0/c;", "", "", "referenceId", "Lge4/x;", "Ljs0/m;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Loq/i0;", "c", "Ljs0/v0;", "startCardRegistrationRequest", "Ljs0/w0;", "d", "(Ljs0/v0;Ltq/e;)Ljava/lang/Object;", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {
    @ie4.f("payment/mobile/api/card-registrations/{referenceId}")
    Object b(@s("referenceId") String str, tq.e<? super x<CardRegistrationResponse>> eVar);

    @o("payment/mobile/api/card-registrations/{referenceId}/error")
    Object c(@s("referenceId") String str, tq.e<? super x<i0>> eVar);

    @o("payment/mobile/api/card-registrations")
    Object d(@ie4.a StartCardRegistrationRequest startCardRegistrationRequest, tq.e<? super x<StartCardRegistrationResponse>> eVar);
}
