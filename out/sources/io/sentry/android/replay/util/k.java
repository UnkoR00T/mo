package io.sentry.android.replay.util;

import io.sentry.util.z;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/sentry/util/z;", "", "rate", "", "a", "(Lio/sentry/util/z;Ljava/lang/Double;)Z", "sentry-android-replay_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class k {
    public static final boolean a(z zVar, Double d15) {
        return d15 != null && d15.doubleValue() >= zVar.c();
    }
}
