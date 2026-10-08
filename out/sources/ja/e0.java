package ja;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0019\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001c\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\"\u0010\u001f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018¨\u0006 "}, d2 = {"Lja/e0;", "", "<init>", "()V", "Lja/x;", "d", "()Lja/x;", "Lja/y;", "loadType", "Lja/w;", "a", "(Lja/y;)Lja/w;", "type", "state", "Loq/i0;", "c", "(Lja/y;Lja/w;)V", "states", "b", "(Lja/x;)V", "Lja/w;", "getRefresh", "()Lja/w;", "setRefresh", "(Lja/w;)V", "refresh", "getPrepend", "setPrepend", "prepend", "getAppend", "setAppend", "append", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private w refresh;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private w prepend;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private w append;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f100629a;

        static {
            int[] iArr = new int[y.values().length];
            try {
                iArr[y.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y.APPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y.PREPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f100629a = iArr;
        }
    }

    public e0() {
        w.NotLoading.Companion companion = w.NotLoading.INSTANCE;
        this.refresh = companion.b();
        this.prepend = companion.b();
        this.append = companion.b();
    }

    public final w a(y loadType) {
        int i15 = a.f100629a[loadType.ordinal()];
        if (i15 == 1) {
            return this.refresh;
        }
        if (i15 == 2) {
            return this.append;
        }
        if (i15 == 3) {
            return this.prepend;
        }
        throw new oq.p();
    }

    public final void b(LoadStates states) {
        this.refresh = states.getRefresh();
        this.append = states.getAppend();
        this.prepend = states.getPrepend();
    }

    public final void c(y type, w state) {
        int i15 = a.f100629a[type.ordinal()];
        if (i15 == 1) {
            this.refresh = state;
        } else if (i15 == 2) {
            this.append = state;
        } else {
            if (i15 != 3) {
                throw new oq.p();
            }
            this.prepend = state;
        }
    }

    public final LoadStates d() {
        return new LoadStates(this.refresh, this.prepend, this.append);
    }
}
