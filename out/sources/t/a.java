package t;

import androidx.camera.core.g;
import fr.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import o.j2;
import o.m1;
import o.t0;
import o.u1;
import oq.p;
import p071kotlin.Metadata;
import pq.e1;
import pq.v;
import r.ResolvedFeatureGroup;
import s.VideoStabilizationFeature;
import v.m0;
import y.z;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u001aB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u0004\u0018\u00010\n*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ?\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0007H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\u00060\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Lt/a;", "Lt/c;", "Lv/m0;", "cameraInfoInternal", "<init>", "(Lv/m0;)V", "Lq/b;", "", "Lo/j2;", "useCases", "Lt/b$d;", "d", "(Lq/b;Ljava/util/List;)Lt/b$d;", "Lo/u1;", "sessionConfig", "orderedPreferredFeatures", "", "index", "currentOptionalFeatures", "Lt/b;", "b", "(Lo/u1;Ljava/util/List;ILjava/util/List;)Lt/b;", "", "", "e", "(Ljava/util/Set;)Z", "a", "(Lo/u1;)Lt/b;", "Lv/m0;", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C4812a f186142b = new C4812a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m0 cameraInfoInternal;

    /* JADX INFO: renamed from: t.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lt/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class C4812a {
        public /* synthetic */ C4812a(k kVar) {
            this();
        }

        private C4812a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f186144a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f186145b;

        static {
            int[] iArr = new int[x.a.values().length];
            try {
                iArr[x.a.PREVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x.a.ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f186144a = iArr;
            int[] iArr2 = new int[s.b.values().length];
            try {
                iArr2[s.b.IMAGE_FORMAT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[s.b.DYNAMIC_RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[s.b.FPS_RANGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[s.b.VIDEO_STABILIZATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[s.b.RECORDING_QUALITY.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            f186145b = iArr2;
        }
    }

    public a(m0 m0Var) {
        this.cameraInfoInternal = m0Var;
    }

    private final t.b b(u1 sessionConfig, List<? extends q.b> orderedPreferredFeatures, int index, List<? extends q.b> currentOptionalFeatures) {
        if (index < orderedPreferredFeatures.size()) {
            int i15 = index + 1;
            t.b bVarB = b(sessionConfig, orderedPreferredFeatures, i15, v.M0(currentOptionalFeatures, orderedPreferredFeatures.get(index)));
            return bVarB instanceof t.b.Supported ? bVarB : b(sessionConfig, orderedPreferredFeatures, i15, currentOptionalFeatures);
        }
        Set<? extends q.b> setL = e1.l(sessionConfig.j(), currentOptionalFeatures);
        o.e1.a("DefaultFeatureGroupResolver", "getFeatureListResolvedByPriority: features = " + setL + ", useCases = " + sessionConfig.m());
        return (e(setL) && this.cameraInfoInternal.l(new ResolvedFeatureGroup(setL), sessionConfig)) ? new t.b.Supported(new ResolvedFeatureGroup(setL)) : t.b.C4813b.f186147a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ t.b c(a aVar, u1 u1Var, List list, int i15, List list2, int i16, Object obj) {
        if ((i16 & 4) != 0) {
            i15 = 0;
        }
        if ((i16 & 8) != 0) {
            list2 = v.n();
        }
        return aVar.b(u1Var, list, i15, list2);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00c6  */
    private final t.b.UseCaseMissing d(q.b bVar, List<? extends j2> list) {
        boolean z15;
        boolean z16;
        boolean z17;
        String string;
        List<? extends j2> list2 = list;
        boolean z18 = list2 instanceof Collection;
        boolean z19 = false;
        if (!z18 || !list2.isEmpty()) {
            Iterator<T> it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z15 = false;
                    break;
                }
                if (((j2) it.next()) instanceof t0) {
                    z15 = true;
                    break;
                }
            }
        } else {
            z15 = false;
            break;
        }
        if (z18 && list2.isEmpty()) {
            z16 = false;
        } else {
            Iterator<T> it4 = list2.iterator();
            while (true) {
                if (it4.hasNext()) {
                    j2 j2Var = (j2) it4.next();
                    if ((j2Var instanceof m1) || z.h(j2Var)) {
                        z16 = true;
                    }
                } else {
                    z16 = false;
                }
            }
        }
        if (z18 && list2.isEmpty()) {
            z17 = false;
        } else {
            Iterator<T> it5 = list2.iterator();
            while (true) {
                if (it5.hasNext()) {
                    j2 j2Var2 = (j2) it5.next();
                    if ((j2Var2 instanceof m1) || (j2Var2 instanceof g) || z.h(j2Var2)) {
                        z17 = true;
                    }
                } else {
                    z17 = false;
                }
            }
        }
        if (!z18 || !list2.isEmpty()) {
            Iterator<T> it6 = list2.iterator();
            while (it6.hasNext()) {
                if (z.h((j2) it6.next())) {
                    z19 = true;
                    break;
                }
            }
        }
        int i15 = b.f186145b[bVar.getFeatureTypeInternal().ordinal()];
        if (i15 == 1) {
            string = r.c.IMAGE_CAPTURE.toString();
            if (z15) {
                string = null;
            }
        } else if (i15 == 2) {
            string = r.c.PREVIEW + " or " + r.c.VIDEO_CAPTURE;
            if (z16) {
                string = null;
            }
        } else if (i15 == 3) {
            string = r.c.PREVIEW + " or " + r.c.VIDEO_CAPTURE + " or " + r.c.IMAGE_ANALYSIS;
            if (z17) {
                string = null;
            }
        } else if (i15 == 4) {
            int i16 = b.f186144a[((VideoStabilizationFeature) bVar).getVideoStabilization().ordinal()];
            if (i16 == 1) {
                string = r.c.PREVIEW + " or " + r.c.VIDEO_CAPTURE + " or " + r.c.IMAGE_ANALYSIS;
                if (z17) {
                    string = null;
                }
            } else if (i16 != 2) {
                string = null;
            } else {
                string = r.c.VIDEO_CAPTURE.toString();
                if (z19) {
                    string = null;
                }
            }
        } else {
            if (i15 != 5) {
                throw new p();
            }
            string = r.c.VIDEO_CAPTURE.toString();
            if (z19) {
                string = null;
            }
        }
        if (string != null) {
            return new t.b.UseCaseMissing(string, bVar);
        }
        return null;
    }

    private final boolean e(Set<? extends q.b> set) {
        Set<? extends q.b> set2 = set;
        ArrayList arrayList = new ArrayList(v.y(set2, 10));
        Iterator<T> it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(((q.b) it.next()).getFeatureTypeInternal());
        }
        for (s.b bVar : v.e0(arrayList)) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : set2) {
                if (((q.b) obj).getFeatureTypeInternal() == bVar) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.size() > 1) {
                return false;
            }
        }
        return true;
    }

    @Override // t.c
    public t.b a(u1 sessionConfig) {
        List<j2> listM = sessionConfig.m();
        Set<q.b> setJ = sessionConfig.j();
        List<q.b> listH = sessionConfig.h();
        if (setJ.isEmpty() && listH.isEmpty()) {
            throw new IllegalArgumentException("Must have at least one required or preferred feature");
        }
        for (j2 j2Var : listM) {
            if (r.c.INSTANCE.b(j2Var) == r.c.UNDEFINED) {
                return new t.b.UnsupportedUseCase(j2Var);
            }
        }
        Iterator<T> it = setJ.iterator();
        while (it.hasNext()) {
            t.b.UseCaseMissing useCaseMissingD = d((q.b) it.next(), listM);
            if (useCaseMissingD != null) {
                return useCaseMissingD;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listH) {
            t.b.UseCaseMissing useCaseMissingD2 = d((q.b) obj, listM);
            if (useCaseMissingD2 != null) {
                o.e1.a("DefaultFeatureGroupResolver", "resolveFeatureGroup: filtered out preferred feature due to " + useCaseMissingD2);
            } else {
                useCaseMissingD2 = null;
            }
            if (useCaseMissingD2 == null) {
                arrayList.add(obj);
            }
        }
        o.e1.a("DefaultFeatureGroupResolver", "resolveFeatureGroup: filteredPreferredFeatures = " + arrayList);
        return c(this, sessionConfig, arrayList, 0, null, 12, null);
    }
}
