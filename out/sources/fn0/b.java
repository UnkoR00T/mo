package fn0;

import ge4.x;
import hn0.GetVerificationDataRequestDto;
import hn0.GetVerificationDataResponseDto;
import hn0.GetVerificationSessionStatusResponseDto;
import hn0.SendVerificationDataRequestDto;
import ie4.f;
import ie4.o;
import ie4.s;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\tJ \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012À\u0006\u0003"}, d2 = {"Lfn0/b;", "", "", "sessionUuid", "Lhn0/c;", "getVerificationDataRequestDto", "Lge4/x;", "Lhn0/d;", "b", "(Ljava/lang/String;Lhn0/c;Ltq/e;)Ljava/lang/Object;", "Lhn0/f;", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lhn0/h;", "sendVerificationDataRequestDto", "Loq/i0;", "c", "(Ljava/lang/String;Lhn0/h;Ltq/e;)Ljava/lang/Object;", "documentverificationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    @f("document-verification/mobile/api/verifications/{sessionUuid}/status")
    Object a(@s("sessionUuid") String str, e<? super x<GetVerificationSessionStatusResponseDto>> eVar);

    @o("document-verification/mobile/api/verifications/{sessionUuid}/data/encrypt-and-get")
    Object b(@s("sessionUuid") String str, @ie4.a GetVerificationDataRequestDto getVerificationDataRequestDto, e<? super x<GetVerificationDataResponseDto>> eVar);

    @o("document-verification/mobile/api/verifications/{sessionUuid}/data")
    Object c(@s("sessionUuid") String str, @ie4.a SendVerificationDataRequestDto sendVerificationDataRequestDto, e<? super x<i0>> eVar);
}
