package au0;

import dx.b;
import dx.i;
import java.util.List;
import p071kotlin.Metadata;
import tq.e;
import tt0.BEAttachments;
import tt0.BEAttachmentsConfiguration;
import tt0.BEReportCategoriesResponse;
import tt0.BEReportedInterventionGroup;
import tt0.BESendReportResponse;
import tt0.l;
import tt0.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J.\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\u00022\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\tH¦@¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u0002H¦@¢\u0006\u0004\b\u000f\u0010\u0006J\"\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u0002H¦@¢\u0006\u0004\b\u0012\u0010\u0006J,\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00170\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H¦@¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lau0/a;", "", "Ldx/i;", "Ldx/b;", "Ltt0/f;", "b", "(Ltq/e;)Ljava/lang/Object;", "Ltt0/s;", "report", "Ltt0/a;", "attachments", "Ltt0/t;", "e", "(Ltt0/s;Ltt0/a;Ltq/e;)Ljava/lang/Object;", "Ltt0/b;", "d", "", "Ltt0/m;", "a", "", "initiativeId", "Ltt0/e;", "type", "Ltt0/l;", "c", "(Ljava/lang/String;Ltt0/e;Ltq/e;)Ljava/lang/Object;", "sanitaryinspectorservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    Object a(e<? super i<? extends b, ? extends List<BEReportedInterventionGroup>>> eVar);

    Object b(e<? super i<? extends b, BEReportCategoriesResponse>> eVar);

    Object c(String str, tt0.e eVar, e<? super i<? extends b, ? extends l>> eVar2);

    Object d(e<? super i<? extends b, BEAttachmentsConfiguration>> eVar);

    Object e(s sVar, BEAttachments bEAttachments, e<? super i<? extends b, BESendReportResponse>> eVar);
}
