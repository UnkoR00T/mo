package pr;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
class d1 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final er.p f161779a;

    public d1(er.p pVar) {
        this.f161779a = pVar;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return g1.p(this.f161779a, obj, obj2);
    }
}
