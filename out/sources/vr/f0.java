package vr;

/* JADX INFO: loaded from: classes4.dex */
public enum f0 {
    FINAL,
    SEALED,
    OPEN,
    ABSTRACT;


    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ wq.a f208044g = wq.b.a(b());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f208038a = new a(null);

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public final f0 a(boolean z15, boolean z16, boolean z17) {
            if (z15) {
                return f0.SEALED;
            }
            if (z16) {
                return f0.ABSTRACT;
            }
            return z17 ? f0.OPEN : f0.FINAL;
        }

        private a() {
        }
    }
}
