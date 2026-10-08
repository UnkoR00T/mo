package zt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class k implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f237228a;

    public static final class a extends k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f237229b = new a();

        private a() {
            super("must be a member function", null);
        }

        @Override // zt.f
        public boolean a(vr.z zVar) {
            return zVar.N() != null;
        }
    }

    public static final class b extends k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f237230b = new b();

        private b() {
            super("must be a member or an extension function", null);
        }

        @Override // zt.f
        public boolean a(vr.z zVar) {
            return (zVar.N() == null && zVar.R() == null) ? false : true;
        }
    }

    public /* synthetic */ k(String str, fr.k kVar) {
        this(str);
    }

    @Override // zt.f
    public /* bridge */ String b(vr.z zVar) {
        return f.a.a(this, zVar);
    }

    @Override // zt.f
    public String getDescription() {
        return this.f237228a;
    }

    private k(String str) {
        this.f237228a = str;
    }
}
