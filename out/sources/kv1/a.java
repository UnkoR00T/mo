package kv1;

import cb4.DialogData;
import dx.b;
import dx.i;
import java.util.Date;
import java.util.List;
import mu.g;
import mv1.DynamicDocumentData;
import mv1.DynamicMultiDocumentFullData;
import oq.i0;
import p071kotlin.Metadata;
import rq0.c;
import tq.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J8\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH¦@¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00022\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\u0014\u0010\u0013J$\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00150\u00022\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\u0016\u0010\u0013J$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00150\u00022\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\u0017\u0010\u0013J$\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a0\u00022\u0006\u0010\u0019\u001a\u00020\u0018H¦@¢\u0006\u0004\b\u001b\u0010\u001cJ,\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a0\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000bH¦@¢\u0006\u0004\b\u001d\u0010\u001eJ*\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u001f0\u00022\u0006\u0010\u0019\u001a\u00020\u0018H¦@¢\u0006\u0004\b \u0010\u001cJ$\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020#0\u00022\u0006\u0010\"\u001a\u00020!H¦@¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00180&H&¢\u0006\u0004\b'\u0010(J(\u0010,\u001a\u0004\u0018\u00010+2\u0006\u0010\n\u001a\u00020\t2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00040)H¦@¢\u0006\u0004\b,\u0010-J$\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020+0\u00022\u0006\u0010/\u001a\u00020.H¦@¢\u0006\u0004\b0\u00101J\u001a\u00103\u001a\u0004\u0018\u00010+2\u0006\u00102\u001a\u00020\u0003H¦@¢\u0006\u0004\b3\u00104J2\u00106\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020+0\u00022\u0006\u0010\n\u001a\u00020\t2\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00040)H¦@¢\u0006\u0004\b6\u0010-¨\u00067À\u0006\u0003"}, d2 = {"Lkv1/a;", "", "Ldx/i;", "Ldx/b;", "Loq/i0;", "c", "(Ltq/e;)Ljava/lang/Object;", "Ljava/util/Date;", "expirationDate", "Lrq0/b;", "documentType", "", "documentId", "Lmv1/b;", "k", "(Ljava/util/Date;Lrq0/b;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "b", "(Ljava/lang/String;Lrq0/b;Ltq/e;)Ljava/lang/Object;", "n", "(Lrq0/b;Ltq/e;)Ljava/lang/Object;", "o", "", "g", "e", "Lrq0/b$b;", "dynamicDocumentType", "Lmv1/c;", "i", "(Lrq0/b$b;Ltq/e;)Ljava/lang/Object;", "h", "(Lrq0/b$b;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "", "p", "Lrq0/b$c;", "dynamicMultiDocumentType", "Lmv1/d;", "l", "(Lrq0/b$c;Ltq/e;)Ljava/lang/Object;", "Lmu/g;", "j", "()Lmu/g;", "Lkotlin/Function0;", "onCloseDialog", "Lcb4/d;", "m", "(Lrq0/b;Ler/a;Ltq/e;)Ljava/lang/Object;", "Lrq0/c;", "service", "d", "(Lrq0/c;Ltq/e;)Ljava/lang/Object;", "error", "a", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "onDelete", "f", "dynamicdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    Object a(b bVar, e<? super DialogData> eVar);

    Object b(String str, rq0.b bVar, e<? super i<? extends b, i0>> eVar);

    Object c(e<? super i<? extends b, i0>> eVar);

    Object d(c cVar, e<? super i<i0, DialogData>> eVar);

    Object e(rq0.b bVar, e<? super i<? extends b, Boolean>> eVar);

    Object f(rq0.b bVar, er.a<i0> aVar, e<? super i<? extends b, DialogData>> eVar);

    Object g(rq0.b bVar, e<? super i<? extends b, Boolean>> eVar);

    Object h(rq0.b.EnumC4479b enumC4479b, String str, e<? super i<? extends b, DynamicDocumentData>> eVar);

    Object i(rq0.b.EnumC4479b enumC4479b, e<? super i<? extends b, DynamicDocumentData>> eVar);

    g<rq0.b.EnumC4479b> j();

    Object k(Date date, rq0.b bVar, String str, e<? super i<? extends b, ? extends mv1.b>> eVar);

    Object l(rq0.b.c cVar, e<? super i<? extends b, DynamicMultiDocumentFullData>> eVar);

    Object m(rq0.b bVar, er.a<i0> aVar, e<? super DialogData> eVar);

    Object n(rq0.b bVar, e<? super i<? extends b, i0>> eVar);

    Object o(rq0.b bVar, e<? super i<? extends b, String>> eVar);

    Object p(rq0.b.EnumC4479b enumC4479b, e<? super i<? extends b, ? extends List<DynamicDocumentData>>> eVar);
}
