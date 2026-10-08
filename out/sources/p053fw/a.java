package p053fw;

import fr.t;
import fu.r;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;
import zv.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\f\u001a\u00020\u000b2\n\u0010\u0006\u001a\u00060\u0004R\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lfw/a;", "Lfw/e;", "<init>", "()V", "Lfw/g$c;", "Lfw/g;", "visitor", "", "text", "Lzv/a;", "node", "Loq/i0;", "a", "(Lfw/g$c;Ljava/lang/String;Lzv/a;)V", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public final class a implements e {
    @Override // p053fw.e
    public void a(g.c visitor, String text, zv.a node) {
        g.c cVar;
        visitor = visitor;
        text = text;
        node = node;
        int length = r.Z(e.b(node, text), r.L(" ", 10), false, 2, null).length();
        visitor.b("<pre>");
        List<zv.a> children = node.getChildren();
        if (t.c(((zv.a) v.x0(children)).getType(), yv.e.H)) {
            children = children.subList(0, children.size() - 1);
        }
        ArrayList arrayList = new ArrayList();
        boolean z15 = false;
        boolean zC = false;
        for (zv.a aVar : children) {
            if (z15) {
                yv.a aVar2 = yv.e.G;
                if (v.q(aVar2, yv.e.f229936q).contains(aVar.getType())) {
                    g.Companion companion = g.INSTANCE;
                    visitor.b(companion.e(companion.c(text, aVar, false), length));
                    zC = t.c(aVar.getType(), aVar2);
                }
            }
            if (!z15 && t.c(aVar.getType(), yv.e.E)) {
                arrayList.add("class=\"language-" + ((String) r.U0(r.u1(g.Companion.d(g.INSTANCE, text, aVar, false, 4, null).toString()).toString(), new char[]{' '}, false, 0, 6, null).get(0)) + '\"');
            }
            if (!z15 && t.c(aVar.getType(), yv.e.f229936q)) {
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                g.c.e(visitor, node, "code", (CharSequence[]) Arrays.copyOf(strArr, strArr.length), false, 8, null);
                z15 = true;
            }
        }
        if (z15) {
            cVar = visitor;
        } else {
            String[] strArr2 = (String[]) arrayList.toArray(new String[0]);
            CharSequence[] charSequenceArr = (CharSequence[]) Arrays.copyOf(strArr2, strArr2.length);
            cVar = visitor;
            g.c.e(cVar, node, "code", charSequenceArr, false, 8, null);
        }
        if (zC) {
            cVar.b("\n");
        }
        cVar.b("</code></pre>");
    }
}
