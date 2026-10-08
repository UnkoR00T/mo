package xl0;

import al0.IdCardSuspensionChildData;
import gm0.PhysicalIdCardSuspensionChildInitResponse;
import iy.b0;
import iy.c0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lgm0/p6;", "Lal0/d0;", "a", "(Lgm0/p6;)Lal0/d0;", "documentmanagementservice_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {
    public static final IdCardSuspensionChildData a(PhysicalIdCardSuspensionChildInitResponse physicalIdCardSuspensionChildInitResponse) {
        b0 b0VarG = c0.g(physicalIdCardSuspensionChildInitResponse.getFirstName());
        b0 b0VarC = xw.g.c(c0.g(physicalIdCardSuspensionChildInitResponse.getPesel()));
        b0 b0VarG2 = c0.g(physicalIdCardSuspensionChildInitResponse.getSurname());
        String secondName = physicalIdCardSuspensionChildInitResponse.getSecondName();
        b0 b0VarG3 = secondName != null ? c0.g(secondName) : null;
        String seriesAndNumber = physicalIdCardSuspensionChildInitResponse.getSeriesAndNumber();
        return new IdCardSuspensionChildData(b0VarG, b0VarC, b0VarG2, b0VarG3, seriesAndNumber != null ? c0.g(seriesAndNumber) : null, null);
    }
}
