package zs;

import fr.t;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f236638c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f236639d = new c("");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f236640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient c f236641b;

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public final c a(f fVar) {
            return new c(d.f236642e.a(fVar));
        }

        private a() {
        }
    }

    public c(String str) {
        this.f236640a = new d(str, this);
    }

    public final String a() {
        return this.f236640a.a();
    }

    public final c b(f fVar) {
        return new c(this.f236640a.b(fVar), this);
    }

    public final boolean c() {
        return this.f236640a.e();
    }

    public final c d() {
        c cVar = this.f236641b;
        if (cVar != null) {
            return cVar;
        }
        if (c()) {
            throw new IllegalStateException("root");
        }
        c cVar2 = new c(this.f236640a.g());
        this.f236641b = cVar2;
        return cVar2;
    }

    public final List<f> e() {
        return this.f236640a.h();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && t.c(this.f236640a, ((c) obj).f236640a);
    }

    public final f f() {
        return this.f236640a.j();
    }

    public final f g() {
        return this.f236640a.k();
    }

    public final boolean h(f fVar) {
        return this.f236640a.l(fVar);
    }

    public int hashCode() {
        return this.f236640a.hashCode();
    }

    public final d i() {
        return this.f236640a;
    }

    public String toString() {
        return this.f236640a.toString();
    }

    public c(d dVar) {
        this.f236640a = dVar;
    }

    private c(d dVar, c cVar) {
        this.f236640a = dVar;
        this.f236641b = cVar;
    }
}
