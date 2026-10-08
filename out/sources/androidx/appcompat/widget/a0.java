package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import io.sentry.android.core.c2;
import p011Prn.f2;

/* JADX INFO: loaded from: classes.dex */
public class a0 extends Spinner {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SuppressLint({"ResourceType"})
    private static final int[] f8741j = {R.attr.spinnerMode};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.appcompat.widget.e f8742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f8743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private k0 f8744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private SpinnerAdapter f8745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f8746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private h f8747f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f8748g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Rect f8749h;

    class a extends k0 {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ f f8750k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, f fVar) {
            super(view);
            this.f8750k = fVar;
        }

        @Override // androidx.appcompat.widget.k0
        public f2 b() {
            return this.f8750k;
        }

        @Override // androidx.appcompat.widget.k0
        public boolean c() {
            if (a0.this.getInternalPopup().b()) {
                return true;
            }
            a0.this.b();
            return true;
        }
    }

    class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!a0.this.getInternalPopup().b()) {
                a0.this.b();
            }
            ViewTreeObserver viewTreeObserver = a0.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
            }
        }
    }

    private static final class c {
        static void a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (i6.c.a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    class d implements h, DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        androidx.appcompat.app.b f8753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ListAdapter f8754b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CharSequence f8755c;

        d() {
        }

        @Override // androidx.appcompat.widget.a0.h
        public boolean b() {
            androidx.appcompat.app.b bVar = this.f8753a;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        @Override // androidx.appcompat.widget.a0.h
        public void c(Drawable drawable) {
            c2.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.a0.h
        public int d() {
            return 0;
        }

        @Override // androidx.appcompat.widget.a0.h
        public void dismiss() {
            androidx.appcompat.app.b bVar = this.f8753a;
            if (bVar != null) {
                bVar.dismiss();
                this.f8753a = null;
            }
        }

        @Override // androidx.appcompat.widget.a0.h
        public void f(int i15) {
            c2.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.a0.h
        public CharSequence g() {
            return this.f8755c;
        }

        @Override // androidx.appcompat.widget.a0.h
        public Drawable h() {
            return null;
        }

        @Override // androidx.appcompat.widget.a0.h
        public void i(CharSequence charSequence) {
            this.f8755c = charSequence;
        }

        @Override // androidx.appcompat.widget.a0.h
        public void j(int i15) {
            c2.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.a0.h
        public void k(int i15) {
            c2.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // androidx.appcompat.widget.a0.h
        public void l(int i15, int i16) {
            if (this.f8754b == null) {
                return;
            }
            androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(a0.this.getPopupContext());
            CharSequence charSequence = this.f8755c;
            if (charSequence != null) {
                aVar.setTitle(charSequence);
            }
            androidx.appcompat.app.b bVarCreate = aVar.f(this.f8754b, a0.this.getSelectedItemPosition(), this).create();
            this.f8753a = bVarCreate;
            ListView listViewT = bVarCreate.t();
            listViewT.setTextDirection(i15);
            listViewT.setTextAlignment(i16);
            this.f8753a.show();
        }

        @Override // androidx.appcompat.widget.a0.h
        public int m() {
            return 0;
        }

        @Override // androidx.appcompat.widget.a0.h
        public void n(ListAdapter listAdapter) {
            this.f8754b = listAdapter;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i15) {
            a0.this.setSelection(i15);
            if (a0.this.getOnItemClickListener() != null) {
                a0.this.performItemClick(null, i15, this.f8754b.getItemId(i15));
            }
            dismiss();
        }
    }

    private static class e implements ListAdapter, SpinnerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private SpinnerAdapter f8757a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ListAdapter f8758b;

        public e(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f8757a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f8758b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    c.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof v0) {
                    v0 v0Var = (v0) spinnerAdapter;
                    if (v0Var.getDropDownViewTheme() == null) {
                        v0Var.setDropDownViewTheme(theme);
                    }
                }
            }
        }

        @Override // android.widget.ListAdapter
        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f8758b;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f8757a;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public View getDropDownView(int i15, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f8757a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i15, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public Object getItem(int i15) {
            SpinnerAdapter spinnerAdapter = this.f8757a;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i15);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i15) {
            SpinnerAdapter spinnerAdapter = this.f8757a;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i15);
        }

        @Override // android.widget.Adapter
        public int getItemViewType(int i15) {
            return 0;
        }

        @Override // android.widget.Adapter
        public View getView(int i15, View view, ViewGroup viewGroup) {
            return getDropDownView(i15, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f8757a;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public boolean isEnabled(int i15) {
            ListAdapter listAdapter = this.f8758b;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i15);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f8757a;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f8757a;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    class f extends m0 implements h {
        private CharSequence O;
        ListAdapter P;
        private final Rect R;
        private int T;

        class a implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ a0 f8759a;

            a(a0 a0Var) {
                this.f8759a = a0Var;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i15, long j15) {
                a0.this.setSelection(i15);
                if (a0.this.getOnItemClickListener() != null) {
                    f fVar = f.this;
                    a0.this.performItemClick(view, i15, fVar.P.getItemId(i15));
                }
                f.this.dismiss();
            }
        }

        class b implements ViewTreeObserver.OnGlobalLayoutListener {
            b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                f fVar = f.this;
                if (!fVar.V(a0.this)) {
                    f.this.dismiss();
                } else {
                    f.this.T();
                    f.super.a();
                }
            }
        }

        class c implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f8762a;

            c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f8762a = onGlobalLayoutListener;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = a0.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f8762a);
                }
            }
        }

        public f(Context context, AttributeSet attributeSet, int i15) {
            super(context, attributeSet, i15);
            this.R = new Rect();
            D(a0.this);
            J(true);
            P(0);
            L(new a(a0.this));
        }

        void T() {
            int i15;
            Drawable drawableH = h();
            if (drawableH != null) {
                drawableH.getPadding(a0.this.f8749h);
                i15 = g1.b(a0.this) ? a0.this.f8749h.right : -a0.this.f8749h.left;
            } else {
                Rect rect = a0.this.f8749h;
                rect.right = 0;
                rect.left = 0;
                i15 = 0;
            }
            int paddingLeft = a0.this.getPaddingLeft();
            int paddingRight = a0.this.getPaddingRight();
            int width = a0.this.getWidth();
            a0 a0Var = a0.this;
            int i16 = a0Var.f8748g;
            if (i16 == -2) {
                int iA = a0Var.a((SpinnerAdapter) this.P, h());
                int i17 = a0.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = a0.this.f8749h;
                int i18 = (i17 - rect2.left) - rect2.right;
                if (iA > i18) {
                    iA = i18;
                }
                F(Math.max(iA, (width - paddingLeft) - paddingRight));
            } else if (i16 == -1) {
                F((width - paddingLeft) - paddingRight);
            } else {
                F(i16);
            }
            f(g1.b(a0.this) ? i15 + (((width - paddingRight) - z()) - U()) : i15 + paddingLeft + U());
        }

        public int U() {
            return this.T;
        }

        boolean V(View view) {
            return view.isAttachedToWindow() && view.getGlobalVisibleRect(this.R);
        }

        @Override // androidx.appcompat.widget.a0.h
        public CharSequence g() {
            return this.O;
        }

        @Override // androidx.appcompat.widget.a0.h
        public void i(CharSequence charSequence) {
            this.O = charSequence;
        }

        @Override // androidx.appcompat.widget.a0.h
        public void k(int i15) {
            this.T = i15;
        }

        @Override // androidx.appcompat.widget.a0.h
        public void l(int i15, int i16) {
            ViewTreeObserver viewTreeObserver;
            boolean zB = b();
            T();
            I(2);
            super.a();
            ListView listViewP = p();
            listViewP.setChoiceMode(1);
            listViewP.setTextDirection(i15);
            listViewP.setTextAlignment(i16);
            Q(a0.this.getSelectedItemPosition());
            if (zB || (viewTreeObserver = a0.this.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            K(new c(bVar));
        }

        @Override // androidx.appcompat.widget.m0, androidx.appcompat.widget.a0.h
        public void n(ListAdapter listAdapter) {
            super.n(listAdapter);
            this.P = listAdapter;
        }
    }

    static class g extends View.BaseSavedState {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f8764a;

        class a implements Parcelable.Creator<g> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public g[] newArray(int i15) {
                return new g[i15];
            }
        }

        g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i15) {
            super.writeToParcel(parcel, i15);
            parcel.writeByte(this.f8764a ? (byte) 1 : (byte) 0);
        }

        g(Parcel parcel) {
            super(parcel);
            this.f8764a = parcel.readByte() != 0;
        }
    }

    interface h {
        boolean b();

        void c(Drawable drawable);

        int d();

        void dismiss();

        void f(int i15);

        CharSequence g();

        Drawable h();

        void i(CharSequence charSequence);

        void j(int i15);

        void k(int i15);

        void l(int i15, int i16);

        int m();

        void n(ListAdapter listAdapter);
    }

    public a0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p007NuL.m.L);
    }

    int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i15 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i15) {
                view = null;
                i15 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        drawable.getPadding(this.f8749h);
        Rect rect = this.f8749h;
        return iMax2 + rect.left + rect.right;
    }

    void b() {
        this.f8747f.l(getTextDirection(), getTextAlignment());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        androidx.appcompat.widget.e eVar = this.f8742a;
        if (eVar != null) {
            eVar.b();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        h hVar = this.f8747f;
        return hVar != null ? hVar.d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        h hVar = this.f8747f;
        return hVar != null ? hVar.m() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f8747f != null ? this.f8748g : super.getDropDownWidth();
    }

    final h getInternalPopup() {
        return this.f8747f;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        h hVar = this.f8747f;
        return hVar != null ? hVar.h() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f8743b;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        h hVar = this.f8747f;
        return hVar != null ? hVar.g() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        androidx.appcompat.widget.e eVar = this.f8742a;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        androidx.appcompat.widget.e eVar = this.f8742a;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        h hVar = this.f8747f;
        if (hVar == null || !hVar.b()) {
            return;
        }
        this.f8747f.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    protected void onMeasure(int i15, int i16) {
        super.onMeasure(i15, i16);
        if (this.f8747f == null || View.MeasureSpec.getMode(i15) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i15)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.getSuperState());
        if (!gVar.f8764a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new b());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public Parcelable onSaveInstanceState() {
        g gVar = new g(super.onSaveInstanceState());
        h hVar = this.f8747f;
        gVar.f8764a = hVar != null && hVar.b();
        return gVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        k0 k0Var = this.f8744c;
        if (k0Var == null || !k0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public boolean performClick() {
        h hVar = this.f8747f;
        if (hVar == null) {
            return super.performClick();
        }
        if (hVar.b()) {
            return true;
        }
        b();
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        androidx.appcompat.widget.e eVar = this.f8742a;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i15) {
        super.setBackgroundResource(i15);
        androidx.appcompat.widget.e eVar = this.f8742a;
        if (eVar != null) {
            eVar.g(i15);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i15) {
        h hVar = this.f8747f;
        if (hVar == null) {
            super.setDropDownHorizontalOffset(i15);
        } else {
            hVar.k(i15);
            this.f8747f.f(i15);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i15) {
        h hVar = this.f8747f;
        if (hVar != null) {
            hVar.j(i15);
        } else {
            super.setDropDownVerticalOffset(i15);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i15) {
        if (this.f8747f != null) {
            this.f8748g = i15;
        } else {
            super.setDropDownWidth(i15);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        h hVar = this.f8747f;
        if (hVar != null) {
            hVar.c(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i15) {
        setPopupBackgroundDrawable(p082nUL.y.b(getPopupContext(), i15));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        h hVar = this.f8747f;
        if (hVar != null) {
            hVar.i(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        androidx.appcompat.widget.e eVar = this.f8742a;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        androidx.appcompat.widget.e eVar = this.f8742a;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    public a0(Context context, AttributeSet attributeSet, int i15) {
        this(context, attributeSet, i15, -1);
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f8746e) {
            this.f8745d = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f8747f != null) {
            Context context = this.f8743b;
            if (context == null) {
                context = getContext();
            }
            this.f8747f.n(new e(spinnerAdapter, context.getTheme()));
        }
    }

    public a0(Context context, AttributeSet attributeSet, int i15, int i16) {
        this(context, attributeSet, i15, i16, null);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x006a  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d2  */
    public a0(Context context, AttributeSet attributeSet, int i15, int i16, Resources.Theme theme) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] charSequenceArrQ;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i15);
        this.f8749h = new Rect();
        u0.a(this, getContext());
        z0 z0VarV = z0.v(context, attributeSet, p007NuL.v.f470g2, i15, 0);
        this.f8742a = new androidx.appcompat.widget.e(this);
        if (theme != null) {
            this.f8743b = new androidx.appcompat.view.d(context, theme);
        } else {
            int iN = z0VarV.n(p007NuL.v.f495l2, 0);
            if (iN != 0) {
                this.f8743b = new androidx.appcompat.view.d(context, iN);
            } else {
                this.f8743b = context;
            }
        }
        TypedArray typedArray = null;
        if (i16 == -1) {
            try {
                typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f8741j, i15, 0);
                try {
                    if (typedArrayObtainStyledAttributes.hasValue(0)) {
                        i16 = typedArrayObtainStyledAttributes.getInt(0, 0);
                    }
                } catch (Exception unused) {
                    if (typedArrayObtainStyledAttributes != null) {
                    }
                    if (i16 != 0) {
                        d dVar = new d();
                        this.f8747f = dVar;
                        dVar.i(z0VarV.o(p007NuL.v.f485j2));
                    } else if (i16 == 1) {
                        f fVar = new f(this.f8743b, attributeSet, i15);
                        z0 z0VarV2 = z0.v(this.f8743b, attributeSet, p007NuL.v.f470g2, i15, 0);
                        this.f8748g = z0VarV2.m(p007NuL.v.f490k2, -2);
                        fVar.c(z0VarV2.g(p007NuL.v.f480i2));
                        fVar.i(z0VarV.o(p007NuL.v.f485j2));
                        z0VarV2.x();
                        this.f8747f = fVar;
                        this.f8744c = new a(this, fVar);
                    }
                    charSequenceArrQ = z0VarV.q(p007NuL.v.f475h2);
                    if (charSequenceArrQ != null) {
                        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrQ);
                        arrayAdapter.setDropDownViewResource(p007NuL.s.f420q);
                        setAdapter((SpinnerAdapter) arrayAdapter);
                    }
                    z0VarV.x();
                    this.f8746e = true;
                    spinnerAdapter = this.f8745d;
                    if (spinnerAdapter != null) {
                        setAdapter(spinnerAdapter);
                        this.f8745d = null;
                    }
                    this.f8742a.e(attributeSet, i15);
                } catch (Throwable th4) {
                    th = th4;
                    typedArray = typedArrayObtainStyledAttributes;
                    if (typedArray != null) {
                        typedArray.recycle();
                    }
                    throw th;
                }
            } catch (Exception unused2) {
                typedArrayObtainStyledAttributes = null;
            } catch (Throwable th5) {
                th = th5;
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (i16 != 0) {
            d dVar2 = new d();
            this.f8747f = dVar2;
            dVar2.i(z0VarV.o(p007NuL.v.f485j2));
        } else if (i16 == 1) {
            f fVar2 = new f(this.f8743b, attributeSet, i15);
            z0 z0VarV3 = z0.v(this.f8743b, attributeSet, p007NuL.v.f470g2, i15, 0);
            this.f8748g = z0VarV3.m(p007NuL.v.f490k2, -2);
            fVar2.c(z0VarV3.g(p007NuL.v.f480i2));
            fVar2.i(z0VarV.o(p007NuL.v.f485j2));
            z0VarV3.x();
            this.f8747f = fVar2;
            this.f8744c = new a(this, fVar2);
        }
        charSequenceArrQ = z0VarV.q(p007NuL.v.f475h2);
        if (charSequenceArrQ != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, charSequenceArrQ);
            arrayAdapter2.setDropDownViewResource(p007NuL.s.f420q);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        z0VarV.x();
        this.f8746e = true;
        spinnerAdapter = this.f8745d;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f8745d = null;
        }
        this.f8742a.e(attributeSet, i15);
    }
}
