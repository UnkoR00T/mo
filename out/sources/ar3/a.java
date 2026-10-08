package ar3;

import cb4.DialogData;
import cr3.WruDocumentData;
import dx.b;
import dx.i;
import hr3.LicenceCode;
import java.util.Date;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H¦@¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00022\u0006\u0010\b\u001a\u00020\u0007H¦@¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u0003H¦@¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u00022\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\b\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\tH¦@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00170\u00022\u0006\u0010\b\u001a\u00020\u0016H¦@¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a0\u00022\u0006\u0010\b\u001a\u00020\u0016H¦@¢\u0006\u0004\b\u001b\u0010\u0019J.\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0016H¦@¢\u0006\u0004\b\u001c\u0010\u001dJ2\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\u001f\u001a\u00020\u001e2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040 H¦@¢\u0006\u0004\b\"\u0010#¨\u0006$À\u0006\u0003"}, d2 = {"Lar3/a;", "", "Ldx/i;", "Ldx/b;", "Loq/i0;", "c", "(Ltq/e;)Ljava/lang/Object;", "Lhr3/d;", "licenceCode", "", "h", "(Lhr3/d;Ltq/e;)Ljava/lang/Object;", "error", "Lcb4/d;", "a", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "Ljava/util/Date;", "expirationDate", "documentId", "Lcr3/b;", "g", "(Ljava/util/Date;Lhr3/d;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "", "", "j", "(ILtq/e;)Ljava/lang/Object;", "Lcr3/e;", "k", "i", "(Ljava/lang/String;ILtq/e;)Ljava/lang/Object;", "Lrq0/b;", "documentType", "Lkotlin/Function0;", "onDelete", "f", "(Lrq0/b;Ler/a;Ltq/e;)Ljava/lang/Object;", "wru_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    Object a(b bVar, e<? super DialogData> eVar);

    Object c(e<? super i<? extends b, i0>> eVar);

    Object f(rq0.b bVar, er.a<i0> aVar, e<? super i<? extends b, DialogData>> eVar);

    Object g(Date date, LicenceCode licenceCode, String str, e<? super i<? extends b, ? extends cr3.b>> eVar);

    Object h(LicenceCode licenceCode, e<? super i<? extends b, String>> eVar);

    Object i(String str, int i15, e<? super i<? extends b, i0>> eVar);

    Object j(int i15, e<? super i<? extends b, Boolean>> eVar);

    Object k(int i15, e<? super i<? extends b, WruDocumentData>> eVar);
}
