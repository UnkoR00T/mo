package bs;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class g0 extends u implements qs.b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0 f21238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Annotation[] f21239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f21240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f21241d;

    public g0(e0 e0Var, Annotation[] annotationArr, String str, boolean z15) {
        this.f21238a = e0Var;
        this.f21239b = annotationArr;
        this.f21240c = str;
        this.f21241d = z15;
    }

    @Override // qs.d
    public boolean F() {
        return false;
    }

    @Override // qs.b0
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public e0 getType() {
        return this.f21238a;
    }

    @Override // qs.b0
    public boolean a() {
        return this.f21241d;
    }

    @Override // qs.b0
    public zs.f getName() {
        String str = this.f21240c;
        if (str != null) {
            return zs.f.k(str);
        }
        return null;
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(g0.class.getName());
        sb5.append(": ");
        sb5.append(a() ? "vararg " : "");
        sb5.append(getName());
        sb5.append(": ");
        sb5.append(getType());
        return sb5.toString();
    }

    @Override // qs.d
    public g H(zs.c cVar) {
        return k.a(this.f21239b, cVar);
    }

    @Override // qs.d
    public List<g> getAnnotations() {
        return k.b(this.f21239b);
    }
}
