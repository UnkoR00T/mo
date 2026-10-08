package CON;

import android.content.res.Resources;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u0000 \u00172\u00020\u0001:\u0001\u0010B5\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0012\u0010\u0014R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0010\u0010\u0016¨\u0006\u0018"}, d2 = {"LCON/v0;", "", "", "lightScrim", "darkScrim", "nightMode", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "", "detectDarkMode", "<init>", "(IIILer/l;)V", "isDark", "c", "(Z)I", "d", "a", "I", "b", "getDarkScrim$activity", "()I", "Ler/l;", "()Ler/l;", "e", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int lightScrim;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int darkScrim;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int nightMode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final er.l<Resources, Boolean> detectDarkMode;

    /* JADX INFO: renamed from: CON.v0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u00042\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LCON/v0$a;", "", "<init>", "()V", "", "lightScrim", "darkScrim", "Lkotlin/Function1;", "Landroid/content/res/Resources;", "", "detectDarkMode", "LCON/v0;", "b", "(IILer/l;)LCON/v0;", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ v0 c(Companion companion, int i15, int i16, er.l lVar, int i17, Object obj) {
            if ((i17 & 4) != 0) {
                lVar = new er.l() { // from class: CON.u0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return Boolean.valueOf(v0.Companion.d((Resources) obj2));
                    }
                };
            }
            return companion.b(i15, i16, lVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean d(Resources resources) {
            return (resources.getConfiguration().uiMode & 48) == 32;
        }

        public final v0 b(int lightScrim, int darkScrim, er.l<? super Resources, Boolean> detectDarkMode) {
            return new v0(lightScrim, darkScrim, 0, detectDarkMode, null);
        }

        private Companion() {
        }
    }

    public /* synthetic */ v0(int i15, int i16, int i17, er.l lVar, fr.k kVar) {
        this(i15, i16, i17, lVar);
    }

    public final er.l<Resources, Boolean> a() {
        return this.detectDarkMode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getNightMode() {
        return this.nightMode;
    }

    public final int c(boolean isDark) {
        return isDark ? this.darkScrim : this.lightScrim;
    }

    public final int d(boolean isDark) {
        if (this.nightMode == 0) {
            return 0;
        }
        return isDark ? this.darkScrim : this.lightScrim;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private v0(int i15, int i16, int i17, er.l<? super Resources, Boolean> lVar) {
        this.lightScrim = i15;
        this.darkScrim = i16;
        this.nightMode = i17;
        this.detectDarkMode = lVar;
    }
}
