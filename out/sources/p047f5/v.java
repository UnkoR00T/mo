package p047f5;

import c5.h;
import fr.k;
import io.sentry.android.core.c2;
import j5.c;
import j5.e;
import j5.i;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eR\u001e\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0012"}, d2 = {"Lf5/v;", "", "Lc5/h;", "value", "", "symbol", "debugName", "<init>", "(Lc5/h;Ljava/lang/String;Ljava/lang/String;Lfr/k;)V", "", "b", "()Z", "Lj5/c;", "a", "()Lj5/c;", "Lc5/h;", "Ljava/lang/String;", "c", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private h value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String symbol;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String debugName;

    public /* synthetic */ v(h hVar, String str, String str2, k kVar) {
        this(hVar, str, str2);
    }

    public final c a() {
        h hVar = this.value;
        if (hVar != null) {
            return new e(hVar.getValue());
        }
        String str = this.symbol;
        if (str != null) {
            return i.v(str);
        }
        c2.e("CCL", "DimensionDescription: Null value & symbol for " + this.debugName + ". Using WrapContent.");
        return i.v("wrap");
    }

    public final boolean b() {
        return this.value == null && this.symbol == null;
    }

    private v(h hVar, String str, String str2) {
        this.value = hVar;
        this.symbol = str;
        this.debugName = str2;
    }
}
