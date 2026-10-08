package zt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a0 implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f237202a;

    public static final class a extends a0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f237203b;

        public a(int i15) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("must have at least ");
            sb5.append(i15);
            sb5.append(" value parameter");
            sb5.append(i15 > 1 ? "s" : "");
            super(sb5.toString(), null);
            this.f237203b = i15;
        }

        @Override // zt.f
        public boolean a(vr.z zVar) {
            return zVar.l().size() >= this.f237203b;
        }
    }

    public static final class b extends a0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f237204b;

        public b(int i15) {
            super("must have exactly " + i15 + " value parameters", null);
            this.f237204b = i15;
        }

        @Override // zt.f
        public boolean a(vr.z zVar) {
            return zVar.l().size() == this.f237204b;
        }
    }

    public static final class c extends a0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f237205b = new c();

        private c() {
            super("must have no value parameters", null);
        }

        @Override // zt.f
        public boolean a(vr.z zVar) {
            return zVar.l().isEmpty();
        }
    }

    public static final class d extends a0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f237206b = new d();

        private d() {
            super("must have a single value parameter", null);
        }

        @Override // zt.f
        public boolean a(vr.z zVar) {
            return zVar.l().size() == 1;
        }
    }

    public /* synthetic */ a0(String str, fr.k kVar) {
        this(str);
    }

    @Override // zt.f
    public /* bridge */ String b(vr.z zVar) {
        return f.a.a(this, zVar);
    }

    @Override // zt.f
    public String getDescription() {
        return this.f237202a;
    }

    private a0(String str) {
        this.f237202a = str;
    }
}
