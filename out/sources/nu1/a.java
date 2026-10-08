package nu1;

import cb4.DialogData;
import dx.b;
import dx.i;
import java.util.Date;
import oq.i0;
import ou1.DrivingLicenceFullData;
import p071kotlin.Metadata;
import rq0.c;
import tq.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0002H¦@¢\u0006\u0004\b\b\u0010\u0006J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u00022\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000f0\u0002H¦@¢\u0006\u0004\b\u0010\u0010\u0006J0\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00140\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u000fH¦@¢\u0006\u0004\b\u0015\u0010\u0016J\u001c\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\u0002H¦@¢\u0006\u0004\b\u0017\u0010\u0006J\u001c\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00180\u0002H¦@¢\u0006\u0004\b\u0019\u0010\u0006J\u001a\u0010\u001b\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001a\u001a\u00020\u0003H¦@¢\u0006\u0004\b\u001b\u0010\u001cJ*\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u00022\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001dH¦@¢\u0006\u0004\b\u001f\u0010 ¨\u0006!À\u0006\u0003"}, d2 = {"Lnu1/a;", "", "Ldx/i;", "Ldx/b;", "Lrq0/b;", "e", "(Ltq/e;)Ljava/lang/Object;", "Lou1/g;", "b", "Lrq0/c;", "service", "Loq/i0;", "Lcb4/d;", "d", "(Lrq0/c;Ltq/e;)Ljava/lang/Object;", "", "g", "Ljava/util/Date;", "expirationDate", "documentId", "Lou1/b;", "f", "(Ljava/util/Date;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "h", "", "i", "error", "a", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "Lkotlin/Function0;", "onDelete", "c", "(Ler/a;Ltq/e;)Ljava/lang/Object;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    Object a(b bVar, e<? super DialogData> eVar);

    Object b(e<? super i<? extends b, DrivingLicenceFullData>> eVar);

    Object c(er.a<i0> aVar, e<? super i<? extends b, DialogData>> eVar);

    Object d(c cVar, e<? super i<i0, DialogData>> eVar);

    Object e(e<? super i<? extends b, ? extends rq0.b>> eVar);

    Object f(Date date, String str, e<? super i<? extends b, ? extends ou1.b>> eVar);

    Object g(e<? super i<? extends b, String>> eVar);

    Object h(e<? super i<? extends b, i0>> eVar);

    Object i(e<? super i<? extends b, Boolean>> eVar);
}
