package com.google.android.libraries.places.internal;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

/* JADX INFO: loaded from: classes4.dex */
public final class r61 extends Dialog {
    public r61(Context context, int i15) {
        super(context, i15);
    }

    @Override // android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(fi.f.f64083e);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setFlags(2, 2);
            window.setDimAmount(0.6f);
        }
        ((Button) findViewById(fi.e.f64078z)).setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.internal.q61
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view) {
                this.f33392a.dismiss();
            }
        });
    }
}
