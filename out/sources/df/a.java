package df;

import af.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f41310e = new C0928a().b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f41311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<d> f41312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f41313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f41314d;

    /* JADX INFO: renamed from: df.a$a, reason: collision with other inner class name */
    public static final class C0928a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private f f41315a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List<d> f41316b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private b f41317c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f41318d = "";

        C0928a() {
        }

        public C0928a a(d dVar) {
            this.f41316b.add(dVar);
            return this;
        }

        public a b() {
            return new a(this.f41315a, Collections.unmodifiableList(this.f41316b), this.f41317c, this.f41318d);
        }

        public C0928a c(String str) {
            this.f41318d = str;
            return this;
        }

        public C0928a d(b bVar) {
            this.f41317c = bVar;
            return this;
        }

        public C0928a e(f fVar) {
            this.f41315a = fVar;
            return this;
        }
    }

    a(f fVar, List<d> list, b bVar, String str) {
        this.f41311a = fVar;
        this.f41312b = list;
        this.f41313c = bVar;
        this.f41314d = str;
    }

    public static C0928a e() {
        return new C0928a();
    }

    @gl.d(tag = 4)
    public String a() {
        return this.f41314d;
    }

    @gl.d(tag = 3)
    public b b() {
        return this.f41313c;
    }

    @gl.d(tag = 2)
    public List<d> c() {
        return this.f41312b;
    }

    @gl.d(tag = 1)
    public f d() {
        return this.f41311a;
    }

    public byte[] f() {
        return l.a(this);
    }
}
