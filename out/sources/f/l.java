package f;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import fr.t;
import h.x;
import io.sentry.android.core.c2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p071kotlin.Metadata;
import pq.e1;
import pq.v;
import pq.v0;
import v.SurfaceConfig;
import v.d2;
import v.e2;
import v.j3;
import v.n3;
import v.p1;
import v.u1;
import v.u2;
import v.w3;
import v.x3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0017\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00142\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u0003J=\u0010 \u001a\u00020\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\b2\u0010\u0010\u001e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d0\b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0014H\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\"2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"H\u0003¢\u0006\u0004\b$\u0010%JA\u0010-\u001a\u00020\u00192\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\u0010\u0010)\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d0&2\u0012\u0010,\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u00060*¢\u0006\u0004\b-\u0010.J\u0019\u00101\u001a\u0002002\n\u0010/\u001a\u0006\u0012\u0002\b\u00030\u001d¢\u0006\u0004\b1\u00102J\u0015\u00105\u001a\u00020\n2\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u0015\u00109\u001a\u00020\n2\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:JO\u0010>\u001a\u00020\n2\u0006\u00104\u001a\u0002032\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\b2\u0016\u0010<\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d\u0012\u0004\u0012\u00020;0*2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020;0*¢\u0006\u0004\b>\u0010?J#\u0010B\u001a\u00020\n2\u0006\u00104\u001a\u0002032\f\u0010A\u001a\b\u0012\u0004\u0012\u00020@0\b¢\u0006\u0004\bB\u0010CJI\u0010H\u001a\u00020\n2\u0014\u0010E\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0006\u0012\u0004\u0018\u00010\u001b0D2\u0016\u0010F\u001a\u0012\u0012\u0004\u0012\u00020\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d0D2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020@0\b¢\u0006\u0004\bH\u0010IJs\u0010J\u001a\u00020\u00192\u0016\u0010<\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d\u0012\u0004\u0012\u00020;0*2\u0012\u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020;0*2\u0012\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001b0D2\u0016\u0010F\u001a\u0012\u0012\u0004\u0012\u00020\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d0D2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020@0\b¢\u0006\u0004\bJ\u0010KJ-\u0010L\u001a\u00020\n2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\b2\u0010\u0010\u001e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d0\b¢\u0006\u0004\bL\u0010MR&\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00060N8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010O\u0012\u0004\bR\u0010\u0003\u001a\u0004\bP\u0010QR&\u0010U\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00140D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010TR&\u0010V\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00140D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010T¨\u0006W"}, d2 = {"Lf/l;", "", "<init>", "()V", "Lv/x3$b;", "captureType", "", "streamUseCase", "", "streamSharingTypes", "", "h", "(Lv/x3$b;JLjava/util/List;)Z", "Lv/p1;", "oldImplementationOptions", "g", "(Lv/p1;Ljava/lang/Long;)Lv/p1;", "config", "k", "(Lv/p1;Lv/x3$b;)Z", "", "availableStreamUseCasesSet", "streamUseCases", "b", "(Ljava/util/Set;Ljava/util/Set;)Z", "Loq/i0;", "p", "Lv/g;", "attachedSurfaces", "Lv/w3;", "newUseCaseConfigs", "availableStreamUseCases", "j", "(Ljava/util/List;Ljava/util/List;Ljava/util/Set;)Z", "", "captureMode", "e", "(Lv/x3$b;I)I", "", "Lv/j3;", "sessionConfigs", "useCaseConfigs", "", "Lv/u1;", "streamUseCaseMap", "n", "(Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Map;)V", "useCaseConfig", "Le/a;", "f", "(Lv/w3;)Le/a;", "Lh/x;", "cameraMetadata", "i", "(Lh/x;)Z", "LPRN/v0$d;", "featureSettings", "o", "(LPRN/v0$d;)Z", "Lv/n3;", "suggestedStreamSpecMap", "attachedSurfaceStreamSpecMap", "l", "(Lh/x;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)Z", "Lv/q3;", "surfaceConfigs", "c", "(Lh/x;Ljava/util/List;)Z", "", "surfaceConfigIndexAttachedSurfaceInfoMap", "surfaceConfigIndexUseCaseConfigMap", "surfaceConfigsWithStreamUseCase", "a", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)Z", "m", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/List;)V", "d", "(Ljava/util/List;Ljava/util/List;)Z", "Lv/p1$a;", "Lv/p1$a;", "getSTREAM_USE_CASE_STREAM_SPEC_OPTION", "()Lv/p1$a;", "getSTREAM_USE_CASE_STREAM_SPEC_OPTION$annotations", "STREAM_USE_CASE_STREAM_SPEC_OPTION", "Ljava/util/Map;", "STREAM_USE_CASE_TO_ELIGIBLE_CAPTURE_TYPES_MAP", "STREAM_USE_CASE_TO_ELIGIBLE_STREAM_SHARING_CHILDREN_TYPES_MAP", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f54477a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final p1.a<Long> STREAM_USE_CASE_STREAM_SPEC_OPTION = p1.a.a("camera2.streamSpec.streamUseCase", Long.TYPE);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Map<Long, Set<x3.b>> STREAM_USE_CASE_TO_ELIGIBLE_CAPTURE_TYPES_MAP;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final Map<Long, Set<x3.b>> STREAM_USE_CASE_TO_ELIGIBLE_STREAM_SHARING_CHILDREN_TYPES_MAP;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f54481a;

        static {
            int[] iArr = new int[x3.b.values().length];
            try {
                iArr[x3.b.IMAGE_CAPTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x3.b.VIDEO_CAPTURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x3.b.STREAM_SHARING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x3.b.PREVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[x3.b.IMAGE_ANALYSIS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f54481a = iArr;
        }
    }

    static {
        Map mapC = v0.c();
        int i15 = Build.VERSION.SDK_INT;
        if (i15 >= 33) {
            x3.b bVar = x3.b.PREVIEW;
            x3.b bVar2 = x3.b.METERING_REPEATING;
            x3.b bVar3 = x3.b.IMAGE_ANALYSIS;
            mapC.put(4L, e1.i(bVar, bVar2, bVar3));
            mapC.put(1L, e1.i(bVar, bVar2, bVar3));
            mapC.put(2L, e1.d(x3.b.IMAGE_CAPTURE));
            mapC.put(3L, e1.d(x3.b.VIDEO_CAPTURE));
        }
        STREAM_USE_CASE_TO_ELIGIBLE_CAPTURE_TYPES_MAP = v0.b(mapC);
        Map mapC2 = v0.c();
        if (i15 >= 33) {
            x3.b bVar4 = x3.b.PREVIEW;
            x3.b bVar5 = x3.b.IMAGE_CAPTURE;
            x3.b bVar6 = x3.b.VIDEO_CAPTURE;
            mapC2.put(4L, e1.i(bVar4, bVar5, bVar6));
            mapC2.put(3L, e1.i(bVar4, bVar6));
        }
        STREAM_USE_CASE_TO_ELIGIBLE_STREAM_SHARING_CHILDREN_TYPES_MAP = v0.b(mapC2);
    }

    private l() {
    }

    private final boolean b(Set<Long> availableStreamUseCasesSet, Set<Long> streamUseCases) {
        Iterator<Long> it = streamUseCases.iterator();
        while (it.hasNext()) {
            if (!availableStreamUseCasesSet.contains(Long.valueOf(it.next().longValue()))) {
                return false;
            }
        }
        return true;
    }

    private final int e(x3.b captureType, int captureMode) {
        int i15 = a.f54481a[captureType.ordinal()];
        if (i15 != 1) {
            return (i15 == 2 || i15 == 3) ? 3 : 1;
        }
        return captureMode == 2 ? 5 : 1;
    }

    private final p1 g(p1 oldImplementationOptions, Long streamUseCase) {
        p1.a<Long> aVar = STREAM_USE_CASE_STREAM_SPEC_OPTION;
        if (oldImplementationOptions.h(aVar) && t.c(oldImplementationOptions.d(aVar), streamUseCase)) {
            return null;
        }
        u2 u2VarM0 = u2.m0(oldImplementationOptions);
        u2VarM0.m(aVar, streamUseCase);
        return new e.a(u2VarM0);
    }

    private final boolean h(x3.b captureType, long streamUseCase, List<? extends x3.b> streamSharingTypes) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        if (captureType != x3.b.STREAM_SHARING) {
            Map<Long, Set<x3.b>> map = STREAM_USE_CASE_TO_ELIGIBLE_CAPTURE_TYPES_MAP;
            return map.containsKey(Long.valueOf(streamUseCase)) && map.get(Long.valueOf(streamUseCase)).contains(captureType);
        }
        Map<Long, Set<x3.b>> map2 = STREAM_USE_CASE_TO_ELIGIBLE_STREAM_SHARING_CHILDREN_TYPES_MAP;
        if (!map2.containsKey(Long.valueOf(streamUseCase))) {
            return false;
        }
        Set<x3.b> set = map2.get(Long.valueOf(streamUseCase));
        if (streamSharingTypes.size() != set.size()) {
            return false;
        }
        Iterator<? extends x3.b> it = streamSharingTypes.iterator();
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    private final boolean j(List<? extends v.g> attachedSurfaces, List<? extends w3<?>> newUseCaseConfigs, Set<Long> availableStreamUseCases) {
        boolean z15;
        boolean z16;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<? extends v.g> it = attachedSurfaces.iterator();
        if (it.hasNext()) {
            v.g next = it.next();
            p1 p1VarF = next.f();
            p1.a<Long> aVar = e.a.X;
            if (p1VarF.h(aVar) && ((Number) next.f().d(aVar)).longValue() != 0) {
                z15 = true;
                z16 = false;
            } else {
                z16 = true;
                z15 = false;
            }
        } else {
            z15 = false;
            z16 = false;
        }
        for (w3<?> w3Var : newUseCaseConfigs) {
            p1.a<?> aVar2 = e.a.X;
            if (w3Var.h(aVar2)) {
                long jLongValue = ((Number) w3Var.d(aVar2)).longValue();
                if (jLongValue != 0) {
                    if (z16) {
                        p();
                    }
                    linkedHashSet.add(Long.valueOf(jLongValue));
                    z15 = true;
                } else if (z15) {
                    p();
                }
            } else if (z15) {
                p();
            }
            z16 = true;
        }
        return !z16 && b(availableStreamUseCases, linkedHashSet);
    }

    private final boolean k(p1 config, x3.b captureType) {
        if (((Boolean) config.f(w3.J, Boolean.FALSE)).booleanValue()) {
            return false;
        }
        p1.a<Integer> aVar = d2.S;
        return config.h(aVar) && e(captureType, ((Number) config.d(aVar)).intValue()) == 5;
    }

    private final void p() {
        throw new IllegalArgumentException("Either all use cases must have non-default stream use case assigned or none should have it");
    }

    public final boolean a(Map<Integer, ? extends v.g> surfaceConfigIndexAttachedSurfaceInfoMap, Map<Integer, ? extends w3<?>> surfaceConfigIndexUseCaseConfigMap, List<SurfaceConfig> surfaceConfigsWithStreamUseCase) {
        int size = surfaceConfigsWithStreamUseCase.size();
        for (int i15 = 0; i15 < size; i15++) {
            long value = surfaceConfigsWithStreamUseCase.get(i15).getStreamUseCase().getValue();
            if (surfaceConfigIndexAttachedSurfaceInfoMap.containsKey(Integer.valueOf(i15))) {
                v.g gVar = surfaceConfigIndexAttachedSurfaceInfoMap.get(Integer.valueOf(i15));
                if (!h(gVar.b().size() == 1 ? gVar.b().get(0) : x3.b.STREAM_SHARING, value, gVar.b())) {
                    return false;
                }
            } else {
                if (!surfaceConfigIndexUseCaseConfigMap.containsKey(Integer.valueOf(i15))) {
                    throw new AssertionError("SurfaceConfig does not map to any use case");
                }
                w3<?> w3Var = surfaceConfigIndexUseCaseConfigMap.get(Integer.valueOf(i15));
                if (!h(w3Var.W(), value, w3Var.W() == x3.b.STREAM_SHARING ? ((k0.i) w3Var).i0() : v.n())) {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean c(x cameraMetadata, List<SurfaceConfig> surfaceConfigs) {
        long[] jArr;
        if (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) cameraMetadata.J(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (long j15 : jArr) {
            hashSet.add(Long.valueOf(j15));
        }
        Iterator<SurfaceConfig> it = surfaceConfigs.iterator();
        while (it.hasNext()) {
            if (!hashSet.contains(Long.valueOf(it.next().getStreamUseCase().getValue()))) {
                return false;
            }
        }
        return true;
    }

    public final boolean d(List<? extends v.g> attachedSurfaces, List<? extends w3<?>> newUseCaseConfigs) {
        for (v.g gVar : attachedSurfaces) {
            if (k(gVar.f(), gVar.b().get(0))) {
                return true;
            }
        }
        for (w3<?> w3Var : newUseCaseConfigs) {
            if (k(w3Var, w3Var.W())) {
                return true;
            }
        }
        return false;
    }

    public final e.a f(w3<?> useCaseConfig) {
        u2 u2VarL0 = u2.l0();
        p1.a<?> aVar = e.a.X;
        if (useCaseConfig.h(aVar)) {
            u2VarL0.m(aVar, useCaseConfig.d(aVar));
        }
        p1.a<?> aVar2 = w3.J;
        if (useCaseConfig.h(aVar2)) {
            u2VarL0.m(aVar2, useCaseConfig.d(aVar2));
        }
        p1.a<?> aVar3 = d2.S;
        if (useCaseConfig.h(aVar3)) {
            u2VarL0.m(aVar3, useCaseConfig.d(aVar3));
        }
        p1.a<?> aVar4 = e2.f202557n;
        if (useCaseConfig.h(aVar4)) {
            u2VarL0.m(aVar4, useCaseConfig.d(aVar4));
        }
        return new e.a(u2VarL0);
    }

    public final boolean i(x cameraMetadata) {
        long[] jArr;
        return (Build.VERSION.SDK_INT < 33 || (jArr = (long[]) cameraMetadata.J(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES)) == null || jArr.length == 0) ? false : true;
    }

    public final boolean l(x cameraMetadata, List<? extends v.g> attachedSurfaces, Map<w3<?>, n3> suggestedStreamSpecMap, Map<v.g, n3> attachedSurfaceStreamSpecMap) {
        if (Build.VERSION.SDK_INT < 33) {
            return false;
        }
        ArrayList arrayList = new ArrayList(suggestedStreamSpecMap.keySet());
        Iterator<? extends v.g> it = attachedSurfaces.iterator();
        while (it.hasNext()) {
            if (it.next().f() == null) {
                throw new IllegalStateException("Required value was null.");
            }
        }
        Iterator<? extends w3<?>> it4 = arrayList.iterator();
        while (it4.hasNext()) {
            n3 n3Var = suggestedStreamSpecMap.get(it4.next());
            if (n3Var == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (n3Var.d() == null) {
                throw new IllegalStateException("Required value was null.");
            }
        }
        long[] jArr = (long[]) cameraMetadata.J(CameraCharacteristics.SCALER_AVAILABLE_STREAM_USE_CASES);
        if (jArr != null && jArr.length != 0) {
            HashSet hashSet = new HashSet();
            for (long j15 : jArr) {
                hashSet.add(Long.valueOf(j15));
            }
            if (j(attachedSurfaces, arrayList, hashSet)) {
                for (v.g gVar : attachedSurfaces) {
                    p1 p1VarF = gVar.f();
                    p1 p1VarG = g(p1VarF, (Long) p1VarF.d(e.a.X));
                    if (p1VarG != null) {
                        attachedSurfaceStreamSpecMap.put(gVar, gVar.l(p1VarG));
                    }
                }
                for (w3<?> w3Var : arrayList) {
                    n3 n3Var2 = suggestedStreamSpecMap.get(w3Var);
                    p1 p1VarD = n3Var2.d();
                    p1 p1VarG2 = g(p1VarD, (Long) p1VarD.d(e.a.X));
                    if (p1VarG2 != null) {
                        suggestedStreamSpecMap.put(w3Var, n3Var2.i().d(p1VarG2).a());
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void m(Map<w3<?>, n3> suggestedStreamSpecMap, Map<v.g, n3> attachedSurfaceStreamSpecMap, Map<Integer, ? extends v.g> surfaceConfigIndexAttachedSurfaceInfoMap, Map<Integer, ? extends w3<?>> surfaceConfigIndexUseCaseConfigMap, List<SurfaceConfig> surfaceConfigsWithStreamUseCase) {
        int size = surfaceConfigsWithStreamUseCase.size();
        for (int i15 = 0; i15 < size; i15++) {
            long value = surfaceConfigsWithStreamUseCase.get(i15).getStreamUseCase().getValue();
            if (surfaceConfigIndexAttachedSurfaceInfoMap.containsKey(Integer.valueOf(i15))) {
                v.g gVar = surfaceConfigIndexAttachedSurfaceInfoMap.get(Integer.valueOf(i15));
                p1 p1VarG = g(gVar.f(), Long.valueOf(value));
                if (p1VarG != null) {
                    attachedSurfaceStreamSpecMap.put(gVar, gVar.l(p1VarG));
                }
            } else {
                if (!surfaceConfigIndexUseCaseConfigMap.containsKey(Integer.valueOf(i15))) {
                    throw new AssertionError("SurfaceConfig does not map to any use case");
                }
                w3<?> w3Var = surfaceConfigIndexUseCaseConfigMap.get(Integer.valueOf(i15));
                n3 n3Var = suggestedStreamSpecMap.get(w3Var);
                p1 p1VarG2 = g(n3Var.d(), Long.valueOf(value));
                if (p1VarG2 != null) {
                    suggestedStreamSpecMap.put(w3Var, n3Var.i().d(p1VarG2).a());
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(Collection<j3> sessionConfigs, Collection<? extends w3<?>> useCaseConfigs, Map<u1, Long> streamUseCaseMap) {
        ArrayList arrayList = new ArrayList(useCaseConfigs);
        for (j3 j3Var : sessionConfigs) {
            p1 p1VarG = j3Var.g();
            p1.a<Long> aVar = STREAM_USE_CASE_STREAM_SPEC_OPTION;
            if (p1VarG.h(aVar) && j3Var.p().size() != 1) {
                e.c cVar = e.c.f45719a;
                if (o.e1.g("CXCP")) {
                    c2.e(e.c.TRUNCATED_TAG, "StreamUseCaseUtil: SessionConfig has stream use case but also contains " + j3Var.p().size() + " surfaces, abort populateSurfaceToStreamUseCaseMapping().");
                    return;
                }
                return;
            }
            if (j3Var.g().h(aVar)) {
                int i15 = 0;
                for (j3 j3Var2 : sessionConfigs) {
                    if (((w3) arrayList.get(i15)).W() == x3.b.METERING_REPEATING) {
                        i6.i.j(!j3Var2.p().isEmpty(), "MeteringRepeating should contain a surface");
                        streamUseCaseMap.put(j3Var2.p().get(0), 1L);
                    } else {
                        p1 p1VarG2 = j3Var2.g();
                        p1.a<Long> aVar2 = STREAM_USE_CASE_STREAM_SPEC_OPTION;
                        if (p1VarG2.h(aVar2) && !j3Var2.p().isEmpty()) {
                            streamUseCaseMap.put(j3Var2.p().get(0), j3Var2.g().d(aVar2));
                        }
                    }
                    i15++;
                }
                break;
            }
        }
        e.c cVar2 = e.c.f45719a;
        if (o.e1.f("CXCP")) {
            String unused = e.c.TRUNCATED_TAG;
            Objects.toString(streamUseCaseMap);
        }
    }

    public final boolean o(PRN.v0.FeatureSettings featureSettings) {
        return featureSettings.getCameraMode() == 0 && featureSettings.getRequiredMaxBitDepth() == 8 && !featureSettings.getIsHighSpeedOn();
    }
}
