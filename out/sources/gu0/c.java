package gu0;

import fv.y;
import ge4.x;
import ie4.l;
import ie4.o;
import ie4.q;
import ie4.s;
import iu0.BadDomainReportDto;
import iu0.FraudReportDto;
import iu0.IncidentIdDto;
import iu0.OtherReportDto;
import iu0.ReportedIncidentReferenceDto;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J*\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\rH§@¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0012\u001a\u00020\u0011H§@¢\u0006\u0004\b\u0013\u0010\u0014J*\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\u0016\u001a\u00020\u0015H§@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lgu0/c;", "", "Lge4/x;", "Liu0/j;", "c", "(Ltq/e;)Ljava/lang/Object;", "", "incidentId", "Liu0/f;", "badDomainReportDto", "Liu0/l;", "d", "(Ljava/lang/String;Liu0/f;Ltq/e;)Ljava/lang/Object;", "Liu0/g;", "fraudReportDto", "a", "(Ljava/lang/String;Liu0/g;Ltq/e;)Ljava/lang/Object;", "Liu0/k;", "otherReportDto", "e", "(Ljava/lang/String;Liu0/k;Ltq/e;)Ljava/lang/Object;", "Lfv/y$c;", "file", "Loq/i0;", "b", "(Ljava/lang/String;Lfv/y$c;Ltq/e;)Ljava/lang/Object;", "securityincidentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {
    @o("security-incident/mobile/api/report-incident/{incidentId}/fraud")
    Object a(@s("incidentId") String str, @ie4.a FraudReportDto fraudReportDto, e<? super x<ReportedIncidentReferenceDto>> eVar);

    @l
    @o("security-incident/mobile/api/report-incident/{incidentId}/upload")
    Object b(@s("incidentId") String str, @q y.c cVar, e<? super x<i0>> eVar);

    @o("security-incident/mobile/api/report-incident")
    Object c(e<? super x<IncidentIdDto>> eVar);

    @o("security-incident/mobile/api/report-incident/{incidentId}/bad-domain")
    Object d(@s("incidentId") String str, @ie4.a BadDomainReportDto badDomainReportDto, e<? super x<ReportedIncidentReferenceDto>> eVar);

    @o("security-incident/mobile/api/report-incident/{incidentId}/other")
    Object e(@s("incidentId") String str, @ie4.a OtherReportDto otherReportDto, e<? super x<ReportedIncidentReferenceDto>> eVar);
}
