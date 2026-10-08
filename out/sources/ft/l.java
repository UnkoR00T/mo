package ft;

import oq.i0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l extends g<i0> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f66959b = new a(null);

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public final l a(String str) {
            return new b(str);
        }

        private a() {
        }
    }

    public static final class b extends l {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f66960c;

        public b(String str) {
            this.f66960c = str;
        }

        @Override // ft.g
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public ut.i a(vr.i0 i0Var) {
            return ut.l.d(ut.k.I0, this.f66960c);
        }

        @Override // ft.g
        public String toString() {
            return this.f66960c;
        }
    }

    public l() {
        super(i0.f148189a);
    }

    @Override // ft.g
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public i0 b() {
        throw new UnsupportedOperationException();
    }
}
