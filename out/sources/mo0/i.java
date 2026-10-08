package mo0;

import eo0.EpuapApplicationType;
import eo0.FileHandler;
import eo0.OwTokens;
import eo0.b0;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\"\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0002H¦@¢\u0006\u0004\b\u0006\u0010\u0007J,\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH¦@¢\u0006\u0004\b\r\u0010\u000eJ,\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH¦@¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H¦@¢\u0006\u0004\b\u0016\u0010\u0017J,\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\bH¦@¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001cÀ\u0006\u0003"}, d2 = {"Lmo0/i;", "", "Ldx/i;", "Ldx/b;", "", "Leo0/a0;", "e", "(Ltq/e;)Ljava/lang/Object;", "Leo0/i0$a;", "owAccessToken", "Leo0/e0;", "file", "", "d", "(Leo0/i0$a;Leo0/e0;Ltq/e;)Ljava/lang/Object;", "Leo0/b0;", "request", "Loq/i0;", "a", "(Leo0/i0$a;Leo0/b0;Ltq/e;)Ljava/lang/Object;", "Leo0/y;", "attachmentId", "b", "(Leo0/i0$a;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Leo0/g0;", "messageId", "c", "(Ljava/lang/String;Leo0/i0$a;Ltq/e;)Ljava/lang/Object;", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i {
    Object a(OwTokens.Access access, b0 b0Var, tq.e<? super dx.i<? extends dx.b, i0>> eVar);

    Object b(OwTokens.Access access, String str, tq.e<? super dx.i<? extends dx.b, i0>> eVar);

    Object c(String str, OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, i0>> eVar);

    Object d(OwTokens.Access access, FileHandler fileHandler, tq.e<? super dx.i<? extends dx.b, String>> eVar);

    Object e(tq.e<? super dx.i<? extends dx.b, ? extends List<EpuapApplicationType>>> eVar);
}
