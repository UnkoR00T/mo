package p60;

import android.graphics.Bitmap;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.util.Size;
import er.l;
import fr.k;
import fr.t;
import java.util.List;
import javax.microedition.khronos.opengles.GL10;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dR\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010 R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\"R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010*\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010)R\u0016\u0010+\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010)R\u0016\u0010-\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010)R$\u00104\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b&\u00101\"\u0004\b2\u00103¨\u00065"}, d2 = {"Lp60/b;", "", "", "Landroid/graphics/Bitmap;", "listBitmaps", "<init>", "(Ljava/util/List;)V", "Ljavax/microedition/khronos/opengles/GL10;", "gl", "bitmap", "", "index", "Loq/i0;", "g", "(Ljavax/microedition/khronos/opengles/GL10;Landroid/graphics/Bitmap;I)V", "", "projection", "c", "(Ljavax/microedition/khronos/opengles/GL10;[F)V", "Lp60/d;", "texProgram", "listBitmap", "", "recycle", "f", "(Lp60/d;Ljava/util/List;Z)V", "Landroid/util/Size;", "canvasSize", "b", "(Ljavax/microedition/khronos/opengles/GL10;Landroid/util/Size;)V", "a", "Ljava/util/List;", "[F", "projectionMatrix", "Landroid/util/Size;", "d", "Lp60/d;", "", "e", "[I", "texIdArray", "Z", "isInitialized", "updateTexture", "h", "recycleBitmap", "Ln60/a;", "i", "Ln60/a;", "()Ln60/a;", "setDrawable2d", "(Ln60/a;)V", "drawable2d", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private List<Bitmap> listBitmaps;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float[] projectionMatrix;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Size canvasSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private d texProgram;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int[] texIdArray;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isInitialized;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean updateTexture;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean recycleBitmap;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private n60.a drawable2d;

    public b(List<Bitmap> list) {
        this.listBitmaps = list;
        this.projectionMatrix = new float[16];
    }

    private final void c(GL10 gl4, final float[] projection) {
        s60.b.a("drawBitmap start");
        s60.b.h(gl4, 3042, new l() { // from class: p60.a
            @Override // er.l
            public final Object b(Object obj) {
                return b.d(this.f153181a, projection, (GL10) obj);
            }
        });
        s60.b.a("drawBitmap end");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(b bVar, float[] fArr, GL10 gl10) {
        gl10.glBlendFunc(1, 771);
        d dVar = bVar.texProgram;
        if (dVar != null) {
            bVar.drawable2d.a(dVar, fArr, null);
        }
        return i0.f148189a;
    }

    private final void g(GL10 gl4, Bitmap bitmap, int index) {
        gl4.glActiveTexture(33984 + index);
        gl4.glBindTexture(3553, this.texIdArray[index]);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        gl4.glBindTexture(3553, 0);
    }

    public final void b(GL10 gl4, Size canvasSize) {
        if (this.isInitialized) {
            List<Bitmap> list = this.listBitmaps;
            if (list != null && this.updateTexture) {
                int size = list.size();
                for (int i15 = 0; i15 < size; i15++) {
                    g(gl4, this.listBitmaps.get(i15), i15);
                    if (this.recycleBitmap) {
                        this.listBitmaps.get(i15).recycle();
                    }
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

    public final void f(d texProgram, List<Bitmap> listBitmap, boolean recycle) {
        this.texProgram = texProgram;
        this.texIdArray = texProgram.b(listBitmap);
        this.drawable2d = new n60.a(this.texIdArray);
        this.isInitialized = true;
        this.listBitmaps = listBitmap;
        this.updateTexture = true;
        this.recycleBitmap = recycle;
    }

    public /* synthetic */ b(List list, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : list);
    }
}
