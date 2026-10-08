package a;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Set;
import o.i0;
import p071kotlin.Metadata;
import pq.e1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"La/o;", "La/m$b;", "<init>", "()V", "Lo/i0;", "dynamicRange", "", "d", "(Lo/i0;)Ljava/util/Set;", "Landroid/hardware/camera2/params/DynamicRangeProfiles;", "a", "()Landroid/hardware/camera2/params/DynamicRangeProfiles;", "c", "()Ljava/util/Set;", "supportedDynamicRanges", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o implements m.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final m f1026b = new m(new o());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set<i0> f1027c = e1.d(i0.f140011d);

    /* JADX INFO: renamed from: a.o$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001f\u0010\f\u001a\r\u0012\t\u0012\u00070\n¢\u0006\u0002\b\u000b0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"La/o$a;", "", "<init>", "()V", "La/m;", "COMPAT_INSTANCE", "La/m;", "a", "()La/m;", "", "Lo/i0;", "Lkotlin/jvm/internal/EnhancedNullability;", "SDR_ONLY", "Ljava/util/Set;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final m a() {
            return o.f1026b;
        }

        private Companion() {
        }
    }

    @Override // a.m.b
    /* JADX INFO: renamed from: a */
    public DynamicRangeProfiles getDynamicRangeProfiles() {
        return null;
    }

    @Override // a.m.b
    public Set<i0> c() {
        return f1027c;
    }

    @Override // a.m.b
    public Set<i0> d(i0 dynamicRange) {
        i6.i.b(fr.t.c(i0.f140011d, dynamicRange), "DynamicRange is not supported: " + dynamicRange);
        return f1027c;
    }
}
