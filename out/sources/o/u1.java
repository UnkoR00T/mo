package o;

import android.util.Range;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import p071kotlin.Metadata;
import v.n3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001Bc\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0002\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0014J\u0013\u0010\u0017\u001a\u00020\u0012*\u00020\u0003H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0013\u0010\u001a\u001a\u00020\u0019*\u00020\u0003H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b$\u0010*\u001a\u0004\b+\u0010,R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u00028\u0006¢\u0006\f\n\u0004\b-\u0010#\u001a\u0004\b.\u0010%R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b/\u0010#\u001a\u0004\b0\u0010%R\u001a\u00104\u001a\u00020\n8\u0017X\u0096D¢\u0006\f\n\u0004\b(\u00101\u001a\u0004\b2\u00103R\u001a\u00109\u001a\u0002058\u0017X\u0096D¢\u0006\f\n\u0004\b.\u00106\u001a\u0004\b7\u00108R\u001c\u0010=\u001a\u0004\u0018\u00010:8\u0017X\u0096\u0004¢\u0006\f\n\u0004\b7\u0010;\u001a\u0004\b&\u0010<R\u001a\u0010?\u001a\u0002058\u0017X\u0096D¢\u0006\f\n\u0004\b+\u00106\u001a\u0004\b>\u00108R<\u0010D\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0@2\u0012\u0010A\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0@8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b2\u0010B\u001a\u0004\b-\u0010CR$\u0010H\u001a\u00020E2\u0006\u0010A\u001a\u00020E8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010F\u001a\u0004\b/\u0010GR\u001a\u0010I\u001a\u0002058\u0017X\u0096D¢\u0006\f\n\u0004\bI\u00106\u001a\u0004\bJ\u00108¨\u0006K"}, d2 = {"Lo/u1;", "", "", "Lo/j2;", "useCases", "Lo/k2;", "viewPort", "Lo/k;", "effects", "Landroid/util/Range;", "", "frameRateRange", "", "Lq/b;", "requiredFeatureGroup", "preferredFeatureGroup", "<init>", "(Ljava/util/List;Lo/k2;Ljava/util/List;Landroid/util/Range;Ljava/util/Set;Ljava/util/List;)V", "Loq/i0;", "s", "()V", "r", "t", "q", "(Lo/j2;)V", "", "l", "(Lo/j2;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "a", "Lo/k2;", "n", "()Lo/k2;", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "Landroid/util/Range;", "g", "()Landroid/util/Range;", "Ljava/util/Set;", "j", "()Ljava/util/Set;", "e", "h", "f", "m", "I", "k", "()I", "sessionType", "", "Z", "i", "()Z", "requireNonEmptyUseCases", "Lo/o;", "Lo/o;", "()Lo/o;", "cameraFilter", "o", "isAutoRotationEnabled", "Li6/a;", "value", "Li6/a;", "()Li6/a;", "featureSelectionListener", "Ljava/util/concurrent/Executor;", "Ljava/util/concurrent/Executor;", "()Ljava/util/concurrent/Executor;", "featureSelectionListenerExecutor", "isLegacy", "p", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final k2 viewPort;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<k> effects;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Range<Integer> frameRateRange;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Set<q.b> requiredFeatureGroup;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<q.b> preferredFeatureGroup;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<j2> useCases;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int sessionType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean requireNonEmptyUseCases;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final o cameraFilter;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean isAutoRotationEnabled;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private i6.a<Set<q.b>> featureSelectionListener;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private Executor featureSelectionListenerExecutor;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f140178a;

        static {
            int[] iArr = new int[s.b.values().length];
            try {
                iArr[s.b.DYNAMIC_RANGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s.b.FPS_RANGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s.b.VIDEO_STABILIZATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s.b.IMAGE_FORMAT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[s.b.RECORDING_QUALITY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f140178a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u1(List<? extends j2> list, k2 k2Var, List<? extends k> list2, Range<Integer> range, Set<? extends q.b> set, List<? extends q.b> list3) {
        this.viewPort = k2Var;
        this.effects = list2;
        this.frameRateRange = range;
        this.requiredFeatureGroup = set;
        this.preferredFeatureGroup = list3;
        this.useCases = pq.v.e0(list);
        this.requireNonEmptyUseCases = true;
        this.featureSelectionListener = new i6.a() { // from class: o.t1
            @Override // i6.a
            public final void accept(Object obj) {
                u1.b((Set) obj);
            }
        };
        this.featureSelectionListenerExecutor = z.a.d();
        if (i() && list.isEmpty()) {
            throw new IllegalArgumentException("SessionConfig must contain at least one UseCase.");
        }
        s();
        r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Set set) {
    }

    private final String l(j2 j2Var) {
        if (j2Var instanceof m1) {
            return "Preview";
        }
        if (j2Var instanceof t0) {
            return "ImageCapture";
        }
        if (j2Var instanceof androidx.camera.core.g) {
            return "ImageAnalysis";
        }
        return y.z.h(j2Var) ? "VideoCapture" : "UseCase";
    }

    private final void q(j2 j2Var) {
        String str;
        String str2;
        String str3;
        String strL = l(j2Var);
        s.b bVarA = r.c.INSTANCE.a(j2Var);
        if (bVarA == null) {
            return;
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("A ");
        sb5.append(bVarA.name());
        sb5.append(" value is set to ");
        sb5.append(strL);
        sb5.append(" despite using feature groups. Do not use APIs like ");
        int[] iArr = a.f140178a;
        int i15 = iArr[bVarA.ordinal()];
        if (i15 == 1) {
            str = strL + ".Builder.setDynamicRange";
        } else if (i15 == 2) {
            str = strL + ".Builder.setTargetFrameRateRange";
        } else if (i15 != 3) {
            if (i15 == 4) {
                str = strL + ".Builder.setOutputFormat";
            } else {
                if (i15 != 5) {
                    throw new oq.p();
                }
                str = "Recorder.Builder.setQualitySelector";
            }
        } else if (y.z.h(j2Var)) {
            str = strL + ".Builder.setVideoStabilizationEnabled";
        } else {
            str = strL + ".Builder.setPreviewStabilizationEnabled";
        }
        sb5.append(str);
        sb5.append(" while using feature groups. If, for example, ");
        int i16 = iArr[bVarA.ordinal()];
        if (i16 == 1) {
            str2 = "HDR";
        } else if (i16 == 2) {
            str2 = "60 FPS";
        } else if (i16 == 3) {
            str2 = "stabilization";
        } else if (i16 == 4) {
            str2 = "JPEG_R output format";
        } else {
            if (i16 != 5) {
                throw new oq.p();
            }
            str2 = "UHD recording quality";
        }
        sb5.append(str2);
        sb5.append(" is required, instead set ");
        int i17 = iArr[bVarA.ordinal()];
        if (i17 == 1) {
            str3 = "GroupableFeature.HDR_HLG10";
        } else if (i17 == 2) {
            str3 = "GroupableFeature.FPS_60";
        } else if (i17 == 3) {
            str3 = "GroupableFeature.PREVIEW_STABILIZATION";
        } else if (i17 == 4) {
            str3 = "GroupableFeature.IMAGE_ULTRA_HDR";
        } else {
            if (i17 != 5) {
                throw new oq.p();
            }
            str3 = "GroupableFeatures.UHD_RECORDING";
        }
        sb5.append(str3);
        sb5.append(" as either a required or preferred feature.");
        throw new IllegalArgumentException(sb5.toString().toString());
    }

    private final void r() {
        if (this.requiredFeatureGroup.isEmpty() && this.preferredFeatureGroup.isEmpty()) {
            return;
        }
        t();
        if (pq.v.e0(this.preferredFeatureGroup).size() != this.preferredFeatureGroup.size()) {
            throw new IllegalArgumentException(("Duplicate values in preferredFeatures(" + this.preferredFeatureGroup + ')').toString());
        }
        Set setR0 = pq.v.r0(this.requiredFeatureGroup, this.preferredFeatureGroup);
        if (!setR0.isEmpty()) {
            throw new IllegalArgumentException(("requiredFeatures and preferredFeatures have duplicate values: " + setR0).toString());
        }
        for (j2 j2Var : this.useCases) {
            if (r.c.INSTANCE.b(j2Var) == r.c.UNDEFINED) {
                throw new IllegalArgumentException((j2Var + " is not supported with feature group").toString());
            }
            q(j2Var);
        }
    }

    private final void s() {
        if (fr.t.c(this.frameRateRange, n3.f202727a)) {
            return;
        }
        Iterator<j2> it = this.useCases.iterator();
        while (it.hasNext()) {
            if (it.next().e().g0()) {
                throw new IllegalArgumentException("Can't set target frame rate on a UseCase (by Preview.Builder.setTargetFrameRate() or VideoCapture.Builder.setTargetFrameRate()) if the frame rate range has already been set in the SessionConfig.");
            }
        }
    }

    private final void t() {
        Set<q.b> set = this.requiredFeatureGroup;
        ArrayList arrayList = new ArrayList(pq.v.y(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((q.b) it.next()).getFeatureTypeInternal());
        }
        for (s.b bVar : pq.v.e0(arrayList)) {
            Set<q.b> set2 = this.requiredFeatureGroup;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : set2) {
                if (((q.b) obj).getFeatureTypeInternal() == bVar) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.size() > 1) {
                throw new IllegalArgumentException(("requiredFeatures has conflicting feature values: " + arrayList2).toString());
            }
        }
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public o getCameraFilter() {
        return this.cameraFilter;
    }

    public final List<k> d() {
        return this.effects;
    }

    public final i6.a<Set<q.b>> e() {
        return this.featureSelectionListener;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Executor getFeatureSelectionListenerExecutor() {
        return this.featureSelectionListenerExecutor;
    }

    public final Range<Integer> g() {
        return this.frameRateRange;
    }

    public final List<q.b> h() {
        return this.preferredFeatureGroup;
    }

    public boolean i() {
        throw null;
    }

    public final Set<q.b> j() {
        return this.requiredFeatureGroup;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public int getSessionType() {
        return this.sessionType;
    }

    public final List<j2> m() {
        return this.useCases;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final k2 getViewPort() {
        return this.viewPort;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public boolean getIsAutoRotationEnabled() {
        return this.isAutoRotationEnabled;
    }

    public boolean p() {
        throw null;
    }

    public String toString() {
        return "SessionConfig@" + Integer.toHexString(System.identityHashCode(this)) + " {useCases=" + this.useCases + ", frameRateRange=" + this.frameRateRange + ", requiredFeatureGroup=" + this.requiredFeatureGroup + ", preferredFeatureGroup=" + this.preferredFeatureGroup + ", effects=" + this.effects + ", viewPort=" + this.viewPort + '}';
    }

    public /* synthetic */ u1(List list, k2 k2Var, List list2, Range range, Set set, List list3, int i15, fr.k kVar) {
        this(list, (i15 & 2) != 0 ? null : k2Var, (i15 & 4) != 0 ? pq.v.n() : list2, (i15 & 8) != 0 ? n3.f202727a : range, (i15 & 16) != 0 ? pq.e1.e() : set, (i15 & 32) != 0 ? pq.v.n() : list3);
    }
}
