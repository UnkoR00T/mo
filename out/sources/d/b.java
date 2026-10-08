package d;

import android.content.Context;
import e.z0;
import p071kotlin.Metadata;
import v.i1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\fH\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010#R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010$¨\u0006%"}, d2 = {"Ld/b;", "", "Landroid/content/Context;", "context", "Lv/i1;", "cameraThreadConfig", "Lh/z;", "cameraPipe", "Le/y;", "camera2InteropCallbacks", "Lp/a;", "cameraCoordinator", "Lo/e0;", "cameraXConfig", "<init>", "(Landroid/content/Context;Lv/i1;Lh/z;Le/y;Lp/a;Lo/e0;)V", "f", "()Landroid/content/Context;", "d", "()Lv/i1;", "c", "()Lh/z;", "a", "()Le/y;", "b", "()Lp/a;", "e", "()Lo/e0;", "Le/z0;", "g", "(Landroid/content/Context;)Le/z0;", "Landroid/content/Context;", "Lv/i1;", "Lh/z;", "Le/y;", "Lp/a;", "Lo/e0;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i1 cameraThreadConfig;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h.z cameraPipe;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final e.y camera2InteropCallbacks;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p.a cameraCoordinator;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final o.e0 cameraXConfig;

    public b(Context context, i1 i1Var, h.z zVar, e.y yVar, p.a aVar, o.e0 e0Var) {
        this.context = context;
        this.cameraThreadConfig = i1Var;
        this.cameraPipe = zVar;
        this.camera2InteropCallbacks = yVar;
        this.cameraCoordinator = aVar;
        this.cameraXConfig = e0Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final e.y getCamera2InteropCallbacks() {
        return this.camera2InteropCallbacks;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final p.a getCameraCoordinator() {
        return this.cameraCoordinator;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final h.z getCameraPipe() {
        return this.cameraPipe;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final i1 getCameraThreadConfig() {
        return this.cameraThreadConfig;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final o.e0 getCameraXConfig() {
        return this.cameraXConfig;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Context getContext() {
        return this.context;
    }

    public final z0 g(Context context) {
        return z0.INSTANCE.a(context);
    }
}
