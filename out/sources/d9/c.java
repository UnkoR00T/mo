package d9;

import ak.d0;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import t7.v;
import w7.o0;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a> f40394a;

    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Comparator<a> f40395d = new Comparator() { // from class: d9.b
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                c.a aVar = (c.a) obj;
                c.a aVar2 = (c.a) obj2;
                return d0.k().e(aVar.f40396a, aVar2.f40396a).e(aVar.f40397b, aVar2.f40397b).d(aVar.f40398c, aVar2.f40398c).j();
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f40396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f40397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f40398c;

        public a(long j15, long j16, int i15) {
            p.d(j15 < j16);
            this.f40396a = j15;
            this.f40397b = j16;
            this.f40398c = i15;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f40396a == aVar.f40396a && this.f40397b == aVar.f40397b && this.f40398c == aVar.f40398c) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Long.valueOf(this.f40396a), Long.valueOf(this.f40397b), Integer.valueOf(this.f40398c));
        }

        public String toString() {
            return o0.F("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f40396a), Long.valueOf(this.f40397b), Integer.valueOf(this.f40398c));
        }
    }

    public c(List<a> list) {
        this.f40394a = list;
        p.d(!d(list));
    }

    private static boolean d(List<a> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j15 = list.get(0).f40397b;
        for (int i15 = 1; i15 < list.size(); i15++) {
            if (list.get(i15).f40396a < j15) {
                return true;
            }
            j15 = list.get(i15).f40397b;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return this.f40394a.equals(((c) obj).f40394a);
    }

    public int hashCode() {
        return this.f40394a.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f40394a;
    }
}
