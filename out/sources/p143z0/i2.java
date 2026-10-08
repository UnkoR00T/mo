package p143z0;

import f3.m;
import fr.k;
import g4.q1;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\r\b\u0001\u0018\u0000 \u00142\u00020\u00012\u00020\u0002:\u0001\u0015B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\u0006R\u001a\u0010\u000e\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR$\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lz0/i2;", "Lf3/m$c;", "Lg4/q1;", "", "enabled", "<init>", "(Z)V", "Loq/i0;", "o3", "", "r", "Ljava/lang/Object;", "T", "()Ljava/lang/Object;", "traverseKey", "value", "s", "Z", "n3", "()Z", "t", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i2 extends m.c implements q1 {

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f231315v = 8;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final Object traverseKey = INSTANCE;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean enabled;

    /* JADX INFO: renamed from: z0.i2$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lz0/i2$a;", "", "<init>", "()V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private Companion() {
        }
    }

    public i2(boolean z15) {
        this.enabled = z15;
    }

    @Override // g4.q1
    /* JADX INFO: renamed from: T, reason: from getter */
    public Object getTraverseKey() {
        return this.traverseKey;
    }

    /* JADX INFO: renamed from: n3, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public final void o3(boolean enabled) {
        this.enabled = enabled;
    }
}
