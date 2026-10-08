package mo0;

import eo0.EdeliveryDraftMessageResponse;
import eo0.FileHandler;
import eo0.OwTokens;
import eo0.SendEdeliveryDraftMessageResponse;
import eo0.g0;
import eo0.v;
import eo0.y;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J,\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\t\u0010\nJ2\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\u00062\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u000e\u0010\u000fJ4\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H¦@¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00140\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H¦@¢\u0006\u0004\b\u0015\u0010\u0016J4\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\r0\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\u0019\u0010\u001aJ4\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00170\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH¦@¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001fÀ\u0006\u0003"}, d2 = {"Lmo0/f;", "", "Leo0/g0;", "messageId", "Leo0/i0$a;", "owAccessToken", "Ldx/i;", "Ldx/b;", "Leo0/x0;", "b", "(Ljava/lang/String;Leo0/i0$a;Ltq/e;)Ljava/lang/Object;", "", "messageIds", "Loq/i0;", "e", "(Ljava/util/List;Leo0/i0$a;Ltq/e;)Ljava/lang/Object;", "Leo0/v;", "draft", "d", "(Ljava/lang/String;Leo0/i0$a;Leo0/v;Ltq/e;)Ljava/lang/Object;", "Leo0/w;", "f", "(Leo0/i0$a;Leo0/v;Ltq/e;)Ljava/lang/Object;", "Leo0/y;", "attachmentId", "c", "(Ljava/lang/String;Ljava/lang/String;Leo0/i0$a;Ltq/e;)Ljava/lang/Object;", "Leo0/e0;", "file", "a", "(Ljava/lang/String;Leo0/i0$a;Leo0/e0;Ltq/e;)Ljava/lang/Object;", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f {
    Object a(String str, OwTokens.Access access, FileHandler fileHandler, tq.e<? super dx.i<? extends dx.b, y>> eVar);

    Object b(String str, OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, SendEdeliveryDraftMessageResponse>> eVar);

    Object c(String str, String str2, OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, i0>> eVar);

    Object d(String str, OwTokens.Access access, v vVar, tq.e<? super dx.i<? extends dx.b, g0>> eVar);

    Object e(List<g0> list, OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, i0>> eVar);

    Object f(OwTokens.Access access, v vVar, tq.e<? super dx.i<? extends dx.b, EdeliveryDraftMessageResponse>> eVar);
}
