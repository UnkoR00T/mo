package ze;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class d extends m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<s> f234520a;

    d(List<s> list) {
        if (list == null) {
            throw new NullPointerException("Null logRequests");
        }
        this.f234520a = list;
    }

    @Override // ze.m
    public List<s> c() {
        return this.f234520a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m) {
            return this.f234520a.equals(((m) obj).c());
        }
        return false;
    }

    public int hashCode() {
        return this.f234520a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "BatchedLogRequest{logRequests=" + this.f234520a + "}";
    }
}
