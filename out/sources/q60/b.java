package q60;

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
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u000e\b\u0007\u0018\u0000 ?2\u00020\u0001:\u0001\u001bB\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ'\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001dR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001fR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010%\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010&R\u0016\u0010(\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010&R\u0016\u0010*\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010&R$\u00101\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b#\u0010.\"\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00107\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00104R\u0016\u00109\u001a\u0002028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00104R\u0016\u0010;\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010$R\u0016\u0010>\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=¨\u0006@"}, d2 = {"Lq60/b;", "", "Landroid/graphics/Bitmap;", "bitmap", "<init>", "(Landroid/graphics/Bitmap;)V", "Ljavax/microedition/khronos/opengles/GL10;", "gl", "Loq/i0;", "g", "(Ljavax/microedition/khronos/opengles/GL10;Landroid/graphics/Bitmap;)V", "", "projection", "", "distance", "c", "(Ljavax/microedition/khronos/opengles/GL10;[FF)V", "Lq60/c;", "texProgram", "", "recycle", "f", "(Lq60/c;Landroid/graphics/Bitmap;Z)V", "Landroid/util/Size;", "canvasSize", "b", "(Ljavax/microedition/khronos/opengles/GL10;Landroid/util/Size;)V", "a", "Landroid/graphics/Bitmap;", "[F", "projectionMatrix", "Landroid/util/Size;", "d", "Lq60/c;", "", "e", "I", "texId", "Z", "isInitialized", "updateTexture", "h", "recycleBitmap", "Ln60/a;", "i", "Ln60/a;", "()Ln60/a;", "setDrawable2d", "(Ln60/a;)V", "drawable2d", "", "j", "J", "timeLast", "k", "timeNow", "l", "delta", "m", "speed", "n", "F", "uTime", "o", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f164969p = 8;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final float f164970q = 6.2831855f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private Bitmap bitmap;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float[] projectionMatrix;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Size canvasSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private c texProgram;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int texId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isInitialized;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean updateTexture;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean recycleBitmap;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private n60.a drawable2d;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private long timeLast;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private long timeNow;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private long delta;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int speed;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float uTime;

    public b(Bitmap bitmap) {
        this.bitmap = bitmap;
        this.projectionMatrix = new float[16];
        this.texId = -1;
        this.timeLast = System.currentTimeMillis();
        this.speed = 1;
    }

    private final void c(GL10 gl4, final float[] projection, final float distance) {
        s60.b.a("drawBitmap start");
        s60.b.h(gl4, 3042, new l() { // from class: q60.a
            @Override // er.l
            public final Object b(Object obj) {
                return b.d(this.f164965a, projection, distance, (GL10) obj);
            }
        });
        s60.b.a("drawBitmap end");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(b bVar, float[] fArr, float f15, GL10 gl10) {
        gl10.glBlendFunc(770, 771);
        c cVar = bVar.texProgram;
        if (cVar != null) {
            bVar.drawable2d.a(cVar, fArr, Float.valueOf(f15));
        }
        return i0.f148189a;
    }

    private final void g(GL10 gl4, Bitmap bitmap) {
        gl4.glActiveTexture(33984);
        gl4.glBindTexture(3553, this.texId);
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
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.timeNow = jCurrentTimeMillis;
            long j15 = jCurrentTimeMillis - this.timeLast;
            this.delta = j15;
            this.timeLast = jCurrentTimeMillis;
            float f15 = this.uTime + ((float) (j15 * 0.001d * ((double) this.speed)));
            this.uTime = f15;
            float[] fArr = this.projectionMatrix;
            float f16 = f164970q;
            float f17 = f15 % f16;
            if (f17 != 0.0f && Math.signum(f17) != Math.signum(f16)) {
                f17 += f16;
            }
            c(gl4, fArr, f17);
        }
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final n60.a getDrawable2d() {
        return this.drawable2d;
    }

    public final void f(c texProgram, Bitmap bitmap, boolean recycle) {
        this.texProgram = texProgram;
        this.texId = texProgram.b(bitmap.getWidth(), bitmap.getHeight());
        this.drawable2d = new n60.a(new int[]{this.texId});
        this.isInitialized = true;
        this.bitmap = bitmap;
        this.updateTexture = true;
        this.recycleBitmap = recycle;
    }

    public /* synthetic */ b(Bitmap bitmap, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : bitmap);
    }
}
