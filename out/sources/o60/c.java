package o60;

import android.graphics.Bitmap;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.util.Size;
import er.l;
import fr.k;
import fr.t;
import javax.microedition.khronos.opengles.GL10;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010$R\u0016\u0010&\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010$R\u0016\u0010(\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010$R$\u0010/\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b!\u0010,\"\u0004\b-\u0010.¨\u00060"}, d2 = {"Lo60/c;", "", "Landroid/graphics/Bitmap;", "bitmap", "<init>", "(Landroid/graphics/Bitmap;)V", "Ljavax/microedition/khronos/opengles/GL10;", "gl", "Loq/i0;", "g", "(Ljavax/microedition/khronos/opengles/GL10;Landroid/graphics/Bitmap;)V", "", "projection", "c", "(Ljavax/microedition/khronos/opengles/GL10;[F)V", "Lo60/d;", "texProgram", "", "recycle", "f", "(Lo60/d;Landroid/graphics/Bitmap;Z)V", "Landroid/util/Size;", "canvasSize", "b", "(Ljavax/microedition/khronos/opengles/GL10;Landroid/util/Size;)V", "a", "Landroid/graphics/Bitmap;", "[F", "projectionMatrix", "Landroid/util/Size;", "d", "Lo60/d;", "", "e", "Ljava/lang/Integer;", "texId", "Z", "isInitialized", "updateTexture", "h", "recycleBitmap", "Ln60/a;", "i", "Ln60/a;", "()Ln60/a;", "setDrawable2d", "(Ln60/a;)V", "drawable2d", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Bitmap bitmap;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float[] projectionMatrix;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Size canvasSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private d texProgram;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Integer texId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isInitialized;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean updateTexture;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean recycleBitmap;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private n60.a drawable2d;

    public c(Bitmap bitmap) {
        this.bitmap = bitmap;
        this.projectionMatrix = new float[16];
    }

    private final void c(GL10 gl4, final float[] projection) {
        s60.b.a("drawBitmap start");
        s60.b.h(gl4, 3042, new l() { // from class: o60.b
            @Override // er.l
            public final Object b(Object obj) {
                return c.d(this.f142522a, projection, (GL10) obj);
            }
        });
        s60.b.a("drawBitmap end");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(c cVar, float[] fArr, GL10 gl10) {
        gl10.glBlendFunc(1, 771);
        d dVar = cVar.texProgram;
        if (dVar != null) {
            cVar.drawable2d.a(dVar, fArr, null);
        }
        return i0.f148189a;
    }

    private final void g(GL10 gl4, Bitmap bitmap) {
        gl4.glActiveTexture(33984);
        gl4.glBindTexture(3553, this.texId.intValue());
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        gl4.glBindTexture(3553, 0);
    }

    public final void b(GL10 gl4, Size canvasSize) {
        if (this.isInitialized) {
            Bitmap bitmap = this.bitmap;
            if (bitmap != null && this.updateTexture) {
                g(gl4, bitmap);
                if (this.recycleBitmap) {
                    this.bitmap.recycle();
                    this.bitmap = null;
                }
                this.updateTexture = false;
            }
            if (!t.c(this.canvasSize, canvasSize)) {
                this.canvasSize = canvasSize;
                Matrix.orthoM(this.projectionMatrix, 0, 0.0f, canvasSize.getWidth(), 0.0f, canvasSize.getHeight(), -1.0f, 1.0f);
            }
            c(gl4, this.projectionMatrix);
        }
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final n60.a getDrawable2d() {
        return this.drawable2d;
    }

    public final void f(d texProgram, Bitmap bitmap, boolean recycle) {
        this.texProgram = texProgram;
        this.texId = Integer.valueOf(s60.b.d(bitmap.getWidth(), bitmap.getHeight()));
        this.drawable2d = new n60.a(new int[]{this.texId.intValue()});
        this.isInitialized = true;
        this.bitmap = bitmap;
        this.updateTexture = true;
        this.recycleBitmap = recycle;
    }

    public /* synthetic */ c(Bitmap bitmap, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : bitmap);
    }
}
