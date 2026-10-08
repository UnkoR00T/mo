package wq0;

import fv.e0;
import ge4.x;
import ie4.f;
import ie4.o;
import ie4.s;
import p071kotlin.Metadata;
import tq.e;
import yq0.LandRegisterOrderedDocumentsResponse;
import yq0.LandRegisterReadyOrderedDocumentResponse;
import yq0.LandRegisterVerifyDocumentResponse;
import yq0.OrderLandRegisterDocumentRequestDto;
import yq0.OrderLandRegisterDocumentResponse;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\b\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\u0007J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\n\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\u0007J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0004H§@¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00042\b\b\u0001\u0010\u0010\u001a\u00020\u000fH§@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\b\b\u0001\u0010\u0014\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0016\u0010\u0007J \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00042\b\b\u0001\u0010\u0017\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0019\u0010\u0007¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lwq0/b;", "", "", "documentId", "Lge4/x;", "Lfv/e0;", "d", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "verificationId", "f", "id", "g", "Lyq0/q;", "b", "(Ltq/e;)Ljava/lang/Object;", "Lyq0/z;", "orderLandRegisterDocumentRequestDto", "Lyq0/a0;", "c", "(Lyq0/z;Ltq/e;)Ljava/lang/Object;", "orderId", "Lyq0/r;", "e", "verificationCode", "Lyq0/t;", "a", "nationalcourtregistryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    @o("national-court-registry/mobile/api/land-register/orders/documents/verification/{verificationCode}")
    Object a(@s("verificationCode") String str, e<? super x<LandRegisterVerifyDocumentResponse>> eVar);

    @f("national-court-registry/mobile/api/land-register/orders")
    Object b(e<? super x<LandRegisterOrderedDocumentsResponse>> eVar);

    @o("national-court-registry/mobile/api/land-register/orders/create")
    Object c(@ie4.a OrderLandRegisterDocumentRequestDto orderLandRegisterDocumentRequestDto, e<? super x<OrderLandRegisterDocumentResponse>> eVar);

    @f("national-court-registry/mobile/api/land-register/orders/documents/{documentId}/download")
    Object d(@s("documentId") String str, e<? super x<e0>> eVar);

    @f("national-court-registry/mobile/api/land-register/orders/{orderId}/created/status")
    Object e(@s("orderId") String str, e<? super x<LandRegisterReadyOrderedDocumentResponse>> eVar);

    @f("national-court-registry/mobile/api/land-register/orders/documents/verification/{verificationId}/download")
    Object f(@s("verificationId") String str, e<? super x<e0>> eVar);

    @f("national-court-registry/mobile/api/land-register/orders/documents/{id}/copy/download")
    Object g(@s("id") String str, e<? super x<e0>> eVar);
}
