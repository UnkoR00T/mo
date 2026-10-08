package mx;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000b\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u00022\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\t\"\u00020\u0001H&¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\r\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u00022\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t\"\u00020\u0005H&¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0010J5\u0010\u0013\u001a\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00022\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00120\t\"\u00020\u0012H&¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00122\b\b\u0001\u0010\u0016\u001a\u00020\u0002H&¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019À\u0006\u0003"}, d2 = {"Lmx/c;", "", "", "stringArrayId", "", "Lmx/a;", "d", "(I)Ljava/util/List;", "stringId", "", "arg", "e", "(I[Ljava/lang/Object;)Lmx/a;", "f", "(I[Lmx/a;)Lmx/a;", "c", "(I)Lmx/a;", "quantity", "", "a", "(II[Ljava/lang/String;)Lmx/a;", "text", "tagId", "b", "(Ljava/lang/String;I)Lmx/a;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c {
    Label a(int stringId, int quantity, String... arg);

    Label b(String text, int tagId);

    Label c(int stringId);

    List<Label> d(int stringArrayId);

    Label e(int stringId, Object... arg);

    Label f(int stringId, Label... arg);
}
