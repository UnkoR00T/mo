package u0;

import p071kotlin.Metadata;
import u0.t;

/* JADX INFO: renamed from: u0.b4, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0015\u0010\u0010¨\u0006\u001d"}, d2 = {"Lu0/b4;", "Lu0/t;", "V", "", "vectorValue", "Lu0/g0;", "easing", "Lu0/x;", "arcMode", "<init>", "(Lu0/t;Lu0/g0;ILfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lu0/t;", "c", "()Lu0/t;", "b", "Lu0/g0;", "()Lu0/g0;", "I", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class VectorizedKeyframeSpecElementInfo<V extends t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final V vectorValue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final g0 easing;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int arcMode;

    public /* synthetic */ VectorizedKeyframeSpecElementInfo(t tVar, g0 g0Var, int i15, fr.k kVar) {
        this(tVar, g0Var, i15);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getArcMode() {
        return this.arcMode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final g0 getEasing() {
        return this.easing;
    }

    public final V c() {
        return this.vectorValue;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VectorizedKeyframeSpecElementInfo)) {
            return false;
        }
        VectorizedKeyframeSpecElementInfo vectorizedKeyframeSpecElementInfo = (VectorizedKeyframeSpecElementInfo) other;
        return fr.t.c(this.vectorValue, vectorizedKeyframeSpecElementInfo.vectorValue) && fr.t.c(this.easing, vectorizedKeyframeSpecElementInfo.easing) && x.c(this.arcMode, vectorizedKeyframeSpecElementInfo.arcMode);
    }

    public int hashCode() {
        return (((this.vectorValue.hashCode() * 31) + this.easing.hashCode()) * 31) + x.d(this.arcMode);
    }

    public String toString() {
        return "VectorizedKeyframeSpecElementInfo(vectorValue=" + this.vectorValue + ", easing=" + this.easing + ", arcMode=" + ((Object) x.e(this.arcMode)) + ')';
    }

    private VectorizedKeyframeSpecElementInfo(V v15, g0 g0Var, int i15) {
        this.vectorValue = v15;
        this.easing = g0Var;
        this.arcMode = i15;
    }
}
