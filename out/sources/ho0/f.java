package ho0;

import fv.y;
import ge4.x;
import ie4.l;
import ie4.o;
import ie4.p;
import ie4.q;
import ie4.s;
import jo0.DeleteEdeliveryMessagesRequestDto;
import jo0.EdeliveryDraftMessageRequestDto;
import jo0.EdeliveryDraftMessageResponseDto;
import jo0.SaveEdeliveryDraftMessageAttachmentResponseDto;
import jo0.SendEdeliveryDraftMessageResponseDto;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J4\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H§@¢\u0006\u0004\b\b\u0010\tJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH§@¢\u0006\u0004\b\f\u0010\rJ4\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0011\u0010\u0012J*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0013\u0010\u0014J4\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0018\u0010\u0019J*\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001dÀ\u0006\u0003"}, d2 = {"Lho0/f;", "", "", "messageId", "attachmentId", "externalAuthorizationToken", "Lge4/x;", "Loq/i0;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Ljo0/x;", "deleteEdeliveryMessagesRequestDto", "f", "(Ljava/lang/String;Ljo0/x;Ltq/e;)Ljava/lang/Object;", "Ljo0/l0;", "edeliveryDraftMessageRequestDto", "Ljo0/m0;", "e", "(Ljava/lang/String;Ljava/lang/String;Ljo0/l0;Ltq/e;)Ljava/lang/Object;", "d", "(Ljava/lang/String;Ljo0/l0;Ltq/e;)Ljava/lang/Object;", "Lfv/y$c;", "file", "Ljo0/p1;", "b", "(Ljava/lang/String;Ljava/lang/String;Lfv/y$c;Ltq/e;)Ljava/lang/Object;", "Ljo0/s1;", "a", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f {
    @o("electronic-delivery/mobile/api/addresses/drafts/send/{messageId}")
    Object a(@s("messageId") String str, @ie4.i("External-Authorization-Token") String str2, tq.e<? super x<SendEdeliveryDraftMessageResponseDto>> eVar);

    @l
    @o("electronic-delivery/mobile/api/addresses/drafts/{messageId}/attachments")
    Object b(@s("messageId") String str, @ie4.i("External-Authorization-Token") String str2, @q y.c cVar, tq.e<? super x<SaveEdeliveryDraftMessageAttachmentResponseDto>> eVar);

    @ie4.b("electronic-delivery/mobile/api/addresses/drafts/{messageId}/attachments/{attachmentId}")
    Object c(@s("messageId") String str, @s("attachmentId") String str2, @ie4.i("External-Authorization-Token") String str3, tq.e<? super x<i0>> eVar);

    @o("electronic-delivery/mobile/api/addresses/drafts")
    Object d(@ie4.i("External-Authorization-Token") String str, @ie4.a EdeliveryDraftMessageRequestDto edeliveryDraftMessageRequestDto, tq.e<? super x<EdeliveryDraftMessageResponseDto>> eVar);

    @p("electronic-delivery/mobile/api/addresses/drafts/{messageId}")
    Object e(@s("messageId") String str, @ie4.i("External-Authorization-Token") String str2, @ie4.a EdeliveryDraftMessageRequestDto edeliveryDraftMessageRequestDto, tq.e<? super x<EdeliveryDraftMessageResponseDto>> eVar);

    @o("electronic-delivery/mobile/api/addresses/drafts/delete")
    Object f(@ie4.i("External-Authorization-Token") String str, @ie4.a DeleteEdeliveryMessagesRequestDto deleteEdeliveryMessagesRequestDto, tq.e<? super x<i0>> eVar);
}
