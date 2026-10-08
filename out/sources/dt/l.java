package dt;

import java.util.Comparator;
import vr.l1;
import vr.z;
import vr.z0;

/* JADX INFO: loaded from: classes4.dex */
public class l implements Comparator<vr.m> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f44492a = new l();

    private l() {
    }

    private static Integer b(vr.m mVar, vr.m mVar2) {
        int iC = c(mVar2) - c(mVar);
        if (iC != 0) {
            return Integer.valueOf(iC);
        }
        if (i.B(mVar) && i.B(mVar2)) {
            return 0;
        }
        int iCompareTo = mVar.getName().compareTo(mVar2.getName());
        if (iCompareTo != 0) {
            return Integer.valueOf(iCompareTo);
        }
        return null;
    }

    private static int c(vr.m mVar) {
        if (i.B(mVar)) {
            return 8;
        }
        if (mVar instanceof vr.l) {
            return 7;
        }
        if (mVar instanceof z0) {
            return ((z0) mVar).R() == null ? 6 : 5;
        }
        if (mVar instanceof z) {
            return ((z) mVar).R() == null ? 4 : 3;
        }
        if (mVar instanceof vr.e) {
            return 2;
        }
        return mVar instanceof l1 ? 1 : 0;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(vr.m mVar, vr.m mVar2) {
        Integer numB = b(mVar, mVar2);
        if (numB != null) {
            return numB.intValue();
        }
        return 0;
    }
}
