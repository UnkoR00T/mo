package a;

import android.hardware.camera2.params.DynamicRangeProfiles;
import io.sentry.android.core.c2;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import o.i0;
import p071kotlin.Metadata;
import pq.e1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"La/n;", "La/m$b;", "Landroid/hardware/camera2/params/DynamicRangeProfiles;", "dynamicRangeProfiles", "<init>", "(Landroid/hardware/camera2/params/DynamicRangeProfiles;)V", "Lo/i0;", "dynamicRange", "", "b", "(Lo/i0;)Ljava/lang/Long;", "profile", "f", "(J)Lo/i0;", "", "profileSet", "e", "(Ljava/util/Set;)Ljava/util/Set;", "d", "(Lo/i0;)Ljava/util/Set;", "a", "()Landroid/hardware/camera2/params/DynamicRangeProfiles;", "Landroid/hardware/camera2/params/DynamicRangeProfiles;", "c", "()Ljava/util/Set;", "supportedDynamicRanges", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n implements m.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final DynamicRangeProfiles dynamicRangeProfiles;

    public n(DynamicRangeProfiles dynamicRangeProfiles) {
        this.dynamicRangeProfiles = dynamicRangeProfiles;
    }

    private final Long b(i0 dynamicRange) {
        return f.c.f54458a.a(dynamicRange, this.dynamicRangeProfiles);
    }

    private final Set<i0> e(Set<Long> profileSet) {
        if (profileSet.isEmpty()) {
            return e1.e();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<Long> it = profileSet.iterator();
        while (it.hasNext()) {
            i0 i0VarF = f(it.next().longValue());
            if (i0VarF != null) {
                linkedHashSet.add(i0VarF);
            }
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    private final i0 f(long profile) {
        i0 i0VarB = f.c.f54458a.b(profile);
        if (i0VarB == null) {
            e.c cVar = e.c.f45719a;
            if (o.e1.k("CXCP")) {
                c2.g(e.c.TRUNCATED_TAG, "Dynamic range profile cannot be converted to a DynamicRange object: " + profile);
            }
        }
        return i0VarB;
    }

    @Override // a.m.b
    /* JADX INFO: renamed from: a, reason: from getter */
    public DynamicRangeProfiles getDynamicRangeProfiles() {
        return this.dynamicRangeProfiles;
    }

    @Override // a.m.b
    public Set<i0> c() {
        return e(this.dynamicRangeProfiles.getSupportedProfiles());
    }

    @Override // a.m.b
    public Set<i0> d(i0 dynamicRange) {
        Long lB = b(dynamicRange);
        if (lB != null) {
            return e(this.dynamicRangeProfiles.getProfileCaptureRequestConstraints(lB.longValue()));
        }
        throw new IllegalArgumentException(("DynamicRange is not supported: " + dynamicRange).toString());
    }
}
