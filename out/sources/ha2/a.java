package ha2;

import dx.b;
import dx.i;
import ia2.InstitutionHistoryType;
import ia2.VerificationHistoryType;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J$\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\u0006\u001a\u00020\u0005H¦@¢\u0006\u0004\b\n\u0010\u000bJ\"\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u0007H¦@¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\f0\u0007H¦@¢\u0006\u0004\b\u0011\u0010\u000fJ$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00140\u00072\u0006\u0010\u0013\u001a\u00020\u0012H¦@¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Lha2/a;", "", "", "a", "()Z", "", "documentType", "Ldx/i;", "Ldx/b;", "", "c", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "", "Lia2/d;", "e", "(Ltq/e;)Ljava/lang/Object;", "Lia2/a;", "d", "Ly92/a;", "historyEntry", "Loq/i0;", "b", "(Ly92/a;Ltq/e;)Ljava/lang/Object;", "history_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {
    boolean a();

    Object b(y92.a aVar, e<? super i<? extends b, i0>> eVar);

    Object c(String str, e<? super i<? extends b, Integer>> eVar);

    Object d(e<? super i<? extends b, ? extends List<InstitutionHistoryType>>> eVar);

    Object e(e<? super i<? extends b, ? extends List<VerificationHistoryType>>> eVar);
}
