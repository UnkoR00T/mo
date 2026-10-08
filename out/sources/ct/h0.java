package ct;

/* JADX INFO: loaded from: classes4.dex */
public enum h0 {
    PLAIN { // from class: ct.h0.b
        @Override // ct.h0
        public String e(String str) {
            return str;
        }
    },
    HTML { // from class: ct.h0.a
        @Override // ct.h0
        public String e(String str) {
            return fu.r.P(fu.r.P(str, "<", "&lt;", false, 4, null), ">", "&gt;", false, 4, null);
        }
    };


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ wq.a f37652d = wq.b.a(b());

    /* synthetic */ h0(fr.k kVar) {
        this();
    }

    public abstract String e(String str);
}
