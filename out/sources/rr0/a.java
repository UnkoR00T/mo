package rr0;

import dx.i;
import fr0.BEAsyncDocumentGenerationResult;
import iy.b0;
import java.util.Map;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ,\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00130\u00120\u0011H&¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0019\u0010\b¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lrr0/a;", "", "", "taskId", "Ldx/i;", "Ldx/b;", "Lfr0/a;", "e", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Liy/b0;", "authToken", "f", "(Ljava/lang/String;Liy/b0;Ltq/e;)Ljava/lang/Object;", "documentId", "Loq/i0;", "b", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lmu/g;", "", "Lfr0/d;", "c", "()Lmu/g;", "a", "(Ljava/lang/String;)V", "task", "d", "offlinedocumentsservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    void a(String taskId);

    Object b(String str, String str2, tq.e<? super i<? extends dx.b, i0>> eVar);

    mu.g<Map<String, BEAsyncDocumentGenerationResult>> c();

    Object d(String str, tq.e<? super i0> eVar);

    Object e(String str, tq.e<? super i<? extends dx.b, ? extends fr0.a>> eVar);

    Object f(String str, b0 b0Var, tq.e<? super i<? extends dx.b, ? extends fr0.a>> eVar);
}
