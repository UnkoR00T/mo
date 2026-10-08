package lu0;

import cu0.BadDomainReport;
import cu0.FraudReport;
import cu0.IllegalContentReport;
import cu0.IncidentId;
import cu0.OtherReport;
import cu0.ReportedIncidentReference;
import dx.i;
import java.io.InputStream;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J,\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH¦@¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\u00022\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H¦@¢\u0006\u0004\b\u0013\u0010\u0014J,\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00170\u00022\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H¦@¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH¦@¢\u0006\u0004\b\u001d\u0010\u001eJ$\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00170\u00022\u0006\u0010 \u001a\u00020\u001fH¦@¢\u0006\u0004\b!\u0010\"¨\u0006#À\u0006\u0003"}, d2 = {"Llu0/b;", "", "Ldx/i;", "Ldx/b;", "Lcu0/e;", "g", "(Ltq/e;)Ljava/lang/Object;", "incidentId", "Lcu0/b;", "fraudReport", "Lcu0/g;", "d", "(Lcu0/e;Lcu0/b;Ltq/e;)Ljava/lang/Object;", "Lcu0/a;", "badDomainReport", "c", "(Lcu0/e;Lcu0/a;Ltq/e;)Ljava/lang/Object;", "Lcu0/f;", "otherReport", "a", "(Lcu0/e;Lcu0/f;Ltq/e;)Ljava/lang/Object;", "Lwx/i;", "file", "Loq/i0;", "b", "(Lcu0/e;Lwx/i;Ltq/e;)Ljava/lang/Object;", "", "url", "Ljava/io/InputStream;", "e", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lcu0/c;", "illegalContentReport", "f", "(Lcu0/c;Ltq/e;)Ljava/lang/Object;", "securityincidentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    Object a(IncidentId incidentId, OtherReport otherReport, e<? super i<? extends dx.b, ReportedIncidentReference>> eVar);

    Object b(IncidentId incidentId, wx.i iVar, e<? super i<? extends dx.b, i0>> eVar);

    Object c(IncidentId incidentId, BadDomainReport badDomainReport, e<? super i<? extends dx.b, ReportedIncidentReference>> eVar);

    Object d(IncidentId incidentId, FraudReport fraudReport, e<? super i<? extends dx.b, ReportedIncidentReference>> eVar);

    Object e(String str, e<? super InputStream> eVar);

    Object f(IllegalContentReport illegalContentReport, e<? super i<? extends dx.b, i0>> eVar);

    Object g(e<? super i<? extends dx.b, IncidentId>> eVar);
}
