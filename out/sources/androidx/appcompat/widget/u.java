package androidx.appcompat.widget;

import android.R;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes.dex */
class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f9066c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ProgressBar f9067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bitmap f9068b;

    private static class a {
        public static void a(LayerDrawable layerDrawable, LayerDrawable layerDrawable2, int i15) {
            layerDrawable2.setLayerGravity(i15, layerDrawable.getLayerGravity(i15));
            layerDrawable2.setLayerWidth(i15, layerDrawable.getLayerWidth(i15));
            layerDrawable2.setLayerHeight(i15, layerDrawable.getLayerHeight(i15));
            layerDrawable2.setLayerInsetLeft(i15, layerDrawable.getLayerInsetLeft(i15));
            layerDrawable2.setLayerInsetRight(i15, layerDrawable.getLayerInsetRight(i15));
            layerDrawable2.setLayerInsetTop(i15, layerDrawable.getLayerInsetTop(i15));
            layerDrawable2.setLayerInsetBottom(i15, layerDrawable.getLayerInsetBottom(i15));
            layerDrawable2.setLayerInsetStart(i15, layerDrawable.getLayerInsetStart(i15));
            layerDrawable2.setLayerInsetEnd(i15, layerDrawable.getLayerInsetEnd(i15));
        }
    }

    u(ProgressBar progressBar) {
        this.f9067a = progressBar;
    }

    private Shape a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null);
    }

    private Drawable e(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i15 = 0; i15 < numberOfFrames; i15++) {
            Drawable drawableD = d(animationDrawable.getFrame(i15), true);
            drawableD.setLevel(10000);
            animationDrawable2.addFrame(drawableD, animationDrawable.getDuration(i15));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    Bitmap b() {
        return this.f9068b;
    }

    void c(AttributeSet attributeSet, int i15) {
        z0 z0VarV = z0.v(this.f9067a.getContext(), attributeSet, f9066c, i15, 0);
        Drawable drawableH = z0VarV.h(0);
        if (drawableH != null) {
            this.f9067a.setIndeterminateDrawable(e(drawableH));
        }
        Drawable drawableH2 = z0VarV.h(1);
        if (drawableH2 != null) {
            this.f9067a.setProgressDrawable(d(drawableH2, false));
        }
        z0VarV.x();
    }

    /* JADX WARN: Multi-variable type inference failed */
    Drawable d(Drawable drawable, boolean z15) {
        if (drawable instanceof y5.c) {
            y5.c cVar = (y5.c) drawable;
            Drawable drawableA = cVar.a();
            if (drawableA != null) {
                cVar.b(d(drawableA, z15));
                return drawable;
            }
        } else {
            if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                Drawable[] drawableArr = new Drawable[numberOfLayers];
                for (int i15 = 0; i15 < numberOfLayers; i15++) {
                    int id5 = layerDrawable.getId(i15);
                    drawableArr[i15] = d(layerDrawable.getDrawable(i15), id5 == 16908301 || id5 == 16908303);
                }
                LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
                for (int i16 = 0; i16 < numberOfLayers; i16++) {
                    layerDrawable2.setId(i16, layerDrawable.getId(i16));
                    a.a(layerDrawable, layerDrawable2, i16);
                }
                return layerDrawable2;
            }
            if (drawable instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
                Bitmap bitmap = bitmapDrawable.getBitmap();
                if (this.f9068b == null) {
                    this.f9068b = bitmap;
                }
                ShapeDrawable shapeDrawable = new ShapeDrawable(a());
                shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
                shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
                return z15 ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
            }
        }
        return drawable;
    }
}
