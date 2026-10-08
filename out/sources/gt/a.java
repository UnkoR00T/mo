package gt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements Comparable<a> {
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(a aVar) {
        int iCompareTo = e().compareTo(aVar.e());
        if (iCompareTo == 0 && !g() && aVar.g()) {
            return 1;
        }
        return iCompareTo;
    }

    public abstract b e();

    public abstract boolean g();
}
