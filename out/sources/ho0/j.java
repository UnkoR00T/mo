package ho0;

import fv.y;
import ge4.x;
import ie4.l;
import ie4.o;
import ie4.q;
import ie4.s;
import jo0.ApplicationTypeDictionaryDto;
import jo0.EpuapSendMessageRequestDto;
import jo0.EpuapUploadAttachmentResponseDto;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\n\u0010\bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0005H§@¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0014\u001a\u00020\u0013H§@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lho0/j;", "", "", "messageId", "externalAuthorizationToken", "Lge4/x;", "Loq/i0;", "a", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "attachmentId", "e", "Ljo0/l;", "d", "(Ltq/e;)Ljava/lang/Object;", "Lfv/y$c;", "file", "Ljo0/r0;", "c", "(Ljava/lang/String;Lfv/y$c;Ltq/e;)Ljava/lang/Object;", "Ljo0/q0;", "epuapSendMessageRequestDto", "b", "(Ljava/lang/String;Ljo0/q0;Ltq/e;)Ljava/lang/Object;", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface j {
    @ie4.b("electronic-delivery/mobile/api/epuap/messages/{messageId}")
    Object a(@s("messageId") String str, @ie4.i("External-Authorization-Token") String str2, tq.e<? super x<i0>> eVar);

    @o("electronic-delivery/mobile/api/epuap/messages")
    Object b(@ie4.i("External-Authorization-Token") String str, @ie4.a EpuapSendMessageRequestDto epuapSendMessageRequestDto, tq.e<? super x<i0>> eVar);

    @l
    @o("electronic-delivery/mobile/api/epuap/messages/attachments")
    Object c(@ie4.i("External-Authorization-Token") String str, @q y.c cVar, tq.e<? super x<EpuapUploadAttachmentResponseDto>> eVar);

    @ie4.f("electronic-delivery/mobile/api/epuap/messages/application-types")
    Object d(tq.e<? super x<ApplicationTypeDictionaryDto>> eVar);

    @ie4.b("electronic-delivery/mobile/api/epuap/messages/attachments/{attachmentId}")
    Object e(@s("attachmentId") String str, @ie4.i("External-Authorization-Token") String str2, tq.e<? super x<i0>> eVar);
}
