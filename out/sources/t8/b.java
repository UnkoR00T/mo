package t8;

import java.util.Objects;
import o8.e;
import o8.q;
import o8.v;
import o8.y;

/* JADX INFO: loaded from: classes3.dex */
final class b extends e {

    /* JADX INFO: renamed from: t8.b$b, reason: collision with other inner class name */
    private static final class C4902b implements e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final y f188830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f188831b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final v.a f188832c;

        private long c(q qVar) {
            while (qVar.j() < qVar.a() - 6 && !v.i(qVar, this.f188830a, this.f188831b, this.f188832c)) {
                qVar.k(1);
            }
            if (qVar.j() < qVar.a() - 6) {
                return this.f188832c.f143207a;
            }
            qVar.k((int) (qVar.a() - qVar.j()));
            return this.f188830a.f143241j;
        }

        @Override // o8.e.f
        public e.C3546e a(q qVar, long j15) {
            long position = qVar.getPosition();
            long jC = c(qVar);
            long j16 = qVar.j();
            qVar.k(Math.max(6, this.f188830a.f143234c));
            long jC2 = c(qVar);
            long j17 = qVar.j();
            if (jC > j15 || jC2 <= j15) {
                return jC2 <= j15 ? e.C3546e.f(jC2, j17) : e.C3546e.d(jC, position);
            }
            return e.C3546e.e(j16);
        }

        private C4902b(y yVar, int i15) {
            this.f188830a = yVar;
            this.f188831b = i15;
            this.f188832c = new v.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(final y yVar, int i15, long j15, long j16) {
        super(new e.d() { // from class: t8.a
            @Override // o8.e.d
            public final long a(long j17) {
                return yVar.i(j17);
            }
        }, new C4902b(yVar, i15), yVar.f(), 0L, yVar.f143241j, j15, j16, yVar.d(), Math.max(6, yVar.f143234c));
        Objects.requireNonNull(yVar);
    }
}
