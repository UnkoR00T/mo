package od;

import fd.a0;
import fd.b0;

/* JADX INFO: loaded from: classes3.dex */
public class j implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f144728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f144729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f144730c;

    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static a e(int i15) {
            if (i15 == 1) {
                return MERGE;
            }
            if (i15 == 2) {
                return ADD;
            }
            if (i15 == 3) {
                return SUBTRACT;
            }
            if (i15 != 4) {
                return i15 != 5 ? MERGE : EXCLUDE_INTERSECTIONS;
            }
            return INTERSECT;
        }
    }

    public j(String str, a aVar, boolean z15) {
        this.f144728a = str;
        this.f144729b = aVar;
        this.f144730c = z15;
    }

    @Override // od.c
    public hd.c a(a0 a0Var, fd.f fVar, pd.b bVar) {
        if (a0Var.S(b0.MergePathsApi19)) {
            return new hd.l(this);
        }
        td.e.c("Animation contains merge paths but they are disabled.");
        return null;
    }

    public a b() {
        return this.f144729b;
    }

    public String c() {
        return this.f144728a;
    }

    public boolean d() {
        return this.f144730c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f144729b + '}';
    }
}
