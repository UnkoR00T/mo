package com.google.android.libraries.places.widget;

import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.internal.v41;
import com.google.android.libraries.places.widget.internal.autocomplete.ui.BaseAutocompleteImplFragment;
import ii.l0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0019B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/google/android/libraries/places/widget/BasicPlaceAutocompleteActivity;", "Lcom/google/android/libraries/places/widget/internal/autocomplete/base/BaseAutocompleteActivity;", "Loi/a;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Loq/i0;", "onCreate", "(Landroid/os/Bundle;)V", "Lii/l0;", "place", "e", "(Lii/l0;)V", "Lcom/google/android/gms/common/api/Status;", "status", "b", "(Lcom/google/android/gms/common/api/Status;)V", "Landroidx/fragment/app/s;", "factory", "setTestFragmentFactory", "(Landroidx/fragment/app/s;)V", "resultErrorStatus", "Lcom/google/android/gms/common/api/Status;", "O", "a", "java.com.google.android.libraries.places.widget_basic_place_autocomplete_3p"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class BasicPlaceAutocompleteActivity extends v41 implements oi.a {
    public static final int R = 0;
    private Status L;
    public static final int P = 2;
    public static final int T = -1;

    @Override // oi.a
    public final void b(@RecentlyNonNull Status status) throws Throwable {
        if (!status.y()) {
            this.L = status;
            R0(P, status);
            return;
        }
        Status status2 = this.L;
        if (status2 == null) {
            P0(R, null, status);
        } else {
            P0(P, null, status2);
            this.L = null;
        }
    }

    @Override // oi.a
    public final void e(@RecentlyNonNull l0 place) throws Throwable {
        P0(T, place, Status.f29007f);
    }

    @Override // com.google.android.libraries.places.internal.v41, androidx.fragment.app.p, CON.p, s5.h, android.app.Activity
    public final void onCreate(Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        BaseAutocompleteImplFragment baseAutocompleteImplFragment = this.K;
        if (baseAutocompleteImplFragment != null) {
            baseAutocompleteImplFragment.S1(this);
        }
    }
}
