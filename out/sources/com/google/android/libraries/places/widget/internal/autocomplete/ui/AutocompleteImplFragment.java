package com.google.android.libraries.places.widget.internal.autocomplete.ui;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.RecentlyNonNull;
import androidx.p016lifecycle.c0;
import androidx.p016lifecycle.w0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.api.Status;
import com.google.android.libraries.places.internal.a51;
import com.google.android.libraries.places.internal.a71;
import com.google.android.libraries.places.internal.b51;
import com.google.android.libraries.places.internal.c51;
import com.google.android.libraries.places.internal.k41;
import com.google.android.libraries.places.internal.l51;
import com.google.android.libraries.places.internal.n41;
import com.google.android.libraries.places.internal.q51;
import com.google.android.libraries.places.internal.r51;
import com.google.android.libraries.places.internal.v51;
import com.google.android.libraries.places.internal.xu0;
import com.google.android.libraries.places.internal.y41;
import ii.l0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes4.dex */
@SuppressLint({"ValidFragment"})
public final class AutocompleteImplFragment extends androidx.fragment.app.o {
    public static final /* synthetic */ int Z0 = 0;
    private final ji.n F0;
    private final y41 G0;
    private final a71 H0;
    private final xu0 I0;
    private r51 J0;
    private oi.a K0;
    private EditText L0;
    private RecyclerView M0;
    private View N0;
    private View O0;
    private View P0;
    private View Q0;
    private View R0;
    private View S0;
    private View T0;
    private View U0;
    private TextView V0;
    private TextView W0;
    private li.d X0;
    private final o Y0;

    /* synthetic */ AutocompleteImplFragment(int i15, ji.n nVar, y41 y41Var, a71 a71Var, xu0 xu0Var, byte[] bArr) {
        this(i15, nVar, y41Var, a71Var, xu0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void W1(View view) {
        try {
            this.J0.f9(this.L0.getText().toString(), this.L0.getSelectionEnd());
        } catch (Error | RuntimeException e15) {
            n41.b(e15);
            throw e15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void V1(ii.h hVar, int i15) {
        try {
            this.J0.c9(hVar, i15);
        } catch (Error | RuntimeException e15) {
            n41.b(e15);
            throw e15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void U1(View view) {
        try {
            this.J0.e9();
        } catch (Error | RuntimeException e15) {
            n41.b(e15);
            throw e15;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public final /* synthetic */ void S1(a51 a51Var) throws Throwable {
        try {
            this.O0.setVisibility(0);
            this.P0.setVisibility(0);
            this.Q0.setVisibility(8);
            this.R0.setVisibility(8);
            this.S0.setVisibility(0);
            this.T0.setVisibility(8);
            this.U0.setVisibility(8);
            this.V0.setVisibility(8);
            this.W0.setVisibility(8);
            pi.a aVar = pi.a.FULLSCREEN;
            switch (a51Var.g() - 1) {
                case 0:
                    y41 y41Var = this.G0;
                    if (TextUtils.isEmpty(y41Var.f())) {
                        this.O0.setVisibility(8);
                    }
                    this.L0.requestFocus();
                    this.L0.setText(y41Var.f());
                    EditText editText = this.L0;
                    editText.setSelection(editText.getText().length());
                    return;
                case 1:
                    this.X0.E(null);
                    this.O0.setVisibility(8);
                    this.L0.getText().clear();
                    return;
                case 2:
                    this.Q0.setVisibility(0);
                    return;
                case 3:
                    this.W0.setVisibility(8);
                    this.R0.setVisibility(0);
                    this.S0.setVisibility(8);
                    this.U0.setVisibility(0);
                    this.V0.setVisibility(0);
                    return;
                case 4:
                    this.X0.E(a51Var.b());
                    this.T0.setVisibility(0);
                    return;
                case 5:
                    this.X0.E(null);
                    this.S0.setVisibility(8);
                    this.U0.setVisibility(0);
                    this.W0.setVisibility(4);
                    this.V0.setText(a0(fi.h.f64097e, a51Var.a()));
                    this.V0.setVisibility(0);
                    return;
                case 6:
                    break;
                case 7:
                default:
                    this.K0.e((l0) zj.p.q(a51Var.c()));
                    return;
                case 8:
                    ii.h hVar = (ii.h) zj.p.r(a51Var.d(), "Prediction should not be null.");
                    this.L0.clearFocus();
                    EditText editText2 = this.L0;
                    o oVar = this.Y0;
                    editText2.removeTextChangedListener(oVar);
                    this.L0.setText(hVar.d(null));
                    this.L0.addTextChangedListener(oVar);
                    break;
                case 9:
                    this.K0.b((Status) zj.p.q(a51Var.f()));
                    return;
            }
            this.X0.E(null);
            this.S0.setVisibility(8);
            this.U0.setVisibility(0);
            this.W0.setVisibility(0);
            this.V0.setText(Z(fi.h.f64099g));
            this.V0.setVisibility(0);
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
    public final void C0() {
        super.C0();
        this.J0.j9();
    }

    @Override // androidx.fragment.app.o
    public final void N0() {
        super.N0();
        this.J0.h9();
    }

    public final void R1(@RecentlyNonNull oi.a aVar) {
        this.K0 = aVar;
    }

    @Override // androidx.fragment.app.o
    public final void S0() {
        super.S0();
        this.J0.g9();
    }

    final /* synthetic */ void T1(View view) {
        this.J0.i9();
    }

    @Override // androidx.fragment.app.o
    public final void W0(@RecentlyNonNull final View view, Bundle bundle) throws Throwable {
        try {
            this.L0 = (EditText) view.findViewById(fi.e.N);
            this.M0 = (RecyclerView) view.findViewById(fi.e.G);
            this.N0 = view.findViewById(fi.e.C);
            this.O0 = view.findViewById(fi.e.D);
            this.P0 = view.findViewById(fi.e.P);
            this.Q0 = view.findViewById(fi.e.L);
            this.R0 = view.findViewById(fi.e.R);
            this.S0 = view.findViewById(fi.e.H);
            this.T0 = view.findViewById(fi.e.I);
            this.U0 = view.findViewById(fi.e.M);
            this.V0 = (TextView) view.findViewById(fi.e.F);
            this.W0 = (TextView) view.findViewById(fi.e.Q);
            this.L0.addTextChangedListener(this.Y0);
            this.L0.setOnFocusChangeListener(new p(null));
            EditText editText = this.L0;
            y41 y41Var = this.G0;
            editText.setHint(TextUtils.isEmpty(y41Var.g()) ? b51.b(z1(), fi.h.f64098f) : y41Var.g());
            pi.a aVar = pi.a.FULLSCREEN;
            int iOrdinal = y41Var.b().ordinal();
            if (iOrdinal == 0) {
                view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.g
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public final /* synthetic */ WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                        int i15 = AutocompleteImplFragment.Z0;
                        View view3 = view;
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view3.getLayoutParams();
                        if (marginLayoutParams != null) {
                            marginLayoutParams.setMargins(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
                            view3.setLayoutParams(marginLayoutParams);
                        }
                        return windowInsets;
                    }
                });
                int iL = y41Var.l();
                int iM = y41Var.m();
                if (Color.alpha(iL) < 255) {
                    iL = 0;
                }
                if (iL != 0 && iM != 0) {
                    int iA = c51.a(iL, u5.a.d(z1(), fi.b.f64032h), u5.a.d(z1(), fi.b.f64030f));
                    int iA2 = c51.a(iL, u5.a.d(z1(), fi.b.f64031g), u5.a.d(z1(), fi.b.f64029e));
                    view.findViewById(fi.e.O).setBackgroundColor(iL);
                    Window window = x1().getWindow();
                    window.setStatusBarColor(iM);
                    if (c51.b(iM, -1, -16777216)) {
                        window.getDecorView().setSystemUiVisibility(PKIFailureInfo.certRevoked);
                    }
                    this.L0.setTextColor(iA);
                    this.L0.setHintTextColor(iA2);
                    c51.c((ImageView) this.N0, iA);
                    c51.c((ImageView) this.O0, iA);
                }
            } else if (iOrdinal == 1) {
                x1().getWindow().addFlags(67108864);
                view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.h
                    @Override // android.view.View.OnApplyWindowInsetsListener
                    public final /* synthetic */ WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                        int i15 = AutocompleteImplFragment.Z0;
                        View view3 = view;
                        view3.setPaddingRelative(view3.getPaddingStart(), windowInsets.getSystemWindowInsetTop(), view3.getPaddingEnd(), view3.getPaddingBottom());
                        return windowInsets;
                    }
                });
            }
            this.N0.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.i
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(View view2) {
                    this.f34598a.T1(view2);
                }
            });
            this.O0.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.j
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(View view2) {
                    this.f34599a.U1(view2);
                }
            });
            this.W0.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.l
                @Override // android.view.View.OnClickListener
                public final /* synthetic */ void onClick(View view2) {
                    this.f34601a.W1(view2);
                }
            });
            this.X0 = new li.d(new li.e() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.k
                @Override // li.e
                public final /* synthetic */ void a(ii.h hVar, int i15) {
                    this.f34600a.V1(hVar, i15);
                }
            });
            this.M0.setLayoutManager(new LinearLayoutManager(z1()));
            this.M0.setItemAnimator(new li.b(T()));
            this.M0.setAdapter(this.X0);
            this.M0.n(new f(this));
            this.J0.Z8().i(d0(), new c0() { // from class: com.google.android.libraries.places.widget.internal.autocomplete.ui.m
                @Override // androidx.p016lifecycle.c0
                public final /* synthetic */ void a(Object obj) throws Throwable {
                    this.f34602a.S1((a51) obj);
                }
            });
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

    final /* synthetic */ r51 X1() {
        return this.J0;
    }

    final /* synthetic */ EditText Y1() {
        return this.L0;
    }

    @Override // androidx.fragment.app.o
    public final void x0(Bundle bundle) {
        super.x0(bundle);
        try {
            y41 y41Var = this.G0;
            v51 v51Var = new v51(y41Var.a(), null, y41Var.d(), y41Var.b(), y41Var.f(), y41Var.q(), this.I0);
            r51 r51Var = (r51) new w0(this, new q51(new l51(this.F0, y41Var, v51Var.p(), k41.AUTOCOMPLETE_WIDGET), v51Var, this.H0)).a(r51.class);
            this.J0 = r51Var;
            r51Var.a9(bundle);
            x1().o().f(this, new a(this, true));
        } catch (Error | RuntimeException e15) {
            n41.b(e15);
            throw e15;
        }
    }

    private AutocompleteImplFragment(int i15, ji.n nVar, y41 y41Var, a71 a71Var, xu0 xu0Var) {
        super(i15);
        this.Y0 = new o(this, null);
        this.F0 = nVar;
        this.G0 = y41Var;
        this.H0 = a71Var;
        this.I0 = xu0Var;
    }
}
