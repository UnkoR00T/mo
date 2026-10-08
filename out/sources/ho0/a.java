package ho0;

import fv.e0;
import ge4.x;
import ie4.n;
import ie4.s;
import ie4.t;
import jo0.DeliveryMessageDetailsDtoDto;
import jo0.DirectoriesResponseDto;
import jo0.MessagesResponseDto;
import jo0.OwnerAddressResponseDto;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ>\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\f\u0010\rJ \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0011\u0010\bJ*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0012\u0010\bJ*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\u0013\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0014\u0010\bJ4\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0016\u0010\u0017J6\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00052\b\b\u0001\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\n\b\u0003\u0010\u0018\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u001a\u0010\u0017J \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00052\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001c\u0010\u0010J*\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001d\u0010\bJ*\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u001e\u0010\b¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lho0/a;", "", "", "messageId", "externalAuthorizationToken", "Lge4/x;", "Loq/i0;", "b", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "directoryId", "attachmentId", "Lfv/e0;", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Ljo0/f0;", "e", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "j", "a", "evidenceId", "f", "Ljo0/b0;", "k", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "pageId", "Ljo0/b1;", "h", "Ljo0/j1;", "g", "i", "c", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    @ie4.f("electronic-delivery/mobile/api/addresses/messages/{messageId}/epuap/document-with-upo")
    Object a(@s("messageId") String str, @ie4.i("External-Authorization-Token") String str2, tq.e<? super x<e0>> eVar);

    @ie4.b("electronic-delivery/mobile/api/addresses/messages/{messageId}")
    Object b(@s("messageId") String str, @ie4.i("External-Authorization-Token") String str2, tq.e<? super x<i0>> eVar);

    @n("electronic-delivery/mobile/api/addresses/messages/{messageId}/trash")
    Object c(@s("messageId") String str, @ie4.i("External-Authorization-Token") String str2, tq.e<? super x<i0>> eVar);

    @ie4.f("electronic-delivery/mobile/api/addresses/directories/{directoryId}/messages/{messageId}/attachments/{attachmentId}")
    Object d(@s("directoryId") String str, @s("messageId") String str2, @s("attachmentId") String str3, @ie4.i("External-Authorization-Token") String str4, tq.e<? super x<e0>> eVar);

    @ie4.f("electronic-delivery/mobile/api/addresses/directories")
    Object e(@ie4.i("External-Authorization-Token") String str, tq.e<? super x<DirectoriesResponseDto>> eVar);

    @ie4.f("electronic-delivery/mobile/api/addresses/evidences/{evidenceId}")
    Object f(@s("evidenceId") String str, @ie4.i("External-Authorization-Token") String str2, tq.e<? super x<e0>> eVar);

    @ie4.f("electronic-delivery/mobile/api/addresses/owner-address")
    Object g(@ie4.i("External-Authorization-Token") String str, tq.e<? super x<OwnerAddressResponseDto>> eVar);

    @ie4.f("electronic-delivery/mobile/api/addresses/directories/{directoryId}/messages")
    Object h(@s("directoryId") String str, @ie4.i("External-Authorization-Token") String str2, @t("pageId") String str3, tq.e<? super x<MessagesResponseDto>> eVar);

    @ie4.f("electronic-delivery/mobile/api/addresses/evidences/{messageId}/technical-evidences-file")
    Object i(@s("messageId") String str, @ie4.i("External-Authorization-Token") String str2, tq.e<? super x<e0>> eVar);

    @ie4.f("electronic-delivery/mobile/api/addresses/messages/{messageId}/epuap/document-visualization")
    Object j(@s("messageId") String str, @ie4.i("External-Authorization-Token") String str2, tq.e<? super x<e0>> eVar);

    @ie4.f("electronic-delivery/mobile/api/addresses/directories/{directoryId}/messages/{messageId}")
    Object k(@s("messageId") String str, @s("directoryId") String str2, @ie4.i("External-Authorization-Token") String str3, tq.e<? super x<DeliveryMessageDetailsDtoDto>> eVar);
}
