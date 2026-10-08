package wl0;

import ge4.x;
import gm0.ApplicantDataResponse;
import gm0.ChildrenResponse;
import gm0.y6;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002H§@¢\u0006\u0004\b\t\u0010\u0007¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lwl0/c;", "", "Lgm0/y6;", "processName", "Lge4/x;", "Lgm0/b;", "a", "(Lgm0/y6;Ltq/e;)Ljava/lang/Object;", "Lgm0/o1;", "b", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {
    static /* synthetic */ Object c(c cVar, y6 y6Var, tq.e eVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getChildren");
        }
        if ((i15 & 1) != 0) {
            y6Var = null;
        }
        return cVar.b(y6Var, eVar);
    }

    static /* synthetic */ Object d(c cVar, y6 y6Var, tq.e eVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getApplicantData");
        }
        if ((i15 & 1) != 0) {
            y6Var = null;
        }
        return cVar.a(y6Var, eVar);
    }

    @ie4.f("document-management/mobile/api/children/applicant")
    Object a(@ie4.i("Process-Name") y6 y6Var, tq.e<? super x<ApplicantDataResponse>> eVar);

    @ie4.f("document-management/mobile/api/children")
    Object b(@ie4.i("Process-Name") y6 y6Var, tq.e<? super x<ChildrenResponse>> eVar);
}
