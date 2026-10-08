package f;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import o.i0;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR \u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u000fR(\u0010\u0013\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00110\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000f¨\u0006\u0014"}, d2 = {"Lf/c;", "", "<init>", "()V", "", "profile", "Lo/i0;", "b", "(J)Lo/i0;", "dynamicRange", "Landroid/hardware/camera2/params/DynamicRangeProfiles;", "dynamicRangeProfiles", "a", "(Lo/i0;Landroid/hardware/camera2/params/DynamicRangeProfiles;)Ljava/lang/Long;", "", "Ljava/util/Map;", "PROFILE_TO_DR_MAP", "", "c", "DR_TO_PROFILE_MAP", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f54458a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Map<Long, i0> PROFILE_TO_DR_MAP;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Map<i0, List<Long>> DR_TO_PROFILE_MAP;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        PROFILE_TO_DR_MAP = linkedHashMap;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        DR_TO_PROFILE_MAP = linkedHashMap2;
        i0 i0Var = i0.f140011d;
        linkedHashMap.put(1L, i0Var);
        linkedHashMap2.put(i0Var, v.e(1L));
        linkedHashMap.put(2L, i0.f140013f);
        linkedHashMap2.put(linkedHashMap.get(2L), v.e(2L));
        i0 i0Var2 = i0.f140014g;
        linkedHashMap.put(4L, i0Var2);
        linkedHashMap2.put(i0Var2, v.e(4L));
        i0 i0Var3 = i0.f140015h;
        linkedHashMap.put(8L, i0Var3);
        linkedHashMap2.put(i0Var3, v.e(8L));
        List<Long> listQ = v.q(64L, 128L, 16L, 32L);
        Iterator<Long> it = listQ.iterator();
        while (it.hasNext()) {
            PROFILE_TO_DR_MAP.put(Long.valueOf(it.next().longValue()), i0.f140016i);
        }
        DR_TO_PROFILE_MAP.put(i0.f140016i, listQ);
        List<Long> listQ2 = v.q(1024L, 2048L, 256L, 512L);
        Iterator<Long> it4 = listQ2.iterator();
        while (it4.hasNext()) {
            PROFILE_TO_DR_MAP.put(Long.valueOf(it4.next().longValue()), i0.f140017j);
        }
        DR_TO_PROFILE_MAP.put(i0.f140017j, listQ2);
    }

    private c() {
    }

    public final Long a(i0 dynamicRange, DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = DR_TO_PROFILE_MAP.get(dynamicRange);
        if (list == null) {
            return null;
        }
        Set<Long> supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        Iterator<Long> it = list.iterator();
        while (it.hasNext()) {
            long jLongValue = it.next().longValue();
            if (supportedProfiles.contains(Long.valueOf(jLongValue))) {
                return Long.valueOf(jLongValue);
            }
        }
        return null;
    }

    public final i0 b(long profile) {
        return PROFILE_TO_DR_MAP.get(Long.valueOf(profile));
    }
}
