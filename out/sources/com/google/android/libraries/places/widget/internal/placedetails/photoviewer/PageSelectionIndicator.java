package com.google.android.libraries.places.widget.internal.placedetails.photoviewer;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.RecentlyNonNull;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0010J\u001d\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/google/android/libraries/places/widget/internal/placedetails/photoviewer/PageSelectionIndicator;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Loq/i0;", "addIndicatorView", "()V", "count", "addIndicators", "(I)V", "position", "selectIndicator", "Landroidx/viewpager2/widget/ViewPager2;", "viewpager2", "Lcom/google/android/libraries/places/widget/internal/placedetails/AnalyticsReporter;", "analyticsReporter", "setupWithViewPager2", "(Landroidx/viewpager2/widget/ViewPager2;Lcom/google/android/libraries/places/widget/internal/placedetails/AnalyticsReporter;)V", "java.com.google.android.libraries.places.widget.internal.placedetails.photoviewer_ui_3p"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PageSelectionIndicator extends LinearLayout {
    public PageSelectionIndicator(@RecentlyNonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public final void a(int i15) {
        int childCount = getChildCount();
        int i16 = 0;
        while (i16 < childCount) {
            getChildAt(i16).setSelected(i16 == i15);
            i16++;
        }
    }

    public PageSelectionIndicator(@RecentlyNonNull Context context, AttributeSet attributeSet, int i15, int i16) {
        super(context, attributeSet, i15, i16);
    }

    public /* synthetic */ PageSelectionIndicator(@RecentlyNonNull Context context, @RecentlyNonNull AttributeSet attributeSet, int i15, int i16, int i17, @RecentlyNonNull fr.k kVar) {
        this(context, (i17 & 2) != 0 ? null : attributeSet, (i17 & 4) != 0 ? 0 : i15, (i17 & 8) != 0 ? 0 : i16);
    }
}
