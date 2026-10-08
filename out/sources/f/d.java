package f;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import fr.t;
import h.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import o.e1;
import o.i0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;
import pq.n;
import pq.v;
import v.w3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0001.B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JU\u0010\u000f\u001a\u00020\u00072\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010JK\u0010\u0015\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0011\u001a\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ5\u0010!\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001d\u001a\u00020\u00072\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\u0007H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020$2\u0006\u0010#\u001a\u00020\u0007H\u0002¢\u0006\u0004\b'\u0010&J-\u0010*\u001a\u00020$2\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020$2\u0006\u0010,\u001a\u00020\u00072\u0006\u0010-\u001a\u00020\u0007H\u0002¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020$¢\u0006\u0004\b0\u00101JK\u00109\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b\u0012\u0004\u0012\u00020\u0007082\f\u00104\u001a\b\u0012\u0004\u0012\u000203022\u0010\u00105\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b022\f\u00107\u001a\b\u0012\u0004\u0012\u00020602¢\u0006\u0004\b9\u0010:R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010?\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010>R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010@¨\u0006A"}, d2 = {"Lf/d;", "", "Lh/x;", "cameraMetadata", "<init>", "(Lh/x;)V", "", "Lo/i0;", "supportedDynamicRanges", "orderedExistingDynamicRanges", "orderedNewDynamicRanges", "Lv/w3;", "config", "", "outCombinedConstraints", "i", "(Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Lv/w3;Ljava/util/Set;)Lo/i0;", "requestedDynamicRange", "combinedConstraints", "", "rangeOwnerLabel", "h", "(Lo/i0;Ljava/util/Set;Ljava/util/Set;Ljava/util/Set;Ljava/lang/String;)Lo/i0;", "newDynamicRange", "La/m;", "dynamicRangesInfo", "Loq/i0;", "j", "(Ljava/util/Set;Lo/i0;La/m;)V", "rangeToMatch", "", "fullySpecifiedCandidateRanges", CryptoServicesPermission.CONSTRAINTS, "c", "(Lo/i0;Ljava/util/Collection;Ljava/util/Set;)Lo/i0;", "dynamicRange", "", "e", "(Lo/i0;)Z", "f", "rangeToResolve", "candidateRange", "b", "(Lo/i0;Lo/i0;Ljava/util/Set;)Z", "testRange", "fullySpecifiedRange", "a", "(Lo/i0;Lo/i0;)Z", "d", "()Z", "", "Lv/g;", "existingSurfaces", "newUseCaseConfigs", "", "useCasePriorityOrder", "", "g", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)Ljava/util/Map;", "Lh/x;", "getCameraMetadata", "()Lh/x;", "Z", "is10BitSupported", "La/m;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final x cameraMetadata;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean is10BitSupported;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a.m dynamicRangesInfo;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lf/d$a;", "", "<init>", "()V", "Lh/x;", "cameraMetadata", "Lo/i0;", "a", "(Lh/x;)Lo/i0;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f54464a = new a();

        private a() {
        }

        public final i0 a(x cameraMetadata) {
            Long l15 = (Long) cameraMetadata.J(CameraCharacteristics.REQUEST_RECOMMENDED_TEN_BIT_DYNAMIC_RANGE_PROFILE);
            if (l15 != null) {
                return c.f54458a.b(l15.longValue());
            }
            return null;
        }
    }

    public d(x xVar) {
        this.cameraMetadata = xVar;
        int[] iArr = (int[]) xVar.J(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        this.is10BitSupported = iArr != null ? n.d0(iArr, 18) : false;
        this.dynamicRangesInfo = a.m.INSTANCE.a(xVar);
    }

    private final boolean a(i0 testRange, i0 fullySpecifiedRange) {
        if (!fullySpecifiedRange.e()) {
            throw new IllegalStateException(("Fully specified range " + fullySpecifiedRange + " not actually fully specified.").toString());
        }
        if (testRange.b() == 2 && fullySpecifiedRange.b() == 1) {
            return false;
        }
        if (testRange.b() == 2 || testRange.b() == 0 || testRange.b() == fullySpecifiedRange.b()) {
            return testRange.a() == 0 || testRange.a() == fullySpecifiedRange.a();
        }
        return false;
    }

    private final boolean b(i0 rangeToResolve, i0 candidateRange, Set<i0> constraints) {
        if (constraints.contains(candidateRange)) {
            return a(rangeToResolve, candidateRange);
        }
        e.c cVar = e.c.f45719a;
        if (!e1.f("CXCP")) {
            return false;
        }
        String unused = e.c.TRUNCATED_TAG;
        Objects.toString(rangeToResolve);
        Objects.toString(candidateRange);
        return false;
    }

    private final i0 c(i0 rangeToMatch, Collection<i0> fullySpecifiedCandidateRanges, Set<i0> constraints) {
        if (rangeToMatch.b() == 1) {
            return null;
        }
        for (i0 i0Var : fullySpecifiedCandidateRanges) {
            int iB = i0Var.b();
            if (!i0Var.e()) {
                throw new IllegalStateException("Fully specified DynamicRange must have fully defined encoding.");
            }
            if (iB != 1 && b(rangeToMatch, i0Var, constraints)) {
                return i0Var;
            }
        }
        return null;
    }

    private final boolean e(i0 dynamicRange) {
        return t.c(dynamicRange, i0.f140010c);
    }

    private final boolean f(i0 dynamicRange) {
        if (dynamicRange.b() == 2) {
            return true;
        }
        if (dynamicRange.b() == 0 || dynamicRange.a() != 0) {
            return dynamicRange.b() == 0 && dynamicRange.a() != 0;
        }
        return true;
    }

    private final i0 h(i0 requestedDynamicRange, Set<i0> combinedConstraints, Set<i0> orderedExistingDynamicRanges, Set<i0> orderedNewDynamicRanges, String rangeOwnerLabel) {
        i0 i0VarA;
        if (requestedDynamicRange.e()) {
            if (combinedConstraints.contains(requestedDynamicRange)) {
                return requestedDynamicRange;
            }
            return null;
        }
        int iB = requestedDynamicRange.b();
        int iA = requestedDynamicRange.a();
        if (iB == 1 && iA == 0) {
            i0 i0Var = i0.f140011d;
            if (combinedConstraints.contains(i0Var)) {
                return i0Var;
            }
            return null;
        }
        i0 i0VarC = c(requestedDynamicRange, orderedExistingDynamicRanges, combinedConstraints);
        if (i0VarC != null) {
            e.c cVar = e.c.f45719a;
            if (e1.f("CXCP")) {
                String unused = e.c.TRUNCATED_TAG;
                requestedDynamicRange.toString();
                i0VarC.toString();
            }
            return i0VarC;
        }
        i0 i0VarC2 = c(requestedDynamicRange, orderedNewDynamicRanges, combinedConstraints);
        if (i0VarC2 != null) {
            e.c cVar2 = e.c.f45719a;
            if (e1.f("CXCP")) {
                String unused2 = e.c.TRUNCATED_TAG;
                requestedDynamicRange.toString();
                i0VarC2.toString();
            }
            return i0VarC2;
        }
        i0 i0Var2 = i0.f140011d;
        if (b(requestedDynamicRange, i0Var2, combinedConstraints)) {
            e.c cVar3 = e.c.f45719a;
            if (e1.f("CXCP")) {
                String unused3 = e.c.TRUNCATED_TAG;
                requestedDynamicRange.toString();
                Objects.toString(i0Var2);
            }
            return i0Var2;
        }
        if (iB == 2 && (iA == 10 || iA == 0)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            if (Build.VERSION.SDK_INT >= 33) {
                i0VarA = a.f54464a.a(this.cameraMetadata);
                if (i0VarA != null) {
                    linkedHashSet.add(i0VarA);
                }
            } else {
                i0VarA = null;
            }
            linkedHashSet.add(i0.f140013f);
            i0 i0VarC3 = c(requestedDynamicRange, linkedHashSet, combinedConstraints);
            if (i0VarC3 != null) {
                e.c cVar4 = e.c.f45719a;
                if (e1.f("CXCP")) {
                    String unused4 = e.c.TRUNCATED_TAG;
                    t.c(i0VarC3, i0VarA);
                    requestedDynamicRange.toString();
                    i0VarC3.toString();
                }
                return i0VarC3;
            }
        }
        for (i0 i0Var3 : combinedConstraints) {
            if (!i0Var3.e()) {
                throw new IllegalStateException("Candidate dynamic range must be fully specified.");
            }
            if (!t.c(i0Var3, i0.f140011d) && a(requestedDynamicRange, i0Var3)) {
                e.c cVar5 = e.c.f45719a;
                if (e1.f("CXCP")) {
                    String unused5 = e.c.TRUNCATED_TAG;
                    requestedDynamicRange.toString();
                    i0Var3.toString();
                }
                return i0Var3;
            }
        }
        return null;
    }

    private final i0 i(Set<i0> supportedDynamicRanges, Set<i0> orderedExistingDynamicRanges, Set<i0> orderedNewDynamicRanges, w3<?> config, Set<i0> outCombinedConstraints) {
        i0 i0VarJ = config.J();
        i0 i0VarH = h(i0VarJ, outCombinedConstraints, orderedExistingDynamicRanges, orderedNewDynamicRanges, config.a0());
        if (i0VarH != null) {
            j(outCombinedConstraints, i0VarH, this.dynamicRangesInfo);
            return i0VarH;
        }
        throw new IllegalArgumentException("Unable to resolve supported dynamic range. The dynamic range may not be supported on the device or may not be allowed concurrently with other attached use cases.\nUse case:\n  " + config.a0() + "\nRequested dynamic range:\n  " + i0VarJ + "\nSupported dynamic ranges:\n  " + supportedDynamicRanges + "\nConstrained set of concurrent dynamic ranges:\n  " + outCombinedConstraints);
    }

    private final void j(Set<i0> combinedConstraints, i0 newDynamicRange, a.m dynamicRangesInfo) {
        i6.i.j(!combinedConstraints.isEmpty(), "Cannot update already-empty constraints.");
        Set<i0> setA = dynamicRangesInfo.a(newDynamicRange);
        Set<i0> set = setA;
        if (set.isEmpty()) {
            return;
        }
        Set setK1 = v.k1(combinedConstraints);
        combinedConstraints.retainAll(set);
        if (combinedConstraints.isEmpty()) {
            throw new IllegalArgumentException(("Constraints of dynamic range cannot be combined with existing constraints.\nDynamic range:\n  " + newDynamicRange + "\nConstraints:\n  " + setA + "\nExisting constraints:\n  " + setK1).toString());
        }
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIs10BitSupported() {
        return this.is10BitSupported;
    }

    public final Map<w3<?>, i0> g(List<? extends v.g> existingSurfaces, List<? extends w3<?>> newUseCaseConfigs, List<Integer> useCasePriorityOrder) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<? extends v.g> it = existingSurfaces.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(it.next().d());
        }
        Set<i0> setB = this.dynamicRangesInfo.b();
        Set<i0> setJ1 = v.j1(setB);
        Iterator<i0> it4 = linkedHashSet.iterator();
        while (it4.hasNext()) {
            j(setJ1, it4.next(), this.dynamicRangesInfo);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        Iterator<Integer> it5 = useCasePriorityOrder.iterator();
        while (it5.hasNext()) {
            w3<?> w3Var = newUseCaseConfigs.get(it5.next().intValue());
            i0 i0VarJ = w3Var.J();
            if (e(i0VarJ)) {
                arrayList3.add(w3Var);
            } else if (f(i0VarJ)) {
                arrayList2.add(w3Var);
            } else {
                arrayList.add(w3Var);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ArrayList<w3<?>> arrayList4 = new ArrayList();
        arrayList4.addAll(arrayList);
        arrayList4.addAll(arrayList2);
        arrayList4.addAll(arrayList3);
        for (w3<?> w3Var2 : arrayList4) {
            i0 i0VarI = i(setB, linkedHashSet, linkedHashSet2, w3Var2, setJ1);
            linkedHashMap.put(w3Var2, i0VarI);
            if (!linkedHashSet.contains(i0VarI)) {
                linkedHashSet2.add(i0VarI);
            }
        }
        return linkedHashMap;
    }
}
