package s;

import java.util.Set;
import o.e1;
import o.i0;
import o.j2;
import o.u1;
import p071kotlin.Metadata;
import v.m0;

/* JADX INFO: renamed from: s.a, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Ls/a;", "Lq/b;", "Lo/i0;", "dynamicRange", "<init>", "(Lo/i0;)V", "Lv/m0;", "cameraInfoInternal", "Lo/u1;", "sessionConfig", "", "d", "(Lv/m0;Lo/u1;)Z", "", "toString", "()Ljava/lang/String;", "g", "Lo/i0;", "f", "()Lo/i0;", "Ls/b;", "h", "Ls/b;", "c", "()Ls/b;", "featureTypeInternal", "i", "a", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DynamicRangeFeature extends q.b {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final i0 f176973j = i0.f140011d;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final i0 dynamicRange;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final b featureTypeInternal = b.DYNAMIC_RANGE;

    public DynamicRangeFeature(i0 i0Var) {
        this.dynamicRange = i0Var;
    }

    @Override // q.b
    /* JADX INFO: renamed from: c, reason: from getter */
    public b getFeatureTypeInternal() {
        return this.featureTypeInternal;
    }

    @Override // q.b
    public boolean d(m0 cameraInfoInternal, u1 sessionConfig) {
        Set<i0> setC = cameraInfoInternal.c();
        e1.a("DynamicRangeFeature", "isSupportedIndividually: cameraInfoSupportedDynamicRanges = " + setC + ", this = " + this);
        if (!setC.contains(this.dynamicRange)) {
            return false;
        }
        for (j2 j2Var : sessionConfig.m()) {
            Set<i0> setA = j2Var.A(cameraInfoInternal);
            e1.a("DynamicRangeFeature", "isSupportedIndividually: useCaseSupportedDynamicRanges = " + setA + ", this = " + this + ", useCases = " + j2Var);
            if (setA != null && !setA.contains(this.dynamicRange)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final i0 getDynamicRange() {
        return this.dynamicRange;
    }

    public String toString() {
        return "DynamicRangeFeature(dynamicRange=" + this.dynamicRange + ')';
    }
}
