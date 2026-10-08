package n4;

import java.util.Comparator;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u0006\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\t¨\u0006\n"}, d2 = {"Ln4/m;", "Ljava/util/Comparator;", "Ln4/w;", "Lkotlin/Comparator;", "<init>", "()V", "a", "b", "", "(Ln4/w;Ln4/w;)I", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class m implements Comparator<w> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f131264a = new m();

    private m() {
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(w a15, w b15) {
        m3.g gVarL = a15.l();
        m3.g gVarL2 = b15.l();
        int iCompare = Float.compare(gVarL2.getRight(), gVarL.getRight());
        if (iCompare != 0) {
            return iCompare;
        }
        int iCompare2 = Float.compare(gVarL.getTop(), gVarL2.getTop());
        if (iCompare2 != 0) {
            return iCompare2;
        }
        int iCompare3 = Float.compare(gVarL.getBottom(), gVarL2.getBottom());
        return iCompare3 != 0 ? iCompare3 : Float.compare(gVarL2.getLeft(), gVarL.getLeft());
    }
}
