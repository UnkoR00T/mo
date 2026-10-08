package io.sentry.android.core.performance;

/* JADX INFO: loaded from: classes4.dex */
public class c implements Comparable<c> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f94095a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f94096b = new i();

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(c cVar) {
        int iCompare = Long.compare(this.f94095a.q(), cVar.f94095a.q());
        return iCompare == 0 ? Long.compare(this.f94096b.q(), cVar.f94096b.q()) : iCompare;
    }

    public final i e() {
        return this.f94095a;
    }

    public final i g() {
        return this.f94096b;
    }
}
