package io.sentry.android.fragment;

import fr.k;
import java.util.HashSet;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 io.sentry.android.fragment.a, still in use, count: 1, list:
  (r0v0 io.sentry.android.fragment.a) from 0x009a: INVOKE (r11v5 java.util.HashSet), (r0v0 io.sentry.android.fragment.a) VIRTUAL call: java.util.HashSet.add(java.lang.Object):boolean A[MD:(E):boolean (c)]
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lio/sentry/android/fragment/a;", "", "", "breadcrumbName", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getBreadcrumbName$sentry_android_fragment_release", "()Ljava/lang/String;", "Companion", "a", "ATTACHED", "SAVE_INSTANCE_STATE", "CREATED", "VIEW_CREATED", "STARTED", "RESUMED", "PAUSED", "STOPPED", "VIEW_DESTROYED", "DESTROYED", "DETACHED", "sentry-android-fragment_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {
    ATTACHED("attached"),
    SAVE_INSTANCE_STATE("save instance state"),
    CREATED("created"),
    VIEW_CREATED("view created"),
    STARTED("started"),
    RESUMED("resumed"),
    PAUSED("paused"),
    STOPPED("stopped"),
    VIEW_DESTROYED("view destroyed"),
    DESTROYED("destroyed"),
    DETACHED("detached");

    private static final Set<a> states;
    private final String breadcrumbName;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: io.sentry.android.fragment.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/sentry/android/fragment/a$a;", "", "<init>", "()V", "", "Lio/sentry/android/fragment/a;", "states", "Ljava/util/Set;", "a", "()Ljava/util/Set;", "sentry-android-fragment_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final Set<a> a() {
            return a.states;
        }

        private Companion() {
        }
    }

    static {
        HashSet hashSet = new HashSet();
        hashSet.add(new a("attached"));
        hashSet.add(new a("save instance state"));
        hashSet.add(new a("created"));
        hashSet.add(new a("view created"));
        hashSet.add(new a("started"));
        hashSet.add(new a("resumed"));
        hashSet.add(new a("paused"));
        hashSet.add(new a("stopped"));
        hashSet.add(new a("view destroyed"));
        hashSet.add(new a("destroyed"));
        hashSet.add(new a("detached"));
        states = hashSet;
    }

    private a(String str) {
        super(str, i);
        this.breadcrumbName = str;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    /* JADX INFO: renamed from: getBreadcrumbName$sentry_android_fragment_release, reason: from getter */
    public final String getBreadcrumbName() {
        return this.breadcrumbName;
    }
}
