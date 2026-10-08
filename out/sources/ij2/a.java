package ij2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R(\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u000b\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\t\u0010\u0006\u0012\u0004\b\u000e\u0010\u0003\u001a\u0004\b\r\u0010\b\"\u0004\b\u0005\u0010\n¨\u0006\u0010"}, d2 = {"Lij2/a;", "", "<init>", "()V", "", "b", "Z", "a", "()Z", "c", "(Z)V", "isLogged$annotations", "isLogged", "getDuringOnboarding", "getDuringOnboarding$annotations", "duringOnboarding", "legacy_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static boolean isLogged;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static boolean duringOnboarding;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f93124a = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f93127d = 8;

    private a() {
    }

    public static final boolean a() {
        return isLogged;
    }

    public static final void b(boolean z15) {
        duringOnboarding = z15;
    }

    public static final void c(boolean z15) {
        isLogged = z15;
    }
}
