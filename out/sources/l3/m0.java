package l3;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007j\u0002\b\u000bj\u0002\b\u0006j\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Ll3/m0;", "Ll3/l0;", "", "<init>", "(Ljava/lang/String;I)V", "", "b", "()Z", "isFocused", "e", "hasFocus", "a", "c", "d", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public enum m0 implements l0 {
    Active,
    ActiveParent,
    Captured,
    Inactive;


    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ wq.a f115589f = wq.b.a(g());

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f115590a;

        static {
            int[] iArr = new int[m0.values().length];
            try {
                iArr[m0.Captured.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m0.Active.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m0.ActiveParent.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m0.Inactive.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f115590a = iArr;
        }
    }

    @Override // l3.l0
    public boolean b() {
        int i15 = a.f115590a[ordinal()];
        if (i15 == 1 || i15 == 2) {
            return true;
        }
        if (i15 == 3 || i15 == 4) {
            return false;
        }
        throw new oq.p();
    }

    @Override // l3.l0
    public boolean e() {
        int i15 = a.f115590a[ordinal()];
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            return true;
        }
        if (i15 == 4) {
            return false;
        }
        throw new oq.p();
    }
}
