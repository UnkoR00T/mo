package b0;

import android.media.MediaCodec;
import android.util.Range;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import o.e1;
import p071kotlin.Metadata;
import v.j3;
import v.n1;
import v.u1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u0006*\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u0006*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0006*\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0018\u001a\u00020\u00172\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lb0/g;", "", "<init>", "()V", "Landroid/util/Range;", "", "", "c", "(Landroid/util/Range;)Z", "f", "(Landroid/util/Range;)Landroid/util/Range;", "", "Lv/j3$f;", "a", "(Ljava/util/Collection;)Z", "Lv/n1$a;", "b", "(Lv/n1$a;)Z", "Lv/u1;", "d", "(Lv/u1;)Z", "outputConfigs", "repeatingConfigBuilder", "Loq/i0;", "e", "(Ljava/util/Collection;Lv/n1$a;)V", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a f15588a = new a(null);

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lb0/g$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "PREVIEW_ONLY_FPS_LOWER", "I", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    private final boolean a(Collection<? extends j3.f> collection) {
        Collection<? extends j3.f> collection2 = collection;
        if ((collection2 instanceof Collection) && collection2.isEmpty()) {
            return false;
        }
        Iterator<T> it = collection2.iterator();
        while (it.hasNext()) {
            if (d(((j3.f) it.next()).f())) {
                return true;
            }
        }
        return false;
    }

    private final boolean b(n1.a aVar) {
        Set<u1> setK = aVar.k();
        if ((setK instanceof Collection) && setK.isEmpty()) {
            return false;
        }
        Iterator<T> it = setK.iterator();
        while (it.hasNext()) {
            if (d((u1) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean c(Range<Integer> range) {
        return ((Number) range.getUpper()).intValue() >= 120 && fr.t.c(range.getLower(), range.getUpper());
    }

    private final boolean d(u1 u1Var) {
        return fr.t.c(u1Var.g(), MediaCodec.class);
    }

    private final Range<Integer> f(Range<Integer> range) {
        Range<Integer> range2 = new Range<>(30, range.getUpper());
        e1.a("HighSpeedFpsModifier", "Modified high-speed FPS range from " + range + " to " + range2);
        return range2;
    }

    public final void e(Collection<? extends j3.f> outputConfigs, n1.a repeatingConfigBuilder) {
        Range<Integer> rangeJ;
        if (outputConfigs.size() != 2 || !a(outputConfigs) || b(repeatingConfigBuilder) || (rangeJ = repeatingConfigBuilder.j()) == null) {
            return;
        }
        if (!c(rangeJ)) {
            rangeJ = null;
        }
        if (rangeJ != null) {
            repeatingConfigBuilder.m(f(rangeJ));
        }
    }
}
