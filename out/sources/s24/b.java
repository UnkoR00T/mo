package s24;

import er0.BEDocumentStatus;
import f24.i;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J$\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\n\u001a\u00020\tH¦@¢\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H¦@¢\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H¦@¢\u0006\u0004\b\u000f\u0010\u000eJ,\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006H¦@¢\u0006\u0004\b\u0013\u0010\u000eJ@\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0016H§@¢\u0006\u0004\b\u0018\u0010\u0019J4\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001bH§@¢\u0006\u0004\b\u001d\u0010\u001eJ$\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\n\u001a\u00020\tH§@¢\u0006\u0004\b\u001f\u0010\fJ,\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0002H§@¢\u0006\u0004\b \u0010\u0012¨\u0006!À\u0006\u0003"}, d2 = {"Ls24/b;", "", "", "fileName", "Ldx/i;", "Ldx/b;", "Loq/i0;", "g", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lf24/i;", "documentType", "h", "(Lf24/i;Ltq/e;)Ljava/lang/Object;", "d", "(Ltq/e;)Ljava/lang/Object;", "e", "documentId", "i", "(Lf24/i;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "f", "Lfz/b$c;", "expirationDate", "", "saveNewDocument", "c", "(Lf24/i;Ljava/lang/String;Lfz/b$c;ZLtq/e;)Ljava/lang/Object;", "isCertRevoked", "Ler0/c;", "status", "b", "(Lf24/i;ZLer0/c;Ltq/e;)Ljava/lang/Object;", "j", "a", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {
    @oq.a
    Object a(i iVar, String str, e<? super dx.i<? extends dx.b, i0>> eVar);

    @oq.a
    Object b(i iVar, boolean z15, BEDocumentStatus bEDocumentStatus, e<? super dx.i<? extends dx.b, i0>> eVar);

    @oq.a
    Object c(i iVar, String str, fz.b.LocalDate localDate, boolean z15, e<? super dx.i<? extends dx.b, i0>> eVar);

    Object d(e<? super dx.i<? extends dx.b, i0>> eVar);

    Object e(e<? super dx.i<? extends dx.b, i0>> eVar);

    Object f(e<? super i0> eVar);

    Object g(String str, e<? super dx.i<? extends dx.b, i0>> eVar);

    Object h(i iVar, e<? super dx.i<? extends dx.b, i0>> eVar);

    Object i(i iVar, String str, e<? super dx.i<? extends dx.b, i0>> eVar);

    @oq.a
    Object j(i iVar, e<? super dx.i<? extends dx.b, i0>> eVar);
}
