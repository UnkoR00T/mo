package q60;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Size;
import java.util.List;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import p071kotlin.Metadata;
import pq.v;
import r60.Shader;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0015\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u000f2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001f\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b#\u0010(R\u0016\u0010+\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010/\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106¨\u00068"}, d2 = {"Lq60/d;", "Ln60/b;", "Landroid/content/Context;", "context", "Lr60/a;", "shader", "", "Landroid/graphics/Bitmap;", "listBitmap", "<init>", "(Landroid/content/Context;Lr60/a;Ljava/util/List;)V", "Ljavax/microedition/khronos/opengles/GL10;", "gl", "Ljavax/microedition/khronos/egl/EGLConfig;", "config", "Loq/i0;", "onSurfaceCreated", "(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V", "", "width", "height", "onSurfaceChanged", "(Ljavax/microedition/khronos/opengles/GL10;II)V", "onDrawFrame", "(Ljavax/microedition/khronos/opengles/GL10;)V", "", "isPreview", "a", "(Z)V", "s", "()V", "h", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Lr60/a;", "c", "()Lr60/a;", "Ljava/util/List;", "()Ljava/util/List;", "d", "Landroid/graphics/Bitmap;", "bitmap", "Lq60/b;", "e", "Lq60/b;", "drawer", "Lq60/c;", "f", "Lq60/c;", "texProgram", "Landroid/util/Size;", "g", "Landroid/util/Size;", "canvasSize", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements n60.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Shader shader;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<Bitmap> listBitmap;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Bitmap bitmap = (Bitmap) v.l0(b());

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final b drawer = new b(null, 1, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private c texProgram;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Size canvasSize;

    public d(Context context, Shader shader, List<Bitmap> list) {
        this.context = context;
        this.shader = shader;
        this.listBitmap = list;
    }

    @Override // n60.b
    public void a(boolean isPreview) {
    }

    public List<Bitmap> b() {
        return this.listBitmap;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public Shader getShader() {
        return this.shader;
    }

    @Override // n60.b
    public void h() {
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl4) {
        if (gl4 != null) {
            gl4.glClearColor(0.1f, 0.1f, 0.1f, 0.0f);
            gl4.glClear(16640);
            gl4.glEnable(2929);
            this.drawer.b(gl4, this.canvasSize);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl4, int width, int height) {
        if (gl4 != null) {
            gl4.glViewport(0, 0, width, height);
            this.canvasSize = new Size(width, height);
            b bVar = this.drawer;
            bVar.f(this.texProgram, this.bitmap, false);
            n60.a drawable2d = bVar.getDrawable2d();
            if (drawable2d != null) {
                drawable2d.b(this.canvasSize);
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl4, EGLConfig config) {
        this.texProgram = new c(getShader());
    }

    @Override // n60.b
    public void s() {
    }
}
