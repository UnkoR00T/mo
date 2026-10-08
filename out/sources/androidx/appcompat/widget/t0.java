package androidx.appcompat.widget;

import android.R;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import io.sentry.android.core.c2;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
class t0 extends p6.c implements View.OnClickListener {
    private int A;
    private int B;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final SearchView f9049m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final SearchableInfo f9050n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Context f9051p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final WeakHashMap<String, Drawable.ConstantState> f9052q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f9053r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f9054s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f9055t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ColorStateList f9056v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f9057w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f9058x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f9059y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f9060z;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TextView f9061a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final TextView f9062b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ImageView f9063c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ImageView f9064d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ImageView f9065e;

        public a(View view) {
            this.f9061a = (TextView) view.findViewById(R.id.text1);
            this.f9062b = (TextView) view.findViewById(R.id.text2);
            this.f9063c = (ImageView) view.findViewById(R.id.icon1);
            this.f9064d = (ImageView) view.findViewById(R.id.icon2);
            this.f9065e = (ImageView) view.findViewById(p007NuL.r.f394q);
        }
    }

    public t0(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap<String, Drawable.ConstantState> weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), null, true);
        this.f9054s = false;
        this.f9055t = 1;
        this.f9057w = -1;
        this.f9058x = -1;
        this.f9059y = -1;
        this.f9060z = -1;
        this.A = -1;
        this.B = -1;
        this.f9049m = searchView;
        this.f9050n = searchableInfo;
        this.f9053r = searchView.getSuggestionCommitIconResId();
        this.f9051p = context;
        this.f9052q = weakHashMap;
    }

    private void A(Cursor cursor) {
        Bundle extras = cursor != null ? cursor.getExtras() : null;
        if (extras != null) {
            extras.getBoolean("in_progress");
        }
    }

    private Drawable j(String str) {
        Drawable.ConstantState constantState = this.f9052q.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    private CharSequence k(CharSequence charSequence) {
        if (this.f9056v == null) {
            TypedValue typedValue = new TypedValue();
            this.f9051p.getTheme().resolveAttribute(p007NuL.m.M, typedValue, true);
            this.f9056v = this.f9051p.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.f9056v, null), 0, charSequence.length(), 33);
        return spannableString;
    }

    private Drawable l(ComponentName componentName) {
        PackageManager packageManager = this.f9051p.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            c2.g("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e15) {
            c2.g("SuggestionsAdapter", e15.toString());
            return null;
        }
    }

    private Drawable m(ComponentName componentName) {
        String strFlattenToShortString = componentName.flattenToShortString();
        if (!this.f9052q.containsKey(strFlattenToShortString)) {
            Drawable drawableL = l(componentName);
            this.f9052q.put(strFlattenToShortString, drawableL != null ? drawableL.getConstantState() : null);
            return drawableL;
        }
        Drawable.ConstantState constantState = this.f9052q.get(strFlattenToShortString);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable(this.f9051p.getResources());
    }

    public static String n(Cursor cursor, String str) {
        return v(cursor, cursor.getColumnIndex(str));
    }

    private Drawable o() {
        Drawable drawableM = m(this.f9050n.getSearchActivity());
        return drawableM != null ? drawableM : this.f9051p.getPackageManager().getDefaultActivityIcon();
    }

    private Drawable p(Uri uri) {
        try {
            if ("android.resource".equals(uri.getScheme())) {
                try {
                    return q(uri);
                } catch (Resources.NotFoundException unused) {
                    throw new FileNotFoundException("Resource does not exist: " + uri);
                }
            }
            InputStream inputStreamOpenInputStream = this.f9051p.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                throw new FileNotFoundException("Failed to open " + uri);
            }
            try {
                Drawable drawableCreateFromStream = Drawable.createFromStream(inputStreamOpenInputStream, null);
                try {
                    inputStreamOpenInputStream.close();
                    return drawableCreateFromStream;
                } catch (IOException e15) {
                    c2.f("SuggestionsAdapter", "Error closing icon stream for " + uri, e15);
                    return drawableCreateFromStream;
                }
            } catch (Throwable th4) {
                try {
                    inputStreamOpenInputStream.close();
                } catch (IOException e16) {
                    c2.f("SuggestionsAdapter", "Error closing icon stream for " + uri, e16);
                }
                throw th4;
            }
        } catch (FileNotFoundException e17) {
            c2.g("SuggestionsAdapter", "Icon not found: " + uri + ", " + e17.getMessage());
            return null;
        }
        c2.g("SuggestionsAdapter", "Icon not found: " + uri + ", " + e17.getMessage());
        return null;
    }

    private Drawable r(String str) {
        if (str == null || str.isEmpty() || com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f37012h1.equals(str)) {
            return null;
        }
        try {
            int i15 = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f9051p.getPackageName() + "/" + i15;
            Drawable drawableJ = j(str2);
            if (drawableJ != null) {
                return drawableJ;
            }
            Drawable drawableF = u5.a.f(this.f9051p, i15);
            z(str2, drawableF);
            return drawableF;
        } catch (Resources.NotFoundException unused) {
            c2.g("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        } catch (NumberFormatException unused2) {
            Drawable drawableJ2 = j(str);
            if (drawableJ2 != null) {
                return drawableJ2;
            }
            Drawable drawableP = p(Uri.parse(str));
            z(str, drawableP);
            return drawableP;
        }
    }

    private Drawable s(Cursor cursor) {
        int i15 = this.f9060z;
        if (i15 == -1) {
            return null;
        }
        Drawable drawableR = r(cursor.getString(i15));
        return drawableR != null ? drawableR : o();
    }

    private Drawable t(Cursor cursor) {
        int i15 = this.A;
        if (i15 == -1) {
            return null;
        }
        return r(cursor.getString(i15));
    }

    private static String v(Cursor cursor, int i15) {
        if (i15 == -1) {
            return null;
        }
        try {
            return cursor.getString(i15);
        } catch (Exception e15) {
            c2.f("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e15);
            return null;
        }
    }

    private void x(ImageView imageView, Drawable drawable, int i15) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i15);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    private void y(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    private void z(String str, Drawable drawable) {
        if (drawable != null) {
            this.f9052q.put(str, drawable.getConstantState());
        }
    }

    @Override // p6.a, p6.b.a
    public void a(Cursor cursor) {
        if (this.f9054s) {
            c2.g("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.a(cursor);
            if (cursor != null) {
                this.f9057w = cursor.getColumnIndex("suggest_text_1");
                this.f9058x = cursor.getColumnIndex("suggest_text_2");
                this.f9059y = cursor.getColumnIndex("suggest_text_2_url");
                this.f9060z = cursor.getColumnIndex("suggest_icon_1");
                this.A = cursor.getColumnIndex("suggest_icon_2");
                this.B = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e15) {
            c2.f("SuggestionsAdapter", "error changing cursor and caching columns", e15);
        }
    }

    @Override // p6.b.a
    public Cursor b(CharSequence charSequence) {
        String string = charSequence == null ? "" : charSequence.toString();
        if (this.f9049m.getVisibility() == 0 && this.f9049m.getWindowVisibility() == 0) {
            try {
                Cursor cursorU = u(this.f9050n, string, 50);
                if (cursorU != null) {
                    cursorU.getCount();
                    return cursorU;
                }
            } catch (RuntimeException e15) {
                c2.h("SuggestionsAdapter", "Search suggestions query threw an exception.", e15);
            }
        }
        return null;
    }

    @Override // p6.b.a
    public CharSequence convertToString(Cursor cursor) {
        String strN;
        String strN2;
        if (cursor == null) {
            return null;
        }
        String strN3 = n(cursor, "suggest_intent_query");
        if (strN3 != null) {
            return strN3;
        }
        if (this.f9050n.shouldRewriteQueryFromData() && (strN2 = n(cursor, "suggest_intent_data")) != null) {
            return strN2;
        }
        if (!this.f9050n.shouldRewriteQueryFromText() || (strN = n(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return strN;
    }

    @Override // p6.a
    public void d(View view, Context context, Cursor cursor) {
        a aVar = (a) view.getTag();
        int i15 = this.B;
        int i16 = i15 != -1 ? cursor.getInt(i15) : 0;
        if (aVar.f9061a != null) {
            y(aVar.f9061a, v(cursor, this.f9057w));
        }
        if (aVar.f9062b != null) {
            String strV = v(cursor, this.f9059y);
            CharSequence charSequenceK = strV != null ? k(strV) : v(cursor, this.f9058x);
            if (TextUtils.isEmpty(charSequenceK)) {
                TextView textView = aVar.f9061a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f9061a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f9061a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f9061a.setMaxLines(1);
                }
            }
            y(aVar.f9062b, charSequenceK);
        }
        ImageView imageView = aVar.f9063c;
        if (imageView != null) {
            x(imageView, s(cursor), 4);
        }
        ImageView imageView2 = aVar.f9064d;
        if (imageView2 != null) {
            x(imageView2, t(cursor), 8);
        }
        int i17 = this.f9055t;
        if (i17 != 2 && (i17 != 1 || (i16 & 1) == 0)) {
            aVar.f9065e.setVisibility(8);
            return;
        }
        aVar.f9065e.setVisibility(0);
        aVar.f9065e.setTag(aVar.f9061a.getText());
        aVar.f9065e.setOnClickListener(this);
    }

    @Override // p6.c, p6.a
    public View g(Context context, Cursor cursor, ViewGroup viewGroup) {
        View viewG = super.g(context, cursor, viewGroup);
        viewG.setTag(new a(viewG));
        ((ImageView) viewG.findViewById(p007NuL.r.f394q)).setImageResource(this.f9053r);
        return viewG;
    }

    @Override // p6.a, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i15, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i15, view, viewGroup);
        } catch (RuntimeException e15) {
            c2.h("SuggestionsAdapter", "Search suggestions cursor threw exception.", e15);
            View viewF = f(this.f9051p, c(), viewGroup);
            if (viewF != null) {
                ((a) viewF.getTag()).f9061a.setText(e15.toString());
            }
            return viewF;
        }
    }

    @Override // p6.a, android.widget.Adapter
    public View getView(int i15, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i15, view, viewGroup);
        } catch (RuntimeException e15) {
            c2.h("SuggestionsAdapter", "Search suggestions cursor threw exception.", e15);
            View viewG = g(this.f9051p, c(), viewGroup);
            if (viewG != null) {
                ((a) viewG.getTag()).f9061a.setText(e15.toString());
            }
            return viewG;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        A(c());
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        A(c());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f9049m.K((CharSequence) tag);
        }
    }

    Drawable q(Uri uri) throws FileNotFoundException {
        int identifier;
        String authority = uri.getAuthority();
        if (TextUtils.isEmpty(authority)) {
            throw new FileNotFoundException("No authority: " + uri);
        }
        try {
            Resources resourcesForApplication = this.f9051p.getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments == null) {
                throw new FileNotFoundException("No path: " + uri);
            }
            int size = pathSegments.size();
            if (size == 1) {
                try {
                    identifier = Integer.parseInt(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                    throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                }
            } else {
                if (size != 2) {
                    throw new FileNotFoundException("More than two path segments: " + uri);
                }
                identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            }
            if (identifier != 0) {
                return resourcesForApplication.getDrawable(identifier);
            }
            throw new FileNotFoundException("No resource found for: " + uri);
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new FileNotFoundException("No package found for authority: " + uri);
        }
    }

    Cursor u(SearchableInfo searchableInfo, String str, int i15) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder builderFragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            builderFragment.appendEncodedPath(suggestPath);
        }
        builderFragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            builderFragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i15 > 0) {
            builderFragment.appendQueryParameter("limit", String.valueOf(i15));
        }
        return this.f9051p.getContentResolver().query(builderFragment.build(), null, suggestSelection, strArr2, null);
    }

    public void w(int i15) {
        this.f9055t = i15;
    }
}
