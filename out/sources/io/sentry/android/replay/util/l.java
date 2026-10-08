package io.sentry.android.replay.util;

import android.os.Build;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lio/sentry/android/replay/util/l;", "", "<init>", "()V", "Lio/sentry/android/replay/util/l$a;", "key", "", "defaultValue", "a", "(Lio/sentry/android/replay/util/l$a;Ljava/lang/String;)Ljava/lang/String;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f94537a = new l();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lio/sentry/android/replay/util/l$a;", "", "<init>", "(Ljava/lang/String;I)V", "SOC_MODEL", "SOC_MANUFACTURER", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public enum a {
        SOC_MODEL,
        SOC_MANUFACTURER;

        private static final /* synthetic */ wq.a $ENTRIES = wq.b.a(values());

        public static wq.a<a> getEntries() {
            return $ENTRIES;
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f94538a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.SOC_MODEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.SOC_MANUFACTURER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f94538a = iArr;
        }
    }

    private l() {
    }

    public static /* synthetic */ String b(l lVar, a aVar, String str, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            str = "";
        }
        return lVar.a(aVar, str);
    }

    public final String a(a key, String defaultValue) {
        if (Build.VERSION.SDK_INT < 31) {
            return defaultValue;
        }
        int i15 = b.f94538a[key.ordinal()];
        if (i15 == 1) {
            return Build.SOC_MODEL;
        }
        if (i15 == 2) {
            return Build.SOC_MANUFACTURER;
        }
        throw new p();
    }
}
