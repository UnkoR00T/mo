package p046f2;

import android.media.AudioManager;
import p071kotlin.Metadata;
import v3.a;
import v3.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lf2/uo;", "Lf2/to;", "Lv3/a;", "haptics", "Landroid/media/AudioManager;", "audioManager", "", "isTouchExplorationEnabled", "<init>", "(Lv3/a;Landroid/media/AudioManager;Z)V", "Loq/i0;", "a", "()V", "Lv3/a;", "b", "Landroid/media/AudioManager;", "c", "Z", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class uo implements to {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a haptics;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AudioManager audioManager;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isTouchExplorationEnabled;

    public uo(a aVar, AudioManager audioManager, boolean z15) {
        this.haptics = aVar;
        this.audioManager = audioManager;
        this.isTouchExplorationEnabled = z15;
    }

    @Override // p046f2.to
    public void a() {
        this.haptics.a(b.INSTANCE.g());
        if (this.isTouchExplorationEnabled) {
            return;
        }
        this.audioManager.playSoundEffect(9, 0.5f);
    }
}
