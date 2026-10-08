package mf0;

import cf0.AsyncDocumentToGenerate;
import cf0.AsyncErrorResponse;
import cf0.DownloadTaskData;
import cf0.c;
import dx.b;
import dx.i;
import java.util.List;
import mu.g;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\f\u001a\u00020\u0005H¦@¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\u0010\u0010\u000bJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\u0011\u0010\u000bJ$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00120\u00022\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\u0013\u0010\u000bJ\u001c\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u0002H¦@¢\u0006\u0004\b\u0014\u0010\u0007J\u001f\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00162\u0006\u0010\u0015\u001a\u00020\bH&¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00162\u0006\u0010\u0019\u001a\u00020\bH&¢\u0006\u0004\b\u001b\u0010\u0018J\u001b\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00040\u0016H&¢\u0006\u0004\b\u001c\u0010\u001dJ4\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 H¦@¢\u0006\u0004\b\"\u0010#J4\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\u0015\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020$H¦@¢\u0006\u0004\b&\u0010'J$\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\r0\u00022\u0006\u0010\u0015\u001a\u00020\bH¦@¢\u0006\u0004\b(\u0010\u000b¨\u0006)À\u0006\u0003"}, d2 = {"Lmf0/a;", "", "Ldx/i;", "Ldx/b;", "", "Lcf0/f;", "a", "(Ltq/e;)Ljava/lang/Object;", "", "id", "e", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "taskData", "Loq/i0;", "i", "(Lcf0/f;Ltq/e;)Ljava/lang/Object;", "g", "b", "", "c", "f", "taskId", "Lmu/g;", "j", "(Ljava/lang/String;)Lmu/g;", "documentId", "Lcf0/b;", "h", "d", "()Lmu/g;", "Lcf0/c;", "type", "Lcf0/a;", "status", "m", "(Ljava/lang/String;Lcf0/c;Lcf0/a;Ltq/e;)Ljava/lang/Object;", "Lcf0/d;", "error", "k", "(Ljava/lang/String;Lcf0/c;Lcf0/d;Ltq/e;)Ljava/lang/Object;", "l", "async_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    Object a(e<? super i<? extends b, ? extends List<DownloadTaskData>>> eVar);

    Object b(String str, e<? super i<? extends b, i0>> eVar);

    Object c(String str, e<? super i<? extends b, Boolean>> eVar);

    g<List<AsyncDocumentToGenerate>> d();

    Object e(String str, e<? super i<? extends b, DownloadTaskData>> eVar);

    Object f(e<? super i<? extends b, i0>> eVar);

    Object g(String str, e<? super i<? extends b, i0>> eVar);

    g<AsyncDocumentToGenerate> h(String documentId);

    Object i(DownloadTaskData downloadTaskData, e<? super i<? extends b, i0>> eVar);

    g<DownloadTaskData> j(String taskId);

    Object k(String str, c cVar, AsyncErrorResponse asyncErrorResponse, e<? super i<? extends b, i0>> eVar);

    Object l(String str, e<? super i<? extends b, i0>> eVar);

    Object m(String str, c cVar, cf0.a aVar, e<? super i<? extends b, i0>> eVar);
}
