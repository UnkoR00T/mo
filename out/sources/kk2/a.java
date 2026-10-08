package kk2;

import cb4.DialogData;
import dx.b;
import dx.i;
import java.util.Date;
import lk2.MIdCardData;
import oq.i0;
import p071kotlin.Metadata;
import rq0.c;
import tq.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0002H¦@¢\u0006\u0004\b\b\u0010\u0006J.\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH¦@¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H¦@¢\u0006\u0004\b\u0012\u0010\u0013J\u001c\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\u0002H¦@¢\u0006\u0004\b\u0014\u0010\u0006J$\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00170\u00022\u0006\u0010\u0016\u001a\u00020\u0015H¦@¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u0003H¦@¢\u0006\u0004\b\u001b\u0010\u001cJ8\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00170\u00022\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u001d2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u001dH¦@¢\u0006\u0004\b \u0010!¨\u0006\"À\u0006\u0003"}, d2 = {"Lkk2/a;", "", "Ldx/i;", "Ldx/b;", "Loq/i0;", "c", "(Ltq/e;)Ljava/lang/Object;", "Llk2/c;", "l", "Ljava/util/Date;", "expirationDate", "", "documentId", "Llk2/b;", "f", "(Ljava/util/Date;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lrq0/b;", "documentType", "b", "(Ljava/lang/String;Lrq0/b;Ltq/e;)Ljava/lang/Object;", "m", "Lrq0/c;", "service", "Lcb4/d;", "d", "(Lrq0/c;Ltq/e;)Ljava/lang/Object;", "error", "a", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "Lkotlin/Function0;", "onDelete", "onClose", "n", "(Ler/a;Ler/a;Ltq/e;)Ljava/lang/Object;", "midcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    Object a(b bVar, e<? super DialogData> eVar);

    Object b(String str, rq0.b bVar, e<? super i<? extends b, i0>> eVar);

    Object c(e<? super i<? extends b, i0>> eVar);

    Object d(c cVar, e<? super i<i0, DialogData>> eVar);

    Object f(Date date, String str, e<? super i<? extends b, ? extends lk2.b>> eVar);

    Object l(e<? super i<? extends b, MIdCardData>> eVar);

    Object m(e<? super i<? extends b, String>> eVar);

    Object n(er.a<i0> aVar, er.a<i0> aVar2, e<? super i<? extends b, DialogData>> eVar);
}
