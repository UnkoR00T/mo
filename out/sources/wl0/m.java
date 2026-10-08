package wl0;

import ge4.x;
import gm0.GeneratePhysicalIdCardXmlIdentityTheftV4Request;
import gm0.PhysicalIdCardIdentityTheftXmlV4Response;
import gm0.SubmitPhysicalIdCardIdentityTheftV4Request;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000fÀ\u0006\u0003"}, d2 = {"Lwl0/m;", "", "", "externalAuthorizationToken", "Lgm0/j2;", "generatePhysicalIdCardXmlIdentityTheftV4Request", "Lge4/x;", "Lgm0/z5;", "a", "(Ljava/lang/String;Lgm0/j2;Ltq/e;)Ljava/lang/Object;", "Lgm0/d7;", "submitPhysicalIdCardIdentityTheftV4Request", "Loq/i0;", "b", "(Ljava/lang/String;Lgm0/d7;Ltq/e;)Ljava/lang/Object;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface m {
    @ie4.o("document-management/mobile/api/v4/physical-id-card/invalidation/identity-theft/generate-xml")
    Object a(@ie4.i("External-Authorization-Token") String str, @ie4.a GeneratePhysicalIdCardXmlIdentityTheftV4Request generatePhysicalIdCardXmlIdentityTheftV4Request, tq.e<? super x<PhysicalIdCardIdentityTheftXmlV4Response>> eVar);

    @ie4.o("document-management/mobile/api/v4/physical-id-card/invalidation/identity-theft/submit")
    Object b(@ie4.i("External-Authorization-Token") String str, @ie4.a SubmitPhysicalIdCardIdentityTheftV4Request submitPhysicalIdCardIdentityTheftV4Request, tq.e<? super x<i0>> eVar);
}
