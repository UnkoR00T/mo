package g4;

import java.util.Comparator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\"$\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Ljava/util/Comparator;", "Landroidx/compose/ui/node/g;", "Lkotlin/Comparator;", "a", "Ljava/util/Comparator;", "DepthComparator", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Comparator<androidx.compose.ui.node.g> f70345a = new a();

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003J\u001f\u0010\u0004\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0007¨\u0006\b"}, d2 = {"g4/l$a", "Ljava/util/Comparator;", "Landroidx/compose/ui/node/g;", "Lkotlin/Comparator;", "a", "b", "", "(Landroidx/compose/ui/node/g;Landroidx/compose/ui/node/g;)I", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Comparator<androidx.compose.ui.node.g> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(androidx.compose.ui.node.g a15, androidx.compose.ui.node.g b15) {
            int iD = fr.t.d(a15.getDepth(), b15.getDepth());
            return iD != 0 ? iD : fr.t.d(a15.hashCode(), b15.hashCode());
        }
    }
}
