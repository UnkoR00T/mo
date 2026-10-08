package com.google.android.libraries.places.widget;

import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.internal.v41;
import com.google.android.libraries.places.widget.internal.autocomplete.ui.BaseAutocompleteImplFragment;
import ii.h;
import ii.i;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001bB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0014H\u0017¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/google/android/libraries/places/widget/PlaceAutocompleteActivity;", "Lcom/google/android/libraries/places/widget/internal/autocomplete/base/BaseAutocompleteActivity;", "Loi/b;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Loq/i0;", "onCreate", "(Landroid/os/Bundle;)V", "Lii/h;", "prediction", "Lii/i;", "sessionToken", "v", "(Lii/h;Lii/i;)V", "Lcom/google/android/gms/common/api/Status;", "errorStatus", "b", "(Lcom/google/android/gms/common/api/Status;)V", "Landroidx/fragment/app/s;", "factory", "setTestFragmentFactory", "(Landroidx/fragment/app/s;)V", "resultErrorStatus", "Lcom/google/android/gms/common/api/Status;", "O", "a", "java.com.google.android.libraries.places.widget_place_autocomplete_3p"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PlaceAutocompleteActivity extends v41 implements oi.b {
    public static final int R = 0;
    private Status L;
    public static final int P = 2;
    public static final int T = -1;

    @Override // oi.b
    public final void b(@RecentlyNonNull Status errorStatus) throws Throwable {
        if (!errorStatus.y()) {
            this.L = errorStatus;
            R0(P, errorStatus);
            return;
        }
        Status status = this.L;
        if (status == null) {
            Q0(R, null, null, errorStatus);
        } else {
            Q0(P, null, null, status);
            this.L = null;
        }
    }

    @Override // com.google.android.libraries.places.internal.v41, androidx.fragment.app.p, CON.p, s5.h, android.app.Activity
    public final void onCreate(Bundle savedInstanceState) throws Throwable {
        super.onCreate(savedInstanceState);
        BaseAutocompleteImplFragment baseAutocompleteImplFragment = this.K;
        if (baseAutocompleteImplFragment != null) {
            baseAutocompleteImplFragment.T1(this);
        }
    }

    @Override // oi.b
    public final void v(@RecentlyNonNull h prediction, @RecentlyNonNull i sessionToken) throws Throwable {
        Q0(T, prediction, sessionToken, Status.f29007f);
    }
}
