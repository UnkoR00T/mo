package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import ak.n0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.RecentlyNonNull;
import androidx.p016lifecycle.c0;
import androidx.p016lifecycle.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.internal.a51;
import com.google.android.libraries.places.internal.a61;
import com.google.android.libraries.places.internal.a71;
import com.google.android.libraries.places.internal.b51;
import com.google.android.libraries.places.internal.b61;
import com.google.android.libraries.places.internal.e61;
import com.google.android.libraries.places.internal.f61;
import com.google.android.libraries.places.internal.k41;
import com.google.android.libraries.places.internal.l51;
import com.google.android.libraries.places.internal.n41;
import com.google.android.libraries.places.internal.p61;
import com.google.android.libraries.places.internal.q51;
import com.google.android.libraries.places.internal.r51;
import com.google.android.libraries.places.internal.rj;
import com.google.android.libraries.places.internal.t51;
import com.google.android.libraries.places.internal.v51;
import com.google.android.libraries.places.internal.xu0;
import com.google.android.libraries.places.internal.y41;
import ii.l0;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"ValidFragment"})
public final class BaseAutocompleteImplFragment extends androidx.fragment.app.o {

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final /* synthetic */ int f34585a1 = 0;
    private final ji.n F0;
    private final y41 G0;
    private final a71 H0;
    private final xu0 I0;
    private String J0;
    private r51 K0;
    private oi.a L0;
    private oi.b M0;
    private EditText N0;
    private RecyclerView O0;
    private View P0;
    private View Q0;
    private View R0;
    private LinearLayout S0;
    private LinearLayout T0;
    private TextView U0;
    private ImageButton V0;
    private li.i W0;
    private final d X0;
    private boolean Y0;
    private final int Z0;

    /* synthetic */ BaseAutocompleteImplFragment(int i15, ji.n nVar, y41 y41Var, a71 a71Var, xu0 xu0Var, int i16, byte[] bArr) {
        this(i15, nVar, y41Var, a71Var, xu0Var, i16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public final void Z1() {
        this.Y0 = true;
        p61 p61Var = new p61(z1(), this.Z0, n0.C());
        p61Var.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.y
            @Override // android.content.DialogInterface.OnDismissListener
            public final /* synthetic */ void onDismiss(DialogInterface dialogInterface) {
                this.f34617a.Y1(dialogInterface);
            }
        });
        p61Var.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void X1(ii.h hVar, int i15) {
        try {
            this.K0.c9(hVar, i15);
        } catch (Error | RuntimeException e15) {
            n41.b(e15);
            throw e15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void W1(View view) {
        try {
            this.K0.e9();
            this.N0.requestFocus();
        } catch (Error | RuntimeException e15) {
            n41.b(e15);
            throw e15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f2, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void U1(a51 a51Var) throws Throwable {
        try {
            this.Q0.setVisibility(0);
            this.T0.setVisibility(8);
            pi.a aVar = pi.a.FULLSCREEN;
            int iG = a51Var.g() - 1;
            if (iG == 0) {
                y41 y41Var = this.G0;
                if (TextUtils.isEmpty(y41Var.f())) {
                    this.Q0.setVisibility(8);
                    this.S0.setVisibility(8);
                }
                this.N0.requestFocus();
                this.N0.setText(y41Var.f());
                EditText editText = this.N0;
                editText.setSelection(editText.getText().length());
                return;
            }
            if (iG == 1) {
                this.W0.E(null);
                this.Q0.setVisibility(8);
                this.N0.getText().clear();
                this.S0.setVisibility(8);
                return;
            }
            switch (iG) {
                case 4:
                    this.W0.E(a51Var.b());
                    this.S0.setVisibility(0);
                    return;
                case 5:
                    this.W0.E(null);
                    this.U0.setText(this.J0);
                    this.T0.setVisibility(0);
                    this.S0.setVisibility(0);
                    return;
                case 6:
                    break;
                case 7:
                    oi.a aVar2 = this.L0;
                    if (aVar2 != null) {
                        aVar2.e((l0) zj.p.q(a51Var.c()));
                    }
                    oi.b bVar = this.M0;
                    if (bVar != null) {
                        bVar.v((ii.h) zj.p.q(a51Var.d()), (ii.i) zj.p.q(a51Var.e()));
                        return;
                    }
                    return;
                case 8:
                    ii.h hVar = (ii.h) zj.p.r(a51Var.d(), "Prediction should not be null.");
                    this.N0.clearFocus();
                    EditText editText2 = this.N0;
                    d dVar = this.X0;
                    editText2.removeTextChangedListener(dVar);
                    this.N0.setText(hVar.d(null));
                    this.N0.addTextChangedListener(dVar);
                    break;
                case 9:
                    oi.a aVar3 = this.L0;
                    if (aVar3 != null) {
                        aVar3.b((Status) zj.p.q(a51Var.f()));
                    }
                    oi.b bVar2 = this.M0;
                    if (bVar2 != null) {
                        bVar2.b((Status) zj.p.q(a51Var.f()));
                    }
                    Status statusF = a51Var.f();
                    if (statusF != null && !statusF.equals(Status.f29011k)) {
                        this.U0.setText(b51.b(z1(), fi.h.f64093a));
                        this.T0.setVisibility(0);
                    }
                    this.S0.setVisibility(8);
                    return;
                default:
                    return;
            }
            this.W0.E(null);
            oi.a aVar4 = this.L0;
            if (aVar4 != null) {
                aVar4.b((Status) zj.p.q(a51Var.f()));
            }
            oi.b bVar3 = this.M0;
            if (bVar3 != null) {
                bVar3.b((Status) zj.p.q(a51Var.f()));
            }
            this.U0.setText(b51.b(z1(), fi.h.f64093a));
            this.T0.setVisibility(0);
            this.S0.setVisibility(8);
        } catch (Error e15) {
            e = e15;
            n41.b(e);
            throw e;
        } catch (RuntimeException e16) {
            e = e16;
            n41.b(e);
            throw e;
        }
    }

    @Override // androidx.fragment.app.o
    public final void N0() {
        super.N0();
        this.K0.h9();
    }

    public final void R1() {
        this.K0.j9();
    }

    @Override // androidx.fragment.app.o
    public final void S0() {
        super.S0();
        this.K0.g9();
    }

    public final void S1(@RecentlyNonNull oi.a aVar) {
        this.L0 = aVar;
    }

    @Override // androidx.fragment.app.o
    public final void T0(@RecentlyNonNull Bundle bundle) {
        super.T0(bundle);
        bundle.putBoolean("arg-show-legal-disclosures", this.Y0);
    }

    public final void T1(@RecentlyNonNull oi.b bVar) {
        this.M0 = bVar;
    }

    final /* synthetic */ void V1(View view) {
        this.K0.i9();
    }

    @Override // androidx.fragment.app.o
    public final void W0(@RecentlyNonNull final View view, Bundle bundle) throws Throwable {
        androidx.appcompat.app.a aVarE0;
        try {
            androidx.fragment.app.p pVarX1 = x1();
            Window window = pVarX1.getWindow();
            if ((pVarX1 instanceof androidx.appcompat.app.c) && (aVarE0 = ((androidx.appcompat.app.c) pVarX1).E0()) != null) {
                aVarE0.k();
            }
            int i15 = this.Z0;
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(pVarX1, i15);
            TypedValue typedValue = new TypedValue();
            if (contextThemeWrapper.getTheme().resolveAttribute(fi.a.f64024z, typedValue, true)) {
                window.setBackgroundDrawable(new ColorDrawable(typedValue.data));
            }
            this.N0 = (EditText) view.findViewById(fi.e.f64068p);
            this.O0 = (RecyclerView) view.findViewById(fi.e.f64062m);
            this.P0 = view.findViewById(fi.e.f64044d);
            this.Q0 = view.findViewById(fi.e.f64046e);
            this.R0 = view.findViewById(fi.e.f64056j);
            this.S0 = (LinearLayout) view.findViewById(fi.e.f64054i);
            this.T0 = (LinearLayout) view.findViewById(fi.e.f64058k);
            this.U0 = (TextView) view.findViewById(fi.e.f64060l);
            ImageButton imageButton = (ImageButton) view.findViewById(fi.e.f64050g);
            this.V0 = imageButton;
            imageButton.setOnClickListener(new r(this));
            this.J0 = b51.b(z1(), fi.h.f64094b);
            this.N0.addTextChangedListener(this.X0);
            this.N0.setOnFocusChangeListener(new e(null));
            pi.a aVar = pi.a.FULLSCREEN;
            y41 y41Var = this.G0;
            int iOrdinal = y41Var.b().ordinal();
            if (iOrdinal == 0) {
                view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.t
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public final /* synthetic */ WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                        int i16 = BaseAutocompleteImplFragment.f34585a1;
                        View view3 = view;
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        if (marginLayoutParams != null) {
                            marginLayoutParams.setMargins(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
                            view3.setLayoutParams(marginLayoutParams);
                        }
                        return windowInsets;
                    }
                });
            } else if (iOrdinal == 1) {
                x1().getWindow().addFlags(67108864);
                view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.u
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public final /* synthetic */ WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                        int i16 = BaseAutocompleteImplFragment.f34585a1;
                        View view3 = view;
                        view3.setPaddingRelative(view3.getPaddingStart(), windowInsets.getSystemWindowInsetTop(), view3.getPaddingEnd(), view3.getPaddingBottom());
                        return windowInsets;
                    }
                });
                this.R0.setVisibility(8);
            }
            this.P0.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.v
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(View view2) {
                    this.f34614a.V1(view2);
                }
            });
            this.Q0.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.w
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(View view2) {
                    this.f34615a.W1(view2);
                }
            });
            this.W0 = new li.i(new li.k() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.x
                @Override // li.k
                public final /* synthetic */ void a(ii.h hVar, int i16) {
                    this.f34616a.X1(hVar, i16);
                }
            }, y41Var, i15);
            this.O0.setLayoutManager(new LinearLayoutManager(z1()));
            this.O0.setItemAnimator(new li.b(T()));
            this.O0.setAdapter(this.W0);
            this.O0.n(new s(this));
            pi.c cVarO = y41Var.o();
            if (cVarO != null) {
                String f157900d = cVarO.getF157900d();
                if (f157900d == null) {
                    f157900d = b51.b(z1(), fi.h.f64095c);
                }
                this.N0.setHint(f157900d);
                String f157898b = cVarO.getF157898b();
                if (f157898b != null) {
                    this.J0 = f157898b;
                }
            }
            Context contextZ = z();
            if (contextZ != null) {
                b61 b61Var = b61.WHITE;
                int iA = a61.a(contextZ, i15);
                ((ImageView) A1().findViewById(fi.e.f64052h)).setColorFilter(iA);
                ((ImageButton) A1().findViewById(fi.e.f64050g)).setColorFilter(iA);
            }
            this.K0.Z8().i(d0(), new c0() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.b
                @Override // androidx.p016lifecycle.c0
                public final /* synthetic */ void a(Object obj) throws Throwable {
                    this.f34587a.U1((a51) obj);
                }
            });
            if (bundle != null) {
                boolean z15 = bundle.getBoolean("arg-show-legal-disclosures");
                this.Y0 = z15;
                if (z15) {
                    Z1();
                }
            }
            this.K0.k9();
        } catch (Error e15) {
            e = e15;
            n41.b(e);
            throw e;
        } catch (RuntimeException e16) {
            e = e16;
            n41.b(e);
            throw e;
        }
    }

    final /* synthetic */ void Y1(DialogInterface dialogInterface) {
        this.Y0 = false;
    }

    final /* synthetic */ r51 a2() {
        return this.K0;
    }

    final /* synthetic */ EditText b2() {
        return this.N0;
    }

    @Override // androidx.fragment.app.o
    public final void x0(Bundle bundle) throws Throwable {
        super.x0(bundle);
        try {
            y41 y41Var = this.G0;
            v51 v51Var = new v51(y41Var.a(), y41Var.o(), y41Var.d(), y41Var.b(), y41Var.f(), y41Var.q(), this.I0);
            rj rjVarA = f61.a(z1(), this.Z0);
            v51Var.m(new t51(rjVarA.I(), rjVarA.J(), rjVarA.K(), rjVarA.L(), rjVarA.M()));
            r51 r51Var = (r51) new w0(this, new q51(new l51(this.F0, y41Var, v51Var.p(), y41Var.a() == e61.JWT_AND_ONE_PLATFORM ? k41.PLACES_UI_KIT : k41.ONE_PLATFORM_AUTOCOMPLETE_WIDGET), v51Var, this.H0)).a(r51.class);
            this.K0 = r51Var;
            r51Var.a9(bundle);
            x1().o().f(this, new q(this, true));
        } catch (Error e15) {
            e = e15;
            Throwable th4 = e;
            n41.b(th4);
            throw th4;
        } catch (RuntimeException e16) {
            e = e16;
            Throwable th5 = e;
            n41.b(th5);
            throw th5;
        }
    }

    private BaseAutocompleteImplFragment(int i15, ji.n nVar, y41 y41Var, a71 a71Var, xu0 xu0Var, int i16) {
        super(i15);
        this.X0 = new d(this, null);
        this.Y0 = false;
        this.F0 = nVar;
        this.G0 = y41Var;
        this.H0 = a71Var;
        this.I0 = xu0Var;
        this.Z0 = i16;
    }
}
