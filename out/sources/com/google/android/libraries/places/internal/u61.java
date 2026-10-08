package com.google.android.libraries.places.internal;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes4.dex */
public final class u61 extends se.e {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final ImageView f33858j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final er.l f33859k;

    public u61(ImageView imageView, er.l lVar) {
        super(imageView);
        this.f33858j = imageView;
        this.f33859k = lVar;
    }

    @Override // se.e, se.a, se.h
    public final void j(Drawable drawable) {
        er.l lVar = this.f33859k;
        if (lVar != null) {
            lVar.b(this.f33858j);
        }
    }

    @Override // se.e
    public final /* bridge */ /* synthetic */ void r(Object obj) {
        final Bitmap bitmap = (Bitmap) obj;
        this.f33858j.post(new Runnable() { // from class: com.google.android.libraries.places.internal.t61
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f33757a.f33858j.setImageBitmap(bitmap);
            }
        });
    }
}
