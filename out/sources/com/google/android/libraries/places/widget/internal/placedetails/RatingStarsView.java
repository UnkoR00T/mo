package com.google.android.libraries.places.widget.internal.placedetails;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.RecentlyNonNull;
import fi.e;
import fi.f;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0011B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lcom/google/android/libraries/places/widget/internal/placedetails/RatingStarsView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "rating", "Loq/i0;", "setRating", "(D)V", "", "Landroid/widget/ImageView;", "stars", "[Landroid/widget/ImageView;", "StarsModel", "java.com.google.android.libraries.places.widget.internal.placedetails_rating_stars_view_3p"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RatingStarsView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ImageView[] f34618a;

    public RatingStarsView(@RecentlyNonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        LayoutInflater.from(context).inflate(f.f64091m, this);
        this.f34618a = new ImageView[]{(ImageView) findViewById(e.U), (ImageView) findViewById(e.V), (ImageView) findViewById(e.W), (ImageView) findViewById(e.X), (ImageView) findViewById(e.Y)};
    }
}
