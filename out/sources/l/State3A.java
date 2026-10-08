package l;

import android.hardware.camera2.params.MeteringRectangle;
import h.m0;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: l.w, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\b\u0080\b\u0018\u00002\u00020\u0001B\u0091\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0013\u0010\u0014J\u009a\u0001\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b!\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b*\u00100R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b%\u0010/\u001a\u0004\b1\u00100R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b1\u0010/\u001a\u0004\b2\u00100R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b#\u00105R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b(\u00104\u001a\u0004\b.\u00105R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b2\u00104\u001a\u0004\b3\u00105¨\u00066"}, d2 = {"Ll/w;", "", "Lh/a;", "aeMode", "Lh/b;", "afMode", "Lh/d;", "awbMode", "Lh/m0;", "flashMode", "", "Landroid/hardware/camera2/params/MeteringRectangle;", "aeRegions", "afRegions", "awbRegions", "", "aeLock", "afLock", "awbLock", "<init>", "(Lh/a;Lh/b;Lh/d;Lh/m0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lfr/k;)V", "a", "(Lh/a;Lh/b;Lh/d;Lh/m0;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Ll/w;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lh/a;", "c", "()Lh/a;", "b", "Lh/b;", "f", "()Lh/b;", "Lh/d;", "i", "()Lh/d;", "d", "Lh/m0;", "k", "()Lh/m0;", "e", "Ljava/util/List;", "()Ljava/util/List;", "g", "j", "h", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class State3A {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final h.a aeMode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final h.b afMode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final h.d awbMode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final m0 flashMode;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<MeteringRectangle> aeRegions;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<MeteringRectangle> afRegions;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<MeteringRectangle> awbRegions;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean aeLock;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean afLock;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final Boolean awbLock;

    public /* synthetic */ State3A(h.a aVar, h.b bVar, h.d dVar, m0 m0Var, List list, List list2, List list3, Boolean bool, Boolean bool2, Boolean bool3, fr.k kVar) {
        this(aVar, bVar, dVar, m0Var, list, list2, list3, bool, bool2, bool3);
    }

    public final State3A a(h.a aeMode, h.b afMode, h.d awbMode, m0 flashMode, List<MeteringRectangle> aeRegions, List<MeteringRectangle> afRegions, List<MeteringRectangle> awbRegions, Boolean aeLock, Boolean afLock, Boolean awbLock) {
        return new State3A(aeMode, afMode, awbMode, flashMode, aeRegions, afRegions, awbRegions, aeLock, afLock, awbLock, null);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Boolean getAeLock() {
        return this.aeLock;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final h.a getAeMode() {
        return this.aeMode;
    }

    public final List<MeteringRectangle> d() {
        return this.aeRegions;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Boolean getAfLock() {
        return this.afLock;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State3A)) {
            return false;
        }
        State3A state3A = (State3A) other;
        return fr.t.c(this.aeMode, state3A.aeMode) && fr.t.c(this.afMode, state3A.afMode) && fr.t.c(this.awbMode, state3A.awbMode) && fr.t.c(this.flashMode, state3A.flashMode) && fr.t.c(this.aeRegions, state3A.aeRegions) && fr.t.c(this.afRegions, state3A.afRegions) && fr.t.c(this.awbRegions, state3A.awbRegions) && fr.t.c(this.aeLock, state3A.aeLock) && fr.t.c(this.afLock, state3A.afLock) && fr.t.c(this.awbLock, state3A.awbLock);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final h.b getAfMode() {
        return this.afMode;
    }

    public final List<MeteringRectangle> g() {
        return this.afRegions;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Boolean getAwbLock() {
        return this.awbLock;
    }

    public int hashCode() {
        h.a aVar = this.aeMode;
        int iH = (aVar == null ? 0 : h.a.h(aVar.getValue())) * 31;
        h.b bVar = this.afMode;
        int iE = (iH + (bVar == null ? 0 : h.b.e(bVar.getValue()))) * 31;
        h.d dVar = this.awbMode;
        int iE2 = (iE + (dVar == null ? 0 : h.d.e(dVar.getValue()))) * 31;
        m0 m0Var = this.flashMode;
        int iF = (iE2 + (m0Var == null ? 0 : m0.f(m0Var.getValue()))) * 31;
        List<MeteringRectangle> list = this.aeRegions;
        int iHashCode = (iF + (list == null ? 0 : list.hashCode())) * 31;
        List<MeteringRectangle> list2 = this.afRegions;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<MeteringRectangle> list3 = this.awbRegions;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool = this.aeLock;
        int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.afLock;
        int iHashCode5 = (iHashCode4 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.awbLock;
        return iHashCode5 + (bool3 != null ? bool3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final h.d getAwbMode() {
        return this.awbMode;
    }

    public final List<MeteringRectangle> j() {
        return this.awbRegions;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final m0 getFlashMode() {
        return this.flashMode;
    }

    public String toString() {
        return "State3A(aeMode=" + this.aeMode + ", afMode=" + this.afMode + ", awbMode=" + this.awbMode + ", flashMode=" + this.flashMode + ", aeRegions=" + this.aeRegions + ", afRegions=" + this.afRegions + ", awbRegions=" + this.awbRegions + ", aeLock=" + this.aeLock + ", afLock=" + this.afLock + ", awbLock=" + this.awbLock + ')';
    }

    private State3A(h.a aVar, h.b bVar, h.d dVar, m0 m0Var, List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3, Boolean bool, Boolean bool2, Boolean bool3) {
        this.aeMode = aVar;
        this.afMode = bVar;
        this.awbMode = dVar;
        this.flashMode = m0Var;
        this.aeRegions = list;
        this.afRegions = list2;
        this.awbRegions = list3;
        this.aeLock = bool;
        this.afLock = bool2;
        this.awbLock = bool3;
    }

    public /* synthetic */ State3A(h.a aVar, h.b bVar, h.d dVar, m0 m0Var, List list, List list2, List list3, Boolean bool, Boolean bool2, Boolean bool3, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : aVar, (i15 & 2) != 0 ? null : bVar, (i15 & 4) != 0 ? null : dVar, (i15 & 8) != 0 ? null : m0Var, (i15 & 16) != 0 ? null : list, (i15 & 32) != 0 ? null : list2, (i15 & 64) != 0 ? null : list3, (i15 & 128) != 0 ? null : bool, (i15 & 256) != 0 ? null : bool2, (i15 & 512) == 0 ? bool3 : null, null);
    }
}
