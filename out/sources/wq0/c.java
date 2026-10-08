package wq0;

import fv.e0;
import ge4.x;
import ie4.f;
import ie4.o;
import ie4.s;
import p071kotlin.Metadata;
import tq.e;
import yq0.CreateNationalCourtRegisterSubscriptionRequest;
import yq0.CreateNationalCourtRegisterSubscriptionResponse;
import yq0.NationalCourtRegisterEntriesResponse;
import yq0.UpdateNationalCourtRegisterSubscriptionRequest;
import yq0.UpdateNationalCourtRegisterSubscriptionResponse;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00042\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0010\u0010\u0011J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004H§@¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015À\u0006\u0003"}, d2 = {"Lwq0/c;", "", "Lyq0/c;", "createNationalCourtRegisterSubscriptionRequest", "Lge4/x;", "Lyq0/d;", "c", "(Lyq0/c;Ltq/e;)Ljava/lang/Object;", "", "idKrs", "Lfv/e0;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lyq0/d0;", "updateNationalCourtRegisterSubscriptionRequest", "Lyq0/e0;", "d", "(Lyq0/d0;Ltq/e;)Ljava/lang/Object;", "Lyq0/w;", "a", "(Ltq/e;)Ljava/lang/Object;", "nationalcourtregistryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {
    @f("national-court-registry/mobile/api/national-court-register/entries")
    Object a(e<? super x<NationalCourtRegisterEntriesResponse>> eVar);

    @f("national-court-registry/mobile/api/national-court-register/entries/{idKrs}/document/download")
    Object b(@s("idKrs") String str, e<? super x<e0>> eVar);

    @o("national-court-registry/mobile/api/national-court-register/entries/subscription")
    Object c(@ie4.a CreateNationalCourtRegisterSubscriptionRequest createNationalCourtRegisterSubscriptionRequest, e<? super x<CreateNationalCourtRegisterSubscriptionResponse>> eVar);

    @o("national-court-registry/mobile/api/national-court-register/entries/subscription/update")
    Object d(@ie4.a UpdateNationalCourtRegisterSubscriptionRequest updateNationalCourtRegisterSubscriptionRequest, e<? super x<UpdateNationalCourtRegisterSubscriptionResponse>> eVar);
}
