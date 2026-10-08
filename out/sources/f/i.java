package f;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;
import c.a0;
import h.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import o.e1;
import oq.t;
import oq.u;
import p071kotlin.Metadata;
import pq.n;
import pq.v;
import pq.v0;
import v.w3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00122\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0006*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00070\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ?\u0010\u0012\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0010\"\u0004\b\u0000\u0010\u00062\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u00072\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0007¢\u0006\u0004\b\u0017\u0010\tJ)\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0018\u00010\u00192\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010'\u001a\u0004\u0018\u00010\n8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b*\u0010+R!\u00100\u001a\b\u0012\u0004\u0012\u00020\n0\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b-\u0010 \u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lf/i;", "", "Lh/x;", "cameraMetadata", "<init>", "(Lh/x;)V", "T", "", "g", "(Ljava/util/List;)Ljava/util/List;", "Landroid/util/Size;", "size", "Landroid/util/Range;", "", "i", "(Landroid/util/Size;)Ljava/util/List;", "", "sizesMap", "f", "(Ljava/util/Map;)Ljava/util/Map;", "j", "(Landroid/util/Size;)I", "sizesList", "l", "surfaceSizes", "", "h", "(Ljava/util/List;)[Landroid/util/Range;", "a", "Lh/x;", "", "b", "Loq/k;", "o", "()Z", "isHighSpeedSupported", "c", "k", "()Landroid/util/Size;", "maxSize", "La/u;", "d", "m", "()La/u;", "streamConfigurationMapCompat", "e", "n", "()Ljava/util/List;", "supportedSizes", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Range<Integer> f54470g = new Range<>(120, 120);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final x cameraMetadata;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k isHighSpeedSupported = oq.l.a(new er.a() { // from class: f.e
        @Override // er.a
        public final Object a() {
            return Boolean.valueOf(i.p(this.f54465a));
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final oq.k maxSize = oq.l.a(new er.a() { // from class: f.f
        @Override // er.a
        public final Object a() {
            return i.q(this.f54466a);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final oq.k streamConfigurationMapCompat = oq.l.a(new er.a() { // from class: f.g
        @Override // er.a
        public final Object a() {
            return i.r(this.f54467a);
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final oq.k supportedSizes = oq.l.a(new er.a() { // from class: f.h
        @Override // er.a
        public final Object a() {
            return i.s(this.f54468a);
        }
    });

    /* JADX INFO: renamed from: f.i$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lf/i$a;", "", "<init>", "()V", "", "Lv/g;", "attachedSurfaces", "Lv/w3;", "newUseCaseConfigs", "", "b", "(Ljava/util/Collection;Ljava/util/Collection;)Z", "Landroid/util/Range;", "", "DEFAULT_FPS", "Landroid/util/Range;", "a", "()Landroid/util/Range;", "", "TAG", "Ljava/lang/String;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final Range<Integer> a() {
            return i.f54470g;
        }

        public final boolean b(Collection<? extends v.g> attachedSurfaces, Collection<? extends w3<?>> newUseCaseConfigs) {
            boolean z15;
            Collection<? extends v.g> collection = attachedSurfaces;
            ArrayList arrayList = new ArrayList(v.y(collection, 10));
            Iterator<T> it = collection.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((v.g) it.next()).g()));
            }
            Collection<? extends w3<?>> collection2 = newUseCaseConfigs;
            ArrayList arrayList2 = new ArrayList(v.y(collection2, 10));
            Iterator<T> it4 = collection2.iterator();
            while (true) {
                z15 = false;
                if (!it4.hasNext()) {
                    break;
                }
                arrayList2.add(Integer.valueOf(((w3) it4.next()).q(0)));
            }
            List listL0 = v.L0(arrayList, arrayList2);
            boolean z16 = listL0 instanceof Collection;
            if (!z16 || !listL0.isEmpty()) {
                Iterator it5 = listL0.iterator();
                while (it5.hasNext()) {
                    if (((Number) it5.next()).intValue() == 1) {
                        z15 = true;
                        break;
                    }
                }
            }
            if (!z15 || (z16 && listL0.isEmpty())) {
                return z15;
            }
            Iterator it6 = listL0.iterator();
            while (it6.hasNext()) {
                if (((Number) it6.next()).intValue() != 1) {
                    throw new IllegalArgumentException("All sessionTypes should be high-speed when any of them is high-speed");
                }
            }
            return z15;
        }

        private Companion() {
        }
    }

    public i(x xVar) {
        this.cameraMetadata = xVar;
    }

    private final <T> List<T> g(List<? extends List<? extends T>> list) {
        if (list.isEmpty()) {
            return v.n();
        }
        List<T> listI1 = v.i1((Collection) v.l0(list));
        Iterator<T> it = v.f0(list, 1).iterator();
        while (it.hasNext()) {
            listI1.retainAll((List) it.next());
        }
        return listI1;
    }

    private final List<Range<Integer>> i(Size size) {
        Object objB;
        List listK0;
        List<Range<Integer>> listF1;
        try {
            t.Companion companion = t.INSTANCE;
            objB = t.b(m().b(size));
        } catch (Throwable th4) {
            t.Companion companion2 = t.INSTANCE;
            objB = t.b(u.a(th4));
        }
        if (t.f(objB)) {
            objB = null;
        }
        Range[] rangeArr = (Range[]) objB;
        return (rangeArr == null || (listK0 = n.k0(rangeArr)) == null || (listF1 = v.f1(listK0)) == null) ? v.n() : listF1;
    }

    private final a.u m() {
        return (a.u) this.streamConfigurationMapCompat.getValue();
    }

    private final List<Size> n() {
        return (List) this.supportedSizes.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(i iVar) {
        int[] iArr = (int[]) iVar.cameraMetadata.J(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
        if (iArr != null) {
            for (int i15 : iArr) {
                if (i15 == 9) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Size q(i iVar) {
        List<Size> listN = iVar.n();
        if (listN.isEmpty()) {
            listN = null;
        }
        if (listN == null) {
            return null;
        }
        Iterator<T> it = listN.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            int iB = f0.d.b((Size) next);
            do {
                Object next2 = it.next();
                int iB2 = f0.d.b((Size) next2);
                if (iB < iB2) {
                    next = next2;
                    iB = iB2;
                }
            } while (it.hasNext());
        }
        return (Size) next;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a.u r(i iVar) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) iVar.cameraMetadata.J(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap != null) {
            return new a.u(streamConfigurationMap, new a0(iVar.cameraMetadata, streamConfigurationMap));
        }
        throw new IllegalArgumentException("Cannot retrieve SCALER_STREAM_CONFIGURATION_MAP");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List s(i iVar) {
        List listN1;
        Size[] sizeArrC = iVar.m().c();
        return (sizeArrC == null || (listN1 = n.n1(sizeArrC)) == null) ? v.n() : listN1;
    }

    public final <T> Map<T, List<Size>> f(Map<T, ? extends List<Size>> sizesMap) {
        List<T> listG = g(v.f1(sizesMap.values()));
        ArrayList arrayList = new ArrayList();
        for (T t15 : listG) {
            if (n().contains((Size) t15)) {
                arrayList.add(t15);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(v0.e(sizesMap.size()));
        Iterator<T> it = sizesMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            List list = (List) entry.getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                if (arrayList.contains((Size) obj)) {
                    arrayList2.add(obj);
                }
            }
            linkedHashMap.put(key, arrayList2);
        }
        return linkedHashMap;
    }

    public final Range<Integer>[] h(List<Size> surfaceSizes) {
        int size = surfaceSizes.size();
        if (1 > size || size >= 3 || v.e0(surfaceSizes).size() != 1) {
            return null;
        }
        List<Range<Integer>> listI = i(surfaceSizes.get(0));
        if (listI.isEmpty()) {
            listI = null;
        }
        if (listI == null) {
            return null;
        }
        if (surfaceSizes.size() == 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : listI) {
                Range range = (Range) obj;
                if (fr.t.c(range.getLower(), range.getUpper())) {
                    arrayList.add(obj);
                }
            }
            listI = arrayList;
        }
        return (Range[]) listI.toArray(new Range[0]);
    }

    public final int j(Size size) {
        List<Range<Integer>> listI = i(size);
        if (listI.isEmpty()) {
            listI = null;
        }
        if (listI == null) {
            e1.o("HighSpeedResolver", "No supported high speed  fps for " + size);
            return 0;
        }
        Iterator<T> it = listI.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Integer num = (Integer) ((Range) it.next()).getUpper();
        while (it.hasNext()) {
            Integer num2 = (Integer) ((Range) it.next()).getUpper();
            if (num.compareTo(num2) < 0) {
                num = num2;
            }
        }
        return num.intValue();
    }

    public final Size k() {
        return (Size) this.maxSize.getValue();
    }

    public final List<List<Size>> l(List<? extends List<Size>> sizesList) {
        if (sizesList.isEmpty()) {
            return v.n();
        }
        List<Size> listG = g(sizesList);
        ArrayList arrayList = new ArrayList(v.y(listG, 10));
        for (Size size : listG) {
            int size2 = sizesList.size();
            ArrayList arrayList2 = new ArrayList(size2);
            for (int i15 = 0; i15 < size2; i15++) {
                arrayList2.add(size);
            }
            arrayList.add(arrayList2);
        }
        return arrayList;
    }

    public final boolean o() {
        return ((Boolean) this.isHighSpeedSupported.getValue()).booleanValue();
    }
}
