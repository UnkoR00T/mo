package fa;

import ea.NavEntry;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fa.p, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001BS\b\u0000\u0012\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R#\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00060\u00038\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\u00038\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001e\u0010\u001a¨\u0006\u001f"}, d2 = {"Lfa/p;", "", "T", "", "Lea/m;", "entries", "Lfa/g;", "overlayScenes", "Lfa/h;", "currentScene", "previousScenes", "<init>", "(Ljava/util/List;Ljava/util/List;Lfa/h;Ljava/util/List;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "c", "Lfa/h;", "()Lfa/h;", "d", "navigation3-ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SceneState<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<NavEntry<T>> entries;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<g<T>> overlayScenes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final h<T> currentScene;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<h<T>> previousScenes;

    /* JADX WARN: Multi-variable type inference failed */
    public SceneState(List<NavEntry<T>> list, List<? extends g<T>> list2, h<T> hVar, List<? extends h<T>> list3) {
        this.entries = list;
        this.overlayScenes = list2;
        this.currentScene = hVar;
        this.previousScenes = list3;
    }

    public final h<T> a() {
        return this.currentScene;
    }

    public final List<NavEntry<T>> b() {
        return this.entries;
    }

    public final List<g<T>> c() {
        return this.overlayScenes;
    }

    public final List<h<T>> d() {
        return this.previousScenes;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && SceneState.class == other.getClass()) {
            SceneState sceneState = (SceneState) other;
            if (fr.t.c(this.entries, sceneState.entries) && fr.t.c(this.overlayScenes, sceneState.overlayScenes) && fr.t.c(this.currentScene, sceneState.currentScene) && fr.t.c(this.previousScenes, sceneState.previousScenes)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.entries.hashCode() * 31) + (this.overlayScenes.hashCode() * 31) + (this.currentScene.hashCode() * 31) + (this.previousScenes.hashCode() * 31);
    }

    public String toString() {
        return "SceneState(entries=" + this.entries + ", overlayScenes=" + this.overlayScenes + ", currentScene=" + this.currentScene + ", previousScenes=" + this.previousScenes + ')';
    }
}
