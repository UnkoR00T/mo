package dy0;

import fy0.MeasurementPointEntity;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005H§@¢\u0006\u0004\b\u0006\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0002H\u0097@¢\u0006\u0004\b\u0007\u0010\u0004¨\u0006\bÀ\u0006\u0003"}, d2 = {"Ldy0/a;", "", "Loq/i0;", "c", "(Ltq/e;)Ljava/lang/Object;", "Lfy0/b;", "b", "a", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    static /* synthetic */ Object d(a aVar, tq.e<? super i0> eVar) {
        Object objC = aVar.c(eVar);
        return objC == uq.b.e() ? objC : i0.f148189a;
    }

    default Object a(tq.e<? super i0> eVar) {
        return d(this, eVar);
    }

    Object b(tq.e<? super MeasurementPointEntity> eVar);

    Object c(tq.e<? super i0> eVar);
}
