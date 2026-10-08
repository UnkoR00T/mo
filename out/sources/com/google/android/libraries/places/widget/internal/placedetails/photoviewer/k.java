package com.google.android.libraries.places.widget.internal.placedetails.photoviewer;

import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends ViewPager2.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ PlacesLightboxActivity f34634a;

    k(PlacesLightboxActivity placesLightboxActivity) {
        this.f34634a = placesLightboxActivity;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.i
    public final void c(int i15) {
        PlacesLightboxActivity placesLightboxActivity = this.f34634a;
        placesLightboxActivity.d1(i15);
        if (i15 != placesLightboxActivity.R) {
            placesLightboxActivity.P++;
            placesLightboxActivity.R = i15;
        }
    }
}
