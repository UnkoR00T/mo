package com.google.android.exoplayer2.ui;

import ak.n0;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class TrackSelectionView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f28921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LayoutInflater f28922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CheckedTextView f28923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CheckedTextView f28924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final b f28925e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<nf.d> f28926f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<qf.c, yf.a> f28927g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f28928h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f28929j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private zf.f f28930k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private CheckedTextView[][] f28931l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f28932m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Comparator<c> f28933n;

    private class b implements View.OnClickListener {
        private b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            TrackSelectionView.this.c(view);
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final nf.d f28935a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f28936b;

        public c(nf.d dVar, int i15) {
            this.f28935a = dVar;
            this.f28936b = i15;
        }

        public nf.b a() {
            this.f28935a.b(this.f28936b);
            return null;
        }
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static Map<qf.c, yf.a> b(Map<qf.c, yf.a> map, List<nf.d> list, boolean z15) {
        HashMap map2 = new HashMap();
        for (int i15 = 0; i15 < list.size(); i15++) {
            list.get(i15).a();
            yf.a aVar = map.get(null);
            if (aVar != null && (z15 || map2.isEmpty())) {
                map2.put(null, aVar);
            }
        }
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(View view) {
        if (view == this.f28923c) {
            e();
        } else if (view == this.f28924d) {
            d();
        } else {
            f(view);
        }
        i();
    }

    private void d() {
        this.f28932m = false;
        this.f28927g.clear();
    }

    private void e() {
        this.f28932m = true;
        this.f28927g.clear();
    }

    private void f(View view) {
        this.f28932m = false;
        c cVar = (c) bg.a.b(view.getTag());
        cVar.f28935a.a();
        int i15 = cVar.f28936b;
        yf.a aVar = this.f28927g.get(null);
        if (aVar == null) {
            if (!this.f28929j && this.f28927g.size() > 0) {
                this.f28927g.clear();
            }
            this.f28927g.put(null, new yf.a(null, n0.E(Integer.valueOf(i15))));
            return;
        }
        ArrayList arrayList = new ArrayList(aVar.f226680a);
        boolean zIsChecked = ((CheckedTextView) view).isChecked();
        boolean zG = g(cVar.f28935a);
        boolean z15 = zG || h();
        if (zIsChecked && z15) {
            arrayList.remove(Integer.valueOf(i15));
            if (arrayList.isEmpty()) {
                this.f28927g.remove(null);
                return;
            } else {
                this.f28927g.put(null, new yf.a(null, arrayList));
                return;
            }
        }
        if (zIsChecked) {
            return;
        }
        if (!zG) {
            this.f28927g.put(null, new yf.a(null, n0.E(Integer.valueOf(i15))));
        } else {
            arrayList.add(Integer.valueOf(i15));
            this.f28927g.put(null, new yf.a(null, arrayList));
        }
    }

    private boolean g(nf.d dVar) {
        return this.f28928h && dVar.c();
    }

    private boolean h() {
        return this.f28929j && this.f28926f.size() > 1;
    }

    private void i() {
        this.f28923c.setChecked(this.f28932m);
        this.f28924d.setChecked(!this.f28932m && this.f28927g.size() == 0);
        for (int i15 = 0; i15 < this.f28931l.length; i15++) {
            Map<qf.c, yf.a> map = this.f28927g;
            this.f28926f.get(i15).a();
            yf.a aVar = map.get(null);
            int i16 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.f28931l[i15];
                if (i16 < checkedTextViewArr.length) {
                    if (aVar != null) {
                        this.f28931l[i15][i16].setChecked(aVar.f226680a.contains(Integer.valueOf(((c) bg.a.b(checkedTextViewArr[i16].getTag())).f28936b)));
                    } else {
                        checkedTextViewArr[i16].setChecked(false);
                    }
                    i16++;
                }
            }
        }
    }

    private void j() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        if (this.f28926f.isEmpty()) {
            this.f28923c.setEnabled(false);
            this.f28924d.setEnabled(false);
            return;
        }
        this.f28923c.setEnabled(true);
        this.f28924d.setEnabled(true);
        this.f28931l = new CheckedTextView[this.f28926f.size()][];
        boolean zH = h();
        for (int i15 = 0; i15 < this.f28926f.size(); i15++) {
            nf.d dVar = this.f28926f.get(i15);
            boolean zG = g(dVar);
            CheckedTextView[][] checkedTextViewArr = this.f28931l;
            int i16 = dVar.f135542a;
            checkedTextViewArr[i15] = new CheckedTextView[i16];
            c[] cVarArr = new c[i16];
            for (int i17 = 0; i17 < dVar.f135542a; i17++) {
                cVarArr[i17] = new c(dVar, i17);
            }
            Comparator<c> comparator = this.f28933n;
            if (comparator != null) {
                Arrays.sort(cVarArr, comparator);
            }
            for (int i18 = 0; i18 < i16; i18++) {
                if (i18 == 0) {
                    addView(this.f28922b.inflate(zf.c.f234969a, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView = (CheckedTextView) this.f28922b.inflate((zG || zH) ? R.layout.simple_list_item_multiple_choice : R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView.setBackgroundResource(this.f28921a);
                zf.f fVar = this.f28930k;
                cVarArr[i18].a();
                checkedTextView.setText(fVar.a(null));
                checkedTextView.setTag(cVarArr[i18]);
                if (dVar.d(i18)) {
                    checkedTextView.setFocusable(true);
                    checkedTextView.setOnClickListener(this.f28925e);
                } else {
                    checkedTextView.setFocusable(false);
                    checkedTextView.setEnabled(false);
                }
                this.f28931l[i15][i18] = checkedTextView;
                addView(checkedTextView);
            }
        }
        i();
    }

    public boolean getIsDisabled() {
        return this.f28932m;
    }

    public Map<qf.c, yf.a> getOverrides() {
        return this.f28927g;
    }

    public void setAllowAdaptiveSelections(boolean z15) {
        if (this.f28928h != z15) {
            this.f28928h = z15;
            j();
        }
    }

    public void setAllowMultipleOverrides(boolean z15) {
        if (this.f28929j != z15) {
            this.f28929j = z15;
            if (!z15 && this.f28927g.size() > 1) {
                Map<qf.c, yf.a> mapB = b(this.f28927g, this.f28926f, false);
                this.f28927g.clear();
                this.f28927g.putAll(mapB);
            }
            j();
        }
    }

    public void setShowDisableOption(boolean z15) {
        this.f28923c.setVisibility(z15 ? 0 : 8);
    }

    public void setTrackNameProvider(zf.f fVar) {
        this.f28930k = (zf.f) bg.a.b(fVar);
        j();
    }

    public TrackSelectionView(Context context, AttributeSet attributeSet, int i15) {
        super(context, attributeSet, i15);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.f28921a = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.f28922b = layoutInflaterFrom;
        b bVar = new b();
        this.f28925e = bVar;
        this.f28930k = new zf.b(getResources());
        this.f28926f = new ArrayList();
        this.f28927g = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f28923c = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(zf.d.f234972c);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(bVar);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(zf.c.f234969a, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f28924d = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(zf.d.f234971b);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(bVar);
        addView(checkedTextView2);
    }
}
