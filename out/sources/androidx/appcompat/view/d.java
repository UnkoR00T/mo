package androidx.appcompat.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import p007NuL.u;

/* JADX INFO: loaded from: classes.dex */
public class d extends ContextWrapper {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Configuration f8314f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f8315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Resources.Theme f8316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LayoutInflater f8317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Configuration f8318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Resources f8319e;

    public d() {
        super(null);
    }

    private Resources b() {
        if (this.f8319e == null) {
            Configuration configuration = this.f8318d;
            if (configuration == null || e(configuration)) {
                this.f8319e = super.getResources();
            } else {
                this.f8319e = createConfigurationContext(this.f8318d).getResources();
            }
        }
        return this.f8319e;
    }

    private void d() {
        boolean z15 = this.f8316b == null;
        if (z15) {
            this.f8316b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f8316b.setTo(theme);
            }
        }
        f(this.f8316b, this.f8315a, z15);
    }

    private static boolean e(Configuration configuration) {
        if (configuration == null) {
            return true;
        }
        if (f8314f == null) {
            Configuration configuration2 = new Configuration();
            configuration2.fontScale = 0.0f;
            f8314f = configuration2;
        }
        return configuration.equals(f8314f);
    }

    public void a(Configuration configuration) {
        if (this.f8319e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f8318d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f8318d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public int c() {
        return this.f8315a;
    }

    protected void f(Resources.Theme theme, int i15, boolean z15) {
        theme.applyStyle(i15, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return getResources().getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return b();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f8317c == null) {
            this.f8317c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f8317c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f8316b;
        if (theme != null) {
            return theme;
        }
        if (this.f8315a == 0) {
            this.f8315a = u.f435d;
        }
        d();
        return this.f8316b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i15) {
        if (this.f8315a != i15) {
            this.f8315a = i15;
            d();
        }
    }

    public d(Context context, int i15) {
        super(context);
        this.f8315a = i15;
    }

    public d(Context context, Resources.Theme theme) {
        super(context);
        this.f8316b = theme;
    }
}
