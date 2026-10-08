package u34;

import dx.i;
import er0.BEDocumentStatus;
import java.util.List;
import java.util.Map;
import k34.DocumentSummaryData;
import k34.o;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J4\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH¦@¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0015\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\nH¦@¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\r0\u00192\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u001c\u0010\u0013J*\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\r0\u00192\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u001d\u0010\u001eJ\"\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\r0\u001fH¦@¢\u0006\u0004\b \u0010\u0018J\u001e\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001b0\r2\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b!\u0010\u0013J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\"H&¢\u0006\u0004\b$\u0010%¨\u0006&À\u0006\u0003"}, d2 = {"Lu34/b;", "", "Lrq0/b;", "documentType", "", "documentIID", "Lfz/b$c;", "expirationDate", "", "saveNewDocument", "Loq/i0;", "b", "(Lrq0/b;Ljava/lang/String;Lfz/b$c;ZLtq/e;)Ljava/lang/Object;", "", "Ler0/c;", "statuses", "e", "(Lrq0/b;Ljava/util/List;Ltq/e;)Ljava/lang/Object;", "c", "(Lrq0/b;Ltq/e;)Ljava/lang/Object;", "documentId", "j", "(Lrq0/b;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "a", "(Ltq/e;)Ljava/lang/Object;", "Ldx/i;", "Ldx/b;", "Lk34/n;", "f", "h", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "", "i", "d", "Lmu/g;", "Lk34/o;", "g", "()Lmu/g;", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    Object a(tq.e<? super i0> eVar);

    Object b(rq0.b bVar, String str, fz.b.LocalDate localDate, boolean z15, tq.e<? super i0> eVar);

    Object c(rq0.b bVar, tq.e<? super i0> eVar);

    Object d(rq0.b bVar, tq.e<? super List<DocumentSummaryData>> eVar);

    Object e(rq0.b bVar, List<BEDocumentStatus> list, tq.e<? super i0> eVar);

    Object f(rq0.b bVar, tq.e<? super i<? extends dx.b, ? extends List<DocumentSummaryData>>> eVar);

    mu.g<o> g();

    Object h(String str, tq.e<? super i<? extends dx.b, ? extends List<DocumentSummaryData>>> eVar);

    Object i(tq.e<? super Map<rq0.b, ? extends List<DocumentSummaryData>>> eVar);

    Object j(rq0.b bVar, String str, tq.e<? super i0> eVar);
}
