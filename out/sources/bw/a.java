package bw;

import java.util.Iterator;
import p071kotlin.Metadata;
import zv.f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lbw/a;", "Lbw/b;", "<init>", "()V", "Lzv/a;", "node", "Loq/i0;", "a", "(Lzv/a;)V", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public class a implements b {
    @Override // bw.b
    public void a(zv.a node) {
        if (node instanceof f) {
            Iterator<zv.a> it = node.getChildren().iterator();
            while (it.hasNext()) {
                a(it.next());
            }
        }
    }
}
