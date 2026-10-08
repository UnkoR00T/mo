package nw;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\u0006\u0010\u0007J3\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lnw/g;", "", "<init>", "()V", "", "Lnw/f;", "a", "()Ljava/util/List;", "Lnw/i;", "tokensCache", "Llr/i;", "rangesToParse", "Liw/a;", "cancellationToken", "", "Lnw/f$a;", "b", "(Lnw/i;Ljava/util/List;Liw/a;)Ljava/util/Collection;", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public abstract class g {
    public abstract List<f> a();

    public final Collection<f.Node> b(i tokensCache, List<lr.i> rangesToParse, iw.a cancellationToken) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(rangesToParse);
        for (f fVar : a()) {
            cancellationToken.a();
            ArrayList arrayList3 = new ArrayList();
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                f.b bVarA = fVar.a(tokensCache, (List) it.next());
                arrayList.addAll(bVarA.b());
                arrayList3.addAll(bVarA.a());
            }
            arrayList2 = arrayList3;
        }
        return arrayList;
    }
}
