package ho0;

import fv.e0;
import ge4.x;
import ie4.o;
import ie4.s;
import jo0.SendSignedUpdRequestDto;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0007\u0010\bJ4\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lho0/i;", "", "", "messageId", "externalAuthorizationToken", "Lge4/x;", "Lfv/e0;", "b", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Ljo0/u1;", "sendSignedUpdRequestDto", "Loq/i0;", "a", "(Ljava/lang/String;Ljava/lang/String;Ljo0/u1;Ltq/e;)Ljava/lang/Object;", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i {
    @o("electronic-delivery/mobile/api/addresses/messages/{messageId}/epuap/sign-upd")
    Object a(@s("messageId") String str, @ie4.i("External-Authorization-Token") String str2, @ie4.a SendSignedUpdRequestDto sendSignedUpdRequestDto, tq.e<? super x<i0>> eVar);

    @ie4.f("electronic-delivery/mobile/api/addresses/messages/{messageId}/epuap/upd")
    Object b(@s("messageId") String str, @ie4.i("External-Authorization-Token") String str2, tq.e<? super x<e0>> eVar);
}
