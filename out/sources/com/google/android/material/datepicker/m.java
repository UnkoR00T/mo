package com.google.android.material.datepicker;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.c0;
import com.google.android.material.internal.CheckableImageButton;
import j6.f1;
import j6.l0;
import j6.y;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes4.dex */
public class m<S> extends androidx.fragment.app.n {
    private final LinkedHashSet<n<? super S>> V0 = new LinkedHashSet<>();
    private final LinkedHashSet<View.OnClickListener> W0 = new LinkedHashSet<>();
    private final LinkedHashSet<DialogInterface.OnCancelListener> X0 = new LinkedHashSet<>();
    private final LinkedHashSet<DialogInterface.OnDismissListener> Y0 = new LinkedHashSet<>();
    private int Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private d<S> f35154a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private t<S> f35155b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private com.google.android.material.datepicker.a f35156c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private g f35157d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private i<S> f35158e1;

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    private int f35159f1;

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    private CharSequence f35160g1;

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    private boolean f35161h1;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    private int f35162i1;

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    private int f35163j1;

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    private CharSequence f35164k1;

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    private int f35165l1;

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    private CharSequence f35166m1;

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    private int f35167n1;

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    private CharSequence f35168o1;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private int f35169p1;

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    private CharSequence f35170q1;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    private TextView f35171r1;

    /* JADX INFO: renamed from: s1, reason: collision with root package name */
    private TextView f35172s1;

    /* JADX INFO: renamed from: t1, reason: collision with root package name */
    private CheckableImageButton f35173t1;

    /* JADX INFO: renamed from: u1, reason: collision with root package name */
    private lj.h f35174u1;

    /* JADX INFO: renamed from: v1, reason: collision with root package name */
    private Button f35175v1;

    /* JADX INFO: renamed from: w1, reason: collision with root package name */
    private boolean f35176w1;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private CharSequence f35177x1;

    /* JADX INFO: renamed from: y1, reason: collision with root package name */
    private CharSequence f35178y1;

    /* JADX INFO: renamed from: z1, reason: collision with root package name */
    static final Object f35153z1 = "CONFIRM_BUTTON_TAG";
    static final Object A1 = "CANCEL_BUTTON_TAG";
    static final Object B1 = "TOGGLE_BUTTON_TAG";

    class a implements y {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f35179a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f35180b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f35181c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f35182d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f35183e;

        a(int i15, View view, int i16, int i17, int i18) {
            this.f35179a = i15;
            this.f35180b = view;
            this.f35181c = i16;
            this.f35182d = i17;
            this.f35183e = i18;
        }

        @Override // j6.y
        public f1 b(View view, f1 f1Var) {
            x5.h hVarF = f1Var.f(f1.p.i());
            if (this.f35179a >= 0) {
                this.f35180b.getLayoutParams().height = this.f35179a + hVarF.f216814b;
                View view2 = this.f35180b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f35180b;
            view3.setPadding(this.f35181c + hVarF.f216813a, this.f35182d + hVarF.f216814b, this.f35183e + hVarF.f216815c, view3.getPaddingBottom());
            return f1Var;
        }
    }

    class b extends s<S> {
        b() {
        }

        @Override // com.google.android.material.datepicker.s
        public void a(S s15) {
            m mVar = m.this;
            mVar.B2(mVar.p2());
            m.this.f35175v1.setEnabled(m.this.m2().A3());
        }
    }

    private void A2() {
        int iS2 = s2(z1());
        o oVarL2 = i.l2(m2(), iS2, this.f35156c1, this.f35157d1);
        this.f35158e1 = oVarL2;
        if (this.f35162i1 == 1) {
            oVarL2 = o.T1(m2(), iS2, this.f35156c1);
        }
        this.f35155b1 = oVarL2;
        C2();
        B2(p2());
        c0 c0VarO = y().o();
        c0VarO.p(ri.f.f174014x, this.f35155b1);
        c0VarO.j();
        this.f35155b1.R1(new b());
    }

    private void C2() {
        this.f35171r1.setText((this.f35162i1 == 1 && v2()) ? this.f35178y1 : this.f35177x1);
    }

    private void D2(CheckableImageButton checkableImageButton) {
        this.f35173t1.setContentDescription(this.f35162i1 == 1 ? checkableImageButton.getContext().getString(ri.j.f174063w) : checkableImageButton.getContext().getString(ri.j.f174065y));
    }

    public static /* synthetic */ void h2(m mVar, View view) {
        mVar.f35175v1.setEnabled(mVar.m2().A3());
        mVar.f35173t1.toggle();
        mVar.f35162i1 = mVar.f35162i1 == 1 ? 0 : 1;
        mVar.D2(mVar.f35173t1);
        mVar.A2();
    }

    private static Drawable k2(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_checked}, p082nUL.y.b(context, ri.e.f173983d));
        stateListDrawable.addState(new int[0], p082nUL.y.b(context, ri.e.f173984e));
        return stateListDrawable;
    }

    private void l2(Window window) {
        if (this.f35176w1) {
            return;
        }
        View viewFindViewById = A1().findViewById(ri.f.f173997g);
        com.google.android.material.internal.d.a(window, true, com.google.android.material.internal.q.d(viewFindViewById), null);
        int paddingTop = viewFindViewById.getPaddingTop();
        l0.q0(viewFindViewById, new a(viewFindViewById.getLayoutParams().height, viewFindViewById, viewFindViewById.getPaddingLeft(), paddingTop, viewFindViewById.getPaddingRight()));
        this.f35176w1 = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public d<S> m2() {
        if (this.f35154a1 == null) {
            this.f35154a1 = (d) v().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f35154a1;
    }

    private static CharSequence n2(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String[] strArrSplit = TextUtils.split(String.valueOf(charSequence), "\n");
        return strArrSplit.length > 1 ? strArrSplit[0] : charSequence;
    }

    private String o2() {
        return m2().O0(z1());
    }

    private static int q2(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(ri.d.X);
        int i15 = p.j().f35190d;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(ri.d.Z) * i15) + ((i15 - 1) * resources.getDimensionPixelOffset(ri.d.f173943c0));
    }

    private int s2(Context context) {
        int i15 = this.Z0;
        return i15 != 0 ? i15 : m2().D1(context);
    }

    private void t2(Context context) {
        this.f35173t1.setTag(B1);
        this.f35173t1.setImageDrawable(k2(context));
        this.f35173t1.setChecked(this.f35162i1 != 0);
        l0.h0(this.f35173t1, null);
        D2(this.f35173t1);
        this.f35173t1.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m.h2(this.f35152a, view);
            }
        });
    }

    static boolean u2(Context context) {
        return z2(context, R.attr.windowFullscreen);
    }

    private boolean v2() {
        return T().getConfiguration().orientation == 2;
    }

    static boolean w2(Context context) {
        return z2(context, ri.b.I);
    }

    static boolean z2(Context context, int i15) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(ij.b.f(context, ri.b.f173922q, i.class.getCanonicalName()), new int[]{i15});
        boolean z15 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z15;
    }

    @Override // androidx.fragment.app.o
    public final View B0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.f35161h1 ? ri.h.f174039t : ri.h.f174038s, viewGroup);
        Context context = viewInflate.getContext();
        g gVar = this.f35157d1;
        if (gVar != null) {
            gVar.h(context);
        }
        if (this.f35161h1) {
            viewInflate.findViewById(ri.f.f174014x).setLayoutParams(new LinearLayout.LayoutParams(q2(context), -2));
        } else {
            viewInflate.findViewById(ri.f.f174015y).setLayoutParams(new LinearLayout.LayoutParams(q2(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(ri.f.D);
        this.f35172s1 = textView;
        textView.setAccessibilityLiveRegion(1);
        this.f35173t1 = (CheckableImageButton) viewInflate.findViewById(ri.f.E);
        this.f35171r1 = (TextView) viewInflate.findViewById(ri.f.F);
        t2(context);
        this.f35175v1 = (Button) viewInflate.findViewById(ri.f.f173994d);
        if (m2().A3()) {
            this.f35175v1.setEnabled(true);
        } else {
            this.f35175v1.setEnabled(false);
        }
        this.f35175v1.setTag(f35153z1);
        CharSequence charSequence = this.f35164k1;
        if (charSequence != null) {
            this.f35175v1.setText(charSequence);
        } else {
            int i15 = this.f35163j1;
            if (i15 != 0) {
                this.f35175v1.setText(i15);
            }
        }
        CharSequence charSequence2 = this.f35166m1;
        if (charSequence2 != null) {
            this.f35175v1.setContentDescription(charSequence2);
        } else if (this.f35165l1 != 0) {
            this.f35175v1.setContentDescription(z().getResources().getText(this.f35165l1));
        }
        this.f35175v1.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f35150a.y2(view);
            }
        });
        Button button = (Button) viewInflate.findViewById(ri.f.f173991a);
        button.setTag(A1);
        CharSequence charSequence3 = this.f35168o1;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i16 = this.f35167n1;
            if (i16 != 0) {
                button.setText(i16);
            }
        }
        CharSequence charSequence4 = this.f35170q1;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.f35169p1 != 0) {
            button.setContentDescription(z().getResources().getText(this.f35169p1));
        }
        button.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.material.datepicker.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f35151a.x2(view);
            }
        });
        return viewInflate;
    }

    void B2(String str) {
        this.f35172s1.setContentDescription(o2());
        this.f35172s1.setText(str);
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.o
    public final void T0(Bundle bundle) {
        super.T0(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.Z0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f35154a1);
        com.google.android.material.datepicker.a.b bVar = new com.google.android.material.datepicker.a.b(this.f35156c1);
        i<S> iVar = this.f35158e1;
        p pVarG2 = iVar == null ? null : iVar.g2();
        if (pVarG2 != null) {
            bVar.b(pVarG2.f35192f);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", bVar.a());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f35157d1);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f35159f1);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f35160g1);
        bundle.putInt("INPUT_MODE_KEY", this.f35162i1);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f35163j1);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f35164k1);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f35165l1);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f35166m1);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f35167n1);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f35168o1);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f35169p1);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f35170q1);
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.o
    public void U0() {
        super.U0();
        Window window = d2().getWindow();
        if (this.f35161h1) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f35174u1);
            l2(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = T().getDimensionPixelOffset(ri.d.f173941b0);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f35174u1, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new cj.a(d2(), rect));
        }
        A2();
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.o
    public void V0() {
        this.f35155b1.S1();
        super.V0();
    }

    @Override // androidx.fragment.app.n
    public final Dialog Z1(Bundle bundle) {
        Dialog dialog = new Dialog(z1(), s2(z1()));
        Context context = dialog.getContext();
        this.f35161h1 = u2(context);
        this.f35174u1 = new lj.h(context, null, ri.b.f173922q, ri.k.f174091y);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, ri.l.f174288y2, ri.b.f173922q, ri.k.f174091y);
        int color = typedArrayObtainStyledAttributes.getColor(ri.l.f174296z2, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f35174u1.U(context);
        this.f35174u1.g0(ColorStateList.valueOf(color));
        this.f35174u1.f0(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    @Override // androidx.fragment.app.n, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.X0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.n, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.Y0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) c0();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public String p2() {
        return m2().v2(z());
    }

    public final S r2() {
        return m2().N3();
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.o
    public final void x0(Bundle bundle) {
        super.x0(bundle);
        if (bundle == null) {
            bundle = v();
        }
        this.Z0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f35154a1 = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f35156c1 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f35157d1 = (g) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f35159f1 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f35160g1 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f35162i1 = bundle.getInt("INPUT_MODE_KEY");
        this.f35163j1 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f35164k1 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f35165l1 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f35166m1 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f35167n1 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f35168o1 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f35169p1 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f35170q1 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.f35160g1;
        if (text == null) {
            text = z1().getResources().getText(this.f35159f1);
        }
        this.f35177x1 = text;
        this.f35178y1 = n2(text);
    }

    public void x2(View view) {
        Iterator<View.OnClickListener> it = this.W0.iterator();
        while (it.hasNext()) {
            it.next().onClick(view);
        }
        U1();
    }

    public void y2(View view) {
        Iterator<n<? super S>> it = this.V0.iterator();
        while (it.hasNext()) {
            it.next().a(r2());
        }
        U1();
    }
}
