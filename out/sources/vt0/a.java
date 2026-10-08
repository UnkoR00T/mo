package vt0;

import ge4.x;
import ie4.f;
import ie4.o;
import ie4.s;
import p071kotlin.Metadata;
import tq.e;
import xt0.AttachmentsInterventionConfigurationResponse;
import xt0.GetReportedInterventionsResponse;
import xt0.GetReportedObjectInterventionResponse;
import xt0.GetReportedProductInterventionResponse;
import xt0.InterventionTypeCategoryResponse;
import xt0.ReportObjectInterventionRequest;
import xt0.ReportProductInterventionRequest;
import xt0.ReportedInterventionResponse;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0005J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000e\u0010\fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0002H§@¢\u0006\u0004\b\u0010\u0010\u0005J \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00022\b\b\u0001\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00022\b\b\u0001\u0010\u0017\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lvt0/a;", "", "Lge4/x;", "Lxt0/x;", "d", "(Ltq/e;)Ljava/lang/Object;", "Lxt0/e;", "a", "", "initiativeId", "Lxt0/f;", "c", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lxt0/k;", "e", "Lxt0/a;", "f", "Lxt0/d0;", "reportObjectInterventionRequest", "Lxt0/n0;", "b", "(Lxt0/d0;Ltq/e;)Ljava/lang/Object;", "Lxt0/g0;", "reportProductInterventionRequest", "g", "(Lxt0/g0;Ltq/e;)Ljava/lang/Object;", "sanitaryinspectorservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    @f("sanitary-inspector/mobile/api/sanitary-interventions")
    Object a(e<? super x<GetReportedInterventionsResponse>> eVar);

    @o("sanitary-inspector/mobile/api/sanitary-interventions/report/object")
    Object b(@ie4.a ReportObjectInterventionRequest reportObjectInterventionRequest, e<? super x<ReportedInterventionResponse>> eVar);

    @f("sanitary-inspector/mobile/api/sanitary-interventions/{initiativeId}/object")
    Object c(@s("initiativeId") String str, e<? super x<GetReportedObjectInterventionResponse>> eVar);

    @f("sanitary-inspector/mobile/api/sanitary-interventions/dictionaries/types-with-categories")
    Object d(e<? super x<InterventionTypeCategoryResponse>> eVar);

    @f("sanitary-inspector/mobile/api/sanitary-interventions/{initiativeId}/product")
    Object e(@s("initiativeId") String str, e<? super x<GetReportedProductInterventionResponse>> eVar);

    @o("sanitary-inspector/mobile/api/sanitary-interventions/init-attachments")
    Object f(e<? super x<AttachmentsInterventionConfigurationResponse>> eVar);

    @o("sanitary-inspector/mobile/api/sanitary-interventions/report/product")
    Object g(@ie4.a ReportProductInterventionRequest reportProductInterventionRequest, e<? super x<ReportedInterventionResponse>> eVar);
}
