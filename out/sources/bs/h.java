package bs;

import java.lang.annotation.Annotation;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h implements qs.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f21242b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final zs.f f21243a;

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        public final h a(Object obj, zs.f fVar) {
            if (f.l(obj.getClass())) {
                return new v(fVar, (Enum) obj);
            }
            if (obj instanceof Annotation) {
                return new i(fVar, (Annotation) obj);
            }
            if (obj instanceof Object[]) {
                return new l(fVar, (Object[]) obj);
            }
            return obj instanceof Class ? new r(fVar, (Class) obj) : new x(fVar, obj);
        }

        private a() {
        }
    }

    public /* synthetic */ h(zs.f fVar, fr.k kVar) {
        this(fVar);
    }

    @Override // qs.b
    public zs.f getName() {
        return this.f21243a;
    }

    private h(zs.f fVar) {
        this.f21243a = fVar;
    }
}
