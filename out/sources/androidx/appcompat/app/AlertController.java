package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import j6.l0;
import java.lang.ref.WeakReference;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p007NuL.v;

/* JADX INFO: loaded from: classes.dex */
class AlertController {
    NestedScrollView A;
    private Drawable C;
    private ImageView D;
    private TextView E;
    private TextView F;
    private View G;
    ListAdapter H;
    private int J;
    private int K;
    int L;
    int M;
    int N;
    int O;
    private boolean P;
    Handler R;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f8093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final m f8094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Window f8095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f8096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharSequence f8097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private CharSequence f8098f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ListView f8099g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f8100h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f8101i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f8102j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f8103k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f8104l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f8105m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Button f8107o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private CharSequence f8108p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    Message f8109q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Drawable f8110r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    Button f8111s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private CharSequence f8112t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    Message f8113u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Drawable f8114v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    Button f8115w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private CharSequence f8116x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    Message f8117y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Drawable f8118z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f8106n = false;
    private int B = 0;
    int I = -1;
    private int Q = 0;
    private final View.OnClickListener S = new a();

    public static class RecycleListView extends ListView {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f8119a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f8120b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v.f450c2);
            this.f8120b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(v.f455d2, -1);
            this.f8119a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(v.f460e2, -1);
        }

        public void a(boolean z15, boolean z16) {
            if (z16 && z15) {
                return;
            }
            setPadding(getPaddingLeft(), z15 ? getPaddingTop() : this.f8119a, getPaddingRight(), z16 ? getPaddingBottom() : this.f8120b);
        }
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message messageObtain;
            Message message;
            Message message2;
            Message message3;
            AlertController alertController = AlertController.this;
            if (view == alertController.f8107o && (message3 = alertController.f8109q) != null) {
                messageObtain = Message.obtain(message3);
            } else if (view != alertController.f8111s || (message2 = alertController.f8113u) == null) {
                messageObtain = (view != alertController.f8115w || (message = alertController.f8117y) == null) ? null : Message.obtain(message);
            } else {
                messageObtain = Message.obtain(message2);
            }
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.R.obtainMessage(1, alertController2.f8094b).sendToTarget();
        }
    }

    public static class b {
        public int A;
        public int B;
        public int C;
        public int D;
        public boolean[] F;
        public boolean G;
        public boolean H;
        public DialogInterface.OnMultiChoiceClickListener J;
        public Cursor K;
        public String L;
        public String M;
        public AdapterView.OnItemSelectedListener N;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f8122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LayoutInflater f8123b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Drawable f8125d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f8127f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public View f8128g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CharSequence f8129h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public CharSequence f8130i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Drawable f8131j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public DialogInterface.OnClickListener f8132k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f8133l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public Drawable f8134m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public DialogInterface.OnClickListener f8135n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public CharSequence f8136o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public Drawable f8137p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public DialogInterface.OnClickListener f8138q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public DialogInterface.OnCancelListener f8140s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public DialogInterface.OnDismissListener f8141t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public DialogInterface.OnKeyListener f8142u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public CharSequence[] f8143v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public ListAdapter f8144w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public DialogInterface.OnClickListener f8145x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f8146y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public View f8147z;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f8124c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f8126e = 0;
        public boolean E = false;
        public int I = -1;
        public boolean O = true;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f8139r = true;

        class a extends ArrayAdapter<CharSequence> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ RecycleListView f8148a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i15, int i16, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i15, i16, charSequenceArr);
                this.f8148a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i15, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i15, view, viewGroup);
                boolean[] zArr = b.this.F;
                if (zArr != null && zArr[i15]) {
                    this.f8148a.setItemChecked(i15, true);
                }
                return view2;
            }
        }

        /* JADX INFO: renamed from: androidx.appcompat.app.AlertController$b$b, reason: collision with other inner class name */
        class C0184b extends CursorAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final int f8150a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final int f8151b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ RecycleListView f8152c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ AlertController f8153d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0184b(Context context, Cursor cursor, boolean z15, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z15);
                this.f8152c = recycleListView;
                this.f8153d = alertController;
                Cursor cursor2 = getCursor();
                this.f8150a = cursor2.getColumnIndexOrThrow(b.this.L);
                this.f8151b = cursor2.getColumnIndexOrThrow(b.this.M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f8150a));
                this.f8152c.setItemChecked(cursor.getPosition(), cursor.getInt(this.f8151b) == 1);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return b.this.f8123b.inflate(this.f8153d.M, viewGroup, false);
            }
        }

        class c implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AlertController f8155a;

            c(AlertController alertController) {
                this.f8155a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i15, long j15) {
                b.this.f8145x.onClick(this.f8155a.f8094b, i15);
                if (b.this.H) {
                    return;
                }
                this.f8155a.f8094b.dismiss();
            }
        }

        class d implements AdapterView.OnItemClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ RecycleListView f8157a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AlertController f8158b;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f8157a = recycleListView;
                this.f8158b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView<?> adapterView, View view, int i15, long j15) {
                boolean[] zArr = b.this.F;
                if (zArr != null) {
                    zArr[i15] = this.f8157a.isItemChecked(i15);
                }
                b.this.J.onClick(this.f8158b.f8094b, i15, this.f8157a.isItemChecked(i15));
            }
        }

        public b(Context context) {
            this.f8122a = context;
            this.f8123b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        private void b(AlertController alertController) {
            b bVar;
            AlertController alertController2;
            ListAdapter dVar;
            RecycleListView recycleListView = (RecycleListView) this.f8123b.inflate(alertController.L, (ViewGroup) null);
            if (!this.G) {
                bVar = this;
                alertController2 = alertController;
                int i15 = bVar.H ? alertController2.N : alertController2.O;
                if (bVar.K != null) {
                    dVar = new SimpleCursorAdapter(bVar.f8122a, i15, bVar.K, new String[]{bVar.L}, new int[]{R.id.text1});
                } else {
                    dVar = bVar.f8144w;
                    if (dVar == null) {
                        dVar = new d(bVar.f8122a, i15, R.id.text1, bVar.f8143v);
                    }
                }
            } else if (this.K == null) {
                bVar = this;
                dVar = bVar.new a(this.f8122a, alertController.M, R.id.text1, this.f8143v, recycleListView);
                recycleListView = recycleListView;
                alertController2 = alertController;
            } else {
                bVar = this;
                alertController2 = alertController;
                dVar = bVar.new C0184b(bVar.f8122a, bVar.K, false, recycleListView, alertController2);
            }
            alertController2.H = dVar;
            alertController2.I = bVar.I;
            if (bVar.f8145x != null) {
                recycleListView.setOnItemClickListener(new c(alertController2));
            } else if (bVar.J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController2));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = bVar.N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (bVar.H) {
                recycleListView.setChoiceMode(1);
            } else if (bVar.G) {
                recycleListView.setChoiceMode(2);
            }
            alertController2.f8099g = recycleListView;
        }

        public void a(AlertController alertController) {
            AlertController alertController2;
            View view = this.f8128g;
            if (view != null) {
                alertController.k(view);
            } else {
                CharSequence charSequence = this.f8127f;
                if (charSequence != null) {
                    alertController.p(charSequence);
                }
                Drawable drawable = this.f8125d;
                if (drawable != null) {
                    alertController.m(drawable);
                }
                int i15 = this.f8124c;
                if (i15 != 0) {
                    alertController.l(i15);
                }
                int i16 = this.f8126e;
                if (i16 != 0) {
                    alertController.l(alertController.c(i16));
                }
            }
            CharSequence charSequence2 = this.f8129h;
            if (charSequence2 != null) {
                alertController.n(charSequence2);
            }
            CharSequence charSequence3 = this.f8130i;
            if (charSequence3 == null && this.f8131j == null) {
                alertController2 = alertController;
            } else {
                alertController.j(-1, charSequence3, this.f8132k, null, this.f8131j);
                alertController2 = alertController;
            }
            CharSequence charSequence4 = this.f8133l;
            if (charSequence4 != null || this.f8134m != null) {
                alertController2.j(-2, charSequence4, this.f8135n, null, this.f8134m);
            }
            CharSequence charSequence5 = this.f8136o;
            if (charSequence5 != null || this.f8137p != null) {
                alertController2.j(-3, charSequence5, this.f8138q, null, this.f8137p);
            }
            if (this.f8143v != null || this.K != null || this.f8144w != null) {
                b(alertController2);
            }
            View view2 = this.f8147z;
            if (view2 != null) {
                if (this.E) {
                    alertController2.s(view2, this.A, this.B, this.C, this.D);
                    return;
                } else {
                    alertController2.r(view2);
                    return;
                }
            }
            int i17 = this.f8146y;
            if (i17 != 0) {
                alertController2.q(i17);
            }
        }
    }

    private static final class c extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<DialogInterface> f8160a;

        public c(DialogInterface dialogInterface) {
            this.f8160a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i15 = message.what;
            if (i15 == -3 || i15 == -2 || i15 == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.f8160a.get(), message.what);
            } else {
                if (i15 != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    private static class d extends ArrayAdapter<CharSequence> {
        public d(Context context, int i15, int i16, CharSequence[] charSequenceArr) {
            super(context, i15, i16, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i15) {
            return i15;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, m mVar, Window window) {
        this.f8093a = context;
        this.f8094b = mVar;
        this.f8095c = window;
        this.R = new c(mVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, v.F, p007NuL.m.f321n, 0);
        this.J = typedArrayObtainStyledAttributes.getResourceId(v.G, 0);
        this.K = typedArrayObtainStyledAttributes.getResourceId(v.I, 0);
        this.L = typedArrayObtainStyledAttributes.getResourceId(v.K, 0);
        this.M = typedArrayObtainStyledAttributes.getResourceId(v.L, 0);
        this.N = typedArrayObtainStyledAttributes.getResourceId(v.N, 0);
        this.O = typedArrayObtainStyledAttributes.getResourceId(v.J, 0);
        this.P = typedArrayObtainStyledAttributes.getBoolean(v.M, true);
        this.f8096d = typedArrayObtainStyledAttributes.getDimensionPixelSize(v.H, 0);
        typedArrayObtainStyledAttributes.recycle();
        mVar.q(1);
    }

    static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    private void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    private ViewGroup h(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    private int i() {
        int i15 = this.K;
        return (i15 != 0 && this.Q == 1) ? i15 : this.J;
    }

    private void o(ViewGroup viewGroup, View view, int i15, int i16) {
        View viewFindViewById = this.f8095c.findViewById(p007NuL.r.f398u);
        View viewFindViewById2 = this.f8095c.findViewById(p007NuL.r.f397t);
        l0.t0(view, i15, i16);
        if (viewFindViewById != null) {
            viewGroup.removeView(viewFindViewById);
        }
        if (viewFindViewById2 != null) {
            viewGroup.removeView(viewFindViewById2);
        }
    }

    private void t(ViewGroup viewGroup) {
        int i15;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f8107o = button;
        button.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f8108p) && this.f8110r == null) {
            this.f8107o.setVisibility(8);
            i15 = 0;
        } else {
            this.f8107o.setText(this.f8108p);
            Drawable drawable = this.f8110r;
            if (drawable != null) {
                int i16 = this.f8096d;
                drawable.setBounds(0, 0, i16, i16);
                this.f8107o.setCompoundDrawables(this.f8110r, null, null, null);
            }
            this.f8107o.setVisibility(0);
            i15 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f8111s = button2;
        button2.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f8112t) && this.f8114v == null) {
            this.f8111s.setVisibility(8);
        } else {
            this.f8111s.setText(this.f8112t);
            Drawable drawable2 = this.f8114v;
            if (drawable2 != null) {
                int i17 = this.f8096d;
                drawable2.setBounds(0, 0, i17, i17);
                this.f8111s.setCompoundDrawables(this.f8114v, null, null, null);
            }
            this.f8111s.setVisibility(0);
            i15 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f8115w = button3;
        button3.setOnClickListener(this.S);
        if (TextUtils.isEmpty(this.f8116x) && this.f8118z == null) {
            this.f8115w.setVisibility(8);
        } else {
            this.f8115w.setText(this.f8116x);
            Drawable drawable3 = this.f8118z;
            if (drawable3 != null) {
                int i18 = this.f8096d;
                drawable3.setBounds(0, 0, i18, i18);
                this.f8115w.setCompoundDrawables(this.f8118z, null, null, null);
            }
            this.f8115w.setVisibility(0);
            i15 |= 4;
        }
        if (y(this.f8093a)) {
            if (i15 == 1) {
                b(this.f8107o);
            } else if (i15 == 2) {
                b(this.f8111s);
            } else if (i15 == 4) {
                b(this.f8115w);
            }
        }
        if (i15 != 0) {
            return;
        }
        viewGroup.setVisibility(8);
    }

    private void u(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f8095c.findViewById(p007NuL.r.f399v);
        this.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f8098f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.A.removeView(this.F);
        if (this.f8099g == null) {
            viewGroup.setVisibility(8);
            return;
        }
        ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
        int iIndexOfChild = viewGroup2.indexOfChild(this.A);
        viewGroup2.removeViewAt(iIndexOfChild);
        viewGroup2.addView(this.f8099g, iIndexOfChild, new ViewGroup.LayoutParams(-1, -1));
    }

    private void v(ViewGroup viewGroup) {
        View viewInflate = this.f8100h;
        if (viewInflate == null) {
            viewInflate = this.f8101i != 0 ? LayoutInflater.from(this.f8093a).inflate(this.f8101i, viewGroup, false) : null;
        }
        boolean z15 = viewInflate != null;
        if (!z15 || !a(viewInflate)) {
            this.f8095c.setFlags(PKIFailureInfo.unsupportedVersion, PKIFailureInfo.unsupportedVersion);
        }
        if (!z15) {
            viewGroup.setVisibility(8);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) this.f8095c.findViewById(p007NuL.r.f391n);
        frameLayout.addView(viewInflate, new ViewGroup.LayoutParams(-1, -1));
        if (this.f8106n) {
            frameLayout.setPadding(this.f8102j, this.f8103k, this.f8104l, this.f8105m);
        }
        if (this.f8099g != null) {
            ((LinearLayout.LayoutParams) ((androidx.appcompat.widget.l0.a) viewGroup.getLayoutParams())).weight = 0.0f;
        }
    }

    private void w(ViewGroup viewGroup) {
        if (this.G != null) {
            viewGroup.addView(this.G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f8095c.findViewById(p007NuL.r.E).setVisibility(8);
            return;
        }
        this.D = (ImageView) this.f8095c.findViewById(R.id.icon);
        if (TextUtils.isEmpty(this.f8097e) || !this.P) {
            this.f8095c.findViewById(p007NuL.r.E).setVisibility(8);
            this.D.setVisibility(8);
            viewGroup.setVisibility(8);
            return;
        }
        TextView textView = (TextView) this.f8095c.findViewById(p007NuL.r.f387j);
        this.E = textView;
        textView.setText(this.f8097e);
        int i15 = this.B;
        if (i15 != 0) {
            this.D.setImageResource(i15);
            return;
        }
        Drawable drawable = this.C;
        if (drawable != null) {
            this.D.setImageDrawable(drawable);
        } else {
            this.E.setPadding(this.D.getPaddingLeft(), this.D.getPaddingTop(), this.D.getPaddingRight(), this.D.getPaddingBottom());
            this.D.setVisibility(8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void x() {
        View viewFindViewById;
        ListAdapter listAdapter;
        View viewFindViewById2;
        View viewFindViewById3 = this.f8095c.findViewById(p007NuL.r.f396s);
        View viewFindViewById4 = viewFindViewById3.findViewById(p007NuL.r.F);
        View viewFindViewById5 = viewFindViewById3.findViewById(p007NuL.r.f390m);
        View viewFindViewById6 = viewFindViewById3.findViewById(p007NuL.r.f388k);
        ViewGroup viewGroup = (ViewGroup) viewFindViewById3.findViewById(p007NuL.r.f392o);
        v(viewGroup);
        View viewFindViewById7 = viewGroup.findViewById(p007NuL.r.F);
        View viewFindViewById8 = viewGroup.findViewById(p007NuL.r.f390m);
        View viewFindViewById9 = viewGroup.findViewById(p007NuL.r.f388k);
        ViewGroup viewGroupH = h(viewFindViewById7, viewFindViewById4);
        ViewGroup viewGroupH2 = h(viewFindViewById8, viewFindViewById5);
        ViewGroup viewGroupH3 = h(viewFindViewById9, viewFindViewById6);
        u(viewGroupH2);
        t(viewGroupH3);
        w(viewGroupH);
        boolean z15 = viewGroup.getVisibility() != 8;
        boolean z16 = (viewGroupH == null || viewGroupH.getVisibility() == 8) ? 0 : 1;
        boolean z17 = (viewGroupH3 == null || viewGroupH3.getVisibility() == 8) ? false : true;
        if (!z17 && viewGroupH2 != null && (viewFindViewById2 = viewGroupH2.findViewById(p007NuL.r.A)) != null) {
            viewFindViewById2.setVisibility(0);
        }
        if (z16 != 0) {
            NestedScrollView nestedScrollView = this.A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            View viewFindViewById10 = (this.f8098f == null && this.f8099g == null) ? null : viewGroupH.findViewById(p007NuL.r.D);
            if (viewFindViewById10 != null) {
                viewFindViewById10.setVisibility(0);
            }
        } else if (viewGroupH2 != null && (viewFindViewById = viewGroupH2.findViewById(p007NuL.r.B)) != null) {
            viewFindViewById.setVisibility(0);
        }
        ListView listView = this.f8099g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).a(z16, z17);
        }
        if (!z15) {
            View view = this.f8099g;
            if (view == null) {
                view = this.A;
            }
            if (view != null) {
                o(viewGroupH2, view, z16 | (z17 ? 2 : 0), 3);
            }
        }
        ListView listView2 = this.f8099g;
        if (listView2 == null || (listAdapter = this.H) == null) {
            return;
        }
        listView2.setAdapter(listAdapter);
        int i15 = this.I;
        if (i15 > -1) {
            listView2.setItemChecked(i15, true);
            listView2.setSelection(i15);
        }
    }

    private static boolean y(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(p007NuL.m.f320m, typedValue, true);
        return typedValue.data != 0;
    }

    public int c(int i15) {
        TypedValue typedValue = new TypedValue();
        this.f8093a.getTheme().resolveAttribute(i15, typedValue, true);
        return typedValue.resourceId;
    }

    public ListView d() {
        return this.f8099g;
    }

    public void e() {
        this.f8094b.setContentView(i());
        x();
    }

    public boolean f(int i15, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public boolean g(int i15, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.A;
        return nestedScrollView != null && nestedScrollView.t(keyEvent);
    }

    public void j(int i15, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.R.obtainMessage(i15, onClickListener);
        }
        if (i15 == -3) {
            this.f8116x = charSequence;
            this.f8117y = message;
            this.f8118z = drawable;
        } else if (i15 == -2) {
            this.f8112t = charSequence;
            this.f8113u = message;
            this.f8114v = drawable;
        } else {
            if (i15 != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f8108p = charSequence;
            this.f8109q = message;
            this.f8110r = drawable;
        }
    }

    public void k(View view) {
        this.G = view;
    }

    public void l(int i15) {
        this.C = null;
        this.B = i15;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (i15 == 0) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageResource(this.B);
            }
        }
    }

    public void m(Drawable drawable) {
        this.C = drawable;
        this.B = 0;
        ImageView imageView = this.D;
        if (imageView != null) {
            if (drawable == null) {
                imageView.setVisibility(8);
            } else {
                imageView.setVisibility(0);
                this.D.setImageDrawable(drawable);
            }
        }
    }

    public void n(CharSequence charSequence) {
        this.f8098f = charSequence;
        TextView textView = this.F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void p(CharSequence charSequence) {
        this.f8097e = charSequence;
        TextView textView = this.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public void q(int i15) {
        this.f8100h = null;
        this.f8101i = i15;
        this.f8106n = false;
    }

    public void r(View view) {
        this.f8100h = view;
        this.f8101i = 0;
        this.f8106n = false;
    }

    public void s(View view, int i15, int i16, int i17, int i18) {
        this.f8100h = view;
        this.f8101i = 0;
        this.f8106n = true;
        this.f8102j = i15;
        this.f8103k = i16;
        this.f8104l = i17;
        this.f8105m = i18;
    }
}
