package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    static class a {
        static int a(TextView textView) {
            return textView.getBreakStrategy();
        }

        static int b(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        static void c(TextView textView, int i15) {
            textView.setBreakStrategy(i15);
        }

        static void d(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        static void e(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        static void f(TextView textView, int i15) {
            textView.setHyphenationFrequency(i15);
        }
    }

    static class b {
        static DecimalFormatSymbols a(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    static class c {
        static CharSequence a(PrecomputedText precomputedText) {
            return precomputedText;
        }

        static String[] b(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        static PrecomputedText.Params c(TextView textView) {
            return textView.getTextMetricsParams();
        }

        static void d(TextView textView, int i15) {
            textView.setFirstBaselineToTopHeight(i15);
        }
    }

    static class d {
        public static void a(TextView textView, int i15, float f15) {
            textView.setLineHeight(i15, f15);
        }
    }

    private static class e implements ActionMode.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ActionMode.Callback f11900a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final TextView f11901b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Class<?> f11902c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Method f11903d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f11904e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f11905f = false;

        e(ActionMode.Callback callback, TextView textView) {
            this.f11900a = callback;
            this.f11901b = textView;
        }

        private Intent a() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        private Intent b(ResolveInfo resolveInfo, TextView textView) {
            Intent intentPutExtra = a().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !e(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        private List<ResolveInfo> c(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(a(), 0)) {
                    if (f(resolveInfo, context)) {
                        arrayList.add(resolveInfo);
                    }
                }
            }
            return arrayList;
        }

        private boolean e(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        private boolean f(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            return str == null || context.checkSelfPermission(str) == 0;
        }

        private void g(Menu menu) {
            Context context = this.f11901b.getContext();
            PackageManager packageManager = context.getPackageManager();
            boolean z15 = this.f11905f;
            Class cls = Integer.TYPE;
            if (!z15) {
                this.f11905f = true;
                try {
                    Class<?> cls2 = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f11902c = cls2;
                    this.f11903d = cls2.getDeclaredMethod("removeItemAt", cls);
                    this.f11904e = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f11902c = null;
                    this.f11903d = null;
                    this.f11904e = false;
                }
            }
            try {
                Method declaredMethod = (this.f11904e && this.f11902c.isInstance(menu)) ? this.f11903d : menu.getClass().getDeclaredMethod("removeItemAt", cls);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List<ResolveInfo> listC = c(context, packageManager);
                for (int i15 = 0; i15 < listC.size(); i15++) {
                    ResolveInfo resolveInfo = listC.get(i15);
                    menu.add(0, 0, i15 + 100, resolveInfo.loadLabel(packageManager)).setIntent(b(resolveInfo, this.f11901b)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        ActionMode.Callback d() {
            return this.f11900a;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f11900a.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f11900a.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f11900a.onDestroyActionMode(actionMode);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            g(menu);
            return this.f11900a.onPrepareActionMode(actionMode, menu);
        }
    }

    public static int a(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int b(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    private static int c(TextDirectionHeuristic textDirectionHeuristic) {
        TextDirectionHeuristic textDirectionHeuristic2;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if (textDirectionHeuristic == textDirectionHeuristic3 || textDirectionHeuristic == (textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == textDirectionHeuristic2) {
            return 6;
        }
        return textDirectionHeuristic == textDirectionHeuristic3 ? 7 : 1;
    }

    private static TextDirectionHeuristic d(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(c.b(b.a(textView.getTextLocale()))[0].codePointAt(0));
            return (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
        }
        boolean z15 = textView.getLayoutDirection() == 1;
        switch (textView.getTextDirection()) {
            case 2:
                return TextDirectionHeuristics.ANYRTL_LTR;
            case 3:
                return TextDirectionHeuristics.LTR;
            case 4:
                return TextDirectionHeuristics.RTL;
            case 5:
                return TextDirectionHeuristics.LOCALE;
            case 6:
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            case 7:
                return TextDirectionHeuristics.FIRSTSTRONG_RTL;
            default:
                return z15 ? TextDirectionHeuristics.FIRSTSTRONG_RTL : TextDirectionHeuristics.FIRSTSTRONG_LTR;
        }
    }

    public static h6.f.a e(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new h6.f.a(c.c(textView));
        }
        h6.f.a.C1872a c1872a = new h6.f.a.C1872a(new TextPaint(textView.getPaint()));
        c1872a.b(a.a(textView));
        c1872a.c(a.b(textView));
        c1872a.d(d(textView));
        return c1872a.a();
    }

    public static void f(TextView textView, ColorStateList colorStateList) {
        i6.i.g(textView);
        a.d(textView, colorStateList);
    }

    public static void g(TextView textView, PorterDuff.Mode mode) {
        i6.i.g(textView);
        a.e(textView, mode);
    }

    public static void h(TextView textView, int i15) {
        i6.i.d(i15);
        if (Build.VERSION.SDK_INT >= 28) {
            c.d(textView, i15);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i16 = textView.getIncludeFontPadding() ? fontMetricsInt.top : fontMetricsInt.ascent;
        if (i15 > Math.abs(i16)) {
            textView.setPadding(textView.getPaddingLeft(), i15 + i16, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void i(TextView textView, int i15) {
        i6.i.d(i15);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int i16 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
        if (i15 > Math.abs(i16)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i15 - i16);
        }
    }

    public static void j(TextView textView, int i15) {
        i6.i.d(i15);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i15 != fontMetricsInt) {
            textView.setLineSpacing(i15 - fontMetricsInt, 1.0f);
        }
    }

    public static void k(TextView textView, int i15, float f15) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.a(textView, i15, f15);
        } else {
            j(textView, Math.round(TypedValue.applyDimension(i15, f15, textView.getResources().getDisplayMetrics())));
        }
    }

    public static void l(TextView textView, h6.f fVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(c.a(fVar.b()));
        } else {
            if (!e(textView).a(fVar.a())) {
                throw new IllegalArgumentException("Given text can not be applied to TextView.");
            }
            textView.setText(fVar);
        }
    }

    public static void m(TextView textView, int i15) {
        textView.setTextAppearance(i15);
    }

    public static void n(TextView textView, h6.f.a aVar) {
        textView.setTextDirection(c(aVar.d()));
        textView.getPaint().set(aVar.e());
        a.c(textView, aVar.b());
        a.f(textView, aVar.c());
    }

    public static ActionMode.Callback o(ActionMode.Callback callback) {
        return callback instanceof e ? ((e) callback).d() : callback;
    }

    public static ActionMode.Callback p(TextView textView, ActionMode.Callback callback) {
        return (Build.VERSION.SDK_INT > 27 || (callback instanceof e) || callback == null) ? callback : new e(callback, textView);
    }
}
