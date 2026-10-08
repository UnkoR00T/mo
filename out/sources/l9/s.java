package l9;

import ak.n0;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public interface s {

    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f117245a = new C2838a();

        /* JADX INFO: renamed from: l9.s$a$a, reason: collision with other inner class name */
        class C2838a implements a {
            C2838a() {
            }

            @Override // l9.s.a
            public boolean a(t7.p pVar) {
                return false;
            }

            @Override // l9.s.a
            public s b(t7.p pVar) {
                throw new IllegalStateException("This SubtitleParser.Factory doesn't support any formats.");
            }

            @Override // l9.s.a
            public int c(t7.p pVar) {
                return 1;
            }
        }

        boolean a(t7.p pVar);

        s b(t7.p pVar);

        int c(t7.p pVar);
    }

    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final b f117246c = new b(-9223372036854775807L, false);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f117247a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f117248b;

        private b(long j15, boolean z15) {
            this.f117247a = j15;
            this.f117248b = z15;
        }

        public static b b() {
            return f117246c;
        }

        public static b c(long j15) {
            return new b(j15, true);
        }
    }

    default k a(byte[] bArr, int i15, int i16) {
        final n0.a aVarS = n0.s();
        b bVar = b.f117246c;
        Objects.requireNonNull(aVarS);
        b(bArr, i15, i16, bVar, new w7.l() { // from class: l9.r
            @Override // w7.l
            public final void accept(Object obj) {
                aVarS.a((e) obj);
            }
        });
        return new g(aVarS.k());
    }

    void b(byte[] bArr, int i15, int i16, b bVar, w7.l<e> lVar);

    int c();

    default void reset() {
    }
}
