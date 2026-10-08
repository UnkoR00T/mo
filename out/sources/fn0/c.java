package fn0;

import ge4.x;
import hn0.GetVerificationSessionByCodeResponseDto;
import hn0.StartVerificationSessionRequestDto;
import hn0.StartVerificationSessionResponseDto;
import ie4.f;
import ie4.o;
import ie4.s;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lfn0/c;", "", "", "code", "Lge4/x;", "Lhn0/e;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lhn0/i;", "startVerificationSessionRequestDto", "Lhn0/j;", "c", "(Lhn0/i;Ltq/e;)Ljava/lang/Object;", "documentverificationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {
    @f("document-verification/mobile/api/verifications/by-code/{code}")
    Object b(@s("code") String str, e<? super x<GetVerificationSessionByCodeResponseDto>> eVar);

    @o("document-verification/mobile/api/verifications")
    Object c(@ie4.a StartVerificationSessionRequestDto startVerificationSessionRequestDto, e<? super x<StartVerificationSessionResponseDto>> eVar);
}
