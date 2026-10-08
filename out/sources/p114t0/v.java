package p114t0;

import fr.k;
import p071kotlin.Metadata;
import p076m2.x2;
import p076m2.x3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\f\u0010\u0012R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00068F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000e\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R.\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u001a\u001a\u0004\b\u0010\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lt0/v;", "", "Lt0/c0;", "targetContentEnter", "Lt0/e0;", "initialContentExit", "", "targetContentZIndex", "Lt0/y0;", "sizeTransform", "<init>", "(Lt0/c0;Lt0/e0;FLt0/y0;)V", "a", "Lt0/c0;", "c", "()Lt0/c0;", "b", "Lt0/e0;", "()Lt0/e0;", "<set-?>", "Lm2/x2;", "d", "()F", "setTargetContentZIndex", "(F)V", "value", "Lt0/y0;", "()Lt0/y0;", "e", "(Lt0/y0;)V", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c0 targetContentEnter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e0 initialContentExit;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final x2 targetContentZIndex;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private y0 sizeTransform;

    public v(c0 c0Var, e0 e0Var, float f15, y0 y0Var) {
        this.targetContentEnter = c0Var;
        this.initialContentExit = e0Var;
        this.targetContentZIndex = x3.a(f15);
        this.sizeTransform = y0Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final e0 getInitialContentExit() {
        return this.initialContentExit;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final y0 getSizeTransform() {
        return this.sizeTransform;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final c0 getTargetContentEnter() {
        return this.targetContentEnter;
    }

    public final float d() {
        return this.targetContentZIndex.a();
    }

    public final void e(y0 y0Var) {
        this.sizeTransform = y0Var;
    }

    public /* synthetic */ v(c0 c0Var, e0 e0Var, float f15, y0 y0Var, int i15, k kVar) {
        this(c0Var, e0Var, (i15 & 4) != 0 ? 0.0f : f15, (i15 & 8) != 0 ? d.d(false, null, 3, null) : y0Var);
    }
}
