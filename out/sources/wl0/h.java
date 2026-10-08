package wl0;

import ge4.x;
import gm0.ApplicationPassportStatusResponseDto;
import gm0.GroupedPassportV2Response;
import gm0.InvalidatePassportRequestV2Dto;
import gm0.InvalidatedPassportResponseDto;
import gm0.PassportVisualizationV2Dto;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\u0002H§@¢\u0006\u0004\b\r\u0010\u0005J \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00022\b\b\u0001\u0010\u000f\u001a\u00020\u000eH§@¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lwl0/h;", "", "Lge4/x;", "Lgm0/n2;", "d", "(Ltq/e;)Ljava/lang/Object;", "", "applicationNumber", "Lgm0/e;", "c", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "", "Lgm0/p5;", "a", "Lgm0/r2;", "invalidatePassportRequestV2Dto", "Lgm0/s2;", "b", "(Lgm0/r2;Ltq/e;)Ljava/lang/Object;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface h {
    @ie4.f("document-management/mobile/api/passports/v2/visualization-data")
    Object a(tq.e<? super x<List<PassportVisualizationV2Dto>>> eVar);

    @ie4.o("document-management/mobile/api/passports/v2/invalidate")
    Object b(@ie4.a InvalidatePassportRequestV2Dto invalidatePassportRequestV2Dto, tq.e<? super x<InvalidatedPassportResponseDto>> eVar);

    @ie4.f("document-management/mobile/api/passports/v2/application/{applicationNumber}/status")
    Object c(@ie4.s("applicationNumber") String str, tq.e<? super x<ApplicationPassportStatusResponseDto>> eVar);

    @ie4.f("document-management/mobile/api/passports/v2/grouped")
    Object d(tq.e<? super x<GroupedPassportV2Response>> eVar);
}
