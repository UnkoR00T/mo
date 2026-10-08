package p114t0;

import fr.k;
import fr.t;
import java.util.Map;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: renamed from: t0.e1, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\b\u0081\b\u0018\u00002\u00020\u0001Bg\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u0018\b\u0002\u0010\u000f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b\u001b\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b%\u0010*R'\u0010\u000f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0012\u0004\u0012\u00020\u00010\u000e8\u0006¢\u0006\f\n\u0004\b!\u0010+\u001a\u0004\b\u001f\u0010,R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010-\u001a\u0004\b.\u0010/¨\u00060"}, d2 = {"Lt0/e1;", "", "Lt0/g0;", "fade", "Lt0/a1;", "slide", "Lt0/s;", "changeSize", "Lt0/q0;", "scale", "Lt0/f1;", "veil", "", "hold", "", "effectsMap", "<init>", "(Lt0/g0;Lt0/a1;Lt0/s;Lt0/q0;Lt0/f1;ZLjava/util/Map;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lt0/g0;", "c", "()Lt0/g0;", "b", "Lt0/a1;", "f", "()Lt0/a1;", "Lt0/s;", "()Lt0/s;", "d", "Lt0/q0;", "e", "()Lt0/q0;", "Z", "()Z", "Ljava/util/Map;", "()Ljava/util/Map;", "Lt0/f1;", "g", "()Lt0/f1;", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class TransitionData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Fade fade;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Slide slide;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final ChangeSize changeSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Scale scale;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean hold;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<Object, Object> effectsMap;

    public TransitionData(Fade fade, Slide slide, ChangeSize changeSize, Scale scale, f1 f1Var, boolean z15, Map<Object, Object> map) {
        this.fade = fade;
        this.slide = slide;
        this.changeSize = changeSize;
        this.scale = scale;
        this.hold = z15;
        this.effectsMap = map;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ChangeSize getChangeSize() {
        return this.changeSize;
    }

    public final Map<Object, Object> b() {
        return this.effectsMap;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Fade getFade() {
        return this.fade;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getHold() {
        return this.hold;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Scale getScale() {
        return this.scale;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransitionData)) {
            return false;
        }
        TransitionData transitionData = (TransitionData) other;
        return t.c(this.fade, transitionData.fade) && t.c(this.slide, transitionData.slide) && t.c(this.changeSize, transitionData.changeSize) && t.c(this.scale, transitionData.scale) && t.c(null, null) && this.hold == transitionData.hold && t.c(this.effectsMap, transitionData.effectsMap);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Slide getSlide() {
        return this.slide;
    }

    public final f1 g() {
        return null;
    }

    public int hashCode() {
        Fade fade = this.fade;
        int iHashCode = (fade == null ? 0 : fade.hashCode()) * 31;
        Slide slide = this.slide;
        int iHashCode2 = (iHashCode + (slide == null ? 0 : slide.hashCode())) * 31;
        ChangeSize changeSize = this.changeSize;
        int iHashCode3 = (iHashCode2 + (changeSize == null ? 0 : changeSize.hashCode())) * 31;
        Scale scale = this.scale;
        return ((((iHashCode3 + (scale != null ? scale.hashCode() : 0)) * 961) + Boolean.hashCode(this.hold)) * 31) + this.effectsMap.hashCode();
    }

    public String toString() {
        return "TransitionData(fade=" + this.fade + ", slide=" + this.slide + ", changeSize=" + this.changeSize + ", scale=" + this.scale + ", veil=" + ((Object) null) + ", hold=" + this.hold + ", effectsMap=" + this.effectsMap + ')';
    }

    public /* synthetic */ TransitionData(Fade fade, Slide slide, ChangeSize changeSize, Scale scale, f1 f1Var, boolean z15, Map map, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : fade, (i15 & 2) != 0 ? null : slide, (i15 & 4) != 0 ? null : changeSize, (i15 & 8) != 0 ? null : scale, (i15 & 16) != 0 ? null : f1Var, (i15 & 32) != 0 ? false : z15, (i15 & 64) != 0 ? v0.i() : map);
    }
}
