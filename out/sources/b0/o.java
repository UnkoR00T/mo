package b0;

import android.graphics.Rect;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import o.i0;
import o.j2;
import p071kotlin.Metadata;
import pq.v0;
import v.SurfaceConfig;
import v.SurfaceStreamSpecQueryResult;
import v.f0;
import v.k0;
import v.m0;
import v.n3;
import v.p1;
import v.w3;
import v.x3;
import y.x;
import y.z;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001 B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007JQ\u0010\u0013\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00100\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014Je\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r0\u00102\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00170\u00102\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b \u0010!Ji\u0010'\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0%2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010+¨\u0006,"}, d2 = {"Lb0/o;", "Lb0/m;", "Lv/x3;", "useCaseConfigFactory", "Lv/k0;", "cameraDeviceSurfaceManager", "<init>", "(Lv/x3;Lv/k0;)V", "", "cameraMode", "Lv/m0;", "cameraInfoInternal", "", "Lo/j2;", "attachedUseCases", "Landroid/util/Pair;", "", "Lv/n3;", "Lv/g;", "d", "(ILv/m0;Ljava/util/List;)Landroid/util/Pair;", "newUseCases", "attachedSurfaceInfoToUseCaseMap", "Lb0/f$b;", "configPairMap", "", "isFeatureComboInvocation", "findMaxSupportedFrameRate", "Lb0/l;", "e", "(ILv/m0;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;ZZ)Lb0/l;", "Loq/i0;", "a", "(Lv/k0;)V", "Lv/f0;", "cameraConfig", "sessionType", "Landroid/util/Range;", "targetFrameRate", "b", "(ILv/m0;Ljava/util/List;Ljava/util/List;Lv/f0;ILandroid/util/Range;ZZ)Lb0/l;", "c", "Lv/x3;", "Lv/k0;", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o implements m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final a f15603e = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final x3 useCaseConfigFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private k0 cameraDeviceSurfaceManager;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lb0/o$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    public o(x3 x3Var, k0 k0Var) {
        this.useCaseConfigFactory = x3Var;
        this.cameraDeviceSurfaceManager = k0Var;
    }

    private final Pair<Map<j2, n3>, Map<v.g, j2>> d(int cameraMode, m0 cameraInfoInternal, List<? extends j2> attachedUseCases) {
        ArrayList arrayList = new ArrayList();
        String strI = cameraInfoInternal.i();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (j2 j2Var : attachedUseCases) {
            n3 n3VarG = j2Var.g();
            if (n3VarG == null) {
                throw new IllegalArgumentException("Attached stream spec cannot be null for already attached use cases.");
            }
            k0 k0Var = this.cameraDeviceSurfaceManager;
            if (k0Var == null) {
                throw new IllegalStateException("Required value was null.");
            }
            int iP = j2Var.p();
            Size sizeH = j2Var.h();
            if (sizeH == null) {
                throw new IllegalArgumentException("Attached surface resolution cannot be null for already attached use cases.");
            }
            SurfaceConfig surfaceConfigD = k0Var.d(cameraMode, strI, iP, sizeH, j2Var.l().V());
            int iP2 = j2Var.p();
            Size sizeH2 = j2Var.h();
            i0 i0VarB = n3VarG.b();
            List<x3.b> listS0 = k0.g.s0(j2Var);
            p1 p1VarD = n3VarG.d();
            int iQ = j2Var.l().q(0);
            Range<Integer> rangeZ = j2Var.l().z(n3.f202727a);
            if (rangeZ == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            v.g gVarA = v.g.a(surfaceConfigD, iP2, sizeH2, i0VarB, listS0, p1VarD, iQ, rangeZ, j2Var.l().E(), j2Var.l().X(j2Var.h()));
            arrayList.add(gVarA);
            linkedHashMap2.put(gVarA, j2Var);
            linkedHashMap.put(j2Var, n3VarG);
        }
        return new Pair<>(linkedHashMap, linkedHashMap2);
    }

    private final StreamSpecQueryResult e(int cameraMode, final m0 cameraInfoInternal, List<? extends j2> newUseCases, Map<v.g, ? extends j2> attachedSurfaceInfoToUseCaseMap, final Map<j2, ? extends f.b> configPairMap, boolean isFeatureComboInvocation, boolean findMaxSupportedFrameRate) {
        int maxSupportedFrameRate;
        Rect rectK;
        String strI = cameraInfoInternal.i();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (newUseCases.isEmpty()) {
            maxSupportedFrameRate = Integer.MAX_VALUE;
        } else {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            try {
                rectK = cameraInfoInternal.k();
            } catch (NullPointerException unused) {
                rectK = null;
            }
            p pVar = new p(cameraInfoInternal, rectK != null ? x.m(rectK) : null);
            for (j2 j2Var : newUseCases) {
                f.b bVar = configPairMap.get(j2Var);
                if (bVar == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                f.b bVar2 = bVar;
                w3<?> w3VarJ = j2Var.J(cameraInfoInternal, bVar2.f15586a, bVar2.f15587b);
                linkedHashMap2.put(w3VarJ, j2Var);
                linkedHashMap3.put(w3VarJ, pVar.m(w3VarJ));
            }
            List<? extends j2> list = newUseCases;
            x.a aVarD = z.d(list, new er.l() { // from class: b0.n
                @Override // er.l
                public final Object b(Object obj) {
                    return o.f(configPairMap, cameraInfoInternal, (j2) obj);
                }
            });
            k0 k0Var = this.cameraDeviceSurfaceManager;
            if (k0Var == null) {
                throw new IllegalStateException("Required value was null.");
            }
            SurfaceStreamSpecQueryResult surfaceStreamSpecQueryResultA = k0Var.a(cameraMode, strI, new ArrayList(attachedSurfaceInfoToUseCaseMap.keySet()), linkedHashMap3, aVarD, z.b(list), isFeatureComboInvocation, findMaxSupportedFrameRate);
            Map<w3<?>, n3> mapA = surfaceStreamSpecQueryResultA.a();
            Map<v.g, n3> mapB = surfaceStreamSpecQueryResultA.b();
            maxSupportedFrameRate = surfaceStreamSpecQueryResultA.getMaxSupportedFrameRate();
            for (Map.Entry entry : linkedHashMap2.entrySet()) {
                Object value = entry.getValue();
                n3 n3Var = mapA.get(entry.getKey());
                if (n3Var == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                linkedHashMap.put(value, n3Var);
            }
            for (Map.Entry<v.g, n3> entry2 : mapB.entrySet()) {
                if (attachedSurfaceInfoToUseCaseMap.containsKey(entry2.getKey())) {
                    j2 j2Var2 = attachedSurfaceInfoToUseCaseMap.get(entry2.getKey());
                    if (j2Var2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    linkedHashMap.put(j2Var2, entry2.getValue());
                }
            }
        }
        return new StreamSpecQueryResult(linkedHashMap, maxSupportedFrameRate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w3 f(Map map, m0 m0Var, j2 j2Var) {
        Object obj = map.get(j2Var);
        if (obj == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        f.b bVar = (f.b) obj;
        return j2Var.J(m0Var, bVar.f15586a, bVar.f15587b);
    }

    @Override // b0.m
    public void a(k0 cameraDeviceSurfaceManager) {
        this.cameraDeviceSurfaceManager = cameraDeviceSurfaceManager;
    }

    @Override // b0.m
    public StreamSpecQueryResult b(int cameraMode, m0 cameraInfoInternal, List<? extends j2> newUseCases, List<? extends j2> attachedUseCases, f0 cameraConfig, int sessionType, Range<Integer> targetFrameRate, boolean isFeatureComboInvocation, boolean findMaxSupportedFrameRate) {
        Pair<Map<j2, n3>, Map<v.g, j2>> pairD = d(cameraMode, cameraInfoInternal, attachedUseCases);
        StreamSpecQueryResult streamSpecQueryResultE = e(cameraMode, cameraInfoInternal, newUseCases, (Map) pairD.second, f.M(newUseCases, cameraConfig.l(), this.useCaseConfigFactory, sessionType, targetFrameRate), isFeatureComboInvocation, findMaxSupportedFrameRate);
        return new StreamSpecQueryResult(v0.o((Map) pairD.first, streamSpecQueryResultE.b()), streamSpecQueryResultE.getMaxSupportedFrameRate());
    }
}
