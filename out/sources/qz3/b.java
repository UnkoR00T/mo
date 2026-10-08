package qz3;

import dx.i;
import fr0.DocumentConfig;
import gr0.DocumentSchema;
import hr0.MultiDocumentSchema;
import java.util.List;
import lz3.d;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001JZ\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b\u0011\u0010\u0012Jj\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H§@¢\u0006\u0004\b\u0019\u0010\u001aJ@\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\t2\u0006\u0010\u001c\u001a\u00020\u0004H§@¢\u0006\u0004\b\u001d\u0010\u001eJ,\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b\u001f\u0010 J$\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b!\u0010\"J$\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010#\u001a\u00020\u0006H§@¢\u0006\u0004\b$\u0010\"J$\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\u000e2\u0006\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b%\u0010&J$\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b'\u0010&J4\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010)\u001a\u00020(H¦@¢\u0006\u0004\b*\u0010+J,\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b,\u0010 J$\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H¦@¢\u0006\u0004\b-\u0010\"J$\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H§@¢\u0006\u0004\b.\u0010\"J\u001c\u0010/\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH¦@¢\u0006\u0004\b/\u00100J$\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u00101\u001a\u00020\u0006H¦@¢\u0006\u0004\b2\u0010\"J\"\u00105\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u000204030\u000eH¦@¢\u0006\u0004\b5\u00100¨\u00066À\u0006\u0003"}, d2 = {"Lqz3/b;", "", "Lgr0/h;", "documentSchema", "", "documentTypeFirstEvent", "", "documentId", "parentDocumentId", "Lfz/b$c;", "documentExpirationDate", "dataScope", "Lrq0/b;", "documentType", "Ldx/i;", "Ldx/b;", "Loq/i0;", "g", "(Lgr0/h;ZLjava/lang/String;Ljava/lang/String;Lfz/b$c;Ljava/lang/String;Lrq0/b;Ltq/e;)Ljava/lang/Object;", "documentScope", "taskId", "Llz3/d;", "downloadMethod", "Lfr0/i;", "documentStoringMode", "d", "(Lgr0/h;ZLrq0/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfz/b$c;Llz3/d;Lfr0/i;Ltq/e;)Ljava/lang/Object;", "expirationDate", "saveNewDocument", "k", "(Lrq0/b;Ljava/lang/String;Lfz/b$c;ZLtq/e;)Ljava/lang/Object;", "a", "(Ljava/lang/String;Lrq0/b;Ltq/e;)Ljava/lang/Object;", "m", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "tag", "o", "e", "(Lrq0/b;Ltq/e;)Ljava/lang/Object;", "f", "Lhr0/a;", "multiDocumentSchema", "i", "(Ljava/lang/String;Lrq0/b;Lhr0/a;Ltq/e;)Ljava/lang/Object;", "b", "n", "j", "c", "(Ltq/e;)Ljava/lang/Object;", "parentId", "h", "", "Lfr0/g;", "l", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    Object a(String str, rq0.b bVar, e<? super i<? extends dx.b, Boolean>> eVar);

    Object b(String str, rq0.b bVar, e<? super i<? extends dx.b, i0>> eVar);

    Object c(e<? super i<? extends dx.b, i0>> eVar);

    @oq.a
    Object d(DocumentSchema documentSchema, boolean z15, rq0.b bVar, String str, String str2, String str3, fz.b.LocalDate localDate, d dVar, fr0.i iVar, e<? super i<? extends dx.b, i0>> eVar);

    Object e(rq0.b bVar, e<? super i<? extends dx.b, Boolean>> eVar);

    Object f(rq0.b bVar, e<? super i<? extends dx.b, i0>> eVar);

    Object g(DocumentSchema documentSchema, boolean z15, String str, String str2, fz.b.LocalDate localDate, String str3, rq0.b bVar, e<? super i<? extends dx.b, i0>> eVar);

    Object h(String str, e<? super i<? extends dx.b, i0>> eVar);

    Object i(String str, rq0.b bVar, MultiDocumentSchema multiDocumentSchema, e<? super i<? extends dx.b, i0>> eVar);

    @oq.a
    Object j(String str, e<? super i<? extends dx.b, i0>> eVar);

    @oq.a
    Object k(rq0.b bVar, String str, fz.b.LocalDate localDate, boolean z15, e<? super i<? extends dx.b, i0>> eVar);

    Object l(e<? super i<? extends dx.b, ? extends List<DocumentConfig>>> eVar);

    @oq.a
    Object m(String str, e<? super i<? extends dx.b, Boolean>> eVar);

    Object n(String str, e<? super i<? extends dx.b, i0>> eVar);

    @oq.a
    Object o(String str, e<? super i<? extends dx.b, i0>> eVar);
}
