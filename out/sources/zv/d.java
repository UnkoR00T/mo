package zv;

import java.util.Iterator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0006\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0005¨\u0006\u0007"}, d2 = {"Lzv/a;", "Lbw/b;", "visitor", "Loq/i0;", "a", "(Lzv/a;Lbw/b;)V", "b", "markdown"}, k = 2, mv = {1, 7, 0}, xi = 48)
public final class d {
    public static final void a(a aVar, bw.b bVar) {
        bVar.a(aVar);
    }

    public static final void b(a aVar, bw.b bVar) {
        Iterator<a> it = aVar.getChildren().iterator();
        while (it.hasNext()) {
            a(it.next(), bVar);
        }
    }
}
