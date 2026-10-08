package zv;

import fr.t;
import java.util.Iterator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0004\u001a\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lzv/a;", "Lyv/a;", "type", "a", "(Lzv/a;Lyv/a;)Lzv/a;", "", "allFileText", "b", "(Lzv/a;Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "markdown"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class e {
    public static final a a(a aVar, yv.a aVar2) {
        Object next;
        Iterator<T> it = aVar.getChildren().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (t.c(((a) next).getType(), aVar2)) {
                return (a) next;
            }
        }
        next = null;
        return (a) next;
    }

    public static final CharSequence b(a aVar, CharSequence charSequence) {
        return charSequence.subSequence(aVar.getStartOffset(), aVar.getEndOffset());
    }
}
