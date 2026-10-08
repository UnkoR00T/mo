package p012a2;

import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import su.a;
import su.g;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R/\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b8F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\u0005\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"La2/i4;", "", "<init>", "()V", "Lsu/a;", "a", "Lsu/a;", "mutex", "La2/v3;", "<set-?>", "b", "Lm2/a3;", "()La2/v3;", "setCurrentSnackbarData", "(La2/v3;)V", "currentSnackbarData", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a mutex = g.b(false, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a3 currentSnackbarData = c6.e(null, null, 2, null);

    public final v3 a() {
        return (v3) this.currentSnackbarData.getValue();
    }
}
