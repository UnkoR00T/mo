package p3;

import fr.t;
import n3.a3;
import n3.b3;
import n3.n2;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: p3.k, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001#B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0018\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001e\u001a\u0004\b\u001c\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006$"}, d2 = {"Lp3/k;", "Lp3/g;", "", "width", "miter", "Ln3/a3;", "cap", "Ln3/b3;", "join", "Ln3/n2;", "pathEffect", "<init>", "(FFIILn3/n2;Lfr/k;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "F", "f", "()F", "c", "d", "I", "e", "Ln3/n2;", "()Ln3/n2;", "g", "a", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Stroke extends g {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f152594h = 8;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f152595i = a3.INSTANCE.a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f152596j = b3.INSTANCE.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final float width;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final float miter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int cap;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int join;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final n2 pathEffect;

    /* JADX INFO: renamed from: p3.k$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lp3/k$a;", "", "<init>", "()V", "Ln3/a3;", "DefaultCap", "I", "a", "()I", "", "HairlineWidth", "F", "DefaultMiter", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final int a() {
            return Stroke.f152595i;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Stroke(float f15, float f16, int i15, int i16, n2 n2Var, fr.k kVar) {
        this(f15, f16, i15, i16, n2Var);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getCap() {
        return this.cap;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getJoin() {
        return this.join;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getMiter() {
        return this.miter;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final n2 getPathEffect() {
        return this.pathEffect;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Stroke)) {
            return false;
        }
        Stroke stroke = (Stroke) other;
        return this.width == stroke.width && this.miter == stroke.miter && a3.e(this.cap, stroke.cap) && b3.e(this.join, stroke.join) && t.c(this.pathEffect, stroke.pathEffect);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iHashCode = ((((((Float.hashCode(this.width) * 31) + Float.hashCode(this.miter)) * 31) + a3.f(this.cap)) * 31) + b3.f(this.join)) * 31;
        n2 n2Var = this.pathEffect;
        return iHashCode + (n2Var != null ? n2Var.hashCode() : 0);
    }

    public String toString() {
        return "Stroke(width=" + this.width + ", miter=" + this.miter + ", cap=" + ((Object) a3.g(this.cap)) + ", join=" + ((Object) b3.g(this.join)) + ", pathEffect=" + this.pathEffect + ')';
    }

    private Stroke(float f15, float f16, int i15, int i16, n2 n2Var) {
        super(null);
        this.width = f15;
        this.miter = f16;
        this.cap = i15;
        this.join = i16;
        this.pathEffect = n2Var;
    }

    public /* synthetic */ Stroke(float f15, float f16, int i15, int i16, n2 n2Var, int i17, fr.k kVar) {
        this((i17 & 1) != 0 ? 0.0f : f15, (i17 & 2) != 0 ? 4.0f : f16, (i17 & 4) != 0 ? f152595i : i15, (i17 & 8) != 0 ? f152596j : i16, (i17 & 16) != 0 ? null : n2Var, null);
    }
}
