package wl0;

import ge4.x;
import gm0.PhysicalIdCardApplicationInitResponse;
import gm0.PhysicalIdCardApplicationReasonsResponse;
import gm0.PhysicalIdCardApplicationStatusResponse;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b\t\u0010\nJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH§@¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lwl0/k;", "", "Lge4/x;", "Lgm0/u5;", "a", "(Ltq/e;)Ljava/lang/Object;", "Lgm0/c;", "type", "Lgm0/v5;", "c", "(Lgm0/c;Ltq/e;)Ljava/lang/Object;", "", "applicationNumber", "Lgm0/x5;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface k {
    @ie4.f("document-management/mobile/api/application/physical-id-card/init-data")
    Object a(tq.e<? super x<PhysicalIdCardApplicationInitResponse>> eVar);

    @ie4.f("document-management/mobile/api/application/physical-id-card/status")
    Object b(@ie4.t("applicationNumber") String str, tq.e<? super x<PhysicalIdCardApplicationStatusResponse>> eVar);

    @ie4.f("document-management/mobile/api/application/physical-id-card/application-reasons/{type}")
    Object c(@ie4.s("type") gm0.c cVar, tq.e<? super x<PhysicalIdCardApplicationReasonsResponse>> eVar);
}
