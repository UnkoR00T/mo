package com.google.android.libraries.places.internal;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class p61 extends Dialog {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Uri f33276d = Uri.parse("https://support.google.com/contributionpolicy/answer/7422880");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Uri f33277e = Uri.parse("https://support.google.com/maps/answer/3092445");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Uri f33278f = Uri.parse("https://support.google.com/maps/contact/14718793");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Uri f33279g = Uri.parse("https://policies.google.com/privacy");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Uri f33280h = Uri.parse("https://www.google.com/help/terms_maps/");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f33281a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33282b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f33283c;

    public p61(Context context, int i15, List list) {
        super(context, i15);
        this.f33281a = context;
        this.f33282b = i15;
        this.f33283c = list;
    }

    private final void f() {
        TextView textView = (TextView) findViewById(fi.e.f64067o0);
        int lineHeight = textView != null ? textView.getLineHeight() : (int) this.f33281a.getResources().getDimension(fi.c.f64033a);
        for (ImageView imageView : pq.v.s((ImageView) findViewById(fi.e.f64051g0), (ImageView) findViewById(fi.e.f64042c), (ImageView) findViewById(fi.e.f64065n0), (ImageView) findViewById(fi.e.f64061l0), (ImageView) findViewById(fi.e.f64043c0))) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            marginLayoutParams.height = lineHeight;
            marginLayoutParams.width = lineHeight;
            imageView.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(Uri uri) {
        try {
            this.f33281a.startActivity(new Intent("android.intent.action.VIEW", uri));
        } catch (ActivityNotFoundException unused) {
            new r61(this.f33281a, this.f33282b).show();
        }
    }

    @Override // android.app.Dialog
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(fi.f.f64082d);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -2);
            window.setFlags(2, 2);
            window.setDimAmount(0.6f);
        }
        setTitle(fi.h.f64096d);
        f();
        LinearLayout linearLayout = (LinearLayout) findViewById(fi.e.f64049f0);
        if (linearLayout != null) {
            x51.a(linearLayout);
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.internal.n61
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(View view) {
                    this.f33045a.g(p61.f33276d);
                }
            });
        }
        LinearLayout linearLayout2 = (LinearLayout) findViewById(fi.e.f64040b);
        if (linearLayout2 != null) {
            x51.a(linearLayout2);
            linearLayout2.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.internal.h61
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(View view) {
                    this.f32442a.g(p61.f33277e);
                }
            });
        }
        LinearLayout linearLayout3 = (LinearLayout) findViewById(fi.e.f64063m0);
        if (linearLayout3 != null) {
            x51.a(linearLayout3);
            linearLayout3.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.internal.j61
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(View view) {
                    this.f32646a.g(p61.f33280h);
                }
            });
        }
        LinearLayout linearLayout4 = (LinearLayout) findViewById(fi.e.f64059k0);
        if (linearLayout4 != null) {
            x51.a(linearLayout4);
            linearLayout4.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.internal.k61
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(View view) {
                    this.f32707a.g(p61.f33279g);
                }
            });
        }
        LinearLayout linearLayout5 = (LinearLayout) findViewById(fi.e.f64041b0);
        if (linearLayout5 != null) {
            x51.a(linearLayout5);
            linearLayout5.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.internal.l61
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(View view) {
                    this.f32794a.g(p61.f33278f);
                }
            });
        }
        ((Button) findViewById(fi.e.f64072t)).setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.internal.m61
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view) {
                this.f32923a.dismiss();
            }
        });
        for (o61 o61Var : this.f33283c) {
            o61 o61Var2 = o61.REVIEWS_ARENT_VERIFIED;
            int iOrdinal = o61Var.ordinal();
            if (iOrdinal == 0) {
                LinearLayout linearLayout6 = (LinearLayout) findViewById(fi.e.f64047e0);
                if (linearLayout6 != null) {
                    linearLayout6.setVisibility(0);
                }
            } else if (iOrdinal == 1) {
                LinearLayout linearLayout7 = (LinearLayout) findViewById(fi.e.f64038a);
                if (linearLayout7 != null) {
                    linearLayout7.setVisibility(0);
                }
            } else if (iOrdinal == 2) {
                LinearLayout linearLayout8 = (LinearLayout) findViewById(fi.e.f64045d0);
                if (linearLayout8 != null) {
                    linearLayout8.setVisibility(0);
                }
            } else {
                if (iOrdinal != 3) {
                    throw new oq.p();
                }
                LinearLayout linearLayout9 = (LinearLayout) findViewById(fi.e.f64039a0);
                if (linearLayout9 != null) {
                    linearLayout9.setVisibility(0);
                }
            }
        }
    }
}
