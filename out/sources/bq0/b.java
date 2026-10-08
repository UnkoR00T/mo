package bq0;

import dq0.ReportIncidentRequestDto;
import dq0.ReportIncidentTypesResponse;
import dq0.ReportedIncidentsResponse;
import ge4.x;
import ie4.f;
import ie4.o;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H§@¢\u0006\u0004\b\u0007\u0010\u0005J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00022\b\b\u0001\u0010\t\u001a\u00020\bH§@¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lbq0/b;", "", "Lge4/x;", "Ldq0/h0;", "a", "(Ltq/e;)Ljava/lang/Object;", "Ldq0/c0;", "b", "Ldq0/a0;", "reportIncidentRequestDto", "Loq/i0;", "c", "(Ldq0/a0;Ltq/e;)Ljava/lang/Object;", "militaryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    @f("military/mobile/api/military/incidents/reported")
    Object a(e<? super x<ReportedIncidentsResponse>> eVar);

    @o("military/mobile/api/military/incidents/init-report")
    Object b(e<? super x<ReportIncidentTypesResponse>> eVar);

    @o("military/mobile/api/military/incidents/report")
    Object c(@ie4.a ReportIncidentRequestDto reportIncidentRequestDto, e<? super x<i0>> eVar);
}
