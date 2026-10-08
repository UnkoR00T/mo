package gu;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0001\u0003J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lgu/m;", "", "Lgu/l;", "a", "()Lgu/l;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public interface m {

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lgu/m$a;", "", "<init>", "()V", "Lgu/m$a$a;", "b", "()J", "", "toString", "()Ljava/lang/String;", "a", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f76977a = new a();

        /* JADX INFO: renamed from: gu.m$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087@\u0018\u00002\u00020\u0001B\u0015\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\u0006J\u0018\u0010\n\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\t\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019\u0088\u0001\u0004\u0092\u0001\u00060\u0002j\u0002`\u0003¨\u0006\u001a"}, d2 = {"Lgu/m$a$a;", "Lgu/a;", "", "Lkotlin/time/ValueTimeMarkReading;", "reading", "j", "(J)J", "Lgu/b;", "k", "other", "p", "(JLgu/a;)J", "o", "(JJ)J", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "a", "J", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C1742a implements gu.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final long reading;

            private /* synthetic */ C1742a(long j15) {
                this.reading = j15;
            }

            public static final /* synthetic */ C1742a e(long j15) {
                return new C1742a(j15);
            }

            public static long j(long j15) {
                return j15;
            }

            public static long k(long j15) {
                return k.f76975a.c(j15);
            }

            public static boolean l(long j15, Object obj) {
                return (obj instanceof C1742a) && j15 == ((C1742a) obj).getReading();
            }

            public static int n(long j15) {
                return Long.hashCode(j15);
            }

            public static final long o(long j15, long j16) {
                return k.f76975a.b(j15, j16);
            }

            public static long p(long j15, gu.a aVar) {
                if (aVar instanceof C1742a) {
                    return o(j15, ((C1742a) aVar).getReading());
                }
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) q(j15)) + " and " + aVar);
            }

            public static String q(long j15) {
                return "ValueTimeMark(reading=" + j15 + ')';
            }

            @Override // gu.l
            public long b() {
                return k(this.reading);
            }

            @Override // gu.a
            public long d3(gu.a aVar) {
                return p(this.reading, aVar);
            }

            public boolean equals(Object other) {
                return l(this.reading, other);
            }

            @Override // java.lang.Comparable
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public /* bridge */ int compareTo(gu.a aVar) {
                return gu.a.C1741a.a(this, aVar);
            }

            public int hashCode() {
                return n(this.reading);
            }

            /* JADX INFO: renamed from: r, reason: from getter */
            public final /* synthetic */ long getReading() {
                return this.reading;
            }

            public String toString() {
                return q(this.reading);
            }
        }

        private a() {
        }

        @Override // gu.m
        public /* bridge */ /* synthetic */ l a() {
            return C1742a.e(b());
        }

        public long b() {
            return k.f76975a.d();
        }

        public String toString() {
            return k.f76975a.toString();
        }
    }

    l a();
}
