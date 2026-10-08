package se;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes3.dex */
public class d extends e<Drawable> {
    public d(ImageView imageView) {
        super(imageView);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // se.e
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void r(Drawable drawable) {
        ((ImageView) this.f180990a).setImageDrawable(drawable);
    }
}
