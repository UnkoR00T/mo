package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.app.SearchableInfo;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes.dex */
public class SearchView extends l0 implements androidx.appcompat.view.c {
    static final e E0;
    private Rect A;
    private Bundle A0;
    private Rect B;
    private final Runnable B0;
    private int[] C;
    private Runnable C0;
    private int[] D;
    private final WeakHashMap<String, Drawable.ConstantState> D0;
    private final ImageView E;
    private final Drawable F;
    private final int G;
    private final int H;
    private final Intent I;
    private final Intent K;
    private final CharSequence L;
    View.OnFocusChangeListener O;
    private View.OnClickListener P;
    private boolean R;
    private boolean T;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    p6.a f8652h0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private boolean f8653q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final SearchAutoComplete f8654r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private CharSequence f8655r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final View f8656s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private boolean f8657s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final View f8658t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private boolean f8659t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private int f8660u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final ImageView f8661v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private boolean f8662v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final ImageView f8663w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private CharSequence f8664w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final ImageView f8665x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private boolean f8666x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    final ImageView f8667y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private int f8668y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private g f8669z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    SearchableInfo f8670z0;

    public static class SearchAutoComplete extends androidx.appcompat.widget.d {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f8671e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private SearchView f8672f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f8673g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final Runnable f8674h;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                SearchAutoComplete.this.c();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, p007NuL.m.f323p);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i15 = configuration.screenWidthDp;
            int i16 = configuration.screenHeightDp;
            if (i15 >= 960 && i16 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i15 < 600) {
                return (i15 < 640 || i16 < 480) ? 160 : 192;
            }
            return 192;
        }

        void b() {
            if (Build.VERSION.SDK_INT < 29) {
                SearchView.E0.c(this);
                return;
            }
            a.b(this, 1);
            if (enoughToFilter()) {
                showDropDown();
            }
        }

        void c() {
            if (this.f8673g) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f8673g = false;
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public boolean enoughToFilter() {
            return this.f8671e <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.d, android.widget.TextView, android.view.View
        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f8673g) {
                removeCallbacks(this.f8674h);
                post(this.f8674h);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        protected void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        protected void onFocusChanged(boolean z15, int i15, Rect rect) {
            super.onFocusChanged(z15, i15, rect);
            this.f8672f.N();
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public boolean onKeyPreIme(int i15, KeyEvent keyEvent) {
            if (i15 == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f8672f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i15, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public void onWindowFocusChanged(boolean z15) {
            super.onWindowFocusChanged(z15);
            if (z15 && this.f8672f.hasFocus() && getVisibility() == 0) {
                this.f8673g = true;
                if (SearchView.G(getContext())) {
                    b();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        protected void replaceText(CharSequence charSequence) {
        }

        void setImeVisibility(boolean z15) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z15) {
                this.f8673g = false;
                removeCallbacks(this.f8674h);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.f8673g = true;
                    return;
                }
                this.f8673g = false;
                removeCallbacks(this.f8674h);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        void setSearchView(SearchView searchView) {
            this.f8672f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i15) {
            super.setThreshold(i15);
            this.f8671e = i15;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i15) {
            super(context, attributeSet, i15);
            this.f8674h = new a();
            this.f8671e = getThreshold();
        }
    }

    static class a {
        static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        static void b(SearchAutoComplete searchAutoComplete, int i15) {
            searchAutoComplete.setInputMethodMode(i15);
        }
    }

    public interface b {
    }

    public interface c {
    }

    public interface d {
    }

    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Method f8676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Method f8677b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Method f8678c;

        @SuppressLint({"DiscouragedPrivateApi", "SoonBlockedPrivateApi"})
        e() {
            this.f8676a = null;
            this.f8677b = null;
            this.f8678c = null;
            d();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                this.f8676a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                this.f8677b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                this.f8678c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        private static void d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        void a(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f8677b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        void b(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f8676a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, null);
                } catch (Exception unused) {
                }
            }
        }

        void c(AutoCompleteTextView autoCompleteTextView) {
            d();
            Method method = this.f8678c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }
    }

    static class f extends r6.a {
        public static final Parcelable.Creator<f> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f8679c;

        class a implements Parcelable.ClassLoaderCreator<f> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel) {
                return new f(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public f createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new f(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public f[] newArray(int i15) {
                return new f[i15];
            }
        }

        f(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f8679c + "}";
        }

        @Override // r6.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i15) {
            super.writeToParcel(parcel, i15);
            parcel.writeValue(Boolean.valueOf(this.f8679c));
        }

        public f(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f8679c = ((Boolean) parcel.readValue(null)).booleanValue();
        }
    }

    private static class g extends TouchDelegate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final View f8680a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Rect f8681b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Rect f8682c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Rect f8683d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f8684e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f8685f;

        public g(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f8684e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.f8681b = new Rect();
            this.f8683d = new Rect();
            this.f8682c = new Rect();
            a(rect, rect2);
            this.f8680a = view;
        }

        public void a(Rect rect, Rect rect2) {
            this.f8681b.set(rect);
            this.f8683d.set(rect);
            Rect rect3 = this.f8683d;
            int i15 = this.f8684e;
            rect3.inset(-i15, -i15);
            this.f8682c.set(rect2);
        }

        /* JADX WARN: Code duplicated, block: B:19:0x003e  */
        @Override // android.view.TouchDelegate
        public boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z15;
            boolean z16;
            int x15 = (int) motionEvent.getX();
            int y15 = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z17 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z16 = this.f8685f;
                    if (z16 && !this.f8683d.contains(x15, y15)) {
                        z17 = z16;
                        z15 = false;
                    }
                } else if (action != 3) {
                    z15 = true;
                    z17 = false;
                } else {
                    z16 = this.f8685f;
                    this.f8685f = false;
                }
                z17 = z16;
                z15 = true;
            } else if (this.f8681b.contains(x15, y15)) {
                this.f8685f = true;
                z15 = true;
            } else {
                z15 = true;
                z17 = false;
            }
            if (!z17) {
                return false;
            }
            if (!z15 || this.f8682c.contains(x15, y15)) {
                Rect rect = this.f8682c;
                motionEvent.setLocation(x15 - rect.left, y15 - rect.top);
            } else {
                motionEvent.setLocation(this.f8680a.getWidth() / 2, this.f8680a.getHeight() / 2);
            }
            return this.f8680a.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        E0 = Build.VERSION.SDK_INT < 29 ? new e() : null;
    }

    private void A() {
        this.f8654r.dismissDropDown();
    }

    private void C(View view, Rect rect) {
        view.getLocationInWindow(this.C);
        getLocationInWindow(this.D);
        int[] iArr = this.C;
        int i15 = iArr[1];
        int[] iArr2 = this.D;
        int i16 = i15 - iArr2[1];
        int i17 = iArr[0] - iArr2[0];
        rect.set(i17, i16, view.getWidth() + i17, view.getHeight() + i16);
    }

    private CharSequence D(CharSequence charSequence) {
        if (!this.R || this.F == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f8654r.getTextSize()) * 1.25d);
        this.F.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.F), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    private boolean E() {
        Intent intent;
        SearchableInfo searchableInfo = this.f8670z0;
        if (searchableInfo != null && searchableInfo.getVoiceSearchEnabled()) {
            if (this.f8670z0.getVoiceSearchLaunchWebSearch()) {
                intent = this.I;
            } else {
                intent = this.f8670z0.getVoiceSearchLaunchRecognizer() ? this.K : null;
            }
            if (intent != null && getContext().getPackageManager().resolveActivity(intent, PKIFailureInfo.notAuthorized) != null) {
                return true;
            }
        }
        return false;
    }

    static boolean G(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    private boolean H() {
        return (this.f8653q0 || this.f8662v0) && !F();
    }

    private void O() {
        post(this.B0);
    }

    private void Q() {
        boolean zIsEmpty = TextUtils.isEmpty(this.f8654r.getText());
        this.f8665x.setVisibility(!zIsEmpty || (this.R && !this.f8666x0) ? 0 : 8);
        Drawable drawable = this.f8665x.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    private void R() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f8654r;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(D(queryHint));
    }

    private void S() {
        this.f8654r.setThreshold(this.f8670z0.getSuggestThreshold());
        this.f8654r.setImeOptions(this.f8670z0.getImeOptions());
        int inputType = this.f8670z0.getInputType();
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f8670z0.getSuggestAuthority() != null) {
                inputType |= 589824;
            }
        }
        this.f8654r.setInputType(inputType);
        p6.a aVar = this.f8652h0;
        if (aVar != null) {
            aVar.a(null);
        }
        if (this.f8670z0.getSuggestAuthority() != null) {
            t0 t0Var = new t0(getContext(), this, this.f8670z0, this.D0);
            this.f8652h0 = t0Var;
            this.f8654r.setAdapter(t0Var);
            ((t0) this.f8652h0).w(this.f8657s0 ? 2 : 1);
        }
    }

    private void T() {
        this.f8658t.setVisibility((H() && (this.f8663w.getVisibility() == 0 || this.f8667y.getVisibility() == 0)) ? 0 : 8);
    }

    private void U(boolean z15) {
        this.f8663w.setVisibility((this.f8653q0 && H() && hasFocus() && (z15 || !this.f8662v0)) ? 0 : 8);
    }

    private void V(boolean z15) {
        this.T = z15;
        int i15 = 8;
        int i16 = z15 ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.f8654r.getText());
        this.f8661v.setVisibility(i16);
        U(!zIsEmpty);
        this.f8656s.setVisibility(z15 ? 8 : 0);
        if (this.E.getDrawable() != null && !this.R) {
            i15 = 0;
        }
        this.E.setVisibility(i15);
        Q();
        W(zIsEmpty);
        T();
    }

    private void W(boolean z15) {
        int i15 = 8;
        if (this.f8662v0 && !F() && z15) {
            this.f8663w.setVisibility(8);
            i15 = 0;
        }
        this.f8667y.setVisibility(i15);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(p007NuL.p.f347e);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(p007NuL.p.f348f);
    }

    private void setQuery(CharSequence charSequence) {
        this.f8654r.setText(charSequence);
        this.f8654r.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    private Intent z(String str, Uri uri, String str2, String str3, int i15, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f8664w0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.A0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i15 != 0) {
            intent.putExtra("action_key", i15);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f8670z0.getSearchActivity());
        return intent;
    }

    void B() {
        if (Build.VERSION.SDK_INT >= 29) {
            a.a(this.f8654r);
            return;
        }
        e eVar = E0;
        eVar.b(this.f8654r);
        eVar.a(this.f8654r);
    }

    public boolean F() {
        return this.T;
    }

    void I(int i15, String str, String str2) {
        getContext().startActivity(z("android.intent.action.SEARCH", null, null, str2, i15, str));
    }

    void J() {
        if (!TextUtils.isEmpty(this.f8654r.getText())) {
            this.f8654r.setText("");
            this.f8654r.requestFocus();
            this.f8654r.setImeVisibility(true);
        } else if (this.R) {
            clearFocus();
            V(true);
        }
    }

    protected void K(CharSequence charSequence) {
        setQuery(charSequence);
    }

    void L() {
        V(false);
        this.f8654r.requestFocus();
        this.f8654r.setImeVisibility(true);
        View.OnClickListener onClickListener = this.P;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    void M() {
        Editable text = this.f8654r.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        if (this.f8670z0 != null) {
            I(0, null, text.toString());
        }
        this.f8654r.setImeVisibility(false);
        A();
    }

    void N() {
        V(F());
        O();
        if (this.f8654r.hasFocus()) {
            B();
        }
    }

    public void P(CharSequence charSequence, boolean z15) {
        this.f8654r.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f8654r;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f8664w0 = charSequence;
        }
        if (!z15 || TextUtils.isEmpty(charSequence)) {
            return;
        }
        M();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void clearFocus() {
        this.f8659t0 = true;
        super.clearFocus();
        this.f8654r.clearFocus();
        this.f8654r.setImeVisibility(false);
        this.f8659t0 = false;
    }

    public int getImeOptions() {
        return this.f8654r.getImeOptions();
    }

    public int getInputType() {
        return this.f8654r.getInputType();
    }

    public int getMaxWidth() {
        return this.f8660u0;
    }

    public CharSequence getQuery() {
        return this.f8654r.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f8655r0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f8670z0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.L : getContext().getText(this.f8670z0.getHintId());
    }

    int getSuggestionCommitIconResId() {
        return this.H;
    }

    int getSuggestionRowLayout() {
        return this.G;
    }

    public p6.a getSuggestionsAdapter() {
        return this.f8652h0;
    }

    @Override // androidx.appcompat.view.c
    public void onActionViewCollapsed() {
        P("", false);
        clearFocus();
        V(true);
        this.f8654r.setImeOptions(this.f8668y0);
        this.f8666x0 = false;
    }

    @Override // androidx.appcompat.view.c
    public void onActionViewExpanded() {
        if (this.f8666x0) {
            return;
        }
        this.f8666x0 = true;
        int imeOptions = this.f8654r.getImeOptions();
        this.f8668y0 = imeOptions;
        this.f8654r.setImeOptions(imeOptions | 33554432);
        this.f8654r.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.B0);
        post(this.C0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.l0, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z15, int i15, int i16, int i17, int i18) {
        super.onLayout(z15, i15, i16, i17, i18);
        if (z15) {
            C(this.f8654r, this.A);
            Rect rect = this.B;
            Rect rect2 = this.A;
            rect.set(rect2.left, 0, rect2.right, i18 - i16);
            g gVar = this.f8669z;
            if (gVar != null) {
                gVar.a(this.B, this.A);
                return;
            }
            g gVar2 = new g(this.B, this.A, this.f8654r);
            this.f8669z = gVar2;
            setTouchDelegate(gVar2);
        }
    }

    @Override // androidx.appcompat.widget.l0, android.view.View
    protected void onMeasure(int i15, int i16) {
        int i17;
        if (F()) {
            super.onMeasure(i15, i16);
            return;
        }
        int mode = View.MeasureSpec.getMode(i15);
        int size = View.MeasureSpec.getSize(i15);
        if (mode == Integer.MIN_VALUE) {
            int i18 = this.f8660u0;
            size = i18 > 0 ? Math.min(i18, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f8660u0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i17 = this.f8660u0) > 0) {
            size = Math.min(i17, size);
        }
        int mode2 = View.MeasureSpec.getMode(i16);
        int size2 = View.MeasureSpec.getSize(i16);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof f)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        f fVar = (f) parcelable;
        super.onRestoreInstanceState(fVar.a());
        V(fVar.f8679c);
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        f fVar = new f(super.onSaveInstanceState());
        fVar.f8679c = F();
        return fVar;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z15) {
        super.onWindowFocusChanged(z15);
        O();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i15, Rect rect) {
        if (this.f8659t0 || !isFocusable()) {
            return false;
        }
        if (F()) {
            return super.requestFocus(i15, rect);
        }
        boolean zRequestFocus = this.f8654r.requestFocus(i15, rect);
        if (zRequestFocus) {
            V(false);
        }
        return zRequestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.A0 = bundle;
    }

    public void setIconified(boolean z15) {
        if (z15) {
            J();
        } else {
            L();
        }
    }

    public void setIconifiedByDefault(boolean z15) {
        if (this.R == z15) {
            return;
        }
        this.R = z15;
        V(z15);
        R();
    }

    public void setImeOptions(int i15) {
        this.f8654r.setImeOptions(i15);
    }

    public void setInputType(int i15) {
        this.f8654r.setInputType(i15);
    }

    public void setMaxWidth(int i15) {
        this.f8660u0 = i15;
        requestLayout();
    }

    public void setOnCloseListener(b bVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.O = onFocusChangeListener;
    }

    public void setOnQueryTextListener(c cVar) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.P = onClickListener;
    }

    public void setOnSuggestionListener(d dVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f8655r0 = charSequence;
        R();
    }

    public void setQueryRefinementEnabled(boolean z15) {
        this.f8657s0 = z15;
        p6.a aVar = this.f8652h0;
        if (aVar instanceof t0) {
            ((t0) aVar).w(z15 ? 2 : 1);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f8670z0 = searchableInfo;
        if (searchableInfo != null) {
            S();
            R();
        }
        boolean zE = E();
        this.f8662v0 = zE;
        if (zE) {
            this.f8654r.setPrivateImeOptions("nm");
        }
        V(F());
    }

    public void setSubmitButtonEnabled(boolean z15) {
        this.f8653q0 = z15;
        V(F());
    }

    public void setSuggestionsAdapter(p6.a aVar) {
        this.f8652h0 = aVar;
        this.f8654r.setAdapter(aVar);
    }
}
