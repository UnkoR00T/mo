package p056h1;

import c5.d;
import er.p;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J7\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0011\u0010\rJ\u000f\u0010\u0012\u001a\u00020\u0002H&¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0013R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0013R\u0014\u0010\u001f\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0013R\u0014\u0010!\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0013R\u0014\u0010#\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0013R\u0014\u0010%\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\u0013R\u0016\u0010)\u001a\u0004\u0018\u00010&8&X¦\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006*À\u0006\u0001"}, d2 = {"Lh1/j;", "", "", "lineIndex", "Lkotlin/Function2;", "Loq/i0;", "onItemPrefetched", "", "Lh1/l1$b;", "c", "(ILer/p;)Ljava/util/List;", "indexInVisibleLines", "k", "(I)I", "f", "o", "(I)Ljava/lang/Object;", "h", "n", "()I", "e", "totalItemsCount", "g", "visibleLineCount", "", "b", "()Z", "hasVisibleItems", "j", "mainAxisExtraSpaceStart", "m", "mainAxisExtraSpaceEnd", "d", "firstVisibleLineIndex", "i", "lastVisibleLineIndex", "l", "mainAxisViewportSize", "Lc5/d;", "getDensity", "()Lc5/d;", "density", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface j {
    boolean b();

    List<l1.b> c(int lineIndex, p<? super Integer, ? super Integer, i0> onItemPrefetched);

    int d();

    int e();

    int f(int indexInVisibleLines);

    int g();

    d getDensity();

    int h(int lineIndex);

    int i();

    int j();

    int k(int indexInVisibleLines);

    int l();

    int m();

    int n();

    Object o(int indexInVisibleLines);
}
