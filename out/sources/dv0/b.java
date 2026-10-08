package dv0;

import cv0.BEPersonalData;
import cv0.BETravel;
import cv0.BETravelRequestModel;
import cv0.p;
import dx.i;
import java.util.List;
import java.util.Map;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J.\u0010\u000b\u001a \u0012\u0004\u0012\u00020\u0003\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00070\u0002H¦@¢\u0006\u0004\b\u000b\u0010\u0006J$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u00022\u0006\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b\u000f\u0010\u0010J,\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000e0\u00022\u0006\u0010\u0012\u001a\u00020\u0011H¦@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Ldv0/b;", "", "Ldx/i;", "Ldx/b;", "Lcv0/f;", "c", "(Ltq/e;)Ljava/lang/Object;", "", "Lcv0/p;", "", "Lcv0/n;", "d", "Lcv0/o;", "model", "Loq/i0;", "f", "(Lcv0/o;Ltq/e;)Ljava/lang/Object;", "Lcv0/q;", "travelUuid", "g", "(Ljava/lang/String;Lcv0/o;Ltq/e;)Ljava/lang/Object;", "e", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "travelabroadservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    Object c(e<? super i<? extends dx.b, BEPersonalData>> eVar);

    Object d(e<? super i<? extends dx.b, ? extends Map<p, ? extends List<BETravel>>>> eVar);

    Object e(String str, e<? super i<? extends dx.b, i0>> eVar);

    Object f(BETravelRequestModel bETravelRequestModel, e<? super i<? extends dx.b, i0>> eVar);

    Object g(String str, BETravelRequestModel bETravelRequestModel, e<? super i<? extends dx.b, i0>> eVar);
}
