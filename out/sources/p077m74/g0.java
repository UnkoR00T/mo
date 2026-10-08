package p077m74;

import fr.k;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\t\n\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lm74/g0;", "", "", "formatStyle", "<init>", "(Ljava/lang/String;)V", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "b", "Lm74/g0$a;", "Lm74/g0$b;", "Lm74/g0$c;", "applicationlock_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String formatStyle;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lm74/g0$a;", "Lm74/g0;", "<init>", "()V", "applicationlock_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f124170b = new a();

        private a() {
            super("%02d:%02d:%02d", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lm74/g0$b;", "Lm74/g0;", "<init>", "()V", "applicationlock_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b extends g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f124171b = new b();

        private b() {
            super("%02d:%02d", null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lm74/g0$c;", "Lm74/g0;", "<init>", "()V", "applicationlock_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c extends g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f124172b = new c();

        private c() {
            super("%02d", null);
        }
    }

    public /* synthetic */ g0(String str, k kVar) {
        this(str);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getFormatStyle() {
        return this.formatStyle;
    }

    private g0(String str) {
        this.formatStyle = str;
    }
}
