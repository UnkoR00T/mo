package zd0;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.appcompat.app.f;
import mu.b0;
import mu.i;
import mu.p0;
import mu.r0;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;
import t10.k;
import tq.e;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \f2\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\b0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001a¨\u0006\u001c"}, d2 = {"Lzd0/a;", "Lbe0/b;", "Lt10/k;", "sharedPreferencesFactory", "Landroid/content/Context;", "context", "<init>", "(Lt10/k;Landroid/content/Context;)V", "Lxg0/a;", "c", "()Lxg0/a;", "", "d", "()Z", "theme", "Loq/i0;", "b", "(Lxg0/a;Ltq/e;)Ljava/lang/Object;", "Lmu/p0;", "a", "()Lmu/p0;", "Landroid/content/Context;", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "mJuniorThemeSharedPreferences", "Lmu/b0;", "Lmu/b0;", "juniorThemeFlow", "theme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements be0.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f234366e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SharedPreferences mJuniorThemeSharedPreferences;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b0<xg0.a> juniorThemeFlow = r0.a(c());

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f234370a;

        static {
            int[] iArr = new int[xg0.a.values().length];
            try {
                iArr[xg0.a.ENERGY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[xg0.a.GEOMETRY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[xg0.a.COSMOS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f234370a = iArr;
        }
    }

    public a(k kVar, Context context) {
        this.context = context;
        this.mJuniorThemeSharedPreferences = kVar.c("mjunior_theme_shared_prefs");
    }

    private final xg0.a c() {
        String key;
        xg0.a.Companion companion = xg0.a.INSTANCE;
        SharedPreferences sharedPreferences = this.mJuniorThemeSharedPreferences;
        boolean zD = d();
        if (zD) {
            key = xg0.a.COSMOS.getKey();
        } else {
            if (zD) {
                throw new p();
            }
            key = xg0.a.ENERGY.getKey();
        }
        return companion.a(sharedPreferences.getString("mJuniorTheme", key));
    }

    private final boolean d() {
        return (this.context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    @Override // be0.b
    public p0<xg0.a> a() {
        return i.b(this.juniorThemeFlow);
    }

    @Override // be0.b
    public Object b(xg0.a aVar, e<? super i0> eVar) {
        SharedPreferences.Editor editorEdit = this.mJuniorThemeSharedPreferences.edit();
        editorEdit.putString("mJuniorTheme", aVar.getKey());
        editorEdit.commit();
        int i15 = b.f234370a[aVar.ordinal()];
        int i16 = 1;
        if (i15 != 1 && i15 != 2) {
            if (i15 != 3) {
                throw new p();
            }
            i16 = 2;
        }
        f.L(i16);
        Object objF = this.juniorThemeFlow.F(aVar, eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }
}
