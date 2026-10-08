package com.google.android.libraries.places.widget.internal.placedetails.photoviewer;

import CON.x;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import androidx.annotation.RecentlyNonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.libraries.places.internal.c61;
import com.google.android.libraries.places.internal.r61;
import fr.b0;
import fr.q0;
import io.sentry.android.core.c2;
import j6.f1;
import j6.l0;
import j6.y;
import java.util.List;
import mr.l;
import ni.n;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0003HIJB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\tJ\u000f\u0010\f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\f\u0010\u0004J\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0004J\u000f\u0010\u0010\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0004J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u0014J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u0014J\u0017\u0010\u001c\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u0014J\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\"\u0010!J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b#\u0010\u0014J\u0017\u0010%\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u001fH\u0002¢\u0006\u0004\b%\u0010&J%\u0010+\u001a\u00020\u00072\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010*\u001a\u00020\u001fH\u0002¢\u0006\u0004\b+\u0010,R\u0016\u0010.\u001a\u00020-8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b.\u0010/R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u00106\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b6\u00107R\u0016\u00109\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010<R+\u0010D\u001a\u00020\u001f2\u0006\u0010>\u001a\u00020\u001f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010&R\u0016\u0010F\u001a\u00020E8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bF\u0010G¨\u0006K"}, d2 = {"Lcom/google/android/libraries/places/widget/internal/placedetails/photoviewer/PlacesLightboxActivity;", "Landroidx/appcompat/app/c;", "Lcom/google/android/libraries/places/widget/internal/placedetails/photoviewer/PhotoViewerFragment$PhotoNavigationListener;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Loq/i0;", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "onDestroy", "finish", "onGoToPreviousImage", "onGoToNextImage", "openUserProfile", "Landroid/view/View;", "anchorView", "showPopupMenu", "(Landroid/view/View;)V", "", "uri", "openUriInBrowser", "(Ljava/lang/String;)V", "view", "adjustBottomMarginForEdgeToEdge", "adjustStartMargin", "adjustEndMargin", "Lx5/h;", "insets", "", "getStartInset", "(Lx5/h;Landroid/view/View;)I", "getEndInset", "adjustIndicatorMargins", "selectedItem", "updateUI", "(I)V", "", "Lcom/google/android/libraries/places/widget/internal/placedetails/photoviewer/PhotoPageData;", "photoPageDataList", "initialIndex", "hookupThePhotos", "(Ljava/util/List;I)V", "Landroidx/viewpager2/widget/ViewPager2;", "viewPager", "Landroidx/viewpager2/widget/ViewPager2;", "Landroid/widget/ImageView;", "userProfileImageView", "Landroid/widget/ImageView;", "Landroid/widget/TextView;", "userName", "Landroid/widget/TextView;", "pageDataList", "Ljava/util/List;", "Lcom/google/android/libraries/places/widget/internal/placedetails/AnalyticsReporter;", "analyticsReporter", "Lcom/google/android/libraries/places/widget/internal/placedetails/AnalyticsReporter;", "numberOfPhotosShownInGallery", "I", "previousPhotoIndex", "<set-?>", "themeResId$delegate", "Lir/e;", "getThemeResId", "()I", "setThemeResId", "themeResId", "Lcom/google/android/libraries/places/widget/internal/placedetails/photoviewer/PlacesLightboxActivity$ThemeDimensionHelper;", "themeDimensionHelper", "Lcom/google/android/libraries/places/widget/internal/placedetails/photoviewer/PlacesLightboxActivity$ThemeDimensionHelper;", "ParcelablePhotoPageDataList", "ThemeDimensionHelper", "Companion", "java.com.google.android.libraries.places.widget.internal.placedetails.photoviewer_ui_3p"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PlacesLightboxActivity extends androidx.appcompat.app.c implements ni.d {
    static final /* synthetic */ l[] Y = {q0.f(new b0(PlacesLightboxActivity.class, "themeResId", "getThemeResId()I", 0))};
    private ViewPager2 H;
    private ImageView I;
    private TextView K;
    private List L;
    private mi.b O;
    private int P;
    private int R = -1;
    private final ir.e T = ir.a.f96711a.a();
    private j X;

    static /* synthetic */ void U0(PlacesLightboxActivity placesLightboxActivity, View view) {
        mi.b bVar = placesLightboxActivity.O;
        if (bVar == null) {
            bVar = null;
        }
        bVar.a(placesLightboxActivity);
        placesLightboxActivity.finish();
    }

    static /* synthetic */ f1 X0(PlacesLightboxActivity placesLightboxActivity, float f15, View view, f1 f1Var) {
        x5.h hVarF = f1Var.f(f1.p.i());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginStart(g1(hVarF, view) + ((int) f15));
        view.setLayoutParams(marginLayoutParams);
        return f1Var;
    }

    static /* synthetic */ f1 Y0(PlacesLightboxActivity placesLightboxActivity, float f15, View view, f1 f1Var) {
        x5.h hVarF = f1Var.f(f1.p.i());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.setMarginEnd(f1(hVarF, view) + ((int) f15));
        view.setLayoutParams(marginLayoutParams);
        return f1Var;
    }

    static /* synthetic */ f1 Z0(PlacesLightboxActivity placesLightboxActivity, float f15, View view, f1 f1Var) {
        x5.h hVarF = f1Var.f(f1.p.i());
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = hVarF.f216814b;
        int i15 = (int) f15;
        marginLayoutParams.setMarginStart(g1(hVarF, view) + i15);
        marginLayoutParams.setMarginEnd(f1(hVarF, view) + i15);
        view.setLayoutParams(marginLayoutParams);
        return f1Var;
    }

    private final int a1() {
        return ((Number) this.T.a(this, Y[0])).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b1() {
        String strF;
        List list = this.L;
        if (list == null) {
            list = null;
        }
        ViewPager2 viewPager2 = this.H;
        ni.c cVar = (ni.c) v.o0(list, (viewPager2 != null ? viewPager2 : null).getCurrentItem());
        if (cVar == null || (strF = cVar.f()) == null) {
            return;
        }
        c1(strF);
    }

    private final void c1(String str) {
        try {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException unused) {
            new r61(this, a1()).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void d1(int i15) {
        List list = this.L;
        if (list == null) {
            list = null;
        }
        ni.c cVar = (ni.c) v.o0(list, i15);
        if (cVar != null) {
            TextView textView = this.K;
            if (textView == null) {
                textView = null;
            }
            textView.setText(cVar.d());
            com.bumptech.glide.k kVarE = com.bumptech.glide.b.u(this).t(cVar.e()).e();
            ImageView imageView = this.I;
            kVarE.K0(imageView != null ? imageView : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e1(PlacesLightboxActivity placesLightboxActivity, MenuItem menuItem) {
        String strC;
        if (menuItem.getItemId() != fi.e.Z) {
            return false;
        }
        List list = placesLightboxActivity.L;
        if (list == null) {
            list = null;
        }
        ViewPager2 viewPager2 = placesLightboxActivity.H;
        if (viewPager2 == null) {
            viewPager2 = null;
        }
        ni.c cVar = (ni.c) v.o0(list, viewPager2.getCurrentItem());
        if (cVar != null && (strC = cVar.c()) != null) {
            mi.b bVar = placesLightboxActivity.O;
            (bVar != null ? bVar : null).b(placesLightboxActivity);
            placesLightboxActivity.c1(strC);
        }
        return true;
    }

    private static final int f1(x5.h hVar, View view) {
        return view.getLayoutDirection() == 1 ? hVar.f216813a : hVar.f216815c;
    }

    private static final int g1(x5.h hVar, View view) {
        return view.getLayoutDirection() == 1 ? hVar.f216815c : hVar.f216813a;
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        mi.b bVar = this.O;
        if (bVar != null) {
            bVar.c(this, this.P);
        }
    }

    @Override // androidx.fragment.app.p, CON.p, s5.h, android.app.Activity
    protected final void onCreate(Bundle savedInstanceState) {
        RecyclerView.h adapter;
        Bundle extras = getIntent().getExtras();
        if (extras == null || !extras.containsKey("extra-theme-res-id") || !extras.containsKey("extra-photo-page-data-list") || !extras.containsKey("extra-analytics-reporter") || !extras.containsKey("extra-start-index")) {
            c2.e("PlacesLightboxActivity", "The activity was started without required extras. Finishing.");
            super.onCreate(savedInstanceState);
            finish();
            return;
        }
        this.P = savedInstanceState != null ? savedInstanceState.getInt("extra-number-of-photos-shown-in-gallery") : 0;
        this.R = savedInstanceState != null ? savedInstanceState.getInt("extra-previous-photo-index") : -1;
        this.T.b(this, Y[0], Integer.valueOf(extras.getInt("extra-theme-res-id")));
        setTheme(a1());
        super.onCreate(savedInstanceState);
        setContentView(fi.f.f64090l);
        this.X = new j(this, a1());
        androidx.appcompat.app.a aVarE0 = E0();
        if (aVarE0 != null) {
            aVarE0.k();
        }
        x.c(this, null, null, 3, null);
        this.H = (ViewPager2) findViewById(fi.e.A);
        this.I = (ImageView) findViewById(fi.e.T);
        this.K = (TextView) findViewById(fi.e.f64055i0);
        PageSelectionIndicator pageSelectionIndicator = (PageSelectionIndicator) findViewById(fi.e.f64053h0);
        View viewFindViewById = findViewById(fi.e.f64070r);
        View viewFindViewById2 = findViewById(fi.e.f64076x);
        View viewFindViewById3 = findViewById(fi.e.f64057j0);
        this.O = (mi.b) c61.a(extras, "extra-analytics-reporter", mi.b.class);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.photoviewer.i
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view) {
                PlacesLightboxActivity.U0(this.f34631a, view);
            }
        });
        viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.photoviewer.b
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view) {
                final PlacesLightboxActivity placesLightboxActivity = this.f34620a;
                PopupMenu popupMenu = new PopupMenu(placesLightboxActivity, view);
                popupMenu.getMenuInflater().inflate(fi.g.f64092a, popupMenu.getMenu());
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.photoviewer.d
                    @Override // android.widget.PopupMenu.OnMenuItemClickListener
                    public final /* synthetic */ boolean onMenuItemClick(MenuItem menuItem) {
                        return PlacesLightboxActivity.e1(placesLightboxActivity, menuItem);
                    }
                });
                popupMenu.show();
            }
        });
        viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.placedetails.photoviewer.c
            @Override // android.view.View.OnClickListener
            public final /* synthetic */ void onClick(View view) {
                this.f34621a.b1();
            }
        });
        j jVar = this.X;
        if (jVar == null) {
            jVar = null;
        }
        final float fA = jVar.a();
        l0.q0(pageSelectionIndicator, new y() { // from class: com.google.android.libraries.places.widget.internal.placedetails.photoviewer.h
            @Override // j6.y
            public final /* synthetic */ f1 b(View view, f1 f1Var) {
                PlacesLightboxActivity.Z0(this.f34629a, fA, view, f1Var);
                return f1Var;
            }
        });
        j jVar2 = this.X;
        if (jVar2 == null) {
            jVar2 = null;
        }
        final float fA2 = jVar2.a();
        l0.q0(viewFindViewById, new y() { // from class: com.google.android.libraries.places.widget.internal.placedetails.photoviewer.g
            @Override // j6.y
            public final /* synthetic */ f1 b(View view, f1 f1Var) {
                PlacesLightboxActivity.Y0(this.f34627a, fA2, view, f1Var);
                return f1Var;
            }
        });
        j jVar3 = this.X;
        if (jVar3 == null) {
            jVar3 = null;
        }
        final float fA3 = jVar3.a();
        l0.q0(viewFindViewById3, new y() { // from class: com.google.android.libraries.places.widget.internal.placedetails.photoviewer.f
            @Override // j6.y
            public final /* synthetic */ f1 b(View view, f1 f1Var) {
                PlacesLightboxActivity.X0(this.f34625a, fA3, view, f1Var);
                return f1Var;
            }
        });
        final View viewFindViewById4 = findViewById(fi.e.f64071s);
        TypedArray typedArrayObtainStyledAttributes = obtainStyledAttributes(a1(), fi.j.f64103a);
        j jVar4 = this.X;
        if (jVar4 == null) {
            jVar4 = null;
        }
        final float fB = jVar4.b();
        l0.q0(viewFindViewById4, new y() { // from class: com.google.android.libraries.places.widget.internal.placedetails.photoviewer.e
            @Override // j6.y
            public final /* synthetic */ f1 b(View view, f1 f1Var) {
                l[] lVarArr = PlacesLightboxActivity.Y;
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewFindViewById4.getLayoutParams();
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, f1Var.f(f1.p.i()).f216816d + ((int) fB));
                return f1Var;
            }
        });
        typedArrayObtainStyledAttributes.recycle();
        ViewPager2 viewPager2 = this.H;
        if (viewPager2 == null) {
            viewPager2 = null;
        }
        viewPager2.setOffscreenPageLimit(4);
        ViewPager2 viewPager3 = this.H;
        if (viewPager3 == null) {
            viewPager3 = null;
        }
        viewPager3.g(new k(this));
        ViewPager2 viewPager4 = this.H;
        if (viewPager4 == null) {
            viewPager4 = null;
        }
        viewPager4.setAdapter(new ni.l(w0(), getLifecycleRegistry()));
        int i15 = extras.getInt("extra-start-index", 0);
        int i16 = this.R;
        if (i16 != -1) {
            i15 = i16;
        }
        List listA = ((n) c61.a(extras, "extra-photo-page-data-list", n.class)).a();
        this.L = listA;
        if (listA == null) {
            listA = null;
        }
        ViewPager2 viewPager5 = (ViewPager2) findViewById(fi.e.A);
        if (viewPager5 != null && (adapter = viewPager5.getAdapter()) != null && (adapter instanceof ni.l)) {
            ni.l lVar = (ni.l) adapter;
            lVar.W(listA);
            lVar.l();
            ViewPager2 viewPager6 = this.H;
            if (viewPager6 == null) {
                viewPager6 = null;
            }
            viewPager6.j(i15, false);
            d1(i15);
        }
        ViewPager2 viewPager7 = this.H;
        if (viewPager7 == null) {
            viewPager7 = null;
        }
        mi.b bVar = this.O;
        if (bVar == null) {
            bVar = null;
        }
        RecyclerView.h adapter2 = viewPager7.getAdapter();
        Integer numValueOf = adapter2 != null ? Integer.valueOf(adapter2.g()) : null;
        if (numValueOf == null) {
            bVar.d(pageSelectionIndicator.getContext());
        } else {
            pageSelectionIndicator.removeAllViews();
            int iIntValue = numValueOf.intValue();
            for (int i17 = 0; i17 < iIntValue; i17++) {
                pageSelectionIndicator.addView(LayoutInflater.from(pageSelectionIndicator.getContext()).inflate(fi.f.f64084f, (ViewGroup) pageSelectionIndicator, false));
            }
            viewPager7.g(new a(pageSelectionIndicator));
        }
        pageSelectionIndicator.a(i15);
    }

    @Override // androidx.appcompat.app.c, androidx.fragment.app.p, android.app.Activity
    protected final void onDestroy() {
        super.onDestroy();
        ViewPager2 viewPager2 = this.H;
        if (viewPager2 != null) {
            viewPager2.setAdapter(null);
        }
    }

    @Override // CON.p, s5.h, android.app.Activity
    protected final void onSaveInstanceState(@RecentlyNonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("extra-number-of-photos-shown-in-gallery", this.P);
        outState.putInt("extra-previous-photo-index", this.R);
    }

    @Override // ni.d
    public final void zza() {
        ViewPager2 viewPager2 = this.H;
        ViewPager2 viewPager3 = viewPager2 == null ? null : viewPager2;
        if (viewPager2 == null) {
            viewPager2 = null;
        }
        viewPager3.j(Math.max(0, viewPager2.getCurrentItem() - 1), false);
    }

    @Override // ni.d
    public final void zzb() {
        ViewPager2 viewPager2 = this.H;
        if (viewPager2 == null) {
            viewPager2 = null;
        }
        List list = this.L;
        if (list == null) {
            list = null;
        }
        int size = list.size() - 1;
        ViewPager2 viewPager3 = this.H;
        viewPager2.j(Math.min(size, (viewPager3 != null ? viewPager3 : null).getCurrentItem() + 1), false);
    }
}
