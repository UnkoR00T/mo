package gt3;

import ge4.x;
import ht3.GetVerificationSessionStatusResponseDto;
import ht3.SendVerificationDataRequestDto;
import ie4.f;
import ie4.o;
import ie4.s;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lgt3/b;", "", "", "sessionUuid", "Lge4/x;", "Lht3/d;", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lht3/e;", "sendVerificationDataRequestDto", "Loq/i0;", "b", "(Ljava/lang/String;Lht3/e;Ltq/e;)Ljava/lang/Object;", "documentverificationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    @f("document-verification/mobile/api/verifications/{sessionUuid}/status")
    Object a(@s("sessionUuid") String str, e<? super x<GetVerificationSessionStatusResponseDto>> eVar);

    @o("document-verification/mobile/api/verifications/{sessionUuid}/data")
    Object b(@s("sessionUuid") String str, @ie4.a SendVerificationDataRequestDto sendVerificationDataRequestDto, e<? super x<i0>> eVar);
}
