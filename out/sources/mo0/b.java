package mo0;

import eo0.CentralTokens;
import eo0.DeliveryMessageDetails;
import eo0.DirectoryResponse;
import eo0.OwTokens;
import eo0.OwnerAddress;
import java.io.InputStream;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;
import wx.DomainFile;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\f\u0010\rJ<\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\u0014\u0010\u0015J4\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00180\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\u0019\u0010\u0015J,\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001c0\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\u001d\u0010\u001eJ,\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001c0\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\u001f\u0010\u001eJ,\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001c0\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b \u0010\u001eJ,\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001c0\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b!\u0010\u001eJ<\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020$0\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"2\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b%\u0010&J,\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020'0\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b(\u0010\u001eJ,\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020'0\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b)\u0010\u001e¨\u0006*À\u0006\u0003"}, d2 = {"Lmo0/b;", "", "Leo0/k$a;", "centralAccessToken", "Ldx/i;", "Ldx/b;", "Leo0/j0;", "d", "(Leo0/k$a;Ltq/e;)Ljava/lang/Object;", "Leo0/i0$a;", "owAccessToken", "Leo0/s;", "g", "(Leo0/i0$a;Ltq/e;)Ljava/lang/Object;", "Leo0/r;", "directoryId", "", "pageId", "", "Lfo0/c;", "k", "(Ljava/lang/String;Ljava/lang/String;Leo0/i0$a;Ltq/e;)Ljava/lang/Object;", "Leo0/g0;", "messageId", "Leo0/m;", "h", "Leo0/c0;", "evidenceId", "Lwx/a;", "c", "(Ljava/lang/String;Leo0/i0$a;Ltq/e;)Ljava/lang/Object;", "i", "a", "f", "Leo0/y;", "attachmentId", "Ljava/io/InputStream;", "j", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Leo0/i0$a;Ltq/e;)Ljava/lang/Object;", "Loq/i0;", "e", "b", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    Object a(String str, OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, DomainFile>> eVar);

    Object b(String str, OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, i0>> eVar);

    Object c(String str, OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, DomainFile>> eVar);

    Object d(CentralTokens.Access access, tq.e<? super dx.i<? extends dx.b, OwnerAddress>> eVar);

    Object e(String str, OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, i0>> eVar);

    Object f(String str, OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, DomainFile>> eVar);

    Object g(OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, DirectoryResponse>> eVar);

    Object h(String str, String str2, OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, DeliveryMessageDetails>> eVar);

    Object i(String str, OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, DomainFile>> eVar);

    Object j(String str, String str2, String str3, OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, ? extends InputStream>> eVar);

    Object k(String str, String str2, OwTokens.Access access, tq.e<? super dx.i<? extends dx.b, ? extends List<fo0.c>>> eVar);
}
