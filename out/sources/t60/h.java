package t60;

import android.annotation.SuppressLint;
import android.content.Context;
import android.opengl.GLSurfaceView;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lt60/h;", "Landroid/opengl/GLSurfaceView;", "Landroid/content/Context;", "context", "Ln60/b;", "renderer", "", "isTransparent", "<init>", "(Landroid/content/Context;Ln60/b;Z)V", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class h extends GLSurfaceView {
    public h(Context context, n60.b bVar, boolean z15) {
        super(context);
        setEGLContextClientVersion(3);
        if (z15) {
            setZOrderOnTop(true);
        }
        setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        getHolder().setFormat(1);
        setRenderer(bVar);
    }
}
